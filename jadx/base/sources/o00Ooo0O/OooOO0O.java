package o00Ooo0O;

import android.graphics.Bitmap;
import o00Ooo0O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0O extends o00o000o.OooO0o<OooOO0> {
    @Override // o00OooO.InterfaceC25145OooOo0o
    public final Class<OooOO0> OooO00o() {
        return OooOO0.class;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final int getSize() {
        OooOOO0 oooOOO0 = ((OooOO0) this.f85970OooOo0o).f85327OooOo0o.f85336OooO00o;
        return oooOOO0.f85346OooO00o.f85314OooO0O0.getSizeInBytes() + oooOOO0.f85357OooOOO;
    }

    @Override // o00o000o.OooO0o, o00OooO.InterfaceC25142OooOOoo
    public final void initialize() {
        ((OooOO0) this.f85970OooOo0o).f85327OooOo0o.f85336OooO00o.f85356OooOO0o.prepareToDraw();
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final void recycle() {
        OooOO0 oooOO02 = (OooOO0) this.f85970OooOo0o;
        oooOO02.stop();
        oooOO02.f85328OooOoO = true;
        OooOOO0 oooOOO0 = oooOO02.f85327OooOo0o.f85336OooO00o;
        oooOOO0.f85348OooO0OO.clear();
        Bitmap bitmap = oooOOO0.f85356OooOO0o;
        if (bitmap != null) {
            oooOOO0.f85351OooO0o0.OooO00o(bitmap);
            oooOOO0.f85356OooOO0o = null;
        }
        oooOOO0.f85350OooO0o = false;
        OooOOO0.OooO00o oooO00o = oooOOO0.f85345OooO;
        com.bumptech.glide.OooOOO0 oooOOO02 = oooOOO0.f85349OooO0Oo;
        if (oooO00o != null) {
            oooOOO02.OooO0Oo(oooO00o);
            oooOOO0.f85345OooO = null;
        }
        OooOOO0.OooO00o oooO00o2 = oooOOO0.f85355OooOO0O;
        if (oooO00o2 != null) {
            oooOOO02.OooO0Oo(oooO00o2);
            oooOOO0.f85355OooOO0O = null;
        }
        OooOOO0.OooO00o oooO00o3 = oooOOO0.f85358OooOOO0;
        if (oooO00o3 != null) {
            oooOOO02.OooO0Oo(oooO00o3);
            oooOOO0.f85358OooOOO0 = null;
        }
        oooOOO0.f85346OooO00o.OooO0OO();
        oooOOO0.f85354OooOO0 = true;
    }
}
