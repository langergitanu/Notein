package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ24 implements Comparable<zzZ24> {
    private int zzKF;
    private int zzY43;
    private int zzY44 = -1;
    private zzY4T zzY45;
    protected boolean zzY46;
    boolean zzY47;

    public zzZ24(zzY4T zzy4t) {
        this.zzY45 = zzy4t;
    }

    private boolean zzS(zzZ24 zzz24) {
        if (this.zzY44 != zzz24.zzY44) {
            return false;
        }
        int i = this.zzY43;
        int i2 = zzz24.zzY43;
        return i < i2 ? zzYIX().length() + i == zzz24.zzY43 : zzz24.zzYIX().length() + i2 == this.zzY43;
    }

    private void zzYIC() {
        this.zzY44 = this.zzY45.zzXUP();
        this.zzY43 = this.zzY45.zzXUQ().length();
        com.aspose.words.internal.zzZNH.zzU(this.zzY45.zzXUQ(), zzYIX());
    }

    public final void close() {
        int iZzXUP = this.zzY45.zzXUP();
        StringBuilder sbZzXUQ = this.zzY45.zzXUQ();
        int iZzQ = com.aspose.words.internal.zzZYD.zzQ(sbZzXUQ);
        while (iZzQ == -1 && iZzXUP > 0) {
            iZzXUP--;
            sbZzXUQ = this.zzY45.zzju(iZzXUP);
            iZzQ = com.aspose.words.internal.zzZYD.zzQ(sbZzXUQ);
        }
        sbZzXUQ.insert(iZzQ + 1, zzYIW());
        this.zzY44 = -1;
        this.zzKF = 0;
    }

    public final int getState() {
        return this.zzKF;
    }

    public final String getString() {
        return com.aspose.words.internal.zzZKN.format("{0}, {1}:{2}", zzYIX(), Integer.valueOf(this.zzY45.zzXUP()), Integer.valueOf(this.zzY45.zzXUQ().length()));
    }

    public final boolean isOpened() {
        return this.zzY44 != -1;
    }

    public final void open() {
        if (this.zzY45.zzXUQ().length() > 0 && com.aspose.words.internal.zzZYD.zzS(this.zzY45.zzXUQ())) {
            this.zzY45.zzXUQ().insert(0, '`');
            this.zzY45.zzXUQ().append('`');
        }
        zzYIC();
    }

    public final void zzIE(String str) {
        if (isOpened()) {
            StringBuilder sbZzju = this.zzY45.zzju(this.zzY44);
            int i = this.zzY43;
            sbZzju.delete(i, str.length() + i);
            sbZzju.insert(this.zzY43, str);
        }
    }

    public final boolean zzT(zzZ24 zzz24) {
        return zzYIX().charAt(0) == zzz24.zzYIX().charAt(0);
    }

    public final void zzTp(boolean z) {
        this.zzY44 = -1;
        this.zzKF = z ? 1 : 0;
    }

    public final boolean zzU(zzZ24 zzz24) {
        if (zzz24 == null || !isOpened() || !zzz24.isOpened() || !zzS(zzz24)) {
            return false;
        }
        zzZ24 zzz242 = compareTo(zzz24) < 0 ? this : zzz24;
        if (zzz242 != this) {
            zzz24 = this;
        }
        StringBuilder sbZzju = this.zzY45.zzju(zzz24.zzY44);
        int i = zzz24.zzY43;
        sbZzju.delete(i, zzz24.zzYIX().length() + i);
        sbZzju.insert(zzz24.zzY43, zzz242.zzYIX());
        int i2 = zzz242.zzY43;
        sbZzju.delete(i2, zzz242.zzYIX().length() + i2);
        sbZzju.insert(zzz242.zzY43, zzz24.zzYIX());
        int i3 = zzz242.zzY43;
        zzz242.zzY43 = zzz24.zzY43;
        zzz24.zzY43 = i3;
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzZ24 zzz24) {
        if (com.aspose.words.internal.zzZKO.zzA(this, zzz24)) {
            return 0;
        }
        int i = this.zzY44;
        int i2 = zzz24.zzY44;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = this.zzY43;
        int i4 = zzz24.zzY43;
        if (i3 < i4) {
            return -1;
        }
        return i3 > i4 ? 1 : 0;
    }

    public abstract boolean zzW(zzZ9G zzz9g);

    public final int zzYIA() {
        int i = this.zzY43;
        int i2 = i - 1;
        int length = zzYIX().length() + i;
        StringBuilder sbZzju = this.zzY45.zzju(this.zzY44);
        char cCharAt = ControlChar.LINE_BREAK_CHAR;
        char cCharAt2 = i2 < 0 ? (char) 11 : sbZzju.charAt(i2);
        if (length < sbZzju.length()) {
            cCharAt = sbZzju.charAt(length);
        }
        return zzZ1N.zzR(cCharAt2, cCharAt);
    }

    public final boolean zzYIB() {
        return this.zzKF == 1 && !isOpened();
    }

    public abstract String zzYIW();

    public abstract String zzYIX();

    public boolean zzYIY() {
        return false;
    }

    public final void zzV(zzZ9G zzz9g) {
        boolean zZzW = zzW(zzz9g);
        this.zzKF = (zZzW != this.zzY46 || zzYIB()) ? zZzW ? 1 : 2 : 0;
        this.zzY46 = zZzW;
    }
}
