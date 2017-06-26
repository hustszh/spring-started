package me.ranjit.spring.el.parser;

import lombok.extern.log4j.Log4j2;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * Created by suzh on 6/26/2017.
 */
@Log4j2
public class ParserMain {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        //literal expressions
        Expression exp = parser.parseExpression("'Hello World'");
        String msg1 = exp.getValue(String.class);
        log.info(msg1);

        //method invocation
        Expression exp2 = parser.parseExpression("'Hello World'.length()");
        int msg2 = (Integer) exp2.getValue();
        log.info(msg2);

        //Mathematical operators
        Expression exp3 = parser.parseExpression("100 * 2");
        int msg3 = (Integer) exp3.getValue();
        log.info(msg3);

        //create an item object
        Item item = new Item("ranjit", 100);
        //test EL with item object
        StandardEvaluationContext itemContext = new StandardEvaluationContext(item);

        //display the value of item.name property
        Expression exp4 = parser.parseExpression("name");
        String msg4 = exp4.getValue(itemContext, String.class);
        log.info(msg4);

        //test if item.name == 'ranjit'
        Expression exp5 = parser.parseExpression("name == 'ranjit'");
        boolean msg5 = exp5.getValue(itemContext, Boolean.class);
        log.info(msg5);
    }
}
