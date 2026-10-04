package o0OoO0o;

import OooOo.C20481OooOOoo;
import OooOoO.C20509OooO0oo;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.ink.brush.behavior.EasingFunctionNative;
import androidx.ink.geometry.ImmutableVec;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24028OooOoO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: o0OoO0o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC28645OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f101527OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f101526OooO0OO = {new C24028OooOoO0(AbstractC28645OooO0o.class, "nativePointer", "getNativePointer$ink_brush()J", 0)};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f101525OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: o0OoO0o.OooO0o$OooO00o */
    public static final class OooO00o {
    }

    /* JADX INFO: renamed from: o0OoO0o.OooO0o$OooO0O0 */
    public static final class OooO0O0 extends AbstractC28645OooO0o {
        public OooO0O0(final float f, final float f2, final float f3, final float f4) {
            super(new oO0O000o.OooO00o() { // from class: o0OoO0o.OooO0oO
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    return Long.valueOf(EasingFunctionNative.f65360OooO00o.createCubicBezier(f, f2, f3, f4));
                }
            });
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof OooO0O0)) {
                return false;
            }
            EasingFunctionNative easingFunctionNative = EasingFunctionNative.f65360OooO00o;
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return easingFunctionNative.getCubicBezierX1(OooO00o()) == easingFunctionNative.getCubicBezierX1(oooO0O0.OooO00o()) && easingFunctionNative.getCubicBezierX2(OooO00o()) == easingFunctionNative.getCubicBezierX2(oooO0O0.OooO00o()) && easingFunctionNative.getCubicBezierY1(OooO00o()) == easingFunctionNative.getCubicBezierY1(oooO0O0.OooO00o()) && easingFunctionNative.getCubicBezierY2(OooO00o()) == easingFunctionNative.getCubicBezierY2(oooO0O0.OooO00o());
        }

        public final int hashCode() {
            EasingFunctionNative easingFunctionNative = EasingFunctionNative.f65360OooO00o;
            return Float.hashCode(easingFunctionNative.getCubicBezierY2(OooO00o())) + ((Float.hashCode(easingFunctionNative.getCubicBezierY1(OooO00o())) + ((Float.hashCode(easingFunctionNative.getCubicBezierX2(OooO00o())) + (Float.hashCode(easingFunctionNative.getCubicBezierX1(OooO00o())) * 31)) * 31)) * 31);
        }

        public final String toString() {
            EasingFunctionNative easingFunctionNative = EasingFunctionNative.f65360OooO00o;
            float cubicBezierX1 = easingFunctionNative.getCubicBezierX1(OooO00o());
            float cubicBezierY1 = easingFunctionNative.getCubicBezierY1(OooO00o());
            float cubicBezierX2 = easingFunctionNative.getCubicBezierX2(OooO00o());
            float cubicBezierY2 = easingFunctionNative.getCubicBezierY2(OooO00o());
            StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("EasingFunction.CubicBezier(x1=", cubicBezierX1, ", y1=", cubicBezierY1, ", x2=");
            sbOooO0Oo.append(cubicBezierX2);
            sbOooO0Oo.append(", y2=");
            sbOooO0Oo.append(cubicBezierY2);
            sbOooO0Oo.append(")");
            return sbOooO0Oo.toString();
        }
    }

    /* JADX INFO: renamed from: o0OoO0o.OooO0o$OooO0OO */
    public static final class OooO0OO extends AbstractC28645OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<ImmutableVec> f101528OooO0Oo;

        public OooO0OO(C28640OooO c28640OooO) {
            super(c28640OooO);
            int linearNumPoints = EasingFunctionNative.f65360OooO00o.getLinearNumPoints(OooO00o());
            ArrayList arrayList = new ArrayList(linearNumPoints);
            for (int i = 0; i < linearNumPoints; i++) {
                EasingFunctionNative easingFunctionNative = EasingFunctionNative.f65360OooO00o;
                arrayList.add(new ImmutableVec(easingFunctionNative.getLinearPointX(OooO00o(), i), easingFunctionNative.getLinearPointY(OooO00o(), i)));
            }
            List<ImmutableVec> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.OooOOO0.OooO0o(listUnmodifiableList, "unmodifiableList(...)");
            this.f101528OooO0Oo = listUnmodifiableList;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof OooO0OO)) {
                return false;
            }
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101528OooO0Oo, ((OooO0OO) obj).f101528OooO0Oo);
        }

        public final int hashCode() {
            return this.f101528OooO0Oo.hashCode();
        }

        public final String toString() {
            return "EasingFunction.Linear(" + this.f101528OooO0Oo + ")";
        }
    }

    /* JADX INFO: renamed from: o0OoO0o.OooO0o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C28646OooO0Oo extends AbstractC28645OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f101531OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final C20481OooOOoo<C28646OooO0Oo> f101530OooO0o0 = new C20481OooOOoo<>((Object) null);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final C28646OooO0Oo f101529OooO0o = new C28646OooO0Oo(0, "LINEAR");

        static {
            new C28646OooO0Oo(1, "EASE");
            new C28646OooO0Oo(2, "EASE_IN");
            new C28646OooO0Oo(3, "EASE_OUT");
            new C28646OooO0Oo(4, "EASE_IN_OUT");
            new C28646OooO0Oo(5, "STEP_START");
            new C28646OooO0Oo(6, "STEP_END");
        }

        public C28646OooO0Oo(final int i, String str) {
            super(new oO0O000o.OooO00o() { // from class: o0OoO0o.OooOO0
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    return Long.valueOf(EasingFunctionNative.f65360OooO00o.createPredefined(i));
                }
            });
            this.f101531OooO0Oo = str;
            C20481OooOOoo<C28646OooO0Oo> c20481OooOOoo = f101530OooO0o0;
            if (c20481OooOOoo.OooO00o(i)) {
                throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate Predefined value: ", ".").toString());
            }
            c20481OooOOoo.OooO0oO(i, this);
        }

        public final String toString() {
            return "EasingFunction.Predefined." + this.f101531OooO0Oo;
        }
    }

    /* JADX INFO: renamed from: o0OoO0o.OooO0o$OooO0o, reason: collision with other inner class name */
    public static final class C19923OooO0o extends AbstractC28645OooO0o {
        public C19923OooO0o() {
            throw null;
        }

        public final C28647OooO0o0 OooO0O0() {
            C20481OooOOoo<C28647OooO0o0> c20481OooOOoo = C28647OooO0o0.f101532OooO0O0;
            int stepsPositionInt = EasingFunctionNative.f65360OooO00o.getStepsPositionInt(OooO00o());
            C28647OooO0o0 c28647OooO0o0OooO0O0 = C28647OooO0o0.f101532OooO0O0.OooO0O0(stepsPositionInt);
            if (c28647OooO0o0OooO0O0 != null) {
                return c28647OooO0o0OooO0O0;
            }
            throw new IllegalStateException(C21532OooOOo.OooO0OO(stepsPositionInt, "Invalid StepPosition value: ").toString());
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C19923OooO0o)) {
                return false;
            }
            EasingFunctionNative easingFunctionNative = EasingFunctionNative.f65360OooO00o;
            C19923OooO0o c19923OooO0o = (C19923OooO0o) obj;
            return easingFunctionNative.getStepsCount(OooO00o()) == easingFunctionNative.getStepsCount(c19923OooO0o.OooO00o()) && OooO0O0().equals(c19923OooO0o.OooO0O0());
        }

        public final int hashCode() {
            return OooO0O0().hashCode() + (Integer.hashCode(EasingFunctionNative.f65360OooO00o.getStepsCount(OooO00o())) * 31);
        }

        public final String toString() {
            return "EasingFunction.Steps(stepCount=" + EasingFunctionNative.f65360OooO00o.getStepsCount(OooO00o()) + ", stepPosition=" + OooO0O0() + ")";
        }
    }

    /* JADX INFO: renamed from: o0OoO0o.OooO0o$OooO0o0, reason: case insensitive filesystem */
    public static final class C28647OooO0o0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C20481OooOOoo<C28647OooO0o0> f101532OooO0O0 = new C20481OooOOoo<>((Object) null);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f101533OooO00o;

        static {
            new C28647OooO0o0(0, "JUMP_END");
            new C28647OooO0o0(1, "JUMP_START");
            new C28647OooO0o0(2, "JUMP_BOTH");
            new C28647OooO0o0(3, "JUMP_NONE");
        }

        public C28647OooO0o0(int i, String str) {
            this.f101533OooO00o = str;
            C20481OooOOoo<C28647OooO0o0> c20481OooOOoo = f101532OooO0O0;
            if (c20481OooOOoo.OooO00o(i)) {
                throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate StepPosition value: ", ".").toString());
            }
            c20481OooOOoo.OooO0oO(i, this);
        }

        public final String toString() {
            return "EasingFunction.StepPosition." + this.f101533OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OoO0o.OooO0o$OooO0oO, reason: case insensitive filesystem */
    public static final /* synthetic */ class C28648OooO0oO extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Long l) {
            ((EasingFunctionNative) this.receiver).free(l.longValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public AbstractC28645OooO0o() {
        throw null;
    }

    public AbstractC28645OooO0o(oO0O000o.OooO00o oooO00o) {
        this.f101527OooO00o = new o000OOoO.OooO0O0(oooO00o, new C28648OooO0oO(1, EasingFunctionNative.f65360OooO00o, EasingFunctionNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
    }

    public final long OooO00o() {
        return this.f101527OooO00o.OooO00o(this, f101526OooO0OO[0]);
    }
}
