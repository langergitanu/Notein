package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHL {
    private static void zzR(zzZZF zzzzf, zzYHZ zzyhz) throws Exception {
        zzyhz.zz7("\\pgbrdrhead", !zzzzf.zzYWt);
        zzyhz.zz7("\\pgbrdrfoot", !zzzzf.zzYWs);
        zzyhz.zz7("\\pgbrdrsnap", zzzzf.zzYWu);
    }

    private static void zzS(zzZZF zzzzf, zzYHZ zzyhz) throws Exception {
        zzyhz.zzV("\\dghspace", zzzzf.zzYVV, 120, true);
        zzyhz.zzV("\\dgvspace", zzzzf.zzYVU, 120, true);
        zzyhz.zzV("\\dghorigin", zzzzf.zzYVQ, 1701, true);
        zzyhz.zzV("\\dgvorigin", zzzzf.zzYVP, 1984, true);
        zzyhz.zzt("\\dghshow", zzzzf.zzYVT, 3);
        zzyhz.zzt("\\dgvshow", zzzzf.zzYVS, 0);
        zzyhz.zz7("\\dgmargin", zzzzf.zzYVR);
    }

    private static void zzT(zzZZF zzzzf, zzYHZ zzyhz) throws Exception {
        zzyhz.zz7("\\nojkernpunct", !zzzzf.zzYVN);
    }

    private static void zzU(zzZZF zzzzf, zzYHZ zzyhz) throws Exception {
        zzyhz.zz7("\\revisions", zzzzf.zzYWc);
        if (zzzzf.zzYWc && zzzzf.zzYWg) {
            zzyhz.zzZ5("\\trackformatting", 0);
        }
    }

    private static void zzV(zzZZF zzzzf, zzYHZ zzyhz) throws Exception {
        zzZYR zzzyr = zzzzf.zzYW6;
        boolean z = false;
        if (zzzyr.zzZoc() != -1) {
            int iZzZoc = zzzyr.zzZoc();
            if (iZzZoc != 0) {
                if (iZzZoc == 1) {
                    zzyhz.zzCD("\\annotprot");
                } else if (iZzZoc == 2) {
                    zzyhz.zzCD("\\formprot");
                } else if (iZzZoc == 3) {
                    zzyhz.zzCD("\\annotprot");
                    zzyhz.zzCD("\\readprot");
                }
                z = true;
            } else {
                zzyhz.zzCD("\\revprot");
            }
            zzyhz.zz7("\\enforceprot1", zzzyr.zzZod());
            zzyhz.zzZ5("\\protlevel", zzzyr.zzZoc());
        }
        if (zzzyr.zzZIN()) {
            zzyhz.zz7("\\annotprot", !z);
            zzyhz.zzCD("\\stylelock");
            zzyhz.zzCD("\\stylelockenforced");
            zzyhz.zzCD("\\stylelockbackcomp");
            zzyhz.zz7("\\autofmtoverride", zzzzf.zzYW6.zzZoa());
        }
    }

    private static void zzW(zzZZF zzzzf, zzYHZ zzyhz) throws Exception {
        zzyhz.zz7("\\formshade", !zzzzf.zzYVO);
        zzyhz.zz7("\\printdata", zzzzf.zzYWz);
    }

    private static void zzX(zzZZF zzzzf, zzYHZ zzyhz) throws Exception {
        zzyhz.zz7("\\linkstyles", zzzzf.zzYWm);
    }

    private static int zzY(zzYEM zzyem) {
        if (zzyem.zzYee() > 0) {
            return zzyem.zzYef() > 0 ? 2 : 1;
        }
        return 0;
    }

    private static void zzZ(String str, IWarningCallback iWarningCallback) {
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 1, 12, str);
        }
    }

    private static void zzX(zzYEM zzyem) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzYZU zzyzu = zzyem.getDocument().zzZpV().zzYVd;
        zzyhzZzYfW.zzCC("\\mmathPr");
        zzyhzZzYfW.zzZ5("\\mbrkBin", zzyzu.zzYEA());
        zzyhzZzYfW.zzZ5("\\mbrkBinSub", zzyzu.zzYEz());
        zzyhzZzYfW.zzZ5("\\mdefJc", zzyzu.zzYEy());
        zzyhzZzYfW.zz5("\\mdispDef", zzyzu.zzYEx());
        zzyhzZzYfW.zzZ5("\\minterSp", zzyzu.zzYEw());
        zzyhzZzYfW.zzZ5("\\mintLim", zzyzu.zzYEu());
        zzyhzZzYfW.zzZ5("\\mintraSp", zzyzu.zzYEv());
        zzyhzZzYfW.zzZ5("\\mlMargin", zzyzu.zzZRi());
        zzyhzZzYfW.zzZ5("\\mmathFont", zzyem.getDocument().getFontInfos().zzLn(zzyzu.zzYEt()));
        zzyhzZzYfW.zzZ5("\\mnaryLim", zzyzu.zzYEs());
        zzyhzZzYfW.zzZ5("\\mpostSp", zzyzu.zzYEr());
        zzyhzZzYfW.zzZ5("\\mpreSp", zzyzu.zzYEq());
        zzyhzZzYfW.zzZ5("\\mrMargin", zzyzu.zzZRh());
        zzyhzZzYfW.zz5("\\msmallFrac", zzyzu.zzYEp());
        zzyhzZzYfW.zzZ5("\\mwrapIndent", zzyzu.zzYEo());
        zzyhzZzYfW.zz5("\\mwrapRight", zzyzu.zzYEn());
        zzyhzZzYfW.zzYj3();
    }

    private static void zzW(zzYEM zzyem) throws Exception {
        if (zzyem.getFontInfos().zzZ77()) {
            zzyem.zzYfW().zz6("\\donotembedsysfont", !zzyem.getDocument().zzZpV().zzYWx);
        }
    }

    private static void zzY(zzZZF zzzzf, zzYHZ zzyhz) throws Exception {
        int i = zzzzf.zzYWh;
        boolean z = i == 3;
        boolean z2 = i == 4;
        zzyhz.zz7("\\facingp", zzzzf.zzYVX);
        zzyhz.zz7("\\margmirror", zzzzf.zzYWh == 1);
        zzyhz.zz7("\\gutterprl", zzzzf.zzYWr);
        zzyhz.zz7("\\widowctrl", zzzzf.zzYUT);
        zzyhz.zz7("\\twoonone", zzzzf.zzYWh == 2);
        zzyhz.zz7("\\bookfold", z);
        zzyhz.zz7("\\bookfoldrev", z2);
        if (z || z2) {
            zzyhz.zzZ5("\\bookfoldsheets", zzzzf.zzYVW);
        }
    }

    public static void zzZ(zzYEM zzyem, IWarningCallback iWarningCallback) throws Exception {
        Document document = zzyem.zzZqS().zzYfy;
        zzZZF zzzzfZzZpV = document.zzZpV();
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.zzFg();
        zzX(zzyem);
        zzyhzZzYfW.zzFg();
        zzX(zzzzfZzZpV, zzyhzZzYfW);
        zzZ(zzzzfZzZpV, zzyhzZzYfW);
        zzZ(document.getViewOptions(), zzyhzZzYfW);
        zzZ(zzyem, document);
        zzY(zzzzfZzZpV, zzyhzZzYfW);
        zzZ(zzzzfZzZpV, zzyhzZzYfW, zzyem.zzYen().zzYg6());
        zzW(zzzzfZzZpV, zzyhzZzYfW);
        zzV(zzzzfZzZpV, zzyhzZzYfW);
        zzZ(zzzzfZzZpV.zzYW5, zzyhzZzYfW);
        zzU(zzzzfZzZpV, zzyhzZzYfW);
        zzW(zzyem);
        zzT(zzzzfZzZpV, zzyhzZzYfW);
        zzS(zzzzfZzZpV, zzyhzZzYfW);
        zzR(zzzzfZzZpV, zzyhzZzYfW);
        if (zzyem.zzYen().zzYd6()) {
            zzyhzZzYfW.zzZ5("\\rsidroot", zzzzfZzZpV.zzYVk);
        }
        zzyhzZzYfW.zzFg();
        zzYGH.zzZ(zzzzfZzZpV.zzYWd, zzyhzZzYfW);
        zzZ(zzzzfZzZpV, iWarningCallback);
    }

    private static void zzZ(zzZZF zzzzf, zzYHZ zzyhz) throws Exception {
        zzyhz.zzt("\\deftab", zzzzf.zzYW4, 720);
        HyphenationOptions hyphenationOptions = zzzzf.zzYW3;
        zzyhz.zzV("\\hyphhotz", hyphenationOptions.getHyphenationZone(), StyleIdentifier.LIST_TABLE_4_ACCENT_5, true);
        zzyhz.zzt("\\hyphconsec", hyphenationOptions.getConsecutiveHyphenLimit(), 0);
        zzyhz.zz7("\\hyphcaps0", !hyphenationOptions.getHyphenateCaps());
        if (hyphenationOptions.getAutoHyphenation()) {
            zzyhz.zzCD("\\hyphauto1");
        }
        zzyhz.zz7("\\fracwidth", zzzzf.zzYWA);
        zzyhz.zzY6("\\*\\template", zzzzf.zzYWn);
        zzyhz.zz7("\\psover", zzzzf.zzYWB);
        zzyhz.zzCD("\\deflang1033");
        zzyhz.zzCD("\\deflangfe2052");
        zzyhz.zzCD("\\adeflang1025");
        zzyhz.zzt("\\doctype", zzzzf.zzYWe, 0);
        zzyhz.zz7("\\fromhtml", zzzzf.zzYUU);
        zzyhz.zzCD(zzYHN.zzoY(zzzzf.zzYVM));
        zzyhz.zz7("\\showplaceholdtext", zzzzf.zzYVr);
        zzyhz.zz7("\\showxmlerrors1", !zzzzf.zzYVq);
        zzyhz.zz7("\\validatexml1", zzzzf.zzYVw);
        zzyhz.zz7("\\ignoremixedcontent1", zzzzf.zzYVs);
        zzyhz.zz7("\\saveinvalidxml1", zzzzf.zzYVv);
        zzyhz.zz7("\\usexform", zzzzf.zzYVp);
        zzyhz.zzY6("\\*\\xform", zzzzf.zzYVo);
        zzyhz.zz7("\\stylelockqfset", zzzzf.zzYWl);
        zzyhz.zz7("\\stylelocktheme", zzzzf.zzYWk);
        if (zzzzf.zzYWj.zzY2B() != 20516) {
            zzyhz.zzCC("\\*\\wgrffmtfilter");
            zzyhz.zzG((short) zzzzf.zzYWj.zzY2B());
            zzyhz.zzYj3();
        }
        zzyhz.zzt("\\stylesortmethod", zzY8T.zzkM(zzzzf.zzYWi), 1);
        boolean z = zzzzf.zzYVE;
        if (z) {
            zzyhz.zz5("\\relyonvml", z);
        }
        zzyhz.zzt("\\tsd", zzzzf.zzYVY, StyleIdentifier.NIL);
        zzyhz.zzt("\\cts", zzzzf.zzYVZ, 0);
        zzyhz.zz7("\\rempersonalinfo", zzzzf.zzYWC);
    }

    private static void zzZ(ViewOptions viewOptions, zzYHZ zzyhz) throws Exception {
        zzyhz.zzt("\\viewkind", viewOptions.getViewType(), 4);
        zzyhz.zzZ5("\\viewscale", viewOptions.getZoomPercent());
        zzyhz.zzt("\\viewzk", viewOptions.getZoomType(), 0);
        zzyhz.zz7("\\viewbksp1", viewOptions.getDisplayBackgroundShape());
        zzyhz.zz7("\\viewnobound1", viewOptions.getDoNotDisplayPageBoundaries());
    }

    private static void zzZ(zzYEM zzyem, Document document) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.zzZ5("\\fet", zzY(zzyem));
        zzZ(zzyem, "\\*\\ftnsep", document.zzZpU().zzB1(0));
        zzZ(zzyem, "\\*\\ftnsepc", document.zzZpU().zzB1(1));
        zzZ(zzyem, "\\*\\ftncn", document.zzZpU().zzB1(2));
        zzZ(zzyem, "\\*\\aftnsep", document.zzZpU().zzB1(3));
        zzZ(zzyem, "\\*\\aftnsepc", document.zzZpU().zzB1(4));
        zzZ(zzyem, "\\*\\aftncn", document.zzZpU().zzB1(5));
        zzYCZ zzycz = document.zzZpV().zzYVh;
        zzZ(zzyhzZzYfW, document, zzycz);
        Object obj = zzycz.get(2520);
        if (obj != null) {
            zzyhzZzYfW.zzt("\\ftnstart", ((Integer) obj).intValue(), 1);
        }
        Object objZzPk = zzycz.zzPk(2620);
        if (objZzPk != null) {
            zzyhzZzYfW.zzt("\\aftnstart", ((Integer) objZzPk).intValue(), 1);
        }
        zzyhzZzYfW.zzCD(zzYHN.zzYY(zzycz.get(2510)));
        zzyhzZzYfW.zzCD(zzYHN.zzYX(zzycz.get(2610)));
        zzyhzZzYfW.zzCD(zzYHN.zzYW(zzycz.get(2530)));
        zzyhzZzYfW.zzCD(zzYHN.zzYV(zzycz.get(2630)));
    }

    private static void zzZ(zzYHZ zzyhz, Document document, zzZS zzzs) throws Exception {
        Object objZzPk;
        Iterator<T> it = document.getChildNodes(20, true).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((Footnote) it.next()).getFootnoteType() == 0) {
                    objZzPk = zzzs.zzPj(2500);
                    break;
                }
            } else {
                objZzPk = zzzs.zzPk(2500);
                break;
            }
        }
        zzyhz.zzCD(zzYHN.zzZ0(objZzPk));
        zzyhz.zzCD(zzYHN.zzYZ(zzzs.get(2600)));
    }

    private static void zzZ(zzYEM zzyem, String str, zzZMS zzzms) throws Exception {
        if (zzzms == null) {
            return;
        }
        zzyem.zzYfW().zzCC(str);
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzzms.zzZYr(), Paragraph.class);
        if (paragraph != null) {
            zzyem.zzYem().visitParagraphStart(paragraph);
            SpecialChar specialChar = (SpecialChar) com.aspose.words.internal.zzZKW.zzZ(paragraph.getFirstChild(), SpecialChar.class);
            if (specialChar != null) {
                zzyem.zzYem().visitSpecialChar(specialChar);
            }
            zzyem.zzYem().visitParagraphEnd(paragraph);
        }
        zzyem.zzYfW().zzYj3();
    }

    private static void zzZ(zzZZF zzzzf, zzYHZ zzyhz, boolean z) throws Exception {
        CompatibilityOptions compatibilityOptions = zzzzf.zzYVg;
        zzyhz.zz7("\\nocxsptable", !compatibilityOptions.getAllowSpaceOfSameStyleInTable());
        zzyhz.zz7("\\nospaceforul", !compatibilityOptions.getSpaceForUL());
        zzyhz.zz7("\\nolnhtadjtbl", !compatibilityOptions.getAdjustLineHeightInTable());
        zzyhz.zz7("\\alntblind", !compatibilityOptions.getAlignTablesRowByRow());
        zzyhz.zz7("\\lyttblrtgr", !compatibilityOptions.getLayoutTableRowsApart());
        zzyhz.zz7("\\nogrowautofit", !compatibilityOptions.getGrowAutofit());
        zzyhz.zz7("\\oldas", compatibilityOptions.getAutoSpaceLikeWord95());
        zzyhz.zz7("\\dntblnsbdb", !compatibilityOptions.getBalanceSingleByteDoubleByteWidth());
        zzyhz.zz7("\\otblrul", compatibilityOptions.getUseSingleBorderforContiguousCells());
        zzyhz.zz7("\\noxlattoyen", !compatibilityOptions.getDoNotLeaveBackslashAlone());
        zzyhz.zz7("\\wpjst", compatibilityOptions.getWPJustification());
        zzyhz.zz7("\\notabind", compatibilityOptions.getNoTabHangInd());
        zzyhz.zz7("\\noextrasprl", compatibilityOptions.getNoSpaceRaiseLower());
        zzyhz.zz7("\\nolead", compatibilityOptions.getNoLeading());
        zzyhz.zz7("\\wrppunct", !compatibilityOptions.getDoNotWrapTextWithPunct());
        zzyhz.zz7("\\nocolbal", compatibilityOptions.getNoColumnBalance());
        zzyhz.zz7("\\transmf", compatibilityOptions.getTransparentMetafiles());
        zzyhz.zz7("\\nobrkwrptbl", !compatibilityOptions.getDoNotBreakWrappedTables());
        zzyhz.zz7("\\lytexcttp", compatibilityOptions.getNoExtraLineSpacing());
        zzyhz.zz7("\\expshrtn", !compatibilityOptions.getDoNotExpandShiftReturn());
        zzyhz.zz7("\\snaptogridincell", !compatibilityOptions.getDoNotSnapToGridInCell());
        zzyhz.zz7("\\asianbrkrule", !compatibilityOptions.getDoNotUseEastAsianBreakRules());
        zzyhz.zz7("\\htmautsp", !compatibilityOptions.getDoNotUseHTMLParagraphAutoSpacing());
        zzyhz.zz7("\\noultrlspc", !compatibilityOptions.getUlTrailSpace());
        zzyhz.zz7("\\truncex", compatibilityOptions.getSpacingInWholePoints());
        zzyhz.zz7("\\useltbaln", !compatibilityOptions.getForgetLastTabAlignment());
        zzyhz.zz7("\\splytwnine", !compatibilityOptions.getShapeLayoutLikeWW8());
        zzyhz.zz7("\\ftnlytwnine", !compatibilityOptions.getFootnoteLayoutLikeWW8());
        zzyhz.zz7("\\lytcalctblwd", !compatibilityOptions.getLayoutRawTableWidth());
        zzyhz.zz7("\\oldlinewrap", compatibilityOptions.getLineWrapLikeWord6());
        zzyhz.zz7("\\bdbfhdr", compatibilityOptions.getPrintBodyTextBeforeHeader());
        zzyhz.zz7("\\prcolbl", compatibilityOptions.getPrintColBlack());
        zzyhz.zz7("\\allowfieldendsel", !compatibilityOptions.getSelectFldWithFirstOrLastChar());
        zzyhz.zz7("\\wpsp", compatibilityOptions.getWPSpaceWidth());
        zzyhz.zz7("\\brkfrm", compatibilityOptions.getShowBreaksInFrames());
        zzyhz.zz7("\\subfontbysize", compatibilityOptions.getSubFontBySize());
        zzyhz.zz7("\\sprsbsp", compatibilityOptions.getSuppressBottomSpacing());
        zzyhz.zz7("\\sprstsp", compatibilityOptions.getSuppressTopSpacing());
        zzyhz.zz7("\\sprstsm", compatibilityOptions.getSuppressSpacingAtTopOfPage());
        zzyhz.zz7("\\sprslnsp", compatibilityOptions.getSuppressTopSpacingWP());
        zzyhz.zz7("\\sprsspbf", compatibilityOptions.getSuppressSpBfAfterPgBrk());
        zzyhz.zz7("\\swpbdr", compatibilityOptions.getSwapBordersFacingPgs());
        zzyhz.zz7("\\cvmme", compatibilityOptions.getConvMailMergeEsc());
        zzyhz.zz7("\\truncatefontheight", compatibilityOptions.getTruncateFontHeightsLikeWP6());
        zzyhz.zz7("\\msmcap", compatibilityOptions.getMWSmallCaps());
        zzyhz.zz7("\\ApplyBrkRules", compatibilityOptions.getApplyBreakingRules());
        zzyhz.zz7("\\lytprtmet", compatibilityOptions.getUsePrinterMetrics());
        zzyhz.zz7("\\newtblstyruls", !compatibilityOptions.getUseWord2002TableStyleRules());
        zzyhz.zz7("\\bdrrlswsix", compatibilityOptions.getDoNotSuppressParagraphBorders());
        zzyhz.zz7("\\lnbrkrule", !compatibilityOptions.getUseWord97LineBreakRules());
        zzyhz.zz7("\\wraptrsp", compatibilityOptions.getWrapTrailSpaces());
        zzyhz.zz7("\\nouicompat", !compatibilityOptions.getUICompat97To2003());
        zzyhz.zz7("\\nofeaturethrottle1", !compatibilityOptions.getUICompat97To2003());
        zzyhz.zz7("\\spltpgpar", !compatibilityOptions.getSplitPgBreakAndParaMark());
        zzyhz.zz7("\\krnprsnet", !compatibilityOptions.getUseAnsiKerningPairs());
        zzyhz.zz7("\\noindnmbrts", !compatibilityOptions.getDoNotUseIndentAsNumberingTabStop());
        if (z) {
            zzyhz.zz7("\\usenormstyforlist", !compatibilityOptions.getUseNormalStyleForList());
            zzyhz.zz7("\\felnbrelev", !compatibilityOptions.getUseAltKinsokuLineBreakRules());
            zzyhz.zz7("\\indrlsweleven", !compatibilityOptions.getDoNotSuppressIndentation());
            zzyhz.zz7("\\noafcnsttbl", !compatibilityOptions.getDoNotAutofitConstrainedTables());
            zzyhz.zz7("\\afelev", !compatibilityOptions.getAutofitToFirstFixedWidthCell());
            zzyhz.zz7("\\utinl", !compatibilityOptions.getUnderlineTabInNumList());
            zzyhz.zz7("\\hwelev", !compatibilityOptions.getDisplayHangulFixedWidth());
            zzyhz.zz7("\\notcvasp", !compatibilityOptions.getDoNotVertAlignCellWithSp());
            zzyhz.zz7("\\notbrkcnstfrctbl", !compatibilityOptions.getDoNotBreakConstrainedForcedTable());
            zzyhz.zz7("\\notvatxbx", !compatibilityOptions.getDoNotVertAlignInTxbx());
            zzyhz.zz7("\\cachedcolbal", !compatibilityOptions.getCachedColBalance());
        }
    }

    private static void zzZ(WriteProtection writeProtection, zzYHZ zzyhz) throws Exception {
        zzyhz.zz7("\\readonlyrecommended", writeProtection.getReadOnlyRecommended());
        writeProtection.zzZof();
        zzYG1.zzZ(zzyhz, "\\*\\writereservhash", writeProtection.zzZo8());
    }

    private static void zzZ(zzZZF zzzzf, IWarningCallback iWarningCallback) {
        if (zzzzf.zzYWC) {
            zzZ("Remove Personal Information", iWarningCallback, true);
        }
        if (zzzzf.zzYWp != 0 || zzzzf.zzYWo != 0) {
            zzZ("Proof State", iWarningCallback, false);
        }
        if (!com.aspose.words.internal.zzZKN.equals(zzzzf.zzYVI, "")) {
            zzZ("No Line Breaks Before", iWarningCallback, false);
        }
        if (!com.aspose.words.internal.zzZKN.equals(zzzzf.zzYVJ, "")) {
            zzZ("No Line Breaks After", iWarningCallback, false);
        }
        if (zzzzf.zzYVc.getCount() > 0) {
            zzZ("Schemas", iWarningCallback, true);
        }
        if (!zzzzf.zzYWb) {
            zzZ("Show Markup", iWarningCallback, true);
        }
        if (zzzzf.zzYW2) {
            zzZ("Show Envelope", iWarningCallback, false);
        }
        if (zzzzf.zzYVL) {
            zzZ("Strict First And Last Chars", iWarningCallback, true);
        }
        if (!com.aspose.words.internal.zzZKN.equals(zzzzf.zzYVH, "")) {
            zzZ("WebPageEncoding, OptimizeForBrowser, WebTarget, AllowPng, DoNotRelyOnCss, DoNotSaveWebPagesAsSingleFile, DoNotOrganizeInFolder, DoNotOrganizeInFolder, DoNotUseLongFileNames, PixelsPerInch, TargetScreenSize", iWarningCallback, false);
        }
        if (zzzzf.zzYVn) {
            zzZ("Always Merge Empty Namespace", iWarningCallback, false);
        }
        if (zzzzf.zzYVu) {
            zzZ("Save Xml Data Only", iWarningCallback, false);
        }
        if (zzzzf.zzYVt) {
            zzZ("Show Xml tags", iWarningCallback, false);
        }
        if (zzzzf.zzYVm) {
            zzZ("Remove Smart Tags When Saving", iWarningCallback, false);
        }
        zzZ("Theme Font Languages", iWarningCallback, true);
        if (zzzzf.zzYV9) {
            zzZ("Hide Spelling Errors", iWarningCallback, false);
        }
        if (zzzzf.zzYV8) {
            zzZ("Hide Grammatical Errors", iWarningCallback, false);
        }
    }

    private static void zzZ(String str, IWarningCallback iWarningCallback, boolean z) {
        String str2;
        if (z) {
            str2 = com.aspose.words.internal.zzZKN.format("Export of {0} is not supported into Rtf format by Aspose.Words", str);
        } else {
            str2 = com.aspose.words.internal.zzZKN.format("{0} is not supported in Rtf format.", str);
        }
        zzZ(str2, iWarningCallback);
    }
}
