package com.aspose.words;

import com.aspose.slides.C22213OooOoOO;
import com.google.common.primitives.SignedBytes;

/* JADX INFO: loaded from: classes6.dex */
final class zzY75 {
    public static TabStopCollection zzZ(com.aspose.words.internal.zzZOX zzzox, TabStopCollection tabStopCollection, boolean z, IWarningCallback iWarningCallback) throws Exception {
        int[] iArr;
        int i;
        tabStopCollection.zzPK(z);
        int i2 = zzzox.readByte() & 255;
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr2[i3] = zzzox.zzXa();
        }
        if (z) {
            iArr = new int[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                iArr[i4] = zzzox.zzXa();
            }
        } else {
            iArr = null;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            TabStop tabStop = new TabStop(iArr2[i5], 7, 0);
            if (z) {
                tabStop.zzks(iArr[i5]);
            }
            tabStopCollection.add(tabStop);
        }
        int i6 = zzzox.readByte() & 255;
        int[] iArr3 = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            iArr3[i7] = zzzox.zzXa();
        }
        byte[] bArr = new byte[i6];
        com.aspose.words.internal.zzZOP zzzopZzq = zzzox.zzq();
        zzzopZzq.read(bArr, 0, Math.min(i6, (int) (zzzopZzq.getLength() - zzzopZzq.getPosition())));
        for (int i8 = 0; i8 < i6; i8++) {
            if (i8 <= 0 || (i = iArr3[i8]) > iArr3[i8 - 1]) {
                int i9 = iArr3[i8];
                byte b = bArr[i8];
                TabStop tabStop2 = new TabStop(i9, b & 7, (b & 56) >> 3);
                if (tabStop2.getAlignment() == 5) {
                    zzY1Z.zzZ(iWarningCallback, 10, "Invalid tab stop alignment type read, used defaults.", new Object[0]);
                    tabStop2.setAlignment(0);
                }
                tabStop2.zzPL((bArr[i8] & SignedBytes.MAX_POWER_OF_TWO) != 0);
                tabStopCollection.add(tabStop2);
            } else {
                zzY1Z.zzZ(iWarningCallback, 10, "Invalid tab stop position {0}, ignored.", Integer.valueOf(i));
            }
        }
        return tabStopCollection;
    }

    public static void zzZ(TabStopCollection tabStopCollection, zzY9I zzy9i) throws Exception {
        if (tabStopCollection.getCount() == 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < tabStopCollection.getCount(); i3++) {
            if (tabStopCollection.get(i3).isClear()) {
                i2++;
            } else {
                i++;
            }
        }
        boolean zZzY0s = tabStopCollection.zzY0s();
        zzy9i.zzJ((short) (zZzY0s ? 50709 : 50701));
        int i4 = i2 * 2;
        int i5 = i4 + 1;
        if (!zZzY0s) {
            i4 = 0;
        }
        zzy9i.writeByte((byte) C22213OooOoOO.OooO0O0(i, 2, i5 + i4 + 1, i));
        zzy9i.writeByte((byte) i2);
        for (int i6 = 0; i6 < tabStopCollection.getCount(); i6++) {
            if (tabStopCollection.get(i6).isClear()) {
                zzy9i.zzK((short) tabStopCollection.zzkq(i6));
            }
        }
        if (zZzY0s) {
            for (int i7 = 0; i7 < tabStopCollection.getCount(); i7++) {
                TabStop tabStop = tabStopCollection.get(i7);
                if (tabStop.isClear()) {
                    zzy9i.zzK((short) tabStop.zzY0D());
                }
            }
        }
        zzy9i.writeByte((byte) i);
        for (int i8 = 0; i8 < tabStopCollection.getCount(); i8++) {
            if (!tabStopCollection.get(i8).isClear()) {
                zzy9i.zzK((short) tabStopCollection.zzkq(i8));
            }
        }
        for (int i9 = 0; i9 < tabStopCollection.getCount(); i9++) {
            TabStop tabStop2 = tabStopCollection.get(i9);
            if (!tabStop2.isClear()) {
                zzy9i.writeByte((byte) ((tabStop2.zzY0C() ? 64 : 0) | tabStop2.getAlignment() | (tabStop2.getLeader() << 3)));
            }
        }
    }
}
