package o0OoO0o;

import OooOo.C20481OooOOoo;
import androidx.ink.brush.behavior.IntegralNodeNative;
import o0OoO0o.C28657OooOOOO;
import o0OoO0o.C28660OooOOo0;

/* JADX INFO: renamed from: o0OoO0o.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28653OooOO0O extends AbstractC28667OooOoO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C28660OooOOo0 f101542OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractC28667OooOoO f101543OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C28657OooOOOO f101544OooO0oO;

    public C28653OooOO0O() {
        throw null;
    }

    public C28653OooOO0O(o000OO00.OooO0o oooO0o, AbstractC28667OooOoO abstractC28667OooOoO) {
        super(oooO0o, com.facebook.soloader.OooOo.OooO0oO(abstractC28667OooOoO));
        this.f101543OooO0o0 = abstractC28667OooOoO;
        C20481OooOOoo<C28660OooOOo0> c20481OooOOoo = C28660OooOOo0.f101570OooO0OO;
        IntegralNodeNative integralNodeNative = IntegralNodeNative.f65361OooO00o;
        this.f101542OooO0o = C28660OooOOo0.OooO00o.OooO00o(integralNodeNative.getIntegrateOverInt(OooO00o()));
        C20481OooOOoo<C28657OooOOOO> c20481OooOOoo2 = C28657OooOOOO.f101557OooO0OO;
        this.f101544OooO0oO = C28657OooOOOO.OooO00o.OooO00o(integralNodeNative.getOutOfRangeBehaviorInt(OooO00o()));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C28653OooOO0O)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C28653OooOO0O c28653OooOO0O = (C28653OooOO0O) obj;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101542OooO0o, c28653OooOO0O.f101542OooO0o)) {
            return false;
        }
        IntegralNodeNative integralNodeNative = IntegralNodeNative.f65361OooO00o;
        return integralNodeNative.getValueRangeStart(OooO00o()) == integralNodeNative.getValueRangeStart(c28653OooOO0O.OooO00o()) && integralNodeNative.getValueRangeEnd(OooO00o()) == integralNodeNative.getValueRangeEnd(c28653OooOO0O.OooO00o()) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101544OooO0oO, c28653OooOO0O.f101544OooO0oO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101543OooO0o0, c28653OooOO0O.f101543OooO0o0);
    }

    public final int hashCode() {
        int iHashCode = this.f101542OooO0o.hashCode() * 31;
        IntegralNodeNative integralNodeNative = IntegralNodeNative.f65361OooO00o;
        return this.f101543OooO0o0.hashCode() + ((this.f101544OooO0oO.hashCode() + ((Float.hashCode(integralNodeNative.getValueRangeEnd(OooO00o())) + ((Float.hashCode(integralNodeNative.getValueRangeStart(OooO00o())) + iHashCode) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.f101542OooO0o.f101573OooO0O0;
        IntegralNodeNative integralNodeNative = IntegralNodeNative.f65361OooO00o;
        return "IntegralNode(" + str + ", " + integralNodeNative.getValueRangeStart(OooO00o()) + ", " + integralNodeNative.getValueRangeEnd(OooO00o()) + ", " + this.f101544OooO0oO.f101560OooO0O0 + ", " + this.f101543OooO0o0 + ")";
    }
}
