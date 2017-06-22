<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<s:form role="form" action="signin" namespace="/signin" enctype="multipart/form-data" theme="bootstrap"
	cssClass="form-horizontal col-sm-4" label="Sign In">

 <s:actionerror cssClass="alert alert-error" />
	<s:textfield label="Name" name="userLogin.username"
		tooltip="Enter your Name here" />

	<s:password label="Password" name="userLogin.password"
		tooltip="Enter your password here" />

	<s:checkbox label="Remember me" name="me" />

	<s:submit value="Login" cssClass="btn btn-primary btn-sm pull-right"/> 
	

</s:form>


