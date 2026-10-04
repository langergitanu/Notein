package oO0O0O0o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import oO00ooO.C32443OooOOO;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.o00Oo0;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: oO0O0O0o.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32593OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Set<C33479OooO0o> f117212OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<C33479OooO0o> f117213OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final HashMap<C33476OooO0O0, C33476OooO0O0> f117214OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final HashMap<C33476OooO0O0, C33476OooO0O0> f117215OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final LinkedHashSet f117216OooO0o0;

    static {
        EnumC32594OooOOo0[] enumC32594OooOOo0ArrValues = EnumC32594OooOOo0.values();
        ArrayList arrayList = new ArrayList(enumC32594OooOOo0ArrValues.length);
        for (EnumC32594OooOOo0 enumC32594OooOOo0 : enumC32594OooOOo0ArrValues) {
            arrayList.add(enumC32594OooOOo0.f117218OooOo);
        }
        f117212OooO00o = OooOo.o0OO00O(arrayList);
        EnumC32592OooOOOo[] enumC32592OooOOOoArrValues = EnumC32592OooOOOo.values();
        ArrayList arrayList2 = new ArrayList(enumC32592OooOOOoArrValues.length);
        for (EnumC32592OooOOOo enumC32592OooOOOo : enumC32592OooOOOoArrValues) {
            arrayList2.add(enumC32592OooOOOo.f117211OooOo0o);
        }
        f117213OooO0O0 = OooOo.o0OO00O(arrayList2);
        f117214OooO0OO = new HashMap<>();
        f117215OooO0Oo = new HashMap<>();
        C34444Oooo0O0.OooOO0O(new HashMap(Oooo0.OooO0Oo(4)), new C32443OooOOO[]{new C32443OooOOO(EnumC32592OooOOOo.UBYTEARRAY, C33479OooO0o.OooO0o0("ubyteArrayOf")), new C32443OooOOO(EnumC32592OooOOOo.USHORTARRAY, C33479OooO0o.OooO0o0("ushortArrayOf")), new C32443OooOOO(EnumC32592OooOOOo.UINTARRAY, C33479OooO0o.OooO0o0("uintArrayOf")), new C32443OooOOO(EnumC32592OooOOOo.ULONGARRAY, C33479OooO0o.OooO0o0("ulongArrayOf"))});
        EnumC32594OooOOo0[] enumC32594OooOOo0ArrValues2 = EnumC32594OooOOo0.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC32594OooOOo0 enumC32594OooOOo02 : enumC32594OooOOo0ArrValues2) {
            linkedHashSet.add(enumC32594OooOOo02.f117220OooOoO0.OooO());
        }
        f117216OooO0o0 = linkedHashSet;
        for (EnumC32594OooOOo0 enumC32594OooOOo03 : EnumC32594OooOOo0.values()) {
            HashMap<C33476OooO0O0, C33476OooO0O0> map = f117214OooO0OO;
            C33476OooO0O0 c33476OooO0O0 = enumC32594OooOOo03.f117220OooOoO0;
            C33476OooO0O0 c33476OooO0O02 = enumC32594OooOOo03.f117219OooOo0o;
            map.put(c33476OooO0O0, c33476OooO0O02);
            f117215OooO0Oo.put(c33476OooO0O02, enumC32594OooOOo03.f117220OooOoO0);
        }
    }

    public static final boolean OooO00o(AbstractC33320OooOoo abstractC33320OooOoo) {
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO;
        if (o00Oo0.OooOOO(abstractC33320OooOoo) || (interfaceC32598OooO0ooOooO0OO = abstractC33320OooOoo.o00000().OooO0OO()) == null) {
            return false;
        }
        oO0O0OO.OooOO0O oooOO0OOooO0Oo = interfaceC32598OooO0ooOooO0OO.OooO0Oo();
        return (oooOO0OOooO0Oo instanceof InterfaceC32620Oooo00O) && kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32620Oooo00O) oooOO0OOooO0Oo).OooO0OO(), OooOOO.f117143OooOO0O) && f117212OooO00o.contains(interfaceC32598OooO0ooOooO0OO.getName());
    }
}
