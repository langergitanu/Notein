package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.channels.IllegalBlockingModeException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.o3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18295o3 extends ResponseBody {

    /* JADX INFO: renamed from: d */
    public static final String f55815d = "ResponseBodyImpl";

    /* JADX INFO: renamed from: a */
    public String f55816a;

    /* JADX INFO: renamed from: b */
    public long f55817b;

    /* JADX INFO: renamed from: c */
    public InputStream f55818c;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.o3$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public String f55819a;

        /* JADX INFO: renamed from: b */
        public InputStream f55820b;

        /* JADX INFO: renamed from: c */
        public long f55821c;

        /* JADX INFO: renamed from: d */
        public Charset f55822d;

        public b() {
        }

        public C18295o3 build() {
            return new C18295o3(this);
        }

        public b charSet(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f55822d = Charset.forName(str);
                    return this;
                } catch (IllegalCharsetNameException | UnsupportedCharsetException e) {
                    Logger.m76968w("ResponseBody", "charSet error", e);
                }
            }
            return this;
        }

        public b contentLength(long j) {
            this.f55821c = j;
            return this;
        }

        public b contentType(String str) {
            this.f55819a = str;
            return this;
        }

        public b inputStream(InputStream inputStream) {
            if (inputStream == null) {
                throw new NullPointerException("inputStream not null in ResponseBody");
            }
            this.f55820b = inputStream;
            return this;
        }

        public b(C18295o3 c18295o3) {
            this.f55819a = c18295o3.f55816a;
            this.f55821c = c18295o3.f55817b;
            this.f55822d = c18295o3.charSet;
            this.f55820b = c18295o3.f55818c;
        }

        public b charSet(Charset charset) {
            this.f55822d = charset;
            return this;
        }
    }

    public C18295o3(b bVar) {
        this.f55816a = bVar.f55819a;
        this.f55817b = bVar.f55821c;
        this.f55818c = bVar.f55820b;
        this.charSet = bVar.f55822d;
    }

    @Override // com.huawei.hms.network.httpclient.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f55818c;
        if (inputStream != null) {
            try {
                IoUtils.closeSecure(inputStream);
            } catch (IllegalBlockingModeException e) {
                Logger.m76968w(f55815d, "closeSecure IllegalBlockingModeException", e);
            }
        }
        Reader reader = this.reader;
        if (reader != null) {
            try {
                IoUtils.closeSecure(reader);
            } catch (IllegalBlockingModeException e2) {
                Logger.m76968w(f55815d, "closeSecure IllegalBlockingModeException", e2);
            }
        }
    }

    @Override // com.huawei.hms.network.httpclient.ResponseBody
    public long getContentLength() {
        return this.f55817b;
    }

    @Override // com.huawei.hms.network.httpclient.ResponseBody
    public String getContentType() {
        return this.f55816a;
    }

    @Override // com.huawei.hms.network.httpclient.ResponseBody
    public final InputStream getInputStream() {
        return this.f55818c;
    }

    public b newBuilder() {
        return new b(this);
    }
}
