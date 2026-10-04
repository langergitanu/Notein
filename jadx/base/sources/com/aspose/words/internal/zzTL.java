package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzTL extends zzWX {
    private zzWL[] zzRa;
    private zzWW[] zzRb;
    private zzWW[] zzRc;
    private zzWP zzRd;

    public zzTL(zzWK zzwk, zzWM zzwm, zzWL zzwl, zzWW zzww, zzWL zzwl2, zzWL zzwl3, zzWL zzwl4, zzWY zzwy) throws Exception {
        super(zzwm, zzwl, zzww, zzwl2, zzwl3, zzwl4, zzwy);
        if (zzww.zzUZ() == 0 || zzww.zzV0() == 0) {
            throw new IllegalStateException("Invalid CFF data.");
        }
        zzwk.zzZp(zzww.zzUZ());
        this.zzRd = zzWP.zzW(zzwk, zzwl4.zzUV());
        zzwk.zzZp(zzww.zzV0());
        zzWL zzwlZzT = zzWL.zzT(zzwk);
        this.zzRc = new zzWW[zzwlZzT.zzUV()];
        this.zzRb = new zzWW[zzwlZzT.zzUV()];
        this.zzRa = new zzWL[zzwlZzT.zzUV()];
        for (int i = 0; i < zzwlZzT.zzUV(); i++) {
            zzWW zzwwZzO = zzWV.zzO(zzwlZzT.zzZq(i));
            this.zzRc[i] = zzwwZzO;
            if (zzwwZzO.zzV6() == 0) {
                throw new IllegalStateException("Invalid CFF data.");
            }
            zzwk.zzZp(zzwwZzO.zzV6());
            zzWW zzwwZzO2 = zzWV.zzO(zzwk.zzn(zzwwZzO.zzV5()));
            this.zzRb[i] = zzwwZzO2;
            if (zzwwZzO2.zzV2() != 0) {
                zzwk.zzZp(zzwwZzO.zzV6() + zzwwZzO2.zzV2());
                this.zzRa[i] = zzWL.zzT(zzwk);
            } else {
                this.zzRa[i] = null;
            }
        }
    }

    private void zzTP() throws Exception {
        int size;
        int size2;
        int size3 = this.zzTW.getSize() + this.zzTV.getSize() + zzWL.zzA(1, this.zzTU.zzVf().length) + this.zzTT.getSize() + this.zzTS.getSize();
        if (zzVd() != null) {
            this.zzTU.zzZI(size3);
            size = zzVd().getSize();
        } else {
            size = 0;
        }
        this.zzTU.zzZC(size3 + size);
        zzWW zzww = this.zzTU;
        zzww.zzZH(zzww.zzUZ() + this.zzRd.getSize());
        zzWW zzww2 = this.zzTU;
        zzww2.zzZD(zzww2.zzV7() + zzVc().getSize());
        int length = 0;
        for (zzWW zzww3 : this.zzRc) {
            length += zzww3.zzVf().length;
        }
        int iZzV0 = this.zzTU.zzV0() + zzWL.zzA(this.zzRc.length, length);
        int i = 0;
        while (true) {
            zzWW[] zzwwArr = this.zzRc;
            if (i >= zzwwArr.length) {
                return;
            }
            zzwwArr[i].zzZG(iZzV0);
            int length2 = this.zzRb[i].zzVf().length;
            this.zzRc[i].zzZF(length2);
            if (this.zzRa[i] != null) {
                this.zzRb[i].zzZE(length2);
                size2 = this.zzRa[i].getSize();
            } else {
                size2 = 0;
            }
            iZzV0 += length2 + size2;
            i++;
        }
    }

    private void zzTQ() {
        this.zzTU.zzVa();
        this.zzTU.zzV4();
        if (zzVd() == null) {
            this.zzTU.zzV8();
        }
        int i = 0;
        while (true) {
            zzWW[] zzwwArr = this.zzRc;
            if (i >= zzwwArr.length) {
                return;
            }
            zzwwArr[i].zzV8();
            this.zzRc[i].zzVa();
            if (this.zzRa[i] == null) {
                this.zzRb[i].zzV1();
            }
            i++;
        }
    }

    private void zzW(zzWJ zzwj) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (zzWW zzww : this.zzRc) {
            zzZQG.zzZ((ArrayList<byte[]>) arrayList, zzww.zzVf());
        }
        new zzWL(arrayList).zzZ(zzwj);
    }

    private void zzY(zzXZ zzxz) throws Exception {
        zzWJ zzwj = new zzWJ(zzxz);
        this.zzTW.zzZ(zzwj);
        this.zzTV.zzZ(zzwj);
        zzY(zzwj);
        this.zzTT.zzZ(zzwj);
        this.zzTS.zzZ(zzwj);
        if (zzVd() != null) {
            zzVd().zzZ(zzwj);
        }
        this.zzRd.zzZ(zzwj);
        zzVc().zzZ(zzwj);
        zzW(zzwj);
        int i = 0;
        while (true) {
            zzWW[] zzwwArr = this.zzRb;
            if (i >= zzwwArr.length) {
                return;
            }
            zzWV.zzZ(zzxz, zzwwArr[i]);
            zzWL zzwl = this.zzRa[i];
            if (zzwl != null) {
                zzwl.zzZ(zzwj);
            }
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzWX
    public final boolean zzVe() {
        return true;
    }

    @Override // com.aspose.words.internal.zzWX
    public final void zzZ(zzZYV<Integer> zzzyv) throws Exception {
        zzD4 zzd4 = new zzD4(zzzyv.getCount());
        zzD4 zzd42 = new zzD4(this.zzTS.zzUV());
        int length = this.zzRc.length;
        zzD4[] zzd4Arr = new zzD4[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            zzWL zzwl = this.zzRa[i2];
            zzd4Arr[i2] = new zzD4(zzwl != null ? zzwl.zzUV() : 0);
        }
        for (int i3 = 0; i3 < zzzyv.getCount(); i3++) {
            zzZ(zzzyv.zzT3(i3), zzd4, zzd42, zzd4Arr);
        }
        zzZ(zzWX.zzZ(zzVc(), zzd4, zzWX.zzTR, false));
        this.zzTS = zzWX.zzZ(this.zzTS, zzd42, zzWX.zzTQ, false);
        while (true) {
            zzWL[] zzwlArr = this.zzRa;
            if (i >= zzwlArr.length) {
                return;
            }
            zzwlArr[i] = zzWX.zzZ(zzwlArr[i], zzd4Arr[i], zzWX.zzTQ, true);
            i++;
        }
    }

    private void zzZ(int i, zzD4 zzd4, zzD4 zzd42, zzD4[] zzd4Arr) {
        if (i < 0) {
            return;
        }
        zzd4.set(i, i);
        int iZzZt = this.zzRd.zzZt(i);
        zzWI zzwi = new zzWI(zzVc().zzZq(i), this.zzRa[iZzZt], this.zzTS, new zzUY(zzd42, zzd4Arr[iZzZt]));
        zzwi.zzUQ();
        zzwi.hasErrors();
    }

    @Override // com.aspose.words.internal.zzWX
    public final zzD3<zzP8> zzZ(zzDB zzdb) {
        zzD3<zzP8> zzd3 = new zzD3<>(zzdb.getCount());
        for (int i = 0; i < zzdb.getCount(); i++) {
            int i2 = zzdb.get(i);
            int iZzZt = this.zzRd.zzZt(i2);
            zzV2 zzv2 = new zzV2();
            zzWI zzwi = new zzWI(zzVc().zzZq(i2), this.zzRa[iZzZt], this.zzTS, zzv2);
            zzwi.zzUQ();
            if (!zzwi.hasErrors() && !zzv2.zzUx()) {
                zzd3.set(i2, zzv2.zzUv());
            }
        }
        return zzd3;
    }

    @Override // com.aspose.words.internal.zzWX
    public final void zzZ(zzXZ zzxz) throws Exception {
        zzTQ();
        zzTP();
        zzY(zzxz);
    }
}
