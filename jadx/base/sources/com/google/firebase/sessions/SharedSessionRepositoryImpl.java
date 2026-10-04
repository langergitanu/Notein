package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0O.C33549OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33736OooOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b\u0001\u0018\u00002\u00020\u0001:\u0001<BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010)R\"\u0010*\u001a\u00020\u000b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\"\u00104\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m80612d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl;", "Lcom/google/firebase/sessions/SharedSessionRepository;", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionsSettings", "Lcom/google/firebase/sessions/SessionGenerator;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Lo0000o0O/OooOO0;", "Lcom/google/firebase/sessions/SessionData;", "sessionDataStore", "Lcom/google/firebase/sessions/ProcessDataManager;", "processDataManager", "LoOo0000O/OooO0oo;", "backgroundDispatcher", "<init>", "(Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/SessionGenerator;Lcom/google/firebase/sessions/SessionFirelogPublisher;Lcom/google/firebase/sessions/TimeProvider;Lo0000o0O/OooOO0;Lcom/google/firebase/sessions/ProcessDataManager;LoOo0000O/OooO0oo;)V", "", "sessionId", "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", C18437z2.f56754h, "LoO00ooO/OooOooO;", "notifySubscribers", "(Ljava/lang/String;Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionData", "", "isSessionExpired", "(Lcom/google/firebase/sessions/SessionData;)Z", "isColdStart", "isMyProcessStale", "appBackground", "()V", "appForeground", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "Lcom/google/firebase/sessions/SessionGenerator;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Lcom/google/firebase/sessions/TimeProvider;", "Lo0000o0O/OooOO0;", "Lcom/google/firebase/sessions/ProcessDataManager;", "LoOo0000O/OooO0oo;", "localSessionData", "Lcom/google/firebase/sessions/SessionData;", "getLocalSessionData$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/sessions/SessionData;", "setLocalSessionData$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SessionData;)V", "value", "isInForeground", "Z", "()Z", "previousNotificationType", "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "getPreviousNotificationType$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "setPreviousNotificationType$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;)V", "previousSessionId", "Ljava/lang/String;", "NotificationType", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class SharedSessionRepositoryImpl implements SharedSessionRepository {
    private final InterfaceC34415OooO0oo backgroundDispatcher;
    private boolean isInForeground;
    public SessionData localSessionData;
    private NotificationType previousNotificationType;
    private String previousSessionId;
    private final ProcessDataManager processDataManager;
    private final o0000o0O.OooOO0<SessionData> sessionDataStore;
    private final SessionFirelogPublisher sessionFirelogPublisher;
    private final SessionGenerator sessionGenerator;
    private final SessionsSettings sessionsSettings;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", m80623f = "SharedSessionRepository.kt", m80624l = {94}, m80625m = "invokeSuspend")
    public static final class C172001 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1, reason: invalid class name */
        @Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m80612d2 = {"LoO0o0Oo/OooO0oO;", "Lcom/google/firebase/sessions/SessionData;", "", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0Oo/OooO0oO;Ljava/lang/Throwable;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
        @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", m80623f = "SharedSessionRepository.kt", m80624l = {92}, m80625m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super SessionData>, Throwable, Continuation<? super C32460OooOooO>, Object> {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.label;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC33723OooO0oO interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.L$0;
                    Throwable th = (Throwable) this.L$1;
                    SessionData sessionData = new SessionData(this.this$0.sessionGenerator.generateNewSession(null), (Time) null, (Map) null, 4, (C24018OooO0oo) null);
                    Log.d(FirebaseSessions.TAG, "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + sessionData.getSessionDetails().getSessionId());
                    this.L$0 = null;
                    this.label = 1;
                    if (interfaceC33723OooO0oO.emit(sessionData, this) == enumC32485OooO00o) {
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

            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(InterfaceC33723OooO0oO<? super SessionData> interfaceC33723OooO0oO, Throwable th, Continuation<? super C32460OooOooO> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = interfaceC33723OooO0oO;
                anonymousClass1.L$1 = th;
                return anonymousClass1.invokeSuspend(C32460OooOooO.f116667OooO00o);
            }
        }

        public C172001(Continuation<? super C172001> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return SharedSessionRepositoryImpl.this.new C172001(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33736OooOo0 c33736OooOo0 = new C33736OooOo0(SharedSessionRepositoryImpl.this.sessionDataStore.getData(), new AnonymousClass1(SharedSessionRepositoryImpl.this, null));
                final SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO = new InterfaceC33723OooO0oO() { // from class: com.google.firebase.sessions.SharedSessionRepositoryImpl.1.2
                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SessionData) obj2, (Continuation<? super C32460OooOooO>) continuation);
                    }

                    public final Object emit(SessionData sessionData, Continuation<? super C32460OooOooO> continuation) {
                        sharedSessionRepositoryImpl.setLocalSessionData$com_google_firebase_firebase_sessions(sessionData);
                        Object objNotifySubscribers = sharedSessionRepositoryImpl.notifySubscribers(sessionData.getSessionDetails().getSessionId(), NotificationType.GENERAL, continuation);
                        return objNotifySubscribers == EnumC32485OooO00o.f116726OooOo0o ? objNotifySubscribers : C32460OooOooO.f116667OooO00o;
                    }
                };
                this.label = 1;
                if (c33736OooOo0.collect(interfaceC33723OooO0oO, this) == enumC32485OooO00o) {
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
            return ((C172001) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "", "<init>", "(Ljava/lang/String;I)V", "GENERAL", "FALLBACK", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class NotificationType {
        private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
        private static final /* synthetic */ NotificationType[] $VALUES;
        public static final NotificationType GENERAL = new NotificationType("GENERAL", 0);
        public static final NotificationType FALLBACK = new NotificationType("FALLBACK", 1);

        private static final /* synthetic */ NotificationType[] $values() {
            return new NotificationType[]{GENERAL, FALLBACK};
        }

        static {
            NotificationType[] notificationTypeArr$values = $values();
            $VALUES = notificationTypeArr$values;
            $ENTRIES = OooO.OooO00o.OooO0O0(notificationTypeArr$values);
        }

        private NotificationType(String str, int i) {
        }

        public static InterfaceC34452OooO00o<NotificationType> getEntries() {
            return $ENTRIES;
        }

        public static NotificationType valueOf(String str) {
            return (NotificationType) Enum.valueOf(NotificationType.class, str);
        }

        public static NotificationType[] values() {
            return (NotificationType[]) $VALUES.clone();
        }
    }

    @Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationType.values().length];
            try {
                iArr[NotificationType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationType.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", m80623f = "SharedSessionRepository.kt", m80624l = {112}, m80625m = "invokeSuspend")
    public static final class C172011 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1, reason: invalid class name */
        @Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m80612d2 = {"<anonymous>", "Lcom/google/firebase/sessions/SessionData;", "sessionData"}, m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
        @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", m80623f = "SharedSessionRepository.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<SessionData, Continuation<? super SessionData>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(SessionData sessionData, Continuation<? super SessionData> continuation) {
                return ((AnonymousClass1) create(sessionData, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return SessionData.copy$default((SessionData) this.L$0, null, this.this$0.timeProvider.currentTime(), null, 5, null);
            }
        }

        public C172011(Continuation<? super C172011> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return SharedSessionRepositoryImpl.this.new C172011(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    o0000o0O.OooOO0 oooOO02 = SharedSessionRepositoryImpl.this.sessionDataStore;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(SharedSessionRepositoryImpl.this, null);
                    this.label = 1;
                    if (oooOO02.OooO00o(anonymousClass1, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
            } catch (Exception e) {
                Log.d(FirebaseSessions.TAG, "App backgrounded, failed to update data. Message: " + e.getMessage());
                SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                sharedSessionRepositoryImpl.setLocalSessionData$com_google_firebase_firebase_sessions(SessionData.copy$default(sharedSessionRepositoryImpl.getLocalSessionData$com_google_firebase_firebase_sessions(), null, SharedSessionRepositoryImpl.this.timeProvider.currentTime(), null, 5, null));
            }
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C172011) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", m80623f = "SharedSessionRepository.kt", m80624l = {135, 186}, m80625m = "invokeSuspend")
    public static final class C172021 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ SessionData $sessionData;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1, reason: invalid class name */
        @Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m80612d2 = {"<anonymous>", "Lcom/google/firebase/sessions/SessionData;", "currentSessionData"}, m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
        @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", m80623f = "SharedSessionRepository.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<SessionData, Continuation<? super SessionData>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(SessionData sessionData, Continuation<? super SessionData> continuation) {
                return ((AnonymousClass1) create(sessionData, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                SessionData sessionData = (SessionData) this.L$0;
                boolean zIsSessionExpired = this.this$0.isSessionExpired(sessionData);
                boolean zIsColdStart = this.this$0.isColdStart(sessionData);
                boolean zIsMyProcessStale = this.this$0.isMyProcessStale(sessionData);
                Map<String, ProcessData> mapGenerateProcessDataMap = zIsColdStart ? this.this$0.processDataManager.generateProcessDataMap() : zIsMyProcessStale ? this.this$0.processDataManager.updateProcessDataMap(sessionData.getProcessDataMap()) : sessionData.getProcessDataMap();
                SessionDetails sessionDetails = zIsColdStart ? null : sessionData.getSessionDetails();
                if (!zIsSessionExpired && !zIsColdStart) {
                    return zIsMyProcessStale ? SessionData.copy$default(sessionData, null, null, this.this$0.processDataManager.updateProcessDataMap(mapGenerateProcessDataMap), 3, null) : sessionData;
                }
                SessionDetails sessionDetailsGenerateNewSession = this.this$0.sessionGenerator.generateNewSession(sessionDetails);
                this.this$0.sessionFirelogPublisher.mayLogSession(sessionDetailsGenerateNewSession);
                this.this$0.processDataManager.onSessionGenerated();
                return sessionData.copy(sessionDetailsGenerateNewSession, null, mapGenerateProcessDataMap);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172021(SessionData sessionData, Continuation<? super C172021> continuation) {
            super(2, continuation);
            this.$sessionData = sessionData;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return SharedSessionRepositoryImpl.this.new C172021(this.$sessionData, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        
            if (r10.OooO00o(r0, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
        
            if (r10.notifySubscribers(r0, r3, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
        
            return r1;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            try {
            } catch (Exception e) {
                Log.d(FirebaseSessions.TAG, "App foregrounded, failed to update data. Message: " + e.getMessage());
                if (SharedSessionRepositoryImpl.this.isSessionExpired(this.$sessionData)) {
                    SessionDetails sessionDetailsGenerateNewSession = SharedSessionRepositoryImpl.this.sessionGenerator.generateNewSession(this.$sessionData.getSessionDetails());
                    SharedSessionRepositoryImpl.this.setLocalSessionData$com_google_firebase_firebase_sessions(SessionData.copy$default(this.$sessionData, sessionDetailsGenerateNewSession, null, null, 4, null));
                    SharedSessionRepositoryImpl.this.sessionFirelogPublisher.mayLogSession(sessionDetailsGenerateNewSession);
                    SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                    String sessionId = sessionDetailsGenerateNewSession.getSessionId();
                    NotificationType notificationType = NotificationType.FALLBACK;
                    this.label = 2;
                }
            }
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                o0000o0O.OooOO0 oooOO02 = SharedSessionRepositoryImpl.this.sessionDataStore;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SharedSessionRepositoryImpl.this, null);
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C172021) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$notifySubscribers$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", m80623f = "SharedSessionRepository.kt", m80624l = {199}, m80625m = "notifySubscribers")
    public static final class C172031 extends AbstractC32479OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C172031(Continuation<? super C172031> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedSessionRepositoryImpl.this.notifySubscribers(null, null, this);
        }
    }

    public SharedSessionRepositoryImpl(SessionsSettings sessionsSettings, SessionGenerator sessionGenerator, SessionFirelogPublisher sessionFirelogPublisher, TimeProvider timeProvider, o0000o0O.OooOO0<SessionData> sessionDataStore, ProcessDataManager processDataManager, @Background InterfaceC34415OooO0oo backgroundDispatcher) {
        OooOOO0.OooO0oO(sessionsSettings, "sessionsSettings");
        OooOOO0.OooO0oO(sessionGenerator, "sessionGenerator");
        OooOOO0.OooO0oO(sessionFirelogPublisher, "sessionFirelogPublisher");
        OooOOO0.OooO0oO(timeProvider, "timeProvider");
        OooOOO0.OooO0oO(sessionDataStore, "sessionDataStore");
        OooOOO0.OooO0oO(processDataManager, "processDataManager");
        OooOOO0.OooO0oO(backgroundDispatcher, "backgroundDispatcher");
        this.sessionsSettings = sessionsSettings;
        this.sessionGenerator = sessionGenerator;
        this.sessionFirelogPublisher = sessionFirelogPublisher;
        this.timeProvider = timeProvider;
        this.sessionDataStore = sessionDataStore;
        this.processDataManager = processDataManager;
        this.backgroundDispatcher = backgroundDispatcher;
        this.previousNotificationType = NotificationType.GENERAL;
        this.previousSessionId = "";
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(backgroundDispatcher), null, null, new C172001(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isColdStart(SessionData sessionData) {
        Map<String, ProcessData> processDataMap = sessionData.getProcessDataMap();
        if (processDataMap == null) {
            Log.d(FirebaseSessions.TAG, "No process data map");
            return true;
        }
        boolean zIsColdStart = this.processDataManager.isColdStart(processDataMap);
        if (zIsColdStart) {
            Log.d(FirebaseSessions.TAG, "Cold app start detected");
        }
        return zIsColdStart;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMyProcessStale(SessionData sessionData) {
        Map<String, ProcessData> processDataMap = sessionData.getProcessDataMap();
        if (processDataMap == null) {
            Log.d(FirebaseSessions.TAG, "No process data for " + this.processDataManager.getMyProcessName());
            return true;
        }
        boolean zIsMyProcessStale = this.processDataManager.isMyProcessStale(processDataMap);
        if (zIsMyProcessStale) {
            Log.d(FirebaseSessions.TAG, "Process " + this.processDataManager.getMyProcessName() + " is stale");
        }
        return zIsMyProcessStale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSessionExpired(SessionData sessionData) {
        Time backgroundTime = sessionData.getBackgroundTime();
        if (backgroundTime == null) {
            Log.d(FirebaseSessions.TAG, "Session " + sessionData.getSessionDetails().getSessionId() + " has not backgrounded yet");
            return false;
        }
        boolean z = C33549OooO00o.OooO0OO(this.timeProvider.currentTime().m80696minus5sfh64U(backgroundTime), this.sessionsSettings.m80700getSessionRestartTimeoutUwyO8pc()) > 0;
        if (z) {
            Log.d(FirebaseSessions.TAG, "Session " + sessionData.getSessionDetails().getSessionId() + " is expired");
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object notifySubscribers(String str, NotificationType notificationType, Continuation<? super C32460OooOooO> continuation) {
        C172031 c172031;
        String str2;
        if (continuation instanceof C172031) {
            c172031 = (C172031) continuation;
            int i = c172031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172031.label = i - Integer.MIN_VALUE;
            } else {
                c172031 = new C172031(continuation);
            }
        }
        Object registeredSubscribers$com_google_firebase_firebase_sessions = c172031.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172031.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(registeredSubscribers$com_google_firebase_firebase_sessions);
            this.previousNotificationType = notificationType;
            if (OooOOO0.OooO0O0(this.previousSessionId, str)) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.previousSessionId = str;
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
            c172031.L$0 = str;
            c172031.L$1 = notificationType;
            c172031.label = 1;
            registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(c172031);
            if (registeredSubscribers$com_google_firebase_firebase_sessions == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            notificationType = (NotificationType) c172031.L$1;
            str = (String) c172031.L$0;
            C32446OooOOOo.OooO0O0(registeredSubscribers$com_google_firebase_firebase_sessions);
        }
        for (SessionSubscriber sessionSubscriber : ((Map) registeredSubscribers$com_google_firebase_firebase_sessions).values()) {
            sessionSubscriber.onSessionChanged(new SessionSubscriber.SessionDetails(str));
            int i3 = WhenMappings.$EnumSwitchMapping$0[notificationType.ordinal()];
            if (i3 == 1) {
                str2 = "Notified " + sessionSubscriber.getSessionSubscriberName() + " of new session " + str;
            } else {
                if (i3 != 2) {
                    throw new C32442OooOO0o();
                }
                str2 = "Notified " + sessionSubscriber.getSessionSubscriberName() + " of new fallback session " + str;
            }
            Log.d(FirebaseSessions.TAG, str2);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public void appBackground() {
        this.isInForeground = false;
        if (this.localSessionData == null) {
            Log.d(FirebaseSessions.TAG, "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d(FirebaseSessions.TAG, "App backgrounded on " + this.processDataManager.getMyProcessName());
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(this.backgroundDispatcher), null, null, new C172011(null), 3);
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public void appForeground() {
        this.isInForeground = true;
        if (this.localSessionData == null) {
            Log.d(FirebaseSessions.TAG, "App foregrounded, but local SessionData not initialized");
            return;
        }
        SessionData localSessionData$com_google_firebase_firebase_sessions = getLocalSessionData$com_google_firebase_firebase_sessions();
        Log.d(FirebaseSessions.TAG, "App foregrounded on " + this.processDataManager.getMyProcessName());
        if (isSessionExpired(localSessionData$com_google_firebase_firebase_sessions) || isMyProcessStale(localSessionData$com_google_firebase_firebase_sessions)) {
            C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(this.backgroundDispatcher), null, null, new C172021(localSessionData$com_google_firebase_firebase_sessions, null), 3);
        }
    }

    public final SessionData getLocalSessionData$com_google_firebase_firebase_sessions() {
        SessionData sessionData = this.localSessionData;
        if (sessionData != null) {
            return sessionData;
        }
        OooOOO0.OooOOOO("localSessionData");
        throw null;
    }

    /* JADX INFO: renamed from: getPreviousNotificationType$com_google_firebase_firebase_sessions, reason: from getter */
    public final NotificationType getPreviousNotificationType() {
        return this.previousNotificationType;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    /* JADX INFO: renamed from: isInForeground, reason: from getter */
    public boolean getIsInForeground() {
        return this.isInForeground;
    }

    public final void setLocalSessionData$com_google_firebase_firebase_sessions(SessionData sessionData) {
        OooOOO0.OooO0oO(sessionData, "<set-?>");
        this.localSessionData = sessionData;
    }

    /* JADX INFO: renamed from: setPreviousNotificationType$com_google_firebase_firebase_sessions */
    public final void m75292x97c9d05f(NotificationType notificationType) {
        OooOOO0.OooO0oO(notificationType, "<set-?>");
        this.previousNotificationType = notificationType;
    }
}
