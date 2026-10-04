package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ToaCategories {
    private static ToaCategories zzX2N = new ToaCategories();
    private com.aspose.words.internal.zzD3<String> zzX2M;

    public ToaCategories() {
        com.aspose.words.internal.zzD3<String> zzd3 = new com.aspose.words.internal.zzD3<>();
        this.zzX2M = zzd3;
        zzd3.set(1, "Cases");
        this.zzX2M.set(2, "Statutes");
        this.zzX2M.set(3, "Other Authorities");
        this.zzX2M.set(4, "Rules");
        this.zzX2M.set(5, "Treatises");
        this.zzX2M.set(6, "Regulations");
        this.zzX2M.set(7, "Constitutional Provisions");
    }

    public static ToaCategories getDefaultCategories() {
        return zzX2N;
    }

    public String get(int i) {
        String str = this.zzX2M.get(i);
        return str != null ? str : Integer.toString(i);
    }

    public void set(int i, String str) {
        this.zzX2M.set(i, str);
    }
}
