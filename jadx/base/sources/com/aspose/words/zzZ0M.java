package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzZ0M extends zzZ13 {
    private float zzY1a;
    private float zzY1b;
    private int[] zzY1c;
    private float[] zzY1d;
    private float[] zzY1e;
    private float[] zzY1f;
    private int zzii;

    public zzZ0M(zzZ14 zzz14, OfficeMath officeMath) {
        this(zzz14, officeMath, ((zzZ07) officeMath.zzZsL()).zzYEI().getCount());
    }

    private void zzYFp() throws Exception {
        if (zzYGk().zzZsL().getMathObjectType() == 19 || zzYGk().zzZsL().getMathObjectType() == 9) {
            int iIntValue = ((Integer) zzYGk().zzZsL().zzPj(15230)).intValue();
            if (iIntValue == 0) {
                zzYp(zzQw().get(0).zzYGq());
            } else {
                if (iIntValue != 1) {
                    return;
                }
                zzZ13 zzz13 = zzQw().get(zzQw().size() - 1);
                zzYp(zzZj().getHeight() - (zzz13.zzZj().getHeight() - zzz13.zzYGq()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static float zzr(OfficeMath officeMath) {
        int iZzYF1;
        float f;
        int iZzYF0;
        int mathObjectType = officeMath.zzZsL().getMathObjectType();
        if (mathObjectType == 1) {
            iZzYF1 = 1;
            f = 0.0f;
        } else {
            if (mathObjectType == 19) {
                zzZ07 zzz07 = (zzZ07) officeMath.zzZsL();
                iZzYF1 = zzz07.zzYF1();
                iZzYF0 = zzz07.zzYF0();
            } else if (mathObjectType != 9) {
                iZzYF1 = 0;
                if (mathObjectType == 10) {
                    zzZ0B zzz0b = (zzZ0B) officeMath.zzZsL();
                    if (zzz0b.zzYEN() == 0 || zzz0b.zzYEN() == 2) {
                    }
                }
                f = 0.0f;
            } else {
                zzZ0G zzz0g = (zzZ0G) officeMath.zzZsL();
                iZzYF1 = zzz0g.zzYF1();
                iZzYF0 = zzz0g.zzYF0();
            }
            f = iZzYF0;
        }
        float size = (float) (((double) officeMath.zzZYh().getSize()) / 2.0d);
        if (iZzYF1 == 1) {
            return size * 0.5f;
        }
        if (iZzYF1 == 2) {
            return size;
        }
        if (iZzYF1 == 3) {
            return ((float) (((double) f) / 20.0d)) / 2.0f;
        }
        if (iZzYF1 == 4 && !com.aspose.words.internal.zzAN.zzf(f)) {
            return ((f / 2.0f) - 1.0f) * size;
        }
        return 0.0f;
    }

    private void zzs(OfficeMath officeMath) {
        if (officeMath.zzZsL().getMathObjectType() != 19) {
            return;
        }
        zzZ07 zzz07 = (zzZ07) officeMath.zzZsL();
        for (int i = 0; i < zzz07.zzYEI().getCount(); i++) {
            int horizontalAlignment = zzz07.zzYEI().zzuI(i).getHorizontalAlignment();
            int i2 = 2;
            if (horizontalAlignment != 1) {
                if (horizontalAlignment != 2) {
                    i2 = 3;
                    if (horizontalAlignment != 3) {
                        i2 = 0;
                    }
                } else {
                    i2 = 1;
                }
            }
            this.zzY1c[i] = i2;
            this.zzY1f[i] = zzz07.zzYEJ();
        }
    }

    private static float zzt(OfficeMath officeMath) {
        float size = (float) (((double) officeMath.zzZYh().getSize()) / 2.0d);
        if (officeMath.zzZsL().getMathObjectType() == 19) {
            zzZ07 zzz07 = (zzZ07) officeMath.zzZsL();
            int iZzYEK = zzz07.zzYEK();
            if (iZzYEK == 1) {
                return size * 1.5f;
            }
            if (iZzYEK == 2) {
                return size * 2.0f;
            }
            if (iZzYEK == 3) {
                return ((float) (((double) zzz07.zzYEL()) / 20.0d)) / 2.0f;
            }
            if (iZzYEK == 4) {
                return (size * zzz07.zzYEL()) / 2.0f;
            }
        }
        return size;
    }

    public final int getColumnsCount() {
        return this.zzii;
    }

    @Override // com.aspose.words.zzZ13
    public void layoutChildren() throws Exception {
        zzYHc();
        Iterator<zzZ13> it = zzQw().iterator();
        while (it.hasNext()) {
            ((zzZ0L) it.next()).zzZE4();
        }
    }

    public final void zzX(float f, float f2, int i) {
        if (Float.isNaN(f2)) {
            float[] fArr = this.zzY1e;
            float f3 = f / 2.0f;
            fArr[i] = Math.max(fArr[i], f3);
            float[] fArr2 = this.zzY1d;
            fArr2[i] = Math.max(fArr2[i], f3);
        } else {
            float[] fArr3 = this.zzY1e;
            fArr3[i] = Math.max(fArr3[i], f2);
            float[] fArr4 = this.zzY1d;
            fArr4[i] = Math.max(fArr4[i], f - f2);
        }
        float[] fArr5 = this.zzY1f;
        fArr5[i] = Math.max(fArr5[i], this.zzY1e[i] + this.zzY1d[i]);
    }

    public final int[] zzYFm() {
        return this.zzY1c;
    }

    public final float zzYFn() {
        return this.zzY1a;
    }

    public final float zzYFo() {
        return this.zzY1b;
    }

    @Override // com.aspose.words.zzZ13
    public final boolean zzYGs() {
        return false;
    }

    public void zzYHc() throws Exception {
        Iterator<zzZ13> it = zzQw().iterator();
        while (it.hasNext()) {
            ((zzZ0L) it.next()).layoutChildren();
        }
    }

    @Override // com.aspose.words.zzZ13
    public void zzYHg() throws Exception {
        layoutChildren();
        float width = zzZj().getWidth();
        float height = zzZj().getHeight();
        int i = 0;
        while (i < zzQw().size()) {
            zzZ13 zzz13 = zzQw().get(i);
            zzYGn().zzX((com.aspose.words.internal.zzZL) zzz13.zzYGn());
            if (zzz13.zzYGn().zzZO() == null) {
                com.aspose.words.internal.OooO0O0.OooO00o(zzz13.zzYGn());
            }
            float f = height + (i > 0 ? this.zzY1a : 0.0f);
            zzz13.zzYGn().zzZO().zzY(0.0f, f, 1);
            height = f + zzz13.zzZj().getHeight();
            width = zzz13.zzZj().getWidth();
            i++;
        }
        zzI(new com.aspose.words.internal.zzZQ4(zzZj().getX(), zzZj().getY(), width, height));
        zzYGB();
        zzYFp();
    }

    public final void zzYi(float f) {
        this.zzY1a = f;
    }

    public final void zzYj(float f) {
        this.zzY1b = f;
    }

    public final float zzuG(int i) {
        return this.zzY1e[i];
    }

    public final float zzuH(int i) {
        return this.zzY1f[i];
    }

    public zzZ0M(zzZ14 zzz14, OfficeMath officeMath, int i) {
        super(zzz14, officeMath);
        this.zzY1c = null;
        this.zzii = i;
        this.zzY1f = new float[i];
        this.zzY1d = new float[i];
        this.zzY1e = new float[i];
        this.zzY1c = new int[i];
        zzs(officeMath);
        this.zzY1b = zzt(officeMath);
        this.zzY1a = zzr(officeMath);
    }
}
