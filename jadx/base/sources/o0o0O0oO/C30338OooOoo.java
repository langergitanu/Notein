package o0o0O0oO;

import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOO0OO.C27020OooOoO0;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0O0oO.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$deletePagesPermanently$2", m80623f = "TrashBinListViewModel.kt", m80624l = {650, 651, 654, 657, 658}, m80625m = "invokeSuspend")
public final class C30338OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f108172OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public List f108173OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Set<String> f108174OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30351Oooo0oO f108175OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f108176OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30338OooOoo(C30351Oooo0oO c30351Oooo0oO, Set<String> set, String str, Continuation<? super C30338OooOoo> continuation) {
        super(2, continuation);
        this.f108175OooOoO0 = c30351Oooo0oO;
        this.f108174OooOoO = set;
        this.f108176OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30338OooOoo(this.f108175OooOoO0, this.f108174OooOoO, this.f108176OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30338OooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        if (r14.OooO0O0(r9, r2, r13) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o != r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3 A[LOOP:1: B:35:0x00dd->B:37:0x00e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        ArrayList arrayList;
        Iterator it;
        C27449o00O0OoO c27449o00O0OoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108172OooOo;
        Set<String> set = this.f108174OooOoO;
        String str = this.f108176OooOoOO;
        C30351Oooo0oO c30351Oooo0oO = this.f108175OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33721OooO0o interfaceC33721OooO0oOooO0o = c30351Oooo0oO.f108229OooO0oO.OooO0o(str, set);
            this.f108172OooOo = 1;
            obj = C25252OooO0Oo.OooOOo(interfaceC33721OooO0oOooO0o, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C32446OooOOOo.OooO0O0(obj);
                        C33781o00o0O c33781o00o0O = c30351Oooo0oO.f108244OooOo0O;
                        Boolean boolValueOf = Boolean.valueOf(!((Boolean) c33781o00o0O.getValue()).booleanValue());
                        this.f108172OooOo = 5;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, boolValueOf);
                    } else if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            list = this.f108173OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            NoteMeta noteMeta = (NoteMeta) obj;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TrashBinListViewModel");
            c20358OooO00o.OooO0o0("deletePagesPermanently, pageIds: " + set + ", noteId: " + str + ", pageList: " + list + ", noteMeta: " + noteMeta, new Object[0]);
            if (list.isEmpty() || noteMeta != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((Page) obj2).getInTrashBin()) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Page) it.next()).getId());
                }
                c27449o00O0OoO = c30351Oooo0oO.f108226OooO0Oo;
                this.f108173OooOo0o = null;
                this.f108172OooOo = 4;
                if (c27449o00O0OoO.OooOOOO(str, arrayList, this) != enumC32485OooO00o) {
                    C33781o00o0O c33781o00o0O2 = c30351Oooo0oO.f108244OooOo0O;
                    Boolean boolValueOf2 = Boolean.valueOf(!((Boolean) c33781o00o0O2.getValue()).booleanValue());
                    this.f108172OooOo = 5;
                    c33781o00o0O2.getClass();
                    c33781o00o0O2.OooOO0(null, boolValueOf2);
                }
            } else {
                C27020OooOoO0 c27020OooOoO0 = c30351Oooo0oO.f108229OooO0oO;
                this.f108173OooOo0o = null;
                this.f108172OooOo = 3;
            }
            return enumC32485OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        list = (List) obj;
        C27449o00O0OoO c27449o00O0OoO2 = c30351Oooo0oO.f108226OooO0Oo;
        this.f108173OooOo0o = list;
        this.f108172OooOo = 2;
        obj = c27449o00O0OoO2.OooOoOO(str, this);
        if (obj != enumC32485OooO00o) {
            NoteMeta noteMeta2 = (NoteMeta) obj;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("TrashBinListViewModel");
            c20358OooO00o2.OooO0o0("deletePagesPermanently, pageIds: " + set + ", noteId: " + str + ", pageList: " + list + ", noteMeta: " + noteMeta2, new Object[0]);
            if (list.isEmpty()) {
            }
            ArrayList arrayList22 = new ArrayList();
            while (r1.hasNext()) {
            }
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList22, 10));
            it = arrayList22.iterator();
            while (it.hasNext()) {
            }
            c27449o00O0OoO = c30351Oooo0oO.f108226OooO0Oo;
            this.f108173OooOo0o = null;
            this.f108172OooOo = 4;
            if (c27449o00O0OoO.OooOOOO(str, arrayList, this) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
