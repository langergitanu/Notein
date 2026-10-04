package io.ktor.utils.p616io.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: io.ktor.utils.io.internal.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23994OooO0Oo {
    private volatile /* synthetic */ Object _closeWaitJob;
    private volatile /* synthetic */ int closed;

    static {
        AtomicReferenceFieldUpdater.newUpdater(C23994OooO0Oo.class, Object.class, "_closeWaitJob");
    }
}
