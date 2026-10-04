package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class SdtListItemCollection implements Cloneable, Iterable<SdtListItem> {
    private StructuredDocumentTag zzXB9;
    private String zzXo8;
    private int zzXo9 = -1;
    private ArrayList<SdtListItem> zzZc = new ArrayList<>();

    public void add(SdtListItem sdtListItem) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZc, sdtListItem);
    }

    public void clear() {
        this.zzZc.clear();
        setSelectedValue(null);
        zzYDH.zzv(this.zzXB9);
    }

    public SdtListItem get(int i) {
        return this.zzZc.get(i);
    }

    public int getCount() {
        return this.zzZc.size();
    }

    public final int getSelectedIndex() {
        return this.zzXo9;
    }

    public SdtListItem getSelectedValue() {
        int i = this.zzXo9;
        if (i != -1) {
            return get(i);
        }
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<SdtListItem> iterator() {
        return this.zzZc.iterator();
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeAt(int i) {
        SdtListItem selectedValue = this.zzXo9 == i ? null : getSelectedValue();
        this.zzZc.remove(i);
        zzZ(selectedValue);
        zzYDH.zzv(this.zzXB9);
    }

    public void setSelectedValue(SdtListItem sdtListItem) {
        zzZ(sdtListItem);
        zzYDH.zzv(this.zzXB9);
    }

    public final void zzBi(String str) {
        this.zzXo8 = str;
        zzYDH.zzv(this.zzXB9);
    }

    public final int zzBj(String str) {
        for (int i = 0; i < getCount(); i++) {
            if (com.aspose.words.internal.zzZKN.equals(get(i).getValue(), str)) {
                return i;
            }
        }
        return -1;
    }

    public final String zzYcL() {
        return this.zzXo8;
    }

    public final SdtListItemCollection zzYcM() {
        SdtListItemCollection sdtListItemCollection = (SdtListItemCollection) memberwiseClone();
        sdtListItemCollection.zzZc = new ArrayList<>(this.zzZc.size());
        for (int i = 0; i < this.zzZc.size(); i++) {
            sdtListItemCollection.add(get(i).zzYcN());
        }
        return sdtListItemCollection;
    }

    public final void zzZ(SdtListItem sdtListItem) {
        if (sdtListItem == null) {
            this.zzXo9 = -1;
        } else {
            if (!this.zzZc.contains(sdtListItem)) {
                throw new IllegalArgumentException("Can not find such LastValue in this collection.");
            }
            this.zzXo9 = this.zzZc.indexOf(sdtListItem);
        }
    }

    public final void zzs(StructuredDocumentTag structuredDocumentTag) {
        this.zzXB9 = structuredDocumentTag;
    }
}
