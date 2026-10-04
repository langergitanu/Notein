package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ19 extends zzZ18 {
    private zzZ13 zzY2r;
    private zzZ13 zzY2s;
    private zzZ1A zzY2t;

    public zzZ19(zzZ14 zzz14, OfficeMath officeMath) {
        super(zzz14, officeMath);
        zzZ13 zzz13 = new zzZ13(zzz14, officeMath);
        this.zzY2s = zzz13;
        super.zzZ(zzz13);
        zzZ13 zzz132 = new zzZ13(zzz14, officeMath);
        this.zzY2r = zzz132;
        super.zzZ(zzz132);
        zzZ1A zzz1a = new zzZ1A(zzz14, ((zzZ0I) officeMath.zzZsL()).getCharacter(), officeMath.zzZYh());
        this.zzY2t = zzz1a;
        this.zzY2s.zzZ(zzz1a);
    }

    private static float zzY(zzZ13 zzz13) {
        zzYZP zzyzp = (zzYZP) com.aspose.words.internal.zzZKW.zzZ(zzz13, zzYZP.class);
        return zzyzp == null ? zzz13.zzZj().getHeight() : zzyzp.zzYE4();
    }

    private float zzYHd() {
        Iterator<zzZ13> it = this.zzY2r.zzQw().get(0).zzQw().iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(fMax, zzY(it.next()));
        }
        return fMax;
    }

    private void zzYHe() throws Exception {
        float fZzYHd = zzYHd();
        zzZ13 zzz13 = this.zzY2r;
        while (zzz13.zzQw().size() > 0 && zzz13.zzYG8().getMathObjectType() != 8) {
            zzz13 = zzz13.zzQw().get(0);
        }
        if (zzz13.zzQw().size() > 0) {
            zzz13 = zzz13.zzQw().get(0);
        }
        com.aspose.words.internal.zzPM zzpmZzZr = zzz13.zzZr();
        if (fZzYHd > zzpmZzZr.zzPf() * 0.8f) {
            zzYi(zzpmZzZr.zzPf() * 0.2f);
            return;
        }
        double d = fZzYHd;
        if (com.aspose.words.internal.zzAN.zzJ(d, ((double) zzpmZzZr.zzPf()) * 0.55d) && d < ((double) zzpmZzZr.zzPf()) * 0.65d) {
            zzYi((-zzpmZzZr.zzPf()) * 0.1f);
        } else if (d < ((double) zzpmZzZr.zzPf()) * 0.55d) {
            zzYi((-zzpmZzZr.zzPf()) * 0.2f);
        }
    }

    @Override // com.aspose.words.zzZ0M, com.aspose.words.zzZ13
    public final void layoutChildren() throws Exception {
        this.zzY2r.zzZE4();
        zzYHe();
        this.zzY2t.setWidth(zzYGk().getText().length() > 1 ? this.zzY2r.zzZj().getWidth() : this.zzY2r.zzZj().getWidth() * 0.85f);
        this.zzY2s.zzZE4();
        zzYp(this.zzY2s.zzZj().getHeight() + zzYFn() + this.zzY2r.zzYGq());
        super.layoutChildren();
    }

    @Override // com.aspose.words.zzZ18, com.aspose.words.zzZ13
    public final void zzZ(zzZ13 zzz13) {
        this.zzY2r.zzZ(zzz13);
    }
}
