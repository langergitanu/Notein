package o00ooOo;

import OooO0o.C20424OooO0Oo;
import android.content.Context;
import android.util.Log;
import com.facebook.soloader.AbstractC22320OooOoO0;
import com.facebook.soloader.C22314OooOOo0;
import java.io.File;

/* JADX INFO: renamed from: o00ooOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25780OooO0O0 implements InterfaceC25783OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f87952OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25779OooO00o f87953OooO0O0;

    public C25780OooO0O0(Context context, C25779OooO00o c25779OooO00o) {
        this.f87952OooO00o = context;
        this.f87953OooO0O0 = c25779OooO00o;
    }

    @Override // o00ooOo.InterfaceC25783OooO0o
    public final boolean OooO0O0(UnsatisfiedLinkError unsatisfiedLinkError, AbstractC22320OooOoO0[] abstractC22320OooOoO0Arr) {
        String str = this.f87952OooO00o.getApplicationInfo().sourceDir;
        if (!new File(str).exists()) {
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Base apk does not exist: ", str, ". ");
            this.f87953OooO0O0.OooO0O0(sbOooO0o0);
            throw new C22314OooOOo0(sbOooO0o0.toString(), unsatisfiedLinkError);
        }
        Log.w("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
        return false;
    }
}
