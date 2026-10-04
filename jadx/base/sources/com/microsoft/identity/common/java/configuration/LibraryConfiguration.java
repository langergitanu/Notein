package com.microsoft.identity.common.java.configuration;

import androidx.appcompat.app.OooOOO;
import com.microsoft.identity.common.java.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class LibraryConfiguration {
    private static final String TAG = "LibraryConfiguration";
    private static LibraryConfiguration sInstance;
    private boolean authorizationInCurrentTask;
    private boolean refreshInEnabled;

    public static class LibraryConfigurationBuilder {
        private boolean authorizationInCurrentTask;
        private boolean refreshInEnabled;

        public LibraryConfigurationBuilder authorizationInCurrentTask(boolean z) {
            this.authorizationInCurrentTask = z;
            return this;
        }

        public LibraryConfiguration build() {
            return new LibraryConfiguration(this.authorizationInCurrentTask, this.refreshInEnabled);
        }

        public LibraryConfigurationBuilder refreshInEnabled(boolean z) {
            this.refreshInEnabled = z;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LibraryConfiguration.LibraryConfigurationBuilder(authorizationInCurrentTask=");
            sb.append(this.authorizationInCurrentTask);
            sb.append(", refreshInEnabled=");
            return OooOOO.OooO00o(sb, ")", this.refreshInEnabled);
        }
    }

    public LibraryConfiguration(boolean z, boolean z2) {
        this.authorizationInCurrentTask = z;
        this.refreshInEnabled = z2;
    }

    public static LibraryConfigurationBuilder builder() {
        return new LibraryConfigurationBuilder();
    }

    private static synchronized LibraryConfiguration createDefaultInstance() {
        return builder().authorizationInCurrentTask(false).refreshInEnabled(false).build();
    }

    public static synchronized LibraryConfiguration getInstance() {
        try {
            if (sInstance == null) {
                sInstance = createDefaultInstance();
            }
        } catch (Throwable th) {
            throw th;
        }
        return sInstance;
    }

    public static synchronized void intializeLibraryConfiguration(LibraryConfiguration libraryConfiguration) {
        try {
            if (libraryConfiguration == null) {
                throw new NullPointerException("config is marked non-null but is null");
            }
            if (sInstance == null) {
                sInstance = libraryConfiguration;
            } else {
                Logger.warn(TAG, "MsalConfiguration was already initialized");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof LibraryConfiguration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LibraryConfiguration)) {
            return false;
        }
        LibraryConfiguration libraryConfiguration = (LibraryConfiguration) obj;
        return libraryConfiguration.canEqual(this) && isAuthorizationInCurrentTask() == libraryConfiguration.isAuthorizationInCurrentTask() && isRefreshInEnabled() == libraryConfiguration.isRefreshInEnabled();
    }

    public int hashCode() {
        return (((isAuthorizationInCurrentTask() ? 79 : 97) + 59) * 59) + (isRefreshInEnabled() ? 79 : 97);
    }

    public boolean isAuthorizationInCurrentTask() {
        return this.authorizationInCurrentTask;
    }

    public boolean isRefreshInEnabled() {
        return this.refreshInEnabled;
    }
}
