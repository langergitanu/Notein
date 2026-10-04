package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: loaded from: classes4.dex */
public class c0w extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f20843k4 = mfd.m36913k4("topLeft");

    /* JADX INFO: renamed from: u4 */
    private static final C7017h4 f20844u4 = new C7017h4("pane", "showHeader", Constants.ScionAnalytics.PARAM_LABEL, Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "extendable", C18293o1.f55803f, "axis", "dimension", "start", "min", "max", "activeRow", "activeCol", "previousRow", "previousCol", "click", "r:id", "pivotArea");

    /* JADX INFO: renamed from: c5 */
    private long f20845c5;

    /* JADX INFO: renamed from: ck */
    private long f20846ck;

    /* JADX INFO: renamed from: du */
    private boolean f20847du;

    /* JADX INFO: renamed from: dy */
    private int f20848dy;

    /* JADX INFO: renamed from: fa */
    private long f20849fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f20850h4;

    /* JADX INFO: renamed from: ix */
    private omh f20851ix;

    /* JADX INFO: renamed from: jd */
    private long f20852jd;

    /* JADX INFO: renamed from: kk */
    private boolean f20853kk;

    /* JADX INFO: renamed from: ks */
    private long f20854ks;

    /* JADX INFO: renamed from: m9 */
    private long f20855m9;

    /* JADX INFO: renamed from: ne */
    private String f20856ne;

    /* JADX INFO: renamed from: rv */
    private long f20857rv;

    /* JADX INFO: renamed from: to */
    private boolean f20858to;

    /* JADX INFO: renamed from: up */
    private long f20859up;

    /* JADX INFO: renamed from: x1 */
    private int f20860x1;

    /* JADX INFO: renamed from: x6 */
    private long f20861x6;

    /* JADX INFO: renamed from: yj */
    private long f20862yj;

    public c0w() {
        m29367x1();
        this.f20851ix = new omh();
    }

    public c0w(final AbstractC13912i5 abstractC13912i5) {
        m29367x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.c0w.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (c0w.f20844u4.m27428k4(str)) {
                    case 0:
                        c0w.this.f20860x1 = mfd.m36913k4(str2);
                        break;
                    case 1:
                        c0w.this.f20853kk = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        c0w.this.f20858to = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        c0w.this.f20847du = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        c0w.this.f20850h4 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        c0w.this.f20855m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 6:
                        c0w.this.f20848dy = o5d.m38012k4(str2);
                        break;
                    case 7:
                        c0w.this.f20845c5 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 8:
                        c0w.this.f20852jd = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 9:
                        c0w.this.f20846ck = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 10:
                        c0w.this.f20849fa = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 11:
                        c0w.this.f20859up = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 12:
                        c0w.this.f20862yj = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 13:
                        c0w.this.f20854ks = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 14:
                        c0w.this.f20857rv = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 15:
                        c0w.this.f20861x6 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 16:
                        c0w.this.f20856ne = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.c0w.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (c0w.f20844u4.m27428k4(abstractC13912i5.mo65023fa()) != 17) {
                    return false;
                }
                c0w.this.f20851ix = new omh(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m29367x1() {
        this.f20860x1 = f20843k4;
        this.f20853kk = false;
        this.f20858to = false;
        this.f20847du = false;
        this.f20850h4 = false;
        this.f20855m9 = 0L;
        this.f20848dy = 0;
        this.f20845c5 = 0L;
        this.f20852jd = 0L;
        this.f20846ck = 0L;
        this.f20849fa = 0L;
        this.f20859up = 0L;
        this.f20862yj = 0L;
        this.f20854ks = 0L;
        this.f20857rv = 0L;
        this.f20861x6 = 0L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f20860x1;
        if (i != f20843k4) {
            c3059ii.m12955x1("pane", mfd.m36914k4(i));
        }
        boolean z = this.f20853kk;
        if (z) {
            c3059ii.m12955x1("showHeader", z ? "1" : "0");
        }
        boolean z2 = this.f20858to;
        if (z2) {
            c3059ii.m12955x1(Constants.ScionAnalytics.PARAM_LABEL, z2 ? "1" : "0");
        }
        boolean z3 = this.f20847du;
        if (z3) {
            c3059ii.m12955x1(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, z3 ? "1" : "0");
        }
        boolean z4 = this.f20850h4;
        if (z4) {
            c3059ii.m12955x1("extendable", z4 ? "1" : "0");
        }
        long j = this.f20855m9;
        if ((j & 4294967295L) != 0) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65147x1(j));
        }
        int i2 = this.f20848dy;
        if (i2 != 0) {
            c3059ii.m12955x1("axis", o5d.m38013k4(i2));
        }
        long j2 = this.f20845c5;
        if ((j2 & 4294967295L) != 0) {
            c3059ii.m12955x1("dimension", C13850af.m65147x1(j2));
        }
        long j3 = this.f20852jd;
        if ((j3 & 4294967295L) != 0) {
            c3059ii.m12955x1("start", C13850af.m65147x1(j3));
        }
        long j4 = this.f20846ck;
        if ((j4 & 4294967295L) != 0) {
            c3059ii.m12955x1("min", C13850af.m65147x1(j4));
        }
        long j5 = this.f20849fa;
        if ((j5 & 4294967295L) != 0) {
            c3059ii.m12955x1("max", C13850af.m65147x1(j5));
        }
        long j6 = this.f20859up;
        if ((j6 & 4294967295L) != 0) {
            c3059ii.m12955x1("activeRow", C13850af.m65147x1(j6));
        }
        long j7 = this.f20862yj;
        if ((j7 & 4294967295L) != 0) {
            c3059ii.m12955x1("activeCol", C13850af.m65147x1(j7));
        }
        long j8 = this.f20854ks;
        if ((j8 & 4294967295L) != 0) {
            c3059ii.m12955x1("previousRow", C13850af.m65147x1(j8));
        }
        long j9 = this.f20857rv;
        if ((j9 & 4294967295L) != 0) {
            c3059ii.m12955x1("previousCol", C13850af.m65147x1(j9));
        }
        long j10 = this.f20861x6;
        if ((4294967295L & j10) != 0) {
            c3059ii.m12955x1("click", C13850af.m65147x1(j10));
        }
        if (this.f20856ne != null) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:id", this.f20856ne);
        }
        this.f20851ix.mo6846k4("ssml", c3059ii, "pivotArea");
        c3059ii.mo21898jd();
    }
}
