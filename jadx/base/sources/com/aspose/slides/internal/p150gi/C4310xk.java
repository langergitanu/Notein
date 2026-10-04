package com.aspose.slides.internal.p150gi;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p051bz.C1924u4;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.xk */
/* JADX INFO: loaded from: classes.dex */
public class C4310xk extends C4277ix {

    /* JADX INFO: renamed from: dy */
    private int[] f11749dy;

    /* JADX INFO: renamed from: m9 */
    private int[] f11750m9;

    public C4310xk(AbstractC4275gi abstractC4275gi) {
        super(abstractC4275gi);
        this.f11750m9 = null;
        this.f11749dy = null;
    }

    /* JADX INFO: renamed from: h4 */
    private static boolean m17287h4(AbstractC3533um abstractC3533um) {
        if (abstractC3533um.m14393k4().m14111q_().m59588x6()) {
            AbstractC3511c5 abstractC3511c5M14115s_ = abstractC3533um.m14393k4().m14115s_();
            if (C7019kk.m27469x1(abstractC3511c5M14115s_, AbstractC3524ks.class) && ((AbstractC3524ks) abstractC3511c5M14115s_).mo14315ar()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4282kp m17288k4(int[] iArr, AbstractC3533um abstractC3533um) {
        AbstractC3533um abstractC3533umM17240kk = m17240kk(abstractC3533um);
        if (abstractC3533umM17240kk != null) {
            return abstractC3533um.m14402to(abstractC3533umM17240kk.m14392k4(iArr[0], iArr[1], iArr[2], iArr[3]));
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC4282kp m17289du(AbstractC3533um abstractC3533um) {
        boolean z;
        AbstractC3533um abstractC3533umM17240kk = m17240kk(abstractC3533um);
        if (abstractC3533umM17240kk == null) {
            return null;
        }
        InterfaceC1986to interfaceC1986toMo9878h4 = m17288k4(this.f11750m9, abstractC3533um).mo9878h4();
        InterfaceC1986to interfaceC1986toMo9878h42 = m17288k4(this.f11749dy, abstractC3533um).mo9878h4();
        int iM14392k4 = abstractC3533umM17240kk.m14392k4(this.f11677x1, this.f11674kk, this.f11676to, this.f11671du);
        for (AbstractC3533um abstractC3533umM14397kk = abstractC3533um.m14397kk(); abstractC3533umM14397kk != null && abstractC3533umM14397kk.mo14065x1(this.f11673k4.f11665k4) == null; abstractC3533umM14397kk = abstractC3533umM14397kk.m14397kk()) {
            if (abstractC3533umM14397kk.m14394k4(iM14392k4) != null) {
                z = true;
                break;
            }
        }
        z = false;
        if (abstractC3533um.m14394k4(iM14392k4) != null) {
            InterfaceC1986to interfaceC1986toMo9878h43 = abstractC3533um.m14402to(iM14392k4).mo9878h4();
            InterfaceC1986to interfaceC1986toM9896k4 = C4261ar.f11596k4;
            if (m17287h4(abstractC3533um)) {
                interfaceC1986toM9896k4 = C1924u4.m9896k4(interfaceC1986toM9896k4, abstractC3533um.m14398kk(this.f11673k4.f11665k4).mo9878h4());
            }
            return (AbstractC4282kp) C1924u4.m9896k4(C1924u4.m9896k4(C1924u4.m9896k4(interfaceC1986toM9896k4, interfaceC1986toMo9878h43), interfaceC1986toMo9878h4), interfaceC1986toMo9878h42);
        }
        AbstractC4282kp abstractC4282kpMo14065x1 = abstractC3533um.mo14065x1(this.f11673k4.f11665k4);
        if (abstractC4282kpMo14065x1 != null) {
            return abstractC4282kpMo14065x1;
        }
        if (m17287h4(abstractC3533um) || !z) {
            return null;
        }
        return C4261ar.f11596k4;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC4282kp m17291to(AbstractC3533um abstractC3533um) {
        AbstractC3533um abstractC3533umM17240kk = m17240kk(abstractC3533um);
        if (abstractC3533umM17240kk == null) {
            return null;
        }
        InterfaceC1986to interfaceC1986toMo9878h4 = m17288k4(this.f11750m9, abstractC3533um).mo9878h4();
        InterfaceC1986to interfaceC1986toMo9878h42 = m17288k4(this.f11749dy, abstractC3533um).mo9878h4();
        int[] iArr = this.f11750m9;
        int iM14392k4 = abstractC3533umM17240kk.m14392k4(iArr[0], iArr[1], iArr[2], iArr[3]);
        int[] iArr2 = this.f11749dy;
        int iM14392k42 = abstractC3533umM17240kk.m14392k4(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
        AbstractC4282kp abstractC4282kpM14394k4 = abstractC3533um.m14394k4(iM14392k4);
        AbstractC4282kp abstractC4282kpM14394k42 = abstractC3533um.m14394k4(iM14392k42);
        int iM14392k43 = abstractC3533umM17240kk.m14392k4(this.f11677x1, this.f11674kk, this.f11676to, this.f11671du);
        if (abstractC3533um.m14394k4(iM14392k43) != null || abstractC4282kpM14394k4 != null || abstractC4282kpM14394k42 != null) {
            InterfaceC1986to interfaceC1986toMo9878h43 = abstractC3533um.m14402to(iM14392k43).mo9878h4();
            InterfaceC1986to interfaceC1986toM9896k4 = C4261ar.f11596k4;
            if (!abstractC3533um.m14393k4().mo14315ar()) {
                interfaceC1986toM9896k4 = C1924u4.m9896k4(interfaceC1986toM9896k4, abstractC3533um.m14398kk(this.f11673k4.f11665k4).mo9878h4());
            }
            return (AbstractC4282kp) C1924u4.m9896k4(C1924u4.m9896k4(C1924u4.m9896k4(interfaceC1986toM9896k4, interfaceC1986toMo9878h43), interfaceC1986toMo9878h4), interfaceC1986toMo9878h42);
        }
        AbstractC4282kp abstractC4282kpMo14065x1 = abstractC3533um.mo14065x1(this.f11673k4.f11665k4);
        if (abstractC4282kpMo14065x1 == null) {
            do {
                abstractC3533um = abstractC3533um.m14397kk();
                if (abstractC3533um == null) {
                    break;
                }
                abstractC4282kpMo14065x1 = abstractC3533um.mo14065x1(this.f11673k4.f11665k4);
            } while (abstractC4282kpMo14065x1 == null);
        }
        return abstractC4282kpMo14065x1;
    }

    @Override // com.aspose.slides.internal.p150gi.C4277ix
    /* JADX INFO: renamed from: x1 */
    public AbstractC4282kp mo17241x1(AbstractC3533um abstractC3533um) {
        return abstractC3533um.m14393k4().m14111q_().m59588x6() ? m17289du(abstractC3533um) : m17291to(abstractC3533um);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17290k4(int[] iArr) {
        if (iArr == null || iArr.length != 4) {
            throw new ArgumentException();
        }
        this.f11750m9 = iArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17292x1(int[] iArr) {
        if (iArr == null || iArr.length != 4) {
            throw new ArgumentException();
        }
        this.f11749dy = iArr;
    }
}
