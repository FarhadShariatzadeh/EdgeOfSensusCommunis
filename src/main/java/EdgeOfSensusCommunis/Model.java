package EdgeOfSensusCommunis;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Represent a Model. A Model has a name, number of followers,
 * date of birth, if they has instagram followers or not, a latest appearance event
 * if they are youTuber or not and list of social media platform
 */
public class Model extends CelebrityRoleModel {

  /**
   * Construct a new Model object, based upon all of the provided input parameters.
   * @param name - Model's name
   * @param followers - Model's followers
   * @param dateOfBirth - Model's date of birth
   * @param hasInstagramFollower - Model's has instagram or not
   * @param latestAppearanceEvent - Model's latest appearance event
   * @param isYouTuber - Model's is YouTuber or not
   * @param listOfPlatforms - Model's list of social media platform
   * @throws EstimatingException - throw exception if the age of model is less than18
   */
  public Model(String name, Integer followers, LocalDate dateOfBirth,
      Boolean hasInstagramFollower, String latestAppearanceEvent, boolean isYouTuber,
      ArrayList<SocialMediaPlatform> listOfPlatforms)
      throws EstimatingException {
    super(name, followers, dateOfBirth, hasInstagramFollower, latestAppearanceEvent,
        isYouTuber, listOfPlatforms);
  }
}
