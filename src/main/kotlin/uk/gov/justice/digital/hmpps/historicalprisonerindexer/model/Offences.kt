package uk.gov.justice.digital.hmpps.historicalprisonerindexer.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "OFFENCES", schema = "HPA")
data class Offences(
  @Id
  @GeneratedValue(generator = "PK_OFFENCES")
  @Column(name = "PK_OFFENCES", nullable = false)
  val offencesId: Long = 0,

  val prisonNumber: String? = null,
  val code: Int? = null,
  val date: LocalDate? = null,
  val establishment: String? = null
)
