package okhttp3;

import com.aspose.slides.C22218Oooo;
import com.aspose.slides.PatternStyle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oooo.C24761OooO;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.InterfaceC34526OooO0o0;
import okhttp3.Headers;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Builder", "Companion", "Part", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class MultipartBody extends RequestBody {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final byte[] f124154OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final MediaType f124155OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Companion f124156OooO0o0 = new Companion(0);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final MediaType f124157OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final byte[] f124158OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final byte[] f124159OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34527OooO0oO f124160OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<Part> f124161OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final MediaType f124162OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f124163OooO0Oo;

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/MultipartBody$Builder;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C34527OooO0oO f124164OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public MediaType f124165OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f124166OooO0OO;

        public Builder() {
            String strOooO00o = C24761OooO.OooO00o("randomUUID().toString()");
            C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
            this.f124164OooO00o = C34527OooO0oO.OooO00o.OooO0O0(strOooO00o);
            this.f124165OooO0O0 = MultipartBody.f124155OooO0o;
            this.f124166OooO0OO = new ArrayList();
        }
    }

    @Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, m80612d2 = {"Lokhttp3/MultipartBody$Companion;", "", "<init>", "()V", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static void OooO00o(String key, StringBuilder sb) {
            OooOOO0.OooO0oO(key, "key");
            sb.append('\"');
            int length = key.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char cCharAt = key.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
                i = i2;
            }
            sb.append('\"');
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/MultipartBody$Part;", "", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Part {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Companion f124167OooO0OO = new Companion(0);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Headers f124168OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final RequestBody f124169OooO0O0;

        @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(int i) {
                this();
            }

            public static Part OooO00o(Headers headers, RequestBody body) {
                OooOOO0.OooO0oO(body, "body");
                if (headers.OooO0O0("Content-Type") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if (headers.OooO0O0("Content-Length") == null) {
                    return new Part(headers, body);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            public static Part OooO0O0(String str, String str2, RequestBody requestBody) {
                StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("form-data; name=");
                MultipartBody.f124156OooO0o0.getClass();
                Companion.OooO00o(str, sbOooO0OO);
                if (str2 != null) {
                    sbOooO0OO.append("; filename=");
                    Companion.OooO00o(str2, sbOooO0OO);
                }
                String string = sbOooO0OO.toString();
                OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
                Headers.Builder builder = new Headers.Builder();
                Headers.f124123OooOo.getClass();
                Headers.Companion.OooO00o("Content-Disposition");
                builder.OooO0O0("Content-Disposition", string);
                return OooO00o(builder.OooO0OO(), requestBody);
            }

            private Companion() {
            }
        }

        public Part(Headers headers, RequestBody requestBody) {
            this.f124168OooO00o = headers;
            this.f124169OooO0O0 = requestBody;
        }
    }

    static {
        MediaType.f124148OooO0o0.getClass();
        f124155OooO0o = MediaType.Companion.OooO00o("multipart/mixed");
        MediaType.Companion.OooO00o("multipart/alternative");
        MediaType.Companion.OooO00o("multipart/digest");
        MediaType.Companion.OooO00o("multipart/parallel");
        f124157OooO0oO = MediaType.Companion.OooO00o("multipart/form-data");
        f124158OooO0oo = new byte[]{58, 32};
        f124154OooO = new byte[]{13, 10};
        f124159OooOO0 = new byte[]{PatternStyle.DottedGrid, PatternStyle.DottedGrid};
    }

    public MultipartBody(C34527OooO0oO boundaryByteString, MediaType type, List<Part> list) {
        OooOOO0.OooO0oO(boundaryByteString, "boundaryByteString");
        OooOOO0.OooO0oO(type, "type");
        this.f124160OooO00o = boundaryByteString;
        this.f124161OooO0O0 = list;
        MediaType.Companion companion = MediaType.f124148OooO0o0;
        String str = type + "; boundary=" + boundaryByteString.OooOOO0();
        companion.getClass();
        this.f124162OooO0OO = MediaType.Companion.OooO00o(str);
        this.f124163OooO0Oo = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long OooO00o(InterfaceC34526OooO0o0 interfaceC34526OooO0o0, boolean z) throws IOException {
        C34524OooO0Oo c34524OooO0Oo;
        InterfaceC34526OooO0o0 c34524OooO0Oo2;
        if (z) {
            c34524OooO0Oo2 = new C34524OooO0Oo();
            c34524OooO0Oo = c34524OooO0Oo2;
        } else {
            c34524OooO0Oo = 0;
            c34524OooO0Oo2 = interfaceC34526OooO0o0;
        }
        List<Part> list = this.f124161OooO0O0;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            C34527OooO0oO c34527OooO0oO = this.f124160OooO00o;
            byte[] bArr = f124159OooOO0;
            byte[] bArr2 = f124154OooO;
            if (i >= size) {
                OooOOO0.OooO0Oo(c34524OooO0Oo2);
                c34524OooO0Oo2.write(bArr);
                c34524OooO0Oo2.Oooo0O0(c34527OooO0oO);
                c34524OooO0Oo2.write(bArr);
                c34524OooO0Oo2.write(bArr2);
                if (!z) {
                    return j;
                }
                OooOOO0.OooO0Oo(c34524OooO0Oo);
                long j2 = j + c34524OooO0Oo.f123723OooOo;
                c34524OooO0Oo.OooO00o();
                return j2;
            }
            int i2 = i + 1;
            Part part = list.get(i);
            Headers headers = part.f124168OooO00o;
            OooOOO0.OooO0Oo(c34524OooO0Oo2);
            c34524OooO0Oo2.write(bArr);
            c34524OooO0Oo2.Oooo0O0(c34527OooO0oO);
            c34524OooO0Oo2.write(bArr2);
            int size2 = headers.size();
            for (int i3 = 0; i3 < size2; i3++) {
                c34524OooO0Oo2.o00000Oo(headers.OooO0Oo(i3)).write(f124158OooO0oo).o00000Oo(headers.OooO0oO(i3)).write(bArr2);
            }
            RequestBody requestBody = part.f124169OooO0O0;
            MediaType f124162OooO0OO = requestBody.getF124162OooO0OO();
            if (f124162OooO0OO != null) {
                c34524OooO0Oo2.o00000Oo("Content-Type: ").o00000Oo(f124162OooO0OO.f124150OooO00o).write(bArr2);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                c34524OooO0Oo2.o00000Oo("Content-Length: ").Oooo0oo(jContentLength).write(bArr2);
            } else if (z) {
                OooOOO0.OooO0Oo(c34524OooO0Oo);
                c34524OooO0Oo.OooO00o();
                return -1L;
            }
            c34524OooO0Oo2.write(bArr2);
            if (z) {
                j += jContentLength;
            } else {
                requestBody.writeTo(c34524OooO0Oo2);
            }
            c34524OooO0Oo2.write(bArr2);
            i = i2;
        }
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws IOException {
        long j = this.f124163OooO0Oo;
        if (j != -1) {
            return j;
        }
        long jOooO00o = OooO00o(null, true);
        this.f124163OooO0Oo = jOooO00o;
        return jOooO00o;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public final MediaType getF124162OooO0OO() {
        return this.f124162OooO0OO;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC34526OooO0o0 sink) throws IOException {
        OooOOO0.OooO0oO(sink, "sink");
        OooO00o(sink, false);
    }
}
