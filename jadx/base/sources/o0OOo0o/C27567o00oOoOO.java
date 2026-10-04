package o0OOo0o;

import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
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

/* JADX INFO: renamed from: o0OOo0o.o00oOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ThemeUseCase$importPicToMyTemplate$2", m80623f = "ThemeUseCase.kt", m80624l = {95, 96}, m80625m = "invokeSuspend")
public final class C27567o00oOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f96728OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f96729OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96730OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27570o00oOoo0 f96731OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27567o00oOoOO(C27570o00oOoo0 c27570o00oOoo0, String str, Continuation<? super C27567o00oOoOO> continuation) {
        super(2, continuation);
        this.f96731OooOoO0 = c27570o00oOoo0;
        this.f96730OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27567o00oOoOO(this.f96731OooOoO0, this.f96730OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27567o00oOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96728OooOo;
        C27570o00oOoo0 c27570o00oOoo0 = this.f96731OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            string = UUID.randomUUID().toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
            this.f96729OooOo0o = string;
            this.f96728OooOo = 1;
            String str = this.f96730OooOoO;
            c27570o00oOoo0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27571o00oOooO(str, c27570o00oOoo0, string, null), this);
            if (objOooO0o != enumC32485OooO00o) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = this.f96729OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return str2;
        }
        string = this.f96729OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o = obj;
        String str3 = string;
        C32443OooOOO c32443OooOOO = (C32443OooOOO) objOooO0o;
        PaperTheme paperTheme = (PaperTheme) c32443OooOOO.f116638OooOo0o;
        PaperSpec paperSpec = (PaperSpec) c32443OooOOO.f116637OooOo;
        C27095OooOo0O c27095OooOo0O = c27570o00oOoo0.f96740OooO0O0;
        MyTemplate[] myTemplateArr = {new MyTemplate(str3, paperTheme, paperSpec, 0L, 0L, paperTheme.getName(), 24, null)};
        this.f96729OooOo0o = str3;
        this.f96728OooOo = 2;
        return c27095OooOo0O.OooO00o(myTemplateArr, this) == enumC32485OooO00o ? enumC32485OooO00o : str3;
    }
}
