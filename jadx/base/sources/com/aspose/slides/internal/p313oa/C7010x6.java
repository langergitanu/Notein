package com.aspose.slides.internal.p313oa;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C7010x6 {

    /* JADX INFO: renamed from: k4 */
    private C6990ix f19065k4 = null;

    /* JADX INFO: renamed from: kk */
    private ArrayList f19066kk = new ArrayList();

    /* JADX INFO: renamed from: x1 */
    private C6991jd f19067x1;

    public C7010x6() {
        this.f19067x1 = new C6991jd();
        this.f19067x1 = new C6991jd();
    }

    /* JADX INFO: renamed from: kk */
    private void m27419kk() {
        this.f19067x1.f19017k4 = this.f19065k4.m27352kk();
        this.f19067x1.f19025x1 = this.f19065k4.m27352kk();
        this.f19067x1.f19018kk = this.f19065k4.m27352kk();
        this.f19067x1.f19023to = C7019kk.m27462to(Long.valueOf(this.f19065k4.m27352kk()), 10);
        this.f19067x1.f19012du = C7019kk.m27462to(Long.valueOf(this.f19065k4.m27352kk()), 10);
        this.f19067x1.f19015h4 = C7019kk.m27462to(Long.valueOf(this.f19065k4.m27352kk()), 10);
        this.f19067x1.f19020m9.f19061k4 = this.f19065k4.m27356x1();
        this.f19067x1.f19020m9.f19064x1 = this.f19065k4.m27356x1();
        this.f19067x1.f19020m9.f19062kk = this.f19065k4.m27356x1();
        this.f19067x1.f19020m9.f19063to = this.f19065k4.m27356x1();
        this.f19067x1.f19020m9.f19059du = this.f19065k4.m27356x1();
        this.f19067x1.f19020m9.f19060h4 = this.f19065k4.m27356x1();
        this.f19067x1.f19013dy = this.f19065k4.m27352kk();
        this.f19067x1.f19010c5 = C7019kk.m27435du(Long.valueOf(this.f19065k4.m27352kk()), 10);
        this.f19067x1.f19016jd = C7019kk.m27435du(Long.valueOf(this.f19065k4.m27352kk()), 10);
        this.f19067x1.f19011ck = this.f19065k4.m27352kk();
        this.f19067x1.f19014fa = this.f19065k4.m27352kk();
        this.f19067x1.f19024up = this.f19065k4.m27354to();
        this.f19067x1.f19027yj = C7019kk.m27462to(Long.valueOf(this.f19065k4.m27352kk()), 10);
        this.f19067x1.f19019ks.f19006k4 = C7019kk.m27437dy(Long.valueOf(this.f19065k4.m27352kk()), 10) / 65536.0f;
        this.f19067x1.f19019ks.f19008x1 = C7019kk.m27437dy(Long.valueOf(this.f19065k4.m27352kk()), 10) / 65536.0f;
        this.f19067x1.f19019ks.f19007kk = C7019kk.m27437dy(Long.valueOf(this.f19065k4.m27352kk()), 10) / 65536.0f;
        this.f19067x1.f19022rv = this.f19065k4.m27352kk();
        this.f19067x1.f19026x6 = this.f19065k4.m27351k4(16);
        this.f19067x1.f19021ne = this.f19065k4.m27351k4(28);
        if (C7019kk.m27435du(Long.valueOf(this.f19067x1.f19013dy), 10) != C7019kk.m27435du((Object) 1633907568L, 10)) {
            throw new C7004up();
        }
        this.f19066kk.clear();
        C7001ts c7001ts = new C7001ts();
        long jM27352kk = this.f19065k4.m27352kk();
        for (int i = 0; i < C7019kk.m27435du(Long.valueOf(jM27352kk), 10); i++) {
            c7001ts.f19045k4 = C7019kk.m27462to(Long.valueOf(this.f19065k4.m27352kk()), 10);
            c7001ts.f19047x1 = this.f19065k4.m27352kk();
            c7001ts.f19046kk = this.f19065k4.m27352kk();
            this.f19066kk.addItem(new C6998qq(c7001ts.Clone()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC7002u4 m27420k4(int i) {
        C6998qq c6998qq;
        Iterator<E> it = this.f19066kk.iterator();
        while (true) {
            if (!it.hasNext()) {
                c6998qq = null;
                break;
            }
            c6998qq = (C6998qq) it.next();
            if (c6998qq.m27376k4().f19045k4 == i) {
                break;
            }
        }
        if (c6998qq == null) {
            return null;
        }
        if (c6998qq.m27378x1() == null) {
            m27418k4(c6998qq);
        }
        return c6998qq.m27378x1();
    }

    /* JADX INFO: renamed from: x1 */
    public C6991jd m27423x1() {
        return this.f19067x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m27421k4() {
        this.f19065k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public void m27422k4(AbstractC3150x6 abstractC3150x6) {
        this.f19065k4 = new C6990ix(abstractC3150x6);
        m27419kk();
    }

    /* JADX INFO: renamed from: k4 */
    private void m27418k4(C6998qq c6998qq) {
        AbstractC6994ks abstractC6994ks;
        int i;
        int i2;
        this.f19065k4.m27350k4(C7019kk.m27438h4(Long.valueOf(c6998qq.m27376k4().f19047x1), 10));
        AbstractC7002u4 abstractC7002u4M27400k4 = AbstractC7002u4.m27400k4(C7019kk.m27462to(Long.valueOf(this.f19065k4.m27352kk()), 10));
        this.f19065k4.m27350k4(C7019kk.m27438h4(Long.valueOf(c6998qq.m27376k4().f19047x1), 10));
        abstractC7002u4M27400k4.mo27374k4(this.f19065k4);
        int i3 = c6998qq.m27376k4().f19045k4;
        switch (i3) {
            case 1093812784:
            case 1093812785:
            case 1093812786:
                if (C7019kk.m27469x1(abstractC7002u4M27400k4, AbstractC6994ks.class)) {
                    abstractC6994ks = (AbstractC6994ks) abstractC7002u4M27400k4;
                    i = m27423x1().f19012du;
                    i2 = m27423x1().f19015h4;
                    abstractC6994ks.mo27368k4(i, i2);
                }
                break;
            default:
                switch (i3) {
                    case 1110589744:
                    case 1110589745:
                    case 1110589746:
                        if (C7019kk.m27469x1(abstractC7002u4M27400k4, AbstractC6994ks.class)) {
                            abstractC6994ks = (AbstractC6994ks) abstractC7002u4M27400k4;
                            i = m27423x1().f19015h4;
                            i2 = m27423x1().f19012du;
                            abstractC6994ks.mo27368k4(i, i2);
                        }
                        break;
                }
                break;
        }
        c6998qq.m27377k4(abstractC7002u4M27400k4);
    }
}
