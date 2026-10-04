package o0o000oo;

import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: renamed from: o0o000oo.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarViewModel$_noteMeta$1", m80623f = "ToolbarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29853Ooooo0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<String, String, Continuation<? super InterfaceC33721OooO0o<? extends NoteMeta>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f105884OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ String f105885OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f105886OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29853Ooooo0o(o00Ooo o00ooo2, Continuation<? super C29853Ooooo0o> continuation) {
        super(3, continuation);
        this.f105886OooOoO0 = o00ooo2;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(String str, String str2, Continuation<? super InterfaceC33721OooO0o<? extends NoteMeta>> continuation) {
        C29853Ooooo0o c29853Ooooo0o = new C29853Ooooo0o(this.f105886OooOoO0, continuation);
        c29853Ooooo0o.f105885OooOo0o = str;
        c29853Ooooo0o.f105884OooOo = str2;
        return c29853Ooooo0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String str = this.f105885OooOo0o;
        String str2 = this.f105884OooOo;
        if (str == null || str2 == null) {
            return new C33716OooO(null);
        }
        C27449o00O0OoO c27449o00O0OoO = this.f105886OooOoO0.f105924OooO0Oo;
        c27449o00O0OoO.getClass();
        return c27449o00O0OoO.f96036OooO0O0.OooO0O0(str, str2);
    }
}
