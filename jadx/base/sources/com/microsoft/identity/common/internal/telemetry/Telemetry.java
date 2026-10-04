package com.microsoft.identity.common.internal.telemetry;

import android.content.Context;
import android.content.pm.PackageManager;
import com.microsoft.identity.common.java.telemetry.Telemetry;
import com.microsoft.identity.common.java.telemetry.observers.ITelemetryObserver;
import com.microsoft.identity.common.logging.Logger;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class Telemetry extends com.microsoft.identity.common.java.telemetry.Telemetry {
    private static final String TAG = "Telemetry";
    private static final Telemetry instance = new Telemetry();
    private static final com.microsoft.identity.common.java.telemetry.Telemetry actualInstance = com.microsoft.identity.common.java.telemetry.Telemetry.getInstance();

    public static class Builder {
        private com.microsoft.identity.common.java.telemetry.TelemetryConfiguration mDefaultConfiguration;
        private Boolean mIsDebugging;
        private AndroidTelemetryContext mTelemetryContext;

        public Telemetry build() throws IllegalArgumentException {
            new Telemetry.Builder().defaultConfiguration(this.mDefaultConfiguration).isDebugging(this.mIsDebugging.booleanValue()).withTelemetryContext(this.mTelemetryContext).build();
            return Telemetry.instance;
        }

        public Builder defaultConfiguration(TelemetryConfiguration telemetryConfiguration) {
            this.mDefaultConfiguration = telemetryConfiguration;
            return this;
        }

        public Builder withContext(Context context) {
            String str = Telemetry.TAG + ":withContext";
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                throw new IllegalArgumentException("Application context must not be null.");
            }
            this.mTelemetryContext = new AndroidTelemetryContext(applicationContext);
            try {
                this.mIsDebugging = Boolean.valueOf((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0);
                return this;
            } catch (PackageManager.NameNotFoundException unused) {
                Logger.warn(str, "The application is not found from PackageManager.");
                this.mIsDebugging = Boolean.FALSE;
                return this;
            }
        }
    }

    public static synchronized Telemetry getInstance() {
        return instance;
    }

    @Override // com.microsoft.identity.common.java.telemetry.Telemetry
    public void addObserver(ITelemetryObserver iTelemetryObserver) {
        actualInstance.addObserver(iTelemetryObserver);
    }

    @Override // com.microsoft.identity.common.java.telemetry.Telemetry
    public void flush() {
        actualInstance.flush();
    }

    @Override // com.microsoft.identity.common.java.telemetry.Telemetry
    public List<ITelemetryObserver> getObservers() {
        return actualInstance.getObservers();
    }

    @Override // com.microsoft.identity.common.java.telemetry.Telemetry
    public void removeAllObservers() {
        actualInstance.removeAllObservers();
    }

    @Override // com.microsoft.identity.common.java.telemetry.Telemetry
    public void removeObserver(Class<?> cls) {
        actualInstance.removeObserver(cls);
    }

    @Override // com.microsoft.identity.common.java.telemetry.Telemetry
    public void flush(String str) {
        if (str == null) {
            throw new NullPointerException("correlationId is marked non-null but is null");
        }
        actualInstance.flush(str);
    }

    @Override // com.microsoft.identity.common.java.telemetry.Telemetry
    public void removeObserver(ITelemetryObserver iTelemetryObserver) {
        actualInstance.removeObserver(iTelemetryObserver);
    }
}
