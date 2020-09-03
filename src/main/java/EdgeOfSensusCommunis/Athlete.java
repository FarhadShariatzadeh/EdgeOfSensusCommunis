package EdgeOfSensusCommunis;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Represents an Athlete. An Athlete has a name, followers, date of birth,
 * a sport, a professional league, and a number of last season earning,
 * and a list of singer's social media platform
 */

public class Athlete extends SportMedia {

  private static final double INSTANT_BASE_ATHLETE = 25000;

  private String sport;
  private String professionalLeague;
  private Double lastSeasonEarning;
  private Double impactEstimate;

  /**
   * Construct a new object and initialize it with a name, followers, date of birth, sport
   * professional league, last season earning, list of platforms
   * @param name - Athlete's name
   * @param followers - Athlete's followers
   * @param dateOfBirth - Athlete's date of birth
   * @param sport - Athlete's sport
   * @param professionalLeague - Athlete's professional league
   * @param lastSeasonEarning - Athlete's professional last season earning
   * @param listOfPlatforms - Athlete's list of social media platform
   */

  public Athlete(String name, Integer followers, LocalDate dateOfBirth,
                 String sport, String professionalLeague, Double lastSeasonEarning,
                 ArrayList<SocialMediaPlatform> listOfPlatforms) {
    super(name, followers, dateOfBirth, listOfPlatforms);
    this.sport = sport;
    this.professionalLeague = professionalLeague;
    this.lastSeasonEarning = lastSeasonEarning;
  }

  /**
   * Return the Athlete's sport
   * @return  the Athlete's sport
   */
  public String getSport() {
    return sport;
  }

  /**
   * Return the professional league
   * @return the professional league
   */
  public String getProfessionalLeague() {
    return professionalLeague;
  }

  /**
   * Return the last season earning
   * @return the last season earning
   */
  public Double getLastSeasonEarning() {
    return lastSeasonEarning;
  }

  /**
   * Return a new estimateInfluence of Professional Athlete
   * @return a new estimateInfluence of Professional Athlete
   * @throws EstimatingException if the number of the followers is less than 50000
   */
  @Override
  public Double estimateInfluence() throws EstimatingException {
    impactEstimate = super.estimateInfluence();
    impactEstimate = this.followers / INSTANT_BASE_ATHLETE;
    return impactEstimate;
  }
}
