package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FontInfoCollection implements Iterable<FontInfo> {
    private boolean zzYxf;
    private boolean zzYxg;
    private boolean zzYxh;
    private com.aspose.words.internal.zzZYI zzYxi;
    private ArrayList<String> zzYxj;
    private com.aspose.words.internal.zzZYI zzYxk;
    private ArrayList<FontInfo> zzZm;

    public FontInfoCollection() {
        clear();
    }

    private void clear() {
        this.zzZm = new ArrayList<>();
        this.zzYxj = new ArrayList<>();
        this.zzYxk = new com.aspose.words.internal.zzZYI(false);
        this.zzYxi = new com.aspose.words.internal.zzZYI(false);
    }

    private void zzZ(FontInfoCollection fontInfoCollection) {
        this.zzYxh = fontInfoCollection.getEmbedTrueTypeFonts();
        this.zzYxg = fontInfoCollection.getEmbedSystemFonts();
        this.zzYxf = fontInfoCollection.getSaveSubsetFonts();
    }

    private void zzZA(ArrayList<String> arrayList) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            zzW(new FontInfo(it.next()));
        }
    }

    public boolean contains(String str) {
        return this.zzYxk.containsKey(str);
    }

    public FontInfo get(String str) {
        int i = this.zzYxk.get(str);
        if (com.aspose.words.internal.zzZYI.zzWm(i)) {
            return null;
        }
        return get(i);
    }

    public int getCount() {
        return this.zzZm.size();
    }

    public boolean getEmbedSystemFonts() {
        return this.zzYxg;
    }

    public boolean getEmbedTrueTypeFonts() {
        return this.zzYxh;
    }

    public boolean getSaveSubsetFonts() {
        return this.zzYxf;
    }

    @Override // java.lang.Iterable
    public Iterator<FontInfo> iterator() {
        return this.zzZm.iterator();
    }

    public void setEmbedSystemFonts(boolean z) {
        this.zzYxg = z;
    }

    public void setEmbedTrueTypeFonts(boolean z) {
        this.zzYxh = z;
    }

    public void setSaveSubsetFonts(boolean z) {
        this.zzYxf = z;
    }

    public final String zzB6(int i) {
        if (this.zzZm.size() == 0) {
            zzW(new FontInfo("Times New Roman"));
        }
        if (i < 0 || i >= this.zzYxj.size()) {
            i = 0;
        }
        return this.zzYxj.get(i);
    }

    public final int zzLn(String str) {
        int i = this.zzYxk.get(str);
        return com.aspose.words.internal.zzZYI.zzWm(i) ? zzW(new FontInfo(str)) : i;
    }

    public final int zzW(FontInfo fontInfo) {
        int size;
        if (contains(fontInfo.getName())) {
            size = this.zzYxk.get(fontInfo.getName());
            this.zzZm.get(size).zzY(fontInfo);
        } else if (com.aspose.words.internal.zzZYD.zzXk(fontInfo.getName())) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZm, fontInfo.zzZ7b());
            size = this.zzZm.size() - 1;
            this.zzYxk.set(fontInfo.getName(), size);
        } else {
            size = 0;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzYxj, fontInfo.getName());
        for (String str : fontInfo.zzZ79()) {
            if (!this.zzYxi.containsKey(str)) {
                this.zzYxi.set(str, size);
            }
        }
        return size;
    }

    public final void zzX(zzZZF zzzzf) {
        this.zzYxh = zzzzf.zzYWy;
        this.zzYxg = zzzzf.zzYWx;
        this.zzYxf = zzzzf.zzYWw;
    }

    public final void zzY(FontInfoCollection fontInfoCollection) {
        Iterator<FontInfo> it = fontInfoCollection.iterator();
        while (it.hasNext()) {
            zzW(it.next());
        }
    }

    public final FontInfoCollection zzZ70() {
        FontInfoCollection fontInfoCollectionZzZ71 = zzZ71();
        fontInfoCollectionZzZ71.zzZ76();
        return fontInfoCollectionZzZ71;
    }

    public final FontInfoCollection zzZ71() {
        FontInfoCollection fontInfoCollection = new FontInfoCollection();
        fontInfoCollection.zzZ(this);
        fontInfoCollection.zzY(this);
        return fontInfoCollection;
    }

    public final void zzZ76() {
        Iterator<FontInfo> it = iterator();
        while (it.hasNext()) {
            it.next().zzZ76();
        }
    }

    public final boolean zzZ77() {
        Iterator<FontInfo> it = iterator();
        while (it.hasNext()) {
            if (it.next().zzZ77()) {
                return true;
            }
        }
        return false;
    }

    public FontInfo get(int i) {
        return this.zzZm.get(i);
    }

    public final void zzY(com.aspose.words.internal.zzFQ<String> zzfq) {
        ArrayList<String> arrayList = new ArrayList<>();
        com.aspose.words.internal.zzZQH<Integer, Integer> zzzqh = new com.aspose.words.internal.zzZQH<>();
        zzZ(zzfq, arrayList, zzzqh);
        zzW(zzzqh);
        zzZA(arrayList);
    }

    private void zzZ(com.aspose.words.internal.zzFQ<String> zzfq, ArrayList<String> arrayList, com.aspose.words.internal.zzZQH<Integer, Integer> zzzqh) {
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator<String> it = zzfq.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList2, it.next());
        }
        Collections.sort(arrayList2);
        for (String str : arrayList2) {
            int i = this.zzYxk.get(str);
            if (com.aspose.words.internal.zzZYI.zzWm(i)) {
                i = this.zzYxi.get(str);
            }
            if (com.aspose.words.internal.zzZYI.zzWm(i)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, str);
            } else if (!zzzqh.containsKey(Integer.valueOf(i))) {
                zzzqh.zzB(Integer.valueOf(i), 0);
            }
        }
    }

    private void zzW(com.aspose.words.internal.zzZQH<Integer, Integer> zzzqh) {
        ArrayList<FontInfo> arrayList = this.zzZm;
        clear();
        Iterator<Integer> it = zzzqh.getKeys().iterator();
        while (it.hasNext()) {
            zzW(arrayList.get(it.next().intValue()));
        }
    }
}
