<%@page import="com.bean.cart"%>
<%@page import="com.dao.cartdao"%>
<%
int cid=Integer.parseInt(request.getParameter("cid"));
int product_qty=Integer.parseInt(request.getParameter("product_qty"));
cart c= cartdao.getcart(cid);
int product_price=c.getProduct_price();
int total_price=product_price*product_qty;
c.setProduct_qty(product_qty);
c.setTotal_price(total_price);
cartdao.updatecart(c);
response.sendRedirect("cart.jsp");

%>