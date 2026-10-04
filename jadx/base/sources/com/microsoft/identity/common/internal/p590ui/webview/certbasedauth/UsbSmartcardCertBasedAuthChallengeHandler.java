package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import android.webkit.ClientCertRequest;
import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.OooOOO;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.C18549R;
import com.microsoft.identity.common.internal.p590ui.webview.ISendResultCallback;
import com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager;
import com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardPinDialog;
import com.microsoft.identity.common.java.opentelemetry.ICertBasedAuthTelemetryHelper;
import com.microsoft.identity.common.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class UsbSmartcardCertBasedAuthChallengeHandler extends AbstractSmartcardCertBasedAuthChallengeHandler<AbstractUsbSmartcardCertBasedAuthManager> {
    public UsbSmartcardCertBasedAuthChallengeHandler(Activity activity, AbstractUsbSmartcardCertBasedAuthManager abstractUsbSmartcardCertBasedAuthManager, IDialogHolder iDialogHolder, ICertBasedAuthTelemetryHelper iCertBasedAuthTelemetryHelper) {
        super(activity, abstractUsbSmartcardCertBasedAuthManager, iDialogHolder, iCertBasedAuthTelemetryHelper, "UsbSmartcardCertBasedAuthChallengeHandler");
        ((AbstractUsbSmartcardCertBasedAuthManager) this.mCbaManager).setConnectionCallback(new IConnectionCallback() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.UsbSmartcardCertBasedAuthChallengeHandler.1
            @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.IConnectionCallback
            public void onCreateConnection() {
                UsbSmartcardCertBasedAuthChallengeHandler.this.mDialogHolder.dismissDialog();
            }
        });
        ((AbstractUsbSmartcardCertBasedAuthManager) this.mCbaManager).setDisconnectionCallback(new IDisconnectionCallback() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.UsbSmartcardCertBasedAuthChallengeHandler.2
            @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.IDisconnectionCallback
            public void onClosedConnection() {
                if (UsbSmartcardCertBasedAuthChallengeHandler.this.mDialogHolder.isDialogShowing()) {
                    UsbSmartcardCertBasedAuthChallengeHandler.this.mDialogHolder.onUnexpectedUnplug();
                    if (UsbSmartcardCertBasedAuthChallengeHandler.this.mDialogHolder.isSmartcardRemovalPromptDialogShowing()) {
                        return;
                    }
                    UsbSmartcardCertBasedAuthChallengeHandler.this.mDialogHolder.showErrorDialog(C18549R.string.smartcard_early_unplug_dialog_title, C18549R.string.smartcard_early_unplug_dialog_message);
                    Logger.verbose(UsbSmartcardCertBasedAuthChallengeHandler.this.TAG, "Smartcard was disconnected while dialog was still displayed.");
                }
            }
        });
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthChallengeHandler
    public void clearAllManagerCallbacks() {
        ((AbstractUsbSmartcardCertBasedAuthManager) this.mCbaManager).clearConnectionCallback();
        ((AbstractUsbSmartcardCertBasedAuthManager) this.mCbaManager).clearDisconnectionCallback();
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthChallengeHandler
    public SmartcardPinDialog.PositiveButtonListener getSmartcardPinDialogPositiveButtonListener(final ICertDetails iCertDetails, final ClientCertRequest clientCertRequest) {
        final String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), this.TAG, ":getSmartcardPinDialogPositiveButtonListener");
        return new SmartcardPinDialog.PositiveButtonListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.UsbSmartcardCertBasedAuthChallengeHandler.3
            @Override // com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardPinDialog.PositiveButtonListener
            public void onClick(final char[] cArr) {
                ((AbstractUsbSmartcardCertBasedAuthManager) UsbSmartcardCertBasedAuthChallengeHandler.this.mCbaManager).requestDeviceSession(new AbstractSmartcardCertBasedAuthManager.ISessionCallback() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.UsbSmartcardCertBasedAuthChallengeHandler.3.1
                    @Override // com.microsoft.identity.common.internal.ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager.ISessionCallback
                    public void onException(Exception exc) {
                        C186553 c186553 = C186553.this;
                        UsbSmartcardCertBasedAuthChallengeHandler.this.indicateGeneralException(strOooO0OO, exc);
                        UsbSmartcardCertBasedAuthChallengeHandler.this.clearAllManagerCallbacks();
                        clientCertRequest.cancel();
                        UsbSmartcardCertBasedAuthChallengeHandler.this.clearPin(cArr);
                    }

                    @Override // com.microsoft.identity.common.internal.ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager.ISessionCallback
                    public void onGetSession(ISmartcardSession iSmartcardSession) throws Exception {
                        C186553 c186553 = C186553.this;
                        UsbSmartcardCertBasedAuthChallengeHandler.this.tryUsingSmartcardWithPin(cArr, iCertDetails, clientCertRequest, iSmartcardSession);
                        UsbSmartcardCertBasedAuthChallengeHandler.this.clearPin(cArr);
                    }
                });
            }
        };
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthChallengeHandler
    public void indicateDisconnectionError(String str) {
        String strOooO0O0 = OooOOO.OooO0O0(new StringBuilder(), this.TAG, C18241k5.f55433h, str);
        this.mDialogHolder.showErrorDialog(C18549R.string.smartcard_early_unplug_dialog_title, C18549R.string.smartcard_early_unplug_dialog_message);
        Logger.verbose(strOooO0O0, "Smartcard was disconnected while dialog was still displayed.");
        ((AbstractUsbSmartcardCertBasedAuthManager) this.mCbaManager).clearDisconnectionCallback();
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthChallengeHandler
    public void prepForNextUserInteraction(IDisconnectionCallback iDisconnectionCallback) {
        iDisconnectionCallback.onClosedConnection();
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthChallengeHandler
    public void promptSmartcardRemovalForResult(final ISendResultCallback iSendResultCallback) {
        if (!((AbstractUsbSmartcardCertBasedAuthManager) this.mCbaManager).isDeviceConnected() || ((AbstractUsbSmartcardCertBasedAuthManager) this.mCbaManager).isUsbDeviceInitiallyPluggedIn()) {
            iSendResultCallback.onResultReady();
        } else {
            ((AbstractUsbSmartcardCertBasedAuthManager) this.mCbaManager).setDisconnectionCallback(new IDisconnectionCallback() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.UsbSmartcardCertBasedAuthChallengeHandler.4
                @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.IDisconnectionCallback
                public void onClosedConnection() {
                    UsbSmartcardCertBasedAuthChallengeHandler.this.mDialogHolder.dismissDialog();
                    iSendResultCallback.onResultReady();
                }
            });
            this.mDialogHolder.showSmartcardRemovalPromptDialog(new IDismissCallback() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.UsbSmartcardCertBasedAuthChallengeHandler.5
                @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.IDismissCallback
                public void onDismiss() {
                    iSendResultCallback.onResultReady();
                }
            });
        }
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthChallengeHandler
    public void setPinDialogForIncorrectAttempt(ICertDetails iCertDetails, ClientCertRequest clientCertRequest) {
        this.mDialogHolder.setPinDialogErrorMode();
    }
}
