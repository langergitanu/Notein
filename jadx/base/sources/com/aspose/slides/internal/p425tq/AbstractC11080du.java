package com.aspose.slides.internal.p425tq;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p034b3.C1577ak;
import com.aspose.slides.internal.p034b3.C1578ar;
import com.aspose.slides.internal.p034b3.C1580bv;
import com.aspose.slides.internal.p034b3.C1581c5;
import com.aspose.slides.internal.p034b3.C1582ck;
import com.aspose.slides.internal.p034b3.C1585dy;
import com.aspose.slides.internal.p034b3.C1586fa;
import com.aspose.slides.internal.p034b3.C1593lr;
import com.aspose.slides.internal.p034b3.C1596qq;
import com.aspose.slides.internal.p034b3.C1597rv;
import com.aspose.slides.internal.p034b3.C1602uz;
import com.aspose.slides.internal.p034b3.C1603v4;
import com.aspose.slides.internal.p034b3.C1605wy;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p034b3.C1608yd;
import com.aspose.slides.internal.p034b3.C1609yj;
import com.aspose.slides.internal.p034b3.InterfaceC1588ix;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p150gi.C4288qq;
import com.aspose.slides.internal.p150gi.C4305wl;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p486wy.C12311c5;
import com.aspose.slides.internal.p486wy.C12312ck;
import com.aspose.slides.internal.p486wy.C12313du;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.internal.p486wy.C12315fa;
import com.aspose.slides.internal.p486wy.C12316h4;
import com.aspose.slides.internal.p486wy.C12317jd;
import com.aspose.slides.internal.p486wy.C12320ks;
import com.aspose.slides.internal.p486wy.C12321m9;
import com.aspose.slides.internal.p486wy.C12323to;
import com.aspose.slides.internal.p486wy.C12324up;
import com.aspose.slides.internal.p486wy.C12326x6;
import com.aspose.slides.internal.p486wy.C12327yj;
import com.aspose.slides.internal.p513xw.C12737w6;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.tq.du */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11080du implements InterfaceC11079ck {

    /* JADX INFO: renamed from: dy */
    protected static final InterfaceC1986to f38405dy = C4305wl.m17278k4(C4288qq.m17258k4(9, "AUTO"));

    /* JADX INFO: renamed from: c5 */
    protected C1608yd f38406c5;

    /* JADX INFO: renamed from: h4 */
    protected C12737w6 f38408h4;

    /* JADX INFO: renamed from: x1 */
    protected C12814to f38413x1;

    /* JADX INFO: renamed from: kk */
    protected C11094u4 f38410kk = new C11094u4(0);

    /* JADX INFO: renamed from: to */
    protected int f38412to = 0;

    /* JADX INFO: renamed from: du */
    protected int f38407du = 0;

    /* JADX INFO: renamed from: m9 */
    protected InterfaceC1986to f38411m9 = C4305wl.m17278k4(C4288qq.m17258k4(9, "AUTO"));

    /* JADX INFO: renamed from: jd */
    protected int f38409jd = 0;

    public AbstractC11080du(C12814to c12814to) {
        this.f38413x1 = null;
        this.f38413x1 = c12814to;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m53543x1(C1602uz c1602uz) {
        List<C12314dy> listM8640wl = c1602uz.m8640wl();
        int size = listM8640wl.size();
        int iM8678x1 = 0;
        for (int i = 0; i < size; i++) {
            iM8678x1 += listM8640wl.get_Item(i).m8678x1();
        }
        return iM8678x1 - c1602uz.m8678x1();
    }

    @Override // com.aspose.slides.internal.p425tq.InterfaceC11079ck
    /* JADX INFO: renamed from: c5 */
    public void mo22100c5() {
    }

    /* JADX INFO: renamed from: ck */
    public final C12737w6 m53544ck() {
        return this.f38408h4;
    }

    @Override // com.aspose.slides.internal.p425tq.InterfaceC11079ck
    /* JADX INFO: renamed from: dy */
    public abstract String mo22102dy();

    /* JADX INFO: renamed from: fa */
    public abstract void mo22103fa();

    @Override // com.aspose.slides.internal.p425tq.InterfaceC11079ck
    /* JADX INFO: renamed from: jd */
    public final boolean mo53538jd() {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo53545k4(C1578ar c1578ar) {
        List<C1606x1> listM8584v4 = c1578ar.m8584v4();
        if (listM8584v4 != null) {
            m53548k4((C1581c5) null, listM8584v4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo22115k4(C1609yj c1609yj, C12007ix c12007ix);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo53561k4(C12314dy c12314dy);

    /* JADX INFO: renamed from: kk */
    public final C11913yj m53566kk(C11913yj c11913yj) {
        float[] fArrM55776k4 = c11913yj.m55776k4();
        fArrM55776k4[4] = fArrM55776k4[4] / 1000.0f;
        fArrM55776k4[5] = fArrM55776k4[5] / 1000.0f;
        return new C11913yj(fArrM55776k4[0], fArrM55776k4[1], fArrM55776k4[2], fArrM55776k4[3], fArrM55776k4[4], fArrM55776k4[5]);
    }

    @Override // com.aspose.slides.internal.p425tq.InterfaceC11079ck
    /* JADX INFO: renamed from: m9 */
    public C12814to mo22134m9() {
        return this.f38413x1;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo53567x1(C1581c5 c1581c5);

    /* JADX INFO: renamed from: k4 */
    public final void m53546k4(C1580bv c1580bv) {
        C1608yd c1608ydM8495k4 = c1580bv.m8495k4(57);
        if (c1608ydM8495k4 != null) {
            m53568x1(c1608ydM8495k4);
        }
        C1608yd c1608ydM8495k42 = c1580bv.m8495k4(61);
        if (c1608ydM8495k42 != null) {
            m53568x1(c1608ydM8495k42);
        }
        C1608yd c1608ydM8495k43 = c1580bv.m8495k4(59);
        if (c1608ydM8495k43 != null) {
            m53568x1(c1608ydM8495k43);
        }
        C1608yd c1608ydM8495k44 = c1580bv.m8495k4(56);
        if (c1608ydM8495k44 != null) {
            m53568x1(c1608ydM8495k44);
        }
        C1608yd c1608ydM8495k45 = c1580bv.m8495k4(58);
        if (c1608ydM8495k45 != null) {
            m53568x1(c1608ydM8495k45);
        }
    }

    /* JADX INFO: renamed from: kk */
    public void mo22133kk(C1581c5 c1581c5) {
        InterfaceC1986to interfaceC1986to = (InterfaceC1986to) c1581c5.m8655du(43);
        if (interfaceC1986to == null) {
            interfaceC1986to = f38405dy;
        }
        this.f38411m9 = interfaceC1986to;
        List<C1606x1> listM8584v4 = c1581c5.m8584v4();
        if (C7019kk.m27469x1(c1581c5, C1582ck.class)) {
            if (listM8584v4 != null) {
                mo53549k4((C1582ck) c1581c5, listM8584v4);
                return;
            }
            if (c1581c5.m8675rv() != 57) {
                mo53547k4(c1581c5);
            }
            C11094u4 c11094u4 = this.f38410kk;
            c11094u4.m53613k4(c1581c5.m8654du() + c11094u4.m53612k4());
            return;
        }
        if (c1581c5.m8673m9(31)) {
            mo53567x1(c1581c5);
            return;
        }
        int i = this.f38412to;
        this.f38410kk.m53616x1();
        this.f38412to = c1581c5.m8588yd() + this.f38412to;
        C11094u4 c11094u42 = this.f38410kk;
        c11094u42.m53613k4(c1581c5.m8578ak() + c11094u42.m53612k4());
        C11094u4 c11094u43 = this.f38410kk;
        c11094u43.m53613k4(c1581c5.m8682yj() + c11094u43.m53612k4());
        mo53547k4(c1581c5);
        if (listM8584v4 != null) {
            m53548k4(c1581c5, listM8584v4);
        }
        if (c1581c5.m8510u4() == 2) {
            this.f38410kk.m53614kk();
            return;
        }
        this.f38412to = i;
        this.f38410kk.m53614kk();
        C11094u4 c11094u44 = this.f38410kk;
        c11094u44.m53613k4(c1581c5.m8654du() + c11094u44.m53612k4());
    }

    /* JADX INFO: renamed from: x1 */
    public void m53568x1(C1608yd c1608yd) {
        this.f38410kk.m53613k4(0);
        this.f38412to = 0;
        C1593lr c1593lrM8684u4 = c1608yd.m8684u4();
        mo53557k4(c1608yd);
        mo22115k4(c1593lrM8684u4.m8598yd(), c1608yd.m8685uz().Clone());
        if (c1593lrM8684u4.m8597wy() == 58) {
            this.f38406c5 = c1608yd;
            m53551k4((C1586fa) c1593lrM8684u4);
            this.f38406c5 = null;
        } else {
            m53552k4(c1593lrM8684u4);
        }
        mo22103fa();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo53547k4(C1581c5 c1581c5) {
    }

    /* JADX INFO: renamed from: x1 */
    public void m53569x1(C12314dy c12314dy) {
        if (C7019kk.m27469x1(c12314dy, C12320ks.class)) {
            mo22126k4((C12320ks) c12314dy);
            return;
        }
        if (C7019kk.m27469x1(c12314dy, C12326x6.class)) {
            m53564k4((C12326x6) c12314dy);
            return;
        }
        if (C7019kk.m27469x1(c12314dy, C12327yj.class)) {
            m53565k4((C12327yj) c12314dy);
            return;
        }
        if (C7019kk.m27469x1(c12314dy, C12317jd.class)) {
            mo22125k4((C12317jd) c12314dy);
            return;
        }
        if (C7019kk.m27469x1(c12314dy, C12311c5.class)) {
            m53559k4((C12311c5) c12314dy);
            return;
        }
        if (C7019kk.m27469x1(c12314dy, C12324up.class)) {
            m53563k4((C12324up) c12314dy);
        } else if (C7019kk.m27469x1(c12314dy, C12312ck.class)) {
            mo53560k4((C12312ck) c12314dy);
        } else if (C7019kk.m27469x1(c12314dy, C12315fa.class)) {
            mo22123k4((C12315fa) c12314dy);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m53548k4(C1581c5 c1581c5, List<C1606x1> list) {
        int i = this.f38412to;
        if (c1581c5 != null && !c1581c5.m8673m9(32)) {
            C11094u4 c11094u4 = this.f38410kk;
            c11094u4.m53613k4(c1581c5.m8656dy() + c11094u4.m53612k4());
        }
        this.f38410kk.m53612k4();
        int i2 = this.f38412to;
        this.f38407du = i2;
        for (int i3 = 0; i3 < list.size(); i3++) {
            C1606x1 c1606x1 = list.get_Item(i3);
            if (C7019kk.m27469x1(c1606x1, C1581c5.class)) {
                this.f38412to = i2;
                C1581c5 c1581c52 = (C1581c5) c1606x1;
                this.f38412to = c1581c52.m8501bv() + i2;
                this.f38407du = i2;
                mo22133kk(c1581c52);
                this.f38407du = i2;
            } else if (C7019kk.m27469x1(c1606x1, C1602uz.class)) {
                C1602uz c1602uz = (C1602uz) c1606x1;
                if (c1581c5 != null) {
                    int iM8660fa = c1581c5.m8660fa();
                    c1581c5.m8677up();
                    this.f38412to = (c1581c5.m8513wl() - iM8660fa) + this.f38412to;
                }
                this.f38412to = c1602uz.m8637u4() + this.f38412to;
                m53555k4(c1602uz);
                C11094u4 c11094u42 = this.f38410kk;
                c11094u42.m53613k4(c1602uz.m8654du() + c11094u42.m53612k4());
            }
            this.f38412to = i;
        }
    }

    @Override // com.aspose.slides.internal.p425tq.InterfaceC11079ck
    /* JADX INFO: renamed from: x1 */
    public void mo22141x1(C12737w6 c12737w6) {
        this.f38408h4 = c12737w6;
        try {
            m53546k4(c12737w6.m59335du());
        } finally {
            this.f38408h4 = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo53549k4(C1582ck c1582ck, List<C1606x1> list) {
        if (c1582ck.m8510u4() != 2) {
            int i = this.f38412to;
            this.f38410kk.m53616x1();
            mo53547k4(c1582ck);
            m53548k4((C1581c5) c1582ck, list);
            this.f38412to = i;
            this.f38410kk.m53614kk();
            C11094u4 c11094u4 = this.f38410kk;
            c11094u4.m53613k4(c1582ck.m8654du() + c11094u4.m53612k4());
            return;
        }
        int i2 = this.f38412to;
        this.f38410kk.m53616x1();
        C12007ix c12007ixClone = C12007ix.f40519k4.Clone();
        if (c1582ck.m8517e0()) {
            c12007ixClone = new C12007ix(i2, this.f38410kk.m53612k4(), c1582ck.m8678x1(), c1582ck.mo8658e_());
        }
        C1609yj c1609yjM8523ts = c1582ck.m8523ts();
        this.f38412to = 0;
        this.f38410kk.m53613k4(0);
        mo22115k4(c1609yjM8523ts, c12007ixClone.Clone());
        mo53547k4(c1582ck);
        m53548k4((C1581c5) c1582ck, list);
        mo22103fa();
        this.f38412to = i2;
        this.f38410kk.m53614kk();
    }

    /* JADX INFO: renamed from: k4 */
    public void m53550k4(C1585dy c1585dy) {
        List<C1606x1> listM8584v4 = c1585dy.m8584v4();
        if (listM8584v4 != null) {
            m53548k4((C1581c5) null, listM8584v4);
            C1581c5 c1581c5M8563u4 = c1585dy.m8563u4();
            if (c1581c5M8563u4 != null) {
                mo22133kk(c1581c5M8563u4);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53551k4(C1586fa c1586fa) {
        C1585dy c1585dyM8568um = c1586fa.m8568um();
        if (c1585dyM8568um != null) {
            m53550k4(c1585dyM8568um);
        }
        C1605wy c1605wyM8567u4 = c1586fa.m8567u4();
        if (c1605wyM8567u4 != null) {
            m53556k4(c1605wyM8567u4);
        }
        C1596qq c1596qqM8566qq = c1586fa.m8566qq();
        if (c1596qqM8566qq != null) {
            m53553k4(c1596qqM8566qq);
        }
        C1597rv c1597rvM8565bv = c1586fa.m8565bv();
        if (c1597rvM8565bv != null) {
            m53554k4(c1597rvM8565bv);
        }
    }

    @Override // com.aspose.slides.internal.p425tq.InterfaceC11079ck
    /* JADX INFO: renamed from: k4 */
    public void mo53539k4(InterfaceC1588ix interfaceC1588ix) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53552k4(C1593lr c1593lr) {
        m53548k4((C1581c5) null, c1593lr.m8593b3());
    }

    /* JADX INFO: renamed from: k4 */
    public void m53553k4(C1596qq c1596qq) {
        List<C1577ak> listM8616u4 = c1596qq.m8616u4();
        this.f38410kk.m53616x1();
        int iM53612k4 = this.f38410kk.m53612k4();
        int i = this.f38412to;
        for (int i2 = 0; i2 < listM8616u4.size(); i2++) {
            C1577ak c1577ak = listM8616u4.get_Item(i2);
            int iM8672m9 = c1577ak.m8672m9();
            if (iM8672m9 < 0) {
                iM8672m9 = 0;
            }
            int i3 = iM8672m9 & 1;
            if (i3 == 1) {
                int iM8678x1 = c1577ak.m8678x1() + this.f38412to;
                this.f38412to = iM8678x1;
                this.f38412to = c1596qq.m8614ar() + iM8678x1;
            }
            for (int i4 = 0; i4 < c1577ak.m8478u4(); i4++) {
                C1578ar c1578arM8474c5 = c1577ak.m8474c5(i4);
                if (c1578arM8474c5 != null) {
                    this.f38410kk.m53613k4(iM53612k4);
                    if (i3 == 1) {
                        int iM8678x12 = this.f38412to - c1578arM8474c5.m8678x1();
                        this.f38412to = iM8678x12;
                        this.f38412to = iM8678x12 - c1596qq.m8614ar();
                    }
                    mo53545k4(c1578arM8474c5);
                    if (i3 == 0) {
                        int iM8678x13 = c1578arM8474c5.m8678x1() + this.f38412to;
                        this.f38412to = iM8678x13;
                        this.f38412to = c1596qq.m8614ar() + iM8678x13;
                    }
                }
            }
            this.f38412to = i;
            this.f38410kk.m53613k4(c1577ak.m8482wl() + iM53612k4);
            iM53612k4 = this.f38410kk.m53612k4();
        }
        this.f38410kk.m53614kk();
    }

    /* JADX INFO: renamed from: k4 */
    public void m53554k4(C1597rv c1597rv) {
        C11094u4 c11094u4 = this.f38410kk;
        c11094u4.m53613k4(c1597rv.m8624uz() + c11094u4.m53612k4());
        List<C1606x1> listM8584v4 = c1597rv.m8584v4();
        if (listM8584v4 != null) {
            C1581c5 c1581c5M8623u4 = c1597rv.m8623u4();
            if (c1581c5M8623u4 != null) {
                mo22133kk(c1581c5M8623u4);
            }
            m53548k4((C1581c5) null, listM8584v4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m53555k4(C1602uz c1602uz) {
        List<C12314dy> listM8640wl = c1602uz.m8640wl();
        this.f38410kk.m53616x1();
        C11094u4 c11094u4 = this.f38410kk;
        c11094u4.m53613k4(c1602uz.m8682yj() + c11094u4.m53612k4());
        int iM8672m9 = c1602uz.m8672m9();
        if (iM8672m9 < 0 || (iM8672m9 & 1) == 0) {
            this.f38412to = c1602uz.m8636qq() + this.f38412to;
        } else {
            this.f38412to = c1602uz.m8631ar() + this.f38412to;
            int iM53543x1 = m53543x1(c1602uz);
            if (iM53543x1 > 0) {
                this.f38412to -= iM53543x1;
            }
        }
        int size = listM8640wl.size();
        for (int i = 0; i < size; i++) {
            C12314dy c12314dy = listM8640wl.get_Item(i);
            int i2 = c12314dy.f41170c5;
            if (i2 != 0) {
                this.f38409jd = i2;
                try {
                    m53569x1(c12314dy);
                } finally {
                    this.f38409jd = 0;
                }
            } else {
                m53569x1(c12314dy);
            }
        }
        this.f38410kk.m53614kk();
    }

    @Override // com.aspose.slides.internal.p425tq.InterfaceC11079ck
    /* JADX INFO: renamed from: k4 */
    public void mo53540k4(C1603v4 c1603v4) {
    }

    /* JADX INFO: renamed from: k4 */
    public void m53556k4(C1605wy c1605wy) {
        List<C1606x1> listM8584v4 = c1605wy.m8584v4();
        if (listM8584v4 != null) {
            m53548k4((C1581c5) null, listM8584v4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo53557k4(C1608yd c1608yd) {
    }

    @Override // com.aspose.slides.internal.p425tq.InterfaceC11079ck
    /* JADX INFO: renamed from: k4 */
    public void mo22116k4(AbstractC3150x6 abstractC3150x6) {
        if (this.f38413x1 == null) {
            throw new InvalidOperationException("FOUserAgent has not been set on Renderer");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53558k4(C11096uz c11096uz, XmlDocument xmlDocument, String str) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p425tq.InterfaceC11079ck
    /* JADX INFO: renamed from: k4 */
    public void mo53541k4(C11697x1 c11697x1) {
    }

    /* JADX INFO: renamed from: k4 */
    public void m53559k4(C12311c5 c12311c5) {
        mo53561k4((C12314dy) c12311c5);
        this.f38412to = c12311c5.m8660fa() + this.f38412to;
        this.f38410kk.m53616x1();
        C11094u4 c11094u4 = this.f38410kk;
        c11094u4.m53613k4(c12311c5.m57577um() + c11094u4.m53612k4());
        mo22133kk(c12311c5.m57558u4());
        this.f38410kk.m53614kk();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo53560k4(C12312ck c12312ck) {
        C1606x1 c1606x1M57563wl = c12312ck.m57563wl();
        this.f38410kk.m53616x1();
        C11094u4 c11094u4 = this.f38410kk;
        c11094u4.m53613k4(c12312ck.m57577um() + c11094u4.m53612k4());
        C12007ix c12007ixClone = c12312ck.m57562uz().Clone();
        if (C7019kk.m27469x1(c1606x1M57563wl, C12321m9.class)) {
            mo22128k4((C12321m9) c1606x1M57563wl, c12007ixClone.Clone());
        } else if (C7019kk.m27469x1(c1606x1M57563wl, C12323to.class)) {
            m53562k4((C12323to) c1606x1M57563wl);
        } else if (C7019kk.m27469x1(c1606x1M57563wl, C12316h4.class)) {
            mo22124k4((C12316h4) c1606x1M57563wl, c12007ixClone.Clone());
        } else if (C7019kk.m27469x1(c1606x1M57563wl, C12311c5.class)) {
            m53559k4((C12311c5) c1606x1M57563wl);
        }
        this.f38412to = c12312ck.m8659f_() + this.f38412to;
        this.f38410kk.m53614kk();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo22123k4(C12315fa c12315fa) {
        this.f38412to = c12315fa.m8659f_() + this.f38412to;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo22124k4(C12316h4 c12316h4, C12007ix c12007ix) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo22125k4(C12317jd c12317jd) {
        int iM8672m9 = c12317jd.m8672m9();
        List<C12314dy> listMo57566d_ = c12317jd.mo57566d_();
        mo53561k4((C12314dy) c12317jd);
        int i = this.f38412to;
        this.f38410kk.m53616x1();
        if (C7019kk.m27469x1(c12317jd, C12313du.class) && (iM8672m9 & 1) != 0) {
            int size = listMo57566d_.size();
            for (int i2 = 0; i2 < size; i2++) {
                listMo57566d_.get_Item(i2).m8659f_();
            }
            c12317jd.m8659f_();
        }
        this.f38412to = c12317jd.m8652c5() + c12317jd.m8660fa() + this.f38412to;
        C11094u4 c11094u4 = this.f38410kk;
        c11094u4.m53613k4(c12317jd.m57577um() + c11094u4.m53612k4());
        int size2 = listMo57566d_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            m53569x1(listMo57566d_.get_Item(i3));
        }
        this.f38412to = c12317jd.m8659f_() + i;
        this.f38410kk.m53614kk();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo22126k4(C12320ks c12320ks) {
        List<C12314dy> listMo57566d_ = c12320ks.mo57566d_();
        int i = this.f38412to;
        int size = listMo57566d_.size();
        for (int i2 = 0; i2 < size; i2++) {
            m53569x1(listMo57566d_.get_Item(i2));
        }
        this.f38412to = c12320ks.m8659f_() + i;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo22128k4(C12321m9 c12321m9, C12007ix c12007ix) {
    }

    /* JADX INFO: renamed from: k4 */
    public void m53562k4(C12323to c12323to) {
        int i = this.f38412to;
        this.f38410kk.m53616x1();
        m53548k4((C1581c5) null, c12323to.m57610u4());
        this.f38412to = i;
        this.f38410kk.m53614kk();
    }

    /* JADX INFO: renamed from: k4 */
    public void m53563k4(C12324up c12324up) {
        mo53561k4((C12314dy) c12324up);
        this.f38412to = c12324up.m8659f_() + this.f38412to;
    }

    /* JADX INFO: renamed from: k4 */
    public void m53564k4(C12326x6 c12326x6) {
        this.f38412to = c12326x6.m8659f_() + this.f38412to;
    }

    /* JADX INFO: renamed from: k4 */
    public void m53565k4(C12327yj c12327yj) {
        this.f38412to = c12327yj.m8659f_() + this.f38412to;
    }

    @Override // com.aspose.slides.internal.p425tq.InterfaceC11079ck
    /* JADX INFO: renamed from: k4 */
    public final void mo53542k4(C12737w6 c12737w6) {
    }
}
