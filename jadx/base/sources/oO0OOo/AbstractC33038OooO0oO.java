package oO0OOo;

import oO0O0OO.InterfaceC32615OooOoo;
import oO0Ooo.AbstractC33320OooOoo;

/* JADX INFO: renamed from: oO0OOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33038OooO0oO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f119483OooO00o;

    public AbstractC33038OooO0oO(T t) {
        this.f119483OooO00o = t;
    }

    public abstract AbstractC33320OooOoo OooO00o(InterfaceC32615OooOoo interfaceC32615OooOoo);

    public T OooO0O0() {
        return this.f119483OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        T tOooO0O0 = OooO0O0();
        AbstractC33038OooO0oO abstractC33038OooO0oO = obj instanceof AbstractC33038OooO0oO ? (AbstractC33038OooO0oO) obj : null;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(tOooO0O0, abstractC33038OooO0oO != null ? abstractC33038OooO0oO.OooO0O0() : null);
    }

    public final int hashCode() {
        T tOooO0O0 = OooO0O0();
        if (tOooO0O0 != null) {
            return tOooO0O0.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(OooO0O0());
    }
}
