package o0O000;

import OooOooO.C20741OooOOoo;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.hihonor.cloudservice.framework.aidl.DataBuffer;
import com.hihonor.honorid.core.helper.handler.ErrorStatus;
import o00OOO.OooO0O0;
import o0OoOoOO.C29213OooO00o;
import o0OoOoOo.AbstractBinderC29214OooO00o;
import o0OoOoOo.InterfaceC29215OooO0O0;
import oOO00o0.C34370OooO0o0;
import oOO00o0o.AbstractRunnableC34378OooO0OO;
import oOO00o0o.ServiceConnectionC34376OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO00o extends AbstractRunnableC34378OooO0OO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f88111OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Bundle f88112OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Context f88113OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C29213OooO00o f88114OooOoo0;

    /* JADX INFO: renamed from: o0O000.OooO00o$OooO00o, reason: collision with other inner class name */
    public class BinderC19720OooO00o extends AbstractBinderC29214OooO00o {
        public BinderC19720OooO00o() {
            attachInterface(this, "com.hihonor.cloudservice.framework.aidl.IServiceCallback");
        }
    }

    @Override // oOO00o0o.AbstractRunnableC34378OooO0OO
    public final void OooO00o() {
        Bundle bundle = this.f88112OooOoOO;
        C34370OooO0o0.OooO0Oo("SilentLoginTask", "LoginTask execute");
        InterfaceC29215OooO0O0 interfaceC29215OooO0O0 = ServiceConnectionC34376OooO00o.OooO00o(this.f88113OooOoo).f123367OooOo0o;
        try {
            DataBuffer dataBuffer = new DataBuffer();
            dataBuffer.f68816OooOoO = bundle;
            OooO0O0 oooO0O0 = new OooO0O0();
            bundle.getString("clientId");
            bundle.getString("packageName");
            Bundle bundle2 = new Bundle();
            C20741OooOOoo.OooO00o(bundle2, oooO0O0);
            dataBuffer.f68817OooOoO0 = bundle2;
            interfaceC29215OooO0O0.OooOOO0(dataBuffer, new BinderC19720OooO00o());
        } catch (RemoteException unused) {
            C34370OooO0o0.OooO0Oo("SilentLoginTask", "login remote exception");
        }
    }

    @Override // oOO00o0o.AbstractRunnableC34378OooO0OO
    public final void OooO0O0(ErrorStatus errorStatus) {
        if (errorStatus == null) {
            errorStatus = new ErrorStatus(39, "login timeout. retry again");
        }
        C34370OooO0o0.OooO0Oo("SilentLoginTask", "timeout : Status = " + errorStatus.f68954OooOo0o);
        this.f88114OooOoo0.OooO00o(errorStatus);
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("SilentLoginTask{mServiceType='"), this.f88111OooOoO, "'}");
    }
}
