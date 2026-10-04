package o0OOo0o;

import androidx.appcompat.widget.C21532OooOOo;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24033OooOooo;
import o0OOO0OO.C27020OooOoO0;
import o0OOOO00.C27095OooOo0O;
import o0OOOo0.C27174OooO0O0;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0OOo0o.o00o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StorageOptimizationUseCase$clearDocumentsFiles$1", m80623f = "StorageOptimizationUseCase.kt", m80624l = {42, 74, 77, 84, 107, 112, 117, 124}, m80625m = "invokeSuspend")
public final class C27536o00o0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super C27174OooO0O0<Float>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f96528OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f96529OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f96530OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f96531OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f96532OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f96533OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f96534OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C27540o00o0oO f96535OooOooO;

    /* JADX INFO: renamed from: o0OOo0o.o00o0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StorageOptimizationUseCase$clearDocumentsFiles$1$recordPdfOccupiedInfoAndEmitProgress$1", m80623f = "StorageOptimizationUseCase.kt", m80624l = {102}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<PdfInfo, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f96536OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f96537OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C24033OooOooo f96538OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Map<String, Boolean> f96539OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ int f96540OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO<C27174OooO0O0<Float>> f96541OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Map<String, Boolean> map, C24033OooOooo c24033OooOooo, int i, InterfaceC33723OooO0oO<? super C27174OooO0O0<Float>> interfaceC33723OooO0oO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f96539OooOoO0 = map;
            this.f96538OooOoO = c24033OooOooo;
            this.f96540OooOoOO = i;
            this.f96541OooOoo0 = interfaceC33723OooO0oO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f96539OooOoO0, this.f96538OooOoO, this.f96540OooOoOO, this.f96541OooOoo0, continuation);
            oooO00o.f96536OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(PdfInfo pdfInfo, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(pdfInfo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f96537OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String pdfPath = ((PdfInfo) this.f96536OooOo).getPdfPath();
                if (new File(pdfPath).exists()) {
                    Map<String, Boolean> map = this.f96539OooOoO0;
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(map.get(pdfPath), Boolean.FALSE)) {
                        map.put(pdfPath, Boolean.TRUE);
                    }
                }
                C24033OooOooo c24033OooOooo = this.f96538OooOoO;
                int i2 = c24033OooOooo.f80940OooOo0o + 1;
                c24033OooOooo.f80940OooOo0o = i2;
                C27174OooO0O0<Float> c27174OooO0O0 = new C27174OooO0O0<>(false, new Float((i2 * 100.0f) / this.f96540OooOoOO), null, null, 12);
                this.f96537OooOo0o = 1;
                if (this.f96541OooOoo0.emit(c27174OooO0O0, this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27536o00o0o(C27540o00o0oO c27540o00o0oO, Continuation<? super C27536o00o0o> continuation) {
        super(2, continuation);
        this.f96535OooOooO = c27540o00o0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27536o00o0o c27536o00o0o = new C27536o00o0o(this.f96535OooOooO, continuation);
        c27536o00o0o.f96533OooOoo = obj;
        return c27536o00o0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super C27174OooO0O0<Float>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C27536o00o0o) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e5, code lost:
    
        if (r14.emit(r15, r22) == r1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x026d, code lost:
    
        if (r9 == r1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0333, code lost:
    
        if (r7.emit(r10, r22) == r1) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012d A[LOOP:6: B:28:0x0127->B:30:0x012d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0175 A[LOOP:4: B:36:0x016f->B:38:0x0175, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x030d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x02ce -> B:85:0x02df). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        int iOooO0Oo;
        Iterator it;
        Object objOooOOo0;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        oO0O000o.OooO00o oooO00o;
        Map map;
        Iterator it2;
        Object objOooO0o0;
        Map map2;
        oO0O000o.OooO00o oooO00o2;
        List list;
        List list2;
        List list3;
        Iterator it3;
        oO0O000o.OooO00o oooO00o3;
        InterfaceC32508OooOOOo interfaceC32508OooOOOo;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO3;
        Iterator it4;
        InterfaceC32508OooOOOo interfaceC32508OooOOOo2;
        C27540o00o0oO c27540o00o0oO;
        PdfInfo pdfInfo;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO4;
        Object objOooO0oO;
        Iterator it5;
        Iterator it6;
        oO0O000o.OooO00o oooO00o4;
        InterfaceC32508OooOOOo interfaceC32508OooOOOo3;
        C27540o00o0oO c27540o00o0oO2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96534OooOoo0;
        final C27540o00o0oO c27540o00o0oO3 = this.f96535OooOooO;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f96533OooOoo;
                this.f96533OooOoo = interfaceC33723OooO0oO;
                this.f96534OooOoo0 = 1;
                if (C27540o00o0oO.OooO00o(c27540o00o0oO3, this) != enumC32485OooO00o) {
                    c27540o00o0oO3.getClass();
                    File file = new File(c27540o00o0oO3.f96558OooO00o.getFilesDir(), "documents");
                    C31190OooO0oo.OooO0o(file);
                    ArrayList arrayListOooOo00 = C31190OooO0oo.OooOo00(file, false);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : arrayListOooOo00) {
                        File file2 = (File) obj2;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(file2);
                        if (C32501OooO0oO.OooO0o0(file2).equals("pdf")) {
                            arrayList.add(obj2);
                        }
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("StorageOptimizationUseCase");
                    c20358OooO00o.OooO0o0(C21532OooOOo.OooO0OO(arrayList.size(), "Pdf files in document dir size: "), new Object[0]);
                    iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList, 10));
                    if (iOooO0Oo < 16) {
                        iOooO0Oo = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put(((File) it.next()).getAbsolutePath(), Boolean.FALSE);
                    }
                    final LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(linkedHashMap);
                    oO0O000o.OooO00o oooO00o5 = new oO0O000o.OooO00o() { // from class: o0OOo0o.o00o0o0o
                        @Override // oO0O000o.OooO00o
                        public final Object invoke() {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry : linkedHashMapOooOOOO.entrySet()) {
                                if (!((Boolean) entry.getValue()).booleanValue()) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                            Iterator it7 = linkedHashMap2.entrySet().iterator();
                            while (it7.hasNext()) {
                                arrayList2.add((String) ((Map.Entry) it7.next()).getKey());
                            }
                            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                            Iterator it8 = arrayList2.iterator();
                            while (it8.hasNext()) {
                                arrayList3.add(new File((String) it8.next()));
                            }
                            c27540o00o0oO3.getClass();
                            C27540o00o0oO.OooO0O0("pdf", arrayList3);
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                new File((String) it9.next()).delete();
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                    };
                    this.f96533OooOoo = interfaceC33723OooO0oO;
                    this.f96529OooOo0o = linkedHashMapOooOOOO;
                    this.f96528OooOo = oooO00o5;
                    this.f96534OooOoo0 = 2;
                    objOooOOo0 = c27540o00o0oO3.f96559OooO0O0.OooOOo0(this);
                    if (objOooOOo0 != enumC32485OooO00o) {
                        interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                        oooO00o = oooO00o5;
                        map = linkedHashMapOooOOOO;
                        List list4 = (List) objOooOOo0;
                        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                        it2 = list4.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((NoteMeta) it2.next()).getId());
                        }
                        C27095OooOo0O c27095OooOo0O = c27540o00o0oO3.f96561OooO0Oo;
                        this.f96533OooOoo = interfaceC33723OooO0oO2;
                        this.f96529OooOo0o = map;
                        this.f96528OooOo = oooO00o;
                        this.f96531OooOoO0 = arrayList2;
                        this.f96534OooOoo0 = 3;
                        objOooO0o0 = c27095OooOo0O.OooO0o0(this);
                        if (objOooO0o0 != enumC32485OooO00o) {
                            map2 = map;
                            oooO00o2 = oooO00o;
                            list = arrayList2;
                            InterfaceC33723OooO0oO interfaceC33723OooO0oO5 = interfaceC33723OooO0oO2;
                            list2 = (List) objOooO0o0;
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("StorageOptimizationUseCase");
                            c20358OooO00o2.OooO0o0(C21532OooOOo.OooO0OO(list.size(), "All note size: "), new Object[0]);
                            if (list.isEmpty() || !list2.isEmpty()) {
                                OooO00o oooO00o6 = new OooO00o(map2, new C24033OooOooo(), list2.size() + list.size(), interfaceC33723OooO0oO5, null);
                                list3 = list;
                                it3 = list2.iterator();
                                oooO00o3 = oooO00o2;
                                interfaceC32508OooOOOo = oooO00o6;
                                interfaceC33723OooO0oO3 = interfaceC33723OooO0oO5;
                                while (it3.hasNext()) {
                                    PaperTheme paperTheme = ((MyTemplate) it3.next()).getPaperTheme();
                                    PdfPaperTheme pdfPaperTheme = paperTheme instanceof PdfPaperTheme ? (PdfPaperTheme) paperTheme : null;
                                    if (pdfPaperTheme != null && (pdfInfo = pdfPaperTheme.getPdfInfo()) != null) {
                                        this.f96533OooOoo = interfaceC33723OooO0oO3;
                                        this.f96529OooOo0o = oooO00o3;
                                        this.f96528OooOo = list3;
                                        this.f96531OooOoO0 = interfaceC32508OooOOOo;
                                        this.f96530OooOoO = it3;
                                        this.f96532OooOoOO = pdfInfo;
                                        this.f96534OooOoo0 = 5;
                                        if (interfaceC32508OooOOOo.invoke(pdfInfo, this) == enumC32485OooO00o) {
                                        }
                                    }
                                }
                                it4 = list3.iterator();
                                interfaceC32508OooOOOo2 = interfaceC32508OooOOOo;
                                c27540o00o0oO = c27540o00o0oO3;
                                interfaceC33723OooO0oO4 = interfaceC33723OooO0oO3;
                                if (it4.hasNext()) {
                                    String str = (String) it4.next();
                                    C27020OooOoO0 c27020OooOoO0 = c27540o00o0oO.f96560OooO0OO;
                                    this.f96533OooOoo = interfaceC33723OooO0oO4;
                                    this.f96529OooOo0o = oooO00o3;
                                    this.f96528OooOo = interfaceC32508OooOOOo2;
                                    this.f96531OooOoO0 = c27540o00o0oO;
                                    this.f96530OooOoO = it4;
                                    this.f96532OooOoOO = null;
                                    this.f96534OooOoo0 = 6;
                                    objOooO0oO = c27020OooOoO0.OooO0oO(str, this);
                                } else {
                                    oooO00o3.invoke();
                                    C27174OooO0O0 c27174OooO0O0 = new C27174OooO0O0(true, new Float(100.0f), null, null, 12);
                                    this.f96533OooOoo = null;
                                    this.f96529OooOo0o = null;
                                    this.f96528OooOo = null;
                                    this.f96531OooOoO0 = null;
                                    this.f96530OooOoO = null;
                                    this.f96532OooOoOO = null;
                                    this.f96534OooOoo0 = 8;
                                }
                            } else {
                                oooO00o2.invoke();
                                C27174OooO0O0 c27174OooO0O02 = new C27174OooO0O0(true, new Float(100.0f), null, null, 12);
                                this.f96533OooOoo = null;
                                this.f96529OooOo0o = null;
                                this.f96528OooOo = null;
                                this.f96531OooOoO0 = null;
                                this.f96534OooOoo0 = 4;
                            }
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f96533OooOoo;
                C32446OooOOOo.OooO0O0(obj);
                c27540o00o0oO3.getClass();
                File file3 = new File(c27540o00o0oO3.f96558OooO00o.getFilesDir(), "documents");
                C31190OooO0oo.OooO0o(file3);
                ArrayList arrayListOooOo002 = C31190OooO0oo.OooOo00(file3, false);
                ArrayList arrayList3 = new ArrayList();
                while (r9.hasNext()) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("StorageOptimizationUseCase");
                c20358OooO00o3.OooO0o0(C21532OooOOo.OooO0OO(arrayList3.size(), "Pdf files in document dir size: "), new Object[0]);
                iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList3, 10));
                if (iOooO0Oo < 16) {
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo);
                it = arrayList3.iterator();
                while (it.hasNext()) {
                }
                final LinkedHashMap linkedHashMapOooOOOO2 = C34444Oooo0O0.OooOOOO(linkedHashMap2);
                oO0O000o.OooO00o oooO00o52 = new oO0O000o.OooO00o() { // from class: o0OOo0o.o00o0o0o
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMapOooOOOO2.entrySet()) {
                            if (!((Boolean) entry.getValue()).booleanValue()) {
                                linkedHashMap22.put(entry.getKey(), entry.getValue());
                            }
                        }
                        ArrayList arrayList22 = new ArrayList(linkedHashMap22.size());
                        Iterator it7 = linkedHashMap22.entrySet().iterator();
                        while (it7.hasNext()) {
                            arrayList22.add((String) ((Map.Entry) it7.next()).getKey());
                        }
                        ArrayList arrayList32 = new ArrayList(C34428OooOOo.OooOOoo(arrayList22, 10));
                        Iterator it8 = arrayList22.iterator();
                        while (it8.hasNext()) {
                            arrayList32.add(new File((String) it8.next()));
                        }
                        c27540o00o0oO3.getClass();
                        C27540o00o0oO.OooO0O0("pdf", arrayList32);
                        Iterator it9 = arrayList22.iterator();
                        while (it9.hasNext()) {
                            new File((String) it9.next()).delete();
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                };
                this.f96533OooOoo = interfaceC33723OooO0oO;
                this.f96529OooOo0o = linkedHashMapOooOOOO2;
                this.f96528OooOo = oooO00o52;
                this.f96534OooOoo0 = 2;
                objOooOOo0 = c27540o00o0oO3.f96559OooO0O0.OooOOo0(this);
                if (objOooOOo0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                oooO00o = (oO0O000o.OooO00o) this.f96528OooOo;
                Map map3 = (Map) this.f96529OooOo0o;
                interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f96533OooOoo;
                C32446OooOOOo.OooO0O0(obj);
                objOooOOo0 = obj;
                map = map3;
                List list42 = (List) objOooOOo0;
                ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(list42, 10));
                it2 = list42.iterator();
                while (it2.hasNext()) {
                }
                C27095OooOo0O c27095OooOo0O2 = c27540o00o0oO3.f96561OooO0Oo;
                this.f96533OooOoo = interfaceC33723OooO0oO2;
                this.f96529OooOo0o = map;
                this.f96528OooOo = oooO00o;
                this.f96531OooOoO0 = arrayList22;
                this.f96534OooOoo0 = 3;
                objOooO0o0 = c27095OooOo0O2.OooO0o0(this);
                if (objOooO0o0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                list = (List) this.f96531OooOoO0;
                oO0O000o.OooO00o oooO00o7 = (oO0O000o.OooO00o) this.f96528OooOo;
                Map map4 = (Map) this.f96529OooOo0o;
                interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f96533OooOoo;
                C32446OooOOOo.OooO0O0(obj);
                map2 = map4;
                oooO00o2 = oooO00o7;
                objOooO0o0 = obj;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO52 = interfaceC33723OooO0oO2;
                list2 = (List) objOooO0o0;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("StorageOptimizationUseCase");
                c20358OooO00o22.OooO0o0(C21532OooOOo.OooO0OO(list.size(), "All note size: "), new Object[0]);
                if (list.isEmpty()) {
                    break;
                }
                OooO00o oooO00o62 = new OooO00o(map2, new C24033OooOooo(), list2.size() + list.size(), interfaceC33723OooO0oO52, null);
                list3 = list;
                it3 = list2.iterator();
                oooO00o3 = oooO00o2;
                interfaceC32508OooOOOo = oooO00o62;
                interfaceC33723OooO0oO3 = interfaceC33723OooO0oO52;
                while (it3.hasNext()) {
                }
                it4 = list3.iterator();
                interfaceC32508OooOOOo2 = interfaceC32508OooOOOo;
                c27540o00o0oO = c27540o00o0oO3;
                interfaceC33723OooO0oO4 = interfaceC33723OooO0oO3;
                if (it4.hasNext()) {
                }
                return enumC32485OooO00o;
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 5:
                it3 = this.f96530OooOoO;
                interfaceC32508OooOOOo = (InterfaceC32508OooOOOo) this.f96531OooOoO0;
                list3 = (List) this.f96528OooOo;
                oooO00o3 = (oO0O000o.OooO00o) this.f96529OooOo0o;
                interfaceC33723OooO0oO3 = (InterfaceC33723OooO0oO) this.f96533OooOoo;
                C32446OooOOOo.OooO0O0(obj);
                while (it3.hasNext()) {
                }
                it4 = list3.iterator();
                interfaceC32508OooOOOo2 = interfaceC32508OooOOOo;
                c27540o00o0oO = c27540o00o0oO3;
                interfaceC33723OooO0oO4 = interfaceC33723OooO0oO3;
                if (it4.hasNext()) {
                }
                return enumC32485OooO00o;
            case 6:
                it4 = this.f96530OooOoO;
                c27540o00o0oO = (C27540o00o0oO) this.f96531OooOoO0;
                interfaceC32508OooOOOo2 = (InterfaceC32508OooOOOo) this.f96528OooOo;
                oooO00o3 = (oO0O000o.OooO00o) this.f96529OooOo0o;
                interfaceC33723OooO0oO4 = (InterfaceC33723OooO0oO) this.f96533OooOoo;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0oO = obj;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : (Iterable) objOooO0oO) {
                    if (((Page) obj3).getPaperTheme() instanceof PdfPaperTheme) {
                        arrayList4.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj4 : arrayList4) {
                    PaperTheme paperTheme2 = ((Page) obj4).getPaperTheme();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme2, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme");
                    PdfInfo pdfInfo2 = ((PdfPaperTheme) paperTheme2).getPdfInfo();
                    Object arrayList5 = linkedHashMap3.get(pdfInfo2);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap3.put(pdfInfo2, arrayList5);
                    }
                    ((List) arrayList5).add(obj4);
                }
                C27540o00o0oO c27540o00o0oO4 = c27540o00o0oO;
                it5 = it4;
                it6 = linkedHashMap3.entrySet().iterator();
                interfaceC33723OooO0oO3 = interfaceC33723OooO0oO4;
                oooO00o4 = oooO00o3;
                interfaceC32508OooOOOo3 = interfaceC32508OooOOOo2;
                c27540o00o0oO2 = c27540o00o0oO4;
                while (it6.hasNext()) {
                    PdfInfo pdfInfo3 = (PdfInfo) ((Map.Entry) it6.next()).getKey();
                    this.f96533OooOoo = interfaceC33723OooO0oO3;
                    this.f96529OooOo0o = oooO00o4;
                    this.f96528OooOo = interfaceC32508OooOOOo3;
                    this.f96531OooOoO0 = c27540o00o0oO2;
                    this.f96530OooOoO = it5;
                    this.f96532OooOoOO = it6;
                    this.f96534OooOoo0 = 7;
                    if (interfaceC32508OooOOOo3.invoke(pdfInfo3, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                it4 = it5;
                c27540o00o0oO = c27540o00o0oO2;
                interfaceC32508OooOOOo2 = interfaceC32508OooOOOo3;
                oooO00o3 = oooO00o4;
                interfaceC33723OooO0oO4 = interfaceC33723OooO0oO3;
                if (it4.hasNext()) {
                }
                return enumC32485OooO00o;
            case 7:
                it6 = (Iterator) this.f96532OooOoOO;
                it5 = this.f96530OooOoO;
                c27540o00o0oO2 = (C27540o00o0oO) this.f96531OooOoO0;
                interfaceC32508OooOOOo3 = (InterfaceC32508OooOOOo) this.f96528OooOo;
                oooO00o4 = (oO0O000o.OooO00o) this.f96529OooOo0o;
                interfaceC33723OooO0oO3 = (InterfaceC33723OooO0oO) this.f96533OooOoo;
                C32446OooOOOo.OooO0O0(obj);
                while (it6.hasNext()) {
                }
                it4 = it5;
                c27540o00o0oO = c27540o00o0oO2;
                interfaceC32508OooOOOo2 = interfaceC32508OooOOOo3;
                oooO00o3 = oooO00o4;
                interfaceC33723OooO0oO4 = interfaceC33723OooO0oO3;
                if (it4.hasNext()) {
                }
                return enumC32485OooO00o;
            case 8:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
