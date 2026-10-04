package o0Ooo00;

import Oooo0oO.o0Oo0oo;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.o000O00;
import o0OO.C26410OooOOOo;
import o0OOo0o.C27447o00O0Oo;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27585o00ooO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.C33799OooOO0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0Ooo00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0Ooo00/OooO0Oo;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C29327OooO0Oo extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33769Ooooo0o f104018OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27449o00O0OoO f104019OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00000OO f104020OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27585o00ooO0 f104021OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33781o00o0O f104022OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33781o00o0O f104023OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33769Ooooo0o f104024OooOO0;

    /* JADX INFO: renamed from: o0Ooo00.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.viewmodel.AerialViewPagesViewModel$pages$1", m80623f = "AerialViewPagesViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends Page>, String, Continuation<? super List<? extends TiledPagePreviewVO>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ String f104025OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ List f104026OooOo0o;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(List<? extends Page> list, String str, Continuation<? super List<? extends TiledPagePreviewVO>> continuation) {
            OooO00o oooO00o = new OooO00o(3, continuation);
            oooO00o.f104026OooOo0o = list;
            oooO00o.f104025OooOo = str;
            return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list = this.f104026OooOo0o;
            String str = this.f104025OooOo;
            if (list.isEmpty()) {
                return null;
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            int i = 0;
            for (Object obj2 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                Page page = (Page) obj2;
                C32443OooOOO<Integer, Integer> tnSize = page.getTnSize();
                arrayList.add(new TiledPagePreviewVO(page.getId(), i, page.getTnPath(), tnSize.f116638OooOo0o.intValue(), tnSize.f116637OooOo.intValue(), page.getPaperTheme() instanceof LocalResPaperTheme, page.getPaperOrientation(), false, page.getLastModificationTime(), true, OooOOO0.OooO0O0(page.getId(), str), false, OooOOO0.OooO0O0(page.getId(), str), page.getRotationDirection()));
                i = i2;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: o0Ooo00.OooO0Oo$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.viewmodel.AerialViewPagesViewModel$special$$inlined$flatMapLatest$1", m80623f = "AerialViewPagesViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super NoteMeta>, String, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f104027OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f104028OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C29327OooO0Oo f104029OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f104030OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Continuation continuation, C29327OooO0Oo c29327OooO0Oo) {
            super(3, continuation);
            this.f104029OooOoO = c29327OooO0Oo;
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super NoteMeta> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(continuation, this.f104029OooOoO);
            oooO0O0.f104027OooOo = interfaceC33723OooO0oO;
            oooO0O0.f104030OooOoO0 = str;
            return oooO0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f104028OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f104027OooOo;
                InterfaceC33721OooO0o<NoteMeta> interfaceC33721OooO0oOooOoO = this.f104029OooOoO.f104019OooO0Oo.OooOoO((String) this.f104030OooOoO0);
                this.f104028OooOo0o = 1;
                C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
                Object objCollect = ((o000O00) interfaceC33721OooO0oOooOoO).collect(new C29326OooO0OO(interfaceC33723OooO0oO), this);
                if (objCollect != enumC32485OooO00o) {
                    objCollect = C32460OooOooO.f116667OooO00o;
                }
                if (objCollect != enumC32485OooO00o) {
                    objCollect = C32460OooOooO.f116667OooO00o;
                }
                if (objCollect == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo00.OooO0Oo$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.viewmodel.AerialViewPagesViewModel$special$$inlined$flatMapLatest$2", m80623f = "AerialViewPagesViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super NoteContent>, String, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f104031OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f104032OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C29327OooO0Oo f104033OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f104034OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Continuation continuation, C29327OooO0Oo c29327OooO0Oo) {
            super(3, continuation);
            this.f104033OooOoO = c29327OooO0Oo;
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super NoteContent> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
            OooO0OO oooO0OO = new OooO0OO(continuation, this.f104033OooOoO);
            oooO0OO.f104031OooOo = interfaceC33723OooO0oO;
            oooO0OO.f104034OooOoO0 = str;
            return oooO0OO.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f104032OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f104031OooOo;
                String noteId = (String) this.f104034OooOoO0;
                C27449o00O0OoO c27449o00O0OoO = this.f104033OooOoO.f104019OooO0Oo;
                c27449o00O0OoO.getClass();
                OooOOO0.OooO0oO(noteId, "noteId");
                C26410OooOOOo c26410OooOOOoOooO00o = c27449o00O0OoO.f96035OooO00o.OooO00o(noteId);
                this.f104032OooOo0o = 1;
                C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
                Object objCollect = c26410OooOOOoOooO00o.collect(new C27447o00O0Oo(new C29324OooO00o(interfaceC33723OooO0oO), c27449o00O0OoO), this);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    objCollect = C32460OooOooO.f116667OooO00o;
                }
                if (objCollect != enumC32485OooO00o) {
                    objCollect = C32460OooOooO.f116667OooO00o;
                }
                if (objCollect != enumC32485OooO00o) {
                    objCollect = C32460OooOooO.f116667OooO00o;
                }
                if (objCollect == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo00.OooO0Oo$OooO0Oo, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.viewmodel.AerialViewPagesViewModel$special$$inlined$flatMapLatest$3", m80623f = "AerialViewPagesViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
    public static final class C19983OooO0Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends Page>>, NoteContent, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f104035OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f104036OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C29327OooO0Oo f104037OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f104038OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19983OooO0Oo(Continuation continuation, C29327OooO0Oo c29327OooO0Oo) {
            super(3, continuation);
            this.f104037OooOoO = c29327OooO0Oo;
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends Page>> interfaceC33723OooO0oO, NoteContent noteContent, Continuation<? super C32460OooOooO> continuation) {
            C19983OooO0Oo c19983OooO0Oo = new C19983OooO0Oo(continuation, this.f104037OooOoO);
            c19983OooO0Oo.f104035OooOo = interfaceC33723OooO0oO;
            c19983OooO0Oo.f104038OooOoO0 = noteContent;
            return c19983OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f104036OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f104035OooOo;
                NoteContent noteContent = (NoteContent) this.f104038OooOoO0;
                List<Page> pages = noteContent.getPages();
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
                Iterator<T> it = pages.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Page) it.next()).getId());
                }
                InterfaceC33721OooO0o interfaceC33721OooO0oOooo00O = this.f104037OooOoO.f104019OooO0Oo.Oooo00O(noteContent.getId(), OooOo.o0OO00O(arrayList));
                this.f104036OooOo0o = 1;
                if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0oOooo00O, this) == enumC32485OooO00o) {
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

    public C29327OooO0Oo(C27449o00O0OoO c27449o00O0OoO, C27585o00ooO0 c27585o00ooO0) {
        this.f104019OooO0Oo = c27449o00O0OoO;
        this.f104021OooO0o0 = c27585o00ooO0;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o("");
        this.f104022OooO0oO = c33781o00o0OOooO00o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o("");
        this.f104023OooO0oo = c33781o00o0OOooO00o2;
        C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o, new OooO0O0(null, this));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        this.f104018OooO = C25252OooO0Oo.OooOoO0(c33799OooOO0OOooOoO, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), new NoteMeta(null, null, null, null, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524287, null));
        this.f104024OooOO0 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o, new OooO0OO(null, this)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), new NoteContent(null, null, null, null, null, null, 0, null, 0.0f, 0.0f, 0.0f, false, 0L, 0L, null, 32767, null)), new C19983OooO0Oo(null, this)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), C34434OooOoO.f123453OooOo0o), c33781o00o0OOooO00o2, new OooO00o(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("AerialViewPagesViewModel");
        c20358OooO00o.OooO0o0(o0Oo0oo.OooO0O0(hashCode(), "AerialViewPagesViewModel init, hash: ", "."), new Object[0]);
    }
}
