<%@ page trimDirectiveWhitespaces="true" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/forum" prefix="forum" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<t:staticPage currentPage="Forum">
  <main class="container">
    <h1 class="color-orange">
      Forum
    </h1>
    <img class="img-responsive" src="../images/contact.png">
    <p>
     ~ Welcome to the TEAMMATES Forum ~
    <br>

      <form action= "" method="POST" target='_blank'>

    	  <label>Write your message here: <br><br><textarea name ="message" value="" cols="35"
    		rows ="10" placeholder ="Type in your queries/messages" ></textarea></label>

    	  <br><br><input type='submit' name='submit' value='Post' ></input>

    	</form>
    <br>
    <p>
      <b>Interested in joining us?:</b> Visit our <a href="https://github.com/TEAMMATES/teammates">Developer Website</a>.
    </p>
  </main>
</t:staticPage>
