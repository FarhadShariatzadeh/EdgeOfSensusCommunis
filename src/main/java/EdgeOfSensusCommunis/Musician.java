package EdgeOfSensusCommunis;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Represents a Musician. A Musician has a name, followers, date of birth, has an instagram followers
 * or not, an award, the number of last movies series, number of gross income of last movie,
 * and a list of Musician's social media platform
 */
public class Musician extends ArtistRoleModel {

  /**
   * Construct a new Musician object and initialize it with a name, followers, date of birth, whether
   * or not has Instagram followers, an award, the number of last movies, number of gross income
   * of last movie, and a list of Musician's social media platform
   * @param name - Musician's name
   * @param followers - Musician's followers
   * @param dateOfBirth - Musician's date of birth
   * @param hasInstagramFollower - Musician's has instagram followers
   * @param award - Musician's award
   * @param lastMovieSeries - Musician's last movie series
   * @param grossIncomeOfLastMovie - Musician's gross income of last movie
   * @param listOfPlatforms - Musician's list of platforms
   * @throws EstimatingException - Musician's exception if the age of Musician less than 18 years old
   */
  public Musician(String name, Integer followers, LocalDate dateOfBirth,
                  Boolean hasInstagramFollower, String award, Integer lastMovieSeries,
                  Double grossIncomeOfLastMovie, ArrayList<SocialMediaPlatform> listOfPlatforms)
      throws EstimatingException {
    super(name, followers, dateOfBirth, hasInstagramFollower, award, lastMovieSeries,
        grossIncomeOfLastMovie, listOfPlatforms);
  }
}
