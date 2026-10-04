package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class z2f extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f33667du;

    /* JADX INFO: renamed from: kk */
    private String f33668kk;

    /* JADX INFO: renamed from: to */
    private long f33669to;

    /* JADX INFO: renamed from: x1 */
    private int f33670x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f33666k4 = mfd.m36913k4("topLeft");

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f33665h4 = new C7017h4("pane", "activeCell", "activeCellId", "sqref");

    public z2f() {
        m45341x1();
    }

    public z2f(AbstractC13912i5 abstractC13912i5) {
        m45341x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.z2f.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = z2f.f33665h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    z2f.this.f33670x1 = mfd.m36913k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    z2f.this.f33668kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    z2f.this.f33669to = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                z2f.this.f33667du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m45341x1() {
        this.f33670x1 = f33666k4;
        this.f33669to = 0L;
        this.f33667du = "A1";
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f33670x1;
        if (i != f33666k4) {
            c3059ii.m12955x1("pane", mfd.m36914k4(i));
        }
        String str3 = this.f33668kk;
        if (str3 != null) {
            c3059ii.m12955x1("activeCell", str3);
        }
        long j = this.f33669to;
        if ((4294967295L & j) != 0) {
            c3059ii.m12955x1("activeCellId", C13850af.m65147x1(j));
        }
        if (!"A1".equals(this.f33667du)) {
            c3059ii.m12955x1("sqref", this.f33667du);
        }
        c3059ii.mo21898jd();
    }
}
