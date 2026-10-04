package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class suf extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private int f30396du;

    /* JADX INFO: renamed from: dy */
    private String f30397dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f30398h4;

    /* JADX INFO: renamed from: kk */
    private int f30399kk;

    /* JADX INFO: renamed from: m9 */
    private long f30400m9;

    /* JADX INFO: renamed from: to */
    private String f30401to;

    /* JADX INFO: renamed from: x1 */
    private String f30402x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f30395k4 = mm3.m37003k4("DVASPECT_CONTENT");

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f30394c5 = new C7017h4("progId", "dvAspect", "link", "oleUpdate", "autoLoad", "shapeId", "r:id");

    public suf() {
        m41333x1();
    }

    public suf(AbstractC13912i5 abstractC13912i5) {
        m41333x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.suf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (suf.f30394c5.m27428k4(str)) {
                    case 0:
                        suf.this.f30402x1 = str2;
                        break;
                    case 1:
                        suf.this.f30399kk = mm3.m37003k4(str2);
                        break;
                    case 2:
                        suf.this.f30401to = str2;
                        break;
                    case 3:
                        suf.this.f30396du = bqj.m29046k4(str2);
                        break;
                    case 4:
                        suf.this.f30398h4 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        suf.this.f30400m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 6:
                        suf.this.f30397dy = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m41333x1() {
        this.f30399kk = f30395k4;
        this.f30396du = 0;
        this.f30398h4 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30402x1;
        if (str3 != null) {
            c3059ii.m12955x1("progId", str3);
        }
        int i = this.f30399kk;
        if (i != f30395k4) {
            c3059ii.m12955x1("dvAspect", mm3.m37004k4(i));
        }
        String str4 = this.f30401to;
        if (str4 != null) {
            c3059ii.m12955x1("link", str4);
        }
        int i2 = this.f30396du;
        if (i2 != 0) {
            c3059ii.m12955x1("oleUpdate", bqj.m29047k4(i2));
        }
        boolean z = this.f30398h4;
        if (z) {
            c3059ii.m12955x1("autoLoad", z ? "1" : "0");
        }
        c3059ii.m12955x1("shapeId", C13850af.m65147x1(this.f30400m9));
        if (this.f30397dy != null) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:id", this.f30397dy);
        }
        c3059ii.mo21898jd();
    }
}
