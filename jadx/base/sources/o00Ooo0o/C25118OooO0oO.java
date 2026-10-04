package o00Ooo0o;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o00OooO.InterfaceC25145OooOo0o;

/* JADX INFO: renamed from: o00Ooo0o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25118OooO0oO<T> implements InterfaceC25123OooOOO0<T> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List f85384OooO0O0;

    @SafeVarargs
    public C25118OooO0oO(InterfaceC25123OooOOO0<T>... interfaceC25123OooOOO0Arr) {
        if (interfaceC25123OooOOO0Arr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f85384OooO0O0 = Arrays.asList(interfaceC25123OooOOO0Arr);
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        Iterator it = this.f85384OooO0O0.iterator();
        while (it.hasNext()) {
            ((InterfaceC25123OooOOO0) it.next()).OooO00o(messageDigest);
        }
    }

    @Override // o00Ooo0o.InterfaceC25123OooOOO0
    public final InterfaceC25145OooOo0o<T> OooO0O0(Context context, InterfaceC25145OooOo0o<T> interfaceC25145OooOo0o, int i, int i2) {
        Iterator it = this.f85384OooO0O0.iterator();
        InterfaceC25145OooOo0o<T> interfaceC25145OooOo0o2 = interfaceC25145OooOo0o;
        while (it.hasNext()) {
            InterfaceC25145OooOo0o<T> interfaceC25145OooOo0oOooO0O0 = ((InterfaceC25123OooOOO0) it.next()).OooO0O0(context, interfaceC25145OooOo0o2, i, i2);
            if (interfaceC25145OooOo0o2 != null && !interfaceC25145OooOo0o2.equals(interfaceC25145OooOo0o) && !interfaceC25145OooOo0o2.equals(interfaceC25145OooOo0oOooO0O0)) {
                interfaceC25145OooOo0o2.recycle();
            }
            interfaceC25145OooOo0o2 = interfaceC25145OooOo0oOooO0O0;
        }
        return interfaceC25145OooOo0o2;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        if (obj instanceof C25118OooO0oO) {
            return this.f85384OooO0O0.equals(((C25118OooO0oO) obj).f85384OooO0O0);
        }
        return false;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        return this.f85384OooO0O0.hashCode();
    }
}
