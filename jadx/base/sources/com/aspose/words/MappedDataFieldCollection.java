package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MappedDataFieldCollection implements Iterable<Map.Entry<String, String>> {
    private HashMap<String, String> zzYwo = new HashMap<>();

    public void add(String str, String str2) {
        com.aspose.words.internal.zzZQF.zzY(this.zzYwo, str, str2);
    }

    public void clear() {
        this.zzYwo.clear();
    }

    public boolean containsKey(String str) {
        return this.zzYwo.containsKey(str);
    }

    public boolean containsValue(String str) {
        return this.zzYwo.containsValue(str);
    }

    public String get(String str) {
        return (String) com.aspose.words.internal.zzQW.zzZ(this.zzYwo, str);
    }

    public int getCount() {
        return this.zzYwo.size();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<String, String>> iterator() {
        return this.zzYwo.entrySet().iterator();
    }

    public void remove(String str) {
        com.aspose.words.internal.zzZQF.zzY(this.zzYwo, str);
    }

    public void set(String str, String str2) {
        this.zzYwo.put(str, str2);
    }
}
