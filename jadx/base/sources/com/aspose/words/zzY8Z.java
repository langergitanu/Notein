package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzY8Z {
    private void zzW(com.aspose.words.internal.zzZOX zzzox, boolean z) throws Exception {
        zzZ(new String(zzZZR.zzZ(zzzox, z, z ? zzzox.zzXa() : zzzox.readByte() & 255)), zzzox);
    }

    public final void zz7(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int iZzX9 = zzzox.zzX9() & 65535;
        boolean z = iZzX9 == 65535;
        if (z) {
            iZzX9 = zzzox.zzXc();
        }
        zzzox.zzXa();
        for (int i = 0; i < iZzX9; i++) {
            zzW(zzzox, z);
        }
    }

    public abstract void zzH(com.aspose.words.internal.zzZOW zzzow) throws Exception;

    public final void zzT(com.aspose.words.internal.zzZOX zzzox, int i, int i2) throws Exception {
        if (i2 == 0) {
            return;
        }
        zzzox.zzq().zzH(i);
        int iZzX9 = zzzox.zzX9() & 65535;
        boolean z = iZzX9 == 65535;
        if (z) {
            iZzX9 = zzzox.zzXa();
        }
        int i3 = (iZzX9 != 0 || zzzox.zzXa() <= 0) ? iZzX9 : 1;
        int i4 = i + i2;
        for (int i5 = 0; i5 < i3 && zzzox.zzq().getPosition() < i4; i5++) {
            zzW(zzzox, z);
        }
    }

    public final void zzU(com.aspose.words.internal.zzZOX zzzox, int i, int i2) throws Exception {
        if (i2 == 0) {
            return;
        }
        zzzox.zzq().zzH(i);
        int iZzXa = zzzox.zzXa() + i;
        while (zzzox.zzq().getPosition() < iZzXa) {
            zzW(zzzox, false);
        }
    }

    public final int zzX(com.aspose.words.internal.zzZOW zzzow, boolean z) throws Exception {
        int iZzY3A = zzY3A();
        if (iZzY3A == 0 && !z) {
            return 0;
        }
        long position = zzzow.zzq().getPosition();
        zzzow.zzJ((short) -1);
        if (z) {
            zzzow.zzl(iZzY3A);
        } else {
            zzzow.zzK((short) iZzY3A);
        }
        zzzow.zzK((short) zzY3z());
        zzH(zzzow);
        return (int) (zzzow.zzq().getPosition() - position);
    }

    public abstract int zzY3A();

    public abstract int zzY3z();

    public abstract void zzZ(String str, com.aspose.words.internal.zzZOX zzzox) throws Exception;

    public static void zzW(String str, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzZZQ.zzZ(str, Integer.MAX_VALUE, zzzow, true, false);
    }
}
