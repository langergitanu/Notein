package o000oo0;

import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o000ooOO.C24734OooO0O0;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o000oo0.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", m80623f = "InvalidationTracker.kt", m80624l = {233, 233, 237}, m80625m = "invokeSuspend")
public final class C24696OoooO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super Set<? extends String>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f83684OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f83685OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int[] f83686OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24695OoooO00 f83687OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String[] f83688OooOoOO;

    /* JADX INFO: renamed from: o000oo0.OoooO0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", m80623f = "InvalidationTracker.kt", m80624l = {233}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C24695OoooO00 f83689OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f83690OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C24695OoooO00 c24695OoooO00, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f83689OooOo = c24695OoooO00;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f83689OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f83690OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f83690OooOo0o = 1;
                if (this.f83689OooOo.OooO0o(this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o000oo0.OoooO0O$OooO0O0 */
    public static final class OooO0O0<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO<Set<String>> f83691OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24034Oooo00O<int[]> f83692OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int[] f83693OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String[] f83694OooOoO0;

        /* JADX INFO: renamed from: o000oo0.OoooO0O$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", m80623f = "InvalidationTracker.kt", m80624l = {241, 250}, m80625m = "emit")
        public static final class OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int[] f83695OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public OooO0O0 f83696OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ OooO0O0<T> f83697OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public /* synthetic */ Object f83698OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public int f83699OooOoOO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(OooO0O0<? super T> oooO0O0, Continuation<? super OooO00o> continuation) {
                super(continuation);
                this.f83697OooOoO = oooO0O0;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f83698OooOoO0 = obj;
                this.f83699OooOoOO |= Integer.MIN_VALUE;
                return this.f83697OooOoO.emit(null, this);
            }
        }

        public OooO0O0(C24034Oooo00O c24034Oooo00O, InterfaceC33723OooO0oO interfaceC33723OooO0oO, String[] strArr, int[] iArr) {
            this.f83692OooOo0o = c24034Oooo00O;
            this.f83691OooOo = interfaceC33723OooO0oO;
            this.f83694OooOoO0 = strArr;
            this.f83693OooOoO = iArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        
            if (r6.emit(r15, r0) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
        
            if (r6.emit(r15, r0) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(int[] iArr, Continuation<? super C32460OooOooO> continuation) {
            OooO00o oooO00o;
            OooO0O0<T> oooO0O0;
            Object obj;
            if (continuation instanceof OooO00o) {
                oooO00o = (OooO00o) continuation;
                int i = oooO00o.f83699OooOoOO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooO00o.f83699OooOoOO = i - Integer.MIN_VALUE;
                } else {
                    oooO00o = new OooO00o(this, continuation);
                }
            }
            Object obj2 = oooO00o.f83698OooOoO0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = oooO00o.f83699OooOoOO;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                C24034Oooo00O<int[]> c24034Oooo00O = this.f83692OooOo0o;
                int[] iArr2 = c24034Oooo00O.f80942OooOo0o;
                String[] strArr = this.f83694OooOoO0;
                InterfaceC33723OooO0oO<Set<String>> interfaceC33723OooO0oO = this.f83691OooOo;
                if (iArr2 == null) {
                    Set<String> setOoooOo0 = oOo000Oo.OooOOO.OoooOo0(strArr);
                    oooO00o.f83696OooOo0o = this;
                    oooO00o.f83695OooOo = iArr;
                    oooO00o.f83699OooOoOO = 1;
                } else {
                    ArrayList arrayList = new ArrayList();
                    int length = strArr.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length) {
                        String str = strArr[i3];
                        int i5 = i4 + 1;
                        int[] iArr3 = c24034Oooo00O.f80942OooOo0o;
                        if (iArr3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        int i6 = this.f83693OooOoO[i4];
                        if (iArr3[i6] != iArr[i6]) {
                            arrayList.add(str);
                        }
                        i3++;
                        i4 = i5;
                    }
                    if (!arrayList.isEmpty()) {
                        Set<String> setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList);
                        oooO00o.f83696OooOo0o = this;
                        oooO00o.f83695OooOo = iArr;
                        oooO00o.f83699OooOoOO = 2;
                    }
                    oooO0O0 = this;
                    obj = iArr;
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj3 = (T) oooO00o.f83695OooOo;
                oooO0O0 = oooO00o.f83696OooOo0o;
                C32446OooOOOo.OooO0O0(obj2);
                obj = obj3;
            }
            oooO0O0.f83692OooOo0o.f80942OooOo0o = (T) obj;
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24696OoooO0O(C24695OoooO00 c24695OoooO00, int[] iArr, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.f83687OooOoO0 = c24695OoooO00;
        this.f83686OooOoO = iArr;
        this.f83688OooOoOO = strArr;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C24696OoooO0O c24696OoooO0O = new C24696OoooO0O(this.f83687OooOoO0, this.f83686OooOoO, this.f83688OooOoOO, continuation);
        c24696OoooO0O.f83684OooOo = obj;
        return c24696OoooO0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super Set<? extends String>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        ((C24696OoooO0O) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (oO0o0OO.C33609OooO0oo.OooO0o((oOo0000O.InterfaceC34415OooO0oo) r11, r6, r10) == r0) goto L23;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f83685OooOo0o;
        int[] iArr = this.f83686OooOoO;
        C24695OoooO00 c24695OoooO00 = this.f83687OooOoO0;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f83684OooOo;
                if (c24695OoooO00.f83681OooO0oo.OooO00o(iArr)) {
                    AbstractC24673OooOo0O abstractC24673OooOo0O = c24695OoooO00.f83674OooO00o;
                    this.f83684OooOo = interfaceC33723OooO0oO;
                    this.f83685OooOo0o = 1;
                    InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO0o0 = C24734OooO0O0.OooO0o0(abstractC24673OooOo0O, false, this);
                    if (interfaceC34415OooO0ooOooO0o0 != enumC32485OooO00o) {
                        interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                        obj = interfaceC34415OooO0ooOooO0o0;
                    }
                    return enumC32485OooO00o;
                }
                C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                C24666OooOOO c24666OooOOO = c24695OoooO00.f83673OooO;
                OooO0O0 oooO0O0 = new OooO0O0(c24034Oooo00O, interfaceC33723OooO0oO, this.f83688OooOoOO, iArr);
                this.f83684OooOo = null;
                this.f83685OooOo0o = 3;
                c24666OooOOO.OooO00o(oooO0O0, this);
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    throw new C32438OooO0oO();
                }
                interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f83684OooOo;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                C24034Oooo00O c24034Oooo00O2 = new C24034Oooo00O();
                C24666OooOOO c24666OooOOO2 = c24695OoooO00.f83673OooO;
                OooO0O0 oooO0O02 = new OooO0O0(c24034Oooo00O2, interfaceC33723OooO0oO, this.f83688OooOoOO, iArr);
                this.f83684OooOo = null;
                this.f83685OooOo0o = 3;
                c24666OooOOO2.OooO00o(oooO0O02, this);
                return enumC32485OooO00o;
            }
            interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f83684OooOo;
            C32446OooOOOo.OooO0O0(obj);
            OooO00o oooO00o = new OooO00o(c24695OoooO00, null);
            this.f83684OooOo = interfaceC33723OooO0oO2;
            this.f83685OooOo0o = 2;
        } catch (Throwable th) {
            c24695OoooO00.f83681OooO0oo.OooO0O0(iArr);
            throw th;
        }
    }
}
