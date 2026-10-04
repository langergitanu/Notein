package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000.OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33580OooO00o;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.InterfaceC34525OooO0o;
import okhttp3.MediaType;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, m80612d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "", "T", "Lkotlin/Function1;", "LoOo00OoO/OooO0o;", "consumer", "", "sizeMapper", "consumeSource", "(LoO0O000o/OooOO0o;LoO0O000o/OooOO0o;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "()Ljava/nio/charset/Charset;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "source", "()LoOo00OoO/OooO0o;", "", "bytes", "()[B", "LoOo00OoO/OooO0oO;", "byteString", "()LoOo00OoO/OooO0oO;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "LoO00ooO/OooOooO;", "close", "reader", "Ljava/io/Reader;", "Companion", "BomAwareReader", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);
    private Reader reader;

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class BomAwareReader extends Reader {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Charset f124283OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC34525OooO0o f124284OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public InputStreamReader f124285OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f124286OooOoO0;

        public BomAwareReader(InterfaceC34525OooO0o source, Charset charset) {
            OooOOO0.OooO0oO(source, "source");
            OooOOO0.OooO0oO(charset, "charset");
            this.f124284OooOo0o = source;
            this.f124283OooOo = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            C32460OooOooO c32460OooOooO;
            this.f124286OooOoO0 = true;
            InputStreamReader inputStreamReader = this.f124285OooOoO;
            if (inputStreamReader == null) {
                c32460OooOooO = null;
            } else {
                inputStreamReader.close();
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            if (c32460OooOooO == null) {
                this.f124284OooOo0o.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cbuf, int i, int i2) throws IOException {
            OooOOO0.OooO0oO(cbuf, "cbuf");
            if (this.f124286OooOoO0) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f124285OooOoO;
            if (inputStreamReader == null) {
                InterfaceC34525OooO0o interfaceC34525OooO0o = this.f124284OooOo0o;
                inputStreamReader = new InputStreamReader(interfaceC34525OooO0o.o000OO00(), Util.OooOOoo(interfaceC34525OooO0o, this.f124283OooOo));
                this.f124285OooOoO = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i, i2);
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static ResponseBody$Companion$asResponseBody$1 OooO00o(String str, MediaType mediaType) {
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
            C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
            OooOOO0.OooO0oO(charset, "charset");
            c34524OooO0Oo.o000Oo00(str, 0, str.length(), charset);
            return OooO0O0(c34524OooO0Oo, mediaType, c34524OooO0Oo.f123723OooOo);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.ResponseBody$Companion$asResponseBody$1] */
        public static ResponseBody$Companion$asResponseBody$1 OooO0O0(final InterfaceC34525OooO0o interfaceC34525OooO0o, final MediaType mediaType, final long j) {
            OooOOO0.OooO0oO(interfaceC34525OooO0o, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentLength, reason: from getter */
                public final long getF124287OooOo() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public final MediaType getF124288OooOo0o() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: source, reason: from getter */
                public final InterfaceC34525OooO0o getF124289OooOoO0() {
                    return interfaceC34525OooO0o;
                }
            };
        }

        public static ResponseBody$Companion$asResponseBody$1 OooO0OO(byte[] bArr, MediaType mediaType) {
            OooOOO0.OooO0oO(bArr, "<this>");
            C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
            c34524OooO0Oo.o0000ooO(bArr);
            return OooO0O0(c34524OooO0Oo, mediaType, bArr.length);
        }

        private Companion() {
        }
    }

    private final Charset charset() {
        MediaType mediaTypeContentType = getF124288OooOo0o();
        Charset charsetOooO00o = mediaTypeContentType == null ? null : mediaTypeContentType.OooO00o(C33580OooO00o.f121231OooO0O0);
        return charsetOooO00o == null ? C33580OooO00o.f121231OooO0O0 : charsetOooO00o;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(InterfaceC32507OooOO0o<? super InterfaceC34525OooO0o, ? extends T> consumer, InterfaceC32507OooOO0o<? super T, Integer> sizeMapper) throws IOException {
        long jContentLength = getF124287OooOo();
        if (jContentLength > 2147483647L) {
            throw new IOException(OooOOO0.OooOOO0(Long.valueOf(jContentLength), "Cannot buffer entire body for content length: "));
        }
        InterfaceC34525OooO0o interfaceC34525OooO0oSource = getF124289OooOoO0();
        try {
            T tInvoke = consumer.invoke(interfaceC34525OooO0oSource);
            OooO00o.OooO00o(interfaceC34525OooO0oSource, null);
            int iIntValue = sizeMapper.invoke(tInvoke).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } finally {
        }
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        INSTANCE.getClass();
        return Companion.OooO00o(str, mediaType);
    }

    public final InputStream byteStream() {
        return getF124289OooOoO0().o000OO00();
    }

    public final C34527OooO0oO byteString() throws IOException {
        long jContentLength = getF124287OooOo();
        if (jContentLength > 2147483647L) {
            throw new IOException(OooOOO0.OooOOO0(Long.valueOf(jContentLength), "Cannot buffer entire body for content length: "));
        }
        InterfaceC34525OooO0o interfaceC34525OooO0oSource = getF124289OooOoO0();
        try {
            C34527OooO0oO c34527OooO0oOOoooooO = interfaceC34525OooO0oSource.OoooooO();
            interfaceC34525OooO0oSource.close();
            int iOooO0OO = c34527OooO0oOOoooooO.OooO0OO();
            if (jContentLength == -1 || jContentLength == iOooO0OO) {
                return c34527OooO0oOOoooooO;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iOooO0OO + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = getF124287OooOo();
        if (jContentLength > 2147483647L) {
            throw new IOException(OooOOO0.OooOOO0(Long.valueOf(jContentLength), "Cannot buffer entire body for content length: "));
        }
        InterfaceC34525OooO0o interfaceC34525OooO0oSource = getF124289OooOoO0();
        try {
            byte[] bArrO000oOoO = interfaceC34525OooO0oSource.o000oOoO();
            interfaceC34525OooO0oSource.close();
            int length = bArrO000oOoO.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrO000oOoO;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(getF124289OooOoO0(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.OooO0OO(getF124289OooOoO0());
    }

    /* JADX INFO: renamed from: contentLength */
    public abstract long getF124287OooOo();

    /* JADX INFO: renamed from: contentType */
    public abstract MediaType getF124288OooOo0o();

    /* JADX INFO: renamed from: source */
    public abstract InterfaceC34525OooO0o getF124289OooOoO0();

    public final String string() throws IOException {
        InterfaceC34525OooO0o interfaceC34525OooO0oSource = getF124289OooOoO0();
        try {
            String strOooooOo = interfaceC34525OooO0oSource.OooooOo(Util.OooOOoo(interfaceC34525OooO0oSource, charset()));
            interfaceC34525OooO0oSource.close();
            return strOooooOo;
        } finally {
        }
    }

    public static final ResponseBody create(InterfaceC34525OooO0o interfaceC34525OooO0o, MediaType mediaType, long j) {
        INSTANCE.getClass();
        return Companion.OooO0O0(interfaceC34525OooO0o, mediaType, j);
    }

    public static final ResponseBody create(MediaType mediaType, long j, InterfaceC34525OooO0o content) {
        INSTANCE.getClass();
        OooOOO0.OooO0oO(content, "content");
        return Companion.OooO0O0(content, mediaType, j);
    }

    public static final ResponseBody create(MediaType mediaType, String content) {
        INSTANCE.getClass();
        OooOOO0.OooO0oO(content, "content");
        return Companion.OooO00o(content, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, C34527OooO0oO content) {
        INSTANCE.getClass();
        OooOOO0.OooO0oO(content, "content");
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        c34524OooO0Oo.o0000o0(content);
        return Companion.OooO0O0(c34524OooO0Oo, mediaType, content.OooO0OO());
    }

    public static final ResponseBody create(MediaType mediaType, byte[] content) {
        INSTANCE.getClass();
        OooOOO0.OooO0oO(content, "content");
        return Companion.OooO0OO(content, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        INSTANCE.getClass();
        return Companion.OooO0OO(bArr, mediaType);
    }

    public static final ResponseBody create(C34527OooO0oO c34527OooO0oO, MediaType mediaType) {
        INSTANCE.getClass();
        OooOOO0.OooO0oO(c34527OooO0oO, "<this>");
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        c34524OooO0Oo.o0000o0(c34527OooO0oO);
        return Companion.OooO0O0(c34524OooO0Oo, mediaType, c34527OooO0oO.OooO0OO());
    }
}
