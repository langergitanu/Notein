package oOo0oooO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import oO0Ooo.o0OoOo0;
import oO0OooO0.C33477OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O implements InterfaceC34588OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final o0OoOo0 f123924OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34588OooO0oO f123925OooOo0o;

    public OooOO0O(InterfaceC34588OooO0oO interfaceC34588OooO0oO, o0OoOo0 o0oooo02) {
        this.f123925OooOo0o = interfaceC34588OooO0oO;
        this.f123924OooOo = o0oooo02;
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final OooO0OO OooOOO0(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        if (((Boolean) this.f123924OooOo.invoke(fqName)).booleanValue()) {
            return this.f123925OooOo0o.OooOOO0(fqName);
        }
        return null;
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final boolean Oooo000(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        if (((Boolean) this.f123924OooOo.invoke(fqName)).booleanValue()) {
            return this.f123925OooOo0o.Oooo000(fqName);
        }
        return false;
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final boolean isEmpty() {
        InterfaceC34588OooO0oO interfaceC34588OooO0oO = this.f123925OooOo0o;
        if ((interfaceC34588OooO0oO instanceof Collection) && ((Collection) interfaceC34588OooO0oO).isEmpty()) {
            return false;
        }
        Iterator<OooO0OO> it = interfaceC34588OooO0oO.iterator();
        while (it.hasNext()) {
            C33477OooO0OO c33477OooO0OOOooO0OO = it.next().OooO0OO();
            if (c33477OooO0OOOooO0OO != null && ((Boolean) this.f123924OooOo.invoke(c33477OooO0OOOooO0OO)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<OooO0OO> iterator() {
        ArrayList arrayList = new ArrayList();
        for (OooO0OO oooO0OO : this.f123925OooOo0o) {
            C33477OooO0OO c33477OooO0OOOooO0OO = oooO0OO.OooO0OO();
            if (c33477OooO0OOOooO0OO != null && ((Boolean) this.f123924OooOo.invoke(c33477OooO0OOOooO0OO)).booleanValue()) {
                arrayList.add(oooO0OO);
            }
        }
        return arrayList.iterator();
    }
}
