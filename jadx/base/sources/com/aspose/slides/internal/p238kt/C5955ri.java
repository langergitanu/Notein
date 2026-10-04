package com.aspose.slides.internal.p238kt;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p088dn.C3206x1;
import com.aspose.slides.internal.p174hz.AbstractC4736my;
import com.aspose.slides.internal.p174hz.AbstractC4739nv;
import com.aspose.slides.internal.p174hz.AbstractC4778yw;
import com.aspose.slides.internal.p174hz.InterfaceC4752ts;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.ri */
/* JADX INFO: loaded from: classes.dex */
public class C5955ri {

    /* JADX INFO: renamed from: k4 */
    private static final byte[] f16840k4 = {74, -35, -94, PatternStyle.Weave, 121, -24, 33, 5};

    /* JADX INFO: renamed from: x1 */
    private static final byte[] f16841x1 = {-90, -90, -90, -90, -90, -90, -90, -90};

    /* JADX INFO: renamed from: k4 */
    public static byte[] m24095k4(byte[] bArr, byte[] bArr2) throws Throwable {
        AbstractC4778yw abstractC4778ywM19839kk;
        InterfaceC4752ts interfaceC4752tsMo19659x1;
        if (bArr2.length != 32 && bArr2.length != 40 && bArr2.length != 48) {
            throw new CryptographicException("The length of the encrypted data in Key Wrap is either 32, 40 or 48 bytes.");
        }
        InterfaceC4752ts interfaceC4752tsMo19659x12 = null;
        try {
            abstractC4778ywM19839kk = AbstractC4778yw.m19839kk();
            try {
                abstractC4778ywM19839kk.m19691to(1);
                interfaceC4752tsMo19659x1 = abstractC4778ywM19839kk.mo19659x1(bArr, f16840k4);
            } catch (Throwable th) {
                th = th;
                interfaceC4752tsMo19659x1 = null;
            }
        } catch (Throwable th2) {
            th = th2;
            abstractC4778ywM19839kk = null;
            interfaceC4752tsMo19659x1 = null;
        }
        try {
            int i = 0;
            byte[] bArrMo19564k4 = interfaceC4752tsMo19659x1.mo19564k4(bArr2, 0, bArr2.length);
            C3206x1.m13886k4(bArrMo19564k4);
            byte[] bArr3 = new byte[8];
            System.arraycopy(bArrMo19564k4, 0, bArr3, 0, 8);
            int length = bArrMo19564k4.length - 8;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArrMo19564k4, 8, bArr4, 0, length);
            interfaceC4752tsMo19659x12 = abstractC4778ywM19839kk.mo19659x1(bArr, bArr3);
            byte[] bArrMo19564k42 = interfaceC4752tsMo19659x12.mo19564k4(bArr4, 0, length);
            int length2 = bArrMo19564k42.length - 8;
            byte[] bArr5 = new byte[length2];
            System.arraycopy(bArrMo19564k42, 0, bArr5, 0, length2);
            AbstractC4739nv abstractC4739nvM19710du = AbstractC4739nv.m19710du();
            try {
                byte[] bArrM19588x1 = abstractC4739nvM19710du.m19588x1(bArr5);
                while (length2 < bArrMo19564k42.length) {
                    if ((bArrMo19564k42[length2] & 255) != (bArrM19588x1[i] & 255)) {
                        throw new CryptographicException("Bad wrapped key size.");
                    }
                    length2++;
                    i++;
                }
                if (C7019kk.m27469x1(abstractC4739nvM19710du, IDisposable.class)) {
                    abstractC4739nvM19710du.dispose();
                }
                if (C7019kk.m27469x1(interfaceC4752tsMo19659x12, IDisposable.class)) {
                    interfaceC4752tsMo19659x12.dispose();
                }
                if (C7019kk.m27469x1(interfaceC4752tsMo19659x1, IDisposable.class)) {
                    interfaceC4752tsMo19659x1.dispose();
                }
                if (C7019kk.m27469x1(abstractC4778ywM19839kk, IDisposable.class)) {
                    abstractC4778ywM19839kk.dispose();
                }
                return bArr5;
            } catch (Throwable th3) {
                if (abstractC4739nvM19710du != null && C7019kk.m27469x1(abstractC4739nvM19710du, IDisposable.class)) {
                    abstractC4739nvM19710du.dispose();
                }
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            if (interfaceC4752tsMo19659x12 != null && C7019kk.m27469x1(interfaceC4752tsMo19659x12, IDisposable.class)) {
                interfaceC4752tsMo19659x12.dispose();
            }
            if (interfaceC4752tsMo19659x1 != null && C7019kk.m27469x1(interfaceC4752tsMo19659x1, IDisposable.class)) {
                interfaceC4752tsMo19659x1.dispose();
            }
            if (abstractC4778ywM19839kk != null && C7019kk.m27469x1(abstractC4778ywM19839kk, IDisposable.class)) {
                abstractC4778ywM19839kk.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m24096x1(byte[] bArr, byte[] bArr2) throws Throwable {
        AbstractC4736my abstractC4736myM19678rv;
        int i = 1;
        int length = (bArr2.length >> 3) - 1;
        int i2 = 8;
        if (bArr2.length % 8 != 0 || length <= 0) {
            throw new CryptographicException("The length of the encrypted data in Key Wrap is either 32, 40 or 48 bytes.");
        }
        int i3 = length << 3;
        byte[] bArr3 = new byte[i3];
        IDisposable iDisposable = null;
        try {
            abstractC4736myM19678rv = AbstractC4736my.m19678rv();
            try {
                abstractC4736myM19678rv.mo19688kk(bArr);
                abstractC4736myM19678rv.m19687kk(2);
                abstractC4736myM19678rv.m19691to(1);
                InterfaceC4752ts interfaceC4752tsM19696yj = abstractC4736myM19678rv.m19696yj();
                if (length == 1) {
                    byte[] bArrMo19564k4 = interfaceC4752tsM19696yj.mo19564k4(bArr2, 0, bArr2.length);
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((bArrMo19564k4[i4] & 255) != (f16841x1[i4] & 255)) {
                            throw new CryptographicException("Bad wrapped key size.");
                        }
                    }
                    System.arraycopy(bArrMo19564k4, 8, bArr3, 0, 8);
                    if (C7019kk.m27469x1(interfaceC4752tsM19696yj, IDisposable.class)) {
                        interfaceC4752tsM19696yj.dispose();
                    }
                    if (C7019kk.m27469x1(interfaceC4752tsM19696yj, IDisposable.class)) {
                        abstractC4736myM19678rv.dispose();
                        return bArr3;
                    }
                } else {
                    System.arraycopy(bArr2, 8, bArr3, 0, i3);
                    byte[] bArr4 = new byte[8];
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(bArr2, 0, bArr4, 0, 8);
                    int i5 = 5;
                    while (i5 >= 0) {
                        int i6 = length;
                        while (i6 >= i) {
                            long j = (i5 * length) + i6;
                            int i7 = 0;
                            while (i7 < i2) {
                                bArr4[i7] = (byte) ((((byte) ((j >> ((7 - i7) * 8)) & 255)) & 255) ^ (bArr4[i7] & 255));
                                i7++;
                                bArr3 = bArr3;
                                i2 = 8;
                            }
                            int i8 = i2;
                            System.arraycopy(bArr4, 0, bArr5, 0, i8);
                            int i9 = (i6 - 1) * i8;
                            bArr3 = bArr3;
                            System.arraycopy(bArr3, i9, bArr5, i8, i8);
                            byte[] bArrMo19564k42 = interfaceC4752tsM19696yj.mo19564k4(bArr5, 0, 16);
                            System.arraycopy(bArrMo19564k42, i8, bArr3, i9, i8);
                            System.arraycopy(bArrMo19564k42, 0, bArr4, 0, i8);
                            i6--;
                            i = 1;
                            i2 = 8;
                        }
                        i5--;
                        i = 1;
                        i2 = 8;
                    }
                    int i10 = i2;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((bArr4[i11] & 255) != (f16841x1[i11] & 255)) {
                            throw new CryptographicException("Bad wrapped key size.");
                        }
                    }
                    if (interfaceC4752tsM19696yj != null && C7019kk.m27469x1(interfaceC4752tsM19696yj, IDisposable.class)) {
                        interfaceC4752tsM19696yj.dispose();
                    }
                    if (C7019kk.m27469x1(interfaceC4752tsM19696yj, IDisposable.class)) {
                        abstractC4736myM19678rv.dispose();
                    }
                }
                return bArr3;
            } catch (Throwable th) {
                th = th;
                if (0 != 0 && C7019kk.m27469x1((Object) null, IDisposable.class)) {
                    iDisposable.dispose();
                }
                if (abstractC4736myM19678rv != null && C7019kk.m27469x1((Object) null, IDisposable.class)) {
                    abstractC4736myM19678rv.dispose();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            abstractC4736myM19678rv = null;
        }
    }
}
