package o00o0oo;

/* JADX INFO: renamed from: o00o0oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25465OooO0Oo<T> implements InterfaceC25468OooO0oO<T> {
    @Override // o00o0oo.InterfaceC25468OooO0oO
    public final void OooO00o(InterfaceC25467OooO0o0<T> interfaceC25467OooO0o0) {
        boolean zOooO0OO = interfaceC25467OooO0o0.OooO0OO();
        try {
            OooO0o0(interfaceC25467OooO0o0);
        } finally {
            if (zOooO0OO) {
                interfaceC25467OooO0o0.close();
            }
        }
    }

    @Override // o00o0oo.InterfaceC25468OooO0oO
    public void OooO0O0(InterfaceC25467OooO0o0<T> interfaceC25467OooO0o0) {
    }

    @Override // o00o0oo.InterfaceC25468OooO0oO
    public final void OooO0OO(InterfaceC25467OooO0o0<T> interfaceC25467OooO0o0) {
        try {
            OooO0Oo(interfaceC25467OooO0o0);
        } finally {
            interfaceC25467OooO0o0.close();
        }
    }

    public abstract void OooO0Oo(InterfaceC25467OooO0o0<T> interfaceC25467OooO0o0);

    public abstract void OooO0o0(InterfaceC25467OooO0o0<T> interfaceC25467OooO0o0);
}
