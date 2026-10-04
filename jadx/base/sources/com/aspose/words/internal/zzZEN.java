package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZEN extends zzYFY {
    protected final zzZHB zzWM6 = zzZHB.zzXPg();

    private zzYFV zzZ(OutputStream outputStream, Writer writer, String str) throws zzZQS {
        String strZzY;
        zzZEA zzzej;
        zzZHB zzzhbZzXPf = this.zzWM6.zzXPf();
        boolean zZzXPd = this.zzWM6.zzXPd();
        if (writer == null) {
            strZzY = "UTF-8";
            try {
                zzzej = "UTF-8" == "UTF-8" ? new zzZEJ(new zzZF4(zzzhbZzXPf, outputStream, zZzXPd), zzzhbZzXPf, "UTF-8", zZzXPd, outputStream, 16) : "UTF-8" == "ISO-8859-1" ? new zzZEH(outputStream, zzzhbZzXPf, zZzXPd) : "UTF-8" == "US-ASCII" ? new zzZEM(outputStream, zzzhbZzXPf, zZzXPd) : new zzZEJ(new OutputStreamWriter(outputStream, "UTF-8"), zzzhbZzXPf, "UTF-8", zZzXPd, outputStream, -1);
            } catch (IOException e) {
                throw new zzZQS(e);
            }
        } else {
            strZzY = zzZFJ.zzY(writer);
            try {
                zzzej = new zzZEJ(writer, zzzhbZzXPf, strZzY, zZzXPd, null, -1);
            } catch (IOException e2) {
                throw new zzZQS(e2);
            }
        }
        return zzZ(strZzY, zzzhbZzXPf, zzzej);
    }

    public final void setProperty(String str, Object obj) {
        this.zzWM6.zzL(str, obj);
    }

    public final zzZQQ zzU(OutputStream outputStream) throws zzZQS {
        return zzZ(outputStream, (Writer) null, (String) null);
    }

    public final zzZQQ zzX(Writer writer) throws zzZQS {
        return zzZ((OutputStream) null, writer, (String) null);
    }

    public final zzZHB zzXM9() {
        return this.zzWM6;
    }

    public final void zzXPj() {
        this.zzWM6.zzXPj();
    }

    private static zzYFV zzZ(String str, zzZHB zzzhb, zzZEA zzzea) {
        if (zzzhb.zzXPP()) {
            if (zzzhb.zzXPe()) {
                return new zzZEE(zzzea, str, zzzhb);
            }
            return new zzZED(zzzea, str, zzzhb);
        }
        return new zzZEG(zzzea, str, zzzhb);
    }
}
