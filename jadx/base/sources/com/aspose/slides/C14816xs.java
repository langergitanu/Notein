package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p492x4.C12385to;

/* JADX INFO: renamed from: com.aspose.slides.xs */
/* JADX INFO: loaded from: classes3.dex */
class C14816xs {
    /* JADX INFO: renamed from: k4 */
    public static C14636uj m73602k4(InterfaceC0782az interfaceC0782az, InterfaceC0782az interfaceC0782az2, String str) {
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("(&?)\"(.*)\"(&?)", str);
        String strOooO00o = OooOo.OooO00o(c12385toOooO00o, 2);
        if (!"&".equals(c12385toOooO00o.m58004du().m58000k4(1).mo57995kk()) && interfaceC0782az != null && !C7019kk.m27469x1(interfaceC0782az, C1245ia.class)) {
            throw new CellInvalidFormulaException("Wrong concatenate formula usage. Left argument exist, but no '&' after it.");
        }
        if (!"&".equals(c12385toOooO00o.m58004du().m58000k4(3).mo57995kk()) && interfaceC0782az2 != null && !C7019kk.m27469x1(interfaceC0782az2, C1245ia.class)) {
            throw new CellInvalidFormulaException("Wrong concatenate formula usage. Right argument exist, but no '&' before it.");
        }
        if (("&".equals(c12385toOooO00o.m58004du().m58000k4(1).mo57995kk()) || "&".equals(c12385toOooO00o.m58004du().m58000k4(3).mo57995kk())) && ((interfaceC0782az2 == null || C7019kk.m27469x1(interfaceC0782az2, C1245ia.class)) && (interfaceC0782az == null || C7019kk.m27469x1(interfaceC0782az, C1245ia.class)))) {
            throw new CellInvalidFormulaException("Wrong concatenate formula usage. No arguments.");
        }
        if ("&".equals(c12385toOooO00o.m58004du().m58000k4(1).mo57995kk()) || "&".equals(c12385toOooO00o.m58004du().m58000k4(3).mo57995kk())) {
            return new C14636uj(interfaceC0782az, interfaceC0782az2, strOooO00o);
        }
        throw new CellInvalidFormulaException("Wrong concatenate formula usage. No '&' symbols.");
    }
}
