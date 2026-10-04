package o00O0OOo;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import o00O0O0o.OooOO0O;
import o00O0Oo0.AbstractC24863OooO0OO;
import o00O0Oo0.C24861OooO00o;
import o00O0Oo0.C24862OooO0O0;
import o00O0Oo0.C24864OooO0Oo;
import o00O0Oo0.C24865OooO0o;
import o00O0Oo0.C24866OooO0o0;
import o00O0Oo0.C24867OooO0oO;
import o00O0Oo0.C24868OooO0oo;
import o00oOOo.InterfaceC25590OooO00o;
import oo0oOO0.C35003OooO0oO;

/* JADX INFO: renamed from: o00O0OOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24855OooO0Oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f84404OooO0Oo = OooOO0O.OooO0o0("WorkConstraintsTracker");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC24854OooO0OO f84405OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC24863OooO0OO<?>[] f84406OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f84407OooO0OO;

    public C24855OooO0Oo(Context context, InterfaceC25590OooO00o interfaceC25590OooO00o, InterfaceC24854OooO0OO interfaceC24854OooO0OO) {
        Context applicationContext = context.getApplicationContext();
        this.f84405OooO00o = interfaceC24854OooO0OO;
        this.f84406OooO0O0 = new AbstractC24863OooO0OO[]{new C24861OooO00o(C35003OooO0oO.OooO00o(applicationContext, interfaceC25590OooO00o).f125702OooO00o), new C24862OooO0O0(C35003OooO0oO.OooO00o(applicationContext, interfaceC25590OooO00o).f125703OooO0O0), new C24868OooO0oo(C35003OooO0oO.OooO00o(applicationContext, interfaceC25590OooO00o).f125705OooO0Oo), new C24864OooO0Oo(C35003OooO0oO.OooO00o(applicationContext, interfaceC25590OooO00o).f125704OooO0OO), new C24867OooO0oO(C35003OooO0oO.OooO00o(applicationContext, interfaceC25590OooO00o).f125704OooO0OO), new C24865OooO0o(C35003OooO0oO.OooO00o(applicationContext, interfaceC25590OooO00o).f125704OooO0OO), new C24866OooO0o0(C35003OooO0oO.OooO00o(applicationContext, interfaceC25590OooO00o).f125704OooO0OO)};
        this.f84407OooO0OO = new Object();
    }

    public final boolean OooO00o(String str) {
        synchronized (this.f84407OooO0OO) {
            try {
                for (AbstractC24863OooO0OO<?> abstractC24863OooO0OO : this.f84406OooO0O0) {
                    Object obj = abstractC24863OooO0OO.f84431OooO0O0;
                    if (obj != null && abstractC24863OooO0OO.OooO0OO(obj) && abstractC24863OooO0OO.f84430OooO00o.contains(str)) {
                        OooOO0O.OooO0OO().OooO00o(f84404OooO0Oo, "Work " + str + " constrained by " + abstractC24863OooO0OO.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0(Collection collection) {
        synchronized (this.f84407OooO0OO) {
            try {
                for (AbstractC24863OooO0OO<?> abstractC24863OooO0OO : this.f84406OooO0O0) {
                    if (abstractC24863OooO0OO.f84433OooO0Oo != null) {
                        abstractC24863OooO0OO.f84433OooO0Oo = null;
                        abstractC24863OooO0OO.OooO0o0(null, abstractC24863OooO0OO.f84431OooO0O0);
                    }
                }
                for (AbstractC24863OooO0OO<?> abstractC24863OooO0OO2 : this.f84406OooO0O0) {
                    abstractC24863OooO0OO2.OooO0Oo(collection);
                }
                for (AbstractC24863OooO0OO<?> abstractC24863OooO0OO3 : this.f84406OooO0O0) {
                    if (abstractC24863OooO0OO3.f84433OooO0Oo != this) {
                        abstractC24863OooO0OO3.f84433OooO0Oo = this;
                        abstractC24863OooO0OO3.OooO0o0(this, abstractC24863OooO0OO3.f84431OooO0O0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO() {
        synchronized (this.f84407OooO0OO) {
            try {
                for (AbstractC24863OooO0OO<?> abstractC24863OooO0OO : this.f84406OooO0O0) {
                    ArrayList arrayList = abstractC24863OooO0OO.f84430OooO00o;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        abstractC24863OooO0OO.f84432OooO0OO.OooO0O0(abstractC24863OooO0OO);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
