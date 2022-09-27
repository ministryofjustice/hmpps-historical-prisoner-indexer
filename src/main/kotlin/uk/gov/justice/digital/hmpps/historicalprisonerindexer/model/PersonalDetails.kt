package uk.gov.justice.digital.hmpps.historicalprisonerindexer.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "PERSONAL_DETAILS", schema = "HPA")
class PersonalDetails(
  @Id
  @GeneratedValue(generator = "PERSONAL_DETAILS_ID")
  @Column(name = "PERSONAL_DETAILS_ID", nullable = false)
  val personalDetailsId: Long = 0,
  @Column(name = "PK_PRISON_NUMBER", nullable = false)
  val prisonNumber: String? = null,
  val personIdentifier: String? = null,
  val pncNumber: String? = null,
  val croNumber: String? = null,
  val paroleNumber: String? = null,
  val surname: String? = null,
  @Column(name = "FORENAME_1")
  val forename1: String? = null,
  val initial: String? = null,
  @Column(name = "FORENAME_2")
  val forename2: String? = null,
  val sex: String? = null,
  val birthDate: LocalDate? = null,
  val ethnicity: String? = null,
  val birthCountry: String? = null,
  val nationality: String? = null,
  val religion: String? = null,
  val receptionDate: LocalDate? = null,
  val maritalStatus: String? = null

)
