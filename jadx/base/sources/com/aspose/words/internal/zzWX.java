package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzWX {
    protected zzWL zzTS;
    zzWL zzTT;
    protected zzWW zzTU;
    protected zzWL zzTV;
    protected zzWM zzTW;
    private zzWL zzTX;
    private zzWY zzTY;
    protected static byte[] zzTR = {14};
    protected static byte[] zzTQ = {11};

    public zzWX(zzWM zzwm, zzWL zzwl, zzWW zzww, zzWL zzwl2, zzWL zzwl3, zzWL zzwl4, zzWY zzwy) {
        this.zzTW = zzwm;
        this.zzTV = zzwl;
        this.zzTU = zzww;
        this.zzTT = zzwl2;
        this.zzTS = zzwl3;
        this.zzTX = zzwl4;
        this.zzTY = zzwy;
    }

    public static zzWX zzZ(zzY0 zzy0) throws Exception {
        zzWY zzwyZzZ;
        zzWK zzwk = new zzWK(zzy0);
        zzWM zzwmZzU = zzWM.zzU(zzwk);
        zzWL zzwlZzT = zzWL.zzT(zzwk);
        if (zzwlZzT.zzUV() != 1) {
            throw new IllegalStateException("CFF data with multiple fonts is not supported.");
        }
        zzWL zzwlZzT2 = zzWL.zzT(zzwk);
        if (zzwlZzT2.zzUV() != 1) {
            throw new IllegalStateException("CFF data with multiple fonts is not supported.");
        }
        zzWW zzwwZzO = zzWV.zzO(zzwlZzT2.zzZq(0));
        zzWL zzwlZzT3 = zzWL.zzT(zzwk);
        zzWL zzwlZzT4 = zzWL.zzT(zzwk);
        if (zzwwZzO.zzV7() == 0) {
            throw new IllegalStateException("Invalid CFF data.");
        }
        zzwk.zzZp(zzwwZzO.zzV7());
        zzWL zzwlZzT5 = zzWL.zzT(zzwk);
        zzWT zzwtZzY = zzWT.zzY(zzwk, zzwwZzO.getEncoding());
        if (zzwwZzO.zzV9() != 0) {
            zzwk.zzZp(zzwwZzO.zzV9());
            zzwyZzZ = zzWY.zzZ(zzwk, zzwlZzT5.zzUV());
        } else {
            zzwyZzZ = null;
        }
        zzWY zzwy = zzwyZzZ;
        return zzwwZzO.zzV3() ? new zzTL(zzwk, zzwmZzU, zzwlZzT, zzwwZzO, zzwlZzT3, zzwlZzT4, zzwlZzT5, zzwy) : new zzZWC(zzwk, zzwmZzU, zzwlZzT, zzwwZzO, zzwlZzT3, zzwlZzT4, zzwlZzT5, zzwy, zzwtZzY);
    }

    public final zzWL zzVc() {
        return this.zzTX;
    }

    public final zzWY zzVd() {
        return this.zzTY;
    }

    public abstract boolean zzVe();

    public final byte[] zzVf() throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzY(zzzor);
            return zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }

    public final void zzY(zzZOP zzzop) throws Exception {
        zzZ(new zzXZ(zzzop));
    }

    public abstract zzD3<zzP8> zzZ(zzDB zzdb);

    public abstract void zzZ(zzXZ zzxz) throws Exception;

    public abstract void zzZ(zzZYV<Integer> zzzyv) throws Exception;

    public final void zzY(zzWJ zzwj) throws Exception {
        ArrayList arrayList = new ArrayList();
        zzZQG.zzZ((ArrayList<byte[]>) arrayList, this.zzTU.zzVf());
        new zzWL(arrayList).zzZ(zzwj);
    }

    public static zzWL zzZ(zzWL zzwl, zzD4 zzd4, byte[] bArr, boolean z) throws Exception {
        if (zzwl == null) {
            return null;
        }
        if (zzd4.getCount() == 0) {
            if (z) {
                return null;
            }
            return new zzWL(new ArrayList());
        }
        ArrayList arrayList = new ArrayList(zzwl.zzUV());
        for (int i = 0; i < zzwl.zzUV(); i++) {
            zzZQG.zzZ((ArrayList<byte[]>) arrayList, zzd4.zzVE(i) ? zzwl.zzZq(i) : bArr);
        }
        return new zzWL(arrayList);
    }

    public final void zzZ(zzWL zzwl) {
        this.zzTX = zzwl;
    }
}
