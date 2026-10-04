package com.google.firebase.vertexai.common;

import OooOooO.C20741OooOOoo;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.InternalAuthProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0Ooo0oO.C29437OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O.C33549OooO00o;
import oO0o0O.EnumC33551OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u001d\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/AppCheckHeaderProvider;", "Lcom/google/firebase/vertexai/common/HeaderProvider;", "", "logTag", "Lcom/google/firebase/appcheck/interop/InteropAppCheckTokenProvider;", "appCheckTokenProvider", "Lcom/google/firebase/auth/internal/InternalAuthProvider;", "internalAuthProvider", "<init>", "(Ljava/lang/String;Lcom/google/firebase/appcheck/interop/InteropAppCheckTokenProvider;Lcom/google/firebase/auth/internal/InternalAuthProvider;)V", "", "generateHeaders", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "Lcom/google/firebase/appcheck/interop/InteropAppCheckTokenProvider;", "Lcom/google/firebase/auth/internal/InternalAuthProvider;", "LoO0o0O/OooO00o;", "getTimeout-UwyO8pc", "()J", "timeout", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class AppCheckHeaderProvider implements HeaderProvider {
    private final InteropAppCheckTokenProvider appCheckTokenProvider;
    private final InternalAuthProvider internalAuthProvider;
    private final String logTag;

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.AppCheckHeaderProvider$generateHeaders$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.AppCheckHeaderProvider", m80623f = "AppCheckHeaderProvider.kt", m80624l = {39, 54}, m80625m = "generateHeaders")
    public static final class C172491 extends AbstractC32479OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C172491(Continuation<? super C172491> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppCheckHeaderProvider.this.generateHeaders(this);
        }
    }

    public AppCheckHeaderProvider(String logTag, InteropAppCheckTokenProvider interopAppCheckTokenProvider, InternalAuthProvider internalAuthProvider) {
        OooOOO0.OooO0oO(logTag, "logTag");
        this.logTag = logTag;
        this.appCheckTokenProvider = interopAppCheckTokenProvider;
        this.internalAuthProvider = internalAuthProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.google.firebase.vertexai.common.HeaderProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object generateHeaders(Continuation<? super Map<String, String>> continuation) throws Exception {
        C172491 c172491;
        Map linkedHashMap;
        AppCheckHeaderProvider appCheckHeaderProvider;
        InternalAuthProvider internalAuthProvider;
        Map map;
        AppCheckHeaderProvider appCheckHeaderProvider2;
        if (continuation instanceof C172491) {
            c172491 = (C172491) continuation;
            int i = c172491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172491.label = i - Integer.MIN_VALUE;
            } else {
                c172491 = new C172491(continuation);
            }
        }
        Object objOooO0o = c172491.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172491.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            linkedHashMap = new LinkedHashMap();
            InteropAppCheckTokenProvider interopAppCheckTokenProvider = this.appCheckTokenProvider;
            if (interopAppCheckTokenProvider != null) {
                Task<AppCheckTokenResult> token = interopAppCheckTokenProvider.getToken(false);
                OooOOO0.OooO0o(token, "appCheckTokenProvider.getToken(false)");
                c172491.L$0 = this;
                c172491.L$1 = linkedHashMap;
                c172491.label = 1;
                objOooO0o = C20741OooOOoo.OooO0o(token, c172491);
                if (objOooO0o != enumC32485OooO00o) {
                    appCheckHeaderProvider = this;
                }
                return enumC32485OooO00o;
            }
            Log.w(this.logTag, "AppCheck not registered, skipping");
            appCheckHeaderProvider = this;
            internalAuthProvider = appCheckHeaderProvider.internalAuthProvider;
            if (internalAuthProvider != null) {
                Log.w(appCheckHeaderProvider.logTag, "Auth not registered, skipping");
                return linkedHashMap;
            }
            try {
                Task<GetTokenResult> accessToken = internalAuthProvider.getAccessToken(false);
                OooOOO0.OooO0o(accessToken, "internalAuthProvider.getAccessToken(false)");
                c172491.L$0 = appCheckHeaderProvider;
                c172491.L$1 = linkedHashMap;
                c172491.label = 2;
                objOooO0o = C20741OooOOoo.OooO0o(accessToken, c172491);
                if (objOooO0o != enumC32485OooO00o) {
                    map = linkedHashMap;
                    appCheckHeaderProvider2 = appCheckHeaderProvider;
                    String token2 = ((GetTokenResult) objOooO0o).getToken();
                    OooOOO0.OooO0Oo(token2);
                    map.put("Authorization", "Firebase ".concat(token2));
                    return map;
                }
                return enumC32485OooO00o;
            } catch (Exception e) {
                e = e;
                map = linkedHashMap;
                appCheckHeaderProvider2 = appCheckHeaderProvider;
                Log.w(appCheckHeaderProvider2.logTag, "Error getting Auth token ", e);
                return map;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c172491.L$1;
            appCheckHeaderProvider2 = (AppCheckHeaderProvider) c172491.L$0;
            try {
                C32446OooOOOo.OooO0O0(objOooO0o);
                String token22 = ((GetTokenResult) objOooO0o).getToken();
                OooOOO0.OooO0Oo(token22);
                map.put("Authorization", "Firebase ".concat(token22));
                return map;
            } catch (Exception e2) {
                e = e2;
                Log.w(appCheckHeaderProvider2.logTag, "Error getting Auth token ", e);
                return map;
            }
        }
        linkedHashMap = (Map) c172491.L$1;
        appCheckHeaderProvider = (AppCheckHeaderProvider) c172491.L$0;
        C32446OooOOOo.OooO0O0(objOooO0o);
        AppCheckTokenResult appCheckTokenResult = (AppCheckTokenResult) objOooO0o;
        if (appCheckTokenResult.getError() != null) {
            Log.w(appCheckHeaderProvider.logTag, "Error obtaining AppCheck token", appCheckTokenResult.getError());
        }
        String token3 = appCheckTokenResult.getToken();
        OooOOO0.OooO0o(token3, "token.token");
        linkedHashMap.put("X-Firebase-AppCheck", token3);
        internalAuthProvider = appCheckHeaderProvider.internalAuthProvider;
        if (internalAuthProvider != null) {
        }
    }

    @Override // com.google.firebase.vertexai.common.HeaderProvider
    /* JADX INFO: renamed from: getTimeout-UwyO8pc, reason: not valid java name */
    public long mo80701getTimeoutUwyO8pc() {
        int i = C33549OooO00o.f121147OooOoO;
        return C29437OooOO0O.OooO0o(10, EnumC33551OooO0OO.f121152OooOoO);
    }

    public /* synthetic */ AppCheckHeaderProvider(String str, InteropAppCheckTokenProvider interopAppCheckTokenProvider, InternalAuthProvider internalAuthProvider, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, (i & 2) != 0 ? null : interopAppCheckTokenProvider, (i & 4) != 0 ? null : internalAuthProvider);
    }
}
