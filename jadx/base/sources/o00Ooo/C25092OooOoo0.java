package o00Ooo;

import o00Ooo.C25093OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0OO.o00000OO;

/* JADX INFO: renamed from: o00Ooo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", m80623f = "SuspendingPointerInputFilter.kt", m80624l = {628}, m80625m = "withTimeout")
public final class C25092OooOoo0<T> extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f85171OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o00000OO f85172OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f85173OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C25093OooOooO.OooO00o<Object> f85174OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25092OooOoo0(C25093OooOooO.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f85174OooOoO0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f85171OooOo = obj;
        this.f85173OooOoO |= Integer.MIN_VALUE;
        return this.f85174OooOoO0.Oooo(0L, null, this);
    }
}
