package o00oO0O;

import Oooo0oO.AbstractC21020OooO00o;
import androidx.compose.p002ui.platform.AndroidComposeView;
import o00oO0O.C25503OooOoOO;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 extends AbstractC21020OooO00o {
    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO00o(int i, int i2) {
        C25503OooOoOO c25503OooOoOO = (C25503OooOoOO) this.f60879OooO0O0;
        c25503OooOoOO.getClass();
        if (i2 < 0) {
            throw new IllegalArgumentException(Oooo0oO.o0Oo0oo.OooO0O0(i2, "count (", ") must be greater than 0").toString());
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            C25512Oooo<C25503OooOoOO> c25512Oooo = c25503OooOoOO.f86939OooOoO;
            C25503OooOoOO c25503OooOoOOOooOO0o = c25512Oooo.f87015OooO00o.OooOO0o(i3);
            c25512Oooo.f87016OooO0O0.invoke();
            c25503OooOoOO.OooOooO(c25503OooOoOOOooOO0o);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO0O0() {
        AndroidComposeView androidComposeView = ((C25503OooOoOO) this.f60878OooO00o).f86944OooOooO;
        if (androidComposeView != null) {
            androidComposeView.OooOOO0();
        }
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO0OO(int i, int i2, int i3) {
        C25503OooOoOO c25503OooOoOO = (C25503OooOoOO) this.f60879OooO0O0;
        c25503OooOoOO.getClass();
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            C25512Oooo<C25503OooOoOO> c25512Oooo = c25503OooOoOO.f86939OooOoO;
            C25503OooOoOO c25503OooOoOOOooOO0o = c25512Oooo.f87015OooO00o.OooOO0o(i5);
            C25503OooOoOO.C25507OooO0oo c25507OooO0oo = c25512Oooo.f87016OooO0O0;
            c25507OooO0oo.invoke();
            c25512Oooo.f87015OooO00o.OooO00o(i6, c25503OooOoOOOooOO0o);
            c25507OooO0oo.invoke();
        }
        c25503OooOoOO.OooOooo();
        c25503OooOoOO.OooOoO0();
        c25503OooOoOO.Oooo00o(false);
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO0Oo(int i, Object obj) {
        C25503OooOoOO instance = (C25503OooOoOO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(instance, "instance");
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO0o(int i, Object obj) {
        Oooo.OooO0O0<C25503OooOoOO> oooO0O0;
        int i2;
        C25503OooOoOO instance = (C25503OooOoOO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(instance, "instance");
        C25503OooOoOO c25503OooOoOO = (C25503OooOoOO) this.f60879OooO0O0;
        c25503OooOoOO.getClass();
        int i3 = 0;
        C25495OooOOo c25495OooOOo = null;
        if (instance.f86942OooOoo != null) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(instance);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(c25503OooOoOO.OooOOO0(0));
            sb.append(" Other tree: ");
            C25503OooOoOO c25503OooOoOO2 = instance.f86942OooOoo;
            sb.append(c25503OooOoOO2 != null ? c25503OooOoOO2.OooOOO0(0) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (instance.f86944OooOooO != null) {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + c25503OooOoOO.OooOOO0(0) + " Other tree: " + instance.OooOOO0(0)).toString());
        }
        instance.f86942OooOoo = c25503OooOoOO;
        C25512Oooo<C25503OooOoOO> c25512Oooo = c25503OooOoOO.f86939OooOoO;
        c25512Oooo.f87015OooO00o.OooO00o(i, instance);
        c25512Oooo.f87016OooO0O0.invoke();
        c25503OooOoOO.OooOooo();
        boolean z = c25503OooOoOO.f86938OooOo0o;
        boolean z2 = instance.f86938OooOo0o;
        if (z2) {
            if (z) {
                throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent");
            }
            c25503OooOoOO.f86940OooOoO0++;
        }
        c25503OooOoOO.OooOoO0();
        AbstractC25521OoooO abstractC25521OoooO = instance.f86970o000oOoO.f87085OooO0OO;
        C25527OoooO00 c25527OoooO00 = c25503OooOoOO.f86970o000oOoO;
        if (z) {
            C25503OooOoOO c25503OooOoOO3 = c25503OooOoOO.f86942OooOoo;
            if (c25503OooOoOO3 != null) {
                c25495OooOOo = c25503OooOoOO3.f86970o000oOoO.f87084OooO0O0;
            }
        } else {
            c25495OooOOo = c25527OoooO00.f87084OooO0O0;
        }
        abstractC25521OoooO.f87053OooOooo = c25495OooOOo;
        if (z2 && (i2 = (oooO0O0 = instance.f86939OooOoO.f87015OooO00o).f59746OooOoO0) > 0) {
            C25503OooOoOO[] c25503OooOoOOArr = oooO0O0.f59745OooOo0o;
            do {
                c25503OooOoOOArr[i3].f86970o000oOoO.f87085OooO0OO.f87053OooOooo = c25527OoooO00.f87084OooO0O0;
                i3++;
            } while (i3 < i2);
        }
        AndroidComposeView androidComposeView = c25503OooOoOO.f86944OooOooO;
        if (androidComposeView != null) {
            instance.OooOO0(androidComposeView);
        }
        if (instance.f86962OoooOOO.f86992OooO0oO > 0) {
            C25511OooOooo c25511OooOooo = c25503OooOoOO.f86962OoooOOO;
            c25511OooOooo.OooO0O0(c25511OooOooo.f86992OooO0oO + 1);
        }
    }

    @Override // Oooo0oO.AbstractC21020OooO00o
    public final void OooOO0O() {
        C25503OooOoOO c25503OooOoOO = (C25503OooOoOO) this.f60878OooO00o;
        C25512Oooo<C25503OooOoOO> c25512Oooo = c25503OooOoOO.f86939OooOoO;
        int i = c25512Oooo.f87015OooO00o.f59746OooOoO0;
        while (true) {
            i--;
            Oooo.OooO0O0<C25503OooOoOO> oooO0O0 = c25512Oooo.f87015OooO00o;
            if (-1 >= i) {
                oooO0O0.OooO0o();
                c25512Oooo.f87016OooO0O0.invoke();
                return;
            }
            c25503OooOoOO.OooOooO(oooO0O0.f59745OooOo0o[i]);
        }
    }
}
