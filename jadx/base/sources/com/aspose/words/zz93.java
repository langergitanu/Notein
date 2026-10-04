package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zz93 extends zz80 {
    private int zzL4 = 2;
    private HashMap<String, String> zzZ5A;
    private zz93 zzZ5B;
    private zz3E zzZ5C;
    private zz1U zzZ5D;
    private zz11 zzZ5E;
    private zz5A zzZ5F;
    private HashMap<String, String> zzZ5z;
    private zz5A zzZ7k;

    public final int getType() {
        return this.zzL4;
    }

    public final void setType(int i) {
        this.zzL4 = i;
    }

    public final void zzI(zz93 zz93Var) {
        this.zzZ5B = zz93Var;
    }

    public final void zzO(zz5A zz5a) {
        this.zzZ5F = zz5a;
    }

    public final void zzX(zz11 zz11Var) {
        this.zzZ5E = zz11Var;
    }

    public final void zzZ(zz5A zz5a) {
        this.zzZ7k = zz5a;
    }

    public final Map<String, String> zzZCU() {
        if (this.zzZ5z == null) {
            this.zzZ5z = new HashMap<>();
        }
        return this.zzZ5z;
    }

    public final Map<String, String> zzZCV() {
        if (this.zzZ5A == null) {
            this.zzZ5A = new HashMap<>();
        }
        return this.zzZ5A;
    }

    public final zz93 zzZCW() {
        return this.zzZ5B;
    }

    public final zz3E zzZCX() {
        return this.zzZ5C;
    }

    public final zz1U zzZCY() {
        return this.zzZ5D;
    }

    public final zz11 zzZCZ() {
        return this.zzZ5E;
    }

    public final zz5A zzZD0() {
        return this.zzZ5F;
    }

    public final zz5A zzZEC() {
        return this.zzZ7k;
    }

    public final void zzZ(zz1U zz1u) {
        this.zzZ5D = zz1u;
    }

    public final void zzZ(zz3E zz3e) {
        this.zzZ5C = zz3e;
    }
}
