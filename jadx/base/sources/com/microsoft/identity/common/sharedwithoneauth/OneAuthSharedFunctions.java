package com.microsoft.identity.common.sharedwithoneauth;

import android.content.Context;
import com.microsoft.identity.common.components.AndroidPlatformComponentsFactory;
import com.microsoft.identity.common.internal.broker.MicrosoftAuthClient;
import com.microsoft.identity.common.internal.broker.ipc.AccountManagerAddAccountStrategy;
import com.microsoft.identity.common.internal.broker.ipc.BoundServiceStrategy;
import com.microsoft.identity.common.internal.broker.ipc.ContentProviderStrategy;
import com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy;
import com.microsoft.identity.common.java.interfaces.IPlatformComponents;
import com.microsoft.identity.common.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m80612d2 = {"Lcom/microsoft/identity/common/sharedwithoneauth/OneAuthSharedFunctions;", "", "()V", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class OneAuthSharedFunctions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Class<OneAuthSharedFunctions> TAG = OneAuthSharedFunctions.class;

    @Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m80612d2 = {"Lcom/microsoft/identity/common/sharedwithoneauth/OneAuthSharedFunctions$Companion;", "", "()V", "TAG", "Ljava/lang/Class;", "Lcom/microsoft/identity/common/sharedwithoneauth/OneAuthSharedFunctions;", "getTAG", "()Ljava/lang/Class;", "getIpcStrategies", "", "Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy;", "context", "Landroid/content/Context;", "components", "Lcom/microsoft/identity/common/java/interfaces/IPlatformComponents;", "activeBrokerPackageName", "", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final List<IIpcStrategy> getIpcStrategies(Context context, String activeBrokerPackageName) {
            OooOOO0.OooO0oO(context, "context");
            OooOOO0.OooO0oO(activeBrokerPackageName, "activeBrokerPackageName");
            IPlatformComponents iPlatformComponentsCreateFromContext = AndroidPlatformComponentsFactory.createFromContext(context);
            OooOOO0.OooO0o(iPlatformComponentsCreateFromContext, "createFromContext(context)");
            return getIpcStrategies(context, iPlatformComponentsCreateFromContext, activeBrokerPackageName);
        }

        public final Class<OneAuthSharedFunctions> getTAG() {
            return OneAuthSharedFunctions.TAG;
        }

        private Companion() {
        }

        public final List<IIpcStrategy> getIpcStrategies(Context context, IPlatformComponents components, String activeBrokerPackageName) {
            OooOOO0.OooO0oO(context, "context");
            OooOOO0.OooO0oO(components, "components");
            OooOOO0.OooO0oO(activeBrokerPackageName, "activeBrokerPackageName");
            String str = getTAG() + ":getIpcStrategies";
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder(100);
            sb.append("Broker Strategies added : ");
            ContentProviderStrategy contentProviderStrategy = new ContentProviderStrategy(context, components);
            if (contentProviderStrategy.isSupportedByTargetedBroker(activeBrokerPackageName)) {
                sb.append("ContentProviderStrategy, ");
                arrayList.add(contentProviderStrategy);
            }
            BoundServiceStrategy boundServiceStrategy = new BoundServiceStrategy(new MicrosoftAuthClient(context));
            if (boundServiceStrategy.isSupportedByTargetedBroker(activeBrokerPackageName)) {
                sb.append("BoundServiceStrategy, ");
                arrayList.add(boundServiceStrategy);
            }
            AccountManagerAddAccountStrategy accountManagerAddAccountStrategy = new AccountManagerAddAccountStrategy(context);
            if (accountManagerAddAccountStrategy.isSupportedByTargetedBroker(activeBrokerPackageName)) {
                sb.append("AccountManagerStrategy.");
                arrayList.add(accountManagerAddAccountStrategy);
            }
            Logger.info(str, sb.toString());
            return arrayList;
        }
    }

    public static final List<IIpcStrategy> getIpcStrategies(Context context, IPlatformComponents iPlatformComponents, String str) {
        return INSTANCE.getIpcStrategies(context, iPlatformComponents, str);
    }

    public static final List<IIpcStrategy> getIpcStrategies(Context context, String str) {
        return INSTANCE.getIpcStrategies(context, str);
    }
}
