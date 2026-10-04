package o0OOoOOO;

import Oooo0oO.o0Oo0oo;
import com.orion.notein.domain.models.folder.Folder;
import java.util.ArrayList;
import java.util.Arrays;
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
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOoOOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.folder.RecoverDetachedFoldersUseCase$recoverFolderWithContents$2", m80623f = "RecoverDetachedFoldersUseCase.kt", m80624l = {92, 106, 112}, m80625m = "invokeSuspend")
public final class C27779OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ArrayList f98125OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList f98126OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Folder f98127OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f98128OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27782OooO0oo f98129OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27779OooO0o(Folder folder, Continuation continuation, C27782OooO0oo c27782OooO0oo) {
        super(2, continuation);
        this.f98127OooOoO = folder;
        this.f98129OooOoOO = c27782OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27779OooO0o(this.f98127OooOoO, continuation, this.f98129OooOoOO);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27779OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0154, code lost:
    
        if (r2 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b A[LOOP:0: B:36:0x0125->B:38:0x012b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0o;
        ArrayList<Folder> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        Object objOooO0o2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98128OooOoO0;
        C27782OooO0oo c27782OooO0oo = this.f98129OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("RecoverDetachedFoldersUseCase");
            Folder folder = this.f98127OooOoO;
            c20358OooO00o.OooO0o0(androidx.core.database.OooO00o.OooO00o("Recovering folder: ", folder.getTitle(), " (", folder.getId(), ")"), new Object[0]);
            this.f98128OooOoO0 = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27775OooO00o(folder, null, c27782OooO0oo), this);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            arrayList2 = this.f98125OooOo;
            arrayList3 = this.f98126OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("RecoverDetachedFoldersUseCase");
            c20358OooO00o2.OooO0o0(o0Oo0oo.OooO0O0(arrayList2.size(), "Recovered ", " folders from trash"), new Object[0]);
            arrayList = arrayList3;
            String strOooO0Oo = c27782OooO0oo.f98145OooO0OO.OooO0Oo();
            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList4.add(((Folder) it.next()).getId());
            }
            this.f98126OooOo0o = null;
            this.f98125OooOo = null;
            this.f98128OooOoO0 = 3;
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27781OooO0oO(arrayList4, c27782OooO0oo, strOooO0Oo, null), this);
            if (objOooO0o2 != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO0o2 = C32460OooOooO.f116667OooO00o;
            }
        }
        arrayList = new ArrayList();
        for (Object obj2 : (List) objOooO0o) {
            if (((Folder) obj2).getInTrashBin()) {
                arrayList.add(obj2);
            }
        }
        arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (Folder folder2 : arrayList) {
            String recoverParentId = folder2.getRecoverParentId();
            if (recoverParentId == null) {
                recoverParentId = folder2.getParentId();
            }
            arrayList2.add(folder2.copy((3583 & 1) != 0 ? folder2.id : null, (3583 & 2) != 0 ? folder2.userId : null, (3583 & 4) != 0 ? folder2.parentId : recoverParentId, (3583 & 8) != 0 ? folder2.recoverParentId : null, (3583 & 16) != 0 ? folder2.title : null, (3583 & 32) != 0 ? folder2.favorite : false, (3583 & 64) != 0 ? folder2.inTrashBin : false, (3583 & 128) != 0 ? folder2.creationTime : 0L, (3583 & 256) != 0 ? folder2.lastModificationTime : 0L, (3583 & 512) != 0 ? folder2.tnPath : null, (3583 & 1024) != 0 ? folder2.sortKey : null, (3583 & 2048) != 0 ? folder2.coverColor : null));
        }
        if (arrayList2.isEmpty()) {
            String strOooO0Oo2 = c27782OooO0oo.f98145OooO0OO.OooO0Oo();
            ArrayList arrayList42 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
            }
            this.f98126OooOo0o = null;
            this.f98125OooOo = null;
            this.f98128OooOoO0 = 3;
            C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
            objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27781OooO0oO(arrayList42, c27782OooO0oo, strOooO0Oo2, null), this);
            if (objOooO0o2 != EnumC32485OooO00o.f116726OooOo0o) {
            }
        } else {
            C28009OooOOOO c28009OooOOOO = c27782OooO0oo.f98143OooO00o;
            Folder[] folderArr = (Folder[]) arrayList2.toArray(new Folder[0]);
            Folder[] folderArr2 = (Folder[]) Arrays.copyOf(folderArr, folderArr.length);
            this.f98126OooOo0o = arrayList;
            this.f98125OooOo = arrayList2;
            this.f98128OooOoO0 = 2;
            if (c28009OooOOOO.OooOO0(folderArr2, this) != enumC32485OooO00o) {
                arrayList3 = arrayList;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("RecoverDetachedFoldersUseCase");
                c20358OooO00o22.OooO0o0(o0Oo0oo.OooO0O0(arrayList2.size(), "Recovered ", " folders from trash"), new Object[0]);
                arrayList = arrayList3;
                String strOooO0Oo22 = c27782OooO0oo.f98145OooO0OO.OooO0Oo();
                ArrayList arrayList422 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                this.f98126OooOo0o = null;
                this.f98125OooOo = null;
                this.f98128OooOoO0 = 3;
                C33874OooO0OO c33874OooO0OO222 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27781OooO0oO(arrayList422, c27782OooO0oo, strOooO0Oo22, null), this);
                if (objOooO0o2 != EnumC32485OooO00o.f116726OooOo0o) {
                }
            }
        }
        return enumC32485OooO00o;
    }
}
