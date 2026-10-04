package o0000o0O;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24030OooOoo;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", m80623f = "DataStoreImpl.kt", m80624l = {437, 458, 546, 468}, m80625m = "invokeSuspend")
public final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C24251OooO0o0<Object>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Serializable f81568OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f81569OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f81570OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f81571OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Iterator f81572OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f81573OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f81574OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f81575OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object>.OooO00o f81576OooOooo;

    public static final class OooO00o implements InterfaceC24284OoooOO0<Object> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33895OooO00o f81577OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ C24030OooOoo f81578OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ C24034Oooo00O<Object> f81579OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOOO<Object> f81580OooO0Oo;

        public OooO00o(InterfaceC33895OooO00o interfaceC33895OooO00o, C24030OooOoo c24030OooOoo, C24034Oooo00O<Object> c24034Oooo00O, OooOOO<Object> oooOOO) {
            this.f81577OooO00o = interfaceC33895OooO00o;
            this.f81578OooO0O0 = c24030OooOoo;
            this.f81579OooO0OO = c24034Oooo00O;
            this.f81580OooO0Oo = oooOOO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ac, B:38:0x00b4), top: B:54:0x0050 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o0000o0O.InterfaceC24284OoooOO0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object OooO00o(OooO oooO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
            C24254OooOO0o c24254OooOO0o;
            InterfaceC33895OooO00o interfaceC33895OooO00o;
            OooOOO<Object> oooOOO;
            C24030OooOoo c24030OooOoo;
            C24034Oooo00O<Object> c24034Oooo00O;
            InterfaceC32508OooOOOo interfaceC32508OooOOOo;
            InterfaceC33895OooO00o interfaceC33895OooO00o2;
            InterfaceC33895OooO00o interfaceC33895OooO00o3;
            OooOOO<Object> oooOOO2;
            T t;
            C24034Oooo00O<Object> c24034Oooo00O2;
            if (abstractC32479OooO0OO instanceof C24254OooOO0o) {
                c24254OooOO0o = (C24254OooOO0o) abstractC32479OooO0OO;
                int i = c24254OooOO0o.f81549OooOooO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c24254OooOO0o.f81549OooOooO = i - Integer.MIN_VALUE;
                } else {
                    c24254OooOO0o = new C24254OooOO0o(this, abstractC32479OooO0OO);
                }
            }
            Object obj = c24254OooOO0o.f81548OooOoo0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c24254OooOO0o.f81549OooOooO;
            try {
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    c24254OooOO0o.f81543OooOo0o = oooO;
                    interfaceC33895OooO00o = this.f81577OooO00o;
                    c24254OooOO0o.f81542OooOo = interfaceC33895OooO00o;
                    C24030OooOoo c24030OooOoo2 = this.f81578OooO0O0;
                    c24254OooOO0o.f81545OooOoO0 = c24030OooOoo2;
                    C24034Oooo00O<Object> c24034Oooo00O3 = this.f81579OooO0OO;
                    c24254OooOO0o.f81544OooOoO = c24034Oooo00O3;
                    oooOOO = this.f81580OooO0Oo;
                    c24254OooOO0o.f81546OooOoOO = oooOOO;
                    c24254OooOO0o.f81549OooOooO = 1;
                    if (interfaceC33895OooO00o.OooO00o(c24254OooOO0o) != enumC32485OooO00o) {
                        c24030OooOoo = c24030OooOoo2;
                        c24034Oooo00O = c24034Oooo00O3;
                        interfaceC32508OooOOOo = oooO;
                    }
                    return enumC32485OooO00o;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = c24254OooOO0o.f81545OooOoO0;
                        c24034Oooo00O2 = (C24034Oooo00O) c24254OooOO0o.f81542OooOo;
                        interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) c24254OooOO0o.f81543OooOo0o;
                        try {
                            C32446OooOOOo.OooO0O0(obj);
                            t = obj2;
                            c24034Oooo00O2.f80942OooOo0o = t;
                            c24034Oooo00O = c24034Oooo00O2;
                            Object obj3 = c24034Oooo00O.f80942OooOo0o;
                            interfaceC33895OooO00o2.OooOOO0(null);
                            return obj3;
                        } catch (Throwable th) {
                            th = th;
                            interfaceC33895OooO00o2.OooOOO0(null);
                            throw th;
                        }
                    }
                    oooOOO2 = (OooOOO) c24254OooOO0o.f81545OooOoO0;
                    c24034Oooo00O = (C24034Oooo00O) c24254OooOO0o.f81542OooOo;
                    interfaceC33895OooO00o3 = (InterfaceC33895OooO00o) c24254OooOO0o.f81543OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(obj, c24034Oooo00O.f80942OooOo0o)) {
                            interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                            Object obj32 = c24034Oooo00O.f80942OooOo0o;
                            interfaceC33895OooO00o2.OooOOO0(null);
                            return obj32;
                        }
                        c24254OooOO0o.f81543OooOo0o = interfaceC33895OooO00o3;
                        c24254OooOO0o.f81542OooOo = c24034Oooo00O;
                        c24254OooOO0o.f81545OooOoO0 = obj;
                        c24254OooOO0o.f81549OooOooO = 3;
                        if (oooOOO2.OooOO0(obj, false, c24254OooOO0o) != enumC32485OooO00o) {
                            t = obj;
                            c24034Oooo00O2 = c24034Oooo00O;
                            interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                            c24034Oooo00O2.f80942OooOo0o = t;
                            c24034Oooo00O = c24034Oooo00O2;
                            Object obj322 = c24034Oooo00O.f80942OooOo0o;
                            interfaceC33895OooO00o2.OooOOO0(null);
                            return obj322;
                        }
                        return enumC32485OooO00o;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        throw th;
                    }
                }
                OooOOO<Object> oooOOO3 = c24254OooOO0o.f81546OooOoOO;
                c24034Oooo00O = c24254OooOO0o.f81544OooOoO;
                c24030OooOoo = (C24030OooOoo) c24254OooOO0o.f81545OooOoO0;
                InterfaceC33895OooO00o interfaceC33895OooO00o4 = (InterfaceC33895OooO00o) c24254OooOO0o.f81542OooOo;
                InterfaceC32508OooOOOo interfaceC32508OooOOOo2 = (InterfaceC32508OooOOOo) c24254OooOO0o.f81543OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                oooOOO = oooOOO3;
                interfaceC32508OooOOOo = interfaceC32508OooOOOo2;
                interfaceC33895OooO00o = interfaceC33895OooO00o4;
                if (c24030OooOoo.f80938OooOo0o) {
                    throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                }
                Object obj4 = c24034Oooo00O.f80942OooOo0o;
                c24254OooOO0o.f81543OooOo0o = interfaceC33895OooO00o;
                c24254OooOO0o.f81542OooOo = c24034Oooo00O;
                c24254OooOO0o.f81545OooOoO0 = oooOOO;
                c24254OooOO0o.f81544OooOoO = null;
                c24254OooOO0o.f81546OooOoOO = null;
                c24254OooOO0o.f81549OooOooO = 2;
                Object objInvoke = interfaceC32508OooOOOo.invoke(obj4, c24254OooOO0o);
                if (objInvoke != enumC32485OooO00o) {
                    interfaceC33895OooO00o3 = interfaceC33895OooO00o;
                    obj = objInvoke;
                    oooOOO2 = oooOOO;
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(obj, c24034Oooo00O.f80942OooOo0o)) {
                    }
                }
                return enumC32485OooO00o;
            } catch (Throwable th3) {
                th = th3;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(OooOOO<Object> oooOOO, OooOOO<Object>.OooO00o oooO00o, Continuation<? super OooOOO0> continuation) {
        super(1, continuation);
        this.f81575OooOooO = oooOOO;
        this.f81576OooOooo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
        return new OooOOO0(this.f81575OooOooO, this.f81576OooOooo, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<? super C24251OooO0o0<Object>> continuation) {
        return ((OooOOO0) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws C24249OooO0OO {
        InterfaceC33895OooO00o interfaceC33895OooO00oOooO00o;
        C24030OooOoo c24030OooOoo;
        C24034Oooo00O c24034Oooo00O;
        C24034Oooo00O c24034Oooo00O2;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        Iterator it;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        C24030OooOoo c24030OooOoo2;
        C24034Oooo00O c24034Oooo00O3;
        OooO00o oooO00o;
        C24034Oooo00O c24034Oooo00O4;
        C24030OooOoo c24030OooOoo3;
        Object obj2;
        Object objOooO0OO;
        int i;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f81573OooOoo;
        OooOOO<Object>.OooO00o oooO00o2 = this.f81576OooOooo;
        OooOOO<Object> oooOOO = this.f81575OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00oOooO00o = C33900OooO0o0.OooO00o();
            c24030OooOoo = new C24030OooOoo();
            c24034Oooo00O = new C24034Oooo00O();
            this.f81569OooOo0o = interfaceC33895OooO00oOooO00o;
            this.f81568OooOo = c24030OooOoo;
            this.f81571OooOoO0 = c24034Oooo00O;
            this.f81570OooOoO = c24034Oooo00O;
            this.f81573OooOoo = 1;
            obj = OooOOO.OooO0o(oooOOO, true, this);
            if (obj != enumC32485OooO00o) {
                c24034Oooo00O2 = c24034Oooo00O;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.f81574OooOoo0;
                    obj2 = this.f81569OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return new C24251OooO0o0(obj2, i, ((Number) obj).intValue());
                }
                interfaceC33895OooO00o = (InterfaceC33895OooO00o) this.f81571OooOoO0;
                c24034Oooo00O4 = (C24034Oooo00O) this.f81568OooOo;
                c24030OooOoo3 = (C24030OooOoo) this.f81569OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                try {
                    c24030OooOoo3.f80938OooOo0o = true;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o.OooOOO0(null);
                    obj2 = c24034Oooo00O4.f80942OooOo0o;
                    int iHashCode = obj2 == null ? obj2.hashCode() : 0;
                    o000oOoO o000ooooOooO0oO = oooOOO.OooO0oO();
                    this.f81569OooOo0o = obj2;
                    this.f81568OooOo = null;
                    this.f81571OooOoO0 = null;
                    this.f81574OooOoo0 = iHashCode;
                    this.f81573OooOoo = 4;
                    objOooO0OO = o000ooooOooO0oO.OooO0OO(this);
                    if (objOooO0OO != enumC32485OooO00o) {
                        i = iHashCode;
                        obj = objOooO0OO;
                        return new C24251OooO0o0(obj2, i, ((Number) obj).intValue());
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th) {
                    interfaceC33895OooO00o.OooOOO0(null);
                    throw th;
                }
            }
            it = this.f81572OooOoOO;
            oooO00o = (OooO00o) this.f81570OooOoO;
            c24034Oooo00O3 = (C24034Oooo00O) this.f81571OooOoO0;
            c24030OooOoo2 = (C24030OooOoo) this.f81568OooOo;
            interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) this.f81569OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            while (it.hasNext()) {
                InterfaceC32508OooOOOo interfaceC32508OooOOOo = (InterfaceC32508OooOOOo) it.next();
                this.f81569OooOo0o = interfaceC33895OooO00o2;
                this.f81568OooOo = c24030OooOoo2;
                this.f81571OooOoO0 = c24034Oooo00O3;
                this.f81570OooOoO = oooO00o;
                this.f81572OooOoOO = it;
                this.f81573OooOoo = 2;
                if (interfaceC32508OooOOOo.invoke(oooO00o, this) == enumC32485OooO00o) {
                    break;
                }
            }
            c24034Oooo00O2 = c24034Oooo00O3;
            c24030OooOoo = c24030OooOoo2;
            interfaceC33895OooO00o = interfaceC33895OooO00o2;
            oooO00o2.f81562OooO0Oo = null;
            this.f81569OooOo0o = c24030OooOoo;
            this.f81568OooOo = c24034Oooo00O2;
            this.f81571OooOoO0 = interfaceC33895OooO00o;
            this.f81570OooOoO = null;
            this.f81572OooOoOO = null;
            this.f81573OooOoo = 3;
            if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                c24034Oooo00O4 = c24034Oooo00O2;
                c24030OooOoo3 = c24030OooOoo;
                c24030OooOoo3.f80938OooOo0o = true;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o.OooOOO0(null);
                obj2 = c24034Oooo00O4.f80942OooOo0o;
                if (obj2 == null) {
                }
                o000oOoO o000ooooOooO0oO2 = oooOOO.OooO0oO();
                this.f81569OooOo0o = obj2;
                this.f81568OooOo = null;
                this.f81571OooOoO0 = null;
                this.f81574OooOoo0 = iHashCode;
                this.f81573OooOoo = 4;
                objOooO0OO = o000ooooOooO0oO2.OooO0OO(this);
                if (objOooO0OO != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        c24034Oooo00O = (C24034Oooo00O) this.f81570OooOoO;
        c24034Oooo00O2 = (C24034Oooo00O) this.f81571OooOoO0;
        c24030OooOoo = (C24030OooOoo) this.f81568OooOo;
        interfaceC33895OooO00oOooO00o = (InterfaceC33895OooO00o) this.f81569OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c24034Oooo00O.f80942OooOo0o = ((C24251OooO0o0) obj).f81529OooO0O0;
        OooO00o oooO00o3 = new OooO00o(interfaceC33895OooO00oOooO00o, c24030OooOoo, c24034Oooo00O2, oooOOO);
        List<? extends InterfaceC32508OooOOOo<? super InterfaceC24284OoooOO0<Object>, ? super Continuation<? super C32460OooOooO>, ? extends Object>> list = oooO00o2.f81562OooO0Oo;
        if (list == null) {
            interfaceC33895OooO00o = interfaceC33895OooO00oOooO00o;
            oooO00o2.f81562OooO0Oo = null;
            this.f81569OooOo0o = c24030OooOoo;
            this.f81568OooOo = c24034Oooo00O2;
            this.f81571OooOoO0 = interfaceC33895OooO00o;
            this.f81570OooOoO = null;
            this.f81572OooOoOO = null;
            this.f81573OooOoo = 3;
            if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        it = list.iterator();
        interfaceC33895OooO00o2 = interfaceC33895OooO00oOooO00o;
        c24030OooOoo2 = c24030OooOoo;
        c24034Oooo00O3 = c24034Oooo00O2;
        oooO00o = oooO00o3;
        while (it.hasNext()) {
        }
        c24034Oooo00O2 = c24034Oooo00O3;
        c24030OooOoo = c24030OooOoo2;
        interfaceC33895OooO00o = interfaceC33895OooO00o2;
        oooO00o2.f81562OooO0Oo = null;
        this.f81569OooOo0o = c24030OooOoo;
        this.f81568OooOo = c24034Oooo00O2;
        this.f81571OooOoO0 = interfaceC33895OooO00o;
        this.f81570OooOoO = null;
        this.f81572OooOoOO = null;
        this.f81573OooOoo = 3;
        if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
        }
        return enumC32485OooO00o;
    }
}
