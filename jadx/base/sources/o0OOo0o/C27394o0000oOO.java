package o0OOo0o;

import com.orion.notein.domain.models.folder.Folder;
import java.io.File;
import kotlin.coroutines.Continuation;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o0000oOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase$copyThumbnailIfAny$2", m80623f = "NoteInFileUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27394o0000oOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Folder f95491OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f95492OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95493OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ File f95494OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27394o0000oOO(Folder folder, File file, Continuation continuation, C27387o0000o0 c27387o0000o0) {
        super(2, continuation);
        this.f95491OooOo = folder;
        this.f95494OooOoO0 = file;
        this.f95493OooOoO = c27387o0000o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27394o0000oOO c27394o0000oOO = new C27394o0000oOO(this.f95491OooOo, this.f95494OooOoO0, continuation, this.f95493OooOoO);
        c27394o0000oOO.f95492OooOo0o = obj;
        return c27394o0000oOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((C27394o0000oOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Folder folder = this.f95491OooOo;
        String tnPath = folder.getTnPath();
        if (tnPath.length() != 0) {
            File file = new File(tnPath);
            if (C31190OooO0oo.OooOOo(file)) {
                File file2 = new File(this.f95494OooOoO0, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("folder_tn_", file.getName()));
                try {
                    C27387o0000o0.OooooO0(file, file2);
                    objOooO00o = file2;
                } catch (Throwable th) {
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                }
                Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o == null) {
                    return objOooO00o;
                }
                C34406OooO00o.f123390OooO00o.OooO0Oo(thOooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("copyThumbnailIfAny failed for ", folder.getId()), new Object[0]);
                return null;
            }
        }
        return null;
    }
}
