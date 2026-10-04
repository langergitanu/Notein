package o0OOoOOO;

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
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OOoOOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.folder.RecoverDetachedFoldersUseCase$getFoldersRecursive$2", m80623f = "RecoverDetachedFoldersUseCase.kt", m80624l = {119, 120}, m80625m = "invokeSuspend")
public final class C27775OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Folder>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f98112OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27782OooO0oo f98113OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f98114OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f98115OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27782OooO0oo f98116OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Folder f98117OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27775OooO00o(Folder folder, Continuation continuation, C27782OooO0oo c27782OooO0oo) {
        super(2, continuation);
        this.f98116OooOoOO = c27782OooO0oo;
        this.f98117OooOoo0 = folder;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27775OooO00o(this.f98117OooOoo0, continuation, this.f98116OooOoOO);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Folder>> continuation) {
        return ((C27775OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0076 -> B:20:0x0079). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        C27782OooO0oo c27782OooO0oo;
        Collection collection;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98114OooOoO;
        Folder folder = this.f98117OooOoo0;
        C27782OooO0oo c27782OooO0oo2 = this.f98116OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28009OooOOOO c28009OooOOOO = c27782OooO0oo2.f98143OooO00o;
            String id = folder.getId();
            this.f98114OooOoO = 1;
            obj = c28009OooOOOO.OooO0oO(id, this);
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f98115OooOoO0;
            collection = this.f98112OooOo;
            C27782OooO0oo c27782OooO0oo3 = this.f98113OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C34431OooOo0.OooOo0o(collection, (Iterable) obj);
            c27782OooO0oo = c27782OooO0oo3;
            if (it.hasNext()) {
                Folder folder2 = (Folder) it.next();
                this.f98113OooOo0o = c27782OooO0oo;
                this.f98112OooOo = collection;
                this.f98115OooOoO0 = it;
                this.f98114OooOoO = 2;
                c27782OooO0oo.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27775OooO00o(folder2, null, c27782OooO0oo), this);
                if (objOooO0o != enumC32485OooO00o) {
                    c27782OooO0oo3 = c27782OooO0oo;
                    obj = objOooO0o;
                    C34431OooOo0.OooOo0o(collection, (Iterable) obj);
                    c27782OooO0oo = c27782OooO0oo3;
                    if (it.hasNext()) {
                        return OooOo.OooooOO(com.facebook.soloader.OooOo.OooO0oO(folder), (List) collection);
                    }
                }
                return enumC32485OooO00o;
            }
        }
        ArrayList arrayList = new ArrayList();
        it = ((List) obj).iterator();
        c27782OooO0oo = c27782OooO0oo2;
        collection = arrayList;
        if (it.hasNext()) {
        }
    }
}
