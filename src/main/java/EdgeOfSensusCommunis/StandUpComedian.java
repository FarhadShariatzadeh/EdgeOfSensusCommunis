package EdgeOfSensusCommunis;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *  Represents A StandUpComedian. A StandUpComedian has a name, followers, and date of birth,
 *  a publishing company, a StandUpComedian award, if is Twitter or not, and a list of social
 *  media platform
 */
public class StandUpComedian extends SportMedia {

  private static final double INSTANT_BASE = 27500;
  private static final double FOLLOWER_TWITTER_RATE = 100000;
  private static final double INSTANT_INFLUENCE_BUMP = 1.25;


  private String publishingCompany;
  private String journalisticAward;
  private Boolean isTwitter;
  private Double estimateImpact;

  /**
   * Construct a new StandUpComedian object, based upon all of the provided input parameters.
   * @param name - StandUpComedian's name
   * @param followers - StandUpComedian's followers
   * @param dateOfBirth - StandUpComedian's date of birth
   * @param publishingCompany - StandUpComedian publishing company
   * @param journalisticAward - StandUpComedian's journalistic award
   * @param isTwitter - if Twitter or not
   * @param listOfPlatforms - a list of social media platform
   */
  public StandUpComedian(String name, Integer followers, LocalDate dateOfBirth,
                         String publishingCompany, String journalisticAward, Boolean isTwitter,
                         ArrayList<SocialMediaPlatform> listOfPlatforms) {
    super(name, followers, dateOfBirth, listOfPlatforms);
    this.publishingCompany = publishingCompany;
    this.journalisticAward = journalisticAward;
    this.isTwitter = isTwitter;
  }

  /**
   * Return the publishing company
   * @return the publishing company
   */
  public String getPublishingCompany() {
    return publishingCompany;
  }

  /**
   * Return the StandUpComedian award
   * @return the StandUpComedian award
   */
  public String getJournalisticAward() {
    return journalisticAward;
  }

  /**
   * Return a new estimate Influence of the StandUpComedian
   * @return a new estimate Influence of the StandUpComedian
   * @throws EstimatingException if the StandUpComedian's follower is less than
   * 50000
   */
  @Override
  public Double estimateInfluence() throws EstimatingException {
    estimateImpact = super.estimateInfluence();
    estimateImpact = this.followers / INSTANT_BASE;
    if (isTwitter == true) {
      if (this.followers > FOLLOWER_TWITTER_RATE) {
        estimateImpact = estimateImpact * INSTANT_INFLUENCE_BUMP;
      }
    }
    return estimateImpact;
  }
}
