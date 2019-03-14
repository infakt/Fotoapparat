package io.fotoapparat.selector

import io.fotoapparat.parameter.SceneMode

typealias SceneModeSelector = Iterable<SceneMode>.() -> SceneMode?

/**
 * @return Selector function which provides an auto scene mode if available.
 * Otherwise provides `null`.
 */
fun autoSceneMode(): SceneModeSelector = single(SceneMode.Auto)

fun concreteSceneMode(mode: SceneMode): SceneModeSelector = single(mode)


