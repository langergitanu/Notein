package OooooO0;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import io.ktor.utils.p616io.C23988OooooOO;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.OooOOO0;
import o00Ooo.OooOOO;
import oO00Oo0.C32269OooO0oo;
import oO00Oo0O.C32271OooO00o;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0Oo00.C33194OooO0O0;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33478OooO0Oo;
import oOo00Oo0.C34502OooO00o;
import ooo0o.OooOo;

/* JADX INFO: renamed from: OooooO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21286OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61712OooO00o = 0;

    public static final long OooO00o(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = C21285OooO00o.f61711OooO0O0;
        return jFloatToIntBits;
    }

    public static int OooO0O0(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int OooO0OO(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return OooO0O0(b, bArr[i]);
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (b > -12 || b2 > -65 || b3 > -65) {
            return -1;
        }
        return (b3 << 16) ^ ((b2 << 8) ^ b);
    }

    public static int OooO0Oo(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return OooO0OO(bArr, i3, i2);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return OooO0OO(bArr, i3, i2);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static final String OooO0o(InterfaceC32596OooO0o0 classDescriptor, String str) {
        String internalName;
        OooOOO0.OooO0oO(classDescriptor, "classDescriptor");
        String str2 = oO0O0O.OooO0OO.f116822OooO00o;
        C33478OooO0Oo c33478OooO0OoOooO = C33194OooO0O0.OooO0oO(classDescriptor).OooO();
        OooOOO0.OooO0o(c33478OooO0OoOooO, "fqNameSafe.toUnsafe()");
        C33476OooO0O0 c33476OooO0O0OooO0o = oO0O0O.OooO0OO.OooO0o(c33478OooO0OoOooO);
        if (c33476OooO0O0OooO0o != null) {
            internalName = oO0Oo0.OooO0OO.OooO0O0(c33476OooO0O0OooO0o).OooO0o0();
            OooOOO0.OooO0o(internalName, "byClassId(it).internalName");
        } else {
            internalName = OooOOO.OooO0OO(classDescriptor, OooOo.f126384OooO00o);
        }
        OooOOO0.OooO0oO(internalName, "internalName");
        return internalName + FilenameUtils.EXTENSION_SEPARATOR + str;
    }

    public static final void OooO0o0(oOo00Oo0.OooOOO0 oooOOO0, oOo00Oo0.OooOOO0 other) {
        OooOOO0.OooO0oO(oooOOO0, "<this>");
        OooOOO0.OooO0oO(other, "other");
        for (C34502OooO00o c34502OooO00o : other.OooO00o()) {
            OooOOO0.OooO0o0(c34502OooO00o, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            oooOOO0.OooO0o0(c34502OooO00o, other.OooO0o(c34502OooO00o));
        }
    }

    public static final void OooO0oO(C32271OooO00o c32271OooO00o, ByteBuffer source) throws C32269OooO0oo {
        OooOOO0.OooO0oO(c32271OooO00o, "<this>");
        OooOOO0.OooO0oO(source, "source");
        int iRemaining = source.remaining();
        int i = c32271OooO00o.f115946OooO0OO;
        int i2 = c32271OooO00o.f115949OooO0o0 - i;
        if (i2 < iRemaining) {
            throw new C32269OooO0oo("buffer content", iRemaining, i2);
        }
        C23988OooooOO.OooO0Oo(source, c32271OooO00o.f115944OooO00o, i);
        c32271OooO00o.OooO00o(iRemaining);
    }
}
