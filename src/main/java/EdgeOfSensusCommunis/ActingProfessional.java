package EdgeOfSensusCommunis;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Represents an ActingProfessional. An ActingProfessional has a name, followers,
 * date of birth, has instagram followers or not, an award, a last movies series,
 * and a gross income of last movies,
 * and a list of singer's social media platform
 */
public class ActingProfessional extends ArtistRoleModel {

  /**
   * Construct a new ActingProfessional object and initialize it with a name, followers,
   * date of birth, whether or not has Instagram followers, an award,
   * the number of last movies, number of gross income of last movie, and a list of
   * singer's social media platform
   * @param name - ActingProfessional's name
   * @param followers - ActingProfessional's followers
   * @param dateOfBirth - ActingProfessional's date of birth
   * @param hasInstagramFollower - ActingProfessional's has instagram followers or not
   * @param award - ActingProfessional's award
   * @param lastMovieSeries - ActingProfessional's last movie series
   * @param grossIncomeOfLastMovie - ActingProfessional's gross income of last movie
   * @param listOfPlatforms - ActingProfessional's list of social media platform
   * @throws EstimatingException - throw exception if age is less than 18
   */
  public ActingProfessional(String name, Integer followers, LocalDate dateOfBirth,
      Boolean hasInstagramFollower, String award, Integer lastMovieSeries,
      Double grossIncomeOfLastMovie, ArrayList<SocialMediaPlatform> listOfPlatforms) throws EstimatingException {
    super(name, followers, dateOfBirth, hasInstagramFollower, award, lastMovieSeries,
        grossIncomeOfLastMovie, listOfPlatforms);
  }


}
