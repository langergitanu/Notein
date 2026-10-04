package OooooO0;

import OooO0Oo.C20398OooO0O0;
import Ooooo00.C21246OooO0OO;
import android.content.Context;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import o00OooO0.C25150OooO00o;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0O.C32273OooO0Oo;

/* JADX INFO: renamed from: OooooO0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21294OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61732OooO00o = 0;

    public C21294OooOO0O() {
        new LinkedHashSet(20);
    }

    public static final long OooO00o(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = C21293OooOO0.f61730OooO0Oo;
        return jFloatToIntBits;
    }

    public static int OooO0O0(int i, int i2, int i3, int i4) {
        int iMin = Math.min(i2 / i4, i / i3);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("Utils", 2) && iMax > 1) {
            StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("Downsampling WEBP, sampleSize: ", iMax, ", target dimens: [", "x", i3);
            C24472OooOoo.OooO0O0(sbOooO0O0, "], actual dimens: [", "x", i4, i);
            sbOooO0O0.append(i2);
            sbOooO0O0.append("]");
            Log.v("Utils", sbOooO0O0.toString());
        }
        return iMax;
    }

    public static byte[] OooO0OO(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            if (!Log.isLoggable("Utils", 5)) {
                return null;
            }
            Log.w("Utils", "Error reading data from stream", e);
            return null;
        }
    }

    public static final File OooO0Oo(Context context, String name) {
        OooOOO0.OooO0oO(context, "<this>");
        OooOOO0.OooO0oO(name, "name");
        return C21246OooO0OO.OooO0o0(context, name.concat(".preferences_pb"));
    }

    public static final char[] OooO0o(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
        }
        return cArr;
    }

    public static final void OooO0o0(C32266OooO0Oo c32266OooO0Oo, byte[] bArr, int i) {
        OooOOO0.OooO0oO(c32266OooO0Oo, "<this>");
        boolean z = true;
        C32271OooO00o c32271OooO00oOoOO = c32266OooO0Oo.ooOO(1);
        if (c32271OooO00oOoOO != null) {
            int i2 = 0;
            while (true) {
                try {
                    int iMin = Math.min(i, c32271OooO00oOoOO.f115946OooO0OO - c32271OooO00oOoOO.f115945OooO0O0);
                    C21287OooO0OO.OooO00o(c32271OooO00oOoOO, bArr, i2, iMin);
                    i -= iMin;
                    i2 += iMin;
                    if (i <= 0) {
                        C32273OooO0Oo.OooO00o(c32266OooO0Oo, c32271OooO00oOoOO);
                        break;
                    }
                    try {
                        c32271OooO00oOoOO = C32273OooO0Oo.OooO0O0(c32266OooO0Oo, c32271OooO00oOoOO);
                        if (c32271OooO00oOoOO == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (z) {
                            C32273OooO0Oo.OooO00o(c32266OooO0Oo, c32271OooO00oOoOO);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        if (i <= 0) {
            return;
        }
        C25150OooO00o.OooO0o0(i);
        throw null;
    }
}
