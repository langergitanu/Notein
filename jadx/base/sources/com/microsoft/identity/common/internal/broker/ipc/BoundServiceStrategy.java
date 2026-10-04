package com.microsoft.identity.common.internal.broker.ipc;

import OooO0o.C20424OooO0Oo;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.exception.BrokerCommunicationException;
import com.microsoft.identity.common.internal.broker.BoundServiceClient;
import com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy;
import com.microsoft.identity.common.logging.Logger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
public class BoundServiceStrategy<T extends IInterface> extends AbstractIpcStrategyWithServiceValidation {
    private static final String TAG = "BoundServiceStrategy";
    private final BoundServiceClient<T> mClient;

    public BoundServiceStrategy(BoundServiceClient<T> boundServiceClient) {
        super(false);
        this.mClient = boundServiceClient;
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.AbstractIpcStrategyWithServiceValidation
    public Bundle communicateToBrokerAfterValidation(BrokerOperationBundle brokerOperationBundle) throws BrokerCommunicationException {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":communicateToBroker");
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Broker operation: ", brokerOperationBundle.getOperation().name(), " brokerPackage: ");
        sbOooO0o0.append(brokerOperationBundle.getTargetBrokerAppPackageName());
        Logger.info(strOooO0OO, sbOooO0o0.toString());
        try {
            try {
                return this.mClient.performOperation(brokerOperationBundle);
            } finally {
                this.mClient.disconnect();
            }
        } catch (RemoteException | InterruptedException | RuntimeException | ExecutionException | TimeoutException e) {
            String strConcat = "Error occurred while awaiting (get) return of bound Service with ".concat(this.mClient.getClass().getSimpleName());
            Logger.error(strOooO0OO, strConcat, e);
            throw new BrokerCommunicationException(BrokerCommunicationException.Category.CONNECTION_ERROR, getType(), strConcat, e);
        }
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public IIpcStrategy.Type getType() {
        return IIpcStrategy.Type.BOUND_SERVICE;
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public boolean isSupportedByTargetedBroker(String str) {
        return this.mClient.isBoundServiceSupported(str);
    }

    public BoundServiceStrategy(BoundServiceClient<T> boundServiceClient, boolean z) {
        super(z);
        this.mClient = boundServiceClient;
    }
}
