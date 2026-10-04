package oO0ooO0O;

import java.util.Arrays;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0ooO0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34271OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f123050OooO00o;

    public C34271OooO0OO(int[] iArr) {
        this.f123050OooO00o = (int[]) iArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34271OooO0OO)) {
            return false;
        }
        return Arrays.equals(this.f123050OooO00o, ((C34271OooO0OO) obj).f123050OooO00o);
    }

    public final int hashCode() {
        return C34332OooO00o.OooO0o(this.f123050OooO00o);
    }
}
