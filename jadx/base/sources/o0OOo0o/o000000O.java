package o0OOo0o;

import com.orion.notein.domain.models.folder.Folder;
import kotlin.coroutines.Continuation;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$setFolderColor$2", m80623f = "FolderUseCase.kt", m80624l = {209, 211}, m80625m = "invokeSuspend")
public final class o000000O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f95369OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95370OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f95371OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f95372OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(C27600o0ooOO0 c27600o0ooOO0, String str, int i, Continuation<? super o000000O> continuation) {
        super(2, continuation);
        this.f95369OooOo = c27600o0ooOO0;
        this.f95372OooOoO0 = str;
        this.f95371OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000000O(this.f95369OooOo, this.f95372OooOoO0, this.f95371OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o000000O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (r3.f96982OooO00o.OooOO0(new com.orion.notein.domain.models.folder.Folder[]{r2}, r22) == r1) goto L17;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0Oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95370OooOo0o;
        C27600o0ooOO0 c27600o0ooOO0 = this.f95369OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28009OooOOOO c28009OooOOOO = c27600o0ooOO0.f96982OooO00o;
            this.f95370OooOo0o = 1;
            objOooO0Oo = c28009OooOOOO.OooO0Oo(this.f95372OooOoO0);
            if (objOooO0Oo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0Oo = obj;
        Folder folder = (Folder) objOooO0Oo;
        if (folder == null) {
            return null;
        }
        Folder folderCopy = folder.copy((3583 & 1) != 0 ? folder.id : null, (3583 & 2) != 0 ? folder.userId : null, (3583 & 4) != 0 ? folder.parentId : null, (3583 & 8) != 0 ? folder.recoverParentId : null, (3583 & 16) != 0 ? folder.title : null, (3583 & 32) != 0 ? folder.favorite : false, (3583 & 64) != 0 ? folder.inTrashBin : false, (3583 & 128) != 0 ? folder.creationTime : 0L, (3583 & 256) != 0 ? folder.lastModificationTime : 0L, (3583 & 512) != 0 ? folder.tnPath : null, (3583 & 1024) != 0 ? folder.sortKey : null, (3583 & 2048) != 0 ? folder.coverColor : new Integer(this.f95371OooOoO));
        this.f95370OooOo0o = 2;
    }
}
