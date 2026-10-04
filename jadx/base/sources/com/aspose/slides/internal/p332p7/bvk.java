package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class bvk extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f20732du = new C7017h4("sldId", "cId", "zmPr", "extLst");

    /* JADX INFO: renamed from: k4 */
    private long f20733k4;

    /* JADX INFO: renamed from: kk */
    private ov2 f20734kk;

    /* JADX INFO: renamed from: to */
    private ltr f20735to;

    /* JADX INFO: renamed from: x1 */
    private long f20736x1;

    public bvk() {
        m29150du();
        this.f20734kk = new ov2();
    }

    /* JADX INFO: renamed from: du */
    private void m29150du() {
        this.f20736x1 = 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m29156k4() {
        return this.f20733k4;
    }

    /* JADX INFO: renamed from: kk */
    public final ov2 m29158kk() {
        return this.f20734kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m29159x1() {
        return this.f20736x1;
    }

    public bvk(final AbstractC13912i5 abstractC13912i5) {
        m29150du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bvk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = bvk.f20732du.m27428k4(str);
                if (iM27428k4 == 0) {
                    bvk.this.f20733k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                bvk.this.f20736x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.bvk.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = bvk.f20732du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    bvk.this.f20734kk = new ov2(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                bvk.this.f20735to = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29160x1(long j) {
        this.f20736x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29157k4(long j) {
        this.f20733k4 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("sldId", C13850af.m65147x1(this.f20733k4));
        long j = this.f20736x1;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("cId", C13850af.m65147x1(j));
        }
        this.f20734kk.mo6846k4("pslz", c3059ii, "zmPr");
        ltr ltrVar = this.f20735to;
        if (ltrVar != null) {
            ltrVar.mo6846k4("pslz", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
