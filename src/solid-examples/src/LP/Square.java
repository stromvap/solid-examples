/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP;

/**
 *
 * @author dante
 */
public class Square implements Shape{
    
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int area() {
        return size * 4;
    }
    
    
}
