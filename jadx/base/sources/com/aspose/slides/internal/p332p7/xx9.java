package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class xx9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f33111k4 = C8052k2.m35081k4("l");

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33112to = new C7017h4("thruBlk", "dir");

    /* JADX INFO: renamed from: kk */
    private int f33113kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f33114x1;

    public xx9() {
        m44708to();
    }

    /* JADX INFO: renamed from: to */
    private void m44708to() {
        this.f33114x1 = false;
        this.f33113kk = f33111k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m44712x1() {
        return this.f33113kk;
    }

    public xx9(AbstractC13912i5 abstractC13912i5) {
        m44708to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xx9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = xx9.f33112to.m27428k4(str);
                if (iM27428k4 == 0) {
                    xx9.this.f33114x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                xx9.this.f33113kk = C8052k2.m35081k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44709k4(int i) {
        this.f33113kk = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f33114x1;
        if (z) {
            c3059ii.m12955x1("thruBlk", z ? "1" : "0");
        }
        int i = this.f33113kk;
        if (i != f33111k4) {
            c3059ii.m12955x1("dir", C8052k2.m35082k4(i));
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44710k4(boolean z) {
        this.f33114x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m44711k4() {
        return this.f33114x1;
    }
}
