package com.microsoft.identity.common.internal.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.huawei.hms.network.embedded.C18361t4;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.microsoft.identity.common.adal.internal.net.DefaultConnectionService;
import com.microsoft.identity.common.internal.broker.BrokerData;
import com.microsoft.identity.common.internal.broker.IntuneMAMEnrollmentIdGateway;
import com.microsoft.identity.common.internal.broker.PackageHelper;
import com.microsoft.identity.common.internal.p590ui.webview.WebViewUtil;
import com.microsoft.identity.common.java.commands.ICommand;
import com.microsoft.identity.common.java.commands.InteractiveTokenCommand;
import com.microsoft.identity.common.java.commands.parameters.InteractiveTokenCommandParameters;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.exception.ErrorStrings;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.p591ui.BrowserDescriptor;
import com.microsoft.identity.common.java.util.IPlatformUtil;
import com.microsoft.identity.common.java.util.StringUtil;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.net.ssl.KeyManagerFactory;

/* JADX INFO: loaded from: classes9.dex */
public class AndroidPlatformUtil implements IPlatformUtil {
    private static final String TAG = "AndroidPlatformUtil";
    private final Activity mActivity;
    private final Context mContext;

    public AndroidPlatformUtil(Context context, Activity activity) {
        if (context == null) {
            throw new NullPointerException("mContext is marked non-null but is null");
        }
        this.mContext = context;
        this.mActivity = activity;
    }

    private static boolean hasTaskAffinity(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("activity is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":hasTaskAffinity");
        PackageManager packageManager = activity.getPackageManager();
        try {
            ComponentName componentName = activity.getComponentName();
            ActivityInfo activityInfo = componentName != null ? packageManager.getActivityInfo(componentName, 0) : null;
            if (activityInfo == null) {
                return false;
            }
            return activityInfo.taskAffinity != null;
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.warn(strOooO0OO, "Unable to get ActivityInfo for activity provided to start authorization.");
            return true;
        }
    }

    private boolean isValidHubRedirectURIForNAATests(String str) {
        return false;
    }

    private void optionallyReorderTasks(ICommand<?> iCommand) {
        if (iCommand == null) {
            throw new NullPointerException("command is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":optionallyReorderTasks");
        if (iCommand instanceof InteractiveTokenCommand) {
            if (this.mActivity == null) {
                throw new IllegalStateException("Activity cannot be null in an interactive session.");
            }
            if (!((InteractiveTokenCommandParameters) ((InteractiveTokenCommand) iCommand).getParameters()).getHandleNullTaskAffinity() || hasTaskAffinity(this.mActivity)) {
                return;
            }
            ActivityManager activityManager = (ActivityManager) this.mContext.getSystemService(C18361t4.f56218b);
            if (activityManager != null) {
                activityManager.moveTaskToFront(this.mActivity.getTaskId(), 0);
            } else {
                Logger.warn(strOooO0OO, "ActivityManager was null; Unable to bring task for the foreground.");
            }
        }
    }

    @Override // com.microsoft.identity.common.java.util.IPlatformUtil
    public List<BrowserDescriptor> getBrowserSafeListForBroker() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        hashSet.add("7fmduHKTdHHrlMvldlEqAIlSfii1tl35bxj1OXN5Ve8c4lU6URVu4xtSHc3BVZxS6WWJnxMDhIfQN0N0K2NDJg==");
        arrayList.add(new BrowserDescriptor(MsalUtils.CHROME_PACKAGE, hashSet, (String) null, (String) null));
        return arrayList;
    }

    @Override // com.microsoft.identity.common.java.util.IPlatformUtil
    public String getEnrollmentId(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("userId is marked non-null but is null");
        }
        if (str2 != null) {
            return IntuneMAMEnrollmentIdGateway.getInstance().getEnrollmentId(this.mContext, str, str2);
        }
        throw new NullPointerException("packageName is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.util.IPlatformUtil
    public String getInstalledCompanyPortalVersion() {
        try {
            return this.mContext.getPackageManager().getPackageInfo(AuthenticationConstants.Broker.COMPANY_PORTAL_APP_PACKAGE_NAME, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // com.microsoft.identity.common.java.util.IPlatformUtil
    public long getNanosecondTime() {
        return SystemClock.elapsedRealtimeNanos();
    }

    @Override // com.microsoft.identity.common.java.util.IPlatformUtil
    public String getPackageNameFromUid(int i) {
        return this.mContext.getPackageManager().getNameForUid(i);
    }

    @Override // com.microsoft.identity.common.java.util.IPlatformUtil
    public KeyManagerFactory getSslContextKeyManagerFactory() throws NoSuchAlgorithmException {
        return KeyManagerFactory.getInstance("X509");
    }

    @Override // com.microsoft.identity.common.java.util.IPlatformUtil
    public boolean isValidCallingApp(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("redirectUri is marked non-null but is null");
        }
        if (str2 == null) {
            throw new NullPointerException("packageName is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":isValidCallingApp");
        if (isValidHubRedirectURIForNAATests(str)) {
            Logger.warn(strOooO0OO, "Bypassing RedirectUri Check. This should not be enabled in PROD. ".concat(str));
            return true;
        }
        String brokerRedirectUri = PackageHelper.getBrokerRedirectUri(this.mContext, str2);
        boolean zEqualsIgnoreCase = StringUtil.equalsIgnoreCase(str, brokerRedirectUri);
        if (str2.equals(AuthenticationConstants.Broker.AZURE_AUTHENTICATOR_APP_PACKAGE_NAME)) {
            String sha512SignatureForPackage = new PackageHelper(this.mContext.getPackageManager()).getSha512SignatureForPackage(str2);
            if (BrokerData.getProdMicrosoftAuthenticator().getSigningCertificateThumbprint().equals(sha512SignatureForPackage) || BrokerData.getDebugMicrosoftAuthenticator().getSigningCertificateThumbprint().equals(sha512SignatureForPackage)) {
                zEqualsIgnoreCase |= StringUtil.equalsIgnoreCase(str, "urn:ietf:wg:oauth:2.0:oob");
            }
        }
        if (!zEqualsIgnoreCase) {
            com.microsoft.identity.common.logging.Logger.error(strOooO0OO, C22237OooO0o0.OooO00o("Broker redirect uri is invalid. Expected: ", brokerRedirectUri, " Actual: ", str), null);
        }
        return zEqualsIgnoreCase;
    }

    @Override // com.microsoft.identity.common.java.util.IPlatformUtil
    public void onReturnCommandResult(ICommand<?> iCommand) {
        if (iCommand == null) {
            throw new NullPointerException("command is marked non-null but is null");
        }
        optionallyReorderTasks(iCommand);
    }

    @Override // com.microsoft.identity.common.java.util.IPlatformUtil
    public void postCommandResult(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable is marked non-null but is null");
        }
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    @Override // com.microsoft.identity.common.java.util.IPlatformUtil
    public void removeCookiesFromWebView() {
        WebViewUtil.removeCookiesFromWebView(this.mContext);
    }

    @Override // com.microsoft.identity.common.java.util.IPlatformUtil
    public void throwIfNetworkNotAvailable(boolean z) throws ClientException {
        DefaultConnectionService defaultConnectionService = new DefaultConnectionService(this.mContext);
        if (z && defaultConnectionService.isNetworkDisabledFromOptimizations()) {
            throw new ClientException(ErrorStrings.NO_NETWORK_CONNECTION_POWER_OPTIMIZATION, "Connection is not available to refresh token because power optimization is enabled. And the device is in doze mode or the app is standby");
        }
        if (!defaultConnectionService.isConnectionAvailable()) {
            throw new ClientException("device_network_not_available", "Connection is not available to refresh token");
        }
    }
}
