package com.aspose.words.internal;

import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes5.dex */
final class zzOV implements zzH2 {
    private boolean zzGx;
    private StringBuilder zzGy;
    private boolean zzGz = false;

    public zzOV() {
    }

    private float zzB(float f) {
        return this.zzGz ? (float) zzSA.pointToPixel(f) : f;
    }

    private void zzW(long[] jArr) {
        this.zzGy.append('C');
        for (int i = 0; i < 3; i++) {
            zzl(jArr[i]);
        }
    }

    private void zzl(long j) {
        zzZNH.zzU(this.zzGy, zzJB.zzq(zzB(Float.intBitsToFloat((int) j))));
        this.zzGy.append(',');
        zzZNH.zzU(this.zzGy, zzJB.zzq(zzB(zzZPY.zzYC(j))));
        this.zzGy.append(ControlChar.SPACE_CHAR);
    }

    private void zzm(long j) {
        this.zzGy.append('L');
        zzl(j);
    }

    private void zzn(long j) {
        this.zzGy.append('M');
        zzl(j);
    }

    public final String zzQ(zzP8 zzp8) throws Exception {
        return zzZ(zzp8, false);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        if (!zzp5.isClosed()) {
            return true;
        }
        this.zzGy.append('Z');
        return true;
    }

    public final String zzZ(zzP8 zzp8, boolean z) throws Exception {
        this.zzGy = new StringBuilder();
        if (zzp8.zzO6() == 1 && z) {
            zzZNH.zzU(this.zzGy, "F 1 ");
        }
        zzp8.zzY(this);
        return this.zzGy.toString();
    }

    public zzOV(byte b) {
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        this.zzGx = true;
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        if (zzos.zzNu().getCount() <= 0) {
            return true;
        }
        for (int i = 0; i < zzos.zzNu().getCount(); i++) {
            if (this.zzGx) {
                zzn(zzos.zzNu().get(0));
                this.zzGx = false;
            } else {
                zzm(zzos.zzNu().get(i));
            }
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        if (this.zzGx) {
            zzn(zzpz.zzPX());
            this.zzGx = false;
        } else {
            zzm(zzpz.zzPX());
        }
        zzW(new long[]{zzpz.zzPL(), zzpz.zzPK(), zzpz.zzPW()});
        return true;
    }
}
