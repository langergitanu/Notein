package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ay */
/* JADX INFO: loaded from: classes4.dex */
public class C7279ay extends AbstractC9290yj {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f20312du = new C7017h4("nvGrpSpPr", "grpSpPr", "sp", "grpSp", "AlternateContent", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C9081w0 f20313k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f20314kk;

    /* JADX INFO: renamed from: to */
    private C8397nz f20315to;

    /* JADX INFO: renamed from: x1 */
    private C7664fe f20316x1;

    public C7279ay() {
        m28593h4();
        this.f20313k4 = new C9081w0();
        this.f20316x1 = new C7664fe();
    }

    /* JADX INFO: renamed from: h4 */
    private void m28593h4() {
        this.f20314kk = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: kk */
    public List<C7394ca> mo28601kk() {
        return this.f20314kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: to */
    public AbstractC7414ck mo28602to() {
        return this.f20315to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: x1 */
    public C7664fe mo28603x1() {
        return this.f20316x1;
    }

    public C7279ay(final AbstractC13912i5 abstractC13912i5) {
        m28593h4();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ay.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = C7279ay.f20312du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7279ay.this.f20313k4 = new C9081w0(abstractC13912i5);
                } else if (iM27428k4 != 1) {
                    if (iM27428k4 == 2) {
                        C8073kc c8073kc = new C8073kc(abstractC13912i5);
                        list = C7279ay.this.f20314kk;
                        c7394ca = new C7394ca("sp", c8073kc);
                    } else if (iM27428k4 == 3) {
                        C7279ay c7279ay = new C7279ay(abstractC13912i5);
                        list = C7279ay.this.f20314kk;
                        c7394ca = new C7394ca("grpSp", c7279ay);
                    } else if (iM27428k4 == 4) {
                        C7639f6 c7639f6 = new C7639f6(abstractC13912i5);
                        list = C7279ay.this.f20314kk;
                        c7394ca = new C7394ca("AlternateContent", c7639f6);
                    } else {
                        if (iM27428k4 != 5) {
                            return false;
                        }
                        C7279ay.this.f20315to = new C8397nz(abstractC13912i5);
                    }
                    list.addItem(c7394ca);
                } else {
                    C7279ay.this.f20316x1 = new C7664fe(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: k4 */
    public C7394ca mo28598k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f20312du.m27428k4(str);
        if (iM27428k4 == 2) {
            c7394ca = new C7394ca("sp", new C8073kc());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("grpSp", new C7279ay());
        } else {
            if (iM27428k4 != 4) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("AlternateContent", new C7639f6());
        }
        this.f20314kk.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: k4 */
    public AbstractC8125ks mo28599k4() {
        return this.f20313k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: k4 */
    public void mo28600k4(AbstractC7414ck abstractC7414ck) {
        this.f20315to = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f20313k4.mo6846k4("dsp", c3059ii, "nvGrpSpPr");
        this.f20316x1.mo6846k4("dsp", c3059ii, "grpSpPr");
        List.Enumerator<C7394ca> it = this.f20314kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f20312du.m27428k4(next.m29539k4());
                if (iM27428k4 == 2) {
                    ((C8073kc) next.m29541kk()).mo6846k4("dsp", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 3) {
                    ((C7279ay) next.m29541kk()).mo6846k4("dsp", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 4) {
                    ((C7639f6) next.m29541kk()).mo6846k4("mc", c3059ii, next.m29539k4());
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C8397nz c8397nz = this.f20315to;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dsp", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
