package oO00Oo;

import oO0O00oo.C32520OooO0oo;

/* JADX INFO: renamed from: oO00Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC32257OooO0o0 {
    f115866OooOoOO("TEXT", false),
    f115868OooOoo0("BINARY", false),
    f115867OooOoo("CLOSE", true),
    f115869OooOooO("PING", true),
    f115870OooOooo("PONG", true);


    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final EnumC32257OooO0o0[] f115864OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final int f115865OooOoO0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f115872OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f115873OooOo0o;

    static {
        EnumC32257OooO0o0 enumC32257OooO0o0;
        EnumC32257OooO0o0[] enumC32257OooO0o0ArrValues = values();
        if (enumC32257OooO0o0ArrValues.length == 0) {
            enumC32257OooO0o0 = null;
        } else {
            enumC32257OooO0o0 = enumC32257OooO0o0ArrValues[0];
            int length = enumC32257OooO0o0ArrValues.length - 1;
            if (length != 0) {
                int i = enumC32257OooO0o0.f115872OooOo;
                oO0O00oo.OooO oooO = new oO0O00oo.OooO(1, length, 1);
                C32520OooO0oo c32520OooO0oo = new C32520OooO0oo(1, oooO.f116811OooOo, oooO.f116813OooOoO0);
                while (c32520OooO0oo.f116817OooOoO0) {
                    EnumC32257OooO0o0 enumC32257OooO0o02 = enumC32257OooO0o0ArrValues[c32520OooO0oo.nextInt()];
                    int i2 = enumC32257OooO0o02.f115872OooOo;
                    if (i < i2) {
                        enumC32257OooO0o0 = enumC32257OooO0o02;
                        i = i2;
                    }
                }
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(enumC32257OooO0o0);
        int i3 = enumC32257OooO0o0.f115872OooOo;
        f115865OooOoO0 = i3;
        int i4 = i3 + 1;
        EnumC32257OooO0o0[] enumC32257OooO0o0Arr = new EnumC32257OooO0o0[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            EnumC32257OooO0o0[] enumC32257OooO0o0ArrValues2 = values();
            int length2 = enumC32257OooO0o0ArrValues2.length;
            int i6 = 0;
            boolean z = false;
            EnumC32257OooO0o0 enumC32257OooO0o03 = null;
            while (true) {
                if (i6 >= length2) {
                    if (!z) {
                        break;
                    }
                } else {
                    EnumC32257OooO0o0 enumC32257OooO0o04 = enumC32257OooO0o0ArrValues2[i6];
                    if (enumC32257OooO0o04.f115872OooOo == i5) {
                        if (z) {
                            break;
                        }
                        z = true;
                        enumC32257OooO0o03 = enumC32257OooO0o04;
                    }
                    i6++;
                }
            }
            enumC32257OooO0o03 = null;
            enumC32257OooO0o0Arr[i5] = enumC32257OooO0o03;
        }
        f115864OooOoO = enumC32257OooO0o0Arr;
    }

    EnumC32257OooO0o0(String str, boolean z) {
        this.f115873OooOo0o = z;
        this.f115872OooOo = i;
    }
}
