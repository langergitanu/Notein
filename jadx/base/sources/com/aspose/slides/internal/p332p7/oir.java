package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class oir extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f27965du;

    /* JADX INFO: renamed from: h4 */
    private int f27966h4;

    /* JADX INFO: renamed from: kk */
    private double f27967kk;

    /* JADX INFO: renamed from: m9 */
    private int f27968m9;

    /* JADX INFO: renamed from: to */
    private double f27969to;

    /* JADX INFO: renamed from: k4 */
    public static final int f27963k4 = mfd.m36913k4("topLeft");

    /* JADX INFO: renamed from: x1 */
    public static final int f27964x1 = dt0.m30572k4("split");

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f27962dy = new C7017h4("xSplit", "ySplit", "topLeftCell", "activePane", "state");

    public oir() {
        m38290x1();
    }

    public oir(AbstractC13912i5 abstractC13912i5) {
        m38290x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.oir.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = oir.f27962dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    oir.this.f27967kk = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    oir.this.f27969to = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    oir.this.f27965du = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    oir.this.f27966h4 = mfd.m36913k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                oir.this.f27968m9 = dt0.m30572k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m38290x1() {
        this.f27967kk = 0.0d;
        this.f27969to = 0.0d;
        this.f27966h4 = f27963k4;
        this.f27968m9 = f27964x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        double d = this.f27967kk;
        if (d != 0.0d) {
            c3059ii.m12955x1("xSplit", C13850af.m65101k4(d));
        }
        double d2 = this.f27969to;
        if (d2 != 0.0d) {
            c3059ii.m12955x1("ySplit", C13850af.m65101k4(d2));
        }
        String str3 = this.f27965du;
        if (str3 != null) {
            c3059ii.m12955x1("topLeftCell", str3);
        }
        int i = this.f27966h4;
        if (i != f27963k4) {
            c3059ii.m12955x1("activePane", mfd.m36914k4(i));
        }
        int i2 = this.f27968m9;
        if (i2 != f27964x1) {
            c3059ii.m12955x1("state", dt0.m30573k4(i2));
        }
        c3059ii.mo21898jd();
    }
}
