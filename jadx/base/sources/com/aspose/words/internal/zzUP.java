package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzUP implements Comparable<zzUP> {
    private String zzRZ;
    private int zzS0;
    private String zzYH;

    public zzUP(zzU1 zzu1, int i) {
        this.zzS0 = i;
        this.zzRZ = zzu1.getName();
        this.zzYH = zzu1.getLanguage();
    }

    public final String getLanguage() {
        return this.zzYH;
    }

    public final String getName() {
        return this.zzRZ;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzUP zzup) {
        if (zzup == null) {
            throw new IllegalArgumentException("object is not a CharsetMatch");
        }
        int i = this.zzS0;
        int i2 = zzup.zzS0;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public zzUP(int i, String str, String str2) {
        this.zzS0 = i;
        this.zzRZ = str;
        this.zzYH = str2;
    }
}
