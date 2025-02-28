package org.projectwallah.demo;

import org.springframework.stereotype.Component;

@Component
public class ClassThird implements AutowiringTypes {
    
    public void autowiringByTypes(){
        System.out.println("This is Autowiring byType in ClassThird...");
    }
}
