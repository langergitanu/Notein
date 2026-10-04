package com.aspose.words.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
final class zz06 {
    private int zzdF;
    private zz03 zzdG;
    private zz02 zzdH;
    private zzZZX zzdI;
    private zzER<String> zzdE = new zzER<>();
    private HashMap<String, zz05> zziT = new HashMap<>();

    public zz06(zzZZX zzzzx, zz02 zz02Var) {
        this.zzdI = zzzzx;
        this.zzdH = zz02Var;
    }

    private zz03 zzs3() {
        if (this.zzdG == null) {
            this.zzdG = new zz03(this);
        }
        return this.zzdG;
    }

    public final void zz1(zzZOP zzzop) throws Exception {
        int size = this.zziT.size();
        String[] strArr = new String[size];
        zzZQG.zzZ(this.zziT.keySet(), strArr);
        zzZKV.zzP(strArr);
        for (int i = 0; i < size; i++) {
            this.zziT.get(strArr[i]).zz0(zzzop);
        }
    }

    public final zz05 zzQ(zzZXH zzzxh) {
        zz05 zz05Var = (zz05) zzQW.zzZ(this.zziT, zzzxh.zzpw());
        if (zz05Var != null) {
            return zz05Var;
        }
        zz05 zz05Var2 = new zz05(zzzxh);
        zzZQF.zzY(this.zziT, zzzxh.zzpw(), zz05Var2);
        return zz05Var2;
    }

    public final String zzT(byte[] bArr, zzEP zzep) throws Exception {
        String strZzY = this.zzdE.zzY(bArr, zzep);
        if (zzZYD.zzXk(strZzY)) {
            return strZzY;
        }
        String strZzZ = zzs3().zzZ(zzW.zzZ(this, bArr, zzep));
        this.zzdE.zzZ(bArr, zzep, strZzZ);
        return strZzZ;
    }

    public final zz02 zzs1() {
        return this.zzdH;
    }

    public final zzZZX zzs2() {
        return this.zzdI;
    }

    public final int zzs4() {
        int i = this.zzdF;
        this.zzdF = i + 1;
        return i;
    }
}
