package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz03 {
    private static int zzGB(int i) {
        return i >= 9 ? i % 9 : i;
    }

    private static void zzS(com.aspose.words.internal.zzXN zzxn) {
        com.aspose.words.internal.zzXQ zzxqZzWz = zzxn.zzWz();
        int iZzWP = zzxqZzWz.zzWP();
        for (int i = 0; i < iZzWP; i++) {
            zzxqZzWz.zzY(i, (byte) (255 - (zzxqZzWz.zz4(i) & 255)), zzxqZzWz.zz3(i), zzxqZzWz.zz2(i), zzxqZzWz.zz1(i));
        }
        zzxqZzWz.zzWQ();
    }

    public static com.aspose.words.internal.zzG zzY(zz89 zz89Var, byte[] bArr, int i, com.aspose.words.internal.zzPV zzpv, boolean z) throws Exception {
        return zzZ(zz89Var, zzY(bArr, i, zzpv, z));
    }

    public static byte[] zzZ(byte[] bArr, int i, com.aspose.words.internal.zzPV zzpv, boolean z) throws Exception {
        return zzZ(zzY(bArr, i, z, true), zzpv);
    }

    public static byte[] zzu(byte[] bArr, int i) throws Exception {
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(zzY(bArr, i, true, true));
        try {
            zzS(zzxn);
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            try {
                zzxn.zzZ(zzzor, 6);
                return com.aspose.words.internal.zzZYQ.zzZX(zzzor);
            } finally {
                zzzor.close();
            }
        } finally {
            zzxn.dispose();
        }
    }

    public static byte[] zzv(byte[] bArr, int i) throws Exception {
        return zzY(bArr, i, true, true);
    }

    private static byte[] zzY(byte[] bArr, int i, boolean z, boolean z2) throws Exception {
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(bArr);
        int i2 = z2 ? i : i >> 2;
        int i3 = i2 << 1;
        try {
            com.aspose.words.internal.zzXN zzxn2 = new com.aspose.words.internal.zzXN(zzxn.getWidth() + i3, zzxn.getHeight() + i3);
            try {
                zzxn.zzZ(new com.aspose.words.internal.zzZQ5(0, 0, zzxn.getWidth(), zzxn.getHeight()), zzxn2, new com.aspose.words.internal.zzZQ5(i2, i2, zzxn.getWidth(), zzxn.getHeight()));
                if (z && z2) {
                    com.aspose.words.internal.zzXQ zzxqZzWz = zzxn2.zzWz();
                    int iZzWP = zzxqZzWz.zzWP();
                    for (int i4 = 0; i4 < iZzWP; i4++) {
                        zzxqZzWz.zzY(i4, -1, zzxqZzWz.zz4(i4), 0, 0);
                    }
                    zzxqZzWz.zzWQ();
                    zzZ(zzxn2, i);
                    com.aspose.words.internal.zzXQ zzxqZzWz2 = zzxn2.zzWz();
                    int iZzWP2 = zzxqZzWz2.zzWP() - 1;
                    byte bZz4 = zzxqZzWz2.zz4(iZzWP2);
                    for (int i5 = iZzWP2; i5 > 0; i5--) {
                        com.aspose.words.internal.zzXQ zzxq = zzxqZzWz2;
                        zzxq.zzY(i5, zzxqZzWz2.zz3(i5), zzxqZzWz2.zz2(i5), zzxqZzWz2.zz1(i5), zzxqZzWz2.zz4(i5 - 1));
                        zzxqZzWz2 = zzxq;
                    }
                    zzxqZzWz2.zzY(0, zzxqZzWz2.zz3(0), zzxqZzWz2.zz2(0), zzxqZzWz2.zz1(0), bZz4);
                    zzxqZzWz2.zzWQ();
                    com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
                    try {
                        zzxn2.zzZ(zzzor, 6);
                        byte[] bArrZzZX = com.aspose.words.internal.zzZYQ.zzZX(zzzor);
                        zzzor.close();
                        zzxn2.dispose();
                        zzxn.dispose();
                        return bArrZzZX;
                    } catch (Throwable th) {
                        zzzor.close();
                        throw th;
                    }
                }
                com.aspose.words.internal.zzEI zzei = new com.aspose.words.internal.zzEI(zzxn2);
                zzei.zzK(i, true);
                byte[] imageBytes = zzei.getImageBytes();
                zzxn2.dispose();
                zzxn.dispose();
                return imageBytes;
            } catch (Throwable th2) {
                zzxn2.dispose();
                throw th2;
            }
        } catch (Throwable th3) {
            zzxn.dispose();
            throw th3;
        }
    }

    public static com.aspose.words.internal.zzG zzZ(zz89 zz89Var, byte[] bArr, int i, com.aspose.words.internal.zzPV zzpv, boolean z) throws Exception {
        return zzZ(zz89Var, zzZ(bArr, i, zzpv, z));
    }

    public static com.aspose.words.internal.zzG zzZ(zz89 zz89Var, byte[] bArr, int i, com.aspose.words.internal.zzPV zzpv, boolean z, long j) throws Exception {
        byte[] bArrZzZ = zzZ(bArr, zzpv);
        com.aspose.words.internal.zzEI zzei = new com.aspose.words.internal.zzEI(bArrZzZ);
        try {
            zzei.zzDT().zzZ(com.aspose.words.internal.zzPN.zzPn());
            zzei.zzDU();
            com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(zzY(zzei.getImageBytes(), i, z, false));
            try {
                com.aspose.words.internal.zzXN zzxn2 = new com.aspose.words.internal.zzXN(zzxn.getWidth(), zzxn.getHeight());
                try {
                    zzxn.zzZ(new com.aspose.words.internal.zzZQ5(0, 0, zzxn.getWidth(), zzxn.getHeight()), zzxn2, new com.aspose.words.internal.zzZQ5((int) j, (int) (j >> 32), zzxn.getWidth(), zzxn.getHeight()));
                    com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
                    try {
                        zzxn2.zzV(zzzor);
                        byte[] bArrZzWy = zzzor.zzWy();
                        zzxn.dispose();
                        return zzZ(zz89Var, zz1L.zzZ(bArrZzZ, bArrZzWy, true));
                    } finally {
                        zzzor.close();
                    }
                } finally {
                    zzxn2.dispose();
                }
            } catch (Throwable th) {
                zzxn.dispose();
                throw th;
            }
        } finally {
            zzei.dispose();
        }
    }

    public static byte[] zzZ(byte[] bArr, int i, boolean z, boolean z2) throws Exception {
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(bArr);
        try {
            int i2 = i * 2;
            com.aspose.words.internal.zzXN zzxn2 = new com.aspose.words.internal.zzXN(zzxn.getWidth() + i2, zzxn.getHeight() + i2);
            try {
                zzxn.zzZ(new com.aspose.words.internal.zzZQ5(0, 0, zzxn.getWidth(), zzxn.getHeight()), zzxn2, new com.aspose.words.internal.zzZQ5(i, i, zzxn.getWidth(), zzxn.getHeight()));
                int i3 = 1;
                if (z) {
                    if (z2 && i < 10) {
                        i3 = 2;
                    }
                    zzZ(zzxn2, i * i3);
                    com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
                    try {
                        zzxn2.zzZ(zzzor, 6);
                        return com.aspose.words.internal.zzZYQ.zzZX(zzzor);
                    } finally {
                        zzzor.close();
                    }
                }
                zzZ(zzxn2, i / 2);
                com.aspose.words.internal.zzEI zzei = new com.aspose.words.internal.zzEI(zzxn2);
                zzei.zzDT().zzZ(com.aspose.words.internal.zzPN.zzPn());
                zzei.zzDU();
                zzei.zzK(i, true);
                return zzei.getImageBytes();
            } finally {
                zzxn2.dispose();
            }
        } finally {
            zzxn.dispose();
        }
    }

    private static void zzY(com.aspose.words.internal.zzXN zzxn, int i) {
        com.aspose.words.internal.zzXN zzxn2 = new com.aspose.words.internal.zzXN(zzxn.getWidth(), zzxn.getHeight());
        try {
            zzxn.zzZ(new com.aspose.words.internal.zzZQ5(0, 0, zzxn.getWidth(), zzxn.getHeight()), zzxn2, new com.aspose.words.internal.zzZQ5(0, 0, zzxn.getWidth(), zzxn.getHeight()));
            com.aspose.words.internal.zzPJ zzpj = new com.aspose.words.internal.zzPJ();
            zzpj.zzZ(com.aspose.words.internal.zzPN.zzY8(50));
            zzxn2.zzZ(zzpj);
            com.aspose.words.internal.zzZQ5 zzzq5 = new com.aspose.words.internal.zzZQ5(0, 0, zzxn.getWidth(), zzxn.getHeight());
            int i2 = -i;
            com.aspose.words.internal.zzZQ5[] zzzq5Arr = {new com.aspose.words.internal.zzZQ5(i, i, zzxn.getWidth(), zzxn.getHeight()), new com.aspose.words.internal.zzZQ5(i2, i2, zzxn.getWidth(), zzxn.getHeight()), new com.aspose.words.internal.zzZQ5(i, i2, zzxn.getWidth(), zzxn.getHeight()), new com.aspose.words.internal.zzZQ5(i2, i, zzxn.getWidth(), zzxn.getHeight()), new com.aspose.words.internal.zzZQ5(0, 0, zzxn.getWidth(), zzxn.getHeight()), new com.aspose.words.internal.zzZQ5(0, i2, zzxn.getWidth(), zzxn.getHeight()), new com.aspose.words.internal.zzZQ5(0, i, zzxn.getWidth(), zzxn.getHeight()), new com.aspose.words.internal.zzZQ5(i2, 0, zzxn.getWidth(), zzxn.getHeight()), new com.aspose.words.internal.zzZQ5(i, 0, zzxn.getWidth(), zzxn.getHeight())};
            for (int i3 = 0; i3 < 9; i3++) {
                zzxn2.zzZ(zzzq5, zzxn, zzzq5Arr[zzGB(i + i3)]);
            }
        } finally {
            zzxn2.dispose();
        }
    }

    public static byte[] zzZ(byte[] bArr, com.aspose.words.internal.zzPV zzpv) throws Exception {
        com.aspose.words.internal.zzEI zzei = new com.aspose.words.internal.zzEI(bArr);
        try {
            zzei.zzDT().zzZ(com.aspose.words.internal.zzPN.zzO(zzpv));
            zzei.zzDU();
            return zzei.getImageBytes();
        } finally {
            zzei.dispose();
        }
    }

    private static byte[] zzY(byte[] bArr, int i, com.aspose.words.internal.zzPV zzpv, boolean z) throws Exception {
        return zzZ(zzZ(bArr, i, z, false), zzpv);
    }

    private static void zzZ(com.aspose.words.internal.zzXN zzxn, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i3 + 1;
            zzY(zzxn, i3);
            i2 += i4;
            i3 = i4;
        }
        int i5 = i == 2 ? 1 : i - i2;
        if (i5 > 0) {
            zzY(zzxn, i5);
        }
    }

    private static com.aspose.words.internal.zzG zzZ(zz89 zz89Var, byte[] bArr) throws Exception {
        com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(bArr);
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, (float) zzegZzZT.getWidthPoints(), (float) zzegZzZT.getHeightPoints());
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        float scaleFactor = 1.0f / zz89Var.getScaleFactor();
        zzp9.zzZ(scaleFactor, scaleFactor, 0);
        com.aspose.words.internal.zzZQ4 zzzq4ZzO = zzp9.zzO(zzzq4);
        zzp9.zzY(zz89Var.zzZC6().zzZm() - ((zzzq4ZzO.getWidth() - zz89Var.zzZC6().getWidth()) / 2.0f), zz89Var.zzZC6().zzZo() - ((zzzq4ZzO.getHeight() - zz89Var.zzZC6().getHeight()) / 2.0f), 1);
        com.aspose.words.internal.zzZQ4 zzzq4ZzO2 = zzp9.zzO(zzzq4);
        com.aspose.words.internal.zzZP zzzp = new com.aspose.words.internal.zzZP(zzzq4ZzO2.zzZE(), zzzq4ZzO2.getSize(), bArr);
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzW(new com.aspose.words.internal.zzP9());
        zzg.zzX(zzzp);
        return zzg;
    }
}
