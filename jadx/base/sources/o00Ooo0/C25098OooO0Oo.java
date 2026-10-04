package o00Ooo0;

import android.util.Log;
import androidx.core.view.ViewCompat;
import java.io.ByteArrayOutputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o00Ooo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25098OooO0Oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ByteBuffer f85232OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0OO f85233OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f85231OooO00o = new byte[256];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f85234OooO0Oo = 0;

    public final boolean OooO00o() {
        return this.f85233OooO0OO.f85222OooO0O0 != 0;
    }

    public final OooO0OO OooO0O0() {
        byte[] bArr;
        if (this.f85232OooO0O0 == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (OooO00o()) {
            return this.f85233OooO0OO;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) OooO0OO());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f85233OooO0OO.f85225OooO0o = this.f85232OooO0O0.getShort();
            this.f85233OooO0OO.f85227OooO0oO = this.f85232OooO0O0.getShort();
            int iOooO0OO = OooO0OO();
            OooO0OO oooO0OO = this.f85233OooO0OO;
            oooO0OO.f85228OooO0oo = (iOooO0OO & 128) != 0;
            oooO0OO.f85220OooO = (int) Math.pow(2.0d, (iOooO0OO & 7) + 1);
            this.f85233OooO0OO.f85229OooOO0 = OooO0OO();
            OooO0OO oooO0OO2 = this.f85233OooO0OO;
            OooO0OO();
            oooO0OO2.getClass();
            if (this.f85233OooO0OO.f85228OooO0oo && !OooO00o()) {
                OooO0OO oooO0OO3 = this.f85233OooO0OO;
                oooO0OO3.f85221OooO00o = OooO0o0(oooO0OO3.f85220OooO);
                OooO0OO oooO0OO4 = this.f85233OooO0OO;
                oooO0OO4.f85230OooOO0O = oooO0OO4.f85221OooO00o[oooO0OO4.f85229OooOO0];
            }
        } else {
            this.f85233OooO0OO.f85222OooO0O0 = 1;
        }
        if (!OooO00o()) {
            boolean z = false;
            while (!z && !OooO00o() && this.f85233OooO0OO.f85223OooO0OO <= Integer.MAX_VALUE) {
                int iOooO0OO2 = OooO0OO();
                if (iOooO0OO2 == 33) {
                    int iOooO0OO3 = OooO0OO();
                    if (iOooO0OO3 == 1) {
                        OooO0o();
                    } else if (iOooO0OO3 == 249) {
                        this.f85233OooO0OO.f85224OooO0Oo = new OooO0O0();
                        OooO0OO();
                        int iOooO0OO4 = OooO0OO();
                        OooO0O0 oooO0O0 = this.f85233OooO0OO.f85224OooO0Oo;
                        int i2 = (iOooO0OO4 & 28) >> 2;
                        oooO0O0.f85216OooO0oO = i2;
                        if (i2 == 0) {
                            oooO0O0.f85216OooO0oO = 1;
                        }
                        oooO0O0.f85214OooO0o = (iOooO0OO4 & 1) != 0;
                        short s = this.f85232OooO0O0.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        OooO0O0 oooO0O02 = this.f85233OooO0OO.f85224OooO0Oo;
                        oooO0O02.f85209OooO = s * 10;
                        oooO0O02.f85217OooO0oo = OooO0OO();
                        OooO0OO();
                    } else if (iOooO0OO3 == 254) {
                        OooO0o();
                    } else if (iOooO0OO3 != 255) {
                        OooO0o();
                    } else {
                        OooO0Oo();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f85231OooO00o;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                OooO0Oo();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.f85233OooO0OO.getClass();
                                }
                                if (this.f85234OooO0Oo > 0) {
                                }
                            } while (!OooO00o());
                        } else {
                            OooO0o();
                        }
                    }
                } else if (iOooO0OO2 == 44) {
                    OooO0OO oooO0OO5 = this.f85233OooO0OO;
                    if (oooO0OO5.f85224OooO0Oo == null) {
                        oooO0OO5.f85224OooO0Oo = new OooO0O0();
                    }
                    this.f85233OooO0OO.f85224OooO0Oo.f85210OooO00o = this.f85232OooO0O0.getShort();
                    this.f85233OooO0OO.f85224OooO0Oo.f85211OooO0O0 = this.f85232OooO0O0.getShort();
                    this.f85233OooO0OO.f85224OooO0Oo.f85212OooO0OO = this.f85232OooO0O0.getShort();
                    this.f85233OooO0OO.f85224OooO0Oo.f85213OooO0Oo = this.f85232OooO0O0.getShort();
                    int iOooO0OO5 = OooO0OO();
                    boolean z2 = (iOooO0OO5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iOooO0OO5 & 7) + 1);
                    OooO0O0 oooO0O03 = this.f85233OooO0OO.f85224OooO0Oo;
                    oooO0O03.f85215OooO0o0 = (iOooO0OO5 & 64) != 0;
                    if (z2) {
                        oooO0O03.f85219OooOO0O = OooO0o0(iPow);
                    } else {
                        oooO0O03.f85219OooOO0O = null;
                    }
                    this.f85233OooO0OO.f85224OooO0Oo.f85218OooOO0 = this.f85232OooO0O0.position();
                    OooO0OO();
                    OooO0o();
                    if (!OooO00o()) {
                        OooO0OO oooO0OO6 = this.f85233OooO0OO;
                        oooO0OO6.f85223OooO0OO++;
                        oooO0OO6.f85226OooO0o0.add(oooO0OO6.f85224OooO0Oo);
                    }
                } else if (iOooO0OO2 != 59) {
                    this.f85233OooO0OO.f85222OooO0O0 = 1;
                } else {
                    z = true;
                }
            }
            OooO0OO oooO0OO7 = this.f85233OooO0OO;
            if (oooO0OO7.f85223OooO0OO < 0) {
                oooO0OO7.f85222OooO0O0 = 1;
            }
        }
        return this.f85233OooO0OO;
    }

    public final int OooO0OO() {
        try {
            return this.f85232OooO0O0.get() & 255;
        } catch (Exception unused) {
            this.f85233OooO0OO.f85222OooO0O0 = 1;
            return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [byte[], java.lang.StringBuilder] */
    public final void OooO0Oo() {
        int iOooO0OO = OooO0OO();
        this.f85234OooO0Oo = iOooO0OO;
        if (iOooO0OO <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.f85234OooO0Oo;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.f85232OooO0O0.get(this.f85231OooO00o, i, i3);
                i += i3;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    ?? byteArray = ByteArrayOutputStream.toByteArray();
                    byteArray.append(this.f85234OooO0Oo);
                    Log.d("GifHeaderParser", byteArray.toString(), e);
                }
                this.f85233OooO0OO.f85222OooO0O0 = 1;
                return;
            }
        }
    }

    public final void OooO0o() {
        int iOooO0OO;
        do {
            iOooO0OO = OooO0OO();
            this.f85232OooO0O0.position(Math.min(this.f85232OooO0O0.position() + iOooO0OO, this.f85232OooO0O0.limit()));
        } while (iOooO0OO > 0);
    }

    public final int[] OooO0o0(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f85232OooO0O0.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | ViewCompat.MEASURED_STATE_MASK | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f85233OooO0OO.f85222OooO0O0 = 1;
            return iArr;
        }
    }
}
