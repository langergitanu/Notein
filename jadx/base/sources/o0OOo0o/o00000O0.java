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
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$updateFolderLastModificationTime$2", m80623f = "FolderUseCase.kt", m80624l = {53, 55}, m80625m = "invokeSuspend")
public final class o00000O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f95375OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95376OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f95377OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(C27600o0ooOO0 c27600o0ooOO0, String str, Continuation<? super o00000O0> continuation) {
        super(2, continuation);
        this.f95375OooOo = c27600o0ooOO0;
        this.f95377OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00000O0(this.f95375OooOo, this.f95377OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00000O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r2.f96982OooO00o.OooOO0(new com.orion.notein.domain.models.folder.Folder[]{r6}, r5) == r0) goto L17;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95376OooOo0o;
        C27600o0ooOO0 c27600o0ooOO0 = this.f95375OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28009OooOOOO c28009OooOOOO = c27600o0ooOO0.f96982OooO00o;
            this.f95376OooOo0o = 1;
            obj = c28009OooOOOO.OooO0Oo(this.f95377OooOoO0);
            if (obj != enumC32485OooO00o) {
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
        Folder folder = (Folder) obj;
        if (folder != null) {
            this.f95376OooOo0o = 2;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
