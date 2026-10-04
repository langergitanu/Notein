package o0OOo0o;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00O0Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getNoteMetasByIdsSync$2", m80623f = "NoteUseCase.kt", m80624l = {1285}, m80625m = "invokeSuspend")
public final class C27452o00O0Ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends NoteMeta>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96085OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96086OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f96087OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27452o00O0Ooo(C27449o00O0OoO c27449o00O0OoO, List<String> list, Continuation<? super C27452o00O0Ooo> continuation) {
        super(2, continuation);
        this.f96085OooOo = c27449o00O0OoO;
        this.f96087OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27452o00O0Ooo(this.f96085OooOo, this.f96087OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends NoteMeta>> continuation) {
        return ((C27452o00O0Ooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96086OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27449o00O0OoO c27449o00O0OoO = this.f96085OooOo;
        String strOooO0Oo = c27449o00O0OoO.f96037OooO0OO.OooO0Oo();
        this.f96086OooOo0o = 1;
        Object objOooOOOO = c27449o00O0OoO.f96036OooO0O0.OooOOOO(strOooO0Oo, this.f96087OooOoO0, this);
        return objOooOOOO == enumC32485OooO00o ? enumC32485OooO00o : objOooOOOO;
    }
}
