package o00o0O;

import java.util.ArrayList;
import o000000o.C24099OooOoO0;
import oO00ooO.C32442OooOO0o;

/* JADX INFO: renamed from: o00o0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25306OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f86123OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f86124OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25303OooO00o[] f86125OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f86126OooO0Oo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00o0O.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f86127OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f86128OooOo0o;

        static {
            OooO00o oooO00o = new OooO00o("Lsq2", 0);
            f86128OooOo0o = oooO00o;
            f86127OooOo = new OooO00o[]{oooO00o, new OooO00o("Impulse", 1)};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f86127OooOo.clone();
        }
    }

    public C25306OooO0Oo() {
        int i;
        OooO00o oooO00o = OooO00o.f86128OooOo0o;
        this.f86123OooO00o = oooO00o;
        int iOrdinal = oooO00o.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                throw new C32442OooOO0o();
            }
            i = 2;
        }
        this.f86124OooO0O0 = i;
        C25303OooO00o[] c25303OooO00oArr = new C25303OooO00o[20];
        for (int i2 = 0; i2 < 20; i2++) {
            c25303OooO00oArr[i2] = null;
        }
        this.f86125OooO0OO = c25303OooO00oArr;
    }

    public final void OooO00o(float f, long j) {
        int i = (this.f86126OooO0Oo + 1) % 20;
        this.f86126OooO0Oo = i;
        C25303OooO00o[] c25303OooO00oArr = this.f86125OooO0OO;
        C25303OooO00o c25303OooO00o = c25303OooO00oArr[i];
        if (c25303OooO00o != null) {
            c25303OooO00o.f86118OooO00o = j;
            c25303OooO00o.f86119OooO0O0 = f;
        } else {
            C25303OooO00o c25303OooO00o2 = new C25303OooO00o();
            c25303OooO00o2.f86118OooO00o = j;
            c25303OooO00o2.f86119OooO0O0 = f;
            c25303OooO00oArr[i] = c25303OooO00o2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float OooO0O0() {
        float f;
        float fFloatValue;
        float fFloatValue2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = this.f86126OooO0Oo;
        C25303OooO00o[] c25303OooO00oArr = this.f86125OooO0OO;
        C25303OooO00o c25303OooO00o = c25303OooO00oArr[i];
        if (c25303OooO00o == null) {
            return 0.0f;
        }
        C25303OooO00o c25303OooO00o2 = c25303OooO00o;
        int i2 = 0;
        while (true) {
            C25303OooO00o c25303OooO00o3 = c25303OooO00oArr[i];
            if (c25303OooO00o3 == null) {
                f = 0.0f;
                break;
            }
            long j = c25303OooO00o.f86118OooO00o;
            long j2 = c25303OooO00o3.f86118OooO00o;
            float f2 = j - j2;
            f = 0.0f;
            float fAbs = Math.abs(j2 - c25303OooO00o2.f86118OooO00o);
            if (f2 > 100.0f || fAbs > 40.0f) {
                break;
            }
            arrayList.add(Float.valueOf(c25303OooO00o3.f86119OooO0O0));
            arrayList2.add(Float.valueOf(-f2));
            if (i == 0) {
                i = 20;
            }
            i--;
            i2++;
            if (i2 >= 20) {
                break;
            }
            c25303OooO00o2 = c25303OooO00o3;
        }
        if (i2 < this.f86124OooO0O0) {
            return f;
        }
        int iOrdinal = this.f86123OooO00o.ordinal();
        if (iOrdinal == 0) {
            try {
                fFloatValue = ((Number) C24099OooOoO0.OooO0oO(arrayList2, arrayList).get(1)).floatValue();
            } catch (IllegalArgumentException unused) {
                fFloatValue = f;
            }
            return fFloatValue * 1000;
        }
        if (iOrdinal != 1) {
            throw new C32442OooOO0o();
        }
        int size = arrayList.size();
        if (size >= 2) {
            if (size == 2) {
                fFloatValue2 = ((Number) arrayList2.get(0)).floatValue() == ((Number) arrayList2.get(1)).floatValue() ? f : (((Number) arrayList.get(0)).floatValue() - ((Number) arrayList.get(1)).floatValue()) / (((Number) arrayList2.get(0)).floatValue() - ((Number) arrayList2.get(1)).floatValue());
            } else {
                int i3 = size - 1;
                float f3 = f;
                for (int i4 = i3; i4 > 0; i4--) {
                    int i5 = i4 - 1;
                    if (((Number) arrayList2.get(i4)).floatValue() != ((Number) arrayList2.get(i5)).floatValue()) {
                        float fSignum = Math.signum(f3) * ((float) Math.sqrt(Math.abs(f3) * 2));
                        float fFloatValue3 = (((Number) arrayList.get(i4)).floatValue() - ((Number) arrayList.get(i5)).floatValue()) / (((Number) arrayList2.get(i4)).floatValue() - ((Number) arrayList2.get(i5)).floatValue());
                        float fAbs2 = (Math.abs(fFloatValue3) * (fFloatValue3 - fSignum)) + f3;
                        if (i4 == i3) {
                            fAbs2 *= 0.5f;
                        }
                        f3 = fAbs2;
                    }
                }
                fFloatValue2 = Math.signum(f3) * ((float) Math.sqrt(Math.abs(f3) * 2));
            }
        }
        return fFloatValue2 * 1000;
    }
}
