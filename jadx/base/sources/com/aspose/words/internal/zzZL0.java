package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZL0 extends zzZKZ {
    private zzZO0 zzMW;
    private zzZOP zzN5;
    private char zzZPA;
    private int zzZPB;
    private OutputStream zzZPv;
    private zzZHJ zzZPw;
    private zzYFV zzZPx;
    private String zzZPy;
    private int zzZPz;

    public zzZL0(zzZOP zzzop, zzZO0 zzzo0) throws Exception {
        this(new zzZK6(zzzop), zzzo0);
        this.zzN5 = zzzop;
    }

    private void zzUb(String str) {
        StringBuilder sb = new StringBuilder("<?xml version=\"1.0\" encoding=\"");
        sb.append(this.zzMW.zzi2());
        sb.append("\"");
        if (str != null) {
            sb.append(" standalone=");
            sb.append(str);
        }
        sb.append("?>");
        try {
            if (this.zzZPB == 1) {
                ((zzZHJ) this.zzZPx).zzTK(sb.toString());
            } else {
                this.zzZPx.zzX(sb.toString());
            }
        } catch (zzZQS e) {
            zzZ(e);
        }
    }

    private static void zzZ(zzZQS zzzqs) {
        throw new IllegalStateException("XMLStreamException: " + zzzqs.getMessage(), zzzqs);
    }

    private void zzZ0(boolean z) {
        zzYFV zzyfv = this.zzZPx;
        if (zzyfv instanceof zzZHJ) {
            ((zzZHJ) zzyfv).zzZ0(z);
        }
    }

    private void zzf8() {
        zzYFV zzyfv = this.zzZPx;
        if (zzyfv instanceof zzZHJ) {
            ((zzZHJ) zzyfv).setIndent(zzZKN.zzS(this.zzZPA, this.zzZPz));
        }
    }

    private void zzfe() {
        byte[] bArrZzi3 = this.zzMW.zzi3();
        if (bArrZzi3.length > 0) {
            try {
                this.zzZPv.write(bArrZzi3);
            } catch (IOException e) {
                zzZ(e);
            }
        }
    }

    public final void flush() {
        try {
            if (this.zzMW.getCodePage() == 65000) {
                zzX(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            this.zzZPx.flush();
        } catch (zzZQS e) {
            zzZ(e);
        }
    }

    public final void writeString(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            this.zzZPx.zzVV(str);
        } catch (zzZQS e) {
            zzZ(e);
        }
    }

    public final void zzQo(int i) {
        if (i == this.zzZPB) {
            return;
        }
        if (i == 1) {
            if (this.zzZPw == null) {
                zzZHJ zzzhj = new zzZHJ();
                this.zzZPw = zzzhj;
                zzzhj.zzY(this.zzZPx);
            }
            this.zzZPx = this.zzZPw;
            zzZ0(true);
        } else if (i == 0) {
            zzZ0(false);
        }
        this.zzZPB = i;
    }

    public final void zzU(String str) {
        try {
            this.zzZPx.zzU(str);
        } catch (zzZQS e) {
            zzZ(e);
        }
    }

    public final void zzW(String str, String str2) {
        try {
            this.zzZPx.zzW(str, str2);
        } catch (zzZQS e) {
            zzZ(e);
        }
    }

    public final void zzW1(String str) {
        try {
            this.zzZPx.zzW1(str);
        } catch (zzZQS e) {
            zzZ(e);
        }
    }

    public final void zzX(String str, String str2, String str3, String str4) {
        if (str == null || str.length() <= 0) {
            throw new IllegalArgumentException("The argument cannot be null or empty string.\r\nParameter name: name");
        }
        try {
            this.zzZPx.zzW(str, str3, str2, null);
        } catch (zzZQS e) {
            zzZ(e);
        }
    }

    public final void zzYZ(boolean z) {
        zzUb(z ? "\"yes\"" : "\"no\"");
    }

    public final void zzf6() {
        try {
            this.zzZPx.zzf6();
        } catch (zzZQS e) {
            zzZ(e);
        }
    }

    public final void zzf7() {
        zzUb(null);
    }

    public final void zzf9() {
        if (1 == this.zzZPz) {
            return;
        }
        this.zzZPz = 1;
        zzf8();
    }

    public final int zzfa() {
        return this.zzZPz;
    }

    public final void zzfb() {
        if ('\t' == this.zzZPA) {
            return;
        }
        this.zzZPA = '\t';
        zzf8();
    }

    public final char zzfc() {
        return this.zzZPA;
    }

    public final int zzfd() {
        return this.zzZPB;
    }

    public final void zzld() {
        try {
            this.zzZPx.zzld();
        } catch (zzZQS e) {
            zzZ(e);
        }
    }

    public final void zzle() {
        try {
            this.zzZPx.zzle();
        } catch (zzZQS e) {
            zzZ(e);
        }
    }

    public final zzZOP zzq() {
        return this.zzN5;
    }

    private static void zzZ(IOException iOException) {
        throw new IllegalStateException(iOException);
    }

    private zzZL0(OutputStream outputStream, zzZO0 zzzo0) {
        this.zzZPB = 0;
        this.zzZPA = ControlChar.SPACE_CHAR;
        this.zzZPz = 2;
        this.zzZPy = IOUtils.LINE_SEPARATOR_WINDOWS;
        this.zzZPv = outputStream;
        this.zzMW = zzzo0 == null ? zzZO0.zzhV() : zzzo0;
        zzfe();
        zzZEN zzzen = new zzZEN();
        zzzen.zzXPj();
        zzzen.zzXM9().zzPi(true);
        zzzen.zzXM9().zzPe(true);
        zzzen.zzXM9().zzPf(false);
        zzzen.zzXM9().zzPc(false);
        zzzen.zzXM9().zzPd(true);
        zzzen.zzXM9().zzZ(zzZHL.zzch());
        zzzen.zzXM9().zzY(zzZHL.zzcg());
        try {
            this.zzZPx = (zzYFV) zzzen.zzX(new OutputStreamWriter(this.zzZPv, this.zzMW.zzik().zzi5()));
        } catch (zzZQS e) {
            zzZ(e);
        }
    }

    public final void zzX(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        try {
            this.zzZPx.zz0(str, str2);
        } catch (zzZQS e) {
            zzZ(e);
        }
    }

    public final void zzX(String str) {
        try {
            this.zzZPx.zzX(str);
        } catch (zzZQS e) {
            zzZ(e);
        }
    }
}
