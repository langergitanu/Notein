package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class jbq extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f25071h4 = new C7017h4("p14:bwMode", "r:id", "nvContentPartPr", "xfrm", "extLst");

    /* JADX INFO: renamed from: du */
    private dnu f25072du;

    /* JADX INFO: renamed from: k4 */
    private byte f25073k4;

    /* JADX INFO: renamed from: kk */
    private cs2 f25074kk;

    /* JADX INFO: renamed from: to */
    private C9030ve f25075to;

    /* JADX INFO: renamed from: x1 */
    private String f25076x1;

    public jbq() {
        m34624dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m34624dy() {
        this.f25073k4 = (byte) -1;
    }

    /* JADX INFO: renamed from: du */
    public final cs2 m34631du() {
        return this.f25074kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C9030ve m34632h4() {
        return this.f25075to;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m34636kk() {
        return this.f25073k4;
    }

    /* JADX INFO: renamed from: to */
    public final String m34637to() {
        return this.f25076x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9030ve m34638x1() {
        if (this.f25075to != null) {
            throw new Exception("Only one <xfrm> element can be added.");
        }
        C9030ve c9030ve = new C9030ve();
        this.f25075to = c9030ve;
        return c9030ve;
    }

    public jbq(final AbstractC13912i5 abstractC13912i5) {
        m34624dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jbq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jbq.f25071h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    jbq.this.f25073k4 = C8384nv.m37862k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                jbq.this.f25076x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jbq.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = jbq.f25071h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    jbq.this.f25074kk = new cs2(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    jbq.this.f25075to = new C9030ve(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                jbq.this.f25072du = new dnu(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final cs2 m34633k4() {
        if (this.f25074kk != null) {
            throw new Exception("Only one <nvContentPartPr> element can be added.");
        }
        cs2 cs2Var = new cs2();
        this.f25074kk = cs2Var;
        return cs2Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34634k4(byte b) {
        this.f25073k4 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34635k4(String str) {
        this.f25076x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f25073k4;
        if (b != -1) {
            c3059ii.m12955x1("p14:bwMode", C8384nv.m37863k4(b));
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:id", this.f25076x1);
        cs2 cs2Var = this.f25074kk;
        if (cs2Var != null) {
            cs2Var.mo6846k4("p14", c3059ii, "nvContentPartPr");
        }
        C9030ve c9030ve = this.f25075to;
        if (c9030ve != null) {
            c9030ve.mo6846k4("p14", c3059ii, "xfrm");
        }
        dnu dnuVar = this.f25072du;
        if (dnuVar != null) {
            dnuVar.mo6846k4("p14", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
