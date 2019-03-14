@file:Suppress("DEPRECATION")

package io.fotoapparat.parameter.camera.convert

import android.hardware.Camera
import io.fotoapparat.parameter.SceneMode

/**
 * Converts an anti banding mode code to a [SceneMode].
 *
 * @receiver Code of the anti banding mode as in [Camera.Parameters].
 * @return The [io.fotoapparat.Fotoapparat]'s camera [SceneMode]. `null` if camera code is not supported.
 */
fun String.toSceneMode(): SceneMode? =
        when (this) {
            Camera.Parameters.SCENE_MODE_AUTO           ->      SceneMode.Auto
            Camera.Parameters.SCENE_MODE_ACTION         ->      SceneMode.Action
            Camera.Parameters.SCENE_MODE_BARCODE        ->      SceneMode.Barcode
            Camera.Parameters.SCENE_MODE_BEACH          ->      SceneMode.Beach
            Camera.Parameters.SCENE_MODE_CANDLELIGHT    ->      SceneMode.Candlelight
            Camera.Parameters.SCENE_MODE_FIREWORKS      ->      SceneMode.Fireworks
            Camera.Parameters.SCENE_MODE_HDR            ->      SceneMode.HDR
            Camera.Parameters.SCENE_MODE_LANDSCAPE      ->      SceneMode.Landscape
            Camera.Parameters.SCENE_MODE_NIGHT          ->      SceneMode.Night
            Camera.Parameters.SCENE_MODE_NIGHT_PORTRAIT ->      SceneMode.NightPortrait
            Camera.Parameters.SCENE_MODE_PARTY          ->      SceneMode.Party
            Camera.Parameters.SCENE_MODE_PORTRAIT       ->      SceneMode.Portrait
            Camera.Parameters.SCENE_MODE_SNOW           ->      SceneMode.Snow
            Camera.Parameters.SCENE_MODE_SPORTS         ->      SceneMode.Sports
            Camera.Parameters.SCENE_MODE_STEADYPHOTO    ->      SceneMode.Steadyphoto
            Camera.Parameters.SCENE_MODE_SUNSET         ->      SceneMode.Sunset
            Camera.Parameters.SCENE_MODE_THEATRE        ->      SceneMode.Theatre
            else -> null
        }

/**
 * Converts a [SceneMode] to a SceneMode mode code as in [Camera.Parameters].
 *
 * @receiver The [io.fotoapparat.Fotoapparat]'s camera [SceneMode].
 * @return scene mode mode code as in [Camera.Parameters].
 */
fun SceneMode.toCode(): String =
        when (this) {
            SceneMode.Auto -> Camera.Parameters.SCENE_MODE_AUTO
            SceneMode.Action -> Camera.Parameters.SCENE_MODE_ACTION
            SceneMode.Barcode -> Camera.Parameters.SCENE_MODE_BARCODE
            SceneMode.Beach -> Camera.Parameters.SCENE_MODE_BEACH
            SceneMode.Candlelight -> Camera.Parameters.SCENE_MODE_CANDLELIGHT
            SceneMode.Fireworks -> Camera.Parameters.SCENE_MODE_FIREWORKS
            SceneMode.HDR -> Camera.Parameters.SCENE_MODE_HDR
            SceneMode.Landscape -> Camera.Parameters.SCENE_MODE_LANDSCAPE
            SceneMode.Night -> Camera.Parameters.SCENE_MODE_NIGHT
            SceneMode.NightPortrait -> Camera.Parameters.SCENE_MODE_NIGHT_PORTRAIT
            SceneMode.Party -> Camera.Parameters.SCENE_MODE_PARTY
            SceneMode.Portrait -> Camera.Parameters.SCENE_MODE_PORTRAIT
            SceneMode.Snow -> Camera.Parameters.SCENE_MODE_SNOW
            SceneMode.Sports -> Camera.Parameters.SCENE_MODE_SPORTS
            SceneMode.Steadyphoto -> Camera.Parameters.SCENE_MODE_STEADYPHOTO
            SceneMode.Sunset -> Camera.Parameters.SCENE_MODE_SUNSET
            SceneMode.Theatre -> Camera.Parameters.SCENE_MODE_THEATRE
        }