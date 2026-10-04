package oO0O0OoO;

import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.o000OOo;
import kotlin.coroutines.Continuation;
import oO00Oo0o.C32274OooO00o;
import oO00Oo0o.OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: oO0O0OoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", m80623f = "ByteChannelUtils.kt", m80624l = {23, 24, 26, 31}, m80625m = "invokeSuspend")
public final class C32708OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o000OOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC23986Ooooo0o f117598OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f117599OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f117600OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC32510OooOOo0 f117601OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public byte[] f117602OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public long f117603OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f117604OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f117605OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f117606OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32510OooOOo0<Long, Long, Continuation<? super C32460OooOooO>, Object> f117607Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public /* synthetic */ Object f117608Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ Long f117609Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23986Ooooo0o f117610Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C32708OooO00o(Long l, InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, InterfaceC32510OooOOo0<? super Long, ? super Long, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32510OooOOo0, Continuation<? super C32708OooO00o> continuation) {
        super(2, continuation);
        this.f117609Oooo00O = l;
        this.f117610Oooo00o = interfaceC23986Ooooo0o;
        this.f117607Oooo0 = interfaceC32510OooOOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C32708OooO00o c32708OooO00o = new C32708OooO00o(this.f117609Oooo00O, this.f117610Oooo00o, this.f117607Oooo0, continuation);
        c32708OooO00o.f117608Oooo000 = obj;
        return c32708OooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o000OOo o000ooo2, Continuation<? super C32460OooOooO> continuation) {
        return ((C32708OooO00o) create(o000ooo2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x018c, code lost:
    
        if (r11.invoke(r8, r6, r21) == r0) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:9:0x001b, B:62:0x018f, B:40:0x00d4, B:42:0x00da, B:45:0x00f6, B:55:0x015d, B:59:0x016e), top: B:67:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d A[Catch: all -> 0x0020, TRY_ENTER, TryCatch #0 {all -> 0x0020, blocks: (B:9:0x001b, B:62:0x018f, B:40:0x00d4, B:42:0x00da, B:45:0x00f6, B:55:0x015d, B:59:0x016e), top: B:67:0x000a }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0152 -> B:54:0x015a). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        OooO0o oooO0o;
        long j;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o;
        InterfaceC32510OooOOo0<Long, Long, Continuation<? super C32460OooOooO>, Object> interfaceC32510OooOOo0;
        o000OOo o000ooo2;
        Object obj2;
        long j2;
        byte[] bArr;
        long j3;
        OooO0o oooO0o2;
        Object obj3;
        InterfaceC32510OooOOo0<Long, Long, Continuation<? super C32460OooOooO>, Object> interfaceC32510OooOOo02;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o2;
        long j4;
        long j5;
        int i;
        Long l;
        Long l2;
        Object objOooO0o;
        Object obj4;
        int iIntValue;
        InterfaceC23967Oooo00O interfaceC23967Oooo00OOooO0OO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r2 = this.f117606OooOooo;
        int i2 = 1;
        try {
            if (r2 == 0) {
                j = 0;
                C32446OooOOOo.OooO0O0(obj);
                o000OOo o000ooo3 = (o000OOo) this.f117608Oooo000;
                oooO0o = C32274OooO00o.f115992OooO00o;
                Object objO0000OoO = oooO0o.o0000OoO();
                try {
                    byte[] bArr2 = (byte[]) objO0000OoO;
                    Long l3 = this.f117609Oooo00O;
                    long jLongValue = l3 != null ? l3.longValue() : -1L;
                    interfaceC23986Ooooo0o = this.f117610Oooo00o;
                    interfaceC32510OooOOo0 = this.f117607Oooo0;
                    o000ooo2 = o000ooo3;
                    obj2 = objO0000OoO;
                    j2 = 0;
                    long j6 = jLongValue;
                    bArr = bArr2;
                    j3 = j6;
                    if (!interfaceC23986Ooooo0o.OooOoo()) {
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th) {
                    th = th;
                    r2 = objO0000OoO;
                }
            } else if (r2 == 1) {
                j = 0;
                long j7 = this.f117603OooOoo;
                j3 = this.f117604OooOoo0;
                bArr = this.f117602OooOoOO;
                Object obj5 = this.f117600OooOoO;
                interfaceC32510OooOOo0 = this.f117601OooOoO0;
                interfaceC23986Ooooo0o = this.f117598OooOo;
                OooO0o oooO0o3 = (OooO0o) this.f117599OooOo0o;
                o000ooo2 = (o000OOo) this.f117608Oooo000;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    objOooO0o = obj;
                    j2 = j7;
                    obj4 = obj5;
                    oooO0o = oooO0o3;
                    iIntValue = ((Number) objOooO0o).intValue();
                    interfaceC23967Oooo00OOooO0OO = o000ooo2.OooO0OO();
                    this.f117608Oooo000 = o000ooo2;
                    this.f117599OooOo0o = oooO0o;
                    this.f117598OooOo = interfaceC23986Ooooo0o;
                    this.f117601OooOoO0 = interfaceC32510OooOOo0;
                    this.f117600OooOoO = obj4;
                    this.f117602OooOoOO = bArr;
                    this.f117604OooOoo0 = j3;
                    this.f117603OooOoo = j2;
                    this.f117605OooOooO = iIntValue;
                    this.f117606OooOooo = 2;
                    if (interfaceC23967Oooo00OOooO0OO.OooOOO0(bArr, iIntValue, this) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    r2 = obj5;
                    oooO0o = oooO0o3;
                }
            } else if (r2 == 2) {
                j = 0;
                i = this.f117605OooOooO;
                j5 = this.f117603OooOoo;
                long j8 = this.f117604OooOoo0;
                byte[] bArr3 = this.f117602OooOoOO;
                obj3 = this.f117600OooOoO;
                InterfaceC32510OooOOo0<Long, Long, Continuation<? super C32460OooOooO>, Object> interfaceC32510OooOOo03 = this.f117601OooOoO0;
                InterfaceC23986Ooooo0o interfaceC23986Ooooo0o3 = this.f117598OooOo;
                oooO0o2 = (OooO0o) this.f117599OooOo0o;
                o000OOo o000ooo4 = (o000OOo) this.f117608Oooo000;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    interfaceC32510OooOOo02 = interfaceC32510OooOOo03;
                    interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o3;
                    o000ooo2 = o000ooo4;
                    j4 = j8;
                    bArr = bArr3;
                    obj3 = obj3;
                    long j9 = j5 + ((long) i);
                    l = new Long(j9);
                    l2 = new Long(j4);
                    this.f117608Oooo000 = o000ooo2;
                    this.f117599OooOo0o = oooO0o2;
                    this.f117598OooOo = interfaceC23986Ooooo0o2;
                    interfaceC32510OooOOo0 = interfaceC32510OooOOo02;
                    this.f117601OooOoO0 = interfaceC32510OooOOo0;
                    this.f117600OooOoO = obj3;
                    this.f117602OooOoOO = bArr;
                    this.f117604OooOoo0 = j4;
                    this.f117603OooOoo = j9;
                    this.f117606OooOooo = 3;
                    if (interfaceC32510OooOOo0.invoke(l, l2, this) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th3) {
                    th = th3;
                    r2 = obj3;
                    oooO0o = oooO0o2;
                }
            } else {
                if (r2 != 3) {
                    if (r2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj6 = this.f117599OooOo0o;
                    oooO0o = (OooO0o) this.f117608Oooo000;
                    C32446OooOOOo.OooO0O0(obj);
                    r2 = obj6;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    oooO0o.o00o0O(r2);
                    return C32460OooOooO.f116667OooO00o;
                }
                long j10 = this.f117603OooOoo;
                long j11 = this.f117604OooOoo0;
                byte[] bArr4 = this.f117602OooOoOO;
                Object obj7 = this.f117600OooOoO;
                InterfaceC32510OooOOo0<Long, Long, Continuation<? super C32460OooOooO>, Object> interfaceC32510OooOOo04 = this.f117601OooOoO0;
                InterfaceC23986Ooooo0o interfaceC23986Ooooo0o4 = this.f117598OooOo;
                j = 0;
                oooO0o = (OooO0o) this.f117599OooOo0o;
                o000OOo o000ooo5 = (o000OOo) this.f117608Oooo000;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    o000ooo2 = o000ooo5;
                    j3 = j11;
                    interfaceC32510OooOOo0 = interfaceC32510OooOOo04;
                    interfaceC23986Ooooo0o = interfaceC23986Ooooo0o4;
                    bArr = bArr4;
                    Object obj8 = obj7;
                    j2 = j10;
                    i2 = 1;
                    obj2 = obj8;
                    if (!interfaceC23986Ooooo0o.OooOoo()) {
                        this.f117608Oooo000 = o000ooo2;
                        this.f117599OooOo0o = oooO0o;
                        this.f117598OooOo = interfaceC23986Ooooo0o;
                        this.f117601OooOoO0 = interfaceC32510OooOOo0;
                        this.f117600OooOoO = obj2;
                        this.f117602OooOoOO = bArr;
                        this.f117604OooOoo0 = j3;
                        this.f117603OooOoo = j2;
                        this.f117606OooOooo = i2;
                        objOooO0o = interfaceC23986Ooooo0o.OooO0o(bArr, 0, bArr.length, this);
                        obj4 = obj2;
                        if (objOooO0o != enumC32485OooO00o) {
                            iIntValue = ((Number) objOooO0o).intValue();
                            interfaceC23967Oooo00OOooO0OO = o000ooo2.OooO0OO();
                            this.f117608Oooo000 = o000ooo2;
                            this.f117599OooOo0o = oooO0o;
                            this.f117598OooOo = interfaceC23986Ooooo0o;
                            this.f117601OooOoO0 = interfaceC32510OooOOo0;
                            this.f117600OooOoO = obj4;
                            this.f117602OooOoOO = bArr;
                            this.f117604OooOoo0 = j3;
                            this.f117603OooOoo = j2;
                            this.f117605OooOooO = iIntValue;
                            this.f117606OooOooo = 2;
                            if (interfaceC23967Oooo00OOooO0OO.OooOOO0(bArr, iIntValue, this) != enumC32485OooO00o) {
                                oooO0o2 = oooO0o;
                                InterfaceC23986Ooooo0o interfaceC23986Ooooo0o5 = interfaceC23986Ooooo0o;
                                obj3 = obj4;
                                i = iIntValue;
                                interfaceC32510OooOOo02 = interfaceC32510OooOOo0;
                                interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o5;
                                j4 = j3;
                                j5 = j2;
                                long j92 = j5 + ((long) i);
                                l = new Long(j92);
                                l2 = new Long(j4);
                                this.f117608Oooo000 = o000ooo2;
                                this.f117599OooOo0o = oooO0o2;
                                this.f117598OooOo = interfaceC23986Ooooo0o2;
                                interfaceC32510OooOOo0 = interfaceC32510OooOOo02;
                                this.f117601OooOoO0 = interfaceC32510OooOOo0;
                                this.f117600OooOoO = obj3;
                                this.f117602OooOoOO = bArr;
                                this.f117604OooOoo0 = j4;
                                this.f117603OooOoo = j92;
                                this.f117606OooOooo = 3;
                                if (interfaceC32510OooOOo0.invoke(l, l2, this) != enumC32485OooO00o) {
                                    j3 = j4;
                                    Object obj9 = obj3;
                                    interfaceC23986Ooooo0o = interfaceC23986Ooooo0o2;
                                    j2 = j92;
                                    obj8 = obj9;
                                    oooO0o = oooO0o2;
                                    i2 = 1;
                                    obj2 = obj8;
                                    if (!interfaceC23986Ooooo0o.OooOoo()) {
                                        Throwable thOooO0O0 = interfaceC23986Ooooo0o.OooO0O0();
                                        o000ooo2.OooO0OO().OooO0Oo(thOooO0O0);
                                        r2 = obj2;
                                        if (thOooO0O0 == null) {
                                            r2 = obj2;
                                            if (j2 == j) {
                                                Long l4 = new Long(j2);
                                                Long l5 = new Long(j3);
                                                this.f117608Oooo000 = oooO0o;
                                                this.f117599OooOo0o = obj2;
                                                this.f117598OooOo = null;
                                                this.f117601OooOoO0 = null;
                                                this.f117600OooOoO = null;
                                                this.f117602OooOoOO = null;
                                                this.f117606OooOooo = 4;
                                                r2 = obj2;
                                            }
                                        }
                                        C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                                        oooO0o.o00o0O(r2);
                                        return C32460OooOooO.f116667OooO00o;
                                    }
                                }
                            }
                        }
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th4) {
                    th = th4;
                    r2 = obj7;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
        oooO0o.o00o0O(r2);
        throw th;
    }
}
