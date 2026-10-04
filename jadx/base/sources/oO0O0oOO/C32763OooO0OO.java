package oO0O0oOO;

import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO0O0O0o.OooOOO;
import oO0O0oOo.InterfaceC32777OooO0oO;
import oO0O0oo0.C32782OooO0Oo;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0O0ooO.InterfaceC32818OooO0Oo;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34444Oooo0O0;
import oOo00OOo.C34499OooO0oO;
import ooOOO0Oo.C35048OooOoo0;

/* JADX INFO: renamed from: oO0O0oOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32763OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33479OooO0o f117722OooO00o = C33479OooO0o.OooO0o0("message");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33479OooO0o f117723OooO0O0 = C33479OooO0o.OooO0o0("allowedTargets");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C33479OooO0o f117724OooO0OO = C33479OooO0o.OooO0o0("value");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Object f117725OooO0Oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(OooOOO.OooO00o.f117170OooOo00, C35048OooOoo0.f125853OooO0OO), new C32443OooOOO(OooOOO.OooO00o.f117172OooOo0o, C35048OooOoo0.f125854OooO0Oo), new C32443OooOOO(OooOOO.OooO00o.f117168OooOo, C35048OooOoo0.f125855OooO0o));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static InterfaceC32777OooO0oO OooO00o(C33477OooO0OO kotlinName, InterfaceC32818OooO0Oo annotationOwner, C34499OooO0oO c) {
        InterfaceC32815OooO00o interfaceC32815OooO00oOooOOO0;
        OooOOO0.OooO0oO(kotlinName, "kotlinName");
        OooOOO0.OooO0oO(annotationOwner, "annotationOwner");
        OooOOO0.OooO0oO(c, "c");
        if (kotlinName.equals(OooOOO.OooO00o.f117162OooOOO0)) {
            C33477OooO0OO DEPRECATED_ANNOTATION = C35048OooOoo0.f125856OooO0o0;
            OooOOO0.OooO0o(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            InterfaceC32815OooO00o interfaceC32815OooO00oOooOOO02 = annotationOwner.OooOOO0(DEPRECATED_ANNOTATION);
            if (interfaceC32815OooO00oOooOOO02 != null) {
                return new C32765OooO0o(interfaceC32815OooO00oOooOOO02, c);
            }
        }
        C33477OooO0OO c33477OooO0OO = (C33477OooO0OO) f117725OooO0Oo.get(kotlinName);
        if (c33477OooO0OO == null || (interfaceC32815OooO00oOooOOO0 = annotationOwner.OooOOO0(c33477OooO0OO)) == null) {
            return null;
        }
        return OooO0O0(interfaceC32815OooO00oOooOOO0, c, false);
    }

    public static InterfaceC32777OooO0oO OooO0O0(InterfaceC32815OooO00o annotation, C34499OooO0oO c, boolean z) {
        OooOOO0.OooO0oO(annotation, "annotation");
        OooOOO0.OooO0oO(c, "c");
        C33476OooO0O0 classId = annotation.getClassId();
        if (classId.equals(C33476OooO0O0.OooOO0(C35048OooOoo0.f125853OooO0OO))) {
            return new C32769OooOO0(annotation, c);
        }
        if (classId.equals(C33476OooO0O0.OooOO0(C35048OooOoo0.f125854OooO0Oo))) {
            return new C32760OooO(annotation, c);
        }
        if (classId.equals(C33476OooO0O0.OooOO0(C35048OooOoo0.f125855OooO0o))) {
            return new C32762OooO0O0(c, annotation, OooOOO.OooO00o.f117168OooOo);
        }
        if (classId.equals(C33476OooO0O0.OooOO0(C35048OooOoo0.f125856OooO0o0))) {
            return null;
        }
        return new C32782OooO0Oo(annotation, c, z);
    }
}
