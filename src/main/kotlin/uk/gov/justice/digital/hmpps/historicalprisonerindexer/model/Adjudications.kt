package uk.gov.justice.digital.hmpps.historicalprisonerindexer.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "ADJUDICATIONS", schema = "HPA")
data class Adjudications(
  @Id
  @GeneratedValue(generator = "PK_ADJUDICATION")
  @Column(name = "PK_ADJUDICATION", nullable = false)
  val pkAdjudication: Long = 0,

  val adjOffenceId: String? = null,
  val prisonNumber: String? = null,
  val date: LocalDate? = null,
  val charge: String? = null,
  val outcome: String? = null,
  val establishment: String? = null,
  val punishment: String? = null
)
