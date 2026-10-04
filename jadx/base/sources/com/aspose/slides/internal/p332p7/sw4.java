package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes4.dex */
public class sw4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private String f30442c5;

    /* JADX INFO: renamed from: ck */
    private g3j f30443ck;

    /* JADX INFO: renamed from: du */
    private long f30444du;

    /* JADX INFO: renamed from: dy */
    private qy7 f30445dy;

    /* JADX INFO: renamed from: h4 */
    private long f30446h4;

    /* JADX INFO: renamed from: jd */
    private mhp f30447jd;

    /* JADX INFO: renamed from: kk */
    private long f30448kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f30449m9;

    /* JADX INFO: renamed from: to */
    private byte f30450to;

    /* JADX INFO: renamed from: x1 */
    private String f30451x1;

    /* JADX INFO: renamed from: k4 */
    public static final byte f30441k4 = C7771gk.m32586k4(BackupFile.PREFIX_NOTE_DIR);

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f30440fa = new C7017h4("r", "s", "t", "cm", "vm", "ph", "f", "v", TranslateLanguage.ICELANDIC, "extLst");

    public sw4() {
        m41382m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m41382m9() {
        this.f30448kk = 0L;
        this.f30450to = f30441k4;
        this.f30444du = 0L;
        this.f30446h4 = 0L;
        this.f30449m9 = false;
    }

    /* JADX INFO: renamed from: du */
    public final String m41385du() {
        return this.f30442c5;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m41391kk() {
        return this.f30450to;
    }

    /* JADX INFO: renamed from: to */
    public final qy7 m41392to() {
        return this.f30445dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m41393x1() {
        return this.f30448kk;
    }

    public sw4(final AbstractC13912i5 abstractC13912i5) {
        m41382m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.sw4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = sw4.f30440fa.m27428k4(str);
                if (iM27428k4 == 0) {
                    sw4.this.f30451x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    sw4.this.f30448kk = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    sw4.this.f30450to = C7771gk.m32586k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    sw4.this.f30444du = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    sw4.this.f30446h4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                sw4.this.f30449m9 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.sw4.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (sw4.f30440fa.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 6:
                        sw4.this.f30445dy = new qy7(abstractC13912i5);
                        return true;
                    case 7:
                        sw4.this.f30442c5 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            sw4 sw4Var = sw4.this;
                            sw4Var.f30442c5 = C14113y2.m67400k4(sw4Var.f30442c5, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 8:
                        sw4.this.f30447jd = new mhp(abstractC13912i5);
                        return true;
                    case 9:
                        sw4.this.f30443ck = new g3j(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m41394x1(String str) {
        this.f30442c5 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m41386k4() {
        return this.f30451x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41387k4(byte b) {
        this.f30450to = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41388k4(long j) {
        this.f30448kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41389k4(qy7 qy7Var) {
        this.f30445dy = qy7Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41390k4(String str) {
        this.f30451x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        sw4 sw4Var;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30451x1;
        if (str3 != null) {
            c3059ii.m12955x1("r", str3);
        }
        long j = this.f30448kk;
        if ((j & 4294967295L) != 0) {
            c3059ii.m12955x1("s", C13850af.m65147x1(j));
        }
        byte b = this.f30450to;
        if (b != f30441k4) {
            c3059ii.m12955x1("t", C7771gk.m32587k4(b));
        }
        long j2 = this.f30444du;
        if ((j2 & 4294967295L) != 0) {
            c3059ii.m12955x1("cm", C13850af.m65147x1(j2));
        }
        long j3 = this.f30446h4;
        if ((4294967295L & j3) != 0) {
            c3059ii.m12955x1("vm", C13850af.m65147x1(j3));
        }
        boolean z = this.f30449m9;
        if (z) {
            c3059ii.m12955x1("ph", z ? "1" : "0");
        }
        qy7 qy7Var = this.f30445dy;
        if (qy7Var != null) {
            qy7Var.mo6846k4("ssml", c3059ii, "f");
        }
        String str4 = this.f30442c5;
        if (str4 != null) {
            sw4Var = this;
            c3059ii2 = c3059ii;
            sw4Var.m29301k4("ssml", c3059ii2, "v", str4, true);
        } else {
            sw4Var = this;
            c3059ii2 = c3059ii;
        }
        mhp mhpVar = sw4Var.f30447jd;
        if (mhpVar != null) {
            mhpVar.mo6846k4("ssml", c3059ii2, TranslateLanguage.ICELANDIC);
        }
        g3j g3jVar = sw4Var.f30443ck;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii2, "extLst");
        }
        c3059ii2.mo21898jd();
    }
}
