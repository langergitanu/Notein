package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import android.security.KeyChain;
import android.security.KeyChainAliasCallback;
import android.security.KeyChainException;
import android.webkit.ClientCertRequest;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.opentelemetry.ICertBasedAuthTelemetryHelper;
import com.microsoft.identity.common.logging.Logger;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes9.dex */
public class OnDeviceCertBasedAuthChallengeHandler extends AbstractCertBasedAuthChallengeHandler {
    private static final String ECDSA_CONSTANT = "ECDSA";
    private static final String TAG = "OnDeviceCertBasedAuthChallengeHandler";
    private final Activity mActivity;

    public OnDeviceCertBasedAuthChallengeHandler(Activity activity, ICertBasedAuthTelemetryHelper iCertBasedAuthTelemetryHelper) {
        this.mActivity = activity;
        this.mTelemetryHelper = iCertBasedAuthTelemetryHelper;
        iCertBasedAuthTelemetryHelper.setCertBasedAuthChallengeHandler(TAG);
        this.mIsCertBasedAuthProceeding = false;
    }

    public static String[] mapKeyTypes(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(ECDSA_CONSTANT)) {
                strArr[i] = "EC";
                return strArr;
            }
        }
        return strArr;
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractCertBasedAuthChallengeHandler
    public void cleanUp() {
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.challengehandlers.IChallengeHandler
    public Void processChallenge(final ClientCertRequest clientCertRequest) {
        final String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":processChallenge");
        KeyChain.choosePrivateKeyAlias(this.mActivity, new KeyChainAliasCallback() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.OnDeviceCertBasedAuthChallengeHandler.1
            @Override // android.security.KeyChainAliasCallback
            public void alias(String str) {
                if (str == null) {
                    Logger.info(strOooO0OO, "No certificate chosen by user, cancelling the TLS request.");
                    OnDeviceCertBasedAuthChallengeHandler.this.mTelemetryHelper.setResultFailure("No certificate chosen by user, cancelling the TLS request.");
                    clientCertRequest.cancel();
                    return;
                }
                try {
                    X509Certificate[] certificateChain = KeyChain.getCertificateChain(OnDeviceCertBasedAuthChallengeHandler.this.mActivity.getApplicationContext(), str);
                    if (certificateChain.length > 0) {
                        OnDeviceCertBasedAuthChallengeHandler.this.mTelemetryHelper.setPublicKeyAlgoType(certificateChain[0].getPublicKey().getAlgorithm());
                    }
                    PrivateKey privateKey = KeyChain.getPrivateKey(OnDeviceCertBasedAuthChallengeHandler.this.mActivity, str);
                    Logger.info(strOooO0OO, "Certificate is chosen by user, proceed with TLS request.");
                    OnDeviceCertBasedAuthChallengeHandler.this.mIsCertBasedAuthProceeding = true;
                    clientCertRequest.proceed(privateKey, certificateChain);
                } catch (KeyChainException e) {
                    Logger.errorPII(strOooO0OO, "KeyChain exception", e);
                    OnDeviceCertBasedAuthChallengeHandler.this.mTelemetryHelper.setResultFailure(e);
                    OnDeviceCertBasedAuthChallengeHandler.this.mTelemetryHelper.setResultFailure("ClientCertRequest unexpectedly cancelled.");
                    clientCertRequest.cancel();
                } catch (InterruptedException e2) {
                    Logger.errorPII(strOooO0OO, "InterruptedException exception", e2);
                    OnDeviceCertBasedAuthChallengeHandler.this.mTelemetryHelper.setResultFailure(e2);
                    OnDeviceCertBasedAuthChallengeHandler.this.mTelemetryHelper.setResultFailure("ClientCertRequest unexpectedly cancelled.");
                    clientCertRequest.cancel();
                }
            }
        }, mapKeyTypes(clientCertRequest.getKeyTypes()), clientCertRequest.getPrincipals(), clientCertRequest.getHost(), clientCertRequest.getPort(), null);
        return null;
    }
}
