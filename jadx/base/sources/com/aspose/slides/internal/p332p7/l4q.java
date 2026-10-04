package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class l4q extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f26137jd = new C7017h4("table:column", "table:row", "table:table", "table:start-column", "table:start-row", "table:start-table", "table:end-column", "table:end-row", "table:end-table");

    /* JADX INFO: renamed from: c5 */
    private int f26138c5;

    /* JADX INFO: renamed from: du */
    private int f26139du;

    /* JADX INFO: renamed from: dy */
    private int f26140dy;

    /* JADX INFO: renamed from: h4 */
    private int f26141h4;

    /* JADX INFO: renamed from: k4 */
    private int f26142k4;

    /* JADX INFO: renamed from: kk */
    private int f26143kk;

    /* JADX INFO: renamed from: m9 */
    private int f26144m9;

    /* JADX INFO: renamed from: to */
    private int f26145to;

    /* JADX INFO: renamed from: x1 */
    private int f26146x1;

    public l4q() {
        m35922x1();
    }

    public l4q(AbstractC13912i5 abstractC13912i5) {
        m35922x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.l4q.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (l4q.f26137jd.m27428k4(str)) {
                    case 0:
                        l4q.this.f26142k4 = C13850af.m65151yj(str2);
                        break;
                    case 1:
                        l4q.this.f26146x1 = C13850af.m65151yj(str2);
                        break;
                    case 2:
                        l4q.this.f26143kk = C13850af.m65151yj(str2);
                        break;
                    case 3:
                        l4q.this.f26145to = C13850af.m65151yj(str2);
                        break;
                    case 4:
                        l4q.this.f26139du = C13850af.m65151yj(str2);
                        break;
                    case 5:
                        l4q.this.f26141h4 = C13850af.m65151yj(str2);
                        break;
                    case 6:
                        l4q.this.f26144m9 = C13850af.m65151yj(str2);
                        break;
                    case 7:
                        l4q.this.f26140dy = C13850af.m65151yj(str2);
                        break;
                    case 8:
                        l4q.this.f26138c5 = C13850af.m65151yj(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m35922x1() {
        this.f26142k4 = 0;
        this.f26146x1 = 0;
        this.f26143kk = 0;
        this.f26145to = 0;
        this.f26139du = 0;
        this.f26141h4 = 0;
        this.f26144m9 = 0;
        this.f26140dy = 0;
        this.f26138c5 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f26142k4;
        if (i != 0) {
            c3059ii.m12955x1("table:column", C13850af.m65103k4(i));
        }
        int i2 = this.f26146x1;
        if (i2 != 0) {
            c3059ii.m12955x1("table:row", C13850af.m65103k4(i2));
        }
        int i3 = this.f26143kk;
        if (i3 != 0) {
            c3059ii.m12955x1("table:table", C13850af.m65103k4(i3));
        }
        int i4 = this.f26145to;
        if (i4 != 0) {
            c3059ii.m12955x1("table:start-column", C13850af.m65103k4(i4));
        }
        int i5 = this.f26139du;
        if (i5 != 0) {
            c3059ii.m12955x1("table:start-row", C13850af.m65103k4(i5));
        }
        int i6 = this.f26141h4;
        if (i6 != 0) {
            c3059ii.m12955x1("table:start-table", C13850af.m65103k4(i6));
        }
        int i7 = this.f26144m9;
        if (i7 != 0) {
            c3059ii.m12955x1("table:end-column", C13850af.m65103k4(i7));
        }
        int i8 = this.f26140dy;
        if (i8 != 0) {
            c3059ii.m12955x1("table:end-row", C13850af.m65103k4(i8));
        }
        int i9 = this.f26138c5;
        if (i9 != 0) {
            c3059ii.m12955x1("table:end-table", C13850af.m65103k4(i9));
        }
        c3059ii.mo21898jd();
    }
}
