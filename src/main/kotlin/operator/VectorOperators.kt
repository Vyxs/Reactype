package operator

import type.*

@get:JvmName("xVector")
val <T> TransformerChain<Vector<T>>.x: T
    get() = this().x

@get:JvmName("yVector")
val <T> TransformerChain<Vector<T>>.y: T
    get() = this().y

@get:JvmName("xVector3")
val <T> TransformerChain<Vector3<T>>.x: T
    get() = this().x

@get:JvmName("yVector3")
val <T> TransformerChain<Vector3<T>>.y: T
    get() = this().y

@get:JvmName("zVector3")
val <T> TransformerChain<Vector3<T>>.z: T
    get() = this().z

@get:JvmName("xMutableVector")
val <T> TransformerChain<MutableVector<T>>.x: T
    get() = this().x

@get:JvmName("yMutableVector")
val <T> TransformerChain<MutableVector<T>>.y: T
    get() = this().y

@get:JvmName("xMutableVector3")
val <T> TransformerChain<MutableVector3<T>>.x: T
    get() = this().x

@get:JvmName("yMutableVector3")
val <T> TransformerChain<MutableVector3<T>>.y: T
    get() = this().y

@get:JvmName("zMutableVector3")
val <T> TransformerChain<MutableVector3<T>>.z: T
    get() = this().z