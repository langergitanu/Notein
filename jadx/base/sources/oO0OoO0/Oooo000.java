package oO0OoO0;

import oO0O0OO.AbstractC32600OooOOOo;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.OooO0O0;
import oO0OO00.EnumC32896OooOo0o;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo000 {

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f120358OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f120359OooO0O0;

        static {
            int[] iArr = new int[oO0OO00.OooO.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f120358OooO00o = iArr;
            int[] iArr2 = new int[OooO0O0.OooO00o.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[EnumC32896OooOo0o.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[4] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[2] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[3] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[5] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f120359OooO0O0 = iArr3;
        }
    }

    public static final AbstractC32600OooOOOo OooO00o(EnumC32896OooOo0o enumC32896OooOo0o) {
        switch (enumC32896OooOo0o == null ? -1 : OooO00o.f120359OooO0O0[enumC32896OooOo0o.ordinal()]) {
            case 1:
                C32602OooOOo0.C32605OooO0oO INTERNAL = C32602OooOOo0.f117241OooO0Oo;
                kotlin.jvm.internal.OooOOO0.OooO0o(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                C32602OooOOo0.C32603OooO0Oo PRIVATE = C32602OooOOo0.f117238OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0o(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                C32602OooOOo0.C32604OooO0o0 PRIVATE_TO_THIS = C32602OooOOo0.f117239OooO0O0;
                kotlin.jvm.internal.OooOOO0.OooO0o(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                C32602OooOOo0.OooO0o PROTECTED = C32602OooOOo0.f117240OooO0OO;
                kotlin.jvm.internal.OooOOO0.OooO0o(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                C32602OooOOo0.C32606OooO0oo PUBLIC = C32602OooOOo0.f117243OooO0o0;
                kotlin.jvm.internal.OooOOO0.OooO0o(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                C32602OooOOo0.OooO LOCAL = C32602OooOOo0.f117242OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0o(LOCAL, "LOCAL");
                return LOCAL;
            default:
                C32602OooOOo0.C32603OooO0Oo PRIVATE2 = C32602OooOOo0.f117238OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0o(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static final OooO0O0.OooO00o OooO0O0(oO0OO00.OooO oooO) {
        int i = oooO == null ? -1 : OooO00o.f120358OooO00o[oooO.ordinal()];
        OooO0O0.OooO00o oooO00o = OooO0O0.OooO00o.f117222OooOo0o;
        if (i != 1) {
            if (i == 2) {
                return OooO0O0.OooO00o.f117221OooOo;
            }
            if (i == 3) {
                return OooO0O0.OooO00o.f117224OooOoO0;
            }
            if (i == 4) {
                return OooO0O0.OooO00o.f117223OooOoO;
            }
        }
        return oooO00o;
    }
}
