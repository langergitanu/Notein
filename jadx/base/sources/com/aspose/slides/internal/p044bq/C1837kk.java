package com.aspose.slides.internal.p044bq;

import com.aspose.slides.internal.p067cu.C2631kk;
import com.aspose.slides.internal.p067cu.C2633x1;
import com.aspose.slides.internal.p098e2.C3547kk;
import com.aspose.slides.internal.p098e2.C3548to;
import com.aspose.slides.internal.p098e2.C3549x1;
import com.aspose.slides.internal.p098e2.InterfaceC3545h4;
import com.aspose.slides.internal.p140fz.C4150m9;
import com.aspose.slides.internal.p140fz.InterfaceC4146h4;
import com.aspose.slides.internal.p180ib.C4803du;
import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p219k6.InterfaceC5620to;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.bq.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1837kk implements InterfaceC4809to {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f6665k4 = true;

    /* JADX INFO: renamed from: c5 */
    private final boolean f6666c5;

    /* JADX INFO: renamed from: ck */
    private final C3549x1 f6667ck;

    /* JADX INFO: renamed from: du */
    private final InterfaceC4809to f6668du;

    /* JADX INFO: renamed from: dy */
    private final List<C1835h4> f6669dy;

    /* JADX INFO: renamed from: fa */
    private final C3548to f6670fa;

    /* JADX INFO: renamed from: h4 */
    private final InterfaceC1838to f6671h4;

    /* JADX INFO: renamed from: jd */
    private InterfaceC3545h4 f6672jd;

    /* JADX INFO: renamed from: kk */
    private final float f6673kk;

    /* JADX INFO: renamed from: m9 */
    private final C1834du f6674m9 = new C1834du();

    /* JADX INFO: renamed from: to */
    private final boolean f6675to;

    /* JADX INFO: renamed from: up */
    private final C3547kk f6676up;

    /* JADX INFO: renamed from: x1 */
    private final C12026yj f6677x1;

    public C1837kk(C4804dy c4804dy, boolean z, InterfaceC4809to interfaceC4809to, InterfaceC1838to interfaceC1838to, List<InterfaceC4146h4> list, List<InterfaceC5620to> list2) {
        this.f6677x1 = c4804dy.m19879k4();
        this.f6673kk = c4804dy.m19879k4().m56930ne();
        this.f6675to = z;
        this.f6668du = interfaceC4809to;
        this.f6671h4 = interfaceC1838to;
        this.f6669dy = new ArrayList(list.size());
        if (!f6665k4 && list.size() != list2.size()) {
            throw new AssertionError();
        }
        for (int i = 0; i < list.size(); i++) {
            this.f6669dy.add(new C1835h4(list.get(i), list2.get(i)));
        }
        boolean z2 = this.f6669dy.size() == 1;
        this.f6666c5 = z2;
        if (z2) {
            this.f6674m9.f6631x1 = list.get(0);
        } else {
            this.f6674m9.f6631x1 = C4150m9.m16599k4(c4804dy);
        }
        C3549x1 c3549x1 = new C3549x1(this);
        this.f6667ck = c3549x1;
        this.f6670fa = new C3548to(this);
        this.f6676up = new C3547kk(this);
        this.f6672jd = c3549x1;
    }

    /* JADX INFO: renamed from: jd */
    private void m9575jd() {
        if (this.f6675to) {
            return;
        }
        this.f6668du.mo9584k4();
    }

    /* JADX INFO: renamed from: c5 */
    public void m9580c5() {
        for (C1835h4 c1835h4 : this.f6669dy) {
            m9578x1(c1835h4);
            m9577kk(c1835h4);
            m9575jd();
        }
        this.f6671h4.mo9608kk();
    }

    /* JADX INFO: renamed from: du */
    public boolean m9581du() {
        return this.f6675to;
    }

    /* JADX INFO: renamed from: dy */
    public void m9582dy() {
        this.f6668du.mo9602x1();
    }

    /* JADX INFO: renamed from: h4 */
    public C1834du m9583h4() {
        return this.f6674m9;
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9584k4() {
        this.f6672jd.mo9584k4();
        this.f6672jd = this.f6667ck;
        this.f6671h4.mo9584k4();
    }

    /* JADX INFO: renamed from: kk */
    public float m9596kk() {
        return this.f6673kk;
    }

    /* JADX INFO: renamed from: m9 */
    public List<C1835h4> m9599m9() {
        return this.f6669dy;
    }

    /* JADX INFO: renamed from: to */
    public void m9600to(C1835h4 c1835h4, C12025x6 c12025x6) {
        m9579x1(c1835h4.f6637h4, c12025x6);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9602x1() {
        this.f6672jd.mo9602x1();
        this.f6672jd = this.f6667ck;
        this.f6671h4.mo9602x1();
    }

    /* JADX INFO: renamed from: kk */
    private void m9577kk(C1835h4 c1835h4) {
        if (!this.f6675to) {
            C4803du.m19878x1(c1835h4.f6637h4, this.f6668du);
        }
        c1835h4.f6637h4.m12024x1();
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9585k4(float f, float f2) {
        this.f6672jd.mo9585k4(f, f2);
        this.f6672jd = this.f6670fa;
        this.f6671h4.mo9585k4(f, f2);
    }

    /* JADX INFO: renamed from: to */
    public boolean m9601to() {
        return this.f6666c5;
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9603x1(float f, float f2) {
        this.f6672jd.mo9603x1(f, f2);
        this.f6672jd = this.f6676up;
        this.f6671h4.mo9603x1(f, f2);
    }

    /* JADX INFO: renamed from: x1 */
    private void m9578x1(C1835h4 c1835h4) {
        C4803du.m19874k4(c1835h4.f6634du, this.f6668du);
        c1835h4.f6634du.m12024x1();
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9586k4(float f, float f2, float f3, float f4) {
        this.f6672jd.mo9586k4(f, f2, f3, f4);
        this.f6672jd = this.f6676up;
        this.f6671h4.mo9586k4(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: kk */
    public void m9597kk(C1835h4 c1835h4, float f, float f2) {
        c1835h4.f6637h4.m12025x1(C2633x1.m12032x1(f, f2));
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9587k4(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f6672jd.mo9587k4(f, f2, f3, f4, f5, f6);
        this.f6672jd = this.f6676up;
        this.f6671h4.mo9587k4(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: kk */
    public void m9598kk(C1835h4 c1835h4, C12025x6 c12025x6) {
        m9579x1(c1835h4.f6634du, c12025x6);
    }

    /* JADX INFO: renamed from: x1 */
    public void m9604x1(C1835h4 c1835h4, float f, float f2) {
        c1835h4.f6634du.m12025x1(C2633x1.m12032x1(f, f2));
    }

    /* JADX INFO: renamed from: k4 */
    public void m9588k4(C1835h4 c1835h4) {
        c1835h4.f6634du.m12025x1(C2633x1.m12028k4());
    }

    /* JADX INFO: renamed from: x1 */
    public void m9605x1(C1835h4 c1835h4, float f, float f2, float f3, float f4) {
        c1835h4.f6637h4.m12025x1(C2633x1.m12030k4(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: k4 */
    public void m9589k4(C1835h4 c1835h4, float f, float f2) {
        c1835h4.f6634du.m12025x1(C2633x1.m12029k4(f, f2));
    }

    /* JADX INFO: renamed from: x1 */
    public void m9606x1(C1835h4 c1835h4, float f, float f2, float f3, float f4, float f5, float f6) {
        c1835h4.f6637h4.m12025x1(C2633x1.m12031k4(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: k4 */
    public void m9590k4(C1835h4 c1835h4, float f, float f2, float f3, float f4) {
        c1835h4.f6634du.m12025x1(C2633x1.m12030k4(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: x1 */
    public void m9607x1(C1835h4 c1835h4, C12025x6 c12025x6) {
        m9576k4(c1835h4.f6637h4, c12025x6);
    }

    /* JADX INFO: renamed from: x1 */
    private void m9579x1(C2631kk c2631kk, C12025x6 c12025x6) {
        Iterator<C2633x1> itM12023to = c2631kk.m12023to();
        if (itM12023to.hasNext()) {
            itM12023to.next().m12038x1(c12025x6);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m9591k4(C1835h4 c1835h4, float f, float f2, float f3, float f4, float f5, float f6) {
        c1835h4.f6634du.m12025x1(C2633x1.m12031k4(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: k4 */
    public void m9592k4(C1835h4 c1835h4, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        if (z) {
            m9606x1(c1835h4, f, f2, f3, f4, f5, f6);
        } else {
            m9591k4(c1835h4, f, f2, f3, f4, f5, f6);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m9593k4(C1835h4 c1835h4, float f, float f2, float f3, float f4, boolean z) {
        if (z) {
            m9605x1(c1835h4, f, f2, f3, f4);
        } else {
            m9590k4(c1835h4, f, f2, f3, f4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m9594k4(C1835h4 c1835h4, float f, float f2, boolean z) {
        if (z) {
            m9597kk(c1835h4, f, f2);
        } else {
            m9604x1(c1835h4, f, f2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m9595k4(C1835h4 c1835h4, C12025x6 c12025x6) {
        m9576k4(c1835h4.f6634du, c12025x6);
    }

    /* JADX INFO: renamed from: k4 */
    private void m9576k4(C2631kk c2631kk, C12025x6 c12025x6) {
        Iterator<C2633x1> itM12022kk = c2631kk.m12022kk();
        if (itM12022kk.hasNext()) {
            C2633x1 next = itM12022kk.next();
            next.m12034k4(c12025x6);
            if (next.m12037x1() == 2 && itM12022kk.hasNext()) {
                itM12022kk.next().m12034k4(c12025x6);
            }
        }
    }
}
