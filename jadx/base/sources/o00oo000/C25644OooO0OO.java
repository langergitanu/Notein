package o00oo000;

import OooOoo0.OooOo00;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.Map;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0Ooo.C25431OooO0oo;
import o00o0Ooo.InterfaceC25423OooO;
import o00o0o.AbstractC25434OooO00o;
import o00o0o00.C25438OooO00o;
import o00o0oo.InterfaceC25467OooO0o0;
import o00o0ooo.InterfaceC25472OooO00o;
import o00oO00O.C25475OooO0O0;
import o00oO00o.AbstractC25477OooO00o;
import o00oO0O0.C25551OooO0O0;
import o00oO0O0.C25560OooOOo0;
import o00oO0O0.InterfaceC25553OooO0Oo;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo.OooO;
import o00oo.OooOO0O;
import o00oo0O0.C25670OooOOOO;
import o00ooO.C25732OooO0O0;
import o0ooOO.InterfaceC31497OooO0O0;

/* JADX INFO: renamed from: o00oo000.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25644OooO0OO extends AbstractC25477OooO00o<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>, OooO> {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C25642OooO00o f87520OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public InterfaceC25397OooO00o f87521OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C25670OooOOOO f87522OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public InterfaceC25423OooO<InterfaceC25467OooO0o0<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>>> f87523OooOo0O;

    public C25644OooO0OO(Resources resources, C25475OooO0O0 c25475OooO0O0, o0O0o.OooO00o oooO00o, o00o0Oo.OooO0o oooO0o, C25670OooOOOO c25670OooOOOO) {
        super(c25475OooO0O0, oooO0o);
        this.f87520OooOOoo = new C25642OooO00o(resources, oooO00o);
        this.f87522OooOo00 = c25670OooOOOO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C25560OooOOo0 OooOoOO(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof C25560OooOOo0) {
            return (C25560OooOOo0) drawable;
        }
        if (drawable instanceof InterfaceC25553OooO0Oo) {
            return OooOoOO(((InterfaceC25553OooO0Oo) drawable).OooO0oo());
        }
        if (!(drawable instanceof C25551OooO0O0)) {
            return null;
        }
        C25551OooO0O0 c25551OooO0O0 = (C25551OooO0O0) drawable;
        int length = c25551OooO0O0.f87143OooOoO0.length;
        for (int i = 0; i < length; i++) {
            C25560OooOOo0 c25560OooOOo0OooOoOO = OooOoOO(c25551OooO0O0.OooO00o(i));
            if (c25560OooOOo0OooOoOO != null) {
                return c25560OooOOo0OooOoOO;
            }
        }
        return null;
    }

    @Override // o00oO00o.AbstractC25477OooO00o, o0ooOO.InterfaceC31496OooO00o
    public final void OooO0Oo(InterfaceC31497OooO0O0 interfaceC31497OooO0O0) {
        super.OooO0Oo(interfaceC31497OooO0O0);
        OooOoo0(null);
    }

    @Override // o00oO00o.AbstractC25477OooO00o
    public final Drawable OooO0oO(AbstractC25434OooO00o<InterfaceC25636OooO0Oo> abstractC25434OooO00o) {
        AbstractC25434OooO00o<InterfaceC25636OooO0Oo> abstractC25434OooO00o2 = abstractC25434OooO00o;
        try {
            C25732OooO0O0.OooO00o();
            OooOo00.OooO0o(AbstractC25434OooO00o.ooOO(abstractC25434OooO00o2));
            InterfaceC25636OooO0Oo interfaceC25636OooO0OoOooo000 = abstractC25434OooO00o2.Oooo000();
            OooOoo0(interfaceC25636OooO0OoOooo000);
            Drawable drawableOooO0O0 = this.f87520OooOOoo.OooO0O0(interfaceC25636OooO0OoOooo000);
            if (drawableOooO0O0 != null) {
                return drawableOooO0O0;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + interfaceC25636OooO0OoOooo000);
        } finally {
            C25732OooO0O0.OooO00o();
        }
    }

    @Override // o00oO00o.AbstractC25477OooO00o
    public final AbstractC25434OooO00o<InterfaceC25636OooO0Oo> OooO0oo() {
        InterfaceC25397OooO00o interfaceC25397OooO00o;
        C25732OooO0O0.OooO00o();
        try {
            C25670OooOOOO c25670OooOOOO = this.f87522OooOo00;
            if (c25670OooOOOO != null && (interfaceC25397OooO00o = this.f87521OooOo0) != null) {
                AbstractC25434OooO00o<InterfaceC25636OooO0Oo> abstractC25434OooO00o = c25670OooOOOO.get(interfaceC25397OooO00o);
                if (abstractC25434OooO00o == null || ((OooOO0O) abstractC25434OooO00o.Oooo000().o000()).f87515OooO0OO) {
                    return abstractC25434OooO00o;
                }
                abstractC25434OooO00o.close();
                return null;
            }
            return null;
        } finally {
            C25732OooO0O0.OooO00o();
        }
    }

    @Override // o00oO00o.AbstractC25477OooO00o
    public final InterfaceC25467OooO0o0<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> OooOO0() {
        C25732OooO0O0.OooO00o();
        if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
            C25438OooO00o.OooO0Oo(C25644OooO0OO.class, Integer.valueOf(System.identityHashCode(this)), "controller %x: getDataSource");
        }
        InterfaceC25467OooO0o0<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> interfaceC25467OooO0o0 = this.f87523OooOo0O.get();
        C25732OooO0O0.OooO00o();
        return interfaceC25467OooO0o0;
    }

    @Override // o00oO00o.AbstractC25477OooO00o
    public final int OooOO0O(AbstractC25434OooO00o<InterfaceC25636OooO0Oo> abstractC25434OooO00o) {
        AbstractC25434OooO00o<InterfaceC25636OooO0Oo> abstractC25434OooO00o2 = abstractC25434OooO00o;
        if (abstractC25434OooO00o2 == null || !abstractC25434OooO00o2.Oooo00o()) {
            return 0;
        }
        return System.identityHashCode(abstractC25434OooO00o2.f86712OooOo.OooO00o());
    }

    @Override // o00oO00o.AbstractC25477OooO00o
    public final OooO OooOO0o(Object obj) {
        AbstractC25434OooO00o abstractC25434OooO00o = (AbstractC25434OooO00o) obj;
        OooOo00.OooO0o(AbstractC25434OooO00o.ooOO(abstractC25434OooO00o));
        return ((InterfaceC25636OooO0Oo) abstractC25434OooO00o.Oooo000()).o00O0O();
    }

    @Override // o00oO00o.AbstractC25477OooO00o
    public final Map OooOOoo(OooO oooO) {
        OooO oooO2 = oooO;
        if (oooO2 == null) {
            return null;
        }
        return oooO2.getExtras();
    }

    @Override // o00oO00o.AbstractC25477OooO00o
    public final void OooOo0(Object obj) {
        synchronized (this) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00oO00o.AbstractC25477OooO00o
    public final void OooOo0o(Drawable drawable) {
        if (drawable instanceof InterfaceC25472OooO00o) {
            ((InterfaceC25472OooO00o) drawable).OooO00o();
        }
    }

    @Override // o00oO00o.AbstractC25477OooO00o
    public final void OooOoO0(AbstractC25434OooO00o<InterfaceC25636OooO0Oo> abstractC25434OooO00o) {
        AbstractC25434OooO00o.OooOooo(abstractC25434OooO00o);
    }

    public final void OooOoo0(InterfaceC25636OooO0Oo interfaceC25636OooO0Oo) {
    }

    @Override // o00oO00o.AbstractC25477OooO00o
    public final String toString() {
        C25431OooO0oo.OooO00o oooO00oOooO0O0 = C25431OooO0oo.OooO0O0(this);
        oooO00oOooO0O0.OooO0OO(super.toString(), "super");
        oooO00oOooO0O0.OooO0OO(this.f87523OooOo0O, "dataSourceSupplier");
        return oooO00oOooO0O0.toString();
    }
}
