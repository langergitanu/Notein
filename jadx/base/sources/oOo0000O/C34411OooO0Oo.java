package oOo0000O;

import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oOo0000O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C34411OooO0Oo implements InterfaceC32508OooOOOo {
    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        String acc = (String) obj;
        InterfaceC34415OooO0oo.OooO0O0 element = (InterfaceC34415OooO0oo.OooO0O0) obj2;
        OooOOO0.OooO0oO(acc, "acc");
        OooOOO0.OooO0oO(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}
