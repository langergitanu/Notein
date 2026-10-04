package o000oo0;

import android.database.SQLException;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o000oo0.InterfaceC24688Oooo0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o000oo0.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", m80623f = "InvalidationTracker.kt", m80624l = {413, 420}, m80625m = "invokeSuspend")
public final class C24697OoooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC24688Oooo0OO, Continuation<? super Set<? extends Integer>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f83700OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f83701OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24695OoooO00 f83702OooOoO0;

    /* JADX INFO: renamed from: o000oo0.OoooOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", m80623f = "InvalidationTracker.kt", m80624l = {421}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC24687Oooo0O0<Set<? extends Integer>>, Continuation<? super Set<? extends Integer>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f83703OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f83704OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C24695OoooO00 f83705OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C24695OoooO00 c24695OoooO00, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f83705OooOoO0 = c24695OoooO00;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f83705OooOoO0, continuation);
            oooO00o.f83703OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC24687Oooo0O0<Set<? extends Integer>> interfaceC24687Oooo0O0, Continuation<? super Set<? extends Integer>> continuation) {
            return ((OooO00o) create(interfaceC24687Oooo0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f83704OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC24687Oooo0O0 interfaceC24687Oooo0O0 = (InterfaceC24687Oooo0O0) this.f83703OooOo;
            this.f83704OooOo0o = 1;
            Object objOooO00o = C24695OoooO00.OooO00o(this.f83705OooOoO0, interfaceC24687Oooo0O0, this);
            return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24697OoooOO0(C24695OoooO00 c24695OoooO00, Continuation<? super C24697OoooOO0> continuation) {
        super(2, continuation);
        this.f83702OooOoO0 = c24695OoooO00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C24697OoooOO0 c24697OoooOO0 = new C24697OoooOO0(this.f83702OooOoO0, continuation);
        c24697OoooOO0.f83700OooOo = obj;
        return c24697OoooOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC24688Oooo0OO interfaceC24688Oooo0OO, Continuation<? super Set<? extends Integer>> continuation) {
        return ((C24697OoooOO0) create(interfaceC24688Oooo0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC24688Oooo0OO interfaceC24688Oooo0OO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f83701OooOo0o;
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC24688Oooo0OO = (InterfaceC24688Oooo0OO) this.f83700OooOo;
                this.f83700OooOo = interfaceC24688Oooo0OO;
                this.f83701OooOo0o = 1;
                obj = interfaceC24688Oooo0OO.OooO0OO(this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return (Set) obj;
            }
            interfaceC24688Oooo0OO = (InterfaceC24688Oooo0OO) this.f83700OooOo;
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
                InterfaceC24688Oooo0OO.OooO00o oooO00o = InterfaceC24688Oooo0OO.OooO00o.f83658OooOo;
                OooO00o oooO00o2 = new OooO00o(this.f83702OooOoO0, null);
                this.f83700OooOo = null;
                this.f83701OooOo0o = 2;
                obj = interfaceC24688Oooo0OO.OooO0Oo(oooO00o, oooO00o2, this);
            }
        } catch (SQLException unused) {
        }
        return c34438OooOoo0;
    }
}
