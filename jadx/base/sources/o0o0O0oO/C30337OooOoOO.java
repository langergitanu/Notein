package o0o0O0oO;

import com.orion.notein.domain.models.cloudsync.SyncEvent;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27551o00oO0O;
import o0OOo0o.C27600o0ooOO0;
import o0OOo0oo.o0ooOOo;
import o0OOoO00.C27723OooO0O0;
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

/* JADX INFO: renamed from: o0o0O0oO.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$deleteFolderPermanently$2", m80623f = "TrashBinListViewModel.kt", m80624l = {676, 677, 681, 684, 689}, m80625m = "invokeSuspend")
public final class C30337OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f108166OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f108167OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f108168OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f108169OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C30351Oooo0oO f108170OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f108171OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30337OooOoOO(C30351Oooo0oO c30351Oooo0oO, String str, Continuation<? super C30337OooOoOO> continuation) {
        super(2, continuation);
        this.f108170OooOoOO = c30351Oooo0oO;
        this.f108171OooOoo0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30337OooOoOO(this.f108170OooOoOO, this.f108171OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30337OooOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o != r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013e, code lost:
    
        if (r11 != r0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[LOOP:2: B:27:0x0091->B:29:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf A[LOOP:1: B:35:0x00c9->B:37:0x00cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Folder folder;
        Iterator it;
        Object objOooO0oo;
        Set set;
        Iterator it2;
        Set set2;
        C30351Oooo0oO c30351Oooo0oO;
        Iterator it3;
        Iterator it4;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108168OooOoO;
        C30351Oooo0oO c30351Oooo0oO2 = this.f108170OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27600o0ooOO0 c27600o0ooOO0 = c30351Oooo0oO2.f108228OooO0o0;
            this.f108168OooOoO = 1;
            obj = c27600o0ooOO0.OooO0Oo(this.f108171OooOoo0, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i == 2) {
                folder = (Folder) this.f108167OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Folder) it.next()).getId());
                }
                Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList);
                C27600o0ooOO0 c27600o0ooOO02 = c30351Oooo0oO2.f108228OooO0o0;
                this.f108167OooOo0o = setO0OO00O;
                this.f108168OooOoO = 3;
                objOooO0oo = c27600o0ooOO02.OooO0oo(folder, this);
                if (objOooO0oo != enumC32485OooO00o) {
                    set = setO0OO00O;
                    obj = objOooO0oo;
                    Iterable iterable = (Iterable) obj;
                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                    it2 = iterable.iterator();
                    while (it2.hasNext()) {
                    }
                    Iterator it5 = oOo000Oo.OooOo.o0OO00O(arrayList2).iterator();
                    set2 = set;
                    c30351Oooo0oO = c30351Oooo0oO2;
                    it3 = it5;
                    while (it3.hasNext()) {
                    }
                    it4 = set2.iterator();
                    if (it4.hasNext()) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i == 3) {
                set = (Set) this.f108167OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Iterable iterable2 = (Iterable) obj;
                ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
                it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList22.add(((NoteMeta) it2.next()).getId());
                }
                Iterator it52 = oOo000Oo.OooOo.o0OO00O(arrayList22).iterator();
                set2 = set;
                c30351Oooo0oO = c30351Oooo0oO2;
                it3 = it52;
                while (it3.hasNext()) {
                }
                it4 = set2.iterator();
                if (it4.hasNext()) {
                }
            } else if (i == 4) {
                it3 = (Iterator) this.f108169OooOoO0;
                c30351Oooo0oO = (C30351Oooo0oO) this.f108166OooOo;
                set2 = (Set) this.f108167OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    this.f108167OooOo0o = set2;
                    this.f108166OooOo = c30351Oooo0oO;
                    this.f108169OooOoO0 = it3;
                    this.f108168OooOoO = 4;
                    if (c30351Oooo0oO.OooO0oO(str, this) == enumC32485OooO00o) {
                        break;
                    }
                }
                it4 = set2.iterator();
                if (it4.hasNext()) {
                }
            } else {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String noteId = (String) this.f108169OooOoO0;
                it4 = (Iterator) this.f108166OooOo;
                C30351Oooo0oO c30351Oooo0oO3 = (C30351Oooo0oO) this.f108167OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c30351Oooo0oO2 = c30351Oooo0oO3;
                o0ooOOo o0ooooo2 = c30351Oooo0oO2.f108227OooO0o;
                o0ooooo2.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                C27723OooO0O0 c27723OooO0O0 = (C27723OooO0O0) o0ooooo2.f97663OooO00o;
                c27723OooO0O0.getClass();
                c27723OooO0O0.f97800OooO00o.OooO0o0(new SyncEvent.LocalDeleted(noteId));
                if (it4.hasNext()) {
                    noteId = (String) it4.next();
                    C27600o0ooOO0 c27600o0ooOO03 = c30351Oooo0oO2.f108228OooO0o0;
                    this.f108167OooOo0o = c30351Oooo0oO2;
                    this.f108166OooOo = it4;
                    this.f108169OooOoO0 = noteId;
                    this.f108168OooOoO = 5;
                    c27600o0ooOO03.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27551o00oO0O(c27600o0ooOO03, noteId, null), this);
                    if (objOooO0o == EnumC32485OooO00o.f116726OooOo0o) {
                    }
                    if (it4.hasNext()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
            }
        }
        folder = (Folder) obj;
        if (folder == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        C27600o0ooOO0 c27600o0ooOO04 = c30351Oooo0oO2.f108228OooO0o0;
        this.f108167OooOo0o = folder;
        this.f108168OooOoO = 2;
        obj = c27600o0ooOO04.OooO0o(folder, this);
        if (obj != enumC32485OooO00o) {
            List list2 = (List) obj;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
            }
            Set setO0OO00O2 = oOo000Oo.OooOo.o0OO00O(arrayList3);
            C27600o0ooOO0 c27600o0ooOO022 = c30351Oooo0oO2.f108228OooO0o0;
            this.f108167OooOo0o = setO0OO00O2;
            this.f108168OooOoO = 3;
            objOooO0oo = c27600o0ooOO022.OooO0oo(folder, this);
            if (objOooO0oo != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
