package o0OOo0o;

import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0OOOO00.C27095OooOo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00oOoOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ThemeUseCase$isTemplateBookInMyTemplates$2", m80623f = "ThemeUseCase.kt", m80624l = {504}, m80625m = "invokeSuspend")
public final class C27568o00oOoOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27570o00oOoo0 f96732OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96733OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96734OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27568o00oOoOo(C27570o00oOoo0 c27570o00oOoo0, String str, Continuation<? super C27568o00oOoOo> continuation) {
        super(2, continuation);
        this.f96732OooOo = c27570o00oOoo0;
        this.f96734OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27568o00oOoOo(this.f96732OooOo, this.f96734OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27568o00oOoOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96733OooOo0o;
        boolean z = true;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27095OooOo0O c27095OooOo0O = this.f96732OooOo.f96740OooO0O0;
            this.f96733OooOo0o = 1;
            obj = c27095OooOo0O.OooO0o0(this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Iterable iterable = (Iterable) obj;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            z = false;
        } else {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                PaperTheme paperTheme = ((MyTemplate) it.next()).getPaperTheme();
                TemplateBookPaperTheme templateBookPaperTheme = paperTheme instanceof TemplateBookPaperTheme ? (TemplateBookPaperTheme) paperTheme : null;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(templateBookPaperTheme != null ? templateBookPaperTheme.getMaterialId() : null, this.f96734OooOoO0)) {
                    break;
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
