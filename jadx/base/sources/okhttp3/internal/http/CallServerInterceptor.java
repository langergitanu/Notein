package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32435OooO0Oo;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34540OooOo0;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class CallServerInterceptor implements Interceptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f124435OooO00o;

    public CallServerInterceptor(boolean z) {
        this.f124435OooO00o = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x016c A[Catch: IOException -> 0x016a, TryCatch #9 {IOException -> 0x016a, blocks: (B:99:0x0155, B:103:0x015d, B:107:0x017a, B:109:0x0188, B:116:0x01a1, B:122:0x01b2, B:126:0x01cf, B:127:0x01d9, B:125:0x01c7, B:119:0x01a8, B:111:0x0192, B:106:0x016c), top: B:152:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0192 A[Catch: IOException -> 0x016a, TryCatch #9 {IOException -> 0x016a, blocks: (B:99:0x0155, B:103:0x015d, B:107:0x017a, B:109:0x0188, B:116:0x01a1, B:122:0x01b2, B:126:0x01cf, B:127:0x01d9, B:125:0x01c7, B:119:0x01a8, B:111:0x0192, B:106:0x016c), top: B:152:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a1 A[Catch: IOException -> 0x016a, TryCatch #9 {IOException -> 0x016a, blocks: (B:99:0x0155, B:103:0x015d, B:107:0x017a, B:109:0x0188, B:116:0x01a1, B:122:0x01b2, B:126:0x01cf, B:127:0x01d9, B:125:0x01c7, B:119:0x01a8, B:111:0x0192, B:106:0x016c), top: B:152:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a8 A[Catch: IOException -> 0x016a, TryCatch #9 {IOException -> 0x016a, blocks: (B:99:0x0155, B:103:0x015d, B:107:0x017a, B:109:0x0188, B:116:0x01a1, B:122:0x01b2, B:126:0x01cf, B:127:0x01d9, B:125:0x01c7, B:119:0x01a8, B:111:0x0192, B:106:0x016c), top: B:152:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b2 A[Catch: IOException -> 0x016a, TryCatch #9 {IOException -> 0x016a, blocks: (B:99:0x0155, B:103:0x015d, B:107:0x017a, B:109:0x0188, B:116:0x01a1, B:122:0x01b2, B:126:0x01cf, B:127:0x01d9, B:125:0x01c7, B:119:0x01a8, B:111:0x0192, B:106:0x016c), top: B:152:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0139 A[Catch: IOException -> 0x0109, TryCatch #7 {IOException -> 0x0109, blocks: (B:79:0x00f7, B:81:0x0100, B:85:0x010b, B:93:0x0130, B:95:0x0139, B:96:0x013c, B:97:0x0150), top: B:148:0x00f7 }] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) throws Throwable {
        Response.Builder builderOooO0o0;
        ExchangeCodec exchangeCodec;
        IOException iOException;
        IOException iOException2;
        boolean z;
        Response responseOooO00o;
        int i;
        Response responseOooO00o2;
        ResponseBody responseBody;
        boolean z2;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.f124444OooO0Oo;
        OooOOO0.OooO0Oo(exchange);
        EventListener eventListener = exchange.f124347OooO0O0;
        RealCall realCall = exchange.f124346OooO00o;
        ExchangeCodec exchangeCodec2 = exchange.f124349OooO0Oo;
        RealConnection realConnection = exchange.f124352OooO0oO;
        Request request = realInterceptorChain.f124446OooO0o0;
        RequestBody requestBody = request.f124241OooO0Oo;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z3 = true;
        try {
            try {
                eventListener.OooOOOO(realCall);
                exchangeCodec2.OooO0oO(request);
                eventListener.OooOOO(realCall, request);
            } catch (IOException e) {
                e = e;
            }
            try {
            } catch (IOException e2) {
                e = e2;
                exchangeCodec = exchangeCodec2;
                iOException = null;
                builderOooO0o0 = null;
                if (!(e instanceof ConnectionShutdownException)) {
                }
            }
            if (!HttpMethod.OooO00o(request.f124239OooO0O0) || requestBody == null) {
                exchangeCodec = exchangeCodec2;
                iOException = null;
                realCall.OooO0o(exchange, true, false, null);
                builderOooO0o0 = null;
            } else {
                try {
                    if ("100-continue".equalsIgnoreCase(request.f124240OooO0OO.OooO0O0(com.google.common.net.HttpHeaders.EXPECT))) {
                        try {
                            try {
                                exchangeCodec2.OooO0Oo();
                                builderOooO0o0 = exchange.OooO0o0(true);
                            } catch (IOException e3) {
                                eventListener.OooOOO0(realCall, e3);
                                exchange.OooO0o(e3);
                                throw e3;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            exchangeCodec = exchangeCodec2;
                            builderOooO0o0 = null;
                            iOException = null;
                            if (!(e instanceof ConnectionShutdownException)) {
                                throw e;
                            }
                            if (!exchange.f124350OooO0o) {
                                throw e;
                            }
                            iOException2 = e;
                            if (builderOooO0o0 == null) {
                            }
                            builderOooO0o0.f124271OooO00o = request;
                            builderOooO0o0.f124276OooO0o0 = realConnection.f124402OooO0o0;
                            builderOooO0o0.f124280OooOO0O = jCurrentTimeMillis;
                            z = z3;
                            builderOooO0o0.f124281OooOO0o = System.currentTimeMillis();
                            responseOooO00o = builderOooO0o0.OooO00o();
                            i = responseOooO00o.f124259OooOoO;
                            if (i == 100) {
                            }
                            if (iOException2 != null) {
                            }
                        }
                        try {
                            eventListener.OooOo00(realCall);
                            z2 = false;
                        } catch (IOException e5) {
                            e = e5;
                            exchangeCodec = exchangeCodec2;
                            iOException = null;
                            if (!(e instanceof ConnectionShutdownException)) {
                            }
                        }
                    } else {
                        z2 = true;
                        builderOooO0o0 = null;
                    }
                    if (builderOooO0o0 == null) {
                        try {
                            if (requestBody.isDuplex()) {
                                try {
                                    exchangeCodec2.OooO0Oo();
                                    requestBody.writeTo(C34535OooOOOo.OooO00o(exchange.OooO0O0(request, true)));
                                } catch (IOException e6) {
                                    eventListener.OooOOO0(realCall, e6);
                                    exchange.OooO0o(e6);
                                    throw e6;
                                }
                            } else {
                                C34540OooOo0 c34540OooOo0OooO00o = C34535OooOOOo.OooO00o(exchange.OooO0O0(request, false));
                                requestBody.writeTo(c34540OooOo0OooO00o);
                                c34540OooOo0OooO00o.close();
                            }
                            exchangeCodec = exchangeCodec2;
                            z3 = z2;
                            iOException = null;
                        } catch (IOException e7) {
                            e = e7;
                            exchangeCodec = exchangeCodec2;
                            z3 = z2;
                            iOException = null;
                            if (!(e instanceof ConnectionShutdownException)) {
                            }
                        }
                    } else {
                        exchangeCodec = exchangeCodec2;
                        try {
                            realCall.OooO0o(exchange, true, false, null);
                            if (realConnection.f124403OooO0oO == null) {
                                z3 = false;
                            }
                            if (!z3) {
                                exchangeCodec.getF124593OooO00o().OooOO0O();
                            }
                            z3 = z2;
                            iOException = null;
                        } catch (IOException e8) {
                            e = e8;
                            z3 = z2;
                            iOException = null;
                            if (!(e instanceof ConnectionShutdownException)) {
                            }
                        }
                    }
                } catch (IOException e9) {
                    e = e9;
                }
                if (builderOooO0o0 == null) {
                    try {
                        builderOooO0o0 = exchange.OooO0o0(false);
                        OooOOO0.OooO0Oo(builderOooO0o0);
                        if (z3) {
                            eventListener.OooOo00(realCall);
                            z3 = false;
                        }
                    } catch (IOException e10) {
                        e = e10;
                    }
                }
                builderOooO0o0.f124271OooO00o = request;
                builderOooO0o0.f124276OooO0o0 = realConnection.f124402OooO0o0;
                builderOooO0o0.f124280OooOO0O = jCurrentTimeMillis;
                z = z3;
                builderOooO0o0.f124281OooOO0o = System.currentTimeMillis();
                responseOooO00o = builderOooO0o0.OooO00o();
                i = responseOooO00o.f124259OooOoO;
                if (i == 100 || (102 <= i && i < 200)) {
                    Response.Builder builderOooO0o02 = exchange.OooO0o0(false);
                    OooOOO0.OooO0Oo(builderOooO0o02);
                    if (z) {
                        eventListener.OooOo00(realCall);
                    }
                    builderOooO0o02.f124271OooO00o = request;
                    builderOooO0o02.f124276OooO0o0 = realConnection.f124402OooO0o0;
                    builderOooO0o02.f124280OooOO0O = jCurrentTimeMillis;
                    builderOooO0o02.f124281OooOO0o = System.currentTimeMillis();
                    responseOooO00o = builderOooO0o02.OooO00o();
                    i = responseOooO00o.f124259OooOoO;
                }
                eventListener.OooOOoo(realCall, responseOooO00o);
                try {
                    if (this.f124435OooO00o || i != 101) {
                        Response.Builder builderOooOOO0 = responseOooO00o.OooOOO0();
                        builderOooOOO0.f124277OooO0oO = exchange.OooO0Oo(responseOooO00o);
                        responseOooO00o2 = builderOooOOO0.OooO00o();
                    } else {
                        Response.Builder builderOooOOO02 = responseOooO00o.OooOOO0();
                        builderOooOOO02.f124277OooO0oO = Util.f124303OooO0OO;
                        responseOooO00o2 = builderOooOOO02.OooO00o();
                    }
                    if (!"close".equalsIgnoreCase(responseOooO00o2.f124258OooOo0o.f124240OooO0OO.OooO0O0(com.google.common.net.HttpHeaders.CONNECTION)) || "close".equalsIgnoreCase(Response.OooO00o(com.google.common.net.HttpHeaders.CONNECTION, responseOooO00o2))) {
                        exchangeCodec.getF124593OooO00o().OooOO0O();
                    }
                    if (i != 204 || i == 205) {
                        responseBody = responseOooO00o2.f124262OooOoo;
                        if ((responseBody != null ? -1L : responseBody.getF124449OooOo()) > 0) {
                            StringBuilder sb = new StringBuilder("HTTP ");
                            sb.append(i);
                            sb.append(" had non-zero Content-Length: ");
                            ResponseBody responseBody2 = responseOooO00o2.f124262OooOoo;
                            sb.append(responseBody2 == null ? iOException : Long.valueOf(responseBody2.getF124449OooOo()));
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    return responseOooO00o2;
                } catch (IOException e11) {
                    e = e11;
                }
            }
            if (requestBody != null) {
                try {
                    if (!requestBody.isDuplex()) {
                        try {
                            exchangeCodec.OooO0o0();
                        } catch (IOException e12) {
                            eventListener.OooOOO0(realCall, e12);
                            exchange.OooO0o(e12);
                            throw e12;
                        }
                    }
                    iOException2 = iOException;
                } catch (IOException e13) {
                    e = e13;
                    if (!(e instanceof ConnectionShutdownException)) {
                    }
                }
            }
            if (builderOooO0o0 == null) {
            }
            builderOooO0o0.f124271OooO00o = request;
            builderOooO0o0.f124276OooO0o0 = realConnection.f124402OooO0o0;
            builderOooO0o0.f124280OooOO0O = jCurrentTimeMillis;
            z = z3;
            builderOooO0o0.f124281OooOO0o = System.currentTimeMillis();
            responseOooO00o = builderOooO0o0.OooO00o();
            i = responseOooO00o.f124259OooOoO;
            if (i == 100) {
                Response.Builder builderOooO0o022 = exchange.OooO0o0(false);
                OooOOO0.OooO0Oo(builderOooO0o022);
                if (z) {
                }
                builderOooO0o022.f124271OooO00o = request;
                builderOooO0o022.f124276OooO0o0 = realConnection.f124402OooO0o0;
                builderOooO0o022.f124280OooOO0O = jCurrentTimeMillis;
                builderOooO0o022.f124281OooOO0o = System.currentTimeMillis();
                responseOooO00o = builderOooO0o022.OooO00o();
                i = responseOooO00o.f124259OooOoO;
                eventListener.OooOOoo(realCall, responseOooO00o);
                if (this.f124435OooO00o) {
                    Response.Builder builderOooOOO03 = responseOooO00o.OooOOO0();
                    builderOooOOO03.f124277OooO0oO = exchange.OooO0Oo(responseOooO00o);
                    responseOooO00o2 = builderOooOOO03.OooO00o();
                }
                if (!"close".equalsIgnoreCase(responseOooO00o2.f124258OooOo0o.f124240OooO0OO.OooO0O0(com.google.common.net.HttpHeaders.CONNECTION))) {
                    exchangeCodec.getF124593OooO00o().OooOO0O();
                }
                if (i != 204) {
                    responseBody = responseOooO00o2.f124262OooOoo;
                    if ((responseBody != null ? -1L : responseBody.getF124449OooOo()) > 0) {
                    }
                }
                return responseOooO00o2;
            }
            if (iOException2 != null) {
                throw e;
            }
            C32435OooO0Oo.OooO00o(iOException2, e);
            throw iOException2;
        } catch (IOException e14) {
            eventListener.OooOOO0(realCall, e14);
            exchange.OooO0o(e14);
            throw e14;
        }
    }
}
