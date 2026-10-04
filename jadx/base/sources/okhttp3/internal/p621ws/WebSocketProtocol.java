package okhttp3.internal.p621ws;

import Oooo0oO.o0Oo0oo;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/ws/WebSocketProtocol;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class WebSocketProtocol {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final WebSocketProtocol f124763OooO00o = new WebSocketProtocol();

    private WebSocketProtocol() {
    }

    public static String OooO00o(int i) {
        if (i < 1000 || i >= 5000) {
            return OooOOO0.OooOOO0(Integer.valueOf(i), "Code must be in range [1000,5000): ");
        }
        if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
            return null;
        }
        return o0Oo0oo.OooO0O0(i, "Code ", " is reserved and may not be used.");
    }

    public static void OooO0O0(C34524OooO0Oo.OooO00o cursor, byte[] key) {
        long j;
        OooOOO0.OooO0oO(cursor, "cursor");
        OooOOO0.OooO0oO(key, "key");
        int length = key.length;
        int i = 0;
        do {
            byte[] bArr = cursor.f123729OooOoOO;
            int i2 = cursor.f123731OooOoo0;
            int i3 = cursor.f123730OooOoo;
            if (bArr != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr[i2] = (byte) (bArr[i2] ^ key[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = cursor.f123727OooOoO;
            C34524OooO0Oo c34524OooO0Oo = cursor.f123726OooOo0o;
            OooOOO0.OooO0Oo(c34524OooO0Oo);
            if (j2 == c34524OooO0Oo.f123723OooOo) {
                throw new IllegalStateException("no more bytes");
            }
            j = cursor.f123727OooOoO;
        } while (cursor.OooO0OO(j == -1 ? 0L : j + ((long) (cursor.f123730OooOoo - cursor.f123731OooOoo0))) != -1);
    }
}
