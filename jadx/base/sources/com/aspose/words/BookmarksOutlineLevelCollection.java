package com.aspose.words;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class BookmarksOutlineLevelCollection implements Iterable<Map.Entry<String, Integer>> {
    private com.aspose.words.internal.zzZYT<Integer> zzmQ = new com.aspose.words.internal.zzZYT<>(false);

    public void add(String str, int i) {
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: outlineLevel");
        }
        this.zzmQ.zzB(str, Integer.valueOf(i));
    }

    public void clear() {
        this.zzmQ.clear();
    }

    public boolean contains(String str) {
        return this.zzmQ.containsKey(str);
    }

    public int get(String str) {
        return this.zzmQ.get(str).intValue();
    }

    public int getCount() {
        return this.zzmQ.getCount();
    }

    public int indexOfKey(String str) {
        return this.zzmQ.indexOfKey(str);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<String, Integer>> iterator() {
        return this.zzmQ.iterator();
    }

    public void remove(String str) {
        this.zzmQ.remove(str);
    }

    public void removeAt(int i) {
        this.zzmQ.removeAt(i);
    }

    public void set(String str, int i) {
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzmQ.set(str, Integer.valueOf(i));
    }

    public int get(int i) {
        return this.zzmQ.zzl9().get(i).intValue();
    }

    public void set(int i, int i2) {
        if (i2 >= 0 && i2 <= 9) {
            this.zzmQ.set(this.zzmQ.getKeys().get(i), Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
    }
}
