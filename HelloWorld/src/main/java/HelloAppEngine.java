import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Random;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    Random rand = new Random();
    int min = 1;
    int max = 10;
    int randomNum = rand.nextInt((max - min) + 1) + min;

    response.getWriter().print("Hello App Engine!\r\n");
    response.getWriter().print("Your number is: "+randomNum+"\r\n");

  }
}