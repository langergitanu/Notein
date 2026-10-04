package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzBV {
    static float[] zzt2 = {-1.5f, 3.0f, 0.0f, 0.0f, 1.5f, 3.0f};
    static float[] zzt1 = {-1.5f, 3.0f, 0.0f, 0.0f, 1.5f, 3.0f, 0.0f, 1.8000001f};
    static float[] zzt0 = {0.0f, -1.5f, 1.5f, 0.0f, 0.0f, 1.5f, -1.5f, 0.0f};
    static float[] zzsZ = {0.65f, 1.0f, 1.68f};
    static long[][] zzsY = {new long[]{zzZPW.zzG(0.7f, 0.75f), zzZPW.zzG(0.7f, 1.1f), zzZPW.zzG(0.7f, 1.6f)}, new long[]{zzZPW.zzG(1.0f, 0.65f), zzZPW.zzG(0.97f, 1.0f), zzZPW.zzG(1.0f, 1.5f)}, new long[]{zzZPW.zzG(1.4f, 0.65f), zzZPW.zzG(1.4f, 0.97f), zzZPW.zzG(1.4f, 1.4f)}};
    static float[][] zzsX = {new float[]{0.0f, -0.3f, 0.6f}, new float[]{0.33f, 0.0f, -0.4f}, new float[]{0.33f, 0.2f, 0.0f}};
    static float[][] zzsW = {new float[]{0.6f, 1.5f, 2.0f}, new float[]{0.6f, 1.0f, 1.4f}, new float[]{0.6f, 0.8f, 1.0f}};

    public static int zzZ(zzOS zzos, boolean z) {
        if (z) {
            return 0;
        }
        return zzos.zzNu().getCount() - 1;
    }

    public static float zzZ(boolean z, zzPF zzpf) {
        zzP7 zzp7 = (zzP7) zzZKW.zzZ(z ? zzpf.zzOB().zzOx() : zzpf.zzOA().zzOx(), zzP7.class);
        if (zzp7 != null) {
            return zzp7.zzO5();
        }
        return 0.0f;
    }
}
