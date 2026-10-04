package com.aspose.words.internal;

import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes5.dex */
final class zzZT5 implements zzG8 {
    private zzZT3 zzqZ;
    private zzZTY zzr0;
    private float zzvB = Float.MAX_VALUE;
    private float zzvA = Float.MAX_VALUE;
    private float zzjo = -3.4028235E38f;
    private float zzjp = -3.4028235E38f;

    public static class zzZ implements zzH6 {
        public static zzZ zz6B = new zzZ();

        private zzZ() {
        }

        @Override // com.aspose.words.internal.zzH6
        public final zzH6 zzFE() {
            return this;
        }

        @Override // com.aspose.words.internal.zzH6
        public final zzF8 zzFF() {
            return zzZWM.zz8Q;
        }

        @Override // com.aspose.words.internal.zzH6
        public final zzH3 zzFG() {
            return zzZT4.zzmF();
        }

        @Override // com.aspose.words.internal.zzH6
        public final zzF4 zzHq() {
            return zz7M.zznW;
        }
    }

    private zzZT5(zzA1 zza1) {
        this.zzr0 = new zzZTY(zza1.zzAg(), this);
        this.zzqZ = new zzZT3(zza1);
    }

    private zzGC zzMK() {
        return this.zzqZ.zzMK();
    }

    private void zzN(long[] jArr) {
        float fZzmG = zzmG();
        zzMK().zzFt().zzZ(jArr);
        for (long j : jArr) {
            zzY(j, fZzmG);
        }
    }

    private void zzO(long[] jArr) {
        for (long j : jArr) {
            zzY(j, 0.0f);
        }
    }

    private void zzRO(int i) {
        zzd(((zz8O) this.zzqZ.zzFk().zzWd(i)).zzZj());
    }

    private void zzY(long j, float f) {
        int i = (int) j;
        this.zzvB = Math.min(this.zzvB, Float.intBitsToFloat(i) - f);
        this.zzvA = Math.min(this.zzvA, zzZPY.zzYC(j) - f);
        this.zzjo = Math.max(this.zzjo, Float.intBitsToFloat(i) + f);
        this.zzjp = Math.max(this.zzjp, zzZPY.zzYC(j) + f);
    }

    private void zzYT(long j) {
        long[] jArr = {j};
        zzMK().zzFt().zzZ(jArr);
        zzY(jArr[0], zzmG());
    }

    public static zzZQ4 zzZ(zz8T zz8t, long j) throws Exception {
        zzZT5 zzzt5 = new zzZT5(new zzA1(zz8t, zzZ.zz6B, false, j));
        zzzt5.zzr0.play();
        return zzZQ4.zzX(zzzt5.zzvB, zzzt5.zzvA, zzzt5.zzjo, zzzt5.zzjp);
    }

    private void zzd(zzZQ4 zzzq4) {
        zzN(new long[]{zzZPY.zzG(zzzq4.getX(), zzzq4.getY()), zzZPY.zzG(zzzq4.getWidth() + zzzq4.getX(), zzzq4.getHeight() + zzzq4.getY())});
    }

    private float zzmG() {
        zzOU zzouZzZ2 = zzMK().zzZ2();
        if (zzouZzZ2 != null) {
            return zzouZzZ2.getWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void zzx(zzP8 zzp8) throws Exception {
        zzd(zzP6.zzS(zzp8));
    }

    @Override // com.aspose.words.internal.zzG8
    public final boolean zzMO() throws Exception {
        switch (this.zzr0.zzmO().getType()) {
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3 /* 298 */:
                zzRO(((zzZUA) this.zzr0.zzmO().zzmM()).zzmQ());
                break;
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3 /* 299 */:
                zzRO(((zzZU2) this.zzr0.zzmO().zzmM()).zzmQ());
                break;
            case 524:
                zzZTB zzztb = (zzZTB) this.zzr0.zzmO().zzmM();
                if (!zzZPW.zzYF(zzztb.getSize())) {
                    this.zzvB = 0.0f;
                    this.zzvA = 0.0f;
                    this.zzjo = Math.abs(Float.intBitsToFloat((int) zzztb.getSize()));
                    this.zzjp = Math.abs(zzZPW.zzYz(zzztb.getSize()));
                    return false;
                }
                break;
            case 531:
                zzZ((zzZU9) this.zzr0.zzmO().zzmM());
                break;
            case 552:
                zzRO(((zzZUD) this.zzr0.zzmO().zzmM()).zzmQ());
                break;
            case 804:
                zzN(((zzZTV) this.zzr0.zzmO().zzmM()).zzJx());
                break;
            case 805:
                zzN(((zzZTX) this.zzr0.zzmO().zzmM()).zzJx());
                break;
            case EditingLanguage.ROMANIAN /* 1048 */:
                zzd(((zzZUH) this.zzr0.zzmO().zzmM()).zzZj());
                break;
            case 1051:
                zzd(((zzZTT) this.zzr0.zzmO().zzmM()).zzJH());
                break;
            case 1055:
                zzZ((zzZTJ) this.zzr0.zzmO().zzmM());
                break;
            case EditingLanguage.PERSIAN /* 1065 */:
                zzRO(((zzZUC) this.zzr0.zzmO().zzmM()).zzmQ());
                break;
            case 1313:
                zzZ((zzZT8) this.zzr0.zzmO().zzmM());
                break;
            case 1336:
                zzZ(((zzZTW) this.zzr0.zzmO().zzmM()).zzmN());
                break;
            case 1564:
                zzd(((zzZTR) this.zzr0.zzmO().zzmM()).zzZj());
                break;
            case 1565:
                zzd(((zzZU1) this.zzr0.zzmO().zzmM()).zzJH());
                break;
            case 2071:
            case EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO /* 2074 */:
            case 2096:
                zzx(((zzZU0) this.zzr0.zzmO().zzmM()).zzJL());
                break;
            case 2368:
            case 2881:
            case 3907:
                zzd(zzZQ4.zzN(((zzZUL) this.zzr0.zzmO().zzmM()).zzJN()));
                break;
            case 2610:
                zzZ((zzZUE) this.zzr0.zzmO().zzmM());
                break;
        }
        this.zzqZ.zzZ(this.zzr0.zzmO());
        return true;
    }

    private void zzZ(zzZU9 zzzu9) {
        zzYT(zzMK().zzFn());
        zzYT(zzzu9.zzYK());
    }

    private void zzZ(zzZT8 zzzt8) throws Exception {
        zzZ(zzzt8.zzZT(), zzzt8.zzY(zzMK().zzZr(), zzMK().zzFs().zzQ(zzMK().zzZr()), zzMK().zzFp(), this.zzqZ.zzKp().zzMk(), this.zzqZ.zzKp().zzAt().zzFF()), null, false);
    }

    private void zzZ(zzZUE zzzue) throws Exception {
        zzZ(zzzue.zzZT(), zzzue.zzY(zzMK().zzZr(), zzMK().zzFs().zzQ(zzMK().zzZr()), zzMK().zzFp(), this.zzqZ.zzKp().zzMk(), this.zzqZ.zzKp().zzAt().zzFF()), zzzue.zzmS() ? zzP8.zzM(zzzue.zzJH()) : null, zzzue.zzmT() != null);
    }

    private void zzZ(long j, zz8N zz8n, zzP8 zzp8, boolean z) throws Exception {
        if (zzMK().zzFr()) {
            j = zzMK().zzFn();
        }
        zzO(zz8M.zzZ(this.zzqZ, zz8n, j, z, zzp8).zzyA());
    }

    private void zzZ(zzZTJ zzztj) {
        zzYT(zzztj.getPosition());
    }

    private void zzZ(long[][] jArr) {
        for (long[] jArr2 : jArr) {
            zzN(jArr2);
        }
    }
}
