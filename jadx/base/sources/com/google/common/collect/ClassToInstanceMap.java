package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@DoNotMock("Use ImmutableClassToInstanceMap or MutableClassToInstanceMap")
@ElementTypesAreNonnullByDefault
public interface ClassToInstanceMap<B> extends Map<Class<? extends B>, B> {
    <T extends B> T getInstance(Class<T> cls);

    <T extends B> T putInstance(Class<T> cls, @ParametricNullness T t);
}
