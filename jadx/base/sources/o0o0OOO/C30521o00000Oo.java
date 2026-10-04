package o0o0OOO;

import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32512OooOo0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OOO.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$templateBooks$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30521o00000Oo extends AbstractC32476OooO implements InterfaceC32512OooOo0<List<? extends MyTemplate>, MyTemplate, PaperTheme, Orientation, String, String, Continuation<? super List<? extends ThemeVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ MyTemplate f109071OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f109072OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Orientation f109073OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ PaperTheme f109074OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ String f109075OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f109076OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ String f109077OooOoo0;

    /* JADX INFO: renamed from: o0o0OOO.o00000Oo$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((MyTemplate) t2).getCreationTime()), Long.valueOf(((MyTemplate) t).getCreationTime()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30521o00000Oo(Continuation continuation, C30520o000000o c30520o000000o) {
        super(7, continuation);
        this.f109076OooOoo = c30520o000000o;
    }

    @Override // oO0O000o.InterfaceC32512OooOo0
    public final Object OoooO0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        C30521o00000Oo c30521o00000Oo = new C30521o00000Oo((Continuation) serializable, this.f109076OooOoo);
        c30521o00000Oo.f109072OooOo0o = (List) obj;
        c30521o00000Oo.f109071OooOo = (MyTemplate) obj2;
        c30521o00000Oo.f109074OooOoO0 = (PaperTheme) obj3;
        c30521o00000Oo.f109073OooOoO = (Orientation) obj4;
        c30521o00000Oo.f109075OooOoOO = (String) obj5;
        c30521o00000Oo.f109077OooOoo0 = (String) obj6;
        return c30521o00000Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0165 A[SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        String str;
        ArrayList arrayList;
        TemplateBookPaperTheme templateBookPaperThemeCopy$default;
        ThemeVO themeVO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f109072OooOo0o;
        MyTemplate myTemplate = this.f109071OooOo;
        PaperTheme paperTheme = this.f109074OooOoO0;
        Orientation orientation = this.f109073OooOoO;
        String str2 = this.f109075OooOoOO;
        String str3 = this.f109077OooOoo0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((MyTemplate) obj2).getPaperTheme() instanceof TemplateBookPaperTheme) {
                arrayList2.add(obj2);
            }
        }
        List listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList2, new OooO00o());
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listO00O0O.iterator();
        while (it2.hasNext()) {
            MyTemplate myTemplate2 = (MyTemplate) it2.next();
            PaperTheme paperTheme2 = myTemplate2.getPaperTheme();
            TemplateBookPaperTheme templateBookPaperTheme = paperTheme2 instanceof TemplateBookPaperTheme ? (TemplateBookPaperTheme) paperTheme2 : null;
            if (templateBookPaperTheme == null) {
                it = it2;
                str = str3;
                arrayList = arrayList3;
            } else {
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(myTemplate2.getId(), str3) || orientation == null || str2 == null) {
                    it = it2;
                    str = str3;
                    arrayList = arrayList3;
                    templateBookPaperThemeCopy$default = templateBookPaperTheme;
                } else {
                    str = str3;
                    it = it2;
                    arrayList = arrayList3;
                    templateBookPaperThemeCopy$default = TemplateBookPaperTheme.copy$default(templateBookPaperTheme, null, null, null, 0, orientation, str2, null, null, null, 463, null);
                }
                String variantPdfPath = templateBookPaperThemeCopy$default.getVariantPdfPath();
                if (variantPdfPath == null || !new File(variantPdfPath).exists()) {
                    TemplateBookPaperTheme templateBookPaperTheme2 = templateBookPaperThemeCopy$default;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("PaperConfigDialogViewModel");
                    String id = myTemplate2.getId();
                    String materialId = templateBookPaperTheme2.getMaterialId();
                    Orientation selectedOrientation = templateBookPaperTheme2.getSelectedOrientation();
                    String selectedColor = templateBookPaperTheme2.getSelectedColor();
                    StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Template book PDF not found: templateId=", id, ", materialId=", materialId, ", orientation=");
                    sbOooO0O0.append(selectedOrientation);
                    sbOooO0O0.append(", color=");
                    sbOooO0O0.append(selectedColor);
                    sbOooO0O0.append(", pdfPath=");
                    sbOooO0O0.append(variantPdfPath);
                    c20358OooO00o.OooOO0O(sbOooO0O0.toString(), new Object[0]);
                } else {
                    boolean zOooO0O0 = myTemplate != null ? kotlin.jvm.internal.OooOOO0.OooO0O0(myTemplate2.getId(), myTemplate.getId()) : false;
                    boolean zOooO0O02 = kotlin.jvm.internal.OooOOO0.OooO0O0(myTemplate2.getId(), paperTheme != null ? paperTheme.getMyTemplateId() : null);
                    PaperSpec paperSpec = myTemplate2.getPaperSpec();
                    C32443OooOOO c32443OooOOOOooO0o = paperSpec != null ? C30520o000000o.OooO0o(this.f109076OooOoo, paperSpec, templateBookPaperThemeCopy$default) : new C32443OooOOO(new Integer(-1), new Integer(-1));
                    themeVO = new ThemeVO(templateBookPaperThemeCopy$default, zOooO0O0, ((Number) c32443OooOOOOooO0o.f116638OooOo0o).intValue(), ((Number) c32443OooOOOOooO0o.f116637OooOo).intValue(), true, false, myTemplate2.getId(), myTemplate2.getTitle(), zOooO0O0, zOooO0O02);
                    if (themeVO == null) {
                        arrayList.add(themeVO);
                    }
                    arrayList3 = arrayList;
                    str3 = str;
                    it2 = it;
                }
            }
            themeVO = null;
            if (themeVO == null) {
            }
            arrayList3 = arrayList;
            str3 = str;
            it2 = it;
        }
        return arrayList3;
    }
}
