package o0oo0ooO;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: renamed from: o0oo0ooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31407OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f112136OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f112137OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f112138OooO0OO;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o0oo0ooO.OooO0O0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f112139OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f112140OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f112141OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f112142OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f112143OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final OooO00o f112144OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO00o f112145OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final OooO00o f112146OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final OooO00o f112147OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f112148Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public static final OooO00o f112149Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public static final OooO00o f112150Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public static final OooO00o f112151Oooo00o;

        /* JADX INFO: Fake field, exist only in values array */
        OooO00o EF0;

        static {
            OooO00o oooO00o = new OooO00o("NONE", 0);
            OooO00o oooO00o2 = new OooO00o("STRING", 1);
            f112140OooOo0o = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("NAME", 2);
            f112139OooOo = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("LITERAL", 3);
            f112142OooOoO0 = oooO00o4;
            OooO00o oooO00o5 = new OooO00o("REAL", 4);
            f112141OooOoO = oooO00o5;
            OooO00o oooO00o6 = new OooO00o("INTEGER", 5);
            f112143OooOoOO = oooO00o6;
            OooO00o oooO00o7 = new OooO00o("START_ARRAY", 6);
            f112145OooOoo0 = oooO00o7;
            OooO00o oooO00o8 = new OooO00o("END_ARRAY", 7);
            f112144OooOoo = oooO00o8;
            OooO00o oooO00o9 = new OooO00o("START_PROC", 8);
            f112146OooOooO = oooO00o9;
            OooO00o oooO00o10 = new OooO00o("END_PROC", 9);
            f112147OooOooo = oooO00o10;
            OooO00o oooO00o11 = new OooO00o("START_DICT", 10);
            f112149Oooo000 = oooO00o11;
            OooO00o oooO00o12 = new OooO00o("END_DICT", 11);
            f112150Oooo00O = oooO00o12;
            OooO00o oooO00o13 = new OooO00o("CHARSTRING", 12);
            f112151Oooo00o = oooO00o13;
            f112148Oooo0 = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4, oooO00o5, oooO00o6, oooO00o7, oooO00o8, oooO00o9, oooO00o10, oooO00o11, oooO00o12, oooO00o13};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f112148Oooo0.clone();
        }
    }

    public C31407OooO0O0(String str, OooO00o oooO00o) {
        this.f112136OooO00o = str;
        this.f112138OooO0OO = oooO00o;
    }

    public final int OooO00o() {
        return (int) Float.parseFloat(this.f112136OooO00o);
    }

    public final String toString() {
        OooO00o oooO00o = OooO00o.f112151Oooo00o;
        OooO00o oooO00o2 = this.f112138OooO0OO;
        if (oooO00o2 == oooO00o) {
            return C21023OooO0Oo.OooO0OO(" bytes]", this.f112137OooO0O0.length, new StringBuilder("Token[kind=CHARSTRING, data="));
        }
        StringBuilder sb = new StringBuilder("Token[kind=");
        sb.append(oooO00o2);
        sb.append(", text=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f112136OooO00o, "]");
    }

    public C31407OooO0O0(char c, OooO00o oooO00o) {
        this.f112136OooO00o = Character.toString(c);
        this.f112138OooO0OO = oooO00o;
    }

    public C31407OooO0O0(byte[] bArr) {
        OooO00o oooO00o = OooO00o.f112151Oooo00o;
        this.f112137OooO0O0 = bArr;
        this.f112138OooO0OO = oooO00o;
    }
}
