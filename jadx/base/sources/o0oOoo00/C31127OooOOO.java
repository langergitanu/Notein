package o0oOoo00;

import com.orion.notein.domain.models.backup.BackupFile;
import java.util.ArrayList;
import java.util.Iterator;
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
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0oOoo00.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupViewModel$selectAllRestoreFiles$1", m80623f = "BackupViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C31127OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C31114OooO f111081OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f111082OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31127OooOOO(boolean z, C31114OooO c31114OooO, Continuation<? super C31127OooOOO> continuation) {
        super(2, continuation);
        this.f111082OooOo0o = z;
        this.f111081OooOo = c31114OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31127OooOOO(this.f111082OooOo0o, this.f111081OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31127OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        boolean z = this.f111082OooOo0o;
        C31114OooO c31114OooO = this.f111081OooOo;
        if (z) {
            C33781o00o0O c33781o00o0O = c31114OooO.f111043OooOo0O;
            Iterable iterable = (Iterable) c31114OooO.f111041OooOo0.getValue();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((BackupFile) it.next()).getId());
            }
            Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, setO0OO00O);
        } else {
            C33781o00o0O c33781o00o0O2 = c31114OooO.f111043OooOo0O;
            C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, c34438OooOoo0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
