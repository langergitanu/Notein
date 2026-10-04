package com.aspose.words.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZLZ {
    private String name;
    private zzZN1 zzZSA;
    protected zzZLZ zzZSB;
    protected boolean zzZSC;
    protected zzZOZ zzZSD;
    protected zzZN4 zzZSE;
    protected boolean zzZSF;
    protected int zzZSG;
    private boolean zzZSq;
    private zzZOZ zzZSu;
    protected boolean zzZSv;
    private zzZLZ zzZSw;
    private zzZLZ zzZSx;
    private int zzZSy;
    private String zzZSz;
    private int zzZSt = 256;
    private Map<String, String> zzZSs = new HashMap();
    private zzZLY zzZSr = new zzZLY();

    public final String getId() {
        return this.zzZSz;
    }

    public final String getName() {
        return this.name;
    }

    public final void setId(String str) {
        this.zzZSz = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void zzQu(int i) {
        this.zzZSy = i;
    }

    public final void zzQv(int i) {
        this.zzZSt = i;
    }

    public final boolean zzS(zzZOZ zzzoz) {
        return this.zzZSD == zzzoz;
    }

    public final void zzT(zzZOZ zzzoz) {
        this.zzZSu = zzzoz;
    }

    public final void zzX(zzZLZ zzzlz) {
        this.zzZSB = zzzlz;
    }

    public int zzY(zzZN3 zzzn3) throws Exception {
        return 0;
    }

    public int zzZ(zzZN3 zzzn3) {
        return 0;
    }

    public final void zzZ1(boolean z) {
        this.zzZSC = z;
    }

    public final void zzZL(String str, String str2) {
        if (this.zzZSs.containsKey(str)) {
            return;
        }
        this.zzZSs.put(str, str2);
    }

    public final void zzg3() {
        this.zzZSq = true;
    }

    public final zzZLZ zzg4() {
        return this.zzZSw;
    }

    public final zzZOZ zzg5() {
        return this.zzZSu;
    }

    public final Object zzg6() {
        return this.zzZSB;
    }

    public final boolean zzg7() {
        return this.zzZSv;
    }

    public final zzZN1 zzg8() {
        return this.zzZSA;
    }

    public final int zzg9() {
        return this.zzZSy;
    }

    public zzZN4 zzgQ() {
        if (this.zzZSE == null) {
            this.zzZSE = new zzZN4(this.name);
        }
        return this.zzZSE;
    }

    public final int zzga() {
        return this.zzZSt;
    }

    public final Map<String, String> zzgb() {
        return this.zzZSs;
    }

    public final zzZLY zzgc() {
        return this.zzZSr;
    }

    public final zzZLZ zzgd() {
        return this.zzZSx;
    }

    public void zztF() throws Exception {
    }

    public final void zzY(zzZLZ zzzlz) {
        this.zzZSx = zzzlz;
    }

    public void zzZ(zzZLR zzzlr, zzZQT zzzqt, List<zzZND> list) {
    }

    public final void zzZ(zzZN1 zzzn1) {
        this.zzZSA = zzzn1;
    }

    public void zzZ(zzZLZ zzzlz) {
        this.zzZSw = zzzlz;
    }
}
