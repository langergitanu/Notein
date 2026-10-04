package o00o0oOO;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o00o0oOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC25455OooO00o {
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    long nowNanos();
}
