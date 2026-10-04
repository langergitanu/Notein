package com.aspose.words;

import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY19 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("listPicBullet", "listDef", "list", "pict", "listDefId", "lsid", "plt", "tmpl", "name", "styleLink", "listStyleLink", "lvl", "tplc", "tentative", "start", "nfc", "lvlRestart", "pStyle", "isLgl", "suff", "lvlText", "lvlPicBulletId", "legacy", "lvlJc", "pPr", "rPr", "val", CloudMetaExtra.DEFINE_NON_PARENT_ID, "legacySpace", "legacyIndent", "ilst", "lvlOverride", "startOverride");
    private zzY14 zzWV7;
    private zzY0Y zzWV8;
    private zzZ9X zzYNv;

    public zzY19(zzY0Y zzy0y, zzY14 zzy14, zzZ9X zzz9x) {
        this.zzWV8 = zzy0y;
        this.zzWV7 = zzy14;
        this.zzYNv = zzz9x;
    }

    public static void zzT(zzY12 zzy12) {
        for (Map.Entry<zzZ4J, String> entry : zzy12.zzXSA().entrySet()) {
            entry.getKey().zzxh(zzy12.zzJ(entry.getValue(), 12));
        }
        for (Map.Entry<ListLevel, String> entry2 : zzy12.zzXSz().entrySet()) {
            entry2.getKey().zzx2(zzy12.zzJ(entry2.getValue(), StyleIdentifier.NIL));
        }
    }

    private void zzU(zzY12 zzy12) throws Exception {
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        List list = new List(zzy12.getDocument(), zzyu4ZzZsD.zzX("ilfo", 0));
        while (zzyu4ZzZsD.zzQ("list")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 30) {
                zzZ4J zzz4j = (zzZ4J) com.aspose.words.internal.zzQW.zzZ((Map<Integer, TValue>) zzy12.zzYz5(), Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                if (zzz4j != null) {
                    list.zzxB(zzz4j.zzYP8());
                }
            } else if (iZzTP != 31) {
                zzyu4ZzZsD.zzk();
            } else {
                zzZ4B zzz4b = new zzZ4B(zzy12.getDocument(), zzyu4ZzZsD.zzX("ilvl", 0));
                zzz4b.zzYbX = false;
                zzz4b.zzYbW = false;
                while (zzyu4ZzZsD.zzQ("lvlOverride")) {
                    int iZzTP2 = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                    if (iZzTP2 == 11) {
                        zzz4b.zzYbW = true;
                        zzZ(zzz4b.getListLevel(), zzy12);
                    } else if (iZzTP2 != 32) {
                        zzyu4ZzZsD.zzk();
                    } else {
                        zzz4b.zzYbX = true;
                        zzz4b.zzYbY = zzyu4ZzZsD.zzYyE();
                    }
                }
                list.zzYPb().zzZ(zzz4b);
            }
        }
        zzy12.getDocument().getLists().zzQ(list);
    }

    private void zzV(zzY12 zzy12) throws Exception {
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        int iZzb = 0;
        while (zzyu4ZzZsD.zzi()) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) == 4) {
                iZzb = zzyu4ZzZsD.zzb();
            }
        }
        int iZzyF = 2;
        int iZzGT = 0;
        int iZzGT2 = 0;
        boolean z = false;
        int i = 0;
        zzZ4J zzz4j = null;
        String strZzV = null;
        String strZzV2 = null;
        while (zzyu4ZzZsD.zzQ("listDef")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 5:
                    iZzGT = zzYU3.zzGT(zzyu4ZzZsD.zzV("val", null));
                    z = true;
                    break;
                case 6:
                    iZzyF = zzY1A.zzyF(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 7:
                    iZzGT2 = zzYU3.zzGT(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 8:
                    strZzV = zzyu4ZzZsD.zzV("val", null);
                    break;
                case 9:
                    strZzV2 = zzyu4ZzZsD.zzV("val", null);
                    break;
                case 10:
                    strZzV2 = zzyu4ZzZsD.zzV("val", null);
                    break;
                case 11:
                    if (zzz4j == null) {
                        zzz4j = new zzZ4J(zzy12.getDocument(), iZzGT, iZzyF, iZzGT2);
                        zzz4j.setName(strZzV);
                    }
                    int iZzX = zzyu4ZzZsD.zzX("ilvl", 0);
                    if (iZzX != -1 || i <= 0) {
                        if (iZzX == -1) {
                            iZzX = 0;
                        }
                        zzZ(zzz4j.zzYOP().get(iZzX), zzy12);
                    } else {
                        zzz4j.zzYOP().get(0).setNumberStyle(255);
                        zzz4j.zzYOP().get(0).zzxb(-1);
                        zzz4j.zzYOP().get(0).setNumberFormat("");
                        zzz4j.zzYOP().get(0).zzZYj().clear();
                        zzy12.zzZsD().zzk();
                    }
                    i++;
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
        zzZ4J zzz4jZzxr = zzy12.getDocument().getLists().zzxr(iZzGT);
        if (zzz4jZzxr != null) {
            zzy12.zzYz5().put(Integer.valueOf(iZzb), zzz4jZzxr);
            return;
        }
        if (zzz4j == null) {
            zzz4j = new zzZ4J(zzy12.getDocument(), iZzGT, iZzyF, iZzGT2);
            zzz4j.setName(strZzV);
        }
        if (!z) {
            zzz4j.zzxB(zzy12.getDocument().getLists().zzYP4());
        }
        if (strZzV2 != null) {
            zzy12.zzXSA().put(zzz4j, strZzV2);
        }
        zzy12.getDocument().getLists().zzZ(zzz4j);
        zzy12.zzYz5().put(Integer.valueOf(iZzb), zzz4j);
    }

    private void zzW(zzY12 zzy12) throws Exception {
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        if (zzyu4ZzZsD.zzX("listPicBulletId", 0) != zzy12.getDocument().getLists().zzYP0()) {
            throw new IllegalStateException("Picture bullet ids out of sequence are not yet supported.");
        }
        while (zzyu4ZzZsD.zzQ("listPicBullet")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 3) {
                zzyu4ZzZsD.zzk();
            } else {
                zzZ9X zzz9x = this.zzYNv;
                if (zzz9x == null) {
                    zzyu4ZzZsD.zzk();
                } else {
                    Iterator<ShapeBase> it = zzz9x.zzZ(zzy12).iterator();
                    while (it.hasNext()) {
                        zzy12.getDocument().getLists().zzo((Shape) it.next());
                    }
                }
            }
        }
    }

    private static String zzyE(String str) {
        int i = 0;
        while (i < 10) {
            StringBuilder sb = new StringBuilder("%");
            int i2 = i + 1;
            sb.append(i2);
            str = str.replace(sb.toString(), Character.toString((char) i));
            i = i2;
        }
        return str;
    }

    public final void zzZ(zzY12 zzy12) throws Exception {
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        if (zzy12.zzYyZ().zzZrB()) {
            zzyu4ZzZsD.zzYyH();
            return;
        }
        while (zzyu4ZzZsD.zzQ("lists")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                zzW(zzy12);
            } else if (iZzTP == 1) {
                zzV(zzy12);
            } else if (iZzTP != 2) {
                zzyu4ZzZsD.zzk();
            } else {
                zzU(zzy12);
            }
        }
    }

    private void zzZ(ListLevel listLevel, zzY12 zzy12) throws Exception {
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        boolean zZz8 = false;
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 12) {
                zzYU3.zzGT(zzyu4ZzZsD.getValue());
            } else if (iZzTP == 13) {
                zZz8 = zzyu4ZzZsD.zz8();
            }
        }
        listLevel.zzYcc = zZz8;
        listLevel.setStartAt(0);
        while (zzyu4ZzZsD.zzQ("lvl")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 14:
                    listLevel.zzxc(zzyu4ZzZsD.zzYyE());
                    break;
                case 15:
                    listLevel.setNumberStyle(zzyu4ZzZsD.zzYyE());
                    break;
                case 16:
                    listLevel.zzxb(zzyu4ZzZsD.zzYyE() - 1);
                    break;
                case 17:
                    zzy12.zzXSz().put(listLevel, zzyu4ZzZsD.zzV("val", null));
                    break;
                case 18:
                    listLevel.isLegal(zzyu4ZzZsD.zzYyD());
                    break;
                case 19:
                    listLevel.setTrailingCharacter(zzY1A.zzyG(zzyu4ZzZsD.zzV("val", null)));
                    break;
                case 20:
                    while (zzyu4ZzZsD.zzi()) {
                        int iZzTP2 = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                        if (iZzTP2 == 26) {
                            listLevel.zzJ8(zzyE(zzyu4ZzZsD.getValue()));
                        } else if (iZzTP2 != 27) {
                            zzyu4ZzZsD.zzZ(65536, 13, zzyu4ZzZsD.getLocalName());
                        } else if (zzyu4ZzZsD.zz8()) {
                            listLevel.zzJ8("");
                        }
                    }
                    break;
                case 21:
                    listLevel.zzzp(zzyu4ZzZsD.zzYyE());
                    break;
                case 22:
                    while (zzyu4ZzZsD.zzi()) {
                        int iZzTP3 = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                        if (iZzTP3 == 22) {
                            listLevel.zzUI(zzyu4ZzZsD.zz8());
                        } else if (iZzTP3 == 28) {
                            listLevel.zzx1(zzyu4ZzZsD.zzb());
                        } else if (iZzTP3 != 29) {
                            zzyu4ZzZsD.zzZ(65536, 13, zzyu4ZzZsD.getLocalName());
                        } else {
                            listLevel.zzx0(zzyu4ZzZsD.zzb());
                        }
                    }
                    break;
                case 23:
                    listLevel.setAlignment(zzY1A.zzyH(zzyu4ZzZsD.zzV("val", null)));
                    break;
                case 24:
                    this.zzWV7.zzY(zzy12, listLevel.zzZYj(), listLevel.zzZYh());
                    break;
                case 25:
                    this.zzWV8.zzW(zzy12, listLevel.zzZYh());
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }
}
