package OooooOO;

/* JADX INFO: renamed from: OooooOO.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21350OooooOO implements Comparable<C21350OooooOO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final float f61770OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO00o f61771OooOo0o = new OooO00o();

    /* JADX INFO: renamed from: OooooOO.OooooOO$OooO00o */
    public static final class OooO00o {
    }

    static {
        OooO00o(1.0f);
        OooO00o(-1.0f);
        f61770OooOo = Float.intBitsToFloat(1056964608);
    }

    public static short OooO00o(float f) {
        int i;
        f61771OooOo0o.getClass();
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i2 = iFloatToRawIntBits >>> 31;
        int i3 = (iFloatToRawIntBits >>> 23) & 255;
        int i4 = 8388607 & iFloatToRawIntBits;
        int i5 = 31;
        int i6 = 0;
        if (i3 != 255) {
            int i7 = i3 - 112;
            if (i7 >= 31) {
                i5 = 49;
            } else if (i7 > 0) {
                i6 = i4 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                    return (short) i;
                }
                i5 = i7;
            } else if (i7 >= -10) {
                int i8 = (8388608 | i4) >> (1 - i7);
                if ((i8 & 4096) != 0) {
                    i8 += 8192;
                }
                i5 = 0;
                i6 = i8 >> 13;
            } else {
                i5 = 0;
            }
        } else if (i4 != 0) {
            i6 = 512;
        }
        i = (i2 << 15) | (i5 << 10) | i6;
        return (short) i;
    }

    public static final float OooO0O0(short s) {
        int i;
        int i2;
        int i3;
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - f61770OooOo;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }
}
