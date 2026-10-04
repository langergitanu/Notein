package ooooOOo0;

import Oooo0oO.C21023OooO0Oo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import oOo00OoO.AbstractC34529OooOO0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34542OooOo0O;
import oOo00OoO.InterfaceC34525OooO0o;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import ooooOOo0.C35228OooOo;

/* JADX INFO: renamed from: ooooOOo0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35225OooOOo<T> implements InterfaceC35211OooO0O0<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Object[] f126460OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C35239OooOoO0 f126461OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC35214OooO0o<ResponseBody, T> f126462OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Call.Factory f126463OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile boolean f126464OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Throwable f126465OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Call f126466OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f126467OooOooO;

    /* JADX INFO: renamed from: ooooOOo0.OooOOo$OooO00o */
    public class OooO00o implements Callback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC35213OooO0Oo f126468OooO00o;

        public OooO00o(InterfaceC35213OooO0Oo interfaceC35213OooO0Oo) {
            this.f126468OooO00o = interfaceC35213OooO0Oo;
        }

        @Override // okhttp3.Callback
        public final void onFailure(Call call, IOException iOException) {
            try {
                this.f126468OooO00o.OooO00o(C35225OooOOo.this, iOException);
            } catch (Throwable th) {
                C35244OooOooo.OooOOO0(th);
                th.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public final void onResponse(Call call, Response response) {
            InterfaceC35213OooO0Oo interfaceC35213OooO0Oo = this.f126468OooO00o;
            C35225OooOOo c35225OooOOo = C35225OooOOo.this;
            try {
                try {
                    interfaceC35213OooO0Oo.OooO0O0(c35225OooOOo, c35225OooOOo.OooO0OO(response));
                } catch (Throwable th) {
                    C35244OooOooo.OooOOO0(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C35244OooOooo.OooOOO0(th2);
                try {
                    interfaceC35213OooO0Oo.OooO00o(c35225OooOOo, th2);
                } catch (Throwable th3) {
                    C35244OooOooo.OooOOO0(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOOo$OooO0O0 */
    public static final class OooO0O0 extends ResponseBody {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C34542OooOo0O f126470OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ResponseBody f126471OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public IOException f126472OooOoO0;

        /* JADX INFO: renamed from: ooooOOo0.OooOOo$OooO0O0$OooO00o */
        public class OooO00o extends AbstractC34529OooOO0 {
            public OooO00o(InterfaceC34525OooO0o interfaceC34525OooO0o) {
                super(interfaceC34525OooO0o);
            }

            @Override // oOo00OoO.AbstractC34529OooOO0, oOo00OoO.InterfaceC34548OooOoo0
            public final long read(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
                try {
                    return super.read(c34524OooO0Oo, j);
                } catch (IOException e) {
                    OooO0O0.this.f126472OooOoO0 = e;
                    throw e;
                }
            }
        }

        public OooO0O0(ResponseBody responseBody) {
            this.f126471OooOo0o = responseBody;
            this.f126470OooOo = C34535OooOOOo.OooO0O0(new OooO00o(responseBody.getF124289OooOoO0()));
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f126471OooOo0o.close();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public final long getF124287OooOo() {
            return this.f126471OooOo0o.getF124287OooOo();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType getF124288OooOo0o() {
            return this.f126471OooOo0o.getF124288OooOo0o();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public final InterfaceC34525OooO0o getF124289OooOoO0() {
            return this.f126470OooOo;
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOOo$OooO0OO */
    public static final class OooO0OO extends ResponseBody {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final long f126474OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final MediaType f126475OooOo0o;

        public OooO0OO(MediaType mediaType, long j) {
            this.f126475OooOo0o = mediaType;
            this.f126474OooOo = j;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public final long getF124287OooOo() {
            return this.f126474OooOo;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType getF124288OooOo0o() {
            return this.f126475OooOo0o;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public final InterfaceC34525OooO0o getF124289OooOoO0() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C35225OooOOo(C35239OooOoO0 c35239OooOoO0, Object[] objArr, Call.Factory factory, InterfaceC35214OooO0o<ResponseBody, T> interfaceC35214OooO0o) {
        this.f126461OooOo0o = c35239OooOoO0;
        this.f126460OooOo = objArr;
        this.f126463OooOoO0 = factory;
        this.f126462OooOoO = interfaceC35214OooO0o;
    }

    public final Call OooO00o() throws IOException {
        HttpUrl httpUrlOooO0OO;
        C35239OooOoO0 c35239OooOoO0 = this.f126461OooOo0o;
        c35239OooOoO0.getClass();
        Object[] objArr = this.f126460OooOo;
        int length = objArr.length;
        AbstractC35231OooOo0O<?>[] abstractC35231OooOo0OArr = c35239OooOoO0.f126553OooOO0;
        if (length != abstractC35231OooOo0OArr.length) {
            throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(")", abstractC35231OooOo0OArr.length, OooO0O0.OooO0o.OooO0OO(length, "Argument count (", ") doesn't match expected count (")));
        }
        C35228OooOo c35228OooOo = new C35228OooOo(c35239OooOoO0.f126547OooO0OO, c35239OooOoO0.f126546OooO0O0, c35239OooOoO0.f126548OooO0Oo, c35239OooOoO0.f126550OooO0o0, c35239OooOoO0.f126549OooO0o, c35239OooOoO0.f126551OooO0oO, c35239OooOoO0.f126552OooO0oo, c35239OooOoO0.f126544OooO);
        if (c35239OooOoO0.f126554OooOO0O) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            abstractC35231OooOo0OArr[i].OooO00o(c35228OooOo, objArr[i]);
        }
        HttpUrl.Builder builder = c35228OooOo.f126488OooO0Oo;
        if (builder != null) {
            httpUrlOooO0OO = builder.OooO0OO();
        } else {
            String link = c35228OooOo.f126487OooO0OO;
            HttpUrl httpUrl = c35228OooOo.f126486OooO0O0;
            httpUrl.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(link, "link");
            HttpUrl.Builder builderOooO0oO = httpUrl.OooO0oO(link);
            httpUrlOooO0OO = builderOooO0oO == null ? null : builderOooO0oO.OooO0OO();
            if (httpUrlOooO0OO == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + c35228OooOo.f126487OooO0OO);
            }
        }
        RequestBody oooO00o = c35228OooOo.f126494OooOO0O;
        if (oooO00o == null) {
            FormBody.Builder builder2 = c35228OooOo.f126493OooOO0;
            if (builder2 != null) {
                oooO00o = new FormBody(builder2.f124114OooO00o, builder2.f124115OooO0O0);
            } else {
                MultipartBody.Builder builder3 = c35228OooOo.f126484OooO;
                if (builder3 != null) {
                    ArrayList arrayList2 = builder3.f124166OooO0OO;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    oooO00o = new MultipartBody(builder3.f124164OooO00o, builder3.f124165OooO0O0, Util.OooOoO0(arrayList2));
                } else if (c35228OooOo.f126492OooO0oo) {
                    oooO00o = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = c35228OooOo.f126491OooO0oO;
        Headers.Builder builder4 = c35228OooOo.f126489OooO0o;
        if (mediaType != null) {
            if (oooO00o != null) {
                oooO00o = new C35228OooOo.OooO00o(oooO00o, mediaType);
            } else {
                builder4.OooO00o("Content-Type", mediaType.f124150OooO00o);
            }
        }
        Request.Builder builder5 = c35228OooOo.f126490OooO0o0;
        builder5.getClass();
        builder5.f124244OooO00o = httpUrlOooO0OO;
        builder5.f124246OooO0OO = builder4.OooO0OO().OooO0o0();
        builder5.OooO0Oo(c35228OooOo.f126485OooO00o, oooO00o);
        builder5.OooO0o0(C35222OooOOO0.class, new C35222OooOOO0(c35239OooOoO0.f126545OooO00o, arrayList));
        return this.f126463OooOoO0.OooO00o(builder5.OooO0O0());
    }

    public final Call OooO0O0() throws IOException {
        Call call = this.f126466OooOoo0;
        if (call != null) {
            return call;
        }
        Throwable th = this.f126465OooOoo;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            Call callOooO00o = OooO00o();
            this.f126466OooOoo0 = callOooO00o;
            return callOooO00o;
        } catch (IOException | Error | RuntimeException e) {
            C35244OooOooo.OooOOO0(e);
            this.f126465OooOoo = e;
            throw e;
        }
    }

    public final C35238OooOoO<T> OooO0OO(Response response) throws IOException {
        ResponseBody responseBody = response.f124262OooOoo;
        Response.Builder builderOooOOO0 = response.OooOOO0();
        builderOooOOO0.f124277OooO0oO = new OooO0OO(responseBody.getF124288OooOo0o(), responseBody.getF124287OooOo());
        Response responseOooO00o = builderOooOOO0.OooO00o();
        int i = responseOooO00o.f124259OooOoO;
        if (i < 200 || i >= 300) {
            try {
                C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                responseBody.getF124289OooOoO0().o0O0O00(c34524OooO0Oo);
                ResponseBody responseBodyCreate = ResponseBody.create(responseBody.getF124288OooOo0o(), responseBody.getF124287OooOo(), c34524OooO0Oo);
                Objects.requireNonNull(responseBodyCreate, "body == null");
                if (responseOooO00o.OooO0OO()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new C35238OooOoO<>(responseOooO00o, null, responseBodyCreate);
            } finally {
                responseBody.close();
            }
        }
        if (i == 204 || i == 205) {
            responseBody.close();
            if (responseOooO00o.OooO0OO()) {
                return new C35238OooOoO<>(responseOooO00o, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        OooO0O0 oooO0O0 = new OooO0O0(responseBody);
        try {
            T tConvert = this.f126462OooOoO.convert(oooO0O0);
            if (responseOooO00o.OooO0OO()) {
                return new C35238OooOoO<>(responseOooO00o, tConvert, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = oooO0O0.f126472OooOoO0;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // ooooOOo0.InterfaceC35211OooO0O0
    public final void OooOOo0(InterfaceC35213OooO0Oo<T> interfaceC35213OooO0Oo) {
        Call call;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f126467OooOooO) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f126467OooOooO = true;
                call = this.f126466OooOoo0;
                th = this.f126465OooOoo;
                if (call == null && th == null) {
                    try {
                        Call callOooO00o = OooO00o();
                        this.f126466OooOoo0 = callOooO00o;
                        call = callOooO00o;
                    } catch (Throwable th2) {
                        th = th2;
                        C35244OooOooo.OooOOO0(th);
                        this.f126465OooOoo = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC35213OooO0Oo.OooO00o(this, th);
            return;
        }
        if (this.f126464OooOoOO) {
            call.cancel();
        }
        call.o0000O0O(new OooO00o(interfaceC35213OooO0Oo));
    }

    @Override // ooooOOo0.InterfaceC35211OooO0O0
    public final void cancel() {
        Call call;
        this.f126464OooOoOO = true;
        synchronized (this) {
            call = this.f126466OooOoo0;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new C35225OooOOo(this.f126461OooOo0o, this.f126460OooOo, this.f126463OooOoO0, this.f126462OooOoO);
    }

    @Override // ooooOOo0.InterfaceC35211OooO0O0
    public final C35238OooOoO<T> execute() throws IOException {
        Call callOooO0O0;
        synchronized (this) {
            if (this.f126467OooOooO) {
                throw new IllegalStateException("Already executed.");
            }
            this.f126467OooOooO = true;
            callOooO0O0 = OooO0O0();
        }
        if (this.f126464OooOoOO) {
            callOooO0O0.cancel();
        }
        return OooO0OO(callOooO0O0.execute());
    }

    @Override // ooooOOo0.InterfaceC35211OooO0O0
    public final boolean isCanceled() {
        boolean z = true;
        if (this.f126464OooOoOO) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f126466OooOoo0;
                if (call == null || !call.getF124390Oooo0o0()) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // ooooOOo0.InterfaceC35211OooO0O0
    public final synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return OooO0O0().getF124374OooOo();
    }

    @Override // ooooOOo0.InterfaceC35211OooO0O0
    /* JADX INFO: renamed from: clone */
    public final InterfaceC35211OooO0O0 mo80774clone() {
        return new C35225OooOOo(this.f126461OooOo0o, this.f126460OooOo, this.f126463OooOoO0, this.f126462OooOoO);
    }
}
