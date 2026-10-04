package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7H extends zzZDB {
    private zzZD4 zzWpG;
    private zzZDA zzWpH;

    private zzZ7H(zzZD4 zzzd4) {
        if (zzzd4.size() <= 0 || zzzd4.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
        }
        this.zzWpH = zzZDA.zzYA(zzzd4.zzg6(0));
        if (zzzd4.size() > 1) {
            this.zzWpG = zzZD4.zzYy(zzzd4.zzg6(1));
        }
    }

    public static zzZ7H zzX1(Object obj) {
        return (obj == null || (obj instanceof zzZ7H)) ? (zzZ7H) obj : new zzZ7H(zzZD4.zzYy(obj));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Policy information: ");
        sb.append(this.zzWpH);
        if (this.zzWpG != null) {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < this.zzWpG.size(); i++) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzZ7G.zzX0(this.zzWpG.zzg6(i)));
            }
            sb.append("[");
            sb.append((CharSequence) sb2);
            sb.append("]");
        }
        return sb.toString();
    }

    public final zzZD4 zzXHK() {
        return this.zzWpG;
    }

    public final zzZDA zzXHL() {
        return this.zzWpH;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWpH);
        zzZD4 zzzd4 = this.zzWpG;
        if (zzzd4 != null) {
            zzzdj.zzZ(zzzd4);
        }
        return new zzZC2(zzzdj);
    }
}
