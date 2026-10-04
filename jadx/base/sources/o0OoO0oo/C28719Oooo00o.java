package o0OoO0oo;

import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.LockNoteFragment$unlockNote$2", m80623f = "LockNoteFragment.kt", m80624l = {142, 146}, m80625m = "invokeSuspend")
public final class C28719Oooo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LockNoteFragment f101746OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101747OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ oO0O000o.OooO00o<C32460OooOooO> f101748OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f101749OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.OooOo f101750OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ oO0O000o.OooO00o<C32460OooOooO> f101751OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28719Oooo00o(LockNoteFragment lockNoteFragment, List list, oO0O000o.OooO00o oooO00o, androidx.lifecycle.OooOo oooOo, oO0O000o.OooO00o oooO00o2, Continuation continuation) {
        super(2, continuation);
        this.f101746OooOo = lockNoteFragment;
        this.f101749OooOoO0 = list;
        this.f101748OooOoO = oooO00o;
        this.f101750OooOoOO = oooOo;
        this.f101751OooOoo0 = oooO00o2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        oO0O000o.OooO00o<C32460OooOooO> oooO00o = this.f101751OooOoo0;
        return new C28719Oooo00o(this.f101746OooOo, this.f101749OooOoO0, this.f101748OooOoO, this.f101750OooOoOO, oooO00o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28719Oooo00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r7 == r0) goto L18;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101747OooOo0o;
        oO0O000o.OooO00o<C32460OooOooO> oooO00o = this.f101748OooOoO;
        LockNoteFragment lockNoteFragment = this.f101746OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28729OoooO0O c28729OoooO0OOooOoOO = lockNoteFragment.OooOoOO();
            this.f101747OooOo0o = 1;
            obj = c28729OoooO0OOooOoOO.OooO0o0(this.f101749OooOoO0, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                String string = lockNoteFragment.getString(R.string.biometric_prompt_title_unlock_note);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                LockNoteFragment.OooOoO(lockNoteFragment, this.f101750OooOoOO, string, oooO00o, this.f101751OooOoo0);
            } else {
                oooO00o.invoke();
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        if (!((Boolean) obj).booleanValue()) {
            oooO00o.invoke();
            return C32460OooOooO.f116667OooO00o;
        }
        C28729OoooO0O c28729OoooO0OOooOoOO2 = lockNoteFragment.OooOoOO();
        this.f101747OooOo0o = 2;
        obj = c28729OoooO0OOooOoOO2.f101773OooO0Oo.OooO0Oo(this);
    }
}
