package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYV {
    private HashMap<zzY9C, zzY9B> zzYRg;
    private zzZYW zzYRh;
    private zzYJQ zzYRi = new zzYJQ();
    private com.aspose.words.internal.zzIM<zzY9X> zzYRf = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzIM<zzY9X> zzYRe = new com.aspose.words.internal.zzIM<>();

    public zzZYV(zzZYW zzzyw) {
        this.zzYRh = zzzyw;
    }

    private void zzFL(int i) {
        zzY9C zzy9cZz4 = this.zzYRh.zz4(i, false);
        if (zzy9cZz4 != null) {
            zzy9cZz4.zzYU(true);
        }
    }

    private static boolean zzH(zzYAU zzyau) {
        if (zzyau != null) {
            zzyau.zzaa();
        }
        zzY9C zzy9cZzaa = zzyau.zzaa();
        while (zzy9cZzaa instanceof zzYBY) {
            zzy9cZzaa = ((zzYBY) zzy9cZzaa).zzY8N().zzaa();
        }
        return zzy9cZzaa instanceof zzZKV;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzI(zzYAU zzyau) throws Exception {
        zzY5N zzy5nZzYG;
        zzWT zzwt;
        int iZzZ1 = zzYJP.zzZ1(zzyau);
        if (iZzZ1 != 3) {
            zzy5nZzYG = (iZzZ1 == 4 && (zzwt = (zzWT) zzyau.zzqh(16)) != null) ? zzwt.zzYG(false) : null;
        } else {
            zzYN8 zzyn8ZzZ8m = zzyau.zzZ8m();
            if (zzyn8ZzZ8m != null) {
                zzy5nZzYG = zzyn8ZzZ8m.zzYG(false);
            }
        }
        if (zzy5nZzYG != null) {
            zzy5nZzYG.zzYQ(zzyau);
        }
    }

    private static void zzJ(zzYAU zzyau) throws Exception {
        if ((zzyau instanceof zzYAQ) && zzyau.zzY6X()) {
            if (!zzyau.zzaa().zzbD() && !zzyau.zzaa().zzZ4E() && zzyau.zzaa().getStoryType() != 5 && zzyau.zzaa().getStoryType() != 3) {
                zzyau.zzaa();
            }
            if (((zzYAQ) zzyau).zzY62()) {
                zzY(zzyau.zzY7l());
            }
        }
    }

    private void zzK(zzYAU zzyau) throws Exception {
        zzyau.zzY6W();
        zzYAH zzyah = (zzYAH) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzYAH.class);
        if (zzyah != null && zzyah.zzZ1s() == 2) {
            FieldChar fieldCharZzY5z = zzyah.zzY5z();
            if (com.aspose.words.internal.zzQW.zzZ((Map<FieldChar, TValue>) this.zzYRh.zzZqO(), fieldCharZzY5z) == zzyau) {
                com.aspose.words.internal.zzZQF.zzY(this.zzYRh.zzZqO(), fieldCharZzY5z);
            }
        }
        if (zzyau.zzaa().zzbD() && zzyau.zzY6X()) {
            if (zzyau instanceof zzYAD) {
                zzY(zzyau.zzY7l());
            } else if ((zzyau instanceof zzYAS) && zzY9R.zzmP(zzyau.zzZo6())) {
                zzZ((zzZ2D) zzyau.zzY6S().zzYTk());
            }
        }
        zzJ(zzyau);
        if (zzyau.zzZo6() == 25604) {
            zzX((zzY9X) zzyau);
        }
    }

    private void zzM(zzYAU zzyau) throws Exception {
        if (zzyau.zzZo6() != 25604) {
            return;
        }
        zzY9X zzy9x = (zzY9X) zzyau;
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(zzy9x.zzY53().getNode(), Shape.class);
        if (shape == null) {
            return;
        }
        if (shape.getMarkupLanguage() == 1) {
            this.zzYRf.add(zzy9x);
        } else {
            this.zzYRe.add(zzy9x);
        }
    }

    private void zzN(zzYAU zzyau) {
        if ((zzyau instanceof zzYAH) && zzyau.zzZ1s() == 2 && !zzH(zzyau)) {
            this.zzYRh.zzZqO().put(((zzYAH) zzyau).zzY5z(), zzyau);
        }
    }

    private static ArrayList<FieldChar> zzW(zzY9X zzy9x) {
        zzYBY zzybyZzQJ = zzy9x.zzQJ(false);
        ArrayList<FieldChar> arrayList = new ArrayList<>();
        if (zzybyZzQJ != null) {
            ArrayList<ArrayList<zzYAH>> arrayListZzY = zzZYW.zzY((zzY9C) zzybyZzQJ);
            for (int i = 0; i < arrayListZzY.size(); i++) {
                ArrayList<zzYAH> arrayList2 = arrayListZzY.get(i);
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    zzYAH zzyah = arrayList2.get(i2);
                    if (zzZOO.zzCN(zzyah.getFieldType())) {
                        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzyah.zzY5z());
                    }
                }
            }
        }
        return arrayList;
    }

    private void zzX(zzY9X zzy9x) throws Exception {
        if (this.zzYRf.contains(zzy9x)) {
            this.zzYRf.remove(zzy9x);
        }
        if (this.zzYRe.contains(zzy9x)) {
            this.zzYRe.remove(zzy9x);
        }
        ArrayList<FieldChar> arrayListZzW = zzW(zzy9x);
        for (int i = 0; i < arrayListZzW.size(); i++) {
            com.aspose.words.internal.zzZQF.zzY(this.zzYRh.zzZqO(), arrayListZzW.get(i));
        }
        if (zzy9x.zzY6X()) {
            zzI(zzy9x);
        }
        if (zzy9x.zzY55() == null && zzy9x.zzY56() == null) {
            return;
        }
        zzYC4 zzyc4ZzQo = zzy9x.zzQo(false);
        if (zzyc4ZzQo != null) {
            if (!zzyc4ZzQo.isEmpty()) {
                if (zzyc4ZzQo.zzYo1() != null) {
                    if (((zzTF) zzyc4ZzQo.zzYo1()).zz6w() == null) {
                        ((zzTF) zzyc4ZzQo.zzYo1()).zzY(zzyc4ZzQo.zz6w());
                    }
                    ((zzTF) zzyc4ZzQo.zzYo1()).zzZ(zzyc4ZzQo.zz6x());
                    for (zzYMD zzymdZz6x = zzyc4ZzQo.zz6x(); zzymdZz6x != null; zzymdZz6x = zzymdZz6x.zz5Z()) {
                        zzymdZz6x.zzY((zzTF) zzyc4ZzQo.zzYo1());
                    }
                    zzyc4ZzQo.zzYo1().zzNd(5);
                } else {
                    if (((zzTF) zzyc4ZzQo.zzYo0()).zz6x() == null) {
                        ((zzTF) zzyc4ZzQo.zzYo0()).zzZ(zzyc4ZzQo.zz6x());
                    }
                    ((zzTF) zzyc4ZzQo.zzYo0()).zzY(zzyc4ZzQo.zz6w());
                    for (zzYMD zzymdZz6w = zzyc4ZzQo.zz6w(); zzymdZz6w != null; zzymdZz6w = zzymdZz6w.zz5Y()) {
                        zzymdZz6w.zzY((zzTF) zzyc4ZzQo.zzYo0());
                    }
                    zzyc4ZzQo.zzYo0().zzNd(5);
                }
                zzyc4ZzQo.zzaa().zzYU(false);
            }
            zzyc4ZzQo.remove();
            zzy9x.zzY51();
        }
        if (zzy9x.zzY56() != null) {
            zzy9x.zzY56().zzQ(zzy9x.zzY55());
        }
        if (zzy9x.zzY55() != null) {
            zzy9x.zzY55().zzR(zzy9x.zzY56());
        }
        zzy9x.zzR(null);
        zzy9x.zzQ(null);
    }

    private void zzZoC() {
        com.aspose.words.internal.zzD3 zzd3 = new com.aspose.words.internal.zzD3();
        for (zzY9X zzy9x : this.zzYRe) {
            Shape shape = (Shape) zzy9x.zzY53().getNode();
            if (shape.zzY9o()) {
                int iZzY9r = shape.zzY9r() > 0 ? shape.zzY9r() : shape.zzY9q();
                if (!zzd3.zzVE(iZzY9r)) {
                    zzd3.add(iZzY9r, new com.aspose.words.internal.zzZYV());
                }
                ((com.aspose.words.internal.zzZYV) zzd3.get(iZzY9r)).set(shape.zzY9r() > 0 ? Integer.MIN_VALUE : shape.zzY9p(), zzy9x);
            }
        }
        for (com.aspose.words.internal.zzZYV zzzyv : zzd3.zzCJ()) {
            if (zzzyv.getCount() > 1) {
                int i = 0;
                while (i < zzzyv.getCount() - 1) {
                    zzY9X zzy9x2 = (zzY9X) zzzyv.zzVY(i);
                    i++;
                    zzY9X zzy9x3 = (zzY9X) zzzyv.zzVY(i);
                    zzy9x2.zzQ(zzy9x3);
                    zzy9x3.zzR(zzy9x2);
                }
            }
        }
    }

    private void zzZoD() {
        com.aspose.words.internal.zzD3 zzd3 = new com.aspose.words.internal.zzD3();
        for (zzY9X zzy9x : this.zzYRf) {
            Shape shape = (Shape) zzy9x.zzY53().getNode();
            int id = shape.getId();
            Object obj = zzd3.get(id);
            if (obj instanceof Integer) {
                zzY9X zzy9x2 = (zzY9X) zzd3.get(((Integer) obj).intValue());
                zzy9x2.zzQ(zzy9x);
                zzy9x.zzR(zzy9x2);
            }
            if (!(obj instanceof zzYAU)) {
                zzd3.set(id, zzy9x);
            }
            Object obj2 = zzd3.get(shape.zzY9A());
            if (obj2 != null) {
                zzY9X zzy9x3 = (zzY9X) obj2;
                zzy9x3.zzR(zzy9x);
                zzy9x.zzQ(zzy9x3);
            } else if (shape.zzY9A() != 0) {
                shape.zzY9A();
                zzd3.set(shape.zzY9A(), Integer.valueOf(id));
            }
        }
    }

    private boolean zzZoy() {
        return this.zzYRg != null;
    }

    public final void commit() throws Exception {
        if (zzZoy()) {
            zzY9B zzy9b = (zzY9B) com.aspose.words.internal.zzQW.zzZ(this.zzYRg, this.zzYRh.zzZp0());
            if (zzy9b != null) {
                zzy9b.commit();
            }
            for (zzY9B zzy9b2 : this.zzYRg.values()) {
                if (zzy9b2 != null && zzy9b != zzy9b2) {
                    zzy9b2.commit();
                }
            }
            zzZoD();
            zzZoC();
            this.zzYRg = null;
        }
    }

    public final void zzFM(int i) {
        this.zzYRi.zzVF(i);
    }

    public final void zzL(zzYAU zzyau) throws Exception {
        zzK(zzyau);
        zzW(zzyau.zzaa()).zzL(zzyau);
    }

    public final void zzY(zzYN8 zzyn8) throws Exception {
        commit();
        this.zzYRh.zzZp0().zzJ(zzyn8);
        zzFL(2);
        zzFL(3);
        zzFL(4);
    }

    public final void zzZ(zzYA0 zzya0, zzYAU zzyau) throws Exception {
        zzY9C zzy9cZzZ = zzya0.zzXbB;
        if (zzy9cZzZ == null) {
            zzy9cZzZ = zzZ(zzya0);
            zzya0.zzXbB = zzy9cZzZ;
        }
        zzZ(zzy9cZzZ, zzya0.zzZnf(), zzyau);
    }

    public final void zzZoA() {
        this.zzYRi.zzCQ();
    }

    public final zzYJQ zzZoB() {
        return this.zzYRi;
    }

    public final zzZYW zzZoz() {
        return this.zzYRh;
    }

    public final void zzZ(zzY9C zzy9c, zzYAU zzyau, zzYAU zzyau2) throws Exception {
        zzW(zzy9c).zzD(zzyau, zzyau2);
        zzN(zzyau2);
        zzM(zzyau2);
    }

    private static void zzY(zzYCT zzyct) throws Exception {
        zzZ4N zzz4nZzYPe = ((zzY9C) zzyct.zza9()).zzY4s().zzYPe();
        zzz4nZzYPe.zzX(((zzYMM) zzyct.zzZXY()).zzZ9r());
        ArrayList arrayList = new ArrayList();
        do {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZAK>) arrayList, zzz4nZzYPe.zzYPi());
            if (!zzz4nZzYPe.movePrevious()) {
                break;
            }
        } while (!zzY9R.zzmT(((zzYAU) zzz4nZzYPe.zzYPi()).zzZo6()));
        zzZYV zzzyvZzZoS = zzyct.zzab().zzZoS();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zzzyvZzZoS.zzL((zzYAU) arrayList.get(size));
        }
    }

    private zzY9C zzZ(zzYA0 zzya0) throws Exception {
        if (zzya0.zzZnf() != null && zzya0.zzZnf().zzaa() != null) {
            return zzya0.zzZnf().zzaa();
        }
        switch (zzya0.getStoryType()) {
            case 1:
                return this.zzYRh.zzZp0();
            case 2:
                return this.zzYRh.zzZoZ();
            case 3:
                return this.zzYRh.zzZoY();
            case 4:
                return this.zzYRh.zzZoX();
            case 5:
                com.aspose.words.internal.zzZ4.zzY((Object) zzya0.zzY5b(), RequestParameters.POSITION);
                return zzya0.zzY5b().zzQJ(true);
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                com.aspose.words.internal.zzZ4.zzY((Object) zzya0.zzY5b(), RequestParameters.POSITION);
                zzya0.zzY5b().zzY7m();
                return zzya0.zzY5b().zzY7m().zzZ(this.zzYRh, zzya0.getStoryType(), true);
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return this.zzYRh.zzZoL().zztm(zzya0.getStoryType());
            default:
                throw new IllegalStateException("Unexpected story type.");
        }
    }

    private zzY9B zzW(zzY9C zzy9c) {
        if (this.zzYRg == null) {
            this.zzYRg = new HashMap<>();
        }
        zzY9B zzy9b = (zzY9B) com.aspose.words.internal.zzQW.zzZ(this.zzYRg, zzy9c);
        if (zzy9b != null) {
            return zzy9b;
        }
        zzY9B zzy9b2 = new zzY9B(zzy9c);
        com.aspose.words.internal.zzZQF.zzY(this.zzYRg, zzy9c, zzy9b2);
        return zzy9b2;
    }

    private static void zzZ(zzZ2D zzz2d) {
        for (zzYN8 zzyn8ZzYJb = zzz2d.zzYJb(); zzyn8ZzYJb != null; zzyn8ZzYJb = (zzYN8) zzyn8ZzYJb.zzYo1()) {
            if (((zzZ2D) zzyn8ZzYJb.zza9()) == zzz2d) {
                zzyn8ZzYJb.zzV((zzZKY) null);
                zzyn8ZzYJb.zzU((zzZKY) null);
            } else if (((zzZ2D) zzyn8ZzYJb.zza9()) == ((zzZ2D) zzz2d.zzYTp())) {
                return;
            }
        }
    }

    public final void zzX(zzY9C zzy9c) {
        zzY9B zzy9b;
        HashMap<zzY9C, zzY9B> map = this.zzYRg;
        if (map == null || (zzy9b = (zzY9B) com.aspose.words.internal.zzQW.zzZ(map, zzy9c)) == null) {
            return;
        }
        zzy9b.zzY4p();
    }
}
