package o00ooOo;

import android.content.Context;
import o000000o.C24099OooOoO0;

/* JADX INFO: renamed from: o00ooOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25782OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f87956OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25779OooO00o f87957OooO0O0;

    public C25782OooO0Oo(Context context) {
        this.f87956OooO00o = context;
        C25779OooO00o c25779OooO00o = new C25779OooO00o();
        this.f87957OooO0O0 = c25779OooO00o;
        c25779OooO00o.OooO00o(context.getApplicationInfo().sourceDir);
    }

    public final C25781OooO0OO OooO00o() {
        C25786OooO0oo c25786OooO0oo = new C25786OooO0oo();
        Context context = this.f87956OooO00o;
        C25779OooO00o c25779OooO00o = this.f87957OooO0O0;
        return new C25781OooO0OO(c25786OooO0oo, new C25784OooO0o0(context, c25779OooO00o), new C24099OooOoO0(), new C25785OooO0oO(), new C25786OooO0oo(), new C25780OooO0O0(context, c25779OooO00o));
    }
}
