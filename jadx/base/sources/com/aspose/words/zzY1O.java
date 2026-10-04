package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1O {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("alwaysMergeEmptyNamespace", "alwaysShowPlaceholderText", "autoFormatOverride", "bookFoldPrinting", "bookFoldRevPrinting", "mirrorMargins", "printTwoOnOne", "bookFoldPrintingSheets", "doNotEmbedSystemFonts", "printFractionalCharacterWidth", "printPostScriptOverText", "removePersonalInformation", "showEnvelope", "validateAgainstSchema", "saveInvalidXML", "ignoreMixedContent", "useXSLTWhenSaving", "saveThroughXSLT", "view", "zoom", "dontDisplayPageBoundaries", "displayBackgroundShape", "printFormsData", "embedTrueTypeFonts", "saveSubsetFonts", "saveFormsData", "alignBordersAndEdges", "bordersDontSurroundHeader", "bordersDontSurroundFooter", "doNotUnderlineInvalidXML", "gutterAtTop", "proofState", "formsDesign", "attachedTemplate", "linkStyles", "documentType", "mailMerge", "stylePaneFormatFilter", "trackRevisions", "documentProtection", "defaultTabStop", "autoHyphenation", "consecutiveHyphenLimit", "hyphenationZone", "doNotHyphenateCaps", "evenAndOddHeaders", "drawingGridHorizontalSpacing", "drawingGridVerticalSpacing", "displayHorizontalDrawingGridEvery", "displayVerticalDrawingGridEvery", "useMarginsForDrawingGridOrigin", "drawingGridHorizontalOrigin", "drawingGridVerticalOrigin", "doNotShadeFormData", "punctuationKerning", "characterSpacingControl", "strictFirstAndLastChars", "noLineBreaksAfter", "noLineBreaksBefore", "footnotePr", "endnotePr", "compat", "docVars", "optimizeForBrowser", "relyOnVML", "allowPNG", "doNotRelyOnCSS", "doNotSaveWebPagesAsSingleFile", "doNotOrganizeInFolder", "doNotUseLongFileNames", "pixelsPerInch", "targetScreenSz", "hideSpellingErrors", "hideGrammaticalErrors", "hdrShapeDefaults", "clickAndTypeStyle", "defaultTableStyle", "rsids", ContextChain.TAG_PRODUCT, "tbl", "val", "percent", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "spelling", "grammar", "edit", "formatting", "enforcement", "unprotectPassword", "origWordTableRules", "wpJustification", "noTabHangInd", "noLeading", "spaceForUL", "noColumnBalance", "balanceSingleByteDoubleByteWidth", "transparentMetafiles", "noExtraLineSpacing", "doNotLeaveBackslashAlone", "ulTrailSpace", "doNotExpandShiftReturn", "spacingInWholePoints", "lineWrapLikeWord6", "printBodyTextBeforeHeader", "printColBlack", "wpSpaceWidth", "showBreaksInFrames", "subFontBySize", "suppressBottomSpacing", "suppressTopSpacing", "suppressTopSpacingMac5", "suppressTopSpacingWP", "suppressSpBfAfterPgBrk", "swapBordersFacingPages", "convMailMergeEsc", "truncateFontHeight", "mwSmallCaps", "usePrinterMetrics", "ww6BorderRules", "wrapTrailSpaces", "footnoteLayoutLikeWW8", "shapeLayoutLikeWW8", "alignTablesRowByRow", "forgetLastTabAlignment", "adjustLineHeightInTable", "autoSpaceLikeWord95", "noSpaceRaiseLower", "doNotUseHTMLParagraphAutoSpacing", "layoutRawTableWidth", "layoutTableRowsApart", "useWord97LineBreakingRules", "breakWrappedTables", "snapToGridInCell", "dontAllowFieldEndSelect", "applyBreakingRules", "wrapTextWithPunct", "useAsianBreakRules", "useWord2002TableStyleRules", "dontGrowAutofit", "name", "pos", "numFmt", "numStart", "numRestart", "footnote", "endnote", C18437z2.f56754h);

    private static void zzY(zzYVB zzyvb, int i) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        int iZzZX = -1;
        while (zzyu4ZzZsD.zzi()) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 146) {
                zzyvb.zzZ(16777216, 13, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4ZzZsD.getLocalName()));
            } else {
                iZzZX = zzY1K.zzZX(zzyu4ZzZsD.getValue(), i == 1);
            }
        }
        if (iZzZX == -1) {
            return;
        }
        zzZMS zzzms = new zzZMS(zzyvb.getDocument(), iZzZX);
        zzY11.zzXSx();
        zzyvb.zzQ(zzzms);
        zzyvb.getDocument().zzZpU().zzZ(iZzZX, zzzms);
    }

    public static void zzZ(zzY12 zzy12) throws Exception {
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        DocumentBase document = zzy12.getDocument();
        zzZZF zzzzfZzZpV = document.zzZpV();
        ViewOptions viewOptions = zzzzfZzZpV.zzYVf;
        CompatibilityOptions compatibilityOptions = zzzzfZzZpV.zzYVg;
        HyphenationOptions hyphenationOptions = zzzzfZzZpV.zzYW3;
        zzY0T zzy0tZzXSx = zzY11.zzXSx();
        zzzzfZzZpV.zzYWx = true;
        compatibilityOptions.setDoNotBreakWrappedTables((document.zzYBb().getBuiltInDocumentProperties().getVersion() >> 16) < 12);
        compatibilityOptions.setDoNotSnapToGridInCell(true);
        compatibilityOptions.setDoNotWrapTextWithPunct(true);
        compatibilityOptions.setDoNotUseEastAsianBreakRules(true);
        compatibilityOptions.setGrowAutofit(true);
        compatibilityOptions.setSplitPgBreakAndParaMark(true);
        compatibilityOptions.setDoNotUseIndentAsNumberingTabStop(true);
        compatibilityOptions.setDoNotVertAlignInTxbx(true);
        compatibilityOptions.setAutofitToFirstFixedWidthCell(true);
        compatibilityOptions.setDoNotVertAlignCellWithSp(true);
        while (zzyu4ZzZsD.zzQ("docPr")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 0:
                    zzzzfZzZpV.zzYVn = zzyu4ZzZsD.zzYyD();
                    break;
                case 1:
                    zzzzfZzZpV.zzYVr = zzyu4ZzZsD.zzYyD();
                    break;
                case 2:
                    zzzzfZzZpV.zzYW6.zzWt(zzyu4ZzZsD.zzYyD());
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    zzYUI.zzZ(zzy12, zzzzfZzZpV);
                    break;
                case 7:
                    zzzzfZzZpV.zzYVW = zzyu4ZzZsD.zzYyE();
                    break;
                case 8:
                    zzzzfZzZpV.zzYWx = !zzyu4ZzZsD.zzYyD();
                    break;
                case 9:
                    zzzzfZzZpV.zzYWA = zzyu4ZzZsD.zzYyD();
                    break;
                case 10:
                    zzzzfZzZpV.zzYWB = zzyu4ZzZsD.zzYyD();
                    break;
                case 11:
                    zzzzfZzZpV.zzYWC = zzyu4ZzZsD.zzYyD();
                    break;
                case 12:
                    zzzzfZzZpV.zzYW2 = zzyu4ZzZsD.zzYyD();
                    break;
                case 13:
                    zzzzfZzZpV.zzYVw = zzyu4ZzZsD.zzYyD();
                    break;
                case 14:
                    zzzzfZzZpV.zzYVv = zzyu4ZzZsD.zzYyD();
                    break;
                case 15:
                    zzzzfZzZpV.zzYVs = zzyu4ZzZsD.zzYyD();
                    break;
                case 16:
                    zzzzfZzZpV.zzYVp = zzyu4ZzZsD.zzYyD();
                    break;
                case 17:
                    zzzzfZzZpV.zzYVo = zzyu4ZzZsD.zzV("xslt", "");
                    break;
                case 18:
                    viewOptions.setViewType(zzY1L.zzyO(zzyu4ZzZsD.zzV("val", null)));
                    break;
                case 19:
                    zzZ(viewOptions, zzyu4ZzZsD);
                    break;
                case 20:
                    viewOptions.setDoNotDisplayPageBoundaries(zzyu4ZzZsD.zzYyD());
                    break;
                case 21:
                    viewOptions.setDisplayBackgroundShape(zzyu4ZzZsD.zzYyD());
                    break;
                case 22:
                    zzzzfZzZpV.zzYWz = zzyu4ZzZsD.zzYyD();
                    break;
                case 23:
                    zzzzfZzZpV.zzYWy = zzyu4ZzZsD.zzYyD();
                    break;
                case 24:
                    zzzzfZzZpV.zzYWw = zzyu4ZzZsD.zzYyD();
                    break;
                case 25:
                    zzzzfZzZpV.zzYWv = zzyu4ZzZsD.zzYyD();
                    break;
                case 26:
                    zzzzfZzZpV.zzYWu = zzyu4ZzZsD.zzYyD();
                    break;
                case 27:
                    zzzzfZzZpV.zzYWt = zzyu4ZzZsD.zzYyD();
                    break;
                case 28:
                    zzzzfZzZpV.zzYWs = zzyu4ZzZsD.zzYyD();
                    break;
                case 29:
                    zzzzfZzZpV.zzYVq = zzyu4ZzZsD.zzYyD();
                    break;
                case 30:
                    zzzzfZzZpV.zzYWr = zzyu4ZzZsD.zzYyD();
                    break;
                case 31:
                    zzZ(zzzzfZzZpV, zzyu4ZzZsD);
                    break;
                case 32:
                    viewOptions.setFormsDesign(zzyu4ZzZsD.zzYyD());
                    break;
                case 33:
                    zzzzfZzZpV.zzYWn = zzyu4ZzZsD.zzV("val", null);
                    break;
                case 34:
                    zzzzfZzZpV.zzYWm = zzyu4ZzZsD.zzYyD();
                    break;
                case 35:
                    zzzzfZzZpV.zzYWe = zzY1L.zzyM(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 36:
                    zzY11.zzXSs().zzZ(zzy12, zzzzfZzZpV.zzYWd);
                    break;
                case 37:
                    zzzzfZzZpV.zzYWj.zzkD(zzYU3.zzGU(zzyu4ZzZsD.zzV("val", null)));
                    break;
                case 38:
                    zzzzfZzZpV.zzYWc = zzyu4ZzZsD.zzYyD();
                    break;
                case 39:
                    zzZ(zzzzfZzZpV.zzYW6, zzyu4ZzZsD);
                    break;
                case 40:
                    zzzzfZzZpV.zzYW4 = zzyu4ZzZsD.zzYyE();
                    break;
                case 41:
                    hyphenationOptions.setAutoHyphenation(zzyu4ZzZsD.zzYyD());
                    break;
                case 42:
                    hyphenationOptions.zzyw(zzyu4ZzZsD.zzYyE());
                    break;
                case 43:
                    hyphenationOptions.zzyv(zzyu4ZzZsD.zzYyE());
                    break;
                case 44:
                    hyphenationOptions.setHyphenateCaps(!zzyu4ZzZsD.zzYyD());
                    break;
                case 45:
                    zzzzfZzZpV.zzYVX = zzyu4ZzZsD.zzYyD();
                    break;
                case 46:
                    zzzzfZzZpV.zzYVV = zzyu4ZzZsD.zzYyE();
                    break;
                case 47:
                    zzzzfZzZpV.zzYVU = zzyu4ZzZsD.zzYyE();
                    break;
                case 48:
                    zzzzfZzZpV.zzYVT = zzyu4ZzZsD.zzYyE();
                    break;
                case 49:
                    zzzzfZzZpV.zzYVS = zzyu4ZzZsD.zzYyE();
                    break;
                case 50:
                    zzzzfZzZpV.zzYVR = !zzyu4ZzZsD.zzYyD();
                    break;
                case 51:
                    zzzzfZzZpV.zzYVQ = zzyu4ZzZsD.zzYyE();
                    break;
                case 52:
                    zzzzfZzZpV.zzYVP = zzyu4ZzZsD.zzYyE();
                    break;
                case 53:
                    zzzzfZzZpV.zzYVO = zzyu4ZzZsD.zzYyD();
                    break;
                case 54:
                    zzzzfZzZpV.zzYVN = zzyu4ZzZsD.zzYyD();
                    break;
                case 55:
                    zzzzfZzZpV.zzYVM = zzY1L.zzyQ(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 56:
                    zzzzfZzZpV.zzYVL = zzyu4ZzZsD.zzYyD();
                    break;
                case 57:
                    zzzzfZzZpV.zzYVJ = zzZ(zzyu4ZzZsD, zzzzfZzZpV);
                    break;
                case 58:
                    zzzzfZzZpV.zzYVI = zzZ(zzyu4ZzZsD, zzzzfZzZpV);
                    break;
                case 59:
                case 60:
                    zzZ(zzy12, zzyu4ZzZsD.getLocalName(), document.zzZpV().zzYVh);
                    break;
                case 61:
                    zzZ(compatibilityOptions, zzyu4ZzZsD);
                    break;
                case 62:
                    zzZ(document.getVariables(), zzyu4ZzZsD);
                    break;
                case 63:
                    zzzzfZzZpV.zzYVG = zzyu4ZzZsD.zzYyD();
                    break;
                case 64:
                    zzzzfZzZpV.zzYVE = zzyu4ZzZsD.zzYyD();
                    break;
                case 65:
                    zzzzfZzZpV.zzYVD = zzyu4ZzZsD.zzYyD();
                    break;
                case 66:
                    zzzzfZzZpV.zzYVC = zzyu4ZzZsD.zzYyD();
                    break;
                case 67:
                    zzzzfZzZpV.zzYVB = zzyu4ZzZsD.zzYyD();
                    break;
                case 68:
                    zzzzfZzZpV.zzYVA = zzyu4ZzZsD.zzYyD();
                    break;
                case 69:
                    zzzzfZzZpV.zzYVz = zzyu4ZzZsD.zzYyD();
                    break;
                case 70:
                    zzzzfZzZpV.zzYVy = zzyu4ZzZsD.zzYyE();
                    break;
                case 71:
                    zzzzfZzZpV.zzYVx = zzY8T.zzAM(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 72:
                    zzzzfZzZpV.zzYV9 = zzyu4ZzZsD.zzYyD();
                    break;
                case 73:
                    zzzzfZzZpV.zzYV8 = zzyu4ZzZsD.zzYyD();
                    break;
                case 74:
                    zzYUG.zzZ(zzyu4ZzZsD, zzy12.zzXUj);
                    break;
                case 75:
                    zzy12.zzXUe = zzyu4ZzZsD.zzV("val", null);
                    break;
                case 76:
                    zzy12.zzXUd = zzyu4ZzZsD.zzV("val", null);
                    break;
                case 77:
                    zzYUI.zzV(zzyu4ZzZsD, zzzzfZzZpV);
                    break;
                case 78:
                case 79:
                    zzZ(zzy12, document, zzy0tZzXSx);
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    private static String zzyU(String str) {
        return (str == null || str.length() <= 8) ? str : str.substring(str.length() - 8, str.length());
    }

    private static void zzZ(ViewOptions viewOptions, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 80) {
                viewOptions.setZoomType(zzY1L.zzyN(zzyu4.getValue()));
            } else if (iZzTP == 81) {
                viewOptions.setZoomPercent(zzyu4.zzb());
            }
        }
    }

    private static String zzZ(zzYU4 zzyu4, zzZZF zzzzf) {
        String value = "";
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 80) {
                value = zzyu4.getValue();
            } else if (iZzTP != 82) {
                zzyu4.zzZ(16777216, 13, zzyu4.getValue());
            } else {
                zzzzf.zzYVK = com.aspose.words.internal.zzBM.zzYw(zzyu4.getValue());
            }
        }
        return value;
    }

    private static void zzZ(zzZZF zzzzf, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 83) {
                zzzzf.zzYWp = zzY1L.zzyP(zzyu4.getValue());
            } else if (iZzTP == 84) {
                zzzzf.zzYWo = zzY1L.zzyP(zzyu4.getValue());
            }
        }
    }

    private static void zzZ(zzZYR zzzyr, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 85:
                    zzzyr.zzFG(zzY1L.zzyR(zzyu4.getValue()));
                    break;
                case 86:
                    zzzyr.zzXG(zzyu4.zz8());
                    break;
                case 87:
                    zzzyr.zzWv(zzyu4.zz8());
                    break;
                case 88:
                    zzzyr.zzFE(zzYU3.zzGU(zzyU(zzyu4.getValue())));
                    break;
            }
        }
    }

    private static void zzZ(CompatibilityOptions compatibilityOptions, zzYU4 zzyu4) {
        compatibilityOptions.setUICompat97To2003(true);
        while (zzyu4.zzQ("compat")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 89:
                    compatibilityOptions.setUseSingleBorderforContiguousCells(zzyu4.zzYyD());
                    break;
                case 90:
                    compatibilityOptions.setWPJustification(zzyu4.zzYyD());
                    break;
                case 91:
                    compatibilityOptions.setNoTabHangInd(zzyu4.zzYyD());
                    break;
                case 92:
                    compatibilityOptions.setNoLeading(zzyu4.zzYyD());
                    break;
                case 93:
                    compatibilityOptions.setSpaceForUL(zzyu4.zzYyD());
                    break;
                case 94:
                    compatibilityOptions.setNoColumnBalance(zzyu4.zzYyD());
                    break;
                case 95:
                    compatibilityOptions.setBalanceSingleByteDoubleByteWidth(zzyu4.zzYyD());
                    break;
                case 96:
                    compatibilityOptions.setTransparentMetafiles(zzyu4.zzYyD());
                    break;
                case 97:
                    compatibilityOptions.setNoExtraLineSpacing(zzyu4.zzYyD());
                    break;
                case 98:
                    compatibilityOptions.setDoNotLeaveBackslashAlone(zzyu4.zzYyD());
                    break;
                case 99:
                    compatibilityOptions.setUlTrailSpace(zzyu4.zzYyD());
                    break;
                case 100:
                    compatibilityOptions.setDoNotExpandShiftReturn(zzyu4.zzYyD());
                    break;
                case 101:
                    compatibilityOptions.setSpacingInWholePoints(zzyu4.zzYyD());
                    break;
                case 102:
                    compatibilityOptions.setLineWrapLikeWord6(zzyu4.zzYyD());
                    break;
                case 103:
                    compatibilityOptions.setPrintBodyTextBeforeHeader(zzyu4.zzYyD());
                    break;
                case 104:
                    compatibilityOptions.setPrintColBlack(zzyu4.zzYyD());
                    break;
                case 105:
                    compatibilityOptions.setWPSpaceWidth(zzyu4.zzYyD());
                    break;
                case 106:
                    compatibilityOptions.setShowBreaksInFrames(zzyu4.zzYyD());
                    break;
                case 107:
                    compatibilityOptions.setSubFontBySize(zzyu4.zzYyD());
                    break;
                case 108:
                    compatibilityOptions.setSuppressBottomSpacing(zzyu4.zzYyD());
                    break;
                case 109:
                    compatibilityOptions.setSuppressTopSpacing(zzyu4.zzYyD());
                    break;
                case 110:
                    compatibilityOptions.setSuppressSpacingAtTopOfPage(zzyu4.zzYyD());
                    break;
                case 111:
                    compatibilityOptions.setSuppressTopSpacingWP(zzyu4.zzYyD());
                    break;
                case 112:
                    compatibilityOptions.setSuppressSpBfAfterPgBrk(zzyu4.zzYyD());
                    break;
                case 113:
                    compatibilityOptions.setSwapBordersFacingPgs(zzyu4.zzYyD());
                    break;
                case 114:
                    compatibilityOptions.setConvMailMergeEsc(zzyu4.zzYyD());
                    break;
                case 115:
                    compatibilityOptions.setTruncateFontHeightsLikeWP6(zzyu4.zzYyD());
                    break;
                case 116:
                    compatibilityOptions.setMWSmallCaps(zzyu4.zzYyD());
                    break;
                case 117:
                    compatibilityOptions.setUsePrinterMetrics(zzyu4.zzYyD());
                    break;
                case 118:
                    compatibilityOptions.setDoNotSuppressParagraphBorders(zzyu4.zzYyD());
                    break;
                case 119:
                    compatibilityOptions.setWrapTrailSpaces(zzyu4.zzYyD());
                    break;
                case 120:
                    compatibilityOptions.setFootnoteLayoutLikeWW8(zzyu4.zzYyD());
                    break;
                case 121:
                    compatibilityOptions.setShapeLayoutLikeWW8(zzyu4.zzYyD());
                    break;
                case 122:
                    compatibilityOptions.setAlignTablesRowByRow(zzyu4.zzYyD());
                    break;
                case 123:
                    compatibilityOptions.setForgetLastTabAlignment(zzyu4.zzYyD());
                    break;
                case 124:
                    compatibilityOptions.setAdjustLineHeightInTable(zzyu4.zzYyD());
                    break;
                case 125:
                    compatibilityOptions.setAutoSpaceLikeWord95(zzyu4.zzYyD());
                    break;
                case 126:
                    compatibilityOptions.setNoSpaceRaiseLower(zzyu4.zzYyD());
                    break;
                case 127:
                    compatibilityOptions.setDoNotUseHTMLParagraphAutoSpacing(zzyu4.zzYyD());
                    break;
                case 128:
                    compatibilityOptions.setLayoutRawTableWidth(zzyu4.zzYyD());
                    break;
                case 129:
                    compatibilityOptions.setLayoutTableRowsApart(zzyu4.zzYyD());
                    break;
                case 130:
                    compatibilityOptions.setUseWord97LineBreakRules(zzyu4.zzYyD());
                    break;
                case 131:
                    compatibilityOptions.setDoNotBreakWrappedTables(!zzyu4.zzYyD());
                    break;
                case 132:
                    compatibilityOptions.setDoNotSnapToGridInCell(!zzyu4.zzYyD());
                    break;
                case 133:
                    compatibilityOptions.setSelectFldWithFirstOrLastChar(zzyu4.zzYyD());
                    break;
                case 134:
                    compatibilityOptions.setApplyBreakingRules(zzyu4.zzYyD());
                    break;
                case 135:
                    compatibilityOptions.setDoNotWrapTextWithPunct(!zzyu4.zzYyD());
                    break;
                case 136:
                    compatibilityOptions.setDoNotUseEastAsianBreakRules(!zzyu4.zzYyD());
                    break;
                case 137:
                    compatibilityOptions.setUseWord2002TableStyleRules(zzyu4.zzYyD());
                    break;
                case 138:
                    compatibilityOptions.setGrowAutofit(!zzyu4.zzYyD());
                    break;
                default:
                    zzyu4.zzk();
                    break;
            }
        }
    }

    private static void zzZ(VariableCollection variableCollection, zzYU4 zzyu4) {
        while (zzyu4.zzQ("docVars")) {
            if ("docVar".equals(zzyu4.getLocalName())) {
                String value = null;
                String value2 = null;
                while (zzyu4.zzi()) {
                    int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
                    if (iZzTP == 80) {
                        value2 = zzyu4.getValue();
                    } else if (iZzTP == 139) {
                        value = zzyu4.getValue();
                    }
                }
                if (value != null) {
                    variableCollection.add(value, value2);
                }
            } else {
                zzyu4.zzk();
            }
        }
    }

    public static void zzZ(zzYVB zzyvb, String str, zzZS zzzs) throws Exception {
        Integer numValueOf;
        boolean zEquals = "endnotePr".equals(str);
        int i = zEquals ? 100 : 0;
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ(str)) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 140:
                    int i2 = i + 2500;
                    if (zEquals) {
                        numValueOf = Integer.valueOf(zzYUL.zzHa(zzyu4ZzZsD.zzV("val", null)));
                    } else {
                        numValueOf = Integer.valueOf(zzYUL.zzHb(zzyu4ZzZsD.zzV("val", null)));
                    }
                    zzzs.zzQ(i2, numValueOf);
                    break;
                case 141:
                    zzzs.zzQ(i + 2530, Integer.valueOf(zzY1K.zzyK(zzyu4ZzZsD.zzV("val", null))));
                    break;
                case 142:
                    zzzs.zzQ(i + 2520, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                    break;
                case 143:
                    zzzs.zzQ(i + 2510, Integer.valueOf(zzYUL.zzHd(zzyu4ZzZsD.zzV("val", null))));
                    break;
                case 144:
                    zzY(zzyvb, 0);
                    break;
                case 145:
                    zzY(zzyvb, 1);
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    private static void zzZ(zzYVB zzyvb, DocumentBase documentBase, zzY0T zzy0t) throws Exception {
        CompositeNode compositeNodeZzYz7 = zzyvb.zzYz7();
        CompositeNode compositeNode = (CompositeNode) compositeNodeZzYz7.getChild(3, 0, true);
        if (compositeNode == null) {
            zzyvb.zzT(new Section(documentBase));
            zzyvb.zzT(new Body(documentBase));
        } else {
            zzyvb.zzR(compositeNode);
        }
        zzy0t.zzF(zzyvb);
        zzyvb.zzR(compositeNodeZzYz7);
    }
}
