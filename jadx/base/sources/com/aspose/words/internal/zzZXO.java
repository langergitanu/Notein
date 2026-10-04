package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZXO implements zzFM {
    private StringBuilder zzb5;

    public zzZXO() {
        this(new StringBuilder());
    }

    private zzZXU zzST(int i) {
        return zzZXU.zzf(this.zzb5.charAt(i));
    }

    private zzZXO zzT(int i, char c) {
        this.zzb5.setCharAt(i, c);
        return this;
    }

    private zzZXO zzU(int i, char c) {
        this.zzb5.insert(i, c);
        return this;
    }

    private zzZXO zzV(char c, int i) {
        zzZNH.zzZ(this.zzb5, '0', i);
        return this;
    }

    private zzZXO zzWV(String str) {
        zzZNH.zzU(this.zzb5, str);
        return this;
    }

    private zzZXO zzZy(int i, int i2) {
        this.zzb5.delete(i, i2 + i);
        return this;
    }

    private zzZXO zze(char c) {
        this.zzb5.append(c);
        return this;
    }

    @Override // com.aspose.words.internal.zzFM
    public final int getLength() {
        return this.zzb5.length();
    }

    @Override // com.aspose.words.internal.zzFM
    public final void setLength(int i) {
        this.zzb5.setLength(i);
    }

    @Override // com.aspose.words.internal.zzFM
    public final zzFM zz9(int i, int i2) {
        return zzZy(i, i2);
    }

    @Override // com.aspose.words.internal.zzFM
    public final zzFO zzEI() {
        return zzZXQ.zzWW(this.zzb5.toString());
    }

    @Override // com.aspose.words.internal.zzFM
    public final zzHG zzW9(int i) {
        return zzST(i);
    }

    @Override // com.aspose.words.internal.zzFM
    public final zzFM zzY(int i, char c, zzHG zzhg) {
        return zzT(i, c);
    }

    @Override // com.aspose.words.internal.zzFM
    public final zzFM zzZ(zzHG zzhg) {
        return zzZ((zzZXU) zzhg);
    }

    @Override // com.aspose.words.internal.zzFM
    public final zzFM zzz(String str, String str2) {
        return zz9(str, str2);
    }

    public zzZXO(int i) {
        this(new StringBuilder(i));
    }

    private zzZXO zz9(String str, String str2) {
        zzZNH.zzZ(this.zzb5, str, str2);
        return this;
    }

    @Override // com.aspose.words.internal.zzFM
    public final zzFM zzZ(char c, zzHG zzhg) {
        return zze(c);
    }

    public zzZXO(StringBuilder sb) {
        this.zzb5 = sb;
    }

    @Override // com.aspose.words.internal.zzFM
    public final zzFM zzZ(int i, zzHG zzhg) {
        return zzV('0', i);
    }

    @Override // com.aspose.words.internal.zzFM
    public final zzFM zzZ(String str, zzHG zzhg) {
        return zzWV(str);
    }

    @Override // com.aspose.words.internal.zzFM
    public final zzFM zzZ(int i, char c, zzHG zzhg) {
        return zzU(i, c);
    }

    @Override // com.aspose.words.internal.zzFM
    public final zzFM zzZ(String str, int i, ArrayList<zzHG> arrayList) {
        return zzZ(0, str, i);
    }

    private zzZXO zzZ(zzZXU zzzxu) {
        this.zzb5.append(zzzxu.zzqe());
        return this;
    }

    private zzZXO zzZ(int i, String str, int i2) {
        zzZNH.zzZ(this.zzb5, 0, str, i2);
        return this;
    }
}
