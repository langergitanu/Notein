package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme;
import kotlin.coroutines.Continuation;
import o0OOOO00.C27095OooOo0O;
import o0OOoo0O.C27848OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00oOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ThemeUseCase$deleteMyTemplate$2", m80623f = "ThemeUseCase.kt", m80624l = {StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, StyleIdentifier.BIBLIOGRAPHY}, m80625m = "invokeSuspend")
public final class C27559o00oOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f96682OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PaperTheme f96683OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96684OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27570o00oOoo0 f96685OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27559o00oOOo0(C27570o00oOoo0 c27570o00oOoo0, String str, Continuation<? super C27559o00oOOo0> continuation) {
        super(2, continuation);
        this.f96685OooOoO0 = c27570o00oOoo0;
        this.f96684OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27559o00oOOo0(this.f96685OooOoO0, this.f96684OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27559o00oOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (oO0o0OO.C33609OooO0oo.OooO0o(oO0o0o0o.ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOoo0O.C27846OooOOOo(r1, r9, null), r8) == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PaperTheme paperTheme;
        String materialId;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96682OooOo;
        String str = this.f96684OooOoO;
        C27570o00oOoo0 c27570o00oOoo0 = this.f96685OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27095OooOo0O c27095OooOo0O = c27570o00oOoo0.f96740OooO0O0;
            this.f96682OooOo = 1;
            obj = c27095OooOo0O.OooOO0o(str, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            paperTheme = this.f96683OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            materialId = !(paperTheme instanceof TemplateMaterialPaperTheme) ? ((TemplateMaterialPaperTheme) paperTheme).getMaterialId() : paperTheme instanceof TemplateBookPaperTheme ? ((TemplateBookPaperTheme) paperTheme).getMaterialId() : null;
            if (materialId != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ThemeUseCase");
                c20358OooO00o.OooO00o("deleteMyTemplate: cleaning up material template, materialId=".concat(materialId), new Object[0]);
                C27848OooOOo0 c27848OooOOo0 = c27570o00oOoo0.f96744OooO0o0;
                this.f96683OooOo0o = null;
                this.f96682OooOo = 3;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        MyTemplate myTemplate = (MyTemplate) obj;
        paperTheme = myTemplate != null ? myTemplate.getPaperTheme() : null;
        C27095OooOo0O c27095OooOo0O2 = c27570o00oOoo0.f96740OooO0O0;
        this.f96683OooOo0o = paperTheme;
        this.f96682OooOo = 2;
        if (c27095OooOo0O2.OooO0O0(str, this) != enumC32485OooO00o) {
            if (!(paperTheme instanceof TemplateMaterialPaperTheme)) {
            }
            if (materialId != null) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }
}
