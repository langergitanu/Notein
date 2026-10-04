package com.huawei.hms.feature.dynamic.p576e;

import OooO0o.C20424OooO0Oo;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.feature.dynamic.InterfaceC17909b;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.e.c */
/* JADX INFO: loaded from: classes6.dex */
public class C17914c implements DynamicModule.VersionPolicy {

    /* JADX INFO: renamed from: a */
    public static final String f53611a = "c";

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        DynamicModule.LoadingException loadingException;
        Bundle bundle;
        try {
            bundle = DynamicModule.getRemoteModuleInfo(context, str);
            loadingException = null;
        } catch (DynamicModule.LoadingException e) {
            loadingException = e.getBundle() != null ? new DynamicModule.LoadingException(e.getMessage(), e.getBundle()) : new DynamicModule.LoadingException(e.getMessage());
            Logger.m75884w(f53611a, "Get remote module info failed: " + e.getMessage() + ". try to query local.");
            bundle = new Bundle();
        }
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        String str2 = f53611a;
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("The version of remote module ", str, C18241k5.f55433h);
        sbOooO0o0.append(bundle.getInt(InterfaceC17909b.f53585k));
        Logger.m75880i(str2, sbOooO0o0.toString());
        Logger.m75880i(str2, "The version of local module " + str + C18241k5.f55433h + localModuleInfo.getInt(InterfaceC17909b.f53586l));
        if (localModuleInfo.getInt(InterfaceC17909b.f53586l) > 0 && localModuleInfo.getInt(InterfaceC17909b.f53586l) >= bundle.getInt(InterfaceC17909b.f53585k)) {
            Logger.m75880i(str2, "Choose local module info.");
            return localModuleInfo;
        }
        if (loadingException != null && bundle.getInt(InterfaceC17909b.f53585k) == 0) {
            throw loadingException;
        }
        Logger.m75880i(str2, "Choose remote module info.");
        return bundle;
    }
}
