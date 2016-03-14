import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ExpressionTest {
//其实用assertion写才是正写
    
    @Test
    public void should_print_boolean_express() {
        Expression.booleanExpress();
        assertThat(true, is(true));
        // 把下列注释都解注，在is后的()中填入表达式执行的结果，使断言通过
//        assertThat(true && true, is());
//        assertThat(true && false, is());
    }
    
    @Test
    public void should_print_math_expression(){
        Expression.mathExpress();
    }
    
    @Test
    public void should_print_string_expression(){
        Expression.stringExpress();
    }


}
