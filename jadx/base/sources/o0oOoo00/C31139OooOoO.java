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

/* JADX INFO: renamed from: o0oOoo00.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$selectFile$1", m80623f = "CloudBackupViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C31139OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f111108OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.backup.OooO00o f111109OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31139OooOoO(com.orion.notein.p607ui.backup.OooO00o oooO00o, String str, Continuation<? super C31139OooOoO> continuation) {
        super(2, continuation);
        this.f111109OooOo0o = oooO00o;
        this.f111108OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31139OooOoO(this.f111109OooOo0o, this.f111108OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31139OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33781o00o0O c33781o00o0O = this.f111109OooOo0o.f70709OooOoo;
        Set setO0Oo0oo = oOo000Oo.OooOo.o0Oo0oo((Iterable) c33781o00o0O.getValue());
        String str = this.f111108OooOo;
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
