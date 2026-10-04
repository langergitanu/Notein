package OooOoo;

import OooOoo.C20615OooOooO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: OooOoo.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", m80623f = "Scrollable.kt", m80624l = {476}, m80625m = "invokeSuspend")
public final class C20626OoooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC20633OoooOo0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f59073OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f59074OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C20615OooOooO.OooO00o f59075OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C20630OoooOO0 f59076OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20626OoooO(C20630OoooOO0 c20630OoooOO0, C20615OooOooO.OooO00o oooO00o, Continuation continuation) {
        super(2, continuation);
        this.f59076OooOoO0 = c20630OoooOO0;
        this.f59075OooOoO = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C20626OoooO c20626OoooO = new C20626OoooO(this.f59076OooOoO0, this.f59075OooOoO, continuation);
        c20626OoooO.f59073OooOo = obj;
        return c20626OoooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC20633OoooOo0 interfaceC20633OoooOo0, Continuation<? super C32460OooOooO> continuation) {
        return ((C20626OoooO) create(interfaceC20633OoooOo0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59074OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC20633OoooOo0 interfaceC20633OoooOo0 = (InterfaceC20633OoooOo0) this.f59073OooOo;
            C20630OoooOO0 c20630OoooOO0 = this.f59076OooOoO0;
            c20630OoooOO0.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC20633OoooOo0, "<set-?>");
            c20630OoooOO0.f59090OooO0O0 = interfaceC20633OoooOo0;
            this.f59074OooOo0o = 1;
            if (this.f59075OooOoO.invoke(c20630OoooOO0, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
