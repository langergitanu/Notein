package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class gu5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private int f23749kk;

    /* JADX INFO: renamed from: to */
    private int f23750to;

    /* JADX INFO: renamed from: k4 */
    public static final int f23747k4 = C9162x0.m44156k4("l");

    /* JADX INFO: renamed from: x1 */
    public static final int f23748x1 = C8989v0.m42646k4("diamond");

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f23746du = new C7017h4("dir", "pattern");

    public gu5() {
        m32929to();
    }

    /* JADX INFO: renamed from: to */
    private void m32929to() {
        this.f23749kk = f23747k4;
        this.f23750to = f23748x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m32931k4() {
        return this.f23749kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m32933x1() {
        return this.f23750to;
    }

    public gu5(AbstractC13912i5 abstractC13912i5) {
        m32929to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gu5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = gu5.f23746du.m27428k4(str);
                if (iM27428k4 == 0) {
                    gu5.this.f23749kk = C9162x0.m44156k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                gu5.this.f23750to = C8989v0.m42646k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32932k4(int i) {
        this.f23749kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32934x1(int i) {
        this.f23750to = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f23749kk;
        if (i != f23747k4) {
            c3059ii.m12955x1("dir", C9162x0.m44157k4(i));
        }
        int i2 = this.f23750to;
        if (i2 != f23748x1) {
            c3059ii.m12955x1("pattern", C8989v0.m42647k4(i2));
        }
        c3059ii.mo21898jd();
    }
}
