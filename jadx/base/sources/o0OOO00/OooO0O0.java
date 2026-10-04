package o0OOO00;

import com.microsoft.identity.client.IPublicClientApplication;
import com.microsoft.identity.client.ISingleAccountPublicClientApplication;
import com.microsoft.identity.client.exception.MsalException;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO0o0OO.C33614OooOOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0O0 implements IPublicClientApplication.ISingleAccountApplicationCreatedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C33614OooOOO0 f93781OooO00o;

    public OooO0O0(C33614OooOOO0 c33614OooOOO0) {
        this.f93781OooO00o = c33614OooOOO0;
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication.ISingleAccountApplicationCreatedListener
    public final void onCreated(ISingleAccountPublicClientApplication application) {
        OooOOO0.OooO0oO(application, "application");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("OneDriveRequestManager");
        c20358OooO00o.OooO0o0("PublicClientApplication.createSingleAccount.onCreate, application: " + application + ".", new Object[0]);
        this.f93781OooO00o.resumeWith(application);
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication.ISingleAccountApplicationCreatedListener
    public final void onError(MsalException exception) {
        OooOOO0.OooO0oO(exception, "exception");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("OneDriveRequestManager");
        c20358OooO00o.OooO0Oo(exception, "init oneDrive Error", new Object[0]);
        this.f93781OooO00o.resumeWith(C32446OooOOOo.OooO00o(exception));
    }
}
