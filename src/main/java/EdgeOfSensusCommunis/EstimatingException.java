package EdgeOfSensusCommunis;

/**
 * /* Represents an exception dedicated towards an age of artist and celebrity less that 18 years old.
 */
public class EstimatingException extends Exception{
  /**
   * Construct a new ImpactEstimationException object and initialize it with the given message.
   * @param message the message of this age less than 18 years old
   */
  public EstimatingException(String message) {
    super(message);
  }

}
