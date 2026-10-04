package com.microsoft.identity.common.internal.p590ui.webview.challengehandlers;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.C18549R;
import com.microsoft.identity.common.java.p591ui.webview.authorization.IAuthorizationCompletionCallback;
import com.microsoft.identity.common.java.providers.RawAuthorizationResult;
import com.microsoft.identity.common.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public final class NtlmChallengeHandler implements IChallengeHandler<NtlmChallenge, Void> {
    private static final String TAG = "NtlmChallengeHandler";
    private final Activity mActivity;
    private final IAuthorizationCompletionCallback mChallengeCallback;

    public NtlmChallengeHandler(Activity activity, IAuthorizationCompletionCallback iAuthorizationCompletionCallback) {
        this.mActivity = activity;
        this.mChallengeCallback = iAuthorizationCompletionCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelRequest() {
        Logger.info(TAG + ":cancelRequest", "Sending intent to cancel authentication activity");
        this.mChallengeCallback.onChallengeResponseReceived(RawAuthorizationResult.fromResultCode(RawAuthorizationResult.ResultCode.CANCELLED));
    }

    private void showHttpAuthDialog(final NtlmChallenge ntlmChallenge) {
        final String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":showHttpAuthDialog");
        View viewInflate = LayoutInflater.from(this.mActivity).inflate(this.mActivity.getResources().getLayout(C18549R.layout.http_auth_dialog), (ViewGroup) null);
        final EditText editText = (EditText) viewInflate.findViewById(C18549R.id.editUserName);
        final EditText editText2 = (EditText) viewInflate.findViewById(C18549R.id.editPassword);
        new AlertDialog.Builder(this.mActivity).setTitle(this.mActivity.getText(C18549R.string.http_auth_dialog_title).toString()).setView(viewInflate).setPositiveButton(C18549R.string.http_auth_dialog_login, new DialogInterface.OnClickListener() { // from class: com.microsoft.identity.common.internal.ui.webview.challengehandlers.NtlmChallengeHandler.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Logger.info(strOooO0OO, "Proceeding with user supplied username and password.");
                ntlmChallenge.getHandler().proceed(editText.getText().toString(), editText2.getText().toString());
            }
        }).setNegativeButton(C18549R.string.http_auth_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.microsoft.identity.common.internal.ui.webview.challengehandlers.NtlmChallengeHandler.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                ntlmChallenge.getHandler().cancel();
                NtlmChallengeHandler.this.cancelRequest();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.microsoft.identity.common.internal.ui.webview.challengehandlers.NtlmChallengeHandler.1
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                ntlmChallenge.getHandler().cancel();
                NtlmChallengeHandler.this.cancelRequest();
            }
        }).create().show();
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.challengehandlers.IChallengeHandler
    public Void processChallenge(NtlmChallenge ntlmChallenge) {
        showHttpAuthDialog(ntlmChallenge);
        return null;
    }
}
