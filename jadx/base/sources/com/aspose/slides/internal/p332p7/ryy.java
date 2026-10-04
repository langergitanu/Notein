package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class ryy extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f29792kk = new C7017h4("w_Font", "w_Char");

    /* JADX INFO: renamed from: k4 */
    private String f29793k4;

    /* JADX INFO: renamed from: x1 */
    private int f29794x1;

    public ryy() {
        m40631x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m40631x1() {
        this.f29794x1 = 65535;
    }

    public ryy(AbstractC13912i5 abstractC13912i5) {
        m40631x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ryy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ryy.f29792kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    ryy.this.f29793k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                ryy.this.f29794x1 = C14081nv.m67064k4(str2, 515);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f29793k4;
        if (str3 != null) {
            c3059ii.m12955x1("w:font", str3);
        }
        int i = this.f29794x1;
        if ((i & 65535) != 65535) {
            c3059ii.m12955x1("w:char", C14057f9.m66587k4(i & 65535, "X4"));
        }
        c3059ii.mo21898jd();
    }
}
