package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1N {
    public static void zzZ(zzY0P zzy0p) throws Exception {
        Document document = (Document) zzy0p.getDocument();
        zzZZF zzzzfZzZpV = document.zzZpV();
        zzYU6 zzyu6ZzZm2 = zzy0p.zzZm2();
        zzyu6ZzZm2.zzY("w:docPr");
        zzyu6ZzZm2.zzYz("w:view", zzY1L.zzi2(document.getViewOptions().getViewType()));
        zzZ(document.getViewOptions(), zzyu6ZzZm2);
        zzyu6ZzZm2.zze("w:hideSpellingErrors", zzzzfZzZpV.zzYV9);
        zzyu6ZzZm2.zze("w:hideGrammaticalErrors", zzzzfZzZpV.zzYV8);
        zzyu6ZzZm2.zze("w:removePersonalInformation", zzzzfZzZpV.zzYWC);
        zzyu6ZzZm2.zze("w:dontDisplayPageBoundaries", document.getViewOptions().getDoNotDisplayPageBoundaries());
        zzyu6ZzZm2.zze("w:displayBackgroundShape", document.getViewOptions().getDisplayBackgroundShape());
        zzyu6ZzZm2.zze("w:printFormsData", zzzzfZzZpV.zzYWz);
        zzyu6ZzZm2.zze("w:embedTrueTypeFonts", zzzzfZzZpV.zzYWy);
        zzyu6ZzZm2.zze("w:saveSubsetFonts", zzzzfZzZpV.zzYWw);
        zzyu6ZzZm2.zze("w:saveFormsData", zzzzfZzZpV.zzYWv);
        zzyu6ZzZm2.zze("w:mirrorMargins", zzzzfZzZpV.zzYWh == 1);
        zzyu6ZzZm2.zze("w:alignBordersAndEdges", zzzzfZzZpV.zzYWu);
        zzyu6ZzZm2.zze("w:bordersDontSurroundHeader", zzzzfZzZpV.zzYWt);
        zzyu6ZzZm2.zze("w:bordersDontSurroundFooter", zzzzfZzZpV.zzYWs);
        zzyu6ZzZm2.zze("w:gutterAtTop", zzzzfZzZpV.zzYWr);
        zzZ(zzzzfZzZpV, zzyu6ZzZm2);
        zzyu6ZzZm2.zze("w:formsDesign", document.getViewOptions().getFormsDesign());
        zzyu6ZzZm2.zzYy("w:attachedTemplate", zzzzfZzZpV.zzYWn);
        zzyu6ZzZm2.zzYz("w:documentType", zzY1L.zzi0(zzzzfZzZpV.zzYWe));
        if (zzzzfZzZpV.zzYWj.zzY2B() != 20516) {
            zzyu6ZzZm2.zzYz("w:stylePaneFormatFilter", com.aspose.words.internal.zzJB.zzWu(zzzzfZzZpV.zzYWj.zzY2B()));
        }
        new zzY17().zzZ(zzzzfZzZpV.zzYWd, zzy0p);
        zzyu6ZzZm2.zze("w:trackRevisions", zzzzfZzZpV.zzYWc);
        zzZ(zzzzfZzZpV.zzYW6, zzyu6ZzZm2);
        zzyu6ZzZm2.zzZl("w:defaultTabStop", zzzzfZzZpV.zzYW4);
        int i = zzzzfZzZpV.zzYVZ;
        if (i != 0 && document.getStyles().zzZ8(i, false) != null) {
            zzyu6ZzZm2.zzYz("w:clickAndTypeStyle", zzy0p.zzXSf().zzFs(i));
        }
        int i2 = zzzzfZzZpV.zzYVY;
        if (i2 != 12287 && document.getStyles().zzZ8(i2, false) != null) {
            zzyu6ZzZm2.zzYz("w:defaultTableStyle", zzy0p.zzXSf().zzFs(i2));
        }
        HyphenationOptions hyphenationOptions = zzzzfZzZpV.zzYW3;
        zzyu6ZzZm2.zze("w:autoHyphenation", hyphenationOptions.getAutoHyphenation());
        zzyu6ZzZm2.zzZk("w:consecutiveHyphenLimit", hyphenationOptions.getConsecutiveHyphenLimit());
        zzyu6ZzZm2.zzv("w:hyphenationZone", hyphenationOptions.getHyphenationZone(), StyleIdentifier.LIST_TABLE_4_ACCENT_5);
        zzyu6ZzZm2.zze("w:doNotHyphenateCaps", !hyphenationOptions.getHyphenateCaps());
        zzyu6ZzZm2.zze("w:evenAndOddHeaders", zzzzfZzZpV.zzYVX);
        zzyu6ZzZm2.zzv("w:drawingGridHorizontalSpacing", zzzzfZzZpV.zzYVV, 180);
        zzyu6ZzZm2.zzv("w:drawingGridVerticalSpacing", zzzzfZzZpV.zzYVU, 180);
        zzyu6ZzZm2.zzv("w:displayHorizontalDrawingGridEvery", zzzzfZzZpV.zzYVT, 1);
        zzyu6ZzZm2.zzv("w:displayVerticalDrawingGridEvery", zzzzfZzZpV.zzYVS, 1);
        zzyu6ZzZm2.zze("w:useMarginsForDrawingGridOrigin", !zzzzfZzZpV.zzYVR);
        if (!zzzzfZzZpV.zzYVR) {
            zzyu6ZzZm2.zzv("w:drawingGridHorizontalOrigin", zzzzfZzZpV.zzYVQ, 1800);
            zzyu6ZzZm2.zzv("w:drawingGridVerticalOrigin", zzzzfZzZpV.zzYVP, 1440);
        }
        zzyu6ZzZm2.zze("w:doNotShadeFormData", zzzzfZzZpV.zzYVO);
        zzyu6ZzZm2.zze("w:punctuationKerning", zzzzfZzZpV.zzYVN);
        zzyu6ZzZm2.zzYz("w:characterSpacingControl", zzY1L.zzi4(zzzzfZzZpV.zzYVM));
        zzyu6ZzZm2.zze("w:printTwoOnOne", zzzzfZzZpV.zzYWh == 2);
        zzyu6ZzZm2.zze("w:strictFirstAndLastChars", zzzzfZzZpV.zzYVL);
        zzYVC.zzZ(zzzzfZzZpV, zzyu6ZzZm2, com.aspose.words.internal.zzBM.zzVm(zzzzfZzZpV.zzYVK));
        zzYUF.zzZ(zzyu6ZzZm2, zzy0p.zzZqS(), true);
        zzy0p.zzY(zzzzfZzZpV.zzYVh, true);
        zzyu6ZzZm2.zze("w:doNotEmbedSystemFonts", !zzzzfZzZpV.zzYWx);
        zzyu6ZzZm2.zze("w:showEnvelope", zzzzfZzZpV.zzYW2);
        zzyu6ZzZm2.zzy("w:validateAgainstSchema", zzzzfZzZpV.zzYVw);
        zzyu6ZzZm2.zze("w:saveInvalidXML", zzzzfZzZpV.zzYVv);
        zzyu6ZzZm2.zze("w:ignoreMixedContent", zzzzfZzZpV.zzYVs);
        zzyu6ZzZm2.zze("w:useXSLTWhenSaving", zzzzfZzZpV.zzYVp);
        if (com.aspose.words.internal.zzZYD.zzXk(zzzzfZzZpV.zzYVo)) {
            zzyu6ZzZm2.zzY("w:saveThroughXSLT");
            zzyu6ZzZm2.zzX("w:xslt", zzzzfZzZpV.zzYVo);
            zzyu6ZzZm2.zzp();
        }
        zzyu6ZzZm2.zze("w:optimizeForBrowser", zzzzfZzZpV.zzYVG);
        zzyu6ZzZm2.zze("w:relyOnVML", zzzzfZzZpV.zzYVE);
        zzyu6ZzZm2.zze("w:allowPNG", zzzzfZzZpV.zzYVD);
        zzyu6ZzZm2.zze("w:doNotRelyOnCSS", zzzzfZzZpV.zzYVC);
        zzyu6ZzZm2.zze("w:doNotSaveWebPagesAsSingleFile", zzzzfZzZpV.zzYVB);
        zzyu6ZzZm2.zze("w:doNotOrganizeInFolder", zzzzfZzZpV.zzYVA);
        zzyu6ZzZm2.zze("w:doNotUseLongFileNames", zzzzfZzZpV.zzYVz);
        int i3 = zzzzfZzZpV.zzYVy;
        if (i3 != 96) {
            zzyu6ZzZm2.zzZl("w:pixelsPerInch", i3);
        }
        int i4 = zzzzfZzZpV.zzYVx;
        if (i4 != 3) {
            zzyu6ZzZm2.zzYz("w:targetScreenSz", zzY8T.zzkP(i4));
        }
        zzyu6ZzZm2.zze("w:alwaysMergeEmptyNamespace", zzzzfZzZpV.zzYVn);
        zzyu6ZzZm2.zze("w:alwaysShowPlaceholderText", zzzzfZzZpV.zzYVr);
        zzyu6ZzZm2.zze("w:autoFormatOverride", zzzzfZzZpV.zzYW6.zzZoa());
        int i5 = zzzzfZzZpV.zzYWh;
        boolean z = i5 == 3;
        boolean z2 = i5 == 4;
        zzyu6ZzZm2.zze("w:bookFoldPrinting", z);
        zzyu6ZzZm2.zze("w:bookFoldRevPrinting", z2);
        if (z || z2) {
            zzyu6ZzZm2.zzZl("w:bookFoldPrintingSheets", zzzzfZzZpV.zzYVW);
        }
        zzyu6ZzZm2.zze("w:doNotUnderlineInvalidXML", zzzzfZzZpV.zzYVq);
        zzyu6ZzZm2.zze("w:linkStyles", zzzzfZzZpV.zzYWm);
        zzyu6ZzZm2.zze("w:printFractionalCharacterWidth", zzzzfZzZpV.zzYWA);
        zzyu6ZzZm2.zze("w:printPostScriptOverText", zzzzfZzZpV.zzYWB);
        zzZ(zzzzfZzZpV.zzYVg, zzyu6ZzZm2);
        if (zzy0p.zzXSf().zzXSI().zzYd6()) {
            zzYUH.zzZ(zzzzfZzZpV, zzyu6ZzZm2, 31);
        }
        zzZ(document.getVariables(), zzyu6ZzZm2);
        zzyu6ZzZm2.zzp();
    }

    private static void zzZ(ViewOptions viewOptions, zzYU6 zzyu6) {
        zzyu6.zzY("w:zoom");
        if (viewOptions.getZoomType() != 0) {
            zzyu6.zz0("w:val", zzY1L.zzi1(viewOptions.getZoomType()));
        }
        zzyu6.zzZj("w:percent", viewOptions.getZoomPercent());
        zzyu6.zzp();
    }

    private static void zzZ(zzZZF zzzzf, zzYU6 zzyu6) {
        zzyu6.zzX("w:proofState", "w:spelling", zzY1L.zzi3(zzzzf.zzYWp), "w:grammar", zzY1L.zzi3(zzzzf.zzYWo));
    }

    private static void zzZ(zzZYR zzzyr, zzYU6 zzyu6) {
        if (zzzyr.zzZoe() == -1) {
            return;
        }
        zzyu6.zzY("w:documentProtection");
        zzyu6.zz0("w:edit", zzY1L.zzi5(zzzyr.zzZoe()));
        zzyu6.zzw("w:formatting", zzzyr.zzZIN());
        zzyu6.zzw("w:enforcement", zzzyr.zzZod());
        zzyu6.zz0("w:unprotectPassword", zzYU3.zzsV(zzzyr.zzZo9()));
        zzyu6.zzp();
    }

    private static void zzZ(CompatibilityOptions compatibilityOptions, zzYU6 zzyu6) {
        zzyu6.zzY("w:compat");
        zzyu6.zze("w:origWordTableRules", compatibilityOptions.getUseSingleBorderforContiguousCells());
        zzyu6.zze("w:wpJustification", compatibilityOptions.getWPJustification());
        zzyu6.zze("w:noTabHangInd", compatibilityOptions.getNoTabHangInd());
        zzyu6.zze("w:noLeading", compatibilityOptions.getNoLeading());
        zzyu6.zze("w:spaceForUL", compatibilityOptions.getSpaceForUL());
        zzyu6.zze("w:noColumnBalance", compatibilityOptions.getNoColumnBalance());
        zzyu6.zze("w:balanceSingleByteDoubleByteWidth", compatibilityOptions.getBalanceSingleByteDoubleByteWidth());
        zzyu6.zze("w:transparentMetafiles", compatibilityOptions.getTransparentMetafiles());
        zzyu6.zze("w:noExtraLineSpacing", compatibilityOptions.getNoExtraLineSpacing());
        zzyu6.zze("w:doNotLeaveBackslashAlone", compatibilityOptions.getDoNotLeaveBackslashAlone());
        zzyu6.zze("w:ulTrailSpace", compatibilityOptions.getUlTrailSpace());
        zzyu6.zze("w:doNotExpandShiftReturn", compatibilityOptions.getDoNotExpandShiftReturn());
        zzyu6.zze("w:spacingInWholePoints", compatibilityOptions.getSpacingInWholePoints());
        zzyu6.zze("w:lineWrapLikeWord6", compatibilityOptions.getLineWrapLikeWord6());
        zzyu6.zze("w:printBodyTextBeforeHeader", compatibilityOptions.getPrintBodyTextBeforeHeader());
        zzyu6.zze("w:printColBlack", compatibilityOptions.getPrintColBlack());
        zzyu6.zze("w:wpSpaceWidth", compatibilityOptions.getWPSpaceWidth());
        zzyu6.zze("w:showBreaksInFrames", compatibilityOptions.getShowBreaksInFrames());
        zzyu6.zze("w:subFontBySize", compatibilityOptions.getSubFontBySize());
        zzyu6.zze("w:suppressBottomSpacing", compatibilityOptions.getSuppressBottomSpacing());
        zzyu6.zze("w:suppressTopSpacing", compatibilityOptions.getSuppressTopSpacing());
        zzyu6.zze("w:suppressTopSpacingMac5", compatibilityOptions.getSuppressSpacingAtTopOfPage());
        zzyu6.zze("w:suppressTopSpacingWP", compatibilityOptions.getSuppressTopSpacingWP());
        zzyu6.zze("w:suppressSpBfAfterPgBrk", compatibilityOptions.getSuppressSpBfAfterPgBrk());
        zzyu6.zze("w:swapBordersFacingPages", compatibilityOptions.getSwapBordersFacingPgs());
        zzyu6.zze("w:convMailMergeEsc", compatibilityOptions.getConvMailMergeEsc());
        zzyu6.zze("w:truncateFontHeight", compatibilityOptions.getTruncateFontHeightsLikeWP6());
        zzyu6.zze("w:mwSmallCaps", compatibilityOptions.getMWSmallCaps());
        zzyu6.zze("w:usePrinterMetrics", compatibilityOptions.getUsePrinterMetrics());
        zzyu6.zze("w:ww6BorderRules", compatibilityOptions.getDoNotSuppressParagraphBorders());
        zzyu6.zze("w:wrapTrailSpaces", compatibilityOptions.getWrapTrailSpaces());
        zzyu6.zze("w:footnoteLayoutLikeWW8", compatibilityOptions.getFootnoteLayoutLikeWW8());
        zzyu6.zze("w:shapeLayoutLikeWW8", compatibilityOptions.getShapeLayoutLikeWW8());
        zzyu6.zze("w:alignTablesRowByRow", compatibilityOptions.getAlignTablesRowByRow());
        zzyu6.zze("w:forgetLastTabAlignment", compatibilityOptions.getForgetLastTabAlignment());
        zzyu6.zze("w:adjustLineHeightInTable", compatibilityOptions.getAdjustLineHeightInTable());
        zzyu6.zze("w:autoSpaceLikeWord95", compatibilityOptions.getAutoSpaceLikeWord95());
        zzyu6.zze("w:noSpaceRaiseLower", compatibilityOptions.getNoSpaceRaiseLower());
        zzyu6.zze("w:doNotUseHTMLParagraphAutoSpacing", compatibilityOptions.getDoNotUseHTMLParagraphAutoSpacing());
        zzyu6.zze("w:layoutRawTableWidth", compatibilityOptions.getLayoutRawTableWidth());
        zzyu6.zze("w:layoutTableRowsApart", compatibilityOptions.getLayoutTableRowsApart());
        zzyu6.zze("w:useWord97LineBreakingRules", compatibilityOptions.getUseWord97LineBreakRules());
        zzyu6.zzy("w:breakWrappedTables", !compatibilityOptions.getDoNotBreakWrappedTables());
        zzyu6.zze("w:snapToGridInCell", !compatibilityOptions.getDoNotSnapToGridInCell());
        zzyu6.zze("w:dontAllowFieldEndSelect", compatibilityOptions.getSelectFldWithFirstOrLastChar());
        zzyu6.zze("w:applyBreakingRules", compatibilityOptions.getApplyBreakingRules());
        zzyu6.zze("w:wrapTextWithPunct", !compatibilityOptions.getDoNotWrapTextWithPunct());
        zzyu6.zze("w:useAsianBreakRules", !compatibilityOptions.getDoNotUseEastAsianBreakRules());
        zzyu6.zze("w:useWord2002TableStyleRules", compatibilityOptions.getUseWord2002TableStyleRules());
        zzyu6.zze("w:dontGrowAutofit", !compatibilityOptions.getGrowAutofit());
        zzyu6.zzp();
    }

    private static void zzZ(VariableCollection variableCollection, zzYU6 zzyu6) {
        if (variableCollection.getCount() > 0) {
            zzyu6.zzY("w:docVars");
            for (Map.Entry<String, String> entry : variableCollection) {
                zzyu6.zzX("w:docVar", "w:name", entry.getKey(), "w:val", entry.getValue());
            }
            zzyu6.zzp();
        }
    }
}
