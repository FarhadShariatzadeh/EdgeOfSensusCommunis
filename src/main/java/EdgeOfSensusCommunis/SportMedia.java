package EdgeOfSensusCommunis;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Represents the common properties of Athlete and StandUpComedian (abstract). An abstract
 * SportMedia has a name, followers, and date of birth
 */
public abstract class SportMedia extends RoleModel {

  protected static final double INSTANCE_BASE_NUMBER = 50000;

  /**
   * Construct a new SportMedia object, based upon all of the provided input parameters.
   * @param name - SportMedia's name
   * @param followers - SportMedia's followers
   * @param dateOfBirth - SportMedia's date of birth
   * @param listOfPlatforms - SportMedia's list of social media platform
   */
  public SportMedia(String name, Integer followers, LocalDate dateOfBirth,
                    ArrayList<SocialMediaPlatform> listOfPlatforms) {
    super(name, followers, dateOfBirth, listOfPlatforms);
  }

  /**
   *
   * @throws EstimatingException if the number of followers of Athletes
   * of StandUpComedian are less than INSTANCE_BASE_NUMBER
   */
  public void checkFollowers() throws EstimatingException {
    if (this.followers <= INSTANCE_BASE_NUMBER) {
      throw new EstimatingException("The followers are not enough!!");
    }
  }
  @Override
  public Double estimateInfluence() throws EstimatingException {
    return null;
  }
}
