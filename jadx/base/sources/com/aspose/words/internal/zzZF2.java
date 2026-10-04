package com.aspose.words.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZF2 implements zzYFX, Serializable {
    private static final zzZF2 zzWLT = new zzZF2(null, "", "", -1, -1, -1);
    protected transient String zzWLP;
    protected final int zzWLQ;
    protected final long zzWLR;
    protected final zzZF2 zzWLS;
    protected final int zzX4n;
    protected final String zzYry;
    protected final String zzYrz;

    public zzZF2(zzZF2 zzzf2, String str, String str2, long j, int i, int i2) {
        this.zzWLP = null;
        this.zzWLS = zzzf2;
        this.zzYrz = str;
        this.zzYry = str2;
        this.zzWLR = j;
        this.zzWLQ = i2;
        this.zzX4n = i;
    }

    public static zzZF2 zzXN8() {
        return zzWLT;
    }

    private void zzu(StringBuilder sb) {
        String str;
        zzZF2 zzzf2 = this;
        while (true) {
            if (zzzf2.zzYry != null) {
                sb.append("[row,col,system-id]: ");
                str = zzzf2.zzYry;
            } else if (zzzf2.zzYrz != null) {
                sb.append("[row,col,public-id]: ");
                str = zzzf2.zzYrz;
            } else {
                sb.append("[row,col {unknown-source}]: ");
                str = null;
            }
            sb.append('[');
            sb.append(zzzf2.zzX4n);
            sb.append(',');
            sb.append(zzzf2.zzWLQ);
            if (str != null) {
                sb.append(',');
                sb.append('\"');
                sb.append(str);
                sb.append('\"');
            }
            sb.append(']');
            if (zzzf2.zzWLS == null) {
                return;
            }
            zzZDX.zzt(sb);
            sb.append(" from ");
            zzzf2 = zzzf2.zzWLS;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzZF2)) {
            return false;
        }
        zzZF2 zzzf2 = (zzZF2) obj;
        if (zzzf2.zzWLR != this.zzWLR) {
            return false;
        }
        String str = zzzf2.zzYrz;
        if (str == null) {
            str = "";
        }
        if (!str.equals(this.zzYrz)) {
            return false;
        }
        String str2 = zzzf2.zzYry;
        return (str2 != null ? str2 : "").equals(this.zzYry);
    }

    @Override // com.aspose.words.internal.zzZQY
    public final int getColumnNumber() {
        return this.zzWLQ;
    }

    @Override // com.aspose.words.internal.zzZQY
    public final int getLineNumber() {
        return this.zzX4n;
    }

    @Override // com.aspose.words.internal.zzZQY
    public final String getPublicId() {
        return this.zzYrz;
    }

    @Override // com.aspose.words.internal.zzZQY
    public final String getSystemId() {
        return this.zzYry;
    }

    public final int hashCode() {
        long j = this.zzWLR;
        int i = (((int) (j >> 32)) ^ ((int) j)) ^ this.zzX4n;
        int i2 = this.zzWLQ;
        return i ^ (i2 + (i2 << 3));
    }

    public final String toString() {
        if (this.zzWLP == null) {
            StringBuilder sb = this.zzWLS != null ? new StringBuilder(200) : new StringBuilder(80);
            zzu(sb);
            this.zzWLP = sb.toString();
        }
        return this.zzWLP;
    }

    @Override // com.aspose.words.internal.zzZQY
    public final int zzll() {
        return (int) this.zzWLR;
    }

    public zzZF2(String str, zzZF7 zzzf7, long j, int i, int i2) {
        this.zzWLP = null;
        this.zzWLS = null;
        this.zzYrz = str;
        this.zzYry = zzzf7 == null ? "N/A" : zzzf7.toString();
        this.zzWLR = j;
        this.zzWLQ = i2;
        this.zzX4n = i;
    }
}
