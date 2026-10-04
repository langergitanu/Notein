package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class v9z extends AbstractC7361bz {

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f31626rv = new C7017h4("meta:page-count", "meta:table-count", "meta:draw-count", "meta:image-count", "meta:ole-object-count", "meta:object-count", "meta:paragraph-count", "meta:word-count", "meta:character-count", "frame-count", "sentence-count", "syllable-count", "non-whitespace-character-count", "meta:row-count", "meta:cell-count");

    /* JADX INFO: renamed from: c5 */
    private long f31627c5;

    /* JADX INFO: renamed from: ck */
    private long f31628ck;

    /* JADX INFO: renamed from: du */
    private long f31629du;

    /* JADX INFO: renamed from: dy */
    private long f31630dy;

    /* JADX INFO: renamed from: fa */
    private long f31631fa;

    /* JADX INFO: renamed from: h4 */
    private long f31632h4;

    /* JADX INFO: renamed from: jd */
    private long f31633jd;

    /* JADX INFO: renamed from: k4 */
    private long f31634k4;

    /* JADX INFO: renamed from: kk */
    private long f31635kk;

    /* JADX INFO: renamed from: ks */
    private long f31636ks;

    /* JADX INFO: renamed from: m9 */
    private long f31637m9;

    /* JADX INFO: renamed from: to */
    private long f31638to;

    /* JADX INFO: renamed from: up */
    private long f31639up;

    /* JADX INFO: renamed from: x1 */
    private long f31640x1;

    /* JADX INFO: renamed from: yj */
    private long f31641yj;

    public v9z() {
        m42834x1();
    }

    public v9z(AbstractC13912i5 abstractC13912i5) {
        m42834x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.v9z.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (v9z.f31626rv.m27428k4(str)) {
                    case 0:
                        v9z.this.f31634k4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        v9z.this.f31640x1 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 2:
                        v9z.this.f31635kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 3:
                        v9z.this.f31638to = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 4:
                        v9z.this.f31629du = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 5:
                        v9z.this.f31632h4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 6:
                        v9z.this.f31637m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 7:
                        v9z.this.f31630dy = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 8:
                        v9z.this.f31627c5 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 9:
                        v9z.this.f31633jd = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 10:
                        v9z.this.f31628ck = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 11:
                        v9z.this.f31631fa = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 12:
                        v9z.this.f31639up = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 13:
                        v9z.this.f31641yj = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 14:
                        v9z.this.f31636ks = AbstractC7361bz.m29295ne(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m42834x1() {
        this.f31634k4 = 4294967295L;
        this.f31640x1 = 4294967295L;
        this.f31635kk = 4294967295L;
        this.f31638to = 4294967295L;
        this.f31629du = 4294967295L;
        this.f31632h4 = 4294967295L;
        this.f31637m9 = 4294967295L;
        this.f31630dy = 4294967295L;
        this.f31627c5 = 4294967295L;
        this.f31633jd = 4294967295L;
        this.f31628ck = 4294967295L;
        this.f31631fa = 4294967295L;
        this.f31639up = 4294967295L;
        this.f31641yj = 4294967295L;
        this.f31636ks = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f31634k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("meta:page-count", C13850af.m65147x1(j));
        }
        long j2 = this.f31640x1;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("meta:table-count", C13850af.m65147x1(j2));
        }
        long j3 = this.f31635kk;
        if ((j3 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("meta:draw-count", C13850af.m65147x1(j3));
        }
        long j4 = this.f31638to;
        if ((j4 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("meta:image-count", C13850af.m65147x1(j4));
        }
        long j5 = this.f31629du;
        if ((j5 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("meta:ole-object-count", C13850af.m65147x1(j5));
        }
        long j6 = this.f31632h4;
        if ((j6 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("meta:object-count", C13850af.m65147x1(j6));
        }
        long j7 = this.f31637m9;
        if ((j7 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("meta:paragraph-count", C13850af.m65147x1(j7));
        }
        long j8 = this.f31630dy;
        if ((j8 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("meta:word-count", C13850af.m65147x1(j8));
        }
        long j9 = this.f31627c5;
        if ((j9 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("meta:character-count", C13850af.m65147x1(j9));
        }
        long j10 = this.f31633jd;
        if ((j10 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("frame-count", C13850af.m65147x1(j10));
        }
        long j11 = this.f31628ck;
        if ((j11 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("sentence-count", C13850af.m65147x1(j11));
        }
        long j12 = this.f31631fa;
        if ((j12 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("syllable-count", C13850af.m65147x1(j12));
        }
        long j13 = this.f31639up;
        if ((j13 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("non-whitespace-character-count", C13850af.m65147x1(j13));
        }
        long j14 = this.f31641yj;
        if ((j14 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("meta:row-count", C13850af.m65147x1(j14));
        }
        long j15 = this.f31636ks;
        if ((j15 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("meta:cell-count", C13850af.m65147x1(j15));
        }
        c3059ii.mo21898jd();
    }
}
