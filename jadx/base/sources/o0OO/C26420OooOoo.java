package o0OO;

import com.orion.notein.data.p602db.entity.PdfInfoEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34932o00oOo0O;

/* JADX INFO: renamed from: o0OO.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.PdfInfoLocalDataSource$findPdfInfoById$2", m80623f = "PdfInfoLocalDataSource.kt", m80624l = {35}, m80625m = "invokeSuspend")
public final class C26420OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34932o00oOo0O, Continuation<? super PdfInfoEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90721OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90722OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f90723OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26420OooOoo(String str, Continuation<? super C26420OooOoo> continuation) {
        super(2, continuation);
        this.f90723OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26420OooOoo c26420OooOoo = new C26420OooOoo(this.f90723OooOoO0, continuation);
        c26420OooOoo.f90721OooOo = obj;
        return c26420OooOoo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34932o00oOo0O interfaceC34932o00oOo0O, Continuation<? super PdfInfoEntity> continuation) {
        return ((C26420OooOoo) create(interfaceC34932o00oOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90722OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC34932o00oOo0O interfaceC34932o00oOo0O = (InterfaceC34932o00oOo0O) this.f90721OooOo;
        this.f90722OooOo0o = 1;
        Object objOooO0OO = interfaceC34932o00oOo0O.OooO0OO(this.f90723OooOoO0, this);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }
}
