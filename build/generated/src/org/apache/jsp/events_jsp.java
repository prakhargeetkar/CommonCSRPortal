package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import commoncsrportal.dao.EventsDAO;
import java.util.List;
import commoncsrportal.dto.EventDTO;
import commoncsrportal.dto.EventDTO;

public final class events_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Common CSR Portal</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"description\" content=\"Demo project\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/bootstrap4/bootstrap.min.css\">\n");
      out.write("<link href=\"plugins/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.carousel.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.theme.default.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/animate.css\">\n");
      out.write("<link href=\"plugins/colorbox/colorbox.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/main_styles.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/responsive.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            StringBuffer displayBlock=new StringBuffer("<div class='super_container'>"
                    +"<header class='header'>"
			+"<div class='top_bar'>"
			+"<div class='top_bar_background' style='background-image:url(images/top_bar.jpg)'></div>"
			+"<div class='top_bar_container'>"
				+"<div class='container'>"
                                    +"<div class='row'>"
					+"<div class='col'>"
                                            +"<div class='top_bar_content d-flex flex-row align-items-center justify-content-start'>"
						+"<ul class='top_bar_contact_list'>"
                                                    +"<li>"
							+"<i class='fa fa-envelope' aria-hidden='true'></i>"
                                                            +"<div>Email:common-csr@gmail.com</div>"
                                                    +"</li>"
                                                    +"<li>"
							+"<i class='fa fa-phone' aria-hidden='true'></i>"
                                                            +"<div>Call Us: +755 2440249</div>"
                                                     +"</li>"
						+"</ul>"
							
                                            +"</div>"
					+"</div>"
				+"</div>"
			+"</div>"
                        +"</div>"				
                        +"</div>");


		displayBlock.append("<div class='header_container'>"
                       
                        +"<div class='container'>"
				+"<div class='row'>"
					+"<div class='col'>"
						+"<div class='header_content d-flex flex-row align-items-center justify-content-start'>"
							+"<div class='logo_container'>"
								+"<a href='#'>"
									+"<div class='logo'><img src='images/csr13.png' alt=''></div>"
									+"<div class='logo_text'>Common csr portal</div>"
								+"</a>"
							+"</div>"
							+"<nav class='main_nav_contaner ml-auto'>"
								+"<ul class='main_nav'>"
									+"<li><a href='index.html'>home</a></li>"
									+"<li><a href='about.html'>about</a></li>"
									+"<li class='active'><a href='#'>events</a></li>"
									+"<li><a href='contact.html'>contact</a></li>"
                                   +"<li><a href='event.html'> create</a></li>"
                        +"<li><a href='login.html'>Login</a></li>"
								+"</ul>"
								
							+"</nav>"
						+"</div>"
					+"</div>"
				+"</div>"
                         +"</div>"
		+"</div>");

		
		displayBlock.append("<div class='header_search_container'>"
			+"<div class='container'>"
				+"<div class='row'>"
					+"<div class='col'>"
						+"<div class='header_search_content d-flex flex-row align-items-center justify-content-end'>"
							+"<form action='#' class='header_search_form'>"
								+"<input type='search' class='search_input' placeholder='Search' required='required'>"
								+"<button class='header_search_button d-flex flex-column align-items-center justify-content-center'>"
                                                                    +"<i class='fa fa-search' aria-hidden='true'></i>"
								+"</button>"
							+"</form>"
						+"</div>"
					+"</div>"
				+"</div>"
			+"</div>"			
		+"</div>"			
	+"</header>");

	

	displayBlock.append("<div class='menu d-flex flex-column align-items-center justify-content-center'>"
		+"<div class='menu_content'>"
			+"<div class='cross_1 d-flex flex-column align-items-center justify-content-center'><img src='images/logo.png' alt=''></div>"
			+"<form action='#' class='menu_search_form'>"
				+"<input type='search' class='menu_search_input' placeholder='Search' required='required'>"
				+"<button class='menu_search_button d-flex flex-column align-items-center justify-content-center'>"
				+"<i class='fa fa-search' aria-hidden='true'></i>"
			+"</button>"
			+"</form>"
			+"<nav class='menu_nav'>"
				+"<ul>"
					+"<li class='active'><a href='index.html'>Home</a></li>"
					+"<li><a href='about.html'>About</a></li>"
					+"<li><a href='events.html'>Events</a></li>"
					+"<li><a href='event.html'> create</a></li>"
					+"<li><a href='contact.html'>Contact</a></li>"
				+"</ul>"
			+"</nav>"
		+"</div>"
		+"<div class='menu_close'><i class='fa fa-times' aria-hidden='true'></i></div>"
	+"</div>");

	

	displayBlock.append("<div class='home'>"
		+"<div class='home_background' style='background-image:url(images/csr.jpg)'></div>"
		+"<div class='home_content'>"
			+"<div class='container'>"
				+"<div class='row'>"
					+"<div class='col d-flex flex-row align-items-center justify-content-start'>"
						+"<div class='home_title'></div>"
						
					+"</div>"
				+"</div>"
			+"</div>"
		+"</div>"
	+"</div>");



	

	displayBlock.append("<div class='events'>"
		+"<div class='container'>"
			+"<div class='row'>"
				+"<div class='col'>"
					+"<div class='section_title_container text-center'>"
						+"<div class='section_title'>list of events</div>"
						+"<div class='section_subtitle'></div>"
					+"</div>"
				+"</div>"
			+"</div>"
		+"</div>");
       displayBlock.append("<div class='events_items d-flex flex-lg-row flex-column align-items-lg-start align-items-center justify-content-lg-between justify-content-center flex-wrap'>");
                                SimpleDateFormat sdf1=new SimpleDateFormat("MMM");
                                SimpleDateFormat sdf2=new SimpleDateFormat("dd");
                                List<EventDTO> event=EventsDAO.getUpcomingEvents();
                                for(EventDTO ev: event)
                                {
                                    System.out.println(ev.getEventid());
                                    System.out.println(ev.getImage());
                                    displayBlock.append("<div class='events_item'>");
                                    displayBlock.append("<div class='events_item_image'><img src='images/"+ev.getImage()+"' alt=''></div>"
				+"<div class='events_item_content d-flex flex-row align-items-start justfy-content-start'>"
					+"<div class='event_date'>"
						+"<div class='d-flex flex-column align-items-center justify-content-center'>"
							+"<div class='event_day'>"+sdf2.format(ev.getDate())+"</div>"
							+"<div class='event_month'>"+sdf1.format(ev.getDate())+"</div>"
						+"</div>"
					+"</div>"
					+"<div class='event_content'>"
						+"<div class='event_title'><a href='#'>"+ev.getEventname()+"</a></div>"
						+"<ul class='event_row'>"
							+"<li>"
								+"<div class='event_icon'><img src='images/calendar.png' alt=''></div>"
								+"<span>"+ev.getTime()+"</span>"
							+"</li>"
							+"<li>"
								+"<div class='event_icon'><img src='images/location.png' alt=''></div>"
								+"<span>"+ev.getLocation()+"</span>"
							+"</li>"
						+"</ul>"
					+"</div>"
				+"</div>"
			+"</div>");
                                displayBlock.append("</div>"
	+"</div>");
                       }
			
       

   
    displayBlock.append("<footer class='footer'>"
		+"<div class='footer_background parallax-window' data-parallax='scroll' data-image-src='images/footer.jpg' data-speed='0.8'></div>"
		+"<div class='container'>"
			+"<div class='row'>"
                              +"<div class='col-lg-6 footer_col'>"
					+"<div class='footer_column footer_contact_column'>"
						+"<div class='footer_logo_container'>"
							+"<a href='#'>"
								+"<div class='footer_logo'><img src='images/csr13.png' alt=''></div>"
								+"<div class='footer_logo_text'>Common CSR Portal</div>"
							+"</a>"
						+"</div>"
						+"<div class='footer_contact'>"
							+"<ul>"
								+"<li><div><i class='fa fa-map-marker' aria-hidden='true'></i></div><span>Sector-c indrapuri,Bhopal</span></li>"
								+"<li><div><i class='fa fa-phone' aria-hidden='true'></i></div><span>+755-2440249</span></li>"
								+"<li><div><i class='fa fa-envelope' aria-hidden='true'></i></div><span>common-csr@gmail.com</span></li>"
							+"</ul>"
                                                +"</div>"
					+"</div>"
				+"</div>"

				
				+"<div class='col-lg-6 footer_col'>"
					+"<div class='footer_column footer_links'>"
						+"<div class='footer_title'>useful links</div>"
						+"<ul class='footer_links_list'>"
							+"<li><a href='about.html'><i class='fa fa-angle-double-right' aria-hidden='true'></i> About us</a></li>"
							+"<li><a href='contact.html'><i class='fa fa-angle-double-right' aria-hidden='true'></i> Contact</a></li>"
							+"<li><a href='#'><i class='fa fa-angle-double-right' aria-hidden='true'></i> Donation</a></li>"
							+"<li><a href='blog.html'><i class='fa fa-angle-double-right' aria-hidden='true'></i> Blog</a></li>"
							+"<li><a href='sermon.html'><i class='fa fa-angle-double-right' aria-hidden='true'></i> Sermons</a></li>"
							+"<li><a href='events.html'><i class='fa fa-angle-double-right' aria-hidden='true'></i> Events</a></li>"
							+"<li><a href='#'><i class='fa fa-angle-double-right' aria-hidden='true'></i> Service</a></li>"
							+"<li><a href='#'><i class='fa fa-angle-double-right' aria-hidden='true'></i> Media</a></li>"
						+"</ul>"
					+"</div>"
				+"</div>"
                        +"</div>"
		+"</div>"
	+"</footer>"
+"</div>");
          out.println(displayBlock);
          
      out.write("\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("<script src=\"styles/bootstrap4/popper.js\"></script>\n");
      out.write("<script src=\"styles/bootstrap4/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"plugins/OwlCarousel2-2.2.1/owl.carousel.js\"></script>\n");
      out.write("<script src=\"plugins/easing/easing.js\"></script>\n");
      out.write("<script src=\"plugins/parallax-js-master/parallax.min.js\"></script>\n");
      out.write("<script src=\"plugins/colorbox/jquery.colorbox-min.js\"></script>\n");
      out.write("<script src=\"js/custom.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
