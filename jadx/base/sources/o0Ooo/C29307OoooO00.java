package o0Ooo;

import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Ooo.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment", m80623f = "PenBoxChildFragment.kt", m80624l = {2481}, m80625m = "showNonVipFeatureLimitedDialog")
public final class C29307OoooO00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103947OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f103948OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f103949OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29307OoooO00(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29307OoooO00> continuation) {
        super(continuation);
        this.f103947OooOo = penBoxChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f103948OooOo0o = obj;
        this.f103949OooOoO0 |= Integer.MIN_VALUE;
        return PenBoxChildFragment.OooOoo0(this.f103947OooOo, 0, this);
    }
}
