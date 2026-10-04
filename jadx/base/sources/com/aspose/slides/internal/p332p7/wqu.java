package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes4.dex */
public class wqu extends AbstractC7361bz {

    /* JADX INFO: renamed from: ne */
    private static final C7017h4 f32459ne = new C7017h4("password", "sheet", "objects", "scenarios", "formatCells", "formatColumns", "formatRows", "insertColumns", "insertRows", "insertHyperlinks", "deleteColumns", "deleteRows", "selectLockedCells", NoteMeta.PROPERTY_SORT_KEY, "autoFilter", "pivotTables", "selectUnlockedCells");

    /* JADX INFO: renamed from: c5 */
    private boolean f32460c5;

    /* JADX INFO: renamed from: ck */
    private boolean f32461ck;

    /* JADX INFO: renamed from: du */
    private boolean f32462du;

    /* JADX INFO: renamed from: dy */
    private boolean f32463dy;

    /* JADX INFO: renamed from: fa */
    private boolean f32464fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f32465h4;

    /* JADX INFO: renamed from: jd */
    private boolean f32466jd;

    /* JADX INFO: renamed from: k4 */
    private int f32467k4;

    /* JADX INFO: renamed from: kk */
    private boolean f32468kk;

    /* JADX INFO: renamed from: ks */
    private boolean f32469ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f32470m9;

    /* JADX INFO: renamed from: rv */
    private boolean f32471rv;

    /* JADX INFO: renamed from: to */
    private boolean f32472to;

    /* JADX INFO: renamed from: up */
    private boolean f32473up;

    /* JADX INFO: renamed from: x1 */
    private boolean f32474x1;

    /* JADX INFO: renamed from: x6 */
    private boolean f32475x6;

    /* JADX INFO: renamed from: yj */
    private boolean f32476yj;

    public wqu() {
        m43873x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m43873x1() {
        this.f32467k4 = 65535;
        this.f32474x1 = false;
        this.f32468kk = false;
        this.f32472to = false;
        this.f32462du = true;
        this.f32465h4 = true;
        this.f32470m9 = true;
        this.f32463dy = true;
        this.f32460c5 = true;
        this.f32466jd = true;
        this.f32461ck = true;
        this.f32464fa = true;
        this.f32473up = false;
        this.f32476yj = true;
        this.f32469ks = true;
        this.f32471rv = true;
        this.f32475x6 = false;
    }

    public wqu(AbstractC13912i5 abstractC13912i5) {
        m43873x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wqu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (wqu.f32459ne.m27428k4(str)) {
                    case 0:
                        wqu.this.f32467k4 = C14081nv.m67064k4(str2, 515);
                        break;
                    case 1:
                        wqu.this.f32474x1 = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        wqu.this.f32468kk = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        wqu.this.f32472to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        wqu.this.f32462du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        wqu.this.f32465h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        wqu.this.f32470m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        wqu.this.f32463dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        wqu.this.f32460c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        wqu.this.f32466jd = C13850af.m65068c5(str2);
                        break;
                    case 10:
                        wqu.this.f32461ck = C13850af.m65068c5(str2);
                        break;
                    case 11:
                        wqu.this.f32464fa = C13850af.m65068c5(str2);
                        break;
                    case 12:
                        wqu.this.f32473up = C13850af.m65068c5(str2);
                        break;
                    case 13:
                        wqu.this.f32476yj = C13850af.m65068c5(str2);
                        break;
                    case 14:
                        wqu.this.f32469ks = C13850af.m65068c5(str2);
                        break;
                    case 15:
                        wqu.this.f32471rv = C13850af.m65068c5(str2);
                        break;
                    case 16:
                        wqu.this.f32475x6 = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f32467k4;
        if ((i & 65535) != 65535) {
            c3059ii.m12955x1("password", C14057f9.m66587k4(i & 65535, "X4"));
        }
        boolean z = this.f32474x1;
        if (z) {
            c3059ii.m12955x1("sheet", z ? "1" : "0");
        }
        boolean z2 = this.f32468kk;
        if (z2) {
            c3059ii.m12955x1("objects", z2 ? "1" : "0");
        }
        boolean z3 = this.f32472to;
        if (z3) {
            c3059ii.m12955x1("scenarios", z3 ? "1" : "0");
        }
        boolean z4 = this.f32462du;
        if (!z4) {
            c3059ii.m12955x1("formatCells", z4 ? "1" : "0");
        }
        boolean z5 = this.f32465h4;
        if (!z5) {
            c3059ii.m12955x1("formatColumns", z5 ? "1" : "0");
        }
        boolean z6 = this.f32470m9;
        if (!z6) {
            c3059ii.m12955x1("formatRows", z6 ? "1" : "0");
        }
        boolean z7 = this.f32463dy;
        if (!z7) {
            c3059ii.m12955x1("insertColumns", z7 ? "1" : "0");
        }
        boolean z8 = this.f32460c5;
        if (!z8) {
            c3059ii.m12955x1("insertRows", z8 ? "1" : "0");
        }
        boolean z9 = this.f32466jd;
        if (!z9) {
            c3059ii.m12955x1("insertHyperlinks", z9 ? "1" : "0");
        }
        boolean z10 = this.f32461ck;
        if (!z10) {
            c3059ii.m12955x1("deleteColumns", z10 ? "1" : "0");
        }
        boolean z11 = this.f32464fa;
        if (!z11) {
            c3059ii.m12955x1("deleteRows", z11 ? "1" : "0");
        }
        boolean z12 = this.f32473up;
        if (z12) {
            c3059ii.m12955x1("selectLockedCells", z12 ? "1" : "0");
        }
        boolean z13 = this.f32476yj;
        if (!z13) {
            c3059ii.m12955x1(NoteMeta.PROPERTY_SORT_KEY, z13 ? "1" : "0");
        }
        boolean z14 = this.f32469ks;
        if (!z14) {
            c3059ii.m12955x1("autoFilter", z14 ? "1" : "0");
        }
        boolean z15 = this.f32471rv;
        if (!z15) {
            c3059ii.m12955x1("pivotTables", z15 ? "1" : "0");
        }
        boolean z16 = this.f32475x6;
        if (z16) {
            c3059ii.m12955x1("selectUnlockedCells", z16 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
