package oO0o0Oo;

import androidx.fragment.app.C21904OooOoo0;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33652OoooOoo;
import oO0o0OO.InterfaceC33651OoooOoO;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OoO.AbstractC33791OooO0O0;
import oO0o0OoO.AbstractC33793OooO0Oo;
import oO0o0OoO.C33792OooO0OO;
import oO0o0OoO.InterfaceC33807OooOOoo;
import oO0o0Ooo.C33839OooOo0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Oo.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33772OooooOo<T> extends AbstractC33791OooO0O0<C33775OoooooO> implements InterfaceC33766OoooOoO<T>, InterfaceC33721OooO0o, InterfaceC33807OooOOoo<T> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f121749OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final EnumC33692OooO0OO f121750OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f121751OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Object[] f121752OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f121753OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public long f121754Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f121755Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f121756Oooo00o;

    /* JADX INFO: renamed from: oO0o0Oo.OooooOo$OooO00o */
    public static final class OooO00o implements InterfaceC33651OoooOoO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final long f121757OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C33772OooooOo<?> f121758OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final C33614OooOOO0 f121759OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final Object f121760OooOoO0;

        public OooO00o(C33772OooooOo c33772OooooOo, long j, Object obj, C33614OooOOO0 c33614OooOOO0) {
            this.f121758OooOo0o = c33772OooooOo;
            this.f121757OooOo = j;
            this.f121760OooOoO0 = obj;
            this.f121759OooOoO = c33614OooOOO0;
        }

        @Override // oO0o0OO.InterfaceC33651OoooOoO
        public final void dispose() {
            C33772OooooOo<?> c33772OooooOo = this.f121758OooOo0o;
            synchronized (c33772OooooOo) {
                if (this.f121757OooOo < c33772OooooOo.OooOOOO()) {
                    return;
                }
                Object[] objArr = c33772OooooOo.f121752OooOooO;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(objArr);
                long j = this.f121757OooOo;
                if (objArr[((int) j) & (objArr.length - 1)] != this) {
                    return;
                }
                C33773Oooooo.OooO0OO(objArr, j, C33773Oooooo.f121761OooO00o);
                c33772OooooOo.OooOO0();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
        }
    }

    public C33772OooooOo(int i, int i2, EnumC33692OooO0OO enumC33692OooO0OO) {
        this.f121749OooOoOO = i;
        this.f121751OooOoo0 = i2;
        this.f121750OooOoo = enumC33692OooO0OO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bc, code lost:
    
        throw r2.getCancellationException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooOO0O(C33772OooooOo c33772OooooOo, InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        C33774Oooooo0 c33774Oooooo0;
        C33772OooooOo c33772OooooOo2;
        Throwable th;
        C33775OoooooO c33775OoooooO;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        InterfaceC33672o00ooo interfaceC33672o00ooo;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO3;
        if (continuation instanceof C33774Oooooo0) {
            c33774Oooooo0 = (C33774Oooooo0) continuation;
            int i = c33774Oooooo0.f121767OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33774Oooooo0.f121767OooOoo = i - Integer.MIN_VALUE;
            } else {
                c33774Oooooo0 = new C33774Oooooo0(c33772OooooOo, continuation);
            }
        }
        Object obj = c33774Oooooo0.f121766OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33774Oooooo0.f121767OooOoo;
        if (i2 != 0) {
            if (i2 == 1) {
                c33775OoooooO = c33774Oooooo0.f121765OooOoO0;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO4 = c33774Oooooo0.f121762OooOo;
                C33772OooooOo c33772OooooOo3 = c33774Oooooo0.f121763OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    interfaceC33723OooO0oO2 = interfaceC33723OooO0oO4;
                    c33772OooooOo = c33772OooooOo3;
                    try {
                        interfaceC33672o00ooo = (InterfaceC33672o00ooo) c33774Oooooo0.getContext().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
                        interfaceC33723OooO0oO3 = interfaceC33723OooO0oO2;
                    } catch (Throwable th2) {
                        c33772OooooOo2 = c33772OooooOo;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c33772OooooOo2 = c33772OooooOo3;
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC33672o00ooo interfaceC33672o00ooo2 = c33774Oooooo0.f121764OooOoO;
                c33775OoooooO = c33774Oooooo0.f121765OooOoO0;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO5 = c33774Oooooo0.f121762OooOo;
                c33772OooooOo2 = c33774Oooooo0.f121763OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    interfaceC33723OooO0oO3 = interfaceC33723OooO0oO5;
                    interfaceC33672o00ooo = interfaceC33672o00ooo2;
                    c33772OooooOo = c33772OooooOo2;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            c33772OooooOo2.OooO0oo(c33775OoooooO);
            throw th;
        }
        C32446OooOOOo.OooO0O0(obj);
        C33775OoooooO c33775OoooooOOooO0O0 = c33772OooooOo.OooO0O0();
        try {
            if (interfaceC33723OooO0oO instanceof C33782o00oO0O) {
                c33774Oooooo0.f121763OooOo0o = c33772OooooOo;
                c33774Oooooo0.f121762OooOo = interfaceC33723OooO0oO;
                c33774Oooooo0.f121765OooOoO0 = c33775OoooooOOooO0O0;
                c33774Oooooo0.f121767OooOoo = 1;
                if (((C33782o00oO0O) interfaceC33723OooO0oO).OooO00o(c33774Oooooo0) == enumC32485OooO00o) {
                    return;
                }
            }
            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
            c33775OoooooO = c33775OoooooOOooO0O0;
            interfaceC33672o00ooo = (InterfaceC33672o00ooo) c33774Oooooo0.getContext().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
            interfaceC33723OooO0oO3 = interfaceC33723OooO0oO2;
        } catch (Throwable th5) {
            c33772OooooOo2 = c33772OooooOo;
            th = th5;
            c33775OoooooO = c33775OoooooOOooO0O0;
        }
        while (true) {
            Object objOooOOoo = c33772OooooOo.OooOOoo(c33775OoooooO);
            if (objOooOOoo == C33773Oooooo.f121761OooO00o) {
                c33774Oooooo0.f121763OooOo0o = c33772OooooOo;
                c33774Oooooo0.f121762OooOo = interfaceC33723OooO0oO3;
                c33774Oooooo0.f121765OooOoO0 = c33775OoooooO;
                c33774Oooooo0.f121764OooOoO = interfaceC33672o00ooo;
                c33774Oooooo0.f121767OooOoo = 2;
                if (c33772OooooOo.OooO(c33775OoooooO, c33774Oooooo0) == enumC32485OooO00o) {
                    return;
                }
            } else {
                if (interfaceC33672o00ooo != null && !interfaceC33672o00ooo.isActive()) {
                    break;
                }
                c33774Oooooo0.f121763OooOo0o = c33772OooooOo;
                c33774Oooooo0.f121762OooOo = interfaceC33723OooO0oO3;
                c33774Oooooo0.f121765OooOoO0 = c33775OoooooO;
                c33774Oooooo0.f121764OooOoO = interfaceC33672o00ooo;
                c33774Oooooo0.f121767OooOoo = 3;
                if (interfaceC33723OooO0oO3.emit(objOooOOoo, c33774Oooooo0) == enumC32485OooO00o) {
                    return;
                }
            }
        }
    }

    public final Object OooO(C33775OoooooO c33775OoooooO, C33774Oooooo0 c33774Oooooo0) throws Throwable {
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(c33774Oooooo0));
        c33614OooOOO0.OooOOoo();
        synchronized (this) {
            if (OooOOo(c33775OoooooO) < 0) {
                c33775OoooooO.f121770OooO0O0 = c33614OooOOO0;
            } else {
                c33614OooOOO0.resumeWith(C32460OooOooO.f116667OooO00o);
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        Object objOooOOo = c33614OooOOO0.OooOOo();
        return objOooOOo == EnumC32485OooO00o.f116726OooOo0o ? objOooOOo : C32460OooOooO.f116667OooO00o;
    }

    @Override // oO0o0OoO.InterfaceC33807OooOOoo
    public final InterfaceC33721OooO0o<T> OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        return C33773Oooooo.OooO0Oo(this, interfaceC34415OooO0oo, i, enumC33692OooO0OO);
    }

    @Override // oO0o0Oo.InterfaceC33766OoooOoO
    public final void OooO0OO() throws Throwable {
        synchronized (this) {
            try {
                try {
                    OooOo00(OooOOOO() + ((long) this.f121755Oooo00O), this.f121754Oooo000, OooOOOO() + ((long) this.f121755Oooo00O), OooOOOO() + ((long) this.f121755Oooo00O) + ((long) this.f121756Oooo00o));
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // oO0o0Oo.InterfaceC33766OoooOoO
    public final boolean OooO0Oo(T t) {
        int i;
        boolean z;
        Continuation<C32460OooOooO>[] continuationArrOooOOO = C33792OooO0OO.f121826OooO00o;
        synchronized (this) {
            if (OooOOo0(t)) {
                continuationArrOooOOO = OooOOO(continuationArrOooOOO);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation<C32460OooOooO> continuation : continuationArrOooOOO) {
            if (continuation != null) {
                continuation.resumeWith(C32460OooOooO.f116667OooO00o);
            }
        }
        return z;
    }

    @Override // oO0o0OoO.AbstractC33791OooO0O0
    public final AbstractC33793OooO0Oo OooO0o0() {
        return new C33775OoooooO();
    }

    @Override // oO0o0OoO.AbstractC33791OooO0O0
    public final AbstractC33793OooO0Oo[] OooO0oO() {
        return new C33775OoooooO[2];
    }

    public final void OooOO0() {
        if (this.f121751OooOoo0 != 0 || this.f121756Oooo00o > 1) {
            Object[] objArr = this.f121752OooOooO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(objArr);
            while (this.f121756Oooo00o > 0) {
                long jOooOOOO = OooOOOO();
                int i = this.f121755Oooo00O;
                int i2 = this.f121756Oooo00o;
                if (objArr[((int) ((jOooOOOO + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != C33773Oooooo.f121761OooO00o) {
                    return;
                }
                this.f121756Oooo00o = i2 - 1;
                C33773Oooooo.OooO0OO(objArr, OooOOOO() + ((long) (this.f121755Oooo00O + this.f121756Oooo00o)), null);
            }
        }
    }

    public final void OooOO0o() {
        Object[] objArr;
        Object[] objArr2 = this.f121752OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(objArr2);
        C33773Oooooo.OooO0OO(objArr2, OooOOOO(), null);
        this.f121755Oooo00O--;
        long jOooOOOO = OooOOOO() + 1;
        if (this.f121753OooOooo < jOooOOOO) {
            this.f121753OooOooo = jOooOOOO;
        }
        if (this.f121754Oooo000 < jOooOOOO) {
            if (this.f121822OooOo != 0 && (objArr = this.f121823OooOo0o) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        C33775OoooooO c33775OoooooO = (C33775OoooooO) obj;
                        long j = c33775OoooooO.f121769OooO00o;
                        if (j >= 0 && j < jOooOOOO) {
                            c33775OoooooO.f121769OooO00o = jOooOOOO;
                        }
                    }
                }
            }
            this.f121754Oooo000 = jOooOOOO;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation<oO00ooO.OooOooO>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final Continuation<C32460OooOooO>[] OooOOO(Continuation<C32460OooOooO>[] continuationArr) {
        Object[] objArr;
        C33775OoooooO c33775OoooooO;
        C33614OooOOO0 c33614OooOOO0;
        int length = continuationArr.length;
        if (this.f121822OooOo != 0 && (objArr = this.f121823OooOo0o) != null) {
            int length2 = objArr.length;
            int i = 0;
            continuationArr = continuationArr;
            while (i < length2) {
                Object obj = objArr[i];
                if (obj != null && (c33614OooOOO0 = (c33775OoooooO = (C33775OoooooO) obj).f121770OooO0O0) != null && OooOOo(c33775OoooooO) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) continuationArr, Math.max(2, continuationArr.length * 2));
                        kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(...)");
                        continuationArr = objArrCopyOf;
                    }
                    ((Continuation[]) continuationArr)[length] = c33614OooOOO0;
                    c33775OoooooO.f121770OooO0O0 = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
        }
        return (Continuation[]) continuationArr;
    }

    public final void OooOOO0(Object obj) {
        int i = this.f121755Oooo00O + this.f121756Oooo00o;
        Object[] objArrOooOOOo = this.f121752OooOooO;
        if (objArrOooOOOo == null) {
            objArrOooOOOo = OooOOOo(null, 0, 2);
        } else if (i >= objArrOooOOOo.length) {
            objArrOooOOOo = OooOOOo(objArrOooOOOo, i, objArrOooOOOo.length * 2);
        }
        C33773Oooooo.OooO0OO(objArrOooOOOo, OooOOOO() + ((long) i), obj);
    }

    public final long OooOOOO() {
        return Math.min(this.f121754Oooo000, this.f121753OooOooo);
    }

    public final Object[] OooOOOo(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.f121752OooOooO = objArr2;
        if (objArr != null) {
            long jOooOOOO = OooOOOO();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jOooOOOO;
                C33773Oooooo.OooO0OO(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final long OooOOo(C33775OoooooO c33775OoooooO) {
        long j = c33775OoooooO.f121769OooO00o;
        if (j < OooOOOO() + ((long) this.f121755Oooo00O)) {
            return j;
        }
        if (this.f121751OooOoo0 <= 0 && j <= OooOOOO() && this.f121756Oooo00o != 0) {
            return j;
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooOOo0(T t) {
        int i = this.f121822OooOo;
        int i2 = this.f121749OooOoOO;
        if (i != 0) {
            int i3 = this.f121755Oooo00O;
            int i4 = this.f121751OooOoo0;
            if (i3 < i4 || this.f121754Oooo000 > this.f121753OooOooo) {
                OooOOO0(t);
                int i5 = this.f121755Oooo00O + 1;
                this.f121755Oooo00O = i5;
                if (i5 > i4) {
                    OooOO0o();
                }
                long jOooOOOO = OooOOOO() + ((long) this.f121755Oooo00O);
                long j = this.f121753OooOooo;
                if (((int) (jOooOOOO - j)) > i2) {
                    OooOo00(1 + j, this.f121754Oooo000, OooOOOO() + ((long) this.f121755Oooo00O), OooOOOO() + ((long) this.f121755Oooo00O) + ((long) this.f121756Oooo00o));
                }
            } else {
                int iOrdinal = this.f121750OooOoo.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new C32442OooOO0o();
                    }
                }
            }
        } else if (i2 != 0) {
            OooOOO0(t);
            int i6 = this.f121755Oooo00O + 1;
            this.f121755Oooo00O = i6;
            if (i6 > i2) {
                OooOO0o();
            }
            this.f121754Oooo000 = OooOOOO() + ((long) this.f121755Oooo00O);
            return true;
        }
        return true;
    }

    public final Object OooOOoo(C33775OoooooO c33775OoooooO) {
        Object obj;
        Continuation<C32460OooOooO>[] continuationArrOooOo0 = C33792OooO0OO.f121826OooO00o;
        synchronized (this) {
            try {
                long jOooOOo = OooOOo(c33775OoooooO);
                if (jOooOOo < 0) {
                    obj = C33773Oooooo.f121761OooO00o;
                } else {
                    long j = c33775OoooooO.f121769OooO00o;
                    Object[] objArr = this.f121752OooOooO;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(objArr);
                    Object obj2 = objArr[((int) jOooOOo) & (objArr.length - 1)];
                    if (obj2 instanceof OooO00o) {
                        obj2 = ((OooO00o) obj2).f121760OooOoO0;
                    }
                    c33775OoooooO.f121769OooO00o = jOooOOo + 1;
                    Object obj3 = obj2;
                    continuationArrOooOo0 = OooOo0(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation<C32460OooOooO> continuation : continuationArrOooOo0) {
            if (continuation != null) {
                continuation.resumeWith(C32460OooOooO.f116667OooO00o);
            }
        }
        return obj;
    }

    public final Continuation<C32460OooOooO>[] OooOo0(long j) {
        long j2;
        long j3;
        long j4;
        int i;
        Continuation<C32460OooOooO>[] continuationArr;
        Object[] objArr;
        long j5 = this.f121754Oooo000;
        Continuation<C32460OooOooO>[] continuationArr2 = C33792OooO0OO.f121826OooO00o;
        if (j <= j5) {
            long jOooOOOO = OooOOOO();
            long j6 = ((long) this.f121755Oooo00O) + jOooOOOO;
            int i2 = this.f121751OooOoo0;
            if (i2 == 0 && this.f121756Oooo00o > 0) {
                j6++;
            }
            int i3 = 0;
            if (this.f121822OooOo != 0 && (objArr = this.f121823OooOo0o) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        long j7 = ((C33775OoooooO) obj).f121769OooO00o;
                        if (j7 >= 0 && j7 < j6) {
                            j6 = j7;
                        }
                    }
                }
            }
            if (j6 > this.f121754Oooo000) {
                long jOooOOOO2 = OooOOOO() + ((long) this.f121755Oooo00O);
                int iMin = this.f121822OooOo > 0 ? Math.min(this.f121756Oooo00o, i2 - ((int) (jOooOOOO2 - j6))) : this.f121756Oooo00o;
                long j8 = ((long) this.f121756Oooo00o) + jOooOOOO2;
                C33839OooOo0 c33839OooOo0 = C33773Oooooo.f121761OooO00o;
                if (iMin > 0) {
                    Continuation<C32460OooOooO>[] continuationArr3 = new Continuation[iMin];
                    j4 = 1;
                    Object[] objArr2 = this.f121752OooOooO;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(objArr2);
                    i = i2;
                    long j9 = jOooOOOO2;
                    while (true) {
                        if (jOooOOOO2 >= j8) {
                            j2 = jOooOOOO;
                            j3 = j6;
                            break;
                        }
                        j2 = jOooOOOO;
                        Object obj2 = objArr2[((int) jOooOOOO2) & (objArr2.length - 1)];
                        if (obj2 != c33839OooOo0) {
                            kotlin.jvm.internal.OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            OooO00o oooO00o = (OooO00o) obj2;
                            int i4 = i3 + 1;
                            j3 = j6;
                            continuationArr3[i3] = oooO00o.f121759OooOoO;
                            C33773Oooooo.OooO0OO(objArr2, jOooOOOO2, c33839OooOo0);
                            C33773Oooooo.OooO0OO(objArr2, j9, oooO00o.f121760OooOoO0);
                            j9++;
                            if (i4 >= iMin) {
                                break;
                            }
                            i3 = i4;
                        } else {
                            j3 = j6;
                        }
                        jOooOOOO2++;
                        jOooOOOO = j2;
                        j6 = j3;
                    }
                    jOooOOOO2 = j9;
                    continuationArr = continuationArr3;
                } else {
                    j2 = jOooOOOO;
                    j3 = j6;
                    j4 = 1;
                    i = i2;
                    continuationArr = continuationArr2;
                }
                int i5 = (int) (jOooOOOO2 - j2);
                long j10 = this.f121822OooOo == 0 ? jOooOOOO2 : j3;
                long jMax = Math.max(this.f121753OooOooo, jOooOOOO2 - ((long) Math.min(this.f121749OooOoOO, i5)));
                if (i == 0 && jMax < j8) {
                    Object[] objArr3 = this.f121752OooOooO;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(objArr3);
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(objArr3[((int) jMax) & (objArr3.length - 1)], c33839OooOo0)) {
                        jOooOOOO2 += j4;
                        jMax += j4;
                    }
                }
                OooOo00(jMax, j10, jOooOOOO2, j8);
                OooOO0();
                return continuationArr.length == 0 ? continuationArr : OooOOO(continuationArr);
            }
        }
        return continuationArr2;
    }

    public final void OooOo00(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jOooOOOO = OooOOOO(); jOooOOOO < jMin; jOooOOOO++) {
            Object[] objArr = this.f121752OooOooO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(objArr);
            C33773Oooooo.OooO0OO(objArr, jOooOOOO, null);
        }
        this.f121753OooOooo = j;
        this.f121754Oooo000 = j2;
        this.f121755Oooo00O = (int) (j3 - jMin);
        this.f121756Oooo00o = (int) (j4 - j3);
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, Continuation<?> continuation) {
        OooOO0O(this, interfaceC33723OooO0oO, continuation);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        Throwable th;
        Continuation<C32460OooOooO>[] continuationArrOooOOO;
        OooO00o oooO00o;
        if (OooO0Oo(t)) {
            return C32460OooOooO.f116667OooO00o;
        }
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation));
        c33614OooOOO0.OooOOoo();
        Continuation<C32460OooOooO>[] continuationArrOooOOO2 = C33792OooO0OO.f121826OooO00o;
        synchronized (this) {
            try {
                if (OooOOo0(t)) {
                    try {
                        c33614OooOOO0.resumeWith(C32460OooOooO.f116667OooO00o);
                        continuationArrOooOOO = OooOOO(continuationArrOooOOO2);
                        oooO00o = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        OooO00o oooO00o2 = new OooO00o(this, OooOOOO() + ((long) (this.f121755Oooo00O + this.f121756Oooo00o)), t, c33614OooOOO0);
                        OooOOO0(oooO00o2);
                        this.f121756Oooo00o++;
                        if (this.f121751OooOoo0 == 0) {
                            continuationArrOooOOO2 = OooOOO(continuationArrOooOOO2);
                        }
                        continuationArrOooOOO = continuationArrOooOOO2;
                        oooO00o = oooO00o2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (oooO00o != null) {
                    c33614OooOOO0.OooOo0O(new C33652OoooOoo(oooO00o));
                }
                for (Continuation<C32460OooOooO> continuation2 : continuationArrOooOOO) {
                    if (continuation2 != null) {
                        continuation2.resumeWith(C32460OooOooO.f116667OooO00o);
                    }
                }
                Object objOooOOo = c33614OooOOO0.OooOOo();
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooOOo != enumC32485OooO00o) {
                    objOooOOo = C32460OooOooO.f116667OooO00o;
                }
                return objOooOOo == enumC32485OooO00o ? objOooOOo : C32460OooOooO.f116667OooO00o;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }
}
