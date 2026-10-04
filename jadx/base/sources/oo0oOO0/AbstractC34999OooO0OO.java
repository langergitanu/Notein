package oo0oOO0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import o00O0O0o.OooOO0O;
import o00oOOo.InterfaceC25590OooO00o;

/* JADX INFO: renamed from: oo0oOO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC34999OooO0OO<T> extends AbstractC35000OooO0Oo<T> {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f125685OooO0oo = OooOO0O.OooO0o0("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f125686OooO0oO;

    /* JADX INFO: renamed from: oo0oOO0.OooO0OO$OooO00o */
    public class OooO00o extends BroadcastReceiver {
        public OooO00o() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                AbstractC34999OooO0OO.this.OooO0oO(intent);
            }
        }
    }

    public AbstractC34999OooO0OO(Context context, InterfaceC25590OooO00o interfaceC25590OooO00o) {
        super(context, interfaceC25590OooO00o);
        this.f125686OooO0oO = new OooO00o();
    }

    @Override // oo0oOO0.AbstractC35000OooO0Oo
    public final void OooO0Oo() {
        OooOO0O.OooO0OO().OooO00o(f125685OooO0oo, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f125690OooO0O0.registerReceiver(this.f125686OooO0oO, OooO0o());
    }

    public abstract IntentFilter OooO0o();

    @Override // oo0oOO0.AbstractC35000OooO0Oo
    public final void OooO0o0() {
        OooOO0O.OooO0OO().OooO00o(f125685OooO0oo, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f125690OooO0O0.unregisterReceiver(this.f125686OooO0oO);
    }

    public abstract void OooO0oO(Intent intent);
}
