package com.microsoft.identity.common.internal.broker.ipc;

import android.os.Bundle;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.exception.BrokerCommunicationException;
import com.microsoft.identity.common.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/broker/ipc/AbstractIpcStrategyWithServiceValidation;", "Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy;", "shouldBypassSupportValidation", "", "(Z)V", "communicateToBroker", "Landroid/os/Bundle;", "bundle", "Lcom/microsoft/identity/common/internal/broker/ipc/BrokerOperationBundle;", "communicateToBrokerAfterValidation", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public abstract class AbstractIpcStrategyWithServiceValidation implements IIpcStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = C24035Oooo00o.f80943OooO00o.OooO0O0(AbstractIpcStrategyWithServiceValidation.class).OooOO0();
    private final boolean shouldBypassSupportValidation;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/broker/ipc/AbstractIpcStrategyWithServiceValidation$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final String getTAG() {
            return AbstractIpcStrategyWithServiceValidation.TAG;
        }

        private Companion() {
        }
    }

    public AbstractIpcStrategyWithServiceValidation() {
        this(false, 1, null);
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public Bundle communicateToBroker(BrokerOperationBundle bundle) throws BrokerCommunicationException {
        OooOOO0.OooO0oO(bundle, "bundle");
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":communicateToBroker");
        if (!this.shouldBypassSupportValidation) {
            String str = bundle.targetBrokerAppPackageName;
            OooOOO0.OooO0o(str, "bundle.targetBrokerAppPackageName");
            if (!isSupportedByTargetedBroker(str)) {
                String str2 = "Operation " + getType() + " is not supported on " + bundle.targetBrokerAppPackageName;
                Logger.info(strOooO0OO, str2);
                throw new BrokerCommunicationException(BrokerCommunicationException.Category.OPERATION_NOT_SUPPORTED_ON_SERVER_SIDE, getType(), str2, null);
            }
        }
        return communicateToBrokerAfterValidation(bundle);
    }

    public abstract Bundle communicateToBrokerAfterValidation(BrokerOperationBundle bundle) throws BrokerCommunicationException;

    public AbstractIpcStrategyWithServiceValidation(boolean z) {
        this.shouldBypassSupportValidation = z;
    }

    public /* synthetic */ AbstractIpcStrategyWithServiceValidation(boolean z, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? false : z);
    }
}
