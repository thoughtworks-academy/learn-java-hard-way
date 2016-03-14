import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BlockTest {

    @Test
    public void should_scope_works1(){

        for(int i = 0; i< 10; i++) {
            String a = ""+i;
//          assertThat(a, is());
        }


    }

    @Test
    public void should_scope_works2(){
        for(int i = 0; i< 10; i++) {
            String a = ""+i;
            for(int j = 0; j < 10; j++){
//              assertThat(a, is());
            }
        }
    }


    @Test
    public void should_scope_works3(){
        String a = "a";
        for(int i = 0; i< 10; i++) {
            a = ""+i;
            for(int j = 0; j < 10; j++){
//              assertThat(a, is());
            }
        }
//        assertThat(a, is());
    }

    @Test
    public void should_assign_works(){
        String a;
        
//        for(int i = 0; i< 10; i++) {
//            a += i;
//        }
//        assertThat(a, is());
    }

    @Test
    public void should_assign_works2(){
        String a = "";

        for(int i = 0; i< 10; i++) {
            String s = a + i;
        }
//        assertThat(a, is());
    }

    @Test
    public void should_assign_works3(){
        String a = "";
        
        for(int i = 0; i< 10; i++) {
            a += i;
            if (i % 2 == 0) {
                continue;
            }
        }
//        assertThat(a, is());
    }

    @Test
    public void should_assign_works4(){
        String a = "";

        for(int i = 0; i< 10; i++) {
            a += i;
            if (i % 2 == 0) {
                break;
            }
        }
//        assertThat(a, is());
    }

    @Test
    public void should_assign_works5(){
        String a = someLoop("");
        
//        assertThat(a, is());
    }

    private String someLoop(String s) {
        for(int i = 0; i< 10; i++) {
            s += i;
            if (i % 2 == 0) {
                return s;
            }
        }
        return s;
    }



    @Test
    public void should_understand_if() {
        String[] s1 = {"academy","thoughtworks","com"};
        String[] s2 = {"www","thoughtworks","com"};
        String[] s3 = {"thoughtworks","com"};
        String[] s4 = {"www","www","thoughtworks","com"};
        String[] s5 = {"api","thoughtworks","com"};
        String[] s6 = {"uat","api","thoughtworks","com"};
        String[] s7 = {};
        String[] s8 = {"com"};

//        assertThat(level(s1), is());
//        assertThat(level(s2), is());
//        assertThat(level(s3), is());
//        assertThat(level(s4), is());
//        assertThat(level(s5), is());
//        assertThat(level(s6), is());
//        assertThat(level(s7), is());
//        assertThat(level(s8), is());
    }

    private int level(String[] s) {
        int result;
        if(s.length < 2){
            result = -1;
        }else if (s.length == 2) {
            result = 1;
        }else {
            if (s.length == 3 && "www".equals(s[0])) {
                result = 1;
            } else {
                result = s.length - 1;
            }
        }
        return result;
    }

    @Test
    public void should_understand_if2() {
        String[] s1 = {"www","www","thoughtworks","com"};
        String[] s2 = {"www","thoughtworks","com"};
        String[] s3 = {"academy","thoughtworks","com"};
        String[] s4 = {"com"};
        String[] s5 = {"thoughtworks","com"};
        String[] s6 = {};
        String[] s7 = {"uat","api","thoughtworks","com"};
        String[] s8 = {"api","thoughtworks","com"};

//        assertThat(level2(s1), is());
//        assertThat(level2(s2), is());
//        assertThat(level2(s3), is());
//        assertThat(level2(s4), is());
//        assertThat(level2(s5), is());
//        assertThat(level2(s6), is());
//        assertThat(level2(s7), is());
//        assertThat(level2(s8), is());
    }
    
    private int level2(String[] s) {
        if(s.length < 2){
            return -1;
        }
        if (s.length == 2) {
            return 1;
        }
        
        if (s.length == 3 && "www".equals(s[0])) {
            return 1;
        } 
        return s.length - 1;
    }
    
    
    

}
