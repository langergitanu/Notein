package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.ak */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4388ak implements InterfaceC1565x1, Cloneable {
    /* JADX INFO: renamed from: c5 */
    public abstract double mo17781c5();

    /* JADX INFO: renamed from: ck */
    public abstract boolean mo17782ck();

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: fa */
    public double m17783fa() {
        return mo17784h4();
    }

    /* JADX INFO: renamed from: h4 */
    public abstract double mo17784h4();

    /* JADX INFO: renamed from: jd */
    public abstract double mo17785jd();

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4 mo8356k4(C11913yj c11913yj, double d) {
        return new C4407rv(mo8359kk(c11913yj), d);
    }

    /* JADX INFO: renamed from: ks */
    public double m17786ks() {
        return mo17785jd() + mo17787m9();
    }

    /* JADX INFO: renamed from: m9 */
    public abstract double mo17787m9();

    /* JADX INFO: renamed from: rv */
    public double m17788rv() {
        return (mo17781c5() / 2.0d) + mo17784h4();
    }

    /* JADX INFO: renamed from: up */
    public double m17789up() {
        return mo17787m9();
    }

    /* JADX INFO: renamed from: x6 */
    public double m17790x6() {
        return (mo17785jd() / 2.0d) + mo17787m9();
    }

    /* JADX INFO: renamed from: yj */
    public double m17791yj() {
        return mo17781c5() + mo17784h4();
    }
}
