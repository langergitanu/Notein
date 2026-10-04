package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYVQ extends zzYBL {
    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final int getHeight() throws Exception {
        super.setHeight(zz6w().getY() + zz6w().getHeight());
        return super.getHeight();
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final int getWidth() throws Exception {
        return zzZZJ().getWidth();
    }

    @Override // com.aspose.words.zzYMD
    public final int getX() {
        return zzZZJ().getX();
    }

    @Override // com.aspose.words.zzYMD
    public final int zz0t() throws Exception {
        if (isEmpty()) {
            return 0;
        }
        return zz6w().getY() + zz6w().zz0t();
    }

    @Override // com.aspose.words.zzYMD
    public final zzYMD zz5Y() {
        zza9();
        zzZZJ();
        if (zzYo0() == null || zzYo0().zzZZJ() != zzZZJ()) {
            return null;
        }
        return zzYo0();
    }

    @Override // com.aspose.words.zzYMD
    public final zzYMD zz5Z() {
        zza9();
        zzZZJ();
        if (zzYo1() == null || zzYo1().zzZZJ() != zzZZJ()) {
            return null;
        }
        return zzYo1();
    }

    @Override // com.aspose.words.zzYMD
    public final int zz60() {
        return 16384;
    }

    public final void zzYzp() throws Exception {
        if (!zzYnZ()) {
            setY(zz5Y().getBottom());
            return;
        }
        zzYVR zzyvr = (zzYVR) zzZZJ();
        zzyvr.zzYzt();
        setY(zzyvr.zzYzt().getBottom());
    }

    @Override // com.aspose.words.zzTF
    public final void zzZ(zzYMD zzymd, zzTF zztf) throws Exception {
        if (zzymd.zz60() != 16384 && (zztf instanceof zzYVR)) {
            zzYVR zzyvr = (zzYVR) zztf;
            zzTF zztf2 = (zzYVQ) zzyvr.zz6x();
            if (zzyvr.isEmpty() || ((zzYVQ) zzyvr.zz6x()).zza9() != zza9()) {
                zztf2 = (zzTF) zz5R();
                zza9().zzZ(this, zzYo1(), zztf2, false);
                zzyvr.zzU(zztf2);
            }
            zztf = zztf2;
        }
        super.zzZ(zzymd, zztf);
    }

    @Override // com.aspose.words.zzTF
    public final int zzZXQ() {
        return zzZZJ().zzZXQ();
    }

    private void zzZ(zzYVQ zzyvq, boolean z) throws Exception {
        ArrayList<zzYMD> arrayListZzZ = zzZ((zzYMD) null, (zzYMD) null);
        arrayListZzZ.size();
        if (z) {
            for (int size = arrayListZzZ.size() - 1; size >= 0; size--) {
                arrayListZzZ.get(size).zzO(zzyvq);
            }
            return;
        }
        for (int i = 0; i < arrayListZzZ.size(); i++) {
            arrayListZzZ.get(i).zzO(zzyvq);
        }
    }

    public final void zzZ(zzYVR zzyvr, boolean z) throws Exception {
        zzYVQ zzyvq;
        zzYVQ zzyvq2;
        zzYVQ zzyvq3;
        if (z && ((zzYVQ) zzYo1()) != null && ((zzYVQ) zzYo1()).zza9() == zza9()) {
            ((zzYVQ) zzYo1()).zzZZJ();
            zzZ((zzYVQ) zzYo1(), true);
            zzZZJ();
            zza9();
            return;
        }
        if (!z && ((zzYVQ) zzYo0()) != null && ((zzYVQ) zzYo0()).zza9() == zza9()) {
            ((zzYVQ) zzYo0()).zzZZJ();
            zzZ((zzYVQ) zzYo0(), false);
            zzZZJ();
            zza9();
            return;
        }
        if (zzZZJ() == zzyvr) {
            return;
        }
        zzYVR zzyvr2 = (zzYVR) zzZZJ();
        zzZZJ().zzY((zzYMD) this, true);
        zzNd(1);
        if (((zzYVQ) zzYo0()) != null) {
            ((zzYVQ) zzYo0()).zzu((zzYVQ) zzYo1());
        }
        if (((zzYVQ) zzYo1()) != null) {
            ((zzYVQ) zzYo1()).zzt((zzYVQ) zzYo0());
        }
        if (z) {
            if (((zzYVQ) zzyvr2.zz6w()) != null) {
                zzyvq3 = (zzYVQ) zzyvr2.zz6w();
            } else {
                zzyvq3 = (zzYVQ) zzYo0();
            }
            zzyvq2 = (zzYVQ) zzyvr.zz6x();
            if (((zzYVQ) zzyvr.zz6x()) == null && ((zzTF) zzyvr.zzYo1()) != null) {
                zzyvq2 = (zzYVQ) ((zzTF) zzyvr.zzYo1()).zz6x();
            }
            if (zzyvq2 == zzyvq3) {
                zzyvq2 = null;
            }
        } else {
            zzYVQ zzyvq4 = (zzYVQ) zzyvr.zz6w();
            if (((zzYVQ) zzyvr.zz6w()) == null && ((zzTF) zzyvr.zzYo0()) != null) {
                zzyvq4 = (zzYVQ) ((zzTF) zzyvr.zzYo0()).zz6w();
            }
            if (zzyvq4 != null) {
                zzyvq = (zzYVQ) zzyvq4.zzYo1();
            } else if (((zzYVQ) zzyvr2.zz6x()) != null) {
                zzyvq = (zzYVQ) zzyvr2.zz6x();
            } else {
                zzyvq = (zzYVQ) zzYo1();
            }
            if (zzyvq == zzyvq4) {
                zzyvq2 = zzyvq;
                zzyvq3 = null;
            } else {
                zzYVQ zzyvq5 = zzyvq4;
                zzyvq2 = zzyvq;
                zzyvq3 = zzyvq5;
            }
        }
        zzt(null);
        zzu(null);
        zzt(zzyvq3);
        if (zzyvq3 != null) {
            zzyvq3.zzu(this);
        }
        zzu(zzyvq2);
        if (zzyvq2 != null) {
            zzyvq2.zzt(this);
        }
        zzyvr.zzNd(3);
        if (z) {
            zzyvr.zzZ(this);
            if (zzyvr.zz6w() == null) {
                zzyvr.zzY((zzYMD) this);
            }
        } else {
            zzyvr.zzY((zzYMD) this);
            if (zzyvr.zz6x() == null) {
                zzyvr.zzZ(this);
            }
        }
        zzY((zzTF) zzyvr);
    }
}
