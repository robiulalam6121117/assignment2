/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Hp
 */
public class MyQueue extends LinkedList{
    Queue<String> q = new LinkedList<>();
    public MyQueue(String filename) throws FileNotFoundException, IOException {
        File file = new File("Users\\Hp\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\"+filename+".txt"); 
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st; 
        while ((st = br.readLine()) != null){ 
          System.out.println(st); 
          q.add(st);
        }
    }