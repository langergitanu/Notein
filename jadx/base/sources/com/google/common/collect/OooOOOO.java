package com.google.common.collect;

import com.google.common.collect.TableCollectors;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooOOOO implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((TableCollectors.ImmutableTableCollectorState) obj).toTable();
    }
}
