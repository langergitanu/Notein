package com.google.common.collect;

import com.google.common.collect.ImmutableTable;
import java.util.function.BinaryOperator;

/* JADX INFO: renamed from: com.google.common.collect.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22505OooOOo implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((ImmutableTable.Builder) obj).combine((ImmutableTable.Builder) obj2);
    }
}
