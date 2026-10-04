package o0oo0oo;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: o0oo0oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31367OooOO0 extends AbstractC31358OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f112004OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final byte[] f112005OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final short[] f112006OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f112007OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final short[] f112008OooO0o0;

    public C31367OooOO0() throws IOException {
        super((short) 0);
        this.f112007OooO0o = 0;
    }

    @Override // o0oo0oo.InterfaceC31369OooOO0o
    public final boolean OooO00o() {
        return false;
    }

    @Override // o0oo0oo.InterfaceC31369OooOO0o
    public final short OooO0O0(int i) {
        return this.f112008OooO0o0[i];
    }

    @Override // o0oo0oo.InterfaceC31369OooOO0o
    public final byte OooO0OO(int i) {
        return this.f112005OooO0OO[i];
    }

    @Override // o0oo0oo.InterfaceC31369OooOO0o
    public final short OooO0o(int i) {
        return this.f112006OooO0Oo[i];
    }

    @Override // o0oo0oo.InterfaceC31369OooOO0o
    public final int OooO0o0() {
        return this.f112007OooO0o;
    }

    @Override // o0oo0oo.InterfaceC31369OooOO0o
    public final int OooO0oO(int i) {
        return this.f112004OooO0O0[i];
    }

    public C31367OooOO0(short s, AbstractC31397Oooo0O0 abstractC31397Oooo0O0, short s2) throws IOException {
        byte[] bArr;
        int unsignedByte;
        int unsignedByte2;
        super(s);
        if (s == 0) {
            this.f112007OooO0o = 0;
            return;
        }
        int[] iArrO00Oo0 = abstractC31397Oooo0O0.o00Oo0(s);
        this.f112004OooO0O0 = iArrO00Oo0;
        int i = iArrO00Oo0[s - 1];
        if (s == 1 && i == 65535) {
            this.f112007OooO0o = 0;
            return;
        }
        int i2 = i + 1;
        this.f112007OooO0o = i2;
        this.f112005OooO0OO = new byte[i2];
        this.f112006OooO0Oo = new short[i2];
        this.f112008OooO0o0 = new short[i2];
        abstractC31397Oooo0O0.Oooo0(abstractC31397Oooo0O0.ooOO());
        int i3 = 0;
        loop0: while (true) {
            if (i3 >= i2) {
                break;
            }
            byte unsignedByte3 = (byte) abstractC31397Oooo0O0.readUnsignedByte();
            byte[] bArr2 = this.f112005OooO0OO;
            bArr2[i3] = unsignedByte3;
            if ((unsignedByte3 & 8) != 0) {
                int unsignedByte4 = abstractC31397Oooo0O0.readUnsignedByte();
                for (int i4 = 1; i4 <= unsignedByte4; i4++) {
                    int i5 = i3 + i4;
                    if (i5 >= bArr2.length) {
                        Log.e("PdfBox-Android", "repeat count (" + unsignedByte4 + ") higher than remaining space");
                        break loop0;
                    }
                    bArr2[i5] = bArr2[i3];
                }
                i3 += unsignedByte4;
            }
            i3++;
        }
        int i6 = this.f112007OooO0o;
        int i7 = 0;
        while (true) {
            bArr = this.f112005OooO0OO;
            if (i7 >= i6) {
                break;
            }
            byte b = bArr[i7];
            if ((b & 16) != 0) {
                if ((b & 2) != 0) {
                    unsignedByte2 = s2 + ((short) abstractC31397Oooo0O0.readUnsignedByte());
                    s2 = (short) unsignedByte2;
                }
            } else if ((b & 2) != 0) {
                unsignedByte2 = s2 - ((short) abstractC31397Oooo0O0.readUnsignedByte());
                s2 = (short) unsignedByte2;
            } else {
                s2 = (short) (abstractC31397Oooo0O0.Oooo000() + s2);
            }
            this.f112006OooO0Oo[i7] = s2;
            i7++;
        }
        short sOooo000 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            byte b2 = bArr[i8];
            if ((b2 & 32) != 0) {
                if ((b2 & 4) != 0) {
                    unsignedByte = sOooo000 + ((short) abstractC31397Oooo0O0.readUnsignedByte());
                    sOooo000 = (short) unsignedByte;
                }
            } else if ((b2 & 4) != 0) {
                unsignedByte = sOooo000 - ((short) abstractC31397Oooo0O0.readUnsignedByte());
                sOooo000 = (short) unsignedByte;
            } else {
                sOooo000 = (short) (abstractC31397Oooo0O0.Oooo000() + sOooo000);
            }
            this.f112008OooO0o0[i8] = sOooo000;
        }
    }
}
