package org.bbop.apollo.sequence

/**
 * Created by ndunn on 2/19/15.
 */
enum Strand {

    POSITIVE(1,"+")
    , NEGATIVE(-1,"-")

    Integer value
    String display

    public Strand(Integer value,String display) {
        this.value = value
        this.display = display
    }

    public getValue() {
        return this.value
    }

    String getDisplay() {
        return display
    }
}