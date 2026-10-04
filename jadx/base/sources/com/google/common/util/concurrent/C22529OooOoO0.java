package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Striped;

/* JADX INFO: renamed from: com.google.common.util.concurrent.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22529OooOoO0 implements Supplier {
    @Override // com.google.common.base.Supplier
    public final Object get() {
        return new Striped.WeakSafeReadWriteLock();
    }
}
