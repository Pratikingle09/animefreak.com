<jsp:include page="/Header.jsp"></jsp:include>
       <div align = "center" >
     <h4>Login</h4>
     <br>
    
     <section>
     <form action="<%=request.getContextPath()%>/Controller" method="post">
     
     Username<input type="text" name="username" style="width:300px;">
     <br>
     Password<input type="password" name="password" style="width:300px;">
     <br>
     <input type="submit" value="login">
     </form>
     <br>
     OR
     <br>
     <a href="Registration.jsp"><input type="submit" value="Register"></a>
     </section> 
     </div>



<jsp:include page="/footer.jsp"></jsp:include>