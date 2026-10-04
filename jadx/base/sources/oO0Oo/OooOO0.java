package oO0Oo;

import android.graphics.Bitmap;
import androidx.core.os.BundleKt;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.ocr.AiOcrTextPage;
import com.orion.notein.domain.models.p605ai.ImageToHtmlResult;
import com.orion.notein.domain.models.page.Page;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27545o00o0oo0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.AiOcrRecognizer$updateTextPageWithNotePage$2", m80623f = "AiOcrRecognizer.kt", m80624l = {578, 580, 587, 594, 619}, m80625m = "invokeSuspend")
public final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public NoteMeta f120019OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f120020OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33173OooOO0o f120021OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f120022OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f120023OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f120024OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f120025OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f120026OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f120027OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ String f120028Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(C33173OooOO0o c33173OooOO0o, String str, int i, String str2, String str3, String str4, String str5, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f120021OooOoO = c33173OooOO0o;
        this.f120023OooOoOO = str;
        this.f120025OooOoo0 = i;
        this.f120024OooOoo = str2;
        this.f120026OooOooO = str3;
        this.f120027OooOooo = str4;
        this.f120028Oooo000 = str5;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0(this.f120021OooOoO, this.f120023OooOoOO, this.f120025OooOoo0, this.f120024OooOoo, this.f120026OooOooO, this.f120027OooOooo, this.f120028Oooo000, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0167, code lost:
    
        if (oO0Oo.C33173OooOO0o.OooO0Oo(r7, r1, r19.f120028Oooo000, r19) == r6) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOoO0;
        NoteContent noteContent;
        Object objOooOoOO;
        NoteMeta noteMeta;
        Serializable serializableOooO0oO;
        NoteContent noteContent2;
        List list;
        Iterator it;
        Object objOooO0oO;
        C27174OooO0O0 c27174OooO0O0;
        String errorCode;
        String id;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120022OooOoO0;
        String str = this.f120023OooOoOO;
        C33173OooOO0o c33173OooOO0o = this.f120021OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            kotlin.jvm.internal.OooOOO0.OooO0o(UUID.randomUUID().toString(), "toString(...)");
            C27449o00O0OoO c27449o00O0OoO = c33173OooOO0o.f120044OooO0o;
            this.f120022OooOoO0 = 1;
            objOooOoO0 = c27449o00O0OoO.OooOoO0(str, this);
            if (objOooOoO0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i == 2) {
                noteContent = (NoteContent) this.f120020OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOoOO = obj;
                NoteContent noteContent3 = noteContent;
                noteMeta = (NoteMeta) objOooOoOO;
                if (noteMeta != null) {
                    int i2 = this.f120025OooOoo0;
                    C27545o00o0oo0 c27545o00o0oo0 = c33173OooOO0o.f120040OooO00o;
                    this.f120020OooOo0o = noteContent3;
                    this.f120019OooOo = noteMeta;
                    this.f120022OooOoO0 = 3;
                    int i3 = C27545o00o0oo0.f96574OooOO0o;
                    serializableOooO0oO = c27545o00o0oo0.OooO0oO(str, i2, 1 + i2, 5, this);
                    if (serializableOooO0oO != enumC32485OooO00o) {
                        noteContent2 = noteContent3;
                        List list2 = (List) serializableOooO0oO;
                        list = list2;
                        if (!(list instanceof Collection)) {
                        }
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        return "500007";
                    }
                    return enumC32485OooO00o;
                }
                return "599999";
            }
            if (i == 3) {
                NoteMeta noteMeta2 = this.f120019OooOo;
                noteContent2 = (NoteContent) this.f120020OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                noteMeta = noteMeta2;
                serializableOooO0oO = obj;
                List list22 = (List) serializableOooO0oO;
                list = list22;
                if (!(list instanceof Collection) && list.isEmpty()) {
                    return "500007";
                }
                it = list.iterator();
                while (it.hasNext()) {
                    if (((Bitmap) it.next()) != null) {
                        this.f120020OooOo0o = noteContent2;
                        this.f120019OooOo = noteMeta;
                        this.f120022OooOoO0 = 4;
                        objOooO0oO = c33173OooOO0o.OooO0oO(this.f120024OooOoo, this.f120026OooOooO, list22, this);
                        if (objOooO0oO != enumC32485OooO00o) {
                            c27174OooO0O0 = (C27174OooO0O0) objOooO0oO;
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                                errorCode = c27174OooO0O0.getErrorCode();
                                if (errorCode == null) {
                                }
                            }
                            return "599999";
                        }
                        return enumC32485OooO00o;
                    }
                }
                return "500007";
            }
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27174OooO0O0 = (C27174OooO0O0) this.f120020OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Iterable iterable = (Iterable) c27174OooO0O0.OooO0O0();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ImageToHtmlResult) it2.next()).getErrorCode(), "500005")) {
                            return "500005";
                        }
                    }
                }
                return "0";
            }
            NoteMeta noteMeta3 = this.f120019OooOo;
            noteContent2 = (NoteContent) this.f120020OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            noteMeta = noteMeta3;
            objOooO0oO = obj;
            c27174OooO0O0 = (C27174OooO0O0) objOooO0oO;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0") || c27174OooO0O0.OooO0O0() == null) {
                errorCode = c27174OooO0O0.getErrorCode();
                if (errorCode == null) {
                    return errorCode;
                }
            } else {
                ImageToHtmlResult imageToHtmlResult = (ImageToHtmlResult) oOo000Oo.OooOo.Oooo((List) c27174OooO0O0.OooO0O0());
                if (imageToHtmlResult != null) {
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(imageToHtmlResult.getErrorCode(), "0") && imageToHtmlResult.getHtml().length() <= 0) {
                        return imageToHtmlResult.getErrorCode();
                    }
                    Page page = (Page) oOo000Oo.OooOo.OoooO00(this.f120025OooOoo0, noteContent2.getPages());
                    if (page == null || (id = page.getId()) == null) {
                        id = "";
                    }
                    AiOcrTextPage aiOcrTextPageOooO0o = C33173OooOO0o.OooO0o(c33173OooOO0o.f120046OooO0oO, this.f120027OooOooo, 3, noteMeta.getTitle(), imageToHtmlResult.getHtml(), BundleKt.bundleOf(new C32443OooOOO("note_page_id", id)));
                    this.f120020OooOo0o = c27174OooO0O0;
                    this.f120019OooOo = null;
                    this.f120022OooOoO0 = 5;
                }
            }
            return "599999";
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooOoO0 = obj;
        noteContent = (NoteContent) objOooOoO0;
        if (noteContent != null) {
            C27449o00O0OoO c27449o00O0OoO2 = c33173OooOO0o.f120044OooO0o;
            this.f120020OooOo0o = noteContent;
            this.f120022OooOoO0 = 2;
            objOooOoOO = c27449o00O0OoO2.OooOoOO(str, this);
            if (objOooOoOO != enumC32485OooO00o) {
                NoteContent noteContent32 = noteContent;
                noteMeta = (NoteMeta) objOooOoOO;
                if (noteMeta != null) {
                }
            }
            return enumC32485OooO00o;
        }
        return "599999";
    }
}
