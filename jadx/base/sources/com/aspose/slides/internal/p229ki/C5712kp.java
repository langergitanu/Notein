package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.kp */
/* JADX INFO: loaded from: classes.dex */
public final class C5712kp extends AbstractC5729ri {

    /* JADX INFO: renamed from: k4 */
    private AbstractC5728qw f15752k4;

    /* JADX INFO: renamed from: x1 */
    private int f15753x1;

    public C5712kp(int i, AbstractC5728qw abstractC5728qw) {
        this.f15752k4 = abstractC5728qw;
        this.f15753x1 = i;
    }

    /* JADX INFO: renamed from: du */
    private double m23299du(AbstractC10929m9 abstractC10929m9) {
        return C14116yg.m67490kk(((Double) C7019kk.m27464to(this.f15752k4.mo23148k4(abstractC10929m9), Double.TYPE)).doubleValue());
    }

    /* JADX INFO: renamed from: h4 */
    private double m23300h4(AbstractC10929m9 abstractC10929m9) {
        return C14116yg.m67501x1(((Double) C7019kk.m27464to(this.f15752k4.mo23148k4(abstractC10929m9), Double.TYPE)).doubleValue());
    }

    /* JADX INFO: renamed from: k4 */
    public static double m23301k4(String str) {
        return C13850af.m65076k4((Object) str);
    }

    /* JADX INFO: renamed from: kk */
    private double m23303kk(AbstractC10929m9 abstractC10929m9) {
        AbstractC5728qw abstractC5728qw = this.f15752k4;
        if (abstractC5728qw == null) {
            return C13850af.m65076k4((Object) abstractC10929m9.mo21834kk().mo21843dy());
        }
        Object objMo23148k4 = abstractC5728qw.mo23148k4(abstractC10929m9);
        int iM23318k4 = m23318k4(objMo23148k4);
        if (iM23318k4 == 0) {
            return ((Double) C7019kk.m27464to(objMo23148k4, Double.TYPE)).doubleValue();
        }
        if (iM23318k4 == 1) {
            return m23301k4((String) objMo23148k4);
        }
        if (iM23318k4 == 2) {
            return m23302k4(((Boolean) C7019kk.m27464to(objMo23148k4, Boolean.TYPE)).booleanValue());
        }
        if (iM23318k4 != 3) {
            if (iM23318k4 != 4) {
                return Double.NaN;
            }
            return m23301k4(((AbstractC10925du) objMo23148k4).mo21843dy());
        }
        AbstractC10925du abstractC10925duMo23142m9 = this.f15752k4.mo23142m9();
        if (abstractC10925duMo23142m9 != null) {
            return m23301k4(abstractC10925duMo23142m9.mo21843dy());
        }
        return Double.NaN;
    }

    /* JADX INFO: renamed from: m9 */
    private double m23304m9(AbstractC10929m9 abstractC10929m9) {
        return C13850af.m65135x1(C13850af.m65076k4(this.f15752k4.mo23148k4(abstractC10929m9)));
    }

    /* JADX INFO: renamed from: to */
    private double m23305to(AbstractC10929m9 abstractC10929m9) {
        this.f15752k4.mo23148k4(abstractC10929m9);
        double dM23301k4 = 0.0d;
        while (true) {
            AbstractC10925du abstractC10925duMo23142m9 = this.f15752k4.mo23142m9();
            if (abstractC10925duMo23142m9 == null) {
                return dM23301k4;
            }
            dM23301k4 += m23301k4(abstractC10925duMo23142m9.mo21843dy());
        }
    }

    private C5712kp(C5712kp c5712kp) {
        super(c5712kp);
        this.f15752k4 = null;
        this.f15752k4 = AbstractC5728qw.m23314k4(c5712kp.f15752k4);
        this.f15753x1 = c5712kp.f15753x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m23302k4(boolean z) {
        return z ? 1.0d : 0.0d;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: h4 */
    public int mo23141h4() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5712kp(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        double dM23303kk;
        int i = this.f15753x1;
        if (i != 9) {
            switch (i) {
                case 23:
                    dM23303kk = m23305to(abstractC10929m9);
                    break;
                case 24:
                    dM23303kk = m23299du(abstractC10929m9);
                    break;
                case 25:
                    dM23303kk = m23300h4(abstractC10929m9);
                    break;
                case 26:
                    dM23303kk = m23304m9(abstractC10929m9);
                    break;
                default:
                    return null;
            }
        } else {
            dM23303kk = m23303kk(abstractC10929m9);
        }
        return Double.valueOf(dM23303kk);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        AbstractC5728qw abstractC5728qw = this.f15752k4;
        if (abstractC5728qw != null) {
            abstractC5728qw.mo23149k4(abstractC7201m9);
        }
    }
}
