package o000ooOO;

import kotlin.coroutines.Continuation;
import o000oo0.AbstractC24673OooOo0O;
import o000oo0.InterfaceC24687Oooo0O0;
import o000oo0.InterfaceC24688Oooo0OO;
import o000oo0o.InterfaceC24729OooOo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o000ooOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", m80623f = "DBUtil.android.kt", m80624l = {56, 57, 59, 60}, m80625m = "invokeSuspend")
public final class C24740OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC24688Oooo0OO, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f83917OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC24688Oooo0OO.OooO00o f83918OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f83919OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f83920OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ boolean f83921OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o f83922OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ AbstractC24673OooOo0O f83923OooOoo0;

    /* JADX INFO: renamed from: o000ooOO.OooO0oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", m80623f = "DBUtil.android.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC24687Oooo0O0<Object>, Continuation<Object>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32507OooOO0o f83924OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f83925OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(InterfaceC32507OooOO0o interfaceC32507OooOO0o, Continuation continuation) {
            super(2, continuation);
            this.f83924OooOo = interfaceC32507OooOO0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f83924OooOo, continuation);
            oooO00o.f83925OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC24687Oooo0O0<Object> interfaceC24687Oooo0O0, Continuation<Object> continuation) {
            return ((OooO00o) create(interfaceC24687Oooo0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC24687Oooo0O0 interfaceC24687Oooo0O0 = (InterfaceC24687Oooo0O0) this.f83925OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC24687Oooo0O0, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
            return this.f83924OooOo.invoke(((InterfaceC24729OooOo0o) interfaceC24687Oooo0O0).OooO00o());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24740OooO0oo(Continuation continuation, AbstractC24673OooOo0O abstractC24673OooOo0O, InterfaceC32507OooOO0o interfaceC32507OooOO0o, boolean z, boolean z2) {
        super(2, continuation);
        this.f83919OooOoO = z;
        this.f83921OooOoOO = z2;
        this.f83923OooOoo0 = abstractC24673OooOo0O;
        this.f83922OooOoo = interfaceC32507OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C24740OooO0oo c24740OooO0oo = new C24740OooO0oo(continuation, this.f83923OooOoo0, this.f83922OooOoo, this.f83919OooOoO, this.f83921OooOoOO);
        c24740OooO0oo.f83920OooOoO0 = obj;
        return c24740OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC24688Oooo0OO interfaceC24688Oooo0OO, Continuation<Object> continuation) {
        return ((C24740OooO0oo) create(interfaceC24688Oooo0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[PHI: r1 r11
      0x009e: PHI (r1v11 o000oo0.Oooo0OO) = (r1v8 o000oo0.Oooo0OO), (r1v17 o000oo0.Oooo0OO) binds: [B:34:0x009b, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r11v17 java.lang.Object) = (r11v15 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x009b, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3 A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC24688Oooo0OO.OooO00o oooO00o;
        InterfaceC24688Oooo0OO interfaceC24688Oooo0OO;
        InterfaceC24688Oooo0OO.OooO00o oooO00o2;
        InterfaceC24688Oooo0OO interfaceC24688Oooo0OO2;
        InterfaceC24688Oooo0OO interfaceC24688Oooo0OO3;
        Object obj2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f83917OooOo;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = this.f83922OooOoo;
        AbstractC24673OooOo0O abstractC24673OooOo0O = this.f83923OooOoo0;
        boolean z = this.f83921OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC24688Oooo0OO interfaceC24688Oooo0OO4 = (InterfaceC24688Oooo0OO) this.f83920OooOoO0;
            if (!this.f83919OooOoO) {
                kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC24688Oooo0OO4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return interfaceC32507OooOO0o.invoke(((InterfaceC24729OooOo0o) interfaceC24688Oooo0OO4).OooO00o());
            }
            oooO00o = z ? InterfaceC24688Oooo0OO.OooO00o.f83659OooOo0o : InterfaceC24688Oooo0OO.OooO00o.f83658OooOo;
            if (!z) {
                this.f83920OooOoO0 = interfaceC24688Oooo0OO4;
                this.f83918OooOo0o = oooO00o;
                this.f83917OooOo = 1;
                Object objOooO0OO = interfaceC24688Oooo0OO4.OooO0OO(this);
                if (objOooO0OO != enumC32485OooO00o) {
                    interfaceC24688Oooo0OO2 = interfaceC24688Oooo0OO4;
                    obj = objOooO0OO;
                }
                return enumC32485OooO00o;
            }
            InterfaceC24688Oooo0OO.OooO00o oooO00o3 = oooO00o;
            interfaceC24688Oooo0OO = interfaceC24688Oooo0OO4;
            oooO00o2 = oooO00o3;
            OooO00o oooO00o4 = new OooO00o(interfaceC32507OooOO0o, null);
            this.f83920OooOoO0 = interfaceC24688Oooo0OO;
            this.f83918OooOo0o = null;
            this.f83917OooOo = 3;
            obj = interfaceC24688Oooo0OO.OooO0Oo(oooO00o2, oooO00o4, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i == 2) {
                oooO00o = this.f83918OooOo0o;
                interfaceC24688Oooo0OO3 = (InterfaceC24688Oooo0OO) this.f83920OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                oooO00o2 = oooO00o;
                interfaceC24688Oooo0OO = interfaceC24688Oooo0OO3;
                OooO00o oooO00o42 = new OooO00o(interfaceC32507OooOO0o, null);
                this.f83920OooOoO0 = interfaceC24688Oooo0OO;
                this.f83918OooOo0o = null;
                this.f83917OooOo = 3;
                obj = interfaceC24688Oooo0OO.OooO0Oo(oooO00o2, oooO00o42, this);
                if (obj != enumC32485OooO00o) {
                    if (!z) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f83920OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    androidx.room.OooO0OO oooO0OOOooOO0 = abstractC24673OooOo0O.OooOO0();
                    oooO0OOOooOO0.f66184OooO0OO.OooO0o0(oooO0OOOooOO0.f66186OooO0o, oooO0OOOooOO0.f66188OooO0oO);
                }
                return obj2;
            }
            interfaceC24688Oooo0OO = (InterfaceC24688Oooo0OO) this.f83920OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            if (!z) {
                return obj;
            }
            this.f83920OooOoO0 = obj;
            this.f83917OooOo = 4;
            Object objOooO0OO2 = interfaceC24688Oooo0OO.OooO0OO(this);
            if (objOooO0OO2 != enumC32485OooO00o) {
                obj2 = obj;
                obj = objOooO0OO2;
                if (!((Boolean) obj).booleanValue()) {
                }
                return obj2;
            }
            return enumC32485OooO00o;
        }
        oooO00o = this.f83918OooOo0o;
        interfaceC24688Oooo0OO2 = (InterfaceC24688Oooo0OO) this.f83920OooOoO0;
        C32446OooOOOo.OooO0O0(obj);
        if (((Boolean) obj).booleanValue()) {
            oooO00o2 = oooO00o;
            interfaceC24688Oooo0OO = interfaceC24688Oooo0OO2;
            OooO00o oooO00o422 = new OooO00o(interfaceC32507OooOO0o, null);
            this.f83920OooOoO0 = interfaceC24688Oooo0OO;
            this.f83918OooOo0o = null;
            this.f83917OooOo = 3;
            obj = interfaceC24688Oooo0OO.OooO0Oo(oooO00o2, oooO00o422, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        androidx.room.OooO0OO oooO0OOOooOO02 = abstractC24673OooOo0O.OooOO0();
        this.f83920OooOoO0 = interfaceC24688Oooo0OO2;
        this.f83918OooOo0o = oooO00o;
        this.f83917OooOo = 2;
        if (oooO0OOOooOO02.OooO0OO(this) != enumC32485OooO00o) {
            interfaceC24688Oooo0OO3 = interfaceC24688Oooo0OO2;
            oooO00o2 = oooO00o;
            interfaceC24688Oooo0OO = interfaceC24688Oooo0OO3;
            OooO00o oooO00o4222 = new OooO00o(interfaceC32507OooOO0o, null);
            this.f83920OooOoO0 = interfaceC24688Oooo0OO;
            this.f83918OooOo0o = null;
            this.f83917OooOo = 3;
            obj = interfaceC24688Oooo0OO.OooO0Oo(oooO00o2, oooO00o4222, this);
            if (obj != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
