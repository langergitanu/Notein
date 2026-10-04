package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class ry2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f29782c5 = new C7017h4("draw:name", "draw:display-name", "draw:style", "draw:dots1", "draw:dots1-length", "draw:dots2", "draw:dots2-length", "draw:distance");

    /* JADX INFO: renamed from: du */
    private String f29783du;

    /* JADX INFO: renamed from: dy */
    private String f29784dy;

    /* JADX INFO: renamed from: h4 */
    private int f29785h4;

    /* JADX INFO: renamed from: k4 */
    private String f29786k4;

    /* JADX INFO: renamed from: kk */
    private int f29787kk;

    /* JADX INFO: renamed from: m9 */
    private String f29788m9;

    /* JADX INFO: renamed from: to */
    private int f29789to;

    /* JADX INFO: renamed from: x1 */
    private String f29790x1;

    public ry2() {
        m40606dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m40606dy() {
        this.f29787kk = 0;
        this.f29789to = 0;
        this.f29785h4 = 0;
    }

    /* JADX INFO: renamed from: du */
    public final String m40615du() {
        return this.f29788m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m40616h4() {
        return this.f29784dy;
    }

    /* JADX INFO: renamed from: to */
    public final int m40623to() {
        return this.f29785h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m40625x1() {
        return this.f29789to;
    }

    public ry2(AbstractC13912i5 abstractC13912i5) {
        m40606dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ry2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (ry2.f29782c5.m27428k4(str)) {
                    case 0:
                        ry2.this.f29786k4 = str2;
                        break;
                    case 1:
                        ry2.this.f29790x1 = str2;
                        break;
                    case 2:
                        ry2.this.f29787kk = t8i.m41575k4(str2);
                        break;
                    case 3:
                        ry2.this.f29789to = C13850af.m65151yj(str2);
                        break;
                    case 4:
                        ry2.this.f29783du = str2;
                        break;
                    case 5:
                        ry2.this.f29785h4 = C13850af.m65151yj(str2);
                        break;
                    case 6:
                        ry2.this.f29788m9 = str2;
                        break;
                    case 7:
                        ry2.this.f29784dy = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m40617k4() {
        return this.f29786k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m40620kk() {
        return this.f29783du;
    }

    /* JADX INFO: renamed from: to */
    public final void m40624to(String str) {
        this.f29784dy = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40618k4(int i) {
        this.f29787kk = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m40621kk(int i) {
        this.f29785h4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m40626x1(int i) {
        this.f29789to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40619k4(String str) {
        this.f29786k4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m40622kk(String str) {
        this.f29788m9 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m40627x1(String str) {
        this.f29783du = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("draw:name", this.f29786k4);
        String str3 = this.f29790x1;
        if (str3 != null) {
            c3059ii.m12955x1("draw:display-name", str3);
        }
        c3059ii.m12955x1("draw:style", t8i.m41576k4(this.f29787kk));
        int i = this.f29789to;
        if (i != 0) {
            c3059ii.m12955x1("draw:dots1", C13850af.m65103k4(i));
        }
        String str4 = this.f29783du;
        if (str4 != null) {
            c3059ii.m12955x1("draw:dots1-length", str4);
        }
        int i2 = this.f29785h4;
        if (i2 != 0) {
            c3059ii.m12955x1("draw:dots2", C13850af.m65103k4(i2));
        }
        String str5 = this.f29788m9;
        if (str5 != null) {
            c3059ii.m12955x1("draw:dots2-length", str5);
        }
        String str6 = this.f29784dy;
        if (str6 != null) {
            c3059ii.m12955x1("draw:distance", str6);
        }
        c3059ii.mo21898jd();
    }
}
