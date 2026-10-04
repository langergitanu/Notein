package com.google.common.reflect;

import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0OO implements Predicate {
    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((Class) obj).isInterface();
    }
}
