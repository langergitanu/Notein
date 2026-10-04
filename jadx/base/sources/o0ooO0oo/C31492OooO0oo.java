package o0ooO0oo;

import java.io.IOException;
import o0ooO0Oo.C31447OooOOOo;

/* JADX INFO: renamed from: o0ooO0oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31492OooO0oo {

    /* JADX INFO: renamed from: o0ooO0oo.OooO0oo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f112665OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f112666OooO0O0;
    }

    /* JADX INFO: renamed from: o0ooO0oo.OooO0oo$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f112667OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f112668OooO0O0;
    }

    /* JADX INFO: renamed from: o0ooO0oo.OooO0oo$OooO0OO */
    public static class OooO0OO {
    }

    public static void OooO00o(C31447OooOOOo c31447OooOOOo, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (255 & j);
            j >>= 8;
        }
        for (int i3 = 0; i3 < i; i3++) {
            c31447OooOOOo.write(bArr[(i - i3) - 1]);
        }
    }
}
