<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
    <form:form action="attandanceForm" modelAttribute="attandance">  
        Roll No: <form:input path="Roll_No" />         
        <br><br>  
        Student Name: <form:input path="Name" />  
        <br><br>
         Date: <input type="Date" path="Date" />
        <br><br>     
        Present<form:radiobutton path="Attandance" value="Present"/>  
        Absent<form:radiobutton path="Attandance" value="Absent"/>  
        <br><br> 
         
        <input type="submit" value="Submit" />  
    </form:form>  
	<%@ include file="common/footer.jspf" %>  