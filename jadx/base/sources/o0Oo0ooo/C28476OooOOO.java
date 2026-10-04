package o0Oo0ooo;

import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o0Oo0o00.o0OOO0o;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0Oo0.C32703OoooOoO;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33344OoooOoo;
import oO0Ooo.AbstractC33350Oooooo;
import oO0Ooo.C33343OoooOoO;
import oO0Ooo.C33351Oooooo0;
import oO0Ooo.C33352OoooooO;
import oO0Ooo.C33356ooOO;
import oO0o000.C33538OooO0OO;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOO0O.InterfaceC34105OooO00o;

/* JADX INFO: renamed from: o0Oo0ooo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28476OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f100894OooO00o = 0;

    public static /* synthetic */ void OooO00o(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static C34032OooOo0O OooO0O0(String str) {
        if (str.equals(KeyUtil.HMAC_KEY_HASH_ALGORITHM)) {
            return InterfaceC34105OooO00o.f122523OooO00o;
        }
        if (str.equals("SHA-512")) {
            return InterfaceC34105OooO00o.f122525OooO0OO;
        }
        if (str.equals("SHAKE128")) {
            return InterfaceC34105OooO00o.f122531OooOO0;
        }
        if (str.equals("SHAKE256")) {
            return InterfaceC34105OooO00o.f122532OooOO0O;
        }
        throw new IllegalArgumentException("unrecognized digest: ".concat(str));
    }

    public static C33356ooOO OooO0OO(List list, AbstractC33350Oooooo abstractC33350Oooooo, oO0O0OO.OooOO0O oooOO0O, ArrayList arrayList) {
        if (abstractC33350Oooooo == null) {
            OooO00o(1);
            throw null;
        }
        if (oooOO0O == null) {
            OooO00o(2);
            throw null;
        }
        if (arrayList == null) {
            OooO00o(3);
            throw null;
        }
        C33356ooOO c33356ooOOOooO0Oo = OooO0Oo(list, abstractC33350Oooooo, oooOO0O, arrayList, null);
        if (c33356ooOOOooO0Oo != null) {
            return c33356ooOOOooO0Oo;
        }
        throw new AssertionError("Substitution failed");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C33356ooOO OooO0Oo(List list, AbstractC33350Oooooo abstractC33350Oooooo, oO0O0OO.OooOO0O oooOO0O, ArrayList arrayList, boolean[] zArr) {
        C33356ooOO c33356ooOO;
        if (abstractC33350Oooooo == null) {
            OooO00o(6);
            throw null;
        }
        if (oooOO0O == null) {
            OooO00o(7);
            throw null;
        }
        if (arrayList == null) {
            OooO00o(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC32637OoooOoo interfaceC32637OoooOoo = (InterfaceC32637OoooOoo) it.next();
            C32703OoooOoO c32703OoooOoOO00000O0 = C32703OoooOoO.o00000O0(oooOO0O, interfaceC32637OoooOoo.getAnnotations(), interfaceC32637OoooOoo.OooOOo(), interfaceC32637OoooOoo.OooOo0(), interfaceC32637OoooOoo.getName(), i, interfaceC32637OoooOoo.OoooOoO());
            map.put(interfaceC32637OoooOoo.OooO(), new C33351Oooooo0(c32703OoooOoOO00000O0.OooOOO()));
            map2.put(interfaceC32637OoooOoo, c32703OoooOoOO00000O0);
            arrayList.add(c32703OoooOoOO00000O0);
            i++;
        }
        AbstractC33344OoooOoo.OooO00o oooO00o = AbstractC33344OoooOoo.f120613OooO0O0;
        C33343OoooOoO c33343OoooOoO = new C33343OoooOoO(map);
        C33356ooOO c33356ooOOOooO0o = C33356ooOO.OooO0o(abstractC33350Oooooo, c33343OoooOoO);
        C33356ooOO c33356ooOOOooO0o2 = C33356ooOO.OooO0o(new C33352OoooooO(abstractC33350Oooooo), c33343OoooOoO);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC32637OoooOoo interfaceC32637OoooOoo2 = (InterfaceC32637OoooOoo) it2.next();
            C32703OoooOoO c32703OoooOoO = (C32703OoooOoO) map2.get(interfaceC32637OoooOoo2);
            for (AbstractC33320OooOoo abstractC33320OooOoo : interfaceC32637OoooOoo2.getUpperBounds()) {
                InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = abstractC33320OooOoo.o00000().OooO0OO();
                if (interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32637OoooOoo) {
                    InterfaceC32637OoooOoo typeParameter = (InterfaceC32637OoooOoo) interfaceC32598OooO0ooOooO0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(typeParameter, "typeParameter");
                    c33356ooOO = C33538OooO0OO.OooO0oO(typeParameter, null, null) ? c33356ooOOOooO0o : c33356ooOOOooO0o2;
                }
                AbstractC33320OooOoo abstractC33320OooOooOooOO0 = c33356ooOO.OooOO0(3, abstractC33320OooOoo);
                if (abstractC33320OooOooOooOO0 == null) {
                    return null;
                }
                if (abstractC33320OooOooOooOO0 != abstractC33320OooOoo && zArr != null) {
                    zArr[0] = true;
                }
                if (c32703OoooOoO.f117583Oooo00o) {
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + c32703OoooOoO.o00000OO());
                }
                if (!o0OOO0o.OooO0O0(abstractC33320OooOooOooOO0)) {
                    c32703OoooOoO.f117582Oooo00O.add(abstractC33320OooOooOooOO0);
                }
            }
            if (c32703OoooOoO.f117583Oooo00o) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + c32703OoooOoO.o00000OO());
            }
            c32703OoooOoO.f117583Oooo00o = true;
        }
        return c33356ooOOOooO0o;
    }
}
