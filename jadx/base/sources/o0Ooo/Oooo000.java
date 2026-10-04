package o0Ooo;

import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.p609vo.PenVO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment", m80623f = "PenBoxChildFragment.kt", m80624l = {2385, 2391, 2397, 2403, 2409}, m80625m = "allowToUseThePen")
public final class Oooo000 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public PenVO f103810OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PenBoxChildFragment f103811OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103812OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f103813OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f103814OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(PenBoxChildFragment penBoxChildFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f103812OooOoO = penBoxChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f103813OooOoO0 = obj;
        this.f103814OooOoOO |= Integer.MIN_VALUE;
        return PenBoxChildFragment.OooOoO(this.f103812OooOoO, null, this);
    }
}
