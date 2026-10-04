package oO0oOo0;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34018OooO0o0;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oOo0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34151OooOO0O extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Vector f122716OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Hashtable f122717OooOo0o;

    public static C34151OooOO0O OooO0oo(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        C34150OooOO0 c34150OooOO0;
        C34018OooO0o0 c34018OooO0o0;
        if (interfaceC34019OooO0oO instanceof C34151OooOO0O) {
            return (C34151OooOO0O) interfaceC34019OooO0oO;
        }
        if (interfaceC34019OooO0oO == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oO);
        C34151OooOO0O c34151OooOO0O = new C34151OooOO0O();
        c34151OooOO0O.f122717OooOo0o = new Hashtable();
        c34151OooOO0O.f122716OooOo = new Vector();
        Enumeration enumerationOooOo0O = abstractC34039OooOooOOooOOoo.OooOo0O();
        while (enumerationOooOo0O.hasMoreElements()) {
            Object objNextElement = enumerationOooOo0O.nextElement();
            C34032OooOo0O c34032OooOo0O = C34150OooOO0.f122711OooOoO;
            if (objNextElement instanceof C34150OooOO0) {
                c34150OooOO0 = (C34150OooOO0) objNextElement;
            } else if (objNextElement != null) {
                AbstractC34039OooOooO abstractC34039OooOooOOooOOoo2 = AbstractC34039OooOooO.OooOOoo(objNextElement);
                C34150OooOO0 c34150OooOO02 = new C34150OooOO0();
                if (abstractC34039OooOooOOooOOoo2.size() == 2) {
                    c34150OooOO02.f122714OooOo0o = C34032OooOo0O.OooOo0(abstractC34039OooOooOOooOOoo2.OooOo0(0));
                    c34150OooOO02.f122713OooOo = false;
                    c34150OooOO02.f122715OooOoO0 = AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooOOooOOoo2.OooOo0(1));
                } else {
                    if (abstractC34039OooOooOOooOOoo2.size() != 3) {
                        throw new IllegalArgumentException("Bad sequence size: " + abstractC34039OooOooOOooOOoo2.size());
                    }
                    c34150OooOO02.f122714OooOo0o = C34032OooOo0O.OooOo0(abstractC34039OooOooOOooOOoo2.OooOo0(0));
                    Object objOooOo0 = abstractC34039OooOooOOooOOoo2.OooOo0(1);
                    C34018OooO0o0.OooO00o oooO00o = C34018OooO0o0.f122320OooOo;
                    if (objOooOo0 == null || (objOooOo0 instanceof C34018OooO0o0)) {
                        c34018OooO0o0 = (C34018OooO0o0) objOooOo0;
                    } else {
                        if (!(objOooOo0 instanceof byte[])) {
                            throw new IllegalArgumentException("illegal object in getInstance: ".concat(objOooOo0.getClass().getName()));
                        }
                        try {
                            c34018OooO0o0 = (C34018OooO0o0) C34018OooO0o0.f122320OooOo.OooO0O0((byte[]) objOooOo0);
                        } catch (IOException e) {
                            throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("failed to construct boolean from byte[]: ")));
                        }
                    }
                    c34150OooOO02.f122713OooOo = c34018OooO0o0.OooOOo();
                    c34150OooOO02.f122715OooOoO0 = AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooOOooOOoo2.OooOo0(2));
                }
                c34150OooOO0 = c34150OooOO02;
            } else {
                c34150OooOO0 = null;
            }
            boolean zContainsKey = c34151OooOO0O.f122717OooOo0o.containsKey(c34150OooOO0.f122714OooOo0o);
            C34032OooOo0O c34032OooOo0O2 = c34150OooOO0.f122714OooOo0o;
            if (zContainsKey) {
                throw new IllegalArgumentException("repeated extension found: " + c34032OooOo0O2);
            }
            c34151OooOO0O.f122717OooOo0o.put(c34032OooOo0O2, c34150OooOO0);
            c34151OooOO0O.f122716OooOo.addElement(c34032OooOo0O2);
        }
        return c34151OooOO0O;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        Vector vector = this.f122716OooOo;
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(vector.size());
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            c34020OooO0oo.OooO00o((C34150OooOO0) this.f122717OooOo0o.get((C34032OooOo0O) enumerationElements.nextElement()));
        }
        return new o00oO0O(c34020OooO0oo);
    }
}
