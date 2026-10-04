package o0OOoooO;

import com.orion.notein.data.p602db.entity.FolderEntity;
import com.orion.notein.domain.models.folder.Folder;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOoooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.folder.FolderRepoImpl$createFolder$2", m80623f = "FolderRepoImpl.kt", m80624l = {29}, m80625m = "invokeSuspend")
public final class C27997OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Folder f99282OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99283OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28009OooOOOO f99284OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27997OooO0O0(Folder folder, C28009OooOOOO c28009OooOOOO, Continuation<? super C27997OooO0O0> continuation) {
        super(2, continuation);
        this.f99282OooOo = folder;
        this.f99284OooOoO0 = c28009OooOOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27997OooO0O0(this.f99282OooOo, this.f99284OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27997OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99283OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28009OooOOOO c28009OooOOOO = this.f99284OooOoO0;
            String strOooO0Oo = c28009OooOOOO.f99337OooO0OO.OooO0Oo();
            Folder folder = this.f99282OooOo;
            FolderEntity[] folderEntityArr = {c28009OooOOOO.f99336OooO0O0.toEntity(folder.copy((3583 & 1) != 0 ? folder.id : null, (3583 & 2) != 0 ? folder.userId : strOooO0Oo, (3583 & 4) != 0 ? folder.parentId : null, (3583 & 8) != 0 ? folder.recoverParentId : null, (3583 & 16) != 0 ? folder.title : null, (3583 & 32) != 0 ? folder.favorite : false, (3583 & 64) != 0 ? folder.inTrashBin : false, (3583 & 128) != 0 ? folder.creationTime : 0L, (3583 & 256) != 0 ? folder.lastModificationTime : 0L, (3583 & 512) != 0 ? folder.tnPath : null, (3583 & 1024) != 0 ? folder.sortKey : null, (3583 & 2048) != 0 ? folder.coverColor : null))};
            this.f99283OooOo0o = 1;
            if (c28009OooOOOO.f99335OooO00o.OooOOO0(folderEntityArr, this) == enumC32485OooO00o) {
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
