package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class c0x extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f20866jd = new C7017h4("style:position", "style:type", "style:char", "style:leader-type", "style:leader-style", "style:leader-width", "style:leader-color", "style:leader-text", "style:leader-text-style");

    /* JADX INFO: renamed from: c5 */
    private String f20867c5;

    /* JADX INFO: renamed from: du */
    private int f20868du;

    /* JADX INFO: renamed from: dy */
    private String f20869dy;

    /* JADX INFO: renamed from: h4 */
    private String f20870h4;

    /* JADX INFO: renamed from: k4 */
    private String f20871k4;

    /* JADX INFO: renamed from: kk */
    private char f20872kk;

    /* JADX INFO: renamed from: m9 */
    private String f20873m9;

    /* JADX INFO: renamed from: to */
    private int f20874to;

    /* JADX INFO: renamed from: x1 */
    private int f20875x1;

    public c0x() {
        m29379x1();
    }

    public c0x(AbstractC13912i5 abstractC13912i5) {
        m29379x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.c0x.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (c0x.f20866jd.m27428k4(str)) {
                    case 0:
                        c0x.this.f20871k4 = str2;
                        break;
                    case 1:
                        c0x.this.f20875x1 = ibg.m33999k4(str2);
                        break;
                    case 2:
                        c0x.this.f20872kk = C13850af.m65075jd(str2);
                        break;
                    case 3:
                        c0x.this.f20874to = lf0.m36038k4(str2);
                        break;
                    case 4:
                        c0x.this.f20868du = jrz.m34917k4(str2);
                        break;
                    case 5:
                        c0x.this.f20870h4 = str2;
                        break;
                    case 6:
                        c0x.this.f20873m9 = str2;
                        break;
                    case 7:
                        c0x.this.f20869dy = str2;
                        break;
                    case 8:
                        c0x.this.f20867c5 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m29379x1() {
        this.f20875x1 = 0;
        this.f20872kk = (char) 0;
        this.f20874to = 0;
        this.f20868du = 0;
        this.f20869dy = " ";
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29380k4(String str) {
        this.f20871k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:position", this.f20871k4);
        int i = this.f20875x1;
        if (i != 0) {
            c3059ii.m12955x1("style:type", ibg.m34000k4(i));
        }
        char c = this.f20872kk;
        if (c != 0) {
            c3059ii.m12955x1("style:char", C13850af.m65100k4(c));
        }
        int i2 = this.f20874to;
        if (i2 != 0) {
            c3059ii.m12955x1("style:leader-type", lf0.m36039k4(i2));
        }
        int i3 = this.f20868du;
        if (i3 != 0) {
            c3059ii.m12955x1("style:leader-style", jrz.m34918k4(i3));
        }
        String str3 = this.f20870h4;
        if (str3 != null) {
            c3059ii.m12955x1("style:leader-width", str3);
        }
        String str4 = this.f20873m9;
        if (str4 != null) {
            c3059ii.m12955x1("style:leader-color", str4);
        }
        if (!" ".equals(this.f20869dy)) {
            c3059ii.m12955x1("style:leader-text", this.f20869dy);
        }
        String str5 = this.f20867c5;
        if (str5 != null) {
            c3059ii.m12955x1("style:leader-text-style", str5);
        }
        c3059ii.mo21898jd();
    }
}
