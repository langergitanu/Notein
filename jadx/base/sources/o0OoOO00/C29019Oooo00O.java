package o0OoOO00;

import android.net.Uri;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27562o00oOo00;
import o0OOo0o.C27570o00oOoo0;
import oO00ooO.C32443OooOOO;
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
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoOO00.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageViewModel$insertPdfPage$2", m80623f = "AddPageViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_1, StyleIdentifier.LIST_TABLE_4_ACCENT_1, StyleIdentifier.LIST_TABLE_3_ACCENT_3, StyleIdentifier.LIST_TABLE_4_ACCENT_3}, m80625m = "invokeSuspend")
public final class C29019Oooo00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f102809OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f102810OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f102811OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f102812OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.addpage.OooO0OO f102813OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ Uri f102814OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f102815OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f102816OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29019Oooo00O(com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO, int i, Uri uri, String str, Continuation<? super C29019Oooo00O> continuation) {
        super(2, continuation);
        this.f102813OooOoOO = oooO0OO;
        this.f102815OooOoo0 = i;
        this.f102814OooOoo = uri;
        this.f102816OooOooO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29019Oooo00O(this.f102813OooOoOO, this.f102815OooOoo0, this.f102814OooOoo, this.f102816OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C29019Oooo00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0128, code lost:
    
        if (r8.OooO0OO(r5, r3, r2 + 1, r33) != r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8 A[LOOP:0: B:27:0x00e2->B:29:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0o;
        PaperSpec paperSpec;
        Object objOooOoO0;
        PdfPaperTheme pdfPaperTheme;
        Iterator<T> it;
        PdfInfo pdfInfo;
        String id;
        NoteContent noteContent;
        int i;
        Page page;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f102811OooOoO;
        com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO = this.f102813OooOoOO;
        C27449o00O0OoO c27449o00O0OoO = oooO0OO.f73852OooO0Oo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f102811OooOoO = 1;
            Uri uri = this.f102814OooOoo;
            C27570o00oOoo0 c27570o00oOoo0 = oooO0OO.f73854OooO0o0;
            c27570o00oOoo0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27562o00oOo00(c27570o00oOoo0, uri, this.f102815OooOoo0, this.f102816OooOooO, null, null), this);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o = obj;
        } else {
            if (i2 == 2) {
                paperSpec = (PaperSpec) this.f102809OooOo;
                PdfPaperTheme pdfPaperTheme2 = (PdfPaperTheme) this.f102810OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                pdfPaperTheme = pdfPaperTheme2;
                objOooOoO0 = obj;
                PaperSpec paperSpec2 = paperSpec;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooOoO0);
                NoteContent noteContent2 = (NoteContent) objOooOoO0;
                Page page2 = new Page(C24761OooO.OooO00o("toString(...)"), noteContent2.getId(), paperSpec2, pdfPaperTheme.getOrientation(), pdfPaperTheme, null, null, "", false, 2, 0L, 0L, null, null, 0, false, null, null, null, 523616, null);
                List<Page> pages = noteContent2.getPages();
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
                it = pages.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Page) it.next()).getId());
                }
                int iIndexOf = arrayList.indexOf(oooO0OO.f73861OooOOO0.getValue());
                pdfInfo = pdfPaperTheme.getPdfInfo();
                id = noteContent2.getId();
                this.f102810OooOo0o = noteContent2;
                this.f102809OooOo = page2;
                this.f102812OooOoO0 = iIndexOf;
                this.f102811OooOoO = 3;
                if (oooO0OO.f73857OooOO0.OooO00o(pdfInfo, id, this) != enumC32485OooO00o) {
                    noteContent = noteContent2;
                    i = iIndexOf;
                    page = page2;
                    this.f102810OooOo0o = null;
                    this.f102809OooOo = null;
                    this.f102811OooOoO = 4;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return Boolean.TRUE;
            }
            i = this.f102812OooOoO0;
            page = (Page) this.f102809OooOo;
            noteContent = (NoteContent) this.f102810OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            this.f102810OooOo0o = null;
            this.f102809OooOo = null;
            this.f102811OooOoO = 4;
        }
        C32443OooOOO c32443OooOOO = (C32443OooOOO) objOooO0o;
        if (c32443OooOOO == null) {
            return Boolean.FALSE;
        }
        PdfPaperTheme pdfPaperTheme3 = (PdfPaperTheme) c32443OooOOO.f116638OooOo0o;
        paperSpec = (PaperSpec) c32443OooOOO.f116637OooOo;
        String str = (String) oooO0OO.f73859OooOO0o.getValue();
        this.f102810OooOo0o = pdfPaperTheme3;
        this.f102809OooOo = paperSpec;
        this.f102811OooOoO = 2;
        objOooOoO0 = c27449o00O0OoO.OooOoO0(str, this);
        if (objOooOoO0 != enumC32485OooO00o) {
            pdfPaperTheme = pdfPaperTheme3;
            PaperSpec paperSpec22 = paperSpec;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooOoO0);
            NoteContent noteContent22 = (NoteContent) objOooOoO0;
            Page page22 = new Page(C24761OooO.OooO00o("toString(...)"), noteContent22.getId(), paperSpec22, pdfPaperTheme.getOrientation(), pdfPaperTheme, null, null, "", false, 2, 0L, 0L, null, null, 0, false, null, null, null, 523616, null);
            List<Page> pages2 = noteContent22.getPages();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(pages2, 10));
            it = pages2.iterator();
            while (it.hasNext()) {
            }
            int iIndexOf2 = arrayList2.indexOf(oooO0OO.f73861OooOOO0.getValue());
            pdfInfo = pdfPaperTheme.getPdfInfo();
            id = noteContent22.getId();
            this.f102810OooOo0o = noteContent22;
            this.f102809OooOo = page22;
            this.f102812OooOoO0 = iIndexOf2;
            this.f102811OooOoO = 3;
            if (oooO0OO.f73857OooOO0.OooO00o(pdfInfo, id, this) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
