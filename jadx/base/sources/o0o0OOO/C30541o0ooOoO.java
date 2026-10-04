package o0o0OOO;

import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;

/* JADX INFO: renamed from: o0o0OOO.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$myTemplates$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30541o0ooOoO extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends MyTemplate>, MyTemplate, PaperTheme, Continuation<? super List<? extends ThemeVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ MyTemplate f109237OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f109238OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f109239OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ PaperTheme f109240OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30541o0ooOoO(Continuation continuation, C30520o000000o c30520o000000o) {
        super(4, continuation);
        this.f109239OooOoO = c30520o000000o;
    }

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(List<? extends MyTemplate> list, MyTemplate myTemplate, PaperTheme paperTheme, Continuation<? super List<? extends ThemeVO>> continuation) {
        C30541o0ooOoO c30541o0ooOoO = new C30541o0ooOoO(continuation, this.f109239OooOoO);
        c30541o0ooOoO.f109238OooOo0o = list;
        c30541o0ooOoO.f109237OooOo = myTemplate;
        c30541o0ooOoO.f109240OooOoO0 = paperTheme;
        return c30541o0ooOoO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List<MyTemplate> list = this.f109238OooOo0o;
        MyTemplate myTemplate = this.f109237OooOo;
        PaperTheme paperTheme = this.f109240OooOoO0;
        ArrayList arrayList = new ArrayList();
        for (MyTemplate myTemplate2 : list) {
            PaperTheme paperTheme2 = myTemplate2.getPaperTheme();
            if (paperTheme2 != null) {
                if (paperTheme2 instanceof PdfPaperTheme) {
                    String pdfPath = ((PdfPaperTheme) paperTheme2).getPdfInfo().getPdfPath();
                    if (pdfPath.length() <= 0 || new File(pdfPath).exists()) {
                        boolean zOooO0O0 = myTemplate != null ? kotlin.jvm.internal.OooOOO0.OooO0O0(myTemplate2.getId(), myTemplate.getId()) : false;
                        boolean zOooO0O02 = kotlin.jvm.internal.OooOOO0.OooO0O0(myTemplate2.getId(), paperTheme != null ? paperTheme.getMyTemplateId() : null);
                        PaperSpec paperSpec = myTemplate2.getPaperSpec();
                        PaperTheme paperTheme3 = myTemplate2.getPaperTheme();
                        C32443OooOOO c32443OooOOO = (paperTheme3 == null || paperSpec == null) ? new C32443OooOOO(new Integer(-1), new Integer(-1)) : C30520o000000o.OooO0o(this.f109239OooOoO, paperSpec, paperTheme3);
                        themeVO = new ThemeVO(paperTheme2, zOooO0O0, ((Number) c32443OooOOO.f116638OooOo0o).intValue(), ((Number) c32443OooOOO.f116637OooOo).intValue(), true, false, myTemplate2.getId(), myTemplate2.getTitle(), zOooO0O0, zOooO0O02);
                    }
                }
            }
            if (themeVO != null) {
                arrayList.add(themeVO);
            }
        }
        return arrayList;
    }
}
