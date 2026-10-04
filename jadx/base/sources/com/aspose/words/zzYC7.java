package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYC7 {
    private zzYDZ zzZFZ;
    private ArrayList<ShapeBase> zzXmI = new ArrayList<>();
    private ArrayList<ShapeBase> zzXmH = new ArrayList<>();
    private HashMap<Integer, ShapeBase> zzXmG = new HashMap<>();
    private com.aspose.words.internal.zzIM<Integer> zzXmF = new com.aspose.words.internal.zzIM<>();
    private ArrayList<ShapeBase> zzXmE = new ArrayList<>();

    public zzYC7(zzYDZ zzydz) {
        this.zzZFZ = zzydz;
        ListCollection lists = zzydz.zzYfy.getLists();
        for (int i = 0; i < lists.zzYP0(); i++) {
            zzT(lists.zzxn(i), false);
        }
    }

    private static boolean zzS(ShapeBase shapeBase, ShapeBase shapeBase2) {
        return (shapeBase.getAncestor(4) == null) == (shapeBase2.getAncestor(4) == null);
    }

    private void zzU(ShapeBase shapeBase, int i) {
        shapeBase.removeShapeAttr(128);
        if (!DocumentBase.zzXV(shapeBase.getId(), shapeBase.zzY9A())) {
            shapeBase.removeShapeAttr(138);
        }
        if (this.zzXmG.containsKey(Integer.valueOf(shapeBase.getId()))) {
            shapeBase.removeShapeAttr(138);
        }
        if (!this.zzXmG.containsKey(Integer.valueOf(shapeBase.getId())) && shapeBase.getParentNode() != null) {
            this.zzXmG.put(Integer.valueOf(shapeBase.getId()), shapeBase);
        }
        shapeBase.setId(i);
        this.zzZFZ.zzXoZ.set(i, shapeBase);
    }

    private void zzY8W() {
        ShapeBase shapeBase;
        com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM();
        for (ShapeBase shapeBase2 : this.zzXmG.values()) {
            int iZzY9A = shapeBase2.zzY9A();
            shapeBase2.removeShapeAttr(138);
            if (iZzY9A != 0 && (shapeBase = (ShapeBase) com.aspose.words.internal.zzQW.zzZ(this.zzXmG, Integer.valueOf(iZzY9A))) != null) {
                if (zzim.contains(Integer.valueOf(shapeBase.getId())) || !zzS(shapeBase2, shapeBase)) {
                    zzY1Z.zzY(this.zzZFZ.zzYfy.getWarningCallback(), 17, "Invalid textbox link for shape {0}, removed.", Integer.valueOf(shapeBase2.getId()));
                } else {
                    shapeBase2.zzmb(shapeBase.getId());
                    this.zzZFZ.zzXoY.add(Integer.valueOf(shapeBase2.getId()));
                    this.zzZFZ.zzXoY.add(Integer.valueOf(shapeBase.getId()));
                    zzim.add(Integer.valueOf(shapeBase.getId()));
                }
            }
        }
    }

    private void zzYD(ShapeBase shapeBase) {
        zzZBL zzzblZzYrB = shapeBase.zzYrB();
        if (zzzblZzYrB == null) {
            return;
        }
        while (this.zzXmF.contains(Integer.valueOf(zzzblZzYrB.getId()))) {
            zzzblZzYrB.setId(zzzblZzYrB.getId() + 1);
        }
        this.zzXmF.add(Integer.valueOf(zzzblZzYrB.getId()));
    }

    public static void zzYE(ShapeBase shapeBase) {
        if (shapeBase.getId() == shapeBase.zzY9A()) {
            shapeBase.removeShapeAttr(138);
        }
    }

    private void zzYzb() {
        for (ShapeBase shapeBase : this.zzXmE) {
            zzTM zztm = (zzTM) shapeBase.zzYvW().get(4156);
            ShapeBase shapeBase2 = (ShapeBase) com.aspose.words.internal.zzQW.zzZ(this.zzXmG, Integer.valueOf(zztm.zzZsG));
            ShapeBase shapeBase3 = (ShapeBase) com.aspose.words.internal.zzQW.zzZ(this.zzXmG, Integer.valueOf(zztm.zzZsF));
            if (shapeBase2 == null || shapeBase3 == null) {
                zzY1Z.zzY(this.zzZFZ.zzYfy.getWarningCallback(), 17, "Invalid connector rule for shape {0}, removed.", Integer.valueOf(shapeBase.getId()));
                shapeBase.zzYvW().remove(4156);
            } else {
                zztm.zzZsG = shapeBase2.getId();
                zztm.zzZsF = shapeBase3.getId();
                if (((Story) shapeBase.getAncestor(3)) != null) {
                    this.zzZFZ.zzXoU.add(shapeBase);
                } else {
                    this.zzZFZ.zzXoT.add(shapeBase);
                }
            }
        }
    }

    public final void endDocument() {
        int i = 1025;
        if (this.zzZFZ.zzYfy.getBackgroundShape() != null) {
            this.zzZFZ.zzYfy.getBackgroundShape().setId(1025);
            i = EditingLanguage.BULGARIAN;
        }
        Iterator<ShapeBase> it = this.zzXmI.iterator();
        while (it.hasNext()) {
            zzU(it.next(), i);
            i++;
        }
        int iZzN = com.aspose.words.internal.zzAN.zzN(i, 1024) + 1;
        Iterator<ShapeBase> it2 = this.zzXmH.iterator();
        while (it2.hasNext()) {
            zzU(it2.next(), iZzN);
            iZzN++;
        }
        Iterator<zzZMS> it3 = this.zzZFZ.zzYfy.zzZpU().iterator();
        while (it3.hasNext()) {
            Iterator<T> it4 = it3.next().getChildNodes(18, true).iterator();
            while (it4.hasNext()) {
                zzU((ShapeBase) it4.next(), iZzN);
                iZzN++;
            }
        }
        zzY8W();
        zzYzb();
    }

    public final void zzT(ShapeBase shapeBase, boolean z) {
        if (z) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXmH, shapeBase);
        } else {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXmI, shapeBase);
        }
        if (shapeBase.zzYvW().get(4156) != null) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXmE, shapeBase);
        }
        if (shapeBase.zzZid()) {
            zzYD(shapeBase);
        }
    }
}
