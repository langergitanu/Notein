package com.microsoft.identity.common.internal.providers.oauth2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.microsoft.identity.common.internal.telemetry.events.UiEndEvent;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.exception.ErrorStrings;
import com.microsoft.identity.common.java.providers.RawAuthorizationResult;
import com.microsoft.identity.common.java.telemetry.Telemetry;
import com.microsoft.identity.common.java.util.UrlUtil;
import com.microsoft.identity.common.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class CurrentTaskBrowserAuthorizationFragment extends AuthorizationFragment {
    private static final String BROWSER_FLOW_STARTED = "browserFlowStarted";
    private static final String TAG = "CurrentTaskBrowserAuthorizationFragment";
    private Intent mAuthIntent;
    private boolean mBrowserFlowStarted = false;
    private boolean mResponseReceived = false;

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.providers.oauth2.CurrentTaskBrowserAuthorizationFragment$1 */
    public static /* synthetic */ class C186131 {

        /* JADX INFO: renamed from: $SwitchMap$com$microsoft$identity$common$java$providers$RawAuthorizationResult$ResultCode */
        static final /* synthetic */ int[] f57069x673a98e8;

        static {
            int[] iArr = new int[RawAuthorizationResult.ResultCode.values().length];
            f57069x673a98e8 = iArr;
            try {
                iArr[RawAuthorizationResult.ResultCode.BROKER_INSTALLATION_TRIGGERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57069x673a98e8[RawAuthorizationResult.ResultCode.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57069x673a98e8[RawAuthorizationResult.ResultCode.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static Intent createCustomTabResponseIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) CurrentTaskAuthorizationActivity.class);
        intent.setAction(AuthenticationConstants.AuthorizationIntentAction.REDIRECT_RETURNED_ACTION);
        intent.addFlags(1677721600);
        intent.putExtra("RESPONSE_URI", str);
        return intent;
    }

    public void completeAuthorizationInBrowserFlow(String str) {
        Logger.info(TAG + ":completeAuthorizationInBrowserFlow", null, "Received redirect from customTab/browser.");
        RawAuthorizationResult rawAuthorizationResultFromRedirectUri = RawAuthorizationResult.fromRedirectUri(str);
        int i = C186131.f57069x673a98e8[rawAuthorizationResultFromRedirectUri.getResultCode().ordinal()];
        if (i == 1) {
            startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(UrlUtil.getParameters(rawAuthorizationResultFromRedirectUri.getAuthorizationFinalUri()).get(AuthenticationConstants.AAD.APP_LINK_KEY))));
        } else if (i == 2) {
            Telemetry.emit(new UiEndEvent().isUiComplete());
        } else if (i == 3) {
            Telemetry.emit(new UiEndEvent().isUserCancelled());
        }
        sendResult(rawAuthorizationResultFromRedirectUri);
        finish();
    }

    @Override // com.microsoft.identity.common.internal.providers.oauth2.AuthorizationFragment
    public void extractState(Bundle bundle) {
        super.extractState(bundle);
        this.mAuthIntent = (Intent) bundle.getParcelable(AuthenticationConstants.AuthorizationIntentKey.AUTH_INTENT);
        this.mBrowserFlowStarted = bundle.getBoolean(BROWSER_FLOW_STARTED, false);
    }

    @Override // com.microsoft.identity.common.internal.providers.oauth2.AuthorizationFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mResponseReceived = arguments.getBoolean("RESPONSE", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.mResponseReceived) {
            finish();
        }
        if (this.mBrowserFlowStarted) {
            cancelAuthorization(true);
            return;
        }
        this.mBrowserFlowStarted = true;
        Intent intent = this.mAuthIntent;
        if (intent != null) {
            startActivity(intent);
        } else {
            sendResult(RawAuthorizationResult.fromException(new ClientException(ErrorStrings.AUTHORIZATION_INTENT_IS_NULL)));
            finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(AuthenticationConstants.AuthorizationIntentKey.AUTH_INTENT, this.mAuthIntent);
        bundle.putBoolean(BROWSER_FLOW_STARTED, this.mBrowserFlowStarted);
    }
}
