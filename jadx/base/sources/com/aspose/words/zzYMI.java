package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMI {
    public static void zzY(zzYBL zzybl, boolean z) throws Exception {
        zzybl.zzQP(false);
        if (!zzybl.isActive() || zzybl.isEmpty()) {
            return;
        }
        zzY1W zzy1w = new zzY1W();
        zzZ7D zzz7d = new zzZ7D();
        zzZ7C zzz7c = new zzZ7C();
        zzY0N zzy0n = new zzY0N();
        while (zzz7c.zzZ(zzybl, z) | zzz7d.zzZ(zzybl, z) | zzy1w.zzZ(zzybl, z)) {
        }
        if (zzy0n.zzZ(zzybl, z)) {
            zzy1w.zzZ(zzybl, z);
        }
    }
}
