package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: com.google.common.util.concurrent.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22533OooOooO implements Supplier {
    @Override // com.google.common.base.Supplier
    public final Object get() {
        return new ReentrantReadWriteLock();
    }
}
