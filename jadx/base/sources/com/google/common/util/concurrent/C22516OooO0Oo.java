package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.common.util.concurrent.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22516OooO0Oo {
    public static /* synthetic */ boolean OooO00o(Unsafe unsafe, AbstractFuture abstractFuture, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractFuture, j, obj, obj2)) {
            if (unsafe.getObject(abstractFuture, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
