package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZT7 extends zzZUN {
    private zz8N zzCC;
    private long zzZN;

    public final zz8N zzY(zzPM zzpm, zz9O zz9o, float f, zzGQ zzgq, zzF8 zzf8) throws Exception {
        zz8N zz8n = this.zzCC;
        if (zz8n != null) {
            return zz8n;
        }
        zz8N zz8nZzZ = zzZ(zzpm, zz9o, f, zzgq, zzf8);
        this.zzCC = zz8nZzZ;
        return zz8nZzZ;
    }

    public abstract zz8N zzZ(zzPM zzpm, zz9O zz9o, float f, zzGQ zzgq, zzF8 zzf8) throws Exception;

    public final long zzZT() {
        return this.zzZN;
    }

    public final void zzY(long j) {
        this.zzZN = j;
    }
}
