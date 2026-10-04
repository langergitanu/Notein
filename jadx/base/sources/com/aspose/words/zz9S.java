package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz9S extends zz9W {
    public zz9S(zzAL zzal, zz93 zz93Var, zz6C zz6c) {
        super(zzal, zz93Var, zz6c);
    }

    private static int zzJ3(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 7;
        }
        if (i == 4) {
            return 8;
        }
        if (i == 5) {
            return 9;
        }
        throw new IllegalStateException("Unexpected point type.");
    }

    private ArrayList<zz93> zzL(zz93 zz93Var) {
        zz6C zz6c = new zz6C();
        zz6c.zzw(new int[]{8, 2});
        zz6c.zzX(new boolean[]{false, true});
        zz6c.zzv(new int[]{0, zzJ3(zz93Var.getType())});
        zz6c.zzu(new int[]{1, 1});
        zz6c.zzs(new int[]{1, 1});
        zz6c.zzt(new int[]{0, 0});
        return this.zzZ6l.zzZ(zz6c, zz93Var);
    }

    public final int zzXq(boolean z) {
        ArrayList<zz93> arrayListZzZEa = zzZEa();
        if (arrayListZzZEa.size() == 0) {
            return 0;
        }
        zz93 zz93Var = arrayListZzZEa.get(0);
        ArrayList<zz93> arrayListZzL = zzL(zz93Var);
        if (arrayListZzL.size() == 0) {
            return 0;
        }
        for (int i = 0; i < arrayListZzL.size(); i++) {
            if (arrayListZzL.get(i) == zz93Var) {
                return z ? arrayListZzL.size() - i : i + 1;
            }
        }
        return 0;
    }
}
