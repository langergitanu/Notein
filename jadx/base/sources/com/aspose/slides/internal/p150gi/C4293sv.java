package com.aspose.slides.internal.p150gi;

import com.aspose.slides.OooO;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.sv */
/* JADX INFO: loaded from: classes.dex */
public class C4293sv extends AbstractC4282kp implements InterfaceC1986to {

    /* JADX INFO: renamed from: k4 */
    private final Object f11716k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.sv$k4 */
    public static class k4 extends AbstractC4275gi implements Cloneable {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            if (C7019kk.m27469x1(abstractC4282kp, C4293sv.class)) {
                return abstractC4282kp;
            }
            if (C7019kk.m27469x1(abstractC4282kp, C4288qq.class)) {
                return C4305wl.m17278k4(abstractC4282kp);
            }
            Object objMo9924m9 = abstractC4282kp.mo9924m9();
            return objMo9924m9 != null ? C4293sv.m17270k4(((Double) C7019kk.m27464to(objMo9924m9, Double.TYPE)).doubleValue()) : mo14303k4(abstractC4282kp, abstractC3533um, abstractC3524ks);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.sv$x1 */
    public static class x1 extends AbstractC4275gi implements Cloneable {
        public x1(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            if (C7019kk.m27469x1(abstractC4282kp, C4288qq.class)) {
                return C4305wl.m17278k4(abstractC4282kp);
            }
            if (abstractC4282kp.mo9924m9() == null) {
                return mo14303k4(abstractC4282kp, abstractC3533um, abstractC3524ks);
            }
            int iOooO00o = OooO.OooO00o(C14080ne.m66861ck(r0), 14);
            if (iOooO00o <= 0) {
                iOooO00o = 1;
            }
            return C4293sv.m17271x1(iOooO00o);
        }
    }

    private C4293sv(double d) {
        Object objValueOf;
        if (d == C14116yg.m67490kk(d)) {
            Double dValueOf = Double.valueOf(d);
            objValueOf = d < 2.147483647E9d ? Integer.valueOf(C7019kk.m27462to(dValueOf, 14)) : Long.valueOf(C7019kk.m27438h4(dValueOf, 14));
        } else {
            objValueOf = Double.valueOf(d);
        }
        this.f11716k4 = objValueOf;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: dy */
    public InterfaceC1984kk mo9877dy() {
        return C4261ar.m17119k4(mo9879k4(), "px");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4293sv c4293sv = (C4293sv) C7019kk.m27452k4(obj, C4293sv.class);
        if (c4293sv == null) {
            return false;
        }
        return C10017to.m49170k4(this.f11716k4, c4293sv.f11716k4);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: g_ */
    public Object mo9922g_() {
        return this.f11716k4;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: h4 */
    public InterfaceC1986to mo9878h4() {
        return this;
    }

    public int hashCode() {
        return this.f11716k4.hashCode();
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public final double mo9879k4() {
        return C14080ne.m66903fa(this.f11716k4);
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: kk */
    public final boolean mo9883kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: m9 */
    public Object mo9924m9() {
        return this.f11716k4;
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: to */
    public final int mo9884to() {
        return ((Integer) C7019kk.m27464to(this.f11716k4, Integer.TYPE)).intValue();
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: x1 */
    public final int mo9885x1() {
        return 0;
    }

    private C4293sv(int i) {
        this.f11716k4 = Integer.valueOf(i);
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public final double mo9880k4(InterfaceC1981h4 interfaceC1981h4) {
        return mo9879k4();
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: x1 */
    public final int mo9886x1(InterfaceC1981h4 interfaceC1981h4) {
        return mo9884to();
    }

    /* JADX INFO: renamed from: k4 */
    public static C4293sv m17270k4(double d) {
        return new C4293sv(d);
    }

    /* JADX INFO: renamed from: x1 */
    public static C4293sv m17271x1(int i) {
        return new C4293sv(i);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: k4 */
    public C12003du mo9923k4(C12814to c12814to) {
        return C12003du.m56460uz();
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1986to
    /* JADX INFO: renamed from: k4 */
    public final void mo9881k4(int i) {
    }
}
