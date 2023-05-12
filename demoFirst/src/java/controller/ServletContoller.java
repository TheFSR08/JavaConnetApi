package controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONArray;
import models.FirstClass;
import org.json.JSONObject;


@WebServlet("/ServletContoller")
public class ServletContoller extends HttpServlet {
    
    /*@override*/
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //process the parameters
                         FirstClass first = new FirstClass("");
                         String allo = "";
                         StringBuilder informationString;
			try {
			URL url = new URL(null,"http://cse.bth.se/~fer/googlescholar-api/googlescholar.php?user=vJjq9LwAAAAJ");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();

			int responseCode = conn.getResponseCode();
			if(responseCode != 200){
				throw new RuntimeException("Ocurrio un Error" + responseCode);
			}else {
				  informationString = new StringBuilder();
                            try (Scanner scanner = new Scanner(url.openStream())) {
                                while (scanner.hasNext()){
                                    informationString.append(scanner.nextLine());
                                }
                                scanner.close();
                                
       //  JSONArray Sanx = new JSONArray(informationString.toString());                       
        JSONObject jsonObject = new JSONObject(informationString.toString());                          
      //   
        
        
        
        //redireccional a la vista seleccionada
        request.setAttribute("mensaje", jsonObject.get("citations_per_year") );
 
        HttpSession session = request.getSession();
        session.setAttribute("firstClass",first);

        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarDatos.jsp");
        rd.forward(request, response);
                                
                                
                            }
			
			}
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		} catch (ProtocolException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}


	
                        
			
		

        // create javabeans
     
    }
    }

