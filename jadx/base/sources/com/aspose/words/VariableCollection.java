package com.aspose.words;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class VariableCollection implements Iterable<Map.Entry<String, String>> {
    private com.aspose.words.internal.zzZYT<String> zzmQ = new com.aspose.words.internal.zzZYT<>(false);

    public void add(String str, String str2) {
        com.aspose.words.internal.zzZYT<String> zzzyt = this.zzmQ;
        if (!com.aspose.words.internal.zzZYD.zzXk(str2)) {
            str2 = "";
        }
        zzzyt.set(str, str2);
    }

    public void clear() {
        this.zzmQ.clear();
    }

    public boolean contains(String str) {
        return this.zzmQ.containsKey(str);
    }

    public String get(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "name");
        return this.zzmQ.zzZ(str, "");
    }

    public int getCount() {
        return this.zzmQ.getCount();
    }

    public int indexOfKey(String str) {
        return this.zzmQ.indexOfKey(str);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<String, String>> iterator() {
        return this.zzmQ.iterator();
    }

    public void remove(String str) {
        this.zzmQ.remove(str);
    }

    public void removeAt(int i) {
        this.zzmQ.removeAt(i);
    }

    public void set(String str, String str2) {
        com.aspose.words.internal.zzZ4.zzU(str, "name");
        com.aspose.words.internal.zzZYT<String> zzzyt = this.zzmQ;
        if (!com.aspose.words.internal.zzZYD.zzXk(str2)) {
            str2 = "";
        }
        zzzyt.set(str, str2);
    }

    public final VariableCollection zzXU7() {
        VariableCollection variableCollection = new VariableCollection();
        for (Map.Entry<String, String> entry : this) {
            variableCollection.add(entry.getKey(), entry.getValue());
        }
        return variableCollection;
    }

    public String get(int i) {
        return this.zzmQ.zzl9().get(i);
    }

    public void set(int i, String str) {
        String str2 = this.zzmQ.getKeys().get(i);
        com.aspose.words.internal.zzZYT<String> zzzyt = this.zzmQ;
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            str = "";
        }
        zzzyt.set(str2, str);
    }
}
