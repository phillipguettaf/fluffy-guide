<script>
    let posts = initArray();
    let postsAsHTML = "";
    function initArray() {
        let posts = [];
        return posts;
    }
    function post() {
        let message = document.getElementById("textbox").value;
        posts.push(message);
        updatePosts();
    }
    function display() {
        postsAsHTML = "<table>";
        posts.forEach(printPost);
        postsAsHTML +="</table>";
        document.getElementById("demo").innerHTML = postsAsHTML;
    }
    function printPost(value) {
        postsAsHTML+= "<tr><td>" + value + "</td></tr>";
    }
    function updatePosts() {
        display();
    }

    //Deprecated print function
    function output() {
        let x,z,name,id;
        id= "${data.account.googleId}"
        x=document.getElementById("form1") ;
        z=x.elements["name"].value;
        n =  new Date();
        y = n.getFullYear();
        m = n.getMonth() + 1;
        d = n.getDate();
        document.getElementById("demo").innerHTML += z + id +" "+d + "/" + m + "/" + y+ "<time>" +"<br>";

    }
</script>