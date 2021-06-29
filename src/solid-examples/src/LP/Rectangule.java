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
class Rectangle implements Shape, VerifierArea {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public int area() {
        return width * height;
    }

    @Override
    public void verifyArea(int valueCorrect) {
        if(this.area() != valueCorrect){
            System.out.println("Bad");
        }else System.out.println("Good");
    }
}
