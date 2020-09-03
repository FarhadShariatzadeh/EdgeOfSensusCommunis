package EdgeOfSensusCommunis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Represent an Artist Influencer. An artist influencer has a name, number of followers,
 * date of birth, if they has instagram followers or not, an award, last movie series,
 * gross income of last movie
 */

public class ArtistRoleModel extends CelebrityArtist{
  protected static final Double RATE_ARTIST_INCREASE = 1.3;
  protected String award;
  protected Integer lastMovieSeries;
  protected Double grossIncomeOfLastMovie;
  protected Double artistFollowerImpact;
  protected Double artistInfluencer;

  /**
   * Construct a new Artist object, based upon all of the provided input parameters.
   * @param name - Artist Influencer's name
   * @param followers - Artist Influencer's followers number
   * @param dateOfBirth - Artist Influencer's date of birth
   * @param hasInstagramFollower - Artist Influencer's has instagram followers or not
   * @param award - Artist Influencer's award
   * @param lastMovieSeries - Artist Influencer's last movies series
   * @param grossIncomeOfLastMovie - Artist Influencer's gross income of last movie
   * @param listOfPlatforms - Artist Influencer's list of social media platform
   * @throws EstimatingException - if the Artist Influencer's followers is not more
   * than 50000
   */

  public ArtistRoleModel(String name, Integer followers, LocalDate dateOfBirth,
                         Boolean hasInstagramFollower, String award, Integer lastMovieSeries,
                         Double grossIncomeOfLastMovie, ArrayList<SocialMediaPlatform> listOfPlatforms) throws EstimatingException {
    super(name, followers, dateOfBirth, hasInstagramFollower, listOfPlatforms);
    this.award = award;
    this.lastMovieSeries = lastMovieSeries;
    this.grossIncomeOfLastMovie = grossIncomeOfLastMovie;
  }

  /**
   * Return a new estimate Influence by multiplying the super.estimateInfluence
   * to RATE_ARTIST_INCREASE
   * @return  new estimate Influence by multiplying the super.estimateInfluence
   * to RATE_ARTIST_INCREASE
   * @throws EstimatingException if the age of Artist Influencer is less than 18
   * years old
   */
  @Override
  public Double estimateInfluence() throws EstimatingException {
    artistInfluencer = super.estimateInfluence();
    Double newArtistInfluencer = artistInfluencer * RATE_ARTIST_INCREASE;
    return newArtistInfluencer;
  }
  /**
   * Return the Artist Influencer's award
   * @return Artist Influencer's award
   */
  public String getAward() {
    return this.award;
  }

  /**
   * Return the Artist Influencer's last movies series
   * @return Artist Influencer's last movies series
   */
  public Integer getLastMovieSeries() {
    return this.lastMovieSeries;
  }

  /**
   * Return the Artist Influencer's gross income of last movie
   * @return Artist Influencer's gross income of last movie
   */
  public Double getGrossIncomeOfLastMovie() {
    return this.grossIncomeOfLastMovie;
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
    if (!(o instanceof ArtistRoleModel)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    ArtistRoleModel that = (ArtistRoleModel) o;
    return Objects.equals(getAward(), that.getAward()) &&
        Objects.equals(getLastMovieSeries(), that.getLastMovieSeries()) &&
        Objects.equals(getGrossIncomeOfLastMovie(), that.getGrossIncomeOfLastMovie()) &&
        Objects.equals(artistFollowerImpact, that.artistFollowerImpact) &&
        Objects.equals(artistInfluencer, that.artistInfluencer);
  }
  /**
   * Return the hash value of this object.
   * @return the hash value of this object.
   */
  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getAward(), getLastMovieSeries(), getGrossIncomeOfLastMovie(),
            artistFollowerImpact, artistInfluencer);
  }
}
