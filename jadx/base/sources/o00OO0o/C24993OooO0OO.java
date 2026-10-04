package o00OO0o;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import o00Oo0O0.InterfaceC25043OooO00o;
import o00Oo0Oo.C25045OooO0O0;
import o00Oo0Oo.ServiceConnectionC25044OooO00o;

/* JADX INFO: renamed from: o00OO0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24993OooO0OO implements o00OO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C25045OooO0O0 f84801OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f84802OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f84803OooO0OO;

    @Override // o00OO0OO.OooO00o
    /* JADX INFO: renamed from: a */
    public final String mo1a(Context context) {
        if (context != null) {
            if (!this.f84802OooO0O0) {
                C25045OooO0O0 c25045OooO0O0 = new C25045OooO0O0();
                this.f84801OooO00o = c25045OooO0O0;
                c25045OooO0O0.f85021OooO00o = context;
                c25045OooO0O0.f85023OooO0OO = new ServiceConnectionC25044OooO00o(c25045OooO0O0);
                Intent intent = new Intent();
                intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
                this.f84803OooO0OO = c25045OooO0O0.f85021OooO00o.bindService(intent, c25045OooO0O0.f85023OooO0OO, 1);
                this.f84802OooO0O0 = true;
            }
            if (this.f84803OooO0OO) {
                C25045OooO0O0 c25045OooO0O02 = this.f84801OooO00o;
                c25045OooO0O02.getClass();
                boolean zMo80620c = false;
                try {
                    InterfaceC25043OooO00o interfaceC25043OooO00o = c25045OooO0O02.f85022OooO0O0;
                    if (interfaceC25043OooO00o != null) {
                        zMo80620c = interfaceC25043OooO00o.mo80620c();
                    }
                } catch (RemoteException unused) {
                }
                if (zMo80620c) {
                    C25045OooO0O0 c25045OooO0O03 = this.f84801OooO00o;
                    if (c25045OooO0O03.f85021OooO00o == null) {
                        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
                    }
                    try {
                        InterfaceC25043OooO00o interfaceC25043OooO00o2 = c25045OooO0O03.f85022OooO0O0;
                        if (interfaceC25043OooO00o2 != null) {
                            return interfaceC25043OooO00o2.mo80619a();
                        }
                        return null;
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            }
        }
        return null;
    }
}
