package oO000Oo;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Logger f113956OooO0OO = Logger.getLogger(OooO0o.class.getName());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f113957OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicLong f113958OooO0O0;

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f113959OooO00o;

        public OooO00o(long j) {
            this.f113959OooO00o = j;
        }
    }

    public OooO0o(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.f113958OooO0O0 = atomicLong;
        Preconditions.checkArgument(j > 0, "value must be positive");
        this.f113957OooO00o = "keepalive time nanos";
        atomicLong.set(j);
    }
}
