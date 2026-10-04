package ooOOoOOO;

import java.io.EOFException;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33580OooO00o;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34536OooOOo;
import oOo00OoO.C34543OooOo0o;

/* JADX INFO: renamed from: ooOOoOOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35146OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f126202OooO00o;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(C33580OooO00o.f121231OooO0O0);
        OooOOO0.OooO0o(bytes, "this as java.lang.String).getBytes(charset)");
        f126202OooO00o = bytes;
    }

    public static final String OooO00o(C34524OooO0Oo c34524OooO0Oo, long j) throws EOFException {
        OooOOO0.OooO0oO(c34524OooO0Oo, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (c34524OooO0Oo.OooOooo(j2) == 13) {
                String strO0Oo0oo = c34524OooO0Oo.o0Oo0oo(j2, C33580OooO00o.f121231OooO0O0);
                c34524OooO0Oo.skip(2L);
                return strO0Oo0oo;
            }
        }
        String strO0Oo0oo2 = c34524OooO0Oo.o0Oo0oo(j, C33580OooO00o.f121231OooO0O0);
        c34524OooO0Oo.skip(1L);
        return strO0Oo0oo2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r19 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int OooO0O0(C34524OooO0Oo c34524OooO0Oo, C34536OooOOo options, boolean z) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        C34543OooOo0o c34543OooOo0o;
        byte[] bArr2;
        int i4;
        OooOOO0.OooO0oO(c34524OooO0Oo, "<this>");
        OooOOO0.OooO0oO(options, "options");
        C34543OooOo0o c34543OooOo0o2 = c34524OooO0Oo.f123724OooOo0o;
        if (c34543OooOo0o2 != null) {
            int i5 = c34543OooOo0o2.f123781OooO0O0;
            int i6 = c34543OooOo0o2.f123782OooO0OO;
            byte[] bArr3 = c34543OooOo0o2.f123780OooO00o;
            C34543OooOo0o c34543OooOo0o3 = c34543OooOo0o2;
            int i7 = -1;
            int i8 = 0;
            loop0: while (true) {
                int i9 = i8 + 1;
                int[] iArr = options.f123758OooOo;
                int i10 = iArr[i8];
                int i11 = i8 + 2;
                int i12 = iArr[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (c34543OooOo0o3 == null) {
                    break;
                }
                if (i10 >= 0) {
                    int i13 = i5 + 1;
                    int i14 = bArr3[i5] & 255;
                    int i15 = i11 + i10;
                    while (i11 != i15) {
                        if (i14 == iArr[i11]) {
                            i = iArr[i11 + i10];
                            if (i13 == i6) {
                                c34543OooOo0o3 = c34543OooOo0o3.f123784OooO0o;
                                OooOOO0.OooO0Oo(c34543OooOo0o3);
                                i3 = c34543OooOo0o3.f123781OooO0O0;
                                i2 = c34543OooOo0o3.f123782OooO0OO;
                                bArr = c34543OooOo0o3.f123780OooO00o;
                                if (c34543OooOo0o3 == c34543OooOo0o2) {
                                    c34543OooOo0o3 = null;
                                }
                            } else {
                                bArr = bArr3;
                                i2 = i6;
                                i3 = i13;
                            }
                            if (i >= 0) {
                                return i;
                            }
                            byte[] bArr4 = bArr;
                            i8 = -i;
                            i5 = i3;
                            i6 = i2;
                            bArr3 = bArr4;
                        } else {
                            i11++;
                        }
                    }
                    break loop0;
                }
                int i16 = (i10 * (-1)) + i11;
                while (true) {
                    int i17 = i5 + 1;
                    int i18 = i11 + 1;
                    if ((bArr3[i5] & 255) != iArr[i11]) {
                        break loop0;
                    }
                    boolean z2 = i18 == i16;
                    if (i17 == i6) {
                        OooOOO0.OooO0Oo(c34543OooOo0o3);
                        C34543OooOo0o c34543OooOo0o4 = c34543OooOo0o3.f123784OooO0o;
                        OooOOO0.OooO0Oo(c34543OooOo0o4);
                        i4 = c34543OooOo0o4.f123781OooO0O0;
                        int i19 = c34543OooOo0o4.f123782OooO0OO;
                        bArr2 = c34543OooOo0o4.f123780OooO00o;
                        if (c34543OooOo0o4 != c34543OooOo0o2) {
                            c34543OooOo0o = c34543OooOo0o4;
                            i6 = i19;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            i6 = i19;
                            c34543OooOo0o = null;
                        }
                    } else {
                        c34543OooOo0o = c34543OooOo0o3;
                        bArr2 = bArr3;
                        i4 = i17;
                    }
                    if (z2) {
                        i = iArr[i18];
                        int i20 = i4;
                        i2 = i6;
                        i3 = i20;
                        byte[] bArr5 = bArr2;
                        c34543OooOo0o3 = c34543OooOo0o;
                        bArr = bArr5;
                        break;
                    }
                    i5 = i4;
                    bArr3 = bArr2;
                    c34543OooOo0o3 = c34543OooOo0o;
                    i11 = i18;
                }
            }
        } else {
            return z ? -2 : -1;
        }
    }
}
