package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hy */
/* JADX INFO: loaded from: classes4.dex */
public class C7887hy extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24333kk = new C7017h4("r:id", "autoUpdate");

    /* JADX INFO: renamed from: k4 */
    private String f24334k4;

    /* JADX INFO: renamed from: x1 */
    private byte f24335x1;

    public C7887hy() {
        m33660x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m33660x1() {
        this.f24335x1 = (byte) -1;
    }

    public C7887hy(AbstractC13912i5 abstractC13912i5) {
        m33660x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7887hy.f24333kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7887hy.this.f24334k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7887hy.this.f24335x1 = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33661k4(byte b) {
        this.f24335x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33662k4(String str) {
        this.f24334k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:id", this.f24334k4);
        byte b = this.f24335x1;
        if (b != -1) {
            c3059ii.m12955x1("autoUpdate", b == 1 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
