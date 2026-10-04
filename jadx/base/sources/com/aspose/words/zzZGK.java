package com.aspose.words;

import com.aspose.words.ref.RefInt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGK {
    private zzZG8 zzYou;
    private zzZGQ zzYow;
    private double zzYox;
    private double zzYoy;
    private boolean zzYoz;
    private zzZYY zzYso;
    private String zzZp0;
    private zzZFF zzZp2;
    private DocumentBuilder zzZwh;
    private com.aspose.words.internal.zzZQC<zzZGN> zzYoB = new com.aspose.words.internal.zzZQC<>();
    private HashMap<String, Integer> zzYoA = new HashMap<>();
    private int zzYov = 0;
    private boolean zzYot = false;

    public zzZGK(DocumentBuilder documentBuilder, zzZYY zzzyy, zzZFF zzzff, String str, double d, boolean z) {
        this.zzZwh = documentBuilder;
        this.zzYso = zzzyy;
        this.zzZp2 = zzzff;
        this.zzZp0 = str;
        this.zzYoz = z;
        this.zzYoy = d;
        this.zzYou = new zzZG8(this.zzZwh.getDocument());
    }

    private int zzKw(String str) throws Exception {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return -1;
        }
        RefInt refInt = new RefInt(0);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzYoA, str, refInt);
        int i = refInt.get();
        if (zZzZ) {
            return i;
        }
        byte[] bArrZzM = this.zzZp2.zzM(this.zzZp0, str, false);
        if (bArrZzM == null) {
            return -1;
        }
        Shape shape = new Shape(this.zzZwh.getDocument(), 75);
        shape.getImageData().setImageBytes(bArrZzM);
        shape.setWrapType(0);
        int iZzo = this.zzZwh.getDocument().getLists().zzo(shape);
        com.aspose.words.internal.zzZQF.zzY(this.zzYoA, str, Integer.valueOf(iZzo));
        ImageSize imageSize = shape.getImageData().getImageSize();
        shape.zze(imageSize.getWidthPoints(), imageSize.getHeightPoints());
        return iZzo;
    }

    private static boolean zzKx(String str) {
        return com.aspose.words.internal.zzZYD.zzXk(str) && str.length() == 1 && !ListLevel.zzYF(str.charAt(0));
    }

    private static String zzL(zzZIG zzzig) {
        for (zzZG4 zzzg4 : zzzig.zzZ2C()) {
            zzZEC zzzec = (zzZEC) com.aspose.words.internal.zzZKW.zzZ(zzzg4, zzZEC.class);
            if (zzzec != null && zzZDY.zzn(zzzec.getText(), true)) {
                return zzzec.getText();
            }
            zzZIG zzzig2 = (zzZIG) com.aspose.words.internal.zzZKW.zzZ(zzzg4, zzZIG.class);
            if (zzzig2 != null) {
                String strZzL = zzL(zzzig2);
                if (!com.aspose.words.internal.zzZKN.equals(strZzL, "")) {
                    return strZzL;
                }
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzM(zzZIG zzzig) throws Exception {
        boolean z;
        zzZGR zzzgrZzZ;
        boolean zZzZWD;
        double d;
        boolean z2;
        boolean z3;
        double textPosition;
        zzZGN zzzgnZzZ0W = zzZ0W();
        zzZGP zzzgpZzZ0X = zzZ0X();
        if (zzzgpZzZ0X == null) {
            zzzgpZzZ0X = zzzgnZzZ0W.zzZ1d();
        }
        String strZzSE = this.zzYso.zzZUC().zzSE("list-style-image");
        boolean zZzZy = this.zzYso.zzZUC().zzZy("list-style-type", "none");
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(this.zzYso.zzZUw().getAttributeValue("value", "-1"));
        if (ListLevel.zzx9(iZzZo)) {
            zzzgnZzZ0W.zzzm(iZzZo);
            zzzgnZzZ0W.zzzk(0);
        }
        boolean zZzJQ = zzZDY.zzJQ(this.zzYso.zzZUw().zzZTQ());
        this.zzYot = zZzJQ;
        this.zzYso.zzh(1, false);
        String strZzZUI = this.zzYso.zzZUI();
        this.zzYso.zzh(0, false);
        boolean z4 = (!zZzZy || zZzJQ || com.aspose.words.internal.zzZYD.zzXk(strZzSE) || com.aspose.words.internal.zzZYD.zzXk(strZzZUI)) ? false : true;
        if (z4) {
            z = true;
            zzzgrZzZ = null;
            zZzZWD = false;
        } else {
            zzzgrZzZ = zzZ(zzzgnZzZ0W, zzzgpZzZ0X, strZzSE, strZzZUI, zZzZy, zZzJQ);
            zzZGB zzzgbZzZ = this.zzYou.zzZ(zzzgnZzZ0W.zzZ1j(), zzzgrZzZ);
            zZzZWD = zzzgrZzZ.zzZWD();
            int listLevelNumber = zzzgrZzZ.zzZ1u().getListLevelNumber();
            z = true;
            this.zzZwh.getListFormat().setList(zzzgbZzZ.getList());
            this.zzZwh.getListFormat().setListLevelNumber(listLevelNumber);
            ListLevel listLevel = zzzgbZzZ.zzzf(listLevelNumber).getListLevel();
            zzzgnZzZ0W.zzW(listLevel);
            if (zzzgnZzZ0W.isImplicit()) {
                listLevel.setTextPosition(0.0d);
                listLevel.setNumberPosition(0.0d);
            }
            if (zZzJQ) {
                zzZ0Y();
            }
        }
        zzzgnZzZ0W.zzY(zzzgpZzZ0X);
        zzzgnZzZ0W.zzzk(zzzgnZzZ0W.zzZ1c() + 1);
        if (!z4 && this.zzYoz) {
            zzzgnZzZ0W.zzZ1f().setAlignment(0);
        }
        double dZzZ = !z4 ? zzZ(zzzgrZzZ, strZzSE) : 0.0d;
        double dZzSH = this.zzYso.zzZUC().zzSH("-aw-list-padding-sml");
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            dZzSH = 0.0d;
        }
        if (!zZzJQ && zZzZWD && com.aspose.words.internal.zzZKN.zzS(zzZDY.zzo(zzL(zzzig), false), " ", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            dZzSH += 5.0d;
        }
        String strZzSF = this.zzYso.zzZUC().zzSF("display");
        boolean z5 = (com.aspose.words.internal.zzZKN.equals(strZzSF, "") || com.aspose.words.internal.zzZYD.zzi(strZzSF, "list-item")) ? z : false;
        zzOJ zzojZzSG = this.zzYso.zzZUC().zzSG("text-indent");
        if (!zZzZWD) {
            d = 0.0d;
            if (this.zzYso.zzZUC().zzZy("list-style-position", "inside")) {
                z2 = z;
            }
            z3 = (!zZzJQ || z4 || zzzgnZzZ0W.isImplicit() || (zzzgnZzZ0W.zzZ1b() && !zZzZWD) || !z5 || z2 || (zZzZWD && (zzojZzSG.getValue() >= d || Math.abs(zzojZzSG.getValue()) <= dZzZ))) ? z : false;
            if (!z4 && z3) {
                zzzgnZzZ0W.zzZ1f().setAlignment(0);
                if (!zZzZWD && !zZzJQ && (zzzgnZzZ0W.zzZ1b() || !z5)) {
                    zzzgnZzZ0W.zzZ1f().setTrailingCharacter(2);
                }
            }
            if (!this.zzYoz || z3) {
                textPosition = dZzZ + dZzSH;
                if (!zZzJQ && !zZzZWD) {
                    textPosition += 5.0d;
                }
            } else {
                textPosition = !z4 ? zzzgnZzZ0W.zzZ1f().getTextPosition() - zzzgnZzZ0W.zzZ1f().getNumberPosition() : d;
            }
            if (zZzZWD || zZzJQ) {
                this.zzYow = new zzZFG(this.zzZwh.getCurrentParagraph(), new zzOJ(this.zzYox, true), zzZ10(), this.zzYso.zzZUC().zzSG(this.zzYso.zzZUQ() ? "padding-right" : "padding-left"), new zzOJ(textPosition, true), z3, zZzZy);
            }
            zzOJ zzojZzSG2 = this.zzYso.zzZUB().zzSG("padding-right");
            if (zzojZzSG2.getValue() == d && dZzSH == d) {
                zzzgnZzZ0W.zzZ1f().setTrailingCharacter(2);
            }
            boolean z6 = z;
            this.zzYow = new zzZFL(this.zzZwh.getCurrentParagraph(), new zzOJ(this.zzYox, z6), zzZ10(), zzojZzSG2, new zzOJ(dZzZ + dZzSH, z6), z3, zZzZy);
            return;
        }
        d = 0.0d;
        z2 = false;
        if (zZzJQ) {
        }
        if (!z4) {
            zzzgnZzZ0W.zzZ1f().setAlignment(0);
            if (!zZzZWD) {
                zzzgnZzZ0W.zzZ1f().setTrailingCharacter(2);
            }
        }
        if (this.zzYoz) {
            textPosition = dZzZ + dZzSH;
            if (!zZzJQ) {
                textPosition += 5.0d;
            }
        }
        if (zZzZWD) {
        }
        this.zzYow = new zzZFG(this.zzZwh.getCurrentParagraph(), new zzOJ(this.zzYox, true), zzZ10(), this.zzYso.zzZUC().zzSG(this.zzYso.zzZUQ() ? "padding-right" : "padding-left"), new zzOJ(textPosition, true), z3, zZzZy);
    }

    private zzZGR zzZ(zzZGN zzzgn, zzZGP zzzgp, String str, String str2, boolean z, boolean z2) throws Exception {
        zzZG1 zzzg1ZzZ;
        double dZzSD = this.zzYso.zzZUC().zzSD("-aw-list-level-number");
        int listLevelNumber = !com.aspose.words.internal.zzAN.zzZC(dZzSD) ? (int) dZzSD : zzzgn.getListLevelNumber();
        int iZzKw = zzKw(str);
        if (iZzKw >= 0) {
            return new zzZFO(new zzZGO(listLevelNumber), iZzKw, com.aspose.words.internal.zzSA.zzt(zzw(this.zzZwh.getDocument().getLists().zzxn(iZzKw))));
        }
        if (z2) {
            return zzZG1.zzY(this.zzYso.zzZUC().getString("-aw-list-number-format"), this.zzYso.zzZUC().getString("-aw-list-number-values"), this.zzYso.zzZUC().getString("-aw-list-number-styles"), listLevelNumber);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str2) && (zzzg1ZzZ = zzZG1.zzZ(this.zzYso, str2, listLevelNumber)) != null) {
            return zzzg1ZzZ;
        }
        if (!zzzgp.zzZ1m()) {
            return zzZG1.zzc(listLevelNumber, zzzgn.zzZ1e() + 1, zzzgp.getNumberStyle());
        }
        String string = this.zzYso.zzZUC().getString("-aw-number-format");
        String string2 = this.zzYso.zzZUC().getString("-aw-font-family");
        if (zzKx(string) && com.aspose.words.internal.zzZYD.zzXk(string2)) {
            return new zzZJT(new zzZGO(listLevelNumber), 0, this.zzZwh, this.zzYso, string, zzzgp.getNumberStyle(), string2);
        }
        String string3 = this.zzYso.zzZUB().getString(FirebaseAnalytics.Param.CONTENT);
        return (!this.zzYso.zzZUQ() && z && zzKx(string3)) ? new zzZJT(new zzZGO(zzzgn.getListLevelNumber()), 2, this.zzZwh, this.zzYso, string3, zzzgp.getNumberStyle(), "") : new zzZJT(new zzZGO(listLevelNumber), 1, this.zzZwh, this.zzYso, zzzgp.zzZ1i(), zzzgp.getNumberStyle(), zzzgp.zzZ1h());
    }

    private zzZGN zzZ0W() {
        if (this.zzYoB.size() > 0) {
            return this.zzYoB.peek();
        }
        return null;
    }

    private zzZGP zzZ0X() {
        return zzZGP.zzKz(this.zzYso.zzZUC().zzSF("list-style-type"));
    }

    private void zzZ0Y() throws Exception {
        zzZBM zzzbmZzZUw = this.zzYso.zzZUw();
        int i = 0;
        while (zzzbmZzZUw.zzZ2P() != null && "span".equals(zzzbmZzZUw.zzZ2P().zzZTQ())) {
            zzzbmZzZUw = zzzbmZzZUw.zzZ2P();
            this.zzYso.zzZ((zzZAS) zzzbmZzZUw, false);
            i++;
        }
        this.zzYso.zzZ(this.zzZwh.getCurrentParagraph().getListLabel().getFont(), this.zzZwh.getCurrentParagraph().zzqy(0));
        for (int i2 = 0; i2 < i; i2++) {
            this.zzYso.zzZVt();
        }
        zzZAS zzzasZzZUw = this.zzYso.zzZUw();
        this.zzYso.zzZVt();
        this.zzYso.zzZ(zzzasZzZUw, false);
    }

    private void zzZ0Z() {
        boolean zZzZUQ = this.zzYso.zzZUQ();
        this.zzYox = ((zZzZUQ ? this.zzYso.zzZUx().zzZWT() : this.zzYso.zzZUx().zzZWU()) || (this.zzYso.zzZUC().zzSx(zZzZUQ ? "margin-right" : "margin-left") != null)) ? 0.0d : this.zzYoy;
    }

    private zzOJ zzZ10() {
        return this.zzYso.zzZUQ() ? this.zzYso.zzZUx().zzZWR() : this.zzYso.zzZUx().zzZWS();
    }

    private int zzZJ(String str, int i) {
        zzZGP zzzgpZzZ0X = zzZ0X();
        if (zzzgpZzZ0X == null) {
            zzzgpZzZ0X = zzZGP.zzZK(str, i);
        }
        return zzzgpZzZ0X.zzZ1j();
    }

    private void zzq(String str, boolean z) {
        int iZzZo;
        this.zzYow = null;
        int i = 1;
        int iZzZ12 = zzZ12() + 1;
        zzZGN zzzgn = new zzZGN(iZzZ12, z);
        zzzgn.zzzl(zzZJ(str, iZzZ12));
        zzzgn.zzZ(zzZGP.zzZK(str, iZzZ12));
        zzzgn.zzVs(this.zzYso.zzZUC().zzZy("list-style-type", "none"));
        String strZzKM = this.zzYso.zzZUw().zzKM("start");
        if (strZzKM != null && (iZzZo = com.aspose.words.internal.zzJB.zzZo(strZzKM)) >= 0) {
            i = iZzZo;
        }
        zzzgn.zzzm(i);
        if (this.zzYoB.size() == 0) {
            zzZ0Z();
        }
        this.zzYoB.push(zzzgn);
    }

    private static double zzw(Shape shape) throws Exception {
        return shape.getImageData().getImageSize().getHeightPoints() + 2.0d;
    }

    public final void zzKy(String str) {
        zzq(str, false);
    }

    public final void zzN(zzZIG zzzig) throws Exception {
        if (this.zzYoB.size() == 0) {
            zzq("ul", true);
        }
        zzM(zzzig);
        this.zzYov++;
    }

    public final boolean zzZ11() {
        return zzZ0W() != null && zzZ0W().zzZ1c() > 0;
    }

    public final int zzZ12() {
        zzZGN zzzgnZzZ0W = zzZ0W();
        if (zzzgnZzZ0W != null) {
            return zzzgnZzZ0W.getListLevelNumber();
        }
        return -1;
    }

    public final boolean zzZ13() {
        return this.zzYow != null && this.zzZwh.getCurrentParagraph() == this.zzYow.getParagraph() && this.zzZwh.isAtStartOfParagraph();
    }

    public final void zzZ14() {
        if (this.zzYow == null || this.zzZwh.getCurrentParagraph() != this.zzYow.getParagraph()) {
            return;
        }
        ListLevel listLevelZzZ1f = zzZ0W().zzZ1f();
        zzOJ zzojZzZ10 = zzZ10();
        zzOJ zzojZzSG = this.zzYso.zzZUC().zzSG("text-indent");
        zzOJ zzojZzX = this.zzYow.zzX(zzojZzZ10, zzojZzSG);
        if (this.zzYoz || zzojZzZ10.zzZVX() || zzojZzX.zzZVX() || !com.aspose.words.internal.zzAN.zzZD(this.zzYox)) {
            this.zzZwh.getParagraphFormat().setLeftIndent(this.zzYow.zzW(zzojZzZ10, zzojZzSG).getValue());
            this.zzZwh.getParagraphFormat().setFirstLineIndent(zzojZzX.getValue());
            zzOJ zzojZzZ = this.zzYow.zzZ(zzojZzZ10, zzojZzSG, listLevelZzZ1f);
            this.zzZwh.getParagraphFormat().getTabStops().clear();
            if (zzojZzZ != null) {
                this.zzZwh.getParagraphFormat().getTabStops().add(zzojZzZ.getValue(), this.zzYso.zzZUQ() ? 2 : 0, 0);
            }
            if (listLevelZzZ1f != null) {
                listLevelZzZ1f.zzZYj().getTabStops().clear();
            }
        }
    }

    public final void zzZ15() {
        this.zzYow = null;
        int i = this.zzYov - 1;
        this.zzYov = i;
        if (i == 0 && zzZ0W().isImplicit()) {
            zzZ16();
        }
    }

    public final void zzZ16() {
        if (this.zzYoB.size() > 0) {
            this.zzYoB.pop();
        }
        if (this.zzYoB.size() == 0) {
            this.zzYox = 0.0d;
            if (this.zzYot) {
                return;
            }
            this.zzYou.zzZ0n();
        }
    }

    public final ListLevel zzZ1f() {
        zzZGN zzzgnZzZ0W = zzZ0W();
        if (zzzgnZzZ0W != null) {
            return zzzgnZzZ0W.zzZ1f();
        }
        return null;
    }

    public final boolean zzZ1r() {
        zzZGQ zzzgq = this.zzYow;
        return zzzgq != null && zzzgq.zzZ1r();
    }

    private double zzZ(zzZGR zzzgr, String str) throws Exception {
        int iZzKw = zzKw(str);
        if (iZzKw >= 0) {
            Shape shapeZzxn = this.zzZwh.getDocument().getLists().zzxn(iZzKw);
            return (shapeZzxn.getImageData().getImageSize().getWidthPoints() * zzw(shapeZzxn)) / shapeZzxn.getImageData().getImageSize().getHeightPoints();
        }
        Font font = this.zzZwh.getCurrentParagraph().getListLabel().getFont();
        return this.zzZwh.getDocument().zzZqy().zzY(font.getName(), (float) font.getSize(), font.zzza()).zz7(zzzgr.zzZ1t());
    }
}
