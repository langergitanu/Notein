package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz8C implements zzG6 {
    private zzZYV<zz8E> zzot;
    private zz8J zzou;
    private zzJ8 zzov;
    private zzIY zzow;
    private zzP9 zzox;
    private long zzoy;
    private zz8T zzr4;
    private zzH6 zzrj;
    private zzXN zzwc;

    public zz8C(zz8T zz8t, long j, zzH6 zzh6) {
        this.zzoy = 0L;
        this.zzr4 = zz8t;
        this.zzrj = zzh6;
        this.zzoy = zzZx(j);
        this.zzox = zzP9.zzZ(zzZQ4.zzN(this.zzr4.zzyQ()), new zzZQ4(0L, zzZPX.zzYA(this.zzoy)));
    }

    private void zzGY() {
        zzIY zziy = this.zzow;
        if (zziy != null) {
            zziy.dispose();
            this.zzow = null;
        }
        zzXN zzxn = this.zzwc;
        if (zzxn != null) {
            zzxn.dispose();
            this.zzwc = null;
        }
    }

    private void zzJ(zzZL zzzl) throws Exception {
        zzy4();
        zzG zzg = new zzG();
        zzg.zzW(this.zzox);
        zzg.zzX(zzzl);
        this.zzov.zzZ(zzg, this.zzow);
    }

    private static boolean zzUE(int i) {
        switch (i) {
            case 4457256:
            case 6684742:
            case 8913094:
            case 12255782:
            case 15597702:
                return true;
            default:
                return false;
        }
    }

    private static zz8E zzV(zzZQ4 zzzq4, int i) {
        zz8E zz8e = new zz8E();
        zz8e.setAction(0);
        zz8e.zzo(zzzq4);
        zz8e.zzUH(i);
        zz8e.zzZP(true);
        return zz8e;
    }

    private zz8E zzW(zzZQ4 zzzq4, int i) {
        zzZYV<zz8E> zzzyv = this.zzot;
        return zzzyv == null ? zzV(zzzq4, i) : zzzyv.zzW(i, zzV(zzzq4, i));
    }

    private static long zzZx(long j) {
        int iMax = Math.max((int) j, 50);
        int iMax2 = Math.max((int) (j >>> 32), 50);
        while (zzEF.zz6(iMax, iMax2)) {
            iMax /= 2;
            iMax2 /= 2;
        }
        return zzZPX.zzZm(iMax, iMax2);
    }

    private zzZQ5 zzn(zzZQ4 zzzq4) {
        return zz8I.zzZ(zzzq4, this.zzox, this.zzoy);
    }

    private void zzy3() throws Exception {
        zzJ(this.zzou.zzMN());
        this.zzou.zzMM();
    }

    private void zzy4() {
        if (this.zzwc != null) {
            return;
        }
        long j = this.zzoy;
        this.zzwc = new zzXN((int) j, (int) (j >>> 32), 72.0f, 72.0f);
        this.zzow = new zzIY(this.zzwc);
        zzA6 zza6 = new zzA6(this.zzrj.zzFE());
        zza6.setRenderingMode(2);
        zzIX zzix = new zzIX();
        zzix.zzGE();
        zzix.zzY(3);
        zzix.zzZ(5);
        zzix.zzX(3);
        this.zzov = new zzJ8(zz7M.zznW, zza6, zzix);
    }

    @Override // com.aspose.words.internal.zzZOY
    public void dispose() {
        zzGY();
    }

    @Override // com.aspose.words.internal.zzGF
    public final void zzM(zzZL zzzl) throws Exception {
        this.zzou.zzM(zzzl);
    }

    @Override // com.aspose.words.internal.zzGF
    public final void zzMM() {
        this.zzou.zzMM();
        zzXN zzxn = this.zzwc;
        if (zzxn == null) {
            return;
        }
        int width = zzxn.getWidth();
        int height = this.zzwc.getHeight();
        this.zzow.dispose();
        this.zzwc.dispose();
        this.zzwc = new zzXN(width, height);
        this.zzow = new zzIY(this.zzwc);
    }

    @Override // com.aspose.words.internal.zzGF
    public final void zzN(zzZL zzzl) throws Exception {
        this.zzou.zzN(zzzl);
    }

    @Override // com.aspose.words.internal.zzG6
    public final void zzT(zzZYV<zz8E> zzzyv) {
        this.zzot = zzzyv;
    }

    @Override // com.aspose.words.internal.zzG6
    public final void zzZ(zzGE zzge, zzG4 zzg4) {
        this.zzou = new zz8J(zzZQ4.zzN(this.zzr4.zzyQ()), zzge, zzg4);
    }

    @Override // com.aspose.words.internal.zzG6
    public final zzZP zzZ(zz85 zz85Var, zzZQ4 zzzq4, int i) throws Exception {
        zz8E zz8eZzW = zzW(zzzq4, i);
        int action = zz8eZzW.getAction();
        if (action == 0) {
            zzZ(zz85Var, zzzq4);
            return zzZ(zz8eZzW);
        }
        if (action == 1) {
            zzZ(zz85Var, zzzq4);
            return null;
        }
        if (action != 3) {
            return null;
        }
        zzJ(zz8eZzW.zzyd());
        return zz8eZzW.zzyd();
    }

    @Override // com.aspose.words.internal.zzG6
    public final zzZP zzZ(zzZG zzzg, int i, int i2) throws Exception {
        zzZQ4 zzzq4ZzZ = new zzH().zzZ((zzZL) zzzg);
        zz8E zz8eZzW = zzW(zzzq4ZzZ, i2);
        int action = zz8eZzW.getAction();
        if (action == 0) {
            zzZ(zzzg, zzzq4ZzZ, i);
            return zzZ(zz8eZzW);
        }
        if (action == 1) {
            zzZ(zzzg, zzzq4ZzZ, i);
            return null;
        }
        if (action != 3) {
            return null;
        }
        zzJ(zz8eZzW.zzyd());
        return zz8eZzW.zzyd();
    }

    private void zzZ(zzZG zzzg, zzZQ4 zzzq4, int i) throws Exception {
        zzZQ5 zzzq5Zzn = zzn(zzzq4);
        if (zzzq5Zzn.isEmpty()) {
            return;
        }
        zzy4();
        zzy3();
        zzXN zzxnZzZ = zzZ(zzzg, zzzq5Zzn);
        try {
            zz8H.zzY(zzxnZzZ, this.zzwc, zzzq5Zzn, i);
        } finally {
            zzxnZzZ.dispose();
        }
    }

    private zzXN zzZ(zzZG zzzg, zzZQ5 zzzq5) throws Exception {
        zzXN zzxn = new zzXN(zzzq5.getWidth(), zzzq5.getHeight(), 72.0f, 72.0f);
        zzIY zziy = new zzIY(zzxn);
        try {
            zzP9 zzp9ZzZ = zzP9.zzZ(zzZQ4.zzN(zzzq5), new zzZQ4(0.0f, 0.0f, zzxn.getWidth(), zzxn.getHeight()));
            zzzg.zzZO().zzZ(this.zzox, 1);
            zzzg.zzZO().zzZ(zzp9ZzZ, 1);
            this.zzov.zzZ(zzzg, zziy);
            return zzxn;
        } finally {
            zziy.dispose();
        }
    }

    private void zzZ(zz85 zz85Var, zzZQ4 zzzq4) throws Exception {
        zzZQ5 zzzq5Zzn = zzn(zzzq4);
        if (zzzq5Zzn.isEmpty()) {
            return;
        }
        zzy4();
        zzy3();
        zzXN zzxnZzZ = zzZ(zz85Var.zzJZ(), zz85Var.zzJO(), zzzq5Zzn.getSize(), zz85Var.zzJP(), zz85Var.zzy2(), zz85Var.zzy1());
        try {
            zz8H.zzZ(zzxnZzZ, this.zzwc, zzzq5Zzn, zz85Var.zzJP());
            if (zzxnZzZ != null) {
                zzxnZzZ.dispose();
            }
        } finally {
        }
    }

    private static zzXN zzZ(byte[] bArr, zzZQ5 zzzq5, long j, int i, boolean z, boolean z2) throws Exception {
        if (zzUE(i) && bArr != null) {
            try {
                zzXN zzxn = new zzXN(bArr);
                if (zzZ(zzxn, zzzq5, j, z, z2)) {
                    return zzxn;
                }
                try {
                    zzXN zzxn2 = new zzXN((int) j, (int) (j >>> 32), 72.0f, 72.0f);
                    zzxn.zzZ(zzZQ4.zzN(zzzq5), zzxn2, new zzZQ4(0L, zzZPX.zzYA(j)), z, z2);
                    return zzxn2;
                } finally {
                    zzxn.dispose();
                }
            } catch (zzX8 unused) {
            }
        }
        return null;
    }

    private static boolean zzZ(zzXN zzxn, zzZQ5 zzzq5, long j, boolean z, boolean z2) {
        return zzzq5.getX() == 0 && zzzq5.getY() == 0 && zzzq5.getWidth() == zzxn.getWidth() && zzzq5.getHeight() == zzxn.getHeight() && zzZPX.zzD(j, zzzq5.getSize()) && !z && !z2 && zzxn.zzWA();
    }

    private zzZP zzZ(zz8E zz8e) throws Exception {
        zzZQ5 zzzq5Zzn = zzn(zz8e.zzye());
        if (zzzq5Zzn.isEmpty()) {
            return null;
        }
        zzXN zzxn = new zzXN(zzzq5Zzn.getWidth(), zzzq5Zzn.getHeight(), 72.0f, 72.0f);
        try {
            zzZ(zzzq5Zzn, zzxn);
            zzZOR zzzor = new zzZOR();
            try {
                zzxn.zzV(zzzor);
                zzZP zzzp = new zzZP(zz8e.zzye().zzZE(), zz8e.zzye().getSize(), zzzor.zzWy());
                zzzor.close();
                zzxn.dispose();
                return zzzp;
            } catch (Throwable th) {
                zzzor.close();
                throw th;
            }
        } catch (Throwable th2) {
            zzxn.dispose();
            throw th2;
        }
    }

    private void zzZ(zzZQ5 zzzq5, zzXN zzxn) {
        this.zzwc.zzZ(zzZQ4.zzN(zzzq5), zzxn, zzZQ4.zzN(new zzZQ5(0, 0, zzxn.getWidth(), zzxn.getHeight())), false, false);
    }
}
