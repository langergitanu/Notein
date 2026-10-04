package o000OO00;

import androidx.fragment.app.Fragment;
import androidx.ink.brush.BrushFamilyNative;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.user.settings.password.UserSetPasswordFragment;

/* JADX INFO: renamed from: o000OO00.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24456OooOOOo implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82664OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82665OooOo0o;

    public /* synthetic */ C24456OooOOOo(Object obj, int i) {
        this.f82665OooOo0o = i;
        this.f82664OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f82664OooOo;
        switch (this.f82665OooOo0o) {
            case 0:
                return Long.valueOf(BrushFamilyNative.f65347OooO00o.getTextureAnimationLoopDurationMillis(((C24457OooOOo) obj).OooO0O0()));
            case 1:
                Fragment fragmentRequireParentFragment = ((AudioBarChildFragment) obj).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            case 2:
                int i = PenBarChildFragment.f75240o0000OOo;
                Fragment fragmentRequireParentFragment2 = ((PenBarChildFragment) obj).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment2, "requireParentFragment(...)");
                return fragmentRequireParentFragment2;
            default:
                UserSetPasswordFragment userSetPasswordFragment = (UserSetPasswordFragment) obj;
                return new com.orion.notein.p607ui.login.password.reset.OooO00o(userSetPasswordFragment, userSetPasswordFragment.OooOoO());
        }
    }
}
