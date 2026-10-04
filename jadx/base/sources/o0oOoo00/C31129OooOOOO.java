package o0oOoo00;

import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0oOoo00.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupViewModel$selectNoteinFile$1", m80623f = "BackupViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C31129OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f111086OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C31114OooO f111087OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31129OooOOOO(C31114OooO c31114OooO, String str, Continuation<? super C31129OooOOOO> continuation) {
        super(2, continuation);
        this.f111087OooOo0o = c31114OooO;
        this.f111086OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31129OooOOOO(this.f111087OooOo0o, this.f111086OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31129OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33781o00o0O c33781o00o0O = this.f111087OooOo0o.f111043OooOo0O;
        Set setO0Oo0oo = oOo000Oo.OooOo.o0Oo0oo((Iterable) c33781o00o0O.getValue());
        String str = this.f111086OooOo;
        if (setO0Oo0oo.contains(str)) {
            setO0Oo0oo.remove(str);
        } else {
            setO0Oo0oo.add(str);
        }
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, setO0Oo0oo);
        return C32460OooOooO.f116667OooO00o;
    }
}
