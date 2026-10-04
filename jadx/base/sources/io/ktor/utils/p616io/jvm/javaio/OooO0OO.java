package io.ktor.utils.p616io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO implements OooO0o<Thread> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0OO f80855OooO00o = new OooO0OO();

    @Override // io.ktor.utils.p616io.jvm.javaio.OooO0o
    public final void OooO00o(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LockSupport.parkNanos(j);
    }

    @Override // io.ktor.utils.p616io.jvm.javaio.OooO0o
    public final void OooO0O0(Thread thread) {
        Thread token = thread;
        OooOOO0.OooO0oO(token, "token");
        LockSupport.unpark(token);
    }
}
