package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class b5b extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20419kk = new C7017h4("text:display");

    /* JADX INFO: renamed from: k4 */
    private int f20420k4;

    /* JADX INFO: renamed from: x1 */
    private String f20421x1;

    public b5b() {
        m28715x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m28715x1() {
        this.f20420k4 = 0;
    }

    public b5b(AbstractC13912i5 abstractC13912i5) {
        m28715x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.b5b.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (b5b.f20419kk.m27428k4(str) != 0) {
                    return false;
                }
                b5b.this.f20420k4 = vx6.m43336k4(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    if (OooO0o.OooO0OO(abstractC13912i5, f20419kk)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f20421x1 = C14113y2.m67400k4(this.f20421x1, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f20420k4;
        if (i != 0) {
            c3059ii.m12955x1("text:display", vx6.m43337k4(i));
        }
        String str3 = this.f20421x1;
        if (str3 != null) {
            c3059ii.mo21918x1(str3);
        }
        c3059ii.mo21898jd();
    }
}
