package org.projectwallah.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassFirst {

    
//  field injection - Annotation is mandatory...
//  not so better

    @Autowired
    private ClassSecond cs1;

    public void methodFirst(){
        System.out.println("----------------------------------------------------");;
        cs1.methodOne();
        System.out.println("Hello Guys... I'm the method of ClassFirst. Now you can start your project.");
    }

//  constructor injection - default injection/no need to use @Autowired annotation...
// better
    private ClassSecond cs2;

    public ClassFirst(ClassSecond cs2){
        this.cs2 = cs2;
    }

//  setter injection - Annotation is mandatory...
// better
    private ClassSecond cs3;
    @Autowired
    public void setMethodThree(ClassSecond cs3){
        this.cs3 = cs3;
    }
 
  
}