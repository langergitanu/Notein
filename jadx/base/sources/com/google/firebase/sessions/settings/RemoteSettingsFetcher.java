package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.sessions.ApplicationInfo;
import com.microsoft.identity.common.java.AuthenticationConstants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo0000O.InterfaceC34415OooO0oo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJl\u0010\u0015\u001a\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000eH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u001a"}, m80612d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "LoOo0000O/OooO0oo;", "blockingDispatcher", "<init>", "(Lcom/google/firebase/sessions/ApplicationInfo;LoOo0000O/OooO0oo;)V", "Ljava/net/URL;", "settingsUrl", "()Ljava/net/URL;", "", "", "headerOptions", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/Continuation;", "LoO00ooO/OooOooO;", "", "onSuccess", "onFailure", "doConfigFetch", "(Ljava/util/Map;LoO0O000o/OooOOOo;LoO0O000o/OooOOOo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/firebase/sessions/ApplicationInfo;", "LoOo0000O/OooO0oo;", "Companion", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {
    private static final String FIREBASE_PLATFORM = "android";
    private static final String FIREBASE_SESSIONS_BASE_URL_STRING = "firebase-settings.crashlytics.com";
    private final ApplicationInfo appInfo;
    private final InterfaceC34415OooO0oo blockingDispatcher;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", m80623f = "RemoteSettingsFetcher.kt", m80624l = {73, 75, 78}, m80625m = "invokeSuspend")
    public static final class C172062 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ Map<String, String> $headerOptions;
        final /* synthetic */ InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> $onFailure;
        final /* synthetic */ InterfaceC32508OooOOOo<JSONObject, Continuation<? super C32460OooOooO>, Object> $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C172062(Map<String, String> map, InterfaceC32508OooOOOo<? super JSONObject, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, InterfaceC32508OooOOOo<? super String, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo2, Continuation<? super C172062> continuation) {
            super(2, continuation);
            this.$headerOptions = map;
            this.$onSuccess = interfaceC32508OooOOOo;
            this.$onFailure = interfaceC32508OooOOOo2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return RemoteSettingsFetcher.this.new C172062(this.$headerOptions, this.$onSuccess, this.$onFailure, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
        
            if (r8.invoke(r1, r7) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00de, code lost:
        
            if (r1.invoke(r3, r7) != r0) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            try {
            } catch (Exception e) {
                InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> interfaceC32508OooOOOo = this.$onFailure;
                String message = e.getMessage();
                if (message == null) {
                    message = e.toString();
                }
                this.label = 3;
            }
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                URLConnection uRLConnectionOpenConnection = RemoteSettingsFetcher.this.settingsUrl().openConnection();
                OooOOO0.OooO0o0(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry<String, String> entry : this.$headerOptions.entrySet()) {
                    httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                    while (true) {
                        ?? line = bufferedReader.readLine();
                        c24034Oooo00O.f80942OooOo0o = line;
                        if (line == 0) {
                            break;
                        }
                        sb.append((String) line);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    InterfaceC32508OooOOOo<JSONObject, Continuation<? super C32460OooOooO>, Object> interfaceC32508OooOOOo2 = this.$onSuccess;
                    this.label = 1;
                    if (interfaceC32508OooOOOo2.invoke(jSONObject, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> interfaceC32508OooOOOo3 = this.$onFailure;
                    String str = "Bad response code: " + responseCode;
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C172062) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    public RemoteSettingsFetcher(ApplicationInfo appInfo, @Blocking InterfaceC34415OooO0oo blockingDispatcher) {
        OooOOO0.OooO0oO(appInfo, "appInfo");
        OooOOO0.OooO0oO(blockingDispatcher, "blockingDispatcher");
        this.appInfo = appInfo;
        this.blockingDispatcher = blockingDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL settingsUrl() {
        return new URL(new Uri.Builder().scheme(AuthenticationConstants.HTTPS_PROTOCOL_STRING).authority(FIREBASE_SESSIONS_BASE_URL_STRING).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.appInfo.getAppId()).appendPath("settings").appendQueryParameter("build_version", this.appInfo.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.appInfo.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    public Object doConfigFetch(Map<String, String> map, InterfaceC32508OooOOOo<? super JSONObject, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, InterfaceC32508OooOOOo<? super String, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo2, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        Object objOooO0o = C33609OooO0oo.OooO0o(this.blockingDispatcher, new C172062(map, interfaceC32508OooOOOo, interfaceC32508OooOOOo2, null), continuation);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }
}
