package teammates.test.cases.pagedata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import teammates.common.datatransfer.DataBundle;
import teammates.common.datatransfer.attributes.AccountAttributes;
import teammates.test.cases.BaseTestCase;

/** Test class for ForumPageData: includes mock classes for ForumPost and ForumPostTable.
 */
public class ForumPageDataTest {

    private static DataBundle dataBundle = BaseTestCase.getTypicalDataBundle();
    private MockForumTable table = new MockForumTable();

    /** Mock Forum Post class.
     */
    public class MockForumPost {

        private Date date;
        private String message;
        private AccountAttributes account;

        /** Constructor for MockForumPost.
         *
         * @param account the account currently logged in.
         * @param message the post written by the user.
         */
        MockForumPost(AccountAttributes account, String message) {
            this.account = account;
            this.message = message;
            this.date = new Date();
        }

        public String getMessage() {
            return this.message;
        }

        public AccountAttributes getAccount() {
            return this.account;
        }

        public Date getDate() {
            return this.date;
        }
    }

    /** A Mock object for the Forum Table.
     */
    public class MockForumTable {
        private List<MockForumPost> posts;

        /** Constructor.
         */
        MockForumTable() {
            posts = new ArrayList<>();
        }

        /** Add a new post to the list.
         * @param post the post to add to the table.
         */
        public void add(MockForumPost post) {
            posts.add(post);
        }

    }

    /** Test if a post is correctly added to the forum.
     */
    @Test
    public void testAddPost() {
        AccountAttributes student = dataBundle.accounts.get("student1InCourse1");
        MockForumPost post = new MockForumPost(student, "Lorem Ipsum blah blah blah.");

        Assert.assertEquals(post.account.getName(), dataBundle.accounts.get("student1InCourse1").getName());

        table.add(post);

        Assert.assertTrue(table.posts.contains(post));
    }

    /** This test always passes.
     */
    @Test
    public void testPass() {
        Assert.assertTrue(true);
    }
}
