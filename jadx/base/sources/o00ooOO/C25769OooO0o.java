package o00ooOO;

import java.io.IOException;
import java.io.InputStream;
import o00o0o00.C25438OooO00o;

/* JADX INFO: renamed from: o00ooOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25769OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C25769OooO0o f87943OooO00o = new C25769OooO0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Class<?> f87944OooO0O0 = C25769OooO0o.class;

    public static final int OooO00o(InputStream inputStream, int i) throws IOException {
        boolean z;
        int iOooO00o;
        int i2;
        int i3;
        f87943OooO00o.getClass();
        if (i <= 8) {
            i2 = 0;
            z = false;
            iOooO00o = 0;
        } else {
            int iOooO00o2 = C25770OooO0o0.OooO00o(inputStream, 4, false);
            Class<?> cls = f87944OooO0O0;
            if (iOooO00o2 == 1229531648 || iOooO00o2 == 1296891946) {
                z = iOooO00o2 == 1229531648;
                iOooO00o = C25770OooO0o0.OooO00o(inputStream, 4, z);
                i2 = i - 8;
                if (iOooO00o < 8 || iOooO00o - 8 > i2) {
                    C25438OooO00o.OooO00o(cls, "Invalid offset");
                    i2 = 0;
                }
            } else {
                C25438OooO00o.OooO00o(cls, "Invalid TIFF header");
                i2 = 0;
                z = false;
                iOooO00o = 0;
            }
        }
        int i4 = iOooO00o - 8;
        if (i2 != 0 && i4 <= i2) {
            inputStream.skip(i4);
            int i5 = i2 - i4;
            if (i5 < 14) {
                i3 = 0;
                if (i3 >= 10 && C25770OooO0o0.OooO00o(inputStream, 2, z) == 3 && C25770OooO0o0.OooO00o(inputStream, 4, z) == 1) {
                    return C25770OooO0o0.OooO00o(inputStream, 2, z);
                }
            } else {
                int iOooO00o3 = C25770OooO0o0.OooO00o(inputStream, 2, z);
                int i6 = i5 - 2;
                while (true) {
                    int i7 = iOooO00o3 - 1;
                    if (iOooO00o3 <= 0 || i6 < 12) {
                        break;
                    }
                    i3 = i6 - 2;
                    if (C25770OooO0o0.OooO00o(inputStream, 2, z) == 274) {
                        break;
                    }
                    inputStream.skip(10L);
                    i6 -= 12;
                    iOooO00o3 = i7;
                }
                if (i3 >= 10) {
                    return C25770OooO0o0.OooO00o(inputStream, 2, z);
                }
            }
        }
        return 0;
    }
}
