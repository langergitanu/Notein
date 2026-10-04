package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ik */
/* JADX INFO: loaded from: classes4.dex */
public class C7937ik extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24729kk = new C7017h4("formatCode", "sourceLinked");

    /* JADX INFO: renamed from: k4 */
    private String f24730k4;

    /* JADX INFO: renamed from: x1 */
    private byte f24731x1;

    public C7937ik() {
        m34181to();
    }

    /* JADX INFO: renamed from: to */
    private void m34181to() {
        this.f24731x1 = (byte) -1;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m34185x1() {
        return this.f24731x1;
    }

    public C7937ik(AbstractC13912i5 abstractC13912i5) {
        m34181to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ik.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7937ik.f24729kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7937ik.this.f24730k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7937ik.this.f24731x1 = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m34182k4() {
        return this.f24730k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34183k4(byte b) {
        this.f24731x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34184k4(String str) {
        this.f24730k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("formatCode", this.f24730k4);
        byte b = this.f24731x1;
        if (b != -1) {
            c3059ii.m12955x1("sourceLinked", b == 1 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
