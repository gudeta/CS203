/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3D4Serialization;

/**
 *
 * @author Gude
 */
//public class QuizCard {
   // package chap14;
import java.io.*;

public class QuizCard implements Serializable {

     private String uniqueID;
     private String category;
     private String question;
     private String answer;
     private String hint;

     public QuizCard(String q, String a) {
         question = q;
         answer = a;
    }
     

     public void setUniqueID(String id) {
        uniqueID = id;
     }

     public String getUniqueID() {
        return uniqueID;
     }

     public void setCategory(String c) {
        category = c;
     }

     public String getCategory() {
         return category;
     }
     
     public void setQuestion(String q) {
        question = q;
     }

     public String getQuestion() {
        return question;
     }

     public void setAnswer(String a) {
        answer = a;
     }

     public String getAnswer() {
        return answer;
     }

     public void setHint(String h) {
        hint = h;
     }
 
     public String getHint() {
        return hint;
     }

}     


