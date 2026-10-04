package o0oOOO0o;

import com.orion.notein.domain.models.page.Page;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0oOOO0o.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment", m80623f = "PagePaddingFragment.kt", m80624l = {1665, 1667}, m80625m = "updateEditorAndIndicator")
public final class C30835OooOOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Page f110187OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PagePaddingFragment f110188OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public PagePaddingFragment f110189OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f110190OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f110191OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ PagePaddingFragment f110192OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f110193OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f110194OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30835OooOOO0(PagePaddingFragment pagePaddingFragment, Continuation<? super C30835OooOOO0> continuation) {
        super(continuation);
        this.f110192OooOoo = pagePaddingFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f110193OooOoo0 = obj;
        this.f110194OooOooO |= Integer.MIN_VALUE;
        return PagePaddingFragment.OooOoO(this.f110192OooOoo, null, this);
    }
}
