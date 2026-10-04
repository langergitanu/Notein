package oO000OoO;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18190ga;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.marker.PerfConstants;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import oO000OoO.C32077OooO0oO;
import oO000OoO.OooO0o;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34542OooOo0O;

/* JADX INFO: renamed from: oO000OoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32076OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34527OooO0oO f114875OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C32074OooO0Oo[] f114876OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Map<C34527OooO0oO, Integer> f114877OooO0OO;

    /* JADX INFO: renamed from: oO000OoO.OooO0o0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C34542OooOo0O f114879OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f114878OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public C32074OooO0Oo[] f114883OooO0o0 = new C32074OooO0Oo[8];

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f114882OooO0o = 7;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f114884OooO0oO = 0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f114885OooO0oo = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f114880OooO0OO = 4096;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f114881OooO0Oo = 4096;

        public OooO00o(OooO0o.OooO00o oooO00o) {
            this.f114879OooO0O0 = C34535OooOOOo.OooO0O0(oooO00o);
        }

        public final int OooO00o(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f114883OooO0o0.length;
                while (true) {
                    length--;
                    i2 = this.f114882OooO0o;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f114883OooO0o0[length].f114855OooO0OO;
                    i -= i4;
                    this.f114885OooO0oo -= i4;
                    this.f114884OooO0oO--;
                    i3++;
                }
                C32074OooO0Oo[] c32074OooO0OoArr = this.f114883OooO0o0;
                System.arraycopy(c32074OooO0OoArr, i2 + 1, c32074OooO0OoArr, i2 + 1 + i3, this.f114884OooO0oO);
                this.f114882OooO0o += i3;
            }
            return i3;
        }

        public final C34527OooO0oO OooO0O0(int i) throws IOException {
            if (i >= 0) {
                C32074OooO0Oo[] c32074OooO0OoArr = C32076OooO0o0.f114876OooO0O0;
                if (i <= c32074OooO0OoArr.length - 1) {
                    return c32074OooO0OoArr[i].f114853OooO00o;
                }
            }
            int length = this.f114882OooO0o + 1 + (i - C32076OooO0o0.f114876OooO0O0.length);
            if (length >= 0) {
                C32074OooO0Oo[] c32074OooO0OoArr2 = this.f114883OooO0o0;
                if (length < c32074OooO0OoArr2.length) {
                    return c32074OooO0OoArr2[length].f114853OooO00o;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void OooO0OO(C32074OooO0Oo c32074OooO0Oo) {
            this.f114878OooO00o.add(c32074OooO0Oo);
            int i = this.f114881OooO0Oo;
            int i2 = c32074OooO0Oo.f114855OooO0OO;
            if (i2 > i) {
                Arrays.fill(this.f114883OooO0o0, (Object) null);
                this.f114882OooO0o = this.f114883OooO0o0.length - 1;
                this.f114884OooO0oO = 0;
                this.f114885OooO0oo = 0;
                return;
            }
            OooO00o((this.f114885OooO0oo + i2) - i);
            int i3 = this.f114884OooO0oO + 1;
            C32074OooO0Oo[] c32074OooO0OoArr = this.f114883OooO0o0;
            if (i3 > c32074OooO0OoArr.length) {
                C32074OooO0Oo[] c32074OooO0OoArr2 = new C32074OooO0Oo[c32074OooO0OoArr.length * 2];
                System.arraycopy(c32074OooO0OoArr, 0, c32074OooO0OoArr2, c32074OooO0OoArr.length, c32074OooO0OoArr.length);
                this.f114882OooO0o = this.f114883OooO0o0.length - 1;
                this.f114883OooO0o0 = c32074OooO0OoArr2;
            }
            int i4 = this.f114882OooO0o;
            this.f114882OooO0o = i4 - 1;
            this.f114883OooO0o0[i4] = c32074OooO0Oo;
            this.f114884OooO0oO++;
            this.f114885OooO0oo += i2;
        }

        public final C34527OooO0oO OooO0Oo() throws IOException {
            int i;
            C34542OooOo0O c34542OooOo0O = this.f114879OooO0O0;
            byte b = c34542OooOo0O.readByte();
            int i2 = b & 255;
            boolean z = (b & UnsignedBytes.MAX_POWER_OF_TWO) == 128;
            int iOooO0o0 = OooO0o0(i2, 127);
            if (!z) {
                return c34542OooOo0O.OoooO0O(iOooO0o0);
            }
            C32077OooO0oO c32077OooO0oO = C32077OooO0oO.f114893OooO0Oo;
            byte[] bArrO0000oo = c34542OooOo0O.o0000oo(iOooO0o0);
            c32077OooO0oO.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C32077OooO0oO.OooO00o oooO00o = c32077OooO0oO.f114894OooO00o;
            C32077OooO0oO.OooO00o oooO00o2 = oooO00o;
            int i3 = 0;
            int i4 = 0;
            for (byte b2 : bArrO0000oo) {
                i3 = (i3 << 8) | (b2 & 255);
                i4 += 8;
                while (i4 >= 8) {
                    oooO00o2 = oooO00o2.f114895OooO00o[(i3 >>> (i4 - 8)) & 255];
                    if (oooO00o2.f114895OooO00o == null) {
                        byteArrayOutputStream.write(oooO00o2.f114896OooO0O0);
                        i4 -= oooO00o2.f114897OooO0OO;
                        oooO00o2 = oooO00o;
                    } else {
                        i4 -= 8;
                    }
                }
            }
            while (i4 > 0) {
                C32077OooO0oO.OooO00o oooO00o3 = oooO00o2.f114895OooO00o[(i3 << (8 - i4)) & 255];
                if (oooO00o3.f114895OooO00o != null || (i = oooO00o3.f114897OooO0OO) > i4) {
                    break;
                }
                byteArrayOutputStream.write(oooO00o3.f114896OooO0O0);
                i4 -= i;
                oooO00o2 = oooO00o;
            }
            return C34527OooO0oO.OooO0oO(byteArrayOutputStream.toByteArray());
        }

        public final int OooO0o0(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte b = this.f114879OooO0O0.readByte();
                int i5 = b & 255;
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (b & Ascii.DEL) << i4;
                i4 += 7;
            }
        }
    }

    /* JADX INFO: renamed from: oO000OoO.OooO0o0$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C34524OooO0Oo f114886OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f114888OooO0OO;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f114890OooO0o0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C32074OooO0Oo[] f114887OooO0O0 = new C32074OooO0Oo[8];

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f114889OooO0Oo = 7;

        public OooO0O0(C34524OooO0Oo c34524OooO0Oo) {
            this.f114886OooO00o = c34524OooO0Oo;
        }

        public final void OooO00o(C32074OooO0Oo c32074OooO0Oo) {
            int i;
            int i2 = c32074OooO0Oo.f114855OooO0OO;
            if (i2 > 4096) {
                Arrays.fill(this.f114887OooO0O0, (Object) null);
                this.f114889OooO0Oo = this.f114887OooO0O0.length - 1;
                this.f114888OooO0OO = 0;
                this.f114890OooO0o0 = 0;
                return;
            }
            int i3 = (this.f114890OooO0o0 + i2) - 4096;
            if (i3 > 0) {
                int length = this.f114887OooO0O0.length - 1;
                int i4 = 0;
                while (true) {
                    i = this.f114889OooO0Oo;
                    if (length < i || i3 <= 0) {
                        break;
                    }
                    int i5 = this.f114887OooO0O0[length].f114855OooO0OO;
                    i3 -= i5;
                    this.f114890OooO0o0 -= i5;
                    this.f114888OooO0OO--;
                    i4++;
                    length--;
                }
                C32074OooO0Oo[] c32074OooO0OoArr = this.f114887OooO0O0;
                int i6 = i + 1;
                System.arraycopy(c32074OooO0OoArr, i6, c32074OooO0OoArr, i6 + i4, this.f114888OooO0OO);
                this.f114889OooO0Oo += i4;
            }
            int i7 = this.f114888OooO0OO + 1;
            C32074OooO0Oo[] c32074OooO0OoArr2 = this.f114887OooO0O0;
            if (i7 > c32074OooO0OoArr2.length) {
                C32074OooO0Oo[] c32074OooO0OoArr3 = new C32074OooO0Oo[c32074OooO0OoArr2.length * 2];
                System.arraycopy(c32074OooO0OoArr2, 0, c32074OooO0OoArr3, c32074OooO0OoArr2.length, c32074OooO0OoArr2.length);
                this.f114889OooO0Oo = this.f114887OooO0O0.length - 1;
                this.f114887OooO0O0 = c32074OooO0OoArr3;
            }
            int i8 = this.f114889OooO0Oo;
            this.f114889OooO0Oo = i8 - 1;
            this.f114887OooO0O0[i8] = c32074OooO0Oo;
            this.f114888OooO0OO++;
            this.f114890OooO0o0 += i2;
        }

        public final void OooO0O0(C34527OooO0oO c34527OooO0oO) throws IOException {
            OooO0OO(c34527OooO0oO.OooO0OO(), 127, 0);
            this.f114886OooO00o.o0000o0(c34527OooO0oO);
        }

        public final void OooO0OO(int i, int i2, int i3) throws IOException {
            C34524OooO0Oo c34524OooO0Oo = this.f114886OooO00o;
            if (i < i2) {
                c34524OooO0Oo.o0OoO0o(i | i3);
                return;
            }
            c34524OooO0Oo.o0OoO0o(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                c34524OooO0Oo.o0OoO0o(128 | (i4 & 127));
                i4 >>>= 7;
            }
            c34524OooO0Oo.o0OoO0o(i4);
        }
    }

    static {
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        f114875OooO00o = C34527OooO0oO.OooO00o.OooO0O0(C18241k5.f55433h);
        C32074OooO0Oo c32074OooO0Oo = new C32074OooO0Oo(C32074OooO0Oo.f114852OooO0oo, "");
        C34527OooO0oO c34527OooO0oO2 = C32074OooO0Oo.f114850OooO0o0;
        C32074OooO0Oo c32074OooO0Oo2 = new C32074OooO0Oo(c34527OooO0oO2, "GET");
        C32074OooO0Oo c32074OooO0Oo3 = new C32074OooO0Oo(c34527OooO0oO2, "POST");
        C34527OooO0oO c34527OooO0oO3 = C32074OooO0Oo.f114849OooO0o;
        C32074OooO0Oo c32074OooO0Oo4 = new C32074OooO0Oo(c34527OooO0oO3, "/");
        C32074OooO0Oo c32074OooO0Oo5 = new C32074OooO0Oo(c34527OooO0oO3, "/index.html");
        C34527OooO0oO c34527OooO0oO4 = C32074OooO0Oo.f114851OooO0oO;
        C32074OooO0Oo c32074OooO0Oo6 = new C32074OooO0Oo(c34527OooO0oO4, "http");
        C32074OooO0Oo c32074OooO0Oo7 = new C32074OooO0Oo(c34527OooO0oO4, AuthenticationConstants.HTTPS_PROTOCOL_STRING);
        C34527OooO0oO c34527OooO0oO5 = C32074OooO0Oo.f114848OooO0Oo;
        C32074OooO0Oo[] c32074OooO0OoArr = {c32074OooO0Oo, c32074OooO0Oo2, c32074OooO0Oo3, c32074OooO0Oo4, c32074OooO0Oo5, c32074OooO0Oo6, c32074OooO0Oo7, new C32074OooO0Oo(c34527OooO0oO5, PerfConstants.ScenarioConstants.SCENARIO_BROKERED_ACQUIRE_TOKEN_SILENTLY), new C32074OooO0Oo(c34527OooO0oO5, TelemetryEventStrings.Api.GET_BROKER_DEVICE_MODE), new C32074OooO0Oo(c34527OooO0oO5, TelemetryEventStrings.Api.BROKER_GET_ACCOUNTS), new C32074OooO0Oo(c34527OooO0oO5, "304"), new C32074OooO0Oo(c34527OooO0oO5, "400"), new C32074OooO0Oo(c34527OooO0oO5, "404"), new C32074OooO0Oo(c34527OooO0oO5, "500"), new C32074OooO0Oo("accept-charset", ""), new C32074OooO0Oo("accept-encoding", "gzip, deflate"), new C32074OooO0Oo("accept-language", ""), new C32074OooO0Oo("accept-ranges", ""), new C32074OooO0Oo("accept", ""), new C32074OooO0Oo("access-control-allow-origin", ""), new C32074OooO0Oo("age", ""), new C32074OooO0Oo("allow", ""), new C32074OooO0Oo("authorization", ""), new C32074OooO0Oo("cache-control", ""), new C32074OooO0Oo("content-disposition", ""), new C32074OooO0Oo("content-encoding", ""), new C32074OooO0Oo("content-language", ""), new C32074OooO0Oo("content-length", ""), new C32074OooO0Oo("content-location", ""), new C32074OooO0Oo("content-range", ""), new C32074OooO0Oo("content-type", ""), new C32074OooO0Oo("cookie", ""), new C32074OooO0Oo("date", ""), new C32074OooO0Oo("etag", ""), new C32074OooO0Oo("expect", ""), new C32074OooO0Oo("expires", ""), new C32074OooO0Oo(Constants.MessagePayloadKeys.FROM, ""), new C32074OooO0Oo("host", ""), new C32074OooO0Oo("if-match", ""), new C32074OooO0Oo("if-modified-since", ""), new C32074OooO0Oo("if-none-match", ""), new C32074OooO0Oo("if-range", ""), new C32074OooO0Oo("if-unmodified-since", ""), new C32074OooO0Oo("last-modified", ""), new C32074OooO0Oo("link", ""), new C32074OooO0Oo("location", ""), new C32074OooO0Oo("max-forwards", ""), new C32074OooO0Oo("proxy-authenticate", ""), new C32074OooO0Oo("proxy-authorization", ""), new C32074OooO0Oo("range", ""), new C32074OooO0Oo(RequestParameters.SUBRESOURCE_REFERER, ""), new C32074OooO0Oo("refresh", ""), new C32074OooO0Oo("retry-after", ""), new C32074OooO0Oo("server", ""), new C32074OooO0Oo("set-cookie", ""), new C32074OooO0Oo("strict-transport-security", ""), new C32074OooO0Oo(C18190ga.f54967l, ""), new C32074OooO0Oo("user-agent", ""), new C32074OooO0Oo("vary", ""), new C32074OooO0Oo("via", ""), new C32074OooO0Oo("www-authenticate", "")};
        f114876OooO0O0 = c32074OooO0OoArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c32074OooO0OoArr[i].f114853OooO00o)) {
                linkedHashMap.put(c32074OooO0OoArr[i].f114853OooO00o, Integer.valueOf(i));
            }
        }
        f114877OooO0OO = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void OooO00o(C34527OooO0oO c34527OooO0oO) throws IOException {
        int iOooO0OO = c34527OooO0oO.OooO0OO();
        for (int i = 0; i < iOooO0OO; i++) {
            byte bOooO0o = c34527OooO0oO.OooO0o(i);
            if (bOooO0o >= 65 && bOooO0o <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c34527OooO0oO.OooOOO0()));
            }
        }
    }
}
