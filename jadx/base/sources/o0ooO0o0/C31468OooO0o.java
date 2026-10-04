package o0ooO0o0;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: o0ooO0o0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31468OooO0o extends OutputStream {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final OooO00o[] f112546Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final OooO00o[] f112548Oooo0oO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final byte[] f112549OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f112551OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f112552OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f112553OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int[] f112554OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int[] f112555OooOoo0;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final OutputStream f112562Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final OooO00o[] f112545Oooo0OO = new OooO00o[64];

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final OooO00o[] f112547Oooo0o0 = new OooO00o[40];

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f112550OooOo0o = 0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f112556OooOooO = 0;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f112557OooOooo = 0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f112559Oooo000 = 0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public byte f112560Oooo00O = 0;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public byte f112561Oooo00o = 0;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final int f112558Oooo0 = 1;

    /* JADX INFO: renamed from: o0ooO0o0.OooO0o$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f112563OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f112564OooO0O0;

        public OooO00o(int i, int i2) {
            this.f112563OooO00o = i;
            this.f112564OooO0O0 = i2;
        }
    }

    static {
        int i = 0;
        while (true) {
            short[][] sArr = C31469OooO0o0.f112566Oooo0OO;
            if (i >= 9) {
                break;
            }
            int i2 = i + 4;
            int i3 = 0;
            while (true) {
                short[] sArr2 = C31469OooO0o0.f112567Oooo0o[i];
                if (i3 < sArr2.length) {
                    short s = C31469OooO0o0.f112569Oooo0oO[i][i3];
                    short s2 = sArr2[i3];
                    if (s < 64) {
                        f112545Oooo0OO[s] = new OooO00o(s2, i2);
                    } else {
                        f112547Oooo0o0[(s / 64) - 1] = new OooO00o(s2, i2);
                    }
                    i3++;
                }
            }
            i++;
        }
        f112546Oooo0o = new OooO00o[64];
        f112548Oooo0oO = new OooO00o[40];
        int i4 = 0;
        while (true) {
            short[][] sArr3 = C31469OooO0o0.f112566Oooo0OO;
            if (i4 >= 12) {
                return;
            }
            int i5 = i4 + 2;
            int i6 = 0;
            while (true) {
                short[] sArr4 = C31469OooO0o0.f112566Oooo0OO[i4];
                if (i6 < sArr4.length) {
                    short s3 = C31469OooO0o0.f112568Oooo0o0[i4][i6];
                    short s4 = sArr4[i6];
                    if (s3 < 64) {
                        f112546Oooo0o[s3] = new OooO00o(s4, i5);
                    } else {
                        f112548Oooo0oO[(s3 / 64) - 1] = new OooO00o(s4, i5);
                    }
                    i6++;
                }
            }
            i4++;
        }
    }

    public C31468OooO0o(OutputStream outputStream, int i, int i2) {
        this.f112562Oooo0O0 = outputStream;
        this.f112551OooOoO = i;
        this.f112553OooOoOO = i2;
        this.f112554OooOoo = new int[i];
        this.f112555OooOoo0 = new int[i];
        int i3 = (i + 7) / 8;
        this.f112552OooOoO0 = i3;
        this.f112549OooOo = new byte[i3];
    }

    public final void OooO00o(int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z = ((i >> ((i2 - i3) - 1)) & 1) == 1;
            if (this.f112558Oooo0 == 1) {
                this.f112560Oooo00O = (byte) ((z ? 1 << (7 - (this.f112561Oooo00o % 8)) : 0) | this.f112560Oooo00O);
            } else {
                this.f112560Oooo00O = (byte) ((z ? 1 << (this.f112561Oooo00o % 8) : 0) | this.f112560Oooo00O);
            }
            byte b = (byte) (this.f112561Oooo00o + 1);
            this.f112561Oooo00o = b;
            if (b == 8) {
                this.f112562Oooo0O0.write(this.f112560Oooo00O);
                this.f112560Oooo00O = (byte) 0;
                this.f112561Oooo00o = (byte) 0;
            }
        }
    }

    public final void OooO0OO(int i, boolean z) throws IOException {
        int length = i / 64;
        OooO00o[] oooO00oArr = z ? f112547Oooo0o0 : f112548Oooo0oO;
        while (length > 0) {
            if (length >= oooO00oArr.length) {
                OooO00o(oooO00oArr[oooO00oArr.length - 1].f112563OooO00o, oooO00oArr[oooO00oArr.length - 1].f112564OooO0O0);
                length -= oooO00oArr.length;
            } else {
                OooO00o oooO00o = oooO00oArr[length - 1];
                OooO00o(oooO00o.f112563OooO00o, oooO00o.f112564OooO0O0);
                length = 0;
            }
        }
        OooO00o oooO00o2 = z ? f112545Oooo0OO[i % 64] : f112546Oooo0o[i % 64];
        OooO00o(oooO00o2.f112563OooO00o, oooO00o2.f112564OooO0O0);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f112562Oooo0O0.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f112562Oooo0O0.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        r7[0] = r12;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if (r9 >= r10) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        r7[1] = r11[r9];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(int i) throws IOException {
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5 = this.f112550OooOo0o;
        byte[] bArr = this.f112549OooOo;
        bArr[i5] = (byte) i;
        int i6 = i5 + 1;
        this.f112550OooOo0o = i6;
        if (i6 == this.f112552OooOoO0) {
            this.f112556OooOooO++;
            int[] iArr2 = this.f112554OooOoo;
            this.f112554OooOoo = this.f112555OooOoo0;
            this.f112555OooOoo0 = iArr2;
            this.f112559Oooo000 = this.f112557OooOooo;
            this.f112557OooOooo = 0;
            boolean z = true;
            int i7 = 0;
            while (true) {
                i2 = this.f112551OooOoO;
                if (i7 >= i2) {
                    break;
                }
                if ((((bArr[i7 / 8] >> (7 - (i7 % 8))) & 1) == 1) == z) {
                    int[] iArr3 = this.f112555OooOoo0;
                    int i8 = this.f112557OooOooo;
                    iArr3[i8] = i7;
                    this.f112557OooOooo = i8 + 1;
                    z = !z;
                }
                i7++;
            }
            boolean z2 = true;
            int i9 = 0;
            while (i9 < i2) {
                int[] iArr4 = {i2, i2};
                int i10 = 0;
                while (true) {
                    i3 = this.f112557OooOooo;
                    if (i10 < i3) {
                        iArr = this.f112555OooOoo0;
                        i4 = iArr[i10];
                        if (i9 >= i4 && (i9 != 0 || !z2)) {
                            i10++;
                        }
                    }
                }
                iArr4[0] = i4;
                int i11 = i10 + 1;
                if (i11 < i3) {
                    iArr4[1] = iArr[i11];
                }
                int[] iArr5 = {i2, i2};
                boolean z3 = !z2;
                ?? r9 = z3;
                while (true) {
                    int i12 = this.f112559Oooo000;
                    if (r9 < i12) {
                        int[] iArr6 = this.f112554OooOoo;
                        int i13 = iArr6[r9];
                        if (i13 <= i9 && (i9 != 0 || r9 != 0)) {
                            r9 += 2;
                        }
                    }
                }
                int i14 = iArr4[0];
                int i15 = i14 - iArr5[0];
                if (i14 > iArr5[1]) {
                    OooO00o(1, 4);
                    i9 = iArr5[1];
                } else if (i15 > 3 || i15 < -3) {
                    OooO00o(1, 3);
                    OooO0OO(iArr4[0] - i9, z2);
                    OooO0OO(iArr4[1] - iArr4[0], z3);
                    i9 = iArr4[1];
                } else {
                    switch (i15) {
                        case -3:
                            OooO00o(2, 7);
                            break;
                        case -2:
                            OooO00o(2, 6);
                            break;
                        case -1:
                            OooO00o(2, 3);
                            break;
                        case 0:
                            OooO00o(1, 1);
                            break;
                        case 1:
                            OooO00o(3, 3);
                            break;
                        case 2:
                            OooO00o(3, 6);
                            break;
                        case 3:
                            OooO00o(3, 7);
                            break;
                    }
                    i9 = iArr5[0] + i15;
                    z2 = z3;
                }
            }
            if (this.f112556OooOooO == this.f112553OooOoOO) {
                OooO00o(1, 12);
                OooO00o(1, 12);
                if (this.f112561Oooo00o != 0) {
                    this.f112562Oooo0O0.write(this.f112560Oooo00O);
                }
                this.f112560Oooo00O = (byte) 0;
                this.f112561Oooo00o = (byte) 0;
            }
            this.f112550OooOo0o = 0;
        }
    }
}
