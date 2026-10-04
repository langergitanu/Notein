package o0OoO0o;

import OooOo.C20481OooOOoo;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.ink.brush.behavior.TargetNodeNative;

/* JADX INFO: renamed from: o0OoO0o.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28666OooOo0o extends AbstractC28662OooOo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f101592OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractC28667OooOoO f101593OooO0o0;

    /* JADX INFO: renamed from: o0OoO0o.OooOo0o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C20481OooOOoo<OooO00o> f101594OooO0OO = new C20481OooOOoo<>((Object) null);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f101595OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f101596OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f101597OooO0O0;

        static {
            new OooO00o(0, "WIDTH_MULTIPLIER");
            new OooO00o(1, "HEIGHT_MULTIPLIER");
            f101595OooO0Oo = new OooO00o(2, "SIZE_MULTIPLIER");
            new OooO00o(3, "SLANT_OFFSET_IN_RADIANS");
            new OooO00o(4, "PINCH_OFFSET");
            new OooO00o(5, "ROTATION_OFFSET_IN_RADIANS");
            new OooO00o(6, "CORNER_ROUNDING_OFFSET");
            new OooO00o(7, "POSITION_OFFSET_X_IN_MULTIPLES_OF_BRUSH_SIZE");
            new OooO00o(8, "POSITION_OFFSET_Y_IN_MULTIPLES_OF_BRUSH_SIZE");
            new OooO00o(9, "POSITION_OFFSET_FORWARD_IN_MULTIPLES_OF_BRUSH_SIZE");
            new OooO00o(10, "POSITION_OFFSET_LATERAL_IN_MULTIPLES_OF_BRUSH_SIZE");
            new OooO00o(11, "TEXTURE_ANIMATION_PROGRESS_OFFSET");
            new OooO00o(12, "HUE_OFFSET_IN_RADIANS");
            new OooO00o(13, "SATURATION_MULTIPLIER");
            new OooO00o(14, "LUMINOSITY_OFFSET");
            new OooO00o(15, "OPACITY_MULTIPLIER");
        }

        public OooO00o(int i, String str) {
            this.f101596OooO00o = i;
            this.f101597OooO0O0 = str;
            C20481OooOOoo<OooO00o> c20481OooOOoo = f101594OooO0OO;
            if (c20481OooOOoo.OooO00o(i)) {
                throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate Target value: ", ".").toString());
            }
            c20481OooOOoo.OooO0oO(i, this);
        }

        public final String toString() {
            return "Target." + this.f101597OooO0O0;
        }
    }

    public C28666OooOo0o(oO0O000o.OooO00o<Long> oooO00o, AbstractC28667OooOoO abstractC28667OooOoO) {
        super(oooO00o, com.facebook.soloader.OooOo.OooO0oO(abstractC28667OooOoO));
        this.f101593OooO0o0 = abstractC28667OooOoO;
        C20481OooOOoo<OooO00o> c20481OooOOoo = OooO00o.f101594OooO0OO;
        int targetInt = TargetNodeNative.f65368OooO00o.getTargetInt(OooO00o());
        OooO00o oooO00oOooO0O0 = OooO00o.f101594OooO0OO.OooO0O0(targetInt);
        if (oooO00oOooO0O0 == null) {
            throw new IllegalStateException(C21532OooOOo.OooO0OO(targetInt, "Invalid Target value: ").toString());
        }
        this.f101592OooO0o = oooO00oOooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C28666OooOo0o)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C28666OooOo0o c28666OooOo0o = (C28666OooOo0o) obj;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101592OooO0o, c28666OooOo0o.f101592OooO0o)) {
            return false;
        }
        TargetNodeNative targetNodeNative = TargetNodeNative.f65368OooO00o;
        return targetNodeNative.getModifierRangeStart(OooO00o()) == targetNodeNative.getModifierRangeStart(c28666OooOo0o.OooO00o()) && targetNodeNative.getModifierRangeEnd(OooO00o()) == targetNodeNative.getModifierRangeEnd(c28666OooOo0o.OooO00o()) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101593OooO0o0, c28666OooOo0o.f101593OooO0o0);
    }

    public final int hashCode() {
        int iHashCode = this.f101592OooO0o.hashCode() * 31;
        TargetNodeNative targetNodeNative = TargetNodeNative.f65368OooO00o;
        return this.f101593OooO0o0.hashCode() + ((Float.hashCode(targetNodeNative.getModifierRangeEnd(OooO00o())) + ((Float.hashCode(targetNodeNative.getModifierRangeStart(OooO00o())) + iHashCode) * 31)) * 31);
    }

    public final String toString() {
        String str = this.f101592OooO0o.f101597OooO0O0;
        TargetNodeNative targetNodeNative = TargetNodeNative.f65368OooO00o;
        return "TargetNode(" + str + ", " + targetNodeNative.getModifierRangeStart(OooO00o()) + ", " + targetNodeNative.getModifierRangeEnd(OooO00o()) + ", " + this.f101593OooO0o0 + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28666OooOo0o(final OooO00o target, final float f, final float f2, AbstractC28667OooOoO abstractC28667OooOoO) {
        this(new oO0O000o.OooO00o() { // from class: o0OoO0o.OooOo0O
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return Long.valueOf(TargetNodeNative.f65368OooO00o.create(target.f101596OooO00o, f, f2));
            }
        }, abstractC28667OooOoO);
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
    }
}
