package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pt */
/* JADX INFO: loaded from: classes4.dex */
public class C8547pt extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f28567m9 = new C7017h4("name", "themeElements", "objectDefaults", "extraClrSchemeLst", "custClrLst", "extLst");

    /* JADX INFO: renamed from: du */
    private C8025jn f28568du;

    /* JADX INFO: renamed from: h4 */
    private C8397nz f28569h4;

    /* JADX INFO: renamed from: k4 */
    private String f28570k4;

    /* JADX INFO: renamed from: kk */
    private C8004ji f28571kk;

    /* JADX INFO: renamed from: to */
    private C8538po f28572to;

    /* JADX INFO: renamed from: x1 */
    private C8206lq f28573x1;

    public C8547pt() {
        m39110c5();
        this.f28573x1 = new C8206lq();
    }

    /* JADX INFO: renamed from: c5 */
    private void m39110c5() {
        this.f28570k4 = "";
    }

    /* JADX INFO: renamed from: du */
    public final C8538po m39113du() {
        return this.f28572to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8025jn m39114h4() {
        return this.f28568du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8538po m39115k4() {
        if (this.f28572to != null) {
            throw new Exception("Only one <extraClrSchemeLst> element can be added.");
        }
        C8538po c8538po = new C8538po();
        this.f28572to = c8538po;
        return c8538po;
    }

    /* JADX INFO: renamed from: kk */
    public final C8206lq m39120kk() {
        return this.f28573x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC7414ck m39121m9() {
        return this.f28569h4;
    }

    /* JADX INFO: renamed from: to */
    public final C8004ji m39122to() {
        return this.f28571kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m39123x1() {
        return this.f28570k4;
    }

    public C8547pt(AbstractC13912i5 abstractC13912i5) {
        m39110c5();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8547pt.f28567m9.m27428k4(str) != 0) {
                    return false;
                }
                C8547pt.this.f28570k4 = str2;
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() != 15 || !C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    if (abstractC13912i5.mo65028jd() == 1) {
                        int iM27428k4 = f28567m9.m27428k4(abstractC13912i5.mo65023fa());
                        if (iM27428k4 == 1) {
                            this.f28573x1 = new C8206lq(abstractC13912i5);
                            break;
                        }
                        if (iM27428k4 == 2) {
                            this.f28571kk = new C8004ji(abstractC13912i5);
                        } else if (iM27428k4 == 3) {
                            this.f28572to = new C8538po(abstractC13912i5);
                            break;
                        } else if (iM27428k4 == 4) {
                            this.f28568du = new C8025jn(abstractC13912i5);
                            break;
                        } else {
                            if (iM27428k4 == 5) {
                                this.f28569h4 = new C8397nz(abstractC13912i5);
                                break;
                            }
                            abstractC13912i5.mo65208bv();
                        }
                        if (abstractC13912i5.mo65015ar()) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39116k4(C7259am c7259am) {
        this.f28571kk = (C8004ji) c7259am;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39117k4(AbstractC7414ck abstractC7414ck) {
        this.f28569h4 = (C8397nz) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39118k4(C8025jn c8025jn) {
        this.f28568du = c8025jn;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39119k4(String str) {
        this.f28570k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("a", str2, "http://schemas.openxmlformats.org/drawingml/2006/main");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        if (!"".equals(this.f28570k4)) {
            c3059ii.m12955x1("name", this.f28570k4);
        }
        this.f28573x1.mo6846k4("a", c3059ii, "themeElements");
        C8004ji c8004ji = this.f28571kk;
        if (c8004ji != null) {
            c8004ji.mo6846k4("a", c3059ii, "objectDefaults");
        }
        C8538po c8538po = this.f28572to;
        if (c8538po != null) {
            c8538po.mo6846k4("a", c3059ii, "extraClrSchemeLst");
        }
        C8025jn c8025jn = this.f28568du;
        if (c8025jn != null) {
            c8025jn.mo6846k4("a", c3059ii, "custClrLst");
        }
        C8397nz c8397nz = this.f28569h4;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
