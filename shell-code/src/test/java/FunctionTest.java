import org.junit.Test;

public class FunctionTest {
    

    @Test
    public void should_assign_works6(){
        String a = "";
        someLoop2(a);

//        assertThat(a, is());
    }

    private void someLoop2(String a) {
        for(int i = 0; i< 10; i++) {
            a += i;
            if (i % 2 == 0) {
                return;
            }
        }
    }



    @Test
    public void should_assign_works7() {
        AC a = new AC("");
        someLoop3(a);

//        assertThat(a.getValue(), is());
    }

    private void someLoop3(AC a) {
        for(int i = 0; i< 10; i++) {
            a.add(i);
            if (i % 2 == 0) {
                return;
            }
        }
    }

    private class AC {
        private String s;

        public AC(String s) {
            this.s = s;
        }


        public void add(int i) {
            this.s += i;
        }

        public String getValue(){
            return this.s;
        }
    }

    
    @Test
    public void should_call_right_function() {
        String a = func("");
//        assertThat(a, is());
    }

    private String func(String s, int i, double v) {
        return s+i+v;
    }

    @Test
    public void should_call_right_function2() {
        String a = func("",1);
//        assertThat(a, is());
    }

    private String func(String s) {
        return s+null;
    }

    @Test
    public void should_call_right_function3() {
        String a = func("",1, 0.0);
//        assertThat(a, is());
    }

    private String func(String s, int i) {
        return s+i;
    }
}
