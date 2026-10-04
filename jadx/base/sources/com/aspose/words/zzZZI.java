package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZI {
    private static int zzY(com.aspose.words.internal.zzZOW zzzow, zzZK1 zzzk1) throws Exception {
        zzYMX zzymxZzZYj = zzzk1.zzZYj();
        int i = (zzZ(zzzow, zzymxZzZYj, 1592) ? 1 : 0) | (zzZ(zzzow, zzymxZzZYj, 1593) ? 2 : 0) | (zzZ(zzzow, zzymxZzZYj, 1594) ? 4 : 0) | (zzZ(zzzow, zzymxZzZYj, 1595) ? 8 : 0) | (zzZ(zzzow, zzymxZzZYj, 1360) ? 16 : 0) | (zzZ(zzzow, zzymxZzZYj, 1380) ? 32 : 0) | (zzZ(zzzow, zzymxZzZYj, 1350) ? 64 : 0) | (zzZ(zzzow, zzymxZzZYj, 1370) ? 128 : 0);
        if (zzzk1.zzZ4j() == 0) {
            return i;
        }
        zzzow.zzK((short) zzzk1.zzZ4j());
        return i | 256;
    }

    public static void zzZ(zzZRA zzzra, com.aspose.words.internal.zzZOW zzzow, zzZK0 zzzk0) throws Exception {
        if (zzzk0.getCount() == 0) {
            return;
        }
        zzzra.zzYGC.zzXyT.zzYHK = (int) zzzow.zzq().getPosition();
        zzzow.zzJ((short) zzzk0.getCount());
        for (int i = 0; i < zzzk0.getCount(); i++) {
            zzZ(zzzow, zzzk0.zzA7(i));
        }
        zzzra.zzYGC.zzXyT.zzYHJ = (int) (zzzow.zzq().getPosition() - ((long) zzzra.zzYGC.zzXyT.zzYHK));
    }

    private static void zzZ(com.aspose.words.internal.zzZOW zzzow, zzZK1 zzzk1) throws Exception {
        zzzow.zzl(zzzk1.getId());
        zzzow.zzl(zzzk1.getParentId());
        zzzow.zzl(zzzk1.zzZ4k());
        com.aspose.words.internal.zzZOW zzzow2 = new com.aspose.words.internal.zzZOW(new com.aspose.words.internal.zzZOR());
        int iZzY = zzY(zzzow2, zzzk1);
        zzzow.zzJ((short) iZzY);
        if (iZzY != 0) {
            zzzow.zzJ((short) zzzow2.zzq().getLength());
            zzzow.writeBytes(((com.aspose.words.internal.zzZOR) zzzow2.zzq()).zzWy());
        }
    }

    private static boolean zzZ(com.aspose.words.internal.zzZOW zzzow, zzYMX zzymx, int i) throws Exception {
        Object objZzPk = zzymx.zzPk(i);
        if (objZzPk == null) {
            return false;
        }
        if (objZzPk instanceof Border) {
            zzXY.zzY((Border) objZzPk, zzzow, true);
        } else {
            zzzow.zzl(((Integer) objZzPk).intValue());
        }
        return true;
    }
}
