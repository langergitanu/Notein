package oOO000oo;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: oOO000oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34343OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34342OooO0o f123274OooO00o = new C34342OooO0o();

    public static void OooO00o(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f123274OooO00o.OooO00o(str, byteArrayOutputStream);
            byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new C34340OooO0OO(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("exception decoding Hex string: ")), e);
        }
    }

    public static byte[] OooO0O0(String str) {
        try {
            return f123274OooO00o.OooO0O0(0, str.length(), str);
        } catch (Exception e) {
            throw new C34340OooO0OO(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("exception decoding Hex string: ")), e);
        }
    }

    public static byte[] OooO0OO(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C34342OooO0o c34342OooO0o = f123274OooO00o;
            c34342OooO0o.getClass();
            if (i >= 0) {
                byte[] bArr2 = new byte[72];
                int i2 = 0;
                while (i > 0) {
                    int iMin = Math.min(36, i);
                    int i3 = i2 + iMin;
                    int i4 = 0;
                    while (i2 < i3) {
                        int i5 = i2 + 1;
                        byte b = bArr[i2];
                        int i6 = i4 + 1;
                        byte[] bArr3 = c34342OooO0o.f123272OooO00o;
                        bArr2[i4] = bArr3[(b & 255) >>> 4];
                        i4 += 2;
                        bArr2[i6] = bArr3[b & 15];
                        i2 = i5;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i4);
                    i -= iMin;
                    i2 = i3;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            C34341OooO0Oo c34341OooO0Oo = new C34341OooO0Oo(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("exception encoding Hex string: ")));
            c34341OooO0Oo.f123271OooOo0o = e;
            throw c34341OooO0Oo;
        }
    }
}
