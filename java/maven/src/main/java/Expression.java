public class Expression {
    public static void booleanExpress() {
        println(true && true);//短路可以设计个练习
        println(true && false);
        println(false && true);
        println(false && false);

        println(true || true);
        println(true || false);
        println(false || true);
        println(false || false);

        println(true | true);
        println(true | false);
        println(false | true);
        println(false | false);

        println(true ^ true);
        println(true ^ false);
        println(false ^ true);
        println(false ^ false);

        println(true & true);
        println(true & false);
        println(false & true);
        println(false & false);


        println(true != true);
        println(false != true);
        
        println(1 == 1);
        println(1 == 2);
        println(1 != 1);
        println(1 != 2);
        
        println(1 <= 0);
        println(1 <= 1);
        println(1 <= 2);

        println(1 >= 0);
        println(1 >= 1);
        println(1 >= 2);

        println(1 | 1);
        println(1 | 2);
        println(1 | 3);
        println(1 | 4);
        println(1 | 5);
        println(1 | 6);
        println(1 | 7);
        println(1 | 8);
        
        println(8 | 8);
        println(7 | 8);
        println(6 | 8);
        println(5 | 8);
        println(4 | 8);
        println(3 | 8);
        println(2 | 8);
        println(1 | 8);

        println(1 & 1);
        println(1 & 2);
        println(1 & 3);
        println(1 & 4);
        println(1 & 5);
        println(1 & 6);
        println(1 & 7);
        println(1 & 8);

        println(8 & 8);
        println(7 & 8);
        println(6 & 8);
        println(5 & 8);
        println(4 & 8);
        println(3 & 8);
        println(2 & 8);
        println(1 & 8);
        
        //表达式的优先级就不练了，或者只练一两个，总之这种故意难为人的功能，还是少用为好，商用领域又不需要节省这点计算量，尽量用括号。
        println(true || false && true && false);
    }



    public static void mathExpress() {
        println(1 + 1);
        println(1 - 1);
        println(1 * 1);
        println(1 / 1);
        println(1 - 2);
        println(1 / 100);
        println(1 / 100.0);
        println(1.0 / 100);
        println(1.0 / 1000000000.0);
        println(1.0 / 123456789.0);//计算精度问题怎么办？就是计算机算小数经常会算错那个
        println(7788654.0000000 / 2.000000000);//试了好几个case都不出来……
        println(100.0*100);
        println(100 * 100.0);
        println(10 % 3);
        println(10.0 % 3);
        println(10 % 2.5);
        println(10 % (5/2));
        println(10 % (5/2.0));

        println(1 + 2 / 3 - 4 * 5);
        println(1 + 2 / 3==0?7:8 - 4 * 5);
        
    }

    public static void stringExpress() {
        println("1" + 2);
        println("2" + "3");
        println("2" + null);
        println("2" + 2 + 3);
        println("2" + 2 * 3);
        println("2" + 2 / 3);
        println(2 + 3 + "2" );

        println("2" + new A());
    }
    
    public static class A{
        public String toString() {
            return "B";

        }
        
    }

    private static void println(Object object) {
        System.out.println(object);
    }
}
