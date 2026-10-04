package com.aspose.slides.internal.p532yu;

import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.p8 */
/* JADX INFO: loaded from: classes5.dex */
public class C13149p8 extends C13126nm implements Cloneable {

    /* JADX INFO: renamed from: du */
    private C13149p8 f44211du;

    /* JADX INFO: renamed from: dy */
    private int f44212dy;

    /* JADX INFO: renamed from: h4 */
    private C13005gv f44213h4;

    /* JADX INFO: renamed from: k4 */
    private String f44214k4;

    /* JADX INFO: renamed from: kk */
    private C13106mq f44215kk;

    /* JADX INFO: renamed from: m9 */
    private C13106mq f44216m9;

    /* JADX INFO: renamed from: x1 */
    private C12908be f44218x1 = new C12908be();

    /* JADX INFO: renamed from: to */
    private C13890ei f44217to = C13890ei.f46456k4;

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    public String ae_() {
        return m61396k4();
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
    public final C13106mq m61391c5() {
        return this.f44216m9;
    }

    /* JADX INFO: renamed from: ck */
    public final int m61392ck() {
        return this.f44212dy;
    }

    /* JADX INFO: renamed from: dy */
    public final C13005gv m61393dy() {
        if (this.f44213h4 == null) {
            this.f44213h4 = new C13005gv();
        }
        return this.f44213h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C13106mq m61394h4() {
        return this.f44215kk;
    }

    /* JADX INFO: renamed from: jd */
    public final C13149p8 m61395jd() {
        return this.f44211du;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m61396k4() {
        return this.f44214k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C13890ei m61401m9() {
        return this.f44217to;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    /* JADX INFO: renamed from: wy */
    public AbstractC13018hl mo60427wy() {
        C13149p8 c13149p8 = (C13149p8) af_();
        if (C12969en.m60400kk(this.f44218x1)) {
            c13149p8.f44218x1 = C12969en.m60403x1(this.f44218x1);
            c13149p8.f44213h4 = null;
        }
        return c13149p8;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12908be m61402x1() {
        return this.f44218x1;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    /* JADX INFO: renamed from: h4 */
    public void mo59981h4(String str) {
        m61404x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61397k4(int i) {
        this.f44212dy = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61403x1(C13106mq c13106mq) {
        this.f44216m9 = c13106mq;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61398k4(C13106mq c13106mq) {
        this.f44215kk = c13106mq;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61404x1(String str) {
        this.f44214k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61399k4(C13149p8 c13149p8) {
        this.f44211du = c13149p8;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61400k4(C13890ei c13890ei) {
        this.f44217to = c13890ei;
    }
}
