package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Backend;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.BaseRequest;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.api.RequestThrottle;
import com.huawei.agconnect.core.service.auth.AuthProvider;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.agconnect.exception.AGCServerException;
import java.util.ArrayList;
import o0O00OOO.C25834OooO0oO;
import o0O00OOO.C25835OooO0oo;
import o0O00OOO.InterfaceC25832OooO0Oo;
import o0O00OOO.InterfaceC25833OooO0o0;
import o0O00OOO.OooO0o;
import o0O00Oo.C25840OooO0oo;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.aa */
/* JADX INFO: loaded from: classes8.dex */
public class C17599aa {

    /* JADX INFO: renamed from: a */
    private static final String f52055a = "BackendServiceImpl";

    /* JADX INFO: renamed from: a */
    private static AGConnectInstance m75408a(BackendService.Options options) {
        return (options == null || options.getApp() == null) ? AGConnectInstance.getInstance() : options.getApp();
    }

    /* JADX INFO: renamed from: b */
    public static <Rsp> OooO0o<Rsp> m75415b(BaseRequest baseRequest, int i, Class<Rsp> cls, BackendService.Options options) {
        Logger.m75329i(f52055a, "sendRequest2");
        if (options == null) {
            options = new BackendService.Options.Builder().app(AGConnectInstance.getInstance()).build();
        }
        if (options.getApp() == null) {
            options = options.newBuilder().app(AGConnectInstance.getInstance()).build();
        }
        baseRequest.initBase(options.getApp());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C17605ag(options));
        if (!m75413a(cls)) {
            return Backend.call(baseRequest, i, cls, options.getFactory(), options.getTimeout(), options.getTimeUnit(), arrayList, null, m75408a(options).getOptions());
        }
        final C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
        final RequestThrottle.Throttle throttle = options.getThrottle();
        Logger.m75329i(f52055a, "clientToken:" + options.isClientToken());
        if (options.isClientToken()) {
            arrayList.add(new C17601ac(options.getApp()));
        }
        if (options.isApiKey()) {
            arrayList.add(new C17647y(options.getApp()));
        }
        Logger.m75329i(f52055a, "accessToken:" + options.isAccessToken());
        if (options.isAccessToken()) {
            arrayList.add(new C17646x(options.getApp(), options.getAccessTokenType() == BackendService.AccessTokenType.MUST, options.isAccessTokenExtra()));
        }
        if (options.getThrottle() != null) {
            if (options.getThrottle().getEndTime() > 0) {
                c25834OooO0oO.OooO00o(new AGCServerException("fetch throttled, try again later", 1));
            }
            options.getThrottle().addForStart();
        }
        OooO0o oooO0oCall = Backend.call(baseRequest, i, cls, options.getFactory(), options.getTimeout(), options.getTimeUnit(), arrayList, new C17644v(options), m75408a(options).getOptions());
        C25835OooO0oo c25835OooO0oo = C25835OooO0oo.f88151OooO0Oo;
        oooO0oCall.OooO0Oo(c25835OooO0oo.f88152OooO00o, new InterfaceC25833OooO0o0<Rsp>() { // from class: com.huawei.agconnect.credential.obs.aa.6
            @Override // o0O00OOO.InterfaceC25833OooO0o0
            public void onSuccess(Rsp rsp) {
                RequestThrottle.Throttle throttle2 = throttle;
                if (throttle2 != null) {
                    throttle2.addForSuccess();
                }
                c25834OooO0oO.OooO0O0(rsp);
            }
        }).OooOO0O(c25835OooO0oo.f88152OooO00o, new InterfaceC25832OooO0Oo() { // from class: com.huawei.agconnect.credential.obs.aa.5
            @Override // o0O00OOO.InterfaceC25832OooO0Oo
            public void onFailure(Exception exc) {
                RequestThrottle.Throttle throttle2 = throttle;
                if (throttle2 != null && throttle2.checkFail(exc)) {
                    throttle.addForFail();
                }
                c25834OooO0oO.OooO00o(exc);
            }
        });
        return c25834OooO0oO.f88150OooO00o;
    }

    /* JADX INFO: renamed from: c */
    private static <Rsp> OooO0o<Rsp> m75419c(final BaseRequest baseRequest, final int i, final Class<Rsp> cls, final BackendService.Options options) {
        final C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
        OooO0o<Token> tokens = ((CredentialsProvider) m75408a(options).getService(CredentialsProvider.class)).getTokens();
        C25835OooO0oo c25835OooO0oo = C25835OooO0oo.f88151OooO0Oo;
        tokens.OooO0Oo(c25835OooO0oo.f88152OooO00o, new InterfaceC25833OooO0o0<Token>() { // from class: com.huawei.agconnect.credential.obs.aa.9
            @Override // o0O00OOO.InterfaceC25833OooO0o0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Token token) {
                C17599aa.m75417b(token, baseRequest, options, c25834OooO0oO, i, cls);
            }
        }).OooOO0O(c25835OooO0oo.f88152OooO00o, new InterfaceC25832OooO0Oo() { // from class: com.huawei.agconnect.credential.obs.aa.8
            @Override // o0O00OOO.InterfaceC25832OooO0Oo
            public void onFailure(Exception exc) {
                c25834OooO0oO.OooO00o(exc);
            }
        });
        return c25834OooO0oO.f88150OooO00o;
    }

    /* JADX INFO: renamed from: d */
    private static <Rsp> OooO0o<Rsp> m75421d(BaseRequest baseRequest, int i, Class<Rsp> cls, BackendService.Options options) {
        return (options == null || options.getFactory() == null) ? Backend.call(baseRequest, i, cls, m75408a(options).getOptions()) : Backend.call(baseRequest, i, cls, options.getFactory(), options.getTimeout(), options.getTimeUnit(), m75408a(options).getOptions());
    }

    /* JADX INFO: renamed from: a */
    public static <Rsp> OooO0o<Rsp> m75409a(BaseRequest baseRequest, int i, Class<Rsp> cls, BackendService.Options options) {
        if (options != null && options.getApp() != null) {
            baseRequest.initBase(options.getApp());
        }
        if (options == null || !options.isClientToken()) {
            return Backend.call(baseRequest, i, cls, m75408a(options).getOptions());
        }
        final C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
        final RequestThrottle.Throttle throttle = options.getThrottle();
        OooO0o oooO0oM75419c = m75419c(baseRequest, i, cls, options);
        C25835OooO0oo c25835OooO0oo = C25835OooO0oo.f88151OooO0Oo;
        oooO0oM75419c.OooO0Oo(c25835OooO0oo.f88152OooO00o, new InterfaceC25833OooO0o0<Rsp>() { // from class: com.huawei.agconnect.credential.obs.aa.7
            @Override // o0O00OOO.InterfaceC25833OooO0o0
            public void onSuccess(Rsp rsp) {
                RequestThrottle.Throttle throttle2 = throttle;
                if (throttle2 != null) {
                    throttle2.addForSuccess();
                }
                c25834OooO0oO.OooO0O0(rsp);
            }
        }).OooOO0O(c25835OooO0oo.f88152OooO00o, new InterfaceC25832OooO0Oo() { // from class: com.huawei.agconnect.credential.obs.aa.1
            @Override // o0O00OOO.InterfaceC25832OooO0Oo
            public void onFailure(Exception exc) {
                RequestThrottle.Throttle throttle2 = throttle;
                if (throttle2 != null && throttle2.checkFail(exc)) {
                    throttle.addForFail();
                }
                c25834OooO0oO.OooO00o(exc);
            }
        });
        return c25834OooO0oO.f88150OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static <Rsp> void m75420c(final BaseRequest baseRequest, final int i, final Class<Rsp> cls, final C25834OooO0oO<Rsp> c25834OooO0oO, final BackendService.Options options) {
        OooO0o oooO0oM75421d = m75421d(baseRequest, i, cls, options);
        C25835OooO0oo c25835OooO0oo = C25835OooO0oo.f88151OooO0Oo;
        oooO0oM75421d.OooO0Oo(c25835OooO0oo.f88152OooO00o, new InterfaceC25833OooO0o0<Rsp>() { // from class: com.huawei.agconnect.credential.obs.aa.13
            @Override // o0O00OOO.InterfaceC25833OooO0o0
            public void onSuccess(Rsp rsp) {
                c25834OooO0oO.OooO0O0(rsp);
            }
        }).OooOO0O(c25835OooO0oo.f88152OooO00o, new InterfaceC25832OooO0Oo() { // from class: com.huawei.agconnect.credential.obs.aa.12
            @Override // o0O00OOO.InterfaceC25832OooO0Oo
            public void onFailure(Exception exc) {
                C17599aa.m75418b(exc, options, baseRequest, i, cls, c25834OooO0oO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static <Rsp> void m75417b(Token token, final BaseRequest baseRequest, final BackendService.Options options, final C25834OooO0oO<Rsp> c25834OooO0oO, final int i, final Class<Rsp> cls) {
        baseRequest.setAuthorization("Bearer " + token.getTokenString());
        if (!options.isAccessToken()) {
            m75410a(baseRequest, i, cls, c25834OooO0oO, options);
            return;
        }
        AuthProvider authProvider = (AuthProvider) m75408a(options).getService(AuthProvider.class);
        if (authProvider == null) {
            c25834OooO0oO.OooO00o(new AGCServerException("no user login", 3));
            return;
        }
        OooO0o<Token> tokens = authProvider.getTokens();
        C25835OooO0oo c25835OooO0oo = C25835OooO0oo.f88151OooO0Oo;
        tokens.OooO0Oo(c25835OooO0oo.f88152OooO00o, new InterfaceC25833OooO0o0<Token>() { // from class: com.huawei.agconnect.credential.obs.aa.11
            @Override // o0O00OOO.InterfaceC25833OooO0o0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Token token2) {
                if (token2 != null) {
                    baseRequest.setAccessToken(token2.getTokenString());
                    C17599aa.m75410a(baseRequest, i, cls, c25834OooO0oO, options);
                } else if (options.getAccessTokenType() == BackendService.AccessTokenType.EXPECT) {
                    C17599aa.m75410a(baseRequest, i, cls, c25834OooO0oO, options);
                } else {
                    c25834OooO0oO.OooO00o(new AGCServerException("no user login", 3));
                }
            }
        }).OooOO0O(c25835OooO0oo.f88152OooO00o, new InterfaceC25832OooO0Oo() { // from class: com.huawei.agconnect.credential.obs.aa.10
            @Override // o0O00OOO.InterfaceC25832OooO0Oo
            public void onFailure(Exception exc) {
                c25834OooO0oO.OooO00o(exc);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static <Rsp> void m75410a(BaseRequest baseRequest, int i, Class<Rsp> cls, C25834OooO0oO<Rsp> c25834OooO0oO, BackendService.Options options) {
        if (options.getThrottle() != null) {
            if (options.getThrottle().getEndTime() > 0) {
                c25834OooO0oO.OooO00o(new AGCServerException("fetch throttled, try again later", 1));
                return;
            }
            options.getThrottle().addForStart();
        }
        m75420c(baseRequest, i, cls, c25834OooO0oO, options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static <Rsp> void m75418b(final Exception exc, final BackendService.Options options, final BaseRequest baseRequest, final int i, final Class<Rsp> cls, final C25834OooO0oO<Rsp> c25834OooO0oO) {
        Exception exc2;
        final C25834OooO0oO<Rsp> c25834OooO0oO2;
        C25840OooO0oo c25840OooO0ooOooO0Oo;
        InterfaceC25832OooO0Oo interfaceC25832OooO0Oo;
        C25835OooO0oo.OooO00o oooO00o;
        if (m75414a(exc)) {
            int retCode = ((AGCServerException) exc).getRetCode();
            if (retCode != 205524993 || options.isClientTokenRefreshed()) {
                c25834OooO0oO2 = c25834OooO0oO;
                if (retCode != 205524994 || options.isAccessTokenRefreshed()) {
                    exc2 = exc;
                } else {
                    options.setAccessTokenRefreshed(true);
                    AuthProvider authProvider = (AuthProvider) m75408a(options).getService(AuthProvider.class);
                    if (authProvider == null) {
                        c25834OooO0oO2.OooO00o(exc);
                        return;
                    }
                    OooO0o<Token> tokens = authProvider.getTokens(true);
                    C25835OooO0oo c25835OooO0oo = C25835OooO0oo.f88151OooO0Oo;
                    c25840OooO0ooOooO0Oo = tokens.OooO0Oo(c25835OooO0oo.f88152OooO00o, new InterfaceC25833OooO0o0<Token>() { // from class: com.huawei.agconnect.credential.obs.aa.4
                        @Override // o0O00OOO.InterfaceC25833OooO0o0
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(Token token) {
                            if (token == null) {
                                c25834OooO0oO2.OooO00o(exc);
                            } else {
                                baseRequest.setAccessToken(token.getTokenString());
                                C17599aa.m75420c(baseRequest, i, cls, c25834OooO0oO2, options);
                            }
                        }
                    });
                    interfaceC25832OooO0Oo = new InterfaceC25832OooO0Oo() { // from class: com.huawei.agconnect.credential.obs.aa.3
                        @Override // o0O00OOO.InterfaceC25832OooO0Oo
                        public void onFailure(Exception exc3) {
                            c25834OooO0oO2.OooO00o(exc3);
                        }
                    };
                    oooO00o = c25835OooO0oo.f88152OooO00o;
                }
            } else {
                options.setClientTokenRefreshed(true);
                OooO0o<Token> tokens2 = ((CredentialsProvider) m75408a(options).getService(CredentialsProvider.class)).getTokens(true);
                C25835OooO0oo c25835OooO0oo2 = C25835OooO0oo.f88151OooO0Oo;
                c25840OooO0ooOooO0Oo = tokens2.OooO0Oo(c25835OooO0oo2.f88152OooO00o, new InterfaceC25833OooO0o0<Token>() { // from class: com.huawei.agconnect.credential.obs.aa.2
                    @Override // o0O00OOO.InterfaceC25833OooO0o0
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(Token token) {
                        baseRequest.setAuthorization("Bearer " + token.getTokenString());
                        C17599aa.m75420c(baseRequest, i, cls, c25834OooO0oO, options);
                    }
                });
                interfaceC25832OooO0Oo = new InterfaceC25832OooO0Oo() { // from class: com.huawei.agconnect.credential.obs.aa.14
                    @Override // o0O00OOO.InterfaceC25832OooO0Oo
                    public void onFailure(Exception exc3) {
                        c25834OooO0oO.OooO00o(exc3);
                    }
                };
                oooO00o = c25835OooO0oo2.f88152OooO00o;
            }
            c25840OooO0ooOooO0Oo.OooOO0O(oooO00o, interfaceC25832OooO0Oo);
            return;
        }
        exc2 = exc;
        c25834OooO0oO2 = c25834OooO0oO;
        c25834OooO0oO2.OooO00o(exc2);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m75413a(Class cls) {
        return (cls == C17609ak.class || cls == C17617as.class) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m75414a(Exception exc) {
        return (exc instanceof AGCServerException) && ((AGCServerException) exc).getCode() == 401;
    }
}
