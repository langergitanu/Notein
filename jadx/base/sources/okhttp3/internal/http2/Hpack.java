package okhttp3.internal.http2;

import Oooo.OooO0OO;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18190ga;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.marker.PerfConstants;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34542OooOo0O;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Huffman;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m80612d2 = {"Lokhttp3/internal/http2/Hpack;", "", "<init>", "()V", "Reader", "Writer", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Hpack {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Hpack f124501OooO00o = new Hpack();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Header[] f124502OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Map<C34527OooO0oO, Integer> f124503OooO0OO;

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Reader {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C34542OooOo0O f124506OooO0OO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f124508OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f124510OooO0oO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f124504OooO00o = 4096;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f124505OooO0O0 = new ArrayList();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Header[] f124507OooO0Oo = new Header[8];

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f124509OooO0o0 = 7;

        public Reader(Http2Reader.ContinuationSource continuationSource) {
            this.f124506OooO0OO = C34535OooOOOo.OooO0O0(continuationSource);
        }

        public final int OooO00o(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f124507OooO0Oo.length;
                while (true) {
                    length--;
                    i2 = this.f124509OooO0o0;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.f124507OooO0Oo[length];
                    OooOOO0.OooO0Oo(header);
                    int i4 = header.f124500OooO0OO;
                    i -= i4;
                    this.f124510OooO0oO -= i4;
                    this.f124508OooO0o--;
                    i3++;
                }
                Header[] headerArr = this.f124507OooO0Oo;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.f124508OooO0o);
                this.f124509OooO0o0 += i3;
            }
            return i3;
        }

        public final C34527OooO0oO OooO0O0(int i) throws IOException {
            if (i >= 0) {
                Hpack hpack = Hpack.f124501OooO00o;
                hpack.getClass();
                Header[] headerArr = Hpack.f124502OooO0O0;
                if (i <= headerArr.length - 1) {
                    hpack.getClass();
                    return headerArr[i].f124498OooO00o;
                }
            }
            Hpack.f124501OooO00o.getClass();
            int length = this.f124509OooO0o0 + 1 + (i - Hpack.f124502OooO0O0.length);
            if (length >= 0) {
                Header[] headerArr2 = this.f124507OooO0Oo;
                if (length < headerArr2.length) {
                    Header header = headerArr2[length];
                    OooOOO0.OooO0Oo(header);
                    return header.f124498OooO00o;
                }
            }
            throw new IOException(OooOOO0.OooOOO0(Integer.valueOf(i + 1), "Header index too large "));
        }

        public final void OooO0OO(Header header) {
            this.f124505OooO0O0.add(header);
            int i = this.f124504OooO00o;
            int i2 = header.f124500OooO0OO;
            if (i2 > i) {
                Header[] headerArr = this.f124507OooO0Oo;
                OooO0OO.OooOOOO(headerArr, null, 0, headerArr.length);
                this.f124509OooO0o0 = this.f124507OooO0Oo.length - 1;
                this.f124508OooO0o = 0;
                this.f124510OooO0oO = 0;
                return;
            }
            OooO00o((this.f124510OooO0oO + i2) - i);
            int i3 = this.f124508OooO0o + 1;
            Header[] headerArr2 = this.f124507OooO0Oo;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f124509OooO0o0 = this.f124507OooO0Oo.length - 1;
                this.f124507OooO0Oo = headerArr3;
            }
            int i4 = this.f124509OooO0o0;
            this.f124509OooO0o0 = i4 - 1;
            this.f124507OooO0Oo[i4] = header;
            this.f124508OooO0o++;
            this.f124510OooO0oO += i2;
        }

        public final C34527OooO0oO OooO0Oo() throws IOException {
            int i;
            C34542OooOo0O source = this.f124506OooO0OO;
            byte b = source.readByte();
            byte[] bArr = Util.f124301OooO00o;
            int i2 = b & 255;
            int i3 = 0;
            boolean z = (b & UnsignedBytes.MAX_POWER_OF_TWO) == 128;
            long jOooO0o0 = OooO0o0(i2, 127);
            if (!z) {
                return source.OoooO0O(jOooO0o0);
            }
            C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
            Huffman.f124641OooO00o.getClass();
            OooOOO0.OooO0oO(source, "source");
            Huffman.Node node = Huffman.f124644OooO0Oo;
            Huffman.Node node2 = node;
            long j = 0;
            int i4 = 0;
            while (j < jOooO0o0) {
                j++;
                byte b2 = source.readByte();
                byte[] bArr2 = Util.f124301OooO00o;
                i3 = (i3 << 8) | (b2 & 255);
                i4 += 8;
                while (i4 >= 8) {
                    Huffman.Node[] nodeArr = node2.f124645OooO00o;
                    OooOOO0.OooO0Oo(nodeArr);
                    node2 = nodeArr[(i3 >>> (i4 - 8)) & 255];
                    OooOOO0.OooO0Oo(node2);
                    if (node2.f124645OooO00o == null) {
                        c34524OooO0Oo.o0OoO0o(node2.f124646OooO0O0);
                        i4 -= node2.f124647OooO0OO;
                        node2 = node;
                    } else {
                        i4 -= 8;
                    }
                }
            }
            while (i4 > 0) {
                Huffman.Node[] nodeArr2 = node2.f124645OooO00o;
                OooOOO0.OooO0Oo(nodeArr2);
                Huffman.Node node3 = nodeArr2[(i3 << (8 - i4)) & 255];
                OooOOO0.OooO0Oo(node3);
                if (node3.f124645OooO00o != null || (i = node3.f124647OooO0OO) > i4) {
                    break;
                }
                c34524OooO0Oo.o0OoO0o(node3.f124646OooO0O0);
                i4 -= i;
                node2 = node;
            }
            return c34524OooO0Oo.OoooO0O(c34524OooO0Oo.f123723OooOo);
        }

        public final int OooO0o0(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte b = this.f124506OooO0OO.readByte();
                byte[] bArr = Util.f124301OooO00o;
                int i5 = b & 255;
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (b & Ascii.DEL) << i4;
                i4 += 7;
            }
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Writer {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C34524OooO0Oo f124511OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f124513OooO0OO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f124517OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f124518OooO0oo;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f124512OooO0O0 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f124514OooO0Oo = 4096;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Header[] f124516OooO0o0 = new Header[8];

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f124515OooO0o = 7;

        public Writer(C34524OooO0Oo c34524OooO0Oo) {
            this.f124511OooO00o = c34524OooO0Oo;
        }

        public final void OooO00o(int i) {
            int i2;
            if (i > 0) {
                int length = this.f124516OooO0o0.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f124515OooO0o;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.f124516OooO0o0[length];
                    OooOOO0.OooO0Oo(header);
                    i -= header.f124500OooO0OO;
                    int i4 = this.f124518OooO0oo;
                    Header header2 = this.f124516OooO0o0[length];
                    OooOOO0.OooO0Oo(header2);
                    this.f124518OooO0oo = i4 - header2.f124500OooO0OO;
                    this.f124517OooO0oO--;
                    i3++;
                    length--;
                }
                Header[] headerArr = this.f124516OooO0o0;
                int i5 = i2 + 1;
                System.arraycopy(headerArr, i5, headerArr, i5 + i3, this.f124517OooO0oO);
                Header[] headerArr2 = this.f124516OooO0o0;
                int i6 = this.f124515OooO0o + 1;
                Arrays.fill(headerArr2, i6, i6 + i3, (Object) null);
                this.f124515OooO0o += i3;
            }
        }

        public final void OooO0O0(Header header) {
            int i = this.f124514OooO0Oo;
            int i2 = header.f124500OooO0OO;
            if (i2 > i) {
                Header[] headerArr = this.f124516OooO0o0;
                OooO0OO.OooOOOO(headerArr, null, 0, headerArr.length);
                this.f124515OooO0o = this.f124516OooO0o0.length - 1;
                this.f124517OooO0oO = 0;
                this.f124518OooO0oo = 0;
                return;
            }
            OooO00o((this.f124518OooO0oo + i2) - i);
            int i3 = this.f124517OooO0oO + 1;
            Header[] headerArr2 = this.f124516OooO0o0;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f124515OooO0o = this.f124516OooO0o0.length - 1;
                this.f124516OooO0o0 = headerArr3;
            }
            int i4 = this.f124515OooO0o;
            this.f124515OooO0o = i4 - 1;
            this.f124516OooO0o0[i4] = header;
            this.f124517OooO0oO++;
            this.f124518OooO0oo += i2;
        }

        public final void OooO0OO(C34527OooO0oO data) throws IOException {
            OooOOO0.OooO0oO(data, "data");
            C34524OooO0Oo c34524OooO0Oo = this.f124511OooO00o;
            Huffman.f124641OooO00o.getClass();
            int iOooO0OO = data.OooO0OO();
            int i = 0;
            int i2 = 0;
            long j = 0;
            while (i2 < iOooO0OO) {
                int i3 = i2 + 1;
                byte bOooO0o = data.OooO0o(i2);
                byte[] bArr = Util.f124301OooO00o;
                j += (long) Huffman.f124643OooO0OO[bOooO0o & 255];
                i2 = i3;
            }
            if (((int) ((j + ((long) 7)) >> 3)) >= data.OooO0OO()) {
                OooO0o0(data.OooO0OO(), 127, 0);
                c34524OooO0Oo.o0000o0(data);
                return;
            }
            C34524OooO0Oo c34524OooO0Oo2 = new C34524OooO0Oo();
            Huffman.f124641OooO00o.getClass();
            int iOooO0OO2 = data.OooO0OO();
            long j2 = 0;
            int i4 = 0;
            while (i < iOooO0OO2) {
                int i5 = i + 1;
                byte bOooO0o2 = data.OooO0o(i);
                byte[] bArr2 = Util.f124301OooO00o;
                int i6 = bOooO0o2 & 255;
                int i7 = Huffman.f124642OooO0O0[i6];
                byte b = Huffman.f124643OooO0OO[i6];
                j2 = (j2 << b) | ((long) i7);
                i4 += b;
                while (i4 >= 8) {
                    i4 -= 8;
                    c34524OooO0Oo2.o0OoO0o((int) (j2 >> i4));
                }
                i = i5;
            }
            if (i4 > 0) {
                c34524OooO0Oo2.o0OoO0o((int) ((255 >>> i4) | (j2 << (8 - i4))));
            }
            C34527OooO0oO c34527OooO0oOOoooO0O = c34524OooO0Oo2.OoooO0O(c34524OooO0Oo2.f123723OooOo);
            OooO0o0(c34527OooO0oOOoooO0O.OooO0OO(), 127, 128);
            c34524OooO0Oo.o0000o0(c34527OooO0oOOoooO0O);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0Oo(ArrayList arrayList) throws IOException {
            int length;
            int length2;
            if (this.f124513OooO0OO) {
                int i = this.f124512OooO0O0;
                if (i < this.f124514OooO0Oo) {
                    OooO0o0(i, 31, 32);
                }
                this.f124513OooO0OO = false;
                this.f124512OooO0O0 = Integer.MAX_VALUE;
                OooO0o0(this.f124514OooO0Oo, 31, 32);
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                Header header = (Header) arrayList.get(i2);
                C34527OooO0oO c34527OooO0oOOooOO0O = header.f124498OooO00o.OooOO0O();
                Hpack.f124501OooO00o.getClass();
                Integer num = Hpack.f124503OooO0OO.get(c34527OooO0oOOooOO0O);
                C34527OooO0oO c34527OooO0oO = header.f124499OooO0O0;
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        Header[] headerArr = Hpack.f124502OooO0O0;
                        if (OooOOO0.OooO0O0(headerArr[iIntValue].f124499OooO0O0, c34527OooO0oO)) {
                            length = length2;
                        } else if (OooOOO0.OooO0O0(headerArr[length2].f124499OooO0O0, c34527OooO0oO)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i4 = this.f124515OooO0o + 1;
                    int length3 = this.f124516OooO0o0.length;
                    while (true) {
                        if (i4 >= length3) {
                            break;
                        }
                        int i5 = i4 + 1;
                        Header header2 = this.f124516OooO0o0[i4];
                        OooOOO0.OooO0Oo(header2);
                        if (OooOOO0.OooO0O0(header2.f124498OooO00o, c34527OooO0oOOooOO0O)) {
                            Header header3 = this.f124516OooO0o0[i4];
                            OooOOO0.OooO0Oo(header3);
                            if (OooOOO0.OooO0O0(header3.f124499OooO0O0, c34527OooO0oO)) {
                                int i6 = i4 - this.f124515OooO0o;
                                Hpack.f124501OooO00o.getClass();
                                length2 = Hpack.f124502OooO0O0.length + i6;
                                break;
                            } else if (length == -1) {
                                int i7 = i4 - this.f124515OooO0o;
                                Hpack.f124501OooO00o.getClass();
                                length = Hpack.f124502OooO0O0.length + i7;
                            }
                        }
                        i4 = i5;
                    }
                }
                if (length2 != -1) {
                    OooO0o0(length2, 127, 128);
                } else if (length == -1) {
                    this.f124511OooO00o.o0OoO0o(64);
                    OooO0OO(c34527OooO0oOOooOO0O);
                    OooO0OO(c34527OooO0oO);
                    OooO0O0(header);
                } else if (!c34527OooO0oOOooOO0O.OooOO0(Header.f124493OooO0Oo) || OooOOO0.OooO0O0(Header.f124492OooO, c34527OooO0oOOooOO0O)) {
                    OooO0o0(length, 63, 64);
                    OooO0OO(c34527OooO0oO);
                    OooO0O0(header);
                } else {
                    OooO0o0(length, 15, 0);
                    OooO0OO(c34527OooO0oO);
                }
                i2 = i3;
            }
        }

        public final void OooO0o0(int i, int i2, int i3) {
            C34524OooO0Oo c34524OooO0Oo = this.f124511OooO00o;
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
        Header header = new Header(Header.f124492OooO, "");
        C34527OooO0oO c34527OooO0oO = Header.f124494OooO0o;
        Header header2 = new Header(c34527OooO0oO, "GET");
        Header header3 = new Header(c34527OooO0oO, "POST");
        C34527OooO0oO c34527OooO0oO2 = Header.f124496OooO0oO;
        Header header4 = new Header(c34527OooO0oO2, "/");
        Header header5 = new Header(c34527OooO0oO2, "/index.html");
        C34527OooO0oO c34527OooO0oO3 = Header.f124497OooO0oo;
        Header header6 = new Header(c34527OooO0oO3, "http");
        Header header7 = new Header(c34527OooO0oO3, AuthenticationConstants.HTTPS_PROTOCOL_STRING);
        C34527OooO0oO c34527OooO0oO4 = Header.f124495OooO0o0;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header(c34527OooO0oO4, PerfConstants.ScenarioConstants.SCENARIO_BROKERED_ACQUIRE_TOKEN_SILENTLY), new Header(c34527OooO0oO4, TelemetryEventStrings.Api.GET_BROKER_DEVICE_MODE), new Header(c34527OooO0oO4, TelemetryEventStrings.Api.BROKER_GET_ACCOUNTS), new Header(c34527OooO0oO4, "304"), new Header(c34527OooO0oO4, "400"), new Header(c34527OooO0oO4, "404"), new Header(c34527OooO0oO4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header(Constants.MessagePayloadKeys.FROM, ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header(RequestParameters.SUBRESOURCE_REFERER, ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header(C18190ga.f54967l, ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f124502OooO0O0 = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (!linkedHashMap.containsKey(headerArr[i].f124498OooO00o)) {
                linkedHashMap.put(headerArr[i].f124498OooO00o, Integer.valueOf(i));
            }
            i = i2;
        }
        Map<C34527OooO0oO, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        OooOOO0.OooO0o(mapUnmodifiableMap, "unmodifiableMap(result)");
        f124503OooO0OO = mapUnmodifiableMap;
    }

    private Hpack() {
    }

    public static void OooO00o(C34527OooO0oO name) throws IOException {
        OooOOO0.OooO0oO(name, "name");
        int iOooO0OO = name.OooO0OO();
        int i = 0;
        while (i < iOooO0OO) {
            int i2 = i + 1;
            byte bOooO0o = name.OooO0o(i);
            if (65 <= bOooO0o && bOooO0o <= 90) {
                throw new IOException(OooOOO0.OooOOO0(name.OooOOO0(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
            i = i2;
        }
    }
}
