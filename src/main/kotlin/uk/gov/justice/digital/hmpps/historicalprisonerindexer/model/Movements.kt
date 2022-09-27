package uk.gov.justice.digital.hmpps.historicalprisonerindexer.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "MOVEMENTS", schema = "HPA")
data class Movements(
  @Id
  @GeneratedValue(generator = "PK_MOVEMENT")
  @Column(name = "PK_MOVEMENT", nullable = false)
  val movementId: Long = 0,

  val prisonNumber: String? = null,
  val date: LocalDate? = null,
  val time: String? = null,
  val type: String? = null,
  val movement: String? = null,
  val establishment: String? = null
)
