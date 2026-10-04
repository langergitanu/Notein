package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p060ca.AbstractC2024c1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.uy */
/* JADX INFO: loaded from: classes3.dex */
public class C2330uy extends AbstractC2024c1 {
    public C2330uy(long j) {
        super(j, "Coverage");
        m11544h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m11544h4() {
        m10289k4(new AbstractC2024c1.x1() { // from class: com.aspose.slides.internal.ca.uy.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Fonts.TTF.Advanced_Typographic_Tables.TTFCoverageTable.LoadFormat1(Aspose.Fonts.TTF.Internals.Parsing.TTFFileReader)";
            }

            @Override // com.aspose.slides.internal.p060ca.AbstractC2024c1.x1
            /* JADX INFO: renamed from: k4 */
            public void mo10297k4(C2212n9 c2212n9) {
                C2330uy.this.m11546kk(c2212n9);
            }
        });
        m10288k4(new AbstractC2024c1.kk() { // from class: com.aspose.slides.internal.ca.uy.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Fonts.TTF.Advanced_Typographic_Tables.TTFCoverageTable.LoadFormat2(Aspose.Fonts.TTF.Internals.Parsing.TTFFileReader)";
            }

            @Override // com.aspose.slides.internal.p060ca.AbstractC2024c1.kk
            /* JADX INFO: renamed from: k4 */
            public void mo10296k4(C2212n9 c2212n9) {
                C2330uy.this.m11547to(c2212n9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public void m11547to(C2212n9 c2212n9) {
        int iM11151fa = c2212n9.m11151fa() & 65535;
        for (int i = 0; i < iM11151fa; i++) {
            int iM11151fa2 = c2212n9.m11151fa() & 65535;
            int iM11151fa3 = c2212n9.m11151fa() & 65535;
            int iM11151fa4 = c2212n9.m11151fa() & 65535;
            for (int i2 = iM11151fa2; i2 < iM11151fa3 + 1; i2++) {
                m10290k4(new C2334v6(i2), (iM11151fa4 + i2) - iM11151fa2);
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public final int m11549du() {
        return this.f7035x1.keySet().size();
    }

    /* JADX INFO: renamed from: kk */
    public final int m11550kk(AbstractC2220nx abstractC2220nx) {
        return m10287k4(abstractC2220nx);
    }

    public C2330uy(long j, long j2) {
        super(j, j2, "Coverage");
        m11544h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public void m11546kk(C2212n9 c2212n9) {
        int iM11151fa = c2212n9.m11151fa() & 65535;
        for (int i = 0; i < iM11151fa; i++) {
            m10290k4(new C2334v6(c2212n9.m11151fa() & 65535), i);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m11551x1(AbstractC2220nx abstractC2220nx) {
        return this.f7035x1.containsKey(abstractC2220nx);
    }
}
