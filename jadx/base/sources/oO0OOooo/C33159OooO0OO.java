package oO0OOooo;

import OooO0Oo.OooOO0O;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o00Oo0;
import o0O0oooO.C26265OooOOOO;
import o0O0oooO.C26266OooOOOo;
import o0OoOO00.C29024Oooo0o0;
import oO0Oo0oo.InterfaceC33226OooO0O0;
import oO0OoOO0.C33287OooO0o0;
import oO0Ooooo.InterfaceC33522OooO00o;

/* JADX INFO: renamed from: oO0OOooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33159OooO0OO implements InterfaceC33226OooO0O0<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooOO0O f119897OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOO0O f119898OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Object f119899OooOoO = new Object();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile C26266OooOOOo f119900OooOoO0;

    /* JADX INFO: renamed from: oO0OOooo.OooO0OO$OooO00o */
    public interface OooO00o {
        C26265OooOOOO OooO0o0();
    }

    /* JADX INFO: renamed from: oO0OOooo.OooO0OO$OooO0O0 */
    public static final class OooO0O0 extends AbstractC22019Ooooooo {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final C26266OooOOOo f119901OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final C33161OooO0o f119902OooO0o0;

        public OooO0O0(C26266OooOOOo c26266OooOOOo, C33161OooO0o c33161OooO0o) {
            this.f119901OooO0Oo = c26266OooOOOo;
            this.f119902OooO0o0 = c33161OooO0o;
        }

        @Override // androidx.lifecycle.AbstractC22019Ooooooo
        public final void OooO0OO() {
            ((C33287OooO0o0) ((InterfaceC20303OooO0OO) C29024Oooo0o0.OooO00o(InterfaceC20303OooO0OO.class, this.f119901OooO0Oo)).OooO0O0()).OooO00o();
        }
    }

    /* JADX INFO: renamed from: oO0OOooo.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public interface InterfaceC20303OooO0OO {
        InterfaceC33522OooO00o OooO0O0();
    }

    public C33159OooO0OO(OooOO0O oooOO0O) {
        this.f119898OooOo0o = oooOO0O;
        this.f119897OooOo = oooOO0O;
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        if (this.f119900OooOoO0 == null) {
            synchronized (this.f119899OooOoO) {
                if (this.f119900OooOoO0 == null) {
                    this.f119900OooOoO0 = ((OooO0O0) new o00Oo0(this.f119898OooOo0o, new C33158OooO0O0(this.f119897OooOo)).OooO00o(OooO0O0.class)).f119901OooO0Oo;
                }
            }
        }
        return this.f119900OooOoO0;
    }
}
