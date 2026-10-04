package o00ooOo;

import android.content.Context;
import android.util.Log;
import com.facebook.soloader.AbstractC22320OooOoO0;
import com.facebook.soloader.InterfaceC22313OooOOo;
import java.io.File;

/* JADX INFO: renamed from: o00ooOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25784OooO0o0 implements InterfaceC25783OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f87958OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25779OooO00o f87959OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f87960OooO0OO;

    public C25784OooO0o0(Context context, C25779OooO00o c25779OooO00o) {
        int i;
        this.f87958OooO00o = context;
        this.f87959OooO0O0 = c25779OooO00o;
        synchronized (c25779OooO00o) {
            i = c25779OooO00o.f87951OooO0O0;
        }
        this.f87960OooO0OO = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00ooOo.InterfaceC25783OooO0o
    public final boolean OooO0O0(UnsatisfiedLinkError unsatisfiedLinkError, AbstractC22320OooOoO0[] abstractC22320OooOoO0Arr) {
        int i;
        Context context = this.f87958OooO00o;
        String str = context.getApplicationInfo().sourceDir;
        boolean zExists = new File(str).exists();
        C25779OooO00o c25779OooO00o = this.f87959OooO0O0;
        if (zExists && c25779OooO00o.OooO00o(str)) {
            for (int i2 = 0; i2 < abstractC22320OooOoO0Arr.length; i2++) {
                Object[] objArr = abstractC22320OooOoO0Arr[i2];
                if (objArr instanceof InterfaceC22313OooOOo) {
                    abstractC22320OooOoO0Arr[i2] = ((InterfaceC22313OooOOo) objArr).OooO0O0(context);
                }
            }
            return true;
        }
        int i3 = this.f87960OooO0OO;
        synchronized (c25779OooO00o) {
            i = c25779OooO00o.f87951OooO0O0;
        }
        if (i3 == i) {
            return false;
        }
        Log.w("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }
}
