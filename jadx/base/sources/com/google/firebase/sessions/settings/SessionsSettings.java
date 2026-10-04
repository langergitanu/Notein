package com.google.firebase.sessions.settings;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.LocalOverrideSettingsProvider;
import com.google.firebase.sessions.RemoteSettingsProvider;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0Ooo0oO.C29437OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O.C33549OooO00o;
import oO0o0O.EnumC33551OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m80612d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings;", "", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "localOverrideSettings", "remoteSettings", "<init>", "(Lcom/google/firebase/sessions/settings/SettingsProvider;Lcom/google/firebase/sessions/settings/SettingsProvider;)V", "", "samplingRate", "", "isValidSamplingRate", "(D)Z", "LoO0o0O/OooO00o;", "sessionRestartTimeout", "isValidSessionRestartTimeout-LRDsOJo", "(J)Z", "isValidSessionRestartTimeout", "LoO00ooO/OooOooO;", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "getSessionsEnabled", "()Z", "sessionsEnabled", "getSamplingRate", "()D", "getSessionRestartTimeout-UwyO8pc", "()J", "Companion", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class SessionsSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SettingsProvider localOverrideSettings;
    private final SettingsProvider remoteSettings;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings$Companion;", "", "<init>", "()V", "instance", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "getInstance", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final SessionsSettings getInstance() {
            return ((FirebaseSessionsComponent) FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessionsComponent.class)).getSessionsSettings();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.settings.SessionsSettings", m80623f = "SessionsSettings.kt", m80624l = {98, 99}, m80625m = "updateSettings")
    public static final class C172071 extends AbstractC32479OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C172071(Continuation<? super C172071> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionsSettings.this.updateSettings(this);
        }
    }

    public SessionsSettings(@LocalOverrideSettingsProvider SettingsProvider localOverrideSettings, @RemoteSettingsProvider SettingsProvider remoteSettings) {
        OooOOO0.OooO0oO(localOverrideSettings, "localOverrideSettings");
        OooOOO0.OooO0oO(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    private final boolean isValidSamplingRate(double samplingRate) {
        return 0.0d <= samplingRate && samplingRate <= 1.0d;
    }

    /* JADX INFO: renamed from: isValidSessionRestartTimeout-LRDsOJo, reason: not valid java name */
    private final boolean m80699isValidSessionRestartTimeoutLRDsOJo(long sessionRestartTimeout) {
        int i = C33549OooO00o.f121147OooOoO;
        return sessionRestartTimeout > 0 && !C33549OooO00o.OooO0o(sessionRestartTimeout);
    }

    public final double getSamplingRate() {
        Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double dDoubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = samplingRate2.doubleValue();
        if (isValidSamplingRate(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: getSessionRestartTimeout-UwyO8pc, reason: not valid java name */
    public final long m80700getSessionRestartTimeoutUwyO8pc() {
        C33549OooO00o c33549OooO00oMo80698getSessionRestartTimeoutFghU774 = this.localOverrideSettings.mo80698getSessionRestartTimeoutFghU774();
        if (c33549OooO00oMo80698getSessionRestartTimeoutFghU774 != null) {
            long j = c33549OooO00oMo80698getSessionRestartTimeoutFghU774.f121149OooOo0o;
            if (m80699isValidSessionRestartTimeoutLRDsOJo(j)) {
                return j;
            }
        }
        C33549OooO00o c33549OooO00oMo80698getSessionRestartTimeoutFghU7742 = this.remoteSettings.mo80698getSessionRestartTimeoutFghU774();
        if (c33549OooO00oMo80698getSessionRestartTimeoutFghU7742 != null) {
            long j2 = c33549OooO00oMo80698getSessionRestartTimeoutFghU7742.f121149OooOo0o;
            if (m80699isValidSessionRestartTimeoutLRDsOJo(j2)) {
                return j2;
            }
        }
        int i = C33549OooO00o.f121147OooOoO;
        return C29437OooOO0O.OooO0o(30, EnumC33551OooO0OO.f121154OooOoOO);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r6.updateSettings(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSettings(Continuation<? super C32460OooOooO> continuation) {
        C172071 c172071;
        SessionsSettings sessionsSettings;
        if (continuation instanceof C172071) {
            c172071 = (C172071) continuation;
            int i = c172071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172071.label = i - Integer.MIN_VALUE;
            } else {
                c172071 = new C172071(continuation);
            }
        }
        Object obj = c172071.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172071.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            SettingsProvider settingsProvider = this.localOverrideSettings;
            c172071.L$0 = this;
            c172071.label = 1;
            if (settingsProvider.updateSettings(c172071) != enumC32485OooO00o) {
                sessionsSettings = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        sessionsSettings = (SessionsSettings) c172071.L$0;
        C32446OooOOOo.OooO0O0(obj);
        SettingsProvider settingsProvider2 = sessionsSettings.remoteSettings;
        c172071.L$0 = null;
        c172071.label = 2;
    }
}
