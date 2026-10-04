package o000OO00;

import androidx.ink.brush.BrushFamilyNative;
import com.orion.notein.p607ui.user.settings.password.ConfirmPasswordFragment;
import o0OOoO0O.C27750OooOoO0;
import o0oO0O00.C30781OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82662OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82663OooOo0o;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f82663OooOo0o = i;
        this.f82662OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f82663OooOo0o) {
            case 0:
                return BrushFamilyNative.f65347OooO00o.getClientBrushFamilyId(((C24457OooOOo) this.f82662OooOo).OooO0O0());
            case 1:
                return ((C27750OooOoO0) this.f82662OooOo).f97969OooOOO0;
            default:
                ConfirmPasswordFragment confirmPasswordFragment = (ConfirmPasswordFragment) this.f82662OooOo;
                return new com.orion.notein.p607ui.login.password.reset.OooO00o(confirmPasswordFragment, (C30781OooOO0o) confirmPasswordFragment.f79922OooOoo0.getValue());
        }
    }
}
