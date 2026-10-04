package o0000oOO;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import o0000o0O.OooOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0000oOO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24332OooO {

    /* JADX INFO: renamed from: o0000oOO.OooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m80623f = "Preferences.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_5}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC24338OooO0o0, Continuation<? super AbstractC24338OooO0o0>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f81911OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f81912OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ AbstractC32476OooO f81913OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(InterfaceC32508OooOOOo<? super C24334OooO0O0, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f81913OooOoO0 = (AbstractC32476OooO) interfaceC32508OooOOOo;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f81913OooOoO0, continuation);
            oooO00o.f81911OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(AbstractC24338OooO0o0 abstractC24338OooO0o0, Continuation<? super AbstractC24338OooO0o0> continuation) {
            return ((OooO00o) create(abstractC24338OooO0o0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f81912OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f81911OooOo;
                C32446OooOOOo.OooO0O0(obj);
                return c24334OooO0O0;
            }
            C32446OooOOOo.OooO0O0(obj);
            C24334OooO0O0 c24334OooO0O0OooO0Oo = ((AbstractC24338OooO0o0) this.f81911OooOo).OooO0Oo();
            this.f81911OooOo = c24334OooO0O0OooO0Oo;
            this.f81912OooOo0o = 1;
            return this.f81913OooOoO0.invoke(c24334OooO0O0OooO0Oo, this) == enumC32485OooO00o ? enumC32485OooO00o : c24334OooO0O0OooO0Oo;
        }
    }

    public static final Object OooO00o(OooOO0<AbstractC24338OooO0o0> oooOO02, InterfaceC32508OooOOOo<? super C24334OooO0O0, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super AbstractC24338OooO0o0> continuation) {
        return oooOO02.OooO00o(new OooO00o(interfaceC32508OooOOOo, null), continuation);
    }
}
