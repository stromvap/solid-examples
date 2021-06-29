/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIP;

/**
 *
 * @author dante
 */
public class EBookReader {
    private EBook eBook;

    public EBookReader(EBook eBook) {
        this.eBook = eBook;
    }

    public void read() {
        System.out.println(eBook.getContent());
    }
    
}
