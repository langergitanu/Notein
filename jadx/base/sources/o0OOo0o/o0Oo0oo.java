package o0OOo0o;

import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$getNoteMetasInFolder$2", m80623f = "FolderUseCase.kt", m80624l = {230}, m80625m = "invokeSuspend")
public final class o0Oo0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends NoteMeta>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f96950OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96951OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Folder f96952OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(C27600o0ooOO0 c27600o0ooOO0, Folder folder, Continuation<? super o0Oo0oo> continuation) {
        super(2, continuation);
        this.f96950OooOo = c27600o0ooOO0;
        this.f96952OooOoO0 = folder;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0Oo0oo(this.f96950OooOo, this.f96952OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends NoteMeta>> continuation) {
        return ((o0Oo0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96951OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27600o0ooOO0 c27600o0ooOO0 = this.f96950OooOo;
        String strOooO0Oo = c27600o0ooOO0.f96984OooO0OO.OooO0Oo();
        Folder folder = this.f96952OooOoO0;
        o0OOO00o.OooO oooOOooO0oO = c27600o0ooOO0.f96983OooO0O0.OooO0oO(folder != null ? folder.getId() : null, strOooO0Oo);
        this.f96951OooOo0o = 1;
        Object objOooOOo = C25252OooO0Oo.OooOOo(oooOOooO0oO, this);
        return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
    }
}
