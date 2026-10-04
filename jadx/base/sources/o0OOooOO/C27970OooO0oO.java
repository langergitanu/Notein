package o0OOooOO;

import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfSetPaperTheme;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOooOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.paper.DownloadThemeUseCase$invoke$2", m80623f = "DownloadThemeUseCase.kt", m80624l = {30}, m80625m = "invokeSuspend")
public final class C27970OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PaperTheme f99164OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99165OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27971OooO0oo f99166OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27970OooO0oO(PaperTheme paperTheme, C27971OooO0oo c27971OooO0oo, Continuation<? super C27970OooO0oO> continuation) {
        super(2, continuation);
        this.f99164OooOo = paperTheme;
        this.f99166OooOoO0 = c27971OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27970OooO0oO(this.f99164OooOo, this.f99166OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27970OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99165OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            PaperTheme paperTheme = this.f99164OooOo;
            if (!OooOOO0.OooO0O0(paperTheme.getDownloadable(), Boolean.TRUE) || !(paperTheme instanceof PdfSetPaperTheme)) {
                return Boolean.FALSE;
            }
            C27971OooO0oo c27971OooO0oo = this.f99166OooOoO0;
            File fileOooO0O0 = c27971OooO0oo.f99167OooO00o.OooO0O0(paperTheme);
            if (fileOooO0O0 == null) {
                return Boolean.FALSE;
            }
            String name = fileOooO0O0.getName();
            OooOOO0.OooO0Oo(name);
            String strOooO00o = c27971OooO0oo.f99167OooO00o.OooO00o(name);
            this.f99165OooOo0o = 1;
            obj = c27971OooO0oo.f99168OooO0O0.OooO00o(name, strOooO00o, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        File file = (File) obj;
        return Boolean.valueOf(file != null && file.exists());
    }
}
