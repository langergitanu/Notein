package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.nc */
/* JADX INFO: loaded from: classes4.dex */
public final class C8324nc extends AbstractC7361bz {

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f27205rv = new C7017h4("layoutId", "hidden", "ownerIdx", "uniqueId", "formatIdx", "tx", "spPr", "valueColors", "valueColorPositions", "dataPt", "dataLabels", "dataId", "layoutPr", "axisId", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C7597es f27206c5;

    /* JADX INFO: renamed from: ck */
    private C7922id f27207ck;

    /* JADX INFO: renamed from: du */
    private long f27208du;

    /* JADX INFO: renamed from: dy */
    private C8668rd f27209dy;

    /* JADX INFO: renamed from: fa */
    private C8572q2 f27210fa;

    /* JADX INFO: renamed from: h4 */
    private C8294mw f27211h4;

    /* JADX INFO: renamed from: jd */
    private List<C9296ym> f27212jd;

    /* JADX INFO: renamed from: k4 */
    private int f27213k4;

    /* JADX INFO: renamed from: kk */
    private long f27214kk;

    /* JADX INFO: renamed from: ks */
    private C7249ah f27215ks;

    /* JADX INFO: renamed from: m9 */
    private C8087kh f27216m9;

    /* JADX INFO: renamed from: to */
    private String f27217to;

    /* JADX INFO: renamed from: up */
    private C8317n8 f27218up;

    /* JADX INFO: renamed from: x1 */
    private boolean f27219x1;

    /* JADX INFO: renamed from: yj */
    private List<Long> f27220yj;

    public C8324nc() {
        this.f27213k4 = 0;
        this.f27219x1 = false;
        this.f27214kk = 4294967295L;
        this.f27208du = 4294967295L;
        this.f27212jd = new List<>();
        this.f27220yj = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final C8087kh m37378c5() {
        return this.f27216m9;
    }

    /* JADX INFO: renamed from: ck */
    public final C9296ym[] m37379ck() {
        return this.f27212jd.toArray(new C9296ym[0]);
    }

    /* JADX INFO: renamed from: du */
    public final int m37380du() {
        return this.f27213k4;
    }

    /* JADX INFO: renamed from: dy */
    public final C8294mw m37381dy() {
        return this.f27211h4;
    }

    /* JADX INFO: renamed from: fa */
    public final C7922id m37382fa() {
        return this.f27207ck;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m37383h4() {
        return this.f27219x1;
    }

    /* JADX INFO: renamed from: jd */
    public final C8668rd m37384jd() {
        return this.f27209dy;
    }

    /* JADX INFO: renamed from: kk */
    public final C9296ym m37394kk() {
        C9296ym c9296ym = new C9296ym();
        this.f27212jd.addItem(c9296ym);
        return c9296ym;
    }

    /* JADX INFO: renamed from: ks */
    public final C7249ah m37396ks() {
        return this.f27215ks;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m37397m9() {
        return this.f27208du;
    }

    /* JADX INFO: renamed from: to */
    public final C7922id m37398to() {
        if (this.f27207ck != null) {
            throw new Exception("Only one <dataLabels> element can be added.");
        }
        C7922id c7922id = new C7922id();
        this.f27207ck = c7922id;
        return c7922id;
    }

    /* JADX INFO: renamed from: up */
    public final C8572q2 m37399up() {
        return this.f27210fa;
    }

    /* JADX INFO: renamed from: yj */
    public final C8317n8 m37402yj() {
        return this.f27218up;
    }

    public C8324nc(final AbstractC13912i5 abstractC13912i5) {
        this();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8324nc.f27205rv.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8324nc.this.f27213k4 = C8047jz.m35062k4(str2);
                } else if (iM27428k4 == 1) {
                    C8324nc.this.f27219x1 = C13850af.m65068c5(str2);
                } else if (iM27428k4 == 2) {
                    C8324nc.this.f27214kk = C13850af.m65122ks(str2) & 4294967295L;
                } else if (iM27428k4 == 3) {
                    C8324nc.this.f27217to = str2;
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    C8324nc.this.f27208du = C13850af.m65122ks(str2) & 4294967295L;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.nc.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8324nc.f27205rv.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 5:
                        C8324nc.this.f27211h4 = new C8294mw(abstractC13912i5);
                        return true;
                    case 6:
                        C8324nc.this.f27216m9 = new C8087kh(abstractC13912i5);
                        return true;
                    case 7:
                        C8324nc.this.f27209dy = new C8668rd(abstractC13912i5);
                        return true;
                    case 8:
                        C8324nc.this.f27206c5 = new C7597es(abstractC13912i5);
                        return true;
                    case 9:
                        C8324nc.this.f27212jd.addItem(new C9296ym(abstractC13912i5));
                        return true;
                    case 10:
                        C8324nc.this.f27207ck = new C7922id(abstractC13912i5);
                        return true;
                    case 11:
                        C8324nc.this.f27210fa = new C8572q2(abstractC13912i5);
                        return true;
                    case 12:
                        C8324nc.this.f27218up = new C8317n8(abstractC13912i5);
                        return true;
                    case 13:
                        String strMo65052v4 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            strMo65052v4 = C14113y2.m67400k4(strMo65052v4, abstractC13912i5.mo65052v4());
                        }
                        C8324nc.this.f27220yj.addItem(Long.valueOf(C13850af.m65122ks(strMo65052v4) & 4294967295L));
                        return true;
                    case 14:
                        C8324nc.this.f27215ks = new C7249ah(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final void m37395kk(long j) {
        this.f27208du = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8087kh m37400x1() {
        if (this.f27216m9 != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f27216m9 = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m37401x1(long j) {
        this.f27214kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8294mw m37385k4() {
        if (this.f27211h4 != null) {
            throw new Exception("Only one <tx> element can be added.");
        }
        C8294mw c8294mw = new C8294mw();
        this.f27211h4 = c8294mw;
        return c8294mw;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37386k4(int i) {
        this.f27213k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37387k4(long j) {
        this.f27220yj.addItem(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37388k4(C7249ah c7249ah) {
        this.f27215ks = c7249ah;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37389k4(C8317n8 c8317n8) {
        this.f27218up = c8317n8;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37390k4(C8572q2 c8572q2) {
        this.f27210fa = c8572q2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37391k4(C8668rd c8668rd) {
        this.f27209dy = c8668rd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37392k4(String str) {
        this.f27217to = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("layoutId", C8047jz.m35063k4(this.f27213k4));
        boolean z = this.f27219x1;
        if (z) {
            c3059ii.m12955x1("hidden", z ? "1" : "0");
        }
        long j = this.f27214kk;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("ownerIdx", C13850af.m65147x1(j));
        }
        String str3 = this.f27217to;
        if (str3 != null) {
            c3059ii.m12955x1("uniqueId", str3);
        }
        long j2 = this.f27208du;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("formatIdx", C13850af.m65147x1(j2));
        }
        C8294mw c8294mw = this.f27211h4;
        if (c8294mw != null) {
            c8294mw.mo6846k4("cx", c3059ii, "tx");
        }
        C8087kh c8087kh = this.f27216m9;
        if (c8087kh != null) {
            c8087kh.mo6846k4("cx", c3059ii, "spPr");
        }
        C8668rd c8668rd = this.f27209dy;
        if (c8668rd != null) {
            c8668rd.mo6846k4("cx", c3059ii, "valueColors");
        }
        C7597es c7597es = this.f27206c5;
        if (c7597es != null) {
            c7597es.mo6846k4("cx", c3059ii, "valueColorPositions");
        }
        List.Enumerator<Long> it = this.f27212jd.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("cx", c3059ii, "dataPt");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C7922id c7922id = this.f27207ck;
        if (c7922id != null) {
            c7922id.mo6846k4("cx", c3059ii, "dataLabels");
        }
        C8572q2 c8572q2 = this.f27210fa;
        if (c8572q2 != null) {
            c8572q2.mo6846k4("cx", c3059ii, "dataId");
        }
        C8317n8 c8317n8 = this.f27218up;
        if (c8317n8 != null) {
            c8317n8.mo6846k4("cx", c3059ii, "layoutPr");
        }
        it = this.f27220yj.iterator();
        while (it.hasNext()) {
            try {
                long jLongValue = ((Long) C7019kk.m27464to(it.next(), Long.TYPE)).longValue();
                c3059ii.mo12953k4(str, "axisId", (String) null);
                c3059ii.m12955x1("val", C14114y9.m67465x1(jLongValue));
                c3059ii.mo21898jd();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C7249ah c7249ah = this.f27215ks;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37393k4(boolean z) {
        this.f27219x1 = z;
    }
}
