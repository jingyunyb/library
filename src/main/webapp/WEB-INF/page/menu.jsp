<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<ul class="sidebar-menu">
	<li class="sub-menu">
	    <a class="" href="index.html">
	        <i class="icon-dashboard"></i>
	        <span>Dashboard</span>
	    </a>
	</li>
	
	
	<s:iterator value="#session.menuSet" var="menu">
		<s:if test="#menu.superMenu == null">
			<s:if test="#session.superMenuName == #menu.name">
				<li class="sub-menu active">
			</s:if>
			<s:else>
				<li class="sub-menu">
			</s:else>
			    <a href="javascript:;" class="">
			        <i class="<s:property value="#menu.icon" />"></i>
			        <span>
			        	<s:property value="#menu.name" />
			        </span>
			        <span class="arrow"></span>
			    </a>
			    <ul class="sub">
			    	<s:iterator value="#menu.subMenuSet" var="subMenu">
			    		<s:if test='#session.currentActionUrl == #subMenu.webAction.url'><li class="active"></s:if>
			    		<s:else><li></s:else>
			    			<a class="" href="<s:property value="#subMenu.webAction.url" />">
			    				<s:property value="#subMenu.name" />
			    			</a>
			    		</li>
			    	</s:iterator>
			    </ul>
			</li>
		</s:if>
	</s:iterator>
	
</ul>