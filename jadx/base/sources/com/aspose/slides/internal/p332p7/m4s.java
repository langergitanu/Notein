package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class m4s extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f26646k4 = C8752s9.m40870k4("l");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26647kk = new C7017h4("dir");

    /* JADX INFO: renamed from: x1 */
    private int f26648x1;

    public m4s() {
        m36578kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m36578kk() {
        this.f26648x1 = f26646k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m36580k4() {
        return this.f26648x1;
    }

    public m4s(AbstractC13912i5 abstractC13912i5) {
        m36578kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.m4s.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (m4s.f26647kk.m27428k4(str) != 0) {
                    return false;
                }
                m4s.this.f26648x1 = C8752s9.m40870k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36581k4(int i) {
        this.f26648x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f26648x1;
        if (i != f26646k4) {
            c3059ii.m12955x1("dir", C8752s9.m40871k4(i));
        }
        c3059ii.mo21898jd();
    }
}
