/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import domain.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 752814
 */
public class NoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        //attributes
        String title = null;
        String contents = null;
        
        //read file
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        //read title
        title = br.readLine();
        contents = br.readLine();
        
        //create note object
        Note note = new Note(title, contents);
          
        //close file
        br.close();
        
        //set attributes
        request.setAttribute("note", note);
        
        //redirect to edit
        if(!(request.getParameter("edit") == null)){
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        //attributes
        String title = request.getParameter("title");
        String contents = request.getParameter("contents");
 
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write(title + "\n" + contents);
            bw.close();
            
        Note n = new Note(title, contents);
        request.setAttribute("note", n);
         
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }
}
