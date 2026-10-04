package oO0OOo0;

import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32443OooOOO;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33350Oooooo;
import oO0Ooo.C33317OooOoO;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.C33351Oooooo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0Ooo.Oooo000;
import oO0Ooo0.C33361OooO0Oo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oO0OOo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33054OooO0Oo {

    /* JADX INFO: renamed from: oO0OOo0.OooO0Oo$OooO00o */
    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<AbstractC33320OooOoo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33348OooooOO f119502OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(InterfaceC33348OooooOO interfaceC33348OooooOO) {
            super(0);
            this.f119502OooOo0o = interfaceC33348OooooOO;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC33320OooOoo invoke() {
            AbstractC33320OooOoo type = this.f119502OooOo0o.getType();
            OooOOO0.OooO0o(type, "this@createCapturedIfNeeded.type");
            return type;
        }
    }

    public static final InterfaceC33348OooooOO OooO00o(InterfaceC33348OooooOO interfaceC33348OooooOO, InterfaceC32637OoooOoo interfaceC32637OoooOoo) {
        if (interfaceC32637OoooOoo == null || interfaceC33348OooooOO.OooO0OO() == 1) {
            return interfaceC33348OooooOO;
        }
        if (interfaceC32637OoooOoo.OooOo0() != interfaceC33348OooooOO.OooO0OO()) {
            OooO0OO oooO0OO = new OooO0OO(interfaceC33348OooooOO);
            C33339OoooOOO.f120598OooOo.getClass();
            return new C33351Oooooo0(1, new C33053OooO00o(interfaceC33348OooooOO, oooO0OO, false, C33339OoooOOO.f120599OooOoO0));
        }
        if (!interfaceC33348OooooOO.OooO00o()) {
            return new C33351Oooooo0(interfaceC33348OooooOO.getType());
        }
        C33361OooO0Oo.OooO00o NO_LOCKS = C33361OooO0Oo.f120642OooO0o0;
        OooOOO0.OooO0o(NO_LOCKS, "NO_LOCKS");
        return new C33351Oooooo0(1, new Oooo000(NO_LOCKS, new OooO00o(interfaceC33348OooooOO)));
    }

    public static AbstractC33350Oooooo OooO0O0(AbstractC33350Oooooo abstractC33350Oooooo) {
        if (!(abstractC33350Oooooo instanceof C33317OooOoO)) {
            return new C33055OooO0o0(abstractC33350Oooooo);
        }
        C33317OooOoO c33317OooOoO = (C33317OooOoO) abstractC33350Oooooo;
        InterfaceC33348OooooOO[] interfaceC33348OooooOOArr = c33317OooOoO.f120557OooO0OO;
        OooOOO0.OooO0oO(interfaceC33348OooooOOArr, "<this>");
        InterfaceC32637OoooOoo[] other = c33317OooOoO.f120556OooO0O0;
        OooOOO0.OooO0oO(other, "other");
        int iMin = Math.min(interfaceC33348OooooOOArr.length, other.length);
        ArrayList<C32443OooOOO> arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new C32443OooOOO(interfaceC33348OooooOOArr[i], other[i]));
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (C32443OooOOO c32443OooOOO : arrayList) {
            arrayList2.add(OooO00o((InterfaceC33348OooooOO) c32443OooOOO.f116638OooOo0o, (InterfaceC32637OoooOoo) c32443OooOOO.f116637OooOo));
        }
        return new C33317OooOoO(other, (InterfaceC33348OooooOO[]) arrayList2.toArray(new InterfaceC33348OooooOO[0]), true);
    }
}
