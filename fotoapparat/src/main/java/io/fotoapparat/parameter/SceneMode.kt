package io.fotoapparat.parameter

/**
 * Anti Banding modes which camera can use.
 */
sealed class SceneMode : Parameter {

    /**
     * Auto adjust. This should be the default.
     */
    object Auto : SceneMode() {
        override fun toString(): String = "SceneMode.Auto"
    }

    /**
     * Anti Banding is set to 50Hz light frequency.
     */
    object Action : SceneMode() {
        override fun toString(): String = "SceneMode.Action"
    }

    /**
     * Anti Banding is set to 60Hz light frequency.
     */
    object Barcode : SceneMode() {
        override fun toString(): String = "SceneMode.Barcode"
    }

    /**
     * Anti Banding is not supported or ignored.
     */
    object Beach : SceneMode() {
        override fun toString(): String = "SceneMode.Beach"
    }

    object Candlelight : SceneMode() {
        override fun toString(): String = "SceneMode.Candlelight"
    }

    object Fireworks : SceneMode() {
        override fun toString(): String = "SceneMode.Fireworks"
    }

    object HDR : SceneMode() {
        override fun toString(): String = "SceneMode.HDR"
    }

    object Landscape : SceneMode() {
        override fun toString(): String = "SceneMode.Landscape"
    }

    object Night : SceneMode() {
        override fun toString(): String = "SceneMode.Night"
    }

    object NightPortrait : SceneMode() {
        override fun toString(): String = "SceneMode.NightPortrait"
    }

    object Party : SceneMode() {
        override fun toString(): String = "SceneMode.Party"
    }

    object Portrait : SceneMode() {
        override fun toString(): String = "SceneMode.Portrait"
    }

    object Snow : SceneMode() {
        override fun toString(): String = "SceneMode.Snow"
    }

    object Sports : SceneMode() {
        override fun toString(): String = "SceneMode.Sports"
    }

    object Steadyphoto : SceneMode() {
        override fun toString(): String = "SceneMode.Steadyphoto"
    }

    object Sunset : SceneMode() {
        override fun toString(): String = "SceneMode.Sunset"
    }

    object Theatre : SceneMode() {
        override fun toString(): String = "SceneMode.Theatre"
    }

}
