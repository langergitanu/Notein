package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import android.webkit.ClientCertRequest;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.C18549R;
import com.microsoft.identity.common.internal.p590ui.webview.ISendResultCallback;
import com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager;
import com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardPinDialog;
import com.microsoft.identity.common.java.opentelemetry.ICertBasedAuthTelemetryHelper;
import com.microsoft.identity.common.logging.Logger;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class NfcSmartcardCertBasedAuthChallengeHandler extends AbstractSmartcardCertBasedAuthChallengeHandler<AbstractNfcSmartcardCertBasedAuthManager> {

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.ui.webview.certbasedauth.NfcSmartcardCertBasedAuthChallengeHandler$3 */
    public class C186373 implements SmartcardPinDialog.PositiveButtonListener {
        final /* synthetic */ ICertDetails val$certDetails;
        final /* synthetic */ String val$methodTag;
        final /* synthetic */ ClientCertRequest val$request;

        /* JADX INFO: renamed from: com.microsoft.identity.common.internal.ui.webview.certbasedauth.NfcSmartcardCertBasedAuthChallengeHandler$3$2, reason: invalid class name */
        public class AnonymousClass2 implements IConnectionCallback {
            final /* synthetic */ char[] val$pin;

            public AnonymousClass2(char[] cArr) {
                this.val$pin = cArr;
            }

            @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.IConnectionCallback
            public void onCreateConnection() {
                NfcSmartcardCertBasedAuthChallengeHandler.this.mDialogHolder.showSmartcardNfcLoadingDialog();
                if (!((AbstractNfcSmartcardCertBasedAuthManager) NfcSmartcardCertBasedAuthChallengeHandler.this.mCbaManager).isDeviceChanged()) {
                    ((AbstractNfcSmartcardCertBasedAuthManager) NfcSmartcardCertBasedAuthChallengeHandler.this.mCbaManager).requestDeviceSession(new AbstractSmartcardCertBasedAuthManager.ISessionCallback() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.NfcSmartcardCertBasedAuthChallengeHandler.3.2.2
                        @Override // com.microsoft.identity.common.internal.ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager.ISessionCallback
                        public void onException(final Exception exc) {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            NfcSmartcardCertBasedAuthChallengeHandler.this.clearPin(anonymousClass2.val$pin);
                            C186373.this.val$request.cancel();
                            NfcSmartcardCertBasedAuthChallengeHandler.this.prepForNextUserInteraction(new IDisconnectionCallback() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.NfcSmartcardCertBasedAuthChallengeHandler.3.2.2.1
                                @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.IDisconnectionCallback
                                public void onClosedConnection() {
                                    C186373 c186373 = C186373.this;
                                    NfcSmartcardCertBasedAuthChallengeHandler.this.indicateGeneralException(c186373.val$methodTag, exc);
                                }
                            });
                        }

                        @Override // com.microsoft.identity.common.internal.ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager.ISessionCallback
                        public void onGetSession(ISmartcardSession iSmartcardSession) throws Exception {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            C186373 c186373 = C186373.this;
                            NfcSmartcardCertBasedAuthChallengeHandler.this.tryUsingSmartcardWithPin(anonymousClass2.val$pin, c186373.val$certDetails, c186373.val$request, iSmartcardSession);
                            AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                            NfcSmartcardCertBasedAuthChallengeHandler.this.clearPin(anonymousClass22.val$pin);
                        }
                    });
                    return;
                }
                NfcSmartcardCertBasedAuthChallengeHandler.this.clearPin(this.val$pin);
                C186373.this.val$request.cancel();
                NfcSmartcardCertBasedAuthChallengeHandler.this.prepForNextUserInteraction(new IDisconnectionCallback() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.NfcSmartcardCertBasedAuthChallengeHandler.3.2.1
                    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.IDisconnectionCallback
                    public void onClosedConnection() {
                        Logger.info(C186373.this.val$methodTag, "Device connected via NFC is different from initially connected device.");
                        NfcSmartcardCertBasedAuthChallengeHandler.this.mTelemetryHelper.setResultFailure("Device connected via NFC is different from initially connected device.");
                        NfcSmartcardCertBasedAuthChallengeHandler.this.mDialogHolder.showErrorDialog(C18549R.string.smartcard_nfc_diff_connected_title, C18549R.string.smartcard_nfc_diff_connected_message, C18549R.string.smartcard_nfc_diff_connected_positive_button);
                    }
                });
            }
        }

        public C186373(ClientCertRequest clientCertRequest, String str, ICertDetails iCertDetails) {
            this.val$request = clientCertRequest;
            this.val$methodTag = str;
            this.val$certDetails = iCertDetails;
        }

        @Override // com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardPinDialog.PositiveButtonListener
        public void onClick(char[] cArr) {
            NfcSmartcardCertBasedAuthChallengeHandler.this.mDialogHolder.showSmartcardNfcPromptDialog(new ICancelCbaCallback() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.NfcSmartcardCertBasedAuthChallengeHandler.3.1
                @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.ICancelCbaCallback
                public void onCancel() {
                    C186373 c186373 = C186373.this;
                    NfcSmartcardCertBasedAuthChallengeHandler.this.getGeneralCancelCbaCallback(c186373.val$request).onCancel();
                    NfcSmartcardCertBasedAuthChallengeHandler nfcSmartcardCertBasedAuthChallengeHandler = NfcSmartcardCertBasedAuthChallengeHandler.this;
                    ((AbstractNfcSmartcardCertBasedAuthManager) nfcSmartcardCertBasedAuthChallengeHandler.mCbaManager).stopDiscovery(nfcSmartcardCertBasedAuthChallengeHandler.mActivity);
                }
            });
            ((AbstractNfcSmartcardCertBasedAuthManager) NfcSmartcardCertBasedAuthChallengeHandler.this.mCbaManager).setConnectionCallback(new AnonymousClass2(cArr));
            NfcSmartcardCertBasedAuthChallengeHandler nfcSmartcardCertBasedAuthChallengeHandler = NfcSmartcardCertBasedAuthChallengeHandler.this;
            ((AbstractNfcSmartcardCertBasedAuthManager) nfcSmartcardCertBasedAuthChallengeHandler.mCbaManager).startDiscovery(nfcSmartcardCertBasedAuthChallengeHandler.mActivity);
        }
    }

    public NfcSmartcardCertBasedAuthChallengeHandler(Activity activity, AbstractNfcSmartcardCertBasedAuthManager abstractNfcSmartcardCertBasedAuthManager, IDialogHolder iDialogHolder, ICertBasedAuthTelemetryHelper iCertBasedAuthTelemetryHelper) {
        super(activity, abstractNfcSmartcardCertBasedAuthManager, iDialogHolder, iCertBasedAuthTelemetryHelper, "NfcSmartcardCertBasedAuthChallengeHandler");
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthChallengeHandler
    public void clearAllManagerCallbacks() {
        ((AbstractNfcSmartcardCertBasedAuthManager) this.mCbaManager).clearConnectionCallback();
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthChallengeHandler
    public SmartcardPinDialog.PositiveButtonListener getSmartcardPinDialogPositiveButtonListener(ICertDetails iCertDetails, ClientCertRequest clientCertRequest) {
        return new C186373(clientCertRequest, OooO00o.OooO0OO(new StringBuilder(), this.TAG, ":getSmartcardPinDialogPositiveButtonListener"), iCertDetails);
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthChallengeHandler
    public void indicateDisconnectionError(String str) {
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthChallengeHandler
    public void prepForNextUserInteraction(final IDisconnectionCallback iDisconnectionCallback) {
        if (!((AbstractNfcSmartcardCertBasedAuthManager) this.mCbaManager).isDeviceConnected()) {
            iDisconnectionCallback.onClosedConnection();
            return;
        }
        clearAllManagerCallbacks();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mDialogHolder.showSmartcardRemovalPromptDialog(new IDismissCallback() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.NfcSmartcardCertBasedAuthChallengeHandler.1
            @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.IDismissCallback
            public void onDismiss() {
                if (atomicBoolean.compareAndSet(false, true)) {
                    NfcSmartcardCertBasedAuthChallengeHandler nfcSmartcardCertBasedAuthChallengeHandler = NfcSmartcardCertBasedAuthChallengeHandler.this;
                    ((AbstractNfcSmartcardCertBasedAuthManager) nfcSmartcardCertBasedAuthChallengeHandler.mCbaManager).stopDiscovery(nfcSmartcardCertBasedAuthChallengeHandler.mActivity);
                    iDisconnectionCallback.onClosedConnection();
                }
            }
        });
        ((AbstractNfcSmartcardCertBasedAuthManager) this.mCbaManager).disconnect(new IDisconnectionCallback() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.NfcSmartcardCertBasedAuthChallengeHandler.2
            @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.IDisconnectionCallback
            public void onClosedConnection() {
                if (atomicBoolean.compareAndSet(false, true)) {
                    NfcSmartcardCertBasedAuthChallengeHandler.this.mDialogHolder.dismissDialog();
                    NfcSmartcardCertBasedAuthChallengeHandler nfcSmartcardCertBasedAuthChallengeHandler = NfcSmartcardCertBasedAuthChallengeHandler.this;
                    ((AbstractNfcSmartcardCertBasedAuthManager) nfcSmartcardCertBasedAuthChallengeHandler.mCbaManager).stopDiscovery(nfcSmartcardCertBasedAuthChallengeHandler.mActivity);
                    iDisconnectionCallback.onClosedConnection();
                }
            }
        });
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthChallengeHandler
    public void promptSmartcardRemovalForResult(final ISendResultCallback iSendResultCallback) {
        if (((AbstractNfcSmartcardCertBasedAuthManager) this.mCbaManager).isDeviceConnected()) {
            prepForNextUserInteraction(new IDisconnectionCallback() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.NfcSmartcardCertBasedAuthChallengeHandler.4
                @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.IDisconnectionCallback
                public void onClosedConnection() {
                    iSendResultCallback.onResultReady();
                }
            });
        } else {
            iSendResultCallback.onResultReady();
        }
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthChallengeHandler
    public void setPinDialogForIncorrectAttempt(ICertDetails iCertDetails, ClientCertRequest clientCertRequest) {
        this.mDialogHolder.showPinDialog(getSmartcardPinDialogPositiveButtonListener(iCertDetails, clientCertRequest), getGeneralCancelCbaCallback(clientCertRequest));
        this.mDialogHolder.setPinDialogErrorMode();
    }
}
