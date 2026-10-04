package com.aspose.slides.internal.p532yu;

import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.p4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13146p4 extends C13126nm implements Cloneable {

    /* JADX INFO: renamed from: c5 */
    private C13164q9 f44194c5;

    /* JADX INFO: renamed from: ck */
    private C13061k5 f44195ck;

    /* JADX INFO: renamed from: dy */
    private C13890ei f44197dy;

    /* JADX INFO: renamed from: h4 */
    private C13890ei f44198h4;

    /* JADX INFO: renamed from: jd */
    private C13164q9 f44199jd;

    /* JADX INFO: renamed from: k4 */
    private String f44200k4;

    /* JADX INFO: renamed from: kk */
    private String f44201kk;

    /* JADX INFO: renamed from: m9 */
    private C13890ei f44202m9;

    /* JADX INFO: renamed from: x1 */
    private String f44204x1;

    /* JADX INFO: renamed from: to */
    private int f44203to = 0;

    /* JADX INFO: renamed from: du */
    private int f44196du = 0;

    public C13146p4() {
        C13890ei c13890ei = C13890ei.f46456k4;
        this.f44198h4 = c13890ei;
        this.f44202m9 = c13890ei;
        this.f44197dy = c13890ei;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    public String ae_() {
        return m61370m9();
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    public Object af_() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final C13890ei m61355c5() {
        return this.f44202m9;
    }

    /* JADX INFO: renamed from: ck */
    public final int m61356ck() {
        return this.f44196du;
    }

    /* JADX INFO: renamed from: du */
    public final void m61357du(String str) {
        this.f44201kk = str;
    }

    /* JADX INFO: renamed from: dy */
    public final C13890ei m61358dy() {
        return this.f44198h4;
    }

    /* JADX INFO: renamed from: fa */
    public final C13890ei m61359fa() {
        return this.f44197dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m61360h4() {
        return this.f44203to;
    }

    /* JADX INFO: renamed from: jd */
    public final C13164q9 m61361jd() {
        return this.f44194c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m61362k4() {
        return this.f44200k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m61367kk(C13890ei c13890ei) {
        this.f44197dy = c13890ei;
    }

    /* JADX INFO: renamed from: ks */
    public final C13061k5 m61369ks() {
        return this.f44195ck;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m61370m9() {
        return this.f44201kk;
    }

    /* JADX INFO: renamed from: up */
    public final C13164q9 m61371up() {
        return this.f44199jd;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    /* JADX INFO: renamed from: wy */
    public AbstractC13018hl mo60427wy() {
        C13146p4 c13146p4 = (C13146p4) af_();
        c13146p4.f44198h4 = this.f44198h4.m65282du();
        c13146p4.f44202m9 = this.f44202m9.m65282du();
        c13146p4.f44197dy = this.f44197dy.m65282du();
        return c13146p4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m61372x1() {
        return this.f44204x1;
    }

    /* JADX INFO: renamed from: yj */
    public final AbstractC12892ae m61377yj() {
        C13164q9 c13164q9 = this.f44199jd;
        if (c13164q9 != null) {
            return c13164q9.m60211bz();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    /* JADX INFO: renamed from: h4 */
    public void mo59981h4(String str) {
        m61357du(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61363k4(int i) {
        this.f44203to = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m61368kk(String str) {
        this.f44204x1 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61373x1(int i) {
        this.f44196du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61364k4(C13061k5 c13061k5) {
        this.f44195ck = c13061k5;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61374x1(C13164q9 c13164q9) {
        this.f44199jd = c13164q9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61365k4(C13164q9 c13164q9) {
        this.f44194c5 = c13164q9;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61375x1(C13890ei c13890ei) {
        if (c13890ei == null) {
            c13890ei = C13890ei.f46456k4;
        }
        this.f44202m9 = c13890ei;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61366k4(C13890ei c13890ei) {
        if (c13890ei == null) {
            c13890ei = C13890ei.f46456k4;
        }
        this.f44198h4 = c13890ei;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61376x1(String str) {
        this.f44200k4 = str;
    }
}
