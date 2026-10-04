package com.aspose.words;

import com.huawei.hms.api.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("gb2312");
    private zzZ6R zzZEV;
    private HashMap<String, String> zzZEW;
    private zzX6 zzZEX;
    private Document zzZEY;
    private boolean zzZEZ;

    public zzZQ(Document document, zzX6 zzx6, zzZ6R zzz6r) {
        this.zzZEY = document;
        this.zzZEV = zzz6r;
        this.zzZEX = zzx6;
    }

    private static int zzPc(int i) {
        if (i == 3070) {
            return 4300;
        }
        if (i == 3080) {
            return 4310;
        }
        if (i == 3090) {
            return 4020;
        }
        if (i == 3100) {
            return 4320;
        }
        if (i == 3110) {
            return 4050;
        }
        if (i == 3120) {
            return 4060;
        }
        if (i == 3130) {
            return 4070;
        }
        if (i == 3140) {
            return 4080;
        }
        if (i == 3200) {
            return 4090;
        }
        if (i == 3210) {
            return EditingLanguage.CHINESE_SINGAPORE;
        }
        throw new IllegalStateException("Unexpected cell attribute.");
    }

    private static boolean zzPd(int i) {
        if (i == 31) {
            return true;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
                return true;
            default:
                return false;
        }
    }

    private static boolean zzPe(int i) {
        return i != -1;
    }

    public static int zzPf(int i) {
        if (i <= 0 || i > 600) {
            return 100;
        }
        return i;
    }

    private static boolean zzTA(String str) {
        return zzUR.zzTP(str) == 0;
    }

    private String zzTB(String str) {
        return (String) com.aspose.words.internal.zzQW.zzZ(zzbh(), str, "");
    }

    private static boolean zzV(Node node) {
        Document documentZzYBb = node.zzYBb();
        return documentZzYBb != null && documentZzYBb.getCompatibilityOptions().getMswVersion() >= 15;
    }

    private static boolean zzW(Node node) {
        zz2O zz2o;
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(node.getAncestor(18), Shape.class);
        return (shape == null || shape.getMarkupLanguage() == 1 || (zz2o = (zz2O) com.aspose.words.internal.zzZKW.zzZ(shape.zzY9i(), zz2O.class)) == null || zz2o.zzZTl().zzZtI().zzZAN().size() <= 0) ? false : true;
    }

    private static int zzYG(int i, int i2) {
        if (i != 0) {
            return i * 50;
        }
        if (i2 == 1) {
            return 18000;
        }
        return ConnectionResult.NETWORK_ERROR;
    }

    public static double zzZ7(double d) {
        if (d < 0.5d) {
            return 0.5d;
        }
        if (d > 1638.0d) {
            return 1638.0d;
        }
        return d;
    }

    private static int zzZK(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        if (!zzPe(iIntValue)) {
            iIntValue = 0;
        }
        return iIntValue * 50;
    }

    private Map<String, String> zzbh() {
        if (this.zzZEW == null) {
            this.zzZEW = new HashMap<>();
            for (FontInfo fontInfo : this.zzZEY.getFontInfos()) {
                if (com.aspose.words.internal.zzZYD.zzXk(fontInfo.getName()) && com.aspose.words.internal.zzZYD.zzXk(fontInfo.getAltName())) {
                    this.zzZEW.put(fontInfo.getName(), fontInfo.getAltName());
                }
            }
        }
        return this.zzZEW;
    }

    private zzZ32 zzbi() {
        Style styleZzZ7 = this.zzZEY.getStyles().zzZ7(40, false);
        if (styleZzZ7 == null || styleZzZ7.getSemiHidden()) {
            styleZzZ7 = this.zzZEY.getStyles().zzZ7(0, false);
        }
        return zzZ(styleZzZ7.zzl1(1), 3, this.zzZEX, this.zzZEY, this.zzZEV);
    }

    public static com.aspose.words.internal.zzPV zzn(com.aspose.words.internal.zzPV zzpv) {
        return (!zzpv.isEmpty() && zzpv.zzPD() == 0) ? new com.aspose.words.internal.zzPV(255, zzpv.zzPC(), zzpv.zzPB(), zzpv.zzPA()) : zzpv;
    }

    private static int zzu(int i, boolean z) {
        if (i == 4050) {
            return 3;
        }
        if (i == 4060) {
            return z ? 2 : 1;
        }
        if (i == 4070) {
            return 0;
        }
        if (i == 4080) {
            return z ? 1 : 2;
        }
        if (i == 4090) {
            return 4;
        }
        if (i == 4100) {
            return 5;
        }
        throw new IllegalStateException("Unexpected table attribute.");
    }

    private static int zzv(int i, boolean z) {
        if (i == 3110) {
            return 3;
        }
        if (i == 3120) {
            return z ? 2 : 1;
        }
        if (i == 3130) {
            return 0;
        }
        if (i == 3140) {
            return z ? 1 : 2;
        }
        if (i == 3150) {
            return 6;
        }
        if (i == 3160) {
            return 7;
        }
        if (i == 3200) {
            return 4;
        }
        if (i == 3210) {
            return 5;
        }
        throw new IllegalStateException("Unexpected cell attribute.");
    }

    public final zzZ3B zzX(Node node) {
        return zzY(node, this.zzZEX, this.zzZEV);
    }

    public final zzZ32 zzY(Paragraph paragraph) {
        return zzZ((Node) paragraph);
    }

    public final void zzYV(boolean z) {
        this.zzZEZ = z;
    }

    public final boolean zzZ(Paragraph paragraph) {
        return zzZ(paragraph, this.zzZEX, this.zzZEV);
    }

    private static boolean zzX(Paragraph paragraph) {
        Iterator<T> it = paragraph.getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            zzZ9G zzz9g = (zzZ9G) com.aspose.words.internal.zzZKW.zzZ((Node) it.next(), zzZ9G.class);
            if (zzz9g != null && !zzZ(zzz9g)) {
                return false;
            }
        }
        return true;
    }

    public static zzYEF zzZ(Inline inline, zzZ6R zzz6r) {
        return zzZ((Node) inline, false, zzz6r);
    }

    public final zzZ33 zzY(Node node) {
        return zzZ(node, this.zzZEX, this.zzZEV);
    }

    private static zzZ3B zzY(Node node, zzX6 zzx6, zzZ6R zzz6r) {
        node.getNodeType();
        Cell cellZzZex = ((Paragraph) node).zzZex();
        zzWP zzwp = (zzWP) zzZ(cellZzZex.zz6G(), zzz6r);
        zzZ3B zzz3b = new zzZ3B(zzx6);
        zzZ3C zzz3c = new zzZ3C(zzx6, false);
        zzY6G zzy6gZzZYf = ((Row) node.getAncestor(6)).zzZYf();
        zzZ(zzwp, 3110, zzz3c, cellZzZex, zzy6gZzZYf, new zzZ3D(zzx6));
        zzZ(zzwp, 3120, zzz3c, cellZzZex, zzy6gZzZYf, new zzZ3D(zzx6));
        zzZ(zzwp, 3130, zzz3c, cellZzZex, zzy6gZzZYf, new zzZ3D(zzx6));
        zzZ(zzwp, 3140, zzz3c, cellZzZex, zzy6gZzZYf, new zzZ3D(zzx6));
        zzZ(zzwp, 3160, zzz3c, cellZzZex, zzy6gZzZYf, new zzZ3D(zzx6));
        zzZ(zzwp, 3150, zzz3c, cellZzZex, zzy6gZzZYf, new zzZ3D(zzx6));
        zzZ(zzwp, 3080, zzz3b, zzy6gZzZYf);
        zzZ(zzwp, 3070, zzz3b, zzy6gZzZYf);
        zzZ(zzwp, 3090, zzz3b, zzy6gZzZYf);
        zzZ(zzwp, 3100, zzz3b, zzy6gZzZYf);
        for (int i = 0; i < zzwp.getCount(); i++) {
            int iZzT3 = zzwp.zzT3(i);
            Object objZzVY = zzwp.zzVY(i);
            if (objZzVY != null) {
                if (iZzT3 == 3020) {
                    zzz3b.zzV(zzwp.getPreferredWidth());
                    zzZ(node, zzwp, zzz3b);
                } else if (iZzT3 == 3030) {
                    zzz3b.zzUx(((Integer) objZzVY).intValue() == 2);
                } else if (iZzT3 == 3050) {
                    zzz3b.setOrientation(((Integer) objZzVY).intValue());
                } else if (iZzT3 == 3060) {
                    zzz3b.setVerticalAlignment(((Integer) objZzVY).intValue());
                } else if (iZzT3 == 3170) {
                    zzz3b.zzY(zzZ(zzx6, (Shading) objZzVY));
                } else if (iZzT3 == 3180) {
                    zzz3b.zzUw(((Boolean) objZzVY).booleanValue());
                } else if (iZzT3 == 3190) {
                    zzz3b.setFitText(((Boolean) objZzVY).booleanValue());
                } else if (iZzT3 == 3220) {
                    zzz3b.zzUv(((Boolean) objZzVY).booleanValue());
                }
            }
        }
        zzz3b.zzX(zzZ3C.zzZ(zzz3c));
        return zzZ3B.zzZ(zzz3b);
    }

    public static zzYEF zzZ(Paragraph paragraph, boolean z, boolean z2) {
        return paragraph.getListLabel().zzU(z, z2 ? 9 : 1);
    }

    public final zzZ32 zzZ(Node node) {
        char cCharAt;
        int iZzzG;
        boolean z;
        boolean z2;
        if (node.getNodeType() == 21 || node.getNodeType() == 26) {
            node.getText();
        }
        zzYEF zzyefZzZ = zzZ(node, this.zzZEZ, this.zzZEV);
        boolean z3 = true;
        if (node.getNodeType() == 21 || node.getNodeType() == 26 || (node.getNodeType() == 20 && !((Footnote) node).isAuto())) {
            if (node.getNodeType() != 20) {
                cCharAt = node.getText().charAt(0);
            } else {
                Footnote footnote = (Footnote) node;
                cCharAt = com.aspose.words.internal.zzZYD.zzXk(footnote.getReferenceMark()) ? footnote.getReferenceMark().charAt(0) : (char) 0;
            }
            iZzzG = zzY0C.zzzG(cCharAt);
            boolean z4 = cCharAt == ' ' || Character.isLowerCase(cCharAt);
            z = !zzWZ.zzZs(cCharAt);
            z2 = z4;
        } else {
            iZzzG = 3;
            z2 = false;
            z = false;
        }
        if (node.getNodeType() == 8 || node.getNodeType() == 25) {
            iZzzG = (zzyefZzZ.zzYdM().toBool() || zzyefZzZ.zzYdL().toBool()) ? 2 : 3;
        }
        if (node.getNodeType() == 20 && ((Footnote) node).isAuto()) {
            iZzzG = zzZP.zzU(node);
        }
        zzZ32 zzz32ZzZ = zzZ(zzyefZzZ, iZzzG, z2, z, this.zzZEX, node, this.zzZEV);
        if (node.getNodeType() == 20 && zzz32ZzZ.zzZz() && !com.aspose.words.internal.zzJF.zzZK(zzz32ZzZ.getName())) {
            zzz32ZzZ.setName(zzyefZzZ.zzYdP().toString());
        }
        zzz32ZzZ.setAltName(zzTB(zzz32ZzZ.getName()));
        if ((node instanceof ShapeBase) && ((ShapeBase) node).getWrapType() != 0) {
            zzz32ZzZ.zzZV(com.aspose.words.internal.zzPV.zzHZ);
        }
        if (node.getNodeType() == 8) {
            if (!zzz32ZzZ.zzYKT() && !((Paragraph) node).getParagraphFormat().getBidi()) {
                z3 = false;
            }
            zzz32ZzZ.zzTD(z3);
            zzz32ZzZ.zzTC(zzZ3X.zzwJ(((Paragraph) node).getParagraphBreakFont().getLocaleIdBi()));
        }
        return zzz32ZzZ;
    }

    public final zzZ32 zzZ(Inline inline, zzYEF zzyef, zzY9O zzy9o) {
        zzZ32 zzz32ZzZ = zzZ(zzyef, zzy9o.zzXbj, zzy9o.zzXbi, zzy9o.zzXbh, this.zzZEX, inline, this.zzZEV);
        String str = zzy9o.zzLJ;
        if (str != null) {
            zzz32ZzZ.setName(str);
        }
        zzz32ZzZ.setAltName(zzTB(zzz32ZzZ.getName()));
        zzz32ZzZ.zzTC(zzy9o.zzYKQ());
        zzz32ZzZ.zzTN(zzyef.zzYdM().toBool());
        zzz32ZzZ.zzIY(zzy9o.zzXbg);
        if (zzy9o.zzXbf) {
            zzz32ZzZ.zzTD(true);
            zzz32ZzZ.zzYKR();
        }
        if (zzy9o.zzXbk) {
            zzz32ZzZ.zzTN(inline.getParentParagraph().getParagraphFormat().getBidi());
        }
        zzz32ZzZ.zzTB(zzy9o.zzXbe);
        return zzz32ZzZ;
    }

    private static boolean zzY(Paragraph paragraph, boolean z) {
        boolean zZzYoT = z ? paragraph.zzYoT() : paragraph.zzYoU();
        ListLevel listLevelZzRB = paragraph.zzRB(z);
        if (listLevelZzRB == null && z) {
            listLevelZzRB = paragraph.zzRB(false);
        }
        if (listLevelZzRB == null) {
            return false;
        }
        if (zZzYoT && zzZ(listLevelZzRB.zzZYh().zzYdW(), paragraph)) {
            return true;
        }
        if (paragraph.isInCell() && paragraph.zzYB4() == null) {
            Row parentRow = paragraph.zzZex().getParentRow();
            if (!parentRow.zzZYf().getHidden() && !parentRow.getParentTable().getFirstRow().zzZYf().getHidden()) {
                return false;
            }
        }
        if (zzZ(paragraph.zzYp5().zzYdW(), paragraph)) {
            return zzX(paragraph);
        }
        return false;
    }

    public static zzZ32 zzZ(Paragraph paragraph, zzX6 zzx6, boolean z, boolean z2, zzZ6R zzz6r, int i, int i2, boolean z3, boolean z4, String str, String str2) {
        zzZV8 zzzv8;
        zzZV8 zzzv82;
        zzYJ7 zzyj7ZzYSR = zzz6r.zzYSR();
        zzYEF zzyefZzZ = zzZ(paragraph, z, z2);
        zzyefZzZ.remove(12);
        zzyefZzZ.remove(14);
        zzyefZzZ.remove(10010);
        if (i == 2) {
            zzZV8 deleteRevision = paragraph.getDeleteRevision();
            if (deleteRevision != null) {
                zzzv82 = new zzZV8(1, deleteRevision.getAuthor(), deleteRevision.zzZx());
            } else {
                zzzv82 = new zzZV8(1);
            }
            zzyefZzZ.zzQ(12, zzzv82);
        } else if (i == 3) {
            zzZV8 insertRevision = paragraph.getInsertRevision();
            if (insertRevision != null) {
                zzzv8 = new zzZV8(0, insertRevision.getAuthor(), insertRevision.zzZx());
            } else {
                zzzv8 = new zzZV8(0);
            }
            zzyefZzZ.zzQ(14, zzzv8);
        }
        zzYEF zzyefZzB = zzyj7ZzYSR.zzB(zzyefZzZ);
        boolean zBooleanValue = ((Boolean) paragraph.zzWm(1560, z2 ? 1 : 0)).booleanValue();
        int iZzZ = zzZ(i2, zBooleanValue, zzyefZzB);
        zzZ32 zzz32ZzZ = zzZ(zzyefZzB, iZzZ, zzx6, paragraph, zzz6r);
        zzZ(zzz32ZzZ, zBooleanValue, iZzZ, z3);
        if (z4) {
            zzz32ZzZ.zzIY(zzU1.zzZ(zzyefZzB.zzYdS(), paragraph.getDocument().zzZqI()));
        }
        if (str != null) {
            if (zzz32ZzZ.zzYL7() == null) {
                zzz32ZzZ.zzIY(zzz32ZzZ.getName());
            }
            zzz32ZzZ.setName(str);
        }
        zzz32ZzZ.zzTI(false);
        zzz32ZzZ.zzTH(false);
        zzz32ZzZ.zzTF(false);
        zzz32ZzZ.zzTE(false);
        zzz32ZzZ.zzTB(str2 != null && zzZ(paragraph, zzx6, zzz6r) && zz0.zzP(zzz32ZzZ.getName(), str2.charAt(0)));
        zzz32ZzZ.isHidden(zzZ(paragraph, z2));
        return zzZ32.zzW(zzz32ZzZ);
    }

    private static boolean zzY(Document document) throws Exception {
        return document.getCompatibilityOptions().getUseFELayout() || zzTA(document.zzZpV().zzYVH) || zzU1.zzZ(document.zzZqy(), (zzU1) document.getStyles().zzY37().get(235)) || document.getOriginalLoadFormat() == 62;
    }

    public final zzZ36 zzZ(Row row) {
        return zzZ(row, this.zzZEX, this.zzZEV);
    }

    public final zzZ30 zzZ(Table table) {
        return zzZ(table, this.zzZEX, this.zzZEV);
    }

    public final zzZ35 zzZ(Section section) {
        return zzZ(section, this.zzZEX, this.zzZEV);
    }

    public final zzZ3A zzZ(Document document) throws Exception {
        zzZ3A zzz3aZzZ = zzZ(document, this.zzZEX);
        zzz3aZzZ.zzZ(zzbi());
        return zzz3aZzZ;
    }

    public static com.aspose.words.internal.zzPV zzZ(Node node, Theme theme) {
        ShapeBase shapeBase = (ShapeBase) node.getAncestor(18);
        if (shapeBase == null) {
            return com.aspose.words.internal.zzPV.zzHZ;
        }
        zz2O zz2o = (zz2O) com.aspose.words.internal.zzZKW.zzZ(shapeBase.zzY9i(), zz2O.class);
        if (zz2o != null && zz2o.zzZTj() != null) {
            if (zz2o.zzZTj().zzZu5().zzZQX() == null) {
                return com.aspose.words.internal.zzPV.zzHZ;
            }
            if (theme == null) {
                return com.aspose.words.internal.zzPV.zzHZ;
            }
            return zz2o.zzZTj().zzZu5().zzZQX().zzZ(theme, (zzZCM) null);
        }
        return com.aspose.words.internal.zzPV.zzHZ;
    }

    public static void zzZ(zzZ39 zzz39, int i) {
        if (zzz39.zzYMd() == 2 && zzz39.zzYMe()) {
            if (i == 25604 && zzz39.getTop() == 0) {
                zzz39.setVerticalAlignment(1);
                return;
            }
            zzz39.setVerticalAlignment(0);
            if (i == 21595) {
                zzz39.setTop(-50);
            }
        }
    }

    private static zzZ32 zzZ(zzYEF zzyef, int i, zzX6 zzx6, Node node, zzZ6R zzz6r) {
        return zzZ(zzyef, i, false, false, zzx6, node, zzz6r);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:142:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095 A[PHI: r3 r26 r27 r28 r29 r30
      0x0095: PHI (r3v9 com.aspose.words.zzZ34) = 
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v17 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
      (r3v2 com.aspose.words.zzZ34)
     binds: [B:6:0x004d, B:8:0x0051, B:30:0x00e7, B:29:0x00dd, B:28:0x00d3, B:27:0x00cf, B:22:0x00be, B:21:0x00b5, B:20:0x00ac, B:19:0x00a3, B:18:0x009a, B:15:0x008d, B:14:0x0083, B:13:0x0079, B:12:0x006f, B:11:0x005a, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r26v2 com.aspose.words.zz4G) = 
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v6 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
      (r26v1 com.aspose.words.zz4G)
     binds: [B:6:0x004d, B:8:0x0051, B:30:0x00e7, B:29:0x00dd, B:28:0x00d3, B:27:0x00cf, B:22:0x00be, B:21:0x00b5, B:20:0x00ac, B:19:0x00a3, B:18:0x009a, B:15:0x008d, B:14:0x0083, B:13:0x0079, B:12:0x006f, B:11:0x005a, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r27v2 com.aspose.words.zz7X) = 
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v6 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
      (r27v1 com.aspose.words.zz7X)
     binds: [B:6:0x004d, B:8:0x0051, B:30:0x00e7, B:29:0x00dd, B:28:0x00d3, B:27:0x00cf, B:22:0x00be, B:21:0x00b5, B:20:0x00ac, B:19:0x00a3, B:18:0x009a, B:15:0x008d, B:14:0x0083, B:13:0x0079, B:12:0x006f, B:11:0x005a, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r28v2 com.aspose.words.zz21) = 
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v6 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
      (r28v1 com.aspose.words.zz21)
     binds: [B:6:0x004d, B:8:0x0051, B:30:0x00e7, B:29:0x00dd, B:28:0x00d3, B:27:0x00cf, B:22:0x00be, B:21:0x00b5, B:20:0x00ac, B:19:0x00a3, B:18:0x009a, B:15:0x008d, B:14:0x0083, B:13:0x0079, B:12:0x006f, B:11:0x005a, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r29v2 com.aspose.words.zz27) = 
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v6 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
      (r29v1 com.aspose.words.zz27)
     binds: [B:6:0x004d, B:8:0x0051, B:30:0x00e7, B:29:0x00dd, B:28:0x00d3, B:27:0x00cf, B:22:0x00be, B:21:0x00b5, B:20:0x00ac, B:19:0x00a3, B:18:0x009a, B:15:0x008d, B:14:0x0083, B:13:0x0079, B:12:0x006f, B:11:0x005a, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r30v2 com.aspose.words.zz1R) = 
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v6 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
      (r30v1 com.aspose.words.zz1R)
     binds: [B:6:0x004d, B:8:0x0051, B:30:0x00e7, B:29:0x00dd, B:28:0x00d3, B:27:0x00cf, B:22:0x00be, B:21:0x00b5, B:20:0x00ac, B:19:0x00a3, B:18:0x009a, B:15:0x008d, B:14:0x0083, B:13:0x0079, B:12:0x006f, B:11:0x005a, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzZ32 zzZ(zzYEF zzyef, int i, boolean z, boolean z2, zzX6 zzx6, Node node, zzZ6R zzz6r) {
        int i2;
        int i3;
        zzZ34 zzz34;
        zzZ3D zzz3d;
        String str;
        String str2;
        String str3;
        String str4;
        zz2O zz2o;
        int i4;
        zzYEF zzyef2 = zzyef;
        DocumentBase document = node.getDocument();
        zzZ32 zzz32 = new zzZ32(zzx6, document.zzZqy());
        zzZ34 zzz342 = zzZ34.zzY7F;
        zzZ3D zzz3d2 = zzZ3D.zzYaA;
        Theme themeZzZqI = document.zzZqI();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        String strZzZ = null;
        String strZzZ2 = null;
        String strZzZ3 = null;
        String strZzZ4 = null;
        String strZzZ5 = null;
        zz4G zz4g = null;
        zz7X zz7x = null;
        zz21 zz21Var = null;
        zz27 zz27Var = null;
        zz1R zz1r = null;
        while (i5 < zzyef2.getCount()) {
            int iZzT3 = zzyef2.zzT3(i5);
            Object objZzVY = zzyef2.zzVY(i5);
            if (objZzVY != null) {
                switch (iZzT3) {
                    case 10:
                        i4 = i5;
                        zzz32.zzTJ(objZzVY == zzZU.zzZF6);
                        break;
                    case 12:
                        i4 = i5;
                        zzz32.zzTI(true);
                        break;
                    case 13:
                        i4 = i5;
                        zzz32.zzTF(true);
                        break;
                    case 14:
                        i4 = i5;
                        zzz32.zzTH(true);
                        break;
                    case 15:
                        i4 = i5;
                        zzz32.zzTE(true);
                        break;
                    case 20:
                        i4 = i5;
                        zzz32.zzZV(zzn((com.aspose.words.internal.zzPV) objZzVY));
                        break;
                    case 45:
                        i4 = i5;
                        zzz32.zzvs(((Integer) objZzVY).intValue());
                        break;
                    case 60:
                        i4 = i5;
                        if (objZzVY == zzZU.zzZF6) {
                            i6 |= 1;
                        }
                        break;
                    case 70:
                        i4 = i5;
                        if (objZzVY == zzZU.zzZF6) {
                            i6 |= 2;
                        }
                        break;
                    case 80:
                        i4 = i5;
                        z9 = objZzVY == zzZU.zzZF6;
                        break;
                    case 90:
                        i4 = i5;
                        z4 = objZzVY == zzZU.zzZF6;
                        break;
                    case 100:
                        i4 = i5;
                        z5 = objZzVY == zzZU.zzZF6;
                        break;
                    case 110:
                        i4 = i5;
                        z7 = objZzVY == zzZU.zzZF6;
                        break;
                    case 120:
                        i4 = i5;
                        z6 = objZzVY == zzZU.zzZF6;
                        break;
                    case 130:
                        i4 = i5;
                        zzz32.isHidden(objZzVY == zzZU.zzZF6);
                        break;
                    case 140:
                        i4 = i5;
                        zzz32.setUnderline(((Integer) objZzVY).intValue());
                        break;
                    case 150:
                        i4 = i5;
                        zzz32.setSpacing(((Integer) objZzVY).intValue() * 50);
                        break;
                    case 160:
                        i4 = i5;
                        zzz32.zzY(zzn((com.aspose.words.internal.zzPV) objZzVY));
                        break;
                    case 170:
                        i4 = i5;
                        z8 = objZzVY == zzZU.zzZF6;
                        break;
                    case 180:
                        i4 = i5;
                        z3 = objZzVY == zzZU.zzZF6;
                        break;
                    case 190:
                        i4 = i5;
                        zzz32.setSize(com.aspose.words.internal.zzSA.zzn(zzZ7(((double) ((Integer) objZzVY).intValue()) / 2.0d)));
                        break;
                    case 200:
                        i4 = i5;
                        zzz32.setPosition(-com.aspose.words.internal.zzSA.zzm(((Integer) objZzVY).intValue()));
                        break;
                    case 210:
                        i4 = i5;
                        zzz32.zzvw(((Integer) objZzVY).intValue());
                        break;
                    case 220:
                        i4 = i5;
                        zzz32.zzvz(com.aspose.words.internal.zzSA.zzn(((double) ((Integer) objZzVY).intValue()) / 2.0d));
                        break;
                    case 230:
                        i4 = i5;
                        strZzZ = zzU1.zzZ(objZzVY, themeZzZqI);
                        break;
                    case 235:
                        i4 = i5;
                        strZzZ3 = zzU1.zzZ(objZzVY, themeZzZqI);
                        strZzZ4 = zzU1.zzZ(objZzVY, themeZzZqI, null, null);
                        break;
                    case 240:
                        i4 = i5;
                        strZzZ5 = zzU1.zzZ(objZzVY, themeZzZqI);
                        break;
                    case 250:
                        i4 = i5;
                        if (objZzVY == zzZU.zzZF6) {
                            i7 |= 1;
                        }
                        break;
                    case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                        i4 = i5;
                        if (objZzVY == zzZU.zzZF6) {
                            i7 |= 2;
                        }
                        break;
                    case StyleIdentifier.BIBLIOGRAPHY /* 265 */:
                        i4 = i5;
                        zzz32.zzTN(objZzVY == zzZU.zzZF6);
                        break;
                    case StyleIdentifier.PLAIN_TABLE_2 /* 268 */:
                        i4 = i5;
                        zzz32.zzTD(objZzVY == zzZU.zzZF6);
                        break;
                    case 270:
                        i4 = i5;
                        strZzZ2 = zzU1.zzZ(objZzVY, themeZzZqI);
                        break;
                    case StyleIdentifier.GRID_TABLE_4_ACCENT_2 /* 290 */:
                        i4 = i5;
                        zzz32.zzvt(zzPf(((Integer) objZzVY).intValue()));
                        break;
                    case 300:
                        i4 = i5;
                        z10 = objZzVY == zzZU.zzZF6;
                        break;
                    case StyleIdentifier.LIST_TABLE_2_ACCENT_1 /* 330 */:
                        i4 = i5;
                        zzz32.setSnapToGrid(objZzVY == zzZU.zzZF6);
                        break;
                    case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4 /* 350 */:
                        i4 = i5;
                        zzz32.zzvA(com.aspose.words.internal.zzSA.zzn(zzZ7(((double) ((Integer) objZzVY).intValue()) / 2.0d)));
                        break;
                    case StyleIdentifier.LIST_TABLE_4_ACCENT_5 /* 360 */:
                        Border border = (Border) objZzVY;
                        zzZ3D zzz3d3 = new zzZ3D(zzx6);
                        i4 = i5;
                        zzz3d3.zz2((float) border.zz8U());
                        zzz3d3.setLineStyle(border.getLineStyle());
                        zzz3d3.zzY(zzn(border.zz8Q()));
                        zzz3d3.zzYs((float) border.getDistanceFromText());
                        zzz3d3.zzUA(border.getShadow());
                        zzz3d3.zzUz(border.zz8P());
                        zzz3d2 = zzz3d3;
                        break;
                    case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6 /* 370 */:
                        Shading shading = (Shading) objZzVY;
                        zzZ34 zzz343 = new zzZ34(zzx6, false);
                        zzz343.zzN(zzn(shading.zzYbJ()));
                        zzz343.zzM(zzn(shading.zzYbK()));
                        zzz343.setTexture(shading.getTexture());
                        zzz342 = zzz343;
                        i4 = i5;
                        break;
                    case 380:
                        zzz32.setLocaleId(((Integer) objZzVY).intValue());
                        i4 = i5;
                        break;
                    case 390:
                        zzz32.setLocaleIdFarEast(((Integer) objZzVY).intValue());
                        i4 = i5;
                        break;
                    case 440:
                        zzz32.zzTy(objZzVY == zzZU.zzZF6);
                        i4 = i5;
                        break;
                    case 450:
                        zzz32.zzZW(zzn((com.aspose.words.internal.zzPV) objZzVY));
                        i4 = i5;
                        break;
                    case 810:
                        zz27Var = (zz27) zzZZZ.zzZC(objZzVY);
                        i4 = i5;
                        break;
                    case 815:
                        zz21Var = (zz21) zzZZZ.zzZC(objZzVY);
                        i4 = i5;
                        break;
                    case 820:
                        zz1r = (zz1R) zzZZZ.zzZC(objZzVY);
                        i4 = i5;
                        break;
                    case 825:
                        zz4g = (zz4G) zzZZZ.zzZC(objZzVY);
                        i4 = i5;
                        break;
                    case 830:
                        zz7x = (zz7X) zzZZZ.zzZC(objZzVY);
                        i4 = i5;
                        break;
                    case 855:
                        zzz32.zzvq(((Integer) objZzVY).intValue());
                        i4 = i5;
                        break;
                    case 860:
                        zzz32.zzvr(((Integer) objZzVY).intValue());
                        i4 = i5;
                        break;
                    case 865:
                        zzz32.zzvp(((Integer) objZzVY).intValue());
                        i4 = i5;
                        break;
                    case 880:
                        zzZNW zzznw = (zzZNW) objZzVY;
                        zzz32.zzY(new zzZNU(zzznw.getId(), zzznw.getValue() * 50));
                        i4 = i5;
                        break;
                    case 10010:
                        zzz32.zzTG(true);
                        i4 = i5;
                        break;
                    default:
                        i4 = i5;
                        break;
                }
            }
            i5 = i4 + 1;
            zzyef2 = zzyef;
        }
        zz2S zz2sZzZCu = zzz32.zzYKL().zzZCu();
        zz2N zz2nZzYKl = zzz32.zzYKL().zzYKl();
        ShapeBase shapeBase = (ShapeBase) node.getAncestor(18);
        if (shapeBase != null && (zz2o = (zz2O) com.aspose.words.internal.zzZKW.zzZ(shapeBase.zzY9i(), zz2O.class)) != null && zz2o.zzZAk() != null) {
            if (zz2sZzZCu == null) {
                zz2sZzZCu = zz2o.zzZAk().zzZCZ().zzZtK().zzZTd();
            }
            if (zz2nZzYKl == null) {
                zz2nZzYKl = zz2o.zzZAk().zzZCZ().zzZtK().zzZTc();
            }
        }
        zz2N zz2n = zz2nZzYKl;
        zz2S zz2s = zz2sZzZCu;
        int i8 = 2;
        if (z2) {
            i2 = z7 ? 3 : 0;
        } else if (z6) {
            i2 = 1;
        } else if (z7 && z) {
            i2 = 2;
        }
        int i9 = z8 ? 1 : z3 ? 2 : (z4 && z5) ? 12 : z4 ? 4 : z5 ? 8 : 0;
        if (z9) {
            i3 = i;
            zzz34 = zzz342;
            zzz3d = zzz3d2;
            str = strZzZ;
            str2 = strZzZ2;
            str3 = strZzZ3;
            str4 = strZzZ5;
            i8 = 1;
        } else if (z10) {
            i3 = i;
            zzz34 = zzz342;
            zzz3d = zzz3d2;
            str = strZzZ;
            str2 = strZzZ2;
            str3 = strZzZ3;
            str4 = strZzZ5;
        } else {
            i3 = i;
            zzz34 = zzz342;
            zzz3d = zzz3d2;
            str = strZzZ;
            str2 = strZzZ2;
            str3 = strZzZ3;
            str4 = strZzZ5;
            i8 = 0;
        }
        zzz32.setName(zzY0C.zzZ(i3, str, str2, str3, str4));
        zzz32.zzTz("Times New Roman".equals(strZzZ4));
        if (!com.aspose.words.internal.zzZYD.zzXk(zzz32.getName())) {
            zzz32.setName(zzYEF.zzYdx());
        }
        zzZ(node, zzz32, themeZzZqI);
        zzz32.zzWN(i6);
        zzz32.zzvy(i7);
        zzz32.zzvx(i2);
        zzz32.zzvv(i9);
        zzz32.zzvu(i8);
        zzz32.zzWN(i6);
        zzz32.zzY(zzZ34.zzX(zzz34));
        zzz32.zzV(zzZ3D.zzX(zzz3d));
        zzz32.zzZ(zzZ2Z.zzZ(zzx6, zz4g, zz7x, zz21Var, zz27Var, zz1r, zz2s, zz2n, zzW(node)));
        CompatibilityOptions compatibilityOptions = document.zzZpV().zzYVg;
        zzZ(zzz32, compatibilityOptions, zzz6r);
        zzz32.zzTA(compatibilityOptions.getUseWord97LineBreakRules());
        return zzz32;
    }

    private static zzZ33 zzZ(Node node, zzX6 zzx6, zzZ6R zzz6r) {
        int nodeType = node.getNodeType();
        if (nodeType == 17 || nodeType == 18) {
            return zzZ((ShapeBase) node, zzx6, zzz6r);
        }
        if (nodeType != 35) {
            return new zzZ33(zzx6);
        }
        return zzZ(zzx6);
    }

    private static void zzZ(zzZ32 zzz32, CompatibilityOptions compatibilityOptions, zzZ6R zzz6r) {
        if (zzz6r.zzYT0()) {
            return;
        }
        zzz32.zzH(compatibilityOptions.getUsePrinterMetrics(), compatibilityOptions.getTruncateFontHeightsLikeWP6());
    }

    private static void zzZ(Node node, zzZ32 zzz32, Theme theme) {
        if (zzz32.zzZy().isEmpty()) {
            zzz32.zzZX(zzZ(node, theme));
        }
    }

    private static zzZ36 zzZ(Row row, zzX6 zzx6, zzZ6R zzz6r) {
        zzX6 zzx62 = zzx6;
        zzY6G zzy6g = (zzY6G) zzZ(row.zzZYf(), zzz6r);
        zzZ36 zzz36 = new zzZ36(zzx62);
        zzZ3C zzz3c = new zzZ3C(zzx62, false);
        int i = 0;
        boolean z = true;
        while (i < zzy6g.getCount()) {
            int iZzT3 = zzy6g.zzT3(i);
            Object objZzVY = zzy6g.zzVY(i);
            if (objZzVY != null) {
                switch (iZzT3) {
                    case 4010:
                        zzz36.setAlignment(((Integer) objZzVY).intValue());
                        continue;
                    case 4040:
                        zzz36.zzTT(((Boolean) objZzVY).booleanValue());
                        continue;
                    case 4050:
                    case 4060:
                    case 4070:
                    case 4080:
                    case 4090:
                    case EditingLanguage.CHINESE_SINGAPORE /* 4100 */:
                        Border border = (Border) objZzVY;
                        zzz3c.zzZ(zzu(iZzT3, zzy6g.getBidi()), zzZ3D.zzZ(zzx62, (float) border.getLineWidth(), border.getLineStyle(), border.zz8Q(), (float) border.getDistanceFromText(), border.getShadow(), border.zz8P(), border.zz8F(), zzZ(border)));
                        continue;
                    case 4120:
                        zzz36.setHeightRule(zzy6g.getHeightRule());
                        zzz36.setHeight(zzy6g.getHeight() * 50);
                        z = false;
                        break;
                    case 4330:
                        zzz36.zzY(zzZ(zzx62, (Shading) objZzVY));
                        break;
                    case 4340:
                        zzz36.zzwa(((Integer) objZzVY).intValue() * 50);
                        break;
                    case 4360:
                        zzz36.zzTS(((Boolean) objZzVY).booleanValue());
                        break;
                    case 4520:
                        zzz36.isHidden(((Boolean) objZzVY).booleanValue());
                        break;
                }
            }
            i++;
            zzx62 = zzx6;
        }
        boolean z2 = row.getAncestor(18) != null;
        boolean zZzV = zzV(row);
        if (zZzV && !z2) {
            zzz36.setAlignment(row.getParentTable().getFirstRow().zzZYf().getAlignment());
        }
        if (zzz36.zzBz() && zZzV) {
            Row previousRow = row.getPreviousRow();
            while (true) {
                if (previousRow != null && previousRow.getParentTable() == row.getParentTable()) {
                    if (!((Boolean) previousRow.fetchRowAttr(4040)).booleanValue()) {
                        zzz36.zzTT(false);
                    } else {
                        previousRow = previousRow.getPreviousRow();
                    }
                }
            }
        }
        zzz36.zzTS(zzz36.zzYLA() & (!zzz36.zzBz()));
        zzz36.zzX(zzZ3C.zzZ(zzz3c));
        if (z) {
            zzZKP zzzkp = (zzZKP) row.fetchRowAttr(4120);
            zzz36.setHeight(zzzkp.getValue() * 50);
            zzz36.setHeightRule(zzzkp.zzZ4A());
        }
        return zzZ36.zzZ(zzz36);
    }

    private static zzZ30 zzZ(Table table, zzX6 zzx6, zzZ6R zzz6r) {
        zzY6G zzy6gZzZYf = table.getFirstRow().zzZYf();
        zzZ30 zzz30 = new zzZ30(zzx6);
        zzZ39 zzz39ZzYKq = zzz30.zzYKq();
        zzz30.zzvm(com.aspose.words.internal.zzSA.zzr(zzY6M.zzG(table.zzYBd())));
        zzz30.zzvl(zzZSF.zzQ(table));
        zzz30.zzTw(zzZNR.zzE(table));
        zzY6S zzy6s = (zzY6S) table.zzZYf().zzPk(5107);
        if (zzy6s != null) {
            zzz30.zzV(zzy6s.zzX6a);
        }
        if (table.getFirstRow().zzYkh()) {
            zzz30.zzvn(table.getFirstRow().zzYkg() * 50);
        }
        for (int i = 0; i < zzy6gZzZYf.getCount(); i++) {
            int iZzT3 = zzy6gZzZYf.zzT3(i);
            Object objZzVY = zzy6gZzZYf.zzVY(i);
            if (objZzVY != null) {
                switch (iZzT3) {
                    case 4150:
                        zzz39ZzYKq.zzwe(((Integer) objZzVY).intValue());
                        break;
                    case 4160:
                        zzz39ZzYKq.zzwd(((Integer) objZzVY).intValue());
                        break;
                    case 4170:
                        zzz39ZzYKq.setLeft(zzZK(objZzVY));
                        break;
                    case 4180:
                        zzz39ZzYKq.setHorizontalAlignment(((Integer) objZzVY).intValue());
                        break;
                    case 4190:
                        zzz39ZzYKq.setTop(zzZK(objZzVY));
                        break;
                    case 4200:
                        zzz39ZzYKq.setVerticalAlignment(((Integer) objZzVY).intValue());
                        break;
                    case 4210:
                        zzz39ZzYKq.zzwi(((Integer) objZzVY).intValue() * 50);
                        break;
                    case 4220:
                        zzz39ZzYKq.zzwh(((Integer) objZzVY).intValue() * 50);
                        break;
                    case 4230:
                        zzz30.zzV(((PreferredWidth) objZzVY).zzYmG());
                        break;
                    case 4240:
                        zzz30.zzTx(((Boolean) objZzVY).booleanValue());
                        break;
                    case 4270:
                        zzz39ZzYKq.zzwg(((Integer) objZzVY).intValue() * 50);
                        break;
                    case 4280:
                        zzz39ZzYKq.zzwf(((Integer) objZzVY).intValue() * 50);
                        break;
                    case 4340:
                        zzz30.zzwa(((Integer) objZzVY).intValue() * 50);
                        break;
                    case 4350:
                        zzz39ZzYKq.setAllowOverlap(((Boolean) objZzVY).booleanValue());
                        break;
                    case 4380:
                        zzz30.zzTN(((Boolean) objZzVY).booleanValue());
                        break;
                    case 5010:
                        zzz30.setDescription((String) objZzVY);
                        break;
                }
            }
        }
        if (zzz6r.zzYSM()) {
            zzz39ZzYKq.setWrapType(3);
        }
        if (zzy6gZzZYf.isFloating() && !zzZ(table, 18)) {
            zzZP.zzY(zzz39ZzYKq, 5);
            if (zzz39ZzYKq.isFloating()) {
                zzZ(table, zzy6gZzZYf, zzz39ZzYKq);
                zzZ(zzz39ZzYKq);
                if (!zzy6gZzZYf.zzVE(4170) && zzz39ZzYKq.getHorizontalAlignment() == 0) {
                    zzz39ZzYKq.setHorizontalAlignment(1);
                }
                if (zzZ(table, 7)) {
                    zzz39ZzYKq.setAllowOverlap(false);
                }
                zzZ(zzz39ZzYKq, 21595);
                zzz30.zzW(zzZ39.zzX(zzz39ZzYKq));
            }
        }
        if (zzz30.zzYKv() && table.zzZYf().zzXXf() == null) {
            table.zzZYf().zzY(new zzY6U());
        }
        return zzZ30.zzZ(zzz30);
    }

    private static zzZ35 zzZ(Section section, zzX6 zzx6, zzZ6R zzz6r) {
        int iMin;
        zzYCZ zzycz = (zzYCZ) zzZ(section.zzYvR(), zzz6r);
        zzZ35 zzz35 = new zzZ35(zzx6);
        int columnsCount = zzycz.getColumnsCount();
        if (columnsCount == 0) {
            columnsCount = 1;
        }
        int[] iArr = new int[columnsCount];
        int[] iArr2 = new int[columnsCount];
        if (zzycz.zzYcp()) {
            for (int i = 0; i < columnsCount; i++) {
                iArr2[i] = zzycz.zzYco() * 50;
            }
            int iZzQY = zzycz.zzQY(zzZ(section, zzycz, zzz6r)) * 50;
            iMin = iZzQY / columnsCount;
            int i2 = iZzQY % columnsCount;
            int i3 = 0;
            while (i3 < columnsCount) {
                iArr[i3] = (i3 < i2 ? 1 : 0) + iMin;
                i3++;
            }
        } else {
            for (int i4 = 0; i4 < columnsCount; i4++) {
                iArr2[i4] = zzycz.zzYcn().get(i4).zzXW2() * 50;
            }
            iMin = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < columnsCount; i5++) {
                int iZzXW3 = zzycz.zzYcn().get(i5).zzXW3() * 50;
                iArr[i5] = iZzXW3;
                iMin = Math.min(iMin, iZzXW3);
            }
        }
        zzz35.setSectionStart(zzycz.getSectionStart());
        zzz35.zzvW(zzycz.getPageWidth() * 50);
        zzz35.zzvV(zzycz.getPageHeight() * 50);
        zzz35.zzvU(section.getPageSetup().zzYLz());
        zzz35.zzHj(zzycz.zzZRi() * 50);
        zzz35.zzHi(zzycz.zzZRh() * 50);
        zzz35.zzvT(zzycz.zzZRg() * 50);
        zzz35.zzvS(zzycz.zzZRf() * 50);
        zzz35.zzvR(zzycz.zzYLy() * 50);
        zzz35.zzvQ(zzycz.zzYLx() * 50);
        zzz35.zzTR(zzycz.zzYcp());
        zzz35.zzTQ(zzycz.zzYct());
        zzz35.zzU(iArr, iMin);
        zzz35.zzi(iArr2);
        zzz35.zzTO(zzycz.getDifferentFirstPageHeaderFooter());
        zzz35.zzvP(zzycz.zzYLq() * 50);
        zzz35.setBorderAppliesTo(zzycz.getBorderAppliesTo());
        zzz35.setBorderDistanceFrom(zzycz.getBorderDistanceFrom());
        zzz35.zzTP(zzycz.getBorderAlwaysInFront());
        zzz35.setFirstPageTray(zzycz.getFirstPageTray());
        zzz35.setOtherPagesTray(zzycz.getOtherPagesTray());
        zzz35.setOrientation(zzycz.getOrientation());
        zzz35.setLineNumberRestartMode(zzycz.getLineNumberRestartMode());
        zzz35.setLineStartingNumber(zzycz.getLineStartingNumber());
        zzz35.setLineNumberCountBy(zzycz.getLineNumberCountBy());
        zzz35.setVerticalAlignment(zzycz.getVerticalAlignment());
        zzz35.zzvF(zzycz.zzYLd());
        zzz35.zzvE(zzycz.zzYPY() * 50);
        zzz35.zzvD(zzycz.zzYLc());
        if (zzycz.getRestartPageNumbering()) {
            zzz35.setPageStartingNumber(zzycz.getPageStartingNumber());
        } else {
            zzz35.zzYLo();
        }
        zzz35.setHeadingLevelForChapter(zzycz.getHeadingLevelForChapter());
        zzz35.zzvN(zzycz.zzYcl());
        zzz35.zzvM(zzycz.zzYcj());
        zzz35.zzvL(zzycz.zzYci());
        zzz35.zzvK(zzycz.zzYch());
        EndnoteOptions endnoteOptions = section.getPageSetup().getEndnoteOptions();
        zzz35.zzvJ(endnoteOptions.getPosition());
        zzz35.zzvI(endnoteOptions.getRestartRule());
        zzz35.zzvH(endnoteOptions.getNumberStyle());
        zzz35.zzvG(endnoteOptions.getStartNumber());
        zzz35.setSuppressEndnotes(section.getPageSetup().getSuppressEndnotes());
        zzz35.zzvO(zzYG(zzycz.zzYLm(), columnsCount));
        zzZ3C zzz3c = new zzZ3C(zzx6, false);
        if (zzycz.zz5y() != null) {
            zzz3c.zzZ(1, zzZ3D.zzZ(zzx6, (float) zzycz.zz5y().getLineWidth(), zzycz.zz5y().getLineStyle(), zzycz.zz5y().zz8Q(), (float) zzycz.zz5y().getDistanceFromText(), zzycz.zz5y().getShadow(), zzycz.zz5y().zz8P()));
        }
        if (zzycz.zz5A() != null) {
            zzz3c.zzZ(3, zzZ3D.zzZ(zzx6, (float) zzycz.zz5A().getLineWidth(), zzycz.zz5A().getLineStyle(), zzycz.zz5A().zz8Q(), (float) zzycz.zz5A().getDistanceFromText(), zzycz.zz5A().getShadow(), zzycz.zz5A().zz8P()));
        }
        if (zzycz.zz5x() != null) {
            zzz3c.zzZ(2, zzZ3D.zzZ(zzx6, (float) zzycz.zz5x().getLineWidth(), zzycz.zz5x().getLineStyle(), zzycz.zz5x().zz8Q(), (float) zzycz.zz5x().getDistanceFromText(), zzycz.zz5x().getShadow(), zzycz.zz5x().zz8P()));
        }
        if (zzycz.zz5z() != null) {
            zzz3c.zzZ(0, zzZ3D.zzZ(zzx6, (float) zzycz.zz5z().getLineWidth(), zzycz.zz5z().getLineStyle(), zzycz.zz5z().zz8Q(), (float) zzycz.zz5z().getDistanceFromText(), zzycz.zz5z().getShadow(), zzycz.zz5z().zz8P()));
        }
        zzz35.zzX(zzZ3C.zzZ(zzz3c));
        zzz35.zzTN(zzycz.getBidi());
        zzz35.zzTM(zzycz.getRtlGutter());
        zzz35.zzvC(zzycz.zzYLa());
        return zzz35;
    }

    private static zzZ3A zzZ(Document document, zzX6 zzx6) throws Exception {
        zzZ3A zzz3a = new zzZ3A(zzx6);
        zzz3a.zzwr(com.aspose.words.internal.zzSA.zzn(document.getDefaultTabStop()));
        zzz3a.zzUs(!document.getCompatibilityOptions().getNoColumnBalance());
        zzz3a.zzUt(!document.zzZpV().zzYWs);
        zzz3a.zzUu(!document.zzZpV().zzYWt);
        zzz3a.zzUp(document.zzZpV().zzYVX);
        zzz3a.zzUo(!document.zzZpV().zzYWr);
        zzz3a.setMultiplePages(document.zzZpV().zzYWh);
        zzz3a.zzUn(document.zzZpV().zzYVg.getSplitPgBreakAndParaMark());
        zzz3a.setDoNotSuppressParagraphBorders(document.zzZpV().zzYVg.getDoNotSuppressParagraphBorders());
        zzz3a.setSuppressSpBfAfterPgBrk(document.zzZpV().zzYVg.getSuppressSpBfAfterPgBrk());
        zzz3a.zzUm(document.zzZpV().zzYVg.getDoNotUseIndentAsNumberingTabStop());
        zzz3a.zzUl(document.zzZpV().zzYVg.getNoTabHangInd());
        zzz3a.setDoNotUseIndentAsNumberingTabStop(document.zzZpV().zzYVg.getDoNotUseIndentAsNumberingTabStop());
        zzz3a.zzUr(!document.getCompatibilityOptions().getDoNotUseHTMLParagraphAutoSpacing());
        zzz3a.zzUq(document.getCompatibilityOptions().getFootnoteLayoutLikeWW8());
        zzz3a.zzUk(document.getCompatibilityOptions().getUlTrailSpace());
        zzz3a.zzIZ(document.zzZpV().zzYVI);
        zzz3a.zzJ0(document.zzZpV().zzYVJ);
        zzz3a.zzwq(document.zzZpV().zzYVK);
        zzz3a.zzUj(document.zzZpV().zzYVL);
        zzz3a.setAdjustLineHeightInTable(document.getCompatibilityOptions().getAdjustLineHeightInTable());
        zzz3a.setUICompat97To2003(document.getCompatibilityOptions().getUICompat97To2003() || zzPd(document.getOriginalLoadFormat()));
        zzz3a.setAlignTablesRowByRow(document.getCompatibilityOptions().getAlignTablesRowByRow());
        zzz3a.setNoLeading(document.getCompatibilityOptions().getNoLeading());
        zzz3a.zzU9(document.getCompatibilityOptions().getSpaceForUL());
        zzz3a.zzUi(document.getCompatibilityOptions().getDoNotVertAlignCellWithSp());
        zzz3a.setDoNotExpandShiftReturn(document.getCompatibilityOptions().getDoNotExpandShiftReturn());
        zzz3a.setDoNotBreakWrappedTables(document.getCompatibilityOptions().getDoNotBreakWrappedTables());
        zzz3a.setNoSpaceRaiseLower(document.getCompatibilityOptions().getNoSpaceRaiseLower());
        zzz3a.zzUh(zzY(document));
        zzz3a.setAllowSpaceOfSameStyleInTable(document.getCompatibilityOptions().getAllowSpaceOfSameStyleInTable());
        zzz3a.setDoNotSuppressIndentation(document.getCompatibilityOptions().getDoNotSuppressIndentation());
        zzz3a.setUseWord97LineBreakRules(document.getCompatibilityOptions().getUseWord97LineBreakRules());
        HyphenationOptions hyphenationOptions = document.getHyphenationOptions();
        zzz3a.setAutoHyphenation(hyphenationOptions.getAutoHyphenation());
        zzz3a.setHyphenationZone(hyphenationOptions.getHyphenationZone() * 50);
        zzz3a.setConsecutiveHyphenLimit(hyphenationOptions.getConsecutiveHyphenLimit());
        zzz3a.zzUf(!hyphenationOptions.getHyphenateCaps());
        zzz3a.zzwo(document.getCompatibilityOptions().getMswVersion());
        zzz3a.setSuppressTopSpacing(document.getCompatibilityOptions().getSuppressTopSpacing());
        zzz3a.setBalanceSingleByteDoubleByteWidth(document.getCompatibilityOptions().getBalanceSingleByteDoubleByteWidth() && zzz3a.zzYMB());
        zzz3a.zzUg(document.zzZpV().zzYVN);
        zzz3a.zzwp(document.zzZpV().zzYVM);
        zzz3a.setUseAltKinsokuLineBreakRules(document.getCompatibilityOptions().getUseAltKinsokuLineBreakRules());
        zzz3a.setNoExtraLineSpacing(document.getCompatibilityOptions().getNoExtraLineSpacing());
        zzz3a.setSuppressBottomSpacing(document.getCompatibilityOptions().getSuppressBottomSpacing());
        zzz3a.zzwn(document.getOriginalLoadFormat());
        zzz3a.zzUe(document.getCompatibilityOptions().getGrowAutofit());
        zzz3a.zzUd(document.getCompatibilityOptions().getAutofitToFirstFixedWidthCell());
        zzz3a.zzUc(!document.zzZpV().zzYUN);
        zzz3a.setWrapTrailSpaces(document.getCompatibilityOptions().getWrapTrailSpaces());
        zzz3a.setUnderlineTabInNumList(document.getCompatibilityOptions().getUnderlineTabInNumList());
        zzKR zzkrZzRZ = document.getCompatibilityOptions().zzZYT().zzRZ("useWord2013TrackBottomHyphenation");
        zzz3a.zzUb(zzkrZzRZ == null || "1".equals(zzkrZzRZ.getValue()));
        zzKR zzkrZzRZ2 = document.getCompatibilityOptions().zzZYT().zzRZ("allowHyphenationAtTrackBottom");
        zzz3a.zzUa(zzkrZzRZ2 != null && "1".equals(zzkrZzRZ2.getValue()));
        zzz3a.setLayoutRawTableWidth(document.getCompatibilityOptions().getLayoutRawTableWidth());
        zzz3a.setSuppressTopSpacingWP(document.getCompatibilityOptions().getSuppressTopSpacingWP());
        Style styleZzZ7 = document.getStyles().zzZ7(0, false);
        zzz3a.zzwm(com.aspose.words.internal.zzSA.zzm(((Integer) zzZ(styleZzZ7, 190)).intValue()));
        zzz3a.zzwl(((Integer) zzZ(styleZzZ7, 150)).intValue() * 50);
        zzz3a.zzwk(((Integer) zzZ(styleZzZ7, StyleIdentifier.GRID_TABLE_4_ACCENT_2)).intValue());
        zzz3a.zzwj(document.zzZpV().zzYUZ);
        return zzz3a;
    }

    private static zzZ33 zzZ(ShapeBase shapeBase, zzX6 zzx6, zzZ6R zzz6r) {
        zzZ33 zzz33 = new zzZ33(zzx6);
        zzz33.zzTL(shapeBase.zzYvW().zzYL9());
        boolean behindText = shapeBase.zzYvW().getBehindText();
        if (zzV(shapeBase) && zzZ39.zzwc(shapeBase.zzYvW().getWrapType())) {
            behindText = false;
        }
        zzz33.setZOrder(zzZ33.zzN(shapeBase.zzYvW().getWrapType(), shapeBase.zzYvW().getZOrder(), behindText));
        if (shapeBase.getMarkupLanguage() == 1) {
            zzz33.zzTK(((Boolean) shapeBase.zzYvW().zzPj(948)).booleanValue());
        } else {
            zzz33.zzTK(false);
        }
        zzz33.zzW(null);
        zzz33.zzYLJ();
        if (shapeBase.zzYvW().getWrapType() != 0 && shapeBase.getAncestor(zzZMS.class) != null) {
            zzz33.zzYLJ().setWrapSide(0);
            zzz33.zzYLJ().setWrapType(0);
        } else {
            zzz33.zzYLJ().setWrapSide(shapeBase.zzYvW().getWrapSide());
            zzz33.zzYLJ().setWrapType(shapeBase.zzYvW().getWrapType());
        }
        zzz33.zzYLJ().setHorizontalAlignment(shapeBase.zzYvW().getHorizontalAlignment());
        zzz33.zzYLJ().setVerticalAlignment(shapeBase.zzYvW().getVerticalAlignment());
        zzz33.zzYLJ().zzwe(shapeBase.zzYvW().getRelativeHorizontalPosition());
        int relativeVerticalPosition = shapeBase.zzYvW().getRelativeVerticalPosition();
        if (!zzV(shapeBase) && relativeVerticalPosition == 7) {
            relativeVerticalPosition = 6;
        }
        zzz33.zzYLJ().zzwd(relativeVerticalPosition);
        zzz33.zzYLJ().setLeft(com.aspose.words.internal.zzSA.zzn(shapeBase.zzYvW().getLeft()));
        zzz33.zzYLJ().setTop(com.aspose.words.internal.zzSA.zzn(shapeBase.zzYvW().getTop()));
        zzz33.zzYLJ().zzwi(com.aspose.words.internal.zzSA.zzn(shapeBase.getDistanceLeft()));
        zzz33.zzYLJ().zzwh(com.aspose.words.internal.zzSA.zzn(shapeBase.getDistanceTop()));
        zzz33.zzYLJ().zzwg(com.aspose.words.internal.zzSA.zzn(shapeBase.getDistanceRight()));
        zzz33.zzYLJ().zzwf(com.aspose.words.internal.zzSA.zzn(shapeBase.getDistanceBottom()));
        zzz33.zzYLJ().setAllowOverlap(shapeBase.getAllowOverlap());
        zzZ(zzz33.zzYLJ(), 25604);
        if (zzz6r.zzYSM() && zzz33.zzYLJ().getWrapType() != 0) {
            zzz33.zzYLJ().setWrapType(3);
        }
        zzz33.zzW(zzZ39.zzX(zzz33.zzYLJ()));
        zzz33.zzvB(shapeBase.getLayoutFlow());
        return zzz33;
    }

    private static zzZ33 zzZ(zzX6 zzx6) {
        zzZ33 zzz33 = new zzZ33(zzx6);
        zzz33.zzW(null);
        zzz33.zzYLJ();
        zzz33.zzYLJ().setWrapSide(0);
        zzz33.zzYLJ().setWrapType(0);
        zzz33.zzYLJ().setHorizontalAlignment(4);
        zzz33.zzYLJ().setVerticalAlignment(4);
        zzz33.zzYLJ().zzwe(3);
        zzz33.zzYLJ().zzwd(3);
        zzz33.zzYLJ().setLeft(0);
        zzz33.zzYLJ().setTop(0);
        zzz33.zzYLJ().zzwi(0);
        zzz33.zzYLJ().zzwh(0);
        zzz33.zzYLJ().zzwg(0);
        zzz33.zzYLJ().zzwf(0);
        zzz33.zzYLJ().setAllowOverlap(false);
        return zzz33;
    }

    private static zzZ34 zzZ(zzX6 zzx6, Shading shading) {
        zzZ34 zzz34 = new zzZ34(zzx6, false);
        zzz34.zzN(zzn(shading.zzYbJ()));
        zzz34.zzM(zzn(shading.zzYbK()));
        zzz34.setTexture(shading.getTexture());
        return zzZ34.zzX(zzz34);
    }

    private static boolean zzZ(Paragraph paragraph, boolean z) {
        if (!zzY(paragraph, z)) {
            return false;
        }
        if (paragraph.isInCell() && paragraph.zzZex().getLastParagraph() == paragraph && !(paragraph.getParentTable().zzYBd() instanceof Cell)) {
            Paragraph paragraph2 = paragraph;
            while (paragraph != null) {
                paragraph2 = paragraph;
                paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB9(), Paragraph.class);
            }
            if ((!z && paragraph2.zzYoU()) || (z && paragraph2.zzYoT())) {
                return false;
            }
            for (Node node : paragraph2.zzZex().getChildNodes(8, true)) {
                if (!zzZ((zzZ9G) com.aspose.words.internal.zzZKW.zzZ(node, zzZ9G.class)) || !zzX((Paragraph) node)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean zzZ(zzZU zzzu, zzZ9G zzz9g) {
        return zzzu.zzZ(zzz9g, 130).toBool();
    }

    private static int zzZ(int i, boolean z, zzYEF zzyef) {
        if (i != 0 && z && zzZ3X.zzwI(zzyef.getLocaleIdBi())) {
            return 2;
        }
        return i;
    }

    private static void zzZ(zzZ32 zzz32, boolean z, int i, boolean z2) {
        zzz32.zzTN(z);
        if (!z && i == 2) {
            zzz32.zzTD(true);
        }
        if (z && z2) {
            zzz32.zzTD(false);
            zzz32.zzTN(false);
        }
    }

    private static void zzZ(WordAttrCollection wordAttrCollection, int i, zzZ3B zzz3b, zzY6G zzy6g) {
        Object objZzPk = wordAttrCollection.zzPk(i);
        if (objZzPk == null) {
            objZzPk = zzy6g.zzPk(zzPc(i));
        }
        if (objZzPk == null) {
            return;
        }
        if (i == 3070) {
            zzz3b.zzwv(((Integer) objZzPk).intValue() * 50);
            return;
        }
        if (i == 3080) {
            zzz3b.zzws(((Integer) objZzPk).intValue() * 50);
            return;
        }
        if (i == 3090) {
            zzz3b.zzwx(((Integer) objZzPk).intValue() * 50);
            zzz3b.zzww(zzz3b.getLeftPadding());
        } else {
            if (i != 3100) {
                return;
            }
            zzz3b.zzwu(((Integer) objZzPk).intValue() * 50);
            zzz3b.zzwt(zzz3b.getRightPadding());
        }
    }

    private static void zzZ(WordAttrCollection wordAttrCollection, int i, zzZ3C zzz3c, Cell cell, zzY6G zzy6g, zzZ3D zzz3d) {
        Object objZzPk = wordAttrCollection.zzPk(i);
        if (objZzPk == null || Border.zzZCe.equals(objZzPk)) {
            zzz3d.zzUy(true);
            if (i != 3110) {
                int i2 = EditingLanguage.CHINESE_SINGAPORE;
                if (i == 3120) {
                    if (cell.isFirstCell()) {
                        i2 = 4060;
                    }
                    objZzPk = zzy6g.zzPj(i2);
                } else if (i == 3130) {
                    objZzPk = zzy6g.zzPj(cell.getParentRow().isLastRow() ? 4070 : 4090);
                } else if (i == 3140) {
                    if (cell.isLastCell()) {
                        i2 = 4080;
                    }
                    objZzPk = zzy6g.zzPj(i2);
                } else if (i == 3150 || i == 3160) {
                    objZzPk = cell.zz6G().zzPi(i);
                } else {
                    if (i != 3200 && i != 3210) {
                        throw new IllegalStateException("Unexpected cell attribute.");
                    }
                    objZzPk = zzy6g.zzPj(zzPc(i));
                }
            } else {
                objZzPk = zzy6g.zzPj(cell.getParentRow().isFirstRow() ? 4050 : 4090);
            }
        }
        Border border = (Border) objZzPk;
        zzz3d.zz2((float) border.getLineWidth());
        if (border.zz8T()) {
            zzz3d.setLineStyle(26);
        } else {
            zzz3d.setLineStyle(border.zz8B() ? border.getLineStyle() : 0);
            if (zzz3d.getLineStyle() == 0) {
                zzz3d.zz2(0.0f);
            }
        }
        zzz3d.zzY(border.zz8Q());
        zzz3d.zzYs((float) border.getDistanceFromText());
        zzz3d.zzUA(border.getShadow());
        zzz3d.zzUz(border.zz8P());
        zzz3d.zzYN(border.zz8F());
        zzz3d.zzUB(zzZ(border));
        zzz3c.zzZ(zzv(i, zzy6g.getBidi()), zzZ3D.zzX(zzz3d));
    }

    private static boolean zzZ(Border border) {
        return border.getThemeColor() != -1 || border.zz8Q().isEmpty();
    }

    private static WordAttrCollection zzZ(WordAttrCollection wordAttrCollection, zzZ6R zzz6r) {
        if (zzz6r.zzYSR().zzYkW()) {
            return wordAttrCollection;
        }
        WordAttrCollection wordAttrCollection2 = (WordAttrCollection) wordAttrCollection.zzbn();
        wordAttrCollection2.zzYpN();
        return wordAttrCollection2;
    }

    private static void zzZ(Table table, zzY6G zzy6g, zzZ39 zzz39) {
        if (zzV(table)) {
            return;
        }
        if ((zzy6g.zzVE(4190) && zzPe(zzy6g.zzYpB())) || zzz39.zzYMe()) {
            return;
        }
        zzz39.zzwd(2);
        if (zzz39.getHorizontalAlignment() == 2 || zzz39.getHorizontalAlignment() == 4) {
            return;
        }
        zzz39.zzwh(0);
        zzz39.zzwf(0);
    }

    private static void zzZ(zzZ39 zzz39) {
        zzz39.zzwi(Math.max(zzz39.zzYMk(), zzZNG.zzYxN));
        zzz39.zzwg(Math.max(zzz39.zzYMi(), zzZNG.zzYxN));
    }

    private static boolean zzZ(Node node, int i) {
        return node.getAncestor(i) != null;
    }

    private static boolean zzZ(Section section, zzYCZ zzycz, zzZ6R zzz6r) {
        Document documentZzYBb = section.zzYBb();
        return zzYN9.zzZ(zzycz, section.getDocument().zzZpV(), (section == documentZzYBb.getFirstSection() ? zzycz : (zzYCZ) zzZ(documentZzYBb.getFirstSection().zzYvR(), zzz6r)).getOrientation());
    }

    private static Object zzZ(Style style, int i) {
        if (style != null) {
            return style.zzZa(i, true);
        }
        return zzYEF.zzOt(i);
    }

    private static zzYEF zzZ(Node node, boolean z, zzZ6R zzz6r) {
        zzYEF zzyefZzqv;
        int i = z ? 5 : 1;
        if (!zzz6r.zzYSR().zzYkW()) {
            i |= 8;
        }
        int nodeType = node.getNodeType();
        if (nodeType == 6) {
            zzyefZzqv = ((Row) node).getLastCell().getLastParagraph().zzqv(i);
        } else if (nodeType == 8) {
            zzyefZzqv = ((Paragraph) node).zzqv(i);
        } else if (nodeType == 28) {
            zzyefZzqv = zzZ7R.zzZ(new zzY93((StructuredDocumentTag) node), i);
        } else if (nodeType == 35) {
            zzYEF zzyef = new zzYEF();
            zzyef.zzZ(zzZ7R.zzZ((OfficeMath) node, i).zzYdW());
            zzyefZzqv = zzyef;
        } else if (nodeType != 17 && nodeType != 18) {
            if (node instanceof Footnote) {
                zzyefZzqv = zzZ7R.zzZ((Footnote) node, i);
            } else {
                zzyefZzqv = node instanceof Inline ? zzZ7R.zzZ((Inline) node, i) : null;
            }
        } else {
            zzyefZzqv = zzZ7R.zzZ((ShapeBase) node, i);
        }
        if (zzyefZzqv == null) {
            zzyefZzqv = new zzYEF();
        }
        return !zzz6r.zzYSR().zzYkX() ? zzz6r.zzYSR().zzB(zzyefZzqv) : zzyefZzqv;
    }

    private static void zzZ(Node node, zzWP zzwp, zzZ3B zzz3b) {
        Row row;
        if (zzz3b.zzYMZ().isAuto()) {
            int nodeType = node.getNodeType();
            if (nodeType != 6) {
                row = nodeType != 8 ? null : (Row) node.zzYBd().zzYBd().zzYBd().zzZYt();
            } else {
                row = (Row) node.zzYBd().zzZYt();
            }
            if (row.zzZYf().getAllowAutoFit() || zzwp.getWidth() <= 0) {
                return;
            }
            zzz3b.zzV(PreferredWidth.zzpK(zzwp.getWidth()));
        }
    }

    public final zzYEF zzZ(Inline inline) {
        return zzZ(inline, this.zzZEZ, this.zzZEV);
    }

    private static boolean zzZ(zzZ9G zzz9g) {
        return ((zzZU) zzZ7R.zzZ(zzz9g, 130, 0)).toBool();
    }

    private static boolean zzZ(Paragraph paragraph, zzX6 zzx6, zzZ6R zzz6r) {
        if (paragraph.zzYBd() instanceof Shape) {
            int iZzYL8 = zzZ(paragraph.zzYBd(), zzx6, zzz6r).zzYL8();
            return iZzYL8 == 4 || iZzYL8 == 1;
        }
        if (paragraph.isInCell()) {
            int orientation = zzY(paragraph, zzx6, zzz6r).getOrientation();
            return orientation == 4 || orientation == 5;
        }
        if (!paragraph.zzZ7D()) {
            return false;
        }
        int iZzYLa = zzZ(paragraph.getParentSection(), zzx6, zzz6r).zzYLa();
        return iZzYLa == 4 || iZzYLa == 1;
    }
}
