package teammates.ui.pagedata;

import teammates.common.datatransfer.attributes.AccountAttributes;
import teammates.common.datatransfer.forum.ForumPostTable;

public class ForumPageData extends PageData {

    public ForumPostTable forumPosts;

    public ForumPageData(AccountAttributes account, String sessionToken) {
        super(account, sessionToken);
    }

    public ForumPostTable getForumPosts() {
        return forumPosts;
    }
}
