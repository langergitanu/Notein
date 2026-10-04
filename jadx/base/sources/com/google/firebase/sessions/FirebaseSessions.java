package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseKt;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o00o00Oo.C25261OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, m80612d2 = {"Lcom/google/firebase/sessions/FirebaseSessions;", "", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "settings", "LoOo0000O/OooO0oo;", "backgroundDispatcher", "Lcom/google/firebase/sessions/SessionsActivityLifecycleCallbacks;", "sessionsActivityLifecycleCallbacks", "<init>", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/sessions/settings/SessionsSettings;LoOo0000O/OooO0oo;Lcom/google/firebase/sessions/SessionsActivityLifecycleCallbacks;)V", "Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "Companion", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class FirebaseSessions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "FirebaseSessions";
    private final FirebaseApp firebaseApp;
    private final SessionsSettings settings;

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessions$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.FirebaseSessions$1", m80623f = "FirebaseSessions.kt", m80624l = {51, 55}, m80625m = "invokeSuspend")
    public static final class C171911 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ SessionsActivityLifecycleCallbacks $sessionsActivityLifecycleCallbacks;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C171911(SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks, Continuation<? super C171911> continuation) {
            super(2, continuation);
            this.$sessionsActivityLifecycleCallbacks = sessionsActivityLifecycleCallbacks;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks, String str, FirebaseOptions firebaseOptions) {
            Log.w(FirebaseSessions.TAG, "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            sessionsActivityLifecycleCallbacks.onAppDelete();
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return FirebaseSessions.this.new C171911(this.$sessionsActivityLifecycleCallbacks, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        
            if (r6.updateSettings(r5) == r0) goto L25;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                this.label = 1;
                obj = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                if (FirebaseSessions.this.settings.getSessionsEnabled()) {
                    FirebaseApp firebaseApp = FirebaseSessions.this.firebaseApp;
                    final SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks = this.$sessionsActivityLifecycleCallbacks;
                    firebaseApp.addLifecycleEventListener(new FirebaseAppLifecycleListener() { // from class: com.google.firebase.sessions.OooO00o
                        @Override // com.google.firebase.FirebaseAppLifecycleListener
                        public final void onDeleted(String str, FirebaseOptions firebaseOptions) {
                            FirebaseSessions.C171911.invokeSuspend$lambda$1(sessionsActivityLifecycleCallbacks, str, firebaseOptions);
                        }
                    });
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } else {
                    C25261OooO0o0.OooO0OO(Log.d(FirebaseSessions.TAG, "Sessions SDK disabled. Not listening to lifecycle events."));
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            Collection collectionValues = ((Map) obj).values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                        SessionsSettings sessionsSettings = FirebaseSessions.this.settings;
                        this.label = 2;
                    }
                }
            }
            C25261OooO0o0.OooO0OO(Log.d(FirebaseSessions.TAG, "No Sessions subscribers. Not listening to lifecycle events."));
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C171911) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/google/firebase/sessions/FirebaseSessions$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/google/firebase/sessions/FirebaseSessions;", "getInstance", "()Lcom/google/firebase/sessions/FirebaseSessions;", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final FirebaseSessions getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessions.class);
            OooOOO0.OooO0o(obj, "get(...)");
            return (FirebaseSessions) obj;
        }

        private Companion() {
        }
    }

    public FirebaseSessions(FirebaseApp firebaseApp, SessionsSettings settings, @Background InterfaceC34415OooO0oo backgroundDispatcher, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        OooOOO0.OooO0oO(firebaseApp, "firebaseApp");
        OooOOO0.OooO0oO(settings, "settings");
        OooOOO0.OooO0oO(backgroundDispatcher, "backgroundDispatcher");
        OooOOO0.OooO0oO(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.firebaseApp = firebaseApp;
        this.settings = settings;
        Log.d(TAG, "Initializing Firebase Sessions 3.0.1.");
        Context applicationContext = firebaseApp.getApplicationContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(backgroundDispatcher), null, null, new C171911(sessionsActivityLifecycleCallbacks, null), 3);
        } else {
            Log.e(TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + FilenameUtils.EXTENSION_SEPARATOR);
        }
    }
}
