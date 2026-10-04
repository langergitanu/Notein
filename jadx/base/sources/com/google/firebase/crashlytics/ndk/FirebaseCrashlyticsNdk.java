package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;

/* JADX INFO: loaded from: classes8.dex */
class FirebaseCrashlyticsNdk implements CrashlyticsNativeComponent {
    private static FirebaseCrashlyticsNdk instance;
    private final CrashpadController controller;
    private String currentSessionId;
    private boolean installHandlerDuringPrepareSession;
    private SignalHandlerInstaller signalHandlerInstaller;

    public interface SignalHandlerInstaller {
        void installHandler();
    }

    public FirebaseCrashlyticsNdk(CrashpadController crashpadController, boolean z) {
        this.controller = crashpadController;
        this.installHandlerDuringPrepareSession = z;
    }

    public static FirebaseCrashlyticsNdk create(Context context, boolean z) {
        FirebaseCrashlyticsNdk firebaseCrashlyticsNdk = new FirebaseCrashlyticsNdk(new CrashpadController(context, new JniNativeApi(context), new FileStore(context)), z);
        instance = firebaseCrashlyticsNdk;
        return firebaseCrashlyticsNdk;
    }

    public static FirebaseCrashlyticsNdk getInstance() {
        FirebaseCrashlyticsNdk firebaseCrashlyticsNdk = instance;
        if (firebaseCrashlyticsNdk != null) {
            return firebaseCrashlyticsNdk;
        }
        throw new NullPointerException("FirebaseCrashlyticsNdk component is not present.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareNativeSession$0(String str, String str2, long j, StaticSessionData staticSessionData) {
        Logger.getLogger().m75275d("Initializing native session: " + str);
        if (this.controller.initialize(str, str2, j, staticSessionData)) {
            return;
        }
        Logger.getLogger().m75283w("Failed to initialize Crashlytics NDK for session " + str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public NativeSessionFileProvider getSessionFileProvider(String str) {
        return new SessionFilesProvider(this.controller.getFilesForSession(str));
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
        String str = this.currentSessionId;
        return str != null && hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(String str) {
        return this.controller.hasCrashDataForSession(str);
    }

    public synchronized void installSignalHandler() {
        SignalHandlerInstaller signalHandlerInstaller = this.signalHandlerInstaller;
        if (signalHandlerInstaller != null) {
            signalHandlerInstaller.installHandler();
            return;
        }
        if (this.installHandlerDuringPrepareSession) {
            Logger.getLogger().m75283w("Native signal handler already installed; skipping re-install.");
        } else {
            Logger.getLogger().m75275d("Deferring signal handler installation until the FirebaseCrashlyticsNdk session has been prepared");
            this.installHandlerDuringPrepareSession = true;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public synchronized void prepareNativeSession(final String str, final String str2, final long j, final StaticSessionData staticSessionData) throws Throwable {
        try {
            try {
                this.currentSessionId = str;
                SignalHandlerInstaller signalHandlerInstaller = new SignalHandlerInstaller() { // from class: com.google.firebase.crashlytics.ndk.OooO0O0
                    @Override // com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk.SignalHandlerInstaller
                    public final void installHandler() {
                        this.f68046OooO00o.lambda$prepareNativeSession$0(str, str2, j, staticSessionData);
                    }
                };
                this.signalHandlerInstaller = signalHandlerInstaller;
                if (this.installHandlerDuringPrepareSession) {
                    signalHandlerInstaller.installHandler();
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
