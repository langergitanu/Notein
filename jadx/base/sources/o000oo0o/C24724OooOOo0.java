package o000oo0o;

import OooOo.C20473OooO0Oo;
import OooOoO0.C20514OooO0Oo;
import OooooOO.C21355Ooooooo;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C24034Oooo00O;
import o000ooo.C24746OooO00o;
import o000ooo.InterfaceC24747OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.o0000;
import oO0o0oOo.C33902OooO0oo;
import oO0o0oOo.C33903OooOO0;
import oO0o0oOo.C33904OooOO0O;

/* JADX INFO: renamed from: o000oo0o.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24724OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f83823OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0O000o.OooO00o<InterfaceC24747OooO0O0> f83824OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ReentrantLock f83825OooO0OO = new ReentrantLock();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f83826OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C24717OooOO0O[] f83827OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f83828OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33903OooOO0 f83829OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C20473OooO0Oo<C24717OooOO0O> f83830OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [E[], java.lang.Object[]] */
    public C24724OooOOo0(int i, oO0O000o.OooO00o<? extends InterfaceC24747OooO0O0> oooO00o) {
        this.f83823OooO00o = i;
        this.f83824OooO0O0 = oooO00o;
        this.f83827OooO0o = new C24717OooOO0O[i];
        this.f83829OooO0oO = C33904OooOO0O.OooO00o(i);
        C20473OooO0Oo<C24717OooOO0O> c20473OooO0Oo = new C20473OooO0Oo<>();
        if (i < 1) {
            C20514OooO0Oo.OooO00o("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            C20514OooO0Oo.OooO00o("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        c20473OooO0Oo.f58469OooO0Oo = i - 1;
        c20473OooO0Oo.f58466OooO00o = new Object[i];
        this.f83830OooO0oo = c20473OooO0Oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24719OooOOO c24719OooOOO;
        C24724OooOOo0 c24724OooOOo0;
        if (abstractC32479OooO0OO instanceof C24719OooOOO) {
            c24719OooOOO = (C24719OooOOO) abstractC32479OooO0OO;
            int i = c24719OooOOO.f83801OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24719OooOOO.f83801OooOoO = i - Integer.MIN_VALUE;
            } else {
                c24719OooOOO = new C24719OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c24719OooOOO.f83799OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24719OooOOO.f83801OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c24719OooOOO.f83800OooOo0o = this;
            c24719OooOOO.f83801OooOoO = 1;
            if (this.f83829OooO0oO.OooO0O0(c24719OooOOO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24724OooOOo0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24724OooOOo0 = c24719OooOOO.f83800OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            ReentrantLock reentrantLock = c24724OooOOo0.f83825OooO0OO;
            C20473OooO0Oo<C24717OooOO0O> c20473OooO0Oo = c24724OooOOo0.f83830OooO0oo;
            reentrantLock.lock();
            try {
                if (c24724OooOOo0.f83828OooO0o0) {
                    C24746OooO00o.OooO0oO(21, "Connection pool is closed");
                    throw null;
                }
                if (c20473OooO0Oo.f58467OooO0O0 == c20473OooO0Oo.f58468OooO0OO && c24724OooOOo0.f83826OooO0Oo < c24724OooOOo0.f83823OooO00o) {
                    C24717OooOO0O c24717OooOO0O = new C24717OooOO0O(c24724OooOOo0.f83824OooO0O0.invoke());
                    int i3 = c24724OooOOo0.f83826OooO0Oo;
                    c24724OooOOo0.f83826OooO0Oo = i3 + 1;
                    c24724OooOOo0.f83827OooO0o[i3] = c24717OooOO0O;
                    c20473OooO0Oo.OooO00o(c24717OooOO0O);
                }
                int i4 = c20473OooO0Oo.f58467OooO0O0;
                if (i4 == c20473OooO0Oo.f58468OooO0OO) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                C24717OooOO0O[] c24717OooOO0OArr = c20473OooO0Oo.f58466OooO00o;
                C24717OooOO0O c24717OooOO0O2 = c24717OooOO0OArr[i4];
                c24717OooOO0OArr[i4] = null;
                c20473OooO0Oo.f58467OooO0O0 = (i4 + 1) & c20473OooO0Oo.f58469OooO0Oo;
                return c24717OooOO0O2;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th) {
            c24724OooOOo0.f83829OooO0oO.release();
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:11|44|12|24|46|29|(1:(1:39)(2:35|(1:37)))(1:31)|38|19|48|20|(1:22)(10:23|24|46|29|(0)(0)|38|19|48|20|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        r12 = r12;
        r11 = r11;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:29:0x006c, B:31:0x0070, B:35:0x0078, B:39:0x007f), top: B:46:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0059 -> B:24:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(long j, C24712OooO0o c24712OooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24721OooOOOO c24721OooOOOO;
        C24724OooOOo0 c24724OooOOo0;
        oO0O000o.OooO00o oooO00o;
        C24034Oooo00O c24034Oooo00O;
        oO0O000o.OooO00o oooO00o2;
        C24721OooOOOO c24721OooOOOO2;
        Throwable th;
        C24722OooOOOo c24722OooOOOo;
        oO0O000o.OooO00o oooO00o3;
        if (abstractC32479OooO0OO instanceof C24721OooOOOO) {
            c24721OooOOOO = (C24721OooOOOO) abstractC32479OooO0OO;
            int i = c24721OooOOOO.f83808OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24721OooOOOO.f83808OooOoo = i - Integer.MIN_VALUE;
            } else {
                c24721OooOOOO = new C24721OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c24721OooOOOO.f83807OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24721OooOOOO.f83808OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c24724OooOOo0 = this;
            oooO00o = c24712OooO0o;
            C24034Oooo00O c24034Oooo00O2 = new C24034Oooo00O();
            c24722OooOOOo = new C24722OooOOOo(c24034Oooo00O2, c24724OooOOo0, null);
            c24721OooOOOO.f83804OooOo0o = c24724OooOOo0;
            c24721OooOOOO.f83803OooOo = oooO00o;
            c24721OooOOOO.f83806OooOoO0 = c24034Oooo00O2;
            c24721OooOOOO.f83805OooOoO = j;
            c24721OooOOOO.f83808OooOoo = 1;
            if (C21355Ooooooo.OooOO0(j, c24722OooOOOo, c24721OooOOOO) != enumC32485OooO00o) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c24721OooOOOO.f83805OooOoO;
            C24034Oooo00O c24034Oooo00O3 = c24721OooOOOO.f83806OooOoO0;
            oO0O000o.OooO00o oooO00o4 = c24721OooOOOO.f83803OooOo;
            c24724OooOOo0 = c24721OooOOOO.f83804OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                oooO00o3 = oooO00o4;
            } catch (Throwable th2) {
                c24034Oooo00O = c24034Oooo00O3;
                oooO00o2 = oooO00o4;
                c24721OooOOOO2 = c24721OooOOOO;
                th = th2;
                if (th instanceof o0000) {
                }
                c24721OooOOOO = c24721OooOOOO2;
                oooO00o = oooO00o2;
                C24034Oooo00O c24034Oooo00O22 = new C24034Oooo00O();
                c24722OooOOOo = new C24722OooOOOo(c24034Oooo00O22, c24724OooOOo0, null);
                c24721OooOOOO.f83804OooOo0o = c24724OooOOo0;
                c24721OooOOOO.f83803OooOo = oooO00o;
                c24721OooOOOO.f83806OooOoO0 = c24034Oooo00O22;
                c24721OooOOOO.f83805OooOoO = j;
                c24721OooOOOO.f83808OooOoo = 1;
                if (C21355Ooooooo.OooOO0(j, c24722OooOOOo, c24721OooOOOO) != enumC32485OooO00o) {
                }
            }
            c24034Oooo00O = c24034Oooo00O3;
            oooO00o2 = oooO00o3;
            c24721OooOOOO2 = c24721OooOOOO;
            th = null;
            try {
                if (th instanceof o0000) {
                    oooO00o2.invoke();
                } else {
                    if (th != null) {
                        throw th;
                    }
                    T t = c24034Oooo00O.f80942OooOo0o;
                    if (t != 0) {
                        return t;
                    }
                }
                c24721OooOOOO = c24721OooOOOO2;
                oooO00o = oooO00o2;
                C24034Oooo00O c24034Oooo00O222 = new C24034Oooo00O();
                c24722OooOOOo = new C24722OooOOOo(c24034Oooo00O222, c24724OooOOo0, null);
                c24721OooOOOO.f83804OooOo0o = c24724OooOOo0;
                c24721OooOOOO.f83803OooOo = oooO00o;
                c24721OooOOOO.f83806OooOoO0 = c24034Oooo00O222;
                c24721OooOOOO.f83805OooOoO = j;
                c24721OooOOOO.f83808OooOoo = 1;
                if (C21355Ooooooo.OooOO0(j, c24722OooOOOo, c24721OooOOOO) != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                oooO00o3 = oooO00o;
                c24034Oooo00O3 = c24034Oooo00O222;
                c24034Oooo00O = c24034Oooo00O3;
                oooO00o2 = oooO00o3;
                c24721OooOOOO2 = c24721OooOOOO;
                th = null;
                if (th instanceof o0000) {
                }
                c24721OooOOOO = c24721OooOOOO2;
                oooO00o = oooO00o2;
                C24034Oooo00O c24034Oooo00O2222 = new C24034Oooo00O();
                c24722OooOOOo = new C24722OooOOOo(c24034Oooo00O2222, c24724OooOOo0, null);
                c24721OooOOOO.f83804OooOo0o = c24724OooOOo0;
                c24721OooOOOO.f83803OooOo = oooO00o;
                c24721OooOOOO.f83806OooOoO0 = c24034Oooo00O2222;
                c24721OooOOOO.f83805OooOoO = j;
                c24721OooOOOO.f83808OooOoo = 1;
                if (C21355Ooooooo.OooOO0(j, c24722OooOOOo, c24721OooOOOO) != enumC32485OooO00o) {
                }
            } catch (Throwable th3) {
                C24717OooOO0O c24717OooOO0O = (C24717OooOO0O) c24034Oooo00O.f80942OooOo0o;
                if (c24717OooOO0O != null) {
                    c24724OooOOo0.OooO0o0(c24717OooOO0O);
                }
                throw th3;
            }
        }
    }

    public final void OooO0OO() {
        ReentrantLock reentrantLock = this.f83825OooO0OO;
        reentrantLock.lock();
        try {
            this.f83828OooO0o0 = true;
            for (C24717OooOO0O c24717OooOO0O : this.f83827OooO0o) {
                if (c24717OooOO0O != null) {
                    c24717OooOO0O.close();
                }
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void OooO0Oo(StringBuilder sb) {
        C20473OooO0Oo<C24717OooOO0O> c20473OooO0Oo = this.f83830OooO0oo;
        ReentrantLock reentrantLock = this.f83825OooO0OO;
        reentrantLock.lock();
        try {
            C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
            int i = (c20473OooO0Oo.f58468OooO0OO - c20473OooO0Oo.f58467OooO0O0) & c20473OooO0Oo.f58469OooO0Oo;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = c20473OooO0Oo.f58468OooO0OO;
                    int i4 = c20473OooO0Oo.f58467OooO0O0;
                    int i5 = c20473OooO0Oo.f58469OooO0Oo;
                    if (i2 < ((i3 - i4) & i5)) {
                        C24717OooOO0O c24717OooOO0O = c20473OooO0Oo.f58466OooO00o[(i4 + i2) & i5];
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(c24717OooOO0O);
                        c32465OooO0O0OooO0Oo.add(c24717OooOO0O);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            C32465OooO0O0 c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.f83823OooO00o + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            C33903OooOO0 c33903OooOO0 = this.f83829OooO0oO;
            c33903OooOO0.getClass();
            sb2.append(Math.max(C33902OooO0oo.f122109OooOoo.get(c33903OooOO0), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + c32465OooO0O0OooO0O0.OooO0O0() + ")[" + oOo000Oo.OooOo.o000oOoO(c32465OooO0O0OooO0O0, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            C24717OooOO0O[] c24717OooOO0OArr = this.f83827OooO0o;
            int length = c24717OooOO0OArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                C24717OooOO0O c24717OooOO0O2 = c24717OooOO0OArr[i7];
                i6++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i6);
                sb3.append("] - ");
                sb3.append(c24717OooOO0O2 != null ? c24717OooOO0O2.f83786OooOo0o.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (c24717OooOO0O2 != null) {
                    c24717OooOO0O2.OooOOo0(sb);
                }
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void OooO0o0(C24717OooOO0O connection) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(connection, "connection");
        ReentrantLock reentrantLock = this.f83825OooO0OO;
        reentrantLock.lock();
        try {
            this.f83830OooO0oo.OooO00o(connection);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            reentrantLock.unlock();
            this.f83829OooO0oO.release();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
