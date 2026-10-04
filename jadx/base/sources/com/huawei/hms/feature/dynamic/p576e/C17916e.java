package com.huawei.hms.feature.dynamic.p576e;

import OooO0o.C20424OooO0Oo;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.feature.dynamic.InterfaceC17909b;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.e.e */
/* JADX INFO: loaded from: classes6.dex */
public class C17916e implements DynamicModule.VersionPolicy {

    /* JADX INFO: renamed from: a */
    public static final String f53613a = "e";

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        Bundle remoteModuleInfo = DynamicModule.getRemoteModuleInfo(context, str);
        if (remoteModuleInfo.getInt(InterfaceC17909b.f53585k) > 0) {
            String str2 = f53613a;
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Prefer remote: The version of remote module ", str, C18241k5.f55433h);
            sbOooO0o0.append(remoteModuleInfo.getInt(InterfaceC17909b.f53585k));
            Logger.m75880i(str2, sbOooO0o0.toString());
            return remoteModuleInfo;
        }
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        if (localModuleInfo.getInt(InterfaceC17909b.f53586l) <= 0) {
            Logger.m75880i(f53613a, "Cannot get module info in remote or local.");
            return new Bundle();
        }
        String str3 = f53613a;
        StringBuilder sbOooO0o02 = C20424OooO0Oo.OooO0o0("Choose local: The version of local module ", str, C18241k5.f55433h);
        sbOooO0o02.append(localModuleInfo.getInt(InterfaceC17909b.f53586l));
        Logger.m75880i(str3, sbOooO0o02.toString());
        return localModuleInfo;
    }
}
