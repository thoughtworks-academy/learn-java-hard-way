package designpattern;

import com.thoughtworks.academy.design.pattern.tutorial.creational.factory.AClass;
import com.thoughtworks.academy.design.pattern.tutorial.creational.factory.AClassFactory;
import org.junit.Before;
import org.junit.Test;

public class FactoryTest {
    
    private AClassFactory aClassFactory;
    
    @Before
    public void setUp(){
        aClassFactory = new AClassFactory();//真实项目中会用容器，或构造器注入
        
    }
    
    @Test
    public void should_manufacture_instance(){
        AClass instanceofAClass = aClassFactory.newAClass();
    }
}
