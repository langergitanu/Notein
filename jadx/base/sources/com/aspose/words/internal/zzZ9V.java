package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9V extends zzZDB {
    zzZD9 zzWEv;

    public zzZ9V(byte[] bArr) {
        this.zzWEv = new zzZC6(bArr);
    }

    public static zzZ9V zzXX(Object obj) {
        if (obj instanceof zzZ9V) {
            return (zzZ9V) obj;
        }
        if (obj != null) {
            return new zzZ9V(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] getIV() {
        zzZD9 zzzd9 = this.zzWEv;
        if (zzzd9 != null) {
            return zzYGU.zzVI(zzzd9.zzXL5());
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzZD9 zzzd9 = this.zzWEv;
        if (zzzd9 != null) {
            zzzdj.zzZ(zzzd9);
        }
        return new zzZC2(zzzdj);
    }

    private zzZ9V(zzZD4 zzzd4) {
        if (zzzd4.size() == 1) {
            this.zzWEv = (zzZD9) zzzd4.zzg6(0);
        } else {
            this.zzWEv = null;
        }
    }
}
