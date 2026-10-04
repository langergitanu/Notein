package com.microsoft.identity.client;

import OooOOo0.C20466OooO0Oo;
import OooOOo0.C20467OooO0o0;
import OooOOo0.C20468OooO0oO;
import OooOOo0.OooO0o;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.concurrent.futures.OooO00o;
import androidx.core.content.ContextCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.client.exception.MsalClientException;
import com.microsoft.identity.client.internal.MsalUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class MsalChromeCustomTabManager {
    private static final long CUSTOM_TABS_MAX_CONNECTION_TIMEOUT = 1;
    private static final String TAG = "MsalChromeCustomTabManager";
    private String mChromePackageWithCustomTabSupport;
    private C20467OooO0o0 mCustomTabsIntent;
    private MsalCustomTabsServiceConnection mCustomTabsServiceConnection;
    private Activity mParentActivity;

    public static class MsalCustomTabsServiceConnection extends OooO0o {
        private C20466OooO0Oo mCustomTabsClient;
        private boolean mCustomTabsServiceIsBound;
        private C20468OooO0oO mCustomTabsSession;
        private final WeakReference<CountDownLatch> mLatchWeakReference;

        public MsalCustomTabsServiceConnection(CountDownLatch countDownLatch) {
            this.mLatchWeakReference = new WeakReference<>(countDownLatch);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void unbindCustomTabsService() {
            this.mCustomTabsClient = null;
            this.mCustomTabsServiceIsBound = false;
        }

        public boolean getCustomTabsServiceIsBound() {
            return this.mCustomTabsServiceIsBound;
        }

        public C20468OooO0oO getCustomTabsSession() {
            return this.mCustomTabsSession;
        }

        @Override // OooOOo0.OooO0o
        public void onCustomTabsServiceConnected(ComponentName componentName, C20466OooO0Oo c20466OooO0Oo) {
            CountDownLatch countDownLatch = this.mLatchWeakReference.get();
            this.mCustomTabsServiceIsBound = true;
            this.mCustomTabsClient = c20466OooO0Oo;
            c20466OooO0Oo.getClass();
            try {
                c20466OooO0Oo.f58438OooO00o.OooOO0();
            } catch (RemoteException unused) {
            }
            this.mCustomTabsSession = this.mCustomTabsClient.OooO00o();
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            unbindCustomTabsService();
        }
    }

    public MsalChromeCustomTabManager(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity parameter cannot be null");
        }
        this.mParentActivity = activity;
        this.mChromePackageWithCustomTabSupport = MsalUtils.getChromePackageWithCustomTabSupport(activity.getApplicationContext());
    }

    private boolean waitForServiceConnectionToEstablish(CountDownLatch countDownLatch) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":waitForServiceConnectionToEstablish");
        try {
            if (countDownLatch.await(1L, TimeUnit.SECONDS)) {
                return true;
            }
            com.microsoft.identity.common.logging.Logger.warn(strOooO0OO, "Connection to CustomTabs timed out. Skipping warmup.");
            return false;
        } catch (InterruptedException e) {
            com.microsoft.identity.common.logging.Logger.error(strOooO0OO, "Failed to connect to CustomTabs. Skipping warmup.", e);
            return false;
        }
    }

    public synchronized void bindCustomTabsService() {
        try {
            if (this.mChromePackageWithCustomTabSupport != null) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                MsalCustomTabsServiceConnection msalCustomTabsServiceConnection = new MsalCustomTabsServiceConnection(countDownLatch);
                this.mCustomTabsServiceConnection = msalCustomTabsServiceConnection;
                Activity activity = this.mParentActivity;
                String str = this.mChromePackageWithCustomTabSupport;
                msalCustomTabsServiceConnection.setApplicationContext(activity.getApplicationContext());
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                activity.bindService(intent, msalCustomTabsServiceConnection, 33);
                C20467OooO0o0.OooO00o oooO00o = waitForServiceConnectionToEstablish(countDownLatch) ? new C20467OooO0o0.OooO00o(this.mCustomTabsServiceConnection.getCustomTabsSession()) : new C20467OooO0o0.OooO00o();
                oooO00o.f58441OooO00o.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                C20467OooO0o0 c20467OooO0o0OooO00o = oooO00o.OooO00o();
                this.mCustomTabsIntent = c20467OooO0o0OooO00o;
                c20467OooO0o0OooO00o.f58440OooO00o.setPackage(this.mChromePackageWithCustomTabSupport);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void launchChromeTabOrBrowserForUrl(String str) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":launchChromeTabOrBrowserForUrl");
        if (this.mChromePackageWithCustomTabSupport == null || this.mCustomTabsIntent == null) {
            com.microsoft.identity.common.logging.Logger.info(strOooO0OO, "Chrome tab support is not available, launching chrome browser.");
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.setPackage(MsalUtils.getChromePackage(this.mParentActivity.getApplicationContext()));
            intent.addCategory("android.intent.category.BROWSABLE");
            this.mParentActivity.startActivity(intent);
            return;
        }
        com.microsoft.identity.common.logging.Logger.info(strOooO0OO, "ChromeCustomTab support is available, launching chrome tab.");
        C20467OooO0o0 c20467OooO0o0 = this.mCustomTabsIntent;
        Activity activity = this.mParentActivity;
        Uri uri = Uri.parse(str);
        Intent intent2 = c20467OooO0o0.f58440OooO00o;
        intent2.setData(uri);
        ContextCompat.startActivity(activity, intent2, null);
    }

    public synchronized void unbindCustomTabsService() {
        MsalCustomTabsServiceConnection msalCustomTabsServiceConnection = this.mCustomTabsServiceConnection;
        if (msalCustomTabsServiceConnection != null && msalCustomTabsServiceConnection.getCustomTabsServiceIsBound()) {
            this.mParentActivity.unbindService(this.mCustomTabsServiceConnection);
            this.mCustomTabsServiceConnection.unbindCustomTabsService();
        }
    }

    public void verifyChromeTabOrBrowser() throws MsalClientException {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":verifyChromeTabOrBrowser");
        if (this.mChromePackageWithCustomTabSupport == null) {
            com.microsoft.identity.common.logging.Logger.warn(strOooO0OO, "Custom tab is not supported by Chrome.");
        } else {
            if (MsalUtils.getChromePackage(this.mParentActivity.getApplicationContext()) != null) {
                return;
            }
            com.microsoft.identity.common.logging.Logger.warn(strOooO0OO, "Chrome is not installed.");
            throw new MsalClientException("chrome_not_installed", "Chrome is not installed.");
        }
    }
}
