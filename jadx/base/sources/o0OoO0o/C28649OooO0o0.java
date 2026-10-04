package o0OoO0o;

import OooOo.C20481OooOOoo;
import androidx.ink.brush.behavior.DampingNodeNative;
import o0OoO0o.C28660OooOOo0;

/* JADX INFO: renamed from: o0OoO0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28649OooO0o0 extends AbstractC28667OooOoO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C28660OooOOo0 f101534OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractC28667OooOoO f101535OooO0o0;

    public C28649OooO0o0(oO0O000o.OooO00o<Long> oooO00o, AbstractC28667OooOoO abstractC28667OooOoO) {
        super(oooO00o, com.facebook.soloader.OooOo.OooO0oO(abstractC28667OooOoO));
        this.f101535OooO0o0 = abstractC28667OooOoO;
        C20481OooOOoo<C28660OooOOo0> c20481OooOOoo = C28660OooOOo0.f101570OooO0OO;
        this.f101534OooO0o = C28660OooOOo0.OooO00o.OooO00o(DampingNodeNative.f65359OooO00o.getDampingSourceInt(OooO00o()));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C28649OooO0o0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C28649OooO0o0 c28649OooO0o0 = (C28649OooO0o0) obj;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101534OooO0o, c28649OooO0o0.f101534OooO0o)) {
            return false;
        }
        DampingNodeNative dampingNodeNative = DampingNodeNative.f65359OooO00o;
        return dampingNodeNative.getDampingGap(OooO00o()) == dampingNodeNative.getDampingGap(c28649OooO0o0.OooO00o()) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101535OooO0o0, c28649OooO0o0.f101535OooO0o0);
    }

    public final int hashCode() {
        return this.f101535OooO0o0.hashCode() + ((Float.hashCode(DampingNodeNative.f65359OooO00o.getDampingGap(OooO00o())) + (this.f101534OooO0o.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DampingNode(" + this.f101534OooO0o.f101573OooO0O0 + ", " + DampingNodeNative.f65359OooO00o.getDampingGap(OooO00o()) + ", " + this.f101535OooO0o0 + ")";
    }
}
