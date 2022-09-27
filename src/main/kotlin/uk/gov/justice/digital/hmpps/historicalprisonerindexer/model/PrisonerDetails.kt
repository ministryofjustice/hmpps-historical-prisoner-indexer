package uk.gov.justice.digital.hmpps.historicalprisonerindexer.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "PRISONER_DETAILS", schema = "HPA")
data class PrisonerDetails(
  @Id
  @GeneratedValue(generator = "PRISONER_DETAILS_ID")
  @Column(name = "PRISONER_DETAILS_ID", nullable = false)
  val prisonerDetailsId: Long = 0,

  @Column(name = "PK_PRISON_NUMBER", nullable = false)
  val prisonNumber: String? = null,
  val personalDetails: String? = null,
  val addresses: String? = null,
  val aliases: String? = null,
  val category: String? = null,
  val courtHearings: String? = null,
  val hdcInfo: String? = null,
  val hdcRecall: String? = null,
  val movements: String? = null,
  val offences: String? = null,
  val offencesInCustody: String? = null,
  val sentencing: String? = null,
  val adjudications: String? = null
)
