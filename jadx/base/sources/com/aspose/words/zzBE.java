package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzBE {
    private int zzL4;
    private int zzZ7Q;
    private String zzZ7R;
    private int zzZ7S;

    public zzBE() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzBE.class) {
            return false;
        }
        return zzX((zzBE) obj);
    }

    public final int getType() {
        return this.zzL4;
    }

    public final int hashCode() {
        int i = ((this.zzL4 * 397) ^ this.zzZ7S) * 397;
        String str = this.zzZ7R;
        return ((i ^ (str != null ? str.hashCode() : 0)) * 397) ^ this.zzZ7Q;
    }

    public final boolean zzX(zzBE zzbe) {
        return this.zzL4 == zzbe.zzL4 && this.zzZ7S == zzbe.zzZ7S && com.aspose.words.internal.zzZKN.equals(this.zzZ7R, zzbe.zzZ7R) && this.zzZ7Q == zzbe.zzZ7Q;
    }

    public final int zzZF5() {
        return this.zzZ7Q;
    }

    public final String zzZF6() {
        return this.zzZ7R;
    }

    public final int zzZF7() {
        return this.zzZ7S;
    }

    public zzBE(int i) {
        this(i, 2, "", 0);
    }

    public zzBE(int i, String str) {
        this(i, 0, str, 0);
    }

    public zzBE(int i, int i2, String str, int i3) {
        this.zzL4 = i;
        this.zzZ7S = i2;
        this.zzZ7R = str;
        this.zzZ7Q = i3;
    }
}
