package o0OOo0o;

import com.aspose.slides.C22227OoooO;
import com.aspose.words.EditingLanguage;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OO.C26427Oooo0O0;
import o0OO00o0.C26596o00O0o0;
import o0OOO0OO.C27020OooOoO0;
import o0OOo0Oo.InterfaceC27292OooO0oO;
import o0OOo0Oo.InterfaceC27318Oooo00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$deleteNoteChildContent$2", m80623f = "NoteUseCase.kt", m80624l = {EditingLanguage.FAEROESE, EditingLanguage.MALTESE, EditingLanguage.NORTHERN_SAMI_NORWAY, EditingLanguage.PUNJABI_INDIA, EditingLanguage.KHMER, EditingLanguage.LAO, EditingLanguage.MANIPURI, EditingLanguage.SINDHI_DEVANAGARIC, EditingLanguage.SYRIAC}, m80625m = "invokeSuspend")
public final class o00O00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f95900OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f95901OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f95902OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f95903OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f95904OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f95905OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Iterator f95906OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f95907OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ Object f95908OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ boolean f95909Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95910Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(String str, List<String> list, boolean z, C27449o00O0OoO c27449o00O0OoO, Continuation<? super o00O00O> continuation) {
        super(2, continuation);
        this.f95907OooOooO = str;
        this.f95908OooOooo = list;
        this.f95909Oooo000 = z;
        this.f95910Oooo00O = c27449o00O0OoO;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00O00O(this.f95907OooOooO, this.f95908OooOooo, this.f95909Oooo000, this.f95910Oooo00O, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00O00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0376, code lost:
    
        if (r2.OooOOoo(r9, r18) != r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0179, code lost:
    
        if (r2 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ef, code lost:
    
        if (r4 == r1) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0166 A[PHI: r2 r11 r12 r13 r14
      0x0166: PHI (r2v9 java.lang.String) = (r2v8 java.lang.String), (r2v11 java.lang.String) binds: [B:13:0x009a, B:22:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r11v14 java.util.Iterator) = (r11v13 java.util.Iterator), (r11v15 java.util.Iterator) binds: [B:13:0x009a, B:22:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r12v13 java.util.Collection) = (r12v12 java.util.Collection), (r12v14 java.util.Collection) binds: [B:13:0x009a, B:22:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r13v6 java.lang.String) = (r13v5 java.lang.String), (r13v7 java.lang.String) binds: [B:13:0x009a, B:22:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r14v6 o0OOo0o.o00O0OoO) = (r14v5 o0OOo0o.o00O0OoO), (r14v7 o0OOo0o.o00O0OoO) binds: [B:13:0x009a, B:22:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0179 -> B:27:0x017d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x01ef -> B:49:0x01f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0337 -> B:84:0x02c2). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C27449o00O0OoO c27449o00O0OoO;
        String str;
        Collection arrayList;
        Iterator it;
        String str2;
        Object objOooO0Oo;
        C26596o00O0o0 c26596o00O0o0;
        Collection arrayList2;
        Iterator it2;
        List list;
        C27449o00O0OoO c27449o00O0OoO2;
        List list2;
        String str3;
        Iterator it3;
        C27449o00O0OoO c27449o00O0OoO3;
        String str4;
        Object objOooO0Oo2;
        PdfInfo pdfInfo;
        Iterator it4;
        C27449o00O0OoO c27449o00O0OoO4;
        C27020OooOoO0 c27020OooOoO0;
        Set setO0OO00O;
        C26427Oooo0O0 c26427Oooo0O0;
        String id;
        InterfaceC27318Oooo00o interfaceC27318Oooo00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95905OooOoo;
        Object obj2 = this.f95908OooOooo;
        boolean z = this.f95909Oooo000;
        C27449o00O0OoO c27449o00O0OoO5 = this.f95910Oooo00O;
        String str5 = this.f95907OooOooO;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "NoteUseCase", "deleteNoteChildContent, noteId: ", str5, ", pageIds: ");
                sbOooO00o.append(obj2);
                sbOooO00o.append(", isNoteUsingOwnPdf: ");
                sbOooO00o.append(z);
                c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
                c20358OooO00o.OooOOO0("NoteUseCase");
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                kotlin.jvm.internal.OooOOO0.OooO0o(stackTrace, "getStackTrace(...)");
                c20358OooO00o.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("deleteNoteChildContent, stackTrace: ", oOo000Oo.OooOo.o000oOoO(oOo000Oo.OooOOO.Oooo0oo(stackTrace), IOUtils.LINE_SEPARATOR_UNIX, null, null, new o00O00(), 30)), new Object[0]);
                c27449o00O0OoO = c27449o00O0OoO5;
                str = str5;
                arrayList = new ArrayList();
                it = ((Iterable) obj2).iterator();
                if (!it.hasNext()) {
                    str2 = (String) it.next();
                    this.f95901OooOo0o = c27449o00O0OoO;
                    this.f95900OooOo = str;
                    this.f95903OooOoO0 = arrayList;
                    this.f95902OooOoO = it;
                    this.f95904OooOoOO = str2;
                    this.f95905OooOoo = 1;
                    if (c27449o00O0OoO.OooOOO0(str2, str, this) != enumC32485OooO00o) {
                        c26596o00O0o0 = c27449o00O0OoO.f96047OooOOO0;
                        this.f95901OooOo0o = c27449o00O0OoO;
                        this.f95900OooOo = str;
                        this.f95903OooOoO0 = arrayList;
                        this.f95902OooOoO = it;
                        this.f95904OooOoOO = str2;
                        this.f95905OooOoo = 2;
                        if (c26596o00O0o0.OooO0Oo(str) != enumC32485OooO00o) {
                            C27020OooOoO0 c27020OooOoO02 = c27449o00O0OoO.f96039OooO0o;
                            this.f95901OooOo0o = c27449o00O0OoO;
                            this.f95900OooOo = str;
                            this.f95903OooOoO0 = arrayList;
                            this.f95902OooOoO = it;
                            this.f95904OooOoOO = null;
                            this.f95905OooOoo = 3;
                            objOooO0Oo = c27020OooOoO02.OooO0Oo(str2, str, this);
                        }
                        break;
                    }
                    return enumC32485OooO00o;
                }
                List list3 = (List) arrayList;
                ArrayList arrayList3 = new ArrayList();
                Iterator it5 = list3.iterator();
                while (it5.hasNext()) {
                    List<String> historyPageIdList = ((Page) it5.next()).getHistoryPageIdList();
                    String str6 = historyPageIdList != null ? (String) oOo000Oo.OooOo.Oooo(historyPageIdList) : null;
                    if (str6 != null) {
                        arrayList3.add(str6);
                    }
                }
                arrayList2 = new ArrayList();
                it2 = arrayList3.iterator();
                list = arrayList3;
                c27449o00O0OoO2 = c27449o00O0OoO5;
                list2 = list3;
                str3 = str5;
                if (it2.hasNext()) {
                    List list4 = (List) arrayList2;
                    if (z) {
                        ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(list2, list4);
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : arrayListOooooOO) {
                            if (((Page) obj3).getPaperTheme() instanceof PdfPaperTheme) {
                                arrayList4.add(obj3);
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : arrayList4) {
                            PaperTheme paperTheme = ((Page) obj4).getPaperTheme();
                            kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme");
                            PdfInfo pdfInfo2 = ((PdfPaperTheme) paperTheme).getPdfInfo();
                            Object arrayList5 = linkedHashMap.get(pdfInfo2);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                                linkedHashMap.put(pdfInfo2, arrayList5);
                            }
                            ((List) arrayList5).add(obj4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            List list5 = (List) entry.getValue();
                            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                Iterator it6 = list5.iterator();
                                while (it6.hasNext()) {
                                    if (((Page) it6.next()).getSource() == 1) {
                                    }
                                    break;
                                }
                            }
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                        it3 = linkedHashMap2.entrySet().iterator();
                        c27449o00O0OoO3 = c27449o00O0OoO5;
                        str4 = str5;
                        if (!it3.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it3.next();
                            PdfInfo pdfInfo3 = (PdfInfo) entry2.getKey();
                            List list6 = (List) entry2.getValue();
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("NoteUseCase");
                            c20358OooO00o2.OooOO0O("deleteNoteChildContent, DELETING pdfInfo: " + pdfInfo3 + ", firstPage: " + oOo000Oo.OooOo.Oooo(list6), new Object[0]);
                            this.f95901OooOo0o = list;
                            this.f95900OooOo = c27449o00O0OoO3;
                            this.f95903OooOoO0 = str4;
                            this.f95902OooOoO = it3;
                            this.f95904OooOoOO = pdfInfo3;
                            this.f95906OooOoo0 = null;
                            this.f95905OooOoo = 5;
                            c27449o00O0OoO3.getClass();
                            if (C27449o00O0OoO.OooOOOo(pdfInfo3) != enumC32485OooO00o) {
                                c27449o00O0OoO4 = c27449o00O0OoO3;
                                it4 = it3;
                                pdfInfo = pdfInfo3;
                                c26427Oooo0O0 = c27449o00O0OoO4.f96042OooO0oo;
                                id = pdfInfo.getId();
                                this.f95901OooOo0o = list;
                                this.f95900OooOo = c27449o00O0OoO4;
                                this.f95903OooOoO0 = str4;
                                this.f95902OooOoO = it4;
                                this.f95904OooOoOO = null;
                                this.f95905OooOoo = 6;
                                if (c26427Oooo0O0.OooO0O0(id, str4, this) != enumC32485OooO00o) {
                                    it3 = it4;
                                    c27449o00O0OoO3 = c27449o00O0OoO4;
                                    if (!it3.hasNext()) {
                                    }
                                }
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    c27020OooOoO0 = c27449o00O0OoO5.f96039OooO0o;
                    setO0OO00O = oOo000Oo.OooOo.o0OO00O(oOo000Oo.OooOo.OooooOO((Collection) obj2, list));
                    this.f95901OooOo0o = null;
                    this.f95900OooOo = null;
                    this.f95903OooOoO0 = null;
                    this.f95902OooOoO = null;
                    this.f95904OooOoOO = null;
                    this.f95906OooOoo0 = null;
                    this.f95905OooOoo = 7;
                    if (c27020OooOoO0.OooO0O0(str5, setO0OO00O, this) != enumC32485OooO00o) {
                        interfaceC27318Oooo00o = c27449o00O0OoO5.f96055OooOo00;
                        this.f95905OooOoo = 8;
                        if (interfaceC27318Oooo00o.OooO0oO(str5, this) != enumC32485OooO00o) {
                            InterfaceC27292OooO0oO interfaceC27292OooO0oO = c27449o00O0OoO5.f96044OooOO0O;
                            this.f95905OooOoo = 9;
                        }
                        break;
                    }
                    return enumC32485OooO00o;
                }
                String str7 = (String) it2.next();
                C27020OooOoO0 c27020OooOoO03 = c27449o00O0OoO2.f96039OooO0o;
                this.f95901OooOo0o = list2;
                this.f95900OooOo = list;
                this.f95903OooOoO0 = c27449o00O0OoO2;
                this.f95902OooOoO = str3;
                this.f95904OooOoOO = arrayList2;
                this.f95906OooOoo0 = it2;
                this.f95905OooOoo = 4;
                objOooO0Oo2 = c27020OooOoO03.OooO0Oo(str7, str3, this);
                break;
                break;
            case 1:
                str2 = (String) this.f95904OooOoOO;
                it = (Iterator) this.f95902OooOoO;
                arrayList = (Collection) this.f95903OooOoO0;
                str = (String) this.f95900OooOo;
                c27449o00O0OoO = (C27449o00O0OoO) this.f95901OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c26596o00O0o0 = c27449o00O0OoO.f96047OooOOO0;
                this.f95901OooOo0o = c27449o00O0OoO;
                this.f95900OooOo = str;
                this.f95903OooOoO0 = arrayList;
                this.f95902OooOoO = it;
                this.f95904OooOoOO = str2;
                this.f95905OooOoo = 2;
                if (c26596o00O0o0.OooO0Oo(str) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                str2 = (String) this.f95904OooOoOO;
                it = (Iterator) this.f95902OooOoO;
                arrayList = (Collection) this.f95903OooOoO0;
                str = (String) this.f95900OooOo;
                c27449o00O0OoO = (C27449o00O0OoO) this.f95901OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C27020OooOoO0 c27020OooOoO022 = c27449o00O0OoO.f96039OooO0o;
                this.f95901OooOo0o = c27449o00O0OoO;
                this.f95900OooOo = str;
                this.f95903OooOoO0 = arrayList;
                this.f95902OooOoO = it;
                this.f95904OooOoOO = null;
                this.f95905OooOoo = 3;
                objOooO0Oo = c27020OooOoO022.OooO0Oo(str2, str, this);
                break;
            case 3:
                Iterator it7 = (Iterator) this.f95902OooOoO;
                Collection collection = (Collection) this.f95903OooOoO0;
                String str8 = (String) this.f95900OooOo;
                C27449o00O0OoO c27449o00O0OoO6 = (C27449o00O0OoO) this.f95901OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27449o00O0OoO = c27449o00O0OoO6;
                str = str8;
                arrayList = collection;
                it = it7;
                objOooO0Oo = obj;
                Page page = (Page) objOooO0Oo;
                if (page != null) {
                    c27449o00O0OoO.getClass();
                    C27449o00O0OoO.OooOOO(page);
                } else {
                    page = null;
                }
                if (page != null) {
                    arrayList.add(page);
                }
                if (!it.hasNext()) {
                }
                break;
            case 4:
                it2 = this.f95906OooOoo0;
                arrayList2 = (Collection) this.f95904OooOoOO;
                str3 = (String) this.f95902OooOoO;
                c27449o00O0OoO2 = (C27449o00O0OoO) this.f95903OooOoO0;
                list = (List) this.f95900OooOo;
                list2 = (List) this.f95901OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0Oo2 = obj;
                Page page2 = (Page) objOooO0Oo2;
                if (page2 != null) {
                    arrayList2.add(page2);
                }
                if (it2.hasNext()) {
                }
                break;
            case 5:
                pdfInfo = (PdfInfo) this.f95904OooOoOO;
                it4 = (Iterator) this.f95902OooOoO;
                str4 = (String) this.f95903OooOoO0;
                c27449o00O0OoO4 = (C27449o00O0OoO) this.f95900OooOo;
                List list7 = (List) this.f95901OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list = list7;
                c26427Oooo0O0 = c27449o00O0OoO4.f96042OooO0oo;
                id = pdfInfo.getId();
                this.f95901OooOo0o = list;
                this.f95900OooOo = c27449o00O0OoO4;
                this.f95903OooOoO0 = str4;
                this.f95902OooOoO = it4;
                this.f95904OooOoOO = null;
                this.f95905OooOoo = 6;
                if (c26427Oooo0O0.OooO0O0(id, str4, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                it3 = (Iterator) this.f95902OooOoO;
                String str9 = (String) this.f95903OooOoO0;
                C27449o00O0OoO c27449o00O0OoO7 = (C27449o00O0OoO) this.f95900OooOo;
                List list8 = (List) this.f95901OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str4 = str9;
                c27449o00O0OoO3 = c27449o00O0OoO7;
                list = list8;
                if (!it3.hasNext()) {
                    c27020OooOoO0 = c27449o00O0OoO5.f96039OooO0o;
                    setO0OO00O = oOo000Oo.OooOo.o0OO00O(oOo000Oo.OooOo.OooooOO((Collection) obj2, list));
                    this.f95901OooOo0o = null;
                    this.f95900OooOo = null;
                    this.f95903OooOoO0 = null;
                    this.f95902OooOoO = null;
                    this.f95904OooOoOO = null;
                    this.f95906OooOoo0 = null;
                    this.f95905OooOoo = 7;
                    if (c27020OooOoO0.OooO0O0(str5, setO0OO00O, this) != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                interfaceC27318Oooo00o = c27449o00O0OoO5.f96055OooOo00;
                this.f95905OooOoo = 8;
                if (interfaceC27318Oooo00o.OooO0oO(str5, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 8:
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC27292OooO0oO interfaceC27292OooO0oO2 = c27449o00O0OoO5.f96044OooOO0O;
                this.f95905OooOoo = 9;
                break;
            case 9:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
