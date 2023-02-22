<%@ tag pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="title" required="true" type="java.lang.String" %>

<div id="student-confirm-modal" class="student-confirm-modal">
    <div class="">
        <div class="">
            <h2>${title}</h2>
        </div>
        <div class="">
            <jsp:doBody />
        </div>
        <div class="">
            <button id="student-confirm-modal-cancel">Cancelar</button>
            <button id="student-confirm-modal-delete">Excluir</button>
        </div>
    </div>

</div>