package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVH {
    private zzY41 zzYMa;
    private ArrayList<ShapeBase> zzYM9 = new ArrayList<>();
    private HashMap<Integer, ArrayList<ShapeBase>> zzYM8 = new HashMap<>();

    private void zzXQ(int i, int i2) {
        if (this.zzYM8.containsKey(Integer.valueOf(i))) {
            ArrayList<ShapeBase> arrayList = this.zzYM8.get(Integer.valueOf(i));
            ShapeBase shapeBase = arrayList.get(0);
            shapeBase.zzmb(i2);
            for (int i3 = 1; i3 < arrayList.size(); i3++) {
                zzh(shapeBase);
            }
            com.aspose.words.internal.zzZQF.zzY(this.zzYM8, Integer.valueOf(i));
        }
    }

    private static void zzY(ShapeBase shapeBase, com.aspose.words.internal.zzZYV<ShapeBase> zzzyv, DocumentBase documentBase) {
        int iZzY9r = shapeBase.zzY9r();
        int iIntValue = ((Integer) shapeBase.zzYvW().get(138)).intValue();
        for (int i = 0; i < zzzyv.getCount(); i++) {
            Shape shape = (Shape) zzzyv.zzVY(i);
            shape.zzm9(iZzY9r);
            shape.zzYvW().zzQ(4124, Integer.valueOf(iIntValue));
            ShapeBase shapeBaseZzY9n = shape.zzY9n();
            if (shapeBaseZzY9n != null) {
                shapeBaseZzY9n.zzYvW().zzQ(4124, Integer.valueOf(iIntValue));
            }
            if (i < zzzyv.getCount() - 1) {
                iIntValue = documentBase.zzZq0();
                shape.zzYvW().zzQ(138, Integer.valueOf(iIntValue));
                if (shapeBaseZzY9n != null) {
                    shapeBaseZzY9n.zzYvW().zzQ(138, Integer.valueOf(iIntValue));
                }
            }
        }
    }

    public static void zzZ(ShapeBase shapeBase, com.aspose.words.internal.zzZYV<ShapeBase> zzzyv, DocumentBase documentBase) {
        if (shapeBase.zzY9r() > 0) {
            shapeBase.zzma(documentBase.zzZpY());
        }
        int iZzXW = documentBase.zzXW(documentBase.zzZpZ(), zzzyv.getCount());
        int iZzZq0 = documentBase.zzZq0();
        shapeBase.zzYvW().zzQ(4124, Integer.valueOf(iZzXW));
        shapeBase.zzYvW().zzQ(138, Integer.valueOf(iZzZq0));
        if (shapeBase.zzY9n() != null) {
            shapeBase.zzY9n().zzYvW().zzQ(4124, Integer.valueOf(iZzXW));
            shapeBase.zzY9n().zzYvW().zzQ(138, Integer.valueOf(iZzZq0));
        }
        zzY(shapeBase, zzzyv, documentBase);
    }

    private zzY41 zzZjU() {
        if (this.zzYMa == null) {
            this.zzYMa = new zzY41();
        }
        return this.zzYMa;
    }

    private static void zzh(ShapeBase shapeBase) {
        shapeBase.removeShapeAttr(138);
        zzY1Z.zzZ(shapeBase.getDocument().getWarningCallback(), 65536, 17, "Invalid textbox link for shape {0}, removed.", Integer.valueOf(shapeBase.getId()));
    }

    private void zzi(ShapeBase shapeBase) {
        if (shapeBase.zzY9A() == 0) {
            return;
        }
        int iZzY9A = shapeBase.zzY9A();
        if (!this.zzYM8.containsKey(Integer.valueOf(iZzY9A))) {
            this.zzYM8.put(Integer.valueOf(iZzY9A), new ArrayList<>());
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzYM8.get(Integer.valueOf(iZzY9A)), shapeBase);
    }

    public final int zzj(ShapeBase shapeBase) {
        zzi(shapeBase);
        com.aspose.words.internal.zzZQG.zzZ(this.zzYM9, shapeBase);
        return 0;
    }

    public final void zztF() {
        int iZzji;
        com.aspose.words.internal.zzD3<ShapeBase> zzd3 = new com.aspose.words.internal.zzD3<>();
        com.aspose.words.internal.zzD3<ShapeBase> zzd32 = new com.aspose.words.internal.zzD3<>();
        for (ShapeBase shapeBase : this.zzYM9) {
            int iIntValue = shapeBase.zzYvW().contains(4124) ? ((Integer) shapeBase.zzYvW().get(4124)).intValue() : 0;
            if (shapeBase.isTopLevel()) {
                int iZzji2 = zzZjU().zzji(iIntValue);
                zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
                if (iZzji2 == 0) {
                    iZzji2 = zzZjU().zzji(iZzji2);
                }
                zzyc3ZzYvW.set(4124, Integer.valueOf(iZzji2));
            }
            if (shapeBase.zzY9i().zzZyc() != null && shapeBase.zzY9i().zzZyc().zzZxV() != null) {
                zz4T zz4tZzZxV = shapeBase.zzY9i().zzZyc().zzZxV();
                if (shapeBase.isTopLevel()) {
                    iZzji = ((Integer) shapeBase.zzYvW().get(4124)).intValue();
                } else {
                    iZzji = zzZjU().zzji(zz4tZzZxV.getId());
                    if (iZzji == 0) {
                        iZzji = zzZjU().zzji(iZzji);
                    }
                }
                zz4tZzZxV.setId(iZzji);
            }
            zzXQ(iIntValue, shapeBase.getId());
            if (shapeBase.zzY9o() && shapeBase.zzY9A() > 0 && shapeBase.zzY9r() == 0 && shapeBase.zzY9q() == 0) {
                zzd32.set(shapeBase.getId(), shapeBase);
            }
            if (shapeBase.zzY9i().zzZHY() == 8) {
                zzd3.set(shapeBase.getId(), shapeBase);
            }
        }
        zzZ(zzd3, zzd32);
    }

    public static void zzZ(com.aspose.words.internal.zzD3<ShapeBase> zzd3, HashMap<Integer, com.aspose.words.internal.zzZYV<ShapeBase>> map) {
        for (ShapeBase shapeBase : zzd3.zzCJ()) {
            com.aspose.words.internal.zzZYV zzzyv = (com.aspose.words.internal.zzZYV) com.aspose.words.internal.zzQW.zzZ(map, Integer.valueOf(shapeBase.zzY9r()));
            if (zzzyv != null) {
                zzZ(shapeBase, zzzyv, shapeBase.getDocument());
            }
        }
    }

    private void zzZ(com.aspose.words.internal.zzD3<ShapeBase> zzd3, com.aspose.words.internal.zzD3<ShapeBase> zzd32) {
        Iterator<T> it = this.zzYM8.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) it.next()).iterator();
            while (it2.hasNext()) {
                zzh((ShapeBase) it2.next());
            }
        }
        this.zzYM8.clear();
        HashMap map = new HashMap();
        for (ShapeBase shapeBase : zzd32.zzCJ()) {
            ShapeBase shapeBaseZzZ = zzZ(shapeBase, zzd3);
            int iZzZpY = shapeBaseZzZ != null ? shapeBase.getDocument().zzZpY() : 0;
            int i = 1;
            while (shapeBaseZzZ != null) {
                shapeBase.zzma(iZzZpY);
                shapeBaseZzZ.zzm9(iZzZpY);
                int i2 = i + 1;
                shapeBaseZzZ.zzm8(i);
                if (!map.containsKey(Integer.valueOf(shapeBase.zzY9r()))) {
                    map.put(Integer.valueOf(shapeBase.zzY9r()), new com.aspose.words.internal.zzZYV());
                }
                ((com.aspose.words.internal.zzZYV) map.get(Integer.valueOf(shapeBase.zzY9r()))).set(shapeBaseZzZ.zzY9p(), shapeBaseZzZ);
                shapeBaseZzZ = zzZ(shapeBaseZzZ, zzd3);
                i = i2;
            }
        }
        zzZ(zzd32, (HashMap<Integer, com.aspose.words.internal.zzZYV<ShapeBase>>) map);
    }

    private static ShapeBase zzZ(ShapeBase shapeBase, com.aspose.words.internal.zzD3<ShapeBase> zzd3) {
        if (shapeBase.zzY9A() > 0) {
            return zzd3.get(shapeBase.zzY9A());
        }
        return null;
    }
}
