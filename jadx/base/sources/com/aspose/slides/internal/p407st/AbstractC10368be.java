package com.aspose.slides.internal.p407st;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.be */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10368be extends AbstractC10376bv {
    public AbstractC10368be() {
        m51409um().m51917k4(5002);
        m51409um().m51920k4((short) 0);
    }

    /* JADX INFO: renamed from: k4 */
    public void m50464k4(int i) {
        AbstractC10539m9 c10593po;
        C10626rv c10626rv = new C10626rv("___PPT10", (short) 0);
        c10626rv.m51409um().m51916k4((byte) 0);
        m50513yj().addItem(c10626rv);
        if (i != 0) {
            c10593po = (i == 1 || i == 2) ? new C10491j8() : null;
        } else {
            m50512x1(true);
            c10593po = new C10593po();
        }
        c10593po.m51280k4(i);
        c10593po.m51409um().m51916k4((byte) 0);
        c10593po.m51409um().m51920k4((short) 0);
        m50513yj().addItem(c10593po);
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC10539m9 m50465x1() {
        return (AbstractC10539m9) m50508kk(5003);
    }
}
