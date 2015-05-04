<%@ page import="com.my.app.Student" %>



<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'age', 'error')} required">
	<label for="age">
		<g:message code="student.age.label" default="Age" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="age" type="number" value="${studentInstance.age}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="student.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${studentInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'sex', 'error')} required">
	<label for="sex">
		<g:message code="student.sex.label" default="Sex" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sex" type="number" value="${studentInstance.sex}" required=""/>

</div>

