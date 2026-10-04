package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzJP implements zzGP {
    private int zzA5;
    private zzF4 zzA6;

    public zzJP() {
        this((byte) 0);
    }

    public static void zzZ(zzF4 zzf4, String str) {
        if (zzf4 != null) {
            zzf4.zzZ(1, 12, str);
        }
    }

    @Override // com.aspose.words.internal.zzGP
    public int getPriorityInternal() {
        return this.zzA5;
    }

    public final zzF4 zzHq() {
        return this.zzA6;
    }

    private zzJP(byte b) {
        this.zzA5 = 0;
    }
}
