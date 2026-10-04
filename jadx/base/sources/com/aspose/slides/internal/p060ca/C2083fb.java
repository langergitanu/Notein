package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p060ca.AbstractC2024c1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.fb */
/* JADX INFO: loaded from: classes3.dex */
public class C2083fb extends AbstractC2024c1 {
    public C2083fb(long j, long j2) {
        super(j, j2, "ClassDef");
        m10289k4(new AbstractC2024c1.x1() { // from class: com.aspose.slides.internal.ca.fb.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Fonts.TTF.Advanced_Typographic_Tables.TTFClassDefTable.LoadFormat1(Aspose.Fonts.TTF.Internals.Parsing.TTFFileReader)";
            }

            @Override // com.aspose.slides.internal.p060ca.AbstractC2024c1.x1
            /* JADX INFO: renamed from: k4 */
            public void mo10297k4(C2212n9 c2212n9) {
                C2083fb.this.m10518kk(c2212n9);
            }
        });
        m10288k4(new AbstractC2024c1.kk() { // from class: com.aspose.slides.internal.ca.fb.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Fonts.TTF.Advanced_Typographic_Tables.TTFClassDefTable.LoadFormat2(Aspose.Fonts.TTF.Internals.Parsing.TTFFileReader)";
            }

            @Override // com.aspose.slides.internal.p060ca.AbstractC2024c1.kk
            /* JADX INFO: renamed from: k4 */
            public void mo10296k4(C2212n9 c2212n9) {
                C2083fb.this.m10519to(c2212n9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public void m10518kk(C2212n9 c2212n9) {
        int iM11151fa = c2212n9.m11151fa();
        int iM11151fa2 = c2212n9.m11151fa() & 65535;
        for (int i = 0; i < iM11151fa2; i++) {
            m10290k4(new C2334v6(((iM11151fa & 65535) + i) & 65535), c2212n9.m11151fa() & 65535);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public void m10519to(C2212n9 c2212n9) {
        int iM11151fa = c2212n9.m11151fa() & 65535;
        for (int i = 0; i < iM11151fa; i++) {
            int iM11151fa2 = c2212n9.m11151fa() & 65535;
            int iM11151fa3 = c2212n9.m11151fa() & 65535;
            for (int iM11151fa4 = c2212n9.m11151fa() & 65535; iM11151fa4 < iM11151fa2 + 1; iM11151fa4++) {
                m10290k4(new C2334v6(iM11151fa4), iM11151fa3);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final int m10521x1(AbstractC2220nx abstractC2220nx) {
        int iM10287k4 = m10287k4(abstractC2220nx);
        if (iM10287k4 == -1) {
            return 0;
        }
        return iM10287k4;
    }
}
