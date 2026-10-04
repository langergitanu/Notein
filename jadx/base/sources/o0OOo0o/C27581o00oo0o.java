package o0OOo0o;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26681o00o0oOO;
import o0OOO0OO.C27020OooOoO0;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00oo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.TnUseCase$safeCheckNoteContentTn$2", m80623f = "TnUseCase.kt", m80624l = {170, 173, 175}, m80625m = "invokeSuspend")
public final class C27581o00oo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Page f96816OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f96817OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ NoteContent f96818OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f96819OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27585o00ooO0 f96820OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27581o00oo0o(NoteContent noteContent, C27585o00ooO0 c27585o00ooO0, Continuation<? super C27581o00oo0o> continuation) {
        super(2, continuation);
        this.f96818OooOoO = noteContent;
        this.f96820OooOoOO = c27585o00ooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27581o00oo0o(this.f96818OooOoO, this.f96820OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27581o00oo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9 A[SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<Page> pages;
        Page page;
        String id;
        Page page2;
        String str;
        Iterator it;
        Object next;
        Page page3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96819OooOoO0;
        C27585o00ooO0 c27585o00ooO0 = this.f96820OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteContent noteContent = this.f96818OooOoO;
            if (noteContent != null && (pages = noteContent.getPages()) != null && (page = (Page) oOo000Oo.OooOo.Oooo(pages)) != null && (id = page.getId()) != null) {
                C27020OooOoO0 c27020OooOoO0 = c27585o00ooO0.f96840OooO0oO;
                String id2 = noteContent.getId();
                this.f96817OooOo0o = id;
                this.f96819OooOoO0 = 1;
                obj = c27020OooOoO0.OooO0Oo(id, id2, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.f96817OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                it = ((List) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Page) next).getId(), str)) {
                        break;
                    }
                }
                page3 = (Page) next;
                if (page3 != null) {
                    return page3.getTnPath();
                }
                return null;
            }
            Page page4 = this.f96816OooOo;
            String str2 = this.f96817OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            page2 = page4;
            id = str2;
            if (!((Boolean) obj).booleanValue()) {
                return page2.getTnPath();
            }
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(page2);
            this.f96817OooOo0o = id;
            this.f96816OooOo = null;
            this.f96819OooOoO0 = 3;
            obj = c27585o00ooO0.OooO0O0(listOooO0oO, true, this);
            if (obj != enumC32485OooO00o) {
                str = id;
                it = ((List) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                page3 = (Page) next;
                if (page3 != null) {
                }
                return null;
            }
            return enumC32485OooO00o;
        }
        id = this.f96817OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Page page5 = (Page) obj;
        if (page5 != null) {
            C26681o00o0oOO c26681o00o0oOO = c27585o00ooO0.f96846OooOOO0;
            String tnPath = page5.getTnPath();
            this.f96817OooOo0o = id;
            this.f96816OooOo = page5;
            this.f96819OooOoO0 = 2;
            Boolean boolValueOf = Boolean.valueOf(C31190OooO0oo.OooOOoo(tnPath));
            if (boolValueOf != enumC32485OooO00o) {
                page2 = page5;
                obj = boolValueOf;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
            return enumC32485OooO00o;
        }
        return null;
    }
}
