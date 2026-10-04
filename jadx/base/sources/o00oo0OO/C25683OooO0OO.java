package o00oo0OO;

import android.graphics.Bitmap;
import com.orion.ni_render_engine.impl.ink.BrushFamilyProvider;
import o000OO00.o000oOoO;
import o00o0o.InterfaceC25436OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO0o0OO.C33620OooOo;

/* JADX INFO: renamed from: o00oo0OO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25683OooO0OO implements InterfaceC25436OooO0OO, o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static C25683OooO0OO f87630OooO00o;

    public static C25683OooO0OO OooO00o() {
        if (f87630OooO00o == null) {
            f87630OooO00o = new C25683OooO0OO();
        }
        return f87630OooO00o;
    }

    public static final Object OooO0O0(Object obj) {
        return obj instanceof C33620OooOo ? C32446OooOOOo.OooO00o(((C33620OooOo) obj).f121304OooO00o) : obj;
    }

    @Override // o000OO00.o000oOoO
    public Bitmap get(String str) {
        return BrushFamilyProvider.INSTANCE.getCustomTexture(str);
    }

    @Override // o00o0o.InterfaceC25436OooO0OO
    public void release(Object obj) {
        ((Bitmap) obj).recycle();
    }
}
