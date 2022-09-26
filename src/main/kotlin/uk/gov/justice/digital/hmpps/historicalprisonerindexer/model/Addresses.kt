package uk.gov.justice.digital.hmpps.historicalprisonerindexer.model

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "ADDRESSES")
data class Addresses(
  @Id
  @GeneratedValue(generator = "PK_ADDRESS")
  @Column(name = "PK_ADDRESS", nullable = false)
  val pkAddress: Long = 0,

  val originId: String? = null,
  val prisonNumber: String? = null,
  val street: String? = null,
  val town: String? = null,
  val county: String? = null,
  val postcode: String? = null,
  val type: String? = null,
  val person: String? = null
) : Serializable {
  override fun toString(): String {
    return "Addresses(pkAddress=$pkAddress, originId='$originId', prisonNumber='$prisonNumber', street='$street', town='$town', county='$county', postcode='$postcode', type='$type', person='$person')"
  }
}
