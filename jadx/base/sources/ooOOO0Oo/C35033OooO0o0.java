package ooOOO0Oo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0OOo.AbstractC33038OooO0oO;
import oO0OOo.C33033OooO0O0;
import oO0Oo00.C33194OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: ooOOO0Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35033OooO0o0 extends OooO0O0<oOo0oooO.OooO0OO> {
    public static List OooOO0o(AbstractC33038OooO0oO abstractC33038OooO0oO) {
        if (!(abstractC33038OooO0oO instanceof C33033OooO0O0)) {
            return abstractC33038OooO0oO instanceof oO0OOo.OooOO0O ? com.facebook.soloader.OooOo.OooO0oO(((oO0OOo.OooOO0O) abstractC33038OooO0oO).f119486OooO0OO.OooO0OO()) : C34434OooOoO.f123453OooOo0o;
        }
        Iterable iterable = (Iterable) ((C33033OooO0O0) abstractC33038OooO0oO).f119483OooO00o;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C34431OooOo0.OooOo0o(arrayList, OooOO0o((AbstractC33038OooO0oO) it.next()));
        }
        return arrayList;
    }

    @Override // ooOOO0Oo.OooO0O0
    public final ArrayList OooO00o(Object obj, boolean z) {
        oOo0oooO.OooO0OO oooO0OO = (oOo0oooO.OooO0OO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0OO, "<this>");
        Map<C33479OooO0o, AbstractC33038OooO0oO<?>> mapOooO0O0 = oooO0OO.OooO0O0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C33479OooO0o, AbstractC33038OooO0oO<?>> entry : mapOooO0O0.entrySet()) {
            C34431OooOo0.OooOo0o(arrayList, (!z || kotlin.jvm.internal.OooOOO0.OooO0O0(entry.getKey(), C35048OooOoo0.f125852OooO0O0)) ? OooOO0o(entry.getValue()) : C34434OooOoO.f123453OooOo0o);
        }
        return arrayList;
    }

    @Override // ooOOO0Oo.OooO0O0
    public final InterfaceC32596OooO0o0 OooO0o(Object obj) {
        oOo0oooO.OooO0OO oooO0OO = (oOo0oooO.OooO0OO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0OO, "<this>");
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO0Oo = C33194OooO0O0.OooO0Oo(oooO0OO);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC32596OooO0o0OooO0Oo);
        return interfaceC32596OooO0o0OooO0Oo;
    }

    @Override // ooOOO0Oo.OooO0O0
    public final C33477OooO0OO OooO0o0(oOo0oooO.OooO0OO oooO0OO) {
        oOo0oooO.OooO0OO oooO0OO2 = oooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0OO2, "<this>");
        return oooO0OO2.OooO0OO();
    }

    @Override // ooOOO0Oo.OooO0O0
    public final Iterable<oOo0oooO.OooO0OO> OooO0oO(oOo0oooO.OooO0OO oooO0OO) {
        InterfaceC34588OooO0oO annotations;
        oOo0oooO.OooO0OO oooO0OO2 = oooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0OO2, "<this>");
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO0Oo = C33194OooO0O0.OooO0Oo(oooO0OO2);
        return (interfaceC32596OooO0o0OooO0Oo == null || (annotations = interfaceC32596OooO0o0OooO0Oo.getAnnotations()) == null) ? C34434OooOoO.f123453OooOo0o : annotations;
    }
}
