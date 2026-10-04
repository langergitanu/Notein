package ooooOOo0;

import com.huawei.hms.network.embedded.C18416x7;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import oOo00OoO.InterfaceC34526OooO0o0;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: renamed from: ooooOOo0.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35228OooOo {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final char[] f126482OooOO0o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Pattern f126483OooOOO0 = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final MultipartBody.Builder f126484OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f126485OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HttpUrl f126486OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f126487OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HttpUrl.Builder f126488OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Headers.Builder f126489OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Request.Builder f126490OooO0o0 = new Request.Builder();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public MediaType f126491OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f126492OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final FormBody.Builder f126493OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public RequestBody f126494OooOO0O;

    /* JADX INFO: renamed from: ooooOOo0.OooOo$OooO00o */
    public static class OooO00o extends RequestBody {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final RequestBody f126495OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final MediaType f126496OooO0O0;

        public OooO00o(RequestBody requestBody, MediaType mediaType) {
            this.f126495OooO00o = requestBody;
            this.f126496OooO0O0 = mediaType;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() throws IOException {
            return this.f126495OooO00o.contentLength();
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType getF124162OooO0OO() {
            return this.f126496OooO0O0;
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(InterfaceC34526OooO0o0 interfaceC34526OooO0o0) throws IOException {
            this.f126495OooO00o.writeTo(interfaceC34526OooO0o0);
        }
    }

    public C35228OooOo(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f126485OooO00o = str;
        this.f126486OooO0O0 = httpUrl;
        this.f126487OooO0OO = str2;
        this.f126491OooO0oO = mediaType;
        this.f126492OooO0oo = z;
        if (headers != null) {
            this.f126489OooO0o = headers.OooO0o0();
        } else {
            this.f126489OooO0o = new Headers.Builder();
        }
        if (z2) {
            this.f126493OooOO0 = new FormBody.Builder();
            return;
        }
        if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f126484OooO = builder;
            MediaType type = MultipartBody.f124157OooO0oO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
            if (!type.f124151OooO0O0.equals("multipart")) {
                throw new IllegalArgumentException(kotlin.jvm.internal.OooOOO0.OooOOO0(type, "multipart != ").toString());
            }
            builder.f124165OooO0O0 = type;
        }
    }

    public final void OooO00o(String name, String str, boolean z) {
        FormBody.Builder builder = this.f126493OooOO0;
        if (z) {
            builder.OooO00o(name, str);
            return;
        }
        builder.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        ArrayList arrayList = builder.f124114OooO00o;
        HttpUrl.Companion companion = HttpUrl.f124126OooOO0O;
        arrayList.add(HttpUrl.Companion.OooO00o(companion, name, 0, 0, C18416x7.f56649s, 91));
        builder.f124115OooO0O0.add(HttpUrl.Companion.OooO00o(companion, str, 0, 0, C18416x7.f56649s, 91));
    }

    public final void OooO0O0(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f126489OooO0o.OooO00o(str, str2);
            return;
        }
        try {
            MediaType.f124148OooO0o0.getClass();
            this.f126491OooO0oO = MediaType.Companion.OooO00o(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Malformed content type: ", str2), e);
        }
    }

    public final void OooO0OO(String str, String str2, boolean z) throws EOFException {
        String str3 = this.f126487OooO0OO;
        if (str3 != null) {
            HttpUrl httpUrl = this.f126486OooO0O0;
            HttpUrl.Builder builderOooO0oO = httpUrl.OooO0oO(str3);
            this.f126488OooO0Oo = builderOooO0oO;
            if (builderOooO0oO == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + this.f126487OooO0OO);
            }
            this.f126487OooO0OO = null;
        }
        if (z) {
            this.f126488OooO0Oo.OooO00o(str, str2);
        } else {
            this.f126488OooO0Oo.OooO0O0(str, str2);
        }
    }
}
