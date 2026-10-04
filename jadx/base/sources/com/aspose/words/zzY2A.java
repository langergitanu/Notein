package com.aspose.words;

import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.logging.type.LogSeverity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2A implements zzZ8T {
    private static HashMap<Integer, zzZ5K> zzWWd;
    private static com.aspose.words.internal.zzZYG<String> zzWWe;
    private boolean zzWWf;
    private boolean zzWWg;
    private Shape zzWXL;
    private boolean zzYMK;
    private zzYDZ zzZFZ;

    static {
        com.aspose.words.internal.zzZYG<String> zzzyg = new com.aspose.words.internal.zzZYG<>();
        zzWWe = zzzyg;
        zzzyg.set("{A998136B-4AC2-44c3-8CCF-79AB77ABDD1D}", "<a:ext uri=\"{A998136B-4AC2-44c3-8CCF-79AB77ABDD1D}\" xmlns:a=\"http://purl.oclc.org/ooxml/drawingml/main\"> <a15:backgroundPr xmlns:a15=\"http://schemas.microsoft.com/office/drawing/2012/main\" bwMode=\"white\" bwPure=\"auto\" bwNormal=\"auto\" targetScreenSize=\"1024x768\" /> </a:ext>");
        HashMap<Integer, zzZ5K> map = new HashMap<>();
        zzWWd = map;
        com.aspose.words.internal.zzZQF.zzY(map, 4, zzZV(1, 0, 0));
        com.aspose.words.internal.zzZQF.zzY(zzWWd, 3, zzZV(1, -50000, 0));
        com.aspose.words.internal.zzZQF.zzY(zzWWd, 7, zzZV(3, 0, 50000));
        com.aspose.words.internal.zzZQF.zzY(zzWWd, 1, zzZV(4, 0, -50000));
        com.aspose.words.internal.zzZQF.zzY(zzWWd, 5, zzZV(6, 50000, 0));
        com.aspose.words.internal.zzZQF.zzY(zzWWd, 6, zzZV(1, -50000, 50000));
        com.aspose.words.internal.zzZQF.zzY(zzWWd, 0, zzZV(1, -50000, -50000));
        com.aspose.words.internal.zzZQF.zzY(zzWWd, 8, zzZV(6, 50000, 50000));
        com.aspose.words.internal.zzZQF.zzY(zzWWd, 2, zzZV(6, 50000, -50000));
    }

    private zzY2A(Shape shape, boolean z, boolean z2, zzYDZ zzydz) {
        if (shape != null) {
            shape.getMarkupLanguage();
        }
        this.zzWXL = shape;
        this.zzYMK = shape.isWordArt();
        this.zzWWg = z;
        this.zzWWf = z2;
        this.zzZFZ = zzydz;
    }

    private void zzPz(boolean z) {
        this.zzWXL.setShapeAttr(958, Boolean.valueOf(z));
        if (this.zzWXL.getDocument() instanceof Document) {
            ((Document) this.zzWXL.getDocument()).zzZqk();
        }
    }

    private void zzU(zz10 zz10Var) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzYe;
        byte[] bArr = (byte[]) this.zzWXL.zzYvW().get(781);
        if (bArr == null || (zz77VarZzYe = new com.aspose.words.internal.zz79(new com.aspose.words.internal.zzZOR(bArr)).zzYe("/drs/e2oDoc.xml")) == null) {
            return;
        }
        zzZXU zzzxuZzS = zzZWW.zzS(zz77VarZzYe);
        zzzxuZzS.zzZsD().zzQ("e2oholder");
        zzzxuZzS.zzZsD().zzQ("graphic");
        zzzxuZzS.zzZsD().zzQ("graphicData");
        zzzxuZzS.zzZsD().zzQ("wsp");
        zz10Var.zzWE(((zz2O) zz1S.zzG(zzzxuZzS).zzY9i()).zzZTl().zzZtv());
    }

    private ShapeBase zzXG(byte[] bArr) throws Exception {
        this.zzWXL.getMarkupLanguage();
        zz3V zz3vZzXSU = zzXSU();
        Shape shape = new Shape(this.zzWXL.getDocument(), (byte) 0);
        shape.zzS((zzYC3) this.zzWXL.zzYvW().zzbn());
        shape.zzZ((zzYEF) this.zzWXL.zzZYh().zzbn());
        shape.setShapeType(75);
        if (shape.getDistanceTop() < 0.0d) {
            shape.setDistanceTop(0.0d);
        }
        if (shape.getDistanceBottom() < 0.0d) {
            shape.setDistanceBottom(0.0d);
        }
        if (shape.getDistanceLeft() < 0.0d) {
            shape.setDistanceLeft(0.0d);
        }
        if (shape.getDistanceRight() < 0.0d) {
            shape.setDistanceRight(0.0d);
        }
        shape.zzU(zz3vZzXSU);
        shape.getImageData().setImageBytes(bArr);
        zzZ(this.zzWXL, shape);
        return shape;
    }

    private byte[] zzXSO() throws Exception {
        Object directShapeAttr = this.zzWXL.getDirectShapeAttr(958);
        boolean z = directShapeAttr != null && ((Boolean) directShapeAttr).booleanValue();
        if (z) {
            zzPz(false);
        }
        byte[] bArrZzZ = zz00.zzZ(this.zzWXL.getShapeRenderer(), this.zzZFZ);
        if (z) {
            zzPz(true);
        }
        return bArrZzZ;
    }

    private zz0J zzXSP() throws Exception {
        zz0J zz0j = new zz0J();
        zz10 zz10VarZzZtK = zz0j.zzZCZ().zzZtK();
        zz10VarZzZtK.zzX(new zzHK(0.0d));
        zz10VarZzZtK.zzGJ(zzZZZ.zzGz(((Integer) this.zzWXL.fetchShapeAttr(136)).intValue()));
        zz10VarZzZtK.zzGH(((Integer) this.zzWXL.fetchShapeAttr(133)).intValue());
        zz10VarZzZtK.zzGO(((Integer) this.zzWXL.fetchShapeAttr(129)).intValue());
        zz10VarZzZtK.zzGQ(((Integer) this.zzWXL.fetchShapeAttr(130)).intValue());
        zz10VarZzZtK.zzGP(((Integer) this.zzWXL.fetchShapeAttr(131)).intValue());
        zz10VarZzZtK.zzGR(((Integer) this.zzWXL.fetchShapeAttr(132)).intValue());
        zz10VarZzZtK.zzGN(zzZZZ.zzGx(((Integer) this.zzWXL.fetchShapeAttr(135)).intValue()));
        zz10VarZzZtK.zzWJ(false);
        Object directShapeAttr = this.zzWXL.getDirectShapeAttr(189);
        zz10VarZzZtK.zzWE(directShapeAttr == null || ((Boolean) directShapeAttr).booleanValue());
        try {
            zzU(zz10VarZzZtK);
        } catch (ZipException unused) {
        }
        if (((Boolean) this.zzWXL.fetchShapeAttr(190)).booleanValue()) {
            zz10VarZzZtK.zzZ(new zz2K());
        } else {
            zz10VarZzZtK.zzZ(new zz55());
        }
        if (this.zzWXL.isWordArt()) {
            zz10VarZzZtK.zzWE(false);
            zz10VarZzZtK.zzWG(true);
            zz10VarZzZtK.zzZ(new zz2K());
            zz10VarZzZtK.setColumnNumber(1);
            int shapeType = this.zzWXL.getShapeType();
            if (shapeType == 31 || shapeType == 144 || shapeType == 145 || shapeType == 146 || shapeType == 147) {
                zz10VarZzZtK.zzWF(true);
            }
            zz3F zz3f = new zz3F();
            zz3f.zzH9(zzii(this.zzWXL.getShapeType()));
            zz10VarZzZtK.zzZ(zz3f);
            zzY2Q.zzZ(this.zzWXL, zz3f.zzZAP());
            zz2S zz2sZzXSS = zzXSS();
            if (zz2sZzXSS != null) {
                zz10VarZzZtK.zzZ(zz2sZzXSS);
            }
            zz2N zz2nZzXST = zzXST();
            if (zz2nZzXST != null) {
                zz10VarZzZtK.zzZ(zz2nZzXST);
            }
        }
        return zz0j;
    }

    private int zzXSQ() {
        com.aspose.words.internal.zzQ6 zzq6 = new com.aspose.words.internal.zzQ6(((double) this.zzWXL.zzYaS()) / 65536.0d, ((double) this.zzWXL.zzYaR()) / 65536.0d, 0.152587890625d);
        int iIntValue = 9;
        for (Map.Entry<Integer, zzZ5K> entry : zzWWd.entrySet()) {
            if (com.aspose.words.internal.zzAN.zzZD(entry.getValue().zzYRd().zzV(zzq6).zzPY())) {
                iIntValue = entry.getKey().intValue();
            }
        }
        return iIntValue;
    }

    private boolean zzXSR() {
        int iZzYaI = this.zzWXL.zzYaI();
        int iZzYaK = this.zzWXL.zzYaK();
        int iZzYaP = this.zzWXL.zzYaP();
        if (iZzYaI != 4000 && iZzYaI != 10000 && iZzYaI != 20000) {
            return false;
        }
        if (iZzYaP == 52000 || iZzYaP == 44000 || iZzYaP == 38000) {
            return iZzYaK == 14000 || iZzYaK == 24000 || iZzYaK == 38000;
        }
        return false;
    }

    private zz2S zzXSS() {
        if (this.zzWXL.isGroup() || !this.zzWXL.getExtrusionEnabled()) {
            return null;
        }
        zz2S zz2s = new zz2S(false);
        zzGO zzgo = new zzGO();
        zz2s.zzZ(zzgo);
        zzgo.zzLA(zzZPy());
        if (this.zzWXL.zzYvW().contains(705) || this.zzWXL.zzYvW().contains(704)) {
            double dZzZ2 = zzZ2(this.zzWXL.zzYaU(), true);
            double dZzZ22 = zzZ2(this.zzWXL.zzYaT(), false);
            if (!com.aspose.words.internal.zzAN.zzZD(dZzZ2) || !com.aspose.words.internal.zzAN.zzZD(dZzZ22)) {
                zz33 zz33Var = new zz33();
                zz33Var.zzT(new zzHK(dZzZ2));
                zz33Var.zzS(new zzHK(dZzZ22));
                zz33Var.zzR(new zzHK(0.0d));
                zzgo.zzZ(zz33Var);
            }
        }
        int iZzXSQ = zzXSQ();
        zz5Z zz5z = new zz5Z();
        if (!zzXSR() || iZzXSQ == 9) {
            zz5z.zzHR(0);
            zz5z.setDirection(4);
        } else {
            zz5z.zzHR(zzin(iZzXSQ));
            zz5z.setDirection(zzij(iZzXSQ));
        }
        zz2s.zzZ(zz5z);
        return zz2s;
    }

    private zz2N zzXST() {
        if (!((Boolean) this.zzWXL.fetchShapeAttr(LogSeverity.ALERT_VALUE)).booleanValue()) {
            return null;
        }
        zz2N zz2n = new zz2N(false);
        int fillColor = this.zzWXL.getFillColor();
        zzBW zzbwZzZ = zzBW.zzZ(((double) (com.aspose.words.internal.zzZQ1.zzZX(fillColor) & 255)) / 255.0d, com.aspose.words.internal.zzZQ1.zz0(fillColor) & 255, com.aspose.words.internal.zzZQ1.zzZZ(fillColor) & 255, com.aspose.words.internal.zzZQ1.zzZY(fillColor) & 255);
        if (com.aspose.words.internal.zzPV.zzZ(this.zzWXL.zzZhC(), com.aspose.words.internal.zzPV.zzHZ)) {
            zz2n.zzJ(zzbwZzZ);
        } else {
            zz2n.zzJ(zzBW.zzj(this.zzWXL.zzZhC()));
        }
        zz2n.zzK(zzbwZzZ);
        zz2n.zzH3(zzZvm());
        zz2n.zzXs(zzZvn());
        return zz2n;
    }

    private zz3V zzXSU() throws Exception {
        zz3V zz3v = new zz3V();
        zz3v.zzZ(zz7G.zzOA(zz84.zzIi(this.zzWXL.getShapeType())));
        zz4N zz4n = new zz4N();
        zz4T zz4t = new zz4T(this.zzWXL.getId(), zzY1(this.zzWXL));
        zz4t.setDescription((String) this.zzWXL.fetchShapeAttr(EditingLanguage.GERMAN_LUXEMBOURG));
        zz4n.zzY(zz4t);
        zzBY zzby = new zzBY();
        zzZ(this.zzWXL, zzby.zzZFL());
        zz4n.zzZ(zzby);
        zz3v.zzZ(zz4n);
        zz3v.zzZ((zzH0) zzY2V.zzZ(this, 3, true));
        if (!this.zzWXL.zzZid()) {
            if (!zz3v.zzZwy().zzZQ1().hasExtensions()) {
                zz3v.zzZwy().zzZQ1().setExtensions(new com.aspose.words.internal.zzZYG<>());
            }
            zz82 zz82Var = new zz82("{28A0092B-C50C-407E-A947-70E740481C1C}", null);
            zz82Var.zzXi(false);
            zz3v.zzZwy().zzZQ1().getExtensions().zzW(zz82Var.getUri(), zz82Var);
        }
        return zz3v;
    }

    private zz2O zzXSV() throws Exception {
        zzC3 zzc2;
        zz4S zz4r;
        zz2O zz2o = new zz2O(8);
        int shapeType = this.zzWXL.getShapeType();
        zz2o.zzZ(zzY2Q.zzY8(this.zzWXL));
        if ((!this.zzWXL.zzY9v() || shapeType == 120 || shapeType == 177) && shapeType != 20) {
            zz4M zz4m = new zz4M();
            zzBX zzbx = new zzBX();
            zzbx.zzXt(this.zzWXL.getShapeType() == 202 || this.zzWXL.isWordArt());
            z = true;
            zz4r = zz4m;
            zzc2 = zzbx;
        } else {
            zz4r = new zz4R();
            zzc2 = new zzC2();
        }
        zzZ(this.zzWXL, zzc2.zzZFL());
        zz4r.zzZ(zzc2);
        zz4r.zzY(new zz4T(this.zzWXL.getId(), this.zzWXL.getName()));
        String str = (String) this.zzWXL.fetchShapeAttr(898);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zz6P zz6p = new zz6P();
            zz6p.setId(str);
            zz6p.zzOu((String) this.zzWXL.fetchShapeAttr(909));
            zz6p.zzOv((String) this.zzWXL.fetchShapeAttr(4120));
            zz4r.zzZxV().zzZ(zz6p);
        }
        zz2o.zzZ(zz4r);
        zz2o.zzLV(((Integer) this.zzWXL.fetchShapeAttr(772)).intValue());
        zz2o.zzY(z ? zzXSP() : new zz0J());
        return zz2o;
    }

    private int zzXSW() {
        zzYM5[] zzym5Arr = (zzYM5[]) this.zzWXL.fetchShapeAttr(StyleIdentifier.LIST_TABLE_4);
        if (this.zzWXL.getShapeType() != 20 || zzym5Arr == null || zzym5Arr.length != 2) {
            return this.zzWXL.getFlipOrientation();
        }
        boolean z = (this.zzWXL.getFlipOrientation() & 2) > 0;
        boolean z2 = (this.zzWXL.getFlipOrientation() & 1) > 0;
        int flipOrientation = this.zzWXL.getFlipOrientation();
        if (zzym5Arr[0].zzYnF().getValue() > zzym5Arr[1].zzYnF().getValue()) {
            flipOrientation = z ? flipOrientation & (-3) : flipOrientation | 2;
        }
        return zzym5Arr[0].zzYnG().getValue() > zzym5Arr[1].zzYnG().getValue() ? z2 ? flipOrientation & (-2) : flipOrientation | 1 : flipOrientation;
    }

    private Shape zzXSX() throws Exception {
        zz2F zz2fZzZf;
        Shape shape = new Shape(this.zzWXL.getDocument(), (byte) 0);
        int shapeType = this.zzWXL.getShapeType();
        shape.zzS((zzYC3) this.zzWXL.zzYvW().zzbn());
        shape.zzZ((zzYEF) this.zzWXL.zzZYh().zzbn());
        shape.setShapeType(shapeType);
        zzYC3 zzyc3ZzYvW = shape.zzYvW();
        if (this.zzWXL.isImage()) {
            shape.setAlternativeText((String) this.zzWXL.fetchShapeAttr(EditingLanguage.GERMAN_LUXEMBOURG));
            shape.setAspectRatioLocked(((Boolean) this.zzWXL.fetchShapeAttr(120)).booleanValue());
            shape.zzYvW().remove(780);
        }
        zzZ(zzyc3ZzYvW, shape);
        if (!zzyc3ZzYvW.contains(772)) {
            zzyc3ZzYvW.zzQ(772, 1);
        }
        String strZzY1 = zzY1(this.zzWXL);
        if (shapeType == 75 && this.zzWXL.hasImage()) {
            shape.zzU(zzXSU());
        } else {
            shape.zzU(zzXSV());
            shape.zzY9i().setName(shape.getName());
            if (this.zzWXL.zzY9o() && (shapeType != 100 || !this.zzWXL.hasImage())) {
                Iterator<T> it = this.zzWXL.getChildNodes(0, false).iterator();
                while (it.hasNext()) {
                    shape.appendChild(((Node) it.next()).deepClone(true));
                }
            }
            if (this.zzWXL.isWordArt()) {
                zzZg(shape);
            } else {
                zzY2(shape);
            }
            if (shapeType == 75) {
                String str = (String) this.zzWXL.getDirectShapeAttr(391);
                if (com.aspose.words.internal.zzZYD.zzXk(str)) {
                    shape.zzY9i().zzZyc().zzZxV().setDescription(str);
                }
                strZzY1 = ShapeType.toString(1) + " " + this.zzWXL.getId();
            }
        }
        if (this.zzWXL.isTopLevel()) {
            shape.setName(strZzY1);
        } else {
            shape.zzY9i().zzZyc().zzZxV().setName(strZzY1);
        }
        shape.setRotation(zzY3(this.zzWXL));
        shape.setFlipOrientation(zzXSW());
        shape.zzY9h().zzU(this.zzWXL.getWidth(), false);
        shape.zzY9h().zzT(this.zzWXL.getHeight(), false);
        if (!this.zzWXL.isWordArt()) {
            zzY2I.zzZ(zzY2I.zzY(this, shape), shape, this);
            zz2J zz2j = (zz2J) shape.zzY9i();
            zz2j.setFill(zzY2V.zzZ(this, shape));
            if (((Boolean) this.zzWXL.fetchShapeAttr(574)).booleanValue() && (zz2fZzZf = zzZf(shape)) != null) {
                if (zz2j.zzZTe() == null) {
                    zz2j.zzZ(new zz2C());
                }
                zz2j.zzZTe().zzZ(zz2fZzZf);
            }
        }
        if (this.zzWWg) {
            com.aspose.words.internal.zzZYG<zz82> zzzyg = new com.aspose.words.internal.zzZYG<>();
            zzzyg.zzW("{A998136B-4AC2-44c3-8CCF-79AB77ABDD1D}", new zz82("{A998136B-4AC2-44c3-8CCF-79AB77ABDD1D}", zzWWe.get("{A998136B-4AC2-44c3-8CCF-79AB77ABDD1D}")));
            shape.zzY9i().zzM(zzzyg);
        }
        if (this.zzWXL.zzY9h().zzZBM()) {
            shape.zzY9i().zzXh(this.zzWXL.zzY9h().zzZBM());
        }
        zzY2Q.zzY7(shape);
        return shape;
    }

    private ShapeBase zzXSY() throws Exception {
        return (this.zzWXL.getShapeType() == -2 || this.zzWXL.getShapeType() == 201 || (this.zzWXL.getShapeType() == 1 && this.zzWXL.hasImage())) ? zzXG(zzXSO()) : zzXSX();
    }

    public static zzZ8T zzY(Shape shape, zzYDZ zzydz) {
        return new zzY2A(shape, false, false, zzydz);
    }

    public static String zzY1(ShapeBase shapeBase) {
        String name = shapeBase.getName();
        if (com.aspose.words.internal.zzZYD.zzXk(name)) {
            return name;
        }
        if (shapeBase.getShapeType() != -1) {
            return ShapeType.toString(shapeBase.getShapeType()) + " " + shapeBase.getId();
        }
        return zzZV9.toString(((GroupShape) shapeBase).zzZ57()) + " " + shapeBase.getId();
    }

    private void zzY2(ShapeBase shapeBase) {
        if (((zz2O) com.aspose.words.internal.zzZKW.zzZ(shapeBase.zzY9i(), zz2O.class)) == null || this.zzWXL.getShapeType() == 75) {
            return;
        }
        ((zz2O) shapeBase.zzY9i()).zzZ(zzXST());
        ((zz2O) shapeBase.zzY9i()).zzZ(zzXSS());
    }

    public static double zzY3(ShapeBase shapeBase) {
        int i;
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(shapeBase.getRotation());
        int flipOrientation = shapeBase.getFlipOrientation();
        return (com.aspose.words.internal.zzAN.zzL(dZzZJ, 0.0d) || (((i = flipOrientation & 1) <= 0 || (flipOrientation & 2) != 0) && ((flipOrientation & 2) <= 0 || i != 0))) ? dZzZJ : 360.0d - dZzZJ;
    }

    public static ShapeBase zzZ(Shape shape, boolean z, boolean z2, zzYDZ zzydz) throws Exception {
        return new zzY2A(shape, z, z2, zzydz).zzXSY();
    }

    private static double zzZ2(int i, boolean z) {
        if (i > com.aspose.words.internal.zzSA.zzl(90.0d) || i < com.aspose.words.internal.zzSA.zzl(-90.0d)) {
            return 0.0d;
        }
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(((double) i) / 65536.0d);
        if (z && dZzZJ > 0.0d) {
            dZzZJ = 360.0d - dZzZJ;
        }
        return dZzZJ * 60000.0d;
    }

    private int zzZPy() {
        int iZzXQ = zz00.zzXQ(com.aspose.words.internal.zzZPY.zzG((float) (((double) this.zzWXL.zzYaW()) / 65536.0d), (float) (((double) this.zzWXL.zzYaV()) / 65536.0d)));
        boolean zZzYb4 = this.zzWXL.zzYb4();
        switch (iZzXQ) {
            case 0:
                return zZzYb4 ? 0 : 9;
            case 1:
                return zZzYb4 ? 1 : 10;
            case 2:
                return zZzYb4 ? 2 : 11;
            case 3:
                return zZzYb4 ? 3 : 12;
            case 4:
                return zZzYb4 ? 4 : 13;
            case 5:
                return zZzYb4 ? 5 : 14;
            case 6:
                return zZzYb4 ? 6 : 15;
            case 7:
                return zZzYb4 ? 7 : 16;
            case 8:
                return zZzYb4 ? 8 : 17;
            default:
                return zZzYb4 ? 2 : 11;
        }
    }

    private static zzZ5K zzZV(int i, int i2, int i3) {
        return new zzZ5K(i, new com.aspose.words.internal.zzQ6(((double) i2) / 65536.0d, ((double) i3) / 65536.0d, 0.152587890625d));
    }

    private static void zzZe(Shape shape) throws Exception {
        zz3V zz3v = (zz3V) com.aspose.words.internal.zzZKW.zzZ(shape.zzY9i(), zz3V.class);
        if (zz3v == null) {
            return;
        }
        zz3Z zz3zZzZPZ = zz3v.zzZwy().zzZPZ();
        com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(shape.getImageData().getImageBytes());
        int width = zzegZzZT.getWidth() - com.aspose.words.internal.zzAN.zzZG(ConvertUtil.pointToPixel(shape.getWidth()));
        if (width > 0) {
            int i = width / 2;
            zz3zZzZPZ.zzXF(((double) i) / ((double) zzegZzZT.getWidth()));
            zz3zZzZPZ.zzXE(((double) (width - i)) / ((double) zzegZzZT.getWidth()));
        }
        int height = zzegZzZT.getHeight() - com.aspose.words.internal.zzAN.zzZG(ConvertUtil.pointToPixel(shape.getHeight()));
        if (height > 0) {
            int i2 = height / 2;
            zz3zZzZPZ.zzXG(((double) i2) / ((double) zzegZzZT.getHeight()));
            zz3zZzZPZ.zzXH(((double) (height - i2)) / ((double) zzegZzZT.getHeight()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zz2F zzZf(Shape shape) {
        double d;
        int i;
        double d2;
        zz2F zz2f;
        if (this.zzWXL.isGroup()) {
            return null;
        }
        double dIntValue = ((Integer) this.zzWXL.fetchShapeAttr(517)).intValue();
        double dAtan2 = Math.atan2(((Integer) this.zzWXL.fetchShapeAttr(518)).intValue(), dIntValue);
        zzHK zzhkZzYR = zzHK.zzYR(com.aspose.words.internal.zzAN.zzZJ(com.aspose.words.internal.zzAN.zzZK(dAtan2)));
        double dAbs = Math.abs(dIntValue / Math.cos(dAtan2));
        com.aspose.words.internal.zzPV zzpvZzYbi = this.zzWXL.zzYbi();
        double dIntValue2 = ((double) ((Integer) this.zzWXL.fetchShapeAttr(516)).intValue()) / 65536.0d;
        double dIntValue3 = ((double) ((Integer) this.zzWXL.fetchShapeAttr(521)).intValue()) / 65536.0d;
        double dIntValue4 = ((double) ((Integer) this.zzWXL.fetchShapeAttr(524)).intValue()) / 65536.0d;
        double dIntValue5 = ((double) ((Integer) this.zzWXL.fetchShapeAttr(522)).intValue()) / 65536.0d;
        double dAtan = Math.atan(dIntValue5);
        double dIntValue6 = ((double) ((Integer) this.zzWXL.fetchShapeAttr(523)).intValue()) / 65536.0d;
        double dAtan3 = Math.atan(dIntValue6);
        double dIntValue7 = ((double) ((Integer) this.zzWXL.fetchShapeAttr(528)).intValue()) / 65536.0d;
        double dIntValue8 = ((double) ((Integer) this.zzWXL.fetchShapeAttr(529)).intValue()) / 65536.0d;
        int iIntValue = ((Integer) this.zzWXL.fetchShapeAttr(525)).intValue();
        int iIntValue2 = ((Integer) this.zzWXL.fetchShapeAttr(526)).intValue();
        int iZzXQ = zz00.zzXQ(com.aspose.words.internal.zzZPY.zzG((float) dIntValue7, (float) dIntValue8));
        int iIntValue3 = ((Integer) this.zzWXL.fetchShapeAttr(512)).intValue();
        boolean z = iIntValue3 == 1;
        if (iIntValue3 == 5) {
            d = dIntValue8;
            boolean z2 = this.zzWXL.zzYvW().contains(StyleIdentifier.PLAIN_TABLE_2);
            boolean z3 = iIntValue3 != 2 && iIntValue == 0 && iIntValue2 == -16 && (iZzXQ == 6 || iZzXQ == 8);
            if ((!z || z2 || z3) && !this.zzYMK) {
                zz1W zz1w = new zz1W();
                if (iIntValue3 == 5) {
                    i = dAtan2 > 0.0d ? 8 : 9;
                } else if (iIntValue3 != 2) {
                    i = 4;
                } else if (iZzXQ == 6) {
                    i = dIntValue4 > 0.0d ? 2 : 6;
                } else if (iZzXQ == 8) {
                    i = dIntValue4 > 0.0d ? 3 : 7;
                }
                zz1w.zzGW(i);
                zz1w.zzQ(zzhkZzYR);
                zz1w.zzXo(com.aspose.words.internal.zzZKQ.zzZa(dAbs));
                zz1w.zzZ(zzBW.zzZ(dIntValue2, zzpvZzYbi.zzPC(), zzpvZzYbi.zzPB(), zzpvZzYbi.zzPA()));
                d2 = dIntValue3;
                zz2f = zz1w;
            } else {
                zz21 zz21Var = new zz21();
                zz21Var.zzQ(zzhkZzYR);
                zz21Var.zzXo(com.aspose.words.internal.zzZKQ.zzZa(dAbs));
                zz21Var.zzXn(dIntValue3);
                zz21Var.zzXm(dIntValue4);
                zz21Var.zzP(zzHK.zzYR(com.aspose.words.internal.zzAN.zzZK(dAtan)));
                zz21Var.zzO(zzHK.zzYR(com.aspose.words.internal.zzAN.zzZK(dAtan3)));
                zz21Var.setAlignment(iZzXQ);
                zz21Var.zzXp(0.0d);
                if (this.zzYMK) {
                    dIntValue2 = 1.0d - dIntValue2;
                }
                zz21Var.zzZ(zzBW.zzZ(dIntValue2, zzpvZzYbi.zzPC(), zzpvZzYbi.zzPB(), zzpvZzYbi.zzPA()));
                d2 = dIntValue3;
                zz2f = zz21Var;
            }
            zzY2Q.zzZ(shape, iIntValue3, dIntValue7, d, d2, dIntValue6, dIntValue5, dIntValue4, dAbs, zzhkZzYR);
            return zz2f;
        }
        d = dIntValue8;
        if (iIntValue3 != 2) {
        }
        if (z) {
            zz1W zz1w2 = new zz1W();
            if (iIntValue3 == 5) {
            }
            zz1w2.zzGW(i);
            zz1w2.zzQ(zzhkZzYR);
            zz1w2.zzXo(com.aspose.words.internal.zzZKQ.zzZa(dAbs));
            zz1w2.zzZ(zzBW.zzZ(dIntValue2, zzpvZzYbi.zzPC(), zzpvZzYbi.zzPB(), zzpvZzYbi.zzPA()));
            d2 = dIntValue3;
            zz2f = zz1w2;
        } else {
            zz1W zz1w22 = new zz1W();
            if (iIntValue3 == 5) {
            }
            zz1w22.zzGW(i);
            zz1w22.zzQ(zzhkZzYR);
            zz1w22.zzXo(com.aspose.words.internal.zzZKQ.zzZa(dAbs));
            zz1w22.zzZ(zzBW.zzZ(dIntValue2, zzpvZzYbi.zzPC(), zzpvZzYbi.zzPB(), zzpvZzYbi.zzPA()));
            d2 = dIntValue3;
            zz2f = zz1w22;
        }
        zzY2Q.zzZ(shape, iIntValue3, dIntValue7, d, d2, dIntValue6, dIntValue5, dIntValue4, dAbs, zzhkZzYR);
        return zz2f;
    }

    private void zzZg(Shape shape) throws Exception {
        zzYMX zzymx = new zzYMX();
        zzymx.zzBl(94);
        zzymx.zzw5(0);
        zzymx.setSpaceBeforeAuto(false);
        zzymx.zzw3(0);
        zzymx.setSpaceAfterAuto(false);
        zzymx.setAlignment(zz00.zzGA(((Integer) this.zzWXL.fetchShapeAttr(194)).intValue()));
        zzYEF zzyef = new zzYEF();
        zz2N zz2nZzXST = zzXST();
        if (zz2nZzXST != null) {
            zzyef.zzQ(840, zz2nZzXST);
        }
        zzYEF zzyef2 = new zzYEF();
        if (this.zzWXL.zzYvW().contains(197)) {
            zzyef2.setName((String) this.zzWXL.fetchShapeAttr(197));
        }
        int iZzt = com.aspose.words.internal.zzSA.zzt(((double) ((Integer) this.zzWXL.fetchShapeAttr(195)).intValue()) / 65536.0d);
        if (iZzt <= 2 && com.aspose.words.internal.zzZYD.zzg(this.zzWXL.getName(), "PowerPlusWaterMarkObject")) {
            iZzt = 72;
        }
        zzyef2.zzvA(iZzt);
        zzyef2.setSize(iZzt);
        if (((Boolean) this.zzWXL.fetchShapeAttr(574)).booleanValue()) {
            zzyef2.zzQ(815, zzZf(shape));
        }
        if (((Boolean) this.zzWXL.fetchShapeAttr(508)).booleanValue() && zz2nZzXST == null) {
            zzyef2.zzQ(825, zzY2I.zzY(this, shape));
        }
        zz7X zz7xZzZ = zzY2V.zzZ(this, shape);
        if (zz7xZzZ != null && zz7xZzZ.zzZQ4() != 3) {
            zzyef2.zzQ(830, zz7xZzZ);
        }
        if (((Boolean) this.zzWXL.fetchShapeAttr(StyleIdentifier.MEDIUM_LIST_2_ACCENT_6)).booleanValue()) {
            zzyef2.setUnderline(1);
        }
        if (((Boolean) this.zzWXL.fetchShapeAttr(255)).booleanValue()) {
            zzyef2.zzQ(80, zzZU.zzZF6);
        }
        if (((Boolean) this.zzWXL.fetchShapeAttr(250)).booleanValue()) {
            zzyef2.zzQ(60, zzZU.zzZF6);
        }
        if (((Boolean) this.zzWXL.fetchShapeAttr(StyleIdentifier.MEDIUM_LIST_1_ACCENT_6)).booleanValue()) {
            zzyef2.zzQ(70, zzZU.zzZF6);
        }
        if (zz2nZzXST != null) {
            zzyef2.zzQ(840, zz2nZzXST);
        }
        for (String str : com.aspose.words.internal.zzZKN.zzR((String) this.zzWXL.fetchShapeAttr(192), '\n')) {
            Paragraph paragraph = new Paragraph(this.zzWXL.getDocument());
            paragraph.zzC(zzyef);
            paragraph.zzZ(zzymx);
            paragraph.getRuns().add(new Run(this.zzWXL.getDocument(), str, zzyef2));
            shape.appendChild(paragraph);
        }
    }

    private int zzZvm() {
        if (this.zzWXL.zzYaF()) {
            return 2;
        }
        if (this.zzWXL.getRenderMode() == 1) {
            return 3;
        }
        return this.zzWXL.zzYaH() > 0 ? 1 : 0;
    }

    private double zzZvn() {
        int iZzYB = com.aspose.words.internal.zzSA.zzYB(9600);
        int iZzYb1 = this.zzWXL.zzYb1();
        if (iZzYb1 > iZzYB) {
            return com.aspose.words.internal.zzSA.zzYB(36) - 27000;
        }
        if (iZzYb1 > com.aspose.words.internal.zzSA.zzYB(StyleIdentifier.GRID_TABLE_2_ACCENT_2)) {
            return com.aspose.words.internal.zzSA.zzYB(StyleIdentifier.GRID_TABLE_2_ACCENT_2);
        }
        if (iZzYb1 < 27000) {
            return 0.0d;
        }
        return iZzYb1 - 27000;
    }

    private static int zzii(int i) {
        switch (i) {
            case 24:
                return 2;
            case 25:
                return 3;
            case 26:
                return 4;
            case 27:
            case 30:
                return 41;
            case 28:
                return 22;
            case 29:
                return 14;
            case 31:
                return 10;
            default:
                switch (i) {
                    case 136:
                        return 2;
                    case 137:
                        return 3;
                    case 138:
                        return 4;
                    case 139:
                        return 5;
                    case 140:
                        return 6;
                    case 141:
                        return 7;
                    case 142:
                        return 8;
                    case 143:
                        return 9;
                    case 144:
                        return 10;
                    case 145:
                        return 11;
                    case 146:
                        return 12;
                    case 147:
                        return 13;
                    case 148:
                        return 14;
                    case 149:
                        return 15;
                    case 150:
                        return 16;
                    case 151:
                        return 17;
                    case 152:
                        return 18;
                    case 153:
                        return 19;
                    case 154:
                        return 40;
                    case 155:
                        return 21;
                    case 156:
                        return 22;
                    case 157:
                        return 23;
                    case 158:
                        return 24;
                    case 159:
                        return 25;
                    case 160:
                        return 26;
                    case 161:
                        return 27;
                    case 162:
                        return 28;
                    case 163:
                        return 29;
                    case 164:
                        return 30;
                    case 165:
                        return 31;
                    case 166:
                        return 32;
                    case 167:
                        return 33;
                    case 168:
                        return 34;
                    case 169:
                        return 35;
                    case 170:
                        return 36;
                    case 171:
                        return 37;
                    case 172:
                        return 38;
                    case 173:
                        return 39;
                    case 174:
                        return 20;
                    case 175:
                        return 41;
                    default:
                        return 0;
                }
        }
    }

    private static int zzij(int i) {
        if (zzWWd.containsKey(Integer.valueOf(i))) {
            return zzWWd.get(Integer.valueOf(i)).getDirection();
        }
        return 4;
    }

    private static int zzik(int i) {
        switch (i) {
            case 0:
            case 8:
                return 9;
            case 1:
            case 3:
            case 5:
            case 7:
                return 10;
            case 2:
            case 6:
                return 11;
            case 4:
                return 8;
            default:
                return 0;
        }
    }

    private static int zzil(int i) {
        switch (i) {
            case 0:
            case 8:
                return 1;
            case 1:
            case 3:
            case 5:
            case 7:
                return 2;
            case 2:
            case 6:
                return 3;
            case 4:
            default:
                return 0;
        }
    }

    private static int zzim(int i) {
        switch (i) {
            case 0:
            case 8:
                return 5;
            case 1:
            case 3:
            case 5:
            case 7:
                return 6;
            case 2:
            case 6:
                return 7;
            case 4:
                return 4;
            default:
                return 0;
        }
    }

    private int zzin(int i) {
        int iZzYaI = this.zzWXL.zzYaI();
        if (iZzYaI == 4000) {
            return zzik(i);
        }
        if (iZzYaI == 10000) {
            return zzim(i);
        }
        if (iZzYaI == 20000) {
            return zzil(i);
        }
        return 0;
    }

    private static boolean zzm(DocumentBase documentBase) {
        ArrayList arrayListZzYAN = documentBase.getChildNodes(18, true).zzYAN();
        com.aspose.words.internal.zzZQG.zzZ(arrayListZzYAN, (Iterable) documentBase.getChildNodes(17, true).zzYAN());
        Iterator it = arrayListZzYAN.iterator();
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            ShapeBase shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ((Node) it.next(), ShapeBase.class);
            if (shapeBase.isTopLevel()) {
                z = z || !shapeBase.getAllowOverlap();
                i++;
            }
        }
        return i <= 1 || !z;
    }

    @Override // com.aspose.words.zzZ8T
    public final boolean isWordArt() {
        return this.zzYMK;
    }

    @Override // com.aspose.words.zzZ8T
    public final boolean zzYW7() {
        return this.zzWWf;
    }

    @Override // com.aspose.words.zzZ8T
    public final ShapeBase zzYW8() {
        return this.zzWXL;
    }

    @Override // com.aspose.words.zzZ8T
    public final boolean zzZic() {
        return this.zzWWg;
    }

    private static void zzZ(zzYC3 zzyc3, Shape shape) {
        if (!zzyc3.contains(901) || shape.getDistanceTop() < 0.0d) {
            shape.setDistanceTop(0.0d);
        }
        if (!zzyc3.contains(903) || shape.getDistanceBottom() < 0.0d) {
            shape.setDistanceBottom(0.0d);
        }
        if (!zzyc3.contains(SQLitePersistence.MAX_ARGS) || shape.getDistanceLeft() <= 0.0d) {
            shape.setDistanceLeft(zzyc3.isInline() ? 0.0d : 9.0d);
        }
        if (!zzyc3.contains(902) || shape.getDistanceRight() <= 0.0d) {
            shape.setDistanceRight(zzyc3.isInline() ? 0.0d : 9.0d);
        }
    }

    public static void zzZ(ShapeBase shapeBase, zz5G zz5g) {
        int shapeType = shapeBase.getShapeType();
        if (shapeType == 75) {
            zz5g.zza(3, true);
            zz5g.zza(8, true);
            zzZ(shapeBase, 123, zz5g);
        } else {
            if (shapeBase.zzY9v() || shapeType == 20) {
                if (shapeType != 120 && shapeType != 177) {
                    zz5g.zza(9, true);
                } else {
                    zz5g.zza(8, true);
                }
            } else if (shapeType != 41 && shapeType != 42 && shapeType != 43 && shapeType != 44 && shapeType != 45 && shapeType != 46 && shapeType != 47 && shapeType != 48 && shapeType != 49 && shapeType != 50 && shapeType != 51 && shapeType != 52 && shapeType != 178 && shapeType != 179 && shapeType != 180 && shapeType != 181 && shapeType != 85 && shapeType != 86 && shapeType != 87 && shapeType != 88 && shapeType != -1) {
                zz5g.zza(8, true);
                if (shapeBase.isWordArt()) {
                    zz5g.zza(9, true);
                    zz5g.zza(13, true);
                }
            }
            zzZ(shapeBase, 126, zz5g);
            zzZ(shapeBase, 828, zz5g);
            zzZ(shapeBase, 124, zz5g);
            zzZ(shapeBase, 119, zz5g);
            zzZ(shapeBase, 120, zz5g);
            zzZ(shapeBase, 127, zz5g);
            zzZ(shapeBase, 118, zz5g);
            zzZ(shapeBase, 121, zz5g);
            zzZ(shapeBase, 122, zz5g);
        }
        zzZ(shapeBase, 125, zz5g);
        zzZ(shapeBase, 126, zz5g);
        zzZ(shapeBase, 828, zz5g);
        zzZ(shapeBase, 124, zz5g);
        zzZ(shapeBase, 119, zz5g);
        zzZ(shapeBase, 120, zz5g);
        zzZ(shapeBase, 127, zz5g);
        zzZ(shapeBase, 118, zz5g);
        zzZ(shapeBase, 121, zz5g);
        zzZ(shapeBase, 122, zz5g);
    }

    private static void zzZ(ShapeBase shapeBase, int i, zz5G zz5g) {
        Object directShapeAttr = shapeBase.getDirectShapeAttr(i);
        if (directShapeAttr != null) {
            zz5g.zza(zzY30.zziD(i), ((Boolean) directShapeAttr).booleanValue());
        }
    }

    private static void zzZ(ShapeBase shapeBase, Shape shape) throws Exception {
        double width = shapeBase.getWidth();
        double height = shapeBase.getHeight();
        Object objZzPk = shapeBase.zzYvW().zzPk(4);
        int iZzZG = objZzPk != null ? com.aspose.words.internal.zzAN.zzZG(((double) ((Integer) objZzPk).intValue()) / 65536.0d) : 0;
        if (iZzZG == 90 || iZzZG == 270) {
            double d = (height - width) / 2.0d;
            shape.setLeft(shape.getLeft() - d);
            shape.setTop(shape.getTop() + d);
            width = shapeBase.getHeight();
            height = shapeBase.getWidth();
        }
        boolean zZzm = zzm(shapeBase.getDocument());
        if (zZzm) {
            com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(shape.getImageData().getImageBytes());
            if (!shapeBase.isInline() && shapeBase.getShapeType() != 202) {
                if (shapeBase.getHorizontalAlignment() == 0) {
                    shape.setLeft(shape.getLeft() - ((zzegZzZT.getWidthPoints() - width) / 2.0d));
                }
                if (shapeBase.getVerticalAlignment() == 0) {
                    shape.setTop(shape.getTop() - ((zzegZzZT.getHeightPoints() - height) / 2.0d));
                }
            }
            width = zzegZzZT.getWidthPoints();
            height = zzegZzZT.getHeightPoints();
        }
        shape.zzY9h().zzU(width, false);
        shape.zzY9h().zzT(height, false);
        if (zZzm) {
            return;
        }
        zzZe(shape);
    }
}
