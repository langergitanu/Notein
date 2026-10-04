package o0OO00o0;

import com.orion.notein.data.p602db.NoteContentDatabase;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34981o0O00OoO;

/* JADX INFO: renamed from: o0OO00o0.o00o0Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.TextBoxLocalDataSource$handleWithTextBoxDaoSync$2", m80623f = "TextBoxLocalDataSource.kt", m80624l = {19}, m80625m = "invokeSuspend")
public final class C26674o00o0Ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteContentDatabase, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92053OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92054OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f92055OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26674o00o0Ooo(InterfaceC32508OooOOOo<? super AbstractC34981o0O00OoO, ? super Continuation<Object>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super C26674o00o0Ooo> continuation) {
        super(2, continuation);
        this.f92055OooOoO0 = (AbstractC32476OooO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26674o00o0Ooo c26674o00o0Ooo = new C26674o00o0Ooo(this.f92055OooOoO0, continuation);
        c26674o00o0Ooo.f92053OooOo = obj;
        return c26674o00o0Ooo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(NoteContentDatabase noteContentDatabase, Continuation<Object> continuation) {
        return ((C26674o00o0Ooo) create(noteContentDatabase, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92054OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34981o0O00OoO abstractC34981o0O00OoOOooo0O0 = ((NoteContentDatabase) this.f92053OooOo).Oooo0O0();
        this.f92054OooOo0o = 1;
        Object objInvoke = this.f92055OooOoO0.invoke(abstractC34981o0O00OoOOooo0O0, this);
        return objInvoke == enumC32485OooO00o ? enumC32485OooO00o : objInvoke;
    }
}
