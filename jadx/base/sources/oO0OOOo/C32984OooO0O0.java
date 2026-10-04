package oO0OOOo;

import Oooo0oo.AbstractC21138OooO0oo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32636OoooOoO;
import oO0Oo0o0.C33216OooO0Oo;
import oO0Oo0o0.OooOOO0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0OOOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32984OooO0O0 extends AbstractC21138OooO0oo {
    public static final void OoooooO(InterfaceC32596OooO0o0 interfaceC32596OooO0o0, LinkedHashSet<InterfaceC32596OooO0o0> linkedHashSet, oO0Oo0o0.OooOO0 oooOO02, boolean z) {
        for (oO0O0OO.OooOO0O oooOO0O : OooOOO0.OooO00o.OooO00o(oooOO02, C33216OooO0Oo.f120202OooOOOO, 2)) {
            if (oooOO0O instanceof InterfaceC32596OooO0o0) {
                InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO0oo = (InterfaceC32596OooO0o0) oooOO0O;
                if (interfaceC32596OooO0o0OooO0oo.o00Oo0()) {
                    C33479OooO0o name = interfaceC32596OooO0o0OooO0oo.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name, "descriptor.name");
                    InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO = oooOO02.OooO0oO(name, oOo0o0oO.OooO0O0.f123887OooOoO);
                    interfaceC32596OooO0o0OooO0oo = interfaceC32598OooO0ooOooO0oO instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0oO : interfaceC32598OooO0ooOooO0oO instanceof InterfaceC32636OoooOoO ? ((InterfaceC32636OoooOoO) interfaceC32598OooO0ooOooO0oO).OooO0oo() : null;
                }
                if (interfaceC32596OooO0o0OooO0oo == null) {
                    continue;
                } else {
                    if (interfaceC32596OooO0o0 == null) {
                        C32982OooO.OooO00o(27);
                        throw null;
                    }
                    int i = C32982OooO.f119352OooO00o;
                    Iterator<AbstractC33320OooOoo> it = interfaceC32596OooO0o0OooO0oo.OooO().OooO0Oo().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C32982OooO.OooOOOo(it.next(), interfaceC32596OooO0o0.o000OOo())) {
                                linkedHashSet.add(interfaceC32596OooO0o0OooO0oo);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        oO0Oo0o0.OooOO0 oooOO0OooOooo = interfaceC32596OooO0o0OooO0oo.OooOooo();
                        kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0OooOooo, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        OoooooO(interfaceC32596OooO0o0, linkedHashSet, oooOO0OooOooo, z);
                    }
                }
            }
        }
    }
}
