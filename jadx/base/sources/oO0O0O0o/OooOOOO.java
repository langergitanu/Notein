package oO0O0O0o;

import com.facebook.soloader.OooOo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0Oo0.C32691Oooo0o;
import oO0O0Oo0.C32703OoooOoO;
import oO0O0Oo0.OooOo00;
import oO0Ooo.C33306OooOOO0;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33479OooO0o;
import oO0Oooo.C33509OooO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C32691Oooo0o f117205OooO00o;

    static {
        C33509OooO c33509OooO = C33509OooO.f121032OooO00o;
        OooOo00 oooOo00 = new OooOo00(C33509OooO.f121033OooO0O0, OooOOO.f117139OooO0o0);
        C33479OooO0o c33479OooO0oOooO0o = OooOOO.f117138OooO0o.OooO0o();
        C33361OooO0Oo.OooO00o oooO00o = C33361OooO0Oo.f120642OooO0o0;
        C32691Oooo0o c32691Oooo0o = new C32691Oooo0o(oooOo00, c33479OooO0oOooO0o, oooO00o);
        c32691Oooo0o.f117518OooOooO = EnumC32614OooOoOO.f117262OooOoO;
        C32602OooOOo0.C32606OooO0oo c32606OooO0oo = C32602OooOOo0.f117243OooO0o0;
        if (c32606OooO0oo == null) {
            C32691Oooo0o.o000OOo(9);
            throw null;
        }
        c32691Oooo0o.f117519OooOooo = c32606OooO0oo;
        List listOooO0oO = OooOo.OooO0oO(C32703OoooOoO.o00000O(c32691Oooo0o, 2, C33479OooO0o.OooO0o0("T"), 0, oooO00o));
        if (c32691Oooo0o.f117522Oooo00O != null) {
            throw new IllegalStateException("Type parameters are already set for " + c32691Oooo0o.getName());
        }
        ArrayList arrayList = new ArrayList(listOooO0oO);
        c32691Oooo0o.f117522Oooo00O = arrayList;
        c32691Oooo0o.f117521Oooo000 = new C33306OooOOO0(c32691Oooo0o, arrayList, c32691Oooo0o.f117523Oooo00o, c32691Oooo0o.f117520Oooo0);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            C32691Oooo0o.o000OOo(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((oO0O0Oo0.OooOOO) ((InterfaceC32609OooOo0) it.next())).o00000oO(c32691Oooo0o.OooOOO());
        }
        f117205OooO00o = c32691Oooo0o;
    }
}
