package com.aspose.words;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCU extends zzYCW {
    public zzYCU(Document document, zzLS zzls) {
        super(document, zzls);
    }

    private static int zzC(zzL4 zzl4) {
        if (!zzl4.zzYa(true)) {
            return 0;
        }
        double dZzL = zzL5.zzL(zzl4);
        if (com.aspose.words.internal.zzAN.zzZC(dZzL)) {
            return 0;
        }
        return com.aspose.words.internal.zzAN.zzK(com.aspose.words.internal.zzSA.zzr(dZzL), 144, 31680);
    }

    @Override // com.aspose.words.zzYCW
    public final void zzA(Section section) {
        if (zzYc7().zzZUC().zzSx("page") != null && zzYc7().zzZUC().zzZy(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "rtl")) {
            section.zzYvR().zzYcm();
        }
    }

    @Override // com.aspose.words.zzYCW
    public final void zzYc8() {
        zzYCZ zzyczZzYvR = getDocument().getFirstSection().zzYvR();
        zzyczZzYvR.zzYcd();
        zzyczZzYvR.set(2170, Integer.valueOf(StyleIdentifier.LIST_TABLE_4_ACCENT_5));
        int[] iArr = {2330, 2320, 2312, 2370, 2300, 2290, 2310, 2280};
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            zzyczZzYvR.set(i2, zzYCZ.zzOt(i2));
        }
    }

    @Override // com.aspose.words.zzYCW
    public final void zzZ(Section section, zzPS zzps) {
        zzYCZ zzyczZzYvR = section.zzYvR();
        if (zzps.zzZy("mso-title-page", "yes")) {
            zzyczZzYvR.setDifferentFirstPageHeaderFooter(true);
        }
        double dZzSH = zzps.zzSH("mso-header-margin");
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            zzyczZzYvR.zzvR(com.aspose.words.internal.zzSA.zzr(com.aspose.words.internal.zzAN.zzR(dZzSH, 0.0d, 1080.0d)));
        }
        double dZzSH2 = zzps.zzSH("mso-footer-margin");
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSH2)) {
            zzyczZzYvR.zzvQ(com.aspose.words.internal.zzSA.zzr(com.aspose.words.internal.zzAN.zzR(dZzSH2, 0.0d, 1080.0d)));
        }
        double dZzSH3 = zzps.zzSH("mso-gutter-margin");
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSH3)) {
            zzyczZzYvR.zzvP(com.aspose.words.internal.zzSA.zzr(com.aspose.words.internal.zzAN.zzR(dZzSH3, 0.0d, 1080.0d)));
        }
        section.getPageSetup().setOddAndEvenPagesHeaderFooter(zzps.zzZy("mso-facing-pages", "yes"));
        zzPT zzptZzSx = zzps.zzSx("size");
        if (zzptZzSx != null) {
            if (zzptZzSx.zzZWj().getCount() == 1) {
                zzL4 zzl4ZzZVx = zzptZzSx.zzZWj().zzZVx();
                int iZzC = zzC(zzl4ZzZVx);
                if (iZzC > 0) {
                    zzyczZzYvR.zzvV(iZzC);
                    zzyczZzYvR.zzvW(iZzC);
                } else if (zzl4ZzZVx.zzP(new zzOT("landscape"))) {
                    zzyczZzYvR.zzYcr();
                    int pageWidth = zzyczZzYvR.getPageWidth();
                    zzyczZzYvR.zzvW(zzyczZzYvR.getPageHeight());
                    zzyczZzYvR.zzvV(pageWidth);
                }
            } else if (zzptZzSx.zzZWj().getCount() == 2) {
                int iZzC2 = zzC(zzptZzSx.zzZWj().zzMl(0));
                int iZzC3 = zzC(zzptZzSx.zzZWj().zzMl(1));
                if (iZzC2 > 0 && iZzC3 > 0) {
                    zzyczZzYvR.zzvW(iZzC2);
                    zzyczZzYvR.zzvV(iZzC3);
                }
            }
        }
        if (zzps.zzZy("mso-page-orientation", "landscape")) {
            zzyczZzYvR.zzYcr();
        }
    }
}
