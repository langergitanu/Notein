package oO0OOooO;

import java.io.Serializable;
import java.lang.reflect.Array;
import o00O0o.C24917OooO00o;
import o00O0o.C24922OooO0oO;
import oO000O0.EnumC31935OooO0Oo;
import oO0OOooO.AbstractC33146OooO00o;

/* JADX INFO: renamed from: oO0OOooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33147OooO0O0 extends AbstractC33146OooO00o implements Serializable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final double[][] f119869OooOo;

    public C33147OooO0O0(int i, int i2) {
        super(i, i2);
        this.f119869OooOo = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i, i2);
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    public final void OooO00o(double d, int i, int i2) {
        C33152OooO0oO.OooO0Oo(this, i);
        C33152OooO0oO.OooO0O0(this, i2);
        this.f119869OooOo[i][i2] = d;
    }

    @Override // oO0OOooO.AbstractC33146OooO00o
    public final void OoooO0(AbstractC33146OooO00o.C20301OooO00o c20301OooO00o) {
        int iMo80632c = mo80632c();
        int iMo80628a = mo80628a();
        for (int i = 0; i < iMo80632c; i++) {
            double[] dArr = this.f119869OooOo[i];
            for (int i2 = 0; i2 < iMo80628a; i2++) {
                c20301OooO00o.f119868OooO0Oo.OooO00o(dArr[i2], i2, i);
            }
        }
    }

    @Override // oO0OOooO.AbstractC33146OooO00o
    public final InterfaceC33145OooO OoooO00(int i, int i2) {
        return new C33147OooO0O0(i, i2);
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: a */
    public final int mo80628a() {
        double[] dArr;
        double[][] dArr2 = this.f119869OooOo;
        if (dArr2 == null || (dArr = dArr2[0]) == null) {
            return 0;
        }
        return dArr.length;
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: c */
    public final int mo80632c() {
        double[][] dArr = this.f119869OooOo;
        if (dArr == null) {
            return 0;
        }
        return dArr.length;
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: e */
    public final double[][] mo80634e() {
        int iMo80632c = mo80632c();
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iMo80632c, mo80628a());
        for (int i = 0; i < iMo80632c; i++) {
            double[] dArr2 = this.f119869OooOo[i];
            System.arraycopy(dArr2, 0, dArr[i], 0, dArr2.length);
        }
        return dArr;
    }

    public C33147OooO0O0(double[][] dArr) {
        double[][] dArr2 = this.f119869OooOo;
        EnumC31935OooO0Oo enumC31935OooO0Oo = EnumC31935OooO0Oo.AT_LEAST_ONE_ROW;
        EnumC31935OooO0Oo enumC31935OooO0Oo2 = EnumC31935OooO0Oo.AT_LEAST_ONE_COLUMN;
        EnumC31935OooO0Oo enumC31935OooO0Oo3 = EnumC31935OooO0Oo.DIMENSIONS_MISMATCH_SIMPLE;
        EnumC31935OooO0Oo enumC31935OooO0Oo4 = EnumC31935OooO0Oo.NULL_NOT_ALLOWED;
        if (dArr2 != null) {
            if (dArr == null) {
                throw new o00O0o.OooO(enumC31935OooO0Oo4, new Object[0]);
            }
            int length = dArr.length;
            if (length == 0) {
                throw new C24922OooO0oO(enumC31935OooO0Oo);
            }
            int length2 = dArr[0].length;
            if (length2 == 0) {
                throw new C24922OooO0oO(enumC31935OooO0Oo2);
            }
            for (int i = 1; i < length; i++) {
                if (dArr[i].length != length2) {
                    throw new C24917OooO00o(enumC31935OooO0Oo3, length2, dArr[i].length);
                }
            }
            C33152OooO0oO.OooO0Oo(this, 0);
            C33152OooO0oO.OooO0O0(this, 0);
            C33152OooO0oO.OooO0Oo(this, length - 1);
            C33152OooO0oO.OooO0O0(this, length2 - 1);
            for (int i2 = 0; i2 < length; i2++) {
                for (int i3 = 0; i3 < length2; i3++) {
                    OooO00o(dArr[i2][i3], i2, i3);
                }
            }
            return;
        }
        if (dArr == null) {
            throw new o00O0o.OooO(enumC31935OooO0Oo4, new Object[0]);
        }
        if (dArr.length == 0) {
            throw new C24922OooO0oO(enumC31935OooO0Oo);
        }
        int length3 = dArr[0].length;
        if (length3 == 0) {
            throw new C24922OooO0oO(enumC31935OooO0Oo2);
        }
        this.f119869OooOo = (double[][]) Array.newInstance((Class<?>) Double.TYPE, dArr.length, length3);
        int i4 = 0;
        while (true) {
            double[][] dArr3 = this.f119869OooOo;
            if (i4 >= dArr3.length) {
                return;
            }
            double[] dArr4 = dArr[i4];
            if (dArr4.length != length3) {
                throw new C24917OooO00o(enumC31935OooO0Oo3, dArr[i4].length, length3);
            }
            System.arraycopy(dArr4, 0, dArr3[i4], 0, length3);
            i4++;
        }
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: a */
    public final double mo80627a(int i, int i2) {
        C33152OooO0oO.OooO0Oo(this, i);
        C33152OooO0oO.OooO0O0(this, i2);
        return this.f119869OooOo[i][i2];
    }
}
