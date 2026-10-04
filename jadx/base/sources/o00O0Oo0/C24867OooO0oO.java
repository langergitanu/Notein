package o00O0Oo0;

import android.os.Build;
import o00O0O0o.EnumC24838OooOO0o;
import o00O0OOo.C24853OooO0O0;
import o00O0OoO.C24880OooOOoo;

/* JADX INFO: renamed from: o00O0Oo0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24867OooO0oO extends AbstractC24863OooO0OO<C24853OooO0O0> {
    @Override // o00O0Oo0.AbstractC24863OooO0OO
    public final boolean OooO0O0(C24880OooOOoo c24880OooOOoo) {
        EnumC24838OooOO0o enumC24838OooOO0o = c24880OooOOoo.f84465OooOO0.f84232OooO00o;
        if (enumC24838OooOO0o != EnumC24838OooOO0o.f84260OooOoO0) {
            return Build.VERSION.SDK_INT >= 30 && enumC24838OooOO0o == EnumC24838OooOO0o.f84263OooOoo0;
        }
        return true;
    }

    @Override // o00O0Oo0.AbstractC24863OooO0OO
    public final boolean OooO0OO(C24853OooO0O0 c24853OooO0O0) {
        C24853OooO0O0 c24853OooO0O02 = c24853OooO0O0;
        return !c24853OooO0O02.f84400OooO00o || c24853OooO0O02.f84402OooO0OO;
    }
}
