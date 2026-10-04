package o0o0OOO;

import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperColors;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfSetPaperTheme;
import com.orion.notein.domain.models.papertheme.ThemeCategory;
import com.orion.notein.p607ui.p609vo.PageColorThemeVO;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27570o00oOoo0;
import o0oOoOo.C31041OooOOO;
import o0oOoOo.C31091ooOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32503OooO0Oo;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$paperThemes$1$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o0OOO0o extends AbstractC32476OooO implements InterfaceC32503OooO0Oo<List<? extends PaperTheme>, PaperTheme, List<? extends Integer>, Boolean, PaperTheme, PaperOrientation, String, Map<Integer, ? extends Integer>, Set<? extends PaperTheme>, Boolean, C31041OooOOO, Continuation<? super List<? extends o0oOoOo.o0OoOo0>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ PaperTheme f109207OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f109208OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ boolean f109209OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ List f109210OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ PaperTheme f109211OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ String f109212OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ PaperOrientation f109213OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ Map f109214OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public /* synthetic */ Set f109215OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final /* synthetic */ boolean f109216Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public /* synthetic */ boolean f109217Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public /* synthetic */ C31041OooOOO f109218Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f109219Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(C30520o000000o c30520o000000o, boolean z, Continuation<? super o0OOO0o> continuation) {
        super(12, continuation);
        this.f109219Oooo00o = c30520o000000o;
        this.f109216Oooo0 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x024d A[PHI: r5
      0x024d: PHI (r5v32 java.lang.Integer) = (r5v9 java.lang.Integer), (r5v13 java.lang.Integer) binds: [B:75:0x024b, B:78:0x0262] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Map] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final int color_01;
        boolean z;
        List listOooooOo;
        ThemeVO themeVO;
        Iterator it;
        int iIntValue;
        o0OOO0o o0ooo0o2 = this;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = o0ooo0o2.f109208OooOo0o;
        PaperTheme paperTheme = o0ooo0o2.f109207OooOo;
        List list2 = o0ooo0o2.f109210OooOoO0;
        boolean z2 = o0ooo0o2.f109209OooOoO;
        PaperTheme paperTheme2 = o0ooo0o2.f109211OooOoOO;
        PaperOrientation paperOrientation = o0ooo0o2.f109213OooOoo0;
        String str = o0ooo0o2.f109212OooOoo;
        Map map = o0ooo0o2.f109214OooOooO;
        Set set = o0ooo0o2.f109215OooOooo;
        boolean z3 = o0ooo0o2.f109217Oooo000;
        C31041OooOOO c31041OooOOO = o0ooo0o2.f109218Oooo00O;
        Object obj2 = C30520o000000o.f108997ooOO;
        C30520o000000o c30520o000000o = o0ooo0o2.f109219Oooo00o;
        c30520o000000o.getClass();
        PaperSpec paperSpecOooOOo = C30520o000000o.OooOOo(str);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            boolean z4 = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            PaperTheme paperTheme3 = (PaperTheme) next;
            Iterator it3 = it2;
            boolean z5 = paperTheme3.getOrientation() == paperOrientation;
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(paperSpecOooOOo, PaperSpec.INSTANCE.getA4()) && (paperTheme3 instanceof PdfSetPaperTheme)) {
                z4 = false;
            }
            boolean z6 = paperTheme3 instanceof ColorPaperTheme;
            if (z5 && z4 && !z6) {
                arrayList.add(next);
            }
            it2 = it3;
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            PaperTheme paperThemeCopy$default = (PaperTheme) it4.next();
            Integer num = (Integer) map.get(Integer.valueOf(paperThemeCopy$default.getCategory().getId()));
            if (num != null) {
                iIntValue = num.intValue();
                it = it4;
            } else {
                it = it4;
                Integer num2 = (Integer) C30520o000000o.f108997ooOO.get(Integer.valueOf(paperThemeCopy$default.getCategory().getId()));
                iIntValue = num2 != null ? num2.intValue() : PaperColors.INSTANCE.getCOLOR_01();
            }
            int i = iIntValue;
            if (paperThemeCopy$default instanceof PdfSetPaperTheme) {
                paperThemeCopy$default = PdfSetPaperTheme.copy$default((PdfSetPaperTheme) paperThemeCopy$default, null, null, i, null, null, null, null, 123, null);
            } else if (paperThemeCopy$default instanceof LambdaPaperTheme) {
                paperThemeCopy$default = LambdaPaperTheme.copy$default((LambdaPaperTheme) paperThemeCopy$default, new ColorPaperTheme(null, i), null, null, null, null, null, 62, null);
            }
            arrayList2.add(paperThemeCopy$default);
            it4 = it;
        }
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            PaperTheme paperTheme4 = (PaperTheme) it5.next();
            boolean zContains = set.contains(paperTheme4);
            boolean z7 = o0ooo0o2.f109216Oooo0;
            PaperTheme paperThemeOooOO0 = c30520o000000o.OooOO0(paperTheme4, paperSpecOooOOo, paperOrientation, c31041OooOOO, z7);
            C30520o000000o c30520o000000o2 = c30520o000000o;
            boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(paperThemeOooOO0, paperTheme);
            boolean z8 = paperTheme4 instanceof PdfSetPaperTheme;
            Iterator it6 = it5;
            C27570o00oOoo0 c27570o00oOoo0 = c30520o000000o2.f109000OooO0o;
            if (z8) {
                boolean zOooO0O02 = kotlin.jvm.internal.OooOOO0.OooO0O0(paperThemeOooOO0, paperTheme2);
                c27570o00oOoo0.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(paperTheme4, "paperTheme");
                boolean zAvailableFromLocal = paperTheme4.availableFromLocal(c27570o00oOoo0.f96739OooO00o);
                themeVO = new ThemeVO(paperTheme4, zOooO0O02 && zAvailableFromLocal, 0, 0, zAvailableFromLocal, zContains, null, null, zOooO0O02 || zOooO0O0, zOooO0O0, 204, null);
            } else {
                boolean zOooO0O03 = kotlin.jvm.internal.OooOOO0.OooO0O0(paperThemeOooOO0, paperTheme2);
                c27570o00oOoo0.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(paperTheme4, "paperTheme");
                themeVO = new ThemeVO(paperTheme4, zOooO0O03, 0, 0, paperTheme4.availableFromLocal(c27570o00oOoo0.f96739OooO00o), zContains, null, null, !z7 && (zOooO0O03 || zOooO0O0), zOooO0O0, 204, null);
            }
            arrayList3.add(themeVO);
            o0ooo0o2 = this;
            it5 = it6;
            c30520o000000o = c30520o000000o2;
        }
        C30520o000000o c30520o000000o3 = c30520o000000o;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList3) {
            ThemeCategory category = ((ThemeVO) obj3).getPaperTheme().getCategory();
            Object arrayList4 = linkedHashMap.get(category);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(category, arrayList4);
            }
            ((List) arrayList4).add(obj3);
        }
        ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ThemeCategory themeCategory = (ThemeCategory) entry.getKey();
            List list3 = (List) entry.getValue();
            List<Integer> listOooO = c30520o000000o3.f109001OooO0o0.OooO();
            Integer num3 = (Integer) ((Map) c30520o000000o3.f109013OooOOoo.getValue()).get(Integer.valueOf(themeCategory.getId()));
            if (num3 != null) {
                color_01 = num3.intValue();
            } else {
                num3 = (Integer) C30520o000000o.f108997ooOO.get(Integer.valueOf(themeCategory.getId()));
                if (num3 == null) {
                    color_01 = PaperColors.INSTANCE.getCOLOR_01();
                }
            }
            InterfaceC32508OooOOOo interfaceC32508OooOOOo = new InterfaceC32508OooOOOo() { // from class: o0o0OOO.OoooOOO
                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Object obj4, Object obj5) {
                    List colors = (List) obj4;
                    boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                    Object obj6 = C30520o000000o.f108997ooOO;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(colors, "colors");
                    List list4 = colors;
                    ArrayList arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                    Iterator it7 = list4.iterator();
                    while (it7.hasNext()) {
                        int iIntValue2 = ((Number) it7.next()).intValue();
                        arrayList6.add(new PageColorThemeVO(iIntValue2, color_01 == iIntValue2, false, false, zBooleanValue, 12, null));
                    }
                    return arrayList6;
                }
            };
            int id = themeCategory.getId();
            ThemeCategory themeCategory2 = o0OOOO00.OooOO0O.f94361OooOOOO;
            if (id == themeCategory2.getId()) {
                z = z3;
                listOooooOo = oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OooooOO((Collection) interfaceC32508OooOOOo.invoke(listOooO, Boolean.FALSE), (Iterable) interfaceC32508OooOOOo.invoke(list2, Boolean.valueOf(z3))), new PageColorThemeVO(0, false, z2, true, z, 2, null));
            } else {
                z = z3;
                if (id == o0OOOO00.OooOO0O.f94368OooOo00.getId() || id == o0OOOO00.OooOO0O.f94367OooOo0.getId()) {
                    listOooooOo = (List) interfaceC32508OooOOOo.invoke(listOooO, Boolean.FALSE);
                } else if (id == o0OOOO00.OooOO0O.f94364OooOOo0.getId() || id == o0OOOO00.OooOO0O.f94365OooOOoo.getId() || id == o0OOOO00.OooOO0O.f94362OooOOOo.getId()) {
                    PaperColors paperColors = PaperColors.INSTANCE;
                    listOooooOo = (List) interfaceC32508OooOOOo.invoke(C34429OooOOo0.OooOO0o(Integer.valueOf(paperColors.getCOLOR_01()), Integer.valueOf(paperColors.getCOLOR_02()), Integer.valueOf(paperColors.getCOLOR_05())), Boolean.FALSE);
                } else {
                    listOooooOo = C34434OooOoO.f123453OooOo0o;
                }
            }
            arrayList5.add(new o0oOoOo.o0OoOo0(new C31091ooOO(themeCategory.getId(), themeCategory.getName(), listOooooOo, themeCategory.getId() != themeCategory2.getId() && z2), list3));
            z3 = z;
        }
        return arrayList5;
    }
}
