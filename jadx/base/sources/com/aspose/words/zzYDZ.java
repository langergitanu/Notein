package com.aspose.words;

import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYDZ {
    private Map<ShapeBase, OfficeMath> zzXoN;
    private boolean zzXoV;
    boolean zzXoW;
    boolean zzXoX;
    com.aspose.words.internal.zzFQ<String> zzXp0;
    boolean zzXp5;
    boolean zzXp6;
    boolean zzXp7;
    SaveOptions zzXpa;
    com.aspose.words.internal.zzZOP zzXpb;
    Document zzYfy;
    private String zzZS;
    com.aspose.words.internal.zzAA zzXp9 = new com.aspose.words.internal.zzAA();
    com.aspose.words.internal.zzAA zzXp8 = new com.aspose.words.internal.zzAA();
    com.aspose.words.internal.zzZYT<Integer> zzXp4 = new com.aspose.words.internal.zzZYT<>();
    com.aspose.words.internal.zzZYV<Boolean> zzXp3 = new com.aspose.words.internal.zzZYV<>();
    com.aspose.words.internal.zzZYT<String> zzXp2 = new com.aspose.words.internal.zzZYT<>();
    com.aspose.words.internal.zzZYT<SmartTag> zzXp1 = new com.aspose.words.internal.zzZYT<>();
    com.aspose.words.internal.zzD3<ShapeBase> zzXoZ = new com.aspose.words.internal.zzD3<>();
    com.aspose.words.internal.zzIM<Integer> zzXoY = new com.aspose.words.internal.zzIM<>();
    ArrayList<ShapeBase> zzXoU = new ArrayList<>();
    ArrayList<ShapeBase> zzXoT = new ArrayList<>();
    Object[] zzXoS = new Object[16];
    com.aspose.words.internal.zzIM<Integer> zzXoR = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzIM<Comment> zzXoQ = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zz7D<ShapeBase> zzXoP = new com.aspose.words.internal.zz7D<>();
    private ArrayList<ShapeBase> zzXU6 = new ArrayList<>();
    private ArrayList<ShapeBase> zzXU7 = new ArrayList<>();
    private ArrayList<ShapeBase> zzXoO = new ArrayList<>();
    com.aspose.words.internal.zzIM<StructuredDocumentTag> zzXoM = new com.aspose.words.internal.zzIM<>();

    public zzYDZ(Document document, com.aspose.words.internal.zzZOP zzzop, String str, SaveOptions saveOptions) {
        this.zzYfy = document;
        this.zzXpb = zzzop;
        this.zzZS = str;
        this.zzXpa = saveOptions;
        int i = 0;
        while (true) {
            Object[] objArr = this.zzXoS;
            if (i >= objArr.length) {
                return;
            }
            objArr[i] = new com.aspose.words.internal.zzIM();
            i++;
        }
    }

    private static ArrayList<ShapeBase> zzF(ArrayList<ShapeBase> arrayList, ArrayList<ShapeBase> arrayList2) {
        ArrayList<ShapeBase> arrayListZzY = com.aspose.words.internal.zzZQG.zzY(arrayList);
        Iterator<ShapeBase> it = arrayList2.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(arrayListZzY, it.next());
        }
        return arrayListZzY;
    }

    private void zzQ(ArrayList<ShapeBase> arrayList, int i, int i2) {
        if (arrayList.size() == 0) {
            return;
        }
        zzYBT.zzS(arrayList);
        int i3 = 0;
        for (ShapeBase shapeBase : arrayList) {
            if (!shapeBase.isInline()) {
                if (shapeBase.getBehindText()) {
                    i3++;
                } else {
                    this.zzXoP.set(shapeBase, i);
                    i++;
                }
            }
        }
        int i4 = (i2 - i3) + 1;
        for (ShapeBase shapeBase2 : arrayList) {
            if (!shapeBase2.isInline() && shapeBase2.getBehindText()) {
                this.zzXoP.set(shapeBase2, i4);
                i4++;
            }
        }
    }

    private boolean zzYd8() {
        return this.zzXpa.getSaveFormat() == 24 || this.zzXpa.getSaveFormat() == 25 || this.zzXpa.getSaveFormat() == 26 || this.zzXpa.getSaveFormat() == 27;
    }

    private void zzZ4(ArrayList<ShapeBase> arrayList) {
        if (arrayList.size() == 0) {
            return;
        }
        zzYBT.zzS(arrayList);
        int i = 0;
        for (ShapeBase shapeBase : arrayList) {
            if (!shapeBase.isInline()) {
                this.zzXoP.zzP(shapeBase, zzXYN.zzYX(i, shapeBase.getBehindText() && shapeBase.getMarkupLanguage() != 0));
                i++;
            }
        }
    }

    private void zzZ5(ArrayList<ShapeBase> arrayList) {
        if (arrayList.size() == 0) {
            return;
        }
        zzYBT.zzS(arrayList);
        int i = 0;
        for (ShapeBase shapeBase : arrayList) {
            if (!shapeBase.isInline() || shapeBase.zzY9y()) {
                this.zzXoP.set(shapeBase, i);
                i++;
            }
        }
    }

    public final String getFileName() {
        return this.zzZS;
    }

    public final void zzK(Comment comment) {
        this.zzXoQ.add(comment);
    }

    public final boolean zzL(Comment comment) {
        return this.zzXoQ.contains(comment);
    }

    public final void zzR5(boolean z) {
        this.zzXoV = z;
    }

    public final void zzU(Map<ShapeBase, OfficeMath> map) {
        this.zzXoN = map;
    }

    public final OfficeMath zzYK(ShapeBase shapeBase) {
        Map<ShapeBase, OfficeMath> map = this.zzXoN;
        if (map != null) {
            return (OfficeMath) com.aspose.words.internal.zzQW.zzZ((Map<ShapeBase, TValue>) map, shapeBase);
        }
        return null;
    }

    public final int zzYL(ShapeBase shapeBase) {
        int i = this.zzXoP.get(shapeBase);
        if (com.aspose.words.internal.zz7D.zzWm(i)) {
            return 0;
        }
        return i;
    }

    public final boolean zzYd7() {
        return this.zzXpa.getSaveFormat() == 10 || this.zzXpa.getSaveFormat() == 11;
    }

    public final boolean zzYd9() {
        return this.zzXpa.getSaveFormat() == 20 || this.zzXpa.getSaveFormat() == 21 || this.zzXpa.getSaveFormat() == 22 || this.zzXpa.getSaveFormat() == 23;
    }

    public final boolean zzYda() {
        return zzYd9() || zzYd8();
    }

    public final boolean zzYdb() {
        return (zzYda() && zzZtY() == 0) || zzYdh();
    }

    public final void zzYdc() {
        zzZ5(this.zzXU6);
        zzZ5(zzF(this.zzXU7, this.zzXoO));
    }

    public final void zzYdd() {
        zzQ(this.zzXU6, 0, -1);
        zzQ(zzF(this.zzXU7, this.zzXoO), SupportMenu.CATEGORY_MASK, -65537);
    }

    public final void zzYde() {
        zzZ4(this.zzXU6);
        zzZ4(this.zzXU7);
        zzZ4(this.zzXoO);
    }

    public final void zzYdf() {
        zzQ(this.zzXU6, 1, -1);
        zzQ(zzF(this.zzXU7, this.zzXoO), 1, -1);
    }

    public final boolean zzYdg() {
        return this.zzXp8.getCount() > 0;
    }

    public final boolean zzYdh() {
        return zzYd7() || this.zzXpa.getSaveFormat() == 31 || this.zzXpa.getSaveFormat() == 30;
    }

    public final boolean zzYsH() {
        return this.zzXoV;
    }

    public final void zzZ(Node node, zzY97 zzy97) {
        if (node.getParentNode() == null || node.getParentNode().getNodeType() != 17) {
            com.aspose.words.internal.zzZQG.zzZ(zzZ(zzy97), (ShapeBase) node);
        }
    }

    public final int zzZtY() {
        return zzYO3.zzZ(this.zzYfy.zzZqn(), (OoxmlSaveOptions) com.aspose.words.internal.zzZKW.zzZ(this.zzXpa, OoxmlSaveOptions.class));
    }

    private ArrayList<ShapeBase> zzZ(zzY97 zzy97) {
        if (zzy97.zzY42()) {
            return this.zzXoO;
        }
        return zzy97.zzY43() ? this.zzXU7 : this.zzXU6;
    }
}
