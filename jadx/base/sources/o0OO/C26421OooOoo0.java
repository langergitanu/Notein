package o0OO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34932o00oOo0O;

/* JADX INFO: renamed from: o0OO.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.PdfInfoLocalDataSource$deletePdfInfoById$2", m80623f = "PdfInfoLocalDataSource.kt", m80624l = {47}, m80625m = "invokeSuspend")
public final class C26421OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34932o00oOo0O, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90724OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90725OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f90726OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26421OooOoo0(String str, Continuation<? super C26421OooOoo0> continuation) {
        super(2, continuation);
        this.f90726OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26421OooOoo0 c26421OooOoo0 = new C26421OooOoo0(this.f90726OooOoO0, continuation);
        c26421OooOoo0.f90724OooOo = obj;
        return c26421OooOoo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34932o00oOo0O interfaceC34932o00oOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((C26421OooOoo0) create(interfaceC34932o00oOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90725OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34932o00oOo0O interfaceC34932o00oOo0O = (InterfaceC34932o00oOo0O) this.f90724OooOo;
            this.f90725OooOo0o = 1;
            if (interfaceC34932o00oOo0O.OooO00o(this.f90726OooOoO0, this) == enumC32485OooO00o) {
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
