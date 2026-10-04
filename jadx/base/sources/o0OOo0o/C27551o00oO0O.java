package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.folder.Folder;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00oO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$deleteFolderById$2", m80623f = "FolderUseCase.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3, 303, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4}, m80625m = "invokeSuspend")
public final class C27551o00oO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f96628OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27600o0ooOO0 f96629OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f96630OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f96631OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f96632OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27551o00oO0O(C27600o0ooOO0 c27600o0ooOO0, String str, Continuation<? super C27551o00oO0O> continuation) {
        super(2, continuation);
        this.f96630OooOoO = c27600o0ooOO0;
        this.f96632OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27551o00oO0O(this.f96630OooOoO, this.f96632OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27551o00oO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r2 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0Oo;
        Object objOooO0o;
        Iterator it;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96631OooOoO0;
        C27600o0ooOO0 c27600o0ooOO0 = this.f96630OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28009OooOOOO c28009OooOOOO = c27600o0ooOO0.f96982OooO00o;
            this.f96631OooOoO0 = 1;
            objOooO0Oo = c28009OooOOOO.OooO0Oo(this.f96632OooOoOO);
            if (objOooO0Oo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                it = ((List) objOooO0o).iterator();
                while (it.hasNext()) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f96628OooOo;
            C27600o0ooOO0 c27600o0ooOO02 = this.f96629OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c27600o0ooOO0 = c27600o0ooOO02;
            while (it.hasNext()) {
                Folder folder = (Folder) it.next();
                C28009OooOOOO c28009OooOOOO2 = c27600o0ooOO0.f96982OooO00o;
                String id = folder.getId();
                this.f96629OooOo0o = c27600o0ooOO0;
                this.f96628OooOo = it;
                this.f96631OooOoO0 = 3;
                c28009OooOOOO2.f99335OooO00o.OooO0O0(id);
                if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0Oo = obj;
        Folder folder2 = (Folder) objOooO0Oo;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("FolderUseCase");
        c20358OooO00o.OooO0o0("deleteFolderById: " + folder2, new Object[0]);
        if (folder2 != null && folder2.getInTrashBin()) {
            Folder folderCopy = folder2.copy((3583 & 1) != 0 ? folder2.id : null, (3583 & 2) != 0 ? folder2.userId : null, (3583 & 4) != 0 ? folder2.parentId : null, (3583 & 8) != 0 ? folder2.recoverParentId : null, (3583 & 16) != 0 ? folder2.title : null, (3583 & 32) != 0 ? folder2.favorite : false, (3583 & 64) != 0 ? folder2.inTrashBin : false, (3583 & 128) != 0 ? folder2.creationTime : 0L, (3583 & 256) != 0 ? folder2.lastModificationTime : 0L, (3583 & 512) != 0 ? folder2.tnPath : null, (3583 & 1024) != 0 ? folder2.sortKey : null, (3583 & 2048) != 0 ? folder2.coverColor : null);
            this.f96631OooOoO0 = 2;
            objOooO0o = c27600o0ooOO0.OooO0o(folderCopy, this);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
