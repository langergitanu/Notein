package o0OoO0o;

import OooOo.C20481OooOOoo;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.ink.brush.behavior.InterpolationNodeNative;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoO0o.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28654OooOO0o extends AbstractC28667OooOoO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final /* synthetic */ int f101545OooO = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AbstractC28667OooOoO f101546OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractC28667OooOoO f101547OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AbstractC28667OooOoO f101548OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f101549OooO0oo;

    /* JADX INFO: renamed from: o0OoO0o.OooOO0o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C20481OooOOoo<OooO00o> f101550OooO0O0 = new C20481OooOOoo<>((Object) null);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f101551OooO00o;

        static {
            new OooO00o(0, "LERP");
            new OooO00o(1, "INVERSE_LERP");
        }

        public OooO00o(int i, String str) {
            this.f101551OooO00o = str;
            C20481OooOOoo<OooO00o> c20481OooOOoo = f101550OooO0O0;
            if (c20481OooOOoo.OooO00o(i)) {
                throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate Interpolation value: ", ".").toString());
            }
            c20481OooOOoo.OooO0oO(i, this);
        }

        public final String toString() {
            return "Interpolation." + this.f101551OooO00o;
        }
    }

    public C28654OooOO0o() {
        throw null;
    }

    public C28654OooOO0o(o000OO00.OooO0o oooO0o, AbstractC28667OooOoO abstractC28667OooOoO, AbstractC28667OooOoO abstractC28667OooOoO2, AbstractC28667OooOoO abstractC28667OooOoO3) {
        super(oooO0o, C34429OooOOo0.OooOO0o(abstractC28667OooOoO, abstractC28667OooOoO2, abstractC28667OooOoO3));
        this.f101547OooO0o0 = abstractC28667OooOoO;
        this.f101546OooO0o = abstractC28667OooOoO2;
        this.f101548OooO0oO = abstractC28667OooOoO3;
        C20481OooOOoo<OooO00o> c20481OooOOoo = OooO00o.f101550OooO0O0;
        int interpolationInt = InterpolationNodeNative.f65362OooO00o.getInterpolationInt(OooO00o());
        OooO00o oooO00oOooO0O0 = OooO00o.f101550OooO0O0.OooO0O0(interpolationInt);
        if (oooO00oOooO0O0 == null) {
            throw new IllegalStateException(C21532OooOOo.OooO0OO(interpolationInt, "Invalid Interpolation value: ").toString());
        }
        this.f101549OooO0oo = oooO00oOooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C28654OooOO0o)) {
            if (obj == this) {
                return true;
            }
            C28654OooOO0o c28654OooOO0o = (C28654OooOO0o) obj;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101549OooO0oo, c28654OooOO0o.f101549OooO0oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101547OooO0o0, c28654OooOO0o.f101547OooO0o0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101546OooO0o, c28654OooOO0o.f101546OooO0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101548OooO0oO, c28654OooOO0o.f101548OooO0oO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f101548OooO0oO.hashCode() + ((this.f101546OooO0o.hashCode() + ((this.f101547OooO0o0.hashCode() + (this.f101549OooO0oo.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "InterpolationNode(" + this.f101549OooO0oo.f101551OooO00o + ", " + this.f101547OooO0o0 + ", " + this.f101546OooO0o + ", " + this.f101548OooO0oO + ")";
    }
}
