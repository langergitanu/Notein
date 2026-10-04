package com.aspose.words.internal;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRF {
    private long zz4N;
    private zzZRE zz4O;
    private long zz4P;
    private zzZOP zzN5;
    private zzY0 zzTA;
    boolean zz4R = false;
    boolean zz4Q = false;

    private void zzLh() throws IOException {
        if (this.zz4Q) {
            return;
        }
        try {
            byte[] bArr = new byte[8];
            this.zzTA.zzX(bArr, 8);
            if (bArr[0] != -119 || bArr[1] != 80 || bArr[2] != 78 || bArr[3] != 71 || bArr[4] != 13 || bArr[5] != 10 || bArr[6] != 26 || bArr[7] != 10) {
                throw new IOException("Bad PNG signature!");
            }
            if (this.zzTA.zzXc() != 13) {
                throw new IOException("Bad length for IHDR chunk!");
            }
            if (this.zzTA.zzXc() != 1229472850) {
                throw new IOException("Bad type for IHDR chunk!");
            }
            this.zz4O = new zzZRE();
            int iZzXc = this.zzTA.zzXc();
            int iZzXc2 = this.zzTA.zzXc();
            this.zzTA.zzX(bArr, 5);
            int i = bArr[0] & 255;
            int i2 = bArr[1] & 255;
            int i3 = bArr[2] & 255;
            int i4 = bArr[3] & 255;
            int i5 = bArr[4] & 255;
            zzZOP zzzop = this.zzN5;
            zzzop.zzH(zzzop.getPosition() + 4);
            if (iZzXc == 0) {
                throw new IOException("Image width == 0!");
            }
            if (iZzXc2 == 0) {
                throw new IOException("Image height == 0!");
            }
            if (i != 1 && i != 2 && i != 4 && i != 8 && i != 16) {
                throw new IOException("Bit depth must be 1, 2, 4, 8, or 16!");
            }
            if (i2 != 0 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 6) {
                throw new IOException("Color type must be 0, 2, 3, 4, or 6!");
            }
            if (i2 == 3 && i == 16) {
                throw new IOException("Bad color type/bit depth combination!");
            }
            if ((i2 == 2 || i2 == 6 || i2 == 4) && i != 8 && i != 16) {
                throw new IOException("Bad color type/bit depth combination!");
            }
            if (i3 != 0) {
                throw new IOException("Unknown compression method (not 0)!");
            }
            if (i4 != 0) {
                throw new IOException("Unknown filter method (not 0)!");
            }
            if (i5 != 0 && i5 != 1) {
                throw new IOException("Unknown interlace method (not 0 or 1)!");
            }
            zzZRE zzzre = this.zz4O;
            zzzre.zz4M = true;
            zzzre.zz4L = iZzXc;
            zzzre.zz4K = iZzXc2;
            zzzre.zz4J = i;
            zzzre.zz4I = i2;
            zzzre.zz4H = i3;
            zzzre.zz4G = i4;
            zzzre.zz4F = i5;
            this.zz4R = true;
        } catch (Exception e) {
            throw new IOException("I/O error reading PNG header!", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033 A[PHI: r3
      0x0033: PHI (r3v3 int) = (r3v1 int), (r3v2 int) binds: [B:19:0x0031, B:22:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzRA(int i) throws Exception {
        int i2;
        zzZRE zzzre = this.zz4O;
        if (zzzre.zz4E || (i2 = zzzre.zz4I) == 0) {
            return;
        }
        int i3 = 4;
        if (i2 == 4) {
            return;
        }
        byte[] bArr = new byte[i];
        this.zzTA.zzX(bArr, i);
        int iMin = i / 3;
        zzZRE zzzre2 = this.zz4O;
        if (zzzre2.zz4I == 3) {
            int i4 = 1 << zzzre2.zz4J;
            if (iMin > i4) {
                iMin = i4;
            }
            iMin = Math.min(iMin, i4);
        }
        int i5 = 16;
        if (iMin > 16) {
            i3 = 256;
        } else if (iMin > 4) {
            i3 = i5;
        } else {
            i5 = 2;
            if (iMin <= 2) {
            }
        }
        zzZRE zzzre3 = this.zz4O;
        zzzre3.zz4E = true;
        zzzre3.zz4D = new byte[i3];
        zzzre3.zz4C = new byte[i3];
        zzzre3.zz4B = new byte[i3];
        int i6 = 0;
        for (int i7 = 0; i7 < iMin; i7++) {
            zzZRE zzzre4 = this.zz4O;
            zzzre4.zz4D[i7] = bArr[i6];
            int i8 = i6 + 2;
            zzzre4.zz4C[i7] = bArr[i6 + 1];
            i6 += 3;
            zzzre4.zz4B[i7] = bArr[i8];
        }
    }

    private void zzRz(int i) throws Exception {
        zzZRE zzzre = this.zz4O;
        int i2 = zzzre.zz4I;
        if (i2 == 3) {
            if (!zzzre.zz4E) {
                return;
            }
            int length = zzzre.zz4D.length;
            if (i <= length) {
                length = i;
            }
            byte[] bArr = new byte[length];
            zzzre.zz4u = bArr;
            zzzre.zz4z = 3;
            this.zzTA.zzX(bArr, length);
            zzZOP zzzop = this.zzN5;
            zzzop.zzH(zzzop.getPosition() + ((long) (i - length)));
        } else if (i2 == 0) {
            if (i != 2) {
                zzZOP zzzop2 = this.zzN5;
                zzzop2.zzH(zzzop2.getPosition() + ((long) i));
                return;
            } else {
                zzzre.zz4v = this.zzTA.zzXa() & 65535;
                this.zz4O.zz4z = 0;
            }
        } else {
            if (i2 != 2) {
                return;
            }
            if (i != 6) {
                zzZOP zzzop3 = this.zzN5;
                zzzop3.zzH(zzzop3.getPosition() + ((long) i));
                return;
            }
            zzzre.zz4w = this.zzTA.zzXa() & 65535;
            this.zz4O.zz4x = this.zzTA.zzXa() & 65535;
            this.zz4O.zz4y = this.zzTA.zzXa() & 65535;
            this.zz4O.zz4z = 2;
        }
        this.zz4O.zz4A = true;
    }

    private void zzlK() throws IOException {
        int iZzXc;
        int iZzXc2;
        if (this.zz4Q) {
            return;
        }
        zzLh();
        if (this.zz4O.zz4I == 3) {
            do {
                try {
                    int iZzXc3 = this.zzTA.zzXc();
                    iZzXc = this.zzTA.zzXc();
                    if (iZzXc3 < 0) {
                        throw new IOException("Invalid chunk lenght " + iZzXc3);
                    }
                    try {
                        long position = this.zzN5.getPosition();
                        zzZOP zzzop = this.zzN5;
                        long j = iZzXc3;
                        zzzop.zzH(zzzop.getPosition() + j);
                        iZzXc2 = this.zzTA.zzXc();
                        this.zzN5.zzH(position);
                        switch (iZzXc) {
                            case 1229209940:
                                zzZOP zzzop2 = this.zzN5;
                                zzzop2.zzH(zzzop2.getPosition() - 8);
                                this.zz4N = this.zzN5.getPosition();
                                break;
                            case 1347179589:
                                zzRA(iZzXc3);
                                break;
                            case 1649100612:
                            case 1665684045:
                            case 1732332865:
                            case 1749635924:
                            case 1883789683:
                            case 1933723988:
                            case 1934642260:
                            case 1934772034:
                            case 1950701684:
                            case 1950960965:
                            case 2052348020:
                                zzZOP zzzop3 = this.zzN5;
                                zzzop3.zzH(zzzop3.getPosition() + j);
                                break;
                            case 1951551059:
                                zzRz(iZzXc3);
                                break;
                            default:
                                byte[] bArr = new byte[iZzXc3];
                                this.zzTA.zzX(bArr, iZzXc3);
                                StringBuilder sb = new StringBuilder(4);
                                sb.append((char) (iZzXc >>> 24));
                                sb.append((char) ((iZzXc >> 16) & 255));
                                sb.append((char) ((iZzXc >> 8) & 255));
                                sb.append((char) (iZzXc & 255));
                                this.zz4O.zz4t.add(sb.toString());
                                this.zz4O.zz4s.add(bArr);
                                break;
                        }
                    } catch (EOFException unused) {
                        return;
                    } catch (IOException unused2) {
                        throw new IOException("Invalid chunk length " + iZzXc3);
                    }
                } catch (Exception e) {
                    throw new IOException("Error reading PNG metadata", e);
                }
            } while (iZzXc2 == this.zzTA.zzXc());
            throw new IOException("Failed to read a chunk of type " + iZzXc);
        }
        this.zz4Q = true;
    }

    public final boolean hasAlpha() throws IOException {
        zzlK();
        zzZRE zzzre = this.zz4O;
        int i = zzzre.zz4I;
        if (i == 0) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return i == 4;
            }
            if (zzzre.zz4A && zzzre.zz4u != null) {
                return true;
            }
        }
        return false;
    }

    public final void zzZL(zzZOP zzzop) throws Exception {
        this.zz4R = false;
        this.zz4Q = false;
        this.zzN5 = zzzop;
        if (zzzop == null) {
            throw new IllegalArgumentException("Stream cannot be null or empty");
        }
        this.zz4P = zzzop.getPosition();
        this.zzTA = new zzY0(this.zzN5);
    }
}
