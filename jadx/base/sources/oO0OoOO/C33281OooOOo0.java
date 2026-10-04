package oO0OoOO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00O0oo0.C24969OooOO0;
import oO00ooO.C32442OooOO0o;
import oO0O0OO.InterfaceC32635OoooOo0;
import oO0O0Oo0.AbstractC32668OooO0o0;
import oO0OO00.C32889OooOOOo;
import oO0OO00.C32890OooOOo;
import oO0OO0Oo.C32922OooO0oO;
import oO0Oo00.C33194OooO0O0;
import oO0OoO0.C33239OooOO0o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0OoOO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33281OooOOo0 extends AbstractC32668OooO0o0 {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C33260OooO00o f120495Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final oO0OoO0.OooOOO f120496Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C32890OooOOo f120497Oooo00o;

    /* JADX INFO: renamed from: oO0OoOO.OooOOo0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<List<? extends oOo0oooO.OooO0OO>> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final List<? extends oOo0oooO.OooO0OO> invoke() {
            C33281OooOOo0 c33281OooOOo0 = C33281OooOOo0.this;
            oO0OoO0.OooOOO oooOOO = c33281OooOOo0.f120496Oooo00O;
            return OooOo.o0ooOO0(oooOOO.f120289OooO00o.f120274OooO0o0.OooOO0(c33281OooOOo0.f120497Oooo00o, oooOOO.f120290OooO0O0));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C33281OooOOo0(oO0OoO0.OooOOO c, C32890OooOOo c32890OooOOo, int i) {
        int i2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c, "c");
        C33239OooOO0o c33239OooOO0o = c.f120289OooO00o;
        C33361OooO0Oo c33361OooO0Oo = c33239OooOO0o.f120269OooO00o;
        InterfaceC34588OooO0oO.OooO00o.C20364OooO00o c20364OooO00o = InterfaceC34588OooO0oO.OooO00o.f123919OooO00o;
        C33479OooO0o c33479OooO0oOooO0O0 = C24969OooOO0.OooO0O0(c.f120290OooO0O0, c32890OooOOo.f118422OooOoOO);
        C32890OooOOo.OooO0OO oooO0OO = c32890OooOOo.f118423OooOoo;
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0OO, "proto.variance");
        int iOrdinal = oooO0OO.ordinal();
        int i3 = 2;
        if (iOrdinal != 0) {
            i2 = 1;
            if (iOrdinal == 1) {
                i3 = 3;
                i2 = i3;
            } else if (iOrdinal != 2) {
                throw new C32442OooOO0o();
            }
        } else {
            i2 = i3;
        }
        super(c33361OooO0Oo, c.f120291OooO0OO, c20364OooO00o, c33479OooO0oOooO0O0, i2, c32890OooOOo.f118424OooOoo0, i, InterfaceC32635OoooOo0.OooO00o.f117292OooO00o);
        this.f120496Oooo00O = c;
        this.f120497Oooo00o = c32890OooOOo;
        this.f120495Oooo0 = new C33260OooO00o(c33239OooOO0o.f120269OooO00o, new OooO00o());
    }

    @Override // oOo0oooO.OooO0O0, oOo0oooO.OooO00o
    public final InterfaceC34588OooO0oO getAnnotations() {
        return this.f120495Oooo0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    @Override // oO0O0Oo0.OooOOO0
    public final List<AbstractC33320OooOoo> o00000() {
        oO0OoO0.OooOOO oooOOO = this.f120496Oooo00O;
        C32922OooO0oO c32922OooO0oO = oooOOO.f120292OooO0Oo;
        C32890OooOOo c32890OooOOo = this.f120497Oooo00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32890OooOOo, "<this>");
        List<C32889OooOOOo> list = c32890OooOOo.f118425OooOooO;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> upperBoundIdList = c32890OooOOo.f118426OooOooo;
            kotlin.jvm.internal.OooOOO0.OooO0o(upperBoundIdList, "upperBoundIdList");
            List<Integer> list2 = upperBoundIdList;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            for (Integer it : list2) {
                kotlin.jvm.internal.OooOOO0.OooO0o(it, "it");
                arrayList.add(c32922OooO0oO.OooO00o(it.intValue()));
            }
        }
        if (arrayList.isEmpty()) {
            return com.facebook.soloader.OooOo.OooO0oO(C33194OooO0O0.OooO0o0(this).OooOOO());
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(oooOOO.f120296OooO0oo.OooO0oO((C32889OooOOOo) it2.next()));
        }
        return arrayList2;
    }

    @Override // oO0O0Oo0.OooOOO0
    public final void o000000o(AbstractC33320OooOoo type) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
