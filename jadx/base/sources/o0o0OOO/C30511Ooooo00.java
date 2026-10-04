package o0o0OOO;

import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOOO00.C27095OooOo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o0OOO.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$2", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {418}, m80625m = "invokeSuspend")
public final class C30511Ooooo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f108943OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108944OooOo0o;

    /* JADX INFO: renamed from: o0o0OOO.Ooooo00$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C30520o000000o f108945OooOo0o;

        public OooO00o(C30520o000000o c30520o000000o) {
            this.f108945OooOo0o = c30520o000000o;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            List list = (List) obj;
            C30520o000000o c30520o000000o = this.f108945OooOo0o;
            if (c30520o000000o.f109040OoooO0O.getValue() == null) {
                boolean zIsEmpty = list.isEmpty();
                C27095OooOo0O c27095OooOo0O = c30520o000000o.f109001OooO0o0;
                C33781o00o0O c33781o00o0O = c30520o000000o.f109040OoooO0O;
                if (zIsEmpty) {
                    MyTemplate myTemplateOooO0o = c27095OooOo0O.OooO0o();
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, myTemplateOooO0o);
                    return C32460OooOooO.f116667OooO00o;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                for (T t : list2) {
                    MyTemplate myTemplate = (MyTemplate) t;
                    if (!(myTemplate.getPaperTheme() instanceof TemplateMaterialPaperTheme) && !(myTemplate.getPaperTheme() instanceof TemplateBookPaperTheme)) {
                        arrayList.add(t);
                    }
                }
                List listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList, new C30508OoooOo0(0));
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : list2) {
                    if (((MyTemplate) t2).getPaperTheme() instanceof TemplateMaterialPaperTheme) {
                        arrayList2.add(t2);
                    }
                }
                List listO00O0O2 = oOo000Oo.OooOo.o00O0O(arrayList2, new C30509OoooOoO(0));
                ArrayList arrayList3 = new ArrayList();
                for (T t3 : list2) {
                    if (((MyTemplate) t3).getPaperTheme() instanceof TemplateBookPaperTheme) {
                        arrayList3.add(t3);
                    }
                }
                List listO00O0O3 = oOo000Oo.OooOo.o00O0O(arrayList3, new C30510OoooOoo(0));
                MyTemplate myTemplate2 = (MyTemplate) oOo000Oo.OooOo.Oooo(listO00O0O);
                if (myTemplate2 == null && (myTemplate2 = (MyTemplate) oOo000Oo.OooOo.Oooo(listO00O0O2)) == null) {
                    myTemplate2 = (MyTemplate) oOo000Oo.OooOo.Oooo(listO00O0O3);
                }
                if (myTemplate2 != null) {
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, myTemplate2);
                    PaperTheme paperTheme = myTemplate2.getPaperTheme();
                    if (paperTheme instanceof TemplateMaterialPaperTheme) {
                        TemplateMaterialPaperTheme templateMaterialPaperTheme = (TemplateMaterialPaperTheme) paperTheme;
                        c30520o000000o.OooOoOO(myTemplate2.getId(), templateMaterialPaperTheme.getSelectedOrientation(), templateMaterialPaperTheme.getSelectedColor());
                    } else if (paperTheme instanceof TemplateBookPaperTheme) {
                        TemplateBookPaperTheme templateBookPaperTheme = (TemplateBookPaperTheme) paperTheme;
                        if (templateBookPaperTheme.hasVariants()) {
                            c30520o000000o.OooOoOO(myTemplate2.getId(), templateBookPaperTheme.getSelectedOrientation(), templateBookPaperTheme.getSelectedColor());
                        }
                    }
                } else {
                    MyTemplate myTemplateOooO0o2 = c27095OooOo0O.OooO0o();
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, myTemplateOooO0o2);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30511Ooooo00(Continuation continuation, C30520o000000o c30520o000000o) {
        super(2, continuation);
        this.f108943OooOo = c30520o000000o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30511Ooooo00(continuation, this.f108943OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30511Ooooo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108944OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30520o000000o c30520o000000o = this.f108943OooOo;
            o0OOOO00.OooOOO0 oooOOO0OooO0Oo = c30520o000000o.f109001OooO0o0.OooO0Oo();
            OooO00o oooO00o = new OooO00o(c30520o000000o);
            this.f108944OooOo0o = 1;
            if (oooOOO0OooO0Oo.collect(oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
