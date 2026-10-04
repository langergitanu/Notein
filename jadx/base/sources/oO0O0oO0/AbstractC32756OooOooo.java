package oO0O0oO0;

import java.lang.reflect.Type;
import java.util.Iterator;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0O0ooO.InterfaceC32835OooOo0o;
import oO0OooO0.C33477OooO0OO;

/* JADX INFO: renamed from: oO0O0oO0.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32756OooOooo implements InterfaceC32835OooOo0o {
    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public InterfaceC32815OooO00o OooOOO0(C33477OooO0OO fqName) {
        Object next;
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32815OooO00o) next).getClassId().OooO0O0(), fqName)) {
                break;
            }
        }
        return (InterfaceC32815OooO00o) next;
    }

    public abstract Type Oooo000();

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC32756OooOooo) && kotlin.jvm.internal.OooOOO0.OooO0O0(Oooo000(), ((AbstractC32756OooOooo) obj).Oooo000());
    }

    public final int hashCode() {
        return Oooo000().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + Oooo000();
    }
}
