package com.google.firebase.sessions.settings;

import android.os.Build;
import android.util.Log;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.InstallationId;
import com.google.firebase.sessions.TimeProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0Ooo0oO.C29437OooOO0O;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O.C33549OooO00o;
import oO0o0O.EnumC33551OooO0OO;
import oO0o0O0o.C33588OooOO0;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0012H\u0081@¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, m80612d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "configsFetcher", "Lcom/google/firebase/sessions/settings/SettingsCache;", "settingsCache", "<init>", "(Lcom/google/firebase/sessions/TimeProvider;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Lcom/google/firebase/sessions/settings/SettingsCache;)V", "", "s", "sanitize", "(Ljava/lang/String;)Ljava/lang/String;", "LoO00ooO/OooOooO;", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isSettingsStale", "()Z", "clearCachedSettings$com_google_firebase_firebase_sessions", "clearCachedSettings", "Lcom/google/firebase/sessions/TimeProvider;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "Lcom/google/firebase/sessions/ApplicationInfo;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "LoO0o0oOo/OooO00o;", "fetchInProgress", "LoO0o0oOo/OooO00o;", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "LoO0o0O/OooO00o;", "getSessionRestartTimeout-FghU774", "()LoO0o0O/OooO00o;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "Companion", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class RemoteSettings implements SettingsProvider {
    private static final Companion Companion = new Companion(null);
    private static final int defaultCacheDuration;
    private static final C33588OooOO0 sanitizeRegex;
    private final ApplicationInfo appInfo;
    private final CrashlyticsSettingsFetcher configsFetcher;
    private final InterfaceC33895OooO00o fetchInProgress;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final SettingsCache settingsCache;
    private final TimeProvider timeProvider;

    @Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m80612d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "<init>", "()V", "", "defaultCacheDuration", "I", "getDefaultCacheDuration", "()I", "LoO0o0O0o/OooOO0;", "sanitizeRegex", "LoO0o0O0o/OooOO0;", "getSanitizeRegex", "()LoO0o0O0o/OooOO0;", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final int getDefaultCacheDuration() {
            return RemoteSettings.defaultCacheDuration;
        }

        public final C33588OooOO0 getSanitizeRegex() {
            return RemoteSettings.sanitizeRegex;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.settings.RemoteSettings", m80623f = "RemoteSettings.kt", m80624l = {165, 78, 95}, m80625m = "updateSettings")
    public static final class C172051 extends AbstractC32479OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C172051(Continuation<? super C172051> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteSettings.this.updateSettings(this);
        }
    }

    static {
        int i = C33549OooO00o.f121147OooOoO;
        defaultCacheDuration = (int) C33549OooO00o.OooO0oo(C29437OooOO0O.OooO0o(24, EnumC33551OooO0OO.f121156OooOoo0), EnumC33551OooO0OO.f121152OooOoO);
        sanitizeRegex = new C33588OooOO0("/");
    }

    public RemoteSettings(TimeProvider timeProvider, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo appInfo, CrashlyticsSettingsFetcher configsFetcher, SettingsCache settingsCache) {
        OooOOO0.OooO0oO(timeProvider, "timeProvider");
        OooOOO0.OooO0oO(firebaseInstallationsApi, "firebaseInstallationsApi");
        OooOOO0.OooO0oO(appInfo, "appInfo");
        OooOOO0.OooO0oO(configsFetcher, "configsFetcher");
        OooOOO0.OooO0oO(settingsCache, "settingsCache");
        this.timeProvider = timeProvider;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.settingsCache = settingsCache;
        this.fetchInProgress = C33900OooO0o0.OooO00o();
    }

    private final String sanitize(String s) {
        return sanitizeRegex.OooO0OO(s, "");
    }

    public final Object clearCachedSettings$com_google_firebase_firebase_sessions(Continuation<? super C32460OooOooO> continuation) {
        Object objUpdateConfigs = this.settingsCache.updateConfigs(SessionConfigsSerializer.INSTANCE.getDefaultValue(), continuation);
        return objUpdateConfigs == EnumC32485OooO00o.f116726OooOo0o ? objUpdateConfigs : C32460OooOooO.f116667OooO00o;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Double getSamplingRate() {
        return this.settingsCache.sessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Boolean getSessionEnabled() {
        return this.settingsCache.sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    public C33549OooO00o mo80698getSessionRestartTimeoutFghU774() {
        Integer numSessionRestartTimeout = this.settingsCache.sessionRestartTimeout();
        if (numSessionRestartTimeout == null) {
            return null;
        }
        int i = C33549OooO00o.f121147OooOoO;
        return new C33549OooO00o(C29437OooOO0O.OooO0o(numSessionRestartTimeout.intValue(), EnumC33551OooO0OO.f121152OooOoO));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return this.settingsCache.hasCacheExpired();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:21:0x0048, B:47:0x00b4, B:49:0x00c2, B:52:0x00cd), top: B:64:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:21:0x0048, B:47:0x00b4, B:49:0x00c2, B:52:0x00cd), top: B:64:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSettings(Continuation<? super C32460OooOooO> continuation) throws Throwable {
        C172051 c172051;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        RemoteSettings remoteSettings;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        RemoteSettings remoteSettings2;
        String fid;
        if (continuation instanceof C172051) {
            c172051 = (C172051) continuation;
            int i = c172051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172051.label = i - Integer.MIN_VALUE;
            } else {
                c172051 = new C172051(continuation);
            }
        }
        Object obj = c172051.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172051.label;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (!this.fetchInProgress.OooO0OO() && !this.settingsCache.hasCacheExpired()) {
                    return C32460OooOooO.f116667OooO00o;
                }
                interfaceC33895OooO00o = this.fetchInProgress;
                c172051.L$0 = this;
                c172051.L$1 = interfaceC33895OooO00o;
                c172051.label = 1;
                if (interfaceC33895OooO00o.OooO00o(c172051) != enumC32485OooO00o) {
                    remoteSettings = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) c172051.L$0;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        return C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        throw th;
                    }
                }
                interfaceC33895OooO00o3 = (InterfaceC33895OooO00o) c172051.L$1;
                remoteSettings2 = (RemoteSettings) c172051.L$0;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    fid = ((InstallationId) obj).getFid();
                    if (!OooOOO0.OooO0O0(fid, "")) {
                        Log.w(FirebaseSessions.TAG, "Error getting Firebase Installation ID. Skipping this Session Event.");
                        C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                        interfaceC33895OooO00o3.OooOOO0(null);
                        return c32460OooOooO2;
                    }
                    C32443OooOOO c32443OooOOO = new C32443OooOOO("X-Crashlytics-Installation-ID", fid);
                    C32443OooOOO c32443OooOOO2 = new C32443OooOOO("X-Crashlytics-Device-Model", remoteSettings2.sanitize(Build.MANUFACTURER + Build.MODEL));
                    String INCREMENTAL = Build.VERSION.INCREMENTAL;
                    OooOOO0.OooO0o(INCREMENTAL, "INCREMENTAL");
                    C32443OooOOO c32443OooOOO3 = new C32443OooOOO("X-Crashlytics-OS-Build-Version", remoteSettings2.sanitize(INCREMENTAL));
                    String RELEASE = Build.VERSION.RELEASE;
                    OooOOO0.OooO0o(RELEASE, "RELEASE");
                    Map<String, String> mapOooO0oo = C34444Oooo0O0.OooO0oo(c32443OooOOO, c32443OooOOO2, c32443OooOOO3, new C32443OooOOO("X-Crashlytics-OS-Display-Version", remoteSettings2.sanitize(RELEASE)), new C32443OooOOO("X-Crashlytics-API-Client-Version", remoteSettings2.appInfo.getSessionSdkVersion()));
                    Log.d(FirebaseSessions.TAG, "Fetching settings from server.");
                    CrashlyticsSettingsFetcher crashlyticsSettingsFetcher = remoteSettings2.configsFetcher;
                    RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings2, null);
                    RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                    c172051.L$0 = interfaceC33895OooO00o3;
                    c172051.L$1 = null;
                    c172051.label = 3;
                    if (crashlyticsSettingsFetcher.doConfigFetch(mapOooO0oo, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, c172051) != enumC32485OooO00o) {
                        interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                        C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o4 = (InterfaceC33895OooO00o) c172051.L$1;
            remoteSettings = (RemoteSettings) c172051.L$0;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o4;
            if (!remoteSettings.settingsCache.hasCacheExpired()) {
                Log.d(FirebaseSessions.TAG, "Remote settings cache not expired. Using cached values.");
                C32460OooOooO c32460OooOooO4 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o.OooOOO0(null);
                return c32460OooOooO4;
            }
            InstallationId.Companion companion = InstallationId.INSTANCE;
            FirebaseInstallationsApi firebaseInstallationsApi = remoteSettings.firebaseInstallationsApi;
            c172051.L$0 = remoteSettings;
            c172051.L$1 = interfaceC33895OooO00o;
            c172051.label = 2;
            Object objCreate = companion.create(firebaseInstallationsApi, c172051);
            if (objCreate != enumC32485OooO00o) {
                interfaceC33895OooO00o3 = interfaceC33895OooO00o;
                obj = objCreate;
                remoteSettings2 = remoteSettings;
                fid = ((InstallationId) obj).getFid();
                if (!OooOOO0.OooO0O0(fid, "")) {
                }
            }
            return enumC32485OooO00o;
        } catch (Throwable th4) {
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            th = th4;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }
}
