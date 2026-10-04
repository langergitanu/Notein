package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.IOException;
import java.text.MessageFormat;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZEK extends zzYFO implements zzYFC {
    protected boolean zzWK9;
    protected boolean zzWKa;
    protected final boolean zzWKb;
    protected final boolean zzWKc;
    protected final boolean zzWKd;
    protected final zzZEA zzWKf;
    protected final zzZHB zzWM6;
    protected boolean zzWQq;
    protected String zzZPP;
    protected char[] zzWKe = null;
    protected zzYF6 zzWKU = null;
    protected boolean zzWQ6 = false;
    protected zzYFB zzWKp = null;
    protected int zzKF = 1;
    protected boolean zzWK8 = false;
    protected boolean zzWK7 = false;
    protected boolean zzWK6 = false;
    protected int zzWL4 = 4;
    protected String zzWK5 = null;

    public zzZEK(zzZEA zzzea, String str, zzZHB zzzhb) {
        this.zzWKf = zzzea;
        this.zzZPP = str;
        this.zzWM6 = zzzhb;
        int iZzXPQ = zzzhb.zzXPQ();
        this.zzWKa = (iZzXPQ & 256) != 0;
        this.zzWK9 = (iZzXPQ & 2048) != 0;
        this.zzWKb = (iZzXPQ & 4) != 0;
        this.zzWKd = (iZzXPQ & 8) != 0;
        this.zzWKc = (iZzXPQ & 16) != 0;
        this.zzWQq = zzzhb.zzXPW();
    }

    private boolean isValidating() {
        return this.zzWKU != null;
    }

    public static void zzG(String str, Object obj) throws zzZQS {
        zzH(str, obj);
    }

    public static void zzH(String str, Object obj) throws zzZQS {
        zzxn(MessageFormat.format(str, obj));
    }

    private void zzK(String str, Object obj) throws zzZQS {
        zzY(new zzYF8(zzXM8(), MessageFormat.format(str, obj)));
    }

    private char[] zzXM3() {
        char[] cArr = this.zzWKe;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrZzXP5 = this.zzWM6.zzXP5();
        this.zzWKe = cArrZzXP5;
        return cArrZzXP5;
    }

    private void zzXM4() throws zzZQS {
        if (this.zzWKa) {
            if (this.zzKF != 1) {
                throw new zzZQS(C21023OooO0Oo.OooO0OO("; start element(s) written)", this.zzKF, new StringBuilder("Can not write DOCTYPE declaration (DTD) when not in prolog any more (state ")));
            }
            if (this.zzWK5 != null) {
                throw new zzZQS("Trying to write multiple DOCTYPE declarations");
            }
        }
    }

    private void zzXM5() throws zzZQS {
        if (this.zzWKa && zzXM7()) {
            zzxn(zzZH9.zzWP5);
        }
        if (this.zzWL4 <= 1) {
            zzgv(12);
        }
    }

    private final void zzXM6() throws zzZQS {
        int i = this.zzKF;
        if (i != 3) {
            if (this.zzWKa && i == 1) {
                zzxn("Trying to write END_DOCUMENT when document has no root (ie. trying to output empty document).");
            }
            if (this.zzWK7) {
                zzOV(this.zzWK6);
            }
            if (this.zzKF != 3 && this.zzWM6.zzXPc()) {
                do {
                    zzle();
                } while (this.zzKF != 3);
            }
        }
        char[] cArr = this.zzWKe;
        if (cArr != null) {
            this.zzWKe = null;
            this.zzWM6.zzO(cArr);
        }
        try {
            this.zzWKf.zzOT(false);
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    private boolean zzXM7() {
        return this.zzKF != 2;
    }

    private zzYFX zzXM8() {
        return new zzZF2(null, null, null, this.zzWKf.zzXLQ(), this.zzWKf.getRow(), this.zzWKf.getColumn());
    }

    private void zzgv(int i) throws zzZQS {
        int i2 = this.zzWL4;
        if (i2 == 0) {
            zzW(zzZH9.zzWPa, zzXMs(), zzZH9.zzgZ(i));
            return;
        }
        if (i2 == 1) {
            zzK(zzZH9.zzWP9, zzXMs());
        } else if (i2 == 3 || i2 == 4) {
            zzW(zzZH9.zzWP8, zzXMs(), zzZH9.zzgZ(i));
        } else {
            zzy4(C21532OooOOo.OooO0OO(i, "Internal error: trying to report invalid content for "));
        }
    }

    public static void zzxk(String str) throws zzZQS {
        zzxn(str);
    }

    public static void zzxl(String str) throws zzZQS {
        zzxn(str);
    }

    public static void zzxm(String str) throws zzZQS {
        zzxn(str);
    }

    public static void zzxn(String str) throws zzZQS {
        throw new zzZQS(str);
    }

    private void zzy4(String str) throws zzZQS {
        zzY(new zzYF8(zzXM8(), str, 2));
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void close() throws zzZQS {
        zzXM6();
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void flush() throws zzZQS {
        try {
            this.zzWKf.flush();
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final Object getProperty(String str) {
        return str.equals("com.ctc.wstx.outputUnderlyingStream") ? this.zzWKf.getOutputStream() : str.equals("com.ctc.wstx.outputUnderlyingWriter") ? this.zzWKf.getWriter() : this.zzWM6.getProperty(str);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[StreamWriter: ");
        sb.append(getClass());
        sb.append(", underlying outputter: ");
        if (this.zzWKf == null) {
            str = "NULL";
        } else {
            str = this.zzWKf.toString() + "]";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.aspose.words.internal.zzYFC
    public final int zzN(String str, String str2, String str3, String str4) {
        return -1;
    }

    public abstract void zzOV(boolean z) throws zzZQS;

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzU(String str) throws zzZQS {
        this.zzWK8 = true;
        if (this.zzWK7) {
            zzOV(this.zzWK6);
        }
        if (this.zzWL4 == 0) {
            zzgv(5);
        }
        try {
            int iZzxi = this.zzWKf.zzxi(str);
            if (iZzxi >= 0) {
                zzH(zzZH9.zzWP1, zzZE5.zzgh(iZzxi));
            }
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzVV(String str) throws zzZQS {
        this.zzWK8 = true;
        if (this.zzWK7) {
            zzOV(this.zzWK6);
        }
        if (this.zzWKa && zzXM7() && !zzZDX.zzwZ(str)) {
            zzxn(zzZH9.zzWP4);
        }
        int i = this.zzWL4;
        if (i <= 1 && (i == 0 || !zzZDX.zzwZ(str))) {
            zzgv(4);
        }
        if (zzXM7()) {
            try {
                this.zzWKf.zzX(str);
                return;
            } catch (IOException e) {
                throw new zzZFU(e);
            }
        }
        int length = str.length();
        if (length < 12) {
            try {
                this.zzWKf.zzVV(str);
                return;
            } catch (IOException e2) {
                throw new zzZFU(e2);
            }
        }
        char[] cArrZzXM3 = zzXM3();
        int i2 = 0;
        while (length > 0) {
            int length2 = length > cArrZzXM3.length ? cArrZzXM3.length : length;
            int i3 = i2 + length2;
            str.getChars(i2, i3, cArrZzXM3, 0);
            try {
                this.zzWKf.zzY(cArrZzXM3, 0, length2);
                length -= length2;
                i2 = i3;
            } catch (IOException e3) {
                throw new zzZFU(e3);
            }
        }
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzVW(String str) throws zzZQS {
        this.zzWK8 = true;
        if (this.zzWK7) {
            zzOV(this.zzWK6);
        }
        if (this.zzWKa && zzXM7()) {
            zzxn("Trying to output an entity reference outside main element tree (in prolog or epilog)");
        }
        if (this.zzWL4 == 0) {
            zzgv(9);
        }
        try {
            this.zzWKf.zzxh(str);
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzVX(String str) throws zzZQS {
        zzXM4();
        this.zzWK5 = "";
        try {
            this.zzWKf.zzVX(str);
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzVY(String str) throws zzZQS {
        if (this.zzWKd) {
            zzVV(str);
            return;
        }
        this.zzWK8 = true;
        if (this.zzWK7) {
            zzOV(this.zzWK6);
        }
        zzXM5();
        try {
            int iZzxj = this.zzWKf.zzxj(str);
            if (iZzxj >= 0) {
                zzH(zzZH9.zzWP2, zzZE5.zzgh(iZzxj));
            }
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzVZ(String str) throws zzZQS {
        zzW(str, null);
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzW(String str, String str2) throws zzZQS {
        this.zzWK8 = true;
        if (this.zzWK7) {
            zzOV(this.zzWK6);
        }
        if (this.zzWL4 == 0) {
            zzgv(3);
        }
        try {
            int iZzXC = this.zzWKf.zzXC(str, str2);
            if (iZzXC >= 0) {
                throw new zzZQS(o0Oo0oo.OooO0O0(iZzXC, "Illegal input: processing instruction content has embedded '?>' in it (index ", ")"));
            }
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    @Override // com.aspose.words.internal.zzYFO, com.aspose.words.internal.zzYFV
    public final void zzX(String str) throws zzZQS {
        this.zzWK8 = true;
        if (this.zzWK7) {
            zzOV(this.zzWK6);
        }
        try {
            this.zzWKf.zzr(str, 0, str.length());
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    public final void zzXD(String str, String str2) throws zzZQS {
        String str3;
        int length;
        int length2;
        if (isValidating() && (str3 = this.zzWK5) != null && str3.length() > 0) {
            if (str.equals(this.zzWK5) || ((length2 = this.zzWK5.length()) > (length = str.length()) && this.zzWK5.endsWith(str) && this.zzWK5.charAt((length2 - length) - 1) == ':')) {
                str = null;
            } else if (str2 != null) {
                str = str2.length() == 0 ? "[unknown]:".concat(str) : o0Oo0oo.OooO0Oo(str2, C18241k5.f55433h, str);
            }
            if (str != null) {
                zzW(zzZH9.zzWP6, str, this.zzWK5);
            }
        }
        this.zzKF = 2;
    }

    public abstract String zzXMs();

    @Override // com.aspose.words.internal.zzYFC
    public final zzZQY zzXMu() {
        return zzXM8();
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzY(char[] cArr, int i, int i2) throws zzZQS {
        this.zzWK8 = true;
        if (this.zzWK7) {
            zzOV(this.zzWK6);
        }
        if (this.zzWKa && zzXM7() && !zzZDX.zzN(cArr, i, i2)) {
            zzxn(zzZH9.zzWP4);
        }
        int i3 = this.zzWL4;
        if (i3 <= 1 && (i3 == 0 || !zzZDX.zzN(cArr, i, i2))) {
            zzgv(4);
        }
        if (i2 > 0) {
            try {
                if (zzXM7()) {
                    this.zzWKf.zzS(cArr, i, i2);
                } else {
                    this.zzWKf.zzY(cArr, i, i2);
                }
            } catch (IOException e) {
                throw new zzZFU(e);
            }
        }
    }

    @Override // com.aspose.words.internal.zzYFO
    public final void zzYR(String str, int i) throws zzZQS {
        this.zzWK8 = true;
        if (this.zzWK7) {
            zzOV(this.zzWK6);
        }
        try {
            this.zzWKf.zzr(str, 0, i);
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzld() throws zzZQS {
        zzXM6();
    }

    @Override // com.aspose.words.internal.zzZQQ
    public abstract void zzle() throws zzZQS;

    public static void zzX(IOException iOException) throws zzZQS {
        throw new zzZFU(iOException);
    }

    @Override // com.aspose.words.internal.zzYFO, com.aspose.words.internal.zzYFV
    public final void zzW(String str, String str2, String str3, String str4) throws zzZQS {
        zzXM4();
        this.zzWK5 = str;
        try {
            this.zzWKf.zzW(str, str2, str3, str4);
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    @Override // com.aspose.words.internal.zzYFC
    public final void zzY(zzYF8 zzyf8) throws zzZQS {
        if (this.zzWKp != null) {
            return;
        }
        if (zzyf8.zzXye() <= 2) {
            zzZQU zzzquZzXP8 = this.zzWM6.zzXP8();
            if (zzzquZzXP8 != null) {
                zzY(zzzquZzXP8, zzyf8);
                return;
            } else {
                if (zzyf8.zzXye() >= 2) {
                    throw zzZFQ.zzZ(zzyf8);
                }
                return;
            }
        }
        throw zzZFQ.zzZ(zzyf8);
    }

    private void zzW(String str, Object obj, Object obj2) throws zzZQS {
        zzY(new zzYF8(zzXM8(), MessageFormat.format(str, obj, obj2)));
    }

    private void zzY(zzZQU zzzqu, zzYF8 zzyf8) throws zzZQS {
        if (zzzqu != null) {
            if (zzyf8.zzlj() == null) {
                zzyf8.zzY(zzXM8());
            }
            if (zzyf8.getType() == null) {
                zzyf8.zzPy(zzZH9.zzWPQ);
            }
        }
    }
}
