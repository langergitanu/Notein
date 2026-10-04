package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzU8 {
    CompareOptions zzZup;
    private Document zzZur;
    private Document zzZus;
    private boolean zzZut;
    int zzZuq = Integer.MIN_VALUE;
    com.aspose.words.internal.zzZQC<zzY9D> zzZuo = new com.aspose.words.internal.zzZQC<>();
    HashMap<Node, CompositeNode> zzZun = new HashMap<>();
    HashMap<Integer, zzYD5> zzZum = new HashMap<>();
    HashMap<zzZT, Boolean> zzZul = new HashMap<>();
    HashMap<zzZT, Boolean> zzZuk = new HashMap<>();
    com.aspose.words.internal.zzZYI zzZuj = new com.aspose.words.internal.zzZYI();
    private HashMap<Integer, Integer> zzZui = new HashMap<>();
    private HashMap<Integer, Integer> zzZuh = new HashMap<>();
    private HashMap<Integer, Integer> zzZug = new HashMap<>();
    private HashMap<Integer, Integer> zzZuf = new HashMap<>();
    private com.aspose.words.internal.zzIM<Integer> zzZue = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzIM<Integer> zzZud = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzD4 zzZuc = new com.aspose.words.internal.zzD4();
    private com.aspose.words.internal.zzIM<String> zzZub = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzIM<String> zzZua = new com.aspose.words.internal.zzIM<>();

    public zzU8(Document document, Document document2, CompareOptions compareOptions) {
        this.zzZus = document;
        this.zzZur = document2;
        this.zzZup = compareOptions;
        if (document != null && document2 != null) {
            for (zzZ4J zzz4j : document.getLists().zzYOX()) {
                if (document2.getLists().zzxp(zzz4j.zzYP8()) != -1) {
                    this.zzZud.add(Integer.valueOf(zzz4j.zzYP8()));
                }
            }
        }
        this.zzZub.add("_GoBack");
        this.zzZua.add("_GoBack");
    }

    public final boolean hasRevisions() {
        return this.zzZut;
    }

    public final int zzMZ(int i) {
        if (!this.zzZuc.zzVE(i)) {
            com.aspose.words.internal.zzD4 zzd4 = this.zzZuc;
            zzd4.add(i, zzd4.getCount());
        }
        return this.zzZuc.get(i);
    }

    public final zzZ4J zzN0(int i) {
        if (this.zzZud.contains(Integer.valueOf(i))) {
            return this.zzZur.getLists().zzxr(i);
        }
        return null;
    }

    public final zzZ4J zzN1(int i) {
        if (this.zzZud.contains(Integer.valueOf(i))) {
            return this.zzZus.getLists().zzxr(i);
        }
        return null;
    }

    public final boolean zzN2(int i) {
        return this.zzZue.contains(Integer.valueOf(i));
    }

    public final boolean zzN3(int i) {
        return this.zzZuh.containsKey(Integer.valueOf(i));
    }

    public final boolean zzN4(int i) {
        return this.zzZui.containsKey(Integer.valueOf(i));
    }

    public final int zzN5(int i) {
        return ((Integer) com.aspose.words.internal.zzQW.zzZ(this.zzZug, Integer.valueOf(i), Integer.valueOf(i))).intValue();
    }

    public final int zzN6(int i) {
        return ((Integer) com.aspose.words.internal.zzQW.zzZ(this.zzZuf, Integer.valueOf(i), Integer.valueOf(i))).intValue();
    }

    public final int zzN7(int i) {
        return ((Integer) com.aspose.words.internal.zzQW.zzZ(this.zzZuh, Integer.valueOf(i), Integer.valueOf(i))).intValue();
    }

    public final int zzN8(int i) {
        return ((Integer) com.aspose.words.internal.zzQW.zzZ(this.zzZui, Integer.valueOf(i), Integer.valueOf(i))).intValue();
    }

    public final boolean zzX(zzZD7 zzzd7) {
        return (zzzd7 instanceof BookmarkStart ? this.zzZub : this.zzZua).contains(zzzd7.getName());
    }

    public final void zzY(zzZD7 zzzd7) {
        com.aspose.words.internal.zzIM<String> zzim = zzzd7 instanceof BookmarkStart ? this.zzZub : this.zzZua;
        if (zzX(zzzd7)) {
            return;
        }
        zzim.add(zzzd7.getName());
    }

    public final void zzYi(int i, int i2) {
        this.zzZuh.put(Integer.valueOf(i), Integer.valueOf(i2));
        this.zzZue.add(Integer.valueOf(i2));
    }

    public final void zzYj(int i, int i2) {
        this.zzZug.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void zzYk(int i, int i2) {
        this.zzZuf.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void zzYl(int i, int i2) {
        this.zzZui.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final Document zzZZ5() {
        return this.zzZur;
    }

    public final Document zzZZ6() {
        return this.zzZus;
    }

    public final void zzZZ7() {
        this.zzZut = true;
    }

    public final void zzZZ8() {
        Iterator<Integer> it = this.zzZud.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            zzZ4J zzz4jZzxr = this.zzZur.getLists().zzxr(iIntValue);
            this.zzZus.getLists().zzYOX().set(this.zzZus.getLists().zzxp(iIntValue), zzz4jZzxr.zzX(this.zzZus, iIntValue));
            this.zzZus.getLists().zzxo(iIntValue);
        }
    }

    public final boolean zzZZ9() {
        return this.zzZud.getCount() > 0;
    }
}
