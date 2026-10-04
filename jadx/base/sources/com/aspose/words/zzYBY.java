package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBY extends zzY9C {
    private zzY9X zzXmv;

    public static class zzZ extends zzY9A {
        public zzZ(zzYBY zzyby) {
            super(zzyby);
        }

        @Override // com.aspose.words.zzY9A
        public final void zzJ(zzYMD zzymd) throws Exception {
            zzYC4 zzyc4 = (zzYC4) zzymd;
            zzYMD.zzr(zzyc4);
            new zzYBK().zzZ((zzYBL) zzyc4, zzyc4.zzYo1() == null ? 1073741823 : zzyc4.getHeight(), true, false);
            zzyc4.zzYU(true);
            zzYMD.zzq(zzyc4);
        }
    }

    public zzYBY(zzY9X zzy9x) {
        super(zzy9x.zzab());
        this.zzXmv = zzy9x;
    }

    private void zzY8J() throws Exception {
        zzY9X zzy9xZzY55 = this.zzXmv;
        zzYC4 zzyc4 = (zzYC4) zz6x();
        if (zzyc4 == null) {
            zzZXZ().zzZ(null, null, zzy9xZzY55.zzQo(true), false);
        }
        zzy9xZzY55.zzQo(true);
        while (true) {
            if (zzy9xZzY55.zzY55() != null && zzyc4.zzYo1() == null) {
                zzZXZ().zzZ(zzyc4, null, zzy9xZzY55.zzY55().zzQo(true), false);
            } else if (zzy9xZzY55.zzY55() == null) {
                break;
            }
            zzy9xZzY55.zzY55().zzQo(true);
            zzy9xZzY55 = zzy9xZzY55.zzY55();
            zzyc4 = (zzYC4) zzyc4.zzYo1();
        }
        while (zzyc4.zzYo1() != null) {
            zzZXZ().zzB(zzyc4.zzYo1());
        }
    }

    @Override // com.aspose.words.zzY9C
    public final int getStoryType() {
        return 5;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6w() {
        if (zzZXZ() == null) {
            return null;
        }
        return zzZXZ().zz6w();
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6x() {
        if (zzZXZ() == null) {
            return null;
        }
        return zzZXZ().zz6x();
    }

    public final zzYBY zzS(zzY9X zzy9x) throws Exception {
        zzy9x.zzQJ(false);
        zzYBY zzybyZzQJ = zzy9x.zzQJ(true);
        zzY9E.zzZ(this, zzybyZzQJ);
        return zzybyZzQJ;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzTF zzX(zzYMD zzymd) {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzY(zzYMD zzymd) {
        zzZXZ().zzY(zzymd);
    }

    public final zzY9X zzY8N() {
        return this.zzXmv;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzYMD zzymd) {
        zzZXZ().zzZ(zzymd);
    }

    @Override // com.aspose.words.zzY9C
    public final zzY9A zzZ4B() {
        if (super.zzZ4B() == null) {
            zzZ(new zzZ(this));
        }
        return super.zzZ4B();
    }

    @Override // com.aspose.words.zzY9C
    public final boolean zzZZB() {
        return false;
    }

    public final void zzx(long[] jArr) throws Exception {
        zzY8J();
        int i = 0;
        for (zzYMD zzymdZz6x = zzZXZ().zz6x(); i < jArr.length && zzymdZz6x != null; zzymdZz6x = zzymdZz6x.zzYo1()) {
            int iZzn = com.aspose.words.internal.zzSA.zzn(Float.intBitsToFloat((int) jArr[i]));
            int iZzn2 = com.aspose.words.internal.zzSA.zzn(com.aspose.words.internal.zzZPW.zzYz(jArr[i]));
            if (iZzn != zzymdZz6x.getWidth() || iZzn2 != zzymdZz6x.getHeight()) {
                zzymdZz6x.setWidth(iZzn);
                zzymdZz6x.setHeight(iZzn2);
                zzymdZz6x.zzNd(5);
                zzZoU();
            }
            i++;
        }
        zzJ(null);
    }
}
