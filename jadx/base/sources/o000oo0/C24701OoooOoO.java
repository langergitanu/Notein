package o000oo0;

import com.aspose.words.StyleIdentifier;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import o000oo0.C24665OooOO0o;
import o000oo0.InterfaceC24688Oooo0OO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o000oo0.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", m80623f = "InvalidationTracker.kt", m80624l = {301, StyleIdentifier.GRID_TABLE_2_ACCENT_5}, m80625m = "invokeSuspend")
public final class C24701OoooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC24688Oooo0OO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f83728OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f83729OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24695OoooO00 f83730OooOoO0;

    /* JADX INFO: renamed from: o000oo0.OoooOoO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1", m80623f = "InvalidationTracker.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_5}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC24687Oooo0O0<C32460OooOooO>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public C24695OoooO00 f83731OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C24665OooOO0o.OooO00o[] f83732OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f83733OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public InterfaceC24688Oooo0OO f83734OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f83735OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public int f83736OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f83737OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final /* synthetic */ C24665OooOO0o.OooO00o[] f83738OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final /* synthetic */ C24695OoooO00 f83739OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public final /* synthetic */ InterfaceC24688Oooo0OO f83740Oooo000;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C24665OooOO0o.OooO00o[] oooO00oArr, C24695OoooO00 c24695OoooO00, InterfaceC24688Oooo0OO interfaceC24688Oooo0OO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f83738OooOooO = oooO00oArr;
            this.f83739OooOooo = c24695OoooO00;
            this.f83740Oooo000 = interfaceC24688Oooo0OO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f83738OooOooO, this.f83739OooOooo, this.f83740Oooo000, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC24687Oooo0O0<C32460OooOooO> interfaceC24687Oooo0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC24687Oooo0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        
            if (o000oo0.C24695OoooO00.OooO0OO(r7, r6, r11, r10) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        
            r5 = r9;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:26:0x0076). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int length;
            int i;
            InterfaceC24688Oooo0OO interfaceC24688Oooo0OO;
            C24665OooOO0o.OooO00o[] oooO00oArr;
            int i2;
            C24695OoooO00 c24695OoooO00;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i3 = this.f83736OooOoo;
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C24665OooOO0o.OooO00o[] oooO00oArr2 = this.f83738OooOooO;
                length = oooO00oArr2.length;
                i = 0;
                C24695OoooO00 c24695OoooO002 = this.f83739OooOooo;
                interfaceC24688Oooo0OO = this.f83740Oooo000;
                oooO00oArr = oooO00oArr2;
                i2 = 0;
                c24695OoooO00 = c24695OoooO002;
                if (i >= length) {
                }
            } else {
                if (i3 != 1 && i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                length = this.f83737OooOoo0;
                i = this.f83735OooOoOO;
                int i4 = this.f83733OooOoO;
                interfaceC24688Oooo0OO = this.f83734OooOoO0;
                c24695OoooO00 = this.f83731OooOo;
                oooO00oArr = this.f83732OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                i2 = i4;
                i++;
                if (i >= length) {
                    int i5 = i2 + 1;
                    int iOrdinal = oooO00oArr[i].ordinal();
                    if (iOrdinal == 0) {
                        i2 = i5;
                        i++;
                        if (i >= length) {
                            return C32460OooOooO.f116667OooO00o;
                        }
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                throw new C32442OooOO0o();
                            }
                            this.f83732OooOo0o = oooO00oArr;
                            this.f83731OooOo = c24695OoooO00;
                            this.f83734OooOoO0 = interfaceC24688Oooo0OO;
                            this.f83733OooOoO = i5;
                            this.f83735OooOoOO = i;
                            this.f83737OooOoo0 = length;
                            this.f83736OooOoo = 2;
                            if (C24695OoooO00.OooO0Oo(c24695OoooO00, interfaceC24688Oooo0OO, i2, this) != enumC32485OooO00o) {
                                i4 = i5;
                                i2 = i4;
                            }
                            return enumC32485OooO00o;
                        }
                        this.f83732OooOo0o = oooO00oArr;
                        this.f83731OooOo = c24695OoooO00;
                        this.f83734OooOoO0 = interfaceC24688Oooo0OO;
                        this.f83733OooOoO = i5;
                        this.f83735OooOoOO = i;
                        this.f83737OooOoo0 = length;
                        this.f83736OooOoo = 1;
                        i++;
                        if (i >= length) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24701OoooOoO(C24695OoooO00 c24695OoooO00, Continuation<? super C24701OoooOoO> continuation) {
        super(2, continuation);
        this.f83730OooOoO0 = c24695OoooO00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C24701OoooOoO c24701OoooOoO = new C24701OoooOoO(this.f83730OooOoO0, continuation);
        c24701OoooOoO.f83728OooOo = obj;
        return c24701OoooOoO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC24688Oooo0OO interfaceC24688Oooo0OO, Continuation<? super C32460OooOooO> continuation) {
        return ((C24701OoooOoO) create(interfaceC24688Oooo0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        if (r2.OooO0Oo(r3, r6, r19) == r0) goto L48;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC24688Oooo0OO interfaceC24688Oooo0OO;
        Object objOooO0OO;
        C24665OooOO0o.OooO00o[] oooO00oArr;
        C24665OooOO0o.OooO00o oooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f83729OooOo0o;
        boolean z = true;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC24688Oooo0OO = (InterfaceC24688Oooo0OO) this.f83728OooOo;
            this.f83728OooOo = interfaceC24688Oooo0OO;
            this.f83729OooOo0o = 1;
            objOooO0OO = interfaceC24688Oooo0OO.OooO0OO(this);
            if (objOooO0OO != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        interfaceC24688Oooo0OO = (InterfaceC24688Oooo0OO) this.f83728OooOo;
        C32446OooOOOo.OooO0O0(obj);
        objOooO0OO = obj;
        if (((Boolean) objOooO0OO).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        C24695OoooO00 c24695OoooO00 = this.f83730OooOoO0;
        C24665OooOO0o c24665OooOO0o = c24695OoooO00.f83681OooO0oo;
        long[] jArr = c24665OooOO0o.f83552OooO0O0;
        ReentrantLock reentrantLock = c24665OooOO0o.f83551OooO00o;
        reentrantLock.lock();
        try {
            if (c24665OooOO0o.f83554OooO0Oo) {
                boolean z2 = false;
                c24665OooOO0o.f83554OooO0Oo = false;
                int length = jArr.length;
                oooO00oArr = new C24665OooOO0o.OooO00o[length];
                int i2 = 0;
                boolean z3 = false;
                while (i2 < length) {
                    boolean z4 = jArr[i2] > 0 ? z : z2;
                    boolean[] zArr = c24665OooOO0o.f83553OooO0OO;
                    if (z4 != zArr[i2]) {
                        zArr[i2] = z4;
                        oooO00o = z4 ? C24665OooOO0o.OooO00o.f83555OooOo : C24665OooOO0o.OooO00o.f83558OooOoO0;
                        z3 = true;
                    } else {
                        oooO00o = C24665OooOO0o.OooO00o.f83556OooOo0o;
                    }
                    oooO00oArr[i2] = oooO00o;
                    i2++;
                    z = true;
                    z2 = false;
                }
                if (!z3) {
                    oooO00oArr = null;
                }
                reentrantLock.unlock();
            } else {
                reentrantLock.unlock();
                oooO00oArr = null;
            }
            if (oooO00oArr != null) {
                InterfaceC24688Oooo0OO.OooO00o oooO00o2 = InterfaceC24688Oooo0OO.OooO00o.f83658OooOo;
                OooO00o oooO00o3 = new OooO00o(oooO00oArr, c24695OoooO00, interfaceC24688Oooo0OO, null);
                this.f83728OooOo = null;
                this.f83729OooOo0o = 2;
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
