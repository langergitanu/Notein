package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzJZ implements zzZAK, Cloneable {
    private int zzWz;
    private String zzZi;
    private long zzZj6;
    private zzZAK zzZj7;
    private zzZAK zzZj8;
    private zzJZ zzZj9;
    private int zzZja;
    private int zzTL = Integer.MIN_VALUE;
    private int zzZj5 = zzZ1N.zzR(zzZSU(), zzFP());

    public zzJZ(zzJX zzjx, int i, int i2) {
        this.zzWz = zzjx.getStart() + i;
        this.zzZja = (r0 + zzZ(zzjx, i, i2)) - 1;
        this.zzZi = zzjx.getText();
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private char zzFP() {
        return this.zzZja + 1 < this.zzZi.length() ? this.zzZi.charAt(this.zzZja + 1) : ControlChar.LINE_BREAK_CHAR;
    }

    private zzJZ zzLU(int i) {
        if (i >= getLength()) {
            return null;
        }
        zzJZ zzjzZzZT6 = zzZT6();
        if (zzZT0()) {
            int i2 = zzjzZzZT6.zzZja - i;
            zzjzZzZT6.zzZja = i2;
            this.zzWz = i2 + 1;
            return zzjzZzZT6;
        }
        int i3 = zzjzZzZT6.zzWz + i;
        zzjzZzZT6.zzWz = i3;
        this.zzZja = i3 - 1;
        return zzjzZzZT6;
    }

    private void zzW(zzJZ zzjz) {
        if (isLinked() || zzjz.isLinked()) {
            return;
        }
        int i = this.zzZja + 1;
        int i2 = zzjz.zzWz;
        if (i == i2) {
            this.zzZja = zzjz.zzZja;
            zzjz.zzTL = Integer.MIN_VALUE;
        }
        if (this.zzWz - 1 == zzjz.zzZja) {
            this.zzWz = i2;
            zzjz.zzTL = Integer.MIN_VALUE;
        }
    }

    private char zzZSU() {
        int i = this.zzWz;
        return i > 0 ? this.zzZi.charAt(i - 1) : ControlChar.LINE_BREAK_CHAR;
    }

    private zzJZ zzZT6() {
        zzJZ zzjz = (zzJZ) memberwiseClone();
        zzjz.zzZj9 = null;
        zzjz.zzTL = Integer.MIN_VALUE;
        return zzjz;
    }

    public final int getEnd() {
        return this.zzZja;
    }

    @Override // com.aspose.words.zzZAK
    public final int getIndex() {
        return this.zzTL;
    }

    public final int getLength() {
        return (this.zzZja - this.zzWz) + 1;
    }

    public abstract int getPriority();

    public final int getStart() {
        return this.zzWz;
    }

    public final String getText() {
        return this.zzZi;
    }

    public abstract int getType();

    public final boolean isLinked() {
        return this.zzZj9 != null;
    }

    public boolean isValid() {
        return true;
    }

    @Override // com.aspose.words.zzZAK
    public final void setIndex(int i) {
        this.zzTL = i;
    }

    public final boolean zzX(zzJZ zzjz) {
        return this.zzZja < zzjz.zzWz;
    }

    public final zzJZ zzY(zzJZ zzjz) {
        if (isLinked()) {
            zzZT8();
        }
        if (zzjz.isLinked()) {
            zzjz.zzZT8();
        }
        this.zzZj9 = zzjz;
        zzjz.zzZj9 = this;
        int iMin = Math.min(getLength(), zzjz.getLength());
        zzJZ zzjzZzLU = zzLU(iMin);
        if (zzjzZzLU != null) {
            return zzjzZzLU;
        }
        zzJZ zzjzZzLU2 = zzjz.zzLU(iMin);
        if (zzjzZzLU2 != null) {
            return zzjzZzLU2;
        }
        return null;
    }

    @Override // com.aspose.words.zzZAK
    public final void zzYg(long j) {
        this.zzZj6 = j;
    }

    public final void zzZ(zzZ4N zzz4n) {
        if (isLinked()) {
            zzJZ zzjzZzLU = zzZT0() ? this : this.zzZj9;
            zzJZ zzjzZzLU2 = zzZT0() ? this.zzZj9 : this;
            while (zzjzZzLU.isLinked() && zzjzZzLU.getLength() > zzb6()) {
                zzz4n.zzW(zzjzZzLU);
                zzjzZzLU = zzjzZzLU.zzLU(zzb6());
                zzz4n.zzU(zzjzZzLU);
                zzz4n.zzW(zzjzZzLU2);
                zzjzZzLU2 = zzjzZzLU2.zzLU(zzb6());
                zzz4n.zzT(zzjzZzLU2);
                if (zzjzZzLU.zzZ(zzjzZzLU2)) {
                    zzjzZzLU.zzY(zzjzZzLU2);
                } else {
                    zzZAK zzzak = zzjzZzLU.zzZj7;
                    if (zzzak != null) {
                        zzjzZzLU.zzW((zzJZ) zzzak);
                    }
                    zzZAK zzzak2 = zzjzZzLU2.zzZj8;
                    if (zzzak2 != null) {
                        zzjzZzLU2.zzW((zzJZ) zzzak2);
                    }
                }
                zzz4n.zzW(zzjzZzLU2);
            }
        }
    }

    public abstract boolean zzZ(zzJZ zzjz);

    public final boolean zzZSV() {
        return zzZ1N.zzS(zzZSU(), zzFP());
    }

    public final boolean zzZSW() {
        return zzZ1N.zzZu(this.zzZi, this.zzWz);
    }

    public final int zzZSX() {
        return this.zzZj5;
    }

    public final zzJZ zzZSY() {
        return this.zzZj9;
    }

    public final boolean zzZSZ() {
        return this.zzZj9.zzX(this);
    }

    public final boolean zzZT0() {
        return zzX(this.zzZj9);
    }

    @Override // com.aspose.words.zzZAK
    public final void zzZT1() {
        this.zzTL = Integer.MIN_VALUE;
    }

    @Override // com.aspose.words.zzZAK
    public final boolean zzZT2() {
        return this.zzTL == Integer.MIN_VALUE;
    }

    @Override // com.aspose.words.zzZAK
    public final long zzZT3() {
        return this.zzZj6;
    }

    @Override // com.aspose.words.zzZAK
    public final zzZAK zzZT4() {
        return this.zzZj7;
    }

    @Override // com.aspose.words.zzZAK
    public final zzZAK zzZT5() {
        return this.zzZj8;
    }

    public final zzJZ zzZT7() {
        zzZAK zzzak = this.zzZj7;
        if (zzzak == null) {
            return null;
        }
        zzJZ zzjz = (zzJZ) zzzak;
        if (zzjz.getType() == 8 && zzjz.zzZja + 1 == this.zzWz) {
            return zzjz;
        }
        return null;
    }

    public final void zzZT8() {
        zzJZ zzjz = zzZT0() ? this : this.zzZj9;
        zzJZ zzjz2 = zzZT0() ? this.zzZj9 : this;
        zzZAK zzzak = zzjz.zzZj7;
        if (zzzak != null) {
            zzjz.zzW((zzJZ) zzzak);
        }
        zzZAK zzzak2 = zzjz2.zzZj8;
        if (zzzak2 != null) {
            zzjz2.zzW((zzJZ) zzzak2);
        }
        zzjz.zzZj9 = null;
        zzjz2.zzZj9 = null;
    }

    public final zzJZ zzZT9() {
        if (zzb9()) {
            return this;
        }
        for (zzJZ zzjz = (zzJZ) this.zzZj8; zzjz != null; zzjz = (zzJZ) zzjz.zzZj8) {
            if (zzjz.zzb9()) {
                return zzjz;
            }
        }
        return null;
    }

    public abstract int zzb6();

    public abstract int zzb7();

    public abstract zzYI zzb8();

    public abstract boolean zzb9();

    public zzJZ zzba() {
        zzJZ zzjz = (zzJZ) this.zzZj7;
        while (zzjz != null) {
            if (!zzZT2()) {
                if (zzjz.isLinked()) {
                    if (zzjz.zzZSZ() && getPriority() <= zzjz.getPriority()) {
                        zzjz = zzjz.zzZj9;
                    }
                } else if (zzjz.zzZ(this)) {
                    return zzjz;
                }
            }
            zzjz = (zzJZ) zzjz.zzZj7;
        }
        return null;
    }

    @Override // com.aspose.words.zzZAK
    public final void zzY(zzZAK zzzak) {
        this.zzZj7 = zzzak;
    }

    private static int zzZ(zzJX zzjx, int i, int i2) {
        char cCharAt = zzjx.zz9C().charAt(i);
        int iMin = Math.min(zzjx.zz9C().length() - i, i2);
        int i3 = 0;
        while (i3 < iMin && zzjx.zz9C().charAt(i + i3) == cCharAt) {
            i3++;
        }
        return i3;
    }

    @Override // com.aspose.words.zzZAK
    public final void zzZ(zzZAK zzzak) {
        this.zzZj8 = zzzak;
    }
}
