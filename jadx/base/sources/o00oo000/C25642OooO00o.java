package o00oo000;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import o00oO0O0.OooOO0;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo.InterfaceC25637OooO0o0;
import o00ooO.C25732OooO0O0;

/* JADX INFO: renamed from: o00oo000.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25642OooO00o implements o0O0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Resources f87516OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0o.OooO00o f87517OooO0O0;

    public C25642OooO00o(Resources resources, o0O0o.OooO00o oooO00o) {
        this.f87516OooO00o = resources;
        this.f87517OooO0O0 = oooO00o;
    }

    @Override // o0O0o.OooO00o
    public final boolean OooO00o(InterfaceC25636OooO0Oo interfaceC25636OooO0Oo) {
        return true;
    }

    @Override // o0O0o.OooO00o
    public final Drawable OooO0O0(InterfaceC25636OooO0Oo interfaceC25636OooO0Oo) {
        try {
            C25732OooO0O0.OooO00o();
            if (!(interfaceC25636OooO0Oo instanceof InterfaceC25637OooO0o0)) {
                o0O0o.OooO00o oooO00o = this.f87517OooO0O0;
                if (oooO00o != null && oooO00o.OooO00o(interfaceC25636OooO0Oo)) {
                    return oooO00o.OooO0O0(interfaceC25636OooO0Oo);
                }
                C25732OooO0O0.OooO00o();
                return null;
            }
            InterfaceC25637OooO0o0 interfaceC25637OooO0o0 = (InterfaceC25637OooO0o0) interfaceC25636OooO0Oo;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f87516OooO00o, interfaceC25637OooO0o0.o000Ooo());
            if ((interfaceC25637OooO0o0.getRotationAngle() == 0 || interfaceC25637OooO0o0.getRotationAngle() == -1) && (interfaceC25637OooO0o0.Oooo() == 1 || interfaceC25637OooO0o0.Oooo() == 0)) {
                return bitmapDrawable;
            }
            return new OooOO0(bitmapDrawable, interfaceC25637OooO0o0.getRotationAngle(), interfaceC25637OooO0o0.Oooo());
        } finally {
            C25732OooO0O0.OooO00o();
        }
    }
}
