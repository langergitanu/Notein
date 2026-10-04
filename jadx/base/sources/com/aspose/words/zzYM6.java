package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYM6 {
    private int zzXFm;
    private int zzXNc;

    public zzYM6() {
        this(-1, 0);
    }

    private int zzYnI() {
        return this.zzXNc != 2 ? 0 : 1;
    }

    public final String toString() {
        return com.aspose.words.internal.zzZKN.format("PathType: {0}, Count: {1}", Integer.valueOf(this.zzXNc), Integer.valueOf(this.zzXFm));
    }

    public final int zzYnH() {
        int i = this.zzXNc;
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2 || i == 3 || i == 4) {
            return 0;
        }
        switch (i) {
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
                return 1;
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
                return 0;
            case 181:
            case 182:
                return 1;
            default:
                throw new IllegalStateException("Unrecognized command in geometry path.");
        }
    }

    public final int zzYnJ() {
        return (zzYnH() * this.zzXFm) + zzYnI();
    }

    public final int zzYnK() {
        return this.zzXFm;
    }

    public final int zzYnL() {
        return this.zzXNc;
    }

    public zzYM6(int i, int i2) {
        this.zzXNc = i;
        this.zzXFm = i2;
    }
}
