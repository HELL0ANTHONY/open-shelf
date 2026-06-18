package com.openshelf.book;

import java.time.LocalDate;

/** Represents a book author. */
public final class Author {

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
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.nationality = nationality;
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
