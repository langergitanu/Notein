package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class pbm extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f28355du;

    /* JADX INFO: renamed from: kk */
    private long f28356kk;

    /* JADX INFO: renamed from: to */
    private int f28357to;

    /* JADX INFO: renamed from: x1 */
    private String f28358x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f28354k4 = e6q.m30793k4("visible");

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f28353h4 = new C7017h4("name", "sheetId", "state", "r:id");

    public pbm() {
        m38788du();
    }

    /* JADX INFO: renamed from: du */
    private void m38788du() {
        this.f28357to = f28354k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m38797kk() {
        return this.f28355du;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m38798x1() {
        return this.f28356kk;
    }

    public pbm(AbstractC13912i5 abstractC13912i5) {
        m38788du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pbm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = pbm.f28353h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    pbm.this.f28358x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    pbm.this.f28356kk = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    pbm.this.f28357to = e6q.m30793k4(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                pbm.this.f28355du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m38794k4() {
        return this.f28358x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m38799x1(String str) {
        this.f28355du = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38795k4(long j) {
        this.f28356kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38796k4(String str) {
        this.f28358x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("name", this.f28358x1);
        c3059ii.m12955x1("sheetId", C13850af.m65147x1(this.f28356kk));
        int i = this.f28357to;
        if (i != f28354k4) {
            c3059ii.m12955x1("state", e6q.m30794k4(i));
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:id", this.f28355du);
        c3059ii.mo21898jd();
    }
}
