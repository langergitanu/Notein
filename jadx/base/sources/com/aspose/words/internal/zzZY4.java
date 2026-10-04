package com.aspose.words.internal;

import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: loaded from: classes5.dex */
final class zzZY4 extends zzZV7 {
    private zzZY0 zzbB;
    private zzOV zzbC;
    private boolean zzbD;
    private long zzsE;

    public zzZY4(zzZY0 zzzy0) throws Exception {
        super(zzzy0);
        this.zzbD = false;
        this.zzsE = 0L;
        this.zzbC = new zzOV((byte) 0);
        this.zzbB = zzzy0;
    }

    private static zzOU zzJ(zzOU zzou) {
        zzOU zzouZzNQ = zzou.zzNQ();
        float[] fArrZzNH = zzou.zzNH();
        if ((zzouZzNQ.zzNN() == 2 && zzouZzNQ.zzNJ() == 2) || (zzouZzNQ.zzNJ() == 0 && zzouZzNQ.zzNN() == 1)) {
            fArrZzNH = (float[]) fArrZzNH.clone();
            for (int i = 0; i < fArrZzNH.length; i++) {
                if (zzAN.zzZP(i)) {
                    fArrZzNH[i] = fArrZzNH[i] + 1.0f;
                } else {
                    fArrZzNH[i] = fArrZzNH[i] - 1.0f;
                }
            }
        }
        zzouZzNQ.zzW(zzP(fArrZzNH));
        return zzouZzNQ;
    }

    private static float[] zzP(float[] fArr) {
        if (fArr == null || fArr.length <= 1 || zzAN.zzZP(fArr.length)) {
            return fArr;
        }
        int length = fArr.length / 2;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            float f = fArr[i];
            if (f != fArr[i + length]) {
                return fArr;
            }
            fArr2[i] = f;
        }
        return fArr2;
    }

    private void zzZ(zzZU zzzu, String str) {
        zzn4().zzZ(zzzu.getText(), zzzu.zzZr().zzPl(), zzzu.zzZz());
        boolean z = zzzu.zzZO() != null;
        boolean zZzXk = zzZYD.zzXk(str);
        if (zzzu.zzZz() || z || zZzXk) {
            zzqS();
        }
        zzqT();
        if (z && !zzzu.zzZO().isIdentity()) {
            zzn5().zzX("transform", zzZY1.zzu(zzzu.zzZO()));
        }
        if (zZzXk) {
            zzn5().zzX("clip-path", zzZKN.format("url(#{0})", str));
        }
        zzn5().zzY("tspan");
        zzn5().zzX("x", zzZY1.zzZ(Float.intBitsToFloat((int) zzzu.zzZT()), true, 9));
        zzn5().zzX("y", zzZY1.zzZ(zzZPY.zzYC(zzzu.zzZT()), true, 9));
        zzn5().zzX("font-family", zzzu.zzZr().zzPh());
        zzn5().zzX("font-weight", zzZVC.zzRX(zzzu.zzZr().zzPk()));
        zzn5().zzX("font-style", zzZVC.zzRW(zzzu.zzZr().zzPk()));
        zzn5().zzX("font-size", zzZY1.zzZ(zzzu.zzZr().zzPg(), true, 9));
        if (!zzAN.zzf(zzzu.zzZk())) {
            zzn5().zzX("letter-spacing", zzZY1.zzZ(zzzu.zzZk(), true, 9));
        }
        zzn5().zzX("fill", zzZVC.zzw(zzzu.zzZy()));
        float fZzPD = zzzu.zzZy().zzPD() / 255.0f;
        if (fZzPD < 1.0f) {
            zzn5().zzZ("fill-opacity", zzZY1.zzZ(fZzPD, false, 9), "1");
        }
        if (!zzPV.zzZ(zzzu.zzZq(), zzPV.zzHZ)) {
            zzn5().zzX("stroke", zzZVC.zzw(zzzu.zzZq()));
        }
        if (zzzu.getText().length() > 1 && zzZKN.zzS(zzzu.getText(), " ", zzZOF.ORDINAL$4894b8c8)) {
            zzn5().zzX("style", "white-space: pre");
        }
        zzn5().writeString(zzzu.zzZp());
        zzn5().zzp();
        if (zzzu.zzZz() || z || zZzXk) {
            zzqS();
        }
    }

    private boolean zzqR() {
        return this.zzbB.zzqQ().getTextOutputMode() != 2;
    }

    private void zzqS() {
        if (this.zzbD && zzqR()) {
            zzn5().zzp();
            this.zzbD = false;
        }
    }

    private void zzqT() {
        if (this.zzbD) {
            return;
        }
        zzn5().zzY("text");
        this.zzbD = true;
    }

    public final long getPageSize() {
        return this.zzsE;
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzG3() {
        zzqS();
        zzn5().flush();
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzN(zzG zzg) {
        zzqS();
        zzn5().zzp();
        zzU(zzg.zzZM());
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzO(zzG zzg) {
        zzqS();
        zzZ(zzg.zzZM(), true);
        if (zzZV7.zzF(zzg) && zzZV7.zzQ(zzg) && zzg.zzZO() != null) {
            zzn5().zzY(DrawToolFactory.LASSO_TYPE_RECT);
            zzn5().zzX("x", zzZY1.zzZ(zzg.zzZO().zzOb(), true, 9));
            zzn5().zzX("y", zzZY1.zzZ(zzg.zzZO().zzOa(), true, 9));
            zzn5().zzX("width", zzZY1.zzZ(zzg.zzZM().zzZZ().getWidth(), true, 9));
            zzn5().zzX("height", zzZY1.zzZ(zzg.zzZM().zzZZ().getHeight(), true, 9));
            zzn5().zzX("fill", "transparent");
            zzn5().zzp();
        }
        zzn5().zzY("g");
        if (zzg.zzZO() != null && !zzg.zzZO().isIdentity()) {
            zzn5().zzX("transform", zzZY1.zzu(zzg.zzZO()));
        }
        String strZzy = this.zzbB.zzy(zzg.zzZN());
        if (zzZYD.zzXk(strZzy)) {
            zzn5().zzX("clip-path", zzZKN.format("url(#{0})", strZzy));
        }
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzQ(zzZU zzzu) {
        zzZ((zzL) zzzu.zzZl(), true);
        String strZzy = this.zzbB.zzy(zzzu.zzZN());
        if (this.zzbB.zzqQ().getTextOutputMode() != 2) {
            zzZ(zzzu, strZzy);
        } else {
            zzY(zzzu, strZzy);
        }
        zzU(zzzu.zzZl());
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzS(zzZG zzzg) throws Exception {
        zzqS();
        String strZzS = this.zzbB.zzS(zzzg.zzZ1());
        String strZzS2 = zzzg.zzZ2() != null ? this.zzbB.zzS(zzzg.zzZ2().zzZ1()) : "none";
        zzn5().zzY("path");
        zzn5().zzX("d", this.zzbC.zzQ(zzzg.zzZ0()));
        if (zzzg.zzZO() != null && !zzzg.zzZO().isIdentity()) {
            zzn5().zzX("transform", zzZY1.zzu(zzzg.zzZO()));
        }
        String strZzy = this.zzbB.zzy(zzzg.zzZN());
        if (zzZYD.zzXk(strZzy)) {
            zzn5().zzX("clip-path", zzZKN.format("url(#{0})", strZzy));
        }
        if (zzzg.zzZ2() != null) {
            zzOU zzouZzJ = zzJ(zzzg.zzZ2());
            if (!zzAN.zzf(zzzg.zzZ2().getWidth())) {
                zzn5().zzX("stroke-width", zzZY1.zzZ(zzouZzJ.getWidth(), true, 9));
            }
            zzn5().zzZ("stroke-linecap", zzZVC.zzRZ(zzouZzJ.zzNN()), "butt");
            zzn5().zzZ("stroke-linejoin", zzZVC.zzRY(zzouZzJ.zzNM()), "miter");
            zzn5().zzZ("stroke-miterlimit", zzZY1.zzZ(zzouZzJ.zzNL(), true, 9), "4");
            if (zzouZzJ.zzZ1() != null) {
                zzn5().zzX("stroke", strZzS2);
                zzn5().zzZ("stroke-opacity", zzZY1.zzZ(zzZYA.zzR(zzouZzJ.zzZ1()), false, 9), "1");
            }
            if (zzouZzJ.getDashStyle() != 0 && zzouZzJ.zzNH() != null && zzouZzJ.zzNH().length > 0) {
                zzn5().zzX("stroke-dashoffset", zzZY1.zzZ(zzouZzJ.getWidth() * zzouZzJ.zzNK(), true, 9));
                zzn5().zzX("stroke-dasharray", zzZY1.zzY(zzouZzJ.zzNH(), zzouZzJ.getWidth()));
            }
        }
        zzn5().zzX("fill", strZzS);
        zzn5().zzZ("fill-opacity", zzZY1.zzZ(zzZYA.zzR(zzzg.zzZ1()), false, 9), "1");
        zzn5().zzX("fill-rule", zzzg.zzZ0().zzO6() == 0 ? "evenodd" : "nonzero");
        zzn5().zzp();
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzX(zzZH zzzh) {
        this.zzsE = zzzh.getSize();
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzY(zz9 zz9Var) {
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzX(zzZP zzzp) throws Exception {
        zzqS();
        zzP9 zzp9 = new zzP9();
        zzEG zzegZzZT = zzEF.zzZT(zzzp.getImageBytes());
        zzZQ5 zzzq5 = new zzZQ5(0, 0, zzegZzZT.getWidth(), zzegZzZT.getHeight());
        if (zzzp.zzZd() != null) {
            zzzq5 = zzzp.zzZd().zzW(zzzq5);
        }
        zzp9.zzZ((float) zzSA.pointToPixel(Float.intBitsToFloat((int) zzzp.getSize()) / zzzq5.getWidth()), (float) zzSA.pointToPixel(zzZPW.zzYz(zzzp.getSize()) / zzzq5.getHeight()), 1);
        zzp9.zzY(Float.intBitsToFloat((int) zzzp.zzZT()), zzZPY.zzYC(zzzp.zzZT()), 1);
        zzn5().zzY(AbstractJwtRequest.ClaimNames.USE);
        zzn5().zzX("xlink:href", zzZKN.format("#{0}", zzn4().zzS(zzzp.getImageBytes(), zzzp.zzZd())));
        zzn5().zzX("width", zzZY1.zzZ(Float.intBitsToFloat((int) zzzp.getSize()), true, 9));
        zzn5().zzX("height", zzZY1.zzZ(zzZPW.zzYz(zzzp.getSize()), true, 9));
        if (!zzp9.isIdentity()) {
            zzn5().zzX("transform", zzZY1.zzu(zzp9));
        }
        zzn5().zzp();
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzY(zzC zzc) {
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzY(zzI zzi) {
        zzn5().zzX("id", zzi.getName());
    }

    private void zzY(zzZU zzzu, String str) {
        float fZzPg = zzzu.zzZr().zzPg() / 20480.0f;
        zzn4().zzZ(zzzu.getText(), zzzu.zzZr().zzPl(), zzzu.zzZz());
        zzn5().zzY("g");
        zzn5().zzX("fill", zzZVC.zzw(zzzu.zzZy()));
        if (zzZYD.zzXk(str)) {
            zzn5().zzX("clip-path", zzZKN.format("url(#{0})", str));
        }
        zzP9 zzp9 = new zzP9(fZzPg, 0.0f, 0.0f, fZzPg, Float.intBitsToFloat((int) zzzu.zzZT()), zzZPY.zzYC(zzzu.zzZT()));
        if (!zzP9.zzO(zzzu.zzZO())) {
            zzp9.zzZ(zzzu.zzZO(), 1);
        }
        if (zzzu.zzZr().zzPi()) {
            zzp9.zzZ(zzzu.zzZs(), 0);
        }
        if (!zzp9.isIdentity()) {
            zzn5().zzX("transform", zzZY1.zzu(zzp9));
        }
        if (zzzu.zzZr().zzPj()) {
            zzn5().zzX("stroke", zzZVC.zzw(zzzu.zzZy()));
            zzn5().zzX("stroke-width", zzZY1.zzZ(819.19995f, true, 9));
        }
        String strZzX = zzn4().zzX(zzzu.zzZr().zzPl());
        float fZzW = 0.0f;
        for (Integer num : new zzZYE(zzzu.getText())) {
            int iIntValue = num.intValue();
            zzn5().zzY(AbstractJwtRequest.ClaimNames.USE);
            zzn5().zzX("x", zzZY1.zzZ(fZzW, true, 9));
            zzn5().zzX("xlink:href", zzZKN.format("#{0}c{1}", strZzX, num));
            zzn5().zzp();
            fZzW += zzZY8.zzW(zzzu.zzZr().zzPl().zzpP().zzSx(iIntValue).zzoZ(), zzzu.zzZr().zzPl());
        }
        zzn5().zzp();
    }
}
