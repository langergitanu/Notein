package com.microsoft.identity.common.internal.providers.oauth2;

import OooO0Oo.AbstractC20413OooOo0O;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.microsoft.identity.common.internal.telemetry.events.UiEndEvent;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.logging.DiagnosticContext;
import com.microsoft.identity.common.java.logging.RequestContext;
import com.microsoft.identity.common.java.providers.RawAuthorizationResult;
import com.microsoft.identity.common.java.telemetry.Telemetry;
import com.microsoft.identity.common.java.util.ported.LocalBroadcaster;
import com.microsoft.identity.common.java.util.ported.PropertyBag;
import com.microsoft.identity.common.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AuthorizationFragment extends Fragment {
    private static final String TAG = "AuthorizationFragment";
    protected boolean mAuthResultSent = false;
    private final LocalBroadcaster.IReceiverCallback mCancelRequestReceiver = new LocalBroadcaster.IReceiverCallback() { // from class: com.microsoft.identity.common.internal.providers.oauth2.AuthorizationFragment.1
        @Override // com.microsoft.identity.common.java.util.ported.LocalBroadcaster.IReceiverCallback
        public void onReceive(PropertyBag propertyBag) {
            AuthorizationFragment.this.cancelAuthorization(((Boolean) propertyBag.getOrDefault(AuthenticationConstants.LocalBroadcasterAliases.CANCEL_AUTHORIZATION_REQUEST, Boolean.FALSE)).booleanValue());
        }
    };
    private Bundle mInstanceState;

    private static void setDiagnosticContextForNewThread(String str) {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":setDiagnosticContextForAuthorizationActivity");
        RequestContext requestContext = new RequestContext();
        requestContext.put("correlation_id", str);
        DiagnosticContext.INSTANCE.setRequestContext(requestContext);
        Logger.verbose(strOooO0OO, "Initializing diagnostic context for AuthorizationActivity");
    }

    public void cancelAuthorization(boolean z) {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":cancelAuthorization");
        if (z) {
            Logger.info(strOooO0OO, "Received Authorization flow cancelled by the user");
            sendResult(RawAuthorizationResult.ResultCode.CANCELLED);
        } else {
            Logger.info(strOooO0OO, "Received Authorization flow cancel request from SDK");
            sendResult(RawAuthorizationResult.ResultCode.SDK_CANCELLED);
        }
        Telemetry.emit(new UiEndEvent().isUserCancelled());
        finish();
    }

    public void extractState(Bundle bundle) {
        setDiagnosticContextForNewThread(bundle.getString("correlation_id"));
    }

    public void finish() {
        LocalBroadcaster.INSTANCE.unregisterCallback(AuthenticationConstants.LocalBroadcasterAliases.CANCEL_AUTHORIZATION_REQUEST);
        ActivityC21897OooOo0 activity = getActivity();
        if (activity instanceof AuthorizationActivity) {
            activity.finish();
            return;
        }
        try {
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(fragmentManager);
                oooO00o.OooOOO0(this);
                oooO00o.OooOO0();
            }
        } catch (Exception e) {
            Logger.error(TAG + "#finish", "Logged as error to capture 'cause'; Exception occurred when removing ourselves from provided FragmentManager", e);
        }
    }

    public void handleBackButtonPressed() {
        cancelAuthorization(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":onCreate");
        super.onCreate(bundle);
        LocalBroadcaster.INSTANCE.registerCallback(AuthenticationConstants.LocalBroadcasterAliases.CANCEL_AUTHORIZATION_REQUEST, this.mCancelRequestReceiver);
        if (bundle == null && this.mInstanceState == null) {
            Logger.warn(strOooO0OO, "No stored state. Unable to handle response");
            finish();
        } else if (bundle == null) {
            Logger.verbose(strOooO0OO, "Extract state from the intent bundle.");
            extractState(this.mInstanceState);
        } else {
            Logger.verbose(strOooO0OO, "Extract state from the saved bundle.");
            extractState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        String str = TAG + ":onDestroy";
        Logger.info(str, "");
        if (!this.mAuthResultSent) {
            Logger.info(str, "Hosting Activity is destroyed before Auth request is completed, sending request cancel");
            Telemetry.emit(new UiEndEvent().isUserCancelled());
            sendResult(RawAuthorizationResult.ResultCode.SDK_CANCELLED);
        }
        LocalBroadcaster.INSTANCE.unregisterCallback(AuthenticationConstants.LocalBroadcasterAliases.CANCEL_AUTHORIZATION_REQUEST);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":onStop");
        ActivityC21897OooOo0 activity = getActivity();
        if (!this.mAuthResultSent && (activity == null || activity.isFinishing())) {
            Logger.info(strOooO0OO, "Hosting Activity is destroyed before Auth request is completed, sending request cancel");
            Telemetry.emit(new UiEndEvent().isUserCancelled());
            sendResult(RawAuthorizationResult.ResultCode.SDK_CANCELLED);
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().OooO00o(getViewLifecycleOwner(), new AbstractC20413OooOo0O(true) { // from class: com.microsoft.identity.common.internal.providers.oauth2.AuthorizationFragment.2
            @Override // OooO0Oo.AbstractC20413OooOo0O
            public void handleOnBackPressed() {
                AuthorizationFragment.this.handleBackButtonPressed();
            }
        });
    }

    public void sendResult(RawAuthorizationResult.ResultCode resultCode) {
        sendResult(RawAuthorizationResult.fromResultCode(resultCode));
    }

    public void setInstanceState(Bundle bundle) {
        this.mInstanceState = bundle;
    }

    public void sendResult(RawAuthorizationResult rawAuthorizationResult) {
        Logger.info(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":sendResult"), "Sending result from Authorization Activity, resultCode: " + rawAuthorizationResult.getResultCode());
        PropertyBag propertyBag = RawAuthorizationResult.toPropertyBag(rawAuthorizationResult);
        propertyBag.put(AuthenticationConstants.LocalBroadcasterFields.REQUEST_CODE, 1001);
        LocalBroadcaster.INSTANCE.broadcast(AuthenticationConstants.LocalBroadcasterAliases.RETURN_AUTHORIZATION_REQUEST_RESULT, propertyBag);
        this.mAuthResultSent = true;
    }
}
