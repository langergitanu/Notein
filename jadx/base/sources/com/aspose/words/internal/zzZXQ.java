package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZXQ implements zzFO {
    public static zzZXQ zzb8 = new zzZXQ("");
    private String mValue;
    private zzZXU[] zzb7;

    private zzZXQ(String str) {
        this.mValue = str;
        this.zzb7 = new zzZXU[str.length()];
    }

    private zzZXU zzSU(int i) {
        zzZXU[] zzzxuArr = this.zzb7;
        zzZXU zzzxu = zzzxuArr[i];
        if (zzzxu != null) {
            return zzzxu;
        }
        zzZXU zzzxuZzf = zzZXU.zzf(this.mValue.charAt(i));
        zzzxuArr[i] = zzzxuZzf;
        return zzzxuZzf;
    }

    public static zzZXQ zzWW(String str) {
        return zzZKN.equals(str, "") ? zzb8 : new zzZXQ(str);
    }

    private zzZXQ zzZz(int i, int i2) {
        return zzWW(zzZKN.zzT(this.mValue, 0, 1));
    }

    private zzZXQ zza(String str, String str2) {
        return zzWW(this.mValue.replace(str, str2));
    }

    private zzHG[] zzpS() {
        int i = 0;
        while (true) {
            zzZXU[] zzzxuArr = this.zzb7;
            if (i >= zzzxuArr.length) {
                return zzzxuArr;
            }
            zzSU(i);
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzFO
    public final int getLength() {
        return this.mValue.length();
    }

    public final String getValue() {
        return this.mValue;
    }

    @Override // com.aspose.words.internal.zzFO
    public final int indexOf(String str) {
        return zzZKN.zzT(this.mValue, str, zzZOF.ORDINAL$4894b8c8);
    }

    @Override // java.lang.Iterable
    public final Iterator<zzHG> iterator() {
        return zzZKV.zzT(zzpS());
    }

    @Override // com.aspose.words.internal.zzFO
    public final zzFO zzA(String str, String str2) {
        return zza(str, str2);
    }

    @Override // com.aspose.words.internal.zzFO
    public final String zzEL() {
        return this.mValue;
    }

    @Override // com.aspose.words.internal.zzFO
    public final zzFO zzEM() {
        return zzZz(0, 1);
    }

    @Override // com.aspose.words.internal.zzFO
    public final zzHG zzW9(int i) {
        return zzSU(i);
    }
}
