package EdgeOfSensusCommunis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represent the common properties of a Influencer(abstract). An abstract Influencer has
 * a name, a followers, date of birth and a platform of social media.
 */
public abstract class RoleModel implements IRoleModel {

  protected String name;
  protected Integer followers;
  protected LocalDate dateOfBirth;
  protected ArrayList<SocialMediaPlatform> listOfPlatforms;

  /**
   * Construct a new Influencer object and initialize it with the given name, number of
   * followers and date of birth
   * @param name - the name of the influencer
   * @param followers - the number of influencer's followers
   * @param dateOfBirth - the influencer's date of birth
   * @param listOfPlatforms - the influencer's list of social media platform
   */
  public RoleModel(String name, Integer followers, LocalDate dateOfBirth,
                   ArrayList<SocialMediaPlatform> listOfPlatforms) {
    this.name = name;
    this.followers = followers;
    this.dateOfBirth = dateOfBirth;
    this.listOfPlatforms = listOfPlatforms;
  }

  /**
   * Return the influencer's name
   * @return the influencer's name
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * Return the influencer's followers
   * @return the influencer's followers
   */
  @Override
  public Integer getFollowers() {
    return this.followers;
  }

  /**
   * Return the influencer's date of birth
   * @return the influencer's date of birth
   */
  @Override
  public LocalDate getDateOfBirth() {
    return this.dateOfBirth;
  }

  /**
   * socialMediaPlatform of influencer
   */
  public enum SocialMediaPlatform {
    YOUTUBE,
    FACEBOOK,
    INSTAGRAM,
    TWITTER,
    SNAPCHAT,
    TIKTOK
  }
  public List<SocialMediaPlatform> getListOfPlatforms() {
    return this.listOfPlatforms;
  }

  /**
   * Return whether or not the given object is the same as this object
   *
   * @param o the object to be compared to for equality.
   * @return whether or not the given object is the same as this object.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RoleModel)) {
      return false;
    }
    RoleModel that = (RoleModel) o;
    return getName().equals(that.getName()) &&
        getFollowers().equals(that.getFollowers()) &&
        getDateOfBirth().equals(that.getDateOfBirth());
  }

  /**
   * Return the hash value of this object.
   *  @return the hash value of this object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(getName(), getFollowers(), getDateOfBirth());
  }

}
