package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class zzP implements zzHW {
    private boolean zz1;
    private int zz2;
    private int zz3;
    private zzZYE zz4;
    private StringBuilder zz5;
    private zzZL0 zz6;

    public zzP(zzZOP zzzop, zzZO0 zzzo0, boolean z) throws Exception {
        this.zz4 = new zzZYE("");
        byte[] bArr = {PatternStyle.Sphere, PatternStyle.Shingle, 118, 56, PatternStyle.DottedGrid};
        if (zzzo0.getCodePage() == 65000) {
            zzzo0.zzi1();
            if (zzzo0.zzi3().length == 0) {
                zzzop.write(bArr, 0, 5);
            }
        }
        this.zz6 = zzZSN.zzZ(zzzop, zzzo0);
        this.zz5 = new StringBuilder(2048);
        if (z) {
            this.zz6.zzQo(1);
            this.zz6.zzf9();
            this.zz6.zzfb();
        }
    }

    private static boolean zzP(int i) {
        if (zzQ(i) || i == 45 || i == 46) {
            return true;
        }
        if ((i >= 48 && i <= 57) || i == 183) {
            return true;
        }
        if (i < 768 || i > 879) {
            return i >= 8255 && i <= 8256;
        }
        return true;
    }

    private static boolean zzQ(int i) {
        if ((i >= 65 && i <= 90) || i == 95) {
            return true;
        }
        if (i >= 97 && i <= 122) {
            return true;
        }
        if (i >= 192 && i <= 214) {
            return true;
        }
        if (i >= 216 && i <= 246) {
            return true;
        }
        if (i >= 248 && i <= 767) {
            return true;
        }
        if (i >= 880 && i <= 893) {
            return true;
        }
        if (i >= 895 && i <= 8191) {
            return true;
        }
        if (i >= 8204 && i <= 8205) {
            return true;
        }
        if (i >= 8304 && i <= 8591) {
            return true;
        }
        if (i >= 11264 && i <= 12271) {
            return true;
        }
        if (i >= 12289 && i <= 55295) {
            return true;
        }
        if (i >= 63744 && i <= 64975) {
            return true;
        }
        if (i < 65008 || i > 65533) {
            return i >= 65536 && i <= 983039;
        }
        return true;
    }

    private static boolean zzR(int i) {
        if (i == 9 || i == 10 || i == 13) {
            return true;
        }
        if (i >= 32 && i <= 55295) {
            return true;
        }
        if (i < 57344 || i > 65533) {
            return i >= 65536 && i <= 1114111;
        }
        return true;
    }

    private void zzU(boolean z) {
        this.zz3 = Math.max(this.zz3 - 1, 0);
        if (getPrettyFormat()) {
            this.zz2 = Math.max(this.zz2 - 1, 0);
        }
        zzl();
        if (z) {
            this.zz6.zzf6();
        } else {
            this.zz6.zzle();
        }
    }

    private void zzl() {
        if (this.zz1) {
            this.zz6.zzX(IOUtils.LINE_SEPARATOR_WINDOWS);
            this.zz6.zzX(zzZKN.zzS(this.zz6.zzfc(), this.zz6.zzfa() * this.zz2));
            this.zz1 = false;
        }
    }

    public final void endDocument() {
        while (this.zz3 > 0) {
            zzU(false);
        }
        this.zz6.zzld();
        this.zz6.flush();
    }

    public final void flush() {
        this.zz6.flush();
    }

    public final boolean getPrettyFormat() {
        return this.zz6.zzfd() == 1;
    }

    public final void setPrettyFormat(boolean z) {
        this.zz6.zzQo(z ? 1 : 0);
    }

    public final void startDocument() {
        this.zz6.zzf7();
    }

    @Override // com.aspose.words.internal.zzHW
    public final void writeString(String str) {
        this.zz6.writeString(zzT(str));
    }

    public final boolean zzS(String str) {
        if (!zzZYD.zzXk(str)) {
            return false;
        }
        this.zz4.setText(str);
        Iterator<Integer> it = this.zz4.iterator();
        while (it.hasNext()) {
            if (!zzR(it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    public final String zzT(String str) {
        if (!zzS(str)) {
            return str;
        }
        this.zz5.setLength(0);
        Iterator<Integer> it = new zzZYE(str).iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (zzR(iIntValue)) {
                zzZNH.zzU(this.zz5, zzZVS.zzS7(iIntValue));
            }
        }
        return this.zz5.toString();
    }

    public final void zzV(boolean z) {
        this.zz6.zzYZ(z);
    }

    @Override // com.aspose.words.internal.zzHW
    public final void zzW(String str) {
        zzZ(str, (String) null);
    }

    @Override // com.aspose.words.internal.zzHW
    public final void zzX(String str) {
        zzY(str, false);
    }

    @Override // com.aspose.words.internal.zzHW
    public final void zzY(String str) {
        zzZ(str, false);
    }

    public final void zzZ(String str) {
        this.zz6.zzYZ(true);
        zzZ(str, false);
    }

    public final void zzm() {
        zzU(true);
    }

    public final void zzn() {
        zzU(true);
    }

    public final void zzo() {
        zzU(false);
    }

    @Override // com.aspose.words.internal.zzHW
    public final void zzp() {
        zzU(false);
    }

    public final zzZOP zzq() {
        return this.zz6.zzq();
    }

    private static boolean zzR(String str) {
        if (!zzZYD.zzXk(str)) {
            return false;
        }
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        boolean z = true;
        while (itOooO00o.hasNext()) {
            if (!zzZ(((Integer) itOooO00o.next()).intValue(), z)) {
                return false;
            }
            z = false;
        }
        return true;
    }

    public final void zzV(String str) {
        writeString(str.replace(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX).replace("\r", "_x000D_").replace(IOUtils.LINE_SEPARATOR_UNIX, IOUtils.LINE_SEPARATOR_WINDOWS));
    }

    public final void zzW(String str, String str2) {
        this.zz6.zzW(str, str2);
    }

    @Override // com.aspose.words.internal.zzHW
    public final void zzX(String str, String str2) {
        this.zz6.zzX(str, zzT(str2));
    }

    public final void zzY(String str, boolean z) {
        try {
            if (z) {
                zzZ((zzZOK) new zzZOM(str), true);
            } else {
                this.zz6.zzX(str);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final void zzX(zzZOP zzzop) throws Exception {
        zzZOR zzzor = (zzZOR) zzZKW.zzZ(zzzop, zzZOR.class);
        if (zzzor != null) {
            zzZ(zzzor.zziA(), (int) zzzop.getLength());
        } else {
            zzZ(zzZYQ.zzZX(zzzop), (int) zzzop.getLength());
        }
    }

    public final void zzZ(String str, boolean z) {
        zzl();
        this.zz6.zzW1(str);
        this.zz3++;
        if (!getPrettyFormat() || z) {
            return;
        }
        this.zz2++;
    }

    @Override // com.aspose.words.internal.zzHW
    public final void zzY(String str, String str2) {
        if (zzZYD.zzXk(str2)) {
            zzZ(str, str2);
        }
    }

    public final void zzU(String str) {
        this.zz6.zzU(str);
    }

    public final void zzY(String str, String str2, String str3) {
        this.zz6.zzX(str, str2, str3, null);
    }

    public final void zzZ(zzZOP zzzop, boolean z) throws Exception {
        zzZ(new zzZOO(zzzop, zzZO0.zzhV()), z);
    }

    @Override // com.aspose.words.internal.zzHW
    public final void zzZ(String str, zzZQ9 zzzq9) {
        if (zzzq9.getYear() > 1) {
            zzZ(str, zzJB.zzR(zzzq9));
        }
    }

    @Override // com.aspose.words.internal.zzHW
    public final void zzZ(String str, int i) {
        zzZ(str, zzJB.zzWF(i));
    }

    public final void zzZ(String str, String str2, String str3) {
        if (zzZKN.equals(str2, str3)) {
            return;
        }
        zzX(str, str2);
    }

    public zzP(zzZOP zzzop, boolean z) throws Exception {
        this(zzzop, new zzZNI(false), z);
    }

    public final void zzZ(byte[] bArr, int i) {
        zzYV zzyv = new zzYV(bArr, 0, i);
        while (!zzyv.zzYC()) {
            writeString(zzyv.zzYx());
            this.zz6.zzX(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
    }

    public static zzZYG<String> zzZ(zzFQ<String> zzfq) {
        StringBuilder sb = new StringBuilder(1024);
        zzZYG<String> zzzyg = null;
        for (String str : zzfq) {
            if (!zzR(str)) {
                if (zzzyg == null) {
                    zzzyg = new zzZYG<>(false);
                }
                zzZ(str, sb);
                String string = sb.toString();
                int i = 1;
                String str2 = string;
                while (true) {
                    if (i >= 1000) {
                        break;
                    }
                    if (!zzfq.contains(str2) && !zzzyg.containsKey(str2)) {
                        zzzyg.zzW(str, str2);
                        break;
                    }
                    str2 = zzZKN.format("{0}_{1}", string, Integer.valueOf(i));
                    i++;
                }
            }
        }
        return zzzyg;
    }

    private void zzZ(zzZOK zzzok, boolean z) throws Exception {
        if (zzzok.zzCR() == -1) {
            return;
        }
        if (z) {
            String strZzS = zzZKN.zzS(this.zz6.zzfc(), this.zz6.zzfa() * this.zz2);
            String line = zzzok.readLine();
            boolean z2 = false;
            while (line != null) {
                if (z2 || getPrettyFormat()) {
                    this.zz6.zzX(IOUtils.LINE_SEPARATOR_WINDOWS);
                    this.zz6.zzX(strZzS);
                }
                this.zz6.zzX(line);
                line = zzzok.readLine();
                z2 = true;
            }
            this.zz1 = getPrettyFormat();
            return;
        }
        this.zz6.zzX(zzzok.zziv());
    }

    private static void zzZ(String str, StringBuilder sb) {
        sb.setLength(0);
        if (zzZYD.zzXk(str)) {
            boolean z = true;
            String strZzS = zzZKN.zzS('_', 1);
            Iterator itOooO00o = OooO0OO.OooO00o(str);
            while (itOooO00o.hasNext()) {
                int iIntValue = ((Integer) itOooO00o.next()).intValue();
                zzZNH.zzU(sb, zzZ(iIntValue, z) ? zzZVS.zzS7(iIntValue) : strZzS);
                z = false;
            }
        }
    }

    private static boolean zzZ(int i, boolean z) {
        return z ? zzQ(i) : zzP(i);
    }

    @Override // com.aspose.words.internal.zzHW
    public final void zzZ(String str, String str2) {
        zzZ(str, false);
        writeString(str2);
        zzU(false);
    }
}
