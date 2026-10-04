package oO0o0OoO;

import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OoO.AbstractC33793OooO0Oo;

/* JADX INFO: renamed from: oO0o0OoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33791OooO0O0<S extends AbstractC33793OooO0Oo<?>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f121822OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public S[] f121823OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C33816OooOoo f121824OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f121825OooOoO0;

    public final S OooO0O0() {
        S s;
        C33816OooOoo c33816OooOoo;
        synchronized (this) {
            try {
                S[] sArr = this.f121823OooOo0o;
                if (sArr == null) {
                    sArr = (S[]) OooO0oO();
                    this.f121823OooOo0o = sArr;
                } else if (this.f121822OooOo >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(...)");
                    this.f121823OooOo0o = (S[]) ((AbstractC33793OooO0Oo[]) objArrCopyOf);
                    sArr = (S[]) ((AbstractC33793OooO0Oo[]) objArrCopyOf);
                }
                int i = this.f121825OooOoO0;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = (S) OooO0o0();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                } while (!s.OooO00o(this));
                this.f121825OooOoO0 = i;
                this.f121822OooOo++;
                c33816OooOoo = this.f121824OooOoO;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c33816OooOoo != null) {
            c33816OooOoo.OooOo0O(1);
        }
        return s;
    }

    public final C33816OooOoo OooO0o() {
        C33816OooOoo c33816OooOoo;
        synchronized (this) {
            c33816OooOoo = this.f121824OooOoO;
            if (c33816OooOoo == null) {
                int i = this.f121822OooOo;
                c33816OooOoo = new C33816OooOoo(1, Integer.MAX_VALUE, EnumC33692OooO0OO.f121451OooOo);
                c33816OooOoo.OooO0Oo(Integer.valueOf(i));
                this.f121824OooOoO = c33816OooOoo;
            }
        }
        return c33816OooOoo;
    }

    public abstract S OooO0o0();

    public abstract AbstractC33793OooO0Oo[] OooO0oO();

    public final void OooO0oo(S s) {
        C33816OooOoo c33816OooOoo;
        int i;
        Continuation[] continuationArrOooO0O0;
        synchronized (this) {
            try {
                int i2 = this.f121822OooOo - 1;
                this.f121822OooOo = i2;
                c33816OooOoo = this.f121824OooOoO;
                if (i2 == 0) {
                    this.f121825OooOoO0 = 0;
                }
                kotlin.jvm.internal.OooOOO0.OooO0o0(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrOooO0O0 = s.OooO0O0(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrOooO0O0) {
            if (continuation != null) {
                continuation.resumeWith(C32460OooOooO.f116667OooO00o);
            }
        }
        if (c33816OooOoo != null) {
            c33816OooOoo.OooOo0O(-1);
        }
    }
}
