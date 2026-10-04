package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.papertheme.ThemeUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOOO00.C27091OooOOo;
import o0OOOO00.C27095OooOo0O;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OOo0o.o00oOOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ThemeUseCase$downloadCorrectMeetingTheme$2", m80623f = "ThemeUseCase.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_3, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4, StyleIdentifier.LIST_TABLE_4_ACCENT_5}, m80625m = "invokeSuspend")
public final class C27560o00oOOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f96686OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27570o00oOoo0 f96687OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Collection f96688OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f96689OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96690OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27570o00oOoo0 f96691OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27560o00oOOoO(C27570o00oOoo0 c27570o00oOoo0, Continuation<? super C27560o00oOOoO> continuation) {
        super(2, continuation);
        this.f96691OooOoo0 = c27570o00oOoo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27560o00oOOoO(this.f96691OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27560o00oOOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0144, code lost:
    
        if (r2.OooOOo0(r19) == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x020d, code lost:
    
        if (r2.OooOOo0(r19) == r1) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01b0 -> B:52:0x01b3). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOOo;
        Collection arrayList;
        Iterator it;
        C27570o00oOoo0 c27570o00oOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96690OooOoOO;
        boolean z = true;
        C27570o00oOoo0 c27570o00oOoo02 = this.f96691OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27095OooOo0O c27095OooOo0O = c27570o00oOoo02.f96740OooO0O0;
            this.f96690OooOoOO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(new C27091OooOOo(c27095OooOo0O.f94417OooO0Oo.getData(), 0), this);
            if (objOooOOo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            arrayList = this.f96688OooOoO;
            Iterator it2 = this.f96689OooOoO0;
            Collection collection = this.f96686OooOo;
            C27570o00oOoo0 c27570o00oOoo03 = this.f96687OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C27570o00oOoo0 c27570o00oOoo04 = c27570o00oOoo03;
            Iterator it3 = it2;
            Collection collection2 = collection;
            Object objOooO00o = obj;
            arrayList.add((File) objOooO00o);
            arrayList = collection2;
            it = it3;
            c27570o00oOoo0 = c27570o00oOoo04;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                File file = (File) entry.getValue();
                o0OOo0Oo.Oooo000 oooo000 = c27570o00oOoo0.f96741OooO0OO;
                String absolutePath = file.getAbsolutePath();
                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                this.f96687OooOo0o = c27570o00oOoo0;
                Collection collection3 = arrayList;
                this.f96686OooOo = collection3;
                this.f96689OooOoO0 = it;
                this.f96688OooOoO = collection3;
                this.f96690OooOoOO = 3;
                objOooO00o = oooo000.OooO00o(str, absolutePath, this);
                if (objOooO00o != enumC32485OooO00o) {
                    c27570o00oOoo04 = c27570o00oOoo0;
                    it3 = it;
                    collection2 = arrayList;
                    arrayList.add((File) objOooO00o);
                    arrayList = collection2;
                    it = it3;
                    c27570o00oOoo0 = c27570o00oOoo04;
                    if (it.hasNext()) {
                        List list = (List) arrayList;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it4 = list.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                if (((File) it4.next()) == null) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("ThemeUseCase");
                        c20358OooO00o.OooO0o0("downloadCorrectMeetingTheme result: " + z, new Object[0]);
                        if (z) {
                            C27095OooOo0O c27095OooOo0O2 = c27570o00oOoo02.f96740OooO0O0;
                            this.f96687OooOo0o = null;
                            this.f96686OooOo = null;
                            this.f96689OooOoO0 = null;
                            this.f96688OooOoO = null;
                            this.f96690OooOoOO = 4;
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
            }
            return enumC32485OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooOOo = obj;
        boolean zBooleanValue = ((Boolean) objOooOOo).booleanValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("ThemeUseCase");
        c20358OooO00o2.OooO0o0("downloadCorrectMeetingTheme, hasDownloadRightOrHasNotDownloadWrongMT: " + zBooleanValue, new Object[0]);
        if (zBooleanValue) {
            c20358OooO00o2.OooOOO0("ThemeUseCase");
            c20358OooO00o2.OooO0o0("downloadCorrectMeetingTheme, return directly.", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        List<String> listOooOO0o = C34429OooOOo0.OooOO0o("meeting_v2_a4_beige_v.pdf", "meeting_v2_a4_black_v.pdf", "meeting_v2_a4_yellow_v.pdf", "meeting1_v2_a4_beige_h.pdf", "meeting1_v2_a4_black_h.pdf", "meeting1_v2_a4_yellow_h.pdf", "meeting2_v2_a4_beige_h.pdf", "meeting2_v2_a4_black_h.pdf", "meeting2_v2_a4_yellow_h.pdf");
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(listOooOO0o, 10));
        for (String str2 : listOooOO0o) {
            arrayList2.add(new C32443OooOOO(str2, new File(ThemeUtils.INSTANCE.getThemeDownloadDir(c27570o00oOoo02.f96739OooO00o), str2)));
        }
        ArrayList<C32443OooOOO> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((File) ((C32443OooOOO) obj2).f116637OooOo).exists()) {
                arrayList3.add(obj2);
            }
        }
        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList3, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
        for (C32443OooOOO c32443OooOOO : arrayList3) {
            linkedHashMap.put(c32443OooOOO.f116638OooOo0o, c32443OooOOO.f116637OooOo);
        }
        if (!linkedHashMap.isEmpty()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("ThemeUseCase");
            c20358OooO00o3.OooO0o0("hasDownloadedErrorThemeNameToFiles: " + linkedHashMap.keySet(), new Object[0]);
            arrayList = new ArrayList(linkedHashMap.size());
            it = linkedHashMap.entrySet().iterator();
            c27570o00oOoo0 = c27570o00oOoo02;
            if (it.hasNext()) {
            }
            return enumC32485OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o4.OooOOO0("ThemeUseCase");
        c20358OooO00o4.OooO0o0("downloadCorrectMeetingTheme, has no downloaded error themes, return directly.", new Object[0]);
        C27095OooOo0O c27095OooOo0O3 = c27570o00oOoo02.f96740OooO0O0;
        this.f96690OooOoOO = 2;
    }
}
