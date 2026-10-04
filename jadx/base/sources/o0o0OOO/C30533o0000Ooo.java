package o0o0OOO;

import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;

/* JADX INFO: renamed from: o0o0OOO.o0000Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$userCreatedTemplates$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30533o0000Ooo extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends MyTemplate>, MyTemplate, PaperTheme, Continuation<? super List<? extends ThemeVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ MyTemplate f109148OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f109149OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f109150OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ PaperTheme f109151OooOoO0;

    /* JADX INFO: renamed from: o0o0OOO.o0000Ooo$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((MyTemplate) t2).getCreationTime()), Long.valueOf(((MyTemplate) t).getCreationTime()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30533o0000Ooo(Continuation continuation, C30520o000000o c30520o000000o) {
        super(4, continuation);
        this.f109150OooOoO = c30520o000000o;
    }

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(List<? extends MyTemplate> list, MyTemplate myTemplate, PaperTheme paperTheme, Continuation<? super List<? extends ThemeVO>> continuation) {
        C30533o0000Ooo c30533o0000Ooo = new C30533o0000Ooo(continuation, this.f109150OooOoO);
        c30533o0000Ooo.f109149OooOo0o = list;
        c30533o0000Ooo.f109148OooOo = myTemplate;
        c30533o0000Ooo.f109151OooOoO0 = paperTheme;
        return c30533o0000Ooo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f109149OooOo0o;
        MyTemplate myTemplate = this.f109148OooOo;
        PaperTheme paperTheme = this.f109151OooOoO0;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            MyTemplate myTemplate2 = (MyTemplate) obj2;
            if (!(myTemplate2.getPaperTheme() instanceof TemplateMaterialPaperTheme) && !(myTemplate2.getPaperTheme() instanceof TemplateBookPaperTheme)) {
                arrayList.add(obj2);
            }
        }
        List<MyTemplate> listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList, new OooO00o());
        ArrayList arrayList2 = new ArrayList();
        for (MyTemplate myTemplate3 : listO00O0O) {
            PaperTheme paperTheme2 = myTemplate3.getPaperTheme();
            if (paperTheme2 != null) {
                if (paperTheme2 instanceof PdfPaperTheme) {
                    String pdfPath = ((PdfPaperTheme) paperTheme2).getPdfInfo().getPdfPath();
                    if (pdfPath.length() <= 0 || new File(pdfPath).exists()) {
                        boolean zOooO0O0 = myTemplate != null ? kotlin.jvm.internal.OooOOO0.OooO0O0(myTemplate3.getId(), myTemplate.getId()) : false;
                        boolean zOooO0O02 = kotlin.jvm.internal.OooOOO0.OooO0O0(myTemplate3.getId(), paperTheme != null ? paperTheme.getMyTemplateId() : null);
                        PaperSpec paperSpec = myTemplate3.getPaperSpec();
                        C32443OooOOO c32443OooOOOOooO0o = paperSpec != null ? C30520o000000o.OooO0o(this.f109150OooOoO, paperSpec, paperTheme2) : new C32443OooOOO(new Integer(-1), new Integer(-1));
                        themeVO = new ThemeVO(paperTheme2, zOooO0O0, ((Number) c32443OooOOOOooO0o.f116638OooOo0o).intValue(), ((Number) c32443OooOOOOooO0o.f116637OooOo).intValue(), true, false, myTemplate3.getId(), myTemplate3.getTitle(), zOooO0O0, zOooO0O02);
                    }
                }
            }
            if (themeVO != null) {
                arrayList2.add(themeVO);
            }
        }
        return arrayList2;
    }
}
