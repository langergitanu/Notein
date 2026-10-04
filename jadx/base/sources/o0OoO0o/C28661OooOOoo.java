package o0OoO0o;

import OooOo.C20481OooOOoo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.ink.brush.behavior.EasingFunctionNative;
import androidx.ink.brush.behavior.ResponseNodeNative;
import androidx.ink.geometry.C21959OooOO0o;
import o0OoO0o.AbstractC28645OooO0o;

/* JADX INFO: renamed from: o0OoO0o.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28661OooOOoo extends AbstractC28667OooOoO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AbstractC28645OooO0o f101574OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractC28667OooOoO f101575OooO0o0;

    /* JADX WARN: Type inference failed for: r0v3, types: [o0OoO0o.OooO] */
    public C28661OooOOoo(oO0O000o.OooO00o<Long> oooO00o, AbstractC28667OooOoO abstractC28667OooOoO, AbstractC28645OooO0o abstractC28645OooO0o) {
        AbstractC28645OooO0o oooO0O0;
        super(oooO00o, com.facebook.soloader.OooOo.OooO0oO(abstractC28667OooOoO));
        this.f101575OooO0o0 = abstractC28667OooOoO;
        if (abstractC28645OooO0o == null) {
            AbstractC28645OooO0o.OooO00o oooO00o2 = AbstractC28645OooO0o.f101525OooO0O0;
            final long responseCurvePointer = ResponseNodeNative.f65366OooO00o.getResponseCurvePointer(OooO00o());
            oooO00o2.getClass();
            EasingFunctionNative easingFunctionNative = EasingFunctionNative.f65360OooO00o;
            int parametersType = easingFunctionNative.getParametersType(responseCurvePointer);
            if (parametersType != 0) {
                if (parametersType == 1) {
                    oooO0O0 = new AbstractC28645OooO0o.OooO0O0(new oO0O000o.OooO00o() { // from class: o0OoO0o.OooO0oo
                        @Override // oO0O000o.OooO00o
                        public final Object invoke() {
                            return Long.valueOf(EasingFunctionNative.f65360OooO00o.createCopyOf(responseCurvePointer));
                        }
                    });
                } else if (parametersType == 2) {
                    oooO0O0 = new AbstractC28645OooO0o.OooO0OO(new oO0O000o.OooO00o() { // from class: o0OoO0o.OooO
                        @Override // oO0O000o.OooO00o
                        public final Object invoke() {
                            return Long.valueOf(EasingFunctionNative.f65360OooO00o.createCopyOf(responseCurvePointer));
                        }
                    });
                } else {
                    if (parametersType != 3) {
                        throw new IllegalArgumentException("Invalid easing function type");
                    }
                    oooO0O0 = new AbstractC28645OooO0o.C19923OooO0o(new C21959OooOO0o(responseCurvePointer, 1));
                }
                abstractC28645OooO0o = oooO0O0;
            } else {
                C20481OooOOoo<AbstractC28645OooO0o.C28646OooO0Oo> c20481OooOOoo = AbstractC28645OooO0o.C28646OooO0Oo.f101530OooO0o0;
                int predefinedValueInt = easingFunctionNative.getPredefinedValueInt(responseCurvePointer);
                AbstractC28645OooO0o.C28646OooO0Oo c28646OooO0OoOooO0O0 = AbstractC28645OooO0o.C28646OooO0Oo.f101530OooO0o0.OooO0O0(predefinedValueInt);
                if (c28646OooO0OoOooO0O0 == null) {
                    throw new IllegalStateException(C21532OooOOo.OooO0OO(predefinedValueInt, "Invalid Predefined value: ").toString());
                }
                abstractC28645OooO0o = c28646OooO0OoOooO0O0;
            }
        }
        this.f101574OooO0o = abstractC28645OooO0o;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C28661OooOOoo)) {
            if (obj == this) {
                return true;
            }
            C28661OooOOoo c28661OooOOoo = (C28661OooOOoo) obj;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101574OooO0o, c28661OooOOoo.f101574OooO0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101575OooO0o0, c28661OooOOoo.f101575OooO0o0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f101575OooO0o0.hashCode() + (this.f101574OooO0o.hashCode() * 31);
    }

    public final String toString() {
        return "ResponseNode(" + this.f101574OooO0o + ", " + this.f101575OooO0o0 + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28661OooOOoo(AbstractC28645OooO0o responseCurve, AbstractC28667OooOoO abstractC28667OooOoO) {
        this(new C28659OooOOo(responseCurve, 0), abstractC28667OooOoO, responseCurve);
        kotlin.jvm.internal.OooOOO0.OooO0oO(responseCurve, "responseCurve");
    }
}
