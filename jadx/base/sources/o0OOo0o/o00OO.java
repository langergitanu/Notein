package o0OOo0o;

import Oooo0.C20855OooooOO;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27020OooOoO0;
import o0OOo0Oo.InterfaceC27309OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$movePageToIndex$2", m80623f = "NoteUseCase.kt", m80624l = {1180, 1181, 1194, 1196}, m80625m = "invokeSuspend")
public final class o00OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f96126OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f96127OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96128OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f96129OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96130OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f96131OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f96132OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ int f96133OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(C27449o00O0OoO c27449o00O0OoO, String str, String str2, int i, Continuation<? super o00OO> continuation) {
        super(2, continuation);
        this.f96130OooOoOO = c27449o00O0OoO;
        this.f96132OooOoo0 = str;
        this.f96131OooOoo = str2;
        this.f96133OooOooO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00OO(this.f96130OooOoOO, this.f96132OooOoo0, this.f96131OooOoo, this.f96133OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Object> continuation) {
        return ((o00OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
    
        if (r10.OoooOoO(r9, true, r31) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108 A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOO0o;
        NoteContent noteContent;
        Object objOooO0Oo;
        NoteContent noteContent2;
        int i;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f96128OooOoO;
        String str = this.f96131OooOoo;
        String str2 = this.f96132OooOoo0;
        C27449o00O0OoO c27449o00O0OoO = this.f96130OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO.f96035OooO00o;
            this.f96128OooOoO = 1;
            objOooOO0o = interfaceC27309OooOoO.OooOO0o(str2, this);
            if (objOooOO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                i = this.f96129OooOoO0;
                str2 = this.f96126OooOo;
                c27449o00O0OoO = (C27449o00O0OoO) this.f96127OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (i == 0) {
                    this.f96127OooOo0o = null;
                    this.f96126OooOo = null;
                    this.f96128OooOoO = 4;
                }
                return C32460OooOooO.f116667OooO00o;
            }
            noteContent = (NoteContent) this.f96127OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0Oo = obj;
            noteContent2 = noteContent;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooO0Oo);
            Page page = (Page) objOooO0Oo;
            if (noteContent2 != null) {
                return null;
            }
            List<Page> pages = noteContent2.getPages();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : pages) {
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((Page) obj2).getId(), str)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(arrayList);
            int size = arrayListO0ooOoO.size();
            int i3 = this.f96133OooOooO;
            if (i3 > size || i3 < 0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteUseCase");
                c20358OooO00o.OooO0OO(C20855OooooOO.OooO0OO(i3, arrayListO0ooOoO.size(), "Unable move page. IndexOutOfBoundsException: Index ", ", Size: "), new Object[0]);
                return Boolean.FALSE;
            }
            arrayListO0ooOoO.add(i3, page);
            NoteContent noteContentCopy = noteContent2.copy((24571 & 1) != 0 ? noteContent2.id : null, (24571 & 2) != 0 ? noteContent2.defaultPage : null, (24571 & 4) != 0 ? noteContent2.pages : arrayListO0ooOoO, (24571 & 8) != 0 ? noteContent2.pageLayerIds : null, (24571 & 16) != 0 ? noteContent2.outlines : null, (24571 & 32) != 0 ? noteContent2.pdfInfo : null, (24571 & 64) != 0 ? noteContent2.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent2.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent2.zoom : 0.0f, (24571 & 512) != 0 ? noteContent2.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent2.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent2.unboundedNote : false, (24571 & 4096) != 0 ? noteContent2.creationTime : 0L, (24571 & 8192) != 0 ? noteContent2.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent2.extras : null);
            this.f96127OooOo0o = c27449o00O0OoO;
            this.f96126OooOo = str2;
            this.f96129OooOoO0 = i3;
            this.f96128OooOoO = 3;
            if (c27449o00O0OoO.OoooOOo(noteContentCopy, this) != enumC32485OooO00o) {
                i = i3;
                if (i == 0) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooOO0o = obj;
        noteContent = (NoteContent) objOooOO0o;
        C27020OooOoO0 c27020OooOoO0 = c27449o00O0OoO.f96039OooO0o;
        this.f96127OooOo0o = noteContent;
        this.f96128OooOoO = 2;
        objOooO0Oo = c27020OooOoO0.OooO0Oo(str, str2, this);
        if (objOooO0Oo != enumC32485OooO00o) {
            noteContent2 = noteContent;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooO0Oo);
            Page page2 = (Page) objOooO0Oo;
            if (noteContent2 != null) {
            }
        }
        return enumC32485OooO00o;
    }
}
