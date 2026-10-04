package com.microsoft.identity.common.internal.p590ui.browser;

import OooOOo0.BinderC20465OooO0OO;
import OooOOo0.C20464OooO0O0;
import OooOOo0.C20466OooO0Oo;
import OooOOo0.C20467OooO0o0;
import OooOOo0.C20468OooO0oO;
import OooOOo0.OooO0o;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.concurrent.futures.OooO00o;
import androidx.core.app.BundleCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.logging.Logger;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public class CustomTabsManager {
    private static final long CUSTOM_TABS_MAX_CONNECTION_TIMEOUT = 1;
    private static final String TAG = "CustomTabsManager";
    private final WeakReference<Context> mContextRef;
    private C20467OooO0o0 mCustomTabsIntent;
    private boolean mCustomTabsServiceIsBound;
    private OooO0o mCustomTabsServiceConnection = new OooO0o() { // from class: com.microsoft.identity.common.internal.ui.browser.CustomTabsManager.1
        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            String str = CustomTabsManager.TAG + ":onBindingDied";
            StringBuilder sb = new StringBuilder("Binding died callback on custom tabs service, there will likely be failures.  Component class that failed: ");
            sb.append(componentName == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : componentName.getClassName());
            Logger.warn(str, sb.toString());
            super.onBindingDied(componentName);
        }

        @Override // OooOOo0.OooO0o
        public void onCustomTabsServiceConnected(ComponentName componentName, C20466OooO0Oo c20466OooO0Oo) {
            Logger.info(CustomTabsManager.TAG + ":onCustomTabsServiceConnection", "CustomTabsService is connected");
            c20466OooO0Oo.getClass();
            try {
                c20466OooO0Oo.f58438OooO00o.OooOO0();
            } catch (RemoteException unused) {
            }
            CustomTabsManager.this.mCustomTabsServiceIsBound = true;
            CustomTabsManager.this.mCustomTabsClient.set(c20466OooO0Oo);
            CustomTabsManager.this.mClientLatch.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            String str = CustomTabsManager.TAG + ":onNullBinding";
            StringBuilder sb = new StringBuilder("Null binding callback on custom tabs service, there will likely be failures. Component class that failed: ");
            sb.append(componentName == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : componentName.getClassName());
            Logger.warn(str, sb.toString());
            super.onNullBinding(componentName);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Logger.info(CustomTabsManager.TAG + ":onServiceDisconnected", "CustomTabsService is disconnected");
            CustomTabsManager.this.mCustomTabsServiceIsBound = false;
            CustomTabsManager.this.mCustomTabsClient.set(null);
            CustomTabsManager.this.mClientLatch.countDown();
        }
    };
    private final AtomicReference<C20466OooO0Oo> mCustomTabsClient = new AtomicReference<>();
    private final CountDownLatch mClientLatch = new CountDownLatch(1);

    public CustomTabsManager(Context context) {
        this.mContextRef = new WeakReference<>(context);
    }

    private C20468OooO0oO createSession(C20464OooO0O0 c20464OooO0O0) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":createSession");
        C20466OooO0Oo client = getClient();
        if (client == null) {
            Logger.warn(strOooO0OO, "Failed to create custom tabs session with null CustomTabClient.");
            return null;
        }
        C20468OooO0oO c20468OooO0oOOooO00o = client.OooO00o();
        if (c20468OooO0oOOooO00o == null) {
            Logger.warn(strOooO0OO, "Failed to create custom tabs session through custom tabs client.");
        }
        return c20468OooO0oOOooO00o;
    }

    public synchronized boolean bind(Context context, String str) {
        String str2 = TAG + ":bind";
        if (context != null) {
            OooO0o oooO0o = this.mCustomTabsServiceConnection;
            oooO0o.setApplicationContext(context.getApplicationContext());
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(str)) {
                intent.setPackage(str);
            }
            if (context.bindService(intent, oooO0o, 33)) {
                C20468OooO0oO c20468OooO0oOCreateSession = createSession(null);
                Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                if (c20468OooO0oOCreateSession != null) {
                    intent2.setPackage(c20468OooO0oOCreateSession.f58446OooO0OO.getPackageName());
                    BinderC20465OooO0OO binderC20465OooO0OO = c20468OooO0oOCreateSession.f58445OooO0O0;
                    Bundle bundle = new Bundle();
                    BundleCompat.putBinder(bundle, "android.support.customtabs.extra.SESSION", binderC20465OooO0OO);
                    intent2.putExtras(bundle);
                }
                intent2.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                if (!intent2.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle2 = new Bundle();
                    BundleCompat.putBinder(bundle2, "android.support.customtabs.extra.SESSION", null);
                    intent2.putExtras(bundle2);
                }
                intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                intent2.putExtras(new Bundle());
                intent2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                C20467OooO0o0 c20467OooO0o0 = new C20467OooO0o0(intent2);
                this.mCustomTabsIntent = c20467OooO0o0;
                c20467OooO0o0.f58440OooO00o.setPackage(str);
                return true;
            }
        }
        Logger.info(str2, "Unable to bind custom tabs service ".concat(context == null ? "because the context was null" : "because the bind call failed"));
        this.mClientLatch.countDown();
        return false;
    }

    public C20466OooO0Oo getClient() {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getClient");
        try {
            this.mClientLatch.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Logger.info(strOooO0OO, "Interrupted while waiting for browser connection");
            this.mClientLatch.countDown();
        }
        return this.mCustomTabsClient.get();
    }

    public C20467OooO0o0 getCustomTabsIntent() {
        return this.mCustomTabsIntent;
    }

    public synchronized void unbind() {
        String str = TAG + ":unbind";
        Context context = this.mContextRef.get();
        if (context == null || !this.mCustomTabsServiceIsBound) {
            this.mCustomTabsServiceIsBound = false;
            this.mCustomTabsClient.set(null);
            Logger.info(str, "CustomTabsService is unbound.");
        } else {
            try {
                context.unbindService(this.mCustomTabsServiceConnection);
            } catch (Exception e) {
                Logger.warn(str, "Error unbinding custom tabs service, likely failed to bind or previously died: " + e.getMessage());
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
            }
            this.mCustomTabsServiceIsBound = false;
            this.mCustomTabsClient.set(null);
            Logger.info(str, "CustomTabsService is unbound.");
        }
    }
}
