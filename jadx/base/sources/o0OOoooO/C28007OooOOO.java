package o0OOoooO;

import com.orion.notein.data.p602db.entity.FolderEntity;
import com.orion.notein.domain.models.folder.Folder;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oo0oO0.o00000O0;

/* JADX INFO: renamed from: o0OOoooO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.folder.FolderRepoImpl$updateFolder$2", m80623f = "FolderRepoImpl.kt", m80624l = {44}, m80625m = "invokeSuspend")
public final class C28007OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Folder[] f99328OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99329OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28009OooOOOO f99330OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28007OooOOO(Folder[] folderArr, C28009OooOOOO c28009OooOOOO, Continuation<? super C28007OooOOO> continuation) {
        super(2, continuation);
        this.f99328OooOo = folderArr;
        this.f99330OooOoO0 = c28009OooOOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28007OooOOO(this.f99328OooOo, this.f99330OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28007OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99329OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Folder[] folderArr = this.f99328OooOo;
            ArrayList arrayList = new ArrayList(folderArr.length);
            for (Folder folder : folderArr) {
                folder.setLastModificationTime(System.currentTimeMillis());
                arrayList.add(C32460OooOooO.f116667OooO00o);
            }
            C28009OooOOOO c28009OooOOOO = this.f99330OooOoO0;
            o00000O0 o00000o02 = c28009OooOOOO.f99335OooO00o;
            ArrayList arrayList2 = new ArrayList(folderArr.length);
            for (Folder folder2 : folderArr) {
                arrayList2.add(c28009OooOOOO.f99336OooO0O0.toEntity(folder2));
            }
            FolderEntity[] folderEntityArr = (FolderEntity[]) arrayList2.toArray(new FolderEntity[0]);
            FolderEntity[] folderEntityArr2 = (FolderEntity[]) Arrays.copyOf(folderEntityArr, folderEntityArr.length);
            this.f99329OooOo0o = 1;
            if (o00000o02.OooOO0O(folderEntityArr2, this) == enumC32485OooO00o) {
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
