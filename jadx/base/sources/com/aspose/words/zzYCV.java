package com.aspose.words;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCV extends zzYCW {
    public zzYCV(Document document, zzLS zzls) {
        super(document, zzls);
    }

    private static zzMX zzP(zzMP zzmp) {
        int count = zzmp.getCount();
        if (count == 1) {
            zzL4 zzl4ZzMl = zzmp.zzMl(0);
            if (zzl4ZzMl.zzP(zzL4.zzZng)) {
                return zzMX.zzZVJ();
            }
            if (zzl4ZzMl.getValueType() == 0) {
                return zzMX.zzZ((zzOT) zzl4ZzMl);
            }
            zzOI zzoiZzZTO = zzl4ZzMl.zzZTO();
            if (zzoiZzZTO != null) {
                return zzMX.zzZ(zzoiZzZTO);
            }
            return null;
        }
        if (count != 2) {
            return null;
        }
        zzL4 zzl4ZzMl2 = zzmp.zzMl(0);
        zzL4 zzl4ZzMl3 = zzmp.zzMl(1);
        if (zzl4ZzMl2.getValueType() != zzl4ZzMl3.getValueType()) {
            return null;
        }
        if (zzl4ZzMl2.getValueType() == 4) {
            return zzMX.zzZ((zzOI) zzl4ZzMl2, (zzOI) zzl4ZzMl3);
        }
        if (zzl4ZzMl2.getValueType() == 0) {
            return zzMX.zzZ((zzOT) zzl4ZzMl2, (zzOT) zzl4ZzMl3);
        }
        return null;
    }

    @Override // com.aspose.words.zzYCW
    public final void zzA(Section section) {
        int iZzMb = zzL5.zzMb(zzYc7().zzZUR());
        if (section.zzYvR().zzYLa() != iZzMb) {
            section.zzYvR().zzvC(iZzMb);
        }
        if (zzYc7().zzZUC().zzZy(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "rtl")) {
            section.zzYvR().zzYcm();
        }
    }

    @Override // com.aspose.words.zzYCW
    public final void zzYc8() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r10 != 2) goto L26;
     */
    @Override // com.aspose.words.zzYCW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzZ(Section section, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("size");
        if (zzptZzSx == null) {
            return;
        }
        zzMX zzmxZzP = zzP(zzptZzSx.zzZWj());
        if (zzptZzSx.zzZWj() instanceof zzMX) {
            double dZzL = zzL5.zzL(zzmxZzP.zzZVG());
            double dZzL2 = zzL5.zzL(zzmxZzP.zzZVF());
            boolean z = (com.aspose.words.internal.zzAN.zzZC(dZzL) || com.aspose.words.internal.zzAN.zzZC(dZzL2)) ? false : true;
            PageSetup pageSetup = section.getPageSetup();
            int orientation = zzmxZzP.getOrientation();
            if (orientation == 0) {
                int i = (!z || dZzL <= dZzL2) ? 1 : 2;
                pageSetup.setOrientation(i);
            } else {
                if (orientation != 1) {
                }
                pageSetup.setOrientation(i);
            }
            if (z) {
                if (zzmxZzP.getOrientation() == 2 || zzmxZzP.getOrientation() == 0) {
                    pageSetup.setPageWidth(dZzL);
                    pageSetup.setPageHeight(dZzL2);
                } else {
                    pageSetup.setPageWidth(dZzL2);
                    pageSetup.setPageHeight(dZzL);
                }
            }
            pageSetup.setPageNumberStyle(zzZXP.zzNm(zzps.zzSF("-aw-page-numbers-style")));
            pageSetup.setChapterPageSeparator(zzYUL.zzH8(zzps.zzSF("-aw-page-numbers-chapter-separator")));
            pageSetup.setHeadingLevelForChapter((int) com.aspose.words.internal.zzAN.zzR(zzps.zzSD("-aw-page-numbers-chapter-level"), 0.0d, 9.0d));
            double dZzSD = zzps.zzSD("-aw-page-numbers-start");
            if (com.aspose.words.internal.zzAN.zzZC(dZzSD)) {
                pageSetup.setRestartPageNumbering(false);
            } else {
                pageSetup.setPageStartingNumber((int) com.aspose.words.internal.zzAN.zzR(dZzSD, 1.0d, 2.147483647E9d));
                pageSetup.setRestartPageNumbering(true);
            }
            double dZzSH = zzps.zzSH("-aw-header-distance");
            if (!com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
                pageSetup.setHeaderDistance(com.aspose.words.internal.zzAN.zzR(dZzSH, 0.0d, 1584.0d));
            }
            double dZzSH2 = zzps.zzSH("-aw-footer-distance");
            if (com.aspose.words.internal.zzAN.zzZC(dZzSH2)) {
                return;
            }
            pageSetup.setFooterDistance(com.aspose.words.internal.zzAN.zzR(dZzSH2, 0.0d, 1584.0d));
        }
    }
}
