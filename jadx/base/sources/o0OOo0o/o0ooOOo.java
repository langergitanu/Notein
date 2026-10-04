package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOoooO.C27996OooO00o;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$getFolderColors$2", m80623f = "FolderUseCase.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_2}, m80625m = "invokeSuspend")
public final class o0ooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Integer>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f96993OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96994OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(C27600o0ooOO0 c27600o0ooOO0, Continuation<? super o0ooOOo> continuation) {
        super(2, continuation);
        this.f96993OooOo = c27600o0ooOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0ooOOo(this.f96993OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Integer>> continuation) {
        return ((o0ooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96994OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C28009OooOOOO c28009OooOOOO = this.f96993OooOo.f96982OooO00o;
        this.f96994OooOo0o = 1;
        c28009OooOOOO.f99338OooO0Oo.getClass();
        List listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(C27996OooO00o.f99274OooO00o), Integer.valueOf(C27996OooO00o.f99275OooO0O0), Integer.valueOf(C27996OooO00o.f99276OooO0OO), Integer.valueOf(C27996OooO00o.f99277OooO0Oo), Integer.valueOf(C27996OooO00o.f99279OooO0o0), Integer.valueOf(C27996OooO00o.f99278OooO0o), Integer.valueOf(C27996OooO00o.f99280OooO0oO), Integer.valueOf(C27996OooO00o.f99281OooO0oo), Integer.valueOf(C27996OooO00o.f99273OooO));
        return listOooOO0o == enumC32485OooO00o ? enumC32485OooO00o : listOooOO0o;
    }
}
