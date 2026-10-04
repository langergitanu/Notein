package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33580OooO00o;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.InterfaceC34526OooO0o0;
import okhttp3.MediaType;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, m80612d2 = {"Lokhttp3/RequestBody;", "", "<init>", "()V", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "LoOo00OoO/OooO0o0;", "sink", "LoO00ooO/OooOooO;", "writeTo", "(LoOo00OoO/OooO0o0;)V", "", "isDuplex", "()Z", "isOneShot", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public abstract class RequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/RequestBody$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static RequestBody$Companion$toRequestBody$2 OooO00o(String str, MediaType mediaType) {
            OooOOO0.OooO0oO(str, "<this>");
            Charset charset = C33580OooO00o.f121231OooO0O0;
            if (mediaType != null) {
                MediaType.Companion companion = MediaType.f124148OooO0o0;
                Charset charsetOooO00o = mediaType.OooO00o(null);
                if (charsetOooO00o == null) {
                    MediaType.f124148OooO0o0.getClass();
                    mediaType = MediaType.Companion.OooO0O0(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetOooO00o;
                }
            }
            byte[] bytes = str.getBytes(charset);
            OooOOO0.OooO0o(bytes, "this as java.lang.String).getBytes(charset)");
            return OooO0O0(mediaType, bytes, 0, bytes.length);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [okhttp3.RequestBody$Companion$toRequestBody$2] */
        public static RequestBody$Companion$toRequestBody$2 OooO0O0(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
            OooOOO0.OooO0oO(bArr, "<this>");
            long length = bArr.length;
            long j = i;
            long j2 = i2;
            byte[] bArr2 = Util.f124301OooO00o;
            if ((j | j2) < 0 || j > length || length - j < j2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public final long contentLength() {
                    return i2;
                }

                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public final MediaType getF124253OooO00o() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public final void writeTo(InterfaceC34526OooO0o0 sink) throws IOException {
                    OooOOO0.OooO0oO(sink, "sink");
                    sink.o000O0o0(i, i2, bArr);
                }
            };
        }

        public static RequestBody$Companion$toRequestBody$2 OooO0OO(Companion companion, MediaType mediaType, byte[] content, int i, int i2) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            int length = content.length;
            companion.getClass();
            OooOOO0.OooO0oO(content, "content");
            return OooO0O0(mediaType, content, i, length);
        }

        public static /* synthetic */ RequestBody$Companion$toRequestBody$2 OooO0Oo(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            int length = bArr.length;
            companion.getClass();
            return OooO0O0(mediaType, bArr, i, length);
        }

        private Companion() {
        }
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        INSTANCE.getClass();
        return Companion.OooO00o(str, mediaType);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    /* JADX INFO: renamed from: contentType */
    public abstract MediaType getF124253OooO00o();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC34526OooO0o0 sink) throws IOException;

    public static final RequestBody create(MediaType mediaType, C34527OooO0oO content) {
        INSTANCE.getClass();
        OooOOO0.OooO0oO(content, "content");
        return new RequestBody$Companion$toRequestBody$1(mediaType, content);
    }

    public static final RequestBody create(MediaType mediaType, byte[] content) {
        Companion companion = INSTANCE;
        companion.getClass();
        OooOOO0.OooO0oO(content, "content");
        return Companion.OooO0OO(companion, mediaType, content, 0, 12);
    }

    public static final RequestBody create(MediaType mediaType, byte[] content, int i) {
        Companion companion = INSTANCE;
        companion.getClass();
        OooOOO0.OooO0oO(content, "content");
        return Companion.OooO0OO(companion, mediaType, content, i, 8);
    }

    public static final RequestBody create(byte[] bArr) {
        Companion companion = INSTANCE;
        companion.getClass();
        OooOOO0.OooO0oO(bArr, "<this>");
        return Companion.OooO0Oo(companion, bArr, null, 0, 7);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        Companion companion = INSTANCE;
        companion.getClass();
        OooOOO0.OooO0oO(bArr, "<this>");
        return Companion.OooO0Oo(companion, bArr, mediaType, 0, 6);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
        Companion companion = INSTANCE;
        companion.getClass();
        OooOOO0.OooO0oO(bArr, "<this>");
        return Companion.OooO0Oo(companion, bArr, mediaType, i, 4);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
        INSTANCE.getClass();
        return Companion.OooO0O0(mediaType, bArr, i, i2);
    }

    public static final RequestBody create(C34527OooO0oO c34527OooO0oO, MediaType mediaType) {
        INSTANCE.getClass();
        OooOOO0.OooO0oO(c34527OooO0oO, "<this>");
        return new RequestBody$Companion$toRequestBody$1(mediaType, c34527OooO0oO);
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        INSTANCE.getClass();
        OooOOO0.OooO0oO(file, "<this>");
        return new RequestBody$Companion$asRequestBody$1(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, File file) {
        INSTANCE.getClass();
        OooOOO0.OooO0oO(file, "file");
        return new RequestBody$Companion$asRequestBody$1(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String content) {
        INSTANCE.getClass();
        OooOOO0.OooO0oO(content, "content");
        return Companion.OooO00o(content, mediaType);
    }

    public static final RequestBody create(MediaType mediaType, byte[] content, int i, int i2) {
        INSTANCE.getClass();
        OooOOO0.OooO0oO(content, "content");
        return Companion.OooO0O0(mediaType, content, i, i2);
    }
}
