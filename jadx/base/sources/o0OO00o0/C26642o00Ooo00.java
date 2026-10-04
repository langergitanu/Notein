package o0OO00o0;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34967o00ooo00;

/* JADX INFO: renamed from: o0OO00o0.o00Ooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ShapeLocalDataSource$deleteShapesByIds$2", m80623f = "ShapeLocalDataSource.kt", m80624l = {82}, m80625m = "invokeSuspend")
public final class C26642o00Ooo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34967o00ooo00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f91953OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f91954OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ List<String> f91955OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f91956OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26642o00Ooo00(List<String> list, Continuation<? super C26642o00Ooo00> continuation) {
        super(2, continuation);
        this.f91955OooOoO = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26642o00Ooo00 c26642o00Ooo00 = new C26642o00Ooo00(this.f91955OooOoO, continuation);
        c26642o00Ooo00.f91956OooOoO0 = obj;
        return c26642o00Ooo00;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34967o00ooo00 abstractC34967o00ooo00, Continuation<? super C32460OooOooO> continuation) {
        return ((C26642o00Ooo00) create(abstractC34967o00ooo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        AbstractC34967o00ooo00 abstractC34967o00ooo00;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91953OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34967o00ooo00 abstractC34967o00ooo002 = (AbstractC34967o00ooo00) this.f91956OooOoO0;
            it = oOo000Oo.OooOo.oo0o0Oo(100, 100, this.f91955OooOoO).iterator();
            abstractC34967o00ooo00 = abstractC34967o00ooo002;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f91954OooOo0o;
            abstractC34967o00ooo00 = (AbstractC34967o00ooo00) this.f91956OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (it.hasNext()) {
            List list = (List) it.next();
            this.f91956OooOoO0 = abstractC34967o00ooo00;
            this.f91954OooOo0o = it;
            this.f91953OooOo = 1;
            if (abstractC34967o00ooo00.OooO0Oo(list, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
