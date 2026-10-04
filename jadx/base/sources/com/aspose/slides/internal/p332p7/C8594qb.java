package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.qb */
/* JADX INFO: loaded from: classes4.dex */
public class C8594qb extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private g3p f28838c5;

    /* JADX INFO: renamed from: ck */
    private ltr f28839ck;

    /* JADX INFO: renamed from: du */
    private fov f28840du;

    /* JADX INFO: renamed from: dy */
    private j9n f28841dy;

    /* JADX INFO: renamed from: h4 */
    private gok f28842h4;

    /* JADX INFO: renamed from: jd */
    private C7258al f28843jd;

    /* JADX INFO: renamed from: kk */
    private boolean f28844kk;

    /* JADX INFO: renamed from: m9 */
    private nns f28845m9;

    /* JADX INFO: renamed from: to */
    private ecy f28846to;

    /* JADX INFO: renamed from: x1 */
    private int f28847x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f28837k4 = cpm.m29716k4("sldView");

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f28836fa = new C7017h4("lastView", "showComments", "normalViewPr", "slideViewPr", "outlineViewPr", "notesTextViewPr", "sorterViewPr", "notesViewPr", "gridSpacing", "extLst");

    public C8594qb() {
        m39436ck();
    }

    /* JADX INFO: renamed from: ck */
    private void m39436ck() {
        this.f28847x1 = f28837k4;
        this.f28844kk = true;
    }

    /* JADX INFO: renamed from: c5 */
    public final g3p m39440c5() {
        return this.f28838c5;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m39441du() {
        return this.f28844kk;
    }

    /* JADX INFO: renamed from: dy */
    public final gok m39442dy() {
        return this.f28842h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final ecy m39443h4() {
        return this.f28846to;
    }

    /* JADX INFO: renamed from: kk */
    public final g3p m39447kk() {
        if (this.f28838c5 != null) {
            throw new Exception("Only one <notesViewPr> element can be added.");
        }
        g3p g3pVar = new g3p();
        this.f28838c5 = g3pVar;
        return g3pVar;
    }

    /* JADX INFO: renamed from: m9 */
    public final fov m39448m9() {
        return this.f28840du;
    }

    /* JADX INFO: renamed from: to */
    public final int m39449to() {
        return this.f28847x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final fov m39450x1() {
        if (this.f28840du != null) {
            throw new Exception("Only one <slideViewPr> element can be added.");
        }
        fov fovVar = new fov();
        this.f28840du = fovVar;
        return fovVar;
    }

    public C8594qb(AbstractC13912i5 abstractC13912i5) {
        m39436ck();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8594qb.f28836fa.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8594qb.this.f28847x1 = cpm.m29716k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8594qb.this.f28844kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    switch (f28836fa.m27428k4(abstractC13912i5.mo65023fa())) {
                        case 2:
                            this.f28846to = new ecy(abstractC13912i5);
                            continue;
                        case 3:
                            this.f28840du = new fov(abstractC13912i5);
                            continue;
                        case 4:
                            this.f28842h4 = new gok(abstractC13912i5);
                            continue;
                        case 5:
                            this.f28845m9 = new nns(abstractC13912i5);
                            break;
                        case 6:
                            this.f28841dy = new j9n(abstractC13912i5);
                            break;
                        case 7:
                            this.f28838c5 = new g3p(abstractC13912i5);
                            continue;
                        case 8:
                            this.f28843jd = new C7258al(abstractC13912i5);
                            continue;
                        case 9:
                            this.f28839ck = new ltr(abstractC13912i5);
                            continue;
                        default:
                            abstractC13912i5.mo65208bv();
                            break;
                    }
                    if (abstractC13912i5.mo65015ar()) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final ecy m39444k4() {
        if (this.f28846to != null) {
            throw new Exception("Only one <normalViewPr> element can be added.");
        }
        ecy ecyVar = new ecy();
        this.f28846to = ecyVar;
        return ecyVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39445k4(int i) {
        this.f28847x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(ContextChain.TAG_PRODUCT, str2, "http://schemas.openxmlformats.org/presentationml/2006/main");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        int i = this.f28847x1;
        if (i != f28837k4) {
            c3059ii.m12955x1("lastView", cpm.m29717k4(i));
        }
        boolean z = this.f28844kk;
        if (!z) {
            c3059ii.m12955x1("showComments", z ? "1" : "0");
        }
        ecy ecyVar = this.f28846to;
        if (ecyVar != null) {
            ecyVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "normalViewPr");
        }
        fov fovVar = this.f28840du;
        if (fovVar != null) {
            fovVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "slideViewPr");
        }
        gok gokVar = this.f28842h4;
        if (gokVar != null) {
            gokVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "outlineViewPr");
        }
        nns nnsVar = this.f28845m9;
        if (nnsVar != null) {
            nnsVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "notesTextViewPr");
        }
        j9n j9nVar = this.f28841dy;
        if (j9nVar != null) {
            j9nVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "sorterViewPr");
        }
        g3p g3pVar = this.f28838c5;
        if (g3pVar != null) {
            g3pVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "notesViewPr");
        }
        C7258al c7258al = this.f28843jd;
        if (c7258al != null) {
            c7258al.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "gridSpacing");
        }
        ltr ltrVar = this.f28839ck;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39446k4(boolean z) {
        this.f28844kk = z;
    }
}
