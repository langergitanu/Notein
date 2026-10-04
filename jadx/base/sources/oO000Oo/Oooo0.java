package oO000Oo;

import com.google.common.base.Preconditions;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Random f114158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f114159OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public double f114160OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public double f114161OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f114162OooO0o0;

    public static final class OooO00o {
        public final Oooo0 OooO00o() {
            Oooo0 oooo0 = new Oooo0();
            oooo0.f114158OooO00o = new Random();
            long nanos = TimeUnit.SECONDS.toNanos(1L);
            oooo0.f114159OooO0O0 = TimeUnit.MINUTES.toNanos(2L);
            oooo0.f114160OooO0OO = 1.6d;
            oooo0.f114161OooO0Oo = 0.2d;
            oooo0.f114162OooO0o0 = nanos;
            return oooo0;
        }
    }

    public final long OooO00o() {
        long j = this.f114162OooO0o0;
        double d = j;
        this.f114162OooO0o0 = Math.min((long) (this.f114160OooO0OO * d), this.f114159OooO0O0);
        double d2 = this.f114161OooO0Oo;
        double d3 = (-d2) * d;
        double d4 = d2 * d;
        Preconditions.checkArgument(d4 >= d3);
        return j + ((long) ((this.f114158OooO00o.nextDouble() * (d4 - d3)) + d3));
    }
}
