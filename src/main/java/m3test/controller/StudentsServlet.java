package m3test.controller;

import m3test.model.Students;
import m3test.model.service.student.StudentsService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "classServlet", urlPatterns = "/students")
public class StudentsServlet extends HttpServlet {
//    private static final
    private StudentsService studentsService;
    public void init(){
        studentsService =new StudentsService();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        if(action==null){
            action="";
        }
        try{
            switch (action){
                case "add":

                    break;
                case "edit":

                    break;
                case "delete":

                    break;;
            }
        }catch (SQLException e){
            throw new ServletException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    private void showNewForm(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{
        RequestDispatcher dispatcher=request.getRequestDispatcher("");
        dispatcher.forward(request,response);
    }
    private void showEditForm(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{
        int id=Integer.parseInt(request.getParameter("id"));
        Students students=
    }
}
