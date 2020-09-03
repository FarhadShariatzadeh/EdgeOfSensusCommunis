package EdgeOfSensusCommunis;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Represents a SuperStar. A SuperStar has a name, followers, date of birth, has an instagram followers
 * or not, a latestAppearanceEvent, is a youTuber or not,
 * and a list of SuperStar's social media platform
 */
public class SuperStar extends CelebrityRoleModel {

  /**
   * c, whether
   * or not has Instagram followers, a latest appearance event, whether or not is a YouTuber,
   * and a list of singer's social media platform
   * @param name - SuperStar's name
   * @param followers - SuperStar's followers
   * @param dateOfBirth - SuperStar's date of birth
   * @param hasInstagramFollower - SuperStar's has instagram influencer or not
   * @param latestAppearanceEvent - SuperStar's latest appearance event
   * @param isYouTuber - SuperStar's is a youTuber or not
   * @param listOfPlatforms - list of social media platform
   * @throws EstimatingException if SuperStar's followers is less than 50000
   */

  public SuperStar(String name, Integer followers, LocalDate dateOfBirth,
                   Boolean hasInstagramFollower, String latestAppearanceEvent, boolean isYouTuber,
                   ArrayList<SocialMediaPlatform> listOfPlatforms)
      throws EstimatingException {
    super(name, followers, dateOfBirth, hasInstagramFollower, latestAppearanceEvent,
        isYouTuber, listOfPlatforms);
  }

}
