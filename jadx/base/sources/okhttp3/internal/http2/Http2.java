package okhttp3.internal.http2;

import com.aspose.words.ControlChar;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33595OooOOo;
import oOo00OoO.C34527OooO0oO;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/http2/Http2;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Http2 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Http2 f124519OooO00o = new Http2();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C34527OooO0oO f124520OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String[] f124521OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String[] f124522OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String[] f124523OooO0o0;

    static {
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        f124520OooO0O0 = C34527OooO0oO.OooO00o.OooO0O0("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f124521OooO0OO = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f124522OooO0Oo = new String[64];
        String[] strArr = new String[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            OooOOO0.OooO0o(binaryString, "toBinaryString(it)");
            strArr[i2] = C33595OooOOo.OooOo0(Util.OooO("%8s", binaryString), ControlChar.SPACE_CHAR, '0');
        }
        f124523OooO0o0 = strArr;
        String[] strArr2 = f124522OooO0Oo;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = OooOOO0.OooOOO0("|PADDED", strArr2[i3]);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i4 = 0;
        while (i4 < 3) {
            int i5 = iArr2[i4];
            i4++;
            int i6 = iArr[0];
            String[] strArr3 = f124522OooO0Oo;
            int i7 = i6 | i5;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i6]);
            sb.append('|');
            sb.append((Object) strArr3[i5]);
            strArr3[i7] = sb.toString();
            strArr3[i7 | 8] = ((Object) strArr3[i6]) + '|' + ((Object) strArr3[i5]) + "|PADDED";
        }
        int length = f124522OooO0Oo.length;
        while (i < length) {
            int i8 = i + 1;
            String[] strArr4 = f124522OooO0Oo;
            if (strArr4[i] == null) {
                strArr4[i] = f124523OooO0o0[i];
            }
            i = i8;
        }
    }

    private Http2() {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String OooO00o(boolean z, int i, int i2, int i3, int i4) {
        String strOooOo0O;
        String str;
        String[] strArr = f124521OooO0OO;
        String strOooO = i3 < strArr.length ? strArr[i3] : Util.OooO("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            strOooOo0O = "";
        } else {
            String[] strArr2 = f124523OooO0o0;
            if (i3 == 2 || i3 == 3) {
                strOooOo0O = strArr2[i4];
            } else if (i3 == 4 || i3 == 6) {
                strOooOo0O = i4 == 1 ? "ACK" : strArr2[i4];
            } else if (i3 != 7 && i3 != 8) {
                String[] strArr3 = f124522OooO0Oo;
                if (i4 < strArr3.length) {
                    str = strArr3[i4];
                    OooOOO0.OooO0Oo(str);
                } else {
                    str = strArr2[i4];
                }
                strOooOo0O = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str : C33595OooOOo.OooOo0O(str, "PRIORITY", "COMPRESSED") : C33595OooOOo.OooOo0O(str, "HEADERS", "PUSH_PROMISE");
            }
        }
        return Util.OooO("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strOooO, strOooOo0O);
    }
}
