package oO0OoO;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o00ooOo.C25785OooO0oO;
import oO000Oo.C31998OoooOoO;
import oO0O0O0o.OooOOO;
import oO0O0OO.C32618OooOooo;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0O0OO.Oooo0;
import oO0OoO.C33230OooO0Oo;
import oO0OoO0.C33236OooO0o0;
import oO0OoO0.C33239OooOO0o;
import oO0OoO0.InterfaceC33241OooOOo;
import oO0OoO0.InterfaceC33242OooOOo0;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.C34428OooOOo;
import ooOOOoOo.InterfaceC35101OooO00o;
import ooOOOoOo.InterfaceC35103OooO0OO;

/* JADX INFO: renamed from: oO0OoO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33229OooO0OO implements oO0O0O0o.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33231OooO0o0 f120240OooO0O0 = new C33231OooO0o0();

    @Override // oO0O0O0o.OooO00o
    public final Oooo0 OooO00o(C33361OooO0Oo c33361OooO0Oo, InterfaceC32615OooOoo builtInsModule, Iterable classDescriptorFactories, InterfaceC35103OooO0OO platformDependentDeclarationFilter, InterfaceC35101OooO00o additionalClassPartsProvider, boolean z) {
        OooOOO0.OooO0oO(builtInsModule, "builtInsModule");
        OooOOO0.OooO0oO(classDescriptorFactories, "classDescriptorFactories");
        OooOOO0.OooO0oO(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        OooOOO0.OooO0oO(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set<C33477OooO0OO> packageFqNames = OooOOO.f117148OooOOOo;
        C33228OooO0O0 c33228OooO0O0 = new C33228OooO0O0(1, this.f120240OooO0O0);
        OooOOO0.OooO0oO(packageFqNames, "packageFqNames");
        Set<C33477OooO0OO> set = packageFqNames;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(set, 10));
        for (C33477OooO0OO c33477OooO0OO : set) {
            C33227OooO00o.f120239OooOOO0.getClass();
            String strOooO00o = C33227OooO00o.OooO00o(c33477OooO0OO);
            InputStream inputStream = (InputStream) c33228OooO0O0.invoke(strOooO00o);
            if (inputStream == null) {
                throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Resource not found in classpath: ", strOooO00o));
            }
            arrayList.add(C33230OooO0Oo.OooO00o.OooO00o(c33477OooO0OO, c33361OooO0Oo, builtInsModule, inputStream));
        }
        Oooo0 oooo0 = new Oooo0(arrayList);
        C32618OooOooo c32618OooOooo = new C32618OooOooo(c33361OooO0Oo, builtInsModule);
        C31998OoooOoO c31998OoooOoO = new C31998OoooOoO(oooo0);
        C33227OooO00o c33227OooO00o = C33227OooO00o.f120239OooOOO0;
        C33239OooOO0o c33239OooOO0o = new C33239OooOO0o(c33361OooO0Oo, builtInsModule, c31998OoooOoO, new C33236OooO0o0(builtInsModule, c32618OooOooo, c33227OooO00o), oooo0, InterfaceC33242OooOOo0.f120305OooO00o, InterfaceC33241OooOOo.OooO00o.f120304OooO00o, classDescriptorFactories, c32618OooOooo, additionalClassPartsProvider, platformDependentDeclarationFilter, c33227OooO00o.f120376OooO00o, null, new C25785OooO0oO(c33361OooO0Oo), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C33230OooO0Oo) it.next()).o000000o(c33239OooOO0o);
        }
        return oooo0;
    }
}
