package o0o00oOo;

import com.aspose.words.EditingLanguage;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27600o0ooOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o00oOo.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$mergeNotesToNewFolder$2", m80623f = "NoteListViewModel.kt", m80624l = {EditingLanguage.GERMAN_GERMANY, EditingLanguage.HEBREW, EditingLanguage.NORWEGIAN_BOKMAL, EditingLanguage.ROMANSH}, m80625m = "invokeSuspend")
public final class C30073Ooooo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public com.orion.notein.p607ui.notelist.OooO0OO f106984OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f106985OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f106986OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterable f106987OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f106988OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ List<NoteVO> f106989OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106990OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30073Ooooo0o(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, List<NoteVO> list, Continuation<? super C30073Ooooo0o> continuation) {
        super(2, continuation);
        this.f106990OooOoo0 = oooO0OO;
        this.f106989OooOoo = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30073Ooooo0o(this.f106990OooOoo0, this.f106989OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30073Ooooo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:9:0x0021, B:50:0x0101, B:52:0x0107, B:55:0x0123, B:56:0x0132, B:58:0x0138, B:59:0x0146, B:16:0x003d, B:46:0x00f0, B:41:0x00ca, B:43:0x00d0, B:49:0x00f8, B:48:0x00f4, B:19:0x0048, B:37:0x00b1, B:39:0x00b5, B:40:0x00bb, B:22:0x0052, B:34:0x00a3, B:25:0x0059, B:27:0x0085, B:30:0x008d), top: B:63:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:9:0x0021, B:50:0x0101, B:52:0x0107, B:55:0x0123, B:56:0x0132, B:58:0x0138, B:59:0x0146, B:16:0x003d, B:46:0x00f0, B:41:0x00ca, B:43:0x00d0, B:49:0x00f8, B:48:0x00f4, B:19:0x0048, B:37:0x00b1, B:39:0x00b5, B:40:0x00bb, B:22:0x0052, B:34:0x00a3, B:25:0x0059, B:27:0x0085, B:30:0x008d), top: B:63:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:9:0x0021, B:50:0x0101, B:52:0x0107, B:55:0x0123, B:56:0x0132, B:58:0x0138, B:59:0x0146, B:16:0x003d, B:46:0x00f0, B:41:0x00ca, B:43:0x00d0, B:49:0x00f8, B:48:0x00f4, B:19:0x0048, B:37:0x00b1, B:39:0x00b5, B:40:0x00bb, B:22:0x0052, B:34:0x00a3, B:25:0x0059, B:27:0x0085, B:30:0x008d), top: B:63:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:9:0x0021, B:50:0x0101, B:52:0x0107, B:55:0x0123, B:56:0x0132, B:58:0x0138, B:59:0x0146, B:16:0x003d, B:46:0x00f0, B:41:0x00ca, B:43:0x00d0, B:49:0x00f8, B:48:0x00f4, B:19:0x0048, B:37:0x00b1, B:39:0x00b5, B:40:0x00bb, B:22:0x0052, B:34:0x00a3, B:25:0x0059, B:27:0x0085, B:30:0x008d), top: B:63:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:9:0x0021, B:50:0x0101, B:52:0x0107, B:55:0x0123, B:56:0x0132, B:58:0x0138, B:59:0x0146, B:16:0x003d, B:46:0x00f0, B:41:0x00ca, B:43:0x00d0, B:49:0x00f8, B:48:0x00f4, B:19:0x0048, B:37:0x00b1, B:39:0x00b5, B:40:0x00bb, B:22:0x0052, B:34:0x00a3, B:25:0x0059, B:27:0x0085, B:30:0x008d), top: B:63:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138 A[Catch: Exception -> 0x0026, LOOP:1: B:56:0x0132->B:58:0x0138, LOOP_END, TryCatch #0 {Exception -> 0x0026, blocks: (B:9:0x0021, B:50:0x0101, B:52:0x0107, B:55:0x0123, B:56:0x0132, B:58:0x0138, B:59:0x0146, B:16:0x003d, B:46:0x00f0, B:41:0x00ca, B:43:0x00d0, B:49:0x00f8, B:48:0x00f4, B:19:0x0048, B:37:0x00b1, B:39:0x00b5, B:40:0x00bb, B:22:0x0052, B:34:0x00a3, B:25:0x0059, B:27:0x0085, B:30:0x008d), top: B:63:0x000b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ed -> B:46:0x00f0). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objOooO0Oo;
        Folder folder;
        Collection arrayList;
        Iterator it;
        Folder folder2;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO;
        List list;
        Iterator it2;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO2;
        Iterator it3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106988OooOoOO;
        Folder folder3 = null;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO3 = this.f106990OooOoo0;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteVO noteVO = (NoteVO) ((C32443OooOOO) oooO0OO3.f77161OoooO00.getValue()).f116638OooOo0o;
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                C27600o0ooOO0 c27600o0ooOO0 = oooO0OO3.f77124OooO0oO;
                String string2 = oooO0OO3.f77137OooOo0.getString(R.string.folder_title_default);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                String id = noteVO != null ? noteVO.getId() : null;
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f106985OooOo0o = string;
                this.f106988OooOoOO = 1;
                if (C27600o0ooOO0.OooO0O0(c27600o0ooOO0, string2, id, string, jCurrentTimeMillis, 0, this, 16) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                str = string;
            } else if (i == 1) {
                str = (String) this.f106985OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            } else if (i == 2) {
                str = (String) this.f106985OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0Oo = obj;
                folder = (Folder) objOooO0Oo;
                if (folder != null) {
                    oooO0OO3.f77138OooOo00.OooO0O0(str);
                    folder3 = folder;
                }
                List<NoteVO> list2 = this.f106989OooOoo;
                arrayList = new ArrayList();
                it = list2.iterator();
                folder2 = folder3;
                oooO0OO = oooO0OO3;
                if (!it.hasNext()) {
                }
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it2 = this.f106986OooOoO;
                    list = this.f106987OooOoO0;
                    oooO0OO2 = this.f106984OooOo;
                    folder2 = (Folder) this.f106985OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    while (it2.hasNext()) {
                        NoteMeta noteMeta = (NoteMeta) it2.next();
                        C27449o00O0OoO c27449o00O0OoO = oooO0OO2.f77121OooO0Oo;
                        this.f106985OooOo0o = folder2;
                        this.f106984OooOo = oooO0OO2;
                        this.f106987OooOoO0 = list;
                        this.f106986OooOoO = it2;
                        this.f106988OooOoOO = 4;
                        if (c27449o00O0OoO.Oooo0o(noteMeta, folder2, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((NoteMeta) it3.next()).getId());
                    }
                    oooO0OO3.f77138OooOo00.OooO0o0(arrayList2);
                    return Boolean.TRUE;
                }
                it = this.f106986OooOoO;
                arrayList = (Collection) this.f106987OooOoO0;
                oooO0OO = this.f106984OooOo;
                folder2 = (Folder) this.f106985OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Object objOooOoOO = obj;
                NoteMeta noteMeta2 = (NoteMeta) objOooOoOO;
                if (noteMeta2 != null) {
                    arrayList.add(noteMeta2);
                }
                if (!it.hasNext()) {
                    NoteVO noteVO2 = (NoteVO) it.next();
                    C27449o00O0OoO c27449o00O0OoO2 = oooO0OO.f77121OooO0Oo;
                    String id2 = noteVO2.getId();
                    this.f106985OooOo0o = folder2;
                    this.f106984OooOo = oooO0OO;
                    this.f106987OooOoO0 = arrayList;
                    this.f106986OooOoO = it;
                    this.f106988OooOoOO = 3;
                    objOooOoOO = c27449o00O0OoO2.OooOoOO(id2, this);
                    if (objOooOoOO == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    NoteMeta noteMeta22 = (NoteMeta) objOooOoOO;
                    if (noteMeta22 != null) {
                    }
                    if (!it.hasNext()) {
                        list = (List) arrayList;
                        it2 = list.iterator();
                        oooO0OO2 = oooO0OO3;
                        while (it2.hasNext()) {
                        }
                        ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                        it3 = list.iterator();
                        while (it3.hasNext()) {
                        }
                        oooO0OO3.f77138OooOo00.OooO0o0(arrayList22);
                        return Boolean.TRUE;
                    }
                }
            }
            C27600o0ooOO0 c27600o0ooOO02 = oooO0OO3.f77124OooO0oO;
            this.f106985OooOo0o = str;
            this.f106988OooOoOO = 2;
            objOooO0Oo = c27600o0ooOO02.OooO0Oo(str, this);
            if (objOooO0Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            folder = (Folder) objOooO0Oo;
            if (folder != null) {
            }
            List<NoteVO> list22 = this.f106989OooOoo;
            arrayList = new ArrayList();
            it = list22.iterator();
            folder2 = folder3;
            oooO0OO = oooO0OO3;
            if (!it.hasNext()) {
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteListViewModel");
            c20358OooO00o.OooO0Oo(e, "Unable to merge notes", new Object[0]);
            return Boolean.FALSE;
        }
    }
}
