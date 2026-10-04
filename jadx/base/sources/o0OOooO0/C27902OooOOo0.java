package o0OOooO0;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import o0000oOO.C24332OooO;
import o0OOooO0.C27883OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33622OooOo00;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOooO0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.CloudLockManager$startRenewLoop$1", m80623f = "CloudLockManager.kt", m80624l = {705, 534, 716, 547, 727, 556, 571, 584}, m80625m = "invokeSuspend")
public final class C27902OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f98652OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f98653OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f98654OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C27883OooO00o f98655OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f98656OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f98657OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f98658OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ Object f98659OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C27883OooO00o f98660OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33622OooOo00<Throwable> f98661Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ long f98662Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ String f98663Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27902OooOOo0(C27883OooO00o c27883OooO00o, InterfaceC33622OooOo00<Throwable> interfaceC33622OooOo00, long j, String str, Continuation<? super C27902OooOOo0> continuation) {
        super(2, continuation);
        this.f98660OooOooo = c27883OooO00o;
        this.f98661Oooo000 = interfaceC33622OooOo00;
        this.f98662Oooo00O = j;
        this.f98663Oooo00o = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27902OooOOo0 c27902OooOOo0 = new C27902OooOOo0(this.f98660OooOooo, this.f98661Oooo000, this.f98662Oooo00O, this.f98663Oooo00o, continuation);
        c27902OooOOo0.f98659OooOooO = obj;
        return c27902OooOOo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27902OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:80|81|82|156|83|(3:86|87|(4:89|90|91|92)(3:97|(1:99)(1:100)|(1:102)(9:103|154|104|105|106|(1:108)|109|37|(0))))) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x027a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x027b, code lost:
    
        r26 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0305, code lost:
    
        if (r3.OooO0oo(r0, r30) != r2) goto L141;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x0073: MOVE (r7 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:23:0x0071 */
    /* JADX WARN: Path cross not found for [B:119:0x028c, B:125:0x029f], limit reached: 150 */
    /* JADX WARN: Path cross not found for [B:125:0x029f, B:119:0x028c], limit reached: 150 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0250 A[Catch: Exception -> 0x0025, CancellationException -> 0x0028, OooOO0 -> 0x01d9, TryCatch #5 {OooOO0 -> 0x01d9, blocks: (B:106:0x0221, B:108:0x0250, B:91:0x01d5, B:110:0x0274, B:111:0x0277), top: B:147:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028c A[Catch: Exception -> 0x0025, CancellationException -> 0x0028, TryCatch #10 {CancellationException -> 0x0028, Exception -> 0x0025, blocks: (B:7:0x0020, B:130:0x02c7, B:106:0x0221, B:108:0x0250, B:37:0x00d4, B:39:0x00da, B:47:0x010c, B:53:0x0117, B:56:0x011e, B:59:0x012d, B:63:0x0142, B:73:0x0169, B:75:0x016e, B:77:0x017e, B:81:0x0195, B:83:0x01ab, B:91:0x01d5, B:117:0x0282, B:119:0x028c, B:121:0x0294, B:127:0x02a2, B:132:0x02ca, B:110:0x0274, B:111:0x0277, B:134:0x02d9, B:135:0x02dd, B:136:0x02de, B:137:0x02e1, B:20:0x0061, B:25:0x0081, B:28:0x009d, B:31:0x00af, B:34:0x00c3), top: B:147:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a2 A[Catch: Exception -> 0x0025, CancellationException -> 0x0028, TryCatch #10 {CancellationException -> 0x0028, Exception -> 0x0025, blocks: (B:7:0x0020, B:130:0x02c7, B:106:0x0221, B:108:0x0250, B:37:0x00d4, B:39:0x00da, B:47:0x010c, B:53:0x0117, B:56:0x011e, B:59:0x012d, B:63:0x0142, B:73:0x0169, B:75:0x016e, B:77:0x017e, B:81:0x0195, B:83:0x01ab, B:91:0x01d5, B:117:0x0282, B:119:0x028c, B:121:0x0294, B:127:0x02a2, B:132:0x02ca, B:110:0x0274, B:111:0x0277, B:134:0x02d9, B:135:0x02dd, B:136:0x02de, B:137:0x02e1, B:20:0x0061, B:25:0x0081, B:28:0x009d, B:31:0x00af, B:34:0x00c3), top: B:147:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ca A[Catch: Exception -> 0x0025, CancellationException -> 0x0028, TryCatch #10 {CancellationException -> 0x0028, Exception -> 0x0025, blocks: (B:7:0x0020, B:130:0x02c7, B:106:0x0221, B:108:0x0250, B:37:0x00d4, B:39:0x00da, B:47:0x010c, B:53:0x0117, B:56:0x011e, B:59:0x012d, B:63:0x0142, B:73:0x0169, B:75:0x016e, B:77:0x017e, B:81:0x0195, B:83:0x01ab, B:91:0x01d5, B:117:0x0282, B:119:0x028c, B:121:0x0294, B:127:0x02a2, B:132:0x02ca, B:110:0x0274, B:111:0x0277, B:134:0x02d9, B:135:0x02dd, B:136:0x02de, B:137:0x02e1, B:20:0x0061, B:25:0x0081, B:28:0x009d, B:31:0x00af, B:34:0x00c3), top: B:147:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da A[Catch: Exception -> 0x0025, CancellationException -> 0x0028, TRY_LEAVE, TryCatch #10 {CancellationException -> 0x0028, Exception -> 0x0025, blocks: (B:7:0x0020, B:130:0x02c7, B:106:0x0221, B:108:0x0250, B:37:0x00d4, B:39:0x00da, B:47:0x010c, B:53:0x0117, B:56:0x011e, B:59:0x012d, B:63:0x0142, B:73:0x0169, B:75:0x016e, B:77:0x017e, B:81:0x0195, B:83:0x01ab, B:91:0x01d5, B:117:0x0282, B:119:0x028c, B:121:0x0294, B:127:0x02a2, B:132:0x02ca, B:110:0x0274, B:111:0x0277, B:134:0x02d9, B:135:0x02dd, B:136:0x02de, B:137:0x02e1, B:20:0x0061, B:25:0x0081, B:28:0x009d, B:31:0x00af, B:34:0x00c3), top: B:147:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #0 {all -> 0x0110, blocks: (B:43:0x00f6, B:45:0x00fc, B:51:0x0114), top: B:145:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114 A[Catch: all -> 0x0110, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0110, blocks: (B:43:0x00f6, B:45:0x00fc, B:51:0x0114), top: B:145:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e A[Catch: Exception -> 0x0025, CancellationException -> 0x0028, TRY_LEAVE, TryCatch #10 {CancellationException -> 0x0028, Exception -> 0x0025, blocks: (B:7:0x0020, B:130:0x02c7, B:106:0x0221, B:108:0x0250, B:37:0x00d4, B:39:0x00da, B:47:0x010c, B:53:0x0117, B:56:0x011e, B:59:0x012d, B:63:0x0142, B:73:0x0169, B:75:0x016e, B:77:0x017e, B:81:0x0195, B:83:0x01ab, B:91:0x01d5, B:117:0x0282, B:119:0x028c, B:121:0x0294, B:127:0x02a2, B:132:0x02ca, B:110:0x0274, B:111:0x0277, B:134:0x02d9, B:135:0x02dd, B:136:0x02de, B:137:0x02e1, B:20:0x0061, B:25:0x0081, B:28:0x009d, B:31:0x00af, B:34:0x00c3), top: B:147:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c5 A[Catch: all -> 0x01dc, TRY_LEAVE, TryCatch #8 {all -> 0x01dc, blocks: (B:104:0x021e, B:87:0x01bf, B:89:0x01c5, B:97:0x01df, B:100:0x0216), top: B:154:0x021e }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01df A[Catch: all -> 0x01dc, TRY_ENTER, TryCatch #8 {all -> 0x01dc, blocks: (B:104:0x021e, B:87:0x01bf, B:89:0x01c5, B:97:0x01df, B:100:0x0216), top: B:154:0x021e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x021c -> B:154:0x021e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x02ca -> B:109:0x026f). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o2;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        Throwable th;
        String str;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o3;
        long j2;
        C27883OooO00o.C27886OooO0o0 c27886OooO0o0;
        C27883OooO00o c27883OooO00o;
        long jLongValue;
        String str2;
        long j3;
        long j4;
        Object objOooO0O0;
        C27883OooO00o.C27886OooO0o0 c27886OooO0o02;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        long j5;
        C27883OooO00o c27883OooO00o2;
        boolean z;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o4;
        C27883OooO00o.C27886OooO0o0 c27886OooO0o03;
        long j6;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o5;
        C27883OooO00o c27883OooO00o3;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o6;
        long jCurrentTimeMillis;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98657OooOoo;
        C27883OooO00o c27883OooO00o4 = this.f98660OooOooo;
        InterfaceC33622OooOo00<Throwable> interfaceC33622OooOo00 = this.f98661Oooo000;
        long j7 = this.f98662Oooo00O;
        C33898OooO0Oo c33898OooO0Oo = c27883OooO00o4.f98554OooO0OO;
        try {
            try {
                try {
                } catch (o0OO000.OooOO0 e) {
                    e = e;
                    j = j7;
                    interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
                    str = e.f90831OooOo0o;
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str, "1002") || kotlin.jvm.internal.OooOOO0.OooO0O0(str, "1004") || kotlin.jvm.internal.OooOOO0.OooO0O0(str, "1003")) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("CloudLockManager");
                        c20358OooO00o.OooOO0o(e, "Lock renewal failed, will retry", new Object[0]);
                        interfaceC33636Oooo00o6 = interfaceC33636Oooo00o2;
                        j7 = j;
                        if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o6)) {
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("CloudLockManager");
                    c20358OooO00o2.OooO0Oo(e, "Lock expired/invalid during renewal", new Object[0]);
                    interfaceC33622OooOo00.Oooo0(e);
                    this.f98659OooOooO = null;
                    this.f98653OooOo0o = null;
                    this.f98652OooOo = null;
                    this.f98655OooOoO0 = null;
                    this.f98654OooOoO = null;
                    this.f98657OooOoo = 7;
                    if (c27883OooO00o4.OooO0oo(e, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            } catch (o0OO000.OooOO0 e2) {
                e = e2;
                str = e.f90831OooOo0o;
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str, "1002") || kotlin.jvm.internal.OooOOO0.OooO0O0(str, "1004") || kotlin.jvm.internal.OooOOO0.OooO0O0(str, "1003")) {
                }
            }
        } catch (CancellationException e3) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("CloudLockManager");
            c20358OooO00o3.OooO00o("RenewLoop cancelled", new Object[0]);
            throw e3;
        } catch (Exception e4) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("CloudLockManager");
            c20358OooO00o4.OooO0Oo(e4, "RenewLoop terminated with unexpected error", new Object[0]);
            interfaceC33622OooOo00.Oooo0(e4);
            this.f98659OooOooO = null;
            this.f98653OooOo0o = null;
            this.f98652OooOo = null;
            this.f98655OooOoO0 = null;
            this.f98654OooOoO = null;
            this.f98657OooOoo = 8;
        }
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o6 = (InterfaceC33636Oooo00o) this.f98659OooOooO;
                if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o6)) {
                    this.f98659OooOooO = interfaceC33636Oooo00o6;
                    this.f98653OooOo0o = c33898OooO0Oo;
                    this.f98652OooOo = c27883OooO00o4;
                    this.f98655OooOoO0 = null;
                    this.f98654OooOoO = null;
                    this.f98656OooOoOO = j7;
                    this.f98657OooOoo = 1;
                    if (c33898OooO0Oo.OooO00o(this) != enumC32485OooO00o) {
                        interfaceC33636Oooo00o5 = interfaceC33636Oooo00o6;
                        c27883OooO00o3 = c27883OooO00o4;
                        j6 = j7;
                        interfaceC33895OooO00o3 = c33898OooO0Oo;
                        try {
                            if (c27883OooO00o3.f98557OooO0o0 == j6) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o5.OooOOO0("CloudLockManager");
                                c20358OooO00o5.OooO00o("RenewLoop exiting: generation mismatch", new Object[0]);
                                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                interfaceC33895OooO00o3.OooOOO0(null);
                                return c32460OooOooO;
                            }
                            c27886OooO0o03 = c27883OooO00o3.f98556OooO0o;
                            interfaceC33895OooO00o3.OooOOO0(null);
                            if (c27886OooO0o03 != null) {
                                InterfaceC33636Oooo00o interfaceC33636Oooo00o7 = interfaceC33636Oooo00o5;
                                long jOooO00o = c27886OooO0o03.OooO00o() / ((long) 3);
                                if (jOooO00o < 5000) {
                                    jOooO00o = 5000;
                                }
                                this.f98659OooOooO = interfaceC33636Oooo00o7;
                                this.f98653OooOo0o = c27886OooO0o03;
                                this.f98652OooOo = null;
                                this.f98657OooOoo = 2;
                                if (C33644OoooO0.OooO00o(jOooO00o, this) != enumC32485OooO00o) {
                                    interfaceC33636Oooo00o4 = interfaceC33636Oooo00o7;
                                    C27883OooO00o.C27886OooO0o0 c27886OooO0o04 = c27886OooO0o03;
                                    this.f98659OooOooO = interfaceC33636Oooo00o4;
                                    this.f98653OooOo0o = c27886OooO0o04;
                                    this.f98652OooOo = c33898OooO0Oo;
                                    this.f98655OooOoO0 = c27883OooO00o4;
                                    this.f98656OooOoOO = j7;
                                    this.f98657OooOoo = 3;
                                    if (c33898OooO0Oo.OooO00o(this) != enumC32485OooO00o) {
                                        c27883OooO00o2 = c27883OooO00o4;
                                        interfaceC33636Oooo00o3 = interfaceC33636Oooo00o4;
                                        j5 = j7;
                                        j4 = j5;
                                        c27886OooO0o02 = c27886OooO0o04;
                                        interfaceC33895OooO00o2 = c33898OooO0Oo;
                                        try {
                                            z = c27883OooO00o2.f98557OooO0o0 != j5;
                                            interfaceC33895OooO00o2.OooOOO0(null);
                                            if (z) {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o6.OooOOO0("CloudLockManager");
                                                c20358OooO00o6.OooO00o("RenewLoop exiting after delay: generation changed", new Object[0]);
                                                return C32460OooOooO.f116667OooO00o;
                                            }
                                            try {
                                            } catch (o0OO000.OooOO0 e5) {
                                                e = e5;
                                                j = j4;
                                                interfaceC33636Oooo00o2 = interfaceC33636Oooo00o3;
                                                str = e.f90831OooOo0o;
                                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "1002")) {
                                                }
                                                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str, "1002") || kotlin.jvm.internal.OooOOO0.OooO0O0(str, "1004") || kotlin.jvm.internal.OooOOO0.OooO0O0(str, "1003")) {
                                                }
                                                break;
                                            }
                                            String str3 = c27886OooO0o02.f98572OooO00o;
                                            this.f98659OooOooO = interfaceC33636Oooo00o3;
                                            this.f98653OooOo0o = c27886OooO0o02;
                                            this.f98652OooOo = null;
                                            this.f98655OooOoO0 = null;
                                            this.f98657OooOoo = 4;
                                            objOooO0O0 = C27883OooO00o.OooO0O0(c27883OooO00o4, str3, this);
                                            if (objOooO0O0 != enumC32485OooO00o) {
                                                c27886OooO0o0 = c27886OooO0o02;
                                                jLongValue = ((Number) objOooO0O0).longValue();
                                                str2 = this.f98663Oooo00o;
                                                this.f98659OooOooO = interfaceC33636Oooo00o3;
                                                this.f98653OooOo0o = c27886OooO0o0;
                                                this.f98652OooOo = c33898OooO0Oo;
                                                this.f98655OooOoO0 = c27883OooO00o4;
                                                this.f98654OooOoO = str2;
                                                this.f98656OooOoOO = jLongValue;
                                                long j8 = j4;
                                                this.f98658OooOoo0 = j8;
                                                this.f98657OooOoo = 5;
                                                if (c33898OooO0Oo.OooO00o(this) != enumC32485OooO00o) {
                                                    c27883OooO00o = c27883OooO00o4;
                                                    j2 = j8;
                                                    j = j2;
                                                    interfaceC33895OooO00o = c33898OooO0Oo;
                                                    interfaceC33636Oooo00o2 = interfaceC33636Oooo00o3;
                                                    if (c27883OooO00o.f98557OooO0o0 == j2) {
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                                                        c20358OooO00o7.OooOOO0("CloudLockManager");
                                                        c20358OooO00o7.OooO00o("RenewLoop: generation changed during renew", new Object[0]);
                                                        C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                                                        interfaceC33895OooO00o.OooOOO0(null);
                                                        return c32460OooOooO2;
                                                    }
                                                    c27886OooO0o0.f98573OooO0O0.set(jLongValue);
                                                    String str4 = c27886OooO0o0.f98572OooO00o;
                                                    this.f98659OooOooO = interfaceC33636Oooo00o2;
                                                    this.f98653OooOo0o = interfaceC33895OooO00o;
                                                    this.f98652OooOo = null;
                                                    this.f98655OooOoO0 = null;
                                                    this.f98654OooOoO = null;
                                                    this.f98656OooOoOO = jLongValue;
                                                    this.f98657OooOoo = 6;
                                                    long j9 = jLongValue;
                                                    Object objOooO00o = C24332OooO.OooO00o(c27883OooO00o.f98553OooO0O0, new C27900OooOOOo(C27883OooO00o.OooOO0O(str2), str4, C27883OooO00o.OooOO0(str2), j9, null), this);
                                                    if (objOooO00o != EnumC32485OooO00o.f116726OooOo0o) {
                                                        objOooO00o = C32460OooOooO.f116667OooO00o;
                                                    }
                                                    if (objOooO00o != enumC32485OooO00o) {
                                                        j3 = j9;
                                                        try {
                                                            C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                                                            interfaceC33895OooO00o.OooOOO0(null);
                                                            jCurrentTimeMillis = j3 - System.currentTimeMillis();
                                                            C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                                                            c20358OooO00o8.OooOOO0("CloudLockManager");
                                                            c20358OooO00o8.OooO00o("Lock renewed, expires in " + jCurrentTimeMillis + TranslateLanguage.MALAY, new Object[0]);
                                                            if (jCurrentTimeMillis < 10000) {
                                                                c20358OooO00o8.OooOOO0("CloudLockManager");
                                                                c20358OooO00o8.OooOO0O("Lock expiring soon after renew (" + jCurrentTimeMillis + "ms)", new Object[0]);
                                                            }
                                                            interfaceC33636Oooo00o6 = interfaceC33636Oooo00o2;
                                                            j7 = j;
                                                            if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o6)) {
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            interfaceC33895OooO00o.OooOOO0(null);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            interfaceC33895OooO00o2.OooOOO0(null);
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            interfaceC33895OooO00o3.OooOOO0(null);
                            throw th4;
                        }
                    }
                    return enumC32485OooO00o;
                }
                return C32460OooOooO.f116667OooO00o;
            case 1:
                long j10 = this.f98656OooOoOO;
                c27883OooO00o3 = (C27883OooO00o) this.f98652OooOo;
                interfaceC33895OooO00o3 = (InterfaceC33895OooO00o) this.f98653OooOo0o;
                InterfaceC33636Oooo00o interfaceC33636Oooo00o8 = (InterfaceC33636Oooo00o) this.f98659OooOooO;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o5 = interfaceC33636Oooo00o8;
                j6 = j10;
                if (c27883OooO00o3.f98557OooO0o0 == j6) {
                }
                break;
            case 2:
                c27886OooO0o03 = (C27883OooO00o.C27886OooO0o0) this.f98653OooOo0o;
                interfaceC33636Oooo00o4 = (InterfaceC33636Oooo00o) this.f98659OooOooO;
                C32446OooOOOo.OooO0O0(obj);
                C27883OooO00o.C27886OooO0o0 c27886OooO0o042 = c27886OooO0o03;
                this.f98659OooOooO = interfaceC33636Oooo00o4;
                this.f98653OooOo0o = c27886OooO0o042;
                this.f98652OooOo = c33898OooO0Oo;
                this.f98655OooOoO0 = c27883OooO00o4;
                this.f98656OooOoOO = j7;
                this.f98657OooOoo = 3;
                if (c33898OooO0Oo.OooO00o(this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                j5 = this.f98656OooOoOO;
                c27883OooO00o2 = this.f98655OooOoO0;
                InterfaceC33895OooO00o interfaceC33895OooO00o4 = (InterfaceC33895OooO00o) this.f98652OooOo;
                C27883OooO00o.C27886OooO0o0 c27886OooO0o05 = (C27883OooO00o.C27886OooO0o0) this.f98653OooOo0o;
                InterfaceC33636Oooo00o interfaceC33636Oooo00o9 = (InterfaceC33636Oooo00o) this.f98659OooOooO;
                C32446OooOOOo.OooO0O0(obj);
                j4 = j7;
                interfaceC33636Oooo00o3 = interfaceC33636Oooo00o9;
                c27886OooO0o02 = c27886OooO0o05;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o4;
                if (c27883OooO00o2.f98557OooO0o0 != j5) {
                }
                interfaceC33895OooO00o2.OooOOO0(null);
                if (z) {
                }
                break;
            case 4:
                C27883OooO00o.C27886OooO0o0 c27886OooO0o06 = (C27883OooO00o.C27886OooO0o0) this.f98653OooOo0o;
                InterfaceC33636Oooo00o interfaceC33636Oooo00o10 = (InterfaceC33636Oooo00o) this.f98659OooOooO;
                C32446OooOOOo.OooO0O0(obj);
                c27886OooO0o0 = c27886OooO0o06;
                j4 = j7;
                interfaceC33636Oooo00o3 = interfaceC33636Oooo00o10;
                objOooO0O0 = obj;
                jLongValue = ((Number) objOooO0O0).longValue();
                str2 = this.f98663Oooo00o;
                this.f98659OooOooO = interfaceC33636Oooo00o3;
                this.f98653OooOo0o = c27886OooO0o0;
                this.f98652OooOo = c33898OooO0Oo;
                this.f98655OooOoO0 = c27883OooO00o4;
                this.f98654OooOoO = str2;
                this.f98656OooOoOO = jLongValue;
                long j82 = j4;
                this.f98658OooOoo0 = j82;
                this.f98657OooOoo = 5;
                if (c33898OooO0Oo.OooO00o(this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                long j11 = this.f98658OooOoo0;
                jLongValue = this.f98656OooOoOO;
                String str5 = this.f98654OooOoO;
                C27883OooO00o c27883OooO00o5 = this.f98655OooOoO0;
                InterfaceC33895OooO00o interfaceC33895OooO00o5 = (InterfaceC33895OooO00o) this.f98652OooOo;
                c27886OooO0o0 = (C27883OooO00o.C27886OooO0o0) this.f98653OooOo0o;
                InterfaceC33636Oooo00o interfaceC33636Oooo00o11 = (InterfaceC33636Oooo00o) this.f98659OooOooO;
                C32446OooOOOo.OooO0O0(obj);
                j = j7;
                c27883OooO00o = c27883OooO00o5;
                str2 = str5;
                interfaceC33895OooO00o = interfaceC33895OooO00o5;
                interfaceC33636Oooo00o2 = interfaceC33636Oooo00o11;
                j2 = j11;
                if (c27883OooO00o.f98557OooO0o0 == j2) {
                }
                break;
            case 6:
                j3 = this.f98656OooOoOO;
                interfaceC33895OooO00o = (InterfaceC33895OooO00o) this.f98653OooOo0o;
                InterfaceC33636Oooo00o interfaceC33636Oooo00o12 = (InterfaceC33636Oooo00o) this.f98659OooOooO;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    j = j7;
                    interfaceC33636Oooo00o2 = interfaceC33636Oooo00o12;
                    C32460OooOooO c32460OooOooO32 = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o.OooOOO0(null);
                    jCurrentTimeMillis = j3 - System.currentTimeMillis();
                    C34406OooO00o.C20358OooO00o c20358OooO00o82 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o82.OooOOO0("CloudLockManager");
                    c20358OooO00o82.OooO00o("Lock renewed, expires in " + jCurrentTimeMillis + TranslateLanguage.MALAY, new Object[0]);
                    if (jCurrentTimeMillis < 10000) {
                    }
                    interfaceC33636Oooo00o6 = interfaceC33636Oooo00o2;
                    j7 = j;
                    if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o6)) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th5) {
                    th = th5;
                    interfaceC33895OooO00o.OooOOO0(null);
                    throw th;
                }
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 8:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
