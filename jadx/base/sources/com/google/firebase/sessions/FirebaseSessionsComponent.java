package com.google.firebase.sessions;

import Ooooo00.C21246OooO0OO;
import android.content.Context;
import android.util.Log;
import com.facebook.soloader.OooOo;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.Binds;
import com.google.firebase.sessions.dagger.BindsInstance;
import com.google.firebase.sessions.dagger.Component;
import com.google.firebase.sessions.dagger.Module;
import com.google.firebase.sessions.dagger.Provides;
import com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher;
import com.google.firebase.sessions.settings.LocalOverrideSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher;
import com.google.firebase.sessions.settings.SessionConfigs;
import com.google.firebase.sessions.settings.SessionConfigsSerializer;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.google.firebase.sessions.settings.SettingsCache;
import com.google.firebase.sessions.settings.SettingsCacheImpl;
import com.google.firebase.sessions.settings.SettingsProvider;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.C24249OooO0OO;
import o0000o0O.C24252OooO0oO;
import o0000o0O.C24277Oooo0o0;
import o0000o0O.C24278Oooo0oO;
import o0000o0O.C24293OooooOO;
import o0000o0O.OooOOO;
import o0000o0O.o00O0O;
import o0000o0o.C24305OooO00o;
import o0000o0o.C24306OooO0O0;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes8.dex */
@Component(modules = {MainModule.class})
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001:\u0002\u0016\u0017R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m80612d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "", "firebaseSessions", "Lcom/google/firebase/sessions/FirebaseSessions;", "getFirebaseSessions", "()Lcom/google/firebase/sessions/FirebaseSessions;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "getSessionFirelogPublisher", "()Lcom/google/firebase/sessions/SessionFirelogPublisher;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionGenerator;", "getSessionGenerator", "()Lcom/google/firebase/sessions/SessionGenerator;", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "getSessionsSettings", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "sharedSessionRepository", "Lcom/google/firebase/sessions/SharedSessionRepository;", "getSharedSessionRepository", "()Lcom/google/firebase/sessions/SharedSessionRepository;", "Builder", "MainModule", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public interface FirebaseSessionsComponent {

    @Component.Builder
    @Metadata(m80611d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m80612d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "", "Landroid/content/Context;", "appContext", "(Landroid/content/Context;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "LoOo0000O/OooO0oo;", "backgroundDispatcher", "(LoOo0000O/OooO0oo;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "blockingDispatcher", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "(Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/TransportFactory;", "transportFactoryProvider", "(Lcom/google/firebase/inject/Provider;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "build", "()Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public interface Builder {
        @BindsInstance
        Builder appContext(Context appContext);

        @BindsInstance
        Builder backgroundDispatcher(@Background InterfaceC34415OooO0oo backgroundDispatcher);

        @BindsInstance
        Builder blockingDispatcher(@Blocking InterfaceC34415OooO0oo blockingDispatcher);

        FirebaseSessionsComponent build();

        @BindsInstance
        Builder firebaseApp(FirebaseApp firebaseApp);

        @BindsInstance
        Builder firebaseInstallationsApi(FirebaseInstallationsApi firebaseInstallationsApi);

        @BindsInstance
        Builder transportFactoryProvider(Provider<TransportFactory> transportFactoryProvider);
    }

    @Metadata(m80611d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0016H'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0019H'¨\u0006\u001b"}, m80612d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule;", "", "eventGDTLoggerInterface", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "impl", "Lcom/google/firebase/sessions/EventGDTLogger;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "crashlyticsSettingsFetcher", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "localOverrideSettings", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lcom/google/firebase/sessions/settings/LocalOverrideSettings;", "remoteSettings", "Lcom/google/firebase/sessions/settings/RemoteSettings;", "settingsCache", "Lcom/google/firebase/sessions/settings/SettingsCache;", "Lcom/google/firebase/sessions/settings/SettingsCacheImpl;", "sharedSessionRepository", "Lcom/google/firebase/sessions/SharedSessionRepository;", "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl;", "processDataManager", "Lcom/google/firebase/sessions/ProcessDataManager;", "Lcom/google/firebase/sessions/ProcessDataManagerImpl;", "Companion", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    @Module
    public interface MainModule {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(m80611d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!J'\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00112\u0006\u0010#\u001a\u00020\"2\b\b\u0001\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b'\u0010(J/\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00112\u0006\u0010#\u001a\u00020\"2\b\b\u0001\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010-¨\u0006."}, m80612d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule$Companion;", "", "<init>", "()V", "T", "Lo0000o0O/o00O0O;", "serializer", "Lo0000o0o/OooO0O0;", "corruptionHandler", "", "Lo0000o0O/OooO0o;", "migrations", "LoO0o0OO/Oooo00o;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lo0000o0O/OooOO0;", "createDataStore", "(Lo0000o0O/o00O0O;Lo0000o0o/OooO0O0;Ljava/util/List;LoO0o0OO/Oooo00o;LoO0O000o/OooO00o;)Lo0000o0O/OooOO0;", "", "loadDataStoreSharedCounter", "()Z", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "()Lcom/google/firebase/sessions/TimeProvider;", "Lcom/google/firebase/sessions/UuidGenerator;", "uuidGenerator", "()Lcom/google/firebase/sessions/UuidGenerator;", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/sessions/ApplicationInfo;", "applicationInfo", "(Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/sessions/ApplicationInfo;", "Landroid/content/Context;", "appContext", "LoOo0000O/OooO0oo;", "blockingDispatcher", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "sessionConfigsDataStore", "(Landroid/content/Context;LoOo0000O/OooO0oo;)Lo0000o0O/OooOO0;", "Lcom/google/firebase/sessions/SessionDataSerializer;", "sessionDataSerializer", "Lcom/google/firebase/sessions/SessionData;", "sessionDataStore", "(Landroid/content/Context;LoOo0000O/OooO0oo;Lcom/google/firebase/sessions/SessionDataSerializer;)Lo0000o0O/OooOO0;", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            private final <T> o0000o0O.OooOO0<T> createDataStore(o00O0O<T> serializer, C24306OooO0O0<T> corruptionHandler, List<? extends o0000o0O.OooO0o<T>> migrations, InterfaceC33636Oooo00o scope, oO0O000o.OooO00o<? extends File> produceFile) {
                if (!loadDataStoreSharedCounter()) {
                    OooOOO0.OooO0oO(serializer, "serializer");
                    OooOOO0.OooO0oO(migrations, "migrations");
                    OooOOO0.OooO0oO(scope, "scope");
                    OooOOO0.OooO0oO(produceFile, "produceFile");
                    C24278Oooo0oO c24278Oooo0oO = new C24278Oooo0oO(serializer, C24277Oooo0o0.f81701OooOo0o, produceFile);
                    if (corruptionHandler == null) {
                        corruptionHandler = (C24306OooO0O0<T>) new C24305OooO00o();
                    }
                    return new OooOOO(c24278Oooo0oO, OooOo.OooO0oO(new C24252OooO0oO(migrations, null)), corruptionHandler, scope);
                }
                OooOOO0.OooO0oO(serializer, "serializer");
                OooOOO0.OooO0oO(migrations, "migrations");
                OooOOO0.OooO0oO(scope, "scope");
                OooOOO0.OooO0oO(produceFile, "produceFile");
                C24278Oooo0oO c24278Oooo0oO2 = new C24278Oooo0oO(serializer, new C24293OooooOO(scope, 0), produceFile);
                List listOooO0oO = OooOo.OooO0oO(new C24252OooO0oO(migrations, null));
                if (corruptionHandler == null) {
                    corruptionHandler = (C24306OooO0O0<T>) new C24305OooO00o();
                }
                return new OooOOO(c24278Oooo0oO2, listOooO0oO, corruptionHandler, scope);
            }

            public static /* synthetic */ o0000o0O.OooOO0 createDataStore$default(Companion companion, o00O0O o00o0o2, C24306OooO0O0 c24306OooO0O0, List list, InterfaceC33636Oooo00o interfaceC33636Oooo00o, oO0O000o.OooO00o oooO00o, int i, Object obj) {
                if ((i & 4) != 0) {
                    list = C34434OooOoO.f123453OooOo0o;
                }
                return companion.createDataStore(o00o0o2, c24306OooO0O0, list, interfaceC33636Oooo00o, oooO00o);
            }

            private final boolean loadDataStoreSharedCounter() {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return true;
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return false;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionConfigs sessionConfigsDataStore$lambda$0(C24249OooO0OO ex) {
                OooOOO0.OooO0oO(ex, "ex");
                Log.w(FirebaseSessions.TAG, "CorruptionException in session configs DataStore", ex);
                return SessionConfigsSerializer.INSTANCE.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File sessionConfigsDataStore$lambda$1(Context context) {
                return C21246OooO0OO.OooO0o0(context, "aqs/sessionConfigsDataStore.data");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionData sessionDataStore$lambda$2(SessionDataSerializer sessionDataSerializer, C24249OooO0OO ex) {
                OooOOO0.OooO0oO(ex, "ex");
                Log.w(FirebaseSessions.TAG, "CorruptionException in session data DataStore", ex);
                return sessionDataSerializer.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File sessionDataStore$lambda$3(Context context) {
                return C21246OooO0OO.OooO0o0(context, "aqs/sessionDataStore.data");
            }

            @Provides
            public final ApplicationInfo applicationInfo(FirebaseApp firebaseApp) {
                OooOOO0.OooO0oO(firebaseApp, "firebaseApp");
                return SessionEvents.INSTANCE.getApplicationInfo(firebaseApp);
            }

            @Provides
            public final o0000o0O.OooOO0<SessionConfigs> sessionConfigsDataStore(Context appContext, @Blocking InterfaceC34415OooO0oo blockingDispatcher) {
                OooOOO0.OooO0oO(appContext, "appContext");
                OooOOO0.OooO0oO(blockingDispatcher, "blockingDispatcher");
                return createDataStore$default(this, SessionConfigsSerializer.INSTANCE, new C24306OooO0O0(new OooO0O0()), null, C33633Oooo0.OooO00o(blockingDispatcher), new OooO0OO(appContext, 0), 4, null);
            }

            @Provides
            public final o0000o0O.OooOO0<SessionData> sessionDataStore(Context appContext, @Blocking InterfaceC34415OooO0oo blockingDispatcher, SessionDataSerializer sessionDataSerializer) {
                OooOOO0.OooO0oO(appContext, "appContext");
                OooOOO0.OooO0oO(blockingDispatcher, "blockingDispatcher");
                OooOOO0.OooO0oO(sessionDataSerializer, "sessionDataSerializer");
                return createDataStore$default(this, sessionDataSerializer, new C24306OooO0O0(new C22797OooO0Oo(sessionDataSerializer, 0)), null, C33633Oooo0.OooO00o(blockingDispatcher), new C22798OooO0o0(appContext, 0), 4, null);
            }

            @Provides
            public final TimeProvider timeProvider() {
                return TimeProviderImpl.INSTANCE;
            }

            @Provides
            public final UuidGenerator uuidGenerator() {
                return UuidGeneratorImpl.INSTANCE;
            }
        }

        @Binds
        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher(RemoteSettingsFetcher impl);

        @Binds
        EventGDTLoggerInterface eventGDTLoggerInterface(EventGDTLogger impl);

        @Binds
        @LocalOverrideSettingsProvider
        SettingsProvider localOverrideSettings(LocalOverrideSettings impl);

        @Binds
        ProcessDataManager processDataManager(ProcessDataManagerImpl impl);

        @RemoteSettingsProvider
        @Binds
        SettingsProvider remoteSettings(RemoteSettings impl);

        @Binds
        SessionFirelogPublisher sessionFirelogPublisher(SessionFirelogPublisherImpl impl);

        @Binds
        SettingsCache settingsCache(SettingsCacheImpl impl);

        @Binds
        SharedSessionRepository sharedSessionRepository(SharedSessionRepositoryImpl impl);
    }

    FirebaseSessions getFirebaseSessions();

    SessionFirelogPublisher getSessionFirelogPublisher();

    SessionGenerator getSessionGenerator();

    SessionsSettings getSessionsSettings();

    SharedSessionRepository getSharedSessionRepository();
}
