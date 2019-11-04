import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculatorServlet", urlPatterns = "/product")
public class DiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        String description = request.getParameter("product");

        double discountAmount = (price * percent)/100;
        double discountPrice = (price - discountAmount);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: " + description+ "</h1>");
        writer.println("<h1>Price: $" + price+ "</h1>");
        writer.println("<h1>Discount Percent: " + percent+ "%</h1>");
        writer.println("<h1>Discount Amount: " + discountAmount+ "</h1>");
        writer.println("<h1>Discount Price: " + discountPrice+ "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
