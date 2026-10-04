package com.aspose.words;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.common.primitives.Shorts;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZE {
    private static com.aspose.words.internal.zzZYJ zzYUM;
    static boolean zzZtG;

    static {
        com.aspose.words.internal.zzZYJ zzzyj = new com.aspose.words.internal.zzZYJ();
        zzYUM = zzzyj;
        zzZtG = false;
        zzzyj.zzH("gb2312", 936);
        zzYUM.zzH("windows-1252", 1252);
        zzYUM.zzH("windows-1251", 1251);
        zzYUM.zzH("big5", 950);
        zzYUM.zzH("utf-8", 65001);
        zzYUM.zzH("us-ascii", 20127);
        zzYUM.zzH("shift_jis", 932);
        zzYUM.zzH("ks_c_5601-1987", 949);
        zzYUM.zzH("windows-1255", 1255);
    }

    private static void zzI(String str, int i, int i2) {
        com.aspose.words.internal.zzZKN.format("{0}: {1}", str, Boolean.valueOf((i & i2) != 0));
    }

    private static int zzT(CompatibilityOptions compatibilityOptions) {
        return (compatibilityOptions.getNoTabHangInd() ? 1 : 0) | (compatibilityOptions.getNoSpaceRaiseLower() ? 2 : 0) | (compatibilityOptions.getSuppressSpBfAfterPgBrk() ? 4 : 0) | (compatibilityOptions.getWrapTrailSpaces() ? 8 : 0) | (compatibilityOptions.getPrintColBlack() ? 16 : 0) | (compatibilityOptions.getNoColumnBalance() ? 32 : 0) | (compatibilityOptions.getConvMailMergeEsc() ? 64 : 0) | (compatibilityOptions.getSuppressTopSpacing() ? 128 : 0) | (compatibilityOptions.getUseSingleBorderforContiguousCells() ? 256 : 0) | (compatibilityOptions.getTransparentMetafiles() ? 512 : 0) | (compatibilityOptions.getShowBreaksInFrames() ? 1024 : 0) | (compatibilityOptions.getSwapBordersFacingPgs() ? 2048 : 0) | (!compatibilityOptions.getDoNotLeaveBackslashAlone() ? 4096 : 0) | (!compatibilityOptions.getDoNotExpandShiftReturn() ? 8192 : 0) | (!compatibilityOptions.getUlTrailSpace() ? 16384 : 0) | (!compatibilityOptions.getBalanceSingleByteDoubleByteWidth() ? 32768 : 0) | (compatibilityOptions.getSuppressSpacingAtTopOfPage() ? 65536 : 0) | (compatibilityOptions.getSpacingInWholePoints() ? 131072 : 0) | (compatibilityOptions.getPrintBodyTextBeforeHeader() ? 262144 : 0) | (compatibilityOptions.getNoLeading() ? 524288 : 0) | (!compatibilityOptions.getSpaceForUL() ? 1048576 : 0) | (compatibilityOptions.getMWSmallCaps() ? 2097152 : 0) | (compatibilityOptions.getSuppressTopSpacingWP() ? 4194304 : 0) | (compatibilityOptions.getTruncateFontHeightsLikeWP6() ? 8388608 : 0) | (compatibilityOptions.getSubFontBySize() ? 16777216 : 0) | (compatibilityOptions.getLineWrapLikeWord6() ? 33554432 : 0) | (compatibilityOptions.getDoNotSuppressParagraphBorders() ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 0) | (compatibilityOptions.getNoExtraLineSpacing() ? 134217728 : 0) | (compatibilityOptions.getSuppressBottomSpacing() ? WarningType.HINT : 0) | (compatibilityOptions.getWPSpaceWidth() ? 536870912 : 0) | (compatibilityOptions.getWPJustification() ? 1073741824 : 0) | (compatibilityOptions.getUsePrinterMetrics() ? Integer.MIN_VALUE : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzZ(com.aspose.words.internal.zzZOX zzzox, zzZRG zzzrg, Document document, zzZZB zzzzb) throws Exception {
        int i;
        short s;
        boolean z;
        int i2;
        zzYWS.toString(zzzzb.zzYUr);
        zzZZF zzzzfZzZpV = document.zzZpV();
        HyphenationOptions hyphenationOptions = zzzzfZzZpV.zzYW3;
        int i3 = zzzrg.zzYHK;
        int i4 = zzzrg.zzYHJ;
        zzzox.zzq().zzU(i3, 0);
        short sZzX9 = zzzox.zzX9();
        int i5 = sZzX9 & 65535;
        zzzzfZzZpV.zzYVX = (sZzX9 & 1) != 0;
        zzzzfZzZpV.zzYUT = (sZzX9 & 2) != 0;
        document.getFootnoteOptions().setPosition((sZzX9 & 96) >> 5);
        zzzzfZzZpV.zzYWD = i5 >> 8;
        short sZzX92 = zzzox.zzX9();
        document.getFootnoteOptions().setRestartRule(sZzX92 & 3);
        document.getFootnoteOptions().setStartNumber((sZzX92 & 65532) >> 2);
        short sZzX93 = zzzox.zzX9();
        zzzzfZzZpV.zzYV9 = (sZzX93 & 256) != 0;
        zzzzfZzZpV.zzYV8 = (sZzX93 & 512) != 0;
        hyphenationOptions.setHyphenateCaps((sZzX93 & 2048) != 0);
        hyphenationOptions.setAutoHyphenation((sZzX93 & 4096) != 0);
        zzzzfZzZpV.zzYWm = (sZzX93 & Shorts.MAX_POWER_OF_TWO) != 0;
        zzzzfZzZpV.zzYWc = (sZzX93 & Short.MIN_VALUE) != 0;
        short sZzX94 = zzzox.zzX9();
        int i6 = sZzX94 & 65535;
        zzI("fLockAtn", i6, 16);
        zzI("fProtEnabled", i6, 512);
        zzI("fDispFormFldSel", i6, 1024);
        zzI("fLockRev", i6, 16384);
        zzzzfZzZpV.zzYUX = (sZzX94 & 4) != 0;
        zzzzfZzZpV.zzYUW = (sZzX94 & 8) != 0;
        if ((sZzX94 & 16) != 0) {
            zzzzfZzZpV.zzYW6.zzFF(1);
        }
        if ((sZzX94 & 32) != 0) {
            zzzzfZzZpV.zzYWh = 1;
        }
        if ((sZzX94 & 512) != 0) {
            zzzzfZzZpV.zzYW6.zzFF(2);
        }
        zzzzfZzZpV.zzYW6.zzWu((sZzX94 & 1024) != 0);
        zzzzfZzZpV.zzWD((sZzX94 & 2048) != 0);
        zzzzfZzZpV.zzYUV = (sZzX94 & 4096) != 0;
        if ((sZzX94 & Shorts.MAX_POWER_OF_TWO) != 0) {
            zzzzfZzZpV.zzYW6.zzFF(0);
        }
        zzzzfZzZpV.zzYWy = (sZzX94 & Short.MIN_VALUE) != 0;
        zzzox.zzX9();
        zzzzfZzZpV.zzYW4 = zzzox.zzX9() & 65535;
        zzzzfZzZpV.zzYVH = zzYUM.zzO(zzzox.zzX9() & 65535, "");
        hyphenationOptions.zzyv(zzzox.zzX9() & 65535);
        hyphenationOptions.zzyw(zzzox.zzX9() & 65535);
        zzzox.zzX9();
        zzzox.zzXb();
        zzzox.zzXb();
        zzzox.zzXb();
        zzzox.zzXa();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXa();
        zzzox.zzXc();
        short sZzX95 = zzzox.zzX9();
        document.getEndnoteOptions().setRestartRule(sZzX95 & 3);
        document.getEndnoteOptions().setStartNumber((sZzX95 & 65532) >> 2);
        short sZzX96 = zzzox.zzX9();
        document.getEndnoteOptions().setPosition(sZzX96 & 3);
        zzzzfZzZpV.zzYWz = (sZzX96 & 1024) != 0;
        zzzzfZzZpV.zzYWv = (sZzX96 & 2048) != 0;
        zzzzfZzZpV.zzYVO = (sZzX96 & 4096) == 0;
        zzzzfZzZpV.zzYVa = (sZzX96 & Short.MIN_VALUE) == 0;
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXa();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzzfZzZpV.zzYW6.zzFE(zzzox.zzXc());
        short sZzX97 = zzzox.zzX9();
        document.getViewOptions().setViewType(sZzX97 & 7);
        int i7 = (sZzX97 & 4088) >> 3;
        if (ViewOptions.zzjc(i7)) {
            document.getViewOptions().setZoomPercent(i7);
        }
        document.getViewOptions().setZoomType((sZzX97 & 12288) >> 12);
        zzzzfZzZpV.zzYWr = (sZzX97 & Short.MIN_VALUE) != 0;
        zzZ(zzzzfZzZpV, zzzzb.zzYUr);
        CompatibilityOptions compatibilityOptions = zzzzfZzZpV.zzYVg;
        if (i4 >= 500) {
            zzZ(zzzox.zzXc(), compatibilityOptions);
            zzzzfZzZpV.zzYWe = zzzox.zzX9() & 65535;
            short sZzX98 = zzzox.zzX9();
            zzzzfZzZpV.zzYVN = (sZzX98 & 1) != 0;
            zzzzfZzZpV.zzYVM = (sZzX98 & 6) >> 1;
            if ((sZzX98 & 32) != 0) {
                zzzzfZzZpV.zzYWh = 2;
            }
            short sZzXa = zzzox.zzXa();
            s = Short.MIN_VALUE;
            short sZzXa2 = zzzox.zzXa();
            i = 8;
            zzzzfZzZpV.zzYVK = zzZZ5.zzGb((sZzX98 & 896) >> 7);
            zzzzfZzZpV.zzYVL = (sZzX98 & 1024) != 0;
            char[] cArrZzZ = zzZZR.zzZ(zzzox, true, 101);
            i2 = 2;
            char[] cArrZzZ2 = zzZZR.zzZ(zzzox, true, 51);
            z = true;
            if (sZzXa > 101) {
                zzY1Z.zzZ(zzzzb.zzYUo, 0, "Too long following chars count, used defaults.", new Object[0]);
            }
            if (sZzXa > 51) {
                zzY1Z.zzZ(zzzzb.zzYUo, 0, "Too long leading chars count, used defaults.", new Object[0]);
            }
            zzzzfZzZpV.zzYVI = new String(cArrZzZ, 0, Math.min(cArrZzZ.length, Math.min((int) sZzXa, 101)));
            zzzzfZzZpV.zzYVJ = new String(cArrZzZ2, 0, Math.min(cArrZzZ2.length, Math.min((int) sZzXa2, 51)));
            zzzzfZzZpV.zzYVQ = zzzox.zzXa();
            zzzzfZzZpV.zzYVP = zzzox.zzXa();
            zzzzfZzZpV.zzYVV = zzzox.zzXa();
            zzzzfZzZpV.zzYVU = zzzox.zzXa();
            short sZzX99 = zzzox.zzX9();
            zzzzfZzZpV.zzYVS = sZzX99 & 127;
            zzzzfZzZpV.zzYUS = (sZzX99 & 128) != 0;
            zzzzfZzZpV.zzYVT = (sZzX99 & 32512) >> 8;
            zzzzfZzZpV.zzYVR = (sZzX99 & Short.MIN_VALUE) != 0;
            short sZzX910 = zzzox.zzX9();
            zzzzfZzZpV.zzYUY = (sZzX910 & 30) >> 1;
            if ((sZzX910 & 32) != 0) {
                zzzzfZzZpV.zzYWo = (sZzX910 & 64) != 0 ? 1 : 2;
            } else {
                zzzzfZzZpV.zzYWo = 0;
            }
            zzzzfZzZpV.zzYWw = (sZzX910 & 128) != 0;
            zzzzfZzZpV.zzYUR = (sZzX910 & 256) != 0;
            zzzzfZzZpV.zzYUU = (sZzX910 & 512) != 0;
            zzzzfZzZpV.zzYWu = (sZzX910 & 2048) != 0;
            zzzzfZzZpV.zzYWt = (sZzX910 & 4096) == 0;
            zzzzfZzZpV.zzYWs = (sZzX910 & 8192) == 0;
            short sZzX911 = zzzox.zzX9();
            zzzzfZzZpV.zzYUQ = (sZzX911 & 1) != 0;
            zzzzfZzZpV.zzYUP = (sZzX911 & 2) != 0;
            zzzox.zzn(12);
            zzzox.zzXc();
            zzzox.zzXc();
            document.zzG2(zzzox.zzXc());
            zzzox.zzXc();
            zzzox.zzn(30);
            zzzox.zzXb();
            zzzox.zzXb();
            zzzox.zzXc();
            zzzox.zzXc();
            zzzox.zzXb();
            document.getFootnoteOptions().setNumberStyle(zzzox.zzXa());
            document.getEndnoteOptions().setNumberStyle(zzzox.zzXa());
            zzzox.zzX9();
            zzzox.zzX9();
        } else {
            i = 8;
            s = Short.MIN_VALUE;
            z = true;
            i2 = 2;
        }
        if (i4 >= 544 && zzzzb.zzYUr >= 217) {
            zzzox.zzX9();
            zzzzfZzZpV.zzYVZ = zzzox.zzX9() & 65535;
            int iZzXc = zzzox.zzXc();
            zzzzfZzZpV.zzYW2 = (iZzXc & 2) != 0 ? z : false;
            zzzzfZzZpV.zzYUN = (iZzXc & 8) == 0 ? z : false;
            if ((268435456 & iZzXc) != 0) {
                zzzzfZzZpV.zzYVC = (iZzXc & 512) == 0 ? z : false;
                zzzzfZzZpV.zzYVE = (iZzXc & 1024) != 0 ? z : false;
                zzzzfZzZpV.zzYVD = (iZzXc & 2048) != 0 ? z : false;
                zzzzfZzZpV.zzYVx = (61440 & iZzXc) >> 12;
                zzzzfZzZpV.zzYVA = (65536 & iZzXc) == 0 ? z : false;
                zzzzfZzZpV.zzYVz = (131072 & iZzXc) == 0 ? z : false;
                zzzzfZzZpV.zzYVy = (iZzXc & 268173312) >> 18;
            }
            zzZ(zzzox.zzXc(), compatibilityOptions);
            int iZzXc2 = zzzox.zzXc();
            compatibilityOptions.setShapeLayoutLikeWW8((iZzXc2 & 1) != 0 ? z : false);
            compatibilityOptions.setFootnoteLayoutLikeWW8((iZzXc2 & 2) != 0 ? z : false);
            compatibilityOptions.setDoNotUseHTMLParagraphAutoSpacing((iZzXc2 & 4) != 0 ? z : false);
            compatibilityOptions.setAdjustLineHeightInTable((iZzXc2 & 8) == 0 ? z : false);
            compatibilityOptions.setForgetLastTabAlignment((iZzXc2 & 16) != 0 ? z : false);
            compatibilityOptions.setAutoSpaceLikeWord95((iZzXc2 & 32) != 0 ? z : false);
            compatibilityOptions.setAlignTablesRowByRow((iZzXc2 & 64) != 0 ? z : false);
            compatibilityOptions.setLayoutRawTableWidth((iZzXc2 & 128) != 0 ? z : false);
            compatibilityOptions.setLayoutTableRowsApart((iZzXc2 & 256) != 0 ? z : false);
            compatibilityOptions.setUseWord97LineBreakRules((iZzXc2 & 512) != 0 ? z : false);
            if (i4 >= 594) {
                compatibilityOptions.setDoNotBreakWrappedTables((iZzXc2 & 1024) != 0 ? z : false);
                compatibilityOptions.setDoNotSnapToGridInCell((iZzXc2 & 2048) != 0 ? z : false);
                compatibilityOptions.setSelectFldWithFirstOrLastChar((iZzXc2 & 4096) != 0 ? z : false);
                compatibilityOptions.setApplyBreakingRules((iZzXc2 & 8192) != 0 ? z : false);
                compatibilityOptions.setDoNotWrapTextWithPunct((iZzXc2 & 16384) != 0 ? z : false);
                compatibilityOptions.setDoNotUseEastAsianBreakRules((iZzXc2 & s) != 0 ? z : false);
            }
            if (i4 >= 616) {
                compatibilityOptions.setUseWord2002TableStyleRules((65536 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setGrowAutofit((131072 & iZzXc2) != 0 ? z : false);
            }
            if (i4 >= 674 && zzzzb.zzYUr >= 274) {
                compatibilityOptions.setUseNormalStyleForList((262144 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setDoNotUseIndentAsNumberingTabStop((524288 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setUseAltKinsokuLineBreakRules((1048576 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setAllowSpaceOfSameStyleInTable((2097152 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setDoNotSuppressIndentation((4194304 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setDoNotAutofitConstrainedTables((8388608 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setAutofitToFirstFixedWidthCell((16777216 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setUnderlineTabInNumList((33554432 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setDisplayHangulFixedWidth((67108864 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setSplitPgBreakAndParaMark((134217728 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setDoNotVertAlignCellWithSp((268435456 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setDoNotBreakConstrainedForcedTable((536870912 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setDoNotVertAlignInTxbx((1073741824 & iZzXc2) != 0 ? z : false);
                compatibilityOptions.setUseAnsiKerningPairs((((long) iZzXc2) & 2147483648L) != 0 ? z : false);
            }
            int iZzXc3 = zzzox.zzXc();
            if (i4 >= 674 && zzzzb.zzYUr >= 274) {
                compatibilityOptions.setCachedColBalance((iZzXc3 & 1) != 0 ? z : false);
            }
            zzzox.zzXc();
            zzzox.zzXc();
            zzzox.zzXc();
            zzzox.zzXc();
            zzzox.zzXc();
            int iZzXc4 = zzzox.zzXc();
            document.getViewOptions().setDoNotDisplayPageBoundaries((65536 & iZzXc4) != 0 ? z : false);
            zzzzfZzZpV.zzYWC = (8388608 & iZzXc4) != 0 ? z : false;
            if ((134217728 & iZzXc4) != 0) {
                zzzzfZzZpV.zzYVw = (268435456 & iZzXc4) != 0 ? z : false;
                zzzzfZzZpV.zzYVv = (536870912 & iZzXc4) != 0 ? z : false;
                zzzzfZzZpV.zzYVq = (1073741824 & iZzXc4) == 0 ? z : false;
                zzzzfZzZpV.zzYVn = (((long) iZzXc4) & 2147483648L) != 0 ? z : false;
            }
        }
        if (i4 >= 594) {
            zzzox.zzXc();
            short sZzX912 = zzzox.zzX9();
            zzzzfZzZpV.zzYWx = (sZzX912 & 1) == 0 ? z : false;
            zzzzfZzZpV.zzYVm = (sZzX912 & 8) == 0 ? z : false;
            zzzzfZzZpV.zzYVl = (sZzX912 & 16) != 0 ? z : false;
            if ((sZzX912 & 64) != 0) {
                zzzzfZzZpV.zzYWh = 3;
            }
            if ((sZzX912 & 128) != 0) {
                zzzzfZzZpV.zzYWh = 4;
            }
            zzzzfZzZpV.zzYWb = (sZzX912 & 4096) != 0 ? z : false;
            zzzzfZzZpV.zzYWa = (sZzX912 & 8192) != 0 ? z : false;
            zzzzfZzZpV.zzYW9 = (sZzX912 & Shorts.MAX_POWER_OF_TWO) != 0 ? z : false;
            zzzzfZzZpV.zzYW8 = (sZzX912 & s) != 0 ? z : false;
            zzzzfZzZpV.zzYVY = zzY0C.zzhE(zzzox.zzX9() & 65535);
            zzzox.zzX9();
            zzzzfZzZpV.zzYWj.zzkD(zzzox.zzX9() & 65535);
            zzzzfZzZpV.zzYVW = zzzox.zzX9() & 65535;
            zzzzfZzZpV.zzYVi = zzzox.zzXc();
            zzzox.zzXc();
            zzzox.zzXc();
            zzzox.zzXc();
            zzzox.zzXc();
            zzzox.zzXc();
            zzzox.zzXc();
            zzzox.zzXc();
            zzzzfZzZpV.zzYVk = zzzox.zzXc();
        }
        if (i4 >= 616 && zzzzb.zzYUr >= 217) {
            int iZzXc5 = zzzox.zzXc();
            zzI("fTreatLockAtnAsReadOnly", iZzXc5, z ? 1 : 0);
            zzI("fStyleLock", iZzXc5, i2);
            zzI("fAutoFmtOverride", iZzXc5, 4);
            zzI("fStyleLockEnforced", iZzXc5, 32);
            zzI("fFakeLockAtn", iZzXc5, 64);
            if ((iZzXc5 & 1) != 0) {
                zzzzfZzZpV.zzYW6.zzFF(3);
            }
            boolean z2 = (iZzXc5 & 2) != 0;
            zzzzfZzZpV.zzYW6.zzWt((iZzXc5 & 4) != 0);
            zzzzfZzZpV.zzYVu = (iZzXc5 & 8) != 0;
            zzzzfZzZpV.zzYVp = (iZzXc5 & 16) != 0;
            boolean z3 = (iZzXc5 & 32) != 0;
            zzzzfZzZpV.zzYW6.zzXG(z2);
            zzZYR zzzyr = zzzzfZzZpV.zzYW6;
            zzzyr.zzWv(z3 | zzzyr.zzZod());
            if ((iZzXc5 & 64) != 0) {
                zzzzfZzZpV.zzYW6.zzFG(-1);
            }
            zzzzfZzZpV.zzYVs = (iZzXc5 & 128) != 0;
            zzzzfZzZpV.zzYVr = (iZzXc5 & 256) != 0;
            zzzzfZzZpV.zzYWk = (iZzXc5 & 2048) != 0;
            zzzzfZzZpV.zzYWl = (iZzXc5 & 4096) != 0;
            short sZzX913 = zzzox.zzX9();
            zzI("fEnforceDocProt", sZzX913 & 65535, i);
            int i8 = (sZzX913 & 112) >> 4;
            com.aspose.words.internal.zzZKN.format("iDocProtCur: {0}", Integer.valueOf(i8));
            zzzzfZzZpV.zzYW1 = (sZzX913 & 1) != 0;
            zzzzfZzZpV.zzYW7 = (sZzX913 & 2) != 0;
            zzzzfZzZpV.zzYW0 = (sZzX913 & 4) != 0;
            if ((sZzX913 & 8) != 0) {
                zzzzfZzZpV.zzYW6.zzFG(i8);
            }
            document.getViewOptions().setDisplayBackgroundShape((sZzX913 & 128) != 0);
            zzzox.zzX9();
            zzzox.zzX9();
            zzzox.zzXc();
            zzzox.zzX9();
            zzzox.zzX9();
            zzzox.zzXc();
        }
        if (i4 >= 674 && zzzzb.zzYUr >= 274) {
            zzzox.zzXc();
            int iZzXc6 = zzzox.zzXc();
            zzzzfZzZpV.zzYWg = (iZzXc6 & 1) == 0;
            zzzzfZzZpV.zzYWf = (iZzXc6 & 2) == 0;
            zzzzfZzZpV.zzYWi = zzY8T.zzkN((iZzXc6 & 480) >> 5);
            zzzzfZzZpV.zzYW1 = (iZzXc6 & 512) != 0;
            zzzzfZzZpV.zzYV7 = (iZzXc6 & 1024) == 0;
            zzzox.zzXc();
            zzzox.zzXc();
            zzzox.zzXc();
            zzzox.zzXc();
            zzZ(zzzox, document);
        }
        if (zzZRA.zzDL(zzzzb.zzYUr)) {
            zzzzfZzZpV.zzYVg.setDoNotExpandShiftReturn(true);
        }
        zzzox.zzq().getPosition();
    }

    private static void zzZ(com.aspose.words.internal.zzZOX zzzox, Document document) throws Exception {
        zzZZF zzzzfZzZpV = document.zzZpV();
        int iZzXc = zzzox.zzXc();
        zzzzfZzZpV.zzYVd.zzur(iZzXc & 3);
        zzzzfZzZpV.zzYVd.zzuq((iZzXc & 12) >> 2);
        zzzzfZzZpV.zzYVd.zzup((iZzXc & 112) >> 4);
        zzzzfZzZpV.zzYVd.zzSQ(((iZzXc & 256) >> 8) != 0);
        zzzzfZzZpV.zzYVd.zzum((iZzXc & 512) >> 9);
        zzzzfZzZpV.zzYVd.zzul((iZzXc & 1024) >> 10);
        zzzzfZzZpV.zzYVd.zzSP(((iZzXc & 2048) >> 11) != 0);
        zzzzfZzZpV.zzYVd.zzSR(((iZzXc & 4096) >> 12) != 0);
        short sZzXa = zzzox.zzXa();
        if (sZzXa < document.getFontInfos().getCount()) {
            zzzzfZzZpV.zzYVd.zzIk(document.getFontInfos().get(sZzXa).getName());
        }
        zzzzfZzZpV.zzYVd.zzHj(zzzox.zzXc());
        zzzzfZzZpV.zzYVd.zzHi(zzzox.zzXc());
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzzfZzZpV.zzYVd.zzui(zzzox.zzXc());
    }

    private static void zzZ(int i, CompatibilityOptions compatibilityOptions) {
        compatibilityOptions.setNoTabHangInd((i & 1) != 0);
        compatibilityOptions.setNoSpaceRaiseLower((i & 2) != 0);
        compatibilityOptions.setSuppressSpBfAfterPgBrk((i & 4) != 0);
        compatibilityOptions.setWrapTrailSpaces((i & 8) != 0);
        compatibilityOptions.setPrintColBlack((i & 16) != 0);
        compatibilityOptions.setNoColumnBalance((i & 32) != 0);
        compatibilityOptions.setConvMailMergeEsc((i & 64) != 0);
        compatibilityOptions.setSuppressTopSpacing((i & 128) != 0);
        compatibilityOptions.setUseSingleBorderforContiguousCells((i & 256) != 0);
        compatibilityOptions.setTransparentMetafiles((i & 512) != 0);
        compatibilityOptions.setShowBreaksInFrames((i & 1024) != 0);
        compatibilityOptions.setSwapBordersFacingPgs((i & 2048) != 0);
        compatibilityOptions.setDoNotLeaveBackslashAlone((i & 4096) == 0);
        compatibilityOptions.setDoNotExpandShiftReturn((i & 8192) == 0);
        compatibilityOptions.setUlTrailSpace((i & 16384) == 0);
        compatibilityOptions.setBalanceSingleByteDoubleByteWidth((32768 & i) == 0);
        compatibilityOptions.setSuppressSpacingAtTopOfPage((65536 & i) != 0);
        compatibilityOptions.setSpacingInWholePoints((131072 & i) != 0);
        compatibilityOptions.setPrintBodyTextBeforeHeader((262144 & i) != 0);
        compatibilityOptions.setNoLeading((524288 & i) != 0);
        compatibilityOptions.setSpaceForUL((1048576 & i) == 0);
        compatibilityOptions.setMWSmallCaps((2097152 & i) != 0);
        compatibilityOptions.setSuppressTopSpacingWP((4194304 & i) != 0);
        compatibilityOptions.setTruncateFontHeightsLikeWP6((8388608 & i) != 0);
        compatibilityOptions.setSubFontBySize((16777216 & i) != 0);
        compatibilityOptions.setLineWrapLikeWord6((33554432 & i) != 0);
        compatibilityOptions.setDoNotSuppressParagraphBorders((67108864 & i) != 0);
        compatibilityOptions.setNoExtraLineSpacing((134217728 & i) != 0);
        compatibilityOptions.setSuppressBottomSpacing((268435456 & i) != 0);
        compatibilityOptions.setWPSpaceWidth((536870912 & i) != 0);
        compatibilityOptions.setWPJustification((1073741824 & i) != 0);
        compatibilityOptions.setUsePrinterMetrics((((long) i) & 2147483648L) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int zzZ(Document document, com.aspose.words.internal.zzZOW zzzow, IWarningCallback iWarningCallback) throws Exception {
        int iMin;
        int iMin2;
        zzZZF zzzzfZzZpV = document.zzZpV();
        HyphenationOptions hyphenationOptions = zzzzfZzZpV.zzYW3;
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzJ((short) ((zzzzfZzZpV.zzYVX ? 1 : 0) | (zzzzfZzZpV.zzYUT ? 2 : 0) | (zzzzfZzZpV.zzYWd.getMainDocumentType() != 0 ? 4 : 0) | (document.getFootnoteOptions().getPosition() << 5)));
        zzzow.zzJ((short) (document.getFootnoteOptions().getRestartRule() | (document.getFootnoteOptions().getStartNumber() << 2)));
        zzzow.zzJ((short) ((zzzzfZzZpV.zzYV9 ? 256 : 0) | 241 | (zzzzfZzZpV.zzYV8 ? 512 : 0) | (hyphenationOptions.getHyphenateCaps() ? 2048 : 0) | (hyphenationOptions.getAutoHyphenation() ? 4096 : 0) | (zzzzfZzZpV.zzYWm ? 16384 : 0) | (zzzzfZzZpV.zzYWc ? 32768 : 0)));
        zzzow.zzJ((short) ((zzzzfZzZpV.zzYUX ? 4 : 0) | 128 | (zzzzfZzZpV.zzYUW ? 8 : 0) | ((zzzzfZzZpV.zzYW6.zzZoc() == 1 || zzzzfZzZpV.zzYW6.zzZoc() == 3) ? 16 : 0) | (zzzzfZzZpV.zzYWh == 1 ? 32 : 0) | (zzzzfZzZpV.zzYW6.zzZoc() == 2 ? 512 : 0) | (zzzzfZzZpV.zzYW6.zzZob() ? 1024 : 0) | (zzzzfZzZpV.zzZrN() ? 2048 : 0) | (zzzzfZzZpV.zzYUV ? 4096 : 0) | (zzzzfZzZpV.zzYW6.zzZoc() == 0 ? 16384 : 0) | (zzzzfZzZpV.zzYWy ? 32768 : 0)));
        CompatibilityOptions compatibilityOptions = zzzzfZzZpV.zzYVg;
        zzzow.zzJ((short) zzT(compatibilityOptions));
        zzzow.zzJ((short) zzzzfZzZpV.zzYW4);
        zzzow.zzJ((short) zzYUM.zzG(zzzzfZzZpV.zzYVH, 0));
        zzzow.zzJ((short) hyphenationOptions.getHyphenationZone());
        zzzow.zzJ((short) hyphenationOptions.getConsecutiveHyphenLimit());
        zzzow.zzJ((short) 0);
        zzKE.zzY(document.getBuiltInDocumentProperties().zz7h(), zzzow);
        zzKE.zzY(document.getBuiltInDocumentProperties().zz7f(), zzzow);
        zzKE.zzY(document.getBuiltInDocumentProperties().zz7g(), zzzow);
        zzzow.zzK((short) document.getBuiltInDocumentProperties().getRevisionNumber());
        zzzow.zzl(document.getBuiltInDocumentProperties().getTotalEditingTime());
        zzzow.zzl(document.getBuiltInDocumentProperties().getWords());
        zzzow.zzl(document.getBuiltInDocumentProperties().getCharacters());
        zzzow.zzK((short) 1);
        zzzow.zzl(document.getBuiltInDocumentProperties().getParagraphs());
        zzzow.zzJ((short) (document.getEndnoteOptions().getRestartRule() | (document.getEndnoteOptions().getStartNumber() << 2)));
        zzzow.zzJ((short) (document.getEndnoteOptions().getPosition() | (zzzzfZzZpV.zzYWz ? 1024 : 0) | (zzzzfZzZpV.zzYWv ? 2048 : 0) | (!zzzzfZzZpV.zzYVO ? 4096 : 0) | (!zzzzfZzZpV.zzYVa ? 32768 : 0)));
        zzzow.zzl(1);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzK((short) 1);
        zzzow.zzl(1);
        zzzow.zzl(1);
        zzzow.zzl(zzzzfZzZpV.zzYW6.zzZo9());
        zzzow.zzJ((short) (document.getViewOptions().getViewType() | (document.getViewOptions().getZoomPercent() << 3) | (document.getViewOptions().getZoomType() << 12) | (zzzzfZzZpV.zzYWr ? 32768 : 0)));
        zzzow.zzk(zzT(compatibilityOptions));
        zzzow.zzJ((short) zzzzfZzZpV.zzYWe);
        zzzow.zzJ((short) ((zzzzfZzZpV.zzYVN ? 1 : 0) | (zzzzfZzZpV.zzYVM << 1) | ((zzzzfZzZpV.zzYVL || !(zzzzfZzZpV.zzYVJ == null || zzzzfZzZpV.zzYVI == null)) ? 16 : 0) | (zzzzfZzZpV.zzYWh == 2 ? 32 : 0) | (zzZZ5.zzGa(zzzzfZzZpV.zzYVK) << 7) | (zzzzfZzZpV.zzYVL ? 1024 : 0)));
        if (zzzzfZzZpV.zzYVL) {
            zzzzfZzZpV.zzYVJ = "$([\\{£¥‘“〈《「『【〔＄（［｛｢￡￥";
            zzzzfZzZpV.zzYVI = "!%),.:;?]}¢°’”‰′″℃、。々〉》」』】〕ぁぃぅぇぉっゃゅょゎ゛゜ゝゞァィゥェォッャュョヮヵヶ・ーヽヾ！％），．：；？］｝｡｣､･ｧｨｩｪｫｬｭｮｯｰﾞﾟ￠";
        }
        char[] cArr = new char[101];
        String str = zzzzfZzZpV.zzYVI;
        if (str != null) {
            iMin = Math.min(101, str.length());
            com.aspose.words.internal.zzZKN.zzZ(zzzzfZzZpV.zzYVI, 0, cArr, 0, iMin);
        } else {
            iMin = 0;
        }
        char[] cArr2 = new char[51];
        String str2 = zzzzfZzZpV.zzYVJ;
        if (str2 != null) {
            iMin2 = Math.min(51, str2.length());
            com.aspose.words.internal.zzZKN.zzZ(zzzzfZzZpV.zzYVJ, 0, cArr2, 0, iMin2);
        } else {
            iMin2 = 0;
        }
        zzzow.zzK((short) iMin);
        zzzow.zzK((short) iMin2);
        zzzow.zzY(cArr);
        zzzow.zzY(cArr2);
        zzzow.zzK((short) zzzzfZzZpV.zzYVQ);
        zzzow.zzK((short) zzzzfZzZpV.zzYVP);
        zzzow.zzK((short) zzzzfZzZpV.zzYVV);
        zzzow.zzK((short) zzzzfZzZpV.zzYVU);
        zzzow.zzJ((short) (zzzzfZzZpV.zzYVS | (zzzzfZzZpV.zzYUS ? 128 : 0) | (zzzzfZzZpV.zzYVT << 8) | (zzzzfZzZpV.zzYVR ? 32768 : 0)));
        int i = zzzzfZzZpV.zzYUY << 1;
        int i2 = zzzzfZzZpV.zzYWo;
        zzzow.zzJ((short) (i | (i2 != 0 ? 32 : 0) | (i2 == 1 ? 64 : 0) | (zzzzfZzZpV.zzYWw ? 128 : 0) | (zzzzfZzZpV.zzYUR ? 256 : 0) | (zzzzfZzZpV.zzYUU ? 512 : 0) | 1024 | (zzzzfZzZpV.zzYWu ? 2048 : 0) | (!zzzzfZzZpV.zzYWt ? 4096 : 0) | (!zzzzfZzZpV.zzYWs ? 8192 : 0)));
        if (zzzzfZzZpV.zzYUP) {
            zzY1Z.zzY(iWarningCallback, 10, "Word2003 versioning feature is not supported, AutoVersion option turned off", new Object[0]);
        }
        zzzow.zzJ((short) 0);
        zzzow.zzJ((short) 16);
        zzzow.zzJ((short) 25);
        zzzow.zzl(100);
        zzzow.zzl(25);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzl(document.zzZqB());
        zzzow.zzl(0);
        zzzow.writeBytes(new byte[30]);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzK((short) document.getFootnoteOptions().getNumberStyle());
        zzzow.zzK((short) document.getEndnoteOptions().getNumberStyle());
        zzzow.zzJ((short) 0);
        zzzow.zzJ((short) 0);
        zzzow.zzJ((short) 0);
        zzzow.zzJ((short) zzzzfZzZpV.zzYVZ);
        int i3 = (zzzzfZzZpV.zzYW2 ? 2 : 0) | (!zzzzfZzZpV.zzYUN ? 8 : 0) | (!zzzzfZzZpV.zzYVC ? 512 : 0) | (zzzzfZzZpV.zzYVE ? 1024 : 0) | (zzzzfZzZpV.zzYVD ? 2048 : 0) | (zzzzfZzZpV.zzYVx << 12) | (!zzzzfZzZpV.zzYVA ? 65536 : 0) | (!zzzzfZzZpV.zzYVz ? 131072 : 0) | (zzzzfZzZpV.zzYVy << 18);
        int i4 = WarningType.HINT;
        zzzow.zzl(i3 | WarningType.HINT);
        zzzow.zzk(zzT(compatibilityOptions));
        zzzow.zzk((compatibilityOptions.getShapeLayoutLikeWW8() ? 1 : 0) | (compatibilityOptions.getFootnoteLayoutLikeWW8() ? 2 : 0) | (compatibilityOptions.getDoNotUseHTMLParagraphAutoSpacing() ? 4 : 0) | (!compatibilityOptions.getAdjustLineHeightInTable() ? 8 : 0) | (compatibilityOptions.getForgetLastTabAlignment() ? 16 : 0) | (compatibilityOptions.getAutoSpaceLikeWord95() ? 32 : 0) | (compatibilityOptions.getAlignTablesRowByRow() ? 64 : 0) | (compatibilityOptions.getLayoutRawTableWidth() ? 128 : 0) | (compatibilityOptions.getLayoutTableRowsApart() ? 256 : 0) | (compatibilityOptions.getUseWord97LineBreakRules() ? 512 : 0) | (compatibilityOptions.getDoNotBreakWrappedTables() ? 1024 : 0) | (compatibilityOptions.getDoNotSnapToGridInCell() ? 2048 : 0) | (compatibilityOptions.getSelectFldWithFirstOrLastChar() ? 4096 : 0) | (compatibilityOptions.getApplyBreakingRules() ? 8192 : 0) | (compatibilityOptions.getDoNotWrapTextWithPunct() ? 16384 : 0) | (compatibilityOptions.getDoNotUseEastAsianBreakRules() ? 32768 : 0) | (compatibilityOptions.getUseWord2002TableStyleRules() ? 65536 : 0) | (compatibilityOptions.getGrowAutofit() ? 131072 : 0) | (compatibilityOptions.getUseNormalStyleForList() ? 262144 : 0) | (compatibilityOptions.getDoNotUseIndentAsNumberingTabStop() ? 524288 : 0) | (compatibilityOptions.getUseAltKinsokuLineBreakRules() ? 1048576 : 0) | (compatibilityOptions.getAllowSpaceOfSameStyleInTable() ? 2097152 : 0) | (compatibilityOptions.getDoNotSuppressIndentation() ? 4194304 : 0) | (compatibilityOptions.getDoNotAutofitConstrainedTables() ? 8388608 : 0) | (compatibilityOptions.getAutofitToFirstFixedWidthCell() ? 16777216 : 0) | (compatibilityOptions.getUnderlineTabInNumList() ? 33554432 : 0) | (compatibilityOptions.getDisplayHangulFixedWidth() ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 0) | (compatibilityOptions.getSplitPgBreakAndParaMark() ? 134217728 : 0) | (compatibilityOptions.getDoNotVertAlignCellWithSp() ? 268435456 : 0) | (compatibilityOptions.getDoNotBreakConstrainedForcedTable() ? 536870912 : 0) | (compatibilityOptions.getDoNotVertAlignInTxbx() ? 1073741824 : 0) | (compatibilityOptions.getUseAnsiKerningPairs() ? Integer.MIN_VALUE : 0));
        zzzow.zzk(compatibilityOptions.getCachedColBalance() ? 1 : 0);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzk(0);
        int i5 = (zzzzfZzZpV.zzYWC ? 8388608 : 0) | (document.getViewOptions().getDoNotDisplayPageBoundaries() ? 65536 : 0) | 134217728;
        if (!zzzzfZzZpV.zzYVw) {
            i4 = 0;
        }
        zzzow.zzk(i5 | i4 | (zzzzfZzZpV.zzYVv ? 536870912 : 0) | (!zzzzfZzZpV.zzYVq ? 1073741824 : 0) | (zzzzfZzZpV.zzYVn ? Integer.MIN_VALUE : 0));
        zzzow.zzk(0);
        int i6 = zzzzfZzZpV.zzYWh;
        Object[] objArr = i6 == 3;
        Object[] objArr2 = i6 == 4;
        zzzow.zzJ((short) ((!zzzzfZzZpV.zzYWx ? 1 : 0) | (!zzzzfZzZpV.zzYVm ? 8 : 0) | (zzzzfZzZpV.zzYVl ? 16 : 0) | (objArr == true ? 64 : 0) | (objArr2 != false ? 128 : 0) | (zzzzfZzZpV.zzYWb ? 4096 : 0) | (zzzzfZzZpV.zzYWa ? 8192 : 0) | (zzzzfZzZpV.zzYW9 ? 16384 : 0) | (zzzzfZzZpV.zzYW8 ? 32768 : 0)));
        zzzow.zzJ((short) zzY0C.zzhD(zzzzfZzZpV.zzYVY));
        zzzow.zzJ((short) 0);
        zzzow.zzJ((short) zzzzfZzZpV.zzYWj.zzY2B());
        if (objArr == false && objArr2 == false) {
            zzzow.zzJ((short) 0);
        } else {
            zzzow.zzJ((short) zzzzfZzZpV.zzYVW);
        }
        zzzow.zzk(zzzzfZzZpV.zzYVi);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzk(zzzzfZzZpV.zzYVk);
        zzzow.zzk((zzzzfZzZpV.zzYW6.zzZoc() == 3 ? 1 : 0) | (zzzzfZzZpV.zzYW6.zzZIN() ? 2 : 0) | (zzzzfZzZpV.zzYW6.zzZoa() ? 4 : 0) | (zzzzfZzZpV.zzYVu ? 8 : 0) | (zzzzfZzZpV.zzYVp ? 16 : 0) | ((zzzzfZzZpV.zzYW6.zzZIN() && zzzzfZzZpV.zzYW6.zzZod()) ? 32 : 0) | (zzzzfZzZpV.zzYVs ? 128 : 0) | (zzzzfZzZpV.zzYVr ? 256 : 0) | (zzzzfZzZpV.zzYWk ? 2048 : 0) | (zzzzfZzZpV.zzYWl ? 4096 : 0));
        int i7 = (zzzzfZzZpV.zzYW1 ? 1 : 0) | (zzzzfZzZpV.zzYW7 ? 2 : 0) | (zzzzfZzZpV.zzYW0 ? 4 : 0) | (zzzzfZzZpV.zzYW6.zzZoe() == -1 ? 0 : 8);
        int iZzZoe = zzzzfZzZpV.zzYW6.zzZoe();
        if (iZzZoe == -1) {
            i7 |= zzzzfZzZpV.zzYW6.zzZod() ? 112 : 48;
        } else if (iZzZoe != 0) {
            if (iZzZoe == 1) {
                i7 |= 16;
            } else if (iZzZoe == 2) {
                i7 |= 32;
            } else {
                if (iZzZoe != 3) {
                    throw new IllegalStateException("Unknown document protection type.");
                }
                i7 |= 48;
            }
        }
        zzzow.zzJ((short) (i7 | (document.getViewOptions().getDisplayBackgroundShape() ? 128 : 0)));
        zzzow.zzJ((short) 0);
        zzzow.zzJ((short) 0);
        zzzow.zzk(0);
        zzzow.zzJ((short) 0);
        zzzow.zzJ((short) 0);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzk((!zzzzfZzZpV.zzYWg ? 1 : 0) | (zzzzfZzZpV.zzYWf ? 0 : 2) | (zzY8T.zzkM(zzzzfZzZpV.zzYWi) << 5) | (zzzzfZzZpV.zzYW1 ? 512 : 0) | (!zzzzfZzZpV.zzYV7 ? 1024 : 0));
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzZ(zzzow, document);
        return ((int) zzzow.zzq().getPosition()) - position;
    }

    private static void zzZ(com.aspose.words.internal.zzZOW zzzow, Document document) throws Exception {
        zzYZU zzyzu = document.zzZpV().zzYVd;
        zzzow.zzk(zzyzu.zzYEA() | (zzyzu.zzYEz() << 2) | (zzyzu.zzYEy() << 4) | (zzyzu.zzYEp() ? 256 : 0) | (zzyzu.zzYEu() << 9) | (zzyzu.zzYEs() << 10) | (zzyzu.zzYEn() ? 2048 : 0) | (zzyzu.zzYEx() ? 4096 : 0));
        zzzow.zzJ((short) document.getFontInfos().zzLn(zzyzu.zzYEt()));
        zzzow.zzk(zzyzu.zzZRi());
        zzzow.zzk(zzyzu.zzZRh());
        zzzow.zzk(120);
        zzzow.zzk(120);
        zzzow.zzk(0);
        zzzow.zzk(0);
        zzzow.zzk(zzyzu.zzYEo());
    }

    private static void zzZ(zzZZF zzzzf, int i) {
        if (i >= 274) {
            zzzzf.zzYVg = CompatibilityOptions.zzZYO();
        } else if (i >= 268) {
            zzzzf.zzYVg = CompatibilityOptions.zzZYP();
        } else if (i >= 257) {
            zzzzf.zzYVg = CompatibilityOptions.zzZYQ();
        } else if (i >= 217) {
            zzzzf.zzYVg = CompatibilityOptions.zzZYR();
        } else {
            zzzzf.zzYVg = CompatibilityOptions.zzZYS();
        }
        zzzzf.zzYVg.setUICompat97To2003(true);
    }
}
