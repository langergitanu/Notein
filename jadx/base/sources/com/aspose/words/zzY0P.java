package com.aspose.words;

import com.aspose.words.ref.RefInt;
import com.google.common.net.HttpHeaders;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
class zzY0P extends DocumentVisitor implements zzZ8U, zzZ9W, zzZBR {
    private com.aspose.words.internal.zzZYG<BookmarkStart> zzWUA;
    private zzY1P zzWUB;
    private zzY1H zzWUC;
    private boolean zzWUv;
    private boolean zzWUw;
    private boolean zzWUx;
    private String zzWUy;
    private String zzWUz;
    private zzY0V zzWVb;
    private zzY1S zzWVf;
    private zzYEF zzX91;
    private com.aspose.words.internal.zzZYI zzYOE;
    private com.aspose.words.internal.zzD3<String> zzYOu;
    private Section zzYOx;
    private Paragraph zzYOy;
    private ArrayList<String> zzYPl;
    private Document zzYTQ;
    private zzYDZ zzZFZ;
    private IWarningCallback zzZG0;
    private int zzkw;
    com.aspose.words.internal.zzXA<String> zzYN7 = new com.aspose.words.internal.zzXA<>();
    private int zzWUD = 1;
    private com.aspose.words.internal.zzD4 zzYOD = new com.aspose.words.internal.zzD4();

    private int zzFu(int i) {
        int i2 = this.zzYOD.get(i);
        if (!com.aspose.words.internal.zzD4.zzWm(i2)) {
            return i2;
        }
        int iZzZpW = zzZpW();
        this.zzYOD.set(i, iZzZpW);
        return iZzZpW;
    }

    private void zzI(Shape shape) throws Exception {
        zzYOC oleObject;
        shape.zzY9H();
        zzZBL zzzblZzYrB = shape.zzYrB();
        if (zzzblZzYrB == null || (oleObject = zzzblZzYrB.getOleObject()) == null) {
            return;
        }
        com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(new com.aspose.words.internal.zzZOZ(zzzblZzYrB.getClsidInternal()));
        com.aspose.words.internal.zzAA<Map.Entry> zzaaZzYrr = oleObject.zzYrr();
        for (Map.Entry entry : zzaaZzYrr) {
            String str = (String) entry.getKey();
            if (!"\u0003ObjInfo".equals(str) && !"\u0003OCXNAME".equals(str) && !"\u0003PRINT".equals(str)) {
                zzkd.zzIf().zzB((String) entry.getKey(), entry.getValue());
            }
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzkd.zzL(zzzor);
        String strZzZ = zzZ(PublicApiId.PCA_ACQUIRE_TOKEN_SILENT_ASYNC_WITH_PARAMETERS, "mso", zzzor);
        this.zzWVf.zzY("w:ocx");
        this.zzWVf.zz0("w:data", strZzZ);
        String name = zzzblZzYrB.getName();
        if (com.aspose.words.internal.zzZYD.zzXk(name)) {
            this.zzWVf.zz0("w:id", name);
            this.zzWVf.zz0("w:name", name);
        }
        this.zzWVf.zz0("w:classid", "CLSID:" + zzaaZzYrr.zzAC().toString("D").toUpperCase());
        if (!shape.isInline()) {
            this.zzWVf.zz0("w:shapeid", zzYU3.zzZR(shape));
            this.zzWVf.zz0("w:class", "shape");
        }
        this.zzWVf.zzO("w:w", com.aspose.words.internal.zzSA.pointToPixel(shape.getWidth()));
        this.zzWVf.zzO("w:h", com.aspose.words.internal.zzSA.pointToPixel(shape.getHeight()));
        this.zzWVf.zz0("wx:iPersistPropertyBag", TelemetryEventStrings.Value.TRUE);
        this.zzWVf.zzp();
    }

    private void zzJ(Shape shape) throws Exception {
        shape.zzY9I();
        OleFormat oleFormat = shape.getOleFormat();
        this.zzWVf.zzY("o:OLEObject");
        this.zzWVf.zz0("Type", oleFormat.isLink() ? HttpHeaders.LINK : "Embed");
        this.zzWVf.zz0("ProgID", oleFormat.getProgId());
        this.zzWVf.zz0("ShapeID", zzY23.zzXZ(shape));
        this.zzWVf.zz0("DrawAspect", oleFormat.getOleIcon() ? "Icon" : "Content");
        if (oleFormat.isLink()) {
            this.zzWVf.zz0("Moniker", com.aspose.words.internal.zzZYD.zzXk(oleFormat.getSourceItem()) ? com.aspose.words.internal.zzZKN.format("{0}!{1}", oleFormat.getSourceFullName(), oleFormat.getSourceItem()) : oleFormat.getSourceFullName());
            this.zzWVf.zz0("UpdateMode", oleFormat.getAutoUpdate() ? "Always" : "OnCall");
            this.zzWVf.zzZ("o:LinkType", zzY30.zzj7(oleFormat.zzZf9()));
            this.zzWVf.zze("o:LockedField", oleFormat.isLocked());
            this.zzWVf.zzZ("o:WordFieldCodes", "\\f " + oleFormat.zzZfa());
        } else {
            zzZBL zzzblZzYrB = shape.getOleFormat().zzYrB();
            if (zzzblZzYrB != null) {
                this.zzWVf.zz0("ObjectID", zzYO6.zzX(zzzblZzYrB));
            }
        }
        this.zzWVf.zzp();
    }

    private void zzK(Style style) throws Exception {
        if (zzY0C.zzZ(style, this.zzZG0, 13)) {
            this.zzWVf.zzY("w:style");
            this.zzWVf.zzX("w:type", zzY1K.zzhW(style.getType()));
            int styleIdentifier = style.getStyleIdentifier();
            if (styleIdentifier == 0 || styleIdentifier == 65 || styleIdentifier == 105 || styleIdentifier == 107) {
                this.zzWVf.zzX("w:default", "on");
            }
            this.zzWVf.zzX("w:styleId", this.zzWUB.zzFs(style.zzZ7j()));
            String strZzh = zzY8T.zzh(style.getStyleIdentifier(), style.getName());
            this.zzWVf.zzYz("w:name", strZzh);
            this.zzWVf.zzYz("w:aliases", this.zzWUB.getDocument().getStyles().zzW(style, false));
            if (!com.aspose.words.internal.zzZKN.equals(style.getName(), strZzh)) {
                this.zzWVf.zzYz("wx:uiName", style.getName());
            }
            if (zzY0C.zzhF(style.zzY3v())) {
                this.zzWVf.zzYz("w:basedOn", this.zzWUB.zzFs(style.zzY3v()));
            }
            if (style.zzY3u() != style.zzZ7j() && zzY0C.zzhF(style.zzY3u())) {
                this.zzWVf.zzYz("w:next", this.zzWUB.zzFs(style.zzY3u()));
            }
            if (zzY0C.zzhF(style.zzY3t())) {
                this.zzWVf.zzYz("w:link", this.zzWUB.zzFs(style.zzY3t()));
            }
            this.zzWVf.zze("w:autoRedefine", style.getAutomaticallyUpdate());
            this.zzWVf.zze("w:hidden", style.getHidden());
            this.zzWVf.zze("w:semiHidden", style.getSemiHidden());
            this.zzWVf.zze("w:locked", style.getLocked());
            this.zzWVf.zze("w:personal", style.zzY3p());
            this.zzWVf.zze("w:personalCompose", style.zzY3r());
            this.zzWVf.zze("w:personalReply", style.zzY3q());
            if (style.zzY3s() != 0) {
                this.zzWVf.zzYz("w:rsid", zzYU3.zzsV(style.zzY3s()));
            }
            if (style.getType() != 2) {
                zzYUU.zzZ(style.zzY3n() ? style.zzqw(1) : style.zzZYj(), this);
            }
            zzYEF zzyefZzZYh = style.zzZYh();
            if (style.zzY3n()) {
                zzyefZzZYh = style.zzl1(1);
                zzn(zzyefZzZYh);
                zzyefZzZYh.zzX(this.zzX91);
            }
            zzYUO.zzZ(zzyefZzZYh, style, this);
            if (style.getType() == 3) {
                TableStyle tableStyle = (TableStyle) style;
                zzYUR.zzZ(tableStyle.zzZYf(), true, true, this);
                zzYUR.zzZ(tableStyle.zzZYd(), false, true, this);
                zzYVE.zzZ(tableStyle.zz6G(), this);
                Iterator<ConditionalStyle> it = tableStyle.getConditionalStyles().zzZY9().iterator();
                while (it.hasNext()) {
                    zzU(it.next());
                }
            }
            this.zzWVf.zzp();
        }
    }

    private void zzQ(ListLevel listLevel) throws Exception {
        this.zzWVf.zzY("w:lvl");
        this.zzWVf.zzZj("w:ilvl", listLevel.zzYOa());
        this.zzWVf.zzw("w:tentative", listLevel.zzYcc);
        this.zzWVf.zzZl("w:start", listLevel.getStartAt());
        if (listLevel.getNumberStyle() != 0) {
            this.zzWVf.zzZl("w:nfc", listLevel.getNumberStyle());
        }
        if (listLevel.zzYO9()) {
            this.zzWVf.zzZl("w:lvlRestart", listLevel.getRestartAfterLevel() + 1);
        }
        if (listLevel.zzYOc() != 12287) {
            this.zzWVf.zzYz("w:pStyle", this.zzWUB.zzFs(listLevel.zzYOc()));
        }
        this.zzWVf.zze("w:isLgl", listLevel.isLegal());
        if (listLevel.getTrailingCharacter() != 0) {
            this.zzWVf.zzYz("w:suff", zzY1A.zzhU(listLevel.getTrailingCharacter()));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(listLevel.getNumberFormat())) {
            this.zzWVf.zzY("w:lvlText");
            this.zzWVf.zzX("w:val", zzYU3.zzGW(listLevel.getNumberFormat()));
            this.zzWVf.zzp();
        }
        if (listLevel.zzYOb()) {
            this.zzWVf.zzZl("w:lvlPicBulletId", listLevel.zzZ0p());
        }
        if (listLevel.getLegacy()) {
            this.zzWVf.zzX("w:legacy", "w:legacy", Boolean.valueOf(listLevel.getLegacy()), "w:legacySpace", Integer.valueOf(listLevel.zzYO6()), "w:legacyIndent", Integer.valueOf(listLevel.zzYO5()));
        }
        this.zzWVf.zzYz("w:lvlJc", zzY1A.zzhV(listLevel.getAlignment()));
        zzYUU.zzZ(listLevel.zzZYj(), this);
        zzYUO.zzZ(listLevel.zzZYh(), listLevel.zzZYh(), this);
        this.zzWVf.zzp();
    }

    private void zzU(ConditionalStyle conditionalStyle) throws Exception {
        this.zzWVf.zzY("w:tblStylePr");
        this.zzWVf.zz0("w:type", zzY8T.zzkT(conditionalStyle.zzZYk()));
        if (conditionalStyle.zzZYi()) {
            zzYUU.zzZ(conditionalStyle.zzZYj(), this);
        }
        if (conditionalStyle.zzZYg()) {
            zzYUO.zzZ(conditionalStyle.zzZYh(), conditionalStyle.zzZYh(), this);
        }
        if (conditionalStyle.zzZYe() || conditionalStyle.zzZYb()) {
            zzYUR.zzZ(conditionalStyle.zzZYf(), true, true, this);
        }
        if (conditionalStyle.zzZYc()) {
            zzYUR.zzZ(conditionalStyle.zzZYd(), false, true, this);
        }
        if (conditionalStyle.zzZYb()) {
            zzYVE.zzZ(conditionalStyle.zz6G(), this);
        }
        this.zzWVf.zzp();
    }

    private void zzXSi() {
        zzT(1, "WML does not support MoveTo/MoveFrom revisions, tracked moves will be converted to deletions and insertions.");
    }

    private void zzXSj() {
        zzZ73 zzz73ZzYi5 = this.zzWUB.getDocument().getStyles().zzYi5();
        this.zzWVf.zzY("w:latentStyles");
        this.zzWVf.zzx("w:defLockedState", zzz73ZzYi5.zzYUf());
        this.zzWVf.zzZj("w:latentStyleCount", zzz73ZzYi5.zzYUa());
        for (int i = 0; i < zzz73ZzYi5.getCount(); i++) {
            zzZ74 zzz74Zzy3 = zzz73ZzYi5.zzy3(i);
            String strZzh = zzY8T.zzh(zzz74Zzy3.getStyleIdentifier(), "");
            if (com.aspose.words.internal.zzZYD.zzXk(strZzh) && zzz74Zzy3.getLocked() != zzz73ZzYi5.zzYUf()) {
                this.zzWVf.zzY("w:lsdException");
                this.zzWVf.zzX("w:name", strZzh);
                this.zzWVf.zzx("w:locked", zzz74Zzy3.getLocked());
                this.zzWVf.zzp();
            }
        }
        this.zzWVf.zzp();
    }

    private void zzXSk() throws Exception {
        for (List list : this.zzYTQ.getLists()) {
            int iZzxp = this.zzYTQ.getLists().zzxp(list.zzYP8());
            if (iZzxp >= 0) {
                this.zzWVf.zzY("w:list");
                this.zzWVf.zzZj("w:ilfo", list.getListId());
                this.zzWVf.zzZl("w:ilst", iZzxp);
                for (zzZ4B zzz4b : list.zzYPb()) {
                    this.zzWVf.zzY("w:lvlOverride");
                    this.zzWVf.zzZj("w:ilvl", zzz4b.getListLevel().zzYOa());
                    if (zzz4b.zzYbX) {
                        this.zzWVf.zzv("w:startOverride", zzz4b.zzYbY, 0);
                    }
                    if (zzz4b.zzYbW) {
                        zzQ(zzz4b.getListLevel());
                    }
                    this.zzWVf.zzp();
                }
                this.zzWVf.zzp();
            }
        }
    }

    private void zzXSl() throws Exception {
        if (this.zzYTQ.getLists().zzYP1() == 0 && this.zzYTQ.getLists().getCount() == 0) {
            return;
        }
        this.zzWVf.zzY("w:lists");
        zzZr7();
        zzYhV();
        zzXSk();
        this.zzWVf.zzp();
    }

    private byte[] zzXSm() throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzY66 zzy66 = new zzY66();
        zzzor.zzH(16L);
        int iZzZ = zzy66.zzZ(this.zzYTQ, new com.aspose.words.internal.zzZOW(zzzor));
        zzzor.zzH(0L);
        com.aspose.words.internal.zzZYQ.zzZ(StyleIdentifier.PLAIN_TABLE_2, zzzor);
        com.aspose.words.internal.zzZYQ.zzZ(iZzZ, zzzor);
        com.aspose.words.internal.zzZYQ.zzZ(0, zzzor);
        com.aspose.words.internal.zzZYQ.zzZ(EditingLanguage.ENGLISH_US, zzzor);
        return zzzor.zzWy();
    }

    private void zzXSn() throws Exception {
        if (zzZO(this.zzYTQ)) {
            this.zzWVf.zzY("w:docSuppData");
            this.zzWVf.zzY("w:binData");
            this.zzWVf.zz0("w:name", "editdata.mso");
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            com.aspose.words.internal.zzZYQ.zzY("ActiveMime", zzzor);
            com.aspose.words.internal.zzZYQ.zzZ(-268369920, zzzor);
            com.aspose.words.internal.zzZYQ.zzZ(4, zzzor);
            com.aspose.words.internal.zzZYQ.zzZ(-1, zzzor);
            if (this.zzYTQ.hasMacros()) {
                com.aspose.words.internal.zzZYQ.zzZ(-267976704, zzzor);
                com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(this.zzYTQ.getVbaProject().zzXU3());
                com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
                zzkd.zzL(zzzor2);
                zzzor2.zzU(0L, 0);
                byte[] bArrZzT = com.aspose.words.internal.zzZRV.zzT(zzzor2, 1);
                byte[] signature = this.zzYTQ.getVbaProject().getSignature();
                if (signature == null) {
                    signature = new byte[0];
                }
                com.aspose.words.internal.zzZYQ.zzZ((int) ((((long) signature.length) & 4294967295L) + 20 + (4294967295L & ((long) bArrZzT.length))), zzzor);
                com.aspose.words.internal.zzZYQ.zzZ(4, zzzor);
                com.aspose.words.internal.zzZYQ.zzZ(4, zzzor);
                com.aspose.words.internal.zzZYQ.zzZ(signature.length, zzzor);
                com.aspose.words.internal.zzZYQ.zzZ(this.zzYTQ.zzZqB(), zzzor);
                zzzor.write(signature, 0, signature.length);
                com.aspose.words.internal.zzZYQ.zzZ((int) zzzor2.getLength(), zzzor);
                zzzor.write(bArrZzT, 0, bArrZzT.length);
            }
            if (zzZO(this.zzYTQ)) {
                com.aspose.words.internal.zzZYQ.zzZ(-267583488, zzzor);
                byte[] bArrZzXSm = zzXSm();
                com.aspose.words.internal.zzZYQ.zzZ(bArrZzXSm.length, zzzor);
                zzzor.write(bArrZzXSm, 0, bArrZzXSm.length);
            }
            com.aspose.words.internal.zzZYQ.zzZ(-267714560, zzzor);
            com.aspose.words.internal.zzZYQ.zzZ(4, zzzor);
            com.aspose.words.internal.zzZYQ.zzZ(2018915346, zzzor);
            this.zzWVf.zzX(zzzor);
            this.zzWVf.zzp();
            this.zzWVf.zzp();
        }
    }

    private void zzXSo() throws Exception {
        if (this.zzZFZ.zzYdg()) {
            this.zzWVf.zzY("w:docOleData");
            this.zzWVf.zzY("w:binData");
            this.zzWVf.zz0("w:name", "oledata.mso");
            this.zzWVf.zzX(this.zzWUB.zzXSH());
            this.zzWVf.zzp();
            this.zzWVf.zzp();
        }
    }

    private void zzXSp() {
        for (SmartTag smartTag : this.zzZFZ.zzXp1.zzl9()) {
            this.zzWVf.zzY("o:SmartTagType");
            this.zzWVf.zz0("o:namespaceuri", smartTag.getUri());
            this.zzWVf.zz0("o:name", smartTag.getElement());
            this.zzWVf.zzp();
        }
    }

    private void zzXSq() {
        Iterator<Map.Entry<K, V>> it = this.zzZFZ.zzXp4.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Integer num = (Integer) entry.getValue();
            this.zzWVf.zzX(com.aspose.words.internal.zzZKN.format("xmlns:{0}{1}", this.zzZFZ.zzXp3.get(num.intValue()).booleanValue() ? "st" : "ns", num), str);
        }
    }

    private void zzY(Section section) throws Exception {
        this.zzYOx = section;
        this.zzYOy = section.getBody().getLastParagraph();
        this.zzWVf.zzY("wx:sect");
        section.getBody().accept(this);
        if (this.zzYOx.zzYB3()) {
            zzYUJ.zzZ(this.zzYOx, this);
        }
        this.zzWVf.zzp();
    }

    private void zzYhV() throws Exception {
        for (int i = 0; i < this.zzYTQ.getLists().zzYP1(); i++) {
            zzZ4J zzz4jZzxs = this.zzYTQ.getLists().zzxs(i);
            this.zzWVf.zzY("w:listDef");
            this.zzWVf.zzZj("w:listDefId", i);
            this.zzWVf.zzYz("w:lsid", zzYU3.zzsV(zzz4jZzxs.zzYP8()));
            this.zzWVf.zzYz("w:plt", zzY1A.zzhT(zzz4jZzxs.zzYOR()));
            this.zzWVf.zzYz("w:tmpl", zzYU3.zzsV(zzz4jZzxs.zzYOQ()));
            this.zzWVf.zzYz("w:name", zzz4jZzxs.getName());
            if (zzz4jZzxs.isListStyleDefinition()) {
                this.zzWVf.zzYz("w:styleLink", this.zzWUB.zzFs(zzz4jZzxs.zzYOO()));
            }
            if (zzz4jZzxs.isListStyleReference()) {
                this.zzWVf.zzYz("w:listStyleLink", this.zzWUB.zzFs(zzz4jZzxs.zzYOO()));
            } else {
                for (int i2 = 0; i2 < zzz4jZzxs.zzYOP().getCount(); i2++) {
                    zzQ(zzz4jZzxs.zzYOP().get(i2));
                }
            }
            this.zzWVf.zzp();
        }
    }

    private void zzYtL() throws Exception {
        this.zzWVf.zzY("w:styles");
        this.zzWVf.zzYz("w:versionOfBuiltInStylenames", com.aspose.words.internal.zzJB.zzWF(7));
        zzXSj();
        StyleCollection styles = this.zzWUB.getDocument().getStyles();
        for (int i = 0; i < styles.getCount(); i++) {
            zzK(styles.get(i));
        }
        this.zzWVf.zzp();
    }

    private static boolean zzZO(Document document) {
        return document.hasMacros() || document.zzZqN();
    }

    private static boolean zzZd(Shape shape) {
        zzZBL zzzblZzYrB;
        if (shape.isInline() && shape.zzY9H() && (zzzblZzYrB = shape.zzYrB()) != null) {
            return (zzzblZzYrB instanceof zzYOC) || (zzzblZzYrB instanceof Forms2OleControl);
        }
        return false;
    }

    private void zzZm7() throws Exception {
        this.zzWVf.zzV(true);
        this.zzWVf.zzW("mso-application", "progid=\"Word.Document\"");
        this.zzWVf.zzY("w:wordDocument");
        this.zzWVf.zzX("xmlns:w", "http://schemas.microsoft.com/office/word/2003/wordml");
        this.zzWVf.zzX("xmlns:v", "urn:schemas-microsoft-com:vml");
        this.zzWVf.zzX("xmlns:w10", "urn:schemas-microsoft-com:office:word");
        this.zzWVf.zzX("xmlns:sl", "http://schemas.microsoft.com/schemaLibrary/2003/core");
        this.zzWVf.zzX("xmlns:aml", "http://schemas.microsoft.com/aml/2001/core");
        this.zzWVf.zzX("xmlns:wx", "http://schemas.microsoft.com/office/word/2003/auxHint");
        this.zzWVf.zzX("xmlns:o", "urn:schemas-microsoft-com:office:office");
        this.zzWVf.zzX("xmlns:dt", "uuid:C2F41010-65B3-11d1-A29F-00AA00C14882");
        if (this.zzWUB.zzXSI().zzYd6()) {
            this.zzWVf.zzX("xmlns:wsp", "http://schemas.microsoft.com/office/word/2003/wordml/sp2");
        }
        if (this.zzWUw) {
            this.zzWVf.zzX("xmlns:m", "http://schemas.openxmlformats.org/officeDocument/2006/math");
        }
        zzXSq();
        zzY1S zzy1s = this.zzWVf;
        boolean zZzZO = zzZO(this.zzYTQ);
        String str = TranslateLanguage.NORWEGIAN;
        zzy1s.zzX("w:macrosPresent", zZzZO ? "yes" : TranslateLanguage.NORWEGIAN);
        this.zzWVf.zzX("w:embeddedObjPresent", this.zzZFZ.zzYdg() ? "yes" : TranslateLanguage.NORWEGIAN);
        zzY1S zzy1s2 = this.zzWVf;
        if (this.zzZFZ.zzXp5) {
            str = "yes";
        }
        zzy1s2.zzX("w:ocxPresent", str);
        this.zzWVf.zzX("xml:space", "preserve");
        if (this.zzWUB.zzXSI().getExportGeneratorName()) {
            this.zzWVf.zzU(com.aspose.words.internal.zzZKN.format(" Generated by {0} ", "Aspose.Words for Android via Java 24.3.0"));
        }
        zzXSp();
        zzYVC.zzZ(this.zzYTQ, (com.aspose.words.internal.zzHW) this.zzWVf, false);
        zzY1E.zzZ(this.zzYTQ, this.zzWVf);
        zzYV3.zzZ(this.zzYTQ, this.zzWVf, false, "");
        zzXSl();
        zzYtL();
        if (this.zzZFZ.zzXoX) {
            zzYUH.zzY(this.zzYTQ, this.zzWVf);
        }
        zzXSo();
        zzXSn();
        zzZ(this.zzYTQ.getBackgroundShape(), this.zzWVf, this);
        zzY1N.zzZ(this);
        zzYUF.zzZ(this.zzWVf, this.zzZFZ, false);
        this.zzWVf.zzY("w:body");
        for (Node firstChild = this.zzYTQ.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            zzY((Section) firstChild);
        }
        this.zzWVf.zzp();
        this.zzWVf.endDocument();
    }

    private void zzZr7() throws Exception {
        for (int i = 0; i < this.zzYTQ.getLists().zzYP0(); i++) {
            Shape shapeZzxn = this.zzYTQ.getLists().zzxn(i);
            this.zzWVf.zzY("w:listPicBullet");
            this.zzWVf.zzZj("w:listPicBulletId", i);
            this.zzWVf.zzY("w:pict");
            zzY27.zzZ(shapeZzxn, this.zzWVf, this);
            this.zzWVf.zzp();
            this.zzWVf.zzp();
            this.zzWVf.zzp();
        }
    }

    private void zzm(ShapeBase shapeBase) throws Exception {
        this.zzWVf.zzp();
        this.zzWVb.zzT(shapeBase.zzZYh());
    }

    private void zzn(ShapeBase shapeBase) throws Exception {
        this.zzWVb.zzZ(shapeBase.zzZYh(), shapeBase);
        this.zzWVf.zzY("w:pict");
    }

    private String zzp(String str, String str2, String str3) {
        RefInt refInt = new RefInt(0);
        return this.zzZFZ.zzXp4.zzZ(str2, refInt) ? com.aspose.words.internal.zzZKN.format("{0}{1}:{2}", str, Integer.valueOf(refInt.get()), str3) : str3;
    }

    private void zzx(Paragraph paragraph) throws Exception {
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        zzYEF zzyefZzYp5 = paragraph.zzYp5();
        if (paragraph.zzZ0R() && !paragraph.zzRB(false).zzYOb()) {
            this.zzWUz = com.aspose.words.internal.zzJF.zzZI(paragraph.getListLabel().zzYOu());
            this.zzWUy = paragraph.getListLabel().getFont().getName();
        }
        boolean z = true;
        if (this.zzWUv && paragraph.isInCell()) {
            zzymxZzZYj = paragraph.zzqw(5);
            zzyefZzYp5 = paragraph.zzqv(1);
        }
        boolean zZzY = zzYUU.zzY(zzymxZzZYj, this);
        this.zzWUz = null;
        this.zzWUy = null;
        boolean z2 = zZzY || zzY0X.zzXSr().zzZ(zzyefZzYp5, paragraph, zZzY ^ true, this);
        if (paragraph == this.zzYOy && !this.zzYOx.zzYB3()) {
            if (z2) {
                z = z2;
            } else {
                this.zzWVf.zzY("w:pPr");
            }
            zzYUJ.zzZ(this.zzYOx, this);
            z2 = z;
        }
        if (z2) {
            this.zzWVf.zzo();
        }
    }

    @Override // com.aspose.words.zzZ9W
    public final int getCompliance() {
        return 0;
    }

    @Override // com.aspose.words.zzZ9W
    @ReservedForInternalUse
    @Deprecated
    public final DocumentBase getDocument() {
        return this.zzYTQ;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitAbsolutePositionTab(AbsolutePositionTab absolutePositionTab) throws Exception {
        zzT(65536, "Absolute position tabs are not supported in WordML, using regular tab character.");
        return super.visitAbsolutePositionTab(absolutePositionTab);
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitBookmarkEnd(BookmarkEnd bookmarkEnd) {
        int i = this.zzYOE.get(bookmarkEnd.getName());
        if (com.aspose.words.internal.zzZYI.zzWm(i)) {
            throw new IllegalStateException();
        }
        this.zzWVf.zzY("aml:annotation");
        this.zzWVf.zzZj("aml:id", i);
        this.zzWVf.zz0("w:type", "Word.Bookmark.End");
        BookmarkStart bookmarkStart = this.zzWUA.get(bookmarkEnd.getName());
        if (bookmarkStart != null) {
            this.zzWVf.zzZj("w:col-first", bookmarkStart.getFirstColumn());
            this.zzWVf.zzZj("w:col-last", bookmarkStart.getLastColumn());
        }
        this.zzWVf.zzp();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitBookmarkStart(BookmarkStart bookmarkStart) {
        int iZzZpW = zzZpW();
        this.zzYOE.add(bookmarkStart.getName(), iZzZpW);
        this.zzWVf.zzY("aml:annotation");
        this.zzWVf.zzZj("aml:id", iZzZpW);
        this.zzWVf.zz0("w:type", "Word.Bookmark.Start");
        this.zzWVf.zzX("w:name", bookmarkStart.getName());
        if (bookmarkStart.isColumn()) {
            this.zzWUA.zzW(bookmarkStart.getName(), bookmarkStart);
            this.zzWVf.zzZj("w:col-first", bookmarkStart.getFirstColumn());
            this.zzWVf.zzZj("w:col-last", bookmarkStart.getLastColumn());
        }
        this.zzWVf.zzp();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitCellEnd(Cell cell) {
        this.zzWVf.zzp();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitCellStart(Cell cell) throws Exception {
        this.zzWVf.zzY("w:tc");
        zzYVE.zzZ(cell.zz6G(), this);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitCommentEnd(Comment comment) throws Exception {
        this.zzWVf.zzp();
        this.zzWVf.zzp();
        this.zzWVb.zzT(comment.zzZYh());
        zzl(comment.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitCommentRangeEnd(CommentRangeEnd commentRangeEnd) {
        this.zzWVf.zzY("aml:annotation");
        this.zzWVf.zzZj("aml:id", zzFu(commentRangeEnd.getId()));
        this.zzWVf.zz0("w:type", "Word.Comment.End");
        this.zzWVf.zzp();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitCommentRangeStart(CommentRangeStart commentRangeStart) {
        this.zzWVf.zzY("aml:annotation");
        this.zzWVf.zzZj("aml:id", zzFu(commentRangeStart.getId()));
        this.zzWVf.zz0("w:type", "Word.Comment.Start");
        this.zzWVf.zzp();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitCommentStart(Comment comment) throws Exception {
        zzm(comment.zzZYh());
        this.zzWVb.zzZ(comment.zzZYh(), comment.zzZYh());
        this.zzWVf.zzY("aml:annotation");
        this.zzWVf.zzZj("aml:id", zzFu(comment.getId()));
        this.zzWVf.zz0("aml:author", comment.getAuthor());
        if (!com.aspose.words.internal.zzZQ9.zzZ(comment.zzZZU(), com.aspose.words.internal.zzZQ9.zz35)) {
            this.zzWVf.zzU("aml:createdate", comment.zzZZU());
        }
        this.zzWVf.zz0("w:type", "Word.Comment");
        this.zzWVf.zz0("w:initials", comment.getInitial());
        this.zzWVf.zzY("aml:content");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitEditableRangeEnd(EditableRangeEnd editableRangeEnd) {
        this.zzWVf.zzY("w:permEnd");
        this.zzWVf.zzZj("w:id", zzFu(editableRangeEnd.getId()));
        this.zzWVf.zzo();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitEditableRangeStart(EditableRangeStart editableRangeStart) {
        this.zzWVf.zzY("w:permStart");
        this.zzWVf.zzZj("w:id", zzFu(editableRangeStart.getId()));
        if (editableRangeStart.isColumn()) {
            this.zzWVf.zzZj("w:col-first", editableRangeStart.getFirstColumn());
            this.zzWVf.zzZj("w:col-last", editableRangeStart.getLastColumn());
        }
        this.zzWVf.zz0("w:ed", editableRangeStart.getSingleUser());
        this.zzWVf.zz0("w:edGrp", zzZXQ.zzFh(editableRangeStart.getEditorGroup()));
        this.zzWVf.zzo();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFieldEnd(FieldEnd fieldEnd) throws Exception {
        this.zzWUC.zzP(fieldEnd);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFieldSeparator(FieldSeparator fieldSeparator) throws Exception {
        this.zzWUC.zzP(fieldSeparator);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFieldStart(FieldStart fieldStart) throws Exception {
        this.zzWUC.zzP(fieldStart);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFootnoteEnd(Footnote footnote) throws Exception {
        this.zzWVf.zzp();
        if (!footnote.isAuto()) {
            zzZXR.zzZ(this.zzWVf, footnote);
        }
        this.zzWVb.zzT(footnote.zzZYh());
        zzl(footnote.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFootnoteStart(Footnote footnote) throws Exception {
        zzm(footnote.zzZYh());
        this.zzWVb.zzZ(footnote.zzZYh(), footnote.zzZYh());
        int footnoteType = footnote.getFootnoteType();
        if (footnoteType == 0) {
            this.zzWVb.zzEC(0);
            this.zzWVf.zzY("w:footnote");
        } else {
            if (footnoteType != 1) {
                throw new IllegalStateException("Unknown footnote type.");
            }
            this.zzWVb.zzEC(1);
            this.zzWVf.zzY("w:endnote");
        }
        this.zzWVf.zzw("w:suppressRef", !footnote.isAuto());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitGroupShapeEnd(GroupShape groupShape) throws Exception {
        zzY27.zzZ(groupShape, this.zzWVf);
        this.zzWVf.zzp();
        if (!groupShape.isTopLevel()) {
            return 0;
        }
        zzm(groupShape);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitGroupShapeStart(GroupShape groupShape) throws Exception {
        if (groupShape.isTopLevel()) {
            zzn(groupShape);
        }
        zzY27.zzZ(groupShape, this.zzWVf, this);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitOfficeMathEnd(OfficeMath officeMath) {
        zzZX6.zzZ(this.zzWVf);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    @ReservedForInternalUse
    @Deprecated
    public int visitOfficeMathStart(OfficeMath officeMath) throws Exception {
        zzZX6.zzZ(officeMath.zzZsL(), officeMath.zzZYh(), this);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitParagraphEnd(Paragraph paragraph) {
        this.zzWVf.zzp();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitParagraphStart(Paragraph paragraph) throws Exception {
        this.zzWVf.zzY("w:p");
        zzx(paragraph);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitRowEnd(Row row) {
        this.zzWVf.zzp();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitRowStart(Row row) throws Exception {
        this.zzWVf.zzY("w:tr");
        zzYUR.zzZ(row.zzZYf(), false, false, this);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitRun(Run run) throws Exception {
        if (this.zzWUC.zzYyP()) {
            return 0;
        }
        zzm(run.zzZYh());
        this.zzWVb.zzp(run);
        zzl(run.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitShapeEnd(Shape shape) throws Exception {
        if (shape.hasChildNodes()) {
            this.zzWVf.zzp();
            this.zzWVf.zzp();
        }
        if (!zzZd(shape)) {
            zzY27.zzZ(shape, this.zzWVf);
            this.zzWVf.zzp();
        }
        if (shape.zzZid()) {
            zzK(shape);
        }
        if (shape.isTopLevel()) {
            zzm(shape);
        }
        if (shape.zzY9C()) {
            this.zzWUC.zzZlN();
        }
        if (this.zzWUx) {
            shape.setShapeType(201);
        }
        zzl(shape.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitShapeStart(Shape shape) throws Exception {
        zzm(shape.zzZYh());
        if (shape.zzYbs()) {
            this.zzWUx = true;
            shape.setShapeType(75);
        } else {
            this.zzWUx = false;
        }
        if (shape.zzY9C()) {
            this.zzWUC.zzi(shape);
        }
        if (shape.isTopLevel()) {
            zzn(shape);
        }
        if (!zzZd(shape)) {
            zzY27.zzZ(shape, this.zzWVf, this);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitSmartTagEnd(SmartTag smartTag) {
        this.zzWVf.zzp();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitSmartTagStart(SmartTag smartTag) {
        this.zzWVf.zzY(zzp("st", smartTag.getUri(), smartTag.getElement()));
        for (CustomXmlProperty customXmlProperty : smartTag.getProperties()) {
            this.zzWVf.zz0(zzp("st", customXmlProperty.getUri(), customXmlProperty.getName()), customXmlProperty.getValue());
        }
        this.zzWVf.zzx("w:st", true);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitSpecialChar(SpecialChar specialChar) throws Exception {
        this.zzWVb.zzW(specialChar);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitStructuredDocumentTagStart(StructuredDocumentTag structuredDocumentTag) throws Exception {
        zzT(65536, "Structured document tag is not supported in WordML format, during conversion only the plain content is retained.");
        return super.visitStructuredDocumentTagStart(structuredDocumentTag);
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitSubDocument(SubDocument subDocument) {
        this.zzWVf.zzY("w:subDoc");
        this.zzWVf.zz0("w:link", subDocument.getFileName());
        this.zzWVf.zzo();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitTableEnd(Table table) {
        this.zzWVf.zzp();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitTableStart(Table table) throws Exception {
        this.zzWVf.zzY("w:tbl");
        zzYUR.zzZ(table.getFirstRow().zzZYf(), true, false, this);
        table.zzXZZ();
        zzYUA.zzZ(this.zzWVf, table);
        return 0;
    }

    @Override // com.aspose.words.zzZ9W
    public final String zzFs(int i) {
        return this.zzWUB.zzFs(i);
    }

    @Override // com.aspose.words.zzZ8U
    public final String zzFt(int i) {
        if (this.zzYOu == null) {
            this.zzYOu = new com.aspose.words.internal.zzD3<>();
            Iterator<T> it = this.zzYTQ.getChildNodes(18, true).iterator();
            while (it.hasNext()) {
                String name = ((ShapeBase) it.next()).getName();
                if (com.aspose.words.internal.zzZKN.zzS(name, "_s", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                    this.zzYOu.set(zzY23.zzyW(name), name);
                }
            }
        }
        return this.zzYOu.get(i);
    }

    @Override // com.aspose.words.zzZ8U
    public final String zzNH(String str) {
        return str;
    }

    @Override // com.aspose.words.zzZ9W
    public final void zzT(int i, String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, i, 13, str);
        }
    }

    public final boolean zzXSe() {
        return this.zzWUv;
    }

    public final zzY1P zzXSf() {
        return this.zzWUB;
    }

    public final void zzXSg() {
        this.zzWUw = true;
    }

    public final boolean zzXSh() {
        return this.zzWUw;
    }

    @Override // com.aspose.words.zzZ8U
    public final String zzYn(byte[] bArr) throws Exception {
        String str;
        com.aspose.words.internal.zzXC zzxcZz3 = com.aspose.words.internal.zzIL.zz3(bArr);
        String strZzX = this.zzYN7.zzX(zzxcZz3);
        if (strZzX != null) {
            return strZzX;
        }
        int iZzZU = com.aspose.words.internal.zzEF.zzZU(bArr);
        String str2 = HiAnalyticsConstant.KeyAndValue.NUMBER_01;
        switch (iZzZU) {
            case 2:
                bArr = zzY23.zzXD(bArr);
                str2 = "06";
                str = "emz";
                break;
            case 3:
                bArr = zzY23.zzXD(bArr);
                str2 = "08";
                str = "wmz";
                break;
            case 4:
                bArr = zzY23.zzXF(bArr);
                str2 = "0A";
                str = "pcz";
                break;
            case 5:
                str2 = "02";
                str = "jpg";
                break;
            case 6:
                str2 = "03";
                str = "png";
                break;
            case 7:
                str = "bmp";
                break;
            case 8:
            default:
                throw new IllegalStateException("Unrecognized image type encountered during WordML export.");
            case 9:
                str = "gif";
                break;
        }
        String strZzY = zzY(str2, str, bArr);
        this.zzYN7.zzZ(zzxcZz3, strZzY);
        return strZzY;
    }

    @Override // com.aspose.words.zzZ9W
    public final void zzZ(zzZ9W zzz9w, zzYEF zzyef) {
    }

    @Override // com.aspose.words.zzZ8U
    public final boolean zzZlT() {
        return this.zzWUC.zzZlT();
    }

    public final boolean zzZlU() {
        return this.zzWUC.zzZlU();
    }

    @Override // com.aspose.words.zzZ9W
    public final String zzZm0() {
        return this.zzWUy;
    }

    @Override // com.aspose.words.zzZ9W
    public final String zzZm1() {
        return this.zzWUz;
    }

    @Override // com.aspose.words.zzZ9W
    @ReservedForInternalUse
    @Deprecated
    public final zzYU6 zzZm2() {
        return this.zzWVf;
    }

    @Override // com.aspose.words.zzZ8U
    public final String zzZm3() {
        return "o:href";
    }

    @Override // com.aspose.words.zzZ8U
    public final String zzZm4() {
        return "src";
    }

    @Override // com.aspose.words.zzZ8U
    public final ArrayList<String> zzZmM() {
        if (this.zzYPl == null) {
            this.zzYPl = new ArrayList<>();
        }
        return this.zzYPl;
    }

    @Override // com.aspose.words.zzZ8U, com.aspose.words.zzZ9W
    public final boolean zzZmh() {
        return false;
    }

    @Override // com.aspose.words.zzZ9W
    @ReservedForInternalUse
    @Deprecated
    public final int zzZpW() {
        int i = this.zzkw;
        this.zzkw = i + 1;
        return i;
    }

    @Override // com.aspose.words.zzZ8U
    public final zzYDZ zzZqS() {
        return this.zzZFZ;
    }

    @Override // com.aspose.words.zzZ8U
    public final String zzf(com.aspose.words.internal.zzPV zzpv) {
        String strZzf = zzY35.zzf(zzpv);
        if (strZzf == null) {
            zzT(256, com.aspose.words.internal.zzZKN.format("Unsupported color type encountered during {0} export: {1}.", "WordML", com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("0x", com.aspose.words.internal.zzJB.zzWs(new com.aspose.words.internal.zzPV((~zzpv.zzPD()) & 255, zzpv).toArgb()))));
        }
        return strZzf;
    }

    public final void zzl(zzYEF zzyef) throws Exception {
        if (zzyef.zzYrV()) {
            this.zzWVf.zzZmP();
        }
        if (zzyef.zzYrW()) {
            this.zzWVf.zzZmP();
        }
        if (zzyef.zzXS4()) {
            this.zzWVf.zzZmP();
        }
        if (zzyef.zzXS3()) {
            this.zzWVf.zzZmP();
        }
    }

    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        this.zzZFZ = zzydz;
        zzydz.zzYdf();
        Document document = zzydz.zzYfy;
        this.zzYTQ = document;
        this.zzZG0 = document.getWarningCallback();
        zzY1S zzy1s = new zzY1S(zzydz.zzXpb, zzydz.zzXpa.getPrettyFormat(), this.zzZG0);
        this.zzWVf = zzy1s;
        this.zzWUB = new zzY1P(zzydz, zzy1s);
        zzY0V zzy0v = new zzY0V(this);
        this.zzWVb = zzy0v;
        this.zzWUC = new zzY1H(this, zzy0v);
        this.zzWUA = new com.aspose.words.internal.zzZYG<>(false);
        this.zzYOE = new com.aspose.words.internal.zzZYI(false);
        this.zzWUv = this.zzYTQ.getStyles().zzYec();
        this.zzX91 = new zzYEF();
        this.zzYTQ.getStyles().zzY37().zzZ(this.zzX91, zzYEF.zzXq6);
        zzn(this.zzX91);
        zzZm7();
        return new SaveOutputParameters("text/xml");
    }

    private void zzn(zzYEF zzyef) {
        Theme themeZzZqI = this.zzYTQ.zzZqI();
        for (int i : zzYEF.zzXq6) {
            zzU1 zzu1 = zzyef.contains(i) ? (zzU1) zzyef.get(i) : null;
            if (zzu1 != null && zzu1.zzZYI()) {
                zzyef.zzQ(i, zzU1.zzSP(zzU1.zzZ((zzU1) zzyef.get(i), themeZzZqI)));
            }
        }
    }

    public final void zzm(zzYEF zzyef) throws Exception {
        if (zzyef.zzYrV()) {
            this.zzWVf.zzZ(zzyef.getInsertRevision(), zzZpW());
        }
        if (zzyef.zzYrW()) {
            this.zzWVf.zzZ(zzyef.getDeleteRevision(), zzZpW());
        }
        if (zzyef.zzXS4()) {
            zzXSi();
            this.zzWVf.zzZ(zzyef.getMoveFromRevision(), zzZpW());
        }
        if (zzyef.zzXS3()) {
            zzXSi();
            this.zzWVf.zzZ(zzyef.getMoveToRevision(), zzZpW());
        }
    }

    @Override // com.aspose.words.zzZ9W
    @ReservedForInternalUse
    @Deprecated
    public final void zzY(zzZS zzzs, boolean z) throws Exception {
        new zzY1D(0, this).zzY(zzzs, z);
        new zzY1D(1, this).zzY(zzzs, z);
    }

    private String zzY(String str, String str2, byte[] bArr) {
        String strZzWt = com.aspose.words.internal.zzJB.zzWt(this.zzWUD);
        this.zzWUD++;
        String str3 = com.aspose.words.internal.zzZKN.format("wordml://{0}{1}.{2}", str, strZzWt, str2);
        this.zzWVf.zzY("w:binData");
        this.zzWVf.zz0("w:name", str3);
        this.zzWVf.zzZ(bArr, bArr.length);
        this.zzWVf.zzp();
        return str3;
    }

    private static void zzZ(Shape shape, zzYU6 zzyu6, zzZ8U zzz8u) throws Exception {
        if (Shape.zzZG(shape)) {
            zzyu6.zzY("w:bgPict");
            zzyu6.zzY("w:background");
            zzyu6.zzX("w:bgcolor", zzY35.zzZ(shape.zzY9J().zz8Q(), false, true));
            zzyu6.zzp();
            zzY27.zzZ(shape, true, zzyu6, zzz8u);
            zzyu6.zzp();
            zzyu6.zzp();
        }
    }

    @Override // com.aspose.words.zzZ9W
    public final void zzZ(HeaderFooter headerFooter) throws Exception {
        if (headerFooter.isLinkedToPrevious()) {
            return;
        }
        this.zzWVf.zzY(headerFooter.isHeader() ? "w:hdr" : "w:ftr");
        this.zzWVf.zz0("w:type", zzYUL.zzZB(headerFooter.getHeaderFooterType(), false));
        headerFooter.accept(this);
        this.zzWVf.zzp();
    }

    private String zzZ(String str, String str2, com.aspose.words.internal.zzZOR zzzor) throws Exception {
        return zzY(str, str2, zzzor.zzWy());
    }

    private void zzK(Shape shape) throws Exception {
        shape.zzZid();
        int shapeType = shape.getShapeType();
        if (shapeType == -2) {
            zzJ(shape);
        } else {
            if (shapeType != 201) {
                return;
            }
            zzI(shape);
        }
    }
}
