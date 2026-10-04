package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class fpw extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f22964dy = new C7017h4("year", "month", "day", "hour", "minute", "second", "dateTimeGrouping");

    /* JADX INFO: renamed from: du */
    private int f22965du;

    /* JADX INFO: renamed from: h4 */
    private int f22966h4;

    /* JADX INFO: renamed from: k4 */
    private int f22967k4;

    /* JADX INFO: renamed from: kk */
    private int f22968kk;

    /* JADX INFO: renamed from: m9 */
    private int f22969m9;

    /* JADX INFO: renamed from: to */
    private int f22970to;

    /* JADX INFO: renamed from: x1 */
    private int f22971x1;

    public fpw() {
        m31987x1();
    }

    public fpw(AbstractC13912i5 abstractC13912i5) {
        m31987x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fpw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (fpw.f22964dy.m27428k4(str)) {
                    case 0:
                        fpw.this.f22967k4 = C13850af.m65150x6(str2);
                        break;
                    case 1:
                        fpw.this.f22971x1 = C13850af.m65150x6(str2);
                        break;
                    case 2:
                        fpw.this.f22968kk = C13850af.m65150x6(str2);
                        break;
                    case 3:
                        fpw.this.f22970to = C13850af.m65150x6(str2);
                        break;
                    case 4:
                        fpw.this.f22965du = C13850af.m65150x6(str2);
                        break;
                    case 5:
                        fpw.this.f22966h4 = C13850af.m65150x6(str2);
                        break;
                    case 6:
                        fpw.this.f22969m9 = a5l.m27947k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m31987x1() {
        this.f22971x1 = 0;
        this.f22968kk = 0;
        this.f22970to = 0;
        this.f22965du = 0;
        this.f22966h4 = 0;
        this.f22969m9 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("year", C13850af.m65146x1(this.f22967k4));
        int i = this.f22971x1;
        if ((i & 65535) != 0) {
            c3059ii.m12955x1("month", C13850af.m65146x1(i));
        }
        int i2 = this.f22968kk;
        if ((i2 & 65535) != 0) {
            c3059ii.m12955x1("day", C13850af.m65146x1(i2));
        }
        int i3 = this.f22970to;
        if ((i3 & 65535) != 0) {
            c3059ii.m12955x1("hour", C13850af.m65146x1(i3));
        }
        int i4 = this.f22965du;
        if ((i4 & 65535) != 0) {
            c3059ii.m12955x1("minute", C13850af.m65146x1(i4));
        }
        int i5 = this.f22966h4;
        if ((65535 & i5) != 0) {
            c3059ii.m12955x1("second", C13850af.m65146x1(i5));
        }
        c3059ii.m12955x1("dateTimeGrouping", a5l.m27948k4(this.f22969m9));
        c3059ii.mo21898jd();
    }
}
