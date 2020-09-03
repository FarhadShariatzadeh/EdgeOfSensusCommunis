package EdgeOfSensusCommunis;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents the common properties of Celebrity and Artist (abstract). An abstract CelebrityArtist
 * has a name, followers, date of birth, has an instagram followers, and age!
 */
public abstract class CelebrityArtist extends RoleModel {

  protected static final double INSTAGRAM_RAT_INCREASE = 1.2;
  protected static final double INSTANT_BASE_IMPACT = 10000;
  protected static final int AGE_OLD_RATE = 40;
  protected static final int AGE_YOUNG_RATE = 18;
  protected static final double AGE_RATE_DECREASE = 0.55;

  protected Integer age = ageOfInfluence();
  protected Boolean hasInstagramFollower;
  protected Double baseImpact;

  /**
   * Construct a new CelebrityArtist object, based upon all of the provided input parameters.
   * @param name - CelebrityArtist name
   * @param followers - CelebrityArtist followers
   * @param dateOfBirth - the celebrity artist date of birth
   * @param hasInstagramFollower celebrityArtist has instagram or not
   * @param listOfPlatforms - celebrityArtist list of social media platform
   */
  public CelebrityArtist(String name, Integer followers, LocalDate dateOfBirth,
      Boolean hasInstagramFollower, ArrayList<SocialMediaPlatform> listOfPlatforms) {
    super(name, followers, dateOfBirth, listOfPlatforms);
    this.hasInstagramFollower = hasInstagramFollower;
  }

  @Override
  public Double estimateInfluence() throws EstimatingException {
    baseImpact = this.followers / INSTANT_BASE_IMPACT;
    if (this.hasInstagramFollower == true){
      baseImpact = baseImpact * INSTAGRAM_RAT_INCREASE;
    }
    if (this.age > AGE_OLD_RATE) {
      baseImpact = baseImpact * AGE_RATE_DECREASE;
    }
    if (this.age < AGE_YOUNG_RATE) {
      throw new EstimatingException("The Influencer age is less than 18 years old!");
    }
    return baseImpact;
  }
  /**
   * Return of the age of celebrityArtist
   * @return age of the celebrityArtist
   */
  public Integer ageOfInfluence() {
    LocalDate now = LocalDate.now();
    Period periodBetweenDate = this.dateOfBirth.until(now);
    age = periodBetweenDate.getYears();
    return age;
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
    if (!(o instanceof CelebrityArtist)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    CelebrityArtist that = (CelebrityArtist) o;
    return Objects.equals(age, that.age) &&
        Objects.equals(hasInstagramFollower, that.hasInstagramFollower) &&
        Objects.equals(baseImpact, that.baseImpact);
  }
  /**
   * Return the hash value of this object.
   * @return the hash value of this object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), age, hasInstagramFollower, baseImpact);
  }
}
