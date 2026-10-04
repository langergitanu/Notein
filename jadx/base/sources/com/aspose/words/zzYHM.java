package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHM extends zzYI2 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\deftab", "\\fracwidth", "\\psover", "\\doctemp", "\\doctype", "\\showplaceholdtext", "\\showxmlerrors", "\\validatexml", "\\ignoremixedcontent", "\\saveinvalidxml", "\\usexform", "\\stylelockqfset", "\\stylelocktheme", "\\stylesortmethod", "\\relyonvml", "\\tsd", "\\cts", "\\rempersonalinfo", "\\hyphauto", "\\hyphhotz", "\\hyphconsec", "\\hyphcaps", "\\viewkind", "\\viewscale", "\\viewzk", "\\viewbksp", "\\viewnobound", "\\ftnstart", "\\aftnstart", "\\fet", "\\linkstyles", "\\facingp", "\\margmirror", "\\gutterprl", "\\widowctrl", "\\twoonone", "\\bookfold", "\\bookfoldrev", "\\bookfoldsheets", "\\gutter", "\\paperw", "\\paperh", "\\margl", "\\margr", "\\margt", "\\margb", "\\landscape", "\\pgnstart", "\\rsidroot", "\\nocxsptable", "\\nospaceforul", "\\nolnhtadjtbl", "\\alntblind", "\\lyttblrtgr", "\\nogrowautofit", "\\oldas", "\\dntblnsbdb", "\\otblrul", "\\noxlattoyen", "\\wpjst", "\\notabind", "\\noextrasprl", "\\nolead", "\\wrppunct", "\\nocolbal", "\\transmf", "\\nobrkwrptbl", "\\lytexcttp", "\\expshrtn", "\\snaptogridincell", "\\asianbrkrule", "\\htmautsp", "\\noultrlspc", "\\truncex", "\\useltbaln", "\\splytwnine", "\\ftnlytwnine", "\\lytcalctblwd", "\\oldlinewrap", "\\bdbfhdr", "\\prcolbl", "\\allowfieldendsel", "\\wpsp", "\\brkfrm", "\\subfontbysize", "\\sprsbsp", "\\sprstsp", "\\sprstsm", "\\sprslnsp", "\\sprsspbf", "\\swpbdr", "\\cvmme", "\\truncatefontheight", "\\msmcap", "\\ApplyBrkRules", "\\lytprtmet", "\\newtblstyruls", "\\bdrrlswsix", "\\lnbrkrule", "\\wraptrsp", "\\nouicompat", "\\nofeaturethrottle", "\\spltpgpar", "\\noindnmbrts", "\\krnprsnet", "\\usenormstyforlist", "\\felnbrelev", "\\indrlsweleven", "\\noafcnsttbl", "\\afelev", "\\utinl", "\\hwelev", "\\notcvasp", "\\notbrkcnstfrctbl", "\\notvatxbx", "\\cachedcolbal", "\\formshade", "\\printdata", "\\revprot", "\\annotprot", "\\formprot", "\\readprot", "\\protlevel", "\\enforceprot", "\\stylelock", "\\autofmtoverride", "\\readonlyrecommended", "\\revisions", "\\trackformatting", "\\trackmoves", "\\nojkernpunct", "\\dghspace", "\\dgvspace", "\\dghorigin", "\\dgvorigin", "\\dghshow", "\\dgvshow", "\\dgmargin", "\\pgbrdrhead", "\\pgbrdrfoot", "\\pgbrdrsnap", "\\mbrkBin", "\\mbrkBinSub", "\\mdefJc", "\\mdispDef", "\\minterSp", "\\mintLim", "\\mintraSp", "\\mlMargin", "\\mmathFont", "\\mnaryLim", "\\mpostSp", "\\mpreSp", "\\mrMargin", "\\msmallFrac", "\\mwrapIndent", "\\mwrapRight", "\\donotembedsysfont");

    public zzYHM(zzYFT zzyft) {
        super(zzyft);
        zzYja().getDocument().zzZpV().zzYVa = true;
    }

    private boolean zzN(zzYET zzyet) throws Exception {
        zzZZF zzzzfZzZpV = zzYja().getDocument().zzZpV();
        switch (zzUR.zzTP(zzyet.getName())) {
            case 31:
                zzzzfZzZpV.zzYVX = true;
                return true;
            case 32:
                zzzzfZzZpV.zzYWh = 1;
                return true;
            case 33:
                zzzzfZzZpV.zzYWr = true;
                return true;
            case 34:
                zzzzfZzZpV.zzYUT = true;
                return true;
            case 35:
                zzzzfZzZpV.zzYWh = 2;
                return true;
            case 36:
                zzzzfZzZpV.zzYWh = 3;
                return true;
            case 37:
                zzzzfZzZpV.zzYWh = 4;
                return true;
            case 38:
                zzzzfZzZpV.zzYVW = zzyet.zzYeT();
                return true;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                int iZzBM = zzYFJ.zzBM(zzyet.getName());
                if (com.aspose.words.internal.zzZYI.zzWm(iZzBM)) {
                    throw new IllegalStateException();
                }
                zzYja().zzZW(iZzBM, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 46:
                zzYja().zzZW(2210, 2);
                return true;
            case 47:
                int iZzYeT = zzyet.zzYeT();
                if (iZzYeT > 0) {
                    zzYja().zzZW(2200, Integer.valueOf(iZzYeT));
                }
                return true;
            case 48:
                zzYja().getDocument().zzZpV().zzYVk = zzyet.zzYeT();
                return true;
            default:
                return false;
        }
    }

    private boolean zzO(zzZZF zzzzf, zzYET zzyet) throws Exception {
        zzYZU zzyzu = zzzzf.zzYVd;
        switch (zzUR.zzTP(zzyet.getName())) {
            case 141:
                zzyzu.zzur(zzyet.zzYeT());
                return true;
            case 142:
                zzyzu.zzuq(zzyet.zzYeT());
                return true;
            case 143:
                zzyzu.zzup(zzyet.zzYeT());
                return true;
            case 144:
                zzyzu.zzSR(zzyet.zzYeY());
                return true;
            case 145:
                zzyzu.zzuo(zzyet.zzYeT());
                return true;
            case 146:
                zzyzu.zzum(zzyet.zzYeT());
                return true;
            case 147:
                zzyzu.zzun(zzyet.zzYeT());
                return true;
            case 148:
                zzyzu.zzHj(zzyet.zzYeT());
                return true;
            case 149:
                zzyzu.zzIk(zzYja().zzom(zzyet.zzYeT()));
                return true;
            case 150:
                zzyzu.zzul(zzyet.zzYeT());
                return true;
            case 151:
                zzyzu.zzuk(zzyet.zzYeT());
                return true;
            case 152:
                zzyzu.zzuj(zzyet.zzYeT());
                return true;
            case 153:
                zzyzu.zzHi(zzyet.zzYeT());
                return true;
            case 154:
                zzyzu.zzSQ(zzyet.zzYeY());
                return true;
            case 155:
                zzyzu.zzui(zzyet.zzYeT());
                return true;
            case 156:
                zzyzu.zzSP(zzyet.zzYeY());
                return true;
            default:
                return false;
        }
    }

    private static boolean zzP(zzZZF zzzzf, zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 138:
                zzzzf.zzYWt = false;
                return true;
            case 139:
                zzzzf.zzYWs = false;
                return true;
            case 140:
                zzzzf.zzYWu = true;
                return true;
            default:
                return false;
        }
    }

    private static boolean zzQ(zzZZF zzzzf, zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 131:
                zzzzf.zzYVV = zzyet.zzYeT();
                return true;
            case 132:
                zzzzf.zzYVU = zzyet.zzYeT();
                return true;
            case 133:
                zzzzf.zzYVQ = zzyet.zzYeT();
                return true;
            case 134:
                zzzzf.zzYVP = zzyet.zzYeT();
                return true;
            case 135:
                zzzzf.zzYVT = zzyet.zzYeT();
                return true;
            case 136:
                zzzzf.zzYVS = zzyet.zzYeT();
                return true;
            case 137:
                zzzzf.zzYVR = true;
                return true;
            default:
                return false;
        }
    }

    private static boolean zzR(zzZZF zzzzf, zzYET zzyet) throws Exception {
        if (zzUR.zzTP(zzyet.getName()) != 130) {
            return false;
        }
        zzzzf.zzYVN = false;
        return true;
    }

    private static boolean zzS(zzZZF zzzzf, zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 127:
                zzzzf.zzYWc = true;
                return true;
            case 128:
                zzzzf.zzYWg = zzyet.zzYeT() == 0;
                return true;
            case 129:
                zzzzf.zzYWf = true;
                return true;
            default:
                return false;
        }
    }

    private static boolean zzT(zzZZF zzzzf, zzYET zzyet) throws Exception {
        if (zzUR.zzTP(zzyet.getName()) != 126) {
            return false;
        }
        zzzzf.zzYW5.setReadOnlyRecommended(true);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static boolean zzU(zzZZF zzzzf, zzYET zzyet) throws Exception {
        zzZYR zzzyr = zzzzf.zzYW6;
        switch (zzUR.zzTP(zzyet.getName())) {
            case 118:
                zzzyr.zzFF(0);
                return true;
            case 119:
                zzzyr.zzFF(1);
                return true;
            case 120:
                zzzyr.zzFF(2);
                return true;
            case 121:
                zzzyr.zzFF(3);
                return true;
            case 122:
                return true;
            case 123:
                zzzyr.zzWv(zzyet.zzYeY());
                return true;
            case 124:
                zzzyr.zzXG(true);
                return true;
            case 125:
                zzzzf.zzYW6.zzWt(true);
                return true;
            default:
                return false;
        }
    }

    private static boolean zzX(zzZZF zzzzf, zzYET zzyet) throws Exception {
        if (zzUR.zzTP(zzyet.getName()) != 30) {
            return false;
        }
        zzzzf.zzYWm = true;
        return true;
    }

    private static boolean zzY(zzZZF zzzzf, zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 22:
                zzzzf.zzYVf.setViewType(zzyet.zzYeT());
                return true;
            case 23:
                zzzzf.zzYVf.setZoomPercent(zzyet.zzYeT());
                return true;
            case 24:
                zzzzf.zzYVf.setZoomType(zzyet.zzYeT());
                return true;
            case 25:
                zzzzf.zzYVf.setDisplayBackgroundShape(zzyet.zzYeY());
                return true;
            case 26:
                zzzzf.zzYVf.setDoNotDisplayPageBoundaries(zzyet.zzYeY());
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static boolean zzZ(zzZZF zzzzf, zzYET zzyet, zzYFT zzyft) throws Exception {
        int iZzCp = zzYHN.zzCp(zzyet.getName());
        if (iZzCp != Integer.MIN_VALUE) {
            zzzzf.zzYVM = iZzCp;
            return true;
        }
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                zzzzf.zzYW4 = zzyet.zzYeT();
                return true;
            case 1:
                zzzzf.zzYWA = true;
                return true;
            case 2:
                zzzzf.zzYWB = true;
                return true;
            case 3:
                return true;
            case 4:
                zzzzf.zzYWe = zzyet.zzYeT();
                return true;
            case 5:
                zzzzf.zzYVr = zzyet.zzYeY();
                return true;
            case 6:
                zzzzf.zzYVq = !zzyet.zzYeY();
                return true;
            case 7:
                zzzzf.zzYVw = zzyet.zzYeY();
                return true;
            case 8:
                zzzzf.zzYVs = zzyet.zzYeY();
                return true;
            case 9:
                zzzzf.zzYVv = zzyet.zzYeY();
                return true;
            case 10:
                zzzzf.zzYVp = zzyet.zzYeY();
                return true;
            case 11:
                zzzzf.zzYWl = true;
                return true;
            case 12:
                zzzzf.zzYWk = true;
                return true;
            case 13:
                zzzzf.zzYWi = zzY8T.zzkN(zzyet.zzYeT());
                return true;
            case 14:
                zzzzf.zzYVE = zzyet.zzYeY();
                return true;
            case 15:
                zzzzf.zzYVY = zzyft.zzJ(Integer.valueOf(zzyet.zzYeT()), StyleIdentifier.NIL);
                return true;
            case 16:
                zzzzf.zzYVZ = zzyft.zzJ(Integer.valueOf(zzyet.zzYeT()), 0);
                return true;
            case 17:
                zzzzf.zzYWC = true;
                return true;
            default:
                return false;
        }
    }

    @Override // com.aspose.words.zzYI2
    public final boolean zzV(zzYET zzyet) {
        return false;
    }

    @Override // com.aspose.words.zzYI2
    public final boolean zzW(zzYET zzyet) throws Exception {
        if (zzZrB()) {
            return false;
        }
        zzZZF zzzzfZzZpV = zzYja().getDocument().zzZpV();
        return zzZ(zzzzfZzZpV, zzyet, zzYja()) || zzZ(zzzzfZzZpV, zzyet) || zzY(zzzzfZzZpV, zzyet) || zzZ(zzzzfZzZpV.zzYVh, zzyet) || zzX(zzzzfZzZpV, zzyet) || zzN(zzyet) || zzW(zzzzfZzZpV, zzyet) || zzV(zzzzfZzZpV, zzyet) || zzU(zzzzfZzZpV, zzyet) || zzT(zzzzfZzZpV, zzyet) || zzS(zzzzfZzZpV, zzyet) || zzN(zzzzfZzZpV, zzyet) || zzR(zzzzfZzZpV, zzyet) || zzQ(zzzzfZzZpV, zzyet) || zzP(zzzzfZzZpV, zzyet) || zzN(zzyet) || zzO(zzzzfZzZpV, zzyet);
    }

    private static boolean zzV(zzZZF zzzzf, zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 116) {
            zzzzf.zzYVO = false;
        } else {
            if (iZzTP != 117) {
                return false;
            }
            zzzzf.zzYWz = true;
        }
        return true;
    }

    private static boolean zzN(zzZZF zzzzf, zzYET zzyet) throws Exception {
        if (zzUR.zzTP(zzyet.getName()) != 157) {
            return false;
        }
        zzzzf.zzYWx = !zzyet.zzYeY();
        return true;
    }

    private static boolean zzW(zzZZF zzzzf, zzYET zzyet) throws Exception {
        CompatibilityOptions compatibilityOptions = zzzzf.zzYVg;
        switch (zzUR.zzTP(zzyet.getName())) {
            case 49:
                compatibilityOptions.setAllowSpaceOfSameStyleInTable(false);
                return true;
            case 50:
                compatibilityOptions.setSpaceForUL(false);
                return true;
            case 51:
                compatibilityOptions.setAdjustLineHeightInTable(false);
                return true;
            case 52:
                compatibilityOptions.setAlignTablesRowByRow(false);
                return true;
            case 53:
                compatibilityOptions.setLayoutTableRowsApart(false);
                return true;
            case 54:
                compatibilityOptions.setGrowAutofit(false);
                return true;
            case 55:
                compatibilityOptions.setAutoSpaceLikeWord95(true);
                return true;
            case 56:
                compatibilityOptions.setBalanceSingleByteDoubleByteWidth(false);
                return true;
            case 57:
                compatibilityOptions.setUseSingleBorderforContiguousCells(true);
                return true;
            case 58:
                compatibilityOptions.setDoNotLeaveBackslashAlone(false);
                return true;
            case 59:
                compatibilityOptions.setWPJustification(true);
                return true;
            case 60:
                compatibilityOptions.setNoTabHangInd(true);
                return true;
            case 61:
                compatibilityOptions.setNoSpaceRaiseLower(true);
                return true;
            case 62:
                compatibilityOptions.setNoLeading(true);
                return true;
            case 63:
                compatibilityOptions.setDoNotWrapTextWithPunct(false);
                return true;
            case 64:
                compatibilityOptions.setNoColumnBalance(true);
                return true;
            case 65:
                compatibilityOptions.setTransparentMetafiles(true);
                return true;
            case 66:
                compatibilityOptions.setDoNotBreakWrappedTables(false);
                return true;
            case 67:
                compatibilityOptions.setNoExtraLineSpacing(true);
                return true;
            case 68:
                compatibilityOptions.setDoNotExpandShiftReturn(false);
                return true;
            case 69:
                compatibilityOptions.setDoNotSnapToGridInCell(false);
                return true;
            case 70:
                compatibilityOptions.setDoNotUseEastAsianBreakRules(false);
                return true;
            case 71:
                compatibilityOptions.setDoNotUseHTMLParagraphAutoSpacing(false);
                return true;
            case 72:
                compatibilityOptions.setUlTrailSpace(false);
                return true;
            case 73:
                compatibilityOptions.setSpacingInWholePoints(true);
                return true;
            case 74:
                compatibilityOptions.setForgetLastTabAlignment(false);
                return true;
            case 75:
                compatibilityOptions.setShapeLayoutLikeWW8(false);
                return true;
            case 76:
                compatibilityOptions.setFootnoteLayoutLikeWW8(false);
                return true;
            case 77:
                compatibilityOptions.setLayoutRawTableWidth(false);
                return true;
            case 78:
                compatibilityOptions.setLineWrapLikeWord6(true);
                return true;
            case 79:
                compatibilityOptions.setPrintBodyTextBeforeHeader(true);
                return true;
            case 80:
                compatibilityOptions.setPrintColBlack(true);
                return true;
            case 81:
                compatibilityOptions.setSelectFldWithFirstOrLastChar(false);
                return true;
            case 82:
                compatibilityOptions.setWPSpaceWidth(true);
                return true;
            case 83:
                compatibilityOptions.setShowBreaksInFrames(true);
                return true;
            case 84:
                compatibilityOptions.setSubFontBySize(true);
                return true;
            case 85:
                compatibilityOptions.setSuppressBottomSpacing(true);
                return true;
            case 86:
                compatibilityOptions.setSuppressTopSpacing(true);
                return true;
            case 87:
                compatibilityOptions.setSuppressSpacingAtTopOfPage(true);
                return true;
            case 88:
                compatibilityOptions.setSuppressTopSpacingWP(true);
                return true;
            case 89:
                compatibilityOptions.setSuppressSpBfAfterPgBrk(true);
                return true;
            case 90:
                compatibilityOptions.setSwapBordersFacingPgs(true);
                return true;
            case 91:
                compatibilityOptions.setConvMailMergeEsc(true);
                return true;
            case 92:
                compatibilityOptions.setTruncateFontHeightsLikeWP6(true);
                return true;
            case 93:
                compatibilityOptions.setMWSmallCaps(true);
                return true;
            case 94:
                compatibilityOptions.setApplyBreakingRules(true);
                return true;
            case 95:
                compatibilityOptions.setUsePrinterMetrics(true);
                return true;
            case 96:
                compatibilityOptions.setUseWord2002TableStyleRules(false);
                return true;
            case 97:
                compatibilityOptions.setDoNotSuppressParagraphBorders(true);
                return true;
            case 98:
                compatibilityOptions.setUseWord97LineBreakRules(false);
                return true;
            case 99:
                compatibilityOptions.setWrapTrailSpaces(true);
                return true;
            case 100:
                compatibilityOptions.setUICompat97To2003(false);
                return true;
            case 101:
                compatibilityOptions.setUICompat97To2003(!zzyet.zzYeY());
                return true;
            case 102:
                compatibilityOptions.setSplitPgBreakAndParaMark(false);
                return true;
            case 103:
                compatibilityOptions.setDoNotUseIndentAsNumberingTabStop(false);
                return true;
            case 104:
                compatibilityOptions.setUseAnsiKerningPairs(false);
                return true;
            case 105:
                compatibilityOptions.setUseNormalStyleForList(false);
                return true;
            case 106:
                compatibilityOptions.setUseAltKinsokuLineBreakRules(false);
                return true;
            case 107:
                compatibilityOptions.setDoNotSuppressIndentation(false);
                return true;
            case 108:
                compatibilityOptions.setDoNotAutofitConstrainedTables(false);
                return true;
            case 109:
                compatibilityOptions.setAutofitToFirstFixedWidthCell(false);
                return true;
            case 110:
                compatibilityOptions.setUnderlineTabInNumList(false);
                return true;
            case 111:
                compatibilityOptions.setDisplayHangulFixedWidth(false);
                return true;
            case 112:
                compatibilityOptions.setDoNotVertAlignCellWithSp(false);
                return true;
            case 113:
                compatibilityOptions.setDoNotBreakConstrainedForcedTable(false);
                return true;
            case 114:
                compatibilityOptions.setDoNotVertAlignInTxbx(false);
                return true;
            case 115:
                compatibilityOptions.setCachedColBalance(false);
                return true;
            default:
                return false;
        }
    }

    private static boolean zzZ(zzZZF zzzzf, zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 18:
                zzzzf.zzYW3.setAutoHyphenation(zzyet.zzYeY());
                return true;
            case 19:
                zzzzf.zzYW3.zzyv(zzyet.zzYeT());
                return true;
            case 20:
                zzzzf.zzYW3.zzyw(zzyet.zzYeT());
                return true;
            case 21:
                zzzzf.zzYW3.setHyphenateCaps(zzyet.zzYeY());
                return true;
            default:
                return false;
        }
    }

    private boolean zzZ(zzZS zzzs, zzYET zzyet) throws Exception {
        int iZzCv = zzYHN.zzCv(zzyet.getName());
        if (iZzCv != Integer.MIN_VALUE) {
            zzzs.zzQ(2500, Integer.valueOf(iZzCv));
            return true;
        }
        int iZzCu = zzYHN.zzCu(zzyet.getName());
        if (iZzCu != Integer.MIN_VALUE) {
            zzzs.zzQ(2600, Integer.valueOf(iZzCu));
            return true;
        }
        int iZzCt = zzYHN.zzCt(zzyet.getName());
        if (iZzCt != Integer.MIN_VALUE) {
            zzzs.zzQ(2510, Integer.valueOf(iZzCt));
            return true;
        }
        int iZzCs = zzYHN.zzCs(zzyet.getName());
        if (iZzCs != Integer.MIN_VALUE) {
            zzzs.zzQ(2610, Integer.valueOf(iZzCs));
            return true;
        }
        int iZzCr = zzYHN.zzCr(zzyet.getName());
        if (iZzCr != Integer.MIN_VALUE) {
            zzzs.zzQ(2530, Integer.valueOf(iZzCr));
            return true;
        }
        int iZzCq = zzYHN.zzCq(zzyet.getName());
        if (iZzCq != Integer.MIN_VALUE) {
            zzzs.zzQ(2630, Integer.valueOf(iZzCq));
            return true;
        }
        switch (zzUR.zzTP(zzyet.getName())) {
            case 27:
                zzzs.zzQ(2520, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 28:
                zzzs.zzQ(2620, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 29:
                zzYja().zzYga();
                return true;
            default:
                return false;
        }
    }
}
