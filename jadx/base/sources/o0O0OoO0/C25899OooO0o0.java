package o0O0OoO0;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.hms.network.embedded.C18374u4;
import com.oplus.ipemanager.sdk.ISdkAidlInterface;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.common.api.Api;
import com.oplus.ocs.base.common.api.OplusApi;
import com.oplus.ocs.base.internal.ClientSettings;
import java.util.ArrayList;

/* JADX INFO: renamed from: o0O0OoO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25899OooO0o0 extends OplusApi<Api.ApiOptions.NoOptions, C25899OooO0o0> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ArrayList f88422OooO0OO = new ArrayList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Api<Api.ApiOptions.NoOptions> f88423OooO0Oo = new Api<>("PencilManagerClient.API", new C25897OooO0OO(), new Api.ClientKey());

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static C25899OooO0o0 f88424OooO0o0 = null;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ISdkAidlInterface f88425OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f88426OooO0O0;

    public C25899OooO0o0(Context context) {
        super(context, f88423OooO0Oo, null, new ClientSettings(context.getPackageName(), 10000, f88422OooO0OO), true);
        Log.i("PencilManagerUnitClient", "new PencilManagerUnitClient");
        checkCapability();
    }

    @Override // com.oplus.ocs.base.common.api.OplusApi
    public final void checkAuthResult(CapabilityInfo capabilityInfo) {
        this.f88426OooO0O0 = capabilityInfo.getAuthResult().getErrrorCode() == 1001;
        Log.d("PencilManagerUnitClient", "mAuthCheckFlag: " + this.f88426OooO0O0);
        if (this.f88426OooO0O0) {
            ISdkAidlInterface iSdkAidlInterfaceM80469a = ISdkAidlInterface.AbstractBinderC18814a.m80469a(capabilityInfo.getBinder());
            this.f88425OooO00o = iSdkAidlInterfaceM80469a;
            C25895OooO00o c25895OooO00o = C25895OooO00o.f88411OooO0Oo;
            Log.d("PencilManager", C18374u4.f56270c);
            if (iSdkAidlInterfaceM80469a == null) {
                Log.e("PencilManager", "sdk interface is null!");
                return;
            }
            c25895OooO00o.f88412OooO00o = iSdkAidlInterfaceM80469a;
            try {
                iSdkAidlInterfaceM80469a.asBinder().linkToDeath(c25895OooO00o.f88413OooO0O0, 0);
                c25895OooO00o.f88412OooO00o.setISdkAidlCallback(c25895OooO00o.f88414OooO0OO);
            } catch (RemoteException e) {
                Log.e("PencilManager", "init setISdkAidlCallback error = ".concat(String.valueOf(e)));
            }
        }
    }

    @Override // com.oplus.ocs.base.common.api.OplusApi
    public final int getVersion() {
        return 10000;
    }

    @Override // com.oplus.ocs.base.common.api.OplusApi
    public final boolean hasFeature(String str) {
        String str2 = Build.BRAND;
        return "OPPO".equalsIgnoreCase(str2) || "realme".equalsIgnoreCase(str2) || "oneplus".equalsIgnoreCase(str2) || "oplus".equalsIgnoreCase(str2);
    }

    @Override // com.oplus.ocs.base.common.api.OplusApi
    public final void init() {
    }
}
