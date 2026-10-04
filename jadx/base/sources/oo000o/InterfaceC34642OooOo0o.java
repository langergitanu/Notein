package oo000o;

import java.util.ArrayList;
import java.util.List;
import o0000Ooo.C24228OooO0O0;

/* JADX INFO: renamed from: oo000o.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC34642OooOo0o {
    default int OooO00o(InterfaceC34631OooOO0O interfaceC34631OooOO0O, List<? extends InterfaceC34630OooOO0> list, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34631OooOO0O, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C34626OooO0o(list.get(i2), EnumC34632OooOO0o.f124812OooOo0o, EnumC34634OooOOO0.f124817OooOo0o));
        }
        return OooO0o0(new C34633OooOOO(interfaceC34631OooOO0O, interfaceC34631OooOO0O.getLayoutDirection()), arrayList, C24228OooO0O0.OooO0O0(0, i, 7)).getWidth();
    }

    default int OooO0O0(InterfaceC34631OooOO0O interfaceC34631OooOO0O, List<? extends InterfaceC34630OooOO0> list, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34631OooOO0O, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C34626OooO0o(list.get(i2), EnumC34632OooOO0o.f124812OooOo0o, EnumC34634OooOOO0.f124816OooOo));
        }
        return OooO0o0(new C34633OooOOO(interfaceC34631OooOO0O, interfaceC34631OooOO0O.getLayoutDirection()), arrayList, C24228OooO0O0.OooO0O0(i, 0, 13)).getHeight();
    }

    default int OooO0OO(InterfaceC34631OooOO0O interfaceC34631OooOO0O, List<? extends InterfaceC34630OooOO0> list, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34631OooOO0O, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C34626OooO0o(list.get(i2), EnumC34632OooOO0o.f124811OooOo, EnumC34634OooOOO0.f124817OooOo0o));
        }
        return OooO0o0(new C34633OooOOO(interfaceC34631OooOO0O, interfaceC34631OooOO0O.getLayoutDirection()), arrayList, C24228OooO0O0.OooO0O0(0, i, 7)).getWidth();
    }

    default int OooO0Oo(InterfaceC34631OooOO0O interfaceC34631OooOO0O, List<? extends InterfaceC34630OooOO0> list, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34631OooOO0O, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C34626OooO0o(list.get(i2), EnumC34632OooOO0o.f124811OooOo, EnumC34634OooOOO0.f124816OooOo));
        }
        return OooO0o0(new C34633OooOOO(interfaceC34631OooOO0O, interfaceC34631OooOO0O.getLayoutDirection()), arrayList, C24228OooO0O0.OooO0O0(i, 0, 13)).getHeight();
    }

    OooOo OooO0o0(InterfaceC34643OooOoO interfaceC34643OooOoO, List<? extends InterfaceC34641OooOo0O> list, long j);
}
