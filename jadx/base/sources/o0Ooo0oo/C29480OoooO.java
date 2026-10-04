package o0Ooo0oo;

import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Ooo0oo.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment", m80623f = "PenBarChildFragment.kt", m80624l = {2239}, m80625m = "showNonVipFeatureLimitedDialog")
public final class C29480OoooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104570OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f104571OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f104572OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29480OoooO(PenBarChildFragment penBarChildFragment, Continuation<? super C29480OoooO> continuation) {
        super(continuation);
        this.f104570OooOo = penBarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f104571OooOo0o = obj;
        this.f104572OooOoO0 |= Integer.MIN_VALUE;
        return PenBarChildFragment.OooOoo0(this.f104570OooOo, 0, this);
    }
}
