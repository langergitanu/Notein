package io.ktor.utils.p616io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C24004OooO0oo implements OooO0o<Thread> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C24004OooO0oo f80866OooO00o = new C24004OooO0oo();

    @Override // io.ktor.utils.p616io.jvm.javaio.OooO0o
    public final void OooO00o(long j) {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    @Override // io.ktor.utils.p616io.jvm.javaio.OooO0o
    public final void OooO0O0(Thread thread) {
        Thread token = thread;
        OooOOO0.OooO0oO(token, "token");
        LockSupport.unpark(token);
    }
}
