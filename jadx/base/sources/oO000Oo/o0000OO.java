package oO000Oo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;
import oO0OOo0o.o00Oo0;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f114517OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f114518OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f114519OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final double f114520OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ImmutableSet f114521OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Long f114522OooO0o0;

    public o0000OO(int i, long j, long j2, double d, Long l, Set<o00Oo0.OooO00o> set) {
        this.f114517OooO00o = i;
        this.f114518OooO0O0 = j;
        this.f114519OooO0OO = j2;
        this.f114520OooO0Oo = d;
        this.f114522OooO0o0 = l;
        this.f114521OooO0o = ImmutableSet.copyOf((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0000OO)) {
            return false;
        }
        o0000OO o0000oo2 = (o0000OO) obj;
        return this.f114517OooO00o == o0000oo2.f114517OooO00o && this.f114518OooO0O0 == o0000oo2.f114518OooO0O0 && this.f114519OooO0OO == o0000oo2.f114519OooO0OO && Double.compare(this.f114520OooO0Oo, o0000oo2.f114520OooO0Oo) == 0 && Objects.equal(this.f114522OooO0o0, o0000oo2.f114522OooO0o0) && Objects.equal(this.f114521OooO0o, o0000oo2.f114521OooO0o);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f114517OooO00o), Long.valueOf(this.f114518OooO0O0), Long.valueOf(this.f114519OooO0OO), Double.valueOf(this.f114520OooO0Oo), this.f114522OooO0o0, this.f114521OooO0o);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("maxAttempts", this.f114517OooO00o).add("initialBackoffNanos", this.f114518OooO0O0).add("maxBackoffNanos", this.f114519OooO0OO).add("backoffMultiplier", this.f114520OooO0Oo).add("perAttemptRecvTimeoutNanos", this.f114522OooO0o0).add("retryableStatusCodes", this.f114521OooO0o).toString();
    }
}
