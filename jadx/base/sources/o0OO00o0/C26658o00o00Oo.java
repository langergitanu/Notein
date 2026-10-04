package o0OO00o0;

import com.orion.notein.data.p602db.NoteContentDatabase;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34993o0ooOoOO;

/* JADX INFO: renamed from: o0OO00o0.o00o00Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.StrokeLocalDataSource$handleWithStrokeDaoSync$2", m80623f = "StrokeLocalDataSource.kt", m80624l = {24}, m80625m = "invokeSuspend")
public final class C26658o00o00Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteContentDatabase, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91999OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92000OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f92001OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26658o00o00Oo(InterfaceC32508OooOOOo<? super AbstractC34993o0ooOoOO, ? super Continuation<Object>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super C26658o00o00Oo> continuation) {
        super(2, continuation);
        this.f92001OooOoO0 = (AbstractC32476OooO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26658o00o00Oo c26658o00o00Oo = new C26658o00o00Oo(this.f92001OooOoO0, continuation);
        c26658o00o00Oo.f91999OooOo = obj;
        return c26658o00o00Oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(NoteContentDatabase noteContentDatabase, Continuation<Object> continuation) {
        return ((C26658o00o00Oo) create(noteContentDatabase, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92000OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34993o0ooOoOO abstractC34993o0ooOoOOOooo0 = ((NoteContentDatabase) this.f91999OooOo).Oooo0();
        this.f92000OooOo0o = 1;
        Object objInvoke = this.f92001OooOoO0.invoke(abstractC34993o0ooOoOOOooo0, this);
        return objInvoke == enumC32485OooO00o ? enumC32485OooO00o : objInvoke;
    }
}
