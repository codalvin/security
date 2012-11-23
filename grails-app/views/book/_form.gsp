<%@ page import="org.example.Book" %>



<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'page', 'error')} required">
	<label for="page">
		<g:message code="book.page.label" default="Page" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="page" type="number" value="${bookInstance.page}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'title', 'error')} ">
	<label for="title">
		<g:message code="book.title.label" default="Title" />
		
	</label>
	<g:textField name="title" value="${bookInstance?.title}"/>
</div>

