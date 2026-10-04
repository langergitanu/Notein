package o0000oOO;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: renamed from: o0000oOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24335OooO0OO implements OooOO0<AbstractC24338OooO0o0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0<AbstractC24338OooO0o0> f81918OooO00o;

    /* JADX INFO: renamed from: o0000oOO.OooO0OO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", m80623f = "PreferenceDataStoreFactory.kt", m80624l = {94}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC24338OooO0o0, Continuation<? super AbstractC24338OooO0o0>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f81919OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f81920OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ AbstractC32476OooO f81921OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(InterfaceC32508OooOOOo<? super AbstractC24338OooO0o0, ? super Continuation<? super AbstractC24338OooO0o0>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f81921OooOoO0 = (AbstractC32476OooO) interfaceC32508OooOOOo;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f81921OooOoO0, continuation);
            oooO00o.f81919OooOo = obj;
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
            int i = this.f81920OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) this.f81919OooOo;
                this.f81920OooOo0o = 1;
                obj = this.f81921OooOoO0.invoke(abstractC24338OooO0o0, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            AbstractC24338OooO0o0 abstractC24338OooO0o02 = (AbstractC24338OooO0o0) obj;
            OooOOO0.OooO0o0(abstractC24338OooO0o02, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((AtomicBoolean) ((C24334OooO0O0) abstractC24338OooO0o02).f81916OooO0O0.f81914OooO00o).set(true);
            return abstractC24338OooO0o02;
        }
    }

    public C24335OooO0OO(OooOO0<AbstractC24338OooO0o0> oooOO02) {
        this.f81918OooO00o = oooOO02;
    }

    @Override // o0000o0O.OooOO0
    public final Object OooO00o(InterfaceC32508OooOOOo<? super AbstractC24338OooO0o0, ? super Continuation<? super AbstractC24338OooO0o0>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super AbstractC24338OooO0o0> continuation) {
        return this.f81918OooO00o.OooO00o(new OooO00o(interfaceC32508OooOOOo, null), continuation);
    }

    @Override // o0000o0O.OooOO0
    public final InterfaceC33721OooO0o<AbstractC24338OooO0o0> getData() {
        return this.f81918OooO00o.getData();
    }
}
