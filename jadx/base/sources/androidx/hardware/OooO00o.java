package androidx.hardware;

import androidx.core.location.LocationRequestCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicBoolean f65143OooO00o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final File f65144OooO0O0 = new File("/proc/self/fd/");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<oO0O000o.OooO00o<C32460OooOooO>> f65145OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicBoolean f65146OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList<C19020OooO00o> f65147OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000O0Oo.OooO00o f65148OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final androidx.core.widget.OooO00o f65149OooO0oO;

    /* JADX INFO: renamed from: androidx.hardware.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19020OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f65150OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f65151OooO0O0;

        public C19020OooO00o(int i, long j) {
            this.f65150OooO00o = i;
            this.f65151OooO0O0 = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19020OooO00o)) {
                return false;
            }
            C19020OooO00o c19020OooO00o = (C19020OooO00o) obj;
            return this.f65150OooO00o == c19020OooO00o.f65150OooO00o && this.f65151OooO0O0 == c19020OooO00o.f65151OooO0O0;
        }

        public final int hashCode() {
            return Long.hashCode(this.f65151OooO0O0) + (Integer.hashCode(this.f65150OooO00o) * 31);
        }

        public final String toString() {
            return "FdSignalPair(fd=" + this.f65150OooO00o + ", signalTime=" + this.f65151OooO0O0 + ')';
        }
    }

    public OooO00o() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f65146OooO0Oo = atomicBoolean;
        this.f65147OooO0o = new ArrayList<>();
        this.f65148OooO0o0 = new o000O0Oo.OooO00o("fdcleanup");
        atomicBoolean.set(false);
        this.f65149OooO0oO = new androidx.core.widget.OooO00o(this, 2);
    }

    public static long OooO00o(long j) {
        long jNanoTime = System.nanoTime();
        if (j == -1 || j == LocationRequestCompat.PASSIVE_INTERVAL || jNanoTime <= j) {
            return -1L;
        }
        return TimeUnit.NANOSECONDS.toMillis(jNanoTime - j);
    }
}
