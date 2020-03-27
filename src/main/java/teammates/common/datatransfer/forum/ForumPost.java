package teammates.common.datatransfer.forum;

import java.util.Date;

import teammates.common.datatransfer.attributes.AccountAttributes;

/** A wrapper class for individual messages on the forum.
 */
public class ForumPost {
    private AccountAttributes account;
    private String message;
    private Date createdAtDate;
    private ForumPostTable comments;

    public ForumPost(AccountAttributes user, String message) {
        this.account = user;
        this.message = message;
        this.createdAtDate = new Date();
        this.comments = new ForumPostTable();
    }

    /** Returns the contents of the forum post.
     * @return the message posted to the forum
     */
    public String getMessage() {
        return message;
    }

    /** Return the account associated with this forum post.
     * @return account that created the post.
     */
    public AccountAttributes getAccount() {
        return account;
    }

    /** Get the date this post was created on.
     * @return date this post was created.
     */
    public Date getCreatedAtDate() {
        return createdAtDate;
    }

    /** Gets the comments on this post.
     * @return ForumPostTable of comments on this post
     */
    public ForumPostTable getComments() {
        return comments;
    }

    /** Returns the post as a cell in a table, in HTML.
     * @return string in html
     */
    public String getPostAsHtml() {

        String oP = "<td class='poster'><b>" + account.getName() + "</b><br><p>" + createdAtDate.toString() + "</p></td>";

        String messageAsHtml = "<td class='post'>" + message + "</td>";

        return "<tr class='postrow'>" + oP + messageAsHtml + "</tr>";
    }

}
