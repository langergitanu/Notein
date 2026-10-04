package o0o0OoOO;

import android.content.Context;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00.C25206OooO0Oo;
import o0o0OoOo.C30722OooO00o;
import o0o0OoOo.C30739OooOOoo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OoOO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$initHomepageLoadTrace$2$1", m80623f = "DebugFragment.kt", m80624l = {376}, m80625m = "invokeSuspend")
public final class C30698OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DebugFragment f109796OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109797OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f109798OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30698OooOOo0(DebugFragment debugFragment, String str, Continuation<? super C30698OooOOo0> continuation) {
        super(2, continuation);
        this.f109796OooOo = debugFragment;
        this.f109798OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30698OooOOo0(this.f109796OooOo, this.f109798OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30698OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109797OooOo0o;
        DebugFragment debugFragment = this.f109796OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
            C30722OooO00o c30722OooO00oOooOoO = debugFragment.OooOoO();
            this.f109797OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30739OooOOoo(c30722OooO00oOooOoO, this.f109798OooOoO0, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C30722OooO00o.C20122OooO00o c20122OooO00o = (C30722OooO00o.C20122OooO00o) obj;
        if (c20122OooO00o == null) {
            Context context = debugFragment.getContext();
            if (context != null) {
                String string = debugFragment.getString(R.string.debug_note_not_found);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("DebugFragment");
        int i2 = c20122OooO00o.f109885OooO0OO;
        Integer num = new Integer(i2);
        int i3 = c20122OooO00o.f109886OooO0Oo;
        Integer num2 = new Integer(i3);
        long j = c20122OooO00o.f109887OooO0o0;
        c20358OooO00o.OooO0o0("Homepage stroke load: noteId=%s pageId=%s strokes=%d points=%d elapsed=%dms", c20122OooO00o.f109883OooO00o, c20122OooO00o.f109884OooO0O0, num, num2, new Long(j));
        Context context2 = debugFragment.getContext();
        if (context2 != null) {
            String string2 = debugFragment.getString(R.string.debug_homepage_load_result, new Integer(i2), new Integer(i3), new Long(j));
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            C25206OooO0Oo.OooO0oO(context2, string2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
