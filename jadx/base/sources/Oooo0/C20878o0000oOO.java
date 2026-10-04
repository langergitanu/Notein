package Oooo0;

import OooOooO.C20737OooOOOO;
import OooOooO.C20738OooOOOo;
import OooOooO.InterfaceC20736OooOOO0;
import Oooo0oO.InterfaceC21063OoooO0O;
import android.content.Context;
import o0ooOO0.ComponentCallbacks2C31538OoooO0;

/* JADX INFO: renamed from: Oooo0.o0000oOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20878o0000oOO implements InterfaceC21063OoooO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f60066OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f60067OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f60068OooO0OO;

    public /* synthetic */ C20878o0000oOO(int i, Object obj, Object obj2) {
        this.f60066OooO00o = i;
        this.f60067OooO0O0 = obj;
        this.f60068OooO0OO = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oooo0oO.InterfaceC21063OoooO0O
    public final void dispose() {
        switch (this.f60066OooO00o) {
            case 0:
                Oooo0oO.o00oO0O o00oo0o = (Oooo0oO.o00oO0O) this.f60067OooO0O0;
                C20738OooOOOo c20738OooOOOo = (C20738OooOOOo) o00oo0o.getValue();
                if (c20738OooOOOo != null) {
                    C20737OooOOOO c20737OooOOOO = new C20737OooOOOO(c20738OooOOOo);
                    InterfaceC20736OooOOO0 interfaceC20736OooOOO0 = (InterfaceC20736OooOOO0) this.f60068OooO0OO;
                    if (interfaceC20736OooOOO0 != null) {
                        interfaceC20736OooOOO0.OooO00o(c20737OooOOOO);
                    }
                    o00oo0o.setValue(null);
                }
                break;
            default:
                ((Context) this.f60067OooO0O0).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C31538OoooO0) this.f60068OooO0OO);
                break;
        }
    }
}
