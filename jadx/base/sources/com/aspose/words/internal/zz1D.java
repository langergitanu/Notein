package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class zz1D implements zzFY {
    private zzZOP zzEm;
    private zz2V zzfn;

    public zz1D(zzZOP zzzop) {
        if (zzzop == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
        }
        this.zzEm = zzzop;
        this.zzfn = null;
    }

    private static boolean zzTB(int i) {
        return i <= 33 || i == 127 || i == 35 || i == 40 || i == 41 || i == 60 || i == 62 || i == 91 || i == 93 || i == 123 || i == 125 || i == 47 || i == 37;
    }

    private void zzTC(int i) throws Exception {
        writeInt(i);
        zzFh();
        writeInt(0);
        zzFh();
        zzXE("obj");
        zzFg();
    }

    private void zzXF(String str) throws Exception {
        for (int i = 0; i < str.length(); i++) {
            zzG((byte) str.charAt(i));
        }
    }

    private void zzXG(String str) throws Exception {
        zzYX(str.substring(1));
    }

    private void zzXI(String str) throws Exception {
        zzsW();
        zzXE(str);
    }

    private void zzZE(boolean z) throws Exception {
        zzXE(z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
    }

    private void zzZh(byte[] bArr) throws Exception {
        zz2V zz2v = this.zzfn;
        if (zz2v == null) {
            zzt0();
            zzXE(zzZYD.zzZ8(bArr));
            zzsZ();
        } else {
            byte[] bArrZzZi = zz2v.zzZi(bArr);
            zzt0();
            zzXE(zzZYD.zzZ8(bArrZzZi));
            zzsZ();
        }
    }

    private void zzl(zzZQ4 zzzq4) throws Exception {
        zzFf();
        zzn(zzzq4.zzZm());
        zzFh();
        zzn(zzzq4.zzZo());
        zzFh();
        zzn(zzzq4.zzkw());
        zzFh();
        zzn(zzzq4.zzZn());
        zzFe();
    }

    private void zzsW() throws Exception {
        this.zzEm.writeByte(PatternStyle.Shingle);
    }

    private void zzt1() throws Exception {
        zzFg();
        zzXE("endstream");
    }

    private void zzt2() throws Exception {
        zzXE("stream");
        zzFg();
    }

    private void zzt3() throws Exception {
        this.zzEm.writeByte((byte) 37);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void writeInt(int i) throws Exception {
        zzXE(zzJB.zzWD(i));
    }

    @Override // com.aspose.words.internal.zzFY
    public final void writeIntArray(int[] iArr) throws Exception {
        zzFf();
        for (int i = 0; i < iArr.length; i++) {
            writeInt(iArr[i]);
            if (i < iArr.length - 1) {
                zzFh();
            }
        }
        zzFe();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzB(String str, String str2) throws Exception {
        if (zzZYD.zzXk(str2)) {
            zzXE(str);
            zzFh();
            zzXE(str2);
        }
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzC(String str, String str2) throws Exception {
        if (zzZYD.zzXk(str2)) {
            zzXE(str);
            zzYV(str2);
        }
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzD(String str, String str2) throws Exception {
        if (zzZYD.zzXk(str2)) {
            zzXE(str);
            zzYW(str2);
        }
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzE(String str, String str2) throws Exception {
        if (zzZYD.zzXk(str2)) {
            zzXE(str);
            zzYX(str2);
        }
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzF(String str, String str2) throws Exception {
        if (zzZYD.zzXk(str2)) {
            zzXE(str);
            zzXG(str2);
        }
    }

    @Override // com.aspose.words.internal.zzFY
    public final long zzF4() throws Exception {
        return this.zzEm.getPosition();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzF5() throws Exception {
        zzXE("trailer");
        zzFg();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzF6() throws Exception {
        for (int i = 0; i < 15; i++) {
            zzFh();
        }
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzF7() throws Exception {
        zzt0();
        for (int i = 0; i < 32000; i++) {
            this.zzEm.writeByte(PatternStyle.Wave);
        }
        zzsZ();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzF8() throws Exception {
        zzXE(CloudMetaExtra.DEFINE_NON_PARENT_ID);
    }

    @Override // com.aspose.words.internal.zzFY
    public final long zzF9() throws Exception {
        long position = this.zzEm.getPosition();
        zzt1();
        return position;
    }

    @Override // com.aspose.words.internal.zzFY
    public final long zzFa() throws Exception {
        zzt2();
        return this.zzEm.getPosition();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzFb() throws Exception {
        zzFg();
        zzXE("endobj");
        zzFg();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzFc() throws Exception {
        this.zzEm.writeByte((byte) 62);
        this.zzEm.writeByte((byte) 62);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzFd() throws Exception {
        this.zzEm.writeByte((byte) 60);
        this.zzEm.writeByte((byte) 60);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzFe() throws Exception {
        this.zzEm.writeByte((byte) 93);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzFf() throws Exception {
        this.zzEm.writeByte((byte) 91);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzFg() throws Exception {
        this.zzEm.writeByte((byte) 13);
        this.zzEm.writeByte((byte) 10);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzFh() throws Exception {
        this.zzEm.writeByte((byte) 32);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzG(String str, String str2) throws Exception {
        if (zzZYD.zzXk(str2)) {
            zzXE(str);
            zzXI(str2);
        }
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzH(String str, String str2) throws Exception {
        if (zzZYD.zzXk(str2)) {
            zzXE(str);
            zzXE(str2);
        }
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzM(String str, int i) throws Exception {
        zzXH(str);
        writeInt(i);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzP(byte[] bArr, int i) throws Exception {
        zzt2();
        this.zzEm.write(bArr, 0, i);
        zzt1();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzS(float[] fArr) throws Exception {
        zzFf();
        for (int i = 0; i < fArr.length; i++) {
            zzn(fArr[i]);
            if (i < fArr.length - 1) {
                zzFh();
            }
        }
        zzFe();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzT(String str, boolean z) throws Exception {
        zzXH(str);
        zzZE(z);
    }

    public final void zzTA(int i) throws Exception {
        zzG((byte) (i >> 8));
        zzG((byte) i);
    }

    public final void zzU(float f, int i) throws Exception {
        zzXE(zzT(f, i));
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzWb(int i) throws Exception {
        zzXE("startxref");
        zzFg();
        writeInt(i);
        zzFg();
        zzXE("%%EOF");
        zzFg();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzWc(int i) throws Exception {
        zzTC(i);
    }

    public final void zzXE(String str) throws Exception {
        for (int i = 0; i < str.length(); i++) {
            this.zzEm.writeByte((byte) str.charAt(i));
        }
    }

    public final void zzXH(String str) throws Exception {
        zzXE(str);
        zzFh();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzY(String str, zzZQ9 zzzq9) throws Exception {
        if (zzZQ9.zzZ(zzzq9, zzZQ9.zz35)) {
            return;
        }
        zzD(str, "D:" + (zzzq9.zzkR() == 2 ? zzJB.zzP(zzzq9) : zzJB.zzO(zzzq9)));
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzYU(String str) throws Exception {
        zzXE(str);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzYV(String str) throws Exception {
        if (this.zzfn == null) {
            zzsY();
            this.zzEm.writeByte((byte) -2);
            this.zzEm.writeByte((byte) -1);
            for (int i = 0; i < str.length(); i++) {
                zzTA(str.charAt(i));
            }
            zzsX();
            return;
        }
        byte[] bArr = new byte[(str.length() * 2) + 2];
        bArr[0] = -2;
        bArr[1] = -1;
        zzZO0.zzhS().zzZ(str, str.length(), bArr, 2);
        byte[] bArrZzZi = this.zzfn.zzZi(bArr);
        zzt0();
        zzXE(zzZYD.zzZ8(bArrZzZi));
        zzsZ();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzYW(String str) throws Exception {
        if (this.zzfn == null) {
            zzsY();
            zzXF(str);
            zzsX();
        } else {
            byte[] bArr = new byte[str.length()];
            zzZO0.zzhX().zzZ(str, str.length(), bArr, 0);
            byte[] bArrZzZi = this.zzfn.zzZi(bArr);
            zzt0();
            zzXE(zzZYD.zzZ8(bArrZzZi));
            zzsZ();
        }
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzYX(String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            Integer num = (Integer) itOooO00o.next();
            int iIntValue = num.intValue();
            if (zzTB(iIntValue)) {
                zzZNH.zzZ(sb, "#{0:X2}", num);
            } else {
                zzZNH.zzU(sb, zzZVS.zzS7(iIntValue));
            }
        }
        byte[] bytes = new zzZNI().getBytes(sb.toString());
        this.zzEm.write(bytes, 0, bytes.length);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzYY(String str) throws Exception {
        zzXE(str);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzZ(zz51 zz51Var) throws Exception {
        zzt3();
        switch (zz51Var.getCompliance()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
                zzXE("PDF-1.7");
                break;
            case 1:
            case 6:
                zzXE("PDF-2.0");
                break;
            default:
                throw new IllegalStateException("Unknown PDF compliance level.");
        }
        zzFg();
        zzt3();
        this.zzEm.writeByte((byte) -56);
        this.zzEm.writeByte((byte) -55);
        this.zzEm.writeByte((byte) -54);
        this.zzEm.writeByte((byte) -53);
        zzFg();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzZT(long j) throws Exception {
        zzXE(zzJB.zz8(j));
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzn(float f) throws Exception {
        zzXE(zzT(f, 8));
    }

    @Override // com.aspose.words.internal.zzFY
    public final zzZOP zzq() {
        return this.zzEm;
    }

    public final void zzsX() throws Exception {
        this.zzEm.writeByte((byte) 41);
    }

    public final void zzsY() throws Exception {
        this.zzEm.writeByte((byte) 40);
    }

    public final void zzsZ() throws Exception {
        this.zzEm.writeByte((byte) 62);
    }

    public final void zzt0() throws Exception {
        this.zzEm.writeByte((byte) 60);
    }

    public final void zzx(zzP9 zzp9) throws Exception {
        zzn(zzp9.zzOf());
        zzFh();
        zzn(zzp9.zzOe());
        zzFh();
        zzn(zzp9.zzOd());
        zzFh();
        zzn(zzp9.zzOc());
        zzFh();
        zzn(zzp9.zzOb());
        zzFh();
        zzn(zzp9.zzOa());
    }

    public static String zzT(float f, int i) {
        if (Float.isNaN(f)) {
            return "0";
        }
        return zzJB.zzW(f, i);
    }

    public final void zzG(byte b) throws Exception {
        int i = b & 255;
        if (i != 13) {
            if (i == 92 || i == 40 || i == 41) {
                this.zzEm.writeByte((byte) 92);
            }
            this.zzEm.writeByte(b);
            return;
        }
        zzXE("\\015");
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzY(String str, float f) throws Exception {
        zzXH(str);
        zzn(f);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzY(String str, byte[] bArr) throws Exception {
        zzXE(str);
        zzZh(bArr);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzZ(zz4U zz4u) throws Exception {
        zzXE("xref");
        zzFg();
        writeInt(0);
        zzFh();
        writeInt(zz4u.zzv0().getCount());
        zzFg();
        zzXE("0000000000 65535 f");
        zzFg();
        for (int i = 1; i < zz4u.zzv0().getCount(); i++) {
            zzXE(zzZKN.format("{0} 00000 n", zzJB.zzWA(zz4u.zzv0().zzVY(i).zzuY())));
            zzFg();
        }
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzZ(zz47 zz47Var) throws Exception {
        zzFf();
        zzt0();
        zzXE(zzZYD.zzZ8(zz47Var.zzuD()));
        zzsZ();
        zzt0();
        zzXE(zzZYD.zzZ8(zz47Var.zzuC()));
        zzsZ();
        zzFe();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzZ(zz33 zz33Var) throws Exception {
        zzXE(zz33Var.zzF0());
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzZ(String str, zz33 zz33Var) throws Exception {
        zzB(str, zz33Var.zzF0());
    }

    private void zzZ(boolean[] zArr) throws Exception {
        zzFf();
        for (int i = 0; i < zArr.length; i++) {
            zzZE(zArr[i]);
            if (i < zArr.length - 1) {
                zzFh();
            }
        }
        zzFe();
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzZ(zz2V zz2v) {
        this.zzfn = zz2v;
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzZ(String str, boolean[] zArr) throws Exception {
        zzXE(str);
        zzZ(zArr);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzZ(String str, float[] fArr) throws Exception {
        zzXE(str);
        zzS(fArr);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzZ(String str, int[] iArr) throws Exception {
        zzXE(str);
        writeIntArray(iArr);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzZ(String str, zzZQ4 zzzq4) throws Exception {
        zzXE(str);
        zzl(zzzq4);
    }

    @Override // com.aspose.words.internal.zzFY
    public final void zzZ(String str, zzP9 zzp9) throws Exception {
        zzXE(str);
        zzFf();
        zzx(zzp9);
        zzFe();
    }
}
