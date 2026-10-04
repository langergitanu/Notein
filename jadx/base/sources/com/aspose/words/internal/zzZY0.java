package com.aspose.words.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZY0 extends zzZVD {
    private zzZYA zzbt;
    private zzZY2<zzP8> zzbu;
    private zzZY2<zzZXH> zzbv;
    private zzFL zzbw;
    private zzZY5 zzbx;
    private zzER<zzZY7> zzxA;
    private zzZWJ zzxD;

    public zzZY0(zzP zzp, zzZY5 zzzy5, zzFL zzfl) {
        super(zzp, zzzy5, 7);
        this.zzxD = null;
        this.zzxA = new zzER<>();
        this.zzbx = zzzy5;
        this.zzbw = zzfl;
        this.zzbv = new zzZY2<>(this, 1);
        this.zzbu = new zzZY2<>(this, 4);
    }

    private zzZYA zzqO() {
        if (this.zzbt == null) {
            this.zzbt = new zzZYA(this, zzng());
        }
        return this.zzbt;
    }

    private void zzqP() throws Exception {
        if (this.zzbu.getCount() <= 0) {
            return;
        }
        zzOV zzov = new zzOV((byte) 0);
        Iterator<zzP8> it = this.zzbu.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            zzP8 zzp8 = (zzP8) entry.getValue();
            zzng().zzY("clipPath");
            zzng().zzX("id", str);
            zzng().zzY("path");
            zzng().zzX("d", zzov.zzQ(zzp8));
            zzng().zzX("clip-rule", "evenodd");
            zzng().zzp();
            zzng().zzp();
        }
    }

    public final zzZWJ zzG9() {
        zzFL zzfl = this.zzbw;
        if (zzfl != null) {
            return zzfl.zzG9();
        }
        if (this.zzxD == null) {
            this.zzxD = new zzZWJ();
        }
        return this.zzxD;
    }

    @Override // com.aspose.words.internal.zzZVD
    public final zzEO zzGf() {
        return new zzZY6(zznh().getJpegQuality(), zzI());
    }

    @Override // com.aspose.words.internal.zzZVD
    public final void zzGn() throws Exception {
        zzng().zzY("defs");
        if (this.zzbx.getTextOutputMode() == 0 || this.zzbx.getTextOutputMode() == 2) {
            zzZY8 zzzy8 = new zzZY8(this);
            for (zzJO zzjo : zzne()) {
                zzZ(zzzy8, zzjo);
            }
        }
        zzqO().zzqZ();
        if (this.zzxA.getCount() > 0) {
            for (int i = 0; i < this.zzxA.getCount(); i++) {
                this.zzxA.zzVY(i).zzqY();
            }
        }
        zzqP();
        zzng().zzp();
    }

    public final String zzS(zzPY zzpy) {
        return zzqO().zzS(zzpy);
    }

    @Override // com.aspose.words.internal.zzZVD
    public final String zzW7(int i) {
        zzFL zzfl = this.zzbw;
        return zzfl != null ? zzfl.zzW7(i) : super.zzW7(i);
    }

    @Override // com.aspose.words.internal.zzZVD
    public final String zzX(zzZXH zzzxh) {
        return this.zzbv.zzf(zzzxh);
    }

    @Override // com.aspose.words.internal.zzZVD
    public final void zzZ(String str, zzZXH zzzxh, boolean z) {
        zzFL zzfl = this.zzbw;
        if (zzfl != null) {
            zzfl.zzZ(str, zzzxh, z);
        } else if (this.zzbx.getTextOutputMode() == 0 || this.zzbx.getTextOutputMode() == 2) {
            super.zzZ(str, zzzxh, z);
        }
    }

    public final zzZY5 zzqQ() {
        return this.zzbx;
    }

    public final String zzy(zzP8 zzp8) {
        if (zzZT.zzV(zzp8)) {
            return this.zzbu.zzf(zzp8);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZVD
    public final String zzZ(byte[] bArr, zzEP zzep) throws Exception {
        zzZY7 zzzy7ZzY = this.zzxA.zzY(bArr, zzep);
        if (zzzy7ZzY == null) {
            zzZY7 zzzy7 = new zzZY7(zzW7(0), zznf().zzW(bArr, zzep), this);
            this.zzxA.zzZ(bArr, zzep, zzzy7);
            zzzy7ZzY = zzzy7;
        }
        return zzzy7ZzY.zzqX();
    }

    private void zzZ(zzZY8 zzzy8, zzJO zzjo) throws Exception {
        int textOutputMode = this.zzbx.getTextOutputMode();
        if (textOutputMode == 0) {
            zzzy8.zzX(zzjo);
        } else {
            if (textOutputMode != 2) {
                return;
            }
            zzzy8.zzW(zzjo);
        }
    }
}
