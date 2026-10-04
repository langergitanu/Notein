package oO0oOOoo;

import Oooo0oo.AbstractC21138OooO0oo;
import java.util.Enumeration;
import java.util.Hashtable;
import o0Oo0oo.C28395OooOOo0;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oO0Oo.InterfaceC34017OooO0o;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.o00oO0O;
import oO0oOo00.C34166OooO00o;

/* JADX INFO: renamed from: oO0oOOoo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34135OooO0OO extends OooOo00 implements InterfaceC34017OooO0o {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final C34166OooO00o f122669OooOoo0 = C34166OooO00o.f122770OooO0Oo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f122670OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f122671OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C34134OooO0O0[] f122672OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C34166OooO00o f122673OooOoO0 = f122669OooOoo0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final o00oO0O f122674OooOoOO;

    public C34135OooO0OO(AbstractC34039OooOooO abstractC34039OooOooO) {
        C34134OooO0O0 c34134OooO0O0;
        this.f122672OooOoO = new C34134OooO0O0[abstractC34039OooOooO.size()];
        Enumeration enumerationOooOo0O = abstractC34039OooOooO.OooOo0O();
        boolean z = true;
        int i = 0;
        while (enumerationOooOo0O.hasMoreElements()) {
            Object objNextElement = enumerationOooOo0O.nextElement();
            if (objNextElement instanceof C34134OooO0O0) {
                c34134OooO0O0 = (C34134OooO0O0) objNextElement;
            } else if (objNextElement != null) {
                AbstractC34040OooOooo abstractC34040OooOoooOooOOo = AbstractC34040OooOooo.OooOOo(objNextElement);
                c34134OooO0O0 = new C34134OooO0O0();
                c34134OooO0O0.f122668OooOo0o = abstractC34040OooOoooOooOOo;
            } else {
                c34134OooO0O0 = null;
            }
            z &= c34134OooO0O0 == objNextElement;
            this.f122672OooOoO[i] = c34134OooO0O0;
            i++;
        }
        if (z) {
            this.f122674OooOoOO = (o00oO0O) abstractC34039OooOooO.OooOOOO();
        } else {
            this.f122674OooOoOO = new o00oO0O(this.f122672OooOoO);
        }
    }

    public static C34135OooO0OO OooO0oo(Object obj) {
        if (obj instanceof C34135OooO0OO) {
            return (C34135OooO0OO) obj;
        }
        if (obj != null) {
            return new C34135OooO0OO(AbstractC34039OooOooO.OooOOoo(obj));
        }
        return null;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        return this.f122674OooOoOO;
    }

    @Override // oO0oO0Oo.OooOo00
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C34135OooO0OO) && !(obj instanceof AbstractC34039OooOooO)) {
            return false;
        }
        if (this.f122674OooOoOO.OooOO0o(((InterfaceC34019OooO0oO) obj).OooO0o())) {
            return true;
        }
        try {
            C34166OooO00o c34166OooO00o = this.f122673OooOoO0;
            C34135OooO0OO c34135OooO0OO = new C34135OooO0OO(AbstractC34039OooOooO.OooOOoo(((InterfaceC34019OooO0oO) obj).OooO0o()));
            c34166OooO00o.getClass();
            return AbstractC21138OooO0oo.Oooo0O0(this, c34135OooO0OO);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // oO0oO0Oo.OooOo00
    public final int hashCode() {
        if (this.f122671OooOo0o) {
            return this.f122670OooOo;
        }
        this.f122671OooOo0o = true;
        this.f122673OooOoO0.getClass();
        C34134OooO0O0[] c34134OooO0O0Arr = (C34134OooO0O0[]) this.f122672OooOoO.clone();
        int iHashCode = 0;
        for (int i = 0; i != c34134OooO0O0Arr.length; i++) {
            C34134OooO0O0 c34134OooO0O0 = c34134OooO0O0Arr[i];
            if (c34134OooO0O0.f122668OooOo0o.f122376OooOo0o.length > 1) {
                C34133OooO00o[] c34133OooO00oArrOooO = c34134OooO0O0.OooO();
                for (int i2 = 0; i2 != c34133OooO00oArrOooO.length; i2++) {
                    iHashCode = (iHashCode ^ c34133OooO00oArrOooO[i2].f122667OooOo0o.f122357OooOo0o.hashCode()) ^ C28395OooOOo0.OooO0O0(c34133OooO00oArrOooO[i2].f122666OooOo).hashCode();
                }
            } else {
                iHashCode = (iHashCode ^ c34134OooO0O0.OooO0oo().f122667OooOo0o.f122357OooOo0o.hashCode()) ^ C28395OooOOo0.OooO0O0(c34134OooO0O0Arr[i].OooO0oo().f122666OooOo).hashCode();
            }
        }
        this.f122670OooOo = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        C34166OooO00o c34166OooO00o = this.f122673OooOoO0;
        c34166OooO00o.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        for (C34134OooO0O0 c34134OooO0O0 : (C34134OooO0O0[]) this.f122672OooOoO.clone()) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            Hashtable hashtable = c34166OooO00o.f122771OooO00o;
            if (c34134OooO0O0.f122668OooOo0o.f122376OooOo0o.length > 1) {
                C34133OooO00o[] c34133OooO00oArrOooO = c34134OooO0O0.OooO();
                boolean z2 = true;
                for (int i = 0; i != c34133OooO00oArrOooO.length; i++) {
                    if (z2) {
                        z2 = false;
                    } else {
                        stringBuffer.append('+');
                    }
                    C28395OooOOo0.OooO00o(stringBuffer, c34133OooO00oArrOooO[i], hashtable);
                }
            } else if (c34134OooO0O0.OooO0oo() != null) {
                C28395OooOOo0.OooO00o(stringBuffer, c34134OooO0O0.OooO0oo(), hashtable);
            }
        }
        return stringBuffer.toString();
    }
}
