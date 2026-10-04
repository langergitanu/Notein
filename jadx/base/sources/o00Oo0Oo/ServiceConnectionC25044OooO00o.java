package o00Oo0Oo;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import o00Oo0O0.InterfaceC25043OooO00o;

/* JADX INFO: renamed from: o00Oo0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC25044OooO00o implements ServiceConnection {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C25045OooO0O0 f85020OooOo0o;

    public ServiceConnectionC25044OooO00o(C25045OooO0O0 c25045OooO0O0) {
        this.f85020OooOo0o = c25045OooO0O0;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC25043OooO00o interfaceC25043OooO00o;
        C25045OooO0O0 c25045OooO0O0 = this.f85020OooOo0o;
        int i = InterfaceC25043OooO00o.AbstractBinderC19668OooO00o.f85018OooO0o0;
        if (iBinder == null) {
            interfaceC25043OooO00o = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC25043OooO00o)) {
                InterfaceC25043OooO00o.AbstractBinderC19668OooO00o.C19669OooO00o c19669OooO00o = new InterfaceC25043OooO00o.AbstractBinderC19668OooO00o.C19669OooO00o();
                c19669OooO00o.f85019OooO0o0 = iBinder;
                interfaceC25043OooO00o = c19669OooO00o;
            } else {
                interfaceC25043OooO00o = (InterfaceC25043OooO00o) iInterfaceQueryLocalInterface;
            }
        }
        c25045OooO0O0.f85022OooO0O0 = interfaceC25043OooO00o;
        this.f85020OooOo0o.getClass();
        this.f85020OooOo0o.getClass();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C25045OooO0O0 c25045OooO0O0 = this.f85020OooOo0o;
        c25045OooO0O0.f85022OooO0O0 = null;
        c25045OooO0O0.getClass();
    }
}
