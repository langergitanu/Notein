package o0OOo0o;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OO.C26427Oooo0O0;
import o0OOO0OO.C27020OooOoO0;
import o0OOo0Oo.InterfaceC27309OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o0OOo0o.o00oo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.TnUseCase$createNoteCoverTnAndGetCoverPage$2", m80623f = "TnUseCase.kt", m80624l = {65, 67, 73, 74}, m80625m = "invokeSuspend")
public final class C27576o00oo00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Page>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public NoteContent f96782OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f96783OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27585o00ooO0 f96784OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f96785OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f96786OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27576o00oo00O(C27585o00ooO0 c27585o00ooO0, String str, Continuation<? super C27576o00oo00O> continuation) {
        super(2, continuation);
        this.f96784OooOoO = c27585o00ooO0;
        this.f96786OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27576o00oo00O(this.f96784OooOoO, this.f96786OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Page> continuation) {
        return ((C27576o00oo00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
    
        if (r12 != r0) goto L48;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NoteContent noteContent;
        String id;
        NoteContent noteContent2;
        String str;
        List<Page> pages;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96785OooOoO0;
        String str2 = this.f96786OooOoOO;
        C27585o00ooO0 c27585o00ooO0 = this.f96784OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27309OooOoO interfaceC27309OooOoO = c27585o00ooO0.f96844OooOO0o;
            this.f96785OooOoO0 = 1;
            obj = interfaceC27309OooOoO.OooOO0o(str2, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i == 2) {
                noteContent = this.f96782OooOo;
                noteContent2 = (NoteContent) this.f96783OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                noteContent.setPdfInfo((PdfInfo) obj);
                noteContent = noteContent2;
                if (noteContent != null || (pages = noteContent.getPages()) == null) {
                    str = null;
                } else {
                    List<Page> list = pages;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Page) it.next()).getId());
                    }
                    str = (String) oOo000Oo.OooOo.Oooo(arrayList);
                }
                if (str != null || str.length() == 0) {
                    return null;
                }
                Set setOooOO0 = C34449Oooo0oo.OooOO0(str);
                this.f96783OooOo0o = str;
                this.f96782OooOo = null;
                this.f96785OooOoO0 = 3;
                if (c27585o00ooO0.OooO00o(setOooOO0, str2, true, this) != enumC32485OooO00o) {
                    C27020OooOoO0 c27020OooOoO0 = c27585o00ooO0.f96840OooO0oO;
                    this.f96783OooOo0o = null;
                    this.f96785OooOoO0 = 4;
                    obj = c27020OooOoO0.OooO0Oo(str, str2, this);
                }
                return enumC32485OooO00o;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return (Page) obj;
            }
            str = (String) this.f96783OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C27020OooOoO0 c27020OooOoO02 = c27585o00ooO0.f96840OooO0oO;
            this.f96783OooOo0o = null;
            this.f96785OooOoO0 = 4;
            obj = c27020OooOoO02.OooO0Oo(str, str2, this);
        }
        noteContent = (NoteContent) obj;
        if (noteContent != null) {
            PdfInfo pdfInfo = noteContent.getPdfInfo();
            if (pdfInfo != null && (id = pdfInfo.getId()) != null) {
                C26427Oooo0O0 c26427Oooo0O0 = c27585o00ooO0.f96841OooO0oo;
                String id2 = noteContent.getId();
                this.f96783OooOo0o = noteContent;
                this.f96782OooOo = noteContent;
                this.f96785OooOoO0 = 2;
                obj = c26427Oooo0O0.OooO0OO(id, id2, this);
                if (obj != enumC32485OooO00o) {
                    noteContent2 = noteContent;
                    noteContent.setPdfInfo((PdfInfo) obj);
                    noteContent = noteContent2;
                }
            }
            return enumC32485OooO00o;
        }
        noteContent = null;
        if (noteContent != null) {
        }
        str = null;
        if (str != null) {
        }
        return null;
    }
}
