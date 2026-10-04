package OooOoOO;

import java.util.ArrayList;
import java.util.Iterator;
import oO0O00oo.C32520OooO0oo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements InterfaceC20533OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f58803OooO00o;

    public o00Oo0(float f, float f2, AbstractC20531OooOOo abstractC20531OooOOo) {
        oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(0, abstractC20531OooOOo.OooO0O0());
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(OooO2, 10));
        Iterator<Integer> it = OooO2.iterator();
        while (((C32520OooO0oo) it).f116817OooOoO0) {
            arrayList.add(new C20541OooOoo(f, f2, abstractC20531OooOOo.OooO00o(((oOo000Oo.Oooo000) it).nextInt())));
        }
        this.f58803OooO00o = arrayList;
    }

    @Override // OooOoOO.InterfaceC20533OooOOoo
    public final InterfaceC20542OooOoo0 get(int i) {
        return (C20541OooOoo) this.f58803OooO00o.get(i);
    }
}
