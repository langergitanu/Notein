package Oooo0oO;

import OooOo.C20486OooOoO0;
import Oooo.C20812OooO0Oo;
import OoooOOo.AbstractC21194OooO0oO;
import OoooOOo.AbstractC21223Oooo0OO;
import OoooOOo.C21192OooO0o;
import OoooOOo.C21200OooOOO0;
import java.util.Collection;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33702OooOOO;
import oO0o0OOo.C33703OooOOO0;
import oO0o0OOo.InterfaceC33699OooOO0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: Oooo0oO.o000Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", m80623f = "SnapshotFlow.kt", m80624l = {146, 150, 172}, m80625m = "invokeSuspend")
public final class C21106o000Ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<Object>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC32507OooOO0o f61237OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C20486OooOoO0 f61238OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C21192OooO0o f61239OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC33699OooOO0 f61240OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f61241OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f61242OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f61243OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.OooOOOO f61244OooOooO;

    /* JADX INFO: renamed from: Oooo0oO.o000Ooo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Object, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C20486OooOoO0<Object> f61245OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C20486OooOoO0<Object> c20486OooOoO0) {
            super(1);
            this.f61245OooOo0o = c20486OooOoO0;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Object obj) {
            if (obj instanceof AbstractC21223Oooo0OO) {
                ((AbstractC21223Oooo0OO) obj).OooO(4);
            }
            this.f61245OooOo0o.OooO0Oo(obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: Oooo0oO.o000Ooo$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<Set<? extends Object>, AbstractC21194OooO0oO, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33695OooO0o0 f61246OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C33695OooO0o0 c33695OooO0o0) {
            super(2);
            this.f61246OooOo0o = c33695OooO0o0;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
        @Override // oO0O000o.InterfaceC32508OooOOOo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C32460OooOooO invoke(Set<? extends Object> set, AbstractC21194OooO0oO abstractC21194OooO0oO) {
            Set<? extends Object> set2 = set;
            if (set2 instanceof C20812OooO0Oo) {
                OooOo.Oooo000<T> oooo000 = ((C20812OooO0Oo) set2).f59754OooOo0o;
                Object[] objArr = oooo000.f58542OooO0O0;
                long[] jArr = oooo000.f58541OooO00o;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    loop0: while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    Object obj = objArr[(i << 3) + i3];
                                    if (!(obj instanceof AbstractC21223Oooo0OO) || ((AbstractC21223Oooo0OO) obj).OooO0oo(4)) {
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Set<? extends Object> set3 = set2;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    for (Object obj2 : set3) {
                        if (!(obj2 instanceof AbstractC21223Oooo0OO) || ((AbstractC21223Oooo0OO) obj2).OooO0oo(4)) {
                            this.f61246OooOo0o.OooO0o0(set2);
                            break loop0;
                        }
                    }
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21106o000Ooo(oO0O000o.OooO00o<Object> oooO00o, Continuation<? super C21106o000Ooo> continuation) {
        super(2, continuation);
        this.f61244OooOooO = (kotlin.jvm.internal.OooOOOO) oooO00o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C21106o000Ooo c21106o000Ooo = new C21106o000Ooo(this.f61244OooOooO, continuation);
        c21106o000Ooo.f61242OooOoo = obj;
        return c21106o000Ooo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        ((C21106o000Ooo) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01a0, code lost:
    
        r6 = r18;
        r2 = r19;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0163 A[EDGE_INSN: B:126:0x0163->B:70:0x0163 BREAK  A[LOOP:0: B:38:0x00db->B:97:0x01bd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8 A[Catch: all -> 0x0027, PHI: r0 r2 r4 r5 r6 r7 r8 r9 r10 r11
      0x00d8: PHI (r0v6 int) = (r0v27 int), (r0v0 int) binds: [B:34:0x00d4, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r2v1 boolean) = (r2v12 boolean), (r2v0 boolean) binds: [B:34:0x00d4, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r4v8 java.lang.Object) = (r4v11 java.lang.Object), (r4v14 java.lang.Object) binds: [B:34:0x00d4, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r5v1 int) = (r5v15 int), (r5v0 int) binds: [B:34:0x00d4, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r6v6 OoooOOo.OooO0o) = (r6v22 OoooOOo.OooO0o), (r6v25 OoooOOo.OooO0o) binds: [B:34:0x00d4, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r7v2 oO0o0OOo.OooOO0) = (r7v11 oO0o0OOo.OooOO0), (r7v12 oO0o0OOo.OooOO0) binds: [B:34:0x00d4, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r8v1 oO0O000o.OooOO0o<java.lang.Object, oO00ooO.OooOooO>) = (r8v2 oO0O000o.OooOO0o<java.lang.Object, oO00ooO.OooOooO>), (r8v5 oO0O000o.OooOO0o<java.lang.Object, oO00ooO.OooOooO>) binds: [B:34:0x00d4, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r9v1 OooOo.OooOoO0) = (r9v2 OooOo.OooOoO0), (r9v5 OooOo.OooOoO0) binds: [B:34:0x00d4, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r10v2 oO0o0Oo.OooO0oO) = (r10v3 oO0o0Oo.OooO0oO), (r10v8 oO0o0Oo.OooO0oO) binds: [B:34:0x00d4, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r11v6 java.lang.Object) = (r11v11 java.lang.Object), (r11v12 java.lang.Object) binds: [B:34:0x00d4, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {all -> 0x0027, blocks: (B:8:0x001f, B:33:0x00c2, B:36:0x00d8, B:79:0x0190, B:95:0x01b9, B:96:0x01bc, B:15:0x0040, B:18:0x0055, B:25:0x0093, B:29:0x00a8, B:102:0x01cc, B:103:0x01cf, B:26:0x009d, B:28:0x00a5, B:99:0x01c7, B:100:0x01ca), top: B:121:0x0009, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165 A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #4 {all -> 0x01a6, blocks: (B:50:0x011d, B:68:0x0156, B:71:0x0165, B:75:0x017d, B:77:0x0186, B:54:0x0128, B:60:0x0137), top: B:117:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bd A[LOOP:0: B:38:0x00db->B:97:0x01bd, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v20, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x019f -> B:83:0x01a0). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C21192OooO0o c21192OooO0o;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        C20486OooOoO0 c20486OooOoO0;
        InterfaceC32507OooOO0o<Object, C32460OooOooO> oooO00o;
        Object obj2;
        Object objOooO0oO;
        InterfaceC33699OooOO0 interfaceC33699OooOO0;
        Set set;
        boolean z;
        C21192OooO0o c21192OooO0o2;
        int i;
        boolean z2;
        int i2;
        int i3;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOo00;
        InterfaceC33699OooOO0 interfaceC33699OooOO02;
        int i4 = 3;
        boolean z3 = true;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i5 = this.f61243OooOoo0;
        int i6 = 2;
        try {
            if (i5 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f61242OooOoo;
                c20486OooOoO0 = new C20486OooOoO0((Object) null);
                oooO00o = new OooO00o(c20486OooOoO0);
                C33695OooO0o0 c33695OooO0o0OooO00o = C33703OooOOO0.OooO00o(Integer.MAX_VALUE, 6, null);
                OooO0O0 oooO0O0 = new OooO0O0(c33695OooO0o0OooO00o);
                C21200OooOOO0.OooO0o(C21200OooOOO0.f61494OooO00o);
                synchronized (C21200OooOOO0.f61496OooO0OO) {
                    C21200OooOOO0.f61501OooO0oo = oOo000Oo.OooOo.OooooOo((Collection) C21200OooOOO0.f61501OooO0oo, oooO0O0);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
                c21192OooO0o = new C21192OooO0o(oooO0O0);
                AbstractC21194OooO0oO abstractC21194OooO0oOOooOo002 = C21200OooOOO0.OooOO0O().OooOo00(oooO00o);
                ?? r11 = this.f61244OooOooO;
                try {
                    AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0 = abstractC21194OooO0oOOooOo002.OooOO0();
                    try {
                        Object objInvoke = r11.invoke();
                        abstractC21194OooO0oOOooOo002.OooO0OO();
                        this.f61242OooOoo = interfaceC33723OooO0oO;
                        this.f61238OooOo0o = c20486OooOoO0;
                        this.f61237OooOo = oooO00o;
                        this.f61240OooOoO0 = c33695OooO0o0OooO00o;
                        this.f61239OooOoO = c21192OooO0o;
                        this.f61241OooOoOO = objInvoke;
                        this.f61243OooOoo0 = 1;
                        if (interfaceC33723OooO0oO.emit(objInvoke, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        obj2 = objInvoke;
                        interfaceC33699OooOO02 = c33695OooO0o0OooO00o;
                    } finally {
                        AbstractC21194OooO0oO.OooOOOo(abstractC21194OooO0oOOooOO0);
                    }
                } finally {
                    abstractC21194OooO0oOOooOo002.OooO0OO();
                }
            } else if (i5 == 1) {
                obj2 = this.f61241OooOoOO;
                c21192OooO0o = this.f61239OooOoO;
                InterfaceC33699OooOO0 interfaceC33699OooOO03 = this.f61240OooOoO0;
                oooO00o = this.f61237OooOo;
                c20486OooOoO0 = this.f61238OooOo0o;
                interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f61242OooOoo;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33699OooOO02 = interfaceC33699OooOO03;
            } else if (i5 == 2) {
                obj2 = this.f61241OooOoOO;
                c21192OooO0o = this.f61239OooOoO;
                InterfaceC33699OooOO0 interfaceC33699OooOO04 = this.f61240OooOoO0;
                oooO00o = this.f61237OooOo;
                c20486OooOoO0 = this.f61238OooOo0o;
                interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f61242OooOoo;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0oO = obj;
                interfaceC33699OooOO0 = interfaceC33699OooOO04;
                set = (Set) objOooO0oO;
                z = false;
                while (true) {
                    if (z) {
                        try {
                            Object[] objArr = c20486OooOoO0.f58542OooO0O0;
                            long[] jArr = c20486OooOoO0.f58541OooO00o;
                            int length = jArr.length - i6;
                            if (length >= 0) {
                                z2 = z3;
                                int i7 = 0;
                                while (true) {
                                    long j = jArr[i7];
                                    c21192OooO0o2 = c21192OooO0o;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8;
                                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                                        i = i4;
                                        int i10 = 0;
                                        while (i10 < i9) {
                                            if ((j & 255) < 128) {
                                                i2 = i8;
                                                try {
                                                    if (set.contains(objArr[(i7 << 3) + i10])) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    c21192OooO0o = c21192OooO0o2;
                                                    c21192OooO0o.OooO0O0();
                                                    throw th;
                                                }
                                            } else {
                                                i2 = i8;
                                            }
                                            j >>= i2;
                                            i10++;
                                            i8 = i2;
                                        }
                                        if (i9 != i8) {
                                            break;
                                        }
                                    } else {
                                        i = i4;
                                    }
                                    if (i7 == length) {
                                        break;
                                    }
                                    i7++;
                                    c21192OooO0o = c21192OooO0o2;
                                    i4 = i;
                                }
                            } else {
                                i = i4;
                                z2 = z3;
                                c21192OooO0o2 = c21192OooO0o;
                            }
                            z = false;
                            set = (Set) C33702OooOOO.OooO0O0(interfaceC33699OooOO0.OooO0oo());
                            if (set == null) {
                                break;
                            }
                            z3 = z2;
                            c21192OooO0o = c21192OooO0o2;
                            i4 = i;
                            i6 = 2;
                        } catch (Throwable th2) {
                            th = th2;
                            c21192OooO0o2 = c21192OooO0o;
                        }
                    } else {
                        i = i4;
                        z2 = z3;
                        c21192OooO0o2 = c21192OooO0o;
                    }
                    z = z2;
                    set = (Set) C33702OooOOO.OooO0O0(interfaceC33699OooOO0.OooO0oo());
                    if (set == null) {
                    }
                }
                if (!z) {
                    try {
                        c20486OooOoO0.OooO0o0();
                        abstractC21194OooO0oOOooOo00 = C21200OooOOO0.OooOO0O().OooOo00(oooO00o);
                        ?? r0 = this.f61244OooOooO;
                        try {
                            Object objInvoke2 = r0.invoke();
                            abstractC21194OooO0oOOooOo00.OooO0OO();
                            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(objInvoke2, obj2)) {
                                this.f61242OooOoo = interfaceC33723OooO0oO;
                                this.f61238OooOo0o = c20486OooOoO0;
                                this.f61237OooOo = oooO00o;
                                this.f61240OooOoO0 = interfaceC33699OooOO0;
                                c21192OooO0o = c21192OooO0o2;
                                this.f61239OooOoO = c21192OooO0o;
                                this.f61241OooOoOO = objInvoke2;
                                i3 = i;
                                this.f61243OooOoo0 = i3;
                                if (interfaceC33723OooO0oO.emit(objInvoke2, this) != enumC32485OooO00o) {
                                    obj2 = objInvoke2;
                                }
                                return enumC32485OooO00o;
                            }
                            c21192OooO0o = c21192OooO0o2;
                            i3 = i;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            throw th;
                        }
                    }
                    AbstractC21194OooO0oO abstractC21194OooO0oOOooOO02 = abstractC21194OooO0oOOooOo00.OooOO0();
                }
                i4 = i3;
                z3 = z2;
                i6 = 2;
                interfaceC33699OooOO02 = interfaceC33699OooOO0;
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f61241OooOoOO;
                c21192OooO0o = this.f61239OooOoO;
                interfaceC33699OooOO0 = this.f61240OooOoO0;
                oooO00o = this.f61237OooOo;
                c20486OooOoO0 = this.f61238OooOo0o;
                interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f61242OooOoo;
                C32446OooOOOo.OooO0O0(obj);
                z2 = true;
                i3 = 3;
                i4 = i3;
                z3 = z2;
                i6 = 2;
                interfaceC33699OooOO02 = interfaceC33699OooOO0;
            }
            this.f61242OooOoo = interfaceC33723OooO0oO;
            this.f61238OooOo0o = c20486OooOoO0;
            this.f61237OooOo = oooO00o;
            this.f61240OooOoO0 = interfaceC33699OooOO02;
            this.f61239OooOoO = c21192OooO0o;
            this.f61241OooOoOO = obj2;
            this.f61243OooOoo0 = i6;
            objOooO0oO = interfaceC33699OooOO02.OooO0oO(this);
            interfaceC33699OooOO0 = interfaceC33699OooOO02;
            if (objOooO0oO == enumC32485OooO00o) {
                set = (Set) objOooO0oO;
                z = false;
                while (true) {
                    if (z) {
                    }
                    z = z2;
                    set = (Set) C33702OooOOO.OooO0O0(interfaceC33699OooOO0.OooO0oo());
                    if (set == null) {
                    }
                    z3 = z2;
                    c21192OooO0o = c21192OooO0o2;
                    i4 = i;
                    i6 = 2;
                }
                if (!z) {
                }
                i4 = i3;
                z3 = z2;
                i6 = 2;
                interfaceC33699OooOO02 = interfaceC33699OooOO0;
                this.f61242OooOoo = interfaceC33723OooO0oO;
                this.f61238OooOo0o = c20486OooOoO0;
                this.f61237OooOo = oooO00o;
                this.f61240OooOoO0 = interfaceC33699OooOO02;
                this.f61239OooOoO = c21192OooO0o;
                this.f61241OooOoOO = obj2;
                this.f61243OooOoo0 = i6;
                objOooO0oO = interfaceC33699OooOO02.OooO0oO(this);
                interfaceC33699OooOO0 = interfaceC33699OooOO02;
                if (objOooO0oO == enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        } catch (Throwable th6) {
            th = th6;
            c21192OooO0o.OooO0O0();
            throw th;
        }
    }
}
