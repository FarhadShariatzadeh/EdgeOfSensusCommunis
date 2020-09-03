package EdgeOfSensusCommunis;

import java.time.LocalDate;

/**
 * This interface contains operations that all types of influencers in the systems estimates
 * the influence of the influencers.
 */
public interface IRoleModel {

  /**
   * return the name of the influencers
   * @return the name of the influencers
   */

  String getName();

  /**
   * Return the date of birth of the influencers
   * @return the date of birth of the influencers
   */
  LocalDate getDateOfBirth();

  /**
   * Return the followers of the influencers
   * @return the followers of the influencers
   */
  Integer getFollowers();

  /**
   * Return the estimate influence
   * @return the estimate influence
   * @throws EstimatingException throw exception when it need!
   */
  Double estimateInfluence() throws EstimatingException;
}
