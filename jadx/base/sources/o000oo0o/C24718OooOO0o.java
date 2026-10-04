package o000oo0o;

import kotlin.coroutines.Continuation;
import o000oo0.AbstractC24673OooOo0O;
import o000ooOO.C24734OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o000oo0o.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24718OooOO0o implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24673OooOo0O f83789OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f83790OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o f83791OooOoO0;

    /* JADX INFO: renamed from: o000oo0o.OooOO0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC24673OooOo0O f83792OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f83793OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32507OooOO0o f83794OooOoO0;

        /* JADX INFO: renamed from: o000oo0o.OooOO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", m80623f = "FlowBuilder.kt", m80624l = {224, 223}, m80625m = "emit")
        public static final class C19645OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f83795OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f83796OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public InterfaceC33723OooO0oO f83798OooOoO0;

            public C19645OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f83796OooOo0o = obj;
                this.f83795OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, AbstractC24673OooOo0O abstractC24673OooOo0O, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
            this.f83793OooOo0o = interfaceC33723OooO0oO;
            this.f83792OooOo = abstractC24673OooOo0O;
            this.f83794OooOoO0 = interfaceC32507OooOO0o;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19645OooO00o c19645OooO00o;
            InterfaceC33723OooO0oO interfaceC33723OooO0oO;
            if (continuation instanceof C19645OooO00o) {
                c19645OooO00o = (C19645OooO00o) continuation;
                int i = c19645OooO00o.f83795OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19645OooO00o.f83795OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19645OooO00o = new C19645OooO00o(continuation);
                }
            }
            Object objOooO0oo = c19645OooO00o.f83796OooOo0o;
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19645OooO00o.f83795OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0oo);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = this.f83793OooOo0o;
                c19645OooO00o.f83798OooOoO0 = interfaceC33723OooO0oO2;
                c19645OooO00o.f83795OooOo = 1;
                objOooO0oo = C24734OooO0O0.OooO0oo(c19645OooO00o, this.f83792OooOo, this.f83794OooOoO0, true, false);
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                if (objOooO0oo != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0oo);
                return C32460OooOooO.f116667OooO00o;
            }
            InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = c19645OooO00o.f83798OooOoO0;
            C32446OooOOOo.OooO0O0(objOooO0oo);
            interfaceC33723OooO0oO = interfaceC33723OooO0oO3;
            c19645OooO00o.f83798OooOoO0 = null;
            c19645OooO00o.f83795OooOo = 2;
        }
    }

    public C24718OooOO0o(InterfaceC33721OooO0o interfaceC33721OooO0o, AbstractC24673OooOo0O abstractC24673OooOo0O, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        this.f83790OooOo0o = interfaceC33721OooO0o;
        this.f83789OooOo = abstractC24673OooOo0O;
        this.f83791OooOoO0 = interfaceC32507OooOO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f83790OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f83789OooOo, this.f83791OooOoO0), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
