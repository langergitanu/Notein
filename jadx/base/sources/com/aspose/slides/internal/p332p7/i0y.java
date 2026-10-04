package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class i0y extends AbstractC7361bz {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f24450up = new C7017h4("cryptProviderType", "cryptAlgorithmClass", "cryptAlgorithmType", "cryptAlgorithmSid", "spinCount", "saltData", "hashData", "cryptProvider", "algIdExt", "algIdExtSource", "cryptProviderTypeExt", "cryptProviderTypeExtSource");

    /* JADX INFO: renamed from: c5 */
    private long f24451c5;

    /* JADX INFO: renamed from: ck */
    private long f24452ck;

    /* JADX INFO: renamed from: du */
    private long f24453du;

    /* JADX INFO: renamed from: dy */
    private String f24454dy;

    /* JADX INFO: renamed from: fa */
    private String f24455fa;

    /* JADX INFO: renamed from: h4 */
    private String f24456h4;

    /* JADX INFO: renamed from: jd */
    private String f24457jd;

    /* JADX INFO: renamed from: k4 */
    private int f24458k4;

    /* JADX INFO: renamed from: kk */
    private int f24459kk;

    /* JADX INFO: renamed from: m9 */
    private String f24460m9;

    /* JADX INFO: renamed from: to */
    private long f24461to;

    /* JADX INFO: renamed from: x1 */
    private int f24462x1;

    public i0y() {
        m33798dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m33798dy() {
        this.f24458k4 = 0;
        this.f24462x1 = 0;
        this.f24459kk = 0;
        this.f24451c5 = 4294967295L;
        this.f24452ck = 4294967295L;
    }

    /* JADX INFO: renamed from: du */
    public final String m33811du() {
        return this.f24456h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m33812h4() {
        return this.f24460m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m33813k4() {
        return this.f24462x1;
    }

    /* JADX INFO: renamed from: to */
    public final long m33819to() {
        return this.f24453du;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m33820x1() {
        return this.f24459kk;
    }

    public i0y(AbstractC13912i5 abstractC13912i5) {
        m33798dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.i0y.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (i0y.f24450up.m27428k4(str)) {
                    case 0:
                        i0y.this.f24458k4 = zx5.m46018k4(str2);
                        break;
                    case 1:
                        i0y.this.f24462x1 = g5z.m32322k4(str2);
                        break;
                    case 2:
                        i0y.this.f24459kk = lrc.m36400k4(str2);
                        break;
                    case 3:
                        i0y.this.f24461to = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 4:
                        i0y.this.f24453du = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 5:
                        i0y.this.f24456h4 = str2;
                        break;
                    case 6:
                        i0y.this.f24460m9 = str2;
                        break;
                    case 7:
                        i0y.this.f24454dy = str2;
                        break;
                    case 8:
                        i0y.this.f24451c5 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 9:
                        i0y.this.f24457jd = str2;
                        break;
                    case 10:
                        i0y.this.f24452ck = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 11:
                        i0y.this.f24455fa = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: kk */
    public final long m33817kk() {
        return this.f24461to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33814k4(int i) {
        this.f24458k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m33818kk(int i) {
        this.f24459kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33821x1(int i) {
        this.f24462x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33815k4(long j) {
        this.f24461to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33822x1(long j) {
        this.f24453du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33816k4(String str) {
        this.f24456h4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33823x1(String str) {
        this.f24460m9 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("cryptProviderType", zx5.m46019k4(this.f24458k4));
        c3059ii.m12955x1("cryptAlgorithmClass", g5z.m32323k4(this.f24462x1));
        c3059ii.m12955x1("cryptAlgorithmType", lrc.m36401k4(this.f24459kk));
        c3059ii.m12955x1("cryptAlgorithmSid", C13850af.m65147x1(this.f24461to));
        c3059ii.m12955x1("spinCount", C13850af.m65147x1(this.f24453du));
        c3059ii.m12955x1("saltData", this.f24456h4);
        c3059ii.m12955x1("hashData", this.f24460m9);
        String str3 = this.f24454dy;
        if (str3 != null) {
            c3059ii.m12955x1("cryptProvider", str3);
        }
        long j = this.f24451c5;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("algIdExt", C13850af.m65147x1(j));
        }
        String str4 = this.f24457jd;
        if (str4 != null) {
            c3059ii.m12955x1("algIdExtSource", str4);
        }
        long j2 = this.f24452ck;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("cryptProviderTypeExt", C13850af.m65147x1(j2));
        }
        String str5 = this.f24455fa;
        if (str5 != null) {
            c3059ii.m12955x1("cryptProviderTypeExtSource", str5);
        }
        c3059ii.mo21898jd();
    }
}
