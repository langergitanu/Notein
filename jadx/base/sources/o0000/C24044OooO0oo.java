package o0000;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Arrays;

/* JADX INFO: renamed from: o0000.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24044OooO0oo implements Comparable<C24044OooO0oo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f81008OooOo0o;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f81011OooOoOO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public OooO00o f81015OooOooo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f81007OooOo = -1;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f81010OooOoO0 = -1;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f81009OooOoO = 0;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f81013OooOoo0 = false;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final float[] f81012OooOoo = new float[9];

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final float[] f81014OooOooO = new float[9];

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public OooO0O0[] f81016Oooo000 = new OooO0O0[16];

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f81017Oooo00O = 0;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f81018Oooo00o = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o0000.OooO0oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f81019OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f81020OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f81021OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f81022OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f81023OooOoOO;

        static {
            OooO00o oooO00o = new OooO00o("UNRESTRICTED", 0);
            f81020OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("CONSTANT", 1);
            OooO00o oooO00o3 = new OooO00o("SLACK", 2);
            f81019OooOo = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("ERROR", 3);
            f81022OooOoO0 = oooO00o4;
            OooO00o oooO00o5 = new OooO00o(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
            f81021OooOoO = oooO00o5;
            f81023OooOoOO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4, oooO00o5};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f81023OooOoOO.clone();
        }
    }

    public C24044OooO0oo(OooO00o oooO00o) {
        this.f81015OooOooo = oooO00o;
    }

    public final void OooO00o(OooO0O0 oooO0O0) {
        int i = 0;
        while (true) {
            int i2 = this.f81017Oooo00O;
            if (i >= i2) {
                OooO0O0[] oooO0O0Arr = this.f81016Oooo000;
                if (i2 >= oooO0O0Arr.length) {
                    this.f81016Oooo000 = (OooO0O0[]) Arrays.copyOf(oooO0O0Arr, oooO0O0Arr.length * 2);
                }
                OooO0O0[] oooO0O0Arr2 = this.f81016Oooo000;
                int i3 = this.f81017Oooo00O;
                oooO0O0Arr2[i3] = oooO0O0;
                this.f81017Oooo00O = i3 + 1;
                return;
            }
            if (this.f81016Oooo000[i] == oooO0O0) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void OooO0O0(OooO0O0 oooO0O0) {
        int i = this.f81017Oooo00O;
        int i2 = 0;
        while (i2 < i) {
            if (this.f81016Oooo000[i2] == oooO0O0) {
                while (i2 < i - 1) {
                    OooO0O0[] oooO0O0Arr = this.f81016Oooo000;
                    int i3 = i2 + 1;
                    oooO0O0Arr[i2] = oooO0O0Arr[i3];
                    i2 = i3;
                }
                this.f81017Oooo00O--;
                return;
            }
            i2++;
        }
    }

    public final void OooO0OO() {
        this.f81015OooOooo = OooO00o.f81021OooOoO;
        this.f81009OooOoO = 0;
        this.f81007OooOo = -1;
        this.f81010OooOoO0 = -1;
        this.f81011OooOoOO = 0.0f;
        this.f81013OooOoo0 = false;
        int i = this.f81017Oooo00O;
        for (int i2 = 0; i2 < i; i2++) {
            this.f81016Oooo000[i2] = null;
        }
        this.f81017Oooo00O = 0;
        this.f81018Oooo00o = 0;
        this.f81008OooOo0o = false;
        Arrays.fill(this.f81014OooOooO, 0.0f);
    }

    public final void OooO0Oo(C24041OooO0Oo c24041OooO0Oo, float f) {
        this.f81011OooOoOO = f;
        this.f81013OooOoo0 = true;
        int i = this.f81017Oooo00O;
        this.f81010OooOoO0 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f81016Oooo000[i2].OooO0oo(c24041OooO0Oo, this, false);
        }
        this.f81017Oooo00O = 0;
    }

    public final void OooO0o0(C24041OooO0Oo c24041OooO0Oo, OooO0O0 oooO0O0) {
        int i = this.f81017Oooo00O;
        for (int i2 = 0; i2 < i; i2++) {
            this.f81016Oooo000[i2].OooO(c24041OooO0Oo, oooO0O0, false);
        }
        this.f81017Oooo00O = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C24044OooO0oo c24044OooO0oo) {
        return this.f81007OooOo - c24044OooO0oo.f81007OooOo;
    }

    public final String toString() {
        return "" + this.f81007OooOo;
    }
}
