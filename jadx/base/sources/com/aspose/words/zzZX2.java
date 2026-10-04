package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZX2 {
    public static void zzU(zzZXR zzzxr) throws Exception {
        DocumentBase document = zzzxr.getDocument();
        if (document.getLists().zzYP1() == 0 && document.getLists().getCount() == 0) {
            return;
        }
        zzZYD zzzydZzJ = zzzxr.zzJ("numbering.xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.numbering+xml", zzzxr.zzZmp().zzZkR());
        zzzxr.zzY(zzzydZzJ);
        zzzydZzJ.zzNU("w:numbering");
        zzY(document, zzzxr);
        zzX(document, zzzxr);
        zzW(document, zzzxr);
        zzZ(document, zzzxr);
        zzzydZzJ.endDocument();
        zzzxr.zzZlX();
    }

    private static void zzW(DocumentBase documentBase, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (List list : documentBase.getLists()) {
            int iZzxp = documentBase.getLists().zzxp(list.zzYP8());
            if (iZzxp >= 0) {
                zzzydZzZlV.zzY("w:num");
                zzzydZzZlV.zzZj("w:numId", list.getListId());
                if (list.zzZZS() != 0 && zzzxr.zzZlO() >= 16) {
                    zzzydZzZlV.zzZj("w16cid:durableId", list.zzZZS());
                }
                zzzydZzZlV.zzZl("w:abstractNumId", iZzxp);
                for (zzZ4B zzz4b : list.zzYPb()) {
                    zzzydZzZlV.zzY("w:lvlOverride");
                    zzzydZzZlV.zzZj("w:ilvl", zzz4b.getListLevel().zzYOa());
                    if (zzz4b.zzYbX) {
                        zzzydZzZlV.zzv("w:startOverride", zzz4b.zzYbY, 0);
                    }
                    if (zzz4b.zzYbW) {
                        zzZ(zzz4b.getListLevel(), zzzxr);
                    }
                    zzzydZzZlV.zzp();
                }
                zzzydZzZlV.zzp();
            }
        }
    }

    private static void zzX(DocumentBase documentBase, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() != 0;
        for (int i = 0; i < documentBase.getLists().zzYP1(); i++) {
            zzZ4J zzz4jZzxs = documentBase.getLists().zzxs(i);
            zzzydZzZlV.zzY("w:abstractNum");
            zzzydZzZlV.zzZj("w:abstractNumId", i);
            if (zzz4jZzxs.isRestartAtEachSection() && z) {
                zzzydZzZlV.zzx("w15:restartNumberingAfterBreak", zzz4jZzxs.isRestartAtEachSection());
            }
            zzzydZzZlV.zzYz("w:nsid", zzYU3.zzsV(zzz4jZzxs.zzYP8()));
            zzzydZzZlV.zzYz("w:multiLevelType", zzZX4.zzEE(zzz4jZzxs.zzYOR()));
            zzzydZzZlV.zzYz("w:tmpl", zzYU3.zzsV(zzz4jZzxs.zzYOQ()));
            zzzydZzZlV.zzYz("w:name", zzz4jZzxs.getName());
            if (zzz4jZzxs.isListStyleDefinition()) {
                zzzydZzZlV.zzYz("w:styleLink", zzzxr.zzFs(zzz4jZzxs.zzYOO()));
            }
            if (zzz4jZzxs.isListStyleReference()) {
                zzzydZzZlV.zzYz("w:numStyleLink", zzzxr.zzFs(zzz4jZzxs.zzYOO()));
            } else {
                for (int i2 = 0; i2 < zzz4jZzxs.zzYOP().getCount(); i2++) {
                    zzZ(zzz4jZzxs.zzYOP().get(i2), zzzxr);
                }
            }
            zzzydZzZlV.zzp();
        }
    }

    private static void zzY(DocumentBase documentBase, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (int i = 0; i < documentBase.getLists().zzYP0(); i++) {
            Shape shapeZzxn = documentBase.getLists().zzxn(i);
            zzzydZzZlV.zzY("w:numPicBullet");
            zzzydZzZlV.zzZj("w:numPicBulletId", i);
            if (shapeZzxn.zzY9n() != null) {
                zzzxr.zzp(shapeZzxn);
            }
            if (shapeZzxn.getMarkupLanguage() == 1) {
                zzzydZzZlV.zzY("w:pict");
                zzY27.zzZ(shapeZzxn, false, zzzydZzZlV, zzzxr);
                zzzydZzZlV.zzp();
                zzzydZzZlV.zzp();
            } else {
                zz8H.zzZ(shapeZzxn, zzzxr);
                zz8H.zzS(shapeZzxn, zzzxr);
            }
            if (shapeZzxn.zzY9n() != null) {
                zzzxr.zzo(shapeZzxn);
            }
            zzzydZzZlV.zzp();
        }
    }

    private static void zzZ(DocumentBase documentBase, zzZXR zzzxr) {
        Object objZzYOZ = documentBase.getLists().zzYOZ();
        if (objZzYOZ != null) {
            zzzxr.zzZlV().zzQ("w:numIdMacAtCleanup", (Integer) objZzYOZ);
        }
    }

    private static void zzZ(ListLevel listLevel, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("w:lvl");
        zzzydZzZlV.zzZj("w:ilvl", listLevel.zzYOa());
        zzzydZzZlV.zz0("w:tentative", listLevel.zzYcc ? "1" : "");
        zzzydZzZlV.zzZl("w:start", listLevel.getStartAt());
        zzY(listLevel, zzzxr);
        if (listLevel.zzYO9()) {
            zzzydZzZlV.zzZl("w:lvlRestart", listLevel.getRestartAfterLevel() + 1);
        }
        if (listLevel.zzYOc() != 12287) {
            zzzydZzZlV.zzYz("w:pStyle", zzzxr.zzFs(listLevel.zzYOc()));
        }
        zzzydZzZlV.zze("w:isLgl", listLevel.isLegal());
        if (listLevel.getTrailingCharacter() != 0) {
            zzzydZzZlV.zzYz("w:suff", zzZX4.zzEF(listLevel.getTrailingCharacter()));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(listLevel.getNumberFormat())) {
            zzzydZzZlV.zzY("w:lvlText");
            zzzydZzZlV.zzX("w:val", zzYU3.zzGW(listLevel.getNumberFormat()));
            zzzydZzZlV.zzp();
        }
        if (listLevel.zzYOb()) {
            zzzydZzZlV.zzZl("w:lvlPicBulletId", listLevel.zzZ0p());
        }
        if (listLevel.getLegacy()) {
            zzzydZzZlV.zzX("w:legacy", "w:legacy", Boolean.valueOf(listLevel.getLegacy()), "w:legacySpace", Integer.valueOf(listLevel.zzYO6()), "w:legacyIndent", Integer.valueOf(listLevel.zzYO5()));
        }
        zzzydZzZlV.zzYz("w:lvlJc", zzZX4.zz1(listLevel.getAlignment(), zzzxr.getCompliance() == 2));
        zzYUU.zzZ(listLevel.zzZYj(), zzzxr);
        zzYUO.zzZ(listLevel.zzZYh(), listLevel.zzZYh(), zzzxr);
        zzzydZzZlV.zzp();
    }

    private static void zzY(ListLevel listLevel, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        if (listLevel.getNumberStyle() == 65280) {
            zzzydZzZlV.zzY("mc:AlternateContent");
            zzzydZzZlV.zzY("mc:Choice");
            zzzydZzZlV.zz0("Requires", "w14");
            zzzydZzZlV.zzX("w:numFmt", "w:val", zzZXP.zzFa(listLevel.getNumberStyle()), "w:format", com.aspose.words.internal.zzZYD.zzXk(listLevel.zzYOe()) ? listLevel.zzYOe() : null);
            zzzydZzZlV.zzo();
            zzzydZzZlV.zzY("mc:Fallback");
            zzzydZzZlV.zzYz("w:numFmt", zzZXP.zzFa(0));
            zzzydZzZlV.zzo();
            zzzydZzZlV.zzo();
            return;
        }
        zzzydZzZlV.zzYz("w:numFmt", zzZXP.zzFa(listLevel.getNumberStyle()));
    }
}
