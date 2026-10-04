package oO0o0OoO;

import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33780o00Ooo;

/* JADX INFO: renamed from: oO0o0OoO.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33816OooOoo extends C33772OooooOo<Integer> implements InterfaceC33780o00Ooo<Integer> {
    public final void OooOo0O(int i) {
        synchronized (this) {
            Object[] objArr = this.f121752OooOooO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(objArr);
            OooO0Oo(Integer.valueOf(((Number) objArr[((int) ((this.f121753OooOooo + ((long) ((int) ((OooOOOO() + ((long) this.f121755Oooo00O)) - this.f121753OooOooo)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }

    @Override // oO0o0Oo.InterfaceC33780o00Ooo
    public final Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f121752OooOooO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f121753OooOooo + ((long) ((int) ((OooOOOO() + ((long) this.f121755Oooo00O)) - this.f121753OooOooo)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }
}
