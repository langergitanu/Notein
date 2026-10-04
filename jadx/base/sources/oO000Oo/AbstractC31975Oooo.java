package oO000Oo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import oO0OOo0o.o000oOoO;

/* JADX INFO: renamed from: oO000Oo.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31975Oooo extends oO0OOo0o.o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0OOo0o.o000oOoO f114157OooO00o;

    public AbstractC31975Oooo(oO0OOo0o.o000oOoO o000oooo2) {
        Preconditions.checkNotNull(o000oooo2, "delegate can not be null");
        this.f114157OooO00o = o000oooo2;
    }

    @Override // oO0OOo0o.o000oOoO
    public String OooO00o() {
        return this.f114157OooO00o.OooO00o();
    }

    @Override // oO0OOo0o.o000oOoO
    public final void OooO0O0() {
        this.f114157OooO00o.OooO0O0();
    }

    @Override // oO0OOo0o.o000oOoO
    public void OooO0OO() {
        this.f114157OooO00o.OooO0OO();
    }

    @Override // oO0OOo0o.o000oOoO
    @Deprecated
    public final void OooO0Oo(o000oOoO.AbstractC33116OooO0Oo abstractC33116OooO0Oo) {
        this.f114157OooO00o.OooO0Oo(abstractC33116OooO0Oo);
    }

    @Override // oO0OOo0o.o000oOoO
    public void OooO0o0(o000oOoO.AbstractC33116OooO0Oo abstractC33116OooO0Oo) {
        this.f114157OooO00o.OooO0o0(abstractC33116OooO0Oo);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", this.f114157OooO00o).toString();
    }
}
