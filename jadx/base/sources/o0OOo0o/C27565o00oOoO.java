package o0OOo0o;

import android.net.Uri;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import o0OOOO00.C27095OooOo0O;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OOo0o.o00oOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ThemeUseCase$importPdfPageToMyTemplate$2", m80623f = "ThemeUseCase.kt", m80624l = {170, 172}, m80625m = "invokeSuspend")
public final class C27565o00oOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f96713OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f96714OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f96715OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27570o00oOoo0 f96716OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Uri f96717OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f96718OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27565o00oOoO(C27570o00oOoo0 c27570o00oOoo0, int i, Uri uri, String str, Continuation<? super C27565o00oOoO> continuation) {
        super(2, continuation);
        this.f96716OooOoO0 = c27570o00oOoo0;
        this.f96715OooOoO = i;
        this.f96717OooOoOO = uri;
        this.f96718OooOoo0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27565o00oOoO(this.f96716OooOoO0, this.f96715OooOoO, this.f96717OooOoOO, this.f96718OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27565o00oOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0o;
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96713OooOo;
        C27570o00oOoo0 c27570o00oOoo0 = this.f96716OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
            this.f96714OooOo0o = string;
            this.f96713OooOo = 1;
            c27570o00oOoo0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27562o00oOo00(c27570o00oOoo0, this.f96717OooOoOO, this.f96715OooOoO, this.f96718OooOoo0, string, null), this);
            if (objOooO0o != enumC32485OooO00o) {
                str = string;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = this.f96714OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return str2;
        }
        String str3 = this.f96714OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        str = str3;
        objOooO0o = obj;
        C32443OooOOO c32443OooOOO = (C32443OooOOO) objOooO0o;
        if (c32443OooOOO == null) {
            return null;
        }
        PdfPaperTheme pdfPaperTheme = (PdfPaperTheme) c32443OooOOO.f116638OooOo0o;
        PaperSpec paperSpec = (PaperSpec) c32443OooOOO.f116637OooOo;
        C27095OooOo0O c27095OooOo0O = c27570o00oOoo0.f96740OooO0O0;
        MyTemplate[] myTemplateArr = {new MyTemplate(str, pdfPaperTheme, paperSpec, 0L, 0L, pdfPaperTheme.getName(), 24, null)};
        this.f96714OooOo0o = str;
        this.f96713OooOo = 2;
        return c27095OooOo0O.OooO00o(myTemplateArr, this) == enumC32485OooO00o ? enumC32485OooO00o : str;
    }
}
