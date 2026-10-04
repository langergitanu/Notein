package oO000Oo;

import com.google.common.base.Preconditions;
import java.util.List;
import java.util.Map;
import oO000Oo.C32041o0000OoO;
import oO0OOo0o.o000oOoO;

/* JADX INFO: renamed from: oO000Oo.o0000OOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32038o0000OOo extends o000oOoO.AbstractC33118OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f114535OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f114536OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f114537OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C31939OooO0oo f114538OooO0Oo;

    public C32038o0000OOo(boolean z, int i, int i2, C31939OooO0oo c31939OooO0oo) {
        this.f114535OooO00o = z;
        this.f114536OooO0O0 = i;
        this.f114537OooO0OO = i2;
        this.f114538OooO0Oo = (C31939OooO0oo) Preconditions.checkNotNull(c31939OooO0oo, "autoLoadBalancerFactory");
    }

    @Override // oO0OOo0o.o000oOoO.AbstractC33118OooO0oO
    public final o000oOoO.OooO0O0 OooO00o(Map<String, ?> map) {
        List<C32041o0000OoO.OooO00o> listOooO0Oo;
        o000oOoO.OooO0O0 oooO0O0;
        try {
            C31939OooO0oo c31939OooO0oo = this.f114538OooO0Oo;
            c31939OooO0oo.getClass();
            Object obj = null;
            if (map != null) {
                try {
                    listOooO0Oo = C32041o0000OoO.OooO0Oo(C32041o0000OoO.OooO0O0(map));
                } catch (RuntimeException e) {
                    oooO0O0 = new o000oOoO.OooO0O0(oO0OOo0o.o00Oo0.f119718OooO0oO.OooO0oo("can't parse load balancer configuration").OooO0oO(e));
                }
            } else {
                listOooO0Oo = null;
            }
            oooO0O0 = (listOooO0Oo == null || listOooO0Oo.isEmpty()) ? null : C32041o0000OoO.OooO0OO(listOooO0Oo, c31939OooO0oo.f113962OooO00o);
            if (oooO0O0 != null) {
                oO0OOo0o.o00Oo0 o00oo02 = oooO0O0.f119709OooO00o;
                if (o00oo02 != null) {
                    return new o000oOoO.OooO0O0(o00oo02);
                }
                obj = oooO0O0.f119710OooO0O0;
            }
            return new o000oOoO.OooO0O0(o000OOo.OooO00o(map, this.f114535OooO00o, this.f114536OooO0O0, this.f114537OooO0OO, obj));
        } catch (RuntimeException e2) {
            return new o000oOoO.OooO0O0(oO0OOo0o.o00Oo0.f119718OooO0oO.OooO0oo("failed to parse service config").OooO0oO(e2));
        }
    }
}
