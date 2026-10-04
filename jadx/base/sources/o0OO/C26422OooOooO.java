package o0OO;

import com.orion.notein.data.p602db.entity.PdfInfoEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34932o00oOo0O;

/* JADX INFO: renamed from: o0OO.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.PdfInfoLocalDataSource$getPdfInfosByNoteId$2", m80623f = "PdfInfoLocalDataSource.kt", m80624l = {41}, m80625m = "invokeSuspend")
public final class C26422OooOooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34932o00oOo0O, Continuation<? super List<? extends PdfInfoEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90727OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90728OooOo0o;

    public C26422OooOooO() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26422OooOooO c26422OooOooO = new C26422OooOooO(2, continuation);
        c26422OooOooO.f90727OooOo = obj;
        return c26422OooOooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34932o00oOo0O interfaceC34932o00oOo0O, Continuation<? super List<? extends PdfInfoEntity>> continuation) {
        return ((C26422OooOooO) create(interfaceC34932o00oOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90728OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC34932o00oOo0O interfaceC34932o00oOo0O = (InterfaceC34932o00oOo0O) this.f90727OooOo;
        this.f90728OooOo0o = 1;
        Object objOooO0Oo = interfaceC34932o00oOo0O.OooO0Oo(this);
        return objOooO0Oo == enumC32485OooO00o ? enumC32485OooO00o : objOooO0Oo;
    }
}
