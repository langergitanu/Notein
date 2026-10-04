package oO0O0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32442OooOO0o;
import oO0O0O0.C32567Oooo;
import oO0O0O0.C32579OoooO0O;
import oO0O0O0.InterfaceC32551OooOOOo;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.C33325Oooo;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.C33351Oooooo0;
import oO0Ooo.InterfaceC33342OoooOo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOoo0.C34607OooOOo;
import oOoo0.EnumC34609OooOOoo;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f116775OooO00o;

        static {
            int[] iArr = new int[EnumC34609OooOOoo.values().length];
            try {
                EnumC34609OooOOoo enumC34609OooOOoo = EnumC34609OooOOoo.f123979OooOo0o;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC34609OooOOoo enumC34609OooOOoo2 = EnumC34609OooOOoo.f123979OooOo0o;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC34609OooOOoo enumC34609OooOOoo3 = EnumC34609OooOOoo.f123979OooOo0o;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f116775OooO00o = iArr;
        }
    }

    public static final C32567Oooo OooO00o(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo, List arguments, boolean z, List annotations) {
        InterfaceC32598OooO0oo descriptor;
        C33339OoooOOO c33339OoooOOO;
        Object c33325Oooo;
        OooOOO0.OooO0oO(interfaceC34595OooO0Oo, "<this>");
        OooOOO0.OooO0oO(arguments, "arguments");
        OooOOO0.OooO0oO(annotations, "annotations");
        InterfaceC32551OooOOOo interfaceC32551OooOOOo = interfaceC34595OooO0Oo instanceof InterfaceC32551OooOOOo ? (InterfaceC32551OooOOOo) interfaceC34595OooO0Oo : null;
        if (interfaceC32551OooOOOo == null || (descriptor = interfaceC32551OooOOOo.getDescriptor()) == null) {
            throw new C32579OoooO0O("Cannot create type for an unsupported classifier: " + interfaceC34595OooO0Oo + " (" + interfaceC34595OooO0Oo.getClass() + ')');
        }
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0OooO = descriptor.OooO();
        OooOOO0.OooO0o(interfaceC33342OoooOo0OooO, "descriptor.typeConstructor");
        List<InterfaceC32637OoooOoo> parameters = interfaceC33342OoooOo0OooO.getParameters();
        OooOOO0.OooO0o(parameters, "typeConstructor.parameters");
        if (parameters.size() != arguments.size()) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        if (annotations.isEmpty()) {
            C33339OoooOOO.f120598OooOo.getClass();
            c33339OoooOOO = C33339OoooOOO.f120599OooOoO0;
        } else {
            C33339OoooOOO.f120598OooOo.getClass();
            c33339OoooOOO = C33339OoooOOO.f120599OooOoO0;
        }
        List<InterfaceC32637OoooOoo> parameters2 = interfaceC33342OoooOo0OooO.getParameters();
        OooOOO0.OooO0o(parameters2, "typeConstructor.parameters");
        List list = arguments;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            C34607OooOOo c34607OooOOo = (C34607OooOOo) obj;
            C32567Oooo c32567Oooo = c34607OooOOo.f123976OooO0O0;
            AbstractC33320OooOoo abstractC33320OooOoo = c32567Oooo != null ? c32567Oooo.f117034OooOo0o : null;
            EnumC34609OooOOoo enumC34609OooOOoo = c34607OooOOo.f123975OooO00o;
            int i3 = enumC34609OooOOoo == null ? -1 : OooO00o.f116775OooO00o[enumC34609OooOOoo.ordinal()];
            if (i3 == -1) {
                InterfaceC32637OoooOoo interfaceC32637OoooOoo = parameters2.get(i);
                OooOOO0.OooO0o(interfaceC32637OoooOoo, "parameters[index]");
                c33325Oooo = new C33325Oooo(interfaceC32637OoooOoo);
            } else if (i3 == 1) {
                OooOOO0.OooO0Oo(abstractC33320OooOoo);
                c33325Oooo = new C33351Oooooo0(1, abstractC33320OooOoo);
            } else if (i3 == 2) {
                OooOOO0.OooO0Oo(abstractC33320OooOoo);
                c33325Oooo = new C33351Oooooo0(2, abstractC33320OooOoo);
            } else {
                if (i3 != 3) {
                    throw new C32442OooOO0o();
                }
                OooOOO0.OooO0Oo(abstractC33320OooOoo);
                c33325Oooo = new C33351Oooooo0(3, abstractC33320OooOoo);
            }
            arrayList.add(c33325Oooo);
            i = i2;
        }
        return new C32567Oooo(C33322OooOooO.OooO0o0(c33339OoooOOO, interfaceC33342OoooOo0OooO, arrayList, z, null), null);
    }
}
