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

/* JADX INFO: renamed from: o0OO.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.PdfInfoRepoImpl$findPdfInfoById$2", m80623f = "PdfInfoRepoImpl.kt", m80624l = {36}, m80625m = "invokeSuspend")
public final class C26426Oooo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super PdfInfo>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26427Oooo0O0 f90746OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90747OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f90748OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f90749OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26426Oooo00o(C26427Oooo0O0 c26427Oooo0O0, String str, String str2, Continuation<? super C26426Oooo00o> continuation) {
        super(2, continuation);
        this.f90746OooOo = c26427Oooo0O0;
        this.f90749OooOoO0 = str;
        this.f90748OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26426Oooo00o(this.f90746OooOo, this.f90749OooOoO0, this.f90748OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super PdfInfo> continuation) {
        return ((C26426Oooo00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90747OooOo0o;
        C26427Oooo0O0 c26427Oooo0O0 = this.f90746OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Oooo000 oooo000 = c26427Oooo0O0.f90751OooO0O0;
            this.f90747OooOo0o = 1;
            oooo000.getClass();
            obj = oooo000.f90741OooO00o.OooO0oO(this.f90748OooOoO, new C26423OooOooo(new C26420OooOoo(this.f90749OooOoO0, null), null));
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        PdfInfoEntity pdfInfoEntity = (PdfInfoEntity) obj;
        if (pdfInfoEntity != null) {
            return c26427Oooo0O0.f90752OooO0OO.toPdfInfo(pdfInfoEntity);
        }
        return null;
    }
}
