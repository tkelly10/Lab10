/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package independentcopy.reader;

import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author tyler
 */
public class ListReader implements Reader{

    List list;
    
   

    
    @Override
    public String readln() {

        list = new ArrayList<>();
        list.add("hello");
        list.add("hi");
        list.add("goodbye");
        String output = " ";
        
        for(int i = 0; i < list.size(); i++)
        {
          
            output += list.get(i) + " ";
            
        }
        return output;        
    }
    
    
}
