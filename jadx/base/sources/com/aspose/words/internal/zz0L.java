package com.aspose.words.internal;

import OooO0O0.C20395OooO0o0;
import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.aspose.slides.OooOO0;

/* JADX INFO: loaded from: classes5.dex */
final class zz0L {
    private double[] zzel;

    public zz0L(double d, double d2, double d3) {
        this.zzel = new double[]{d3, d2, d};
    }

    private static double[] zzW(double d, double d2, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        double[] dArr;
        double dSqrt = Math.sqrt(d4);
        double d8 = ((((3.0d * d) * d) / 4.0d) - (dSqrt * dSqrt)) - (d2 * 2.0d);
        double dOooO00o = C21825OoooOO0.OooO00o(d, d, d, ((d * 4.0d) * d2) - (8.0d * d3)) / (dSqrt * 4.0d);
        double d9 = d8 + dOooO00o;
        double d10 = d8 - dOooO00o;
        if (Math.abs(d9) <= 9.999999974752427E-7d) {
            d9 = 0.0d;
        }
        if (Math.abs(d10) <= 9.999999974752427E-7d) {
            d10 = 0.0d;
        }
        int i = 2;
        double[] dArr2 = new double[(d9 >= 0.0d ? 2 : 0) + (d10 >= 0.0d ? 2 : 0)];
        if (d9 >= 0.0d) {
            double dSqrt2 = Math.sqrt(d9);
            double d11 = (-d) / 4.0d;
            dArr2[0] = ((dSqrt + dSqrt2) / 2.0d) + d11;
            dArr = dArr2;
            d7 = 2.0d;
            d5 = d;
            d6 = dSqrt;
            dArr[1] = OooOO0.OooO00o(d6, dSqrt2, 2.0d, d11);
        } else {
            d5 = d;
            d6 = dSqrt;
            d7 = 2.0d;
            dArr = dArr2;
            i = 0;
        }
        if (d10 >= 0.0d) {
            double dSqrt3 = Math.sqrt(d10);
            double d12 = (-d5) / 4.0d;
            double d13 = d7;
            dArr[i] = OooOO0.OooO00o(-d6, dSqrt3, d13, d12);
            dArr[i + 1] = OooOO0.OooO00o(dSqrt3, d6, d13, d12);
        }
        return dArr;
    }

    private static double[] zzX(double d, double d2, double d3, double d4) {
        int i = 0;
        double[] dArr = new double[0];
        double d5 = (d4 * d4) - (d3 * 4.0d);
        if (d5 < -9.999999974752427E-7d) {
            return dArr;
        }
        if (d5 < 0.0d) {
            d5 = 0.0d;
        }
        double dSqrt = Math.sqrt(d5) * 2.0d;
        double d6 = (((3.0d * d) * d) / 4.0d) - (d2 * 2.0d);
        double d7 = d6 + dSqrt;
        double d8 = d6 - dSqrt;
        double[] dArr2 = new double[(d7 >= 9.999999974752427E-7d ? 2 : 0) + (d8 >= 9.999999974752427E-7d ? 2 : 0)];
        if (d7 >= 9.999999974752427E-7d) {
            double d9 = (-d) / 4.0d;
            double dSqrt2 = Math.sqrt(d7) / 2.0d;
            dArr2[0] = d9 + dSqrt2;
            dArr2[1] = d9 - dSqrt2;
            i = 2;
        }
        if (d8 >= 9.999999974752427E-7d) {
            double d10 = (-d) / 4.0d;
            double dSqrt3 = Math.sqrt(d8) / 2.0d;
            dArr2[i] = d10 + dSqrt3;
            dArr2[i + 1] = d10 - dSqrt3;
        }
        return dArr2;
    }

    private double[] zzse() {
        double[] dArr = new double[0];
        double[] dArr2 = this.zzel;
        double d = dArr2[4];
        double d2 = dArr2[3] / d;
        double d3 = dArr2[2] / d;
        double d4 = dArr2[1] / d;
        double d5 = dArr2[0] / d;
        double d6 = new zz0L(d3 * (-1.0d), (d2 * d4) - (d5 * 4.0d), C20395OooO0o0.OooO00o(d3, 4.0d, d5, (((-1.0d) * d2) * d2) * d5) - (d4 * d4), (byte) 0).zzsf()[0];
        double d7 = (((d2 * d2) / 4.0d) - d3) + d6;
        if (Math.abs(d7) <= 9.999999974752427E-7d) {
            d7 = 0.0d;
        }
        return d7 > 0.0d ? zzW(d2, d3, d4, d7) : d7 >= 0.0d ? zzX(d2, d3, d5, d6) : dArr;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private double[] zzsf() {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.words.internal.zz0L.zzsf():double[]");
    }

    private double[] zzsg() {
        double[] dArr = new double[0];
        double[] dArr2 = this.zzel;
        double d = dArr2[2];
        double d2 = dArr2[1] / d;
        double d3 = (d2 * d2) - ((dArr2[0] / d) * 4.0d);
        if (d3 <= 0.0d) {
            return d3 == 0.0d ? new double[]{(-d2) * 0.5d} : dArr;
        }
        double dSqrt = Math.sqrt(d3);
        double d4 = -d2;
        return new double[]{(d4 + dSqrt) * 0.5d, (d4 - dSqrt) * 0.5d};
    }

    private int zzsh() {
        for (int length = this.zzel.length - 1; length >= 0; length--) {
            if (Math.abs(this.zzel[length]) >= 9.999999974752427E-7d) {
                return length;
            }
            this.zzel[length] = 0.0d;
        }
        return 0;
    }

    public final double[] zzsi() {
        int iZzsh = zzsh();
        if (iZzsh == 0) {
            return new double[0];
        }
        if (iZzsh == 1) {
            double[] dArr = this.zzel;
            return new double[]{(dArr[0] * (-1.0d)) / dArr[1]};
        }
        if (iZzsh == 2) {
            return zzsg();
        }
        if (iZzsh == 3) {
            return zzsf();
        }
        if (iZzsh == 4) {
            return zzse();
        }
        throw new UnsupportedOperationException("Evaluating roots of that degree is not supported");
    }

    private zz0L(double d, double d2, double d3, byte b) {
        this.zzel = new double[]{d3, d2, d, 1.0d};
    }

    public zz0L(double d, double d2, double d3, double d4, double d5) {
        this.zzel = new double[]{d5, d4, d3, d2, d};
    }
}
