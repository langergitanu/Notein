package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18293o1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class kte extends AbstractC7361bz {

    /* JADX INFO: renamed from: u4 */
    private static final C7017h4 f25931u4 = new C7017h4("field", C18293o1.f55803f, "selected", "byPosition", "relative", "defaultSubtotal", "sumSubtotal", "countASubtotal", "avgSubtotal", "maxSubtotal", "minSubtotal", "productSubtotal", "countSubtotal", "stdDevSubtotal", "stdDevPSubtotal", "varSubtotal", "varPSubtotal", "x", "extLst");

    /* JADX INFO: renamed from: c5 */
    private boolean f25932c5;

    /* JADX INFO: renamed from: ck */
    private boolean f25933ck;

    /* JADX INFO: renamed from: du */
    private boolean f25934du;

    /* JADX INFO: renamed from: dy */
    private boolean f25935dy;

    /* JADX INFO: renamed from: fa */
    private boolean f25936fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f25937h4;

    /* JADX INFO: renamed from: ix */
    private g3j f25938ix;

    /* JADX INFO: renamed from: jd */
    private boolean f25939jd;

    /* JADX INFO: renamed from: k4 */
    private long f25940k4;

    /* JADX INFO: renamed from: kk */
    private boolean f25941kk;

    /* JADX INFO: renamed from: ks */
    private boolean f25942ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f25943m9;

    /* JADX INFO: renamed from: ne */
    private List<cn8> f25944ne;

    /* JADX INFO: renamed from: rv */
    private boolean f25945rv;

    /* JADX INFO: renamed from: to */
    private boolean f25946to;

    /* JADX INFO: renamed from: up */
    private boolean f25947up;

    /* JADX INFO: renamed from: x1 */
    private long f25948x1;

    /* JADX INFO: renamed from: x6 */
    private boolean f25949x6;

    /* JADX INFO: renamed from: yj */
    private boolean f25950yj;

    public kte() {
        m35698x1();
    }

    public kte(final AbstractC13912i5 abstractC13912i5) {
        m35698x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kte.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (kte.f25931u4.m27428k4(str)) {
                    case 0:
                        kte.this.f25940k4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        kte.this.f25948x1 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 2:
                        kte.this.f25941kk = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        kte.this.f25946to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        kte.this.f25934du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        kte.this.f25937h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        kte.this.f25943m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        kte.this.f25935dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        kte.this.f25932c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        kte.this.f25939jd = C13850af.m65068c5(str2);
                        break;
                    case 10:
                        kte.this.f25933ck = C13850af.m65068c5(str2);
                        break;
                    case 11:
                        kte.this.f25936fa = C13850af.m65068c5(str2);
                        break;
                    case 12:
                        kte.this.f25947up = C13850af.m65068c5(str2);
                        break;
                    case 13:
                        kte.this.f25950yj = C13850af.m65068c5(str2);
                        break;
                    case 14:
                        kte.this.f25942ks = C13850af.m65068c5(str2);
                        break;
                    case 15:
                        kte.this.f25945rv = C13850af.m65068c5(str2);
                        break;
                    case 16:
                        kte.this.f25949x6 = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kte.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = kte.f25931u4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 17) {
                    kte.this.f25944ne.addItem(new cn8(abstractC13912i5));
                    return true;
                }
                if (iM27428k4 != 18) {
                    return false;
                }
                kte.this.f25938ix = new g3j(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m35698x1() {
        this.f25940k4 = 4294967295L;
        this.f25948x1 = 4294967295L;
        this.f25941kk = true;
        this.f25946to = false;
        this.f25934du = false;
        this.f25937h4 = false;
        this.f25943m9 = false;
        this.f25935dy = false;
        this.f25932c5 = false;
        this.f25939jd = false;
        this.f25933ck = false;
        this.f25936fa = false;
        this.f25947up = false;
        this.f25950yj = false;
        this.f25942ks = false;
        this.f25945rv = false;
        this.f25949x6 = false;
        this.f25944ne = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f25940k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("field", C13850af.m65147x1(j));
        }
        long j2 = this.f25948x1;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65147x1(j2));
        }
        boolean z = this.f25941kk;
        if (!z) {
            c3059ii.m12955x1("selected", z ? "1" : "0");
        }
        boolean z2 = this.f25946to;
        if (z2) {
            c3059ii.m12955x1("byPosition", z2 ? "1" : "0");
        }
        boolean z3 = this.f25934du;
        if (z3) {
            c3059ii.m12955x1("relative", z3 ? "1" : "0");
        }
        boolean z4 = this.f25937h4;
        if (z4) {
            c3059ii.m12955x1("defaultSubtotal", z4 ? "1" : "0");
        }
        boolean z5 = this.f25943m9;
        if (z5) {
            c3059ii.m12955x1("sumSubtotal", z5 ? "1" : "0");
        }
        boolean z6 = this.f25935dy;
        if (z6) {
            c3059ii.m12955x1("countASubtotal", z6 ? "1" : "0");
        }
        boolean z7 = this.f25932c5;
        if (z7) {
            c3059ii.m12955x1("avgSubtotal", z7 ? "1" : "0");
        }
        boolean z8 = this.f25939jd;
        if (z8) {
            c3059ii.m12955x1("maxSubtotal", z8 ? "1" : "0");
        }
        boolean z9 = this.f25933ck;
        if (z9) {
            c3059ii.m12955x1("minSubtotal", z9 ? "1" : "0");
        }
        boolean z10 = this.f25936fa;
        if (z10) {
            c3059ii.m12955x1("productSubtotal", z10 ? "1" : "0");
        }
        boolean z11 = this.f25947up;
        if (z11) {
            c3059ii.m12955x1("countSubtotal", z11 ? "1" : "0");
        }
        boolean z12 = this.f25950yj;
        if (z12) {
            c3059ii.m12955x1("stdDevSubtotal", z12 ? "1" : "0");
        }
        boolean z13 = this.f25942ks;
        if (z13) {
            c3059ii.m12955x1("stdDevPSubtotal", z13 ? "1" : "0");
        }
        boolean z14 = this.f25945rv;
        if (z14) {
            c3059ii.m12955x1("varSubtotal", z14 ? "1" : "0");
        }
        boolean z15 = this.f25949x6;
        if (z15) {
            c3059ii.m12955x1("varPSubtotal", z15 ? "1" : "0");
        }
        List.Enumerator<cn8> it = this.f25944ne.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "x");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        g3j g3jVar = this.f25938ix;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
