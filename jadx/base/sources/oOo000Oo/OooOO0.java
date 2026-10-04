package oOo000Oo;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooOO0<E> extends AbstractC34419OooO0O0<E> implements Set<E> {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set other = (Set) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        if (size() != other.size()) {
            return false;
        }
        return containsAll(other);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
