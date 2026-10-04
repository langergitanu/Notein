package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.jq */
/* JADX INFO: loaded from: classes4.dex */
public class C8030jq extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f25292c5 = new C7017h4("name", "fillClrLst", "linClrLst", "effectClrLst", "txLinClrLst", "txFillClrLst", "txEffectClrLst", "extLst");

    /* JADX INFO: renamed from: du */
    private C7452d0 f25293du;

    /* JADX INFO: renamed from: dy */
    private C8397nz f25294dy;

    /* JADX INFO: renamed from: h4 */
    private C7452d0 f25295h4;

    /* JADX INFO: renamed from: k4 */
    private String f25296k4;

    /* JADX INFO: renamed from: kk */
    private C7452d0 f25297kk;

    /* JADX INFO: renamed from: m9 */
    private C7452d0 f25298m9;

    /* JADX INFO: renamed from: to */
    private C7452d0 f25299to;

    /* JADX INFO: renamed from: x1 */
    private C7452d0 f25300x1;

    public C8030jq() {
    }

    /* JADX INFO: renamed from: kk */
    public final C7452d0 m34879kk() {
        return this.f25297kk;
    }

    /* JADX INFO: renamed from: to */
    public final C7452d0 m34880to() {
        return this.f25295h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7452d0 m34881x1() {
        return this.f25300x1;
    }

    public C8030jq(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8030jq.f25292c5.m27428k4(str) != 0) {
                    return false;
                }
                C8030jq.this.f25296k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jq.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8030jq.f25292c5.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        C8030jq.this.f25300x1 = new C7452d0(abstractC13912i5);
                        return true;
                    case 2:
                        C8030jq.this.f25297kk = new C7452d0(abstractC13912i5);
                        return true;
                    case 3:
                        C8030jq.this.f25299to = new C7452d0(abstractC13912i5);
                        return true;
                    case 4:
                        C8030jq.this.f25293du = new C7452d0(abstractC13912i5);
                        return true;
                    case 5:
                        C8030jq.this.f25295h4 = new C7452d0(abstractC13912i5);
                        return true;
                    case 6:
                        C8030jq.this.f25298m9 = new C7452d0(abstractC13912i5);
                        return true;
                    case 7:
                        C8030jq.this.f25294dy = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m34878k4() {
        return this.f25296k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("name", this.f25296k4);
        C7452d0 c7452d0 = this.f25300x1;
        if (c7452d0 != null) {
            c7452d0.mo6846k4("dgm", c3059ii, "fillClrLst");
        }
        C7452d0 c7452d02 = this.f25297kk;
        if (c7452d02 != null) {
            c7452d02.mo6846k4("dgm", c3059ii, "linClrLst");
        }
        C7452d0 c7452d03 = this.f25299to;
        if (c7452d03 != null) {
            c7452d03.mo6846k4("dgm", c3059ii, "effectClrLst");
        }
        C7452d0 c7452d04 = this.f25293du;
        if (c7452d04 != null) {
            c7452d04.mo6846k4("dgm", c3059ii, "txLinClrLst");
        }
        C7452d0 c7452d05 = this.f25295h4;
        if (c7452d05 != null) {
            c7452d05.mo6846k4("dgm", c3059ii, "txFillClrLst");
        }
        C7452d0 c7452d06 = this.f25298m9;
        if (c7452d06 != null) {
            c7452d06.mo6846k4("dgm", c3059ii, "txEffectClrLst");
        }
        C8397nz c8397nz = this.f25294dy;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dgm", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
