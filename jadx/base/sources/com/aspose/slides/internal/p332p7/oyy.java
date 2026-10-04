package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class oyy extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private int f28162c5;

    /* JADX INFO: renamed from: ck */
    private int f28163ck;

    /* JADX INFO: renamed from: du */
    private boolean f28164du;

    /* JADX INFO: renamed from: dy */
    private boolean f28165dy;

    /* JADX INFO: renamed from: fa */
    private ltr f28166fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f28167h4;

    /* JADX INFO: renamed from: jd */
    private String f28168jd;

    /* JADX INFO: renamed from: kk */
    private boolean f28169kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f28170m9;

    /* JADX INFO: renamed from: to */
    private boolean f28171to;

    /* JADX INFO: renamed from: k4 */
    public static final int f28159k4 = xdm.m44300k4("800x600");

    /* JADX INFO: renamed from: x1 */
    public static final int f28161x1 = h4g.m33069k4("whiteTextOnBlack");

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f28160up = new C7017h4("showAnimation", "resizeGraphics", "allowPng", "relyOnVml", "organizeInFolders", "useLongFilenames", "imgSz", "encoding", "clr", "extLst");

    public oyy() {
        m38539x1();
    }

    public oyy(final AbstractC13912i5 abstractC13912i5) {
        m38539x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.oyy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (oyy.f28160up.m27428k4(str)) {
                    case 0:
                        oyy.this.f28169kk = C13850af.m65068c5(str2);
                        break;
                    case 1:
                        oyy.this.f28171to = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        oyy.this.f28164du = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        oyy.this.f28167h4 = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        oyy.this.f28170m9 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        oyy.this.f28165dy = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        oyy.this.f28162c5 = xdm.m44300k4(str2);
                        break;
                    case 7:
                        oyy.this.f28168jd = str2;
                        break;
                    case 8:
                        oyy.this.f28163ck = h4g.m33069k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.oyy.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (oyy.f28160up.m27428k4(abstractC13912i5.mo65023fa()) != 9) {
                    return false;
                }
                oyy.this.f28166fa = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m38539x1() {
        this.f28169kk = false;
        this.f28171to = true;
        this.f28164du = false;
        this.f28167h4 = false;
        this.f28170m9 = true;
        this.f28165dy = true;
        this.f28162c5 = f28159k4;
        this.f28168jd = "";
        this.f28163ck = f28161x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f28169kk;
        if (z) {
            c3059ii.m12955x1("showAnimation", z ? "1" : "0");
        }
        boolean z2 = this.f28171to;
        if (!z2) {
            c3059ii.m12955x1("resizeGraphics", z2 ? "1" : "0");
        }
        boolean z3 = this.f28164du;
        if (z3) {
            c3059ii.m12955x1("allowPng", z3 ? "1" : "0");
        }
        boolean z4 = this.f28167h4;
        if (z4) {
            c3059ii.m12955x1("relyOnVml", z4 ? "1" : "0");
        }
        boolean z5 = this.f28170m9;
        if (!z5) {
            c3059ii.m12955x1("organizeInFolders", z5 ? "1" : "0");
        }
        boolean z6 = this.f28165dy;
        if (!z6) {
            c3059ii.m12955x1("useLongFilenames", z6 ? "1" : "0");
        }
        int i = this.f28162c5;
        if (i != f28159k4) {
            c3059ii.m12955x1("imgSz", xdm.m44301k4(i));
        }
        if (!"".equals(this.f28168jd)) {
            c3059ii.m12955x1("encoding", this.f28168jd);
        }
        int i2 = this.f28163ck;
        if (i2 != f28161x1) {
            c3059ii.m12955x1("clr", h4g.m33070k4(i2));
        }
        ltr ltrVar = this.f28166fa;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
