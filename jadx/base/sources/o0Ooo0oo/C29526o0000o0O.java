package o0Ooo0oo;

import com.orion.notein.domain.models.note.PenInfo;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OO.C26424Oooo;
import o0OO.C26429Oooo0o;
import o0OO.C26430Oooo0o0;
import o0OO.C26431Oooo0oO;
import o0OO.C26433OoooO0;
import o0OO.C26434OoooO00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33764OoooOOo;
import oO0o0Oo.C33765OoooOo0;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33801OooOOO;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0Ooo0oo.o0000o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$special$$inlined$flatMapLatest$1", m80623f = "PenBarViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C29526o0000o0O extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends PenInfo>>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f104729OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104730OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104731OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f104732OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29526o0000o0O(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, Continuation continuation) {
        super(3, continuation);
        this.f104731OooOoO = oooO0O0;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends PenInfo>> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C29526o0000o0O c29526o0000o0O = new C29526o0000o0O(this.f104731OooOoO, continuation);
        c29526o0000o0O.f104729OooOo = interfaceC33723OooO0oO;
        c29526o0000o0O.f104732OooOoO0 = str;
        return c29526o0000o0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104730OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f104729OooOo;
            String noteId = (String) this.f104732OooOoO0;
            C26433OoooO0 c26433OoooO0 = this.f104731OooOoO.f75143OooO0o0;
            c26433OoooO0.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            C33770OooooO0 c33770OooooO0 = new C33770OooooO0(new C26430Oooo0o0(C34429OooOOo0.OooOO0o(C26429Oooo0o.f90756OooO00o, C26429Oooo0o.f90757OooO0O0, C26429Oooo0o.f90758OooO0OO, C26429Oooo0o.f90759OooO0Oo, C26429Oooo0o.f90761OooO0o0, C26429Oooo0o.f90760OooO0o, C26429Oooo0o.f90762OooO0oO, C26429Oooo0o.f90763OooO0oo, C26429Oooo0o.f90755OooO, C26429Oooo0o.f90764OooOO0, C26429Oooo0o.f90765OooOO0O), null));
            C26424Oooo c26424Oooo = c26433OoooO0.f90780OooO00o;
            C26431Oooo0oO c26431Oooo0oO = new C26431Oooo0oO(c26424Oooo.f90732OooO00o.OooO0O0(noteId), c26424Oooo);
            C26434OoooO00 c26434OoooO00 = new C26434OoooO00(c26433OoooO0, noteId, null);
            this.f104730OooOo0o = 1;
            C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
            Object objOooO00o = C33801OooOOO.OooO00o(this, C33765OoooOo0.f121745OooOo0o, new C33764OoooOOo(c26434OoooO00, null), interfaceC33723OooO0oO, new InterfaceC33721OooO0o[]{c33770OooooO0, c26431Oooo0oO});
            if (objOooO00o != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o == obj2) {
                return obj2;
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
