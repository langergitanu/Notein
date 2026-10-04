package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZJ {
    private static zzZK1 zzE(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzZK1 zzzk1 = new zzZK1(zzzox.zzXc());
        zzzk1.setParentId(zzzox.zzXc());
        zzzk1.zzAa(zzzox.zzXc());
        short sZzXa = zzzox.zzXa();
        if (sZzXa != 0) {
            zzzox.zzXa();
            zzzox.zzq().getPosition();
            if ((sZzXa & 1) != 0) {
                zzzk1.zzZYj().zzQ(1592, Integer.valueOf(zzzox.zzXc()));
            }
            if ((sZzXa & 2) != 0) {
                zzzk1.zzZYj().zzQ(1593, Integer.valueOf(zzzox.zzXc()));
            }
            if ((sZzXa & 4) != 0) {
                zzzk1.zzZYj().zzQ(1594, Integer.valueOf(zzzox.zzXc()));
            }
            if ((sZzXa & 8) != 0) {
                zzzk1.zzZYj().zzQ(1595, Integer.valueOf(zzzox.zzXc()));
            }
            if ((sZzXa & 16) != 0) {
                zzzk1.zzZYj().zzQ(1360, zzXY.zzW(zzzox, null));
            }
            if ((sZzXa & 32) != 0) {
                zzzk1.zzZYj().zzQ(1380, zzXY.zzW(zzzox, null));
            }
            if ((sZzXa & 64) != 0) {
                zzzk1.zzZYj().zzQ(1350, zzXY.zzW(zzzox, null));
            }
            if ((sZzXa & 128) != 0) {
                zzzk1.zzZYj().zzQ(1370, zzXY.zzW(zzzox, null));
            }
            if ((sZzXa & 256) != 0) {
                zzzk1.zzA9(zzzox.zzXa());
            }
            if (zzzk1.zzZ4j() == 8) {
                zzzk1.zzA9(0);
            }
            zzzox.zzq().getPosition();
        }
        return zzzk1;
    }

    public static void zzZ(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox, zzZK0 zzzk0) throws Exception {
        if (zzzra.zzYGC.zzXyT.zzYHJ == 0) {
            return;
        }
        zzzox.zzq().zzH(r3.zzYHK);
        short sZzXa = zzzox.zzXa();
        for (int i = 0; i < sZzXa; i++) {
            zzzk0.zzZ(zzE(zzzox));
        }
    }
}
