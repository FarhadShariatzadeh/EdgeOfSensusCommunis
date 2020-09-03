package EdgeOfSensusCommunis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Represent a Celebrity Influencer. A Celebrity influencer has a name, number of followers,
 * date of birth, if they has instagram followers or not, a latest appearance event
 * celebrity follower impact and if they are youTuber or not
 */
public class CelebrityRoleModel extends CelebrityArtist {

  protected static final double INSTANT_RATE_YOUTUBE = 0.9;

  protected String latestAppearanceEvent;
  protected Double celebrityFollowerImpact;
  protected Boolean isYouTuber;
  protected Double superImpact;

  /**
   * Construct a new Celebrity object, based upon all of the provided input parameters.
   * @param name - Celebrity's name
   * @param followers - Celebrity's followers
   * @param dateOfBirth - Celebrity's date of birth
   * @param hasInstagramFollower - Celebrity's has instagram followers or not
   * @param latestAppearanceEvent - Celebrity's latest appearance event
   * @param isYouTuber - Celebrity's is youTuber or not
   * @param listOfPlatforms - Celebrity's list of social media platform
   * @throws EstimatingException - if Celebrity's followers is not more than 50000 throws
   * Impact Estimation Exception
   */

  public CelebrityRoleModel(String name, Integer followers, LocalDate dateOfBirth,
                            boolean hasInstagramFollower, String latestAppearanceEvent, Boolean isYouTuber,
                            ArrayList<SocialMediaPlatform> listOfPlatforms)
      throws EstimatingException {
    super(name, followers, dateOfBirth, hasInstagramFollower, listOfPlatforms);
    this.latestAppearanceEvent = latestAppearanceEvent;
    this.isYouTuber = isYouTuber;
  }

  /**
   * Return true of false if the celebrity is YouTuber or not
   * @return true of false if the celebrity is YouTuber or not
   */
  public Boolean isYouTuber() {
    return this.isYouTuber;
  }

  /**
   * Return the latest appearance event
   * @return the latest appearance event
   */
  public String getLatestAppearanceEvent() {
    return this.latestAppearanceEvent;
  }

  @Override
  public Double estimateInfluence() throws EstimatingException {
    superImpact = super.estimateInfluence();
    if (isYouTuber == true) {
      superImpact = superImpact * INSTANT_RATE_YOUTUBE;
    }
    return superImpact;
  }

  /**
   * Return whether or not the given object is the same as this object.
   * @param o the object to be compared to for equality.
   * @return whether or not the given object is the same as this object.
   */

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof CelebrityRoleModel)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    CelebrityRoleModel that = (CelebrityRoleModel) o;
    return Objects.equals(getLatestAppearanceEvent(), that.getLatestAppearanceEvent()) &&
        Objects.equals(celebrityFollowerImpact, that.celebrityFollowerImpact) &&
        Objects.equals(isYouTuber, that.isYouTuber) &&
        Objects.equals(superImpact, that.superImpact);
  }

  /**
   * Return the hash value of this object.
   * @return the hash value of this object.
   */
  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getLatestAppearanceEvent(), celebrityFollowerImpact, isYouTuber,
            superImpact);
  }

}
