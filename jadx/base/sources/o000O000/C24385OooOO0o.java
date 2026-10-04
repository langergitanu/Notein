package o000O000;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.util.Preconditions;
import o000OoO.C24533OooO00o;
import o000OoO.C24534OooO0O0;

/* JADX INFO: renamed from: o000O000.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24385OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24534OooO0O0 f82276OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final char[] f82277OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f82278OooO0OO = new OooO00o(1024);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Typeface f82279OooO0Oo;

    /* JADX INFO: renamed from: o000O000.OooOO0o$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SparseArray<OooO00o> f82280OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooOOO f82281OooO0O0;

        public OooO00o() {
            this(1);
        }

        public final void OooO00o(OooOOO oooOOO, int i, int i2) {
            int iOooO00o = oooOOO.OooO00o(i);
            SparseArray<OooO00o> sparseArray = this.f82280OooO00o;
            OooO00o oooO00o = sparseArray == null ? null : sparseArray.get(iOooO00o);
            if (oooO00o == null) {
                oooO00o = new OooO00o();
                sparseArray.put(oooOOO.OooO00o(i), oooO00o);
            }
            if (i2 > i) {
                oooO00o.OooO00o(oooOOO, i + 1, i2);
            } else {
                oooO00o.f82281OooO0O0 = oooOOO;
            }
        }

        public OooO00o(int i) {
            this.f82280OooO00o = new SparseArray<>(i);
        }
    }

    public C24385OooOO0o(Typeface typeface, C24534OooO0O0 c24534OooO0O0) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f82279OooO0Oo = typeface;
        this.f82276OooO00o = c24534OooO0O0;
        int iOooO00o = c24534OooO0O0.OooO00o(6);
        if (iOooO00o != 0) {
            int i5 = iOooO00o + c24534OooO0O0.f82985OooO00o;
            i = c24534OooO0O0.f82986OooO0O0.getInt(c24534OooO0O0.f82986OooO0O0.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f82277OooO0O0 = new char[i * 2];
        int iOooO00o2 = c24534OooO0O0.OooO00o(6);
        if (iOooO00o2 != 0) {
            int i6 = iOooO00o2 + c24534OooO0O0.f82985OooO00o;
            i2 = c24534OooO0O0.f82986OooO0O0.getInt(c24534OooO0O0.f82986OooO0O0.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            OooOOO oooOOO = new OooOOO(this, i7);
            C24533OooO00o c24533OooO00oOooO0O0 = oooOOO.OooO0O0();
            int iOooO00o3 = c24533OooO00oOooO0O0.OooO00o(4);
            Character.toChars(iOooO00o3 != 0 ? c24533OooO00oOooO0O0.f82986OooO0O0.getInt(iOooO00o3 + c24533OooO00oOooO0O0.f82985OooO00o) : 0, this.f82277OooO0O0, i7 * 2);
            Preconditions.checkNotNull(oooOOO, "emoji metadata cannot be null");
            C24533OooO00o c24533OooO00oOooO0O02 = oooOOO.OooO0O0();
            int iOooO00o4 = c24533OooO00oOooO0O02.OooO00o(16);
            if (iOooO00o4 != 0) {
                int i8 = iOooO00o4 + c24533OooO00oOooO0O02.f82985OooO00o;
                i3 = c24533OooO00oOooO0O02.f82986OooO0O0.getInt(c24533OooO00oOooO0O02.f82986OooO0O0.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            Preconditions.checkArgument(i3 > 0, "invalid metadata codepoint length");
            C24533OooO00o c24533OooO00oOooO0O03 = oooOOO.OooO0O0();
            int iOooO00o5 = c24533OooO00oOooO0O03.OooO00o(16);
            if (iOooO00o5 != 0) {
                int i9 = iOooO00o5 + c24533OooO00oOooO0O03.f82985OooO00o;
                i4 = c24533OooO00oOooO0O03.f82986OooO0O0.getInt(c24533OooO00oOooO0O03.f82986OooO0O0.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            this.f82278OooO0OO.OooO00o(oooOOO, 0, i4 - 1);
        }
    }
}
