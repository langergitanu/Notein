package com.microsoft.identity.common.internal.broker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.microsoft.identity.common.PropertyBagUtil;
import com.microsoft.identity.common.internal.result.BrokerResultAdapterFactory;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.exception.ErrorStrings;
import com.microsoft.identity.common.java.request.SdkType;
import com.microsoft.identity.common.java.util.ported.LocalBroadcaster;
import com.microsoft.identity.common.java.util.ported.PropertyBag;
import com.microsoft.identity.common.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public final class BrokerActivity extends Activity {
    public static final String BROKER_INTENT = "broker_intent";
    static final int BROKER_INTENT_REQUEST_CODE = 1001;
    static final String BROKER_INTENT_STARTED = "broker_intent_started";
    private static final String TAG = "BrokerActivity";
    private Boolean mBrokerIntentStarted;
    private Intent mBrokerInteractiveRequestIntent;
    private Boolean mBrokerResultReceived;

    public BrokerActivity() {
        Boolean bool = Boolean.FALSE;
        this.mBrokerIntentStarted = bool;
        this.mBrokerResultReceived = bool;
    }

    private void returnsExceptionOnActivityUnexpectedlyKilled() {
        PropertyBag propertyBagFromBundle = PropertyBagUtil.fromBundle(BrokerResultAdapterFactory.getBrokerResultAdapter(SdkType.MSAL).bundleFromBaseException(new ClientException(ErrorStrings.BROKER_REQUEST_CANCELLED, "The activity is killed unexpectedly."), null));
        propertyBagFromBundle.put(AuthenticationConstants.LocalBroadcasterFields.REQUEST_CODE, 1003);
        propertyBagFromBundle.put(AuthenticationConstants.LocalBroadcasterFields.RESULT_CODE, 2001);
        LocalBroadcaster.INSTANCE.broadcast(AuthenticationConstants.LocalBroadcasterAliases.RETURN_BROKER_INTERACTIVE_ACQUIRE_TOKEN_RESULT, propertyBagFromBundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":onActivityResult");
        Logger.info(strOooO0OO, "Result received from Broker Request code: " + i + " Result code: " + i);
        this.mBrokerResultReceived = Boolean.TRUE;
        if (i2 == 2004 || i2 == 2001 || i2 == 2002) {
            Logger.verbose(strOooO0OO, "Completing interactive request ");
            PropertyBag propertyBagFromBundle = PropertyBagUtil.fromBundle(intent.getExtras());
            propertyBagFromBundle.put(AuthenticationConstants.LocalBroadcasterFields.REQUEST_CODE, 1003);
            propertyBagFromBundle.put(AuthenticationConstants.LocalBroadcasterFields.RESULT_CODE, Integer.valueOf(i2));
            LocalBroadcaster.INSTANCE.broadcast(AuthenticationConstants.LocalBroadcasterAliases.RETURN_BROKER_INTERACTIVE_ACQUIRE_TOKEN_RESULT, propertyBagFromBundle);
        } else {
            returnsExceptionOnActivityUnexpectedlyKilled();
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":onCreate");
        if (bundle != null) {
            this.mBrokerInteractiveRequestIntent = (Intent) bundle.getParcelable(BROKER_INTENT);
            this.mBrokerIntentStarted = Boolean.valueOf(bundle.getBoolean(BROKER_INTENT_STARTED));
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.mBrokerInteractiveRequestIntent = (Intent) extras.getParcelable(BROKER_INTENT);
        } else {
            Logger.warn(strOooO0OO, "Extras is null.");
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (!this.mBrokerResultReceived.booleanValue()) {
            returnsExceptionOnActivityUnexpectedlyKilled();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.mBrokerIntentStarted.booleanValue()) {
            return;
        }
        this.mBrokerIntentStarted = Boolean.TRUE;
        startActivityForResult(this.mBrokerInteractiveRequestIntent, 1001);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(BROKER_INTENT, this.mBrokerInteractiveRequestIntent);
        bundle.putBoolean(BROKER_INTENT_STARTED, this.mBrokerIntentStarted.booleanValue());
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
