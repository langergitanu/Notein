package com.microsoft.identity.common.internal.broker.ipc;

import OooO0o.C20424OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.microsoft.identity.common.exception.BrokerCommunicationException;
import com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy;
import com.microsoft.identity.common.internal.util.ParcelableUtil;
import com.microsoft.identity.common.java.interfaces.IPlatformComponents;
import com.microsoft.identity.common.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class ContentProviderStrategy extends AbstractIpcStrategyWithServiceValidation {
    private static final String TAG = "ContentProviderStrategy";
    private final IContentProviderStatusLoader mCache;
    private final Context mContext;

    public ContentProviderStrategy(Context context, IPlatformComponents iPlatformComponents) {
        super(false);
        this.mContext = context;
        this.mCache = new ContentProviderStatusLoader(context, iPlatformComponents);
    }

    public static String getContentProviderAuthority(String str) {
        return C21111o0ooOoO.OooO0Oo(str, ".microsoft.identity.broker");
    }

    private Uri getContentProviderURI(String str, String str2) {
        return Uri.parse(AuthenticationConstants.BrokerContentProvider.CONTENT_SCHEME + getContentProviderAuthority(str) + str2);
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.AbstractIpcStrategyWithServiceValidation
    public Bundle communicateToBrokerAfterValidation(BrokerOperationBundle brokerOperationBundle) throws BrokerCommunicationException {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":communicateToBroker");
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Broker operation name: ", brokerOperationBundle.getOperation().name(), " brokerPackage: ");
        sbOooO0o0.append(brokerOperationBundle.getTargetBrokerAppPackageName());
        Logger.info(strOooO0OO, sbOooO0o0.toString());
        Uri contentProviderURI = getContentProviderURI(brokerOperationBundle.getTargetBrokerAppPackageName(), brokerOperationBundle.getContentProviderPath());
        Logger.info(strOooO0OO, "Request to BrokerContentProvider for uri path " + brokerOperationBundle.getContentProviderPath());
        Bundle bundle = brokerOperationBundle.getBundle();
        Cursor cursorQuery = this.mContext.getContentResolver().query(contentProviderURI, null, bundle != null ? Base64.encodeToString(ParcelableUtil.marshall(bundle), 0) : null, null, null);
        try {
            if (cursorQuery == null) {
                Logger.error(strOooO0OO, "Failed to get result from Broker Content Provider, cursor is null", null);
                throw new BrokerCommunicationException(BrokerCommunicationException.Category.CONNECTION_ERROR, getType(), "Failed to get result from Broker Content Provider, cursor is null", null);
            }
            try {
                Bundle extras = cursorQuery.getExtras();
                if (extras != null) {
                    Logger.info(strOooO0OO, "Received successful result from Broker Content Provider.");
                    return extras;
                }
                Logger.error(strOooO0OO, "Received an empty bundle. This means the operation is not supported on the other side. If you're using a newer feature, please bump the minimum protocol version.", null);
                throw new BrokerCommunicationException(BrokerCommunicationException.Category.OPERATION_NOT_SUPPORTED_ON_SERVER_SIDE, getType(), "Received an empty bundle. This means the operation is not supported on the other side. If you're using a newer feature, please bump the minimum protocol version.", null);
            } catch (RuntimeException e) {
                Logger.error(strOooO0OO, "Failed to get result from Broker Content Provider", e);
                throw new BrokerCommunicationException(BrokerCommunicationException.Category.CONNECTION_ERROR, getType(), "Failed to get result from Broker Content Provider", null);
            }
        } finally {
            cursorQuery.close();
        }
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public IIpcStrategy.Type getType() {
        return IIpcStrategy.Type.CONTENT_PROVIDER;
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public boolean isSupportedByTargetedBroker(String str) {
        return this.mCache.supportsContentProvider(str);
    }

    public ContentProviderStrategy(Context context, IContentProviderStatusLoader iContentProviderStatusLoader, boolean z) {
        super(z);
        this.mContext = context;
        this.mCache = iContentProviderStatusLoader;
    }
}
