package o0OO;

import com.orion.notein.data.p602db.entity.PdfInfoEntity;
import com.orion.notein.domain.models.note.PdfInfo;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.PdfInfoRepoImpl$createPdfInfo$2", m80623f = "PdfInfoRepoImpl.kt", m80624l = {32}, m80625m = "invokeSuspend")
public final class C26425Oooo00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26427Oooo0O0 f90742OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90743OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f90744OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ PdfInfo f90745OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26425Oooo00O(C26427Oooo0O0 c26427Oooo0O0, PdfInfo pdfInfo, String str, Continuation<? super C26425Oooo00O> continuation) {
        super(2, continuation);
        this.f90742OooOo = c26427Oooo0O0;
        this.f90745OooOoO0 = pdfInfo;
        this.f90744OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26425Oooo00O(this.f90742OooOo, this.f90745OooOoO0, this.f90744OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26425Oooo00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90743OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26427Oooo0O0 c26427Oooo0O0 = this.f90742OooOo;
            PdfInfoEntity entity = c26427Oooo0O0.f90752OooO0OO.toEntity(this.f90745OooOoO0);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(entity);
            this.f90743OooOo0o = 1;
            Oooo000 oooo000 = c26427Oooo0O0.f90751OooO0O0;
            oooo000.getClass();
            Object objOooO0oO = oooo000.f90741OooO00o.OooO0oO(this.f90744OooOoO, new C26423OooOooo(new C26419OooOoOO(entity, null), null));
            if (objOooO0oO != enumC32485OooO00o) {
                objOooO0oO = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0oO == enumC32485OooO00o) {
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
