package o0o0Oo0O;

import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0o0Oo0O.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.GlobalSettingsFragment", m80623f = "GlobalSettingsFragment.kt", m80624l = {454}, m80625m = "showNonVipFeatureLimitedDialog")
public final class C30609OooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ GlobalSettingsFragment f109543OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f109544OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f109545OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30609OooO(GlobalSettingsFragment globalSettingsFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f109543OooOo = globalSettingsFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f109544OooOo0o = obj;
        this.f109545OooOoO0 |= Integer.MIN_VALUE;
        return GlobalSettingsFragment.OooOoO(this.f109543OooOo, 0, this);
    }
}
