package com.aspose.words;

import androidx.transition.C22101OooOOOo;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0K extends zzZ13 {
    private static char[] zzY10 = {'(', ')', ',', FilenameUtils.EXTENSION_SEPARATOR, ':', ';', '?', '[', IOUtils.DIR_SEPARATOR_WINDOWS, ']', '{', '}'};
    private zzZ04 zzY11;
    private zzZ18 zzY12;
    private zzZ13 zzY13;
    private zzZ13 zzY14;
    private zzZ13 zzY15;
    private float zzY1C;
    private float zzY1D;
    private zzZ13 zzY2k;

    public zzZ0K(zzZ14 zzz14, OfficeMath officeMath) throws Exception {
        super(zzz14, officeMath);
        this.zzY11 = (zzZ04) officeMath.zzZsL();
        this.zzY12 = new zzZ18(zzz14, officeMath);
        this.zzY15 = new zzZ13(zzz14, officeMath);
        this.zzY14 = new zzZ13(zzz14, officeMath);
        this.zzY13 = new zzZ13(zzz14, officeMath);
        this.zzY2k = new zzZ13(zzz14, officeMath);
        this.zzY1D = zzZ11.zzI(zzZr());
        this.zzY1C = zzZ11.zzH(zzZr());
        if (zzYF8()) {
            zzYFg();
        } else {
            zzYFh();
        }
    }

    private void zzI(zzYEF zzyef) throws Exception {
        this.zzY13.zzZ(new zzYZP(zzYGj(), Character.toString(this.zzY11.getCharacter()), zzyef));
        if (!zzYGb()) {
            zzZ11.zzW(this.zzY13, zzZr().zzPf(), zzZr().getAscentPoints() / 2.0f);
        }
        this.zzY13.zzZE4();
        if (zzYF5()) {
            float size = zzZYh().getSize() * 0.02f;
            zzZ11.zzY(this.zzY13, size);
            zzZ13 zzz13 = this.zzY13;
            zzz13.zzYp((zzz13.getHeight() / 2.0f) - size);
        }
    }

    private int zzO(int i, float f) throws Exception {
        float fZzX = zzX((37.789f * f) + 0.2892f, zzYG5());
        float fZzX2 = zzX((((double) f) * 26.94d) + 0.2484d, zzYG5());
        float height = this.zzY2k.getHeight() - this.zzY2k.zzYGq();
        return (this.zzY2k.zzYGq() >= fZzX || height >= fZzX * 1.22f) ? i + 2 : (this.zzY2k.zzYGq() >= fZzX2 || height >= fZzX2 * 1.22f) ? i + 1 : i;
    }

    private static float zzX(double d, float f) {
        return ((float) (((double) ((int) com.aspose.words.internal.zzZKQ.zzS(d, 0))) / 20.0d)) - f;
    }

    private boolean zzYF5() {
        return this.zzY11.getCharacter() == 8719 || this.zzY11.getCharacter() == 8721 || this.zzY11.getCharacter() == 8720;
    }

    private boolean zzYF6() {
        return this.zzY11.getCharacter() >= 8747 && this.zzY11.getCharacter() <= 8752;
    }

    private boolean zzYF7() {
        return isInline() || zzZ11.zzP(this);
    }

    private boolean zzYF8() {
        int iZzYEF = this.zzY11.zzYEF();
        if (iZzYEF == -1) {
            return zzYF6() || zzYF7();
        }
        if (iZzYEF != 0) {
            return zzYF7();
        }
        return true;
    }

    private void zzYF9() throws Exception {
        zzv(this.zzY15);
        if (!this.zzY11.zzYED() && !zzYF8()) {
            zzZ11.zzY(this.zzY15, zzZYh().getSize() * 0.13f);
        }
        if (!zzYF8() && !this.zzY11.zzYEE() && !zzYGb()) {
            zzZ11.zzW(this.zzY14, zzZr().getAscentPoints(), zzZr().getAscentPoints() / 2.0f);
        }
        zzv(this.zzY14);
        if (this.zzY11.zzYEE() || zzYF8()) {
            return;
        }
        zzZ11.zzZ(this.zzY14, zzZYh().getSize() * 0.02f);
    }

    private boolean zzYFa() {
        zzYZP zzyzp = (zzYZP) com.aspose.words.internal.zzZKW.zzZ(this.zzY2k.zzQw().get(0).zzQw().get(0), zzYZP.class);
        if (zzyzp == null || zzyzp.getText().length() <= 0) {
            return false;
        }
        return zzZ15.zzX(zzY10, zzyzp.getText().charAt(0));
    }

    private boolean zzYFb() {
        if (this.zzY2k.zzQw().size() == 0 || this.zzY2k.zzQw().get(0).zzQw().size() == 0) {
            return true;
        }
        return ((this.zzY2k.zzQw().get(0).zzQw().get(0) instanceof zzZ16) || zzYFa()) ? false : true;
    }

    private void zzYFc() {
        float size = zzZYh().getSize() * (((this.zzY11.zzYED() || zzZ11.zzP(this) || this.zzY12.zzYFn() - ((isInline() ? 0.01f : 0.085f) * ((float) zzZYh().getSize())) < this.zzY2k.getHeight()) && zzYFb()) ? 0.09f : 0.0f);
        if (zzYF6() && !zzYGb()) {
            float size2 = (zzYF7() ? 0.1f : 0.2f) * zzZYh().getSize();
            zzZ11.zzX(this.zzY14, -size2, 0.0f);
            size -= Math.min(size2, Math.max(this.zzY14.getWidth() - this.zzY15.getWidth(), 0.0f));
        }
        zzZ11.zzW(this.zzY12, size);
    }

    private void zzYFd() throws Exception {
        float height = ((this.zzY13.getHeight() - (this.zzY15.getHeight() - this.zzY15.zzYGq())) - this.zzY14.zzYGq()) - ((isInline() ? 0.04f : 0.03f) * zzZYh().getSize());
        if (isInline() && !zzYF6() && !this.zzY11.zzYEO()) {
            if (this.zzY11.zzYED() && this.zzY11.zzYEE()) {
                height = 0.0f;
            } else {
                float size = (((zzZYh().getSize() * 0.01f) + this.zzY13.getHeight()) - this.zzY14.getHeight()) - this.zzY15.getHeight();
                height = size > 0.0f ? Math.max(size, zzZYh().getSize() * 0.075f) : zzZYh().getSize() * 0.09f;
            }
        }
        if (height > 0.0f) {
            this.zzY12.zzYi(height);
        }
    }

    private void zzYFe() throws Exception {
        zzYFd();
        Iterator<zzZ13> it = this.zzY12.zzQw().iterator();
        while (it.hasNext()) {
            ((zzZ0L) it.next()).zzuF(2);
        }
        this.zzY12.zzZE4();
        zzYFc();
        this.zzY12.zzYp(this.zzY13.zzYGq() + this.zzY15.zzYGq());
        if (!isInline() || zzYF6() || this.zzY11.zzYEO()) {
            return;
        }
        zzZ18 zzz18 = this.zzY12;
        zzz18.zzYp(!com.aspose.words.internal.zzAN.zzf(zzz18.zzYFn()) ? this.zzY11.zzYED() ? this.zzY13.zzYGq() : Math.max(this.zzY15.getHeight(), this.zzY13.zzYGq()) : this.zzY12.getHeight() / 2.0f);
    }

    private void zzYFf() throws Exception {
        for (int i = 0; i < this.zzY12.zzQw().size(); i++) {
            ((zzZ0L) this.zzY12.zzQw().get(i)).zzuF(zzuE(i));
        }
        this.zzY12.zzZE4();
        zzZ11.zzW(this.zzY12, (this.zzY11.zzYED() ? 0.075f : 0.09f) * zzZYh().getSize());
        this.zzY12.zzYp((this.zzY13.zzZj().getHeight() / 2.0f) + this.zzY15.getHeight());
    }

    private void zzYFg() {
        this.zzY12.zzZ(this.zzY15);
        this.zzY12.zzZ(this.zzY14);
        super.zzZ(this.zzY13);
        super.zzZ(this.zzY12);
        super.zzZ(this.zzY2k);
    }

    private void zzYFh() {
        this.zzY12.zzZ(this.zzY15);
        this.zzY12.zzZ(this.zzY13);
        this.zzY12.zzZ(this.zzY14);
        super.zzZ(this.zzY12);
        super.zzZ(this.zzY2k);
    }

    private void zzYFi() throws Exception {
        zzYEF zzyef = (zzYEF) zzZYh().zzbn();
        boolean z = zzYF5() || zzYF6();
        zzyef.setName(z ? "Cambria Math" : "Symbol");
        if (this.zzY11.zzYEO()) {
            if (z) {
                zzyef.setSize((!zzYF8() || zzYF6()) ? zzyef.getSize() : zzyef.getSize() * 2);
            } else {
                zzyef.setSize((int) Math.max(this.zzY2k.getHeight() * 2.0f, zzZr().zzPg()));
            }
        }
        zzI(zzyef);
        if (z || !this.zzY11.zzYEO()) {
            return;
        }
        zzZ13 zzz13 = this.zzY13;
        zzZ11.zzX(zzz13, 0.0f, (-zzz13.getHeight()) / 4.0f);
    }

    private void zzYFj() throws Exception {
        if (zzYGb()) {
            zzYFi();
            return;
        }
        if (this.zzY11.zzYEO() && (isInline() || this.zzY2k.getHeight() >= zzZr().getLineSpacingPoints())) {
            zzYh(isInline() ? Math.max(this.zzY2k.getHeight() * 0.5f, zzZr().zzPg()) : zzZr().zzPg());
        } else if ((!isInline() || this.zzY11.zzYEO()) && !zzZ11.zzP(this)) {
            zzYh(zzZr().zzPg());
        } else {
            zzI(zzYGl());
        }
    }

    private void zzYh(float f) throws Exception {
        int iZzuD = zzuD(this.zzY11.getCharacter());
        if (com.aspose.words.internal.zzD4.zzWm(iZzuD) || !zzYGe()) {
            zzYEF zzyef = (zzYEF) zzZYh().zzbn();
            zzyef.setSize((int) (f * 2.0f));
            zzI(zzyef);
            return;
        }
        if (zzYF5() && !isInline() && this.zzY11.zzYEO()) {
            this.zzY2k.zzYGq();
            this.zzY2k.getHeight();
            this.zzY2k.zzYGq();
            iZzuD = zzO(iZzuD, f);
        }
        com.aspose.words.internal.zzZG zzzgZzZ = zzZ11.zzZ(iZzuD, zzYGf(), f, zzZy());
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzG0().zzZ((com.aspose.words.internal.zzZL) zzzgZzZ);
        float size = (zzYF6() ? 0.025f : 0.0125f) * zzZYh().getSize();
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY((-zzzq4ZzZ.getX()) + size, -zzzq4ZzZ.getY(), 1);
        zzzgZzZ.zzY(zzp9);
        this.zzY13.zzI(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4ZzZ.getWidth() + ((zzYF6() ? 0.09f : 0.055f) * zzZYh().getSize()), zzzq4ZzZ.getHeight()));
        this.zzY13.zzYGn().zzX(zzzgZzZ);
        this.zzY13.zzY25 = false;
    }

    private static int zzuD(int i) {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(8719, 3537, 8721, 3533);
        zzd4OooO0O0.set(8720, 4641);
        zzd4OooO0O0.set(8747, 3505);
        zzd4OooO0O0.set(8748, 3509);
        zzd4OooO0O0.set(8749, 3512);
        zzd4OooO0O0.set(8750, 3515);
        zzd4OooO0O0.set(8751, 3518);
        zzd4OooO0O0.set(8752, 3521);
        zzd4OooO0O0.set(8896, 4645);
        zzd4OooO0O0.set(8897, 4647);
        zzd4OooO0O0.set(8898, 4649);
        zzd4OooO0O0.set(8899, 4651);
        return zzd4OooO0O0.get(i);
    }

    private int zzuE(int i) {
        if (!zzYF6()) {
            return 1;
        }
        if (i != 0) {
            return i != 1 ? 2 : 1;
        }
        return 3;
    }

    private void zzv(zzZ13 zzz13) throws Exception {
        for (zzZ13 zzz132 : zzz13.zzQw()) {
            zzz132.zzZE4();
            if (!zzYGb()) {
                zzz132.scale(this.zzY1C, zzYq(this.zzY1D));
            }
        }
        zzz13.zzZE4();
    }

    @Override // com.aspose.words.zzZ13
    public final void layoutChildren() throws Exception {
        this.zzY2k.zzZE4();
        if (zzYGb() && !zzYF8()) {
            zzZ11.zzX(this.zzY2k, 0.0f, (-zzZYh().getSize()) * 0.1f);
        }
        zzYF9();
        zzYFj();
        if (zzYF8()) {
            zzYFe();
        } else {
            zzYFf();
        }
        super.layoutChildren();
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYGC() {
        zzZ11.zzQ(this);
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYGD() {
        if (getIndex() == 0) {
            return;
        }
        zzZ11.zzX(this, ((!zzYF8() || zzYF7()) ? 0.095f : 0.1f) * (zzYGc() ? 1.0f : 0.5f) * zzZYh().getSize());
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
        int mathObjectType = zzz13.zzYGk().zzZsL().getMathObjectType();
        if (mathObjectType == 24) {
            this.zzY14.zzZ(zzz13);
        } else if (mathObjectType != 25) {
            this.zzY2k.zzZ(zzz13);
        } else {
            this.zzY15.zzZ(zzz13);
        }
    }
}
