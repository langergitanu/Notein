package oO0oO0Oo;

import OooOOO0.AbstractC20449OooO0Oo;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34022OooOO0O extends AbstractC34036OooOoOO {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO00o f122329OooOoo0 = new OooO00o(AbstractC34022OooOO0O.class);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34029OooOOo0 f122330OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34032OooOo0O f122331OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f122332OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AbstractC34036OooOoOO f122333OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AbstractC34036OooOoOO f122334OooOoOO;

    /* JADX INFO: renamed from: oO0oO0Oo.OooOO0O$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0OO(AbstractC34039OooOooO abstractC34039OooOooO) {
            return abstractC34039OooOooO.OooOo();
        }
    }

    public AbstractC34022OooOO0O(C34032OooOo0O c34032OooOo0O, C34029OooOOo0 c34029OooOOo0, AbstractC34036OooOoOO abstractC34036OooOoOO, int i, AbstractC34036OooOoOO abstractC34036OooOoOO2) {
        this.f122331OooOo0o = c34032OooOo0O;
        this.f122330OooOo = c34029OooOOo0;
        this.f122333OooOoO0 = abstractC34036OooOoOO;
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "invalid encoding value: "));
        }
        this.f122332OooOoO = i;
        if (i != 1) {
            if (i == 2 && !AbstractC34015OooO0OO.class.isInstance(abstractC34036OooOoOO2)) {
                throw new IllegalStateException("unexpected object: ".concat(abstractC34036OooOoOO2.getClass().getName()));
            }
        } else if (!AbstractC34033OooOo0o.class.isInstance(abstractC34036OooOoOO2)) {
            throw new IllegalStateException("unexpected object: ".concat(abstractC34036OooOoOO2.getClass().getName()));
        }
        this.f122334OooOoOO = abstractC34036OooOoOO2;
    }

    public static AbstractC34036OooOoOO OooOOo(AbstractC34039OooOooO abstractC34039OooOooO, int i) {
        if (abstractC34039OooOooO.size() > i) {
            return abstractC34039OooOooO.OooOo0(i).OooO0o();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOOO0(40, z);
        OooOOo0().OooO(c34035OooOoO0, false);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        AbstractC34022OooOO0O abstractC34022OooOO0O;
        Object obj;
        C34032OooOo0O c34032OooOo0O;
        if (this == abstractC34036OooOoOO) {
            return true;
        }
        if (!(abstractC34036OooOoOO instanceof AbstractC34022OooOO0O) || ((c34032OooOo0O = this.f122331OooOo0o) != (obj = (abstractC34022OooOO0O = (AbstractC34022OooOO0O) abstractC34036OooOoOO).f122331OooOo0o) && (c34032OooOo0O == null || obj == null || !c34032OooOo0O.equals(obj)))) {
            return false;
        }
        C34029OooOOo0 c34029OooOOo0 = this.f122330OooOo;
        C34029OooOOo0 c34029OooOOo02 = abstractC34022OooOO0O.f122330OooOo;
        if (c34029OooOOo0 != c34029OooOOo02 && (c34029OooOOo0 == null || c34029OooOOo02 == null || !c34029OooOOo0.equals(c34029OooOOo02))) {
            return false;
        }
        AbstractC34036OooOoOO abstractC34036OooOoOO2 = this.f122333OooOoO0;
        AbstractC34036OooOoOO abstractC34036OooOoOO3 = abstractC34022OooOO0O.f122333OooOoO0;
        return (abstractC34036OooOoOO2 == abstractC34036OooOoOO3 || !(abstractC34036OooOoOO2 == null || abstractC34036OooOoOO3 == null || !abstractC34036OooOoOO2.equals(abstractC34036OooOoOO3))) && this.f122332OooOoO == abstractC34022OooOO0O.f122332OooOoO && this.f122334OooOoOO.OooOO0o(abstractC34022OooOO0O.f122334OooOoOO);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return true;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) throws IOException {
        return OooOOo0().OooOO0O(z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOO() {
        return new C34065Oooooo(this.f122331OooOo0o, this.f122330OooOo, this.f122333OooOoO0, this.f122332OooOoO, this.f122334OooOoOO);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOo() {
        return new o000000O(this.f122331OooOo0o, this.f122330OooOo, this.f122333OooOoO0, this.f122332OooOoO, this.f122334OooOoOO);
    }

    public abstract AbstractC34039OooOooO OooOOo0();

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        C34032OooOo0O c34032OooOo0O = this.f122331OooOo0o;
        int iHashCode = c34032OooOo0O == null ? 0 : c34032OooOo0O.hashCode();
        C34029OooOOo0 c34029OooOOo0 = this.f122330OooOo;
        int iHashCode2 = iHashCode ^ (c34029OooOOo0 == null ? 0 : c34029OooOOo0.hashCode());
        AbstractC34036OooOoOO abstractC34036OooOoOO = this.f122333OooOoO0;
        return ((iHashCode2 ^ (abstractC34036OooOoOO != null ? abstractC34036OooOoOO.hashCode() : 0)) ^ this.f122332OooOoO) ^ this.f122334OooOoOO.hashCode();
    }

    public AbstractC34022OooOO0O(AbstractC34039OooOooO abstractC34039OooOooO) {
        int i;
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o;
        AbstractC34036OooOoOO abstractC34036OooOoOOOooOOo = OooOOo(abstractC34039OooOooO, 0);
        if (abstractC34036OooOoOOOooOOo instanceof C34032OooOo0O) {
            this.f122331OooOo0o = (C34032OooOo0O) abstractC34036OooOoOOOooOOo;
            abstractC34036OooOoOOOooOOo = OooOOo(abstractC34039OooOooO, 1);
            i = 1;
        } else {
            i = 0;
        }
        if (abstractC34036OooOoOOOooOOo instanceof C34029OooOOo0) {
            this.f122330OooOo = (C34029OooOOo0) abstractC34036OooOoOOOooOOo;
            i++;
            abstractC34036OooOoOOOooOOo = OooOOo(abstractC34039OooOooO, i);
        }
        if (!(abstractC34036OooOoOOOooOOo instanceof Oooo0)) {
            this.f122333OooOoO0 = abstractC34036OooOoOOOooOOo;
            i++;
            abstractC34036OooOoOOOooOOo = OooOOo(abstractC34039OooOooO, i);
        }
        if (abstractC34039OooOooO.size() != i + 1) {
            throw new IllegalArgumentException("input sequence too large");
        }
        if (abstractC34036OooOoOOOooOOo instanceof Oooo0) {
            Oooo0 oooo0 = (Oooo0) abstractC34036OooOoOOOooOOo;
            int i2 = oooo0.f122380OooOoO0;
            if (i2 >= 0 && i2 <= 2) {
                this.f122332OooOoO = i2;
                int i3 = oooo0.f122377OooOo;
                if (128 == i3) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            abstractC34036OooOoOOOooO0o = (AbstractC34033OooOo0o) AbstractC34033OooOo0o.f122360OooOo.OooO0o0(oooo0, false);
                        } else if (i2 == 2) {
                            abstractC34036OooOoOOOooO0o = (AbstractC34015OooO0OO) AbstractC34015OooO0OO.f122317OooOo.OooO0o0(oooo0, false);
                        } else {
                            throw new IllegalArgumentException("invalid tag: " + AbstractC20449OooO0Oo.OooOo0(i3, i2));
                        }
                    } else if (oooo0.OooOo0()) {
                        InterfaceC34019OooO0oO interfaceC34019OooO0oO = oooo0.f122379OooOoO;
                        abstractC34036OooOoOOOooO0o = (interfaceC34019OooO0oO instanceof OooOo00 ? (OooOo00) interfaceC34019OooO0oO : interfaceC34019OooO0oO.OooO0o()).OooO0o();
                    } else {
                        throw new IllegalStateException("object implicit - explicit expected.");
                    }
                    this.f122334OooOoOO = abstractC34036OooOoOOOooO0o;
                    return;
                }
                throw new IllegalArgumentException("invalid tag: " + AbstractC20449OooO0Oo.OooOo0(i3, i2));
            }
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "invalid encoding value: "));
        }
        throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
    }
}
