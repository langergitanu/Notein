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
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$createFolder$2", m80623f = "FolderUseCase.kt", m80624l = {116, 132}, m80625m = "invokeSuspend")
public final class C27553o00oO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f96649OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96650OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96651OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f96652OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f96653OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ int f96654OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ long f96655OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27553o00oO0o(String str, C27600o0ooOO0 c27600o0ooOO0, String str2, String str3, long j, int i, Continuation<? super C27553o00oO0o> continuation) {
        super(2, continuation);
        this.f96649OooOo = str;
        this.f96652OooOoO0 = c27600o0ooOO0;
        this.f96651OooOoO = str2;
        this.f96653OooOoOO = str3;
        this.f96655OooOoo0 = j;
        this.f96654OooOoo = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27553o00oO0o(this.f96649OooOo, this.f96652OooOoO0, this.f96651OooOoO, this.f96653OooOoOO, this.f96655OooOoo0, this.f96654OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27553o00oO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r2 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (r2.OooO00o(r8, r25) != r1) goto L25;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0Oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96650OooOo0o;
        C27600o0ooOO0 c27600o0ooOO0 = this.f96652OooOoO0;
        String id = null;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = this.f96649OooOo;
            if (str != null) {
                C28009OooOOOO c28009OooOOOO = c27600o0ooOO0.f96982OooO00o;
                this.f96650OooOo0o = 1;
                objOooO0Oo = c28009OooOOOO.OooO0Oo(str);
            } else {
                Folder folder = new Folder(this.f96651OooOoO, null, id, null, this.f96653OooOoOO, false, false, this.f96655OooOoo0, 0L, null, null, new Integer(this.f96654OooOoo), 1898, null);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("FolderUseCase");
                c20358OooO00o.OooO0o0("createFolder, " + folder, new Object[0]);
                C28009OooOOOO c28009OooOOOO2 = c27600o0ooOO0.f96982OooO00o;
                this.f96650OooOo0o = 2;
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return this.f96651OooOoO;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0Oo = obj;
        Folder folder2 = (Folder) objOooO0Oo;
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("FolderUseCase");
        c20358OooO00o2.OooO0o0("createFolder, parentId is not null, parentFolder: " + folder2, new Object[0]);
        if ((folder2 == null || !folder2.getInTrashBin()) && folder2 != null) {
            id = folder2.getId();
        }
        Folder folder3 = new Folder(this.f96651OooOoO, null, id, null, this.f96653OooOoOO, false, false, this.f96655OooOoo0, 0L, null, null, new Integer(this.f96654OooOoo), 1898, null);
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("FolderUseCase");
        c20358OooO00o3.OooO0o0("createFolder, " + folder3, new Object[0]);
        C28009OooOOOO c28009OooOOOO22 = c27600o0ooOO0.f96982OooO00o;
        this.f96650OooOo0o = 2;
    }
}
