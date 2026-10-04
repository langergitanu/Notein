package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C22272OooOoO;
import com.facebook.imagepipeline.producers.C22289OoooO0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C22289OoooO0.OooO00o f67339OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C22272OooOoO.OooO00o f67340OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C22272OooOoO f67341OooOoO0;

    public OooOo(C22272OooOoO c22272OooOoO, C22272OooOoO.OooO00o oooO00o, C22289OoooO0.OooO00o oooO00o2) {
        this.f67341OooOoO0 = c22272OooOoO;
        this.f67340OooOo0o = oooO00o;
        this.f67339OooOo = oooO00o2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        Throwable th;
        IOException e;
        HttpURLConnection httpURLConnectionOooo;
        InputStream inputStream;
        C22272OooOoO.OooO00o oooO00o = this.f67340OooOo0o;
        C22289OoooO0.OooO00o oooO00o2 = this.f67339OooOo;
        C22272OooOoO c22272OooOoO = this.f67341OooOoO0;
        c22272OooOoO.getClass();
        ?? r3 = 0;
        InputStream inputStream2 = null;
        r3 = 0;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                r3 = oooO00o;
            }
            try {
                httpURLConnectionOooo = c22272OooOoO.Oooo(oooO00o.f67357OooO0O0.OooOOoo().f87911OooO0O0, 5);
                try {
                    oooO00o.f67364OooO0o0 = c22272OooOoO.f67361OooOoO0.now();
                    if (httpURLConnectionOooo != null) {
                        inputStream = httpURLConnectionOooo.getInputStream();
                        try {
                            oooO00o2.OooO00o(inputStream);
                            inputStream2 = inputStream;
                        } catch (IOException e2) {
                            e = e2;
                            C22289OoooO0.this.getClass();
                            C22271OooOo0o c22271OooOo0o = oooO00o2.f67418OooO00o;
                            o000oOoO o000ooooOooOOo0 = c22271OooOo0o.f67357OooO0O0.OooOOo0();
                            InterfaceC22288OoooO interfaceC22288OoooO = c22271OooOo0o.f67357OooO0O0;
                            o000ooooOooOOo0.OooOO0O(interfaceC22288OoooO, "NetworkFetchProducer", e, null);
                            interfaceC22288OoooO.OooOOo0().OooO0O0(interfaceC22288OoooO, "NetworkFetchProducer", false);
                            interfaceC22288OoooO.Oooo0("network");
                            c22271OooOo0o.f67356OooO00o.onFailure(e);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            if (httpURLConnectionOooo == null) {
                                return;
                            }
                        }
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnectionOooo == null) {
                        return;
                    }
                } catch (IOException e3) {
                    e = e3;
                    inputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (r3 != 0) {
                        try {
                            r3.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (httpURLConnectionOooo != null) {
                        throw th;
                    }
                    httpURLConnectionOooo.disconnect();
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                inputStream = null;
                httpURLConnectionOooo = null;
                C22289OoooO0.this.getClass();
                C22271OooOo0o c22271OooOo0o2 = oooO00o2.f67418OooO00o;
                o000oOoO o000ooooOooOOo02 = c22271OooOo0o2.f67357OooO0O0.OooOOo0();
                InterfaceC22288OoooO interfaceC22288OoooO2 = c22271OooOo0o2.f67357OooO0O0;
                o000ooooOooOOo02.OooOO0O(interfaceC22288OoooO2, "NetworkFetchProducer", e, null);
                interfaceC22288OoooO2.OooOOo0().OooO0O0(interfaceC22288OoooO2, "NetworkFetchProducer", false);
                interfaceC22288OoooO2.Oooo0("network");
                c22271OooOo0o2.f67356OooO00o.onFailure(e);
                if (inputStream != null) {
                }
                if (httpURLConnectionOooo == null) {
                }
                httpURLConnectionOooo.disconnect();
            } catch (Throwable th4) {
                th = th4;
                httpURLConnectionOooo = null;
                if (r3 != 0) {
                }
                if (httpURLConnectionOooo != null) {
                }
            }
        } catch (IOException e5) {
            e = e5;
        } catch (Throwable th5) {
            th = th5;
        }
        httpURLConnectionOooo.disconnect();
    }
}
