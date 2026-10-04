package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYNA {
    private int zzKF;
    private int zzXHF = -1;
    private HashMap<Node, zzYAU> zzXHG;
    private zzZYW zzYRh;
    private Document zzZEY;

    public zzYNA(Document document, zzZ6R zzz6r) {
        this.zzZEY = document;
        document.zzY(zzz6r);
        this.zzYRh = new zzZYW(this.zzZEY);
    }

    private zzYN8 zzYJb() {
        return this.zzYRh.zzZp0().zzYJb();
    }

    public final int getCount() {
        return this.zzYRh.zzZp0().zzv5(3);
    }

    public final int getState() {
        return this.zzKF;
    }

    public final zzYAT zzCY(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        return (zzYAT) this.zzYRh.zzZoO().get(str);
    }

    public final zzYAH zzJ(FieldStart fieldStart) {
        return (zzYAH) com.aspose.words.internal.zzQW.zzZ((Map<FieldStart, TValue>) this.zzYRh.zzZqO(), fieldStart);
    }

    public final void zzY(Field field, zzZQI zzzqi) {
        this.zzYRh.zzZ(field, zzzqi);
    }

    public final int zzYqt() throws Exception {
        return new zzZ5A(this.zzYRh, this.zzZEY.zzZpV().zzYVa).zzYQH();
    }

    public final void zzYqu() throws Exception {
        zzYS.zzZ(this.zzYRh, 2);
        if (this.zzKF != 0) {
            throw new Exception("Layout can be built only once.");
        }
        try {
            this.zzKF = 1;
            zzY81 zzy81 = new zzY81(this.zzZEY);
            try {
                zzZYM zzzym = new zzZYM();
                zzYDZ zzydz = new zzYDZ(this.zzZEY, null, null, this.zzYRh.zza8().zzYTe());
                zzzym.zzX(zzydz);
                this.zzYRh.zza8().zzUZ((zzydz.zzXp7 || zzydz.zzXp6) ? false : true);
                zzZYO zzzyo = new zzZYO(this.zzZEY, this.zzYRh.zza8(), this.zzYRh.zzZoP(), this.zzYRh.zzZoO());
                zzYS.zzZ(this.zzYRh, 4);
                zzZYV zzzyvZzZoS = this.zzYRh.zzZoS();
                while (zzzyo.moveNext()) {
                    zzzyvZzZoS.zzZ(zzzyo.zzZnU(), zzzyo.zz14());
                    zzYS.zzZ(this.zzYRh, 1);
                }
                zzYS.zzZ(this.zzYRh, 5);
                this.zzYRh.zzZ(this.zzZEY, zzzyvZzZoS);
                this.zzYRh.zzZoN();
                this.zzZEY.getBuiltInDocumentProperties().setPages(this.zzYRh.zzZp0().zzv5(3));
                zzzym.zzZnb();
                zzy81.dispose();
                this.zzXHF = this.zzZEY.zzZq4();
            } catch (Throwable th) {
                zzy81.dispose();
                throw th;
            }
        } finally {
            this.zzKF = 2;
            zzYS.zzZ(this.zzYRh, 3);
        }
    }

    public final boolean zzYqv() {
        return this.zzZEY.zzZq4() != this.zzXHF;
    }

    public final zzZQJ zzZ(zzZOR zzzor) {
        return new zzYAE(this.zzZEY, zzzor);
    }

    public final zzY9X zzZb(ShapeBase shapeBase) throws Exception {
        if (this.zzXHG == null) {
            this.zzXHG = new HashMap<>();
            zzZ(this.zzYRh.zzZp0().zzY4s().zzYPe(), this.zzXHG);
            zzZ(this.zzYRh.zzZoZ().zzY4s().zzYPe(), this.zzXHG);
            zzZ(this.zzYRh.zzZoY().zzY4s().zzYPe(), this.zzXHG);
            for (zzYN8 zzyn8ZzYJb = zzYJb(); zzyn8ZzYJb != null; zzyn8ZzYJb = (zzYN8) zzyn8ZzYJb.zzYo1()) {
                if (zzyn8ZzYJb.zzYqq() != null) {
                    zzZ(zzyn8ZzYJb.zzYqq().zzaa().zzY4s(), this.zzXHG);
                }
                if (zzyn8ZzYJb.zzYqp() != null) {
                    zzZ(zzyn8ZzYJb.zzYqp().zzaa().zzY4s(), this.zzXHG);
                }
            }
        }
        return (zzY9X) com.aspose.words.internal.zzQW.zzZ(this.zzXHG, shapeBase);
    }

    public final com.aspose.words.internal.zzZL zzZc(ShapeBase shapeBase) throws Exception {
        if (shapeBase == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: shape");
        }
        if (shapeBase.getDocument() != this.zzZEY) {
            throw new IllegalArgumentException("Shape is not from the document used to build this layout.\r\nParameter name: shape");
        }
        zzY9X zzy9xZzZb = zzZb(shapeBase);
        if (zzy9xZzZb != null) {
            return zzy9xZzZb.zzbF();
        }
        return null;
    }

    public final void zzZoN() throws Exception {
        this.zzYRh.zzZoN();
    }

    public final zzZYW zzZoz() {
        return this.zzYRh;
    }

    public final int zzqN(int i) throws Exception {
        this.zzYRh.zzZp0();
        zzYN8 zzyn8ZzYJb = this.zzYRh.zzZp0().zzYJb();
        while (i > 0 && zzyn8ZzYJb != null) {
            zzyn8ZzYJb = (zzYN8) zzyn8ZzYJb.zzYo1();
            i--;
        }
        if (i != 0 || zzyn8ZzYJb == null) {
            return -1;
        }
        for (zzUZ zzuz = (zzUZ) zzyn8ZzYJb.zz6x(); zzuz != null; zzuz = (zzUZ) zzuz.zz5Z()) {
            for (zzYMD zzymdZz6x = zzuz.zz6x(); zzymdZz6x != null; zzymdZz6x = zzymdZz6x.zz5Z()) {
                zzZ55 zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzymdZz6x, zzZ55.class);
                if (zzz55 != null && zzz55.getLineNumber() >= 0) {
                    return zzz55.getLineNumber();
                }
            }
        }
        return -1;
    }

    public final zzZ6P zzqO(int i) {
        zzYN8 zzyn8ZzYJb = zzYJb();
        if (i != 0) {
            zzyn8ZzYJb = ((zzZ2C) ((zzZ2D) zzyn8ZzYJb.zza9()).zza9()).zzYIZ().get(i);
        }
        return new zzZ6P(this.zzZEY, zzyn8ZzYJb);
    }

    private static void zzZ(zzZ4N zzz4n, Map<Node, zzYAU> map) throws Exception {
        zzz4n.reset();
        while (zzz4n.moveNext()) {
            zzYAU zzyau = (zzYAU) zzz4n.zzYPi();
            if (zzyau.zzY6X() && !zzyau.zzY6Z() && zzyau.zzZo6() == 25604) {
                Node node = ((zzY9X) zzyau).zzY53().getNode();
                if (!map.containsKey(node)) {
                    com.aspose.words.internal.zzZQF.zzY(map, node, zzyau);
                }
            }
        }
    }
}
