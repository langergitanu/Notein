package o0OOo0o;

import com.aspose.slides.C22201OooO0oO;
import com.aspose.words.EditingLanguage;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO.C26427Oooo0O0;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0Oo.InterfaceC27318Oooo00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$deleteNoteById$2", m80623f = "NoteUseCase.kt", m80624l = {1023, EditingLanguage.CHINESE_TAIWAN, EditingLanguage.CZECH, EditingLanguage.ENGLISH_US, EditingLanguage.FRENCH_FRANCE, EditingLanguage.HEBREW, EditingLanguage.KOREAN}, m80625m = "invokeSuspend")
public final class o00O000o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C27449o00O0OoO f95886OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f95887OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public PdfInfo f95888OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f95889OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f95890OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95891OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f95892OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f95893OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ boolean f95894OooOooo;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$deleteNoteById$2$2", m80623f = "NoteUseCase.kt", m80624l = {EditingLanguage.PORTUGUESE_BRAZIL, EditingLanguage.ROMANSH}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteContent f95895OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f95896OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f95897OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C27449o00O0OoO f95898OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ boolean f95899OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteContent noteContent, C27449o00O0OoO c27449o00O0OoO, String str, boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f95895OooOo = noteContent;
            this.f95898OooOoO0 = c27449o00O0OoO;
            this.f95897OooOoO = str;
            this.f95899OooOoOO = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f95895OooOo, this.f95898OooOoO0, this.f95897OooOoO, this.f95899OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
        
            if (r10.OooO0oO(r9.f95897OooOoO, r9) == r0) goto L28;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [oOo000Oo.OooOoO] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ?? arrayList;
            List<Page> pages;
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f95896OooOo0o;
            C27449o00O0OoO c27449o00O0OoO = this.f95898OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteContent noteContent = this.f95895OooOo;
                if (noteContent == null || (pages = noteContent.getPages()) == null) {
                    arrayList = C34434OooOoO.f123453OooOo0o;
                } else {
                    List<Page> list = pages;
                    arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Page) it.next()).getId());
                    }
                }
                ?? r4 = arrayList;
                this.f95896OooOo0o = 1;
                c27449o00O0OoO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O00O(this.f95897OooOoO, r4, this.f95899OooOoOO, c27449o00O0OoO, null), this);
                if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o != obj2) {
                }
                return obj2;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27318Oooo00o interfaceC27318Oooo00o = c27449o00O0OoO.f96055OooOo00;
            this.f95896OooOo0o = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(String str, Continuation continuation, C27449o00O0OoO c27449o00O0OoO, boolean z) {
        super(2, continuation);
        this.f95891OooOoo = c27449o00O0OoO;
        this.f95893OooOooO = str;
        this.f95894OooOooo = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        boolean z = this.f95894OooOooo;
        return new o00O000o(this.f95893OooOooO, continuation, this.f95891OooOoo, z);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00O000o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db A[PHI: r2 r11
      0x00db: PHI (r2v11 ??) = (r2v38 ??), (r2v39 ??) binds: [B:32:0x00d7, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r11v10 java.lang.Object) = (r11v9 java.lang.Object), (r11v12 java.lang.Object) binds: [B:32:0x00d7, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b A[PHI: r2 r14
      0x015b: PHI (r2v17 ??) = (r2v29 ??), (r2v30 ??), (r2v31 ??), (r2v32 ??), (r2v33 ??) binds: [B:35:0x00de, B:37:0x00e4, B:38:0x00e6, B:54:0x015a, B:53:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r14v14 com.orion.notein.domain.models.note.NoteContent) = 
      (r14v3 com.orion.notein.domain.models.note.NoteContent)
      (r14v3 com.orion.notein.domain.models.note.NoteContent)
      (r14v3 com.orion.notein.domain.models.note.NoteContent)
      (r14v6 com.orion.notein.domain.models.note.NoteContent)
      (r14v15 com.orion.notein.domain.models.note.NoteContent)
     binds: [B:35:0x00de, B:37:0x00e4, B:38:0x00e6, B:54:0x015a, B:53:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String strOooO0Oo;
        Object objOooO0oo;
        NoteMeta noteMeta;
        C34406OooO00o.C20358OooO00o c20358OooO00o;
        ?? r2;
        Object objOooOO0o;
        ?? r22;
        NoteContent noteContent;
        PdfInfo pdfInfo;
        Object objOooO0OO;
        String str;
        NoteContent noteContent2;
        C27449o00O0OoO c27449o00O0OoO;
        ?? r23;
        PdfInfo pdfInfo2;
        String str2;
        C27449o00O0OoO c27449o00O0OoO2;
        NoteContent noteContent3;
        ?? r24;
        C26427Oooo0O0 c26427Oooo0O0;
        String id;
        NoteContent noteContent4;
        ?? r25;
        InterfaceC27309OooOoO interfaceC27309OooOoO;
        ?? r1;
        NoteContent noteContent5;
        ?? r26;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95892OooOoo0;
        C27449o00O0OoO c27449o00O0OoO3 = this.f95891OooOoo;
        String str3 = this.f95893OooOooO;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                strOooO0Oo = c27449o00O0OoO3.f96037OooO0OO.OooO0Oo();
                this.f95887OooOo0o = strOooO0Oo;
                this.f95892OooOoo0 = 1;
                objOooO0oo = c27449o00O0OoO3.f96036OooO0O0.OooO0oo(str3, strOooO0Oo, this);
                if (objOooO0oo != enumC32485OooO00o) {
                    noteMeta = (NoteMeta) objOooO0oo;
                    ?? usingOwnPdf = noteMeta == null ? noteMeta.getUsingOwnPdf() : 1;
                    c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteUseCase");
                    c20358OooO00o.OooO0o0("deleteNoteById noteMeta: " + noteMeta, new Object[0]);
                    if ((noteMeta != null || !noteMeta.getInTrashBin()) && !this.f95894OooOooo) {
                        c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteUseCase", "NoteUseCase.deleteNoteById for id: ", str3, " failed, do nothing."), new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27449o00O0OoO3.f96036OooO0O0;
                    this.f95887OooOo0o = null;
                    this.f95890OooOoOO = usingOwnPdf;
                    this.f95892OooOoo0 = 2;
                    if (interfaceC27313OooOoo0.OooOo00(str3, strOooO0Oo, this) != enumC32485OooO00o) {
                        r2 = usingOwnPdf;
                        InterfaceC27309OooOoO interfaceC27309OooOoO2 = c27449o00O0OoO3.f96035OooO00o;
                        this.f95890OooOoOO = r2;
                        this.f95892OooOoo0 = 3;
                        objOooOO0o = interfaceC27309OooOoO2.OooOO0o(str3, this);
                        r22 = r2;
                        if (objOooOO0o != enumC32485OooO00o) {
                            noteContent = (NoteContent) objOooOO0o;
                            r25 = r22;
                            if (noteContent == null) {
                                pdfInfo = noteContent.getPdfInfo();
                                r25 = r22;
                                r25 = r22;
                                if (pdfInfo == null || r22 == 0) {
                                    interfaceC27309OooOoO = c27449o00O0OoO3.f96035OooO00o;
                                    this.f95887OooOo0o = noteContent;
                                    this.f95886OooOo = null;
                                    this.f95889OooOoO0 = null;
                                    this.f95888OooOoO = null;
                                    this.f95890OooOoOO = r25;
                                    this.f95892OooOoo0 = 7;
                                    if (interfaceC27309OooOoO.OooO(str3, this) != enumC32485OooO00o) {
                                        r1 = r25;
                                        noteContent5 = noteContent;
                                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new OooO00o(noteContent5, this.f95891OooOoo, this.f95893OooOooO, r1 == 0, null), 3);
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "NoteUseCase", "NoteUseCase.deleteNoteById for id: ", str3, " completed."), new Object[0]);
                                    }
                                } else {
                                    C26427Oooo0O0 c26427Oooo0O02 = c27449o00O0OoO3.f96042OooO0oo;
                                    String id2 = pdfInfo.getId();
                                    this.f95887OooOo0o = noteContent;
                                    this.f95886OooOo = c27449o00O0OoO3;
                                    this.f95889OooOoO0 = str3;
                                    this.f95888OooOoO = pdfInfo;
                                    this.f95890OooOoOO = r22;
                                    this.f95892OooOoo0 = 4;
                                    objOooO0OO = c26427Oooo0O02.OooO0OO(id2, str3, this);
                                    if (objOooO0OO != enumC32485OooO00o) {
                                        str = str3;
                                        noteContent2 = noteContent;
                                        c27449o00O0OoO = c27449o00O0OoO3;
                                        r23 = r22;
                                        pdfInfo2 = (PdfInfo) objOooO0OO;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o3.OooOOO0("NoteUseCase");
                                        c20358OooO00o3.OooOO0O("deleteNoteById, DELETING pdf info: " + pdfInfo2, new Object[0]);
                                        if (pdfInfo2 == null) {
                                            this.f95887OooOo0o = noteContent2;
                                            this.f95886OooOo = c27449o00O0OoO;
                                            this.f95889OooOoO0 = str;
                                            this.f95888OooOoO = pdfInfo;
                                            this.f95890OooOoOO = r23;
                                            this.f95892OooOoo0 = 5;
                                            c27449o00O0OoO.getClass();
                                            if (C27449o00O0OoO.OooOOOo(pdfInfo2) != enumC32485OooO00o) {
                                                str2 = str;
                                                c27449o00O0OoO2 = c27449o00O0OoO;
                                                noteContent3 = noteContent2;
                                                r24 = r23;
                                                c26427Oooo0O0 = c27449o00O0OoO2.f96042OooO0oo;
                                                id = pdfInfo.getId();
                                                this.f95887OooOo0o = noteContent3;
                                                this.f95886OooOo = null;
                                                this.f95889OooOoO0 = null;
                                                this.f95888OooOoO = null;
                                                this.f95890OooOoOO = r24;
                                                this.f95892OooOoo0 = 6;
                                                if (c26427Oooo0O0.OooO0O0(id, str2, this) != enumC32485OooO00o) {
                                                    noteContent4 = noteContent3;
                                                    r26 = r24;
                                                    noteContent = noteContent4;
                                                    r25 = r26;
                                                    interfaceC27309OooOoO = c27449o00O0OoO3.f96035OooO00o;
                                                    this.f95887OooOo0o = noteContent;
                                                    this.f95886OooOo = null;
                                                    this.f95889OooOoO0 = null;
                                                    this.f95888OooOoO = null;
                                                    this.f95890OooOoOO = r25;
                                                    this.f95892OooOoo0 = 7;
                                                    if (interfaceC27309OooOoO.OooO(str3, this) != enumC32485OooO00o) {
                                                    }
                                                }
                                            }
                                        } else {
                                            noteContent = noteContent2;
                                            r25 = r23;
                                            interfaceC27309OooOoO = c27449o00O0OoO3.f96035OooO00o;
                                            this.f95887OooOo0o = noteContent;
                                            this.f95886OooOo = null;
                                            this.f95889OooOoO0 = null;
                                            this.f95888OooOoO = null;
                                            this.f95890OooOoOO = r25;
                                            this.f95892OooOoo0 = 7;
                                            if (interfaceC27309OooOoO.OooO(str3, this) != enumC32485OooO00o) {
                                            }
                                        }
                                    }
                                }
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                strOooO0Oo = (String) this.f95887OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0oo = obj;
                noteMeta = (NoteMeta) objOooO0oo;
                if (noteMeta == null) {
                }
                c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteUseCase");
                c20358OooO00o.OooO0o0("deleteNoteById noteMeta: " + noteMeta, new Object[0]);
                if (noteMeta != null) {
                    c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteUseCase", "NoteUseCase.deleteNoteById for id: ", str3, " failed, do nothing."), new Object[0]);
                } else {
                    c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteUseCase", "NoteUseCase.deleteNoteById for id: ", str3, " failed, do nothing."), new Object[0]);
                }
                return C32460OooOooO.f116667OooO00o;
            case 2:
                int i2 = this.f95890OooOoOO;
                C32446OooOOOo.OooO0O0(obj);
                r2 = i2;
                InterfaceC27309OooOoO interfaceC27309OooOoO22 = c27449o00O0OoO3.f96035OooO00o;
                this.f95890OooOoOO = r2;
                this.f95892OooOoo0 = 3;
                objOooOO0o = interfaceC27309OooOoO22.OooOO0o(str3, this);
                r22 = r2;
                if (objOooOO0o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                int i3 = this.f95890OooOoOO;
                C32446OooOOOo.OooO0O0(obj);
                objOooOO0o = obj;
                r22 = i3;
                noteContent = (NoteContent) objOooOO0o;
                r25 = r22;
                if (noteContent == null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 4:
                int i4 = this.f95890OooOoOO;
                pdfInfo = this.f95888OooOoO;
                String str4 = this.f95889OooOoO0;
                C27449o00O0OoO c27449o00O0OoO4 = this.f95886OooOo;
                NoteContent noteContent6 = (NoteContent) this.f95887OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                noteContent2 = noteContent6;
                c27449o00O0OoO = c27449o00O0OoO4;
                str = str4;
                objOooO0OO = obj;
                r23 = i4;
                pdfInfo2 = (PdfInfo) objOooO0OO;
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("NoteUseCase");
                c20358OooO00o32.OooOO0O("deleteNoteById, DELETING pdf info: " + pdfInfo2, new Object[0]);
                if (pdfInfo2 == null) {
                }
                break;
            case 5:
                int i5 = this.f95890OooOoOO;
                pdfInfo = this.f95888OooOoO;
                str2 = this.f95889OooOoO0;
                c27449o00O0OoO2 = this.f95886OooOo;
                noteContent3 = (NoteContent) this.f95887OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                r24 = i5;
                c26427Oooo0O0 = c27449o00O0OoO2.f96042OooO0oo;
                id = pdfInfo.getId();
                this.f95887OooOo0o = noteContent3;
                this.f95886OooOo = null;
                this.f95889OooOoO0 = null;
                this.f95888OooOoO = null;
                this.f95890OooOoOO = r24;
                this.f95892OooOoo0 = 6;
                if (c26427Oooo0O0.OooO0O0(id, str2, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                int i6 = this.f95890OooOoOO;
                noteContent4 = (NoteContent) this.f95887OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                r26 = i6;
                noteContent = noteContent4;
                r25 = r26;
                interfaceC27309OooOoO = c27449o00O0OoO3.f96035OooO00o;
                this.f95887OooOo0o = noteContent;
                this.f95886OooOo = null;
                this.f95889OooOoO0 = null;
                this.f95888OooOoO = null;
                this.f95890OooOoOO = r25;
                this.f95892OooOoo0 = 7;
                if (interfaceC27309OooOoO.OooO(str3, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 7:
                int i7 = this.f95890OooOoOO;
                NoteContent noteContent7 = (NoteContent) this.f95887OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                noteContent5 = noteContent7;
                r1 = i7;
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new OooO00o(noteContent5, this.f95891OooOoo, this.f95893OooOooO, r1 == 0, null), 3);
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o22, "NoteUseCase", "NoteUseCase.deleteNoteById for id: ", str3, " completed."), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
