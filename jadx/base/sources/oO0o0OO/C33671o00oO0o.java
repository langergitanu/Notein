package oO0o0OO;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: oO0o0OO.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33671o00oO0o extends o0ooOOo implements InterfaceC33623OooOo0O {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f121378OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33671o00oO0o(InterfaceC33672o00ooo interfaceC33672o00ooo) {
        super(true);
        boolean z = true;
        Oooo0oO(interfaceC33672o00ooo);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o0ooOOo.f121391OooOo;
        InterfaceC33618OooOOo0 interfaceC33618OooOOo0 = (InterfaceC33618OooOOo0) atomicReferenceFieldUpdater.get(this);
        C33617OooOOo c33617OooOOo = interfaceC33618OooOOo0 instanceof C33617OooOOo ? (C33617OooOOo) interfaceC33618OooOOo0 : null;
        if (c33617OooOOo == null) {
            z = false;
            break;
        }
        o0ooOOo o0oooooOooO0oo = c33617OooOOo.OooO0oo();
        while (!o0oooooOooO0oo.Oooo00O()) {
            InterfaceC33618OooOOo0 interfaceC33618OooOOo02 = (InterfaceC33618OooOOo0) atomicReferenceFieldUpdater.get(o0oooooOooO0oo);
            C33617OooOOo c33617OooOOo2 = interfaceC33618OooOOo02 instanceof C33617OooOOo ? (C33617OooOOo) interfaceC33618OooOOo02 : null;
            if (c33617OooOOo2 == null) {
                z = false;
                break;
            }
            o0oooooOooO0oo = c33617OooOOo2.OooO0oo();
        }
        this.f121378OooOoO0 = z;
    }

    @Override // oO0o0OO.InterfaceC33623OooOo0O
    public final boolean OooO00o(Throwable th) {
        return OoooO00(new C33620OooOo(false, th));
    }

    @Override // oO0o0OO.o0ooOOo
    public final boolean Oooo00O() {
        return this.f121378OooOoO0;
    }

    @Override // oO0o0OO.o0ooOOo
    public final boolean Oooo00o() {
        return true;
    }

    @Override // oO0o0OO.InterfaceC33623OooOo0O
    public final boolean complete() {
        return OoooO00(C32460OooOooO.f116667OooO00o);
    }
}
