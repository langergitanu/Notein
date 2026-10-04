package o0ooOO0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import oO00ooO.C32460OooOooO;
import oO0o0OOo.C33695OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOoO extends ContentObserver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C33695OooO0o0 f112893OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOoO(C33695OooO0o0 c33695OooO0o0, Handler handler) {
        super(handler);
        this.f112893OooO00o = c33695OooO0o0;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.f112893OooO00o.OooO0o0(C32460OooOooO.f116667OooO00o);
    }
}
