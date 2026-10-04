package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ63 {
    private final zzZDA zzWFS;
    protected final zzZ86 zzWFU;
    protected final zzZ86 zzWGN;
    protected final zzZD2 zzWlX;
    protected final zzZD2 zzWlY;
    protected final zzZAG zzWlZ;
    private byte[] zzWm0;
    private zzZAU zzWm1;
    private zzZAU zzWm2;
    private final boolean zzWm3;
    private final byte[] zzWm4;
    private final zzZ6L zzWm5;
    private final zzZ66 zzWm6;

    public zzZ63(zzZAG zzzag, zzZDA zzzda, zzZ6L zzz6l, byte[] bArr) {
        this.zzWlZ = zzzag;
        this.zzWFS = zzzda;
        this.zzWm3 = zzzda == null;
        zzZAH zzzahZzXJD = zzzag.zzXJD();
        if (zzzahZzXJD.zzXJG()) {
            this.zzWm6 = new zzZ66(zzZD9.zzYz(zzzahZzXJD.zzXJF()).zzXL5());
        } else {
            zzZAL zzzalZzYa = zzZAL.zzYa(zzzahZzXJD.zzXJF());
            this.zzWm6 = new zzZ66(zzzalZzYa.zzXJR(), zzzalZzYa.zzXJQ().zzXKZ());
        }
        this.zzWFU = zzzag.zzXJB();
        this.zzWlY = zzzag.zzXJC();
        this.zzWlX = zzzag.zzXJy();
        this.zzWGN = zzzag.zzXJz();
        this.zzWm4 = zzzag.zzXJA().zzXL5();
        this.zzWm5 = zzz6l;
        this.zzWm0 = bArr;
    }

    private zzZAU zzXHc() {
        zzZD2 zzzd2 = this.zzWlX;
        if (zzzd2 != null && this.zzWm1 == null) {
            this.zzWm1 = new zzZAU(zzzd2);
        }
        return this.zzWm1;
    }

    public static zzZ63 zzZ(zzZ63 zzz63, zzZAU zzzau) {
        zzZAG zzzag = zzz63.zzWlZ;
        return new zzZ63(new zzZAG(zzzag.zzXJD(), zzzag.zzXJB(), zzzag.zzXJC(), zzzag.zzXJz(), zzzag.zzXJA(), new zzZC0(zzzau.zzXJZ())), zzz63.zzWFS, zzz63.zzWm5, null);
    }

    public final byte[] getSignature() {
        return zzYGU.zzVI(this.zzWm4);
    }

    public final zzZAG zzXHa() {
        return this.zzWlZ;
    }

    public final zzZ62 zzXHb() {
        zzZAU zzzauZzXHc = zzXHc();
        if (zzzauZzXHc == null) {
            return new zzZ62(new ArrayList(0));
        }
        ArrayList arrayList = new ArrayList();
        zzZDJ zzzdjZzV = zzzauZzXHc.zzV(zzZAR.zzWFP);
        for (int i = 0; i < zzzdjZzV.size(); i++) {
            zzZD2 zzzd2ZzXK0 = ((zzZAV) zzzdjZzV.zzg8(i)).zzXK0();
            zzzd2ZzXK0.size();
            Enumeration enumerationZzXKE = zzzd2ZzXK0.zzXKE();
            while (enumerationZzXKE.hasMoreElements()) {
                arrayList.add(new zzZ63(zzZAG.zzY5(enumerationZzXKE.nextElement()), null, new zzZ6K(zzYGU.zzVI(this.zzWm4)), null));
            }
        }
        return new zzZ62(arrayList);
    }

    public final zzZAU zzXHd() {
        zzZD2 zzzd2 = this.zzWlY;
        if (zzzd2 != null && this.zzWm2 == null) {
            this.zzWm2 = new zzZAU(zzzd2);
        }
        return this.zzWm2;
    }

    public final zzZ86 zzXHe() {
        return this.zzWFU;
    }

    public final zzZ66 zzXHf() {
        return this.zzWm6;
    }
}
