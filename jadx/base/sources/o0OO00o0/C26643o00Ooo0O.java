package o0OO00o0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34967o00ooo00;

/* JADX INFO: renamed from: o0OO00o0.o00Ooo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ShapeLocalDataSource$deleteShapesByPageIdSync$2", m80623f = "ShapeLocalDataSource.kt", m80624l = {89}, m80625m = "invokeSuspend")
public final class C26643o00Ooo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34967o00ooo00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91957OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91958OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f91959OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26643o00Ooo0O(String str, Continuation<? super C26643o00Ooo0O> continuation) {
        super(2, continuation);
        this.f91959OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26643o00Ooo0O c26643o00Ooo0O = new C26643o00Ooo0O(this.f91959OooOoO0, continuation);
        c26643o00Ooo0O.f91957OooOo = obj;
        return c26643o00Ooo0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34967o00ooo00 abstractC34967o00ooo00, Continuation<? super C32460OooOooO> continuation) {
        return ((C26643o00Ooo0O) create(abstractC34967o00ooo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91958OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34967o00ooo00 abstractC34967o00ooo00 = (AbstractC34967o00ooo00) this.f91957OooOo;
            this.f91958OooOo0o = 1;
            if (abstractC34967o00ooo00.OooO0OO(this.f91959OooOoO0, this) == enumC32485OooO00o) {
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
