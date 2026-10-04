package o0o0OOO;

import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookVariantFile;
import com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateVariantFile;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$saveVariantSelectionToMyTemplate$2", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {1475, 1506}, m80625m = "invokeSuspend")
public final class oo0o0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f109243OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109244OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Orientation f109245OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f109246OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f109247OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(C30520o000000o c30520o000000o, String str, Orientation orientation, String str2, Continuation<? super oo0o0Oo> continuation) {
        super(2, continuation);
        this.f109243OooOo = c30520o000000o;
        this.f109246OooOoO0 = str;
        this.f109245OooOoO = orientation;
        this.f109247OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new oo0o0Oo(this.f109243OooOo, this.f109246OooOoO0, this.f109245OooOoO, this.f109247OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((oo0o0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x012d, code lost:
    
        if (r3.OooOOo(r4, r23) == r0) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object objOooOO0o;
        String selectedColorName;
        MyTemplate myTemplate;
        String str3;
        C30520o000000o c30520o000000o;
        int i;
        PaperTheme paperThemeCopy$default;
        String selectedColorName2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f109244OooOo0o;
        String str4 = this.f109246OooOoO0;
        String str5 = this.f109247OooOoOO;
        Orientation orientation = this.f109245OooOoO;
        C30520o000000o c30520o000000o2 = this.f109243OooOo;
        try {
            try {
                try {
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                str = "PaperConfigDialogViewModel";
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0(str);
                c20358OooO00o.OooO0Oo(e, "saveVariantSelectionToMyTemplate failed", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
        } catch (Exception e3) {
            e = e3;
            str = i2;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0(str);
            c20358OooO00o2.OooO0Oo(e, "saveVariantSelectionToMyTemplate failed", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27095OooOo0O c27095OooOo0O = c30520o000000o2.f109001OooO0o0;
            this.f109244OooOo0o = 1;
            objOooOO0o = c27095OooOo0O.OooOO0o(str4, this);
            if (objOooOO0o == enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            str3 = str4;
            str2 = "PaperConfigDialogViewModel";
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0(str2);
            c20358OooO00o3.OooO00o("saveVariantSelectionToMyTemplate - saved: templateId=" + str3 + ", orientation=" + orientation + ", color=" + str5, new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooOO0o = obj;
        MyTemplate myTemplate2 = (MyTemplate) objOooOO0o;
        if (myTemplate2 == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        PaperTheme paperTheme = myTemplate2.getPaperTheme();
        Object obj2 = null;
        if (paperTheme instanceof TemplateMaterialPaperTheme) {
            try {
                Iterator<T> it = ((TemplateMaterialPaperTheme) paperTheme).getVariantFiles().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((TemplateVariantFile) next).getColor(), str5)) {
                        obj2 = next;
                        break;
                    }
                }
                TemplateVariantFile templateVariantFile = (TemplateVariantFile) obj2;
                if (templateVariantFile == null || (selectedColorName = templateVariantFile.getColorName()) == null) {
                    selectedColorName = ((TemplateMaterialPaperTheme) paperTheme).getSelectedColorName();
                }
                myTemplate = myTemplate2;
                str3 = str4;
                str2 = "PaperConfigDialogViewModel";
                c30520o000000o = c30520o000000o2;
                i = 2;
                paperThemeCopy$default = TemplateMaterialPaperTheme.copy$default((TemplateMaterialPaperTheme) paperTheme, null, null, null, orientation, str5, selectedColorName, null, null, null, 455, null);
            } catch (Exception e4) {
                e = e4;
                str2 = "PaperConfigDialogViewModel";
                str = str2;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0(str);
                c20358OooO00o22.OooO0Oo(e, "saveVariantSelectionToMyTemplate failed", new Object[0]);
            }
        } else {
            myTemplate = myTemplate2;
            str3 = str4;
            str2 = "PaperConfigDialogViewModel";
            c30520o000000o = c30520o000000o2;
            i = 2;
            if (!(paperTheme instanceof TemplateBookPaperTheme)) {
                return C32460OooOooO.f116667OooO00o;
            }
            Iterator<T> it2 = ((TemplateBookPaperTheme) paperTheme).getVariantFiles().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((TemplateBookVariantFile) next2).getColor(), str5)) {
                    obj2 = next2;
                    break;
                }
            }
            TemplateBookVariantFile templateBookVariantFile = (TemplateBookVariantFile) obj2;
            if (templateBookVariantFile == null || (selectedColorName2 = templateBookVariantFile.getColorName()) == null) {
                selectedColorName2 = ((TemplateBookPaperTheme) paperTheme).getSelectedColorName();
            }
            paperThemeCopy$default = TemplateBookPaperTheme.copy$default((TemplateBookPaperTheme) paperTheme, null, null, null, 0, orientation, str5, selectedColorName2, null, null, 399, null);
            orientation = orientation;
            str5 = str5;
        }
        MyTemplate myTemplateCopy$default = MyTemplate.copy$default(myTemplate, null, paperThemeCopy$default, null, 0L, 0L, null, 61, null);
        C27095OooOo0O c27095OooOo0O2 = c30520o000000o.f109001OooO0o0;
        this.f109244OooOo0o = i;
    }
}
