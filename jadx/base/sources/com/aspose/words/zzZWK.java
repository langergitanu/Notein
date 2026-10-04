package com.aspose.words;

import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWK {
    private static void zzT(zzZXR zzzxr) {
        DocumentBase document = zzzxr.getDocument();
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzZZF zzzzfZzZpV = document.zzZpV();
        zzzydZzZlV.zze("w:embedTrueTypeFonts", zzzzfZzZpV.zzYWy);
        zzzydZzZlV.zze("w:embedSystemFonts", zzzzfZzZpV.zzYWx);
        zzzydZzZlV.zze("w:saveSubsetFonts", zzzzfZzZpV.zzYWw);
    }

    public static void zzU(zzZXR zzzxr) throws Exception {
        DocumentBase document = zzzxr.getDocument();
        zzZZF zzzzfZzZpV = document.zzZpV();
        ViewOptions viewOptions = zzzzfZzZpV.zzYVf;
        int compliance = zzzxr.getCompliance();
        boolean z = compliance != 0;
        zzZYD zzzydZzJ = zzzxr.zzJ("settings.xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.settings+xml", zzzxr.zzZmp().zzZkQ());
        zzzxr.zzY(zzzydZzJ);
        zzzydZzJ.zzZmW();
        zzzydZzJ.zze("w:hideSpellingErrors", zzzzfZzZpV.zzYV9);
        zzzydZzJ.zze("w:hideGrammaticalErrors", zzzzfZzZpV.zzYV8);
        zzZ(zzzzfZzZpV.zzYW5, zzzydZzJ);
        zzzydZzJ.zzYz("w:view", zzZXQ.zzFo(viewOptions.getViewType()));
        zzZ(viewOptions, zzzydZzJ, compliance);
        zzzydZzJ.zze("w:removePersonalInformation", zzzzfZzZpV.zzYWC);
        zzzydZzJ.zze("w:removeDateAndTime", zzzzfZzZpV.zzYW0);
        zzzydZzJ.zze("w:doNotDisplayPageBoundaries", viewOptions.getDoNotDisplayPageBoundaries());
        zzzydZzJ.zze("w:displayBackgroundShape", viewOptions.getDisplayBackgroundShape());
        zzzydZzJ.zze("w:printPostScriptOverText", zzzzfZzZpV.zzYWB);
        zzzydZzJ.zze("w:printFractionalCharacterWidth", zzzzfZzZpV.zzYWA);
        zzzydZzJ.zze("w:printFormsData", zzzzfZzZpV.zzYWz);
        zzT(zzzxr);
        zzzydZzJ.zze("w:saveFormsData", zzzzfZzZpV.zzYWv);
        zzzydZzJ.zze("w:mirrorMargins", zzzzfZzZpV.zzYWh == 1);
        zzzydZzJ.zze("w:alignBordersAndEdges", zzzzfZzZpV.zzYWu);
        zzzydZzJ.zze("w:bordersDoNotSurroundHeader", zzzzfZzZpV.zzYWt);
        zzzydZzJ.zze("w:bordersDoNotSurroundFooter", zzzzfZzZpV.zzYWs);
        zzzydZzJ.zze("w:gutterAtTop", zzzzfZzZpV.zzYWr);
        zzZ(zzzzfZzZpV, zzzydZzJ);
        zzzydZzJ.zze("w:formsDesign", viewOptions.getFormsDesign());
        zzZ(zzzydZzJ, "w:attachedTemplate", zzzzfZzZpV.zzYWn, zzzxr.zzZmp().getAttachedTemplate());
        zzzydZzJ.zze("w:linkStyles", zzzzfZzZpV.zzYWm);
        if (zzzzfZzZpV.zzYWj.zzY2B() != 20516) {
            zzzydZzJ.zzY("w:stylePaneFormatFilter");
            if (compliance < 2) {
                zzzydZzJ.zzX("w:val", com.aspose.words.internal.zzJB.zzWu(zzzzfZzZpV.zzYWj.zzY2B()));
            }
            if (z) {
                zzZ(zzzydZzJ, zzzzfZzZpV.zzYWj);
            }
            zzzydZzJ.zzp();
        }
        int i = zzzzfZzZpV.zzYWi;
        if (i != 2) {
            zzzydZzJ.zzYz("w:stylePaneSortMethod", !z ? com.aspose.words.internal.zzJB.zzWu(zzY8T.zzkM(i)) : zzZXQ.zzFn(i));
        }
        zzzydZzJ.zzYz("w:documentType", zzZXQ.zzFl(zzzzfZzZpV.zzYWe));
        new zzZX8().zzZ(zzzzfZzZpV.zzYWd, zzzxr);
        if (zzY(zzzzfZzZpV)) {
            zzzydZzJ.zzY("w:revisionView");
            zzzydZzJ.zzx("w:comments", zzzzfZzZpV.zzYWa);
            zzzydZzJ.zzx("w:formatting", zzzzfZzZpV.zzYW8);
            zzzydZzJ.zzx("w:inkAnnotations", zzzzfZzZpV.zzYW7);
            zzzydZzJ.zzx("w:insDel", zzzzfZzZpV.zzYW9);
            zzzydZzJ.zzx("w:markup", zzzzfZzZpV.zzYWb);
            zzzydZzJ.zzp();
        }
        zzzydZzJ.zze("w:trackRevisions", zzzzfZzZpV.zzYWc);
        zzzydZzJ.zze("w:doNotTrackMoves", zzzxr.zzZlS().zzYqZ() ? zzzzfZzZpV.zzYWf : true);
        zzzydZzJ.zze("w:doNotTrackFormatting", zzzzfZzZpV.zzYWg);
        zzZ(zzzzfZzZpV.zzYW6, zzzydZzJ);
        zzzydZzJ.zze("w:autoFormatOverride", zzzzfZzZpV.zzYW6.zzZoa());
        zzzydZzJ.zze("w:styleLockTheme", zzzzfZzZpV.zzYWk);
        zzzydZzJ.zze("w:styleLockQFSet", zzzzfZzZpV.zzYWl);
        zzzydZzJ.zzZl("w:defaultTabStop", zzzzfZzZpV.zzYW4);
        int i2 = zzzzfZzZpV.zzYVZ;
        if (i2 != 0 && document.getStyles().zzZ8(i2, false) != null) {
            zzzydZzJ.zzYz("w:clickAndTypeStyle", zzzxr.zzFs(i2));
        }
        int i3 = zzzzfZzZpV.zzYVY;
        if (i3 != 12287 && document.getStyles().zzZ8(i3, false) != null) {
            zzzydZzJ.zzYz("w:defaultTableStyle", zzzxr.zzFs(i3));
        }
        zzzydZzJ.zze("w:updateFields", zzzzfZzZpV.zzYV6);
        zzzydZzJ.zze("w:forceUpgrade", zzzzfZzZpV.zzYV5);
        HyphenationOptions hyphenationOptions = zzzzfZzZpV.zzYW3;
        zzzydZzJ.zze("w:autoHyphenation", hyphenationOptions.getAutoHyphenation());
        zzzydZzJ.zzZk("w:consecutiveHyphenLimit", hyphenationOptions.getConsecutiveHyphenLimit());
        zzzydZzJ.zzv("w:hyphenationZone", hyphenationOptions.getHyphenationZone(), StyleIdentifier.LIST_TABLE_4_ACCENT_5);
        zzzydZzJ.zze("w:doNotHyphenateCaps", !hyphenationOptions.getHyphenateCaps());
        zzzydZzJ.zze("w:showEnvelope", zzzzfZzZpV.zzYW2);
        zzzydZzJ.zze("w:evenAndOddHeaders", zzzzfZzZpV.zzYVX);
        int i4 = zzzzfZzZpV.zzYWh;
        boolean z2 = i4 == 3;
        boolean z3 = i4 == 4;
        zzzydZzJ.zze("w:bookFoldRevPrinting", z3);
        zzzydZzJ.zze("w:bookFoldPrinting", z2);
        if (z2 || z3) {
            zzzydZzJ.zzZl("w:bookFoldPrintingSheets", zzzzfZzZpV.zzYVW);
        }
        zzzydZzJ.zzv("w:drawingGridHorizontalSpacing", zzzzfZzZpV.zzYVV, 180);
        zzzydZzJ.zzv("w:drawingGridVerticalSpacing", zzzzfZzZpV.zzYVU, 180);
        zzzydZzJ.zzv("w:displayHorizontalDrawingGridEvery", zzzzfZzZpV.zzYVT, 1);
        zzzydZzJ.zzv("w:displayVerticalDrawingGridEvery", zzzzfZzZpV.zzYVS, 1);
        zzzydZzJ.zze("w:doNotUseMarginsForDrawingGridOrigin", !zzzzfZzZpV.zzYVR);
        if (!zzzzfZzZpV.zzYVR) {
            zzzydZzJ.zzv("w:drawingGridHorizontalOrigin", zzzzfZzZpV.zzYVQ, 1800);
            zzzydZzJ.zzv("w:drawingGridVerticalOrigin", zzzzfZzZpV.zzYVP, 1440);
        }
        zzzydZzJ.zze("w:doNotShadeFormData", zzzzfZzZpV.zzYVO);
        zzzydZzJ.zze("w:noPunctuationKerning", !zzzzfZzZpV.zzYVN);
        zzzydZzJ.zzYz("w:characterSpacingControl", zzZXQ.zzFq(zzzzfZzZpV.zzYVM));
        zzzydZzJ.zze("w:printTwoOnOne", zzzzfZzZpV.zzYWh == 2);
        zzzydZzJ.zze("w:strictFirstAndLastChars", zzzzfZzZpV.zzYVL);
        int i5 = zzzzfZzZpV.zzYVK;
        zzYVC.zzZ(zzzzfZzZpV, zzzydZzJ, i5 == 0 ? "en-US" : com.aspose.words.internal.zzBM.zzVn(i5));
        zzzydZzJ.zze("w:doNotEmbedSmartTags", zzzzfZzZpV.zzYVm);
        zzzydZzJ.zze("w:showEnvelope", zzzzfZzZpV.zzYW2);
        zzzydZzJ.zze("w:doNotValidateAgainstSchema", !zzzzfZzZpV.zzYVw);
        zzzydZzJ.zze("w:saveInvalidXml", zzzzfZzZpV.zzYVv);
        zzzydZzJ.zze("w:ignoreMixedContent", zzzzfZzZpV.zzYVs);
        zzzydZzJ.zze("w:alwaysShowPlaceholderText", zzzzfZzZpV.zzYVr);
        zzzydZzJ.zze("w:doNotDemarcateInvalidXml", zzzzfZzZpV.zzYVq);
        zzzydZzJ.zze("w:saveXmlDataOnly", zzzzfZzZpV.zzYVu);
        zzzydZzJ.zze("w:useXSLTWhenSaving", zzzzfZzZpV.zzYVp);
        zzZ(zzzydZzJ, "w:saveThroughXslt", zzzzfZzZpV.zzYVo, zzzxr.zzZmp().zzZkm());
        zzzydZzJ.zze("w:showXMLTags", zzzzfZzZpV.zzYVt);
        zzzydZzJ.zze("w:alwaysMergeEmptyNamespace", zzzzfZzZpV.zzYVn);
        zzzxr.zzY(zzzzfZzZpV.zzYVh, true);
        zzZ(zzzzfZzZpV.zzYVg, zzzydZzJ, compliance);
        if (zzzxr.zzZlS().zzYd6()) {
            zzYUH.zzZ(zzzzfZzZpV, zzzydZzJ, 20);
        }
        zzZ(document.getVariables(), zzzydZzJ);
        if (zzzzfZzZpV.zzYVd.zzYEB()) {
            zzZ(zzzzfZzZpV.zzYVd, zzzydZzJ);
        }
        if (compliance == 0) {
            zzzydZzJ.zze("w:uiCompat97To2003", zzzzfZzZpV.zzYVg.getUICompat97To2003());
        }
        zzZ(zzzzfZzZpV.zzYVe, zzzydZzJ);
        if (zzzxr.zzZlS().zzYr1()) {
            zzX(zzzydZzJ);
        }
        if (zzzxr.zzZlS().zzYr0()) {
            zzzydZzJ.zze("w:doNotIncludeSubdocsInStats", zzzzfZzZpV.zzYVa);
        }
        zzzydZzJ.zze("w:doNotEmbedSmartTags", zzzzfZzZpV.zzYVm);
        zzzydZzJ.zze("w:doNotAutoCompressPictures", zzzzfZzZpV.zzYV7);
        if (compliance < 2) {
            zzYUF.zzZ(zzzydZzJ, zzzxr.zzZqS(), false);
            zzYUF.zzZ(zzzydZzJ, zzzxr.zzZqS(), true);
        }
        if (z) {
            zzzydZzJ.zze("w14:discardImageEditingData", zzzzfZzZpV.zzYV2);
            int i6 = zzzzfZzZpV.zzYV1;
            if (i6 > 0) {
                zzzydZzJ.zzX("w14:defaultImageDpi", "w14:val", Integer.valueOf(i6));
            }
            if (zzzxr.zzZlS().zzYd5()) {
                zzzydZzJ.zzX("w14:docId", "w14:val", zzzzfZzZpV.zzYV0);
            }
            zzzydZzJ.zze("w15:chartTrackingRefBased", zzzzfZzZpV.zzYV4);
            zzzydZzJ.zzX("w15:docId", "w15:val", zzzzfZzZpV.zzYV3);
        }
        zzzydZzJ.endDocument();
        zzzxr.zzZlX();
    }

    private static void zzX(zzZYD zzzyd) {
        zzzyd.zzY("w:clrSchemeMapping");
        zzzyd.zz0("w:bg1", "light1");
        zzzyd.zz0("w:t1", "dark1");
        zzzyd.zz0("w:bg2", "light2");
        zzzyd.zz0("w:t2", "dark2");
        zzzyd.zz0("w:accent1", "accent1");
        zzzyd.zz0("w:accent2", "accent2");
        zzzyd.zz0("w:accent3", "accent3");
        zzzyd.zz0("w:accent4", "accent4");
        zzzyd.zz0("w:accent5", "accent5");
        zzzyd.zz0("w:accent6", "accent6");
        zzzyd.zz0("w:hyperlink", "hyperlink");
        zzzyd.zz0("w:followedHyperlink", "followedHyperlink");
        zzzyd.zzp();
    }

    private static boolean zzY(zzZZF zzzzf) {
        return (zzzzf.zzYWa && zzzzf.zzYW8 && zzzzf.zzYW7 && zzzzf.zzYW9 && zzzzf.zzYWb) ? false : true;
    }

    private static void zzZ(zzZYD zzzyd, String str, String str2, String str3) {
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            String strZzZ = zzzyd.zzZmN().zzxn().zzZ(str3, str2, true);
            zzzyd.zzY(str);
            zzzyd.zzX("r:id", strZzZ);
            zzzyd.zzp();
        }
    }

    private static void zzZ(zzZYD zzzyd, zzY8L zzy8l) {
        zzzyd.zzx("w:allStyles", zzy8l.zzY2A());
        zzzyd.zzx("w:alternateStyleNames", zzy8l.zzY2m());
        zzzyd.zzx("w:clearFormatting", zzy8l.zzY2p());
        zzzyd.zzx("w:customStyles", zzy8l.zzY2z());
        zzzyd.zzx("w:directFormattingOnNumbering", zzy8l.zzY2r());
        zzzyd.zzx("w:directFormattingOnParagraphs", zzy8l.zzY2s());
        zzzyd.zzx("w:directFormattingOnRuns", zzy8l.zzY2t());
        zzzyd.zzx("w:directFormattingOnTables", zzy8l.zzY2q());
        zzzyd.zzx("w:headingStyles", zzy8l.zzY2w());
        zzzyd.zzx("w:latentStyles", zzy8l.zzY2y());
        zzzyd.zzx("w:numberingStyles", zzy8l.zzY2v());
        zzzyd.zzx("w:stylesInUse", zzy8l.zzY2x());
        zzzyd.zzx("w:tableStyles", zzy8l.zzY2u());
        zzzyd.zzx("w:top3HeadingStyles", zzy8l.zzY2o());
        zzzyd.zzx("w:visibleStyles", zzy8l.zzY2n());
    }

    private static void zzZ(WriteProtection writeProtection, zzZYD zzzyd) {
        if (writeProtection.getReadOnlyRecommended() || writeProtection.isWriteProtected()) {
            zzzyd.zzY("w:writeProtection");
            zzzyd.zzw("w:recommended", writeProtection.getReadOnlyRecommended());
            writeProtection.zzZof();
            zzZ(writeProtection.zzZo8(), zzzyd);
            zzzyd.zzp();
        }
    }

    private static void zzZ(ViewOptions viewOptions, zzYU6 zzyu6, int i) {
        zzyu6.zzY("w:zoom");
        if (viewOptions.getZoomType() != 0) {
            zzyu6.zz0("w:val", zzZXQ.zzFm(viewOptions.getZoomType()));
        }
        String strZzWF = com.aspose.words.internal.zzJB.zzWF(viewOptions.getZoomPercent());
        if (i == 2) {
            strZzWF = com.aspose.words.internal.zzZKN.zzZI(strZzWF, "%");
        }
        zzyu6.zz0("w:percent", strZzWF);
        zzyu6.zzp();
    }

    private static void zzZ(zzZZF zzzzf, zzYU6 zzyu6) {
        zzyu6.zzX("w:proofState", "w:spelling", zzZXQ.zzFp(zzzzf.zzYWp), "w:grammar", zzZXQ.zzFp(zzzzf.zzYWo));
    }

    private static void zzZ(zzZYR zzzyr, zzZYD zzzyd) {
        if (zzzyr.zzZoe() != -1 || zzzyr.zzZIN()) {
            zzzyd.zzY("w:documentProtection");
            if (zzzyr.zzZoe() != -1) {
                zzzyd.zz0("w:edit", zzZXQ.zzFr(zzzyr.zzZoe()));
            }
            zzzyd.zzw("w:formatting", zzzyr.zzZIN());
            zzzyd.zzx("w:enforcement", zzzyr.zzZod());
            zzzyr.zzZof();
            zzZ(zzzyr.zzZo8(), zzzyd);
            zzzyd.zzp();
        }
    }

    private static void zzZ(zzYMB zzymb, zzZYD zzzyd) {
        String str;
        if (zzymb.isEmpty()) {
            return;
        }
        boolean z = zzzyd.zzZtY() == 2;
        if (z) {
            zzzyd.zz0("w:algorithmName", zzYMB.zzqg(zzymb.zzXFy));
        } else {
            if (zzymb.zzXFy != zzYMB.zzCX("SHA-512") && zzymb.zzXFy != zzYMB.zzCX(KeyUtil.HMAC_KEY_HASH_ALGORITHM)) {
                str = "rsaFull";
            } else {
                str = "rsaAES";
            }
            zzzyd.zz0("w:cryptProviderType", str);
            zzzyd.zz0("w:cryptAlgorithmClass", "hash");
            zzzyd.zz0("w:cryptAlgorithmType", "typeAny");
            zzzyd.zzZj("w:cryptAlgorithmSid", zzymb.zzXFy);
        }
        zzzyd.zzZj(z ? "w:spinCount" : "w:cryptSpinCount", zzymb.zzXFx);
        zzzyd.zzU(z ? "w:hashValue" : "w:hash", zzymb.zzXFz);
        zzzyd.zzU(z ? "w:saltValue" : "w:salt", zzymb.zzYL3);
    }

    private static void zzZ(CompatibilityOptions compatibilityOptions, zzYU6 zzyu6, int i) {
        zzyu6.zzY("w:compat");
        if (i == 2) {
            zzyu6.zze("w:spaceForUL", compatibilityOptions.getSpaceForUL());
            zzyu6.zze("w:balanceSingleByteDoubleByteWidth", compatibilityOptions.getBalanceSingleByteDoubleByteWidth());
            zzyu6.zze("w:doNotLeaveBackslashAlone", compatibilityOptions.getDoNotLeaveBackslashAlone());
            zzyu6.zze("w:ulTrailSpace", compatibilityOptions.getUlTrailSpace());
            zzyu6.zze("w:doNotExpandShiftReturn", compatibilityOptions.getDoNotExpandShiftReturn());
            zzyu6.zze("w:adjustLineHeightInTable", compatibilityOptions.getAdjustLineHeightInTable());
            zzyu6.zze("w:applyBreakingRules", compatibilityOptions.getApplyBreakingRules());
        } else {
            zzyu6.zze("w:useSingleBorderforContiguousCells", compatibilityOptions.getUseSingleBorderforContiguousCells());
            zzyu6.zze("w:wpJustification", compatibilityOptions.getWPJustification());
            zzyu6.zze("w:noTabHangInd", compatibilityOptions.getNoTabHangInd());
            zzyu6.zze("w:noLeading", compatibilityOptions.getNoLeading());
            zzyu6.zze("w:spaceForUL", compatibilityOptions.getSpaceForUL());
            zzyu6.zze("w:noColumnBalance", compatibilityOptions.getNoColumnBalance());
            zzyu6.zze("w:balanceSingleByteDoubleByteWidth", compatibilityOptions.getBalanceSingleByteDoubleByteWidth());
            zzyu6.zze("w:noExtraLineSpacing", compatibilityOptions.getNoExtraLineSpacing());
            zzyu6.zze("w:doNotLeaveBackslashAlone", compatibilityOptions.getDoNotLeaveBackslashAlone());
            zzyu6.zze("w:ulTrailSpace", compatibilityOptions.getUlTrailSpace());
            zzyu6.zze("w:doNotExpandShiftReturn", compatibilityOptions.getDoNotExpandShiftReturn());
            zzyu6.zze("w:spacingInWholePoints", compatibilityOptions.getSpacingInWholePoints());
            zzyu6.zze("w:lineWrapLikeWord6", compatibilityOptions.getLineWrapLikeWord6());
            zzyu6.zze("w:printBodyTextBeforeHeader", compatibilityOptions.getPrintBodyTextBeforeHeader());
            zzyu6.zze("w:printColBlack", compatibilityOptions.getPrintColBlack());
            zzyu6.zze("w:showBreaksInFrames", compatibilityOptions.getShowBreaksInFrames());
            zzyu6.zze("w:subFontBySize", compatibilityOptions.getSubFontBySize());
            zzyu6.zze("w:suppressBottomSpacing", compatibilityOptions.getSuppressBottomSpacing());
            zzyu6.zze("w:suppressTopSpacing", compatibilityOptions.getSuppressTopSpacing());
            zzyu6.zze("w:suppressSpacingAtTopOfPage", compatibilityOptions.getSuppressSpacingAtTopOfPage());
            zzyu6.zze("w:suppressTopSpacingWP", compatibilityOptions.getSuppressTopSpacingWP());
            zzyu6.zze("w:suppressSpBfAfterPgBrk", compatibilityOptions.getSuppressSpBfAfterPgBrk());
            zzyu6.zze("w:swapBordersFacingPages", compatibilityOptions.getSwapBordersFacingPgs());
            zzyu6.zze("w:convMailMergeEsc", compatibilityOptions.getConvMailMergeEsc());
            zzyu6.zze("w:truncateFontHeightsLikeWP6", compatibilityOptions.getTruncateFontHeightsLikeWP6());
            zzyu6.zze("w:mwSmallCaps", compatibilityOptions.getMWSmallCaps());
            zzyu6.zze("w:usePrinterMetrics", compatibilityOptions.getUsePrinterMetrics());
            zzyu6.zze("w:doNotSuppressParagraphBorders", compatibilityOptions.getDoNotSuppressParagraphBorders());
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
            zzyu6.zze("w:useWord97LineBreakRules", compatibilityOptions.getUseWord97LineBreakRules());
            zzyu6.zze("w:doNotBreakWrappedTables", compatibilityOptions.getDoNotBreakWrappedTables());
            zzyu6.zze("w:doNotSnapToGridInCell", compatibilityOptions.getDoNotSnapToGridInCell());
            zzyu6.zze("w:selectFldWithFirstOrLastChar", compatibilityOptions.getSelectFldWithFirstOrLastChar());
            zzyu6.zze("w:applyBreakingRules", compatibilityOptions.getApplyBreakingRules());
            zzyu6.zze("w:doNotWrapTextWithPunct", compatibilityOptions.getDoNotWrapTextWithPunct());
            zzyu6.zze("w:doNotUseEastAsianBreakRules", compatibilityOptions.getDoNotUseEastAsianBreakRules());
            zzyu6.zze("w:useWord2002TableStyleRules", compatibilityOptions.getUseWord2002TableStyleRules());
            zzyu6.zze("w:growAutofit", compatibilityOptions.getGrowAutofit());
            zzyu6.zze("w:useFELayout", compatibilityOptions.getUseFELayout());
            zzyu6.zze("w:useNormalStyleForList", compatibilityOptions.getUseNormalStyleForList());
            zzyu6.zze("w:doNotUseIndentAsNumberingTabStop", compatibilityOptions.getDoNotUseIndentAsNumberingTabStop());
            zzyu6.zze("w:useAltKinsokuLineBreakRules", compatibilityOptions.getUseAltKinsokuLineBreakRules());
            zzyu6.zze("w:allowSpaceOfSameStyleInTable", compatibilityOptions.getAllowSpaceOfSameStyleInTable());
            zzyu6.zze("w:doNotSuppressIndentation", compatibilityOptions.getDoNotSuppressIndentation());
            zzyu6.zze("w:doNotAutofitConstrainedTables", compatibilityOptions.getDoNotAutofitConstrainedTables());
            zzyu6.zze("w:autofitToFirstFixedWidthCell", compatibilityOptions.getAutofitToFirstFixedWidthCell());
            zzyu6.zze("w:underlineTabInNumList", compatibilityOptions.getUnderlineTabInNumList());
            zzyu6.zze("w:displayHangulFixedWidth", compatibilityOptions.getDisplayHangulFixedWidth());
            zzyu6.zze("w:splitPgBreakAndParaMark", compatibilityOptions.getSplitPgBreakAndParaMark());
            zzyu6.zze("w:doNotVertAlignCellWithSp", compatibilityOptions.getDoNotVertAlignCellWithSp());
            zzyu6.zze("w:doNotBreakConstrainedForcedTable", compatibilityOptions.getDoNotBreakConstrainedForcedTable());
            zzyu6.zze("w:doNotVertAlignInTxbx", compatibilityOptions.getDoNotVertAlignInTxbx());
            zzyu6.zze("w:useAnsiKerningPairs", compatibilityOptions.getUseAnsiKerningPairs());
            zzyu6.zze("w:cachedColBalance", compatibilityOptions.getCachedColBalance());
            zzyu6.zze("w:wpSpaceWidth", compatibilityOptions.getWPSpaceWidth());
        }
        zzZ(compatibilityOptions, i, zzyu6);
        zzyu6.zzp();
    }

    private static void zzZ(CompatibilityOptions compatibilityOptions, int i, zzYU6 zzyu6) {
        if (compatibilityOptions.zzZYT().getCount() == 0 || i == 0) {
            return;
        }
        zzKQ zzkqZzZYT = compatibilityOptions.zzZYT();
        for (int i2 = 0; i2 < zzkqZzZYT.getCount(); i2++) {
            zzyu6.zzY("w:compatSetting");
            zzyu6.zz0("w:name", zzkqZzZYT.zzM5(i2).getName());
            zzyu6.zz0("w:uri", zzkqZzZYT.zzM5(i2).getUri());
            zzyu6.zz0("w:val", zzkqZzZYT.zzM5(i2).getValue());
            zzyu6.zzp();
        }
    }

    private static void zzZ(VariableCollection variableCollection, zzYU6 zzyu6) {
        if (variableCollection.getCount() > 0) {
            zzyu6.zzY("w:docVars");
            for (Map.Entry<String, String> entry : variableCollection) {
                zzyu6.zzX("w:docVar", "w:name", entry.getKey(), "w:val", entry.getValue() != null ? entry.getValue().replace("\u000b", "_x000b_") : null);
            }
            zzyu6.zzp();
        }
    }

    private static void zzZ(zzY5H zzy5h, zzYU6 zzyu6) {
        String strZzVn = com.aspose.words.internal.zzBM.zzVn(zzy5h.zzX32);
        zzyu6.zzX("w:themeFontLang", "w:val", com.aspose.words.internal.zzBM.zzVn(zzy5h.zzX34), "w:eastAsia", com.aspose.words.internal.zzBM.zzVn(zzy5h.zzX33), "w:bidi", strZzVn);
    }

    private static void zzZ(zzYZU zzyzu, zzYU6 zzyu6) {
        zzyu6.zzY("m:mathPr");
        zzyu6.zzYz("m:mathFont", zzyzu.zzYEt());
        if (zzyzu.zzYEA() != 0) {
            zzyu6.zzYz("m:brkBin", zzZXQ.zzFj(zzyzu.zzYEA()));
        }
        if (zzyzu.zzYEz() != 0) {
            zzyu6.zzYz("m:brkBinSub", zzZXQ.zzFi(zzyzu.zzYEz()));
        }
        zzyu6.zze("m:smallFrac", zzyzu.zzYEp());
        if (!zzyzu.zzYEx()) {
            zzyu6.zzy("m:dispDef", zzyzu.zzYEx());
        }
        zzyu6.zzv("m:lMargin", zzyzu.zzZRi(), 0);
        zzyu6.zzv("m:rMargin", zzyzu.zzZRh(), 0);
        if (zzyzu.zzYEy() != 1) {
            zzyu6.zzYz("m:defJc", zzZXP.zzEZ(zzyzu.zzYEy()));
        }
        zzyu6.zzv("m:preSp", zzyzu.zzYEq(), 0);
        zzyu6.zzv("m:postSp", zzyzu.zzYEr(), 0);
        zzyu6.zzv("m:interSp", zzyzu.zzYEw(), 0);
        zzyu6.zzv("m:intraSp", zzyzu.zzYEv(), 0);
        zzyu6.zzv("m:wrapIndent", zzyzu.zzYEo(), 1440);
        zzyu6.zze("m:wrapRight", zzyzu.zzYEn());
        if (zzyzu.zzYEu() != 0) {
            zzyu6.zzYz("m:intLim", zzZXP.zzES(zzyzu.zzYEu()));
        }
        if (zzyzu.zzYEs() != 1) {
            zzyu6.zzYz("m:naryLim", zzZXP.zzES(zzyzu.zzYEs()));
        }
        zzyu6.zzp();
    }
}
