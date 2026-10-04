package com.google.firebase.sessions.settings;

import android.util.Log;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.TimeProvider;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooO;
import kotlin.jvm.internal.OooO00o;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.InterfaceC32437OooO0o0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u001aH\u0081@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0016\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, m80612d2 = {"Lcom/google/firebase/sessions/settings/SettingsCacheImpl;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "LoOo0000O/OooO0oo;", "backgroundDispatcher", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Lo0000o0O/OooOO0;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "sessionConfigsDataStore", "<init>", "(LoOo0000O/OooO0oo;Lcom/google/firebase/sessions/TimeProvider;Lo0000o0O/OooOO0;)V", "", "hasCacheExpired", "()Z", "sessionsEnabled", "()Ljava/lang/Boolean;", "", "sessionSamplingRate", "()Ljava/lang/Double;", "", "sessionRestartTimeout", "()Ljava/lang/Integer;", "sessionConfigs", "LoO00ooO/OooOooO;", "updateConfigs", "(Lcom/google/firebase/sessions/settings/SessionConfigs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "removeConfigs$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeConfigs", "LoOo0000O/OooO0oo;", "Lcom/google/firebase/sessions/TimeProvider;", "Lo0000o0O/OooOO0;", "Ljava/util/concurrent/atomic/AtomicReference;", "sessionConfigsAtomicReference", "Ljava/util/concurrent/atomic/AtomicReference;", "getSessionConfigs", "()Lcom/google/firebase/sessions/settings/SessionConfigs;", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class SettingsCacheImpl implements SettingsCache {
    private final InterfaceC34415OooO0oo backgroundDispatcher;
    private final AtomicReference<SessionConfigs> sessionConfigsAtomicReference;
    private final OooOO0<SessionConfigs> sessionConfigsDataStore;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", m80623f = "SettingsCache.kt", m80624l = {73}, m80625m = "invokeSuspend")
    public static final class C172081 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1$1, reason: invalid class name */
        @Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
        public /* synthetic */ class AnonymousClass1 implements InterfaceC33723OooO0oO, OooO {
            final /* synthetic */ AtomicReference<SessionConfigs> $tmp0;

            public AnonymousClass1(AtomicReference<SessionConfigs> atomicReference) {
                this.$tmp0 = atomicReference;
            }

            public final Object emit(SessionConfigs sessionConfigs, Continuation<? super C32460OooOooO> continuation) {
                Object objInvokeSuspend$set = C172081.invokeSuspend$set(this.$tmp0, sessionConfigs, continuation);
                return objInvokeSuspend$set == EnumC32485OooO00o.f116726OooOo0o ? objInvokeSuspend$set : C32460OooOooO.f116667OooO00o;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC33723OooO0oO) && (obj instanceof OooO)) {
                    return OooOOO0.OooO0O0(getFunctionDelegate(), ((OooO) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.OooO
            public final InterfaceC32437OooO0o0<?> getFunctionDelegate() {
                return new OooO00o(2, this.$tmp0, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((SessionConfigs) obj, (Continuation<? super C32460OooOooO>) continuation);
            }
        }

        public C172081(Continuation<? super C172081> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$set(AtomicReference atomicReference, SessionConfigs sessionConfigs, Continuation continuation) {
            atomicReference.set(sessionConfigs);
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return SettingsCacheImpl.this.new C172081(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33721OooO0o data = SettingsCacheImpl.this.sessionConfigsDataStore.getData();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SettingsCacheImpl.this.sessionConfigsAtomicReference);
                this.label = 1;
                if (data.collect(anonymousClass1, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C172081) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.settings.SettingsCacheImpl", m80623f = "SettingsCache.kt", m80624l = {98}, m80625m = "updateConfigs")
    public static final class C172091 extends AbstractC32479OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C172091(Continuation<? super C172091> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsCacheImpl.this.updateConfigs(null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2 */
    @Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m80612d2 = {"<anonymous>", "Lcom/google/firebase/sessions/settings/SessionConfigs;", TranslateLanguage.ITALIAN}, m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2", m80623f = "SettingsCache.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C172102 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<SessionConfigs, Continuation<? super SessionConfigs>, Object> {
        final /* synthetic */ SessionConfigs $sessionConfigs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172102(SessionConfigs sessionConfigs, Continuation<? super C172102> continuation) {
            super(2, continuation);
            this.$sessionConfigs = sessionConfigs;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C172102(this.$sessionConfigs, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(SessionConfigs sessionConfigs, Continuation<? super SessionConfigs> continuation) {
            return ((C172102) create(sessionConfigs, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return this.$sessionConfigs;
        }
    }

    public SettingsCacheImpl(@Background InterfaceC34415OooO0oo backgroundDispatcher, TimeProvider timeProvider, OooOO0<SessionConfigs> sessionConfigsDataStore) {
        OooOOO0.OooO0oO(backgroundDispatcher, "backgroundDispatcher");
        OooOOO0.OooO0oO(timeProvider, "timeProvider");
        OooOOO0.OooO0oO(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.backgroundDispatcher = backgroundDispatcher;
        this.timeProvider = timeProvider;
        this.sessionConfigsDataStore = sessionConfigsDataStore;
        this.sessionConfigsAtomicReference = new AtomicReference<>();
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(backgroundDispatcher), null, null, new C172081(null), 3);
    }

    private final SessionConfigs getSessionConfigs() throws Throwable {
        if (this.sessionConfigsAtomicReference.get() == null) {
            AtomicReference<SessionConfigs> atomicReference = this.sessionConfigsAtomicReference;
            Object objOooO0Oo = C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new SettingsCacheImpl$sessionConfigs$1(this, null));
            while (!atomicReference.compareAndSet(null, (SessionConfigs) objOooO0Oo) && atomicReference.get() == null) {
            }
        }
        SessionConfigs sessionConfigs = this.sessionConfigsAtomicReference.get();
        OooOOO0.OooO0o(sessionConfigs, "get(...)");
        return sessionConfigs;
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public boolean hasCacheExpired() {
        Long cacheUpdatedTimeSeconds = getSessionConfigs().getCacheUpdatedTimeSeconds();
        Integer cacheDurationSeconds = getSessionConfigs().getCacheDurationSeconds();
        return cacheUpdatedTimeSeconds == null || cacheDurationSeconds == null || this.timeProvider.currentTime().getSeconds() - cacheUpdatedTimeSeconds.longValue() >= ((long) cacheDurationSeconds.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removeConfigs$com_google_firebase_firebase_sessions(Continuation<Object> continuation) {
        SettingsCacheImpl$removeConfigs$1 settingsCacheImpl$removeConfigs$1;
        if (continuation instanceof SettingsCacheImpl$removeConfigs$1) {
            settingsCacheImpl$removeConfigs$1 = (SettingsCacheImpl$removeConfigs$1) continuation;
            int i = settingsCacheImpl$removeConfigs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                settingsCacheImpl$removeConfigs$1.label = i - Integer.MIN_VALUE;
            } else {
                settingsCacheImpl$removeConfigs$1 = new SettingsCacheImpl$removeConfigs$1(this, continuation);
            }
        }
        Object obj = settingsCacheImpl$removeConfigs$1.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = settingsCacheImpl$removeConfigs$1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            OooOO0<SessionConfigs> oooOO02 = this.sessionConfigsDataStore;
            SettingsCacheImpl$removeConfigs$2 settingsCacheImpl$removeConfigs$2 = new SettingsCacheImpl$removeConfigs$2(null);
            settingsCacheImpl$removeConfigs$1.label = 1;
            Object objOooO00o = oooOO02.OooO00o(settingsCacheImpl$removeConfigs$2, settingsCacheImpl$removeConfigs$1);
            return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
        } catch (IOException e) {
            return new Integer(Log.w(FirebaseSessions.TAG, "Failed to remove config values: " + e));
        }
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public Integer sessionRestartTimeout() {
        return getSessionConfigs().getSessionTimeoutSeconds();
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public Double sessionSamplingRate() {
        return getSessionConfigs().getSessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public Boolean sessionsEnabled() {
        return getSessionConfigs().getSessionsEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.firebase.sessions.settings.SettingsCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateConfigs(SessionConfigs sessionConfigs, Continuation<? super C32460OooOooO> continuation) {
        C172091 c172091;
        if (continuation instanceof C172091) {
            c172091 = (C172091) continuation;
            int i = c172091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172091.label = i - Integer.MIN_VALUE;
            } else {
                c172091 = new C172091(continuation);
            }
        }
        Object obj = c172091.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172091.label;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooOO0<SessionConfigs> oooOO02 = this.sessionConfigsDataStore;
                C172102 c172102 = new C172102(sessionConfigs, null);
                c172091.label = 1;
                if (oooOO02.OooO00o(c172102, c172091) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
        } catch (IOException e) {
            Log.w(FirebaseSessions.TAG, "Failed to update config values: " + e);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
