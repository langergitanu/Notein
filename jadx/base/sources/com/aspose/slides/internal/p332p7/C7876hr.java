package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hr */
/* JADX INFO: loaded from: classes4.dex */
public class C7876hr extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24276kk = new C7017h4("idx");

    /* JADX INFO: renamed from: k4 */
    private long f24277k4;

    /* JADX INFO: renamed from: x1 */
    private String f24278x1;

    public C7876hr() {
    }

    /* JADX INFO: renamed from: k4 */
    public final long m33597k4() {
        return this.f24277k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m33600x1() {
        return this.f24278x1;
    }

    public C7876hr(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7876hr.f24276kk.m27428k4(str) != 0) {
                    return false;
                }
                C7876hr.this.f24277k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        abstractC13912i5.mo65026h4();
        this.f24278x1 = abstractC13912i5.mo65042rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33598k4(long j) {
        this.f24277k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33599k4(String str) {
        this.f24278x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("idx", C13850af.m65147x1(this.f24277k4));
        c3059ii.mo21918x1(this.f24278x1);
        c3059ii.mo21898jd();
    }
}
