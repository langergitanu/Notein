package o0O0oooO;

import android.content.Context;
import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0OOOoo.C27205OooO0OO;
import o0Oo0O00.C28051OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: renamed from: o0O0oooO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26256OooO0o {

    /* JADX INFO: renamed from: o0O0oooO.OooO0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.AppKt$doesUserAgreeToPrivacyPolicy$preferences$1", m80623f = "App.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_3}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Context f89714OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f89715OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f89714OooOo = context;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f89714OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f89715OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = C28051OooO00o.OooO00o(this.f89714OooOo).getData();
            this.f89715OooOo0o = 1;
            Object objOooOOo = C25252OooO0Oo.OooOOo(data, this);
            return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
        }
    }

    public static final boolean OooO00o(Context context) {
        AbstractC24338OooO0o0 preferences = (AbstractC24338OooO0o0) C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new OooO00o(context, null));
        kotlin.jvm.internal.OooOOO0.OooO0oO(preferences, "preferences");
        Boolean bool = (Boolean) preferences.OooO0OO(C27205OooO0OO.f95002OooO00o);
        Integer num = (Integer) preferences.OooO0OO(C27205OooO0OO.f95003OooO0O0);
        return kotlin.jvm.internal.OooOOO0.OooO0O0(bool, Boolean.FALSE) || (num != null && num.intValue() == 1);
    }
}
