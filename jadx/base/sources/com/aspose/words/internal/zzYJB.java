package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYJB extends zzYLX.zzZ {
    public zzYJB(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
        super(zzym1, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzR(zzYLX zzylx) {
        if (zzXzd()) {
            return zzylx;
        }
        if (zzylx.zzXzd()) {
            return zzXzb();
        }
        zzYM1 zzym1ZzXHv = zzXHv();
        zzYM0 zzym0 = this.f51157an;
        if (zzym0.isZero()) {
            return zzylx;
        }
        zzYM0 zzym0ZzXzj = zzylx.zzXzj();
        zzYM0 zzym0ZzeQ = zzylx.zzeQ(0);
        if (zzym0ZzXzj.isZero() || !zzym0ZzeQ.zzXzv()) {
            return zzXzb().zzT(zzylx);
        }
        zzYM0 zzym02 = this.f51158ao;
        zzYM0 zzym03 = this.f51159ap[0];
        zzYM0 zzym0ZzXzi = zzylx.zzXzi();
        zzYM0 zzym0ZzXzy = zzym0.zzXzy();
        zzYM0 zzym0ZzXzy2 = zzym02.zzXzy();
        zzYM0 zzym0ZzXzy3 = zzym03.zzXzy();
        zzYM0 zzym0ZzW = zzym0ZzXzy2.zzW(zzym02.zzU(zzym03));
        zzYM0 zzym0ZzXzA = zzym0ZzXzi.zzXzA();
        zzYM0 zzym0ZzY = zzym0ZzXzA.zzU(zzym0ZzXzy3).zzW(zzym0ZzXzy2).zzY(zzym0ZzW, zzym0ZzXzy, zzym0ZzXzy3);
        zzYM0 zzym0ZzU = zzym0ZzXzj.zzU(zzym0ZzXzy3);
        zzYM0 zzym0ZzXzy4 = zzym0ZzU.zzW(zzym0ZzW).zzXzy();
        if (zzym0ZzXzy4.isZero()) {
            return zzym0ZzY.isZero() ? zzylx.zzXzb() : zzym1ZzXHv.zzXzM();
        }
        if (zzym0ZzY.isZero()) {
            return new zzYJB(zzym1ZzXHv, zzym0ZzY, zzym1ZzXHv.zzXzJ());
        }
        zzYM0 zzym0ZzU2 = zzym0ZzY.zzXzy().zzU(zzym0ZzU);
        zzYM0 zzym0ZzU3 = zzym0ZzY.zzU(zzym0ZzXzy4).zzU(zzym0ZzXzy3);
        return new zzYJB(zzym1ZzXHv, zzym0ZzU2, zzym0ZzY.zzW(zzym0ZzXzy4).zzXzy().zzY(zzym0ZzW, zzym0ZzXzA, zzym0ZzU3), new zzYM0[]{zzym0ZzU3});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzT(zzYLX zzylx) {
        zzYM0 zzym0ZzU;
        zzYM0 zzym0ZzU2;
        zzYM0 zzym0ZzU3;
        zzYM0 zzym0OooO00o;
        zzYM0 zzym0ZzP;
        zzYM0 zzym0ZzW;
        if (zzXzd()) {
            return zzylx;
        }
        if (zzylx.zzXzd()) {
            return this;
        }
        zzYM1 zzym1ZzXHv = zzXHv();
        zzYM0 zzym0ZzU4 = this.f51157an;
        zzYM0 zzym0ZzXzj = zzylx.zzXzj();
        if (zzym0ZzU4.isZero()) {
            return zzym0ZzXzj.isZero() ? zzym1ZzXHv.zzXzM() : zzylx.zzT(this);
        }
        zzYM0 zzym0 = this.f51158ao;
        zzYM0 zzym02 = this.f51159ap[0];
        zzYM0 zzym0ZzXzi = zzylx.zzXzi();
        zzYM0 zzym0ZzeQ = zzylx.zzeQ(0);
        boolean zZzXzv = zzym02.zzXzv();
        if (zZzXzv) {
            zzym0ZzU = zzym0ZzXzj;
            zzym0ZzU2 = zzym0ZzXzi;
        } else {
            zzym0ZzU = zzym0ZzXzj.zzU(zzym02);
            zzym0ZzU2 = zzym0ZzXzi.zzU(zzym02);
        }
        boolean zZzXzv2 = zzym0ZzeQ.zzXzv();
        if (zZzXzv2) {
            zzym0ZzU3 = zzym0;
        } else {
            zzym0ZzU4 = zzym0ZzU4.zzU(zzym0ZzeQ);
            zzym0ZzU3 = zzym0.zzU(zzym0ZzeQ);
        }
        zzYM0 zzym0ZzW2 = zzym0ZzU3.zzW(zzym0ZzU2);
        zzYM0 zzym0ZzW3 = zzym0ZzU4.zzW(zzym0ZzU);
        if (zzym0ZzW3.isZero()) {
            return zzym0ZzW2.isZero() ? zzXzb() : zzym1ZzXHv.zzXzM();
        }
        if (zzym0ZzXzj.isZero()) {
            zzYLX zzylxZzXze = zzXze();
            zzYM0 zzym0ZzXzl = zzylxZzXze.zzXzl();
            zzYM0 zzym0ZzXzk = zzylxZzXze.zzXzk();
            zzYM0 zzym0ZzT = zzym0ZzXzk.zzW(zzym0ZzXzi).zzT(zzym0ZzXzl);
            zzym0OooO00o = androidx.concurrent.futures.OooO00o.OooO00o(zzym0ZzT, zzym0ZzT, zzym0ZzXzl);
            if (zzym0OooO00o.isZero()) {
                return new zzYJB(zzym1ZzXHv, zzym0OooO00o, zzym1ZzXHv.zzXzJ());
            }
            zzym0ZzW = zzym0ZzT.zzU(zzym0ZzXzl.zzW(zzym0OooO00o)).zzW(zzym0OooO00o).zzW(zzym0ZzXzk).zzT(zzym0OooO00o).zzW(zzym0OooO00o);
            zzym0ZzP = zzym1ZzXHv.zzP(zzYM2.ONE);
        } else {
            zzYM0 zzym0ZzXzy = zzym0ZzW3.zzXzy();
            zzYM0 zzym0ZzU5 = zzym0ZzW2.zzU(zzym0ZzU4);
            zzYM0 zzym0ZzU6 = zzym0ZzW2.zzU(zzym0ZzU);
            zzYM0 zzym0ZzU7 = zzym0ZzU5.zzU(zzym0ZzU6);
            if (zzym0ZzU7.isZero()) {
                return new zzYJB(zzym1ZzXHv, zzym0ZzU7, zzym1ZzXHv.zzXzJ());
            }
            zzYM0 zzym0ZzU8 = zzym0ZzW2.zzU(zzym0ZzXzy);
            zzYM0 zzym0ZzU9 = !zZzXzv2 ? zzym0ZzU8.zzU(zzym0ZzeQ) : zzym0ZzU8;
            zzYM0 zzym0ZzY = zzym0ZzU6.zzW(zzym0ZzXzy).zzY(zzym0ZzU9, zzym0.zzW(zzym02));
            if (!zZzXzv) {
                zzym0ZzU9 = zzym0ZzU9.zzU(zzym02);
            }
            zzym0OooO00o = zzym0ZzU7;
            zzym0ZzP = zzym0ZzU9;
            zzym0ZzW = zzym0ZzY;
        }
        return new zzYJB(zzym1ZzXHv, zzym0OooO00o, zzym0ZzW, new zzYM0[]{zzym0ZzP});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzb() {
        if (zzXzd()) {
            return this;
        }
        zzYM1 zzym1ZzXHv = zzXHv();
        zzYM0 zzym0 = this.f51157an;
        if (zzym0.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYM0 zzym02 = this.f51158ao;
        zzYM0 zzym0ZzXzy = this.f51159ap[0];
        boolean zZzXzv = zzym0ZzXzy.zzXzv();
        zzYM0 zzym0ZzXzy2 = zZzXzv ? zzym0ZzXzy : zzym0ZzXzy.zzXzy();
        zzYM0 zzym0ZzW = zZzXzv ? zzym02.zzXzy().zzW(zzym02) : zzym02.zzW(zzym0ZzXzy).zzU(zzym02);
        if (zzym0ZzW.isZero()) {
            return new zzYJB(zzym1ZzXHv, zzym0ZzW, zzym1ZzXHv.zzXzJ());
        }
        zzYM0 zzym0ZzXzy3 = zzym0ZzW.zzXzy();
        zzYM0 zzym0ZzU = zZzXzv ? zzym0ZzW : zzym0ZzW.zzU(zzym0ZzXzy2);
        zzYM0 zzym0ZzXzy4 = zzym02.zzW(zzym0).zzXzy();
        if (!zZzXzv) {
            zzym0ZzXzy = zzym0ZzXzy2.zzXzy();
        }
        return new zzYJB(zzym1ZzXHv, zzym0ZzXzy3, zzym0ZzXzy4.zzW(zzym0ZzW).zzW(zzym0ZzXzy2).zzU(zzym0ZzXzy4).zzW(zzym0ZzXzy).zzW(zzym0ZzXzy3).zzW(zzym0ZzU), new zzYM0[]{zzym0ZzU});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        if (!zzXzd()) {
            zzYM0 zzym0 = this.f51157an;
            if (!zzym0.isZero()) {
                zzYM0 zzym02 = this.f51158ao;
                zzYM0 zzym03 = this.f51159ap[0];
                return new zzYJB(this.zzWoB, zzym0, zzym02.zzW(zzym03), new zzYM0[]{zzym03});
            }
        }
        return this;
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYM0 zzXzk() {
        zzYM0 zzym0 = this.f51157an;
        zzYM0 zzym02 = this.f51158ao;
        if (zzXzd() || zzym0.isZero()) {
            return zzym02;
        }
        zzYM0 zzym0ZzU = zzym02.zzW(zzym0).zzU(zzym0);
        zzYM0 zzym03 = this.f51159ap[0];
        return !zzym03.zzXzv() ? zzym0ZzU.zzT(zzym03) : zzym0ZzU;
    }

    public zzYJB(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}
