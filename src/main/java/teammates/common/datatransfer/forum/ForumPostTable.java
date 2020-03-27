package teammates.common.datatransfer.forum;

import java.util.ArrayList;
import java.util.List;

/** Class for containing a list of forum posts.
 */
public class ForumPostTable {
    private List<ForumPost> posts;

    /** Constructor.
     */
    public ForumPostTable() {
        posts = new ArrayList<ForumPost>();
    }
    
  

    /** Add a new post to the list.
     * @param post the post to add to the table.
     */
    public void add(ForumPost post) {
        posts.add(post);
    }

    /** Returns a string: the entire table printed in HTML.
     * @return table as string of html
     */
    public String getForumTableAsHtml() {
        StringBuilder forumTableAsHtml = new StringBuilder("<table class='forumtable'>");

        for (ForumPost post : posts) {
            forumTableAsHtml.append(post.getPostAsHtml());
        }
        forumTableAsHtml.append("</table>");

        return forumTableAsHtml.toString();
    }

}
