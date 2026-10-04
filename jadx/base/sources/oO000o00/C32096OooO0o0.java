package oO000o00;

import com.google.common.base.Preconditions;
import oO000Oo.o0000O00;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.OooOOO;
import oO0OOo0o.o00Oo0;

/* JADX INFO: renamed from: oO000o00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32096OooO0o0 extends oO000o00.OooO0O0 {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final OooO0OO f114982OooOOOO = new OooO0OO();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public AbstractC33087Oooo0o0 f114983OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f114984OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AbstractC33087Oooo0o0.AbstractC33089OooO0o0 f114985OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public AbstractC33087Oooo0o0.OooO0OO f114986OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public AbstractC33087Oooo0o0.OooO0OO f114987OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public AbstractC33087Oooo0o0 f114988OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooOOO f114989OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f114990OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public AbstractC33087Oooo0o0.OooOO0 f114991OooOOO0;

    /* JADX INFO: renamed from: oO000o00.OooO0o0$OooO00o */
    public class OooO00o extends AbstractC33087Oooo0o0 {
        public OooO00o() {
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0
        public final void OooO0OO(o00Oo0 o00oo02) {
            C32096OooO0o0.this.f114985OooO0oO.OooO0o(OooOOO.f119555OooOoO0, new AbstractC33087Oooo0o0.C33088OooO0Oo(AbstractC33087Oooo0o0.OooO0o.OooO00o(o00oo02)));
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0
        public final void OooO0Oo(AbstractC33087Oooo0o0.C33091OooO0oo c33091OooO0oo) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0
        public final void OooO0o() {
        }
    }

    /* JADX INFO: renamed from: oO000o00.OooO0o0$OooO0O0 */
    public class OooO0O0 extends oO000o00.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public AbstractC33087Oooo0o0 f114993OooO00o;

        public OooO0O0() {
        }

        @Override // oO000o00.OooO0OO, oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
        public final void OooO0o(OooOOO oooOOO, AbstractC33087Oooo0o0.OooOO0 oooOO02) {
            AbstractC33087Oooo0o0 abstractC33087Oooo0o0 = this.f114993OooO00o;
            C32096OooO0o0 c32096OooO0o0 = C32096OooO0o0.this;
            AbstractC33087Oooo0o0 abstractC33087Oooo0o02 = c32096OooO0o0.f114988OooOO0O;
            OooOOO oooOOO2 = OooOOO.f119552OooOo;
            if (abstractC33087Oooo0o0 == abstractC33087Oooo0o02) {
                Preconditions.checkState(c32096OooO0o0.f114990OooOOO, "there's pending lb while current lb has been out of READY");
                c32096OooO0o0.f114989OooOO0o = oooOOO;
                c32096OooO0o0.f114991OooOOO0 = oooOO02;
                if (oooOOO == oooOOO2) {
                    c32096OooO0o0.OooO0oo();
                    return;
                }
                return;
            }
            if (abstractC33087Oooo0o0 == c32096OooO0o0.f114983OooO) {
                boolean z = oooOOO == oooOOO2;
                c32096OooO0o0.f114990OooOOO = z;
                if (z || abstractC33087Oooo0o02 == c32096OooO0o0.f114984OooO0o) {
                    c32096OooO0o0.f114985OooO0oO.OooO0o(oooOOO, oooOO02);
                } else {
                    c32096OooO0o0.OooO0oo();
                }
            }
        }

        @Override // oO000o00.OooO0OO
        public final AbstractC33087Oooo0o0.AbstractC33089OooO0o0 OooO0oO() {
            return C32096OooO0o0.this.f114985OooO0oO;
        }
    }

    /* JADX INFO: renamed from: oO000o00.OooO0o0$OooO0OO */
    public class OooO0OO extends AbstractC33087Oooo0o0.OooOO0 {
        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0
        public final AbstractC33087Oooo0o0.OooO0o OooO00o(o0000O00 o0000o00) {
            return AbstractC33087Oooo0o0.OooO0o.f119638OooO0o0;
        }

        public final String toString() {
            return "BUFFER_PICKER";
        }
    }

    public C32096OooO0o0(oO000o00.OooO0OO oooO0OO) {
        OooO00o oooO00o = new OooO00o();
        this.f114984OooO0o = oooO00o;
        this.f114983OooO = oooO00o;
        this.f114988OooOO0O = oooO00o;
        this.f114985OooO0oO = (AbstractC33087Oooo0o0.AbstractC33089OooO0o0) Preconditions.checkNotNull(oooO0OO, "helper");
    }

    public final void OooO(AbstractC33087Oooo0o0.OooO0OO oooO0OO) {
        Preconditions.checkNotNull(oooO0OO, "newBalancerFactory");
        if (oooO0OO.equals(this.f114987OooOO0)) {
            return;
        }
        this.f114988OooOO0O.OooO0o();
        this.f114988OooOO0O = this.f114984OooO0o;
        this.f114987OooOO0 = null;
        this.f114989OooOO0o = OooOOO.f119553OooOo0o;
        this.f114991OooOOO0 = f114982OooOOOO;
        if (oooO0OO.equals(this.f114986OooO0oo)) {
            return;
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        AbstractC33087Oooo0o0 abstractC33087Oooo0o0OooO00o = oooO0OO.OooO00o(oooO0O0);
        oooO0O0.f114993OooO00o = abstractC33087Oooo0o0OooO00o;
        this.f114988OooOO0O = abstractC33087Oooo0o0OooO00o;
        this.f114987OooOO0 = oooO0OO;
        if (this.f114990OooOOO) {
            return;
        }
        OooO0oo();
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final void OooO0o() {
        this.f114988OooOO0O.OooO0o();
        this.f114983OooO.OooO0o();
    }

    @Override // oO000o00.OooO0O0
    public final AbstractC33087Oooo0o0 OooO0oO() {
        AbstractC33087Oooo0o0 abstractC33087Oooo0o0 = this.f114988OooOO0O;
        return abstractC33087Oooo0o0 == this.f114984OooO0o ? this.f114983OooO : abstractC33087Oooo0o0;
    }

    public final void OooO0oo() {
        this.f114985OooO0oO.OooO0o(this.f114989OooOO0o, this.f114991OooOOO0);
        this.f114983OooO.OooO0o();
        this.f114983OooO = this.f114988OooOO0O;
        this.f114986OooO0oo = this.f114987OooOO0;
        this.f114988OooOO0O = this.f114984OooO0o;
        this.f114987OooOO0 = null;
    }
}
