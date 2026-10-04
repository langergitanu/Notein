package o0OO;

import com.orion.notein.data.p602db.entity.PageOffSet;
import com.orion.notein.data.p602db.entity.UpdatePageOffSetEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.o00O0O00;

/* JADX INFO: renamed from: o0OO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.NoteContentLocalDataSource$updateOffset$2", m80623f = "NoteContentLocalDataSource.kt", m80624l = {111}, m80625m = "invokeSuspend")
public final class C26409OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o00O0O00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90656OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90657OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ float f90658OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ float f90659OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f90660OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26409OooOO0o(float f, float f2, String str, Continuation<? super C26409OooOO0o> continuation) {
        super(2, continuation);
        this.f90659OooOoO0 = f;
        this.f90658OooOoO = f2;
        this.f90660OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26409OooOO0o c26409OooOO0o = new C26409OooOO0o(this.f90659OooOoO0, this.f90658OooOoO, this.f90660OooOoOO, continuation);
        c26409OooOO0o.f90656OooOo = obj;
        return c26409OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o00O0O00 o00o0o002, Continuation<? super C32460OooOooO> continuation) {
        return ((C26409OooOO0o) create(o00o0o002, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90657OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00O0O00 o00o0o002 = (o00O0O00) this.f90656OooOo;
            UpdatePageOffSetEntity updatePageOffSetEntity = new UpdatePageOffSetEntity(this.f90660OooOoOO, new PageOffSet(this.f90659OooOoO0, this.f90658OooOoO));
            this.f90657OooOo0o = 1;
            if (o00o0o002.OooO0oo(updatePageOffSetEntity, this) == enumC32485OooO00o) {
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
