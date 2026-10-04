package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class lwe extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26560kk = new C7017h4("w_Type", "w_Clear");

    /* JADX INFO: renamed from: k4 */
    private int f26561k4;

    /* JADX INFO: renamed from: x1 */
    private int f26562x1;

    public lwe() {
        m36485x1();
    }

    public lwe(AbstractC13912i5 abstractC13912i5) {
        m36485x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lwe.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = lwe.f26560kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    lwe.this.f26561k4 = hps.m33571k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                lwe.this.f26562x1 = ncj.m37422k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m36485x1() {
        this.f26561k4 = 0;
        this.f26562x1 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f26561k4;
        if (i != 0) {
            c3059ii.m12955x1("w:type", hps.m33572k4(i));
        }
        int i2 = this.f26562x1;
        if (i2 != 0) {
            c3059ii.m12955x1("w:clear", ncj.m37423k4(i2));
        }
        c3059ii.mo21898jd();
    }
}
