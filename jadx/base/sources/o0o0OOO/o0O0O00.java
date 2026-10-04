package o0o0OOO;

import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$selectTemplateByMaterialId$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {1376}, m80625m = "invokeSuspend")
public final class o0O0O00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f109201OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109202OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f109203OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(String str, Continuation continuation, C30520o000000o c30520o000000o) {
        super(2, continuation);
        this.f109201OooOo = c30520o000000o;
        this.f109203OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0O0O00(this.f109203OooOoO0, continuation, this.f109201OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0O0O00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String str;
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109202OooOo0o;
        C30520o000000o c30520o000000o = this.f109201OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0OOOO00.OooOOO0 oooOOO0OooO0Oo = c30520o000000o.f109001OooO0o0.OooO0Oo();
            this.f109202OooOo0o = 1;
            obj = C25252OooO0Oo.OooOOo(oooOOO0OooO0Oo, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Iterator it = ((List) obj).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            str = this.f109203OooOoO0;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            PaperTheme paperTheme = ((MyTemplate) next).getPaperTheme();
            if (paperTheme instanceof TemplateMaterialPaperTheme ? kotlin.jvm.internal.OooOOO0.OooO0O0(((TemplateMaterialPaperTheme) paperTheme).getMaterialId(), str) : paperTheme instanceof TemplateBookPaperTheme ? kotlin.jvm.internal.OooOOO0.OooO0O0(((TemplateBookPaperTheme) paperTheme).getMaterialId(), str) : false) {
                break;
            }
        }
        MyTemplate myTemplate = (MyTemplate) next;
        if (myTemplate != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PaperConfigDialogViewModel");
            c20358OooO00o.OooO00o(C22237OooO0o0.OooO00o("selectTemplateByMaterialId: found template ", myTemplate.getId(), " for materialId=", str), new Object[0]);
            C33781o00o0O c33781o00o0O = c30520o000000o.f109040OoooO0O;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, myTemplate);
            c30520o000000o.f109054OoooooO.setValue(str);
            PaperTheme paperTheme2 = myTemplate.getPaperTheme();
            if (paperTheme2 instanceof TemplateMaterialPaperTheme) {
                c20358OooO00o.OooOOO0("PaperConfigDialogViewModel");
                c20358OooO00o.OooO00o("selectTemplateByMaterialId: showing variant selector for TemplateMaterialPaperTheme", new Object[0]);
                TemplateMaterialPaperTheme templateMaterialPaperTheme = (TemplateMaterialPaperTheme) paperTheme2;
                c30520o000000o.OooOoOO(myTemplate.getId(), templateMaterialPaperTheme.getSelectedOrientation(), templateMaterialPaperTheme.getSelectedColor());
            } else if (paperTheme2 instanceof TemplateBookPaperTheme) {
                TemplateBookPaperTheme templateBookPaperTheme = (TemplateBookPaperTheme) paperTheme2;
                if (templateBookPaperTheme.hasVariants()) {
                    c20358OooO00o.OooOOO0("PaperConfigDialogViewModel");
                    c20358OooO00o.OooO00o("selectTemplateByMaterialId: showing variant selector for TemplateBookPaperTheme", new Object[0]);
                    c30520o000000o.OooOoOO(myTemplate.getId(), templateBookPaperTheme.getSelectedOrientation(), templateBookPaperTheme.getSelectedColor());
                } else {
                    c20358OooO00o.OooOOO0("PaperConfigDialogViewModel");
                    c20358OooO00o.OooO00o("selectTemplateByMaterialId: hiding variant selector for TemplateBookPaperTheme (no variants)", new Object[0]);
                    c30520o000000o.OooOOOO();
                }
            } else {
                c30520o000000o.OooOOOO();
            }
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOO0O(androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "PaperConfigDialogViewModel", "selectTemplateByMaterialId: no template found for materialId=", str), new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
