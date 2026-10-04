package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWN {
    private static int zzQ(boolean z, boolean z2) {
        if (z && z2) {
            return 2;
        }
        if (z) {
            return 3;
        }
        return z2 ? 1 : 0;
    }

    private static void zzW(StructuredDocumentTag structuredDocumentTag, zzZXR zzzxr) throws Exception {
        if (structuredDocumentTag.zzY3I().getCount() != 0) {
            zzZYD zzzydZzZlV = zzzxr.zzZlV();
            zzzydZzZlV.zzY("w:sdtEndPr");
            zzZWR.zzZkh().zzZ(structuredDocumentTag.zzY3I(), null, false, zzzxr);
            zzzydZzZlV.zzp();
        }
    }

    private static void zzX(StructuredDocumentTag structuredDocumentTag, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() != 0;
        zzzydZzZlV.zzY("w:sdtPr");
        if (structuredDocumentTag.zzY3J().getCount() != 0) {
            zzZWR.zzZkh().zzZ(structuredDocumentTag.zzY3J(), null, false, zzzxr);
        }
        zzzydZzZlV.zzYz("w:alias", structuredDocumentTag.getTitle());
        zzzydZzZlV.zzYz("w:tag", structuredDocumentTag.getTag());
        zzzydZzZlV.zzZl("w:id", structuredDocumentTag.getId());
        int iZzQ = zzQ(structuredDocumentTag.getLockContentControl(), structuredDocumentTag.getLockContents());
        if (iZzQ != 0) {
            zzzydZzZlV.zzYz("w:lock", zzZXP.zzF2(iZzQ));
        }
        zzY(zzzydZzZlV, structuredDocumentTag);
        boolean z2 = structuredDocumentTag.getSdtType() == 12 && zzzxr.zzZqS().zzXoM.contains(structuredDocumentTag);
        if (structuredDocumentTag.isShowingPlaceholderText() || z2) {
            zzzydZzZlV.zzZ("w:showingPlcHdr", (String) null);
        }
        zzZ(zzzydZzZlV, structuredDocumentTag, zzzxr.getCompliance());
        zzZ(zzzydZzZlV, structuredDocumentTag, z);
        if (structuredDocumentTag.zzY3L()) {
            zzzydZzZlV.zzZl("w:label", structuredDocumentTag.zzY3M());
        }
        if (structuredDocumentTag.zzY3K() != 0) {
            zzzydZzZlV.zzZl("tabIndex", structuredDocumentTag.zzY3K());
        }
        if (structuredDocumentTag.isTemporary()) {
            zzzydZzZlV.zzZ("w:temporary", (String) null);
        }
        if (z) {
            zzZ(zzzydZzZlV, structuredDocumentTag);
            if (structuredDocumentTag.getAppearance() != 0) {
                zzzydZzZlV.zzX("w15:appearance", "w15:val", zzZXP.zzF0(structuredDocumentTag.getAppearance()));
            }
            zzZ(structuredDocumentTag, zzzydZzZlV);
        }
        zzzydZzZlV.zzp();
    }

    public static void zzY(StructuredDocumentTag structuredDocumentTag, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        int iZzZ = zzZ((zzZ8X) structuredDocumentTag, zzzxr);
        zzzydZzZlV.zzp();
        zzzydZzZlV.zzp();
        zzZ(structuredDocumentTag, zzzydZzZlV, iZzZ);
    }

    public static void zzZ(StructuredDocumentTag structuredDocumentTag, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        int iZzZ = zzZ((zzZ8X) structuredDocumentTag, zzzxr);
        zzzydZzZlV.zzY("w:sdt");
        zzX(structuredDocumentTag, zzzxr);
        zzW(structuredDocumentTag, zzzxr);
        zzzydZzZlV.zzY("w:sdtContent");
        zzZ(structuredDocumentTag, zzzydZzZlV, iZzZ);
    }

    private static void zzY(zzZYD zzzyd, StructuredDocumentTag structuredDocumentTag) {
        if (structuredDocumentTag.getPlaceholder() == null || !com.aspose.words.internal.zzZYD.zzXk(structuredDocumentTag.getPlaceholderName())) {
            return;
        }
        zzzyd.zzY("w:placeholder");
        zzzyd.zzYz("w:docPart", structuredDocumentTag.getPlaceholderName());
        zzzyd.zzp();
    }

    private static void zzZ(StructuredDocumentTag structuredDocumentTag, zzZYD zzzyd) {
        int iZzY3N = structuredDocumentTag.zzY3N();
        if (iZzY3N != 0) {
            if (iZzY3N == 1) {
                zzzyd.zzZ("w15:webExtensionCreated", (String) null);
            } else {
                if (iZzY3N == 2) {
                    zzzyd.zzZ("w15:webExtensionLinked", (String) null);
                    return;
                }
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected WebExtensionRelationship value {0}.", Integer.valueOf(structuredDocumentTag.zzY3N())));
            }
        }
    }

    private static void zzZ(zzZYD zzzyd, StructuredDocumentTag structuredDocumentTag) {
        if (structuredDocumentTag.zzY3Q() == null && structuredDocumentTag.zzYbI() == null) {
            return;
        }
        zzzyd.zzX("w15:color", "w:val", structuredDocumentTag.zzY3Q() != null ? zzYU3.zzZS(structuredDocumentTag.zzY3Q()) : null, "w:themeColor", structuredDocumentTag.zzYbI(), "w:themeShade", structuredDocumentTag.zz8N(), "w:themeTint", structuredDocumentTag.zz8M());
    }

    private static void zzZ(zzZYD zzzyd, StructuredDocumentTag structuredDocumentTag, int i) {
        if (structuredDocumentTag.getXmlMapping().isEmpty()) {
            return;
        }
        if (!structuredDocumentTag.getXmlMapping().zzXQG()) {
            zzzyd.zzY("w:dataBinding");
        } else if (i != 0) {
            zzzyd.zzY("w15:dataBinding");
        } else {
            zzzyd.zzT(1, "The defined XML mapping is not supported by the ECMA-376 OOXML format.");
            return;
        }
        zzzyd.zz0("w:prefixMappings", structuredDocumentTag.getXmlMapping().getPrefixMappings());
        zzzyd.zz0("w:xpath", structuredDocumentTag.getXmlMapping().getXPath());
        zzzyd.zz0("w:storeItemID", structuredDocumentTag.getXmlMapping().getStoreItemId());
        zzzyd.zz0("w16sdtdh:storeItemChecksum", structuredDocumentTag.getXmlMapping().zzXQF());
        zzzyd.zzp();
    }

    private static void zzZ(zzYD2 zzyd2, zzZYD zzzyd) {
        zzzyd.zzY("w15:repeatingSection");
        zzzyd.zzX("w15:sectionTitle", "w:val", zzyd2.zzYcB());
        if (zzyd2.zzYcA()) {
            zzzyd.zzX("w15:doNotAllowInsertDeleteSection", "w:val", 1);
        }
        zzzyd.zzp();
    }

    private static void zzZ(zzZYD zzzyd, StructuredDocumentTag structuredDocumentTag, boolean z) {
        zzYDG zzydgZzY3H = structuredDocumentTag.zzY3H();
        switch (zzydgZzY3H.getType()) {
            case 0:
                return;
            case 1:
                zzzyd.zzZ("w:bibliography", (String) null);
                return;
            case 2:
                zzzyd.zzZ("w:citation", (String) null);
                return;
            case 3:
                zzzyd.zzZ("w:equation", (String) null);
                return;
            case 4:
            case 5:
                zzZ(zzydgZzY3H.getType() == 4 ? "w:dropDownList" : "w:comboBox", ((zzYDB) zzydgZzY3H).getListItems(), zzzyd);
                return;
            case 6:
                zzZ((zzYDF) zzydgZzY3H, zzzyd);
                return;
            case 7:
                zzZ("w:docPartList", (zzYDE) zzydgZzY3H, zzzyd);
                return;
            case 8:
                zzZ("w:docPartObj", (zzYDE) zzydgZzY3H, zzzyd);
                return;
            case 9:
                zzzyd.zzZ("w:group", (String) null);
                return;
            case 10:
                zzzyd.zzZ("w:picture", (String) null);
                return;
            case 11:
            case 12:
                zzYD0 zzyd0 = (zzYD0) zzydgZzY3H;
                zzZ(zzzyd, zzyd0.getType() == 11, zzyd0.zzZ9z());
                return;
            case 13:
                zzZ((zzYDN) zzydgZzY3H, zzzyd);
                return;
            case 14:
                if (structuredDocumentTag.zzY3H().getType() == 14 && z) {
                    zzZ((zzYD2) structuredDocumentTag.zzY3H(), zzzyd);
                    return;
                }
                return;
            case 15:
                if (z) {
                    zzzyd.zzZ("w15:repeatingSectionItem", (String) null);
                    return;
                }
                return;
            case 16:
                if (z) {
                    zzzyd.zzZ("w14:entityPicker", (String) null);
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Please report exception.");
        }
    }

    private static void zzZ(zzYDN zzydn, zzZYD zzzyd) {
        zzzyd.zzY("w14:checkbox");
        zzzyd.zzX("w14:checked", "w14:val", Integer.valueOf(zzydn.getChecked() ? 1 : 0));
        zzzyd.zzX("w14:checkedState", "w14:val", com.aspose.words.internal.zzZKN.format("{0:x4}", Integer.valueOf(zzydn.zzYcX().zzYcU())), "w14:font", zzydn.zzYcX().getFontName());
        zzzyd.zzX("w14:uncheckedState", "w14:val", com.aspose.words.internal.zzZKN.format("{0:x4}", Integer.valueOf(zzydn.zzYcW().zzYcU())), "w14:font", zzydn.zzYcW().getFontName());
        zzzyd.zzp();
    }

    private static void zzZ(zzZYD zzzyd, boolean z, boolean z2) {
        zzzyd.zzY(z ? "w:richText" : "w:text");
        zzzyd.zzw("w:multiLine", z2);
        zzzyd.zzp();
    }

    private static void zzZ(String str, SdtListItemCollection sdtListItemCollection, zzZYD zzzyd) {
        zzzyd.zzY(str);
        if (sdtListItemCollection.getSelectedValue() != null) {
            zzzyd.zz0("w:lastValue", sdtListItemCollection.getSelectedValue().getValue());
        } else if (com.aspose.words.internal.zzZYD.zzXk(sdtListItemCollection.zzYcL())) {
            zzzyd.zz0("w:lastValue", sdtListItemCollection.zzYcL());
        }
        for (int i = 0; i < sdtListItemCollection.getCount(); i++) {
            zzzyd.zzY("w:listItem");
            SdtListItem sdtListItem = sdtListItemCollection.get(i);
            zzzyd.zzX("w:value", sdtListItem.getValue());
            zzzyd.zz0("w:displayText", sdtListItem.getDisplayText());
            zzzyd.zzp();
        }
        zzzyd.zzp();
    }

    private static void zzZ(zzYDF zzydf, zzZYD zzzyd) {
        zzzyd.zzY("w:date");
        if (!com.aspose.words.internal.zzZQ9.zzZ(zzydf.zzYcR(), com.aspose.words.internal.zzZQ9.zz35)) {
            zzzyd.zz0("w:fullDate", com.aspose.words.internal.zzJB.zzR(zzydf.zzYcR()));
        }
        zzzyd.zzYz("w:dateFormat", zzydf.zzYcS());
        if (zzydf.zzYcT() != -1) {
            zzzyd.zzYz("w:lid", com.aspose.words.internal.zzBM.zzVn(zzydf.zzYcT()));
        }
        zzzyd.zzYz("w:storeMappedDataAs", zzZXP.zzF1(zzydf.zzYcQ()));
        zzzyd.zzYz("w:calendar", zzZXP.zzF3(zzydf.getCalendarType()));
        zzzyd.zzp();
    }

    private static void zzZ(String str, zzYDE zzyde, zzZYD zzzyd) {
        zzzyd.zzY(str);
        zzzyd.zzYz("w:docPartCategory", zzyde.getBuildingBlockCategory());
        zzzyd.zzYz("w:docPartGallery", zzyde.zzYcO());
        if (zzyde.isUnique()) {
            zzzyd.zzZ("w:docPartUnique", (String) null);
        }
        zzzyd.zzp();
    }

    private static int zzZ(zzZ8X zzz8x, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzZV8 insertRevision = zzz8x.getInsertRevision() != null ? zzz8x.getInsertRevision() : zzz8x.getDeleteRevision();
        if (insertRevision != null) {
            int iZzZpW = zzzxr.zzZpW();
            zzzydZzZlV.zzW(insertRevision, iZzZpW);
            return iZzZpW;
        }
        zzYX5 moveFromRevision = zzz8x.getMoveFromRevision() != null ? zzz8x.getMoveFromRevision() : zzz8x.getMoveToRevision();
        if (moveFromRevision == null || moveFromRevision.getType() == 2) {
            return -1;
        }
        int iZzZpW2 = zzzxr.zzZpW();
        zzzydZzZlV.zzX(moveFromRevision, iZzZpW2);
        return iZzZpW2;
    }

    private static void zzZ(zzZ8X zzz8x, zzZYD zzzyd, int i) throws Exception {
        zzZV8 insertRevision = zzz8x.getInsertRevision() != null ? zzz8x.getInsertRevision() : zzz8x.getDeleteRevision();
        if (insertRevision != null) {
            zzzyd.zzV(insertRevision, i);
            return;
        }
        zzYX5 moveFromRevision = zzz8x.getMoveFromRevision() != null ? zzz8x.getMoveFromRevision() : zzz8x.getMoveToRevision();
        if (moveFromRevision == null || moveFromRevision.getType() == 2) {
            return;
        }
        zzzyd.zzW(moveFromRevision, i);
    }
}
