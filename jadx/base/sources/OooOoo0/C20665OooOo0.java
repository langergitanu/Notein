package OooOoo0;

import OooOooO.C20737OooOOOO;
import OooOooO.C20738OooOOOo;
import OooOooO.InterfaceC20736OooOOO0;
import Oooo0oO.InterfaceC21063OoooO0O;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: OooOoo0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20665OooOo0 implements InterfaceC21063OoooO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O f59292OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Map f59293OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20736OooOOO0 f59294OooO0OO;

    public C20665OooOo0(Oooo0oO.o00oO0O o00oo0o, Map map, InterfaceC20736OooOOO0 interfaceC20736OooOOO0) {
        this.f59292OooO00o = o00oo0o;
        this.f59293OooO0O0 = map;
        this.f59294OooO0OO = interfaceC20736OooOOO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oooo0oO.InterfaceC21063OoooO0O
    public final void dispose() {
        Oooo0oO.o00oO0O o00oo0o = this.f59292OooO00o;
        C20738OooOOOo c20738OooOOOo = (C20738OooOOOo) o00oo0o.getValue();
        InterfaceC20736OooOOO0 interfaceC20736OooOOO0 = this.f59294OooO0OO;
        if (c20738OooOOOo != null) {
            interfaceC20736OooOOO0.OooO00o(new C20737OooOOOO(c20738OooOOOo));
            o00oo0o.setValue(null);
        }
        Map map = this.f59293OooO0O0;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            interfaceC20736OooOOO0.OooO00o(new C20737OooOOOO((C20738OooOOOo) it.next()));
        }
        map.clear();
    }
}
