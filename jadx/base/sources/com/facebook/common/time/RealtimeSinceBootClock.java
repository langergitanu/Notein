package com.facebook.common.time;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import o00o0oOO.InterfaceC25455OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public class RealtimeSinceBootClock implements InterfaceC25455OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final RealtimeSinceBootClock f67237OooO00o = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    public static RealtimeSinceBootClock get() {
        return f67237OooO00o;
    }

    @Override // o00o0oOO.InterfaceC25455OooO00o
    public final long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // o00o0oOO.InterfaceC25455OooO00o
    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
