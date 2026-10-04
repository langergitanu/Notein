package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzW3 extends zzW6 {
    private zzZD1 zzZya;

    public zzW3(zzZD1 zzzd1, zzD8 zzd8) {
        super(zzd8);
        this.zzZya = zzzd1;
    }

    private zzCL getCollectionTxPr() {
        return this.zzZya.getCollectionTxPr();
    }

    private zzD9 getItemSpPr() {
        return this.zzZya.getItemSpPr();
    }

    private zzCM getItemTx() {
        return this.zzZya.getItemTx();
    }

    private zzCL getItemTxPr() {
        return this.zzZya.getItemTxPr();
    }

    private void setItemTxPr(zzCL zzcl) {
        this.zzZya.setItemTxPr(zzcl);
    }

    private boolean zz2X() {
        return ((getItemTxPr() == null || getItemTxPr().isEmpty()) && getItemSpPr() == null) ? false : true;
    }

    private boolean zz2Y() {
        return (getItemTx() == null || getItemTx().zzZGw() == null) ? false : true;
    }

    private ArrayList<zz4A> zzMi() {
        if (zz2Y()) {
            return getItemTx().zzZGw().zzMi();
        }
        if (getItemTxPr() != null) {
            return getItemTxPr().zzMi();
        }
        return null;
    }

    private static Object zzNT(int i) {
        return i != 190 ? i != 230 ? zzYEF.zzOt(i) : zzU1.zzSP("Arial") : Integer.valueOf(com.aspose.words.internal.zzSA.zzt(18.0d));
    }

    @Override // com.aspose.words.zzW6
    public final void zz36() {
        super.zz36();
        if (getCollectionTxPr() == null) {
            return;
        }
        Iterator<zz4A> it = zz3D().iterator();
        while (it.hasNext()) {
            it.next().zzZxp().zzWS(false);
        }
        if (!zz2X() || zz33()) {
            return;
        }
        zzYo(false);
        Iterator<zz30> it2 = zz3E().iterator();
        while (it2.hasNext()) {
            getCollectionTxPr().zzZHj().zzV(it2.next());
        }
        Iterator<zz4A> it3 = zz3D().iterator();
        while (it3.hasNext()) {
            it3.next().zzZxp().zzWS(true);
        }
    }

    @Override // com.aspose.words.zzW6
    public final zz30 zz3C() {
        zz4A zz4aZzZGt;
        if (getItemTx() != null && getItemTx().zzZGw() != null) {
            if (getItemTx().zzZGt() == null) {
                com.aspose.words.internal.zzZQG.zzZ(getItemTx().zzZGw().zzMi(), new zz4A());
            }
            zz4aZzZGt = getItemTx().zzZGt();
        } else {
            if (getItemTxPr() == null) {
                return null;
            }
            zz4aZzZGt = getItemTxPr().zzZGt();
        }
        return zz4aZzZGt.zzZxn() != null ? zz4aZzZGt.zzZxn().zzZx5() : zz4aZzZGt.zzZxp().zzZHc();
    }

    @Override // com.aspose.words.zzW6
    public final Iterable<zz4A> zz3D() {
        ArrayList<zz4A> arrayListZzMi = zzMi();
        return arrayListZzMi != null ? arrayListZzMi : new ArrayList();
    }

    @Override // com.aspose.words.zzW6
    public final Iterable<zz30> zz3E() {
        return new zz2Y(zzMi(), zz33());
    }

    @Override // com.aspose.words.zzW6
    public final Object zzNZ(int i) {
        if (zz2Y() && ((getItemTx().zzZGw().zzMi().size() == 0 || !getItemTx().zzZGw().zzMi().get(0).zzZxp().zzZx9()) && zz2X())) {
            return zzNT(i);
        }
        Object objFetchSpecialDefaultRunPropertyValue = this.zzZya.fetchSpecialDefaultRunPropertyValue(i);
        return objFetchSpecialDefaultRunPropertyValue != null ? objFetchSpecialDefaultRunPropertyValue : super.zzNZ(i);
    }

    @Override // com.aspose.words.zzW6
    public final Object zzO8(int i) {
        if (zz2Y() && zz2X()) {
            zz30 zz30VarZzZHc = getItemTx().zzZGt().zzZxp().zzZHc();
            if (zz30VarZzZHc != null && zzYED.zzZ(zz30VarZzZHc, i)) {
                return zzY(i, zz30VarZzZHc);
            }
            return null;
        }
        if (zz33() && getItemTxPr() != null && zzYED.zzZ(getItemTxPr().zzZHj(), i)) {
            return zzZ(i, getItemTxPr().zzZHj());
        }
        if (getCollectionTxPr() != null && (!zz2X() || zz33())) {
            zz30 zz30VarZzZxo = getCollectionTxPr().zzZGt().zzZxo();
            if (!zz33() || !zzYED.zzZ(zz30VarZzZxo, i)) {
                zz30VarZzZxo = zzYED.zzZ(getCollectionTxPr().zzZHj(), i) ? getCollectionTxPr().zzZHj() : null;
            }
            if (zz30VarZzZxo != null) {
                return zzZ(i, zz30VarZzZxo);
            }
        }
        if (!zz33()) {
            zz30 zz30VarZzZHj = zz34().zzZHj();
            if (zzYED.zzZ(zz30VarZzZHj, i)) {
                return zzZ(i, zz30VarZzZHj);
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzW6
    public final void zzYo(boolean z) {
        if (zz2Y()) {
            return;
        }
        if (zz33()) {
            if (getItemTxPr() == null) {
                setItemTxPr(new zzCL());
            }
            getItemTxPr().zzZGq();
            if (getItemTxPr().zzZGt().zzMf().size() > 0) {
                return;
            }
            zz31 zz31Var = new zz31((getCollectionTxPr() != null ? getCollectionTxPr().zzZGt() : getItemTxPr().zzZGt()).zzZxo().zzZw2());
            zz31Var.setText(this.zzZya.generateItemText());
            getItemTxPr().zzZGt().zzY(zz31Var);
            return;
        }
        if (getItemTxPr() == null || (getItemTxPr().isEmpty() && getCollectionTxPr() != null && !getCollectionTxPr().isEmpty())) {
            setItemTxPr(getCollectionTxPr() != null ? getCollectionTxPr().zzZGr() : new zzCL());
        }
        if (z) {
            getItemTxPr().zzZGq();
        }
    }
}
