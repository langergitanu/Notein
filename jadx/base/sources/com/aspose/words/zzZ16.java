package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ16 extends zzZ13 {
    private static char[] zzY2o = {'(', ')', '[', ']', '{', '}'};
    private float zzY2i;
    private ArrayList<zzYZP> zzY2j;
    private zzZ13 zzY2k;
    private zzZ13 zzY2l;
    private zzZ13 zzY2m;
    private zzZ0C zzY2n;

    public zzZ16(zzZ14 zzz14, OfficeMath officeMath) {
        super(zzz14, officeMath);
        this.zzY2j = new ArrayList<>();
        this.zzY2i = Float.NaN;
        this.zzY2n = (zzZ0C) zzYGk().zzZsL();
        this.zzY2k = new zzZ13(zzz14, officeMath);
        this.zzY2m = new zzZ13(zzz14, officeMath);
        this.zzY2l = new zzZ13(zzz14, officeMath);
        super.zzZ(this.zzY2m);
        super.zzZ(this.zzY2k);
        super.zzZ(this.zzY2l);
    }

    private void zzTk(boolean z) throws Exception {
        char cZzTm = zzTm(z);
        zzZ13 zzz13ZzTl = zzTl(z);
        if (!zzYGe() || !zzZ15.zzX(zzY2o, cZzTm)) {
            zzTn(z);
            return;
        }
        int iZzYH0 = zzYH0();
        int i = zzZ15.zzYq(cZzTm).get(iZzYH0);
        if (com.aspose.words.internal.zzD4.zzWm(i) || iZzYH0 == 0) {
            zzTn(z);
        } else {
            zzZ(zzZ11.zzZ(i, zzYGf(), zzZr().zzPg(), zzZy()), z, cZzTm, zzz13ZzTl);
        }
    }

    private zzZ13 zzTl(boolean z) {
        return z ? this.zzY2m : this.zzY2l;
    }

    private char zzTm(boolean z) {
        char cZzYER = z ? this.zzY2n.zzYER() : this.zzY2n.zzYEQ();
        if (cZzYER == 65288) {
            return '(';
        }
        if (cZzYER == 65289) {
            return ')';
        }
        if (cZzYER == 65339) {
            return '[';
        }
        if (cZzYER == 65341) {
            return ']';
        }
        if (cZzYER == 65371) {
            return '{';
        }
        if (cZzYER == 65373) {
            return '}';
        }
        return cZzYER;
    }

    private void zzTn(boolean z) throws Exception {
        char cZzTm = zzTm(z);
        zzZ13 zzz13ZzTl = zzTl(z);
        zzz13ZzTl.zzZ(new zzYZP(zzYGj(), Character.toString(cZzTm), zzYGl()));
        zzz13ZzTl.zzZE4();
        if (com.aspose.words.internal.zzAN.zzR(this.zzY2k.zzZj().getHeight(), zzZr().getLineSpacingPoints()) || !this.zzY2n.zzYEO()) {
            return;
        }
        zzZ(zzYGY(), zzz13ZzTl);
    }

    private float zzYGY() throws Exception {
        if (Float.isNaN(this.zzY2i)) {
            this.zzY2i = zzYH2();
        }
        return this.zzY2i;
    }

    private boolean zzYGZ() {
        int size = this.zzY2k.zzQw().get(0).zzQw().size();
        return size > 0 && this.zzY2k.zzQw().get(0).zzQw().get(size - 1).zzYG8().getMathObjectType() == 6;
    }

    private int zzYH0() throws Exception {
        int i = 0;
        if (this.zzY2k.zzZj().getHeight() < zzZr().zzPf()) {
            return 0;
        }
        float f = zzuR(this.zzY2n.zzYER()) ? 2.05f : 2.07f;
        if (zzYGY() > zzZr().getLineSpacingPoints() * 3.5f) {
            i = 7;
        } else if (zzYGY() > zzZr().getLineSpacingPoints() * 2.9f) {
            i = 6;
        } else if (zzYGY() > zzZr().getLineSpacingPoints() * 2.6f) {
            i = 5;
        } else if (zzYGY() > zzZr().getLineSpacingPoints() * f) {
            i = 4;
        } else if (zzYGY() > zzZr().getLineSpacingPoints() * 1.88f) {
            i = 3;
        } else if (zzYGY() > zzZr().getLineSpacingPoints() * 1.25f) {
            i = 2;
        } else if (zzYGY() > zzZr().getLineSpacingPoints()) {
            i = 1;
        }
        if (!zzYGZ() || i == 7 || i <= 1) {
            return i;
        }
        int i2 = i + 1;
        return (this.zzY2k.zzZj().getHeight() <= zzZr().getLineSpacingPoints() * 2.0f || i2 >= 7) ? i2 : i + 2;
    }

    private void zzYH1() throws Exception {
        if (zztv().zzO("Cambria Math", 0) == null || zzYGb() || !this.zzY2n.zzYEO()) {
            zzTn(true);
            zzTn(false);
        } else {
            zzTk(true);
            zzTk(false);
        }
    }

    private float zzYH2() throws Exception {
        float fMax = 0.0f;
        for (zzZ13 zzz13 : this.zzY2k.zzQw()) {
            zzz13.zzZE4();
            fMax = Math.max(fMax, Math.max(zzz13.zzYGq(), zzz13.zzZj().getHeight() - zzz13.zzYGq()) * 2.0f);
        }
        return fMax;
    }

    private void zzu(com.aspose.words.internal.zzZG zzzg) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzYGj().zzZMR().zzZ((com.aspose.words.internal.zzZL) zzzg);
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzZ(1.0f, (zzYGY() - ((zzZYh().getSize() * 0.04f) * 4.0f)) / zzzq4ZzZ.getHeight(), 1);
        zzzg.zzY(zzp9);
    }

    private static boolean zzuQ(int i) {
        return i == 123 || i == 125;
    }

    private static boolean zzuR(int i) {
        return i == 40 || i == 41;
    }

    private float zzuS(int i) {
        return (zzuQ(i) ? 0.014f : 0.007f) * zzZYh().getSize();
    }

    private float zzuT(int i) {
        return (zzuQ(i) ? 0.025f : zzuR(i) ? 0.045f : 0.055f) * zzZYh().getSize();
    }

    @Override // com.aspose.words.zzZ13
    public final void layoutChildren() throws Exception {
        if (this.zzY2k.zzQw().size() > 0) {
            Iterator<zzYZP> it = this.zzY2j.iterator();
            while (it.hasNext()) {
                zzZ(zzYGY(), it.next());
            }
        }
        this.zzY2k.zzZE4();
        zzYH1();
        super.layoutChildren();
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYHg() throws Exception {
        super.zzYHg();
        if (zzYG7()) {
            zzZ11.zzT(this);
        }
    }

    @Override // com.aspose.words.zzZ13
    public final void zzZ(zzZ13 zzz13) {
        if (this.zzY2k.zzQw().size() > 0) {
            zzYZP zzyzp = new zzYZP(zzYGj(), Character.toString(this.zzY2n.zzYEP()), zzYGl());
            com.aspose.words.internal.zzZQG.zzZ(this.zzY2j, zzyzp);
            this.zzY2k.zzZ(zzyzp);
        }
        this.zzY2k.zzZ(zzz13);
    }

    private static void zzZ(float f, zzZ13 zzz13) throws Exception {
        if (zzz13 == null || com.aspose.words.internal.zzAN.zzf(f)) {
            return;
        }
        zzz13.scale(1.0f, zzz13.zzZj().getHeight() == 0.0f ? 1.0f : f / zzz13.zzZj().getHeight());
        zzz13.zzYp(f / 2.0f);
    }

    private void zzZ(com.aspose.words.internal.zzZG zzzg, boolean z, char c, zzZ13 zzz13) throws Exception {
        boolean z2 = zzYGY() > zzZr().getLineSpacingPoints() * 4.0f;
        float size = z2 ? zzZYh().getSize() * 0.04f : 0.0f;
        if (z2) {
            zzu(zzzg);
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzYGj().zzZMR().zzZ((com.aspose.words.internal.zzZL) zzzg);
        float fZzuT = zzuT(c);
        float fZzuS = zzuS(c);
        float f = z ? fZzuT : fZzuS;
        if (z) {
            fZzuT = fZzuS;
        }
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY((-zzzq4ZzZ.getX()) + f, (-zzzq4ZzZ.getY()) + size, 1);
        zzzg.zzY(zzp9);
        zzz13.zzYp((zzzq4ZzZ.getHeight() / 2.0f) + size);
        zzz13.zzI(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4ZzZ.getWidth() + fZzuT + f, zzzq4ZzZ.getHeight()));
        zzz13.zzYGn().zzX(zzzg);
        zzz13.zzY25 = false;
    }
}
