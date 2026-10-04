package com.aspose.words;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWL {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("doNotIncludeSubdocsInStats", "writeProtection", "alwaysMergeEmptyNamespace", "alwaysShowPlaceholderText", "autoFormatOverride", "bookFoldPrinting", "bookFoldRevPrinting", "mirrorMargins", "printTwoOnOne", "bookFoldPrintingSheets", "embedSystemFonts", "printFractionalCharacterWidth", "printPostScriptOverText", "removePersonalInformation", "removeDateAndTime", "showEnvelope", "doNotValidateAgainstSchema", "saveInvalidXml", "saveXmlDataOnly", "showXMLTags", "ignoreMixedContent", "useXSLTWhenSaving", "saveThroughXslt", "view", "zoom", "doNotDisplayPageBoundaries", "displayBackgroundShape", "printFormsData", "embedTrueTypeFonts", "saveSubsetFonts", "saveFormsData", "alignBordersAndEdges", "bordersDoNotSurroundHeader", "bordersDoNotSurroundFooter", "doNotDemarcateInvalidXml", "doNotEmbedSmartTags", "gutterAtTop", "proofState", "formsDesign", "attachedTemplate", "linkStyles", "documentType", "mailMerge", "mathPr", "styleLockQFSet", "styleLockTheme", "stylePaneFormatFilter", "stylePaneSortMethod", "trackRevisions", "doNotTrackMoves", "doNotTrackFormatting", "documentProtection", "defaultTabStop", "autoHyphenation", "consecutiveHyphenLimit", "hyphenationZone", "doNotHyphenateCaps", "evenAndOddHeaders", "drawingGridHorizontalSpacing", "drawingGridVerticalSpacing", "displayHorizontalDrawingGridEvery", "displayVerticalDrawingGridEvery", "doNotUseMarginsForDrawingGridOrigin", "drawingGridHorizontalOrigin", "drawingGridVerticalOrigin", "doNotShadeFormData", "noPunctuationKerning", "characterSpacingControl", "strictFirstAndLastChars", "noLineBreaksAfter", "noLineBreaksBefore", "footnotePr", "endnotePr", "compat", "docVars", "uiCompat97To2003", "revisionView", "themeFontLang", "clrSchemeMapping", "attachedSchema", "schemaLibrary", "hideSpellingErrors", "hideGrammaticalErrors", "shapeDefaults", "hdrShapeDefaults", "decimalSymbol", "listSeparator", "savePreviewPicture", "clickAndTypeStyle", "defaultTableStyle", "doNotAutoCompressPictures", "updateFields", "forceUpgrade", "chartTrackingRefBased", "docId", "discardImageEditingData", "defaultImageDpi", "rsids", "allStyles", "alternateStyleNames", "clearFormatting", "customStyles", "directFormattingOnNumbering", "directFormattingOnParagraphs", "directFormattingOnRuns", "directFormattingOnTables", "headingStyles", "latentStyles", "numberingStyles", "stylesInUse", "tableStyles", "top3HeadingStyles", "visibleStyles", "val", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "schema", "uri", "manifestLocation", "schemaLanguage", "schemaLocation", "brkBin", "brkBinSub", "defJc", "dispDef", "interSp", "intLim", "intraSp", "lMargin", "mathFont", "naryLim", "postSp", "preSp", "rMargin", "smallFrac", "wrapIndent", "wrapRight", "percent", "spelling", "grammar", "recommended", "edit", "formatting", "enforcement", "cryptProviderType", "cryptAlgorithmClass", "cryptAlgorithmType", "cryptAlgorithmSid", "algorithmName", "cryptSpinCount", "spinCount", "hash", "hashValue", "salt", "saltValue", "adjustLineHeightInTable", "alignTablesRowByRow", "allowSpaceOfSameStyleInTable", "applyBreakingRules", "autofitToFirstFixedWidthCell", "autoSpaceLikeWord95", "balanceSingleByteDoubleByteWidth", "cachedColBalance", "convMailMergeEsc", "displayHangulFixedWidth", "doNotAutofitConstrainedTables", "doNotBreakConstrainedForcedTable", "doNotBreakWrappedTables", "doNotExpandShiftReturn", "doNotLeaveBackslashAlone", "doNotSnapToGridInCell", "doNotSuppressIndentation", "doNotSuppressParagraphBorders", "doNotUseEastAsianBreakRules", "doNotUseHTMLParagraphAutoSpacing", "doNotUseIndentAsNumberingTabStop", "doNotVertAlignCellWithSp", "doNotVertAlignInTxbx", "doNotWrapTextWithPunct", "footnoteLayoutLikeWW8", "forgetLastTabAlignment", "growAutofit", "layoutRawTableWidth", "layoutTableRowsApart", "lineWrapLikeWord6", "mwSmallCaps", "noColumnBalance", "noExtraLineSpacing", "noLeading", "noSpaceRaiseLower", "noTabHangInd", "printBodyTextBeforeHeader", "printColBlack", "selectFldWithFirstOrLastChar", "shapeLayoutLikeWW8", "showBreaksInFrames", "spaceForUL", "spacingInWholePoints", "splitPgBreakAndParaMark", "subFontBySize", "suppressBottomSpacing", "suppressSpacingAtTopOfPage", "suppressSpBfAfterPgBrk", "suppressTopSpacing", "suppressTopSpacingWP", "swapBordersFacingPages", "truncateFontHeightsLikeWP6", "ulTrailSpace", "underlineTabInNumList", "useAltKinsokuLineBreakRules", "useAnsiKerningPairs", "useFELayout", "useNormalStyleForList", "usePrinterMetrics", "useSingleBorderforContiguousCells", "useWord2002TableStyleRules", "useWord97LineBreakRules", "wpJustification", "wpSpaceWidth", "wrapTrailSpaces", "compatSetting", "name", "comments", "inkAnnotations", "insDel", "markup", "pos", "numFmt", "numStart", "numRestart", "footnote", "endnote", "bidi", "eastAsia");

    public static void zzE(zzZXT zzzxt) throws Exception {
        zzZW1 zzzw1ZzNJ = zzzxt.zzNJ(zzzxt.zzZmp().zzZkQ());
        if (zzzw1ZzNJ == null) {
            return;
        }
        DocumentBase document = zzzxt.getDocument();
        zzZZF zzzzfZzZpV = document.zzZpV();
        ViewOptions viewOptions = zzzzfZzZpV.zzYVf;
        CompatibilityOptions compatibilityOptions = zzzzfZzZpV.zzYVg;
        HyphenationOptions hyphenationOptions = zzzzfZzZpV.zzYW3;
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        zzzzfZzZpV.zzYVN = true;
        viewOptions.setViewType(1);
        while (zzzw1ZzNJ.zzQ("settings")) {
            switch (zzUR.zzTP(zzzw1ZzNJ.getLocalName())) {
                case 0:
                    zzzzfZzZpV.zzYVa = zzzw1ZzNJ.zzYyD();
                    break;
                case 1:
                    zzZ(zzzw1ZzNJ, zzzzfZzZpV, zzzxt.zzZqn());
                    break;
                case 2:
                    zzzzfZzZpV.zzYVn = zzzw1ZzNJ.zzYyD();
                    break;
                case 3:
                    zzzzfZzZpV.zzYVr = zzzw1ZzNJ.zzYyD();
                    break;
                case 4:
                    zzzzfZzZpV.zzYW6.zzWt(zzzw1ZzNJ.zzYyD());
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    zzYUI.zzZ(zzzxt, zzzzfZzZpV);
                    break;
                case 9:
                    zzzzfZzZpV.zzYVW = zzzw1ZzNJ.zzYyE();
                    break;
                case 10:
                    zzzzfZzZpV.zzYWx = zzzw1ZzNJ.zzYyD();
                    break;
                case 11:
                    zzzzfZzZpV.zzYWA = zzzw1ZzNJ.zzYyD();
                    break;
                case 12:
                    zzzzfZzZpV.zzYWB = zzzw1ZzNJ.zzYyD();
                    break;
                case 13:
                    zzzzfZzZpV.zzYWC = zzzw1ZzNJ.zzYyD();
                    break;
                case 14:
                    zzzzfZzZpV.zzYW0 = zzzw1ZzNJ.zzYyD();
                    break;
                case 15:
                    zzzzfZzZpV.zzYW2 = zzzw1ZzNJ.zzYyD();
                    break;
                case 16:
                    zzzzfZzZpV.zzYVw = !zzzw1ZzNJ.zzYyD();
                    break;
                case 17:
                    zzzzfZzZpV.zzYVv = zzzw1ZzNJ.zzYyD();
                    break;
                case 18:
                    zzzzfZzZpV.zzYVu = zzzw1ZzNJ.zzYyD();
                    break;
                case 19:
                    zzzzfZzZpV.zzYVt = zzzw1ZzNJ.zzYyD();
                    break;
                case 20:
                    zzzzfZzZpV.zzYVs = zzzw1ZzNJ.zzYyD();
                    break;
                case 21:
                    zzzzfZzZpV.zzYVp = zzzw1ZzNJ.zzYyD();
                    break;
                case 22:
                    zzzzfZzZpV.zzYVo = zzzxt.zzY9(zzzw1ZzNJ.zzV("id", null));
                    break;
                case 23:
                    viewOptions.setViewType(zzZXQ.zzNA(zzzw1ZzNJ.zzV("val", null)));
                    break;
                case 24:
                    zzZ(zzzw1ZzNJ, viewOptions);
                    break;
                case 25:
                    viewOptions.setDoNotDisplayPageBoundaries(zzzw1ZzNJ.zzYyD());
                    break;
                case 26:
                    viewOptions.setDisplayBackgroundShape(zzzw1ZzNJ.zzYyD());
                    break;
                case 27:
                    zzzzfZzZpV.zzYWz = zzzw1ZzNJ.zzYyD();
                    break;
                case 28:
                    zzzzfZzZpV.zzYWy = zzzw1ZzNJ.zzYyD();
                    break;
                case 29:
                    zzzzfZzZpV.zzYWw = zzzw1ZzNJ.zzYyD();
                    break;
                case 30:
                    zzzzfZzZpV.zzYWv = zzzw1ZzNJ.zzYyD();
                    break;
                case 31:
                    zzzzfZzZpV.zzYWu = zzzw1ZzNJ.zzYyD();
                    break;
                case 32:
                    zzzzfZzZpV.zzYWt = zzzw1ZzNJ.zzYyD();
                    break;
                case 33:
                    zzzzfZzZpV.zzYWs = zzzw1ZzNJ.zzYyD();
                    break;
                case 34:
                    zzzzfZzZpV.zzYVq = zzzw1ZzNJ.zzYyD();
                    break;
                case 35:
                    zzzzfZzZpV.zzYVm = zzzw1ZzNJ.zzYyD();
                    break;
                case 36:
                    zzzzfZzZpV.zzYWr = zzzw1ZzNJ.zzYyD();
                    break;
                case 37:
                    zzX(zzzw1ZzNJ, zzzzfZzZpV);
                    break;
                case 38:
                    viewOptions.setFormsDesign(zzzw1ZzNJ.zzYyD());
                    break;
                case 39:
                    zzzzfZzZpV.zzYWn = zzzxt.zzY9(zzzw1ZzNJ.zzV("id", null));
                    break;
                case 40:
                    zzzzfZzZpV.zzYWm = zzzw1ZzNJ.zzYyD();
                    break;
                case 41:
                    zzzzfZzZpV.zzYWe = zzZXQ.zzNy(zzzw1ZzNJ.zzV("val", null));
                    break;
                case 42:
                    zzZWW.zzZkY().zzZ(zzzxt, zzzzfZzZpV.zzYWd);
                    break;
                case 43:
                    zzZ(zzzw1ZzNJ, zzzzfZzZpV.zzYVd, zzyo3ZzZqn);
                    break;
                case 44:
                    zzzzfZzZpV.zzYWl = zzzw1ZzNJ.zzYyD();
                    break;
                case 45:
                    zzzzfZzZpV.zzYWk = zzzw1ZzNJ.zzYyD();
                    break;
                case 46:
                    String strZzV = zzzw1ZzNJ.zzV("val", null);
                    if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
                        zzzzfZzZpV.zzYWj.zzkD(zzYU3.zzGU(strZzV));
                    }
                    zzY8L zzy8l = new zzY8L(zzzzfZzZpV.zzYWj.zzY2B());
                    zzzzfZzZpV.zzYWj = zzy8l;
                    zzZ(zzzw1ZzNJ, zzy8l, zzzw1ZzNJ.zzZqn());
                    break;
                case 47:
                    zzzzfZzZpV.zzYWi = zzZXQ.zzY(zzzw1ZzNJ.zzV("val", null), zzzxt.zzZqn());
                    break;
                case 48:
                    zzzzfZzZpV.zzYWc = zzzw1ZzNJ.zzYyD();
                    break;
                case 49:
                    zzzzfZzZpV.zzYWf = zzzw1ZzNJ.zzYyD();
                    break;
                case 50:
                    zzzzfZzZpV.zzYWg = zzzw1ZzNJ.zzYyD();
                    break;
                case 51:
                    zzZ(zzzw1ZzNJ, zzzzfZzZpV.zzYW6, zzzxt.zzZqn());
                    break;
                case 52:
                    zzzzfZzZpV.zzYW4 = zzzw1ZzNJ.zzV(zzyo3ZzZqn);
                    break;
                case 53:
                    hyphenationOptions.setAutoHyphenation(zzzw1ZzNJ.zzYyD());
                    break;
                case 54:
                    hyphenationOptions.zzyw(zzzw1ZzNJ.zzYyE());
                    break;
                case 55:
                    hyphenationOptions.zzyv(zzzw1ZzNJ.zzV(zzyo3ZzZqn));
                    break;
                case 56:
                    hyphenationOptions.setHyphenateCaps(!zzzw1ZzNJ.zzYyD());
                    break;
                case 57:
                    zzzzfZzZpV.zzYVX = zzzw1ZzNJ.zzYyD();
                    break;
                case 58:
                    zzzzfZzZpV.zzYVV = zzzw1ZzNJ.zzV(zzyo3ZzZqn);
                    break;
                case 59:
                    zzzzfZzZpV.zzYVU = zzzw1ZzNJ.zzV(zzyo3ZzZqn);
                    break;
                case 60:
                    zzzzfZzZpV.zzYVT = zzzw1ZzNJ.zzYyE();
                    break;
                case 61:
                    zzzzfZzZpV.zzYVS = zzzw1ZzNJ.zzYyE();
                    break;
                case 62:
                    zzzzfZzZpV.zzYVR = !zzzw1ZzNJ.zzYyD();
                    break;
                case 63:
                    zzzzfZzZpV.zzYVQ = zzzw1ZzNJ.zzV(zzyo3ZzZqn);
                    break;
                case 64:
                    zzzzfZzZpV.zzYVP = zzzw1ZzNJ.zzV(zzyo3ZzZqn);
                    break;
                case 65:
                    zzzzfZzZpV.zzYVO = zzzw1ZzNJ.zzYyD();
                    break;
                case 66:
                    zzzzfZzZpV.zzYVN = !zzzw1ZzNJ.zzYyD();
                    break;
                case 67:
                    zzzzfZzZpV.zzYVM = zzZXQ.zzNC(zzzw1ZzNJ.zzV("val", null));
                    break;
                case 68:
                    zzzzfZzZpV.zzYVL = zzzw1ZzNJ.zzYyD();
                    break;
                case 69:
                    zzzzfZzZpV.zzYVJ = zzZ(zzzw1ZzNJ, zzzzfZzZpV);
                    break;
                case 70:
                    zzzzfZzZpV.zzYVI = zzZ(zzzw1ZzNJ, zzzzfZzZpV);
                    break;
                case 71:
                case 72:
                    zzZ(zzzxt, zzzw1ZzNJ.getLocalName(), zzzzfZzZpV.zzYVh);
                    break;
                case 73:
                    zzZ(zzzw1ZzNJ, compatibilityOptions, zzzxt.zzZqn());
                    break;
                case 74:
                    zzZ(zzzw1ZzNJ, document.getVariables());
                    break;
                case 75:
                    compatibilityOptions.setUICompat97To2003(zzzw1ZzNJ.zzYyD());
                    break;
                case 76:
                    zzW(zzzw1ZzNJ, zzzzfZzZpV);
                    break;
                case 77:
                    zzZ(zzzw1ZzNJ, zzzzfZzZpV.zzYVe);
                    break;
                case 78:
                    zzzw1ZzNJ.zzYyH();
                    break;
                case 79:
                    zzzzfZzZpV.zzYVb.add(zzzw1ZzNJ.zzV("val", null), null);
                    break;
                case 80:
                    zzY(zzzw1ZzNJ, zzzzfZzZpV);
                    break;
                case 81:
                    zzzzfZzZpV.zzYV9 = zzzw1ZzNJ.zzYyD();
                    break;
                case 82:
                    zzzzfZzZpV.zzYV8 = zzzw1ZzNJ.zzYyD();
                    break;
                case 83:
                case 84:
                    zzYUG.zzZ(zzzw1ZzNJ, zzzxt.zzXUj);
                    break;
                case 85:
                case 86:
                    zzzw1ZzNJ.zzYyH();
                    break;
                case 87:
                    zzzw1ZzNJ.zzYyH();
                    break;
                case 88:
                    zzzxt.zzXUe = zzzw1ZzNJ.zzV("val", null);
                    break;
                case 89:
                    zzzxt.zzXUd = zzzw1ZzNJ.zzV("val", null);
                    break;
                case 90:
                    zzzzfZzZpV.zzYV7 = zzzw1ZzNJ.zzYyD();
                    break;
                case 91:
                    zzzzfZzZpV.zzYV6 = zzzw1ZzNJ.zzYyD();
                    break;
                case 92:
                    zzzzfZzZpV.zzYV5 = zzzw1ZzNJ.zzYyD();
                    break;
                case 93:
                    zzyo3ZzZqn.zzYr6();
                    zzzzfZzZpV.zzYV4 = zzzw1ZzNJ.zzYyD();
                    break;
                case 94:
                    if (com.aspose.words.internal.zzZKN.equals(zzzw1ZzNJ.getNamespaceURI(), zzZX5.zz9(21, zzyo3ZzZqn.getCompliance() == 2))) {
                        zzyo3ZzZqn.zzYr6();
                        zzzzfZzZpV.zzYV3 = zzzw1ZzNJ.zzV("val", null);
                    } else if (!com.aspose.words.internal.zzZKN.equals(zzzw1ZzNJ.getNamespaceURI(), zzZX5.zz9(20, zzyo3ZzZqn.getCompliance() == 2))) {
                        zzzw1ZzNJ.zzk();
                    } else {
                        zzyo3ZzZqn.zzYr6();
                        zzzzfZzZpV.zzYV0 = zzzw1ZzNJ.zzV("val", null);
                    }
                    break;
                case 95:
                    zzyo3ZzZqn.zzYr6();
                    zzzzfZzZpV.zzYV2 = zzzw1ZzNJ.zzYyD();
                    break;
                case 96:
                    zzyo3ZzZqn.zzYr6();
                    zzzzfZzZpV.zzYV1 = zzzw1ZzNJ.zzYyE();
                    break;
                case 97:
                    zzYUI.zzV(zzzw1ZzNJ, zzzzfZzZpV);
                    break;
                default:
                    zzzw1ZzNJ.zzk();
                    break;
            }
        }
        zzzxt.zzZmi();
    }

    private static void zzW(zzYU4 zzyu4, zzZZF zzzzf) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP != 141) {
                switch (iZzTP) {
                    case 221:
                        zzzzf.zzYWa = zzyu4.zz8();
                        break;
                    case 222:
                        zzzzf.zzYW7 = zzyu4.zz8();
                        break;
                    case 223:
                        zzzzf.zzYW9 = zzyu4.zz8();
                        break;
                    case 224:
                        zzzzf.zzYWb = zzyu4.zz8();
                        break;
                    default:
                        zzyu4.zzZ(65536, 9, zzyu4.getLocalName());
                        break;
                }
            } else {
                zzzzf.zzYW8 = zzyu4.zz8();
            }
        }
    }

    private static void zzX(zzYU4 zzyu4, zzZZF zzzzf) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 137) {
                zzzzf.zzYWp = zzZXQ.zzNB(zzyu4.getValue());
            } else if (iZzTP != 138) {
                zzyu4.zzZ(65536, 9, zzyu4.getLocalName());
            } else {
                zzzzf.zzYWo = zzZXQ.zzNB(zzyu4.getValue());
            }
        }
    }

    private static byte[] zzX6(String str) {
        byte[] bArrZzX5 = com.aspose.words.internal.zzZYD.zzX5(str);
        if (bArrZzX5.length == 0) {
            return null;
        }
        return bArrZzX5;
    }

    private static void zzY(zzYU4 zzyu4, zzZZF zzzzf) {
        String value = null;
        String value2 = null;
        String value3 = null;
        String value4 = null;
        while (zzyu4.zzQ("schemaLibrary")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 115) {
                zzyu4.zzk();
            } else {
                while (zzyu4.zzi()) {
                    switch (zzUR.zzTP(zzyu4.getLocalName())) {
                        case 116:
                            value = zzyu4.getValue();
                            break;
                        case 117:
                            value2 = zzyu4.getValue();
                            break;
                        case 118:
                            value3 = zzyu4.getValue();
                            break;
                        case 119:
                            value4 = zzyu4.getValue();
                            break;
                        default:
                            zzyu4.zzZ(16777216, 9, zzyu4.getValue());
                            break;
                    }
                }
                zzzzf.zzYVc.zzZ(new zzXYU(value, value2, value3, value4));
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzY8L zzy8l, zzYO3 zzyo3) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 98:
                    zzy8l.zzQe(zzyu4.zz8());
                    break;
                case 99:
                    zzy8l.zzQ0(zzyu4.zz8());
                    break;
                case 100:
                    zzy8l.zzQ3(zzyu4.zz8());
                    break;
                case 101:
                    zzy8l.zzQd(zzyu4.zz8());
                    break;
                case 102:
                    zzy8l.zzQ5(zzyu4.zz8());
                    break;
                case 103:
                    zzy8l.zzQ6(zzyu4.zz8());
                    break;
                case 104:
                    zzy8l.zzQ7(zzyu4.zz8());
                    break;
                case 105:
                    zzy8l.zzQ4(zzyu4.zz8());
                    break;
                case 106:
                    zzy8l.zzQa(zzyu4.zz8());
                    break;
                case 107:
                    zzy8l.zzQc(zzyu4.zz8());
                    break;
                case 108:
                    zzy8l.zzQ9(zzyu4.zz8());
                    break;
                case 109:
                    zzy8l.zzQb(zzyu4.zz8());
                    break;
                case 110:
                    zzy8l.zzQ8(zzyu4.zz8());
                    break;
                case 111:
                    zzy8l.zzQ2(zzyu4.zz8());
                    break;
                case 112:
                    zzy8l.zzQ1(zzyu4.zz8());
                    break;
                default:
                    zzyu4.zzZ(16777216, 9, zzyu4.getValue());
                    continue;
            }
            zzyo3.zzYrc();
        }
    }

    private static String zzZ(zzYU4 zzyu4, zzZZF zzzzf) {
        String value = "";
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 113) {
                value = zzyu4.getValue();
            } else if (iZzTP != 114) {
                zzyu4.zzZ(16777216, 9, zzyu4.getValue());
            } else {
                zzzzf.zzYVK = com.aspose.words.internal.zzBM.zzYx(zzyu4.getValue());
            }
        }
        return value;
    }

    private static void zzZ(zzYU4 zzyu4, zzYZU zzyzu, zzYO3 zzyo3) {
        while (zzyu4.zzQ("mathPr")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 120:
                    zzyzu.zzur(zzZXQ.zzNw(zzyu4.zzV("val", null)));
                    break;
                case 121:
                    zzyzu.zzuq(zzZXQ.zzNv(zzyu4.zzV("val", null)));
                    break;
                case 122:
                    zzyzu.zzup(zzZXP.zzNb(zzyu4.zzV("val", null)));
                    break;
                case 123:
                    zzyzu.zzSR(zzyu4.zzYyD());
                    break;
                case 124:
                    zzyzu.zzuo(zzyu4.zzV(zzyo3));
                    break;
                case 125:
                    zzyzu.zzum(zzZXP.zzN4(zzyu4.zzV("val", null)));
                    break;
                case 126:
                    zzyzu.zzun(zzyu4.zzV(zzyo3));
                    break;
                case 127:
                    zzyzu.zzHj(zzyu4.zzV(zzyo3));
                    break;
                case 128:
                    zzyzu.zzIk(zzyu4.zzV("val", null));
                    break;
                case 129:
                    zzyzu.zzul(zzZXP.zzN4(zzyu4.zzV("val", null)));
                    break;
                case 130:
                    zzyzu.zzuk(zzyu4.zzV(zzyo3));
                    break;
                case 131:
                    zzyzu.zzuj(zzyu4.zzV(zzyo3));
                    break;
                case 132:
                    zzyzu.zzHi(zzyu4.zzV(zzyo3));
                    break;
                case 133:
                    zzyzu.zzSQ(zzyu4.zzYyD());
                    break;
                case 134:
                    zzyzu.zzui(zzyu4.zzV(zzyo3));
                    break;
                case 135:
                    zzyzu.zzSP(zzyu4.zzYyD());
                    break;
                default:
                    zzyu4.zzk();
                    break;
            }
        }
    }

    private static void zzZ(zzZW1 zzzw1, ViewOptions viewOptions) {
        while (zzzw1.zzi()) {
            int iZzTP = zzUR.zzTP(zzzw1.getLocalName());
            if (iZzTP == 113) {
                viewOptions.setZoomType(zzZXQ.zzNz(zzzw1.getValue()));
            } else if (iZzTP != 136) {
                zzzw1.zzZ(65536, 9, zzzw1.getLocalName());
            } else {
                viewOptions.setZoomPercent(zzYU4.zzQ(zzzw1.getValue(), zzzw1.zzZqn()));
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzZZF zzzzf, zzYO3 zzyo3) {
        while (zzyu4.zzi()) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 139) {
                zzZ(zzyu4, zzzzf.zzYW5.zzZo8(), zzyo3);
            } else {
                zzzzf.zzYW5.setReadOnlyRecommended(zzyu4.zz8());
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzZYR zzzyr, zzYO3 zzyo3) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 140:
                    zzzyr.zzFG(zzZXQ.zzND(zzyu4.getValue()));
                    break;
                case 141:
                    zzzyr.zzXG(zzyu4.zz8());
                    break;
                case 142:
                    zzzyr.zzWv(zzyu4.zz8());
                    break;
                default:
                    zzZ(zzyu4, zzzyr.zzZo8(), zzyo3);
                    break;
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzYMB zzymb, zzYO3 zzyo3) {
        switch (zzUR.zzTP(zzyu4.getLocalName())) {
            case 143:
            case 144:
            case 145:
                break;
            case 146:
                zzymb.zzXFy = zzyu4.zzb();
                break;
            case 147:
                zzyo3.zzYrc();
                zzymb.zzXFy = zzYMB.zzCX(zzyu4.getValue());
                break;
            case 148:
                zzymb.zzXFx = zzyu4.zzb();
                break;
            case 149:
                zzyo3.zzYrc();
                zzymb.zzXFx = zzyu4.zzb();
                break;
            case 150:
                zzymb.zzXFz = zzX6(zzyu4.getValue());
                break;
            case 151:
                zzyo3.zzYrc();
                zzymb.zzXFz = zzX6(zzyu4.getValue());
                break;
            case 152:
                zzymb.zzYL3 = zzX6(zzyu4.getValue());
                break;
            case 153:
                zzyo3.zzYrc();
                zzymb.zzYL3 = zzX6(zzyu4.getValue());
                break;
            default:
                zzyu4.zzZ(16777216, 9, zzyu4.getLocalName());
                break;
        }
    }

    private static void zzZ(zzYU4 zzyu4, CompatibilityOptions compatibilityOptions, zzYO3 zzyo3) {
        while (zzyu4.zzQ("compat")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 154:
                    compatibilityOptions.setAdjustLineHeightInTable(zzyu4.zzYyD());
                    break;
                case 155:
                    compatibilityOptions.setAlignTablesRowByRow(zzyu4.zzYyD());
                    break;
                case 156:
                    compatibilityOptions.setAllowSpaceOfSameStyleInTable(zzyu4.zzYyD());
                    break;
                case 157:
                    compatibilityOptions.setApplyBreakingRules(zzyu4.zzYyD());
                    break;
                case 158:
                    compatibilityOptions.setAutofitToFirstFixedWidthCell(zzyu4.zzYyD());
                    break;
                case 159:
                    compatibilityOptions.setAutoSpaceLikeWord95(zzyu4.zzYyD());
                    break;
                case 160:
                    compatibilityOptions.setBalanceSingleByteDoubleByteWidth(zzyu4.zzYyD());
                    break;
                case 161:
                    compatibilityOptions.setCachedColBalance(zzyu4.zzYyD());
                    break;
                case 162:
                    compatibilityOptions.setConvMailMergeEsc(zzyu4.zzYyD());
                    break;
                case 163:
                    compatibilityOptions.setDisplayHangulFixedWidth(zzyu4.zzYyD());
                    break;
                case 164:
                    compatibilityOptions.setDoNotAutofitConstrainedTables(zzyu4.zzYyD());
                    break;
                case 165:
                    compatibilityOptions.setDoNotBreakConstrainedForcedTable(zzyu4.zzYyD());
                    break;
                case 166:
                    compatibilityOptions.setDoNotBreakWrappedTables(zzyu4.zzYyD());
                    break;
                case 167:
                    compatibilityOptions.setDoNotExpandShiftReturn(zzyu4.zzYyD());
                    break;
                case 168:
                    compatibilityOptions.setDoNotLeaveBackslashAlone(zzyu4.zzYyD());
                    break;
                case 169:
                    compatibilityOptions.setDoNotSnapToGridInCell(zzyu4.zzYyD());
                    break;
                case 170:
                    compatibilityOptions.setDoNotSuppressIndentation(zzyu4.zzYyD());
                    break;
                case 171:
                    compatibilityOptions.setDoNotSuppressParagraphBorders(zzyu4.zzYyD());
                    break;
                case 172:
                    compatibilityOptions.setDoNotUseEastAsianBreakRules(zzyu4.zzYyD());
                    break;
                case 173:
                    compatibilityOptions.setDoNotUseHTMLParagraphAutoSpacing(zzyu4.zzYyD());
                    break;
                case 174:
                    compatibilityOptions.setDoNotUseIndentAsNumberingTabStop(zzyu4.zzYyD());
                    break;
                case 175:
                    compatibilityOptions.setDoNotVertAlignCellWithSp(zzyu4.zzYyD());
                    break;
                case 176:
                    compatibilityOptions.setDoNotVertAlignInTxbx(zzyu4.zzYyD());
                    break;
                case 177:
                    compatibilityOptions.setDoNotWrapTextWithPunct(zzyu4.zzYyD());
                    break;
                case 178:
                    compatibilityOptions.setFootnoteLayoutLikeWW8(zzyu4.zzYyD());
                    break;
                case 179:
                    compatibilityOptions.setForgetLastTabAlignment(zzyu4.zzYyD());
                    break;
                case 180:
                    compatibilityOptions.setGrowAutofit(zzyu4.zzYyD());
                    break;
                case 181:
                    compatibilityOptions.setLayoutRawTableWidth(zzyu4.zzYyD());
                    break;
                case 182:
                    compatibilityOptions.setLayoutTableRowsApart(zzyu4.zzYyD());
                    break;
                case 183:
                    compatibilityOptions.setLineWrapLikeWord6(zzyu4.zzYyD());
                    break;
                case 184:
                    compatibilityOptions.setMWSmallCaps(zzyu4.zzYyD());
                    break;
                case 185:
                    compatibilityOptions.setNoColumnBalance(zzyu4.zzYyD());
                    break;
                case 186:
                    compatibilityOptions.setNoExtraLineSpacing(zzyu4.zzYyD());
                    break;
                case 187:
                    compatibilityOptions.setNoLeading(zzyu4.zzYyD());
                    break;
                case 188:
                    compatibilityOptions.setNoSpaceRaiseLower(zzyu4.zzYyD());
                    break;
                case 189:
                    compatibilityOptions.setNoTabHangInd(zzyu4.zzYyD());
                    break;
                case 190:
                    compatibilityOptions.setPrintBodyTextBeforeHeader(zzyu4.zzYyD());
                    break;
                case 191:
                    compatibilityOptions.setPrintColBlack(zzyu4.zzYyD());
                    break;
                case 192:
                    compatibilityOptions.setSelectFldWithFirstOrLastChar(zzyu4.zzYyD());
                    break;
                case 193:
                    compatibilityOptions.setShapeLayoutLikeWW8(zzyu4.zzYyD());
                    break;
                case 194:
                    compatibilityOptions.setShowBreaksInFrames(zzyu4.zzYyD());
                    break;
                case 195:
                    compatibilityOptions.setSpaceForUL(zzyu4.zzYyD());
                    break;
                case 196:
                    compatibilityOptions.setSpacingInWholePoints(zzyu4.zzYyD());
                    break;
                case 197:
                    compatibilityOptions.setSplitPgBreakAndParaMark(zzyu4.zzYyD());
                    break;
                case 198:
                    compatibilityOptions.setSubFontBySize(zzyu4.zzYyD());
                    break;
                case 199:
                    compatibilityOptions.setSuppressBottomSpacing(zzyu4.zzYyD());
                    break;
                case 200:
                    compatibilityOptions.setSuppressSpacingAtTopOfPage(zzyu4.zzYyD());
                    break;
                case 201:
                    compatibilityOptions.setSuppressSpBfAfterPgBrk(zzyu4.zzYyD());
                    break;
                case 202:
                    compatibilityOptions.setSuppressTopSpacing(zzyu4.zzYyD());
                    break;
                case 203:
                    compatibilityOptions.setSuppressTopSpacingWP(zzyu4.zzYyD());
                    break;
                case 204:
                    compatibilityOptions.setSwapBordersFacingPgs(zzyu4.zzYyD());
                    break;
                case 205:
                    compatibilityOptions.setTruncateFontHeightsLikeWP6(zzyu4.zzYyD());
                    break;
                case 206:
                    compatibilityOptions.setUlTrailSpace(zzyu4.zzYyD());
                    break;
                case 207:
                    compatibilityOptions.setUnderlineTabInNumList(zzyu4.zzYyD());
                    break;
                case 208:
                    compatibilityOptions.setUseAltKinsokuLineBreakRules(zzyu4.zzYyD());
                    break;
                case 209:
                    compatibilityOptions.setUseAnsiKerningPairs(zzyu4.zzYyD());
                    break;
                case 210:
                    compatibilityOptions.setUseFELayout(zzyu4.zzYyD());
                    break;
                case 211:
                    compatibilityOptions.setUseNormalStyleForList(zzyu4.zzYyD());
                    break;
                case 212:
                    compatibilityOptions.setUsePrinterMetrics(zzyu4.zzYyD());
                    break;
                case 213:
                    compatibilityOptions.setUseSingleBorderforContiguousCells(zzyu4.zzYyD());
                    break;
                case 214:
                    compatibilityOptions.setUseWord2002TableStyleRules(zzyu4.zzYyD());
                    break;
                case 215:
                    compatibilityOptions.setUseWord97LineBreakRules(zzyu4.zzYyD());
                    break;
                case 216:
                    compatibilityOptions.setWPJustification(zzyu4.zzYyD());
                    break;
                case 217:
                    compatibilityOptions.setWPSpaceWidth(zzyu4.zzYyD());
                    break;
                case 218:
                    compatibilityOptions.setWrapTrailSpaces(zzyu4.zzYyD());
                    break;
                case 219:
                    zzZ(compatibilityOptions, zzyu4, zzyo3);
                    break;
                default:
                    zzyu4.zzk();
                    break;
            }
        }
    }

    private static void zzZ(CompatibilityOptions compatibilityOptions, zzYU4 zzyu4, zzYO3 zzyo3) {
        String value = "";
        String value2 = "";
        String value3 = value2;
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 113) {
                value2 = zzyu4.getValue();
            } else if (iZzTP == 116) {
                value3 = zzyu4.getValue();
            } else if (iZzTP != 220) {
                zzyu4.zzZ(65536, 9, zzyu4.getLocalName());
            } else {
                value = zzyu4.getValue();
            }
        }
        zzyo3.zzYrc();
        if ("compatibilityMode".equals(value)) {
            compatibilityOptions.setMswVersion(zzYO3.zzD2(value2));
        }
        compatibilityOptions.zzZYT().zzZ(new zzKR(value, value3, value2));
    }

    private static void zzZ(zzYU4 zzyu4, VariableCollection variableCollection) {
        while (zzyu4.zzQ("docVars")) {
            if (!"docVar".equals(zzyu4.getLocalName())) {
                if ("docVars".equals(zzyu4.getLocalName())) {
                    zzZ(zzyu4, variableCollection);
                } else {
                    zzyu4.zzk();
                }
            } else {
                String value = null;
                String strReplace = null;
                while (zzyu4.zzi()) {
                    int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
                    if (iZzTP == 113) {
                        strReplace = zzyu4.getValue().replace("_x000d_", "\r").replace("_x000D_", "\r").replace("_x000b_", "\u000b").replace("_x000B_", "\u000b");
                    } else if (iZzTP != 220) {
                        zzyu4.zzZ(65536, 9, zzyu4.getLocalName());
                    } else {
                        value = zzyu4.getValue();
                    }
                }
                if (value != null) {
                    variableCollection.add(value, strReplace);
                }
            }
        }
    }

    public static void zzZ(zzZXT zzzxt, String str, zzZS zzzs) {
        Integer numValueOf;
        String strZzZkH;
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        boolean zEquals = "endnotePr".equals(str);
        int i = zEquals ? 100 : 0;
        while (zzyu4ZzZsD.zzQ(str)) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 225:
                    int i2 = i + 2500;
                    if (zEquals) {
                        numValueOf = Integer.valueOf(zzYUL.zzHa(zzyu4ZzZsD.zzV("val", null)));
                    } else {
                        numValueOf = Integer.valueOf(zzYUL.zzHb(zzyu4ZzZsD.zzV("val", null)));
                    }
                    zzzs.zzQ(i2, numValueOf);
                    break;
                case 226:
                    zzzs.zzQ(i + 2530, Integer.valueOf(zzZXP.zzNm(zzyu4ZzZsD.zzV("val", null))));
                    break;
                case 227:
                    zzzs.zzQ(i + 2520, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                    break;
                case 228:
                    zzzs.zzQ(i + 2510, Integer.valueOf(zzYUL.zzHd(zzyu4ZzZsD.zzV("val", null))));
                    break;
                case 229:
                case 230:
                    if ("footnote".equals(zzyu4ZzZsD.getLocalName())) {
                        strZzZkH = zzzxt.zzZmp().zzZkI();
                    } else {
                        strZzZkH = zzzxt.zzZmp().zzZkH();
                    }
                    if (zzzxt.zzZ(zzzxt.zzZme(), strZzZkH) == null) {
                        zzzxt.zzZ(16777216, 9, "Footnote/endnote document part is missing.");
                    }
                    zzyu4ZzZsD.zzYyH();
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzY5H zzy5h) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 113) {
                zzy5h.zzX34 = com.aspose.words.internal.zzBM.zzYx(zzyu4.getValue());
            } else if (iZzTP == 231) {
                zzy5h.zzX32 = com.aspose.words.internal.zzBM.zzYx(zzyu4.getValue());
            } else if (iZzTP != 232) {
                zzyu4.zzZ(65536, 9, zzyu4.getLocalName());
            } else {
                zzy5h.zzX33 = com.aspose.words.internal.zzBM.zzYx(zzyu4.getValue());
            }
        }
    }
}
