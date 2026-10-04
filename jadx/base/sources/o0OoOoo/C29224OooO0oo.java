package o0OoOoo;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OoOoo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29224OooO0oo<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f103620OooOo0o;

    /* JADX INFO: renamed from: o0OoOoo.OooO0oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkViewModel$currentPage$lambda$2$$inlined$map$1$2", m80623f = "HyperLinkViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f103621OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f103622OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f103622OooOo0o = obj;
            this.f103621OooOo |= Integer.MIN_VALUE;
            return C29224OooO0oo.this.emit(null, this);
        }
    }

    public C29224OooO0oo(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f103620OooOo0o = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f103621OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f103621OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f103622OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f103621OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            NoteContent noteContent = (NoteContent) obj;
            C32443OooOOO c32443OooOOO = null;
            if (noteContent != null) {
                List<Page> pages = noteContent.getPages();
                int savedPageIndex = noteContent.getSavedPageIndex();
                Page page = (Page) OooOo.OoooO00(savedPageIndex, pages);
                if (page != null) {
                    c32443OooOOO = new C32443OooOOO(page.getId(), new Integer(savedPageIndex));
                }
            }
            oooO00o.f103621OooOo = 1;
            if (this.f103620OooOo0o.emit(c32443OooOOO, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
