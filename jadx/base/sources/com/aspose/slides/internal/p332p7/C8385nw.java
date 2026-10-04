package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.nw */
/* JADX INFO: loaded from: classes4.dex */
public class C8385nw extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f27590kk = new C7017h4("uniform", "value");

    /* JADX INFO: renamed from: k4 */
    private boolean f27591k4;

    /* JADX INFO: renamed from: x1 */
    private String f27592x1;

    public C8385nw() {
        m37869to();
    }

    /* JADX INFO: renamed from: to */
    private void m37869to() {
        this.f27591k4 = true;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m37873x1() {
        return this.f27592x1;
    }

    public C8385nw(AbstractC13912i5 abstractC13912i5) {
        m37869to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8385nw.f27590kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8385nw.this.f27591k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8385nw.this.f27592x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37870k4(String str) {
        this.f27592x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f27591k4;
        if (!z) {
            c3059ii.m12955x1("uniform", z ? "1" : "0");
        }
        c3059ii.m12955x1("value", this.f27592x1);
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37871k4(boolean z) {
        this.f27591k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m37872k4() {
        return this.f27591k4;
    }
}
