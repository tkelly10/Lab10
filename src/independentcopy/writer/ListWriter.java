/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package independentcopy.writer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tyler
 */
public class ListWriter implements Writer {
    
    
     List list;


    @Override
    public void writeln(String line) {
        
        list = new ArrayList<>();
        list.add(line);
        
        System.out.println("This is what is in the arrayList ");
        System.out.println(list.get(0));
      
    }
}