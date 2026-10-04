package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTI {
    static boolean zzZD5 = false;
    private zzZT6 zzYJZ;
    private zzZTJ zzYK0;
    private Shape zzYSf;
    private Document zzZEY;
    private IWarningCallback zzZG0;
    private com.aspose.words.internal.zzD3<ShapeBase> zzYJY = new com.aspose.words.internal.zzD3<>();
    private com.aspose.words.internal.zzD3<ShapeBase> zzYJX = new com.aspose.words.internal.zzD3<>();
    private com.aspose.words.internal.zzXA<zzZTW> zzYJW = new com.aspose.words.internal.zzXA<>();

    public zzZTI(Document document, IWarningCallback iWarningCallback) {
        this.zzZEY = document;
        this.zzZG0 = iWarningCallback;
    }

    private com.aspose.words.internal.zzD3<ShapeBase> zzEa(int i) {
        if (i == 0) {
            return this.zzYJY;
        }
        if (i == 1) {
            return this.zzYJX;
        }
        throw new IllegalStateException("Unexpected drawing type.");
    }

    private static ArrayList<ShapeBase> zzT(com.aspose.words.internal.zzD3<ShapeBase> zzd3) {
        ArrayList<ShapeBase> arrayList = new ArrayList<>(zzd3.getCount());
        Iterator<ShapeBase> it = zzd3.zzCJ().iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, it.next());
        }
        zzYBT.zzS(arrayList);
        return arrayList;
    }

    private int zzU(zzZSP zzzsp) throws Exception {
        int position = (int) zzzsp.zzq().getPosition();
        this.zzYK0.zzS(zzzsp);
        for (zzZTL zzztl : this.zzYJZ) {
            zzzsp.zzr((byte) zzztl.zzZix());
            zzztl.zzS(zzzsp);
        }
        return ((int) zzzsp.zzq().getPosition()) - position;
    }

    private void zzZiA() {
        zzZTK zzztkZzZiq = this.zzYK0.zzZiq();
        zzztkZzZiq.zzZiu().clear();
        int iZzZiC = 0;
        for (zzZTL zzztl : this.zzYJZ) {
            zzztl.zzZiw().zzZi7().zzE4((zzztkZzZiq.zzZiu().size() + 1) * 1024);
            zzztl.zzZiA();
            int iZzZiB = (zzztl.zzZiz().zzZiB() - zzztl.zzZiw().zzZi7().zzZih()) + 1;
            while (iZzZiB > 0) {
                int iMin = Math.min(iZzZiB, 1024);
                zzztkZzZiq.zzZiu().add(new zzZTG(zzztl.zzZiz().zzZii().zzZim(), iMin));
                iZzZiB -= iMin;
            }
            iZzZiC += zzztl.zzZiz().zzZiC();
            zzztkZzZiq.zzEb(zzztkZzZiq.zzZiv() + 1);
        }
        zzztkZzZiq.zzEg(iZzZiC);
        zzztkZzZiq.zzEc(((zzztkZzZiq.zzZiu().size() + 1) * 1024) + 2);
    }

    private boolean zzZip() {
        return this.zzYSf != null || this.zzYJY.getCount() > 0 || this.zzYJX.getCount() > 0;
    }

    public final Shape getBackgroundShape() {
        return this.zzYSf;
    }

    public final Document getDocument() {
        return this.zzZEY;
    }

    public final void setBackgroundShape(Shape shape) {
        this.zzYSf = shape;
    }

    public final ShapeBase zzXX(int i, int i2) {
        return zzEa(i2).get(i);
    }

    public final void zzY(ShapeBase shapeBase, int i) {
        zzEa(i).add(shapeBase.getId(), shapeBase);
    }

    public final void zzZ(com.aspose.words.internal.zzZOX zzzox, int i, int i2, com.aspose.words.internal.zzZOX zzzox2) throws Exception {
        if (zzZD5) {
            com.aspose.words.internal.zzZKN.format("\nReading Escher, length:{0}", Integer.valueOf(i2));
        }
        if (i2 == 0) {
            return;
        }
        zzzox.zzq().zzH(i);
        int i3 = i + i2;
        zzZT7 zzzt7ZzZ = zzZT5.zzZ(zzzox, this.zzZG0);
        zzZTJ zzztj = (zzZTJ) com.aspose.words.internal.zzZKW.zzZ(zzzt7ZzZ, zzZTJ.class);
        if (zzztj == null) {
            zzzox.zzq().zzH(i3);
            zzY1Z.zzZ(this.zzZG0, 10, "Unknown OfficeArt record 0x{0:x4} found, ignored.", Integer.valueOf(zzzt7ZzZ.zzZii().getType()));
            return;
        }
        this.zzYK0 = zzztj;
        zzztj.zzz(zzzox2);
        if (this.zzYK0.zzZir() != null) {
            for (zzZTW zzztw : this.zzYK0.zzZir().zzZiD()) {
                if (zzztw.zzZiJ() != null) {
                    zzY(zzztw);
                }
            }
        }
        this.zzYJZ = new zzZT6();
        while (zzzox.zzq().getPosition() < i3) {
            int i4 = zzzox.readByte() & 255;
            zzZTL zzztl = (zzZTL) zzZT5.zzZ(zzzox, this.zzZG0);
            zzztl.zzEd(i4);
            this.zzYJZ.zzZ(zzztl);
        }
        Iterator<zzZT7> it = this.zzYJZ.iterator();
        while (it.hasNext()) {
            zzZ((zzZTL) it.next());
        }
    }

    private void zzY(zzZTW zzztw) {
        this.zzYJW.zzY(zzztw.zzZiJ().zzZiM(), zzztw);
    }

    public final int zzZ(com.aspose.words.internal.zzZOW zzzow, com.aspose.words.internal.zzZOW zzzow2, boolean z, DocSaveOptions docSaveOptions) throws Exception {
        if (!zzZip()) {
            return 0;
        }
        this.zzYK0 = zzZTJ.zzZit();
        this.zzYJZ = new zzZT6();
        com.aspose.words.internal.zzXB zzxb = new com.aspose.words.internal.zzXB();
        zzZ(0, zzxb);
        if (z) {
            zzZ(1, zzxb);
        }
        this.zzYK0.zzX(new zzZSP(zzzow2, docSaveOptions));
        this.zzYK0.zzZis();
        zzZiA();
        return zzU(new zzZSP(zzzow, docSaveOptions));
    }

    private void zzZ(int i, com.aspose.words.internal.zzXB zzxb) throws Exception {
        Shape shape;
        zzZTL zzztlZzEe = zzZTL.zzEe(i);
        zzZSU zzzsu = new zzZSU();
        zzZT1 zzzt1 = new zzZT1(new zzZTN(this.zzZEY, this.zzYK0.zzZir(), zzzsu, zzxb, this.zzZG0));
        ArrayList<ShapeBase> arrayListZzT = zzT(zzEa(i));
        zzZSZ zzzszZzZiw = zzztlZzEe.zzZiw();
        for (int i2 = 0; i2 < arrayListZzT.size(); i2++) {
            zzzszZzZiw.zzZiD().zzZ(zzzt1.zzX(arrayListZzT.get(i2), 1));
        }
        if (i == 0 && (shape = this.zzYSf) != null) {
            zzztlZzEe.zzZiD().zzZ(zzzt1.zzW(shape, 0));
        }
        if (zzzsu.getCount() > 0) {
            zzztlZzEe.zzZiD().zzZ(zzzsu);
        }
        this.zzYJZ.zzZ(zzztlZzEe);
    }

    private void zzZ(zzZTL zzztl) throws Exception {
        zzZTN zzztn = new zzZTN(this.zzZEY, this.zzYK0.zzZir(), zzztl.zzZiy(), this.zzZG0);
        zzZT1 zzzt1 = new zzZT1(zzztn);
        com.aspose.words.internal.zzD3<ShapeBase> zzd3ZzEa = zzEa(zzztl.zzZix());
        for (int i = 0; i < zzztl.getCount(); i++) {
            zzZT7 zzzt7ZzEi = zzztl.zzEi(i);
            int type = zzzt7ZzEi.zzZii().getType();
            if (type != 61448 && type != 61720) {
                switch (type) {
                    case 61443:
                        zzZSZ zzzsz = (zzZSZ) zzzt7ZzEi;
                        if (zzzsz.zzZi7().zzZig() && !zzzsz.zzZi7().zzZie()) {
                            zzZ(zzzsz, zzzt1, zzd3ZzEa);
                        }
                        break;
                    case 61444:
                        zzZT2 zzzt2 = (zzZT2) zzzt7ZzEi;
                        if (zzzt2.zzZi7().zzZic() && !zzzt2.zzZi7().zzZie()) {
                            this.zzYSf = zzzt1.zzZ(zzzt2);
                        }
                        break;
                    case 61445:
                        break;
                    default:
                        throw new IllegalStateException("Unknown record type in an escher drawing.");
                }
            }
        }
        zzZ(zzd3ZzEa, zzztn);
    }

    private static void zzZ(com.aspose.words.internal.zzD3<ShapeBase> zzd3, zzZTN zzztn) {
        for (Map.Entry<Integer, Integer> entry : zzztn.zzYK8.entrySet()) {
            ShapeBase shapeBase = zzd3.get(entry.getKey().intValue());
            ShapeBase shapeBase2 = zzd3.get(entry.getValue().intValue());
            if (shapeBase != null && shapeBase2 != null) {
                shapeBase.setShapeType(shapeBase2.getShapeType());
            }
        }
    }

    private static void zzZ(zzZSZ zzzsz, zzZT1 zzzt1, com.aspose.words.internal.zzD3<ShapeBase> zzd3) throws Exception {
        for (int i = 1; i < zzzsz.getCount(); i++) {
            ShapeBase shapeBaseZzX = zzzt1.zzX((zzZTO) zzzsz.zzEi(i));
            shapeBaseZzX.setZOrder(i - 1);
            zzd3.set(shapeBaseZzX.getId(), shapeBaseZzX);
        }
    }
}
