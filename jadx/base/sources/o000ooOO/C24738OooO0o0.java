package o000ooOO;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import o000oo0.AbstractC24673OooOo0O;
import o000oo0.InterfaceC24687Oooo0O0;
import o000oo0.InterfaceC24688Oooo0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o000ooOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3", m80623f = "DBUtil.android.kt", m80624l = {StyleIdentifier.LIGHT_LIST_ACCENT_6}, m80625m = "invokeSuspend")
public final class C24738OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24673OooOo0O f83900OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f83901OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Continuation<Object>, Object> f83902OooOoO0;

    /* JADX INFO: renamed from: o000ooOO.OooO0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1", m80623f = "DBUtil.android.kt", m80624l = {56, 57, 59, 60, 67}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC24688Oooo0OO, Continuation<Object>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f83903OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public InterfaceC24688Oooo0OO.OooO00o f83904OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ AbstractC24673OooOo0O f83905OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f83906OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32507OooOO0o f83907OooOoOO;

        /* JADX INFO: renamed from: o000ooOO.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1$1", m80623f = "DBUtil.android.kt", m80624l = {60}, m80625m = "invokeSuspend")
        public static final class C19649OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC24687Oooo0O0<Object>, Continuation<Object>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ Object f83908OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f83909OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ InterfaceC32507OooOO0o f83910OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19649OooO00o(InterfaceC32507OooOO0o interfaceC32507OooOO0o, Continuation continuation) {
                super(2, continuation);
                this.f83910OooOoO0 = interfaceC32507OooOO0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19649OooO00o c19649OooO00o = new C19649OooO00o(this.f83910OooOoO0, continuation);
                c19649OooO00o.f83908OooOo = obj;
                return c19649OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC24687Oooo0O0<Object> interfaceC24687Oooo0O0, Continuation<Object> continuation) {
                return ((C19649OooO00o) create(interfaceC24687Oooo0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f83909OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return obj;
                }
                C32446OooOOOo.OooO0O0(obj);
                this.f83909OooOo0o = 1;
                Object objInvoke = this.f83910OooOoO0.invoke(this);
                return objInvoke == enumC32485OooO00o ? enumC32485OooO00o : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Continuation continuation, AbstractC24673OooOo0O abstractC24673OooOo0O, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
            super(2, continuation);
            this.f83905OooOoO = abstractC24673OooOo0O;
            this.f83907OooOoOO = interfaceC32507OooOO0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation, this.f83905OooOoO, this.f83907OooOoOO);
            oooO00o.f83906OooOoO0 = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC24688Oooo0OO interfaceC24688Oooo0OO, Continuation<Object> continuation) {
            return ((OooO00o) create(interfaceC24688Oooo0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[PHI: r1 r10
          0x0094: PHI (r1v7 o000oo0.Oooo0OO) = (r1v4 o000oo0.Oooo0OO), (r1v13 o000oo0.Oooo0OO) binds: [B:31:0x0091, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]
          0x0094: PHI (r10v13 java.lang.Object) = (r10v11 java.lang.Object), (r10v0 java.lang.Object) binds: [B:31:0x0091, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
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
            Object objOooO0OO;
            Object obj2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f83903OooOo;
            InterfaceC32507OooOO0o interfaceC32507OooOO0o = this.f83907OooOoOO;
            AbstractC24673OooOo0O abstractC24673OooOo0O = this.f83905OooOoO;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC24688Oooo0OO interfaceC24688Oooo0OO4 = (InterfaceC24688Oooo0OO) this.f83906OooOoO0;
                oooO00o = InterfaceC24688Oooo0OO.OooO00o.f83658OooOo;
                this.f83906OooOoO0 = interfaceC24688Oooo0OO4;
                this.f83904OooOo0o = oooO00o;
                this.f83903OooOo = 1;
                Object objOooO0OO2 = interfaceC24688Oooo0OO4.OooO0OO(this);
                if (objOooO0OO2 != enumC32485OooO00o) {
                    interfaceC24688Oooo0OO = interfaceC24688Oooo0OO4;
                    obj = objOooO0OO2;
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i == 2) {
                    oooO00o = this.f83904OooOo0o;
                    interfaceC24688Oooo0OO3 = (InterfaceC24688Oooo0OO) this.f83906OooOoO0;
                    C32446OooOOOo.OooO0O0(obj);
                    oooO00o2 = oooO00o;
                    interfaceC24688Oooo0OO2 = interfaceC24688Oooo0OO3;
                    C19649OooO00o c19649OooO00o = new C19649OooO00o(interfaceC32507OooOO0o, null);
                    this.f83906OooOoO0 = interfaceC24688Oooo0OO2;
                    this.f83904OooOo0o = null;
                    this.f83903OooOo = 3;
                    obj = interfaceC24688Oooo0OO2.OooO0Oo(oooO00o2, c19649OooO00o, this);
                    if (obj != enumC32485OooO00o) {
                        this.f83906OooOoO0 = obj;
                        this.f83903OooOo = 4;
                        objOooO0OO = interfaceC24688Oooo0OO2.OooO0OO(this);
                        if (objOooO0OO != enumC32485OooO00o) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return obj;
                    }
                    obj2 = this.f83906OooOoO0;
                    C32446OooOOOo.OooO0O0(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        androidx.room.OooO0OO oooO0OOOooOO0 = abstractC24673OooOo0O.OooOO0();
                        oooO0OOOooOO0.f66184OooO0OO.OooO0o0(oooO0OOOooOO0.f66186OooO0o, oooO0OOOooOO0.f66188OooO0oO);
                    }
                    return obj2;
                }
                interfaceC24688Oooo0OO2 = (InterfaceC24688Oooo0OO) this.f83906OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                this.f83906OooOoO0 = obj;
                this.f83903OooOo = 4;
                objOooO0OO = interfaceC24688Oooo0OO2.OooO0OO(this);
                if (objOooO0OO != enumC32485OooO00o) {
                    obj2 = obj;
                    obj = objOooO0OO;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return obj2;
                }
                return enumC32485OooO00o;
            }
            oooO00o = this.f83904OooOo0o;
            interfaceC24688Oooo0OO = (InterfaceC24688Oooo0OO) this.f83906OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                oooO00o2 = oooO00o;
                interfaceC24688Oooo0OO2 = interfaceC24688Oooo0OO;
                C19649OooO00o c19649OooO00o2 = new C19649OooO00o(interfaceC32507OooOO0o, null);
                this.f83906OooOoO0 = interfaceC24688Oooo0OO2;
                this.f83904OooOo0o = null;
                this.f83903OooOo = 3;
                obj = interfaceC24688Oooo0OO2.OooO0Oo(oooO00o2, c19649OooO00o2, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            androidx.room.OooO0OO oooO0OOOooOO02 = abstractC24673OooOo0O.OooOO0();
            this.f83906OooOoO0 = interfaceC24688Oooo0OO;
            this.f83904OooOo0o = oooO00o;
            this.f83903OooOo = 2;
            if (oooO0OOOooOO02.OooO0OO(this) != enumC32485OooO00o) {
                interfaceC24688Oooo0OO3 = interfaceC24688Oooo0OO;
                oooO00o2 = oooO00o;
                interfaceC24688Oooo0OO2 = interfaceC24688Oooo0OO3;
                C19649OooO00o c19649OooO00o22 = new C19649OooO00o(interfaceC32507OooOO0o, null);
                this.f83906OooOoO0 = interfaceC24688Oooo0OO2;
                this.f83904OooOo0o = null;
                this.f83903OooOo = 3;
                obj = interfaceC24688Oooo0OO2.OooO0Oo(oooO00o2, c19649OooO00o22, this);
                if (obj != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24738OooO0o0(Continuation continuation, AbstractC24673OooOo0O abstractC24673OooOo0O, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        super(2, continuation);
        this.f83900OooOo = abstractC24673OooOo0O;
        this.f83902OooOoO0 = interfaceC32507OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C24738OooO0o0(continuation, this.f83900OooOo, this.f83902OooOoO0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
        return ((C24738OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f83901OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC32507OooOO0o<Continuation<Object>, Object> interfaceC32507OooOO0o = this.f83902OooOoO0;
        AbstractC24673OooOo0O abstractC24673OooOo0O = this.f83900OooOo;
        OooO00o oooO00o = new OooO00o(null, abstractC24673OooOo0O, interfaceC32507OooOO0o);
        this.f83901OooOo0o = 1;
        Object objOooOo00 = abstractC24673OooOo0O.OooOo00(false, oooO00o, this);
        return objOooOo00 == enumC32485OooO00o ? enumC32485OooO00o : objOooOo00;
    }
}
