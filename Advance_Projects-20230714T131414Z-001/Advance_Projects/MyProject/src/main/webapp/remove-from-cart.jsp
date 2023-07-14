<%@page import="com.dao.cartdao"%>
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

cartdao.removefromcart(c);
List<cart> list =cartdao.getcartbyuser(uid);
session.setAttribute("cart_count", list.size());
response.sendRedirect("cart.jsp");

%>