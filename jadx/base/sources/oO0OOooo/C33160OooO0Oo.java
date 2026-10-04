package oO0OOooo;

import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0O0oooO.C26269OooOOoo;
import oO0Oo0oo.InterfaceC33226OooO0O0;

/* JADX INFO: renamed from: oO0OOooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33160OooO0Oo implements InterfaceC33226OooO0O0<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Object f119903OooOo = new Object();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public volatile C26269OooOOoo f119904OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO.OooO00o f119905OooOoO0;

    public C33160OooO0Oo(AbstractApplicationC26277OooOoOO.OooO00o oooO00o) {
        this.f119905OooOoO0 = oooO00o;
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        if (this.f119904OooOo0o == null) {
            synchronized (this.f119903OooOo) {
                try {
                    if (this.f119904OooOo0o == null) {
                        this.f119904OooOo0o = new C26269OooOOoo(new o0O000o.OooO0O0(AbstractApplicationC26277OooOoOO.this));
                    }
                } finally {
                }
            }
        }
        return this.f119904OooOo0o;
    }
}
