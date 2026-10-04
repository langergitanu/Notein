package Oooo0oO;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C24039Oooo0o0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C21108o00oO0o<Object, C21073OooooOO>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o000OOo f61257OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(o000OOo o000ooo2) {
        super(0);
        this.f61257OooOo0o = o000ooo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [Oooo0oO.OooooOO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
    @Override // oO0O000o.OooO00o
    public final C21108o00oO0o<Object, C21073OooooOO> invoke() {
        o000OOo o000ooo2 = this.f61257OooOo0o;
        OooOo.OooOo oooOo = new OooOo.OooOo(o000ooo2.f61223OooO00o.size());
        ArrayList arrayList = o000ooo2.f61223OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ?? OooOOO2 = (C21073OooooOO) arrayList.get(i);
            Object obj = OooOOO2.f61037OooO0O0;
            int i2 = OooOOO2.f61036OooO00o;
            Object c21072OooooO0 = obj != null ? new C21072OooooO0(OooOOO2.f61037OooO0O0, Integer.valueOf(i2)) : Integer.valueOf(i2);
            int iOooO0o0 = oooOo.OooO0o0(c21072OooooO0);
            boolean z = iOooO0o0 < 0;
            Object obj2 = z ? null : oooOo.f58533OooO0OO[iOooO0o0];
            if (obj2 != null) {
                if (C24039Oooo0o0.OooO0oO(obj2)) {
                    List listOooO0O0 = C24039Oooo0o0.OooO0O0(obj2);
                    listOooO0O0.add(OooOOO2);
                    OooOOO2 = listOooO0O0;
                } else {
                    OooOOO2 = C34429OooOOo0.OooOOO(obj2, OooOOO2);
                }
            }
            if (z) {
                int i3 = ~iOooO0o0;
                oooOo.f58532OooO0O0[i3] = c21072OooooO0;
                oooOo.f58533OooO0OO[i3] = OooOOO2;
            } else {
                oooOo.f58533OooO0OO[iOooO0o0] = OooOOO2;
            }
        }
        return new C21108o00oO0o<>(oooOo);
    }
}
