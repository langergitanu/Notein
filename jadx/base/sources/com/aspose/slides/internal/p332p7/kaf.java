package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes4.dex */
public class kaf extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private double f25555kk;

    /* JADX INFO: renamed from: to */
    private int f25556to;

    /* JADX INFO: renamed from: x1 */
    private double f25557x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f25554k4 = C8056k5.m35130k4("custom");

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25553du = new C7017h4("cx", TranslateLanguage.WELSH, C18437z2.f56754h);

    public kaf() {
        m35236du();
    }

    /* JADX INFO: renamed from: du */
    private void m35236du() {
        this.f25557x1 = Double.NaN;
        this.f25555kk = Double.NaN;
        this.f25556to = f25554k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m35241k4() {
        return this.f25557x1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m35244kk() {
        return this.f25556to;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m35245x1() {
        return this.f25555kk;
    }

    public kaf(AbstractC13912i5 abstractC13912i5) {
        m35236du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kaf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = kaf.f25553du.m27428k4(str);
                if (iM27428k4 == 0) {
                    kaf.this.f25557x1 = C13850af.m65122ks(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 == 1) {
                    kaf.this.f25555kk = C13850af.m65122ks(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                kaf.this.f25556to = C8056k5.m35130k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35246x1(double d) {
        this.f25555kk = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35242k4(double d) {
        this.f25557x1 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35243k4(int i) {
        this.f25556to = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("cx", C22238OooO0oO.OooO00o(this.f25557x1, 12700.0d, 14));
        c3059ii.m12955x1(TranslateLanguage.WELSH, C22238OooO0oO.OooO00o(this.f25555kk, 12700.0d, 14));
        int i = this.f25556to;
        if (i != f25554k4) {
            c3059ii.m12955x1(C18437z2.f56754h, C8056k5.m35131k4(i));
        }
        c3059ii.mo21898jd();
    }
}
