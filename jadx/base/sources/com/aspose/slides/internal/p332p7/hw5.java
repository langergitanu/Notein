package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class hw5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f24318jd = new C7017h4("table:column", "table:row", "table:table", "table:start-column", "table:start-row", "table:start-table", "table:end-column", "table:end-row", "table:end-table");

    /* JADX INFO: renamed from: c5 */
    private int f24319c5;

    /* JADX INFO: renamed from: du */
    private int f24320du;

    /* JADX INFO: renamed from: dy */
    private int f24321dy;

    /* JADX INFO: renamed from: h4 */
    private int f24322h4;

    /* JADX INFO: renamed from: k4 */
    private int f24323k4;

    /* JADX INFO: renamed from: kk */
    private int f24324kk;

    /* JADX INFO: renamed from: m9 */
    private int f24325m9;

    /* JADX INFO: renamed from: to */
    private int f24326to;

    /* JADX INFO: renamed from: x1 */
    private int f24327x1;

    public hw5() {
        m33652x1();
    }

    public hw5(AbstractC13912i5 abstractC13912i5) {
        m33652x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hw5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (hw5.f24318jd.m27428k4(str)) {
                    case 0:
                        hw5.this.f24323k4 = C13850af.m65151yj(str2);
                        break;
                    case 1:
                        hw5.this.f24327x1 = C13850af.m65151yj(str2);
                        break;
                    case 2:
                        hw5.this.f24324kk = C13850af.m65151yj(str2);
                        break;
                    case 3:
                        hw5.this.f24326to = C13850af.m65151yj(str2);
                        break;
                    case 4:
                        hw5.this.f24320du = C13850af.m65151yj(str2);
                        break;
                    case 5:
                        hw5.this.f24322h4 = C13850af.m65151yj(str2);
                        break;
                    case 6:
                        hw5.this.f24325m9 = C13850af.m65151yj(str2);
                        break;
                    case 7:
                        hw5.this.f24321dy = C13850af.m65151yj(str2);
                        break;
                    case 8:
                        hw5.this.f24319c5 = C13850af.m65151yj(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m33652x1() {
        this.f24323k4 = 0;
        this.f24327x1 = 0;
        this.f24324kk = 0;
        this.f24326to = 0;
        this.f24320du = 0;
        this.f24322h4 = 0;
        this.f24325m9 = 0;
        this.f24321dy = 0;
        this.f24319c5 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f24323k4;
        if (i != 0) {
            c3059ii.m12955x1("table:column", C13850af.m65103k4(i));
        }
        int i2 = this.f24327x1;
        if (i2 != 0) {
            c3059ii.m12955x1("table:row", C13850af.m65103k4(i2));
        }
        int i3 = this.f24324kk;
        if (i3 != 0) {
            c3059ii.m12955x1("table:table", C13850af.m65103k4(i3));
        }
        int i4 = this.f24326to;
        if (i4 != 0) {
            c3059ii.m12955x1("table:start-column", C13850af.m65103k4(i4));
        }
        int i5 = this.f24320du;
        if (i5 != 0) {
            c3059ii.m12955x1("table:start-row", C13850af.m65103k4(i5));
        }
        int i6 = this.f24322h4;
        if (i6 != 0) {
            c3059ii.m12955x1("table:start-table", C13850af.m65103k4(i6));
        }
        int i7 = this.f24325m9;
        if (i7 != 0) {
            c3059ii.m12955x1("table:end-column", C13850af.m65103k4(i7));
        }
        int i8 = this.f24321dy;
        if (i8 != 0) {
            c3059ii.m12955x1("table:end-row", C13850af.m65103k4(i8));
        }
        int i9 = this.f24319c5;
        if (i9 != 0) {
            c3059ii.m12955x1("table:end-table", C13850af.m65103k4(i9));
        }
        c3059ii.mo21898jd();
    }
}
