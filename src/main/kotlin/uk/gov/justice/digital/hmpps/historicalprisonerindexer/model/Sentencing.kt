package uk.gov.justice.digital.hmpps.historicalprisonerindexer.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "SENTENCING", schema = "HPA")
data class Sentencing(
  @Id
  @GeneratedValue(generator = "PK_SENTENCING")
  @Column(name = "PK_SENTENCING", nullable = false)
  val sentencingId: Long = 0,

  val prisonNumber: String? = null,
  val length: Long? = null,
  val changeDate: LocalDate? = null,
  @Column(name = "SED")
  val SED: LocalDate? = null,
  @Column(name = "PED")
  val PED: LocalDate? = null,
  @Column(name = "NPD")
  val NPD: LocalDate? = null,
  @Column(name = "LED")
  val LED: LocalDate? = null,
  @Column(name = "CRD")
  val CRD: LocalDate? = null,
  @Column(name = "HDCAD")
  val HDCAD: LocalDate? = null,
  @Column(name = "HDCED")
  val HDCED: LocalDate? = null
)
