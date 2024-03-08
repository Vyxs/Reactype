package builder

import type.MutableReactiveType

fun int(value: Int): MutableReactiveType<Int> = MutableReactiveType(value)