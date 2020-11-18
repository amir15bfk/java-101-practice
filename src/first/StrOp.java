/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

/**
 *
 * @author amir_
 */
public class StrOp {
    public String s;
    public StrOp(String s) {
        this.s=s;
    }
    public char [] StrToArr(){
        char [] ch = new char[this.s.length()];
        for (int i=0;i<this.s.length();i++)ch[i]=this.s.charAt(i);
        return ch;
    }
}
