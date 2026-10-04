package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8J {
    private boolean zzX99;
    private int zzX9a;
    private boolean zzX9w;
    private int zzXZ;
    private Paragraph zzYtC;

    private zzY8J(Paragraph paragraph, int i, int i2, boolean z, boolean z2) {
        this.zzYtC = paragraph;
        this.zzXZ = i;
        this.zzX9a = i2;
        this.zzX9w = z;
        this.zzX99 = z2;
    }

    public static zzY8J zzN(Paragraph paragraph, boolean z) {
        boolean z2 = zzY8S.zzYf(paragraph).getCount() != 0;
        return new zzY8J(paragraph, z2 ? 0 : -1, z2 ? r0.getCount() - 1 : 0, z, false);
    }

    private static boolean zzVn(int i, int i2) {
        return i >= 0 && i2 >= 0;
    }

    public static zzY8J zzZ(Paragraph paragraph, int i, int i2, boolean z, boolean z2, boolean z3) {
        if (z3 || zzVn(i, i2)) {
            return new zzY8J(paragraph, i, i2, z, z2);
        }
        return null;
    }

    public final int getEndIndex() {
        return this.zzX9a;
    }

    public final Paragraph getParagraph() {
        return this.zzYtC;
    }

    public final int getStartIndex() {
        return this.zzXZ;
    }

    public final boolean zzY2h() {
        return zzVn(this.zzXZ, this.zzX9a);
    }

    public final boolean zzY2i() {
        return this.zzX99;
    }

    public final boolean zzY2j() {
        return this.zzX9w;
    }
}
