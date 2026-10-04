package com.microsoft.identity.common.internal.broker;

import OooO0oO.C20439OooO0oo;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActivityC21485OooO0oo;
import com.microsoft.identity.common.PropertyBagUtil;
import com.microsoft.identity.common.internal.logging.Logger;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.util.StringUtil;
import com.microsoft.identity.common.java.util.ported.LocalBroadcaster;
import com.microsoft.identity.common.java.util.ported.PropertyBag;

/* JADX INFO: loaded from: classes9.dex */
public final class InstallCertActivityLauncher extends ActivityC21485OooO0oo {
    private static final String CERT_INSTALLATION_FAILED_WITH_EMPTY_RESPONSE = "Certificate installation failed with an empty response";
    private static final String INSTALL_CERT_BROADCAST_ALIAS = "install_cert_broadcast_alias";
    private static final String INSTALL_CERT_INTENT = "install_cert_intent";
    private static final String INSTALL_CERT_INTENT_STARTED = "broker_intent_started";
    private static final String TAG = "InstallCertActivityLauncher";
    final OooO0o.OooO0O0<Intent> installCertActivityResultLauncher;
    private Intent mInstallCertificateIntent;
    private Boolean mInstallCertificateIntentStarted;
    private Boolean mInstallCertificateResultReceived;

    public InstallCertActivityLauncher() {
        Boolean bool = Boolean.FALSE;
        this.mInstallCertificateIntentStarted = bool;
        this.mInstallCertificateResultReceived = bool;
        this.installCertActivityResultLauncher = registerForActivityResult(new C20439OooO0oo(), new OooO0o.OooO00o() { // from class: com.microsoft.identity.common.internal.broker.OooO0O0
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                this.f69001OooOo0o.lambda$new$0((ActivityResult) obj);
            }
        });
    }

    public static void installCertificate(Activity activity, Intent intent, IInstallCertCallback iInstallCertCallback, String str, String str2) {
        Intent intent2 = new Intent(activity, (Class<?>) InstallCertActivityLauncher.class);
        intent2.putExtra(INSTALL_CERT_INTENT, intent);
        registerCallbackAndParseResult(iInstallCertCallback, str, str2);
        activity.startActivity(intent2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$0(ActivityResult activityResult) {
        PropertyBag propertyBag;
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, "#installCertActivityResultLauncher");
        Logger.info(strOooO0OO, "Result received from Broker, Result code: " + activityResult.f62240OooOo0o);
        Intent intent = activityResult.f62239OooOo;
        if (intent == null || intent.getExtras() == null) {
            Logger.error(strOooO0OO, CERT_INSTALLATION_FAILED_WITH_EMPTY_RESPONSE, null);
            propertyBag = new PropertyBag();
        } else {
            propertyBag = PropertyBagUtil.fromBundle(intent.getExtras());
        }
        this.mInstallCertificateResultReceived = Boolean.TRUE;
        LocalBroadcaster.INSTANCE.broadcast(INSTALL_CERT_BROADCAST_ALIAS, propertyBag);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerCallbackAndParseResult$1(String str, String str2, IInstallCertCallback iInstallCertCallback, PropertyBag propertyBag) {
        String str3 = (String) propertyBag.get(str);
        String str4 = (String) propertyBag.get(str2);
        if (!StringUtil.isNullOrEmpty(str4) || StringUtil.isNullOrEmpty(str3)) {
            if (StringUtil.isNullOrEmpty(str4)) {
                str4 = CERT_INSTALLATION_FAILED_WITH_EMPTY_RESPONSE;
            }
            iInstallCertCallback.onError(new ClientException("unknown_error", str4));
        } else {
            iInstallCertCallback.onSuccess(Boolean.parseBoolean(str3));
        }
        LocalBroadcaster.INSTANCE.unregisterCallback(INSTALL_CERT_BROADCAST_ALIAS);
    }

    private static void registerCallbackAndParseResult(final IInstallCertCallback iInstallCertCallback, final String str, final String str2) {
        LocalBroadcaster.INSTANCE.registerCallback(INSTALL_CERT_BROADCAST_ALIAS, new LocalBroadcaster.IReceiverCallback() { // from class: com.microsoft.identity.common.internal.broker.OooO00o
            @Override // com.microsoft.identity.common.java.util.ported.LocalBroadcaster.IReceiverCallback
            public final void onReceive(PropertyBag propertyBag) {
                InstallCertActivityLauncher.lambda$registerCallbackAndParseResult$1(str, str2, iInstallCertCallback, propertyBag);
            }
        });
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":onCreate");
        if (bundle != null) {
            this.mInstallCertificateIntent = (Intent) bundle.getParcelable(INSTALL_CERT_INTENT);
            this.mInstallCertificateIntentStarted = Boolean.valueOf(bundle.getBoolean(INSTALL_CERT_INTENT_STARTED));
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.mInstallCertificateIntent = (Intent) extras.getParcelable(INSTALL_CERT_INTENT);
        } else {
            Logger.warn(strOooO0OO, "Extras is null.");
        }
    }

    @Override // androidx.appcompat.app.ActivityC21485OooO0oo, androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public void onDestroy() {
        if (!this.mInstallCertificateResultReceived.booleanValue()) {
            Logger.error(TAG, "The activity is killed unexpectedly.", null);
            LocalBroadcaster.INSTANCE.broadcast(INSTALL_CERT_BROADCAST_ALIAS, new PropertyBag());
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.mInstallCertificateIntentStarted.booleanValue()) {
            return;
        }
        this.mInstallCertificateIntentStarted = Boolean.TRUE;
        this.installCertActivityResultLauncher.OooO00o(this.mInstallCertificateIntent);
    }

    @Override // OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(INSTALL_CERT_INTENT, this.mInstallCertificateIntent);
        bundle.putBoolean(INSTALL_CERT_INTENT_STARTED, this.mInstallCertificateIntentStarted.booleanValue());
    }
}
