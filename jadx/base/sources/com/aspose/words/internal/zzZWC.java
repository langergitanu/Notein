package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzZWC extends zzWX {
    private zzWT zz8f;
    private zzWL zz8g;
    private zzWW zz8h;

    public zzZWC(zzWK zzwk, zzWM zzwm, zzWL zzwl, zzWW zzww, zzWL zzwl2, zzWL zzwl3, zzWL zzwl4, zzWY zzwy, zzWT zzwt) throws Exception {
        super(zzwm, zzwl, zzww, zzwl2, zzwl3, zzwl4, zzwy);
        this.zz8f = zzwt;
        if (zzww.zzV6() == 0) {
            throw new IllegalStateException("Invalid CFF data.");
        }
        zzwk.zzZp(zzww.zzV6());
        zzWW zzwwZzO = zzWV.zzO(zzwk.zzn(zzww.zzV5()));
        this.zz8h = zzwwZzO;
        if (zzwwZzO.zzV2() != 0) {
            zzwk.zzZp(zzww.zzV6() + this.zz8h.zzV2());
            this.zz8g = zzWL.zzT(zzwk);
        }
    }

    private int zzSa(int i) {
        int iZzZu = zzWQ.zzZu(i);
        if (iZzZu == 0) {
            return -1;
        }
        for (int i2 = 0; i2 < zzVd().zzVg().getCount(); i2++) {
            if (zzVd().zzVg().zzVY(i2).intValue() == iZzZu) {
                return zzVd().zzVg().zzT3(i2);
            }
        }
        return -1;
    }

    private void zzTP() throws Exception {
        int size;
        int size2 = this.zzTW.getSize() + this.zzTV.getSize() + zzWL.zzA(1, this.zzTU.zzVf().length) + this.zzTT.getSize() + this.zzTS.getSize();
        this.zzTU.zzZJ(this.zz8f.zzZw(size2));
        int dataSize = size2 + this.zz8f.getDataSize();
        if (zzVd() != null) {
            this.zzTU.zzZI(dataSize);
            size = zzVd().getSize();
        } else {
            size = 0;
        }
        this.zzTU.zzZH(dataSize + size);
        zzWW zzww = this.zzTU;
        zzww.zzZG(zzww.zzV7() + zzVc().getSize());
        this.zzTU.zzZF(this.zz8h.zzVf().length);
        if (this.zz8g != null) {
            this.zz8h.zzZE(this.zzTU.zzV5());
        }
    }

    private void zzY(zzXZ zzxz) throws Exception {
        zzWJ zzwj = new zzWJ(zzxz);
        this.zzTW.zzZ(zzwj);
        this.zzTV.zzZ(zzwj);
        zzY(zzwj);
        this.zzTT.zzZ(zzwj);
        this.zzTS.zzZ(zzwj);
        this.zz8f.zzX(zzwj);
        if (zzVd() != null) {
            zzVd().zzZ(zzwj);
        }
        zzVc().zzZ(zzwj);
        zzWV.zzZ(zzxz, this.zz8h);
        zzWL zzwl = this.zz8g;
        if (zzwl != null) {
            zzwl.zzZ(zzwj);
        }
    }

    private void zznZ() {
        this.zzTU.zzZJ(0);
        if (zzVd() == null) {
            this.zzTU.zzV8();
        }
        if (this.zz8g == null) {
            this.zz8h.zzV1();
        }
    }

    @Override // com.aspose.words.internal.zzWX
    public final boolean zzVe() {
        return false;
    }

    @Override // com.aspose.words.internal.zzWX
    public final void zzZ(zzZYV<Integer> zzzyv) throws Exception {
        zzD4 zzd4 = new zzD4(zzzyv.getCount());
        zzD4 zzd42 = new zzD4(this.zzTS.zzUV());
        zzWL zzwl = this.zz8g;
        zzD4 zzd43 = new zzD4(zzwl != null ? zzwl.zzUV() : 0);
        for (int i = 0; i < zzzyv.getCount(); i++) {
            zzZ(zzzyv.zzT3(i), zzd4, zzd42, zzd43);
        }
        zzZ(zzWX.zzZ(zzVc(), zzd4, zzWX.zzTR, false));
        this.zzTS = zzWX.zzZ(this.zzTS, zzd42, zzWX.zzTQ, false);
        this.zz8g = zzWX.zzZ(this.zz8g, zzd43, zzWX.zzTQ, true);
    }

    private void zzZ(int i, zzD4 zzd4, zzD4 zzd42, zzD4 zzd43) {
        while (i >= 0) {
            zzd4.set(i, i);
            byte[] bArrZzZq = zzVc().zzZq(i);
            zzUY zzuy = new zzUY(zzd42, zzd43);
            zzWI zzwi = new zzWI(bArrZzZq, this.zz8g, this.zzTS, zzuy);
            zzwi.zzUQ();
            if (zzwi.hasErrors() || !zzuy.zzUx()) {
                return;
            }
            zzZ(zzSa(zzuy.zzUw().zzUp()), zzd4, zzd42, zzd43);
            i = zzSa(zzuy.zzUw().zzUo());
        }
    }

    @Override // com.aspose.words.internal.zzWX
    public final zzD3<zzP8> zzZ(zzDB zzdb) {
        zzD3<zzP8> zzd3 = new zzD3<>(zzdb.getCount());
        for (int i = 0; i < zzdb.getCount(); i++) {
            zzZ(zzdb.get(i), zzd3);
        }
        return zzd3;
    }

    private void zzZ(int i, zzD3<zzP8> zzd3) {
        zzP8 zzp8ZzUv;
        if (!zzd3.zzVE(i) && i < zzVc().zzUV()) {
            byte[] bArrZzZq = zzVc().zzZq(i);
            zzV2 zzv2 = new zzV2();
            zzWI zzwi = new zzWI(bArrZzZq, this.zz8g, this.zzTS, zzv2);
            zzwi.zzUQ();
            if (zzwi.hasErrors()) {
                zzp8ZzUv = null;
            } else if (zzv2.zzUx()) {
                zzp8ZzUv = zzZ(zzv2.zzUw(), zzd3);
            } else {
                zzp8ZzUv = zzv2.zzUv();
            }
            zzd3.set(i, zzp8ZzUv);
        }
    }

    private zzP8 zzZ(zzUZ zzuz, zzD3<zzP8> zzd3) {
        int iZzSa = zzSa(zzuz.zzUp());
        int iZzSa2 = zzSa(zzuz.zzUo());
        zzZ(iZzSa, zzd3);
        zzZ(iZzSa2, zzd3);
        if (zzd3.get(iZzSa) == null || zzd3.get(iZzSa2) == null) {
            return null;
        }
        zzP8 zzp8ZzO8 = zzd3.get(iZzSa).zzO8();
        zzP8 zzp8ZzO82 = zzd3.get(iZzSa2).zzO8();
        zzp8ZzO8.zzY(new zzP9(1.0f, 0.0f, 0.0f, 1.0f, (float) (zzuz.zzUn() - zzuz.zzUl()), -((float) zzuz.zzUm())));
        zzP8 zzp8 = new zzP8();
        zzZQG.zzZ((ArrayList) zzp8.zzO7(), (Iterable) zzp8ZzO82.zzO7());
        zzZQG.zzZ((ArrayList) zzp8.zzO7(), (Iterable) zzp8ZzO8.zzO7());
        return zzp8;
    }

    @Override // com.aspose.words.internal.zzWX
    public final void zzZ(zzXZ zzxz) throws Exception {
        zznZ();
        zzTP();
        zzY(zzxz);
    }
}
