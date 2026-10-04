package oO0Ooo;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import oO00ooOO.C32463OooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Ooo.AbstractC33344OoooOoo;
import oO0Ooo.C33345Ooooo00;
import oO0o000.C33538OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34449Oooo0oo;
import oOo00OOO.C34484OooO00o;

/* JADX INFO: renamed from: oO0Ooo.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33347OooooO0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C33345Ooooo00.OooO00o, AbstractC33320OooOoo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33345Ooooo00 f120620OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33347OooooO0(C33345Ooooo00 c33345Ooooo00) {
        super(1);
        this.f120620OooOo0o = c33345Ooooo00;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final AbstractC33320OooOoo invoke(C33345Ooooo00.OooO00o oooO00o) {
        InterfaceC33348OooooOO interfaceC33348OooooOOOooO0OO;
        C33345Ooooo00.OooO00o oooO00o2 = oooO00o;
        InterfaceC32637OoooOoo typeParameter = oooO00o2.f120617OooO00o;
        C33345Ooooo00 c33345Ooooo00 = this.f120620OooOo0o;
        c33345Ooooo00.getClass();
        C34484OooO00o c34484OooO00o = oooO00o2.f120618OooO0O0;
        Set<InterfaceC32637OoooOoo> setOooO0O0 = c34484OooO00o.OooO0O0();
        if (setOooO0O0 != null && setOooO0O0.contains(typeParameter.o000OOo())) {
            return c33345Ooooo00.OooO00o(c34484OooO00o);
        }
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOO = typeParameter.OooOOO();
        kotlin.jvm.internal.OooOOO0.OooO0o(abstractC33328Oooo0O0OooOOO, "typeParameter.defaultType");
        LinkedHashSet<InterfaceC32637OoooOoo> linkedHashSet = new LinkedHashSet();
        C33538OooO0OO.OooO0Oo(abstractC33328Oooo0O0OooOOO, abstractC33328Oooo0O0OooOOO, linkedHashSet, setOooO0O0);
        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(linkedHashSet, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
        for (InterfaceC32637OoooOoo interfaceC32637OoooOoo : linkedHashSet) {
            if (setOooO0O0 == null || !setOooO0O0.contains(interfaceC32637OoooOoo)) {
                c34484OooO00o.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(typeParameter, "typeParameter");
                Set<InterfaceC32637OoooOoo> set = c34484OooO00o.f123576OooO0o;
                interfaceC33348OooooOOOooO0OO = c33345Ooooo00.f120614OooO00o.OooO0OO(interfaceC32637OoooOoo, c34484OooO00o, c33345Ooooo00, c33345Ooooo00.OooO0O0(interfaceC32637OoooOoo, C34484OooO00o.OooO00o(c34484OooO00o, null, false, set != null ? C34449Oooo0oo.OooO(set, typeParameter) : C34449Oooo0oo.OooOO0(typeParameter), null, 47)));
            } else {
                interfaceC33348OooooOOOooO0OO = o00Oo0.OooOO0o(interfaceC32637OoooOoo, c34484OooO00o);
            }
            linkedHashMap.put(interfaceC32637OoooOoo.OooO(), interfaceC33348OooooOOOooO0OO);
        }
        AbstractC33344OoooOoo.OooO00o oooO00o3 = AbstractC33344OoooOoo.f120613OooO0O0;
        C33356ooOO c33356ooOOOooO0o0 = C33356ooOO.OooO0o0(new C33343OoooOoO(linkedHashMap));
        List<AbstractC33320OooOoo> upperBounds = typeParameter.getUpperBounds();
        kotlin.jvm.internal.OooOOO0.OooO0o(upperBounds, "typeParameter.upperBounds");
        C32463OooO c32463OooOOooO0OO = c33345Ooooo00.OooO0OO(c33356ooOOOooO0o0, upperBounds, c34484OooO00o);
        if (c32463OooOOooO0OO.f116671OooOo0o.isEmpty()) {
            return c33345Ooooo00.OooO00o(c34484OooO00o);
        }
        if (c32463OooOOooO0OO.f116671OooOo0o.f116698OooOooo == 1) {
            return (AbstractC33320OooOoo) oOo000Oo.OooOo.Oooooo(c32463OooOOooO0OO);
        }
        throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
    }
}
