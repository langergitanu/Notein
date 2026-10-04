package com.microsoft.identity.common.internal.broker.ipc;

import android.os.Bundle;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.opentelemetry.AttributeName;
import com.microsoft.identity.common.java.opentelemetry.SpanExtension;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/broker/ipc/IpcStrategyWithBackup;", "Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy;", "primary", "backup", "", "(Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy;Ljava/util/List;)V", "communicateToBroker", "Landroid/os/Bundle;", "bundle", "Lcom/microsoft/identity/common/internal/broker/ipc/BrokerOperationBundle;", "getType", "Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy$Type;", "isSupportedByTargetedBroker", "", "targetedBrokerPackageName", "", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class IpcStrategyWithBackup implements IIpcStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = C24035Oooo00o.f80943OooO00o.OooO0O0(IpcStrategyWithBackup.class).OooOO0();
    private final List<IIpcStrategy> backup;
    private final IIpcStrategy primary;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/broker/ipc/IpcStrategyWithBackup$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final String getTAG() {
            return IpcStrategyWithBackup.TAG;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IpcStrategyWithBackup(IIpcStrategy primary, List<? extends IIpcStrategy> backup) {
        OooOOO0.OooO0oO(primary, "primary");
        OooOOO0.OooO0oO(backup, "backup");
        this.primary = primary;
        this.backup = backup;
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public Bundle communicateToBroker(BrokerOperationBundle bundle) {
        OooOOO0.OooO0oO(bundle, "bundle");
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":communicateToBroker");
        try {
            return this.primary.communicateToBroker(bundle);
        } catch (Throwable th) {
            for (IIpcStrategy iIpcStrategy : this.backup) {
                try {
                    Bundle bundleCommunicateToBroker = iIpcStrategy.communicateToBroker(bundle);
                    SpanExtension.current().setAttribute(AttributeName.backup_ipc_used.name(), iIpcStrategy.getType().name());
                    Logger.info(strOooO0OO, iIpcStrategy.getType().name() + " backup ipc succeeded.");
                    return bundleCommunicateToBroker;
                } catch (Throwable th2) {
                    Logger.info(strOooO0OO, iIpcStrategy.getType().name() + " backup ipc failed : " + th2.getMessage());
                }
            }
            throw th;
        }
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public IIpcStrategy.Type getType() {
        return this.primary.getType();
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy
    public boolean isSupportedByTargetedBroker(String targetedBrokerPackageName) {
        OooOOO0.OooO0oO(targetedBrokerPackageName, "targetedBrokerPackageName");
        return this.primary.isSupportedByTargetedBroker(targetedBrokerPackageName);
    }
}
