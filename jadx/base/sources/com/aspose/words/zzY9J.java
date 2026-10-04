package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9J {
    private static byte[] zzXb4 = {1, 1, 2, 4, 2, 2, 0, 3};
    static boolean zzZtG = false;
    private com.aspose.words.internal.zzZOX zzW6;
    private zzY9J zzXb5;
    private boolean zzXb6 = true;
    private com.aspose.words.internal.zzZOX zzXb7;
    private zzZ97 zzXb8;
    private int zzZD8;

    public zzY9J(zzZ97 zzz97, com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzzor.setLength(1024L);
        this.zzW6 = new com.aspose.words.internal.zzZOX(zzzor);
        this.zzXb8 = zzz97;
        this.zzXb7 = zzzox;
        this.zzZD8 = i;
    }

    private int zzG(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        if (i == 0) {
            return zzZRA.zzDL(this.zzZD8) ? 0 : 1;
        }
        int iZzlm = (zzZRA.zzDL(this.zzZD8) && zzY9L.zzlo(i)) ? zzlm(i) : zzln(i);
        if (iZzlm != 0) {
            return iZzlm;
        }
        if (i != 50709) {
            return (i == 54790 || i == 54792) ? (zzzox.zzX9() & 65535) - 1 : zzzox.readByte() & 255;
        }
        int i2 = zzzox.readByte() & 255;
        if (i2 != 255) {
            return i2;
        }
        throw new IllegalStateException("Complex custom tab stops with tolerance encountered.");
    }

    private boolean zzVC(int i, int i2) {
        if (i == 26182 && i2 == 0) {
            return true;
        }
        return i == 25707 && this.zzXb6;
    }

    private static int zzlm(int i) {
        if (i == 73) {
            return 3;
        }
        if (i == 74) {
            return 0;
        }
        if (i == 110) {
            return 2;
        }
        if (i == 111) {
            return 1;
        }
        switch (i) {
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                return 2;
            default:
                switch (i) {
                    case 64:
                    case 68:
                    case 79:
                    case 113:
                    case 116:
                    case 133:
                    case 179:
                    case 191:
                        return 0;
                    case 93:
                        return 2;
                    case 193:
                        return 5;
                    case 197:
                        return 12;
                    default:
                        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected Word60 sprm {0}.", Integer.valueOf(i)));
                }
        }
    }

    private static int zzln(int i) {
        return zzXb4[(i & 57344) >> 13] & 255;
    }

    public final void zzQm(boolean z) {
        this.zzXb6 = z;
    }

    public final boolean zzXK(byte[] bArr) throws Exception {
        int iZzlp;
        int iZzlq;
        int i;
        com.aspose.words.internal.zzZOP zzzop;
        if (bArr == null || bArr.length == 0) {
            return true;
        }
        if (zzZtG) {
            com.aspose.words.internal.zzZKN.format("{{GRPPRL: {0}}}", com.aspose.words.internal.zzZ1.zzY(bArr));
        }
        com.aspose.words.internal.zzZOP zzzopZzq = this.zzW6.zzq();
        zzzopZzq.zzH(0L);
        zzzopZzq.write(bArr, 0, bArr.length);
        zzzopZzq.zzH(0L);
        int i2 = 0;
        boolean z = true;
        while (zzzopZzq.getPosition() < bArr.length) {
            if (!com.aspose.words.internal.zzZYQ.zzT(this.zzW6, zzZRA.zzDL(this.zzZD8) ? 1 : 2)) {
                return false;
            }
            int position = (int) zzzopZzq.getPosition();
            if (zzZRA.zzDL(this.zzZD8)) {
                i = this.zzW6.readByte() & 255;
                iZzlq = zzY9L.zzlq(i);
                iZzlp = zzY9L.zzlp(i);
            } else {
                short sZzX9 = this.zzW6.zzX9();
                iZzlp = sZzX9 & 65535;
                iZzlq = (sZzX9 & 7168) >> 10;
                i = 0;
            }
            int iZzG = zzG(this.zzW6, iZzlp);
            if (zzZtG) {
                byte[] bArr2 = new byte[iZzG];
                long position2 = zzzopZzq.getPosition();
                zzzopZzq.read(bArr2, 0, iZzG);
                zzzopZzq.zzH(position2);
                Integer numValueOf = Integer.valueOf(iZzlp);
                if (!zzZRA.zzDL(this.zzZD8)) {
                    i = iZzlp;
                }
                com.aspose.words.internal.zzZKN.format("{0} (0x{1:X}:{2})", numValueOf, Integer.valueOf(i), Integer.valueOf(iZzG));
                com.aspose.words.internal.zzZ1.zzY(bArr2);
            }
            if (zzVC(iZzlp, i2)) {
                int iZzXc = this.zzW6.zzXc();
                if (iZzXc >= 0) {
                    zzZLN zzzlnZzI = zzYNJ.zzI(this.zzXb7, iZzXc);
                    if (this.zzXb5 == null) {
                        this.zzXb5 = new zzY9J(this.zzXb8, this.zzXb7, this.zzZD8);
                    }
                    this.zzXb5.zzXb6 = this.zzXb6;
                    if (zzzlnZzI.getData().length != 0 && this.zzXb5.zzXK(zzzlnZzI.getData())) {
                        zzzopZzq.zzH(bArr.length);
                    }
                }
                zzzop = zzzopZzq;
            } else {
                int position3 = (int) zzzopZzq.getPosition();
                int i3 = position3 + iZzG;
                if (!this.zzXb8.zzZ(iZzlp, iZzlq, iZzG, this.zzW6)) {
                    if (zzZtG) {
                        com.aspose.words.internal.zzZKN.format("Found undocumented SPRM:{0:X} parameter length:{1}, sprm: {2}.", Integer.valueOf(iZzlp), Integer.valueOf(iZzG), com.aspose.words.internal.zzZ1.zzZ(bArr, position, Math.min(i3 - position, bArr.length - position)));
                    }
                    z = false;
                }
                zzzop = zzzopZzq;
                long j = i3;
                if (zzzopZzq.getPosition() != j) {
                    long j2 = position3;
                    if (zzzop.getPosition() == j2) {
                        zzzop.zzH(j);
                    } else if (iZzlp != 54802 && iZzlp != 54896 && iZzlp != 50701 && iZzlp != 51825) {
                        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Incorrectly read SPRM:{0:X}. Expected {1}, but read {2} bytes.", Integer.valueOf(iZzlp), Integer.valueOf(iZzG), Long.valueOf(zzzop.getPosition() - j2)));
                    }
                } else {
                    continue;
                }
            }
            i2++;
            zzzopZzq = zzzop;
        }
        return z;
    }
}
