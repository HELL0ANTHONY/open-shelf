package com.openshelf.user;

/**
 * Base class for all library users.
 *
 * <p>Extend this class to create concrete user types (Member, Librarian, Administrator). Each
 * subclass must declare its {@link UserRole}.
 */
public abstract class User {

  private final String id;
  private final String name;
  private final String email;

  /**
   * Creates a User.
   *
   * @param id unique identifier
   * @param name full name
   * @param email email address
   */
  protected User(String id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  /**
   * Returns the role this user has in the library system.
   *
   * @return the user's role
   */
  public abstract UserRole getRole();
}
