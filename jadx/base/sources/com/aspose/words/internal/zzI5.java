package com.aspose.words.internal;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes5.dex */
final class zzI5 extends zzZV7 {
    private zzZQC<zzG> zzxh;
    private zzG zzxi;
    private zzH zzxj;
    private zzIC zzxx;

    public zzI5(zzIC zzic) throws Exception {
        super(zzic);
        this.zzxh = new zzZQC<>();
        this.zzxx = zzic;
    }

    private void zz4(boolean z) {
        if (zzZYD.zzXk(this.zzxx.zzGg())) {
            zzn5().zzX(z ? "alt" : NoteMeta.PROPERTY_TITLE, this.zzxx.zzGg());
            this.zzxx.zzZ3("");
        }
    }

    private boolean zzFZ() {
        return this.zzxh.size() > 0 && this.zzxh.peek().zzZK();
    }

    private zzH zzG0() {
        if (this.zzxj == null) {
            this.zzxj = new zzH();
        }
        return this.zzxj;
    }

    private void zzG1() throws Exception {
        if (this.zzxi == null) {
            return;
        }
        zzZQ4 zzzq4ZzZ = zzG0().zzZ((zzZL) this.zzxi);
        zzZH zzzh = new zzZH(Math.max(11.0f, zzzq4ZzZ.getWidth()), Math.max(11.0f, zzzq4ZzZ.getHeight()));
        OooO0O0.OooO00o(this.zzxi);
        this.zzxi.zzZO().zzY(-zzzq4ZzZ.getX(), -zzzq4ZzZ.getY(), 0);
        zzzh.zzX(this.zzxi);
        this.zzxi = null;
        zzZ(zzzq4ZzZ, zzzh);
    }

    private boolean zzG2() {
        return this.zzxh.size() > 0 && this.zzxh.peek().zzZL();
    }

    private zzZQ4 zzK(long j, long j2) throws Exception {
        zzG zzgPeek = this.zzxh.size() > 0 ? this.zzxh.peek() : null;
        zzZQ4 zzzq4 = new zzZQ4(j, j2);
        return zzM(zzgPeek) ? zzJ6.zzZ(zzzq4, zzgPeek.zzZO()) : zzzq4;
    }

    private static String zzL(String str, String str2) {
        zzI2 zzi2 = null;
        if (!zzZYD.zzXk(str) || str.length() > 1) {
            return null;
        }
        if ("Symbol".equals(str2)) {
            zzi2 = zzI2.zzxb;
        } else if ("Wingdings".equals(str2)) {
            zzi2 = zzI2.zzxa;
        }
        return zzZ(str, zzi2);
    }

    private static boolean zzM(zzZU zzzu) {
        return (zzzu.zzZO() == null || zzzu.zzZO().isIdentity()) ? false : true;
    }

    private static String zzP(zzZU zzzu) {
        boolean zZzZz = zzzu.zzZz();
        String text = zzzu.getText();
        return zZzZz ? zzZVS.zzWJ(text) : text;
    }

    private void zzR(zzZG zzzg) throws Exception {
        zzZG zzzgZzP = zzP(zzzg);
        zzP5 zzp5ZzO = zzO(zzzgZzP);
        zzG1();
        zzZQ4 zzzq4ZzS = zzS(zzp5ZzO);
        zzOI zzoi = (zzOI) zzZKW.zzZ(zzzgZzP.zzZ1(), zzOI.class);
        zzOU zzouZzZ = zzZ(zzzgZzP, zzoi, zzzq4ZzS);
        float fZzZ = zzZ(zzouZzZ, zzzgZzP);
        zzZQ4 zzzq4ZzZ = zzZ(zzouZzZ, zzzq4ZzS, fZzZ);
        zzn5().zzY("div");
        zzn5().zzX("class", this.zzxx.zzGm());
        zzI3 zzi3 = new zzI3();
        zzi3.zzZW(zzzq4ZzZ.zzZE());
        zzi3.zzZV(zzzq4ZzZ.getSize());
        zzZ(zzoi, zzi3);
        zzZ(zzouZzZ, zzzq4ZzZ, zzi3, fZzZ);
        zzX(zzi3);
        zzn5().zzm();
    }

    private static boolean zzU(zzPY zzpy) {
        return zzpy == null || zzpy.zzPH() == 0;
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzG3() throws Exception {
        zzG1();
        zzn5().zzm();
        zzn5().flush();
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzN(zzG zzg) throws Exception {
        if (zzg.getCount() == 0 && zzg.zzZM() == null) {
            return;
        }
        if (!zzFZ() || zzg.zzZK()) {
            zzG1();
            zzn5().zzm();
            this.zzxh.pop();
            zzU(zzg.zzZM());
        }
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzO(zzG zzg) throws Exception {
        if (zzFZ()) {
            return;
        }
        if (zzg.getCount() == 0 && zzg.zzZM() == null) {
            return;
        }
        zzG1();
        zzZ(zzg.zzZM(), false);
        if (zzZV7.zzF(zzg) && zzZV7.zzQ(zzg) && zzg.zzZO() != null) {
            zzI3 zzi3 = new zzI3();
            zzi3.zzJ(RequestParameters.POSITION, "absolute");
            zzi3.zzH(zzg.zzZO());
            zzi3.zzZV(zzg.zzZM().zzZZ().getSize());
            zzX(zzi3);
        }
        zzn5().zzY("div");
        zzn5().zzX("class", this.zzxx.zzGm());
        zzI3 zzi32 = new zzI3();
        boolean zZzM = zzM(zzg);
        if (zzg.zzZO() != null && (!zZzM || zzL(zzg))) {
            zzi32.zzH(zzg.zzZO());
        }
        if (zzZT.zzU(zzg)) {
            zzZQ4 zzzq4ZzS = zzP6.zzS(zzg.zzZN());
            if (zzg.zzZO() != null && zZzM) {
                zzzq4ZzS = zzJ6.zzZ(zzzq4ZzS, zzg.zzZO());
            }
            zzi32.zzy(new zzZQ4(zzzq4ZzS.zzZm(), zzzq4ZzS.zzZo(), zzzq4ZzS.getWidth(), zzzq4ZzS.getHeight() + 1.0f));
        }
        if (zzg.zzZL()) {
            zzi32.zzJ(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "rtl");
        }
        zzX(zzi32);
        zz4(false);
        if (zzg.zzZK()) {
            zzZQ4 zzzq4ZzZ = zzG0().zzZ((zzZL) zzg);
            if (!zzAN.zzf(zzzq4ZzZ.zzZm()) || !zzAN.zzf(zzzq4ZzZ.zzZo())) {
                if (zzg.zzZO() == null) {
                    OooO0O0.OooO00o(zzg);
                }
                zzg.zzZO().zzY(-zzzq4ZzZ.zzZm(), -zzzq4ZzZ.zzZo(), 0);
            }
            if (this.zzxx.zzGh().zzwy().zzAs()) {
                zzY(zzg, zzzq4ZzZ);
            } else {
                zzZ(zzg, zzzq4ZzZ);
            }
        }
        this.zzxh.push(zzg);
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzQ(zzZU zzzu) throws Exception {
        if (!zzFZ() && zzZYD.zzXk(zzzu.getText())) {
            zzG1();
            boolean zZzM = zzM(zzzu);
            if (zZzM) {
                zzn5().zzY("div");
                zzn5().zzX("class", this.zzxx.zzGm());
                zzI3 zzi3 = new zzI3();
                zzi3.zzH(zzzu.zzZO());
                zzX(zzi3);
            }
            zzZ((zzL) zzzu.zzZl(), false);
            zzn5().zzY("span");
            zzn5().zzX("class", zzZKN.format("{0} {1}", this.zzxx.zzGl(), this.zzxx.zzW(zzzu.zzZr())));
            zzI3 zzi32 = new zzI3();
            zzi32.zzY("font-size", zzzu.zzZr().zzPg(), TranslateLanguage.PORTUGUESE);
            zzi32.zzW("color", zzZVC.zzr(zzO(zzzu)), "#000000");
            zzY(zzzu, zzi32);
            zzi32.zzZW(zzZPY.zzG(zzzu.zzZm(), zzzu.zzZo()));
            zzX(zzzu, zzi32);
            String strZzP = zzP(zzzu);
            String strZzL = zzL(strZzP, zzzu.zzZr().zzPh());
            if (strZzL != null) {
                zzi32.zzJ("font-family", "serif");
                strZzP = strZzL;
            }
            zzi32.zzZ("line-height", zzzu.zzZn() - zzzu.zzZo(), TranslateLanguage.PORTUGUESE);
            zzZ(zzzu, zzi32);
            zzY(zzi32);
            zzX(zzi32);
            zzn5().zzX(zzZSN.zzWa(strZzP));
            zzn5().zzp();
            zzU(zzzu.zzZl());
            if (zZzM) {
                zzn5().zzp();
            }
            if (strZzL == null) {
                zzn4().zzZ(strZzP, zzzu.zzZr().zzPl(), zzzu.zzZz());
            }
        }
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzS(zzZG zzzg) throws Exception {
        if (zzFZ()) {
            return;
        }
        if (zzQ(zzzg)) {
            zzR(zzzg);
            return;
        }
        if (this.zzxi == null) {
            this.zzxi = new zzG();
        }
        this.zzxi.zzX(zzzg.zzYZ());
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzX(zzZH zzzh) {
        zzn5().zzY("div");
        zzn5().zzX("class", zzZKN.format("{0} {1}", this.zzxx.zzGm(), this.zzxx.zzGi()));
        zzI3 zzi3 = new zzI3();
        zzi3.zzZV(zzzh.getSize());
        zzX(zzi3);
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzY(zzI zzi) throws Exception {
        zzG1();
        zzn5().zzY("a");
        zzn5().zzX("name", zzi.getName());
        zzI3 zzi3 = new zzI3();
        zzi3.zzZW(zzi.zzZT());
        zzX(zzi3);
        zzn5().zzn();
    }

    public final void zzZ(zzZOP zzzop, long j, long j2, boolean z) throws Exception {
        if (z) {
            zzG1();
        }
        zzZQ4 zzzq4ZzK = zzK(j, j2);
        zzn5().zzY("div");
        zzn5().zzX("class", this.zzxx.zzGm());
        zzI3 zzi3 = new zzI3();
        zzi3.zzZW(zzzq4ZzK.zzZE());
        if (!this.zzxx.zzGh().getExportEmbeddedSvg()) {
            zzi3.zzZU(zzzq4ZzK.getSize());
        }
        if (zzG2()) {
            zzi3.zzJ(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "ltr");
        }
        zzX(zzi3);
        zzn5().zzZ(this.zzxx.zzD(zzzop), true);
        zzn5().zzp();
    }

    private static boolean zzM(zzG zzg) throws Exception {
        zzZP zzzp;
        zzP9 zzp9ZzZO;
        return zzg != null && zzg.getCount() == 1 && (zzzp = (zzZP) zzZKW.zzZ(zzg.zzN(0), zzZP.class)) != null && (zzp9ZzZO = zzg.zzZO()) != null && zzAN.zzf(zzp9ZzZO.zzOe()) && zzAN.zzf(zzp9ZzZO.zzOd()) && zzp9ZzZO.zzOf() > 0.0f && zzp9ZzZO.zzOc() > 0.0f && zzzp.getImageType() != 2 && zzzp.getImageType() != 3;
    }

    private static zzZG zzP(zzZG zzzg) {
        zzZG zzzgZzYZ = zzzg.zzYZ();
        zzP9 zzp9ZzZO = zzzgZzYZ.zzZO();
        if (zzp9ZzZO != null && !zzp9ZzZO.isIdentity()) {
            zzzgZzYZ.zzY(zzp9ZzZO);
        }
        return zzzgZzYZ;
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzX(zzZP zzzp) throws Exception {
        if (zzFZ()) {
            return;
        }
        zzG1();
        zzZQ4 zzzq4ZzZj = zzzp.zzZj();
        if (zzzp.zzZd() != null) {
            zzzq4ZzZj = zzzp.zzZd().zzw(zzzq4ZzZj);
        }
        zzZQ4 zzzq4ZzK = zzK(zzzq4ZzZj.zzZE(), zzzq4ZzZj.getSize());
        zzn5().zzY("img");
        zzn5().zzX("class", this.zzxx.zzGk());
        zzI3 zzi3 = new zzI3();
        zzi3.zzZW(zzzq4ZzK.zzZE());
        zzi3.zzZV(zzzq4ZzK.getSize());
        zzX(zzi3);
        zzn5().zzX("src", zzn4().zzS(zzzp.getImageBytes(), zzzp.zzZd()));
        zz4(true);
        zzn5().zzp();
    }

    private static String zzN(zzZU zzzu) {
        if (zzzu.zzZz()) {
            return "rtl";
        }
        return "ltr";
    }

    private static zzZQ4 zzS(zzP5 zzp5) {
        return zzJ6.zzU(((zzOS) zzp5.zzNY().get(0)).zzNu());
    }

    private static boolean zzL(zzG zzg) {
        if (zzg == null || zzg.zzZO() == null) {
            return false;
        }
        return zzg.zzZO().zzOf() < 0.0f || zzg.zzZO().zzOc() < 0.0f;
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzY(zz9 zz9Var) {
        String str;
        zzn5().zzY("select");
        zzI3 zzi3 = new zzI3();
        zzi3.zzJ(RequestParameters.POSITION, "absolute");
        if (zz9Var.zzZz() != zzG2()) {
            if (zz9Var.zzZz()) {
                str = "rtl";
            } else {
                str = "ltr";
            }
            zzi3.zzJ(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, str);
        }
        zzi3.zzZW(zz9Var.zzZE());
        zzX(zzi3);
        zzn5().zzX("name", zz9Var.getName());
        for (int i = 0; i < zz9Var.zzZA().size(); i++) {
            zzn5().zzY("option");
            if (i == zz9Var.getValue()) {
                zzn5().zzX("selected", "selected");
            }
            zzn5().writeString(zz9Var.zzZA().get(i));
            zzn5().zzm();
        }
        zzn5().zzm();
    }

    private static void zzZ(zzZU zzzu, zzI3 zzi3) throws Exception {
        if (zzZT.zzV(zzzu.zzZN())) {
            zzi3.zzy(zzP6.zzS(zzzu.zzZN()));
        }
    }

    private void zzZ(zzG zzg, zzZQ4 zzzq4) throws Exception {
        zzZOR zzzor = new zzZOR();
        long jZzY = zzSA.zzY(zzzq4.getSize(), 1.0f, 96.0d, 96.0d);
        zzXN zzxn = new zzXN((int) jZzY, (int) (jZzY >>> 32), 96.0f, 96.0f, 2498570);
        zzIY zziy = new zzIY(zzxn);
        try {
            zzZ(zziy, zzg, jZzY);
            zziy.dispose();
            zzxn.zzY(zzzor, zzn4().zznh().getJpegQuality());
            zzX(new zzZP(zzzq4.zzZE(), zzzq4.getSize(), zzZYQ.zzZX(zzzor)));
        } catch (Throwable th) {
            zziy.dispose();
            throw th;
        }
    }

    private static boolean zzR(zzP5 zzp5) {
        if (zzp5 == null) {
            return false;
        }
        zzOS zzos = (zzOS) zzp5.zzNY().get(0);
        if (zzos.zzNu().getCount() == 2) {
            long j = zzos.zzNu().get(0);
            long j2 = zzos.zzNu().get(1);
            return zzAN.zzS(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) j2)) || zzAN.zzS(zzZPY.zzYC(j), zzZPY.zzYC(j2));
        }
        if (zzos.zzNu().getCount() == 4) {
            long j3 = zzos.zzNu().get(0);
            long j4 = zzos.zzNu().get(1);
            long j5 = zzos.zzNu().get(2);
            long j6 = zzos.zzNu().get(3);
            if (zzp5.isClosed()) {
                int i = (int) j3;
                int i2 = (int) j4;
                if (zzAN.zzS(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)) || zzAN.zzS(zzZPY.zzYC(j3), zzZPY.zzYC(j4))) {
                    float fIntBitsToFloat = Float.intBitsToFloat(i2);
                    int i3 = (int) j5;
                    if (zzAN.zzS(fIntBitsToFloat, Float.intBitsToFloat(i3)) || zzAN.zzS(zzZPY.zzYC(j4), zzZPY.zzYC(j5))) {
                        int i4 = (int) j6;
                        if ((zzAN.zzS(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)) || zzAN.zzS(zzZPY.zzYC(j5), zzZPY.zzYC(j6))) && (zzAN.zzS(Float.intBitsToFloat(i4), Float.intBitsToFloat(i)) || zzAN.zzS(zzZPY.zzYC(j6), zzZPY.zzYC(j3)))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private void zzX(zzZU zzzu, zzI3 zzi3) {
        if (zzzu.zzZz() != zzG2()) {
            zzi3.zzJ(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, zzN(zzzu));
        }
    }

    private void zzX(zzI3 zzi3) {
        String string = zzi3.toString();
        if (zzZYD.zzXk(string)) {
            zzn5().zzX("style", string);
        }
    }

    @Override // com.aspose.words.internal.zzZV7
    public final void zzY(zzC zzc) {
        zzn5().zzY("input");
        zzI3 zzi3 = new zzI3();
        zzi3.zzJ(RequestParameters.POSITION, "absolute");
        zzi3.zzZW(zzc.zzZE());
        zzX(zzi3);
        zzn5().zzX(C18437z2.f56754h, "checkbox");
        zzn5().zzX("name", zzc.getName());
        if (zzc.zzZF()) {
            zzn5().zzX("checked", "checked");
        }
        zzn5().zzo();
    }

    private void zzZ(zzIY zziy, zzG zzg, long j) throws Exception {
        zzIY.zzGJ();
        zziy.zzGF();
        zziy.zzZ(zzPV.zzI5, (int) j, (int) (j >>> 32));
        new zzJ8(this.zzxx.zzGh().zzI(), this.zzxx.zzGh().zzwy()).zzZ(zzg, zziy);
    }

    private static boolean zzQ(zzZG zzzg) {
        if (zzzg.zzZN() != null || !zzU(zzzg.zzZ1())) {
            return false;
        }
        if (zzzg.zzZ2() == null || (zzzg.zzZ2().zzNH().length <= 0 && zzU(zzzg.zzZ2().zzZ1()))) {
            return zzR(zzO(zzP(zzzg)));
        }
        return false;
    }

    private void zzY(zzI3 zzi3) {
        if (this.zzxh.size() == 0) {
            zzi3.zzJ("z-index", "1");
        }
    }

    private void zzZ(zzZQ4 zzzq4, zzZH zzzh) throws Exception {
        zzZOR zzzor = new zzZOR();
        zzZY3 zzzy3ZzE = this.zzxx.zzE(zzzor);
        zzzy3ZzE.startDocument();
        zzzy3ZzE.zzO(zzzh);
        zzzy3ZzE.endDocument();
        zzzor.zzH(0L);
        zzZ((zzZOP) zzzor, zzzq4.zzZE(), zzzh.getSize(), false);
    }

    private static void zzY(zzZU zzzu, zzI3 zzi3) {
        if (zzAN.zzf(zzzu.zzZk())) {
            return;
        }
        zzi3.zzZ("letter-spacing", zzzu.zzZk(), TranslateLanguage.PORTUGUESE);
    }

    private static zzPV zzO(zzZU zzzu) {
        return (!zzzu.zzZy().isEmpty() || zzzu.zzZq().isEmpty()) ? zzzu.zzZy() : zzzu.zzZq();
    }

    private static zzP5 zzO(zzZG zzzg) {
        if (zzzg.zzZ0().getCount() != 1) {
            return null;
        }
        zzP5 zzp5 = zzzg.zzZ0().zzO7().get(0);
        if (zzp5.getCount() == 1 && (zzp5.zzNY().get(0) instanceof zzOS)) {
            return zzp5;
        }
        return null;
    }

    private void zzY(zzG zzg, zzZQ4 zzzq4) throws Exception {
        zzZH zzzh = new zzZH(Math.max(11.0f, zzzq4.getWidth()), Math.max(11.0f, zzzq4.getHeight()));
        zzzh.zzX(zzg);
        zzZ(zzzq4, zzzh);
    }

    private static zzOU zzZ(zzZG zzzg, zzOI zzoi, zzZQ4 zzzq4) {
        zzOU zzouZzZ2 = zzzg.zzZ2();
        return (zzouZzZ2 != null || zzoi == null || zzAN.zzf(zzzq4.getHeight()) || zzAN.zzf(zzzq4.getWidth())) ? zzouZzZ2 : new zzOU(zzoi.zzZy(), 0.1f);
    }

    private static float zzZ(zzOU zzou, zzZG zzzg) {
        return (zzzg.zzZ2() == null || zzou == null || zzou.getWidth() <= 0.0f) ? zzou != null ? zzou.getWidth() : 0.0f : Math.max(zzou.getWidth(), 0.75f);
    }

    private static zzZQ4 zzZ(zzOU zzou, zzZQ4 zzzq4, float f) {
        if (zzou == null) {
            return zzzq4;
        }
        float f2 = (-zzou.getWidth()) / 2.0f;
        if (zzAN.zzf(zzzq4.getHeight())) {
            return new zzZQ4(zzzq4.getX(), zzzq4.getY() + f2, zzzq4.getWidth(), zzzq4.getHeight());
        }
        if (zzAN.zzf(zzzq4.getWidth())) {
            return new zzZQ4(zzzq4.getX() + f2, zzzq4.getY(), zzzq4.getWidth(), zzzq4.getHeight());
        }
        float width = f - zzou.getWidth();
        float f3 = f2 + width;
        float f4 = f + width;
        return new zzZQ4(zzzq4.getX() + f3, zzzq4.getY() + f3, zzzq4.getWidth() - f4, zzzq4.getHeight() - f4);
    }

    private static void zzZ(zzOU zzou, zzZQ4 zzzq4, zzI3 zzi3, float f) {
        String str;
        if (zzou != null) {
            zzOI zzoi = (zzOI) zzou.zzZ1();
            if (zzAN.zzf(zzzq4.getHeight())) {
                str = "border-top";
            } else {
                str = "border";
            }
            if (zzAN.zzf(zzzq4.getWidth())) {
                str = "border-left";
            }
            zzi3.zzJ(str, zzZKN.format("solid {0} {1}", zzI3.zzZ(f, TranslateLanguage.PORTUGUESE), zzZVC.zzr(zzoi.zzZy())));
        }
    }

    private static void zzZ(zzOI zzoi, zzI3 zzi3) {
        if (zzoi != null) {
            zzi3.zzJ("background-color", zzZVC.zzr(zzoi.zzZy()));
        }
    }

    private static String zzZ(String str, zzI2 zzi2) {
        if (zzi2 == null || !zzZYD.zzXk(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            int iZzA = zzi2.zzA(str.charAt(i));
            if (iZzA == 0) {
                return null;
            }
            zzZNH.zzU(sb, zzZVS.zzS7(iZzA));
        }
        return sb.toString();
    }
}
