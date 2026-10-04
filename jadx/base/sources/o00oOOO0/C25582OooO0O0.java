package o00oOOO0;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import kotlin.jvm.internal.OooOOO0;
import o00oOOOO.C25585OooO00o;
import o00oOOo0.C25593OooO0O0;
import o00oOOo0.InterfaceC25592OooO00o;
import o0OoOOOo.InterfaceC29095OooO0OO;

/* JADX INFO: renamed from: o00oOOO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C25582OooO0O0 implements InterfaceC25581OooO00o, InterfaceC29095OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object f87265OooO0O0;

    @Override // o00oOOO0.InterfaceC25584OooO0Oo
    public int OooO00o() {
        C25585OooO00o c25585OooO00o = (C25585OooO00o) this.f87265OooO0O0;
        if (c25585OooO00o == null) {
            return 0;
        }
        return c25585OooO00o.f87276OooO0Oo.OooO00o();
    }

    @Override // o00oOOO0.InterfaceC25584OooO0Oo
    public int OooO0O0() {
        C25585OooO00o c25585OooO00o = (C25585OooO00o) this.f87265OooO0O0;
        if (c25585OooO00o == null) {
            return 0;
        }
        return c25585OooO00o.f87276OooO0Oo.OooO0O0();
    }

    @Override // o00oOOO0.InterfaceC25584OooO0Oo
    public int OooO0OO(int i) {
        C25585OooO00o c25585OooO00o = (C25585OooO00o) this.f87265OooO0O0;
        if (c25585OooO00o == null) {
            return 0;
        }
        return c25585OooO00o.f87276OooO0Oo.OooO0OO(i);
    }

    @Override // o0OoOOOo.InterfaceC29095OooO0OO
    public void OooO0Oo(boolean z) {
        ImageView imageView = ((TextStyleBox) this.f87265OooO0O0).f74141OooOooo;
        if (imageView != null) {
            imageView.setActivated(z);
        } else {
            OooOOO0.OooOOOO("ivFullStyleReplaceRV");
            throw null;
        }
    }

    public boolean OooO0o0(Drawable drawable, Canvas canvas, int i) throws Throwable {
        C25593OooO0O0 c25593OooO0O0;
        InterfaceC25592OooO00o interfaceC25592OooO00o;
        C25585OooO00o c25585OooO00o = (C25585OooO00o) this.f87265OooO0O0;
        if (c25585OooO00o == null) {
            return false;
        }
        boolean zOooO0o = c25585OooO00o.OooO0o(canvas, i, 0);
        if (!c25585OooO00o.f87277OooO0o && (c25593OooO0O0 = c25585OooO00o.f87280OooO0oo) != null && (interfaceC25592OooO00o = c25585OooO00o.f87279OooO0oO) != null) {
            interfaceC25592OooO00o.OooO0OO(c25593OooO0O0, c25585OooO00o.f87275OooO0OO, c25585OooO00o, i);
        }
        return zOooO0o;
    }
}
