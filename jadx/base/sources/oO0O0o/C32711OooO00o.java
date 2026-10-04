package oO0O0o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0O0O0o.InterfaceC32588OooO0o0;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0Oo0.C32692Oooo0o0;
import oO0O0o.EnumC32713OooO0OO;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.OooOo;
import ooOOOoOo.InterfaceC35102OooO0O0;

/* JADX INFO: renamed from: oO0O0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32711OooO00o implements InterfaceC35102OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33361OooO0Oo f117617OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32692Oooo0o0 f117618OooO0O0;

    public C32711OooO00o(C33361OooO0Oo c33361OooO0Oo, C32692Oooo0o0 module) {
        OooOOO0.OooO0oO(module, "module");
        this.f117617OooO00o = c33361OooO0Oo;
        this.f117618OooO0O0 = module;
    }

    @Override // ooOOOoOo.InterfaceC35102OooO0O0
    public final Collection<InterfaceC32596OooO0o0> OooO00o(C33477OooO0OO packageFqName) {
        OooOOO0.OooO0oO(packageFqName, "packageFqName");
        return C34438OooOoo0.f123458OooOo0o;
    }

    @Override // ooOOOoOo.InterfaceC35102OooO0O0
    public final boolean OooO0O0(C33477OooO0OO packageFqName, C33479OooO0o name) {
        OooOOO0.OooO0oO(packageFqName, "packageFqName");
        OooOOO0.OooO0oO(name, "name");
        String strOooO0O0 = name.OooO0O0();
        OooOOO0.OooO0o(strOooO0O0, "name.asString()");
        if (C33595OooOOo.OooOoO0(strOooO0O0, "Function", false) || C33595OooOOo.OooOoO0(strOooO0O0, "KFunction", false) || C33595OooOOo.OooOoO0(strOooO0O0, "SuspendFunction", false) || C33595OooOOo.OooOoO0(strOooO0O0, "KSuspendFunction", false)) {
            EnumC32713OooO0OO.f117630OooOoO0.getClass();
            if (EnumC32713OooO0OO.OooO00o.OooO00o(strOooO0O0, packageFqName) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // ooOOOoOo.InterfaceC35102OooO0O0
    public final InterfaceC32596OooO0o0 OooO0OO(C33476OooO0O0 classId) {
        OooOOO0.OooO0oO(classId, "classId");
        if (classId.f120969OooO0OO || !classId.f120968OooO0O0.OooO0o0().OooO0Oo()) {
            return null;
        }
        String strOooO0O0 = classId.OooO0oo().OooO0O0();
        if (!C33599OooOo0O.OooOoOO(strOooO0O0, "Function", false)) {
            return null;
        }
        C33477OooO0OO c33477OooO0OOOooO0oO = classId.OooO0oO();
        OooOOO0.OooO0o(c33477OooO0OOOooO0oO, "classId.packageFqName");
        EnumC32713OooO0OO.f117630OooOoO0.getClass();
        EnumC32713OooO0OO.OooO00o.C20251OooO00o c20251OooO00oOooO00o = EnumC32713OooO0OO.OooO00o.OooO00o(strOooO0O0, c33477OooO0OOOooO0oO);
        if (c20251OooO00oOooO00o == null) {
            return null;
        }
        List<InterfaceC32620Oooo00O> listOooo0 = this.f117618OooO0O0.o00oO0o(c33477OooO0OOOooO0oO).Oooo0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOooo0) {
            if (obj instanceof oO0O0O0o.OooO0O0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof InterfaceC32588OooO0o0) {
                arrayList2.add(obj2);
            }
        }
        oO0O0O0o.OooO0O0 oooO0O0 = (InterfaceC32588OooO0o0) OooOo.Oooo(arrayList2);
        if (oooO0O0 == null) {
            oooO0O0 = (oO0O0O0o.OooO0O0) OooOo.Oooo0oO(arrayList);
        }
        return new C32712OooO0O0(this.f117617OooO00o, oooO0O0, c20251OooO00oOooO00o.f117637OooO00o, c20251OooO00oOooO00o.f117638OooO0O0);
    }
}
