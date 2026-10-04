package com.aspose.words.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class zzPN {
    private static zzPT zzHP;

    public static zzPT zzO(zzPV zzpv) {
        return zzPT.zzZ(new zzPT(new float[][]{new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 1.0f, 0.0f}, new float[]{zzpv.zzPC() / 255.0f, zzpv.zzPB() / 255.0f, zzpv.zzPA() / 255.0f, 0.0f, 1.0f}}), zzY8(zzpv.zzPD()));
    }

    public static zzPT zzPn() {
        return new zzPT(new float[][]{new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 1.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 255.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f}});
    }

    public static zzPT zzPo() {
        if (zzHP == null) {
            zzHP = new zzPT(new float[][]{new float[]{0.2125f, 0.2125f, 0.2125f, 0.0f, 0.0f}, new float[]{0.7154f, 0.7154f, 0.7154f, 0.0f, 0.0f}, new float[]{0.0721f, 0.0721f, 0.0721f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 1.0f, 0.0f}, new float[]{1.0E-7f, 1.0E-7f, 1.0E-7f, 0.0f, 1.0f}});
        }
        return zzHP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [void] */
    public static zzPT zzX(float f, float f2) {
        float fMin = f < 0.5f ? f * 2.0f : f > 0.99f ? 500.0f : Math.min((((float) Math.tan(((double) (f - 0.5f)) * 3.141592653589793d)) * 1.1f) + 1.0f, 500.0f);
        ?? PutByteArray = Bundle.putByteArray(f2, 1065353216);
        return new zzPT(new float[][]{new float[]{fMin, 0.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, fMin, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, fMin, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 1.0f, 0.0f}, new float[]{PutByteArray, PutByteArray, PutByteArray, 0, 1065353216}});
    }

    public static zzPT zzY8(int i) {
        return new zzPT(new float[][]{new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 1.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, i / 255.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f}});
    }

    public static zzPT zzX(zzPV zzpv, zzPV zzpv2) {
        return new zzPT(new float[][]{new float[]{(zzpv2.zzPC() - zzpv.zzPC()) / 255.0f, 0.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, (zzpv2.zzPB() - zzpv.zzPB()) / 255.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, (zzpv2.zzPA() - zzpv.zzPA()) / 255.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 1.0f, 0.0f}, new float[]{zzpv.zzPC() / 255.0f, zzpv.zzPB() / 255.0f, zzpv.zzPA() / 255.0f, 0.0f, 1.0f}});
    }
}
