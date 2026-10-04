package o00o00oo;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.OooOOO0;
import o00o0.InterfaceC25205OooO0O0;
import o00o00oO.InterfaceC25288OooO0Oo;

/* JADX INFO: renamed from: o00o00oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25300OooO0oO<Z> extends AbstractC25296OooO0OO<Z> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final Handler f86109OooOo = new Handler(Looper.getMainLooper(), new OooO00o());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOOO0 f86110OooOo0o;

    /* JADX INFO: renamed from: o00o00oo.OooO0oO$OooO00o */
    public class OooO00o implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            C25300OooO0oO c25300OooO0oO = (C25300OooO0oO) message.obj;
            c25300OooO0oO.f86110OooOo0o.OooO0Oo(c25300OooO0oO);
            return true;
        }
    }

    public C25300OooO0oO(OooOOO0 oooOOO0) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f86110OooOo0o = oooOOO0;
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final void onLoadCleared(Drawable drawable) {
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final void onResourceReady(Z z, InterfaceC25205OooO0O0<? super Z> interfaceC25205OooO0O0) {
        InterfaceC25288OooO0Oo request = getRequest();
        if (request == null || !request.OooO0o0()) {
            return;
        }
        f86109OooOo.obtainMessage(1, this).sendToTarget();
    }
}
