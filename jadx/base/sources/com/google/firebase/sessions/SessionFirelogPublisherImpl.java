package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.InstallationId;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006\""}, m80612d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallations", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionSettings", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "eventGDTLogger", "LoOo0000O/OooO0oo;", "backgroundDispatcher", "<init>", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/EventGDTLoggerInterface;LoOo0000O/OooO0oo;)V", "Lcom/google/firebase/sessions/SessionEvent;", "sessionEvent", "LoO00ooO/OooOooO;", "attemptLoggingSessionEvent", "(Lcom/google/firebase/sessions/SessionEvent;)V", "", "shouldLogSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldCollectEvents", "()Z", "Lcom/google/firebase/sessions/SessionDetails;", "sessionDetails", "mayLogSession", "(Lcom/google/firebase/sessions/SessionDetails;)V", "Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "LoOo0000O/OooO0oo;", "Companion", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {
    private static final double randomValueForSampling = Math.random();
    private final InterfaceC34415OooO0oo backgroundDispatcher;
    private final EventGDTLoggerInterface eventGDTLogger;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final SessionsSettings sessionSettings;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", m80623f = "SessionFirelogPublisher.kt", m80624l = {70, 71, 77}, m80625m = "invokeSuspend")
    public static final class C171981 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ SessionDetails $sessionDetails;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C171981(SessionDetails sessionDetails, Continuation<? super C171981> continuation) {
            super(2, continuation);
            this.$sessionDetails = sessionDetails;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return SessionFirelogPublisherImpl.this.new C171981(this.$sessionDetails, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InstallationId installationId;
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
            Object registeredSubscribers$com_google_firebase_firebase_sessions;
            FirebaseApp firebaseApp;
            SessionDetails sessionDetails;
            SessionEvents sessionEvents;
            SessionsSettings sessionsSettings;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = SessionFirelogPublisherImpl.this;
                this.label = 1;
                obj = sessionFirelogPublisherImpl2.shouldLogSession(this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SessionsSettings sessionsSettings2 = (SessionsSettings) this.L$5;
                    SessionDetails sessionDetails2 = (SessionDetails) this.L$4;
                    FirebaseApp firebaseApp2 = (FirebaseApp) this.L$3;
                    SessionEvents sessionEvents2 = (SessionEvents) this.L$2;
                    sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) this.L$1;
                    installationId = (InstallationId) this.L$0;
                    C32446OooOOOo.OooO0O0(obj);
                    sessionsSettings = sessionsSettings2;
                    sessionEvents = sessionEvents2;
                    sessionDetails = sessionDetails2;
                    firebaseApp = firebaseApp2;
                    SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = sessionFirelogPublisherImpl;
                    Map<SessionSubscriber.Name, ? extends SessionSubscriber> map = (Map) obj;
                    InstallationId installationId2 = installationId;
                    sessionFirelogPublisherImpl3.attemptLoggingSessionEvent(sessionEvents.buildSession(firebaseApp, sessionDetails, sessionsSettings, map, installationId2.getFid(), installationId2.getAuthToken()));
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
                installationId = (InstallationId) obj;
                sessionFirelogPublisherImpl = SessionFirelogPublisherImpl.this;
                SessionEvents sessionEvents3 = SessionEvents.INSTANCE;
                FirebaseApp firebaseApp3 = sessionFirelogPublisherImpl.firebaseApp;
                SessionDetails sessionDetails3 = this.$sessionDetails;
                SessionsSettings sessionsSettings3 = SessionFirelogPublisherImpl.this.sessionSettings;
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                this.L$0 = installationId;
                this.L$1 = sessionFirelogPublisherImpl;
                this.L$2 = sessionEvents3;
                this.L$3 = firebaseApp3;
                this.L$4 = sessionDetails3;
                this.L$5 = sessionsSettings3;
                this.label = 3;
                registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (registeredSubscribers$com_google_firebase_firebase_sessions != enumC32485OooO00o) {
                    firebaseApp = firebaseApp3;
                    obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                    sessionDetails = sessionDetails3;
                    sessionEvents = sessionEvents3;
                    sessionsSettings = sessionsSettings3;
                    SessionFirelogPublisherImpl sessionFirelogPublisherImpl32 = sessionFirelogPublisherImpl;
                    Map<SessionSubscriber.Name, ? extends SessionSubscriber> map2 = (Map) obj;
                    InstallationId installationId22 = installationId;
                    sessionFirelogPublisherImpl32.attemptLoggingSessionEvent(sessionEvents.buildSession(firebaseApp, sessionDetails, sessionsSettings, map2, installationId22.getFid(), installationId22.getAuthToken()));
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                InstallationId.Companion companion = InstallationId.INSTANCE;
                FirebaseInstallationsApi firebaseInstallationsApi = SessionFirelogPublisherImpl.this.firebaseInstallations;
                this.label = 2;
                obj = companion.create(firebaseInstallationsApi, this);
                if (obj != enumC32485OooO00o) {
                    installationId = (InstallationId) obj;
                    sessionFirelogPublisherImpl = SessionFirelogPublisherImpl.this;
                    SessionEvents sessionEvents32 = SessionEvents.INSTANCE;
                    FirebaseApp firebaseApp32 = sessionFirelogPublisherImpl.firebaseApp;
                    SessionDetails sessionDetails32 = this.$sessionDetails;
                    SessionsSettings sessionsSettings32 = SessionFirelogPublisherImpl.this.sessionSettings;
                    FirebaseSessionsDependencies firebaseSessionsDependencies2 = FirebaseSessionsDependencies.INSTANCE;
                    this.L$0 = installationId;
                    this.L$1 = sessionFirelogPublisherImpl;
                    this.L$2 = sessionEvents32;
                    this.L$3 = firebaseApp32;
                    this.L$4 = sessionDetails32;
                    this.L$5 = sessionsSettings32;
                    this.label = 3;
                    registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies2.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                    if (registeredSubscribers$com_google_firebase_firebase_sessions != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C171981) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m80623f = "SessionFirelogPublisher.kt", m80624l = {98, 104}, m80625m = "shouldLogSession")
    public static final class C171991 extends AbstractC32479OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C171991(Continuation<? super C171991> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionFirelogPublisherImpl.this.shouldLogSession(this);
        }
    }

    public SessionFirelogPublisherImpl(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallations, SessionsSettings sessionSettings, EventGDTLoggerInterface eventGDTLogger, @Background InterfaceC34415OooO0oo backgroundDispatcher) {
        OooOOO0.OooO0oO(firebaseApp, "firebaseApp");
        OooOOO0.OooO0oO(firebaseInstallations, "firebaseInstallations");
        OooOOO0.OooO0oO(sessionSettings, "sessionSettings");
        OooOOO0.OooO0oO(eventGDTLogger, "eventGDTLogger");
        OooOOO0.OooO0oO(backgroundDispatcher, "backgroundDispatcher");
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallations;
        this.sessionSettings = sessionSettings;
        this.eventGDTLogger = eventGDTLogger;
        this.backgroundDispatcher = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attemptLoggingSessionEvent(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.log(sessionEvent);
            Log.d(FirebaseSessions.TAG, "Successfully logged Session Start event.");
        } catch (RuntimeException e) {
            Log.e(FirebaseSessions.TAG, "Error logging Session Start event to DataTransport: ", e);
        }
    }

    private final boolean shouldCollectEvents() {
        return randomValueForSampling <= this.sessionSettings.getSamplingRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shouldLogSession(Continuation<? super Boolean> continuation) {
        C171991 c171991;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl2;
        if (continuation instanceof C171991) {
            c171991 = (C171991) continuation;
            int i = c171991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c171991.label = i - Integer.MIN_VALUE;
            } else {
                c171991 = new C171991(continuation);
            }
        }
        Object registeredSubscribers$com_google_firebase_firebase_sessions = c171991.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c171991.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(registeredSubscribers$com_google_firebase_firebase_sessions);
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
            c171991.L$0 = this;
            c171991.label = 1;
            registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(c171991);
            if (registeredSubscribers$com_google_firebase_firebase_sessions != enumC32485OooO00o) {
                sessionFirelogPublisherImpl = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sessionFirelogPublisherImpl2 = (SessionFirelogPublisherImpl) c171991.L$0;
            C32446OooOOOo.OooO0O0(registeredSubscribers$com_google_firebase_firebase_sessions);
            if (sessionFirelogPublisherImpl2.sessionSettings.getSessionsEnabled()) {
                Log.d(FirebaseSessions.TAG, "Sessions SDK disabled through settings API. Events will not be sent.");
                return Boolean.FALSE;
            }
            if (sessionFirelogPublisherImpl2.shouldCollectEvents()) {
                return Boolean.TRUE;
            }
            Log.d(FirebaseSessions.TAG, "Sessions SDK has dropped this session due to sampling.");
            return Boolean.FALSE;
        }
        sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) c171991.L$0;
        C32446OooOOOo.OooO0O0(registeredSubscribers$com_google_firebase_firebase_sessions);
        Collection collectionValues = ((Map) registeredSubscribers$com_google_firebase_firebase_sessions).values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                    SessionsSettings sessionsSettings = sessionFirelogPublisherImpl.sessionSettings;
                    c171991.L$0 = sessionFirelogPublisherImpl;
                    c171991.label = 2;
                    if (sessionsSettings.updateSettings(c171991) != enumC32485OooO00o) {
                        sessionFirelogPublisherImpl2 = sessionFirelogPublisherImpl;
                        if (sessionFirelogPublisherImpl2.sessionSettings.getSessionsEnabled()) {
                        }
                    }
                    return enumC32485OooO00o;
                }
            }
        }
        Log.d(FirebaseSessions.TAG, "Sessions SDK disabled through data collection. Events will not be sent.");
        return Boolean.FALSE;
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void mayLogSession(SessionDetails sessionDetails) {
        OooOOO0.OooO0oO(sessionDetails, "sessionDetails");
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(this.backgroundDispatcher), null, null, new C171981(sessionDetails, null), 3);
    }
}
