package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFM {
    private zzYGL zzXsA;
    private zzYGK zzXsB;
    private boolean zzXsC;
    private ArrayList<zzU1> zzXsz = new ArrayList<>();
    private zzYHZ zzXuG;
    private zzYHB zzXuI;
    private zzYEM zzXwl;

    public zzYFM(zzYEM zzyem) {
        this.zzXwl = zzyem;
        this.zzXuG = zzyem.zzYfW();
        this.zzXsB = new zzYGK(zzyem);
        this.zzXsA = new zzYGL(zzyem);
        this.zzXsz.clear();
    }

    private static int zzS(Theme theme) {
        int i = theme.zzXVF().zzX33 & 255;
        if (i == 4) {
            return 134;
        }
        if (i != 17) {
            return i != 18 ? 0 : 129;
        }
        return 128;
    }

    private void zzV(zzU1 zzu1) {
        if (!zzu1.zzZYI() || this.zzXsz.contains(zzu1)) {
            return;
        }
        Theme themeZzZqI = this.zzXwl.getDocument().zzZqI();
        String strZzZ = zzU1.zzZ(zzu1, themeZzZqI);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZ) && this.zzXwl.getDocument().getFontInfos().get(strZzZ) == null) {
            FontInfo fontInfo = new FontInfo(strZzZ);
            fontInfo.setCharset(zzS(themeZzZqI));
            this.zzXwl.getDocument().getFontInfos().zzW(fontInfo);
            com.aspose.words.internal.zzZQG.zzZ(this.zzXsz, zzu1);
        }
    }

    private void zzY(zzZV8 zzzv8) throws Exception {
        if (zzzv8 == null) {
            return;
        }
        int type = zzzv8.getType();
        if (type == 0) {
            this.zzXuG.zzCD("\\revised");
            this.zzXuG.zzZ5("\\revauth", this.zzXwl.zzYgv().add(zzzv8.getAuthor()));
            this.zzXuG.zzZ5("\\revdttm", zzYEO.zzt(zzzv8.zzZx()));
        } else {
            if (type != 1) {
                return;
            }
            this.zzXuG.zzCD("\\deleted");
            this.zzXuG.zzZ5("\\revauthdel", this.zzXwl.zzYgv().add(zzzv8.getAuthor()));
            this.zzXuG.zzZ5("\\revdttmdel", zzYEO.zzt(zzzv8.zzZx()));
        }
    }

    private void zzYg7() throws Exception {
        for (zzZ7N zzz7n : this.zzXuI.zzYiA()) {
            Object value = zzz7n.getValue();
            switch (zzz7n.zzKh()) {
                case 10:
                    this.zzXuG.zzCD("\\spv");
                    break;
                case 12:
                    zzY((zzZV8) value);
                    break;
                case 13:
                case 15:
                    zzZ((zzYX5) value);
                    break;
                case 14:
                    zzY((zzZV8) value);
                    break;
                case 20:
                    this.zzXuG.zzZ5("\\highlight", this.zzXwl.zzZM(zzY0E.zzhL(zzY0E.zzZE((com.aspose.words.internal.zzPV) value))));
                    break;
                case 30:
                    this.zzXuG.zzZ5("\\charrsid", ((Integer) value).intValue());
                    break;
                case 40:
                    this.zzXuG.zzZ5("\\insrsid", ((Integer) value).intValue());
                    break;
                case 45:
                    this.zzXuG.zzt("\\lbr", com.aspose.words.internal.zzZQB.zz2(value), 0);
                    break;
                case 50:
                    if (this.zzXsC) {
                        this.zzXuG.zzZ5("\\cs", ((Integer) value).intValue());
                    }
                    break;
                case 80:
                    this.zzXuG.zz6("\\strike", ((zzZU) value).toBool());
                    break;
                case 90:
                    this.zzXuG.zz6("\\outl", ((zzZU) value).toBool());
                    break;
                case 100:
                    this.zzXuG.zz6("\\shad", ((zzZU) value).toBool());
                    break;
                case 110:
                    this.zzXuG.zz6("\\scaps", ((zzZU) value).toBool());
                    break;
                case 120:
                    this.zzXuG.zz6("\\caps", ((zzZU) value).toBool());
                    break;
                case 130:
                    this.zzXuG.zz6("\\v", ((zzZU) value).toBool());
                    break;
                case 132:
                    this.zzXuG.zz7("\\webhidden", ((zzZU) value).toBool());
                    break;
                case 140:
                    this.zzXuG.zzCD(zzYFO.zzod(((Integer) value).intValue()));
                    break;
                case 150:
                    int iIntValue = ((Integer) value).intValue();
                    this.zzXuG.zzZ5("\\expnd", (int) zzYEO.zznC(iIntValue));
                    this.zzXuG.zzZ5("\\expndtw", iIntValue);
                    break;
                case 160:
                    this.zzXuG.zzZ5("\\cf", this.zzXwl.zzZM((com.aspose.words.internal.zzPV) value));
                    break;
                case 170:
                    this.zzXuG.zz6("\\embo", ((zzZU) value).toBool());
                    break;
                case 180:
                    this.zzXuG.zz6("\\impr", ((zzZU) value).toBool());
                    break;
                case 200:
                    int iIntValue2 = ((Integer) value).intValue();
                    if (iIntValue2 > 0) {
                        this.zzXuG.zzZ5("\\up", iIntValue2);
                    } else if (iIntValue2 < 0) {
                        this.zzXuG.zzZ5("\\dn", -iIntValue2);
                    }
                    break;
                case 210:
                    zzo7(((Integer) value).intValue());
                    break;
                case 220:
                    this.zzXuG.zzZ5("\\kerning", ((Integer) value).intValue());
                    break;
                case StyleIdentifier.GRID_TABLE_4_ACCENT_2 /* 290 */:
                    this.zzXuG.zzZ5("\\charscalex", ((Integer) value).intValue());
                    break;
                case 300:
                    this.zzXuG.zz5("\\striked", ((zzZU) value).toBool());
                    break;
                case StyleIdentifier.GRID_TABLE_3_ACCENT_5 /* 310 */:
                    this.zzXuG.zzZ5("\\animtext", com.aspose.words.internal.zzZQB.zz2(value));
                    break;
                case StyleIdentifier.LIST_TABLE_2_ACCENT_1 /* 330 */:
                    zzZU zzzu = (zzZU) value;
                    if (!zzzu.toBool()) {
                        this.zzXuG.zz6("\\cgrid", zzzu.toBool());
                    }
                    break;
                case StyleIdentifier.LIST_TABLE_4_ACCENT_5 /* 360 */:
                    this.zzXuG.zzCD("\\chbrdr");
                    zzYI0.zzZ(this.zzXwl, (Border) value);
                    break;
                case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6 /* 370 */:
                    Shading shading = (Shading) value;
                    zzYFH.zzZ(this.zzXwl, shading, "\\chshdng", "\\chcbpat", "\\chcfpat", zzYFO.zzoB(shading.getTexture()));
                    break;
                case 440:
                    this.zzXuG.zz7("\\noproof", ((zzZU) value).toBool());
                    break;
                case 450:
                    this.zzXuG.zzZ5("\\ulc", this.zzXwl.zzZM((com.aspose.words.internal.zzPV) value));
                    break;
                case 770:
                    this.zzXuG.zzCD(zzYFO.zzoc(((Integer) value).intValue()));
                    break;
                case 780:
                    this.zzXuG.zzCD(zzYFO.zzW((zzZRH) value));
                    break;
                case 880:
                    this.zzXuG.zzt("\\fittext", this.zzXwl.zzYed() ? -1 : ((zzZNW) value).getValue(), 0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected attribute is encountered.");
            }
        }
    }

    public static void zzZ(zzYEM zzyem, boolean z, zzU1 zzu1) throws Exception {
        if (zzu1 != null) {
            zzyem.zzYfW().zzZ5(z ? "\\af" : "\\f", zzyem.zzT(zzu1));
        }
    }

    private void zzo7(int i) throws Exception {
        if (i == 1) {
            this.zzXuG.zzCD("\\super");
        } else {
            if (i != 2) {
                return;
            }
            this.zzXuG.zzCD("\\sub");
        }
    }

    private void zzo8(int i) throws Exception {
        zzU1 zzu1ZzoT = this.zzXuI.zzoT(i);
        if (zzu1ZzoT != null) {
            zzZ(this.zzXwl, false, zzu1ZzoT);
            this.zzXwl.zzU(zzu1ZzoT);
        }
    }

    private void zzv(zzYEF zzyef) throws Exception {
        zzZMK zzzmkZzYsN = zzyef.zzYsN();
        this.zzXuG.zzZ5("\\crauth", this.zzXwl.zzYgv().add(zzzmkZzYsN.getAuthor()));
        this.zzXuG.zzZ5("\\crdate", zzYEO.zzt(zzzmkZzYsN.zzZx()));
        this.zzXuG.zzFg();
        this.zzXuG.zzCC("\\*\\oldcprops");
        zzW(zzyef, true);
        this.zzXuG.zzYj3();
    }

    public final void zzW(zzYEF zzyef, boolean z) throws Exception {
        zzV(zzyef.zzYdR());
        this.zzXwl.getDocument().zzZqI();
        this.zzXuI = new zzYHB(zzyef);
        this.zzXsC = z;
        if (this.zzXwl.zzYen().getExportCompactSize()) {
            this.zzXsB.zzZ(this.zzXuI, true);
            this.zzXsA.reset();
        } else {
            this.zzXsB.zzZ(this.zzXuI, false);
            this.zzXsA.zzZ(this.zzXuI);
        }
        zzo8(this.zzXsA.zzYhR());
        zzYg7();
    }

    public final void zzw(zzYEF zzyef) throws Exception {
        if (!zzyef.zz6D()) {
            zzW(zzyef, true);
            return;
        }
        zzYEF zzyef2 = (zzYEF) zzyef.zzbn();
        zzyef2.zzYpN();
        zzW(zzyef2, true);
        zzYEF zzyef3 = (zzYEF) zzyef.zzbn();
        zzyef3.zzX(zzyef2);
        zzv(zzyef3);
    }

    private void zzZ(zzYX5 zzyx5) throws Exception {
        if (zzyx5 == null) {
            return;
        }
        int iAdd = this.zzXwl.zzYgv().add(zzyx5.getAuthor());
        int iZzt = zzYEO.zzt(zzyx5.zzZx());
        int type = zzyx5.getType();
        if (type == 0) {
            this.zzXuG.zzCD("\\deleted");
            this.zzXuG.zzZ5("\\mvauth", iAdd);
            this.zzXuG.zzZ5("\\mvdate", iZzt);
            this.zzXuG.zzCD("\\mvf");
            this.zzXuG.zzZ5("\\revauthdel", iAdd);
            this.zzXuG.zzZ5("\\revdttmdel", iZzt);
            return;
        }
        if (type != 1) {
            return;
        }
        this.zzXuG.zzCD("\\revised");
        this.zzXuG.zzZ5("\\revauth", iAdd);
        this.zzXuG.zzZ5("\\revdttm", iZzt);
        this.zzXuG.zzZ5("\\mvauth", iAdd);
        this.zzXuG.zzZ5("\\mvdate", iZzt);
        this.zzXuG.zzCD("\\mvt");
    }
}
