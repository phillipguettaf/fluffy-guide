package teammates.ui.controller;

import teammates.common.util.Const;
import teammates.ui.pagedata.ForumPageData;

/** Class to create the forum from url.
 */
public class ForumAction extends Action {

    /** Creates a page to display.
     *
     * @return ActionResult (returns page to show in browser).
     */
    public ActionResult execute() {
        ForumPageData data = new ForumPageData(account, sessionToken);
        gateKeeper.verifyInstructorPrivileges(account);
        return createShowPageResult(Const.ViewURIs.FORUM_VIEW, data);
    }
}
