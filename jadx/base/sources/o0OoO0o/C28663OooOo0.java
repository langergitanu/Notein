package o0OoO0o;

import OooOo.C20481OooOOoo;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.ink.brush.behavior.SourceNodeNative;
import o0OoO0o.C28657OooOOOO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OoO0o.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28663OooOo0 extends AbstractC28667OooOoO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C28657OooOOOO f101576OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f101577OooO0o0;

    /* JADX INFO: renamed from: o0OoO0o.OooOo0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C20481OooOOoo<OooO00o> f101578OooO0OO = new C20481OooOOoo<>((Object) null);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f101579OooO0Oo = new OooO00o(0, "NORMALIZED_PRESSURE");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final OooO00o f101580OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO00o f101581OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final OooO00o f101582OooO0oO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f101583OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f101584OooO0O0;

        static {
            new OooO00o(1, "TILT_IN_RADIANS");
            new OooO00o(2, "TILT_X_IN_RADIANS");
            new OooO00o(3, "TILT_Y_IN_RADIANS");
            new OooO00o(4, "ORIENTATION_IN_RADIANS");
            new OooO00o(5, "ORIENTATION_ABOUT_ZERO_IN_RADIANS");
            new OooO00o(6, "SPEED_IN_MULTIPLES_OF_BRUSH_SIZE_PER_SECOND");
            new OooO00o(7, "VELOCITY_X_IN_MULTIPLES_OF_BRUSH_SIZE_PER_SECOND");
            new OooO00o(8, "VELOCITY_Y_IN_MULTIPLES_OF_BRUSH_SIZE_PER_SECOND");
            new OooO00o(9, "DIRECTION_IN_RADIANS");
            new OooO00o(10, "DIRECTION_ABOUT_ZERO_IN_RADIANS");
            new OooO00o(11, "NORMALIZED_DIRECTION_X");
            f101581OooO0o0 = new OooO00o(12, "NORMALIZED_DIRECTION_Y");
            new OooO00o(13, "DISTANCE_TRAVELED_IN_MULTIPLES_OF_BRUSH_SIZE");
            new OooO00o(14, "TIME_OF_INPUT_IN_SECONDS");
            new OooO00o(15, "TIME_FROM_INPUT_TO_STROKE_END_IN_SECONDS");
            new OooO00o(16, "PREDICTED_DISTANCE_TRAVELED_IN_MULTIPLES_OF_BRUSH_SIZE");
            new OooO00o(17, "PREDICTED_TIME_ELAPSED_IN_SECONDS");
            new OooO00o(18, "DISTANCE_REMAINING_IN_MULTIPLES_OF_BRUSH_SIZE");
            new OooO00o(19, "TIME_SINCE_INPUT_IN_SECONDS");
            new OooO00o(20, "TIME_SINCE_STROKE_END_IN_SECONDS");
            new OooO00o(21, "ACCELERATION_IN_MULTIPLES_OF_BRUSH_SIZE_PER_SECOND_SQUARED");
            new OooO00o(22, "ACCELERATION_X_IN_MULTIPLES_OF_BRUSH_SIZE_PER_SECOND_SQUARED");
            new OooO00o(23, "ACCELERATION_Y_IN_MULTIPLES_OF_BRUSH_SIZE_PER_SECOND_SQUARED");
            new OooO00o(24, "ACCELERATION_FORWARD_IN_MULTIPLES_OF_BRUSH_SIZE_PER_SECOND_SQUARED");
            new OooO00o(25, "ACCELERATION_LATERAL_IN_MULTIPLES_OF_BRUSH_SIZE_PER_SECOND_SQUARED");
            f101580OooO0o = new OooO00o(26, "SPEED_IN_CENTIMETERS_PER_SECOND");
            new OooO00o(27, "VELOCITY_X_IN_CENTIMETERS_PER_SECOND");
            new OooO00o(28, "VELOCITY_Y_IN_CENTIMETERS_PER_SECOND");
            new OooO00o(29, "DISTANCE_TRAVELED_IN_CENTIMETERS");
            new OooO00o(30, "PREDICTED_DISTANCE_TRAVELED_IN_CENTIMETERS");
            new OooO00o(31, "ACCELERATION_IN_CENTIMETERS_PER_SECOND_SQUARED");
            new OooO00o(32, "ACCELERATION_X_IN_CENTIMETERS_PER_SECOND_SQUARED");
            new OooO00o(33, "ACCELERATION_Y_IN_CENTIMETERS_PER_SECOND_SQUARED");
            new OooO00o(34, "ACCELERATION_FORWARD_IN_CENTIMETERS_PER_SECOND_SQUARED");
            f101582OooO0oO = new OooO00o(35, "ACCELERATION_LATERAL_IN_CENTIMETERS_PER_SECOND_SQUARED");
            new OooO00o(36, "DISTANCE_REMAINING_AS_FRACTION_OF_STROKE_LENGTH");
        }

        public OooO00o(int i, String str) {
            this.f101583OooO00o = i;
            this.f101584OooO0O0 = str;
            C20481OooOOoo<OooO00o> c20481OooOOoo = f101578OooO0OO;
            if (c20481OooOOoo.OooO00o(i)) {
                throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate Source value: ", ".").toString());
            }
            c20481OooOOoo.OooO0oO(i, this);
        }

        public final String toString() {
            return "Source." + this.f101584OooO0O0;
        }
    }

    public C28663OooOo0(oO0O000o.OooO00o<Long> oooO00o) {
        super(oooO00o, C34434OooOoO.f123453OooOo0o);
        C20481OooOOoo<OooO00o> c20481OooOOoo = OooO00o.f101578OooO0OO;
        SourceNodeNative sourceNodeNative = SourceNodeNative.f65367OooO00o;
        int sourceInt = sourceNodeNative.getSourceInt(OooO00o());
        OooO00o oooO00oOooO0O0 = OooO00o.f101578OooO0OO.OooO0O0(sourceInt);
        if (oooO00oOooO0O0 == null) {
            throw new IllegalStateException(C21532OooOOo.OooO0OO(sourceInt, "Invalid Source value: ").toString());
        }
        this.f101577OooO0o0 = oooO00oOooO0O0;
        C20481OooOOoo<C28657OooOOOO> c20481OooOOoo2 = C28657OooOOOO.f101557OooO0OO;
        this.f101576OooO0o = C28657OooOOOO.OooO00o.OooO00o(sourceNodeNative.getOutOfRangeBehaviorInt(OooO00o()));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C28663OooOo0)) {
            return false;
        }
        C28663OooOo0 c28663OooOo0 = (C28663OooOo0) obj;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101577OooO0o0, c28663OooOo0.f101577OooO0o0)) {
            return false;
        }
        SourceNodeNative sourceNodeNative = SourceNodeNative.f65367OooO00o;
        return sourceNodeNative.getValueRangeStart(OooO00o()) == sourceNodeNative.getValueRangeStart(c28663OooOo0.OooO00o()) && sourceNodeNative.getValueRangeEnd(OooO00o()) == sourceNodeNative.getValueRangeEnd(c28663OooOo0.OooO00o()) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101576OooO0o, c28663OooOo0.f101576OooO0o);
    }

    public final int hashCode() {
        int iHashCode = this.f101577OooO0o0.hashCode() * 31;
        SourceNodeNative sourceNodeNative = SourceNodeNative.f65367OooO00o;
        return this.f101576OooO0o.hashCode() + ((Float.hashCode(sourceNodeNative.getValueRangeEnd(OooO00o())) + ((Float.hashCode(sourceNodeNative.getValueRangeStart(OooO00o())) + iHashCode) * 31)) * 31);
    }

    public final String toString() {
        String str = this.f101577OooO0o0.f101584OooO0O0;
        SourceNodeNative sourceNodeNative = SourceNodeNative.f65367OooO00o;
        return "SourceNode(" + str + ", " + sourceNodeNative.getValueRangeStart(OooO00o()) + ", " + sourceNodeNative.getValueRangeEnd(OooO00o()) + ", " + this.f101576OooO0o.f101560OooO0O0 + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28663OooOo0(final OooO00o source, final float f, final float f2, final C28657OooOOOO sourceOutOfRangeBehavior) {
        this(new oO0O000o.OooO00o() { // from class: o0OoO0o.OooOo00
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return Long.valueOf(SourceNodeNative.f65367OooO00o.create(source.f101583OooO00o, f, f2, sourceOutOfRangeBehavior.f101559OooO00o));
            }
        });
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        kotlin.jvm.internal.OooOOO0.OooO0oO(sourceOutOfRangeBehavior, "sourceOutOfRangeBehavior");
    }
}
