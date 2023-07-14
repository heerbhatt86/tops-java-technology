<%@page import="java.util.List"%>
<%@page import="com.dao.wishlistdao"%>
<%@page import="com.bean.wishlist"%>
<%

int pid = Integer.parseInt(request.getParameter("pid"));
int uid = Integer.parseInt(request.getParameter("uid"));

wishlist w =new wishlist();
w.setPid(pid);
w.setUid(uid);
wishlistdao.addtowishlist(w);
List<wishlist> list=wishlistdao.getwishlistbyuser(uid);
session.setAttribute("wishlist_count", list.size());
response.sendRedirect("wishlist.jsp");

%>