<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="tags" %>

<style>
    .student-confirm-modal {
        display: none;
        position: fixed;
        z-index: 1;
        left: 0;
        top: 0;
        width: 100%;
        height: 100%;
        overflow: auto;
        background-color: rgb(0,0,0);
        background-color: rgba(0,0,0,0.4);
    }
</style>

<h1>Chegamos no form</h1>


<form:form method="post" modelAttribute="newDynamicInputForm" action="/save">


    <label for="nome">Nome</label>
    <form:input id="nome" path="nome"/>
    <form:errors path="nome"/>


    <c:choose>
        <c:when test="${empty newDynamicInputForm.newAcademicEducationForms}">
            <div class="dynamic-div">
                <div class="single-div">
                    <label for="nome">Nome do outro</label>
                    <form:input id="nome" path="newAcademicEducationForms[0].nome"/>
                    <form:errors path="newAcademicEducationForms[0].nome"/>
                </div>

                <div class="single-div">
                    <form:select path="newAcademicEducationForms[0].academicEducationType" required="required">

                        <c:forEach var="education" items="${academicEducationTypes}">
                            <option value="${education}">${education}</option>
                        </c:forEach>

                    </form:select>
                </div>

                <div class="single-div">
                    <form:checkbox path="newAcademicEducationForms[0].completed"/>
                    <label class="form-label">Concluido</label>
                    <form:errors path="newAcademicEducationForms[0].completed"/>
                </div>

                <div><p class="deletar">Deletar</p></div>
            </div>
        </c:when>
        <c:otherwise>
            <c:forEach items="${newDynamicInputForm.newAcademicEducationForms}" var="academicEducation" varStatus="loop">
                <c:set var="index" value="${loop.index}"/>
                <div class="dynamic-div">
                    <div class="single-div">
                        <label for="nome">Nome do outro</label>
                        <form:input id="nome" path="newAcademicEducationForms[${index}].nome"/>
                        <form:errors path="newAcademicEducationForms[${index}].nome"/>
                    </div>

                    <div class="single-div">
                        <form:select path="newAcademicEducationForms[${index}].academicEducationType" required="required">

                            <c:forEach var="education" items="${academicEducationTypes}">
                                <option value="${education}" ${education eq academicEducation.academicEducationType ? 'selected' : '' }>${education}</option>
                            </c:forEach>

                        </form:select>
                    </div>

                    <div class="single-div">
                        <form:checkbox value="${newAcademicEducationForms[index].completed}"
                                       path="newAcademicEducationForms[${index}].completed"/>
                        <label class="form-label">Concluido</label>
                        <form:errors path="newAcademicEducationForms[${index}].completed"/>
                    </div>

                    <div><p class="deletar">Deletar</p></div>
                </div>
            </c:forEach>
        </c:otherwise>
    </c:choose>

    <input id="dynamic-div-creator" type="button" value="Adicionar novo"/>
    <br/>
    <br/>
    <br/>
    <form:button>Enviar</form:button>

</form:form>

<tags:studentModal title="titulo legal">

    <p class="studentModal__paragraph">Você não poderá desfazer a ação.</p>

</tags:studentModal>

<script src="/assets/js/DynamicInput.js"></script>
<script src="/assets/js/StudentModal.js"></script>

<script>
    new DynamicInput().refreshListeners();
</script>