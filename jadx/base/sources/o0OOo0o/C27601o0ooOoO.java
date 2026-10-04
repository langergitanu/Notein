package o0OOo0o;

import com.orion.notein.domain.models.folder.Folder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOo0o.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$getFoldersRecursive$2", m80623f = "FolderUseCase.kt", m80624l = {218, 222}, m80625m = "invokeSuspend")
public final class C27601o0ooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Folder>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f96995OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27600o0ooOO0 f96996OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Collection f96997OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f96998OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96999OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ Folder f97000OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f97001OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27601o0ooOoO(C27600o0ooOO0 c27600o0ooOO0, Folder folder, Continuation<? super C27601o0ooOoO> continuation) {
        super(2, continuation);
        this.f97001OooOoo0 = c27600o0ooOO0;
        this.f97000OooOoo = folder;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27601o0ooOoO(this.f97001OooOoo0, this.f97000OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Folder>> continuation) {
        return ((C27601o0ooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r9 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0082 -> B:28:0x0085). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection collectionOooO0oO;
        Iterator it;
        C27600o0ooOO0 c27600o0ooOO0;
        Collection collection;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96999OooOoOO;
        Folder folder = this.f97000OooOoo;
        C27600o0ooOO0 c27600o0ooOO02 = this.f97001OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28009OooOOOO c28009OooOOOO = c27600o0ooOO02.f96982OooO00o;
            String id = folder != null ? folder.getId() : null;
            this.f96999OooOoOO = 1;
            obj = c28009OooOOOO.OooO0oO(id, this);
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collectionOooO0oO = this.f96997OooOoO;
            it = this.f96998OooOoO0;
            collection = this.f96995OooOo;
            C27600o0ooOO0 c27600o0ooOO03 = this.f96996OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C34431OooOo0.OooOo0o(collection, (Iterable) obj);
            c27600o0ooOO0 = c27600o0ooOO03;
            if (it.hasNext()) {
                Folder folder2 = (Folder) it.next();
                this.f96996OooOo0o = c27600o0ooOO0;
                this.f96995OooOo = collection;
                this.f96998OooOoO0 = it;
                this.f96997OooOoO = collectionOooO0oO;
                this.f96999OooOoOO = 2;
                Object objOooO0o = c27600o0ooOO0.OooO0o(folder2, this);
                if (objOooO0o != enumC32485OooO00o) {
                    c27600o0ooOO03 = c27600o0ooOO0;
                    obj = objOooO0o;
                    C34431OooOo0.OooOo0o(collection, (Iterable) obj);
                    c27600o0ooOO0 = c27600o0ooOO03;
                    if (it.hasNext()) {
                        return oOo000Oo.OooOo.OooooOO(collectionOooO0oO, (List) collection);
                    }
                }
                return enumC32485OooO00o;
            }
        }
        List list = (List) obj;
        collectionOooO0oO = folder == null ? C34434OooOoO.f123453OooOo0o : com.facebook.soloader.OooOo.OooO0oO(folder);
        ArrayList arrayList = new ArrayList();
        it = list.iterator();
        c27600o0ooOO0 = c27600o0ooOO02;
        collection = arrayList;
        if (it.hasNext()) {
        }
    }
}
