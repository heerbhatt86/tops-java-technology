<%@page import="com.dao.cartdao"%>
<%@page import="com.dao.productDao"%>
<%@page import="com.bean.product"%>
<%@page import="com.bean.cart"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.wishlistdao"%>
<%@page import="com.bean.wishlist"%>
<%

int pid = Integer.parseInt(request.getParameter("pid"));
int uid = Integer.parseInt(request.getParameter("uid"));

cart c =new cart();
c.setPid(pid);
c.setUid(uid);
product p = productDao.getproduct(pid);
c.setProduct_price(p.getProduct_price());
c.setProduct_qty(1);
c.setTotal_price(p.getProduct_price());
c.setPayment_status("false");

cartdao.addtocart(c);
List<cart> list=cartdao.getcartbyuser(uid);
session.setAttribute("cart_count", list.size());
response.sendRedirect("cart.jsp");

%>