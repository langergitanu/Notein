package o0OOo0o;

import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$getNoteMetasInFolderRecursive$2", m80623f = "FolderUseCase.kt", m80624l = {237, 238, 241}, m80625m = "invokeSuspend")
public final class o0OO00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends NoteMeta>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f96940OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f96941OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Collection f96942OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f96943OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96944OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ Folder f96945OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f96946OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(C27600o0ooOO0 c27600o0ooOO0, Folder folder, Continuation<? super o0OO00O> continuation) {
        super(2, continuation);
        this.f96946OooOoo0 = c27600o0ooOO0;
        this.f96945OooOoo = folder;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0OO00O(this.f96946OooOoo0, this.f96945OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends NoteMeta>> continuation) {
        return ((o0OO00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a3 -> B:31:0x00a6). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        Collection arrayList;
        Iterator it;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96944OooOoOO;
        Folder folder = this.f96945OooOoo;
        C27600o0ooOO0 c27600o0ooOO0 = this.f96946OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0OOO00o.OooO oooOOooO0oO = c27600o0ooOO0.f96983OooO0O0.OooO0oO(folder != null ? folder.getId() : null, c27600o0ooOO0.f96984OooO0OO.OooO0Oo());
            this.f96944OooOoOO = 1;
            obj = C25252OooO0Oo.OooOOo(oooOOooO0oO, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else if (i == 2) {
            list = (List) this.f96941OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list2 = list;
            arrayList = new ArrayList();
            it = ((List) obj).iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = this.f96942OooOoO;
            it = this.f96943OooOoO0;
            arrayList = this.f96940OooOo;
            C27600o0ooOO0 c27600o0ooOO02 = (C27600o0ooOO0) this.f96941OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c27600o0ooOO0 = c27600o0ooOO02;
            C34431OooOo0.OooOo0o(arrayList, (Iterable) obj);
            if (it.hasNext()) {
                return oOo000Oo.OooOo.OooooOO(list2, (List) arrayList);
            }
            Folder folder2 = (Folder) it.next();
            this.f96941OooOo0o = c27600o0ooOO0;
            this.f96940OooOo = arrayList;
            this.f96943OooOoO0 = it;
            this.f96942OooOoO = list2;
            this.f96944OooOoOO = 3;
            obj = c27600o0ooOO0.OooO0oo(folder2, this);
        }
        list = (List) obj;
        C28009OooOOOO c28009OooOOOO = c27600o0ooOO0.f96982OooO00o;
        String id = folder != null ? folder.getId() : null;
        this.f96941OooOo0o = list;
        this.f96944OooOoOO = 2;
        obj = c28009OooOOOO.OooO0oO(id, this);
    }
}
