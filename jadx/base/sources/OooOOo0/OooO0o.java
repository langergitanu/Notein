package OooOOo0;

import OooO0OO.OooO0O0;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0o implements ServiceConnection {
    private Context mApplicationContext;

    public class OooO00o extends C20466OooO0Oo {
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, C20466OooO0Oo c20466OooO0Oo);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        OooO0OO.OooO0O0 oooO0O0;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = OooO0O0.OooO00o.f58177OooO0o0;
        if (iBinder == null) {
            oooO0O0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooO0OO.OooO0O0)) {
                OooO0O0.OooO00o.C18957OooO00o c18957OooO00o = new OooO0O0.OooO00o.C18957OooO00o();
                c18957OooO00o.f58178OooO0o0 = iBinder;
                oooO0O0 = c18957OooO00o;
            } else {
                oooO0O0 = (OooO0OO.OooO0O0) iInterfaceQueryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new OooO00o(oooO0O0, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
