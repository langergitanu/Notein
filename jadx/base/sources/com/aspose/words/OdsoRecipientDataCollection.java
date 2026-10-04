package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class OdsoRecipientDataCollection implements Iterable<OdsoRecipientData> {
    private ArrayList<OdsoRecipientData> zzZm = new ArrayList<>();

    public int add(OdsoRecipientData odsoRecipientData) {
        com.aspose.words.internal.zzZ4.zzY((Object) odsoRecipientData, "value");
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, odsoRecipientData);
        return this.zzZm.size() - 1;
    }

    public void clear() {
        this.zzZm.clear();
    }

    public OdsoRecipientData get(int i) {
        return this.zzZm.get(i);
    }

    public int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public Iterator<OdsoRecipientData> iterator() {
        return this.zzZm.iterator();
    }

    public void removeAt(int i) {
        this.zzZm.remove(i);
    }

    public void set(int i, OdsoRecipientData odsoRecipientData) {
        com.aspose.words.internal.zzZ4.zzY((Object) odsoRecipientData, "value");
        this.zzZm.set(i, odsoRecipientData);
    }
}
