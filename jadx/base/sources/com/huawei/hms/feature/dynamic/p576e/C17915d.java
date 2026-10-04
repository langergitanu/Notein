package com.huawei.hms.feature.dynamic.p576e;

import OooO0o.C20424OooO0Oo;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.feature.dynamic.InterfaceC17909b;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.e.d */
/* JADX INFO: loaded from: classes6.dex */
public class C17915d implements DynamicModule.VersionPolicy {

    /* JADX INFO: renamed from: a */
    public static final String f53612a = "d";

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        Bundle remoteModuleInfo = DynamicModule.getRemoteModuleInfo(context, str);
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        String str2 = f53612a;
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("The version of remote module ", str, C18241k5.f55433h);
        sbOooO0o0.append(remoteModuleInfo.getInt(InterfaceC17909b.f53585k));
        Logger.m75880i(str2, sbOooO0o0.toString());
        Logger.m75880i(str2, "The version of local module " + str + C18241k5.f55433h + localModuleInfo.getInt(InterfaceC17909b.f53586l));
        if (remoteModuleInfo.getInt(InterfaceC17909b.f53585k) >= localModuleInfo.getInt(InterfaceC17909b.f53586l)) {
            Logger.m75880i(str2, "Choose remote module info.");
            return remoteModuleInfo;
        }
        Logger.m75880i(str2, "Choose local module info.");
        return localModuleInfo;
    }
}
