package com.google.common.reflect;

import com.google.common.base.Predicate;
import com.google.common.reflect.ClassPath;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO00o implements Predicate {
    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((ClassPath.ClassInfo) obj).isTopLevel();
    }
}
