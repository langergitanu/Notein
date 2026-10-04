package com.google.firebase.sessions.api;

import android.util.Log;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOo000Oo.Oooo0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0010H\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0017\u0010\u0003RT\u0010\u001b\u001aB\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\r0\r \u001a* \u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\r0\r\u0018\u00010\u00100\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m80612d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies;", "", "<init>", "()V", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "subscriberName", "LoO00ooO/OooOooO;", "addDependency", "(Lcom/google/firebase/sessions/api/SessionSubscriber$Name;)V", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "subscriber", "register", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "getDependency", "(Lcom/google/firebase/sessions/api/SessionSubscriber$Name;)Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "getRegisteredSubscribers$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRegisteredSubscribers", "getSubscriber$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/api/SessionSubscriber$Name;)Lcom/google/firebase/sessions/api/SessionSubscriber;", "getSubscriber", "reset$com_google_firebase_firebase_sessions", "reset", "", "kotlin.jvm.PlatformType", "dependencies", "Ljava/util/Map;", "Dependency", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class FirebaseSessionsDependencies {
    public static final FirebaseSessionsDependencies INSTANCE = new FirebaseSessionsDependencies();
    private static final Map<SessionSubscriber.Name, Dependency> dependencies = Collections.synchronizedMap(new LinkedHashMap());

    @Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m80612d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "LoO0o0oOo/OooO00o;", "mutex", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "subscriber", "<init>", "(LoO0o0oOo/OooO00o;Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "component1", "()LoO0o0oOo/OooO00o;", "component2", "()Lcom/google/firebase/sessions/api/SessionSubscriber;", "copy", "(LoO0o0oOo/OooO00o;Lcom/google/firebase/sessions/api/SessionSubscriber;)Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LoO0o0oOo/OooO00o;", "getMutex", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "getSubscriber", "setSubscriber", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final /* data */ class Dependency {
        private final InterfaceC33895OooO00o mutex;
        private SessionSubscriber subscriber;

        public Dependency(InterfaceC33895OooO00o mutex, SessionSubscriber sessionSubscriber) {
            OooOOO0.OooO0oO(mutex, "mutex");
            this.mutex = mutex;
            this.subscriber = sessionSubscriber;
        }

        public static /* synthetic */ Dependency copy$default(Dependency dependency, InterfaceC33895OooO00o interfaceC33895OooO00o, SessionSubscriber sessionSubscriber, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC33895OooO00o = dependency.mutex;
            }
            if ((i & 2) != 0) {
                sessionSubscriber = dependency.subscriber;
            }
            return dependency.copy(interfaceC33895OooO00o, sessionSubscriber);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final InterfaceC33895OooO00o getMutex() {
            return this.mutex;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public final Dependency copy(InterfaceC33895OooO00o mutex, SessionSubscriber subscriber) {
            OooOOO0.OooO0oO(mutex, "mutex");
            return new Dependency(mutex, subscriber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) other;
            return OooOOO0.OooO0O0(this.mutex, dependency.mutex) && OooOOO0.OooO0O0(this.subscriber, dependency.subscriber);
        }

        public final InterfaceC33895OooO00o getMutex() {
            return this.mutex;
        }

        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public int hashCode() {
            int iHashCode = this.mutex.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.subscriber;
            return iHashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public final void setSubscriber(SessionSubscriber sessionSubscriber) {
            this.subscriber = sessionSubscriber;
        }

        public String toString() {
            return "Dependency(mutex=" + this.mutex + ", subscriber=" + this.subscriber + ')';
        }

        public /* synthetic */ Dependency(InterfaceC33895OooO00o interfaceC33895OooO00o, SessionSubscriber sessionSubscriber, int i, C24018OooO0oo c24018OooO0oo) {
            this(interfaceC33895OooO00o, (i & 2) != 0 ? null : sessionSubscriber);
        }
    }

    private FirebaseSessionsDependencies() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void addDependency(SessionSubscriber.Name subscriberName) {
        OooOOO0.OooO0oO(subscriberName, "subscriberName");
        Map<SessionSubscriber.Name, Dependency> dependencies2 = dependencies;
        if (dependencies2.containsKey(subscriberName)) {
            Log.d(FirebaseSessions.TAG, "Dependency " + subscriberName + " already added.");
            return;
        }
        OooOOO0.OooO0o(dependencies2, "dependencies");
        dependencies2.put(subscriberName, new Dependency(new C33898OooO0Oo(true), null, 2, 0 == true ? 1 : 0));
        Log.d(FirebaseSessions.TAG, "Dependency to " + subscriberName + " added.");
    }

    private final Dependency getDependency(SessionSubscriber.Name subscriberName) {
        Map<SessionSubscriber.Name, Dependency> dependencies2 = dependencies;
        OooOOO0.OooO0o(dependencies2, "dependencies");
        Dependency dependency = dependencies2.get(subscriberName);
        if (dependency != null) {
            return dependency;
        }
        throw new IllegalStateException("Cannot get dependency " + subscriberName + ". Dependencies should be added at class load time.");
    }

    public static final void register(SessionSubscriber subscriber) {
        OooOOO0.OooO0oO(subscriber, "subscriber");
        SessionSubscriber.Name sessionSubscriberName = subscriber.getSessionSubscriberName();
        Dependency dependency = INSTANCE.getDependency(sessionSubscriberName);
        if (dependency.getSubscriber() != null) {
            Log.d(FirebaseSessions.TAG, "Subscriber " + sessionSubscriberName + " already registered.");
            return;
        }
        dependency.setSubscriber(subscriber);
        Log.d(FirebaseSessions.TAG, "Subscriber " + sessionSubscriberName + " registered.");
        dependency.getMutex().OooOOO0(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009e -> B:21:0x009f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(Continuation<? super Map<SessionSubscriber.Name, ? extends SessionSubscriber>> continuation) {
        FirebaseSessionsDependencies$getRegisteredSubscribers$1 firebaseSessionsDependencies$getRegisteredSubscribers$1;
        Iterator it;
        Map map;
        if (continuation instanceof FirebaseSessionsDependencies$getRegisteredSubscribers$1) {
            firebaseSessionsDependencies$getRegisteredSubscribers$1 = (FirebaseSessionsDependencies$getRegisteredSubscribers$1) continuation;
            int i = firebaseSessionsDependencies$getRegisteredSubscribers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                firebaseSessionsDependencies$getRegisteredSubscribers$1.label = i - Integer.MIN_VALUE;
            } else {
                firebaseSessionsDependencies$getRegisteredSubscribers$1 = new FirebaseSessionsDependencies$getRegisteredSubscribers$1(this, continuation);
            }
        }
        Object obj = firebaseSessionsDependencies$getRegisteredSubscribers$1.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = firebaseSessionsDependencies$getRegisteredSubscribers$1.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Map<SessionSubscriber.Name, Dependency> dependencies2 = dependencies;
            OooOOO0.OooO0o(dependencies2, "dependencies");
            LinkedHashMap linkedHashMap = new LinkedHashMap(Oooo0.OooO0Oo(dependencies2.size()));
            it = dependencies2.entrySet().iterator();
            map = linkedHashMap;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object key = firebaseSessionsDependencies$getRegisteredSubscribers$1.L$5;
            map = (Map) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$4;
            InterfaceC33895OooO00o mutex = (InterfaceC33895OooO00o) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$3;
            SessionSubscriber.Name name = (SessionSubscriber.Name) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$2;
            it = (Iterator) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$1;
            Map map2 = (Map) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$0;
            C32446OooOOOo.OooO0O0(obj);
            try {
                SessionSubscriber subscriber$com_google_firebase_firebase_sessions = INSTANCE.getSubscriber$com_google_firebase_firebase_sessions(name);
                mutex.OooOOO0(null);
                map.put(key, subscriber$com_google_firebase_firebase_sessions);
                map = map2;
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    key = entry.getKey();
                    name = (SessionSubscriber.Name) entry.getKey();
                    mutex = ((Dependency) entry.getValue()).getMutex();
                    firebaseSessionsDependencies$getRegisteredSubscribers$1.L$0 = map;
                    firebaseSessionsDependencies$getRegisteredSubscribers$1.L$1 = it;
                    firebaseSessionsDependencies$getRegisteredSubscribers$1.L$2 = name;
                    firebaseSessionsDependencies$getRegisteredSubscribers$1.L$3 = mutex;
                    firebaseSessionsDependencies$getRegisteredSubscribers$1.L$4 = map;
                    firebaseSessionsDependencies$getRegisteredSubscribers$1.L$5 = key;
                    firebaseSessionsDependencies$getRegisteredSubscribers$1.label = 1;
                    if (mutex.OooO00o(firebaseSessionsDependencies$getRegisteredSubscribers$1) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    map2 = map;
                    SessionSubscriber subscriber$com_google_firebase_firebase_sessions2 = INSTANCE.getSubscriber$com_google_firebase_firebase_sessions(name);
                    mutex.OooOOO0(null);
                    map.put(key, subscriber$com_google_firebase_firebase_sessions2);
                    map = map2;
                    if (it.hasNext()) {
                        return map;
                    }
                }
            } catch (Throwable th) {
                mutex.OooOOO0(null);
                throw th;
            }
        }
    }

    public final SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(SessionSubscriber.Name subscriberName) {
        OooOOO0.OooO0oO(subscriberName, "subscriberName");
        SessionSubscriber subscriber = getDependency(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    public final void reset$com_google_firebase_firebase_sessions() {
        dependencies.clear();
    }
}
