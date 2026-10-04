package o0OoO0o;

import androidx.ink.brush.behavior.ConstantNodeNative;

/* JADX INFO: renamed from: o0OoO0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28643OooO0OO extends AbstractC28667OooOoO {
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C28643OooO0OO)) {
            return false;
        }
        ConstantNodeNative constantNodeNative = ConstantNodeNative.f65358OooO00o;
        return constantNodeNative.getValue(OooO00o()) == constantNodeNative.getValue(((C28643OooO0OO) obj).OooO00o());
    }

    public final int hashCode() {
        return Float.hashCode(ConstantNodeNative.f65358OooO00o.getValue(OooO00o()));
    }

    public final String toString() {
        return "ConstantNode(" + ConstantNodeNative.f65358OooO00o.getValue(OooO00o()) + ")";
    }
}
