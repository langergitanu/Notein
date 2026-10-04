package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.d1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7453d1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21397kk = new C7017h4("Id");

    /* JADX INFO: renamed from: k4 */
    private String f21398k4;

    /* JADX INFO: renamed from: x1 */
    private String f21399x1;

    public C7453d1() {
    }

    public C7453d1(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.d1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7453d1.f21397kk.m27428k4(str) != 0) {
                    return false;
                }
                C7453d1.this.f21398k4 = str2;
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        abstractC13912i5.mo65026h4();
        this.f21399x1 = abstractC13912i5.mo65042rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30005k4(String str) {
        this.f21399x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f21398k4;
        if (str3 != null) {
            c3059ii.m12955x1("Id", str3);
        }
        c3059ii.mo21918x1(this.f21399x1);
        c3059ii.mo21898jd();
    }
}
