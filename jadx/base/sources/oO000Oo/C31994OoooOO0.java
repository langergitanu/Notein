package oO000Oo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;
import oO0OOo0o.o00Oo0;

/* JADX INFO: renamed from: oO000Oo.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31994OoooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f114238OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f114239OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ImmutableSet f114240OooO0OO;

    public C31994OoooOO0(int i, long j, Set<o00Oo0.OooO00o> set) {
        this.f114238OooO00o = i;
        this.f114239OooO0O0 = j;
        this.f114240OooO0OO = ImmutableSet.copyOf((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31994OoooOO0.class != obj.getClass()) {
            return false;
        }
        C31994OoooOO0 c31994OoooOO0 = (C31994OoooOO0) obj;
        return this.f114238OooO00o == c31994OoooOO0.f114238OooO00o && this.f114239OooO0O0 == c31994OoooOO0.f114239OooO0O0 && Objects.equal(this.f114240OooO0OO, c31994OoooOO0.f114240OooO0OO);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f114238OooO00o), Long.valueOf(this.f114239OooO0O0), this.f114240OooO0OO);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("maxAttempts", this.f114238OooO00o).add("hedgingDelayNanos", this.f114239OooO0O0).add("nonFatalStatusCodes", this.f114240OooO0OO).toString();
    }
}
