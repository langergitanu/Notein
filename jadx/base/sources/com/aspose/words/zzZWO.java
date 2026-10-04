package com.aspose.words;

import com.google.firebase.messaging.Constants;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWO {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("sdtContent", "sdtPr", "sdtEndPr", "rPr", "alias", "bibliography", "citation", "comboBox", "dataBinding", "date", "docPartList", "docPartObj", "dropDownList", "equation", "group", "id", Constants.ScionAnalytics.PARAM_LABEL, "lock", IDToken.PICTURE, "placeholder", "richText", "showingPlcHdr", "tabIndex", "tag", "temporary", "text", "repeatingSection", "repeatingSectionItem", "color", "appearance", "webExtensionCreated", "webExtensionLinked", "entityPicker", "val", "themeColor", "themeShade", "themeTint", "sectionTitle", "doNotAllowInsertDeleteSection", "checked", "checkedState", "uncheckedState", "lastValue", "listItem", "displayText", "value", "prefixMappings", "storeItemID", "xpath", "storeItemChecksum", "fullDate", "calendar", "dateFormat", "lid", "storeMappedDataAs", "docPartCategory", "docPartGallery", "docPartUnique", "docPart");
    private zzY6G zzYP8;
    private zzZXA zzYPn;
    private int zzYw;

    public zzZWO(zzZXA zzzxa, int i) {
        this(zzzxa, i, null);
    }

    private void zzH(zzYVB zzyvb) throws Exception {
        int i = this.zzYw;
        if (i == 1) {
            this.zzYPn.zzY(zzyvb, null);
            return;
        }
        if (i == 2) {
            zzZWW.zzZl2().zzG(zzyvb);
        } else if (i == 3) {
            zzZWD.zzW(zzyvb, this.zzYP8);
        } else {
            if (i != 4) {
                throw new IllegalStateException("Please report exception.");
            }
            zzZWT.zzW(zzyvb, this.zzYP8);
        }
    }

    private static String zzMK(String str) {
        int iIndexOf;
        int iIndexOf2 = str.indexOf(91, str.lastIndexOf(47) + 1);
        if (iIndexOf2 == -1 || (iIndexOf = str.indexOf(93, iIndexOf2 + 1)) == -1) {
            return null;
        }
        return com.aspose.words.internal.zzZKN.zzT(str, iIndexOf2, (iIndexOf - iIndexOf2) + 1);
    }

    private static void zzV(zzYVB zzyvb, StructuredDocumentTag structuredDocumentTag) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ("placeholder")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 58) {
                zzyu4ZzZsD.zzk();
            } else {
                structuredDocumentTag.zzB2(zzyu4ZzZsD.zzV("val", null));
            }
        }
    }

    private static void zzW(zzYVB zzyvb, StructuredDocumentTag structuredDocumentTag) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYDF zzydf = new zzYDF();
        structuredDocumentTag.zzZ(zzydf);
        while (zzyu4ZzZsD.zzi()) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) == 50) {
                zzydf.zz2(com.aspose.words.internal.zzJB.zzZy(zzyu4ZzZsD.getValue()));
            }
        }
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 51:
                    zzydf.setCalendarType(zzZXP.zzNf(zzyu4ZzZsD.zzV("val", null)));
                    break;
                case 52:
                    zzydf.zzBl(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 53:
                    String strZzV = zzyu4ZzZsD.zzV("val", null);
                    if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
                        zzydf.zzmD(com.aspose.words.internal.zzBM.zzYx(strZzV));
                    }
                    break;
                case 54:
                    zzydf.zzmC(zzZXP.zzNd(zzyu4ZzZsD.zzV("val", null)));
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
        zzydf.zzR4(false);
    }

    private static void zzX(zzYVB zzyvb, StructuredDocumentTag structuredDocumentTag) {
        zzyvb.zzZqn().zzYr6();
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYD2 zzyd2 = new zzYD2();
        while (zzyu4ZzZsD.zzQ("repeatingSection")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 37) {
                zzyd2.zzBe(zzyu4ZzZsD.zzV("val", null));
            } else if (iZzTP != 38) {
                zzyu4ZzZsD.zzk();
            } else {
                zzyd2.zzR2(zzyu4ZzZsD.zzYyD());
            }
        }
        structuredDocumentTag.zzZ(zzyd2);
    }

    private static void zzZ(zzYVB zzyvb, StructuredDocumentTag structuredDocumentTag, zzYU4 zzyu4) throws Exception {
        while (zzyu4.zzQ("sdtEndPr")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 3) {
                zzyu4.zzk();
            } else {
                zzZWW.zzZl4().zzW(zzyvb, structuredDocumentTag.zzY3I());
            }
        }
    }

    private static int zzZW(String str, int i) {
        int iZzZc = com.aspose.words.internal.zzJB.zzZc(str);
        return iZzZc != Integer.MIN_VALUE ? iZzZc : i;
    }

    public final void zzY(zzYVB zzyvb) throws Exception {
        StructuredDocumentTag structuredDocumentTag = new StructuredDocumentTag(zzyvb.getDocument(), this.zzYw);
        zzyvb.zzK(structuredDocumentTag);
        if (zzyvb.zzYyX() != null) {
            zzZ(structuredDocumentTag, zzyvb.zzYyX());
        }
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ("sdt")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                zzH(zzyvb);
                if (zzyu4ZzZsD.zzc() && !zzYVU.zzXM(zzyvb.zzYz7()) && (zzyu4ZzZsD.zzYyu() == null || (zzYVU.zzk(zzyvb.zzYz7(), zzyu4ZzZsD.zzYyu()) && zzYVU.zzXI(zzyvb.zzYz7()) > zzYVU.zzXI(zzyu4ZzZsD.zzYyu())))) {
                    zzyu4ZzZsD.zzXy(zzyvb.zzYz7());
                }
            } else if (iZzTP == 1) {
                zzZ(zzyvb, structuredDocumentTag);
            } else if (iZzTP != 2) {
                int i = this.zzYw;
                if (i == 2) {
                    zzZWW.zzZl2().zzF(zzyvb);
                } else if (i == 1) {
                    this.zzYPn.zzF(zzyvb);
                }
            } else {
                zzZ(zzyvb, structuredDocumentTag, zzyu4ZzZsD);
            }
        }
        zzyvb.zzX(structuredDocumentTag, zzyu4ZzZsD.zzYyu());
    }

    public zzZWO(zzZXA zzzxa, int i, zzY6G zzy6g) {
        this.zzYPn = zzzxa;
        this.zzYw = i;
        this.zzYP8 = zzy6g;
    }

    private static void zzZ(zzYVB zzyvb, StructuredDocumentTag structuredDocumentTag) throws Exception {
        String strZzMK;
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYO3 zzyo3ZzZqn = zzyvb.zzZqn();
        while (zzyu4ZzZsD.zzQ("sdtPr")) {
            if (com.aspose.words.internal.zzZKN.equals(zzyu4ZzZsD.getNamespaceURI(), zzZX5.zz9(20, zzyo3ZzZqn.getCompliance() == 2)) && "checkbox".equals(zzyu4ZzZsD.getLocalName())) {
                zzYDN zzydn = new zzYDN();
                zzyo3ZzZqn.zzYr6();
                structuredDocumentTag.zzZ(zzydn);
                zzZ(zzyvb, zzydn);
            }
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 3:
                    zzZWW.zzZl4().zzW(zzyvb, structuredDocumentTag.zzY3J());
                    break;
                case 4:
                    structuredDocumentTag.setTitle(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 5:
                    structuredDocumentTag.zzZ(new zzYDP());
                    break;
                case 6:
                    structuredDocumentTag.zzZ(new zzYDL());
                    break;
                case 7:
                    zzYDK zzydk = new zzYDK();
                    structuredDocumentTag.zzZ(zzydk);
                    zzydk.getListItems().zzs(structuredDocumentTag);
                    zzZ(zzyvb, zzydk);
                    break;
                case 8:
                    zzZ(zzyvb, structuredDocumentTag, zzyu4ZzZsD.getNamespaceURI());
                    break;
                case 9:
                    zzW(zzyvb, structuredDocumentTag);
                    break;
                case 10:
                    zzYDO zzydo = new zzYDO();
                    structuredDocumentTag.zzZ(zzydo);
                    zzZ(zzyvb, zzydo);
                    break;
                case 11:
                    zzYDD zzydd = new zzYDD();
                    structuredDocumentTag.zzZ(zzydd);
                    zzZ(zzyvb, zzydd);
                    break;
                case 12:
                    zzYDC zzydc = new zzYDC();
                    structuredDocumentTag.zzZ(zzydc);
                    zzydc.getListItems().zzs(structuredDocumentTag);
                    zzZ(zzyvb, zzydc);
                    break;
                case 13:
                    structuredDocumentTag.zzZ(new zzYD8());
                    break;
                case 14:
                    structuredDocumentTag.zzZ(new zzYD7());
                    break;
                case 15:
                    structuredDocumentTag.setId(zzyu4ZzZsD.zzYyE());
                    break;
                case 16:
                    structuredDocumentTag.zzla(zzyu4ZzZsD.zzYyE());
                    break;
                case 17:
                    zzZ(zzyu4ZzZsD, structuredDocumentTag);
                    break;
                case 18:
                    structuredDocumentTag.zzZ(new zzYD4());
                    break;
                case 19:
                    zzV(zzyvb, structuredDocumentTag);
                    break;
                case 20:
                    zzZ(zzyvb, structuredDocumentTag, true);
                    break;
                case 21:
                    structuredDocumentTag.isShowingPlaceholderText(zzyu4ZzZsD.zzYyD());
                    break;
                case 22:
                    structuredDocumentTag.zzl9(zzyu4ZzZsD.zzYyE());
                    break;
                case 23:
                    String strZzV = zzyu4ZzZsD.zzV("val", null);
                    if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
                        structuredDocumentTag.setTag(strZzV);
                    }
                    break;
                case 24:
                    structuredDocumentTag.isTemporary(zzyu4ZzZsD.zzYyD());
                    break;
                case 25:
                    zzZ(zzyvb, structuredDocumentTag, false);
                    break;
                case 26:
                    zzX(zzyvb, structuredDocumentTag);
                    break;
                case 27:
                    zzyo3ZzZqn.zzYr6();
                    structuredDocumentTag.zzZ(new zzYD1());
                    break;
                case 28:
                    zzY(zzyvb, structuredDocumentTag);
                    break;
                case 29:
                    zzyo3ZzZqn.zzYr6();
                    structuredDocumentTag.zzlc(zzZXP.zzNc(zzyu4ZzZsD.zzV("val", null)));
                    break;
                case 30:
                    zzyo3ZzZqn.zzYr6();
                    if (zzyu4ZzZsD.zzYyD()) {
                        structuredDocumentTag.zzlb(1);
                    }
                    break;
                case 31:
                    zzyo3ZzZqn.zzYr6();
                    if (zzyu4ZzZsD.zzYyD()) {
                        structuredDocumentTag.zzlb(2);
                    }
                    break;
                case 32:
                    zzyo3ZzZqn.zzYr6();
                    structuredDocumentTag.zzZ(new zzYD9());
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
        if (structuredDocumentTag.getSdtType() == 0) {
            structuredDocumentTag.zzZ(new zzYD0(true));
        }
        if (structuredDocumentTag.zzY3P() && !structuredDocumentTag.getXmlMapping().isEmpty() && (strZzMK = zzMK(structuredDocumentTag.getXmlMapping().getXPath())) != null) {
            structuredDocumentTag.getXmlMapping().setXPath(strZzMK);
            structuredDocumentTag.getDocument().zzG(9, "An indexer of last node selector in RepeatingSection SDT XPath is removed.");
        }
        XmlMapping xmlMapping = structuredDocumentTag.getXmlMapping();
        if (structuredDocumentTag.getSdtType() == 11 || xmlMapping.isEmpty() || !com.aspose.words.internal.zzZYD.zzXk(xmlMapping.zzXQF())) {
            return;
        }
        xmlMapping.zzyg(null);
    }

    private static void zzY(zzYVB zzyvb, StructuredDocumentTag structuredDocumentTag) {
        zzyvb.zzZqn().zzYr6();
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzi()) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 33:
                    structuredDocumentTag.zzZG(zzYU3.zzGR(zzyu4ZzZsD.getValue()));
                    break;
                case 34:
                    structuredDocumentTag.zzBb(zzyu4ZzZsD.getValue());
                    break;
                case 35:
                    structuredDocumentTag.zzTe(zzyu4ZzZsD.getValue());
                    break;
                case 36:
                    structuredDocumentTag.zzTd(zzyu4ZzZsD.getValue());
                    break;
            }
        }
    }

    private static void zzY(zzYVB zzyvb, zzYDB zzydb) {
        SdtListItem sdtListItem;
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        String value = "";
        String value2 = "";
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 44) {
                value2 = zzyu4ZzZsD.getValue();
            } else if (iZzTP == 45) {
                value = zzyu4ZzZsD.getValue();
            }
        }
        if (com.aspose.words.internal.zzZYD.zzXk(value)) {
            sdtListItem = new SdtListItem(value2, value);
        } else {
            sdtListItem = new SdtListItem();
        }
        sdtListItem.setDisplayText(value2);
        zzydb.getListItems().add(sdtListItem);
    }

    private static void zzZ(zzYVB zzyvb, zzYDN zzydn) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ("checkbox")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 39:
                    zzydn.setChecked(zzyu4ZzZsD.zzYyE() != 0);
                    break;
                case 40:
                case 41:
                    String strZzV = zzyu4ZzZsD.zzV("font", "MS Gothic");
                    String strZzV2 = zzyu4ZzZsD.zzV("val", null);
                    if ("checkedState".equals(zzyu4ZzZsD.getLocalName())) {
                        zzydn.zzZ(new zzYDM(strZzV, zzZW(strZzV2, zzYDM.zzXol.zzYcU())));
                    } else {
                        zzydn.zzY(new zzYDM(strZzV, zzZW(strZzV2, zzYDM.zzXok.zzYcU())));
                    }
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    private static void zzZ(zzYVB zzyvb, zzYDB zzydb) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        String value = "";
        while (zzyu4ZzZsD.zzi()) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) == 42) {
                value = zzyu4ZzZsD.getValue();
            }
        }
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 43) {
                zzyu4ZzZsD.zzk();
            } else {
                zzY(zzyvb, zzydb);
            }
        }
        zzydb.getListItems().zzBi(value);
        if (com.aspose.words.internal.zzZYD.zzXk(value)) {
            zzZ(value, zzydb.getListItems());
        }
    }

    private static void zzZ(String str, SdtListItemCollection sdtListItemCollection) {
        int iZzBj = sdtListItemCollection.zzBj(str);
        if (iZzBj >= 0) {
            sdtListItemCollection.zzZ(sdtListItemCollection.get(iZzBj));
        }
    }

    private static void zzZ(zzYVB zzyvb, StructuredDocumentTag structuredDocumentTag, String str) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYO3 zzyo3ZzZqn = zzyvb.zzZqn();
        String value = "";
        String value2 = value;
        String value3 = value2;
        String value4 = value3;
        while (zzyu4ZzZsD.zzi()) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 46:
                    value3 = zzyu4ZzZsD.getValue();
                    break;
                case 47:
                    value2 = zzyu4ZzZsD.getValue();
                    break;
                case 48:
                    value = zzyu4ZzZsD.getValue();
                    break;
                case 49:
                    value4 = zzyu4ZzZsD.getValue();
                    break;
            }
        }
        if (com.aspose.words.internal.zzZKN.equals(str, zzZX5.zz9(21, zzyo3ZzZqn.getCompliance() == 2))) {
            zzyo3ZzZqn.zzYr6();
        }
        if (com.aspose.words.internal.zzZYD.zzXk(value)) {
            structuredDocumentTag.getXmlMapping().zzm(value2, value, com.aspose.words.internal.zzZYD.zzXk(value3) ? value3 : "");
        }
        if (com.aspose.words.internal.zzZYD.zzXk(value4)) {
            structuredDocumentTag.getXmlMapping().zzyg(value4);
        }
    }

    private static void zzZ(zzYVB zzyvb, zzYDE zzyde) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 55:
                    zzyde.setBuildingBlockCategory(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 56:
                    zzyde.zzBk(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 57:
                    zzyde.zzR3(zzyu4ZzZsD.zzYyD());
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    private static void zzZ(zzYVB zzyvb, StructuredDocumentTag structuredDocumentTag, boolean z) {
        zzYD0 zzyd0 = new zzYD0(z);
        structuredDocumentTag.zzZ(zzyd0);
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzi()) {
            if ("multiLine".equals(zzyu4ZzZsD.getLocalName())) {
                zzyd0.zzR1(zzyu4ZzZsD.zz8());
            }
        }
    }

    private static void zzZ(StructuredDocumentTag structuredDocumentTag, zzYJC zzyjc) {
        zzZV8 zzzv8 = (zzZV8) com.aspose.words.internal.zzZKW.zzZ(zzyjc, zzZV8.class);
        if (zzzv8 != null) {
            if (zzzv8.getType() == 1) {
                structuredDocumentTag.setDeleteRevision(zzzv8.zzZjO());
                return;
            } else {
                structuredDocumentTag.setInsertRevision(zzzv8.zzZjO());
                return;
            }
        }
        zzYX5 zzyx5 = (zzYX5) com.aspose.words.internal.zzZKW.zzZ(zzyjc, zzYX5.class);
        if (zzyx5 != null) {
            int type = zzyx5.getType();
            if (type == 0) {
                structuredDocumentTag.setMoveFromRevision(zzyx5.zzYBA());
            } else {
                if (type != 1) {
                    return;
                }
                structuredDocumentTag.setMoveToRevision(zzyx5.zzYBA());
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, StructuredDocumentTag structuredDocumentTag) {
        int iZzNe = zzZXP.zzNe(zzyu4.zzV("val", null));
        structuredDocumentTag.setLockContentControl(iZzNe == 3 || iZzNe == 2);
        structuredDocumentTag.setLockContents(iZzNe == 1 || iZzNe == 2);
    }
}
