package oO0oO00;

import java.lang.annotation.Annotation;
import java.util.List;
import oO0o.AbstractC33534OooOO0o;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOOO0;
import oO0o0O0o.C33596OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0oO00.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33980OoooOoo implements InterfaceC33531OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33531OooO0o0 f122202OooO00o;

    public AbstractC33980OoooOoo(InterfaceC33531OooO0o0 interfaceC33531OooO0o0) {
        this.f122202OooO00o = interfaceC33531OooO0o0;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Illegal index ", ", ");
        sbOooO0OO.append(OooO0oo());
        sbOooO0OO.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbOooO0OO.toString().toString());
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO0O0() {
        return false;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0OO(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        Integer numOooOOO0 = C33596OooOOo0.OooOOO0(name);
        if (numOooOOO0 != null) {
            return numOooOOO0.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final InterfaceC33531OooO0o0 OooO0Oo(int i) {
        if (i >= 0) {
            return this.f122202OooO00o;
        }
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Illegal index ", ", ");
        sbOooO0OO.append(OooO0oo());
        sbOooO0OO.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbOooO0OO.toString().toString());
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0o(int i) {
        return String.valueOf(i);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0o0() {
        return 1;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> OooO0oO(int i) {
        if (i >= 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Illegal index ", ", ");
        sbOooO0OO.append(OooO0oo());
        sbOooO0OO.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbOooO0OO.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC33980OoooOoo)) {
            return false;
        }
        AbstractC33980OoooOoo abstractC33980OoooOoo = (AbstractC33980OoooOoo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f122202OooO00o, abstractC33980OoooOoo.f122202OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(OooO0oo(), abstractC33980OoooOoo.OooO0oo());
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> getAnnotations() {
        return C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final AbstractC33534OooOO0o getKind() {
        return OooOOO0.OooO0O0.f121133OooO00o;
    }

    public final int hashCode() {
        return OooO0oo().hashCode() + (this.f122202OooO00o.hashCode() * 31);
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return OooO0oo() + '(' + this.f122202OooO00o + ')';
    }
}
