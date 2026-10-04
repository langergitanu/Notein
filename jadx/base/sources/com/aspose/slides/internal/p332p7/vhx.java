package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class vhx extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31876kk = new C7017h4("text:string-value", "text:outline-level");

    /* JADX INFO: renamed from: k4 */
    private String f31877k4;

    /* JADX INFO: renamed from: x1 */
    private long f31878x1;

    public vhx() {
        m43113x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m43113x1() {
        this.f31878x1 = 4294967295L;
    }

    public vhx(AbstractC13912i5 abstractC13912i5) {
        m43113x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vhx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = vhx.f31876kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    vhx.this.f31877k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                vhx.this.f31878x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:string-value", this.f31877k4);
        long j = this.f31878x1;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("text:outline-level", C13850af.m65147x1(j));
        }
        c3059ii.mo21898jd();
    }
}
