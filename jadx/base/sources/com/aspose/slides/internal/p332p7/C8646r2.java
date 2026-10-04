package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.r2 */
/* JADX INFO: loaded from: classes4.dex */
public class C8646r2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f29142kk = new C7017h4(C18437z2.f56754h, "val");

    /* JADX INFO: renamed from: k4 */
    private int f29143k4;

    /* JADX INFO: renamed from: x1 */
    private String f29144x1;

    public C8646r2() {
        m39850to();
    }

    /* JADX INFO: renamed from: to */
    private void m39850to() {
        this.f29143k4 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m39851k4() {
        return this.f29143k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m39852x1() {
        return this.f29144x1;
    }

    public C8646r2(AbstractC13912i5 abstractC13912i5) {
        m39850to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.r2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8646r2.f29142kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8646r2.this.f29143k4 = C8922u5.m42104k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8646r2.this.f29144x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(C18437z2.f56754h, C8922u5.m42105k4(this.f29143k4));
        c3059ii.m12955x1("val", this.f29144x1);
        c3059ii.mo21898jd();
    }
}
