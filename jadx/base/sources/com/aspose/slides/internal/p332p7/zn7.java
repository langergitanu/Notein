package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class zn7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private long f33983kk;

    /* JADX INFO: renamed from: to */
    private double f33984to;

    /* JADX INFO: renamed from: x1 */
    private int f33985x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f33982k4 = d4u.m30081k4("disable");

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33981du = new C7017h4("table:status", "table:steps", "table:maximum-difference");

    public zn7() {
        m45700x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m45700x1() {
        this.f33985x1 = f33982k4;
        this.f33983kk = 100L;
        this.f33984to = 0.001d;
    }

    public zn7(AbstractC13912i5 abstractC13912i5) {
        m45700x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zn7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = zn7.f33981du.m27428k4(str);
                if (iM27428k4 == 0) {
                    zn7.this.f33985x1 = d4u.m30081k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    zn7.this.f33983kk = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                zn7.this.f33984to = AbstractC7361bz.m29300yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f33985x1;
        if (i != f33982k4) {
            c3059ii.m12955x1("table:status", d4u.m30082k4(i));
        }
        long j = this.f33983kk;
        if ((4294967295L & j) != 100) {
            c3059ii.m12955x1("table:steps", C13850af.m65147x1(j));
        }
        double d = this.f33984to;
        if (d != 0.001d) {
            c3059ii.m12955x1("table:maximum-difference", C13850af.m65101k4(d));
        }
        c3059ii.mo21898jd();
    }
}
