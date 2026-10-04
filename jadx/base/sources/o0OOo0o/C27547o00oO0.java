package o0OOo0o;

import android.graphics.Point;
import android.graphics.RectF;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageGrid;
import com.orion.notein.domain.models.search.TextSearchResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27009OooO0oO;
import o0OOO0OO.C27015OooOOoo;
import o0OOo0o.C27545o00o0oo0;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31192OooOOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOo0o.o00oO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.TextRecognitionAndSearchUseCase$searchTextInNote$2", m80623f = "TextRecognitionAndSearchUseCase.kt", m80624l = {128, 131, 141, 155}, m80625m = "invokeSuspend")
public final class C27547o00oO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super InterfaceC33721OooO0o<? extends List<? extends TextSearchResult>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Note f96597OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f96598OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96599OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f96600OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f96601OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f96602OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27545o00o0oo0 f96603OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27547o00oO0(String str, C27545o00o0oo0 c27545o00o0oo0, String str2, Continuation<? super C27547o00oO0> continuation) {
        super(2, continuation);
        this.f96601OooOoOO = str;
        this.f96603OooOoo0 = c27545o00o0oo0;
        this.f96602OooOoo = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27547o00oO0(this.f96601OooOoOO, this.f96603OooOoo0, this.f96602OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super InterfaceC33721OooO0o<? extends List<? extends TextSearchResult>>> continuation) {
        return ((C27547o00oO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e A[LOOP:0: B:46:0x0148->B:48:0x014e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0265 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0266 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.orion.notein.domain.models.note.Note, java.lang.Object, java.lang.String] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        Object objOooOo;
        Object objOooo00o;
        String str;
        Note note;
        Note note2;
        String str2;
        ArrayList arrayList;
        Object objOooO0oO;
        Page page;
        Note note3;
        String str3;
        Iterator it;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96599OooOoO;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        Throwable th = null;
        String str4 = this.f96602OooOoo;
        C27545o00o0oo0 c27545o00o0oo0 = this.f96603OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            string = C33599OooOo0O.Oooooo0(this.f96601OooOoOO).toString();
            if (string.length() == 0) {
                return new C33716OooO(c34434OooOoO);
            }
            C27449o00O0OoO c27449o00O0OoO = c27545o00o0oo0.f96577OooO0O0;
            this.f96598OooOo0o = string;
            this.f96599OooOoO = 1;
            objOooOo = c27449o00O0OoO.OooOo(str4, this);
            if (objOooOo != enumC32485OooO00o) {
            }
        }
        if (i == 1) {
            string = this.f96598OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOo = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return obj;
                }
                Page page2 = (Page) this.f96600OooOoO0;
                note3 = this.f96597OooOo;
                str3 = this.f96598OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                page = page2;
                objOooO0oO = obj;
                ArrayList arrayListOooO0OO = C31192OooOOOo.OooO0OO(page.getId(), (RectF) objOooO0oO);
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooO0OO, 10));
                it = arrayListOooO0OO.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C27545o00o0oo0.OooO00o(Page.copy$default(page, null, null, null, null, null, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524287, null), 0, (PageGrid) it.next()));
                }
                str2 = str3;
                note2 = note3;
                ?? r3 = th;
                this.f96598OooOo0o = r3;
                this.f96597OooOo = r3;
                this.f96600OooOoO0 = r3;
                this.f96599OooOoO = 4;
                Object objOooO0o0 = C27545o00o0oo0.OooO0o0(c27545o00o0oo0, note2, str2, arrayList, this);
                return objOooO0o0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o0;
            }
            note = (Note) this.f96600OooOoO0;
            note2 = this.f96597OooOo;
            str = this.f96598OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooo00o = obj;
            note.setPages((List) objOooo00o);
            int i2 = C27545o00o0oo0.f96574OooOO0o;
            c27545o00o0oo0.getClass();
            File file = new File(c27545o00o0oo0.f96576OooO00o.getExternalFilesDir(null), "search-snapshot");
            C31190OooO0oo.OooO0o(file);
            C31190OooO0oo.OooO(file);
            if (!note2.getUnboundedNote()) {
                for (Page page3 : note2.getPages()) {
                    if (page3.getUnbounded()) {
                        C27449o00O0OoO c27449o00O0OoO2 = c27545o00o0oo0.f96577OooO0O0;
                        String id = page3.getId();
                        String noteId = page3.getNoteId();
                        this.f96598OooOo0o = str;
                        this.f96597OooOo = note2;
                        this.f96600OooOoO0 = page3;
                        this.f96599OooOoO = 3;
                        C27015OooOOoo c27015OooOOoo = c27449o00O0OoO2.f96039OooO0o.f94064OooO00o;
                        c27015OooOOoo.getClass();
                        objOooO0oO = c27015OooOOoo.f94033OooO00o.OooO0oO(noteId, new o0OOO0OO.OooOOO(new C27009OooO0oO(id, null), null));
                        if (objOooO0oO != enumC32485OooO00o) {
                            page = page3;
                            note3 = note2;
                            str3 = str;
                            ArrayList arrayListOooO0OO2 = C31192OooOOOo.OooO0OO(page.getId(), (RectF) objOooO0oO);
                            arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooO0OO2, 10));
                            it = arrayListOooO0OO2.iterator();
                            while (it.hasNext()) {
                            }
                            str2 = str3;
                            note2 = note3;
                            ?? r32 = th;
                            this.f96598OooOo0o = r32;
                            this.f96597OooOo = r32;
                            this.f96600OooOoO0 = r32;
                            this.f96599OooOoO = 4;
                            Object objOooO0o02 = C27545o00o0oo0.OooO0o0(c27545o00o0oo0, note2, str2, arrayList, this);
                            if (objOooO0o02 == enumC32485OooO00o) {
                            }
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            List<Page> pages = note2.getPages();
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            for (Object obj2 : pages) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    Throwable th2 = th;
                    C34429OooOOo0.OooOOo();
                    throw th2;
                }
                Page page4 = (Page) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(page4, "page");
                float width = page4.getPaperSpec().getWidth();
                float height = page4.getPaperSpec().getHeight();
                ArrayList arrayList3 = new ArrayList();
                Throwable th3 = th;
                arrayList3.add(new PageGrid(page4.getId(), new RectF(0.0f, 0.0f, width, height), new Point(0, 0)));
                ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Page page5 = page4;
                    arrayList4.add(new C27545o00o0oo0.OooO00o(Page.copy$default(page5, null, null, null, null, null, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524287, null), i3, (PageGrid) it2.next()));
                    page4 = page5;
                }
                C34431OooOo0.OooOo0o(arrayList2, arrayList4);
                i3 = i4;
                th = th3;
            }
            str2 = str;
            arrayList = arrayList2;
            ?? r322 = th;
            this.f96598OooOo0o = r322;
            this.f96597OooOo = r322;
            this.f96600OooOoO0 = r322;
            this.f96599OooOoO = 4;
            Object objOooO0o022 = C27545o00o0oo0.OooO0o0(c27545o00o0oo0, note2, str2, arrayList, this);
            if (objOooO0o022 == enumC32485OooO00o) {
            }
        }
        Note note4 = (Note) objOooOo;
        if (note4 == null) {
            return new C33716OooO(c34434OooOoO);
        }
        C27449o00O0OoO c27449o00O0OoO3 = c27545o00o0oo0.f96577OooO0O0;
        List<Page> pages2 = note4.getPages();
        ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(pages2, 10));
        Iterator<T> it3 = pages2.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((Page) it3.next()).getId());
        }
        this.f96598OooOo0o = string;
        this.f96597OooOo = note4;
        this.f96600OooOoO0 = note4;
        this.f96599OooOoO = 2;
        objOooo00o = c27449o00O0OoO3.Oooo00o(str4, arrayList5, this);
        if (objOooo00o != enumC32485OooO00o) {
            str = string;
            note = note4;
            note2 = note;
            note.setPages((List) objOooo00o);
            int i22 = C27545o00o0oo0.f96574OooOO0o;
            c27545o00o0oo0.getClass();
            File file2 = new File(c27545o00o0oo0.f96576OooO00o.getExternalFilesDir(null), "search-snapshot");
            C31190OooO0oo.OooO0o(file2);
            C31190OooO0oo.OooO(file2);
            if (!note2.getUnboundedNote()) {
            }
        }
    }
}
