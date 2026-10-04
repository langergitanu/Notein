package o0OoO0o;

import OooOo.C20481OooOOoo;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.ink.brush.behavior.PolarTargetNodeNative;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoO0o.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28658OooOOOo extends AbstractC28662OooOo {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f101561OooO0oo = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AbstractC28667OooOoO f101562OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractC28667OooOoO f101563OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f101564OooO0oO;

    /* JADX INFO: renamed from: o0OoO0o.OooOOOo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C20481OooOOoo<OooO00o> f101565OooO0OO = new C20481OooOOoo<>((Object) null);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f101566OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f101567OooO0O0;

        static {
            new OooO00o(0, "POSITION_OFFSET_ABSOLUTE_IN_RADIANS_AND_MULTIPLES_OF_BRUSH_SIZE");
            new OooO00o(1, "POSITION_OFFSET_RELATIVE_IN_RADIANS_AND_MULTIPLES_OF_BRUSH_SIZE");
        }

        public OooO00o(int i, String str) {
            this.f101566OooO00o = i;
            this.f101567OooO0O0 = str;
            C20481OooOOoo<OooO00o> c20481OooOOoo = f101565OooO0OO;
            if (c20481OooOOoo.OooO00o(i)) {
                throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate PolarTarget value: ", ".").toString());
            }
            c20481OooOOoo.OooO0oO(i, this);
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof OooO00o)) {
                return false;
            }
            return this.f101566OooO00o == ((OooO00o) obj).f101566OooO00o;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f101566OooO00o);
        }

        public final String toString() {
            return "PolarTarget." + this.f101567OooO0O0;
        }
    }

    public C28658OooOOOo() {
        throw null;
    }

    public C28658OooOOOo(o000OO00.OooO0o oooO0o, AbstractC28667OooOoO abstractC28667OooOoO, AbstractC28667OooOoO abstractC28667OooOoO2) {
        super(oooO0o, C34429OooOOo0.OooOO0o(abstractC28667OooOoO, abstractC28667OooOoO2));
        this.f101563OooO0o0 = abstractC28667OooOoO;
        this.f101562OooO0o = abstractC28667OooOoO2;
        C20481OooOOoo<OooO00o> c20481OooOOoo = OooO00o.f101565OooO0OO;
        int targetInt = PolarTargetNodeNative.f65365OooO00o.getTargetInt(OooO00o());
        OooO00o oooO00oOooO0O0 = OooO00o.f101565OooO0OO.OooO0O0(targetInt);
        if (oooO00oOooO0O0 == null) {
            throw new IllegalStateException(C21532OooOOo.OooO0OO(targetInt, "Invalid PolarTarget value: ").toString());
        }
        this.f101564OooO0oO = oooO00oOooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C28658OooOOOo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C28658OooOOOo c28658OooOOOo = (C28658OooOOOo) obj;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101564OooO0oO, c28658OooOOOo.f101564OooO0oO)) {
            return false;
        }
        PolarTargetNodeNative polarTargetNodeNative = PolarTargetNodeNative.f65365OooO00o;
        return polarTargetNodeNative.getAngleRangeStart(OooO00o()) == polarTargetNodeNative.getAngleRangeStart(c28658OooOOOo.OooO00o()) && polarTargetNodeNative.getAngleRangeEnd(OooO00o()) == polarTargetNodeNative.getAngleRangeEnd(c28658OooOOOo.OooO00o()) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101563OooO0o0, c28658OooOOOo.f101563OooO0o0) && polarTargetNodeNative.getMagnitudeRangeStart(OooO00o()) == polarTargetNodeNative.getMagnitudeRangeStart(c28658OooOOOo.OooO00o()) && polarTargetNodeNative.getMagnitudeRangeEnd(OooO00o()) == polarTargetNodeNative.getMagnitudeRangeEnd(c28658OooOOOo.OooO00o()) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101562OooO0o, c28658OooOOOo.f101562OooO0o);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f101564OooO0oO.f101566OooO00o) * 31;
        PolarTargetNodeNative polarTargetNodeNative = PolarTargetNodeNative.f65365OooO00o;
        return this.f101562OooO0o.hashCode() + ((Float.hashCode(polarTargetNodeNative.getMagnitudeRangeEnd(OooO00o())) + ((Float.hashCode(polarTargetNodeNative.getMagnitudeRangeStart(OooO00o())) + ((this.f101563OooO0o0.hashCode() + ((Float.hashCode(polarTargetNodeNative.getAngleRangeEnd(OooO00o())) + ((Float.hashCode(polarTargetNodeNative.getAngleRangeStart(OooO00o())) + iHashCode) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.f101564OooO0oO.f101567OooO0O0;
        PolarTargetNodeNative polarTargetNodeNative = PolarTargetNodeNative.f65365OooO00o;
        return "PolarTargetNode(" + str + ", " + polarTargetNodeNative.getAngleRangeStart(OooO00o()) + ", " + polarTargetNodeNative.getAngleRangeEnd(OooO00o()) + ", " + this.f101563OooO0o0 + ", " + polarTargetNodeNative.getMagnitudeRangeStart(OooO00o()) + ", " + polarTargetNodeNative.getMagnitudeRangeEnd(OooO00o()) + ", " + this.f101562OooO0o + ")";
    }
}
