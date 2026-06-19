package com.openshelf.book;

import com.openshelf.shared.Preconditions;
import java.time.LocalDate;

/** Represents a book author. */
public final class Author {

  /** The maximum length for an author's first name. */
  public static final int MAX_FIRST_NAME_LENGTH = 50;

  /** The maximum length for an author's last name. */
  public static final int MAX_LAST_NAME_LENGTH = 50;

  private final String firstName;
  private final String lastName;
  private final LocalDate birthDate;
  private final String nationality;
  private final String biography;

  /**
   * Creates an Author.
   *
   * @param firstName author's first name
   * @param lastName author's last name
   * @param birthDate author's date of birth
   * @param nationality author's nationality
   * @param biography short biographical description
   */
  public Author(
      String firstName,
      String lastName,
      LocalDate birthDate,
      String nationality,
      String biography) {

    Preconditions.requireNotBlank(firstName, "Author's first name cannot be null or blank");
    Preconditions.checkArgument(
        firstName.length() <= MAX_FIRST_NAME_LENGTH,
        "Author's first name cannot exceed " + MAX_FIRST_NAME_LENGTH + " characters");
    this.firstName = firstName;

    Preconditions.requireNotBlank(lastName, "Author's last name cannot be null or blank");
    Preconditions.checkArgument(
        lastName.length() <= MAX_LAST_NAME_LENGTH,
        "Author's last name cannot exceed " + MAX_LAST_NAME_LENGTH + " characters");
    this.lastName = lastName;

    Preconditions.checkNotNull(birthDate, "Author's birth date cannot be null");
    Preconditions.checkArgument(
        birthDate.isBefore(LocalDate.now()), "Author's birth date must be in the past");
    this.birthDate = birthDate;

    Preconditions.requireNotBlank(nationality, "Author's nationality cannot be null or blank");
    this.nationality = nationality;

    Preconditions.checkNotNull(biography, "Author's biography cannot be null");
    this.biography = biography;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public String getNationality() {
    return nationality;
  }

  public String getBiography() {
    return biography;
  }

  /**
   * Returns the author's full name.
   *
   * @return firstName + " " + lastName
   */
  public String getFullName() {
    return firstName + " " + lastName;
  }
}
