package oOo0000O;

import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oOo0000O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C34414OooO0oO implements InterfaceC32508OooOOOo {
    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC34415OooO0oo acc = (InterfaceC34415OooO0oo) obj;
        InterfaceC34415OooO0oo.OooO0O0 element = (InterfaceC34415OooO0oo.OooO0O0) obj2;
        OooOOO0.OooO0oO(acc, "acc");
        OooOOO0.OooO0oO(element, "element");
        InterfaceC34415OooO0oo interfaceC34415OooO0ooMinusKey = acc.minusKey(element.getKey());
        OooO oooO = OooO.f123416OooOo0o;
        if (interfaceC34415OooO0ooMinusKey == oooO) {
            return element;
        }
        InterfaceC34412OooO0o.OooO00o oooO00o = InterfaceC34412OooO0o.OooO00o.f123422OooOo0o;
        InterfaceC34412OooO0o interfaceC34412OooO0o = (InterfaceC34412OooO0o) interfaceC34415OooO0ooMinusKey.get(oooO00o);
        if (interfaceC34412OooO0o == null) {
            return new C34413OooO0o0(element, interfaceC34415OooO0ooMinusKey);
        }
        InterfaceC34415OooO0oo interfaceC34415OooO0ooMinusKey2 = interfaceC34415OooO0ooMinusKey.minusKey(oooO00o);
        return interfaceC34415OooO0ooMinusKey2 == oooO ? new C34413OooO0o0(interfaceC34412OooO0o, element) : new C34413OooO0o0(interfaceC34412OooO0o, new C34413OooO0o0(element, interfaceC34415OooO0ooMinusKey2));
    }
}
