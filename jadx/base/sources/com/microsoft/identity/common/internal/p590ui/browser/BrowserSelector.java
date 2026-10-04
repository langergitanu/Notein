package com.microsoft.identity.common.internal.p590ui.browser;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.concurrent.futures.OooO00o;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.internal.broker.PackageHelper;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.exception.ErrorStrings;
import com.microsoft.identity.common.java.p591ui.BrowserDescriptor;
import com.microsoft.identity.common.java.util.BrokerProtocolVersionUtil;
import com.microsoft.identity.common.java.util.StringUtil;
import com.microsoft.identity.common.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class BrowserSelector {
    private static final String LOGGING_MSG_BROWSER = "Browser: ";
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private static final String TAG = "BrowserSelector";

    public static List<Browser> getBrowsers(Context context, BrowserDescriptor browserDescriptor) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getBrowsers");
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("http://www.example.com"));
        if (browserDescriptor != null) {
            Logger.info(strOooO0OO, "Querying preferred browser: " + browserDescriptor.getPackageName());
            intent.setPackage(browserDescriptor.getPackageName());
        }
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65600);
        Logger.verbose(strOooO0OO, "Querying browsers. Got back " + listQueryIntentActivities.size() + " browsers.");
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            if (isFullBrowser(resolveInfo)) {
                try {
                    PackageInfo packageInfo = PackageHelper.getPackageInfo(packageManager, resolveInfo.activityInfo.packageName);
                    if (isCustomTabsServiceSupported(context, packageInfo)) {
                        Logger.verbose(strOooO0OO, LOGGING_MSG_BROWSER + resolveInfo.activityInfo.packageName + " supports custom tab.");
                        arrayList.add(new Browser(packageInfo, Boolean.TRUE));
                    } else {
                        Logger.verbose(strOooO0OO, LOGGING_MSG_BROWSER + resolveInfo.activityInfo.packageName + " does NOT support custom tab.");
                        arrayList.add(new Browser(packageInfo, Boolean.FALSE));
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Logger.warn(strOooO0OO, LOGGING_MSG_BROWSER + resolveInfo.activityInfo.packageName + " cannot be generated without the package info.");
                }
            } else {
                Logger.verbose(strOooO0OO, LOGGING_MSG_BROWSER + resolveInfo.activityInfo.packageName + " is not a full browser app.");
            }
        }
        Logger.verbose(strOooO0OO, null, "Found " + arrayList.size() + " browsers.");
        return arrayList;
    }

    private static Browser getDefaultBrowser(Context context, List<BrowserDescriptor> list) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getDefaultBrowser");
        for (Browser browser : getBrowsers(context, null)) {
            Iterator<BrowserDescriptor> it = list.iterator();
            while (it.hasNext()) {
                if (matches(it.next(), browser)) {
                    Logger.info(strOooO0OO, "Browser's package name: " + browser.getPackageName() + " version: " + browser.getVersion());
                    return browser;
                }
            }
        }
        return null;
    }

    private static Browser getPreferredBrowser(Context context, BrowserDescriptor browserDescriptor) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getPreferredBrowser");
        for (Browser browser : getBrowsers(context, browserDescriptor)) {
            if (matches(browserDescriptor, browser)) {
                Logger.info(strOooO0OO, "Preferred Browser's package name: " + browser.getPackageName() + " version: " + browser.getVersion());
                return browser;
            }
        }
        return null;
    }

    private static boolean isCustomTabsServiceSupported(Context context, PackageInfo packageInfo) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        intent.setPackage(packageInfo.packageName);
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        return (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) ? false : true;
    }

    private static boolean isFullBrowser(ResolveInfo resolveInfo) {
        if (!resolveInfo.filter.hasAction(CommonConstant.ACTION.HWID_SCHEME_URL) || !resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") || resolveInfo.filter.schemesIterator() == null || resolveInfo.filter.authoritiesIterator() != null) {
            return false;
        }
        Iterator<String> itSchemesIterator = resolveInfo.filter.schemesIterator();
        boolean zEquals = false;
        boolean zEquals2 = false;
        while (itSchemesIterator.hasNext()) {
            String next = itSchemesIterator.next();
            zEquals |= SCHEME_HTTP.equals(next);
            zEquals2 |= "https".equals(next);
            if (zEquals && zEquals2) {
                return true;
            }
        }
        return false;
    }

    private static boolean matches(BrowserDescriptor browserDescriptor, Browser browser) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":matches");
        if (!StringUtil.equalsIgnoreCase(browserDescriptor.getPackageName(), browser.getPackageName())) {
            return false;
        }
        if (!browserDescriptor.getSignatureHashes().equals(browser.getSignatureHashes())) {
            Logger.warn(strOooO0OO, LOGGING_MSG_BROWSER + browser.getPackageName() + " signature hash not match");
            return false;
        }
        if (!StringUtil.isNullOrEmpty(browserDescriptor.getVersionLowerBound()) && BrokerProtocolVersionUtil.compareSemanticVersion(browser.getVersion(), browserDescriptor.getVersionLowerBound()) == -1) {
            Logger.warn(strOooO0OO, LOGGING_MSG_BROWSER + browser.getPackageName() + " version too low (Expected: " + browserDescriptor.getVersionLowerBound() + " Get: " + browser.getVersion() + ")");
            return false;
        }
        if (StringUtil.isNullOrEmpty(browserDescriptor.getVersionUpperBound()) || BrokerProtocolVersionUtil.compareSemanticVersion(browser.getVersion(), browserDescriptor.getVersionUpperBound()) != 1) {
            return true;
        }
        Logger.warn(strOooO0OO, LOGGING_MSG_BROWSER + browser.getPackageName() + " version too high (Expected: " + browserDescriptor.getVersionUpperBound() + " Get: " + browser.getVersion() + ")");
        return false;
    }

    public static Browser select(Context context, List<BrowserDescriptor> list, BrowserDescriptor browserDescriptor) throws ClientException {
        Browser preferredBrowser;
        String str = TAG + ":select";
        Logger.verbose(str, "Select the browser to launch.");
        if (browserDescriptor != null && (preferredBrowser = getPreferredBrowser(context, browserDescriptor)) != null) {
            return preferredBrowser;
        }
        Browser defaultBrowser = getDefaultBrowser(context, list);
        if (defaultBrowser != null) {
            return defaultBrowser;
        }
        Logger.error(str, ErrorStrings.NO_AVAILABLE_BROWSER_FOUND, null);
        throw new ClientException(ErrorStrings.NO_AVAILABLE_BROWSER_FOUND, ErrorStrings.NO_AVAILABLE_BROWSER_FOUND);
    }
}
