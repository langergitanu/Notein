package com.google.firebase.inappmessaging.internal.injection.modules;

import com.aspose.slides.C22231OoooOO0;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.firebase.inappmessaging.internal.injection.modules.TransportClientModule;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
@Module
public class TransportClientModule {
    private static final String TRANSPORT_NAME = "FIREBASE_INAPPMESSAGING";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$providesMetricsLoggerClient$0(byte[] bArr) {
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$providesMetricsLoggerClient$1(Transport transport, byte[] bArr) {
        transport.send(Event.ofData(bArr));
    }

    @Provides
    public static MetricsLoggerClient providesMetricsLoggerClient(FirebaseApp firebaseApp, TransportFactory transportFactory, AnalyticsConnector analyticsConnector, FirebaseInstallationsApi firebaseInstallationsApi, Clock clock, DeveloperListenerManager developerListenerManager, Executor executor) {
        final Transport transport = transportFactory.getTransport(TRANSPORT_NAME, byte[].class, new C22231OoooOO0());
        return new MetricsLoggerClient(new MetricsLoggerClient.EngagementMetricsLoggerInterface() { // from class: o00ooooO.OooO00o
            @Override // com.google.firebase.inappmessaging.internal.MetricsLoggerClient.EngagementMetricsLoggerInterface
            public final void logEvent(byte[] bArr) {
                TransportClientModule.lambda$providesMetricsLoggerClient$1(transport, bArr);
            }
        }, analyticsConnector, firebaseApp, firebaseInstallationsApi, clock, developerListenerManager, executor);
    }
}
