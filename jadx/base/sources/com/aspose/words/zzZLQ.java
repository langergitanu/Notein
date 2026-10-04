package com.aspose.words;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzZLQ implements zzZ8R {
    static boolean zzZD5 = false;
    int zzYuX;
    boolean zzYuY;
    boolean zzYuZ;
    boolean zzYv0;
    int zzYv1;
    int zzYv2;
    int zzYv3;
    int zzYv4;
    boolean zzYv5;
    int zzYv6;
    int zzYv7;
    int zzYv8;
    int zzYv9;
    int zzYva;

    public zzZLQ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYva = zzzox.zzXc();
        this.zzYv9 = zzzox.zzXc();
        this.zzYv8 = zzzox.zzXc();
        this.zzYv7 = zzzox.zzXc();
        this.zzYv6 = zzzox.zzXc();
        short sZzX9 = zzzox.zzX9();
        this.zzYv5 = (sZzX9 & 1) != 0;
        this.zzYv4 = (sZzX9 & 6) >> 1;
        this.zzYv3 = (sZzX9 & 24) >> 3;
        this.zzYv2 = (sZzX9 & 480) >> 5;
        this.zzYv1 = (sZzX9 & 7680) >> 9;
        this.zzYv0 = (sZzX9 & 8192) != 0;
        this.zzYuY = (sZzX9 & Short.MIN_VALUE) != 0;
        this.zzYuX = zzzox.zzXc();
        String str = com.aspose.words.internal.zzZKN.format("(fHdr:{0}, bx: {1}, by: {2}, wr: {3}, wrk: {4}, fRcaSimple: {5}, fAnchorLock: {6})", Boolean.valueOf(this.zzYv5), Integer.valueOf(this.zzYv4), Integer.valueOf(this.zzYv3), Integer.valueOf(this.zzYv2), Integer.valueOf(this.zzYv1), Boolean.valueOf(this.zzYv0), Boolean.valueOf(this.zzYuY));
        if (zzZD5) {
            com.aspose.words.internal.zzZKN.format("Fspa: spid:{0} x{0:X}, cTxbx:{1}, flags:{2}, L:{3}, T:{4}, R:{5}, B:{6}", Integer.valueOf(this.zzYva), Integer.valueOf(this.zzYuX), str, Integer.valueOf(this.zzYv9), Integer.valueOf(this.zzYv8), Integer.valueOf(this.zzYv7), Integer.valueOf(this.zzYv6));
        }
    }

    public final boolean isZero() {
        return this.zzYv9 == 0 && this.zzYv7 == 0 && this.zzYv6 == 0 && this.zzYv8 == 0;
    }

    public final void zzY(ShapeBase shapeBase, boolean z) {
        zzZT3.zzZ(shapeBase, this.zzYv9, this.zzYv7, this.zzYv8, this.zzYv6);
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        zzyc3ZzYvW.zzN(EditingLanguage.ARABIC_LIBYA, Integer.valueOf(this.zzYv2));
        zzyc3ZzYvW.zzN(InputDeviceCompat.SOURCE_TOUCHSCREEN, Integer.valueOf(this.zzYv1));
        zzyc3ZzYvW.zzN(4099, Boolean.valueOf(this.zzYuY));
        zzyc3ZzYvW.zzN(954, Boolean.valueOf(this.zzYuZ));
        if (z) {
            return;
        }
        zzyc3ZzYvW.zzN(912, Integer.valueOf(this.zzYv4));
        zzyc3ZzYvW.zzN(914, Integer.valueOf(this.zzYv3));
    }

    @Override // com.aspose.words.zzZ8R
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(this.zzYva);
        zzzow.zzl(this.zzYv9);
        zzzow.zzl(this.zzYv8);
        zzzow.zzl(this.zzYv7);
        zzzow.zzl(this.zzYv6);
        zzzow.zzJ((short) ((this.zzYv5 ? 1 : 0) | (this.zzYv4 << 1) | (this.zzYv3 << 3) | (this.zzYv2 << 5) | (this.zzYv1 << 9) | (this.zzYv0 ? 8192 : 0) | (this.zzYuZ ? 16384 : 0) | (this.zzYuY ? 32768 : 0)));
        zzzow.zzl(this.zzYuX);
    }

    public zzZLQ(ShapeBase shapeBase) {
        this.zzYva = shapeBase.getId();
        this.zzYv5 = false;
        this.zzYv0 = false;
        zzZT3 zzzt3Zzg = zzZT3.zzg(shapeBase);
        if (shapeBase.getWrapType() != 0) {
            int relativeHorizontalPosition = shapeBase.getRelativeHorizontalPosition();
            this.zzYv4 = relativeHorizontalPosition;
            if (relativeHorizontalPosition > 2) {
                this.zzYv4 = 2;
            }
            int relativeVerticalPosition = shapeBase.getRelativeVerticalPosition();
            this.zzYv3 = relativeVerticalPosition;
            if (relativeVerticalPosition > 2) {
                this.zzYv3 = 2;
            }
            this.zzYv2 = shapeBase.getWrapType();
            this.zzYv1 = shapeBase.getWrapSide();
            this.zzYuZ = shapeBase.getBehindText();
            this.zzYuY = shapeBase.getAnchorLocked();
        } else {
            zzzt3Zzg.zzYJG = 0.0d;
            zzzt3Zzg.zzYJF = 0.0d;
            this.zzYv4 = 2;
            this.zzYv3 = 2;
            this.zzYv2 = 3;
            this.zzYv1 = 0;
            this.zzYuZ = false;
            this.zzYuY = true;
        }
        this.zzYv9 = com.aspose.words.internal.zzSA.zzr(zzzt3Zzg.zzYJG);
        this.zzYv8 = com.aspose.words.internal.zzSA.zzr(zzzt3Zzg.zzYJF);
        this.zzYv7 = com.aspose.words.internal.zzSA.zzr(zzzt3Zzg.zzYJG + zzzt3Zzg.zzYJE);
        this.zzYv6 = com.aspose.words.internal.zzSA.zzr(zzzt3Zzg.zzYJF + zzzt3Zzg.zzYJD);
        this.zzYuX = 0;
    }
}
