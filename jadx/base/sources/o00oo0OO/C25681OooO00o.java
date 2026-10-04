package o00oo0OO;

import android.graphics.Bitmap;
import kotlin.jvm.internal.OooOOO0;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25435OooO0O0;
import o00oo0Oo.C25685OooO00o;
import o00ooO0.OooOO0;
import o00ooOO.C25767OooO0OO;

/* JADX INFO: renamed from: o00oo0OO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25681OooO00o extends AbstractC25682OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f87628OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25685OooO00o f87629OooO0O0;

    public C25681OooO00o(OooOO0 oooOO02, C25685OooO00o closeableReferenceFactory) {
        OooOOO0.OooO0oO(closeableReferenceFactory, "closeableReferenceFactory");
        this.f87628OooO00o = oooOO02;
        this.f87629OooO0O0 = closeableReferenceFactory;
    }

    @Override // o00oo0OO.AbstractC25682OooO0O0
    public final AbstractC25434OooO00o<Bitmap> OooO00o(int i, int i2, Bitmap.Config bitmapConfig) {
        OooOOO0.OooO0oO(bitmapConfig, "bitmapConfig");
        int iOooO0OO = C25767OooO0OO.OooO0OO(i, i2, bitmapConfig);
        OooOO0 oooOO02 = this.f87628OooO00o;
        Bitmap bitmap = oooOO02.get(iOooO0OO);
        if (bitmap.getAllocationByteCount() < C25767OooO0OO.OooO0O0(bitmapConfig) * i * i2) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i, i2, bitmapConfig);
        C25435OooO0O0 c25435OooO0O0O0Oo0oo = AbstractC25434OooO00o.o0Oo0oo(bitmap, oooOO02, this.f87629OooO0O0.f87633OooO00o);
        OooOOO0.OooO0o(c25435OooO0O0O0Oo0oo, "create(...)");
        return c25435OooO0O0O0Oo0oo;
    }
}
