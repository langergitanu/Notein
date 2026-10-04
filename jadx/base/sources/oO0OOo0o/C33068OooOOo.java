package oO0OOo0o;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: oO0OOo0o.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33068OooOOo implements Comparable<C33068OooOOo> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooO00o f119573OooOoO = new OooO00o();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final long f119574OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final long f119575OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final long f119576OooOoo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final long f119577OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f119578OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile boolean f119579OooOoO0;

    /* JADX INFO: renamed from: oO0OOo0o.OooOOo$OooO00o */
    public static class OooO00o extends OooO0O0 {
    }

    /* JADX INFO: renamed from: oO0OOo0o.OooOOo$OooO0O0 */
    public static abstract class OooO0O0 {
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f119574OooOoOO = nanos;
        f119576OooOoo0 = -nanos;
        f119575OooOoo = TimeUnit.SECONDS.toNanos(1L);
    }

    public C33068OooOOo(long j) {
        OooO00o oooO00o = f119573OooOoO;
        long jNanoTime = System.nanoTime();
        this.f119578OooOo0o = oooO00o;
        long jMin = Math.min(f119574OooOoOO, Math.max(f119576OooOoo0, j));
        this.f119577OooOo = jNanoTime + jMin;
        this.f119579OooOoO0 = jMin <= 0;
    }

    public final void OooO00o(C33068OooOOo c33068OooOOo) {
        OooO00o oooO00o = c33068OooOOo.f119578OooOo0o;
        OooO00o oooO00o2 = this.f119578OooOo0o;
        if (oooO00o2 == oooO00o) {
            return;
        }
        throw new AssertionError("Tickers (" + oooO00o2 + " and " + c33068OooOOo.f119578OooOo0o + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean OooO0O0() {
        if (this.f119579OooOoO0) {
            return true;
        }
        long j = this.f119577OooOo;
        this.f119578OooOo0o.getClass();
        if (j - System.nanoTime() > 0) {
            return false;
        }
        this.f119579OooOoO0 = true;
        return true;
    }

    public final long OooO0OO() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f119578OooOo0o.getClass();
        long jNanoTime = System.nanoTime();
        if (!this.f119579OooOoO0 && this.f119577OooOo - jNanoTime <= 0) {
            this.f119579OooOoO0 = true;
        }
        return timeUnit.convert(this.f119577OooOo - jNanoTime, timeUnit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C33068OooOOo c33068OooOOo) {
        C33068OooOOo c33068OooOOo2 = c33068OooOOo;
        OooO00o(c33068OooOOo2);
        long j = this.f119577OooOo - c33068OooOOo2.f119577OooOo;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33068OooOOo)) {
            return false;
        }
        C33068OooOOo c33068OooOOo = (C33068OooOOo) obj;
        OooO00o oooO00o = this.f119578OooOo0o;
        if (oooO00o == null) {
            if (c33068OooOOo.f119578OooOo0o != null) {
                return false;
            }
        } else if (oooO00o != c33068OooOOo.f119578OooOo0o) {
            return false;
        }
        return this.f119577OooOo == c33068OooOOo.f119577OooOo;
    }

    public final int hashCode() {
        return Arrays.asList(this.f119578OooOo0o, Long.valueOf(this.f119577OooOo)).hashCode();
    }

    public final String toString() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jOooO0OO = OooO0OO();
        long jAbs = Math.abs(jOooO0OO);
        long j = f119575OooOoo;
        long j2 = jAbs / j;
        long jAbs2 = Math.abs(jOooO0OO) % j;
        StringBuilder sb = new StringBuilder();
        if (jOooO0OO < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        OooO00o oooO00o = f119573OooOoO;
        OooO00o oooO00o2 = this.f119578OooOo0o;
        if (oooO00o2 != oooO00o) {
            sb.append(" (ticker=" + oooO00o2 + ")");
        }
        return sb.toString();
    }
}
