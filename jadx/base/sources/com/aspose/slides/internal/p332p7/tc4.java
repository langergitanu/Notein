package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes4.dex */
public class tc4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private int f30692du;

    /* JADX INFO: renamed from: kk */
    private long f30693kk;

    /* JADX INFO: renamed from: to */
    private int f30694to;

    /* JADX INFO: renamed from: k4 */
    public static final int f30690k4 = nfo.m37490k4("fullwidthKatakana");

    /* JADX INFO: renamed from: x1 */
    public static final int f30691x1 = nl8.m37700k4("left");

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f30689h4 = new C7017h4("fontId", C18437z2.f56754h, "alignment");

    public tc4() {
        m41668x1();
    }

    public tc4(AbstractC13912i5 abstractC13912i5) {
        m41668x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tc4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = tc4.f30689h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    tc4.this.f30693kk = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    tc4.this.f30694to = nfo.m37490k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                tc4.this.f30692du = nl8.m37700k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m41668x1() {
        this.f30694to = f30690k4;
        this.f30692du = f30691x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("fontId", C13850af.m65147x1(this.f30693kk));
        int i = this.f30694to;
        if (i != f30690k4) {
            c3059ii.m12955x1(C18437z2.f56754h, nfo.m37491k4(i));
        }
        int i2 = this.f30692du;
        if (i2 != f30691x1) {
            c3059ii.m12955x1("alignment", nl8.m37701k4(i2));
        }
        c3059ii.mo21898jd();
    }
}
