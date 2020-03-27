<%@ tag trimDirectiveWhitespaces="true" %>
<%@ tag description="List of posts in Forum" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ attribute name="forumPostTable" type="java.util.Collection" required="true" %>

<div class="panel panel-primary">
    <div class="panel-heading">
        <br>
    </div>

    <table class="table table-striped data-table">
        <thead>
        <tr>
            <th width="70%">Forum</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${forumPostTable}" var="row">
            <tr>
                <td class='poster'><b> ${row.getAccount.getName}</b><br><p> ${row.createdAtDate.toString()} </p></td>
                <td class='post'> ${row.getMessage}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
