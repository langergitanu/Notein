package o0oooOo;

import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import o0oooOOo.C31844OooO0OO;
import o0oooOOo.C31845OooO0Oo;

/* JADX INFO: renamed from: o0oooOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class CallableC31855OooO0o implements Callable<C31856OooO0o0> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C31857OooO0oO f113535OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ WeakReference f113536OooOo0o;

    public CallableC31855OooO0o(C31857OooO0oO c31857OooO0oO, WeakReference weakReference) {
        this.f113535OooOo = c31857OooO0oO;
        this.f113536OooOo0o = weakReference;
    }

    @Override // java.util.concurrent.Callable
    public final C31856OooO0o0 call() throws Exception {
        C31845OooO0Oo.OooO00o oooO00o = this.f113535OooOo.f113550OooO00o;
        C31845OooO0Oo.OooO00o oooO00o2 = new C31845OooO0Oo.OooO00o();
        oooO00o2.f113495OooO00o = null;
        oooO00o2.f113496OooO0O0 = null;
        oooO00o2.f113497OooO0OO = null;
        Boolean bool = Boolean.FALSE;
        oooO00o2.f113498OooO0Oo = bool;
        oooO00o2.f113500OooO0o0 = ActivityC31851OooO00o.class;
        oooO00o2.f113499OooO0o = "code";
        oooO00o2.f113501OooO0oO = false;
        oooO00o2.f113503OooOO0 = Boolean.TRUE;
        oooO00o2.f113504OooOO0O = bool;
        oooO00o2.f113495OooO00o = oooO00o.f113495OooO00o;
        oooO00o2.f113496OooO0O0 = oooO00o.f113496OooO0O0;
        oooO00o2.f113497OooO0OO = oooO00o.f113497OooO0OO;
        oooO00o2.f113498OooO0Oo = oooO00o.f113498OooO0Oo;
        oooO00o2.f113500OooO0o0 = oooO00o.f113500OooO0o0;
        oooO00o2.f113499OooO0o = oooO00o.f113499OooO0o;
        oooO00o2.f113501OooO0oO = oooO00o.f113501OooO0oO;
        oooO00o2.f113502OooO0oo = oooO00o.f113502OooO0oo;
        oooO00o2.f113494OooO = oooO00o.f113494OooO;
        oooO00o2.f113503OooOO0 = oooO00o.f113503OooOO0;
        oooO00o2.f113504OooOO0O = oooO00o.f113504OooOO0O;
        oooO00o2.f113505OooOO0o = oooO00o.f113505OooOO0o;
        C31845OooO0Oo c31845OooO0Oo = new C31845OooO0Oo(oooO00o2);
        Context context = c31845OooO0Oo.f113490OooO0oo;
        if (context == null) {
            throw new IllegalArgumentException("not set Context or Activity!!!");
        }
        String str = c31845OooO0Oo.f113484OooO0O0;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("client id is error!!!");
        }
        String str2 = c31845OooO0Oo.f113485OooO0OO;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("redirect url is empty!!!");
        }
        C31844OooO0OO c31844OooO0OO = new C31844OooO0OO();
        c31844OooO0OO.f113473OooO00o = context;
        c31844OooO0OO.f113474OooO0O0 = str;
        c31844OooO0OO.f113475OooO0OO = str2;
        return c31844OooO0OO.OooO00o(this.f113536OooOo0o, c31845OooO0Oo);
    }
}
