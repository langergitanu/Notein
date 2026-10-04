package ooOOOOoo;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Objects;
import ooOOOOoo.C35084OooOooO;
import ooOOOOoo.InterfaceC35088Oooo0O0;

/* JADX INFO: renamed from: ooOOOOoo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35087Oooo00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static C35087Oooo00o f126028OooO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC35088Oooo0O0 f126030OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C35084OooOooO.OooO0O0 f126031OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f126029OooO00o = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f126032OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0O0 f126033OooO0o0 = new OooO0O0();

    /* JADX INFO: renamed from: ooOOOOoo.Oooo00o$OooO00o */
    public class OooO00o implements ServiceConnection {
        public OooO00o() {
        }

        @Override // android.content.ServiceConnection
        public final void onBindingDied(ComponentName componentName) {
            C35087Oooo00o.this.f126030OooO0O0 = null;
        }

        @Override // android.content.ServiceConnection
        public final void onNullBinding(ComponentName componentName) {
            C35087Oooo00o.this.f126030OooO0O0 = null;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC35088Oooo0O0 interfaceC35088Oooo0O0;
            C35084OooOooO.OooO0O0 oooO0O0;
            int i = InterfaceC35088Oooo0O0.OooO00o.f126036OooO0o0;
            if (iBinder == null) {
                interfaceC35088Oooo0O0 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.mirror.ISynergyService");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC35088Oooo0O0)) {
                    InterfaceC35088Oooo0O0.OooO00o.C20376OooO00o c20376OooO00o = new InterfaceC35088Oooo0O0.OooO00o.C20376OooO00o();
                    c20376OooO00o.f126037OooO0o0 = iBinder;
                    interfaceC35088Oooo0O0 = c20376OooO00o;
                } else {
                    interfaceC35088Oooo0O0 = (InterfaceC35088Oooo0O0) iInterfaceQueryLocalInterface;
                }
            }
            C35087Oooo00o c35087Oooo00o = C35087Oooo00o.this;
            c35087Oooo00o.f126030OooO0O0 = interfaceC35088Oooo0O0;
            Objects.toString(interfaceC35088Oooo0O0);
            Objects.toString(c35087Oooo00o.f126031OooO0OO);
            if (c35087Oooo00o.f126030OooO0O0 == null || (oooO0O0 = c35087Oooo00o.f126031OooO0OO) == null) {
                return;
            }
            C35084OooOooO c35084OooOooO = C35084OooOooO.this;
            c35084OooOooO.getClass();
            C35087Oooo00o c35087Oooo00oOooO00o = C35087Oooo00o.OooO00o();
            InterfaceC35088Oooo0O0 interfaceC35088Oooo0O02 = c35087Oooo00oOooO00o.f126029OooO00o ? c35087Oooo00oOooO00o.f126030OooO0O0 : null;
            if (interfaceC35088Oooo0O02 != null) {
                try {
                    interfaceC35088Oooo0O02.OooO0oo(c35084OooOooO.f126016OooO00o, c35084OooOooO.f126018OooO0OO);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            C35087Oooo00o.this.f126030OooO0O0 = null;
        }
    }

    /* JADX INFO: renamed from: ooOOOOoo.Oooo00o$OooO0O0 */
    public class OooO0O0 extends BroadcastReceiver {
        public OooO0O0() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("miui.intent.action.MIRROR_STATE_CHANGED".equals(intent.getAction()) && intent.getBooleanExtra("connect_state", false)) {
                C35087Oooo00o c35087Oooo00o = C35087Oooo00o.this;
                if (c35087Oooo00o.f126029OooO00o && c35087Oooo00o.f126030OooO0O0 == null) {
                    c35087Oooo00o.OooO0O0(context, c35087Oooo00o.f126031OooO0OO);
                }
            }
        }
    }

    public static C35087Oooo00o OooO00o() {
        C35087Oooo00o c35087Oooo00o;
        C35087Oooo00o c35087Oooo00o2 = f126028OooO0o;
        if (c35087Oooo00o2 != null) {
            return c35087Oooo00o2;
        }
        synchronized (C35087Oooo00o.class) {
            c35087Oooo00o = new C35087Oooo00o();
            f126028OooO0o = c35087Oooo00o;
        }
        return c35087Oooo00o;
    }

    public final void OooO0O0(Context context, C35084OooOooO.OooO0O0 oooO0O0) {
        ServiceInfo serviceInfo;
        ApplicationInfo applicationInfo;
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.mirror.ACTION_SYNERGY_SERVICE");
        intent.setPackage("com.xiaomi.mirror");
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 65536);
        if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null || (applicationInfo = serviceInfo.applicationInfo) == null || applicationInfo.uid != 1000) {
            return;
        }
        this.f126029OooO00o = context.bindService(intent, this.f126032OooO0Oo, 1);
        this.f126031OooO0OO = oooO0O0;
    }
}
