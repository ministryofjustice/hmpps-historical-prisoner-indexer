package uk.gov.justice.digital.hmpps.historicalprisonerindexer.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "PRISONERS", schema = "HPA")
class Prisoner(
  @Id
  @GeneratedValue(generator = "PK_PRISONER")
  @Column(name = "PK_PRISONER", nullable = false)
  val pkPrisoner: Long = 0,

  val prisonNumber: String? = null,
  val personIdentifier: String? = null,
  val surname: String? = null,
  @Column(name = "FORENAME_1")
  val forename1: String? = null,
  @Column(name = "FORENAME_2")
  val forename2: String? = null,
  val birthDate: LocalDate? = null,
  val isAlias: String? = null,
  val sex: String? = null,
  val pncNumber: String? = null,
  val croNumber: String? = null,
  val hasHdc: Boolean? = null,
  val isLifer: Boolean? = null,
  val receptionDate: String? = null,
  val primarySurname: String? = null,
  @Column(name = "PRIMARY_FORENAME_1")
  val primaryForename1: String? = null,
  val primaryInitial: String? = null,
  @Column(name = "PRIMARY_FORENAME_2")
  val primaryForename2: String? = null,
  val primaryBirthDate: LocalDate? = null
)
