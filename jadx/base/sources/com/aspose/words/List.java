package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class List implements Cloneable, Comparable<List> {
    private zzZ4A zzYcK = new zzZ4A();
    private zzZ4J zzYcL;
    private int zzYcM;
    private int zzYcN;
    private DocumentBase zzZCL;
    private int zzZvo;

    public List(DocumentBase documentBase, int i) {
        this.zzZCL = documentBase;
        this.zzYcN = i;
    }

    private zzZ4B zzxA(int i) {
        for (zzZ4B zzz4b : this.zzYcK) {
            if (zzz4b.getListLevel().zzYOa() == i && zzz4b.zzYbX) {
                return zzz4b;
            }
        }
        return null;
    }

    public boolean equals(List list) {
        return zzZ(list, new com.aspose.words.internal.zzIM<>());
    }

    public DocumentBase getDocument() {
        return this.zzZCL;
    }

    public int getListId() {
        return this.zzYcN;
    }

    public ListLevelCollection getListLevels() {
        return zzYPa().zzYOS().zzYOP();
    }

    public Style getStyle() {
        if (zzYPa().zzYOO() != 12) {
            return zzYPa().getStyle();
        }
        return null;
    }

    public boolean hasSameTemplate(List list) {
        return this.zzYcM == list.zzYcM;
    }

    public int hashCode() {
        return (zzYPa().hashCode() * 397) ^ this.zzYcK.hashCode();
    }

    public boolean isListStyleDefinition() {
        return zzYPa().isListStyleDefinition();
    }

    public boolean isListStyleReference() {
        return zzYPa().isListStyleReference();
    }

    public boolean isMultiLevel() {
        return zzYPa().zzYOR() != 0;
    }

    public boolean isRestartAtEachSection() {
        return zzYPa().isRestartAtEachSection();
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzNb(int i) {
        this.zzZvo = i;
    }

    public final List zzY(DocumentBase documentBase, int i) {
        List list = (List) memberwiseClone();
        list.zzZCL = documentBase;
        list.zzYcN = i;
        list.zzYcL = null;
        list.zzYcK = new zzZ4A();
        Iterator<zzZ4B> it = this.zzYcK.iterator();
        while (it.hasNext()) {
            list.zzYcK.zzZ(it.next().zzy(documentBase));
        }
        return list;
    }

    public final int zzYP8() {
        return this.zzYcM;
    }

    public final void zzYP9() {
        this.zzYcL = null;
    }

    public final zzZ4J zzYPa() {
        if (this.zzYcL == null) {
            this.zzYcL = this.zzZCL.getLists().zzxq(this.zzYcM);
        }
        return this.zzYcL;
    }

    public final zzZ4A zzYPb() {
        return this.zzYcK;
    }

    public final boolean zzZ(List list, com.aspose.words.internal.zzIM<com.aspose.words.internal.zz6R> zzim) {
        return list != null && zzYPa().zzZ(list.zzYPa(), zzim) && this.zzYcK.zzZ(list.zzYcK, zzim);
    }

    public final int zzZZS() {
        return this.zzZvo;
    }

    public final void zzxB(int i) {
        this.zzYcM = i;
    }

    public final void zzxC(int i) {
        this.zzYcN = i;
    }

    public final ListLevel zzxw(int i) {
        zzZ4B zzz4bZzxz = zzxz(i);
        return zzz4bZzxz != null ? zzz4bZzxz.getListLevel() : getListLevels().zzwY(i);
    }

    public final int zzxx(int i) {
        zzZ4B zzz4bZzxA = zzxA(i);
        if (zzz4bZzxA != null) {
            return zzz4bZzxA.zzYO3();
        }
        ListLevelCollection listLevels = zzYPa().getListLevels();
        if (listLevels.getCount() == 0) {
            listLevels = zzYPa().zzYOS().zzYOP();
        }
        return listLevels.zzwY(i).getStartAt();
    }

    public final boolean zzxy(int i) {
        return zzxA(i) != null;
    }

    public final zzZ4B zzxz(int i) {
        if (!isMultiLevel()) {
            i = 0;
        }
        for (zzZ4B zzz4b : this.zzYcK) {
            if (zzz4b.getListLevel().zzYOa() == i && zzz4b.zzYbW) {
                return zzz4b;
            }
        }
        return null;
    }

    @Override // java.lang.Comparable
    public int compareTo(List list) {
        return com.aspose.words.internal.zzZKR.zzZ7(getListId(), list.getListId());
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (List.class != obj.getClass()) {
            return false;
        }
        return equals((List) obj);
    }

    public void isRestartAtEachSection(boolean z) {
        zzYPa().isRestartAtEachSection(z);
    }

    public List(zzZ4J zzz4j, int i) {
        this.zzYcL = zzz4j;
        this.zzZCL = zzz4j.getDocument();
        this.zzYcM = zzz4j.zzYP8();
        this.zzYcN = i;
    }
}
