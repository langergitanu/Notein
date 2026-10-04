package o0OoOO00;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfPasswordException;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import o0OOo0o.C27489o00OoO0o;
import o0OOo0o.C27499o00Ooo0;
import o0OOo0o.o000OO;
import o0OOoo0o.C27859OooO0O0;
import o0OOoo0o.C27869OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoOO00.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageViewModel$insertPDFDoc$2", m80623f = "AddPageViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_5, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_5, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_6, 383, 384, 385}, m80625m = "invokeSuspend")
public final class C29017OooOooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f102792OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f102793OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ArrayList f102794OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public PdfInfo f102795OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f102796OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.addpage.OooO0OO f102797OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f102798OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ Uri f102799OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f102800OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29017OooOooo(com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO, Uri uri, String str, Continuation<? super C29017OooOooo> continuation) {
        super(2, continuation);
        this.f102797OooOoo = oooO0OO;
        this.f102799OooOooO = uri;
        this.f102800OooOooo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29017OooOooo(this.f102797OooOoo, this.f102799OooOooO, this.f102800OooOooo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>> continuation) {
        return ((C29017OooOooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x024d, code lost:
    
        if (r1.f73852OooO0Oo.OooO0Oo(r4, r3, r0 + 1, false, r21) != r6) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df A[Catch: all -> 0x00e4, Exception -> 0x00e7, PdfPasswordException -> 0x00e9, TRY_LEAVE, TryCatch #4 {PdfPasswordException -> 0x00e9, Exception -> 0x00e7, all -> 0x00e4, blocks: (B:26:0x00d3, B:28:0x00df), top: B:84:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc A[PHI: r13 r14
      0x00fc: PHI (r13v5 com.shockwave.pdfium.PdfDocument) = 
      (r13v3 com.shockwave.pdfium.PdfDocument)
      (r13v4 com.shockwave.pdfium.PdfDocument)
      (r13v9 com.shockwave.pdfium.PdfDocument)
     binds: [B:42:0x0114, B:44:0x0123, B:36:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r14v3 java.lang.Object) = (r14v0 java.lang.Object), (r14v1 java.lang.Object), (r14v5 java.lang.Object) binds: [B:42:0x0114, B:44:0x0123, B:36:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025f  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.shockwave.pdfium.PdfiumCore] */
    /* JADX WARN: Type inference failed for: r12v7, types: [com.shockwave.pdfium.PdfiumCore] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.content.Context, o0O0oooO.OooOoOO] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.shockwave.pdfium.PdfDocument] */
    /* JADX WARN: Type inference failed for: r2v6 */
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
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objOooOoO0;
        NoteContent noteContent;
        ?? pdfiumCore;
        ?? r13;
        PdfDocument pdfDocumentNewDocument;
        Object c27174OooO0O0;
        String str2;
        NoteContent noteContent2;
        C27174OooO0O0 c27174OooO0O02;
        Object objOooO0o;
        File file;
        PdfInfo pdfInfo;
        NoteContent noteContent3;
        int i;
        List list;
        String str3;
        PdfInfo pdfInfo2;
        NoteContent noteContent4;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f102798OooOoo0;
        com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO = this.f102797OooOoo;
        ?? r2 = 0;
        String str4 = this.f102800OooOooo;
        Uri uri = this.f102799OooOooO;
        C27499o00Ooo0 c27499o00Ooo0 = oooO0OO.f73853OooO0o;
        switch (i2) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                str = (String) oooO0OO.f73859OooOO0o.getValue();
                this.f102793OooOo0o = str;
                this.f102798OooOoo0 = 1;
                objOooOoO0 = oooO0OO.f73852OooO0Oo.OooOoO0(str, this);
                if (objOooOoO0 != enumC32485OooO00o) {
                    noteContent = (NoteContent) objOooOoO0;
                    if (str.length() == 0 || noteContent == null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("AddPageViewModel");
                        c20358OooO00o.OooO0o0("insertPDFDoc, targetNoteId: " + str + ", content: " + (noteContent != null), new Object[0]);
                        return new C27174OooO0O0(false, null, null, null, 14);
                    }
                    this.f102793OooOo0o = str;
                    this.f102792OooOo = noteContent;
                    this.f102798OooOoo0 = 2;
                    c27499o00Ooo0.getClass();
                    r13 = c27499o00Ooo0.f96374OooO00o;
                    pdfiumCore = new PdfiumCore((Context) r13);
                    try {
                        try {
                            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = r13.getContentResolver().openFileDescriptor(uri, "r");
                            pdfDocumentNewDocument = parcelFileDescriptorOpenFileDescriptor == null ? pdfiumCore.newDocument(parcelFileDescriptorOpenFileDescriptor, str4) : null;
                            try {
                                c27174OooO0O0 = new C27174OooO0O0(true, Boolean.TRUE, null, null, 12);
                            } catch (PdfPasswordException unused) {
                                c27174OooO0O0 = new C27174OooO0O0(false, null, "00001", null, 10);
                                if (pdfDocumentNewDocument != null) {
                                }
                                if (c27174OooO0O0 != enumC32485OooO00o) {
                                }
                                return enumC32485OooO00o;
                            } catch (Exception unused2) {
                                c27174OooO0O0 = new C27174OooO0O0(false, null, "00010", null, 10);
                                if (pdfDocumentNewDocument != null) {
                                }
                                if (c27174OooO0O0 != enumC32485OooO00o) {
                                }
                                return enumC32485OooO00o;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r2 = r13;
                            if (r2 != 0) {
                                pdfiumCore.closeDocument(r2);
                            }
                            throw th;
                        }
                    } catch (PdfPasswordException unused3) {
                        pdfDocumentNewDocument = null;
                    } catch (Exception unused4) {
                        pdfDocumentNewDocument = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r2 != 0) {
                        }
                        throw th;
                    }
                    if (pdfDocumentNewDocument != null) {
                        pdfiumCore.closeDocument(pdfDocumentNewDocument);
                    }
                    if (c27174OooO0O0 != enumC32485OooO00o) {
                        str2 = str;
                        noteContent2 = noteContent;
                        c27174OooO0O02 = (C27174OooO0O0) c27174OooO0O0;
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("AddPageViewModel");
                        c20358OooO00o2.OooO0o0("insertPDFDoc, pdfUri: " + uri + ", password: " + str4 + ", isPasswordRightForPDF: " + c27174OooO0O02, new Object[0]);
                        if (c27174OooO0O02.f94862OooO00o) {
                            return c27174OooO0O02;
                        }
                        this.f102793OooOo0o = str2;
                        this.f102792OooOo = noteContent2;
                        this.f102798OooOoo0 = 3;
                        c27499o00Ooo0.getClass();
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27489o00OoO0o(uri, null, c27499o00Ooo0), this);
                        if (objOooO0o != enumC32485OooO00o) {
                            file = (File) objOooO0o;
                            if (file != null) {
                                r13 = 0;
                                pdfiumCore = new C27174OooO0O0(false, null, "00002", null, 10);
                                return pdfiumCore;
                            }
                            String absolutePath = file.getAbsolutePath();
                            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                            pdfInfo = new PdfInfo(null, absolutePath, null, this.f102800OooOooo, 5, null);
                            o000OO o000oo2 = oooO0OO.f73855OooO0oO;
                            ArrayList arrayListOooOO0o = o000oo2.OooOO0o(pdfInfo, str2, false);
                            ArrayList arrayListOooOO0O = o000oo2.OooOO0O(pdfInfo, arrayListOooOO0o, str2);
                            C34406OooO00o.f123390OooO00o.OooO00o(C21532OooOOo.OooO0OO(arrayListOooOO0o.size(), "pages size: "), new Object[0]);
                            List<Page> pages = noteContent2.getPages();
                            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
                            Iterator it = pages.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((Page) it.next()).getId());
                            }
                            int iIndexOf = arrayList.indexOf(oooO0OO.f73861OooOOO0.getValue());
                            this.f102793OooOo0o = str2;
                            this.f102792OooOo = noteContent2;
                            this.f102795OooOoO0 = pdfInfo;
                            this.f102794OooOoO = arrayListOooOO0o;
                            this.f102796OooOoOO = iIndexOf;
                            this.f102798OooOoo0 = 4;
                            C27869OooOOO c27869OooOOO = oooO0OO.f73858OooOO0O;
                            c27869OooOOO.getClass();
                            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                            Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27859OooO0O0(c27869OooOOO, arrayListOooOO0O, str2, null), this);
                            if (objOooO0o2 != EnumC32485OooO00o.f116726OooOo0o) {
                                objOooO0o2 = C32460OooOooO.f116667OooO00o;
                            }
                            if (objOooO0o2 != enumC32485OooO00o) {
                                noteContent3 = noteContent2;
                                i = iIndexOf;
                                list = arrayListOooOO0o;
                                str3 = str2;
                                pdfInfo2 = pdfInfo;
                                this.f102793OooOo0o = noteContent3;
                                this.f102792OooOo = list;
                                this.f102795OooOoO0 = null;
                                this.f102794OooOoO = null;
                                this.f102796OooOoOO = i;
                                this.f102798OooOoo0 = 5;
                                if (oooO0OO.f73857OooOO0.OooO00o(pdfInfo2, str3, this) != enumC32485OooO00o) {
                                    noteContent4 = noteContent3;
                                    this.f102793OooOo0o = null;
                                    this.f102792OooOo = null;
                                    this.f102798OooOoo0 = 6;
                                }
                            }
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                str = (String) this.f102793OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOoO0 = obj;
                noteContent = (NoteContent) objOooOoO0;
                if (str.length() == 0) {
                    this.f102793OooOo0o = str;
                    this.f102792OooOo = noteContent;
                    this.f102798OooOoo0 = 2;
                    c27499o00Ooo0.getClass();
                    r13 = c27499o00Ooo0.f96374OooO00o;
                    pdfiumCore = new PdfiumCore((Context) r13);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = r13.getContentResolver().openFileDescriptor(uri, "r");
                    if (parcelFileDescriptorOpenFileDescriptor2 == null) {
                    }
                    c27174OooO0O0 = new C27174OooO0O0(true, Boolean.TRUE, null, null, 12);
                    if (pdfDocumentNewDocument != null) {
                    }
                    if (c27174OooO0O0 != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("AddPageViewModel");
                if (noteContent != null) {
                }
                c20358OooO00o3.OooO0o0("insertPDFDoc, targetNoteId: " + str + ", content: " + (noteContent != null), new Object[0]);
                return new C27174OooO0O0(false, null, null, null, 14);
            case 2:
                noteContent2 = (NoteContent) this.f102792OooOo;
                str2 = (String) this.f102793OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27174OooO0O0 = obj;
                c27174OooO0O02 = (C27174OooO0O0) c27174OooO0O0;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("AddPageViewModel");
                c20358OooO00o22.OooO0o0("insertPDFDoc, pdfUri: " + uri + ", password: " + str4 + ", isPasswordRightForPDF: " + c27174OooO0O02, new Object[0]);
                if (c27174OooO0O02.f94862OooO00o) {
                }
                break;
            case 3:
                noteContent2 = (NoteContent) this.f102792OooOo;
                String str5 = (String) this.f102793OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str2 = str5;
                objOooO0o = obj;
                file = (File) objOooO0o;
                if (file != null) {
                }
                break;
            case 4:
                i = this.f102796OooOoOO;
                list = this.f102794OooOoO;
                PdfInfo pdfInfo3 = this.f102795OooOoO0;
                noteContent3 = (NoteContent) this.f102792OooOo;
                str3 = (String) this.f102793OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                pdfInfo2 = pdfInfo3;
                this.f102793OooOo0o = noteContent3;
                this.f102792OooOo = list;
                this.f102795OooOoO0 = null;
                this.f102794OooOoO = null;
                this.f102796OooOoOO = i;
                this.f102798OooOoo0 = 5;
                if (oooO0OO.f73857OooOO0.OooO00o(pdfInfo2, str3, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                i = this.f102796OooOoOO;
                list = (List) this.f102792OooOo;
                noteContent4 = (NoteContent) this.f102793OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f102793OooOo0o = null;
                this.f102792OooOo = null;
                this.f102798OooOoo0 = 6;
                break;
            case 6:
                C32446OooOOOo.OooO0O0(obj);
                pdfiumCore = new C27174OooO0O0(true, null, null, null, 14);
                r13 = pdfInfo;
                return pdfiumCore;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
