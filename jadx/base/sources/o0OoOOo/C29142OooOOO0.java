package o0OoOOo;

import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OoOOo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment", m80623f = "AudioBarChildFragment.kt", m80624l = {640}, m80625m = "showNonVipFeatureLimitedDialog")
public final class C29142OooOOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AudioBarChildFragment f103302OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f103303OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f103304OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29142OooOOO0(AudioBarChildFragment audioBarChildFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f103302OooOo = audioBarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f103303OooOo0o = obj;
        this.f103304OooOoO0 |= Integer.MIN_VALUE;
        return AudioBarChildFragment.OooOoO(this.f103302OooOo, 0, this);
    }
}
