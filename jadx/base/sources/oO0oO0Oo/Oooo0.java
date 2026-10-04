package oO0oO0Oo;

import OooOOO0.AbstractC20449OooO0Oo;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Oooo0 extends AbstractC34036OooOoOO implements InterfaceC34073o00000oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f122377OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f122378OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC34019OooO0oO f122379OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f122380OooOoO0;

    public Oooo0(int i, int i2, int i3, InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        if (interfaceC34019OooO0oO == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "invalid tag class: "));
        }
        this.f122378OooOo0o = interfaceC34019OooO0oO instanceof InterfaceC34017OooO0o ? 1 : i;
        this.f122377OooOo = i2;
        this.f122380OooOoO0 = i3;
        this.f122379OooOoO = interfaceC34019OooO0oO;
    }

    public static AbstractC34036OooOoOO OooOOo0(int i, int i2, C34020OooO0oo c34020OooO0oo) {
        C34071o00000o0 c34071o00000o0 = c34020OooO0oo.f122326OooO0O0 == 1 ? new C34071o00000o0(3, i, i2, c34020OooO0oo.OooO0O0(0)) : new C34071o00000o0(4, i, i2, C34069o000000o.OooO00o(c34020OooO0oo));
        return i != 64 ? c34071o00000o0 : new o0O0O00(c34071o00000o0);
    }

    public static Oooo0 OooOOoo(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        if (interfaceC34019OooO0oO == null || (interfaceC34019OooO0oO instanceof Oooo0)) {
            return (Oooo0) interfaceC34019OooO0oO;
        }
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = interfaceC34019OooO0oO.OooO0o();
        if (abstractC34036OooOoOOOooO0o instanceof Oooo0) {
            return (Oooo0) abstractC34036OooOoOOOooO0o;
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(interfaceC34019OooO0oO.getClass().getName()));
    }

    @Override // oO0oO0Oo.InterfaceC34073o00000oo
    public final AbstractC34036OooOoOO OooO0O0() {
        return this;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (abstractC34036OooOoOO instanceof AbstractC34013OooO00o) {
            return abstractC34036OooOoOO.OooOO0o(this);
        }
        if (!(abstractC34036OooOoOO instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) abstractC34036OooOoOO;
        if (this.f122380OooOoO0 != oooo0.f122380OooOoO0 || this.f122377OooOo != oooo0.f122377OooOo) {
            return false;
        }
        if (this.f122378OooOo0o != oooo0.f122378OooOo0o && OooOo0() != oooo0.OooOo0()) {
            return false;
        }
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = this.f122379OooOoO.OooO0o();
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o2 = oooo0.f122379OooOoO.OooO0o();
        if (abstractC34036OooOoOOOooO0o == abstractC34036OooOoOOOooO0o2) {
            return true;
        }
        if (OooOo0()) {
            return abstractC34036OooOoOOOooO0o.OooO0oo(abstractC34036OooOoOOOooO0o2);
        }
        try {
            return Arrays.equals(getEncoded(), oooo0.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOO() {
        return new C34079o0ooOoO(this.f122378OooOo0o, this.f122377OooOo, this.f122380OooOoO0, this.f122379OooOoO);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOo() {
        return new C34071o00000o0(this.f122378OooOo0o, this.f122377OooOo, this.f122380OooOoO0, this.f122379OooOoO);
    }

    public final AbstractC34036OooOoOO OooOOo(boolean z, AbstractC34046Oooo0o abstractC34046Oooo0o) {
        InterfaceC34019OooO0oO interfaceC34019OooO0oO = this.f122379OooOoO;
        if (z) {
            if (!OooOo0()) {
                throw new IllegalStateException("object explicit - implicit expected.");
            }
            AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = interfaceC34019OooO0oO.OooO0o();
            abstractC34046Oooo0o.OooO00o(abstractC34036OooOoOOOooO0o);
            return abstractC34036OooOoOOOooO0o;
        }
        int i = this.f122378OooOo0o;
        if (1 == i) {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o2 = interfaceC34019OooO0oO.OooO0o();
        if (i == 3) {
            return abstractC34046Oooo0o.OooO0OO(OooOo0O(abstractC34036OooOoOOOooO0o2));
        }
        if (i == 4) {
            return abstractC34036OooOoOOOooO0o2 instanceof AbstractC34039OooOooO ? abstractC34046Oooo0o.OooO0OO((AbstractC34039OooOooO) abstractC34036OooOoOOOooO0o2) : abstractC34046Oooo0o.OooO0Oo((C34075o00o0O) abstractC34036OooOoOOOooO0o2);
        }
        abstractC34046Oooo0o.OooO00o(abstractC34036OooOoOOOooO0o2);
        return abstractC34036OooOoOOOooO0o2;
    }

    public final boolean OooOo0() {
        int i = this.f122378OooOo0o;
        return i == 1 || i == 3;
    }

    public final AbstractC34036OooOoOO OooOo00() {
        if (128 == this.f122377OooOo) {
            return this.f122379OooOoO.OooO0o();
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public abstract AbstractC34039OooOooO OooOo0O(AbstractC34036OooOoOO abstractC34036OooOoOO);

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return (((this.f122377OooOo * 7919) ^ this.f122380OooOoO0) ^ (OooOo0() ? 15 : 240)) ^ this.f122379OooOoO.OooO0o().hashCode();
    }

    public final String toString() {
        return AbstractC20449OooO0Oo.OooOo0(this.f122377OooOo, this.f122380OooOoO0) + this.f122379OooOoO;
    }

    public Oooo0(boolean z, int i, InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        this(z ? 1 : 2, 128, i, interfaceC34019OooO0oO);
    }
}
