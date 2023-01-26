package com.xwork.mobileName.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1, urlPatterns = "/mobile")
public class MobileProductServlet extends HttpServlet {

	public MobileProductServlet() {
		System.out.println("Created.... " + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in MobileProductServlet.....");
		String name = req.getParameter("Name");
		String size = req.getParameter("Size");
		String brand = req.getParameter("Brand");
		String style_Name = req.getParameter("Style_Name");
		String model_Name = req.getParameter("Model_Name");
		String colour = req.getParameter("Colour");
		String network_Service_Provider = req.getParameter("Network_Service_Provider");
		String oS = req.getParameter("OS");
		String cellular_Technology = req.getParameter("Cellular_Technology");
		String batteries = req.getParameter("Batteries");
		String connectivity_technologies = req.getParameter("Connectivity_technologies");
		String gPS = req.getParameter("GPS");
		String other_display_features = req.getParameter("Other_display_features");
		String audio_Jack = req.getParameter("Audio_Jack");
		String generic_Name = req.getParameter("Generic_Name");
		String battery_Power = req.getParameter("Battery_Power");
		String manufacturer = req.getParameter("Manufacturer");
		String country = req.getParameter("Country");
		String item_Weight = req.getParameter("Item_Weight");
		String net_Quantity = req.getParameter("Net_Quantity");

		System.out.println(name + "\n" + size + "\n" + brand + "\n" + style_Name + "\n" + model_Name + "\n" + colour
				+ "\n" + network_Service_Provider + "\n" + oS + "\n" + cellular_Technology + "\n" + batteries + "\n"
				+ connectivity_technologies + "\n" + gPS + "\n" + other_display_features + "\n" + audio_Jack + "\n"
				+ generic_Name + "\n" + battery_Power + "\n" + manufacturer + "\n" + country + "\n" + item_Weight + "\n"
				+ net_Quantity);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<span>");
		writer.print("<h1>");
		writer.print("Mobile Detail " + name + " Sent Successfuly");
		writer.print("</h1>");
		writer.print("</span>");
		writer.print("</html>");
		resp.setContentType("text/html");

	}
}
