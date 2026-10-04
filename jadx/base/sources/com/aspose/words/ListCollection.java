package com.aspose.words;

import com.aspose.words.internal.zzD4;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ListCollection implements Cloneable, Iterable<List> {
    private Object zzYcD;
    private int zzYcE;
    private int zzYcF;
    private DocumentBase zzZCL;
    private ArrayList<List> zzYcJ = new ArrayList<>();
    private ArrayList<zzZ4J> zzYcI = new ArrayList<>();
    private ArrayList<Shape> zzYcH = new ArrayList<>();
    private com.aspose.words.internal.zzD4 zzYcG = new com.aspose.words.internal.zzD4();

    public ListCollection(DocumentBase documentBase) {
        this.zzZCL = documentBase;
    }

    private List zzP(List list) {
        List list2 = null;
        for (List list3 : this.zzYcJ) {
            if (list3.zzYP8() == list.zzYP8() && list3.zzYPb().zzZ(list.zzYPb())) {
                if (list3.zzZZS() == list.zzZZS()) {
                    return list3;
                }
                list2 = list3;
            }
        }
        return list2;
    }

    private static void zzT(zzYMX zzymx) {
        if (zzymx.contains(EditingLanguage.GUARANI)) {
            TabStopCollection tabStopCollection = new TabStopCollection();
            for (int i = 0; i < zzymx.getTabStops().getCount(); i++) {
                if (zzymx.getTabStops().get(i).getAlignment() == 7) {
                    tabStopCollection.add(zzymx.getTabStops().get(i).zzY0F());
                }
            }
            for (int i2 = 0; i2 < zzymx.getTabStops().getCount(); i2++) {
                if (zzymx.getTabStops().get(i2).getAlignment() == 6 && tabStopCollection.zzkr(zzymx.getTabStops().get(i2).zzY0E()) == null) {
                    zzymx.getTabStops().add(new TabStop(zzymx.getTabStops().get(i2).getPosition(), 7, 0));
                    return;
                }
            }
        }
    }

    private zzZ4J zzWQ(int i, int i2) {
        zzZ4J zzz4j = new zzZ4J(this.zzZCL, i2, i, i2);
        zzZ(zzz4j);
        return zzz4j;
    }

    private static void zzX(zzZ86 zzz86, ListLevel listLevel, ListLevel listLevel2) {
        if (listLevel.zzYOb()) {
            int i = zzz86.zzYVA().get(listLevel.zzZ0p());
            if (!com.aspose.words.internal.zzD4.zzWm(i)) {
                listLevel2.zzzp(i);
                return;
            }
            listLevel2.zzzp(zzz86.zzYVE().zzo((Shape) zzz86.zzYVI().importNode(listLevel.zzZ0P(), true)));
            zzz86.zzYVA().add(listLevel.zzZ0p(), listLevel2.zzZ0p());
        }
    }

    public List add(int i) {
        return zzZ4H.zzY(this, i);
    }

    public List addCopy(List list) {
        return zzZ(list, true);
    }

    public List get(int i) {
        return this.zzYcJ.get(i);
    }

    public int getCount() {
        return this.zzYcJ.size();
    }

    public DocumentBase getDocument() {
        return this.zzZCL;
    }

    public List getListByListId(int i) {
        int i2;
        int i3 = this.zzYcG.get(i);
        if (!com.aspose.words.internal.zzD4.zzWm(i3) && i3 - 1 >= 0 && i2 < getCount()) {
            return get(i2);
        }
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<List> iterator() {
        return this.zzYcJ.iterator();
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final List zzJb(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return null;
        }
        for (zzZ4J zzz4j : this.zzYcI) {
            if (com.aspose.words.internal.zzZYD.zzi(zzz4j.getName(), str)) {
                for (List list : this.zzYcJ) {
                    if (list.zzYP8() == zzz4j.zzYP8()) {
                        return list;
                    }
                }
                throw new IllegalStateException("ListCollection has invalid state.");
            }
        }
        return null;
    }

    public final void zzQ(List list) {
        if (list != null) {
            list.getDocument();
            getDocument();
        }
        if (this.zzYcG.zzVE(list.getListId())) {
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzYcJ, list);
        this.zzYcG.add(list.getListId(), this.zzYcJ.size());
    }

    public final ListCollection zzY(DocumentBase documentBase, zzZA5 zzza5) {
        ListCollection listCollection = (ListCollection) memberwiseClone();
        listCollection.zzZCL = documentBase;
        listCollection.zzYcG = new com.aspose.words.internal.zzD4();
        listCollection.zzYcJ = new ArrayList<>();
        for (List list : this.zzYcJ) {
            listCollection.zzQ(list.zzY(documentBase, list.getListId()));
        }
        listCollection.zzYcI = new ArrayList<>();
        for (zzZ4J zzz4j : this.zzYcI) {
            listCollection.zzZ(zzz4j.zzX(documentBase, zzz4j.zzYP8()));
        }
        listCollection.zzYcH = new ArrayList<>();
        Iterator<Shape> it = this.zzYcH.iterator();
        while (it.hasNext()) {
            Shape shape = (Shape) it.next().zzZ(true, zzza5);
            shape.zzY(documentBase);
            listCollection.zzo(shape);
        }
        return listCollection;
    }

    public final void zzYOU() {
        ArrayList arrayList = new ArrayList();
        ArrayList<zzZ4J> arrayList2 = new ArrayList<>();
        for (zzZ4J zzz4j : this.zzYcI) {
            if (arrayList.contains(zzz4j.getStyle())) {
                zzZ(zzz4j, (ArrayList<Style>) arrayList);
            } else {
                arrayList2.clear();
                arrayList2 = zzZ(arrayList2, zzz4j);
                Iterator<zzZ4J> it = arrayList2.iterator();
                while (it.hasNext()) {
                    zzZ(it.next(), (ArrayList<Style>) arrayList);
                }
            }
        }
    }

    public final void zzYOV() {
        for (zzZ4J zzz4j : this.zzYcI) {
            if (zzz4j.isListStyleReference()) {
                zzz4j.zzYOP().clear();
            }
        }
    }

    public final void zzYOW() {
        int i = 0;
        int i2 = 0;
        while (i2 < this.zzYcJ.size()) {
            List list = get(i2);
            i2++;
            list.zzxC(i2);
        }
        this.zzYcG.clear();
        while (i < this.zzYcJ.size()) {
            i++;
            this.zzYcG.add(i, i);
        }
    }

    public final ArrayList<zzZ4J> zzYOX() {
        return this.zzYcI;
    }

    public final com.aspose.words.internal.zzD4 zzYOY() {
        return this.zzYcG;
    }

    public final Object zzYOZ() {
        return this.zzYcD;
    }

    public final int zzYP0() {
        return this.zzYcH.size();
    }

    public final int zzYP1() {
        return this.zzYcI.size();
    }

    public final int zzYP2() {
        if (this.zzYcF == 0) {
            Iterator<List> it = this.zzYcJ.iterator();
            while (it.hasNext()) {
                this.zzYcF = Math.max(this.zzYcF, it.next().getListId());
            }
        }
        int i = this.zzYcF + 1;
        this.zzYcF = i;
        return i;
    }

    public final int zzYP3() {
        if (this.zzYcE == 0) {
            Iterator<zzZ4J> it = this.zzYcI.iterator();
            while (it.hasNext()) {
                this.zzYcE = Math.max(this.zzYcE, it.next().zzYP8());
            }
        }
        int i = this.zzYcE + 1;
        this.zzYcE = i;
        return i;
    }

    public final int zzYP4() {
        int iZzXUb = zzY41.zzXUb();
        while (true) {
            if (iZzXUb != 0 && zzxr(iZzXUb) == null) {
                return iZzXUb;
            }
            iZzXUb = zzY41.zzXUb();
        }
    }

    public final List zzZ(List list, boolean z) {
        List listZzxv;
        List listZzP;
        if (list == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: srcList");
        }
        boolean z2 = getDocument() == list.getDocument();
        if (!z2 && z) {
            zzZ86 zzz86 = new zzZ86(list.getDocument(), getDocument(), 0);
            zzz86.zzXF(list.zzYP8());
            listZzxv = zzxv(zzZ(zzz86, list.getListId(), false));
        } else {
            if (!z2 && (listZzP = zzP(list)) != null) {
                return listZzP;
            }
            List listZzY = list.zzY(this.zzZCL, zzYP2());
            zzQ(listZzY);
            zzZ4J zzz4jZzX = list.zzYPa().zzX(getDocument(), zzYP3());
            zzZ(zzz4jZzX);
            listZzY.zzxB(zzz4jZzX.zzYP8());
            listZzxv = listZzY;
        }
        listZzxv.zzYPa().zzxh(StyleIdentifier.NIL);
        return listZzxv;
    }

    public final void zzZr(Object obj) {
        this.zzYcD = obj;
    }

    public final int zzo(Shape shape) {
        if (shape == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: shape");
        }
        if (shape.getParentNode() != null) {
            throw new IllegalArgumentException("The picture bullet shape must have no parent node.");
        }
        if (shape.getDocument() != this.zzZCL) {
            throw new IllegalArgumentException("The picture bullet shape must belong to this document.");
        }
        shape.zzQT(true);
        com.aspose.words.internal.zzZQG.zzZ(this.zzYcH, shape);
        return this.zzYcH.size() - 1;
    }

    public final void zzxk(int i) {
        this.zzYcE = i;
    }

    public final int zzxl(int i) {
        int i2 = this.zzYcG.get(i);
        return com.aspose.words.internal.zzD4.zzWm(i2) ? i : i2;
    }

    public final void zzxm(int i) {
        com.aspose.words.internal.zzD4 zzd4 = new com.aspose.words.internal.zzD4(this.zzYcG.getCount() - 1);
        int i2 = this.zzYcG.get(i);
        if (com.aspose.words.internal.zzD4.zzWm(i2)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: listId");
        }
        this.zzYcG.zzVG(i);
        zzD4.zzZ zzzZzCP = this.zzYcG.zzCP();
        while (zzzZzCP.moveNext()) {
            int iZzCM = zzzZzCP.zzCM();
            int iZzCL = zzzZzCP.zzCL();
            if (iZzCL < i2) {
                zzd4.set(iZzCM, iZzCL);
            } else if (iZzCL > i2) {
                zzd4.set(iZzCM, iZzCL - 1);
            }
        }
        this.zzYcJ.remove(i2 - 1);
        this.zzYcG = zzd4;
    }

    public final Shape zzxn(int i) {
        return this.zzYcH.get(i);
    }

    public final void zzxo(int i) {
        for (List list : this.zzYcJ) {
            if (list.zzYP8() == i) {
                list.zzYP9();
            }
        }
    }

    public final int zzxp(int i) {
        for (int i2 = 0; i2 < this.zzYcI.size(); i2++) {
            if (zzxs(i2).zzYP8() == i) {
                return i2;
            }
        }
        return -1;
    }

    public final zzZ4J zzxq(int i) {
        int iZzxp = zzxp(i);
        return iZzxp >= 0 ? zzxs(iZzxp) : this.zzYcI.size() > 0 ? zzxs(0) : zzWQ(2, i);
    }

    public final zzZ4J zzxr(int i) {
        int iZzxp = zzxp(i);
        if (iZzxp != -1) {
            return this.zzYcI.get(iZzxp);
        }
        return null;
    }

    public final zzZ4J zzxs(int i) {
        return this.zzYcI.get(i);
    }

    public final List zzxt(int i) {
        zzZ4J zzz4jZzWQ = zzWQ(i, zzYP3());
        List list = new List(this.zzZCL, zzYP2());
        list.zzxB(zzz4jZzWQ.zzYP8());
        zzQ(list);
        return list;
    }

    public final List zzxu(int i) {
        List listZzxv = zzxv(i);
        return listZzxv.isListStyleReference() ? listZzxv.getStyle().getList() : listZzxv;
    }

    public final List zzxv(int i) {
        if (getCount() == 0) {
            zzxt(2);
        }
        int i2 = this.zzYcG.get(i);
        int count = com.aspose.words.internal.zzD4.zzWm(i2) ? i - 1 : i2 - 1;
        if (count < 0) {
            count = 0;
        } else if (count >= getCount()) {
            count = getCount() - 1;
        }
        return get(count);
    }

    public List add(Style style) {
        if (style == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: listStyle");
        }
        if (style.getDocument() != getDocument()) {
            throw new IllegalArgumentException("The list style belongs to a different document.");
        }
        if (style.getType() != 4) {
            throw new IllegalArgumentException("The style is not a list style.");
        }
        List listAddCopy = addCopy(style.getList());
        listAddCopy.zzYPa().zzxh(style.zzZ7j());
        return listAddCopy;
    }

    public final void zzZ(zzZ4J zzz4j) {
        if (zzz4j != null) {
            getDocument();
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzYcI, zzz4j);
    }

    private static void zzY(zzZ86 zzz86, ListLevel listLevel, ListLevel listLevel2) {
        Style linkedStyle = listLevel.getLinkedStyle();
        if (linkedStyle != null) {
            listLevel2.setLinkedStyle(zzz86.zzYVG().zzZ8(zzz86.zzYVG().zzY(linkedStyle, zzz86), false));
        }
    }

    public final int zzZ(zzZ86 zzz86, int i) {
        return zzZ(zzz86, i, true);
    }

    public final int zzZ(int i, zzZ86 zzz86) {
        List listByListId = zzz86.zzYVF().getListByListId(i);
        if (listByListId == null) {
            return 0;
        }
        int iZzxp = zzxp(listByListId.zzYP8());
        if (iZzxp != -1 && !zzz86.zzYVB().zzVE(listByListId.zzYP8())) {
            this.zzYcI.remove(iZzxp);
        }
        zzz86.zzXF(listByListId.zzYP8());
        boolean zZzZ = zzZ(zzz86, listByListId);
        List listByListId2 = zzz86.zzYVE().getListByListId(zzz86.zzYVC().get(i));
        if (!zZzZ) {
            return listByListId2.getListId();
        }
        if (listByListId.getStyle() != null) {
            listByListId2.zzYPa().zzxh(zzz86.zzYVG().zzY(listByListId.getStyle(), zzz86));
        }
        ListLevelCollection listLevelCollectionZzYOP = listByListId.zzYPa().zzYOP();
        ListLevelCollection listLevelCollectionZzYOP2 = listByListId2.zzYPa().zzYOP();
        for (int i2 = 0; i2 < listLevelCollectionZzYOP.getCount(); i2++) {
            zzY(zzz86, listLevelCollectionZzYOP.get(i2), listLevelCollectionZzYOP2.get(i2));
        }
        return listByListId2.getListId();
    }

    private int zzZ(zzZ86 zzz86, int i, boolean z) {
        List listByListId = zzz86.zzYVF().getListByListId(i);
        if (listByListId == null) {
            return 0;
        }
        boolean zZzZ = zzZ(zzz86, listByListId);
        List listByListId2 = zzz86.zzYVE().getListByListId(zzz86.zzYVC().get(i));
        if (!zZzZ) {
            return listByListId2.getListId();
        }
        if (z && listByListId.getStyle() != null) {
            Style styleZzZ = zzz86.zzYVG().zzZ(zzz86, listByListId.getStyle());
            if (listByListId.zzYPa().isListStyleDefinition() && !zzz86.zzR(listByListId.getStyle())) {
                listByListId2.zzxB(styleZzZ.getList().zzYP8());
                zzz86.zzYVB().set(listByListId.zzYP8(), listByListId2.zzYP8());
                return listByListId2.getListId();
            }
            listByListId2.zzYPa().zzxh(styleZzZ.zzZ7j());
        }
        ListLevelCollection listLevelCollectionZzYOP = listByListId.zzYPa().zzYOP();
        ListLevelCollection listLevelCollectionZzYOP2 = listByListId2.zzYPa().zzYOP();
        for (int i2 = 0; i2 < listLevelCollectionZzYOP.getCount(); i2++) {
            ListLevel listLevel = listLevelCollectionZzYOP.get(i2);
            ListLevel listLevel2 = listLevelCollectionZzYOP2.get(i2);
            zzZ(zzz86, listLevel, listLevel2);
            zzX(zzz86, listLevel, listLevel2);
        }
        return listByListId2.getListId();
    }

    private boolean zzZ(zzZ86 zzz86, List list) {
        List listZzP;
        if (zzz86.zzYVC().zzVE(list.getListId())) {
            return false;
        }
        if (zzz86.zzyh(list.zzYP8()) && (listZzP = zzP(list)) != null && !zzz86.zzYVB().zzVA(listZzP.zzYP8())) {
            zzz86.zzYVC().add(list.getListId(), listZzP.getListId());
            return false;
        }
        List listZzY = list.zzY(this.zzZCL, zzYP2());
        zzQ(listZzY);
        zzz86.zzYVC().add(list.getListId(), listZzY.getListId());
        zzZ4J zzz4jZzYPa = list.zzYPa();
        if (zzz86.zzYVB().zzVE(zzz4jZzYPa.zzYP8())) {
            listZzY.zzxB(zzz86.zzYVB().get(zzz4jZzYPa.zzYP8()));
            listZzY.zzYP9();
            return false;
        }
        zzZ4J zzz4jZzxr = zzxr(zzz4jZzYPa.zzYP8());
        if (zzz4jZzxr != null && zzz86.zzyh(zzz4jZzYPa.zzYP8())) {
            zzz86.zzYVB().set(zzz4jZzYPa.zzYP8(), zzz4jZzxr.zzYP8());
            return false;
        }
        int iZzYP8 = zzz4jZzxr == null ? zzz4jZzYPa.zzYP8() : zzYP4();
        zzZ(zzz4jZzYPa.zzX(this.zzZCL, iZzYP8));
        zzz86.zzYVB().set(zzz4jZzYPa.zzYP8(), iZzYP8);
        listZzY.zzxB(iZzYP8);
        return true;
    }

    private static void zzZ(zzZ86 zzz86, ListLevel listLevel, ListLevel listLevel2) {
        Style linkedStyle = listLevel.getLinkedStyle();
        if (linkedStyle != null) {
            listLevel2.setLinkedStyle(linkedStyle.getType() == 1 ? zzz86.zzYVG().zzZ(zzz86, linkedStyle) : null);
        }
    }

    public final void zzZ(int i, Shape shape) {
        if (this.zzYcH.size() == i) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYcH, shape);
        } else {
            this.zzYcH.set(i, shape);
        }
    }

    public final ListLevel zzZ(zzYMX zzymx, int i) {
        Object objZzVQ = zzymx.zzVQ(EditingLanguage.KASHMIRI_ARABIC, i);
        if (objZzVQ == null) {
            return null;
        }
        Integer num = (Integer) objZzVQ;
        if (num.intValue() == 0) {
            return null;
        }
        List listZzxu = zzxu(num.intValue());
        Object objZzVQ2 = zzymx.zzVQ(EditingLanguage.GALICIAN, i);
        return listZzxu.zzxw(objZzVQ2 != null ? ((Integer) objZzVQ2).intValue() : 0);
    }

    private static void zzZ(zzZ4J zzz4j, ArrayList<Style> arrayList) {
        Style style = zzz4j.getStyle();
        if (!arrayList.contains(style)) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, style);
        }
        style.zzZYj().remove(EditingLanguage.KASHMIRI_ARABIC);
        zzz4j.zzxh(12);
        zzz4j.zzYOT();
    }

    private static ArrayList<zzZ4J> zzZ(ArrayList<zzZ4J> arrayList, zzZ4J zzz4j) {
        zzZ4J next;
        while (zzz4j != null && zzz4j.getStyle() != null && !zzz4j.isListStyleDefinition()) {
            if (arrayList.contains(zzz4j)) {
                Iterator<zzZ4J> it = arrayList.iterator();
                while (it.hasNext() && (next = it.next()) != zzz4j) {
                    arrayList.remove(next);
                }
                return arrayList;
            }
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzz4j);
            zzz4j = zzz4j.getStyle().getList().zzYPa();
        }
        arrayList.clear();
        return arrayList;
    }

    public final void zzZ(zzYMX zzymx, zzYMX zzymx2) {
        ListLevel listLevelZzZ = zzZ(zzymx, 0);
        if (listLevelZzZ != null) {
            zzT(zzymx2);
            listLevelZzZ.zzZYj().zzY(zzymx2);
            zzZ4B zzz4bZzxz = zzxv(zzymx.getListId()).zzxz(zzymx.zzZ0C());
            if (zzz4bZzxz != null) {
                zzz4bZzxz.getListLevel().zzZYj().zzY(zzymx2);
                return;
            }
            return;
        }
        if (zzymx.zzYpL()) {
            zzymx2.zzwb(0);
            zzymx2.zzwa(0);
            if (zzymx2.contains(EditingLanguage.GUARANI)) {
                for (int i = 0; i < zzymx2.getTabStops().getCount(); i++) {
                    TabStop tabStop = zzymx2.getTabStops().get(i);
                    if (tabStop.getAlignment() == 6) {
                        tabStop.setAlignment(7);
                    }
                }
                zzymx2.getTabStops().zzY0q();
            }
        }
    }
}
