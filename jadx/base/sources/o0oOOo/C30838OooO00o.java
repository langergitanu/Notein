package o0oOOo;

import OooOOO0.AbstractC20449OooO0Oo;
import OooOoo0.OooOo00;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o00oO0O0.C25550OooO00o;
import o00oO0O0.C25555OooO0oO;
import o00oO0O0.C25556OooO0oo;
import o00oO0O0.C25560OooOOo0;
import o00oO0O0.C25566OooOoO0;
import o00oO0O0.InterfaceC25553OooO0Oo;
import o00oO0O0.OooO;
import o00oO0O0.OooOOO;
import o00oOo.C25600OooO00o;
import o00ooO.C25732OooO0O0;
import o0oOOo.C30843OooO0o0;
import o0ooOO.InterfaceC31498OooO0OO;

/* JADX INFO: renamed from: o0oOOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C30838OooO00o implements InterfaceC31498OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ColorDrawable f110205OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Resources f110206OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C30843OooO0o0 f110207OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C30841OooO0Oo f110208OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C25556OooO0oo f110209OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C25555OooO0oO f110210OooO0o0;

    public C30838OooO00o(C30839OooO0O0 c30839OooO0O0) {
        Drawable drawable;
        int i;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f110205OooO00o = colorDrawable;
        C25732OooO0O0.OooO00o();
        this.f110206OooO0O0 = c30839OooO0O0.f110214OooO00o;
        this.f110207OooO0OO = c30839OooO0O0.f110228OooOOOo;
        C25556OooO0oo c25556OooO0oo = new C25556OooO0oo(colorDrawable);
        this.f110209OooO0o = c25556OooO0oo;
        List<Drawable> list = c30839OooO0O0.f110225OooOOO;
        int size = list != null ? list.size() : 1;
        int i2 = (size == 0 ? 1 : size) + (c30839OooO0O0.f110227OooOOOO != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i2 + 6];
        drawableArr[0] = OooO0o(c30839OooO0O0.f110226OooOOO0, null);
        drawableArr[1] = OooO0o(c30839OooO0O0.f110217OooO0Oo, c30839OooO0O0.f110219OooO0o0);
        AbstractC20449OooO0Oo abstractC20449OooO0Oo = c30839OooO0O0.f110224OooOO0o;
        c25556OooO0oo.setColorFilter(null);
        drawableArr[2] = C30842OooO0o.OooO0Oo(c25556OooO0oo, abstractC20449OooO0Oo);
        drawableArr[3] = OooO0o(c30839OooO0O0.f110222OooOO0, c30839OooO0O0.f110223OooOO0O);
        drawableArr[4] = OooO0o(c30839OooO0O0.f110218OooO0o, c30839OooO0O0.f110220OooO0oO);
        drawableArr[5] = OooO0o(c30839OooO0O0.f110221OooO0oo, c30839OooO0O0.f110213OooO);
        if (i2 > 0) {
            List<Drawable> list2 = c30839OooO0O0.f110225OooOOO;
            if (list2 != null) {
                Iterator<Drawable> it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    drawableArr[i + 6] = OooO0o(it.next(), null);
                    i++;
                }
            } else {
                i = 1;
            }
            StateListDrawable stateListDrawable = c30839OooO0O0.f110227OooOOOO;
            if (stateListDrawable != null) {
                drawableArr[i + 6] = OooO0o(stateListDrawable, null);
            }
        }
        C25555OooO0oO c25555OooO0oO = new C25555OooO0oO(drawableArr);
        this.f110210OooO0o0 = c25555OooO0oO;
        c25555OooO0oO.f87162Oooo00o = c30839OooO0O0.f110215OooO0O0;
        if (c25555OooO0oO.f87161Oooo00O == 1) {
            c25555OooO0oO.f87161Oooo00O = 0;
        }
        C30843OooO0o0 c30843OooO0o0 = this.f110207OooO0OO;
        try {
            C25732OooO0O0.OooO00o();
            if (c30843OooO0o0 == null || c30843OooO0o0.f110232OooO00o != C30843OooO0o0.OooO00o.f110240OooOo0o) {
                C25732OooO0O0.OooO00o();
                drawable = c25555OooO0oO;
            } else {
                OooOOO oooOOO = new OooOOO(c25555OooO0oO);
                C30842OooO0o.OooO0O0(oooOOO, c30843OooO0o0);
                oooOOO.f87191Oooo00o = c30843OooO0o0.f110235OooO0Oo;
                oooOOO.invalidateSelf();
                C25732OooO0O0.OooO00o();
                drawable = oooOOO;
            }
            C30841OooO0Oo c30841OooO0Oo = new C30841OooO0Oo(drawable);
            c30841OooO0Oo.f110229OooOoO = null;
            this.f110208OooO0Oo = c30841OooO0Oo;
            c30841OooO0Oo.mutate();
            OooOO0o();
        } finally {
            C25732OooO0O0.OooO00o();
        }
    }

    public final void OooO(int i) {
        if (i >= 0) {
            C25555OooO0oO c25555OooO0oO = this.f110210OooO0o0;
            c25555OooO0oO.f87161Oooo00O = 0;
            c25555OooO0oO.f87165Oooo0o[i] = false;
            c25555OooO0oO.invalidateSelf();
        }
    }

    @Override // o0ooOO.InterfaceC31498OooO0OO
    public final void OooO00o(C25600OooO00o c25600OooO00o) {
        C30841OooO0Oo c30841OooO0Oo = this.f110208OooO0Oo;
        c30841OooO0Oo.f110229OooOoO = c25600OooO00o;
        c30841OooO0Oo.invalidateSelf();
    }

    @Override // o0ooOO.InterfaceC31497OooO0O0
    public final C30841OooO0Oo OooO0O0() {
        return this.f110208OooO0Oo;
    }

    @Override // o0ooOO.InterfaceC31498OooO0OO
    public final void OooO0OO() {
        C25555OooO0oO c25555OooO0oO = this.f110210OooO0o0;
        c25555OooO0oO.f87167Oooo0oO++;
        OooO0oo();
        if (c25555OooO0oO.OooO00o(5) != null) {
            OooO0oO(5);
        } else {
            OooO0oO(1);
        }
        c25555OooO0oO.OooO0O0();
    }

    @Override // o0ooOO.InterfaceC31498OooO0OO
    public final void OooO0Oo(float f, boolean z) {
        C25555OooO0oO c25555OooO0oO = this.f110210OooO0o0;
        if (c25555OooO0oO.OooO00o(3) == null) {
            return;
        }
        c25555OooO0oO.f87167Oooo0oO++;
        OooOOO0(f);
        if (z) {
            c25555OooO0oO.OooO0OO();
        }
        c25555OooO0oO.OooO0O0();
    }

    public final Drawable OooO0o(Drawable drawable, AbstractC20449OooO0Oo abstractC20449OooO0Oo) {
        return C30842OooO0o.OooO0Oo(C30842OooO0o.OooO0OO(drawable, this.f110207OooO0OO, this.f110206OooO0O0), abstractC20449OooO0Oo);
    }

    @Override // o0ooOO.InterfaceC31498OooO0OO
    public final void OooO0o0(Drawable drawable, float f, boolean z) {
        Drawable drawableOooO0OO = C30842OooO0o.OooO0OO(drawable, this.f110207OooO0OO, this.f110206OooO0O0);
        drawableOooO0OO.mutate();
        this.f110209OooO0o.OooOOO(drawableOooO0OO);
        C25555OooO0oO c25555OooO0oO = this.f110210OooO0o0;
        c25555OooO0oO.f87167Oooo0oO++;
        OooO0oo();
        OooO0oO(2);
        OooOOO0(f);
        if (z) {
            c25555OooO0oO.OooO0OO();
        }
        c25555OooO0oO.OooO0O0();
    }

    public final void OooO0oO(int i) {
        if (i >= 0) {
            C25555OooO0oO c25555OooO0oO = this.f110210OooO0o0;
            c25555OooO0oO.f87161Oooo00O = 0;
            c25555OooO0oO.f87165Oooo0o[i] = true;
            c25555OooO0oO.invalidateSelf();
        }
    }

    public final void OooO0oo() {
        OooO(1);
        OooO(2);
        OooO(3);
        OooO(4);
        OooO(5);
    }

    public final InterfaceC25553OooO0Oo OooOO0() {
        C25555OooO0oO c25555OooO0oO = this.f110210OooO0o0;
        c25555OooO0oO.getClass();
        InterfaceC25553OooO0Oo[] interfaceC25553OooO0OoArr = c25555OooO0oO.f87142OooOoO;
        if (!(2 < interfaceC25553OooO0OoArr.length)) {
            throw new IllegalArgumentException();
        }
        if (interfaceC25553OooO0OoArr[2] == null) {
            interfaceC25553OooO0OoArr[2] = new C25550OooO00o(c25555OooO0oO);
        }
        InterfaceC25553OooO0Oo interfaceC25553OooO0Oo = interfaceC25553OooO0OoArr[2];
        if (interfaceC25553OooO0Oo.OooO0oo() instanceof OooO) {
            interfaceC25553OooO0Oo = (OooO) interfaceC25553OooO0Oo.OooO0oo();
        }
        return interfaceC25553OooO0Oo.OooO0oo() instanceof C25560OooOOo0 ? (C25560OooOOo0) interfaceC25553OooO0Oo.OooO0oo() : interfaceC25553OooO0Oo;
    }

    public final C25560OooOOo0 OooOO0O() {
        InterfaceC25553OooO0Oo interfaceC25553OooO0OoOooOO0 = OooOO0();
        if (interfaceC25553OooO0OoOooOO0 instanceof C25560OooOOo0) {
            return (C25560OooOOo0) interfaceC25553OooO0OoOooOO0;
        }
        Drawable drawableOooO0Oo = C30842OooO0o.OooO0Oo(interfaceC25553OooO0OoOooOO0.OooOO0(C30842OooO0o.f110231OooO00o), C25566OooOoO0.f87246OooOo0o);
        interfaceC25553OooO0OoOooOO0.OooOO0(drawableOooO0Oo);
        OooOo00.OooO0o0(drawableOooO0Oo, "Parent has no child drawable!");
        return (C25560OooOOo0) drawableOooO0Oo;
    }

    public final void OooOO0o() {
        C25555OooO0oO c25555OooO0oO = this.f110210OooO0o0;
        if (c25555OooO0oO != null) {
            c25555OooO0oO.f87167Oooo0oO++;
            c25555OooO0oO.f87161Oooo00O = 0;
            Arrays.fill(c25555OooO0oO.f87165Oooo0o, true);
            c25555OooO0oO.invalidateSelf();
            OooO0oo();
            OooO0oO(1);
            c25555OooO0oO.OooO0OO();
            c25555OooO0oO.OooO0O0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOO0(float f) {
        Drawable drawableOooO00o = this.f110210OooO0o0.OooO00o(3);
        if (drawableOooO00o == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (drawableOooO00o instanceof Animatable) {
                ((Animatable) drawableOooO00o).stop();
            }
            OooO(3);
        } else {
            if (drawableOooO00o instanceof Animatable) {
                ((Animatable) drawableOooO00o).start();
            }
            OooO0oO(3);
        }
        drawableOooO00o.setLevel(Math.round(f * 10000.0f));
    }

    @Override // o0ooOO.InterfaceC31497OooO0O0
    public final Rect getBounds() {
        return this.f110208OooO0Oo.getBounds();
    }

    @Override // o0ooOO.InterfaceC31498OooO0OO
    public final void reset() {
        this.f110209OooO0o.OooOOO(this.f110205OooO00o);
        OooOO0o();
    }
}
