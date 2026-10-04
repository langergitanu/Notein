package oO0Oo0o0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: renamed from: oO0Oo0o0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33220OooOO0o {
    public static final HashSet OooO00o(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set<C33479OooO0o> setOooO0Oo = ((OooOO0) it.next()).OooO0Oo();
            if (setOooO0Oo == null) {
                return null;
            }
            C34431OooOo0.OooOo0o(hashSet, setOooO0Oo);
        }
        return hashSet;
    }
}
