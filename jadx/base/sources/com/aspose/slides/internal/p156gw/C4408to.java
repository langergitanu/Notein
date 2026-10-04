package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p156gw.AbstractC4397h4;
import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.to */
/* JADX INFO: loaded from: classes.dex */
public class C4408to implements InterfaceC1565x1, Cloneable {

    /* JADX INFO: renamed from: k4 */
    private static Vector f12073k4 = new Vector();

    /* JADX INFO: renamed from: kk */
    private C12007ix f12074kk;

    /* JADX INFO: renamed from: x1 */
    private Vector f12075x1;

    public C4408to() {
        this.f12075x1 = f12073k4;
    }

    /* JADX INFO: renamed from: to */
    private C12007ix m17973to() {
        C12007ix c12007ix = this.f12074kk;
        if (c12007ix != null) {
            return c12007ix;
        }
        C12007ix c12007ix2 = new C12007ix();
        if (this.f12075x1.size() > 0) {
            AbstractC4393ck abstractC4393ck = (AbstractC4393ck) this.f12075x1.get(0);
            c12007ix2.m56577x1((float) abstractC4393ck.mo17797c5(), (float) abstractC4393ck.mo17804jd(), 0.0f, 0.0f);
            for (int i = 1; i < this.f12075x1.size(); i++) {
                ((AbstractC4393ck) this.f12075x1.get(i)).mo17807k4(c12007ix2);
            }
        }
        this.f12074kk = c12007ix2;
        return c12007ix2;
    }

    public Object clone() {
        return new C4408to(this);
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: dy */
    public C12007ix mo8355dy() {
        return m17973to();
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4 mo8356k4(C11913yj c11913yj, double d) {
        return new C4407rv(mo8359kk(c11913yj), d);
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: kk */
    public InterfaceC4413v4 mo8359kk(C11913yj c11913yj) {
        return new C4394du(this.f12075x1, c11913yj);
    }

    /* JADX INFO: renamed from: x1 */
    public C4408to m17980x1(C11913yj c11913yj) {
        C4408to c4408to = new C4408to(this);
        c4408to.m17975k4(c11913yj);
        return c4408to;
    }

    public C4408to(InterfaceC1565x1 interfaceC1565x1) {
        this.f12075x1 = interfaceC1565x1 instanceof C4408to ? ((C4408to) interfaceC1565x1).f12075x1 : m17971k4(interfaceC1565x1.mo8359kk(null));
    }

    /* JADX INFO: renamed from: k4 */
    private static Vector m17971k4(InterfaceC4413v4 interfaceC4413v4) {
        double d;
        double d2;
        double d3;
        double d4;
        Vector vector = new Vector();
        InterfaceC4413v4.k4 k4VarMo17819k4 = interfaceC4413v4.mo17819k4();
        double[] dArr = new double[23];
        double d5 = 0.0d;
        double d6 = 0.0d;
        double d7 = 0.0d;
        double d8 = 0.0d;
        while (!interfaceC4413v4.mo17821x1()) {
            int iMo17817k4 = interfaceC4413v4.mo17817k4(dArr);
            if (iMo17817k4 != 0) {
                if (iMo17817k4 != 1) {
                    if (iMo17817k4 == 2) {
                        d = d7;
                        d2 = d8;
                        d3 = dArr[2];
                        d4 = dArr[3];
                        AbstractC4393ck.m17869k4(vector, d5, d6, dArr);
                    } else if (iMo17817k4 == 3) {
                        d = d7;
                        d2 = d8;
                        d3 = dArr[4];
                        d4 = dArr[5];
                        AbstractC4393ck.m17870x1(vector, d5, d6, dArr);
                    } else if (iMo17817k4 != 4) {
                        interfaceC4413v4.mo17820kk();
                    } else {
                        AbstractC4393ck.m17868k4(vector, d5, d6, d7, d8);
                        d5 = d7;
                        d7 = d5;
                        d6 = d8;
                    }
                    d5 = d3;
                    d6 = d4;
                } else {
                    d = d7;
                    d2 = d8;
                    double d9 = dArr[0];
                    double d10 = dArr[1];
                    AbstractC4393ck.m17868k4(vector, d5, d6, d9, d10);
                    d5 = d9;
                    d6 = d10;
                }
                d7 = d;
                d8 = d2;
                interfaceC4413v4.mo17820kk();
            } else {
                AbstractC4393ck.m17868k4(vector, d5, d6, d7, d8);
                d5 = dArr[0];
                d6 = dArr[1];
                AbstractC4393ck.m17867k4(vector, d5, d6);
                d7 = d5;
            }
            d8 = d6;
            interfaceC4413v4.mo17820kk();
        }
        AbstractC4393ck.m17868k4(vector, d5, d6, d7, d8);
        return (k4VarMo17819k4 == InterfaceC4413v4.k4.WIND_EVEN_ODD ? new AbstractC4397h4.kk() : new AbstractC4397h4.du()).m17904k4(vector, f12073k4);
    }

    /* JADX INFO: renamed from: kk */
    private void m17972kk() {
        this.f12074kk = null;
    }

    /* JADX INFO: renamed from: to */
    public void m17979to(C4408to c4408to) {
        this.f12075x1 = new AbstractC4397h4.m9().m17904k4(this.f12075x1, c4408to.f12075x1);
        m17972kk();
    }

    /* JADX INFO: renamed from: x1 */
    public C12014ne m17981x1() {
        return C12014ne.m56661x1(m17973to());
    }

    /* JADX INFO: renamed from: k4 */
    public void m17974k4(C4408to c4408to) {
        this.f12075x1 = new AbstractC4397h4.k4().m17904k4(this.f12075x1, c4408to.f12075x1);
        m17972kk();
    }

    /* JADX INFO: renamed from: kk */
    public void m17978kk(C4408to c4408to) {
        this.f12075x1 = new AbstractC4397h4.to().m17904k4(this.f12075x1, c4408to.f12075x1);
        m17972kk();
    }

    /* JADX INFO: renamed from: x1 */
    public void m17982x1(C4408to c4408to) {
        this.f12075x1 = new AbstractC4397h4.h4().m17904k4(this.f12075x1, c4408to.f12075x1);
        m17972kk();
    }

    /* JADX INFO: renamed from: k4 */
    public void m17975k4(C11913yj c11913yj) {
        if (c11913yj == null) {
            throw new NullPointerException("transform must not be null");
        }
        this.f12075x1 = m17971k4(mo8359kk(c11913yj));
        m17972kk();
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m17983x1(double d, double d2, double d3, double d4) {
        double d5;
        AbstractC4395dy abstractC4395dyM17879k4;
        return d3 >= 0.0d && d4 >= 0.0d && m17973to().m56579x1(d, d2, d3, d4) && (abstractC4395dyM17879k4 = AbstractC4395dy.m17879k4(this.f12075x1, d, d2, d + d3, (d5 = d2 + d4))) != null && abstractC4395dyM17879k4.mo17883k4(d2, d5);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m17976k4() {
        return this.f12075x1.size() == 0;
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo8357k4(double d, double d2) {
        if (!m17973to().m56580x1((float) d, (float) d2)) {
            return false;
        }
        Enumeration enumerationElements = this.f12075x1.elements();
        int iMo17877kk = 0;
        while (enumerationElements.hasMoreElements()) {
            iMo17877kk += ((AbstractC4393ck) enumerationElements.nextElement()).mo17877kk(d, d2);
        }
        return (iMo17877kk & 1) == 1;
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo8358k4(double d, double d2, double d3, double d4) {
        if (d3 < 0.0d || d4 < 0.0d || !m17973to().m56565k4(d, d2, d3, d4)) {
            return false;
        }
        AbstractC4395dy abstractC4395dyM17879k4 = AbstractC4395dy.m17879k4(this.f12075x1, d, d2, d + d3, d2 + d4);
        return abstractC4395dyM17879k4 == null || !abstractC4395dyM17879k4.m17880du();
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m17977k4(C12007ix c12007ix) {
        return m17983x1(c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
    }
}
