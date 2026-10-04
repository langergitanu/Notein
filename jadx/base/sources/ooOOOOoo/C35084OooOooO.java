package ooOOOOoo;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import ooOOOOoo.C35078OooOo0o;
import ooOOOOoo.C35083OooOoo0;
import ooOOOOoo.InterfaceC35086Oooo00O;

/* JADX INFO: renamed from: ooOOOOoo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35084OooOooO implements Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f126016OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C35078OooOo0o.OooO00o f126017OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f126018OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f126019OooO0Oo = new OooO0O0();

    /* JADX INFO: renamed from: ooOOOOoo.OooOooO$OooO00o */
    public class OooO00o extends InterfaceC35086Oooo00O.OooO00o {
        public OooO00o() {
        }
    }

    /* JADX INFO: renamed from: ooOOOOoo.OooOooO$OooO0O0 */
    public class OooO0O0 {
        public OooO0O0() {
        }
    }

    @Override // ooOOOOoo.Oooo000
    public final int OooO00o(Context context, C35083OooOoo0.OooO0O0 oooO0O0, Bundle bundle) {
        C35087Oooo00o c35087Oooo00oOooO00o = C35087Oooo00o.OooO00o();
        InterfaceC35088Oooo0O0 interfaceC35088Oooo0O0 = c35087Oooo00oOooO00o.f126029OooO00o ? c35087Oooo00oOooO00o.f126030OooO0O0 : null;
        if (interfaceC35088Oooo0O0 == null) {
            return -1;
        }
        try {
            bundle.putString("relay_package_name", this.f126016OooO00o);
            bundle.putInt("relay_data_type", C35083OooOoo0.OooO00o(oooO0O0));
            interfaceC35088Oooo0O0.mo80644c(bundle);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // ooOOOOoo.Oooo000
    public final void OooO0O0(Context context, C35078OooOo0o.OooO00o oooO00o) {
        this.f126017OooO0O0 = oooO00o;
    }

    @Override // ooOOOOoo.Oooo000
    public final int OooO0OO(Context context, C35083OooOoo0.OooO0O0 oooO0O0, Bundle bundle) {
        C35087Oooo00o c35087Oooo00oOooO00o = C35087Oooo00o.OooO00o();
        InterfaceC35088Oooo0O0 interfaceC35088Oooo0O0 = c35087Oooo00oOooO00o.f126029OooO00o ? c35087Oooo00oOooO00o.f126030OooO0O0 : null;
        if (interfaceC35088Oooo0O0 == null) {
            return -1;
        }
        try {
            bundle.putString("relay_package_name", this.f126016OooO00o);
            bundle.putInt("relay_data_type", C35083OooOoo0.OooO00o(oooO0O0));
            interfaceC35088Oooo0O0.mo80643b(bundle);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // ooOOOOoo.Oooo000
    /* JADX INFO: renamed from: a */
    public final int mo80640a(Context context) {
        C35083OooOoo0.OooO0O0 oooO0O0 = C35083OooOoo0.OooO0O0.f126014OooOo0o;
        C35087Oooo00o c35087Oooo00oOooO00o = C35087Oooo00o.OooO00o();
        InterfaceC35088Oooo0O0 interfaceC35088Oooo0O0 = c35087Oooo00oOooO00o.f126029OooO00o ? c35087Oooo00oOooO00o.f126030OooO0O0 : null;
        if (interfaceC35088Oooo0O0 == null) {
            return -1;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("relay_package_name", this.f126016OooO00o);
            bundle.putInt("relay_data_type", C35083OooOoo0.OooO00o(oooO0O0));
            interfaceC35088Oooo0O0.mo80642a(bundle);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // ooOOOOoo.Oooo000
    /* JADX INFO: renamed from: a */
    public final void mo80641a(Context context) {
        this.f126017OooO0O0 = null;
    }
}
