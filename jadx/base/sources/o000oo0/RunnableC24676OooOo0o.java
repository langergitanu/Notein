package o000oo0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Ooo.C33843OooOoO;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o000oo0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24676OooOo0o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33614OooOOO0 f83611OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34415OooO0oo f83612OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooOo f83613OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC24673OooOo0O f83614OooOoO0;

    /* JADX INFO: renamed from: o000oo0.OooOo0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", m80623f = "RoomDatabase.android.kt", m80624l = {2048}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f83615OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f83616OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C33614OooOOO0 f83617OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ AbstractC24673OooOo0O f83618OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ OooOo f83619OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC24673OooOo0O abstractC24673OooOo0O, C33614OooOOO0 c33614OooOOO0, OooOo oooOo, Continuation continuation) {
            super(2, continuation);
            this.f83618OooOoO0 = abstractC24673OooOo0O;
            this.f83617OooOoO = c33614OooOOO0;
            this.f83619OooOoOO = oooOo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f83618OooOoO0, this.f83617OooOoO, this.f83619OooOoOO, continuation);
            oooO00o.f83615OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Continuation continuation;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f83616OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = ((InterfaceC33636Oooo00o) this.f83615OooOo).OooOOO0().get(InterfaceC34412OooO0o.OooO00o.f123422OooOo0o);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
                InterfaceC34412OooO0o interfaceC34412OooO0o = (InterfaceC34412OooO0o) oooO0O0;
                C24685Oooo00O c24685Oooo00O = new C24685Oooo00O(interfaceC34412OooO0o);
                InterfaceC34415OooO0oo interfaceC34415OooO0ooPlus = interfaceC34412OooO0o.plus(c24685Oooo00O).plus(new C33843OooOoO(Integer.valueOf(System.identityHashCode(c24685Oooo00O)), this.f83618OooOoO0.f83577OooO));
                C33614OooOOO0 c33614OooOOO0 = this.f83617OooOoO;
                this.f83615OooOo = c33614OooOOO0;
                this.f83616OooOo0o = 1;
                obj = C33609OooO0oo.OooO0o(interfaceC34415OooO0ooPlus, this.f83619OooOoOO, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                continuation = c33614OooOOO0;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                continuation = (Continuation) this.f83615OooOo;
                C32446OooOOOo.OooO0O0(obj);
            }
            continuation.resumeWith(obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public RunnableC24676OooOo0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, C33614OooOOO0 c33614OooOOO0, AbstractC24673OooOo0O abstractC24673OooOo0O, OooOo oooOo) {
        this.f83612OooOo0o = interfaceC34415OooO0oo;
        this.f83611OooOo = c33614OooOOO0;
        this.f83614OooOoO0 = abstractC24673OooOo0O;
        this.f83613OooOoO = oooOo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C33614OooOOO0 c33614OooOOO0 = this.f83611OooOo;
        try {
            C33609OooO0oo.OooO0Oo(this.f83612OooOo0o.minusKey(InterfaceC34412OooO0o.OooO00o.f123422OooOo0o), new OooO00o(this.f83614OooOoO0, c33614OooOOO0, this.f83613OooOoO, null));
        } catch (Throwable th) {
            c33614OooOOO0.cancel(th);
        }
    }
}
