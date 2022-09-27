package uk.gov.justice.digital.hmpps.historicalprisonerindexer.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "PRISONER_CATEGORY", schema = "HPA")
data class PrisonerCategory(
  @Id
  @GeneratedValue(generator = "PK_PRISONER_CATEGORY")
  @Column(name = "PK_PRISONER_CATEGORY", nullable = false)
  val prisonerCategoryId: Long = 0,

  val prisonNumber: String? = null,
  val date: LocalDate? = null,
  val category: String? = null
)
