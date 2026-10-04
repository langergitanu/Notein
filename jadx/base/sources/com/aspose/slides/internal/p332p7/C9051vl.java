package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.vl */
/* JADX INFO: loaded from: classes4.dex */
public class C9051vl extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31926kk = new C7017h4("xml_Space");

    /* JADX INFO: renamed from: k4 */
    private int f31927k4;

    /* JADX INFO: renamed from: x1 */
    private String f31928x1;

    public C9051vl() {
        m43159to();
    }

    /* JADX INFO: renamed from: to */
    private void m43159to() {
        this.f31927k4 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m43160k4() {
        return this.f31927k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m43163x1() {
        return this.f31928x1;
    }

    public C9051vl(AbstractC13912i5 abstractC13912i5) {
        m43159to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9051vl.f31926kk.m27428k4(str) != 0) {
                    return false;
                }
                C9051vl.this.f31927k4 = C7813h0.m33007k4(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        abstractC13912i5.mo65026h4();
        this.f31928x1 = abstractC13912i5.mo65042rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43161k4(int i) {
        this.f31927k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43162k4(String str) {
        this.f31928x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f31927k4;
        if (i != 0) {
            c3059ii.m12955x1("xml:space", C7813h0.m33008k4(i));
        }
        c3059ii.mo21918x1(this.f31928x1);
        c3059ii.mo21898jd();
        c3059ii.mo21896h4();
    }
}
