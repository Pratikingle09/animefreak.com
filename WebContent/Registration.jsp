<jsp:include page="/Header.jsp"></jsp:include>
       <div align = "center" >
     <h4>Register Here!</h4>
     <br>
    
     <section>
     <form action="<%=request.getContextPath()%>/Controller" method="get">
     
     Username<input type="text" name="username" style="width:300px;">
     <br>
     Password<input type="password" name="password" style="width:300px;">
     <br>
     Confirm Password<input type="password" name="confirm_password" style="width:300px;">
     <br>
     <input type="submit" value="Register"><br>
      OR
      <br>
      <a href="login.jsp"><input type="button" value="login" style="width:100px;"></a>
     </form>
     </section> 
     </div>


<jsp:include page="/footer.jsp"></jsp:include>