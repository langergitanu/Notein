package com.aspose.words;

import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZX3 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("numPicBullet", "abstractNum", "num", "numIdMacAtCleanup", "pict", "AlternateContent", "drawing", "abstractNumId", "restartNumberingAfterBreak", "nsid", "multiLevelType", "tmpl", "name", "styleLink", "numStyleLink", "lvl", "tplc", "tentative", "start", "numFmt", "lvlRestart", "pStyle", "isLgl", "suff", "lvlText", "lvlPicBulletId", "legacy", "lvlJc", "pPr", "rPr", "val", CloudMetaExtra.DEFINE_NON_PARENT_ID, "legacySpace", "legacyIndent", "Choice", "Fallback", "Requires", "lvlOverride", "startOverride");
    private boolean zzYNu;
    private zzZ9X zzYNv;
    private zzZWS zzYNw;
    private zzZX1 zzYNx;

    public zzZX3(zzZX1 zzzx1, zzZWS zzzws, zzZ9X zzz9x) {
        this.zzYNx = zzzx1;
        this.zzYNw = zzzws;
        this.zzYNv = zzz9x;
    }

    private static String zzMM(String str) {
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

    private boolean zzW(ListLevel listLevel, zzZXT zzzxt) throws Exception {
        boolean z;
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        loop0: while (true) {
            z = false;
            while (zzyu4ZzZsD.zzi()) {
                if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 36) {
                    zzyu4ZzZsD.zzZ(16777216, 9, zzyu4ZzZsD.getLocalName());
                } else {
                    String value = zzyu4ZzZsD.getValue();
                    if (!com.aspose.words.internal.zzZYD.zzXk(value) || !zzYUN.zzHe(zzyu4ZzZsD.zzM(value))) {
                        break;
                    }
                    z = true;
                }
            }
        }
        zzyu4ZzZsD.zzj();
        if (z) {
            zzY(listLevel, zzzxt);
            return z;
        }
        zzyu4ZzZsD.zzk();
        return z;
    }

    private void zzX(ListLevel listLevel, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        boolean zZzW = false;
        while (zzyu4ZzZsD.zzQ("AlternateContent")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 34) {
                zZzW = zzW(listLevel, zzzxt);
            } else if (iZzTP != 35) {
                zzyu4ZzZsD.zzT(16777216, 9, zzyu4ZzZsD.getLocalName());
            } else if (zZzW) {
                zzyu4ZzZsD.zzYyH();
            } else {
                zzY(listLevel, zzzxt);
            }
        }
    }

    private void zzY(ListLevel listLevel, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        String localName = zzyu4ZzZsD.getLocalName();
        this.zzYNu = false;
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 5) {
                switch (iZzTP) {
                    case 18:
                        listLevel.zzxc(zzyu4ZzZsD.zzYyE());
                        this.zzYNu = true;
                        break;
                    case 19:
                        listLevel.setNumberStyle(zzZXP.zzNm(zzyu4ZzZsD.zzV("val", null)));
                        if (listLevel.getNumberStyle() == 65280) {
                            listLevel.zzJ4(zzyu4ZzZsD.zzV("format", ""));
                        }
                        break;
                    case 20:
                        listLevel.zzxb(zzyu4ZzZsD.zzYyE() - 1);
                        break;
                    case 21:
                        listLevel.zzx2(zzzxt.zzJ(zzyu4ZzZsD.zzV("val", null), StyleIdentifier.NIL));
                        break;
                    case 22:
                        listLevel.isLegal(zzyu4ZzZsD.zzYyD());
                        break;
                    case 23:
                        listLevel.setTrailingCharacter(zzZX4.zzMO(zzyu4ZzZsD.zzV("val", null)));
                        break;
                    case 24:
                        while (zzyu4ZzZsD.zzi()) {
                            int iZzTP2 = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                            if (iZzTP2 == 30) {
                                listLevel.zzJ8(zzMM(zzyu4ZzZsD.getValue()));
                            } else if (iZzTP2 == 31 && zzyu4ZzZsD.zz8()) {
                                listLevel.zzJ8("");
                            }
                        }
                        break;
                    case 25:
                        listLevel.zzzp(zzyu4ZzZsD.zzYyE());
                        int iIndexOf = zzzxt.zzZmd().indexOf(Integer.valueOf(listLevel.zzZ0p()));
                        if (iIndexOf >= 0) {
                            listLevel.zzzp(iIndexOf);
                        }
                        break;
                    case 26:
                        while (zzyu4ZzZsD.zzi()) {
                            int iZzTP3 = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                            if (iZzTP3 == 26) {
                                listLevel.zzUI(zzyu4ZzZsD.zz8());
                            } else if (iZzTP3 == 32) {
                                listLevel.zzx1(zzyu4ZzZsD.zzT(zzyo3ZzZqn));
                            } else if (iZzTP3 != 33) {
                                zzyu4ZzZsD.getLocalName();
                            } else {
                                listLevel.zzx0(zzyu4ZzZsD.zzT(zzyo3ZzZqn));
                            }
                        }
                        break;
                    case 27:
                        listLevel.setAlignment(zzZX4.zzW(zzyu4ZzZsD.zzV("val", null), zzyo3ZzZqn));
                        break;
                    case 28:
                        this.zzYNx.zzY(zzzxt, listLevel.zzZYj(), listLevel.zzZYh());
                        break;
                    case 29:
                        this.zzYNw.zzW(zzzxt, listLevel.zzZYh());
                        break;
                    default:
                        zzyu4ZzZsD.zzk();
                        break;
                }
            } else {
                zzX(listLevel, zzzxt);
            }
        }
    }

    private void zzZ(ListLevel listLevel, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        boolean zZz8 = false;
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 16) {
                zzYU3.zzGT(zzyu4ZzZsD.getValue());
            } else if (iZzTP == 17) {
                zZz8 = zzyu4ZzZsD.zz8();
            }
        }
        zzyu4ZzZsD.zzj();
        listLevel.zzYcc = zZz8;
        listLevel.setStartAt(0);
        zzY(listLevel, zzzxt);
    }

    private void zzZM(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        DocumentBase document = zzzxt.getDocument();
        List list = new List(document, zzyu4ZzZsD.zzX("numId", 0));
        list.zzNb(zzyu4ZzZsD.zzX("durableId", 0));
        while (zzyu4ZzZsD.zzQ("num")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 7) {
                zzZ4J zzz4j = (zzZ4J) com.aspose.words.internal.zzQW.zzZ((Map<Integer, TValue>) zzzxt.zzYz5(), Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                if (zzz4j != null) {
                    list.zzxB(zzz4j.zzYP8());
                }
            } else if (iZzTP != 37) {
                zzyu4ZzZsD.zzk();
            } else {
                zzZ4B zzz4b = new zzZ4B(document, zzyu4ZzZsD.zzX("ilvl", 0));
                zzz4b.zzYbX = false;
                zzz4b.zzYbW = false;
                while (zzyu4ZzZsD.zzQ("lvlOverride")) {
                    int iZzTP2 = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                    if (iZzTP2 == 15) {
                        zzz4b.zzYbW = true;
                        zzZ(zzz4b.getListLevel(), zzzxt);
                    } else if (iZzTP2 != 38) {
                        zzyu4ZzZsD.zzk();
                    } else {
                        zzz4b.zzYbX = true;
                        zzz4b.zzYbY = zzyu4ZzZsD.zzYyE();
                    }
                }
                if (!this.zzYNu && zzz4b.zzYbX && ListLevel.zzx9(zzz4b.zzYbY)) {
                    zzz4b.getListLevel().setStartAt(zzz4b.zzYbY);
                }
                list.zzYPb().zzZ(zzz4b);
            }
        }
        zzX(list);
        document.getLists().zzQ(list);
    }

    private void zzZN(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        DocumentBase document = zzzxt.getDocument();
        int iZz7 = 0;
        boolean zZz8 = false;
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 7) {
                iZz7 = zzyu4ZzZsD.zz7();
                if (zzZ(zzzxt, iZz7)) {
                    return;
                }
            } else if (iZzTP == 8) {
                zzzxt.zzZqn().zzYr6();
                zZz8 = zzyu4ZzZsD.zz8();
            }
        }
        int iZzMN = 2;
        int iZzGT = 0;
        int iZzGT2 = 0;
        boolean z = false;
        int i = 0;
        zzZ4J zzz4j = null;
        String strZzV = null;
        String strZzV2 = null;
        while (zzyu4ZzZsD.zzQ("abstractNum")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 9:
                    iZzGT = zzYU3.zzGT(zzyu4ZzZsD.zzV("val", null));
                    if (zzz4j != null) {
                        zzz4j.zzxB(iZzGT);
                    }
                    z = true;
                    break;
                case 10:
                    iZzMN = zzZX4.zzMN(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 11:
                    iZzGT2 = zzYU3.zzGT(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 12:
                    strZzV = zzyu4ZzZsD.zzV("val", null);
                    break;
                case 13:
                    strZzV2 = zzyu4ZzZsD.zzV("val", null);
                    break;
                case 14:
                    strZzV2 = zzyu4ZzZsD.zzV("val", null);
                    break;
                case 15:
                    if (zzz4j == null) {
                        zzZ4J zzz4j2 = new zzZ4J(document, iZzGT, iZzMN, iZzGT2);
                        zzz4j2.setName(strZzV);
                        zzz4j = zzz4j2;
                    }
                    int iZzX = zzyu4ZzZsD.zzX("ilvl", 0);
                    if (iZzMN != 0 || iZzX <= 0) {
                        if (iZzX != -1 || i <= 0) {
                            if (iZzX == -1) {
                                iZzX = 0;
                            }
                            zzZ(zzz4j.zzYOP().get(iZzX), zzzxt);
                        } else {
                            zzz4j.zzYOP().get(0).setNumberStyle(255);
                            zzz4j.zzYOP().get(0).setNumberFormat("");
                            zzz4j.zzYOP().get(0).zzZYj().clear();
                            zzzxt.zzZsD().zzk();
                        }
                        i++;
                    }
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
        zzZ4J zzz4jZzxr = document.getLists().zzxr(iZzGT);
        if (zzz4jZzxr != null) {
            zzzxt.zzYz5().put(Integer.valueOf(iZz7), zzz4jZzxr);
            return;
        }
        if (zzz4j == null) {
            zzz4j = new zzZ4J(document, iZzGT, iZzMN, iZzGT2);
            zzz4j.setName(strZzV);
        }
        if (!z) {
            zzz4j.zzxB(document.getLists().zzYP4());
        }
        if (strZzV2 != null) {
            zzz4j.zzxh(zzzxt.zzJ(strZzV2, 12));
        }
        zzz4j.isRestartAtEachSection(zZz8);
        document.getLists().zzZ(zzz4j);
        zzzxt.zzYz5().put(Integer.valueOf(iZz7), zzz4j);
    }

    private ArrayList<ShapeBase> zzZO(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        ArrayList<ShapeBase> arrayList = new ArrayList<>();
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 4) {
                zzZ9X zzz9x = this.zzYNv;
                if (zzz9x == null) {
                    zzyu4ZzZsD.zzk();
                } else {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Iterable) zzz9x.zzZ(zzzxt));
                }
            } else if (iZzTP == 5) {
                Paragraph paragraph = new Paragraph(zzzxt.getDocument());
                zzzxt.zzT(paragraph);
                zzZWW.zzZl1().zzB(zzzxt, new zzYEF());
                zzzxt.zztj(8);
                for (Node node : paragraph.getChildNodes(0, false)) {
                    Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(node, Shape.class);
                    if (shape != null) {
                        node.remove();
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<Shape>) arrayList, shape);
                    }
                }
                paragraph.remove();
            } else if (iZzTP != 6) {
                zzyu4ZzZsD.zzk();
            } else {
                new zzYEF();
                ShapeBase shapeBaseZzZmg = zzzxt.zzZmg();
                zzzxt.getDocument().removeChild(shapeBaseZzZmg);
                com.aspose.words.internal.zzZQG.zzZ(arrayList, shapeBaseZzZmg);
            }
        }
        return arrayList;
    }

    private void zzZP(zzZXT zzzxt) throws Exception {
        com.aspose.words.internal.zzZQG.zzZ(zzzxt.zzZmd(), Integer.valueOf(zzzxt.zzZsD().zzX("numPicBulletId", 0)));
        Iterator<ShapeBase> it = zzZO(zzzxt).iterator();
        while (it.hasNext()) {
            zzzxt.getDocument().getLists().zzo((Shape) it.next());
        }
    }

    public final void zzE(zzZXT zzzxt) throws Exception {
        zzZW1 zzzw1ZzNJ;
        if (zzzxt.zzYyZ().zzZrB() || (zzzw1ZzNJ = zzzxt.zzNJ(zzzxt.zzZmp().zzZkR())) == null) {
            return;
        }
        while (zzzw1ZzNJ.zzQ("numbering")) {
            int iZzTP = zzUR.zzTP(zzzw1ZzNJ.getLocalName());
            if (iZzTP == 0) {
                zzZP(zzzxt);
            } else if (iZzTP == 1) {
                zzZN(zzzxt);
            } else if (iZzTP == 2) {
                zzZM(zzzxt);
            } else if (iZzTP != 3) {
                zzzw1ZzNJ.zzk();
            } else {
                zzzxt.getDocument().getLists().zzZr(Integer.valueOf(zzzw1ZzNJ.zzX("val", 0)));
            }
        }
        zzzxt.zzZmi();
    }

    private static void zzX(List list) {
        if (zzW(list)) {
            for (zzZ4B zzz4b : list.zzYPb()) {
                if (!zzz4b.zzYbX) {
                    zzz4b.zzYbY = 0;
                    zzz4b.zzYbX = true;
                }
            }
        }
    }

    private static boolean zzZ(zzZXT zzzxt, int i) {
        return i == 0 && zzzxt.zzYz5().containsKey(Integer.valueOf(i));
    }

    private static boolean zzW(List list) {
        Iterator<zzZ4B> it = list.zzYPb().iterator();
        while (it.hasNext()) {
            if (it.next().zzYbX) {
                return true;
            }
        }
        return false;
    }
}
