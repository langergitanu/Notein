package o0000o0O;

import kotlin.coroutines.Continuation;
import o0OO00o0.o000;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.C33737OooOo00;
import oO0o0Oo.C33744OooOoo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0000o0O.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$data$1", m80623f = "DataStoreImpl.kt", m80624l = {72, 74, 100}, m80625m = "invokeSuspend")
public final class C24255OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<Object>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f81583OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24251OooO0o0 f81584OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f81585OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f81586OooOoO0;

    /* JADX INFO: renamed from: o0000o0O.OooOOOo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$data$1$1", m80623f = "DataStoreImpl.kt", m80624l = {102}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super AbstractC24302o0ooOO0<Object>>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOOO<Object> f81587OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f81588OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOOO<Object> oooOOO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f81587OooOo = oooOOO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f81587OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33723OooO0oO<? super AbstractC24302o0ooOO0<Object>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f81588OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f81588OooOo0o = 1;
                if (OooOOO.OooO0Oo(this.f81587OooOo, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
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

    /* JADX INFO: renamed from: o0000o0O.OooOOOo$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$data$1$2", m80623f = "DataStoreImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC24302o0ooOO0<Object>, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f81589OooOo0o;

        public OooO0O0() {
            throw null;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(2, continuation);
            oooO0O0.f81589OooOo0o = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(AbstractC24302o0ooOO0<Object> abstractC24302o0ooOO0, Continuation<? super Boolean> continuation) {
            return ((OooO0O0) create(abstractC24302o0ooOO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return Boolean.valueOf(!(((AbstractC24302o0ooOO0) this.f81589OooOo0o) instanceof C24280OoooO));
        }
    }

    /* JADX INFO: renamed from: o0000o0O.OooOOOo$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$data$1$3", m80623f = "DataStoreImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC24302o0ooOO0<Object>, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC24302o0ooOO0<Object> f81590OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f81591OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(AbstractC24302o0ooOO0<Object> abstractC24302o0ooOO0, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f81590OooOo = abstractC24302o0ooOO0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f81590OooOo, continuation);
            oooO0OO.f81591OooOo0o = obj;
            return oooO0OO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(AbstractC24302o0ooOO0<Object> abstractC24302o0ooOO0, Continuation<? super Boolean> continuation) {
            return ((OooO0OO) create(abstractC24302o0ooOO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            AbstractC24302o0ooOO0 abstractC24302o0ooOO0 = (AbstractC24302o0ooOO0) this.f81591OooOo0o;
            return Boolean.valueOf((abstractC24302o0ooOO0 instanceof C24251OooO0o0) && abstractC24302o0ooOO0.f81803OooO00o <= this.f81590OooOo.f81803OooO00o);
        }
    }

    /* JADX INFO: renamed from: o0000o0O.OooOOOo$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$data$1$5", m80623f = "DataStoreImpl.kt", m80624l = {116}, m80625m = "invokeSuspend")
    public static final class C24256OooO0Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<Object>, Throwable, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOOO<Object> f81592OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f81593OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24256OooO0Oo(OooOOO<Object> oooOOO, Continuation<? super C24256OooO0Oo> continuation) {
            super(3, continuation);
            this.f81592OooOo = oooOOO;
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO, Throwable th, Continuation<? super C32460OooOooO> continuation) {
            return new C24256OooO0Oo(this.f81592OooOo, continuation).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f81593OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f81593OooOo0o = 1;
                if (OooOOO.OooO0O0(this.f81592OooOo, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
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

    /* JADX INFO: renamed from: o0000o0O.OooOOOo$OooO0o0, reason: case insensitive filesystem */
    public static final class C24257OooO0o0 implements InterfaceC33721OooO0o<Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ o000 f81594OooOo0o;

        /* JADX INFO: renamed from: o0000o0O.OooOOOo$OooO0o0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f81595OooOo0o;

            /* JADX INFO: renamed from: o0000o0O.OooOOOo$OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", m80623f = "DataStoreImpl.kt", m80624l = {223}, m80625m = "emit")
            public static final class C19608OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f81596OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f81597OooOo0o;

                public C19608OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f81597OooOo0o = obj;
                    this.f81596OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f81595OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                C19608OooO00o c19608OooO00o;
                if (continuation instanceof C19608OooO00o) {
                    c19608OooO00o = (C19608OooO00o) continuation;
                    int i = c19608OooO00o.f81596OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19608OooO00o.f81596OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19608OooO00o = new C19608OooO00o(continuation);
                    }
                }
                Object obj2 = c19608OooO00o.f81597OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19608OooO00o.f81596OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    AbstractC24302o0ooOO0 abstractC24302o0ooOO0 = (AbstractC24302o0ooOO0) obj;
                    if (abstractC24302o0ooOO0 instanceof C24297OoooooO) {
                        throw ((C24297OoooooO) abstractC24302o0ooOO0).f81774OooO0O0;
                    }
                    if (!(abstractC24302o0ooOO0 instanceof C24251OooO0o0)) {
                        if (abstractC24302o0ooOO0 instanceof C24280OoooO ? true : abstractC24302o0ooOO0 instanceof o0OOO0o) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new C32442OooOO0o();
                    }
                    T t = ((C24251OooO0o0) abstractC24302o0ooOO0).f81529OooO0O0;
                    c19608OooO00o.f81596OooOo = 1;
                    if (this.f81595OooOo0o.emit(t, c19608OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C24257OooO0o0(o000 o000Var) {
            this.f81594OooOo0o = o000Var;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f81594OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24255OooOOOo(OooOOO<Object> oooOOO, Continuation<? super C24255OooOOOo> continuation) {
        super(2, continuation);
        this.f81585OooOoO = oooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C24255OooOOOo c24255OooOOOo = new C24255OooOOOo(this.f81585OooOoO, continuation);
        c24255OooOOOo.f81586OooOoO0 = obj;
        return c24255OooOOOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C24255OooOOOo) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        if (o00o00O0.C25252OooO0Oo.OooOOO0(r3, r4, r9) != r0) goto L32;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        AbstractC24302o0ooOO0 abstractC24302o0ooOO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81583OooOo;
        OooOOO<Object> oooOOO = this.f81585OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f81586OooOoO0;
            this.f81586OooOoO0 = interfaceC33723OooO0oO2;
            this.f81583OooOo = 1;
            Object objOooO0o = C33609OooO0oo.OooO0o(oooOOO.f81553OooO0OO.OooOOO0(), new C24267OooOoo(oooOOO, null), this);
            if (objOooO0o != enumC32485OooO00o) {
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                obj = objOooO0o;
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = (InterfaceC33723OooO0oO) this.f81586OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = interfaceC33723OooO0oO3;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            abstractC24302o0ooOO0 = this.f81584OooOo0o;
            interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f81586OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            C33734OooOOoo c33734OooOOoo = new C33734OooOOoo(new C24257OooO0o0(new o000(new OooO0OO(abstractC24302o0ooOO0, null), new C33744OooOoo0(new C33737OooOo00(new OooO00o(oooOOO, null), oooOOO.f81558OooO0oo.f81676OooO00o), new OooO0O0(2, null)))), new C24256OooO0Oo(oooOOO, null));
            this.f81586OooOoO0 = null;
            this.f81584OooOo0o = null;
            this.f81583OooOo = 3;
        }
        abstractC24302o0ooOO0 = (AbstractC24302o0ooOO0) obj;
        if (abstractC24302o0ooOO0 instanceof C24251OooO0o0) {
            T t = ((C24251OooO0o0) abstractC24302o0ooOO0).f81529OooO0O0;
            this.f81586OooOoO0 = interfaceC33723OooO0oO;
            this.f81584OooOo0o = (C24251OooO0o0) abstractC24302o0ooOO0;
            this.f81583OooOo = 2;
            if (interfaceC33723OooO0oO.emit(t, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (abstractC24302o0ooOO0 instanceof o0OOO0o) {
            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        if (abstractC24302o0ooOO0 instanceof C24297OoooooO) {
            throw ((C24297OoooooO) abstractC24302o0ooOO0).f81774OooO0O0;
        }
        if (abstractC24302o0ooOO0 instanceof C24280OoooO) {
            return C32460OooOooO.f116667OooO00o;
        }
        C33734OooOOoo c33734OooOOoo2 = new C33734OooOOoo(new C24257OooO0o0(new o000(new OooO0OO(abstractC24302o0ooOO0, null), new C33744OooOoo0(new C33737OooOo00(new OooO00o(oooOOO, null), oooOOO.f81558OooO0oo.f81676OooO00o), new OooO0O0(2, null)))), new C24256OooO0Oo(oooOOO, null));
        this.f81586OooOoO0 = null;
        this.f81584OooOo0o = null;
        this.f81583OooOo = 3;
    }
}
