package oO00O0o;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import oO00ooO.C32444OooOOO0;
import oOo00OO0.C34480OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34480OooO0Oo f115447OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f115448OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int[] f115449OooO0OO;

    public OooO(C34480OooO0Oo builder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        this.f115447OooO00o = builder;
        this.f115449OooO0OO = OooOO0.f115487OooO0O0.o0000OoO();
    }

    public final C34480OooO0Oo.OooO00o OooO00o(String str) {
        long[] jArr = oOo00OO0.OooO0o.f123559OooO00o;
        int iOooO0O0 = oOo00OO0.OooO0o.OooO0O0(str, 0, str.length());
        int i = this.f115448OooO0O0;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 8;
            int[] iArr = this.f115449OooO0OO;
            if (iArr[i3] == iOooO0O0) {
                return (C34480OooO0Oo.OooO00o) this.f115447OooO00o.subSequence(iArr[i3 + 4], iArr[i3 + 5]);
            }
        }
        return null;
    }

    public final C34480OooO0Oo.OooO00o OooO0O0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i >= this.f115448OooO0O0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = i * 8;
        int[] iArr = this.f115449OooO0OO;
        return (C34480OooO0Oo.OooO00o) this.f115447OooO00o.subSequence(iArr[i2 + 2], iArr[i2 + 3]);
    }

    public final void OooO0OO(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f115448OooO0O0;
        int i8 = i7 * 8;
        int[] iArr = this.f115449OooO0OO;
        if (i8 >= iArr.length) {
            throw new C32444OooOOO0("An operation is not implemented: Implement headers overflow");
        }
        iArr[i8] = i;
        iArr[i8 + 1] = i2;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = i4;
        iArr[i8 + 4] = i5;
        iArr[i8 + 5] = i6;
        iArr[i8 + 6] = -1;
        iArr[i8 + 7] = -1;
        this.f115448OooO0O0 = i7 + 1;
    }

    public final void OooO0Oo() {
        this.f115448OooO0O0 = 0;
        int[] iArr = this.f115449OooO0OO;
        int[] iArr2 = OooOO0.f115486OooO00o;
        this.f115449OooO0OO = iArr2;
        if (iArr != iArr2) {
            OooOO0.f115487OooO0O0.o00o0O(iArr);
        }
    }

    public final C34480OooO0Oo.OooO00o OooO0o0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i >= this.f115448OooO0O0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = i * 8;
        int[] iArr = this.f115449OooO0OO;
        return (C34480OooO0Oo.OooO00o) this.f115447OooO00o.subSequence(iArr[i2 + 4], iArr[i2 + 5]);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int[] iArr = OooOO0.f115486OooO00o;
        int i = this.f115448OooO0O0;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append((CharSequence) "");
            sb.append((CharSequence) OooO0O0(i2));
            sb.append((CharSequence) " => ");
            sb.append((CharSequence) OooO0o0(i2));
            sb.append((CharSequence) IOUtils.LINE_SEPARATOR_UNIX);
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
