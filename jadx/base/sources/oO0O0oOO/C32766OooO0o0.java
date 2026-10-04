package oO0O0oOO;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import oO00ooO.C32443OooOOO;
import oO0O0O0o.OooOOO;
import oO0O0ooO.InterfaceC32827OooOOO0;
import oO0OOo.C33033OooO0O0;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34444Oooo0O0;
import oOo0oooO.EnumC34590OooOO0o;
import oOo0oooO.OooOOO0;

/* JADX INFO: renamed from: oO0O0oOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32766OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f117730OooO00o = C34444Oooo0O0.OooO0oo(new C32443OooOOO("PACKAGE", EnumSet.noneOf(OooOOO0.class)), new C32443OooOOO(CredentialProviderBaseController.TYPE_TAG, EnumSet.of(OooOOO0.CLASS, OooOOO0.FILE)), new C32443OooOOO("ANNOTATION_TYPE", EnumSet.of(OooOOO0.ANNOTATION_CLASS)), new C32443OooOOO("TYPE_PARAMETER", EnumSet.of(OooOOO0.TYPE_PARAMETER)), new C32443OooOOO("FIELD", EnumSet.of(OooOOO0.FIELD)), new C32443OooOOO("LOCAL_VARIABLE", EnumSet.of(OooOOO0.LOCAL_VARIABLE)), new C32443OooOOO("PARAMETER", EnumSet.of(OooOOO0.VALUE_PARAMETER)), new C32443OooOOO("CONSTRUCTOR", EnumSet.of(OooOOO0.CONSTRUCTOR)), new C32443OooOOO("METHOD", EnumSet.of(OooOOO0.FUNCTION, OooOOO0.PROPERTY_GETTER, OooOOO0.PROPERTY_SETTER)), new C32443OooOOO("TYPE_USE", EnumSet.of(OooOOO0.TYPE)));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f117731OooO0O0 = C34444Oooo0O0.OooO0oo(new C32443OooOOO("RUNTIME", EnumC34590OooOO0o.f123927OooOo0o), new C32443OooOOO("CLASS", EnumC34590OooOO0o.f123926OooOo), new C32443OooOOO("SOURCE", EnumC34590OooOO0o.f123929OooOoO0));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static C33033OooO0O0 OooO00o(List arguments) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(arguments, "arguments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof InterfaceC32827OooOOO0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f117730OooO00o.get(((InterfaceC32827OooOOO0) it.next()).getEntryName().OooO0O0());
            if (iterable == null) {
                iterable = C34438OooOoo0.f123458OooOo0o;
            }
            C34431OooOo0.OooOo0o(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new oO0OOo.OooOO0O(C33476OooO0O0.OooOO0(OooOOO.OooO00o.f117169OooOo0), C33479OooO0o.OooO0o0(((OooOOO0) it2.next()).name())));
        }
        return new C33033OooO0O0(arrayList3, C32764OooO0Oo.f117726OooOo0o);
    }
}
