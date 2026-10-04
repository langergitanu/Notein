package oO000Oo;

import com.google.common.base.Preconditions;
import oO000Oo.InterfaceC31948OooOOoo;
import oO000Oo.OooOO0O;
import oO0OOo0o.AbstractC33059OooO0O0;
import oO0OOo0o.C33065OooOOOo;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class o00000 extends AbstractC33059OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public InterfaceC31946OooOOo f114317OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo00 f114318OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33101OoooOO0<?, ?> f114319OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33094OoooO f114320OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oO0OOo0o.OooO0OO f114321OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0O.OooO00o.C20191OooO00o f114322OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oO0OOo0o.OooO[] f114324OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f114326OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public C31968OooOooo f114327OooOO0O;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Object f114325OooO0oo = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33065OooOOOo f114323OooO0o0 = C33065OooOOOo.OooOOoo();

    public o00000(OooOo00 oooOo00, C33101OoooOO0 c33101OoooOO0, C33094OoooO c33094OoooO, oO0OOo0o.OooO0OO oooO0OO, OooOO0O.OooO00o.C20191OooO00o c20191OooO00o, oO0OOo0o.OooO[] oooOArr) {
        this.f114318OooO00o = oooOo00;
        this.f114319OooO0O0 = c33101OoooOO0;
        this.f114320OooO0OO = c33094OoooO;
        this.f114321OooO0Oo = oooO0OO;
        this.f114322OooO0o = c20191OooO00o;
        this.f114324OooO0oO = oooOArr;
    }

    @Override // oO0OOo0o.AbstractC33059OooO0O0.OooO00o
    public final void OooO00o(C33094OoooO c33094OoooO) {
        Preconditions.checkState(!this.f114326OooOO0, "apply() or fail() already called");
        Preconditions.checkNotNull(c33094OoooO, "headers");
        C33094OoooO c33094OoooO2 = this.f114320OooO0OO;
        c33094OoooO2.OooO0Oo(c33094OoooO);
        C33065OooOOOo c33065OooOOOo = this.f114323OooO0o0;
        C33065OooOOOo c33065OooOOOoOooO0OO = c33065OooOOOo.OooO0OO();
        try {
            InterfaceC31946OooOOo interfaceC31946OooOOoOooO0Oo = this.f114318OooO00o.OooO0Oo(this.f114319OooO0O0, c33094OoooO2, this.f114321OooO0Oo, this.f114324OooO0oO);
            c33065OooOOOo.OooOooo(c33065OooOOOoOooO0OO);
            OooO0OO(interfaceC31946OooOOoOooO0Oo);
        } catch (Throwable th) {
            c33065OooOOOo.OooOooo(c33065OooOOOoOooO0OO);
            throw th;
        }
    }

    @Override // oO0OOo0o.AbstractC33059OooO0O0.OooO00o
    public final void OooO0O0(oO0OOo0o.o00Oo0 o00oo02) {
        Preconditions.checkArgument(!o00oo02.OooO0o(), "Cannot fail with OK status");
        Preconditions.checkState(!this.f114326OooOO0, "apply() or fail() already called");
        OooO0OO(new C31980Oooo0O0(C31989OoooO0O.OooO0oo(o00oo02), InterfaceC31948OooOOoo.OooO00o.f114034OooOo0o, this.f114324OooO0oO));
    }

    public final void OooO0OO(InterfaceC31946OooOOo interfaceC31946OooOOo) {
        boolean z;
        Preconditions.checkState(!this.f114326OooOO0, "already finalized");
        this.f114326OooOO0 = true;
        synchronized (this.f114325OooO0oo) {
            try {
                if (this.f114317OooO == null) {
                    this.f114317OooO = interfaceC31946OooOOo;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            OooOO0O.OooO00o oooO00o = OooOO0O.OooO00o.this;
            if (oooO00o.f113978OooO0O0.decrementAndGet() == 0) {
                OooOO0O.OooO00o.OooO0oO(oooO00o);
                return;
            }
            return;
        }
        Preconditions.checkState(this.f114327OooOO0O != null, "delayedStream is null");
        Oooo000 oooo000OooOOo = this.f114327OooOO0O.OooOOo(interfaceC31946OooOOo);
        if (oooo000OooOOo != null) {
            oooo000OooOOo.run();
        }
        OooOO0O.OooO00o oooO00o2 = OooOO0O.OooO00o.this;
        if (oooO00o2.f113978OooO0O0.decrementAndGet() == 0) {
            OooOO0O.OooO00o.OooO0oO(oooO00o2);
        }
    }
}
