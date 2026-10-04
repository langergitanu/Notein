package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class zzZL4 {
    static final /* synthetic */ boolean zzVr = true;
    private zzZHM zzZPI;
    private zzZHM zzZPJ;
    CharArrayWriter zzZPK;
    private int zzZPL;
    zzZQH<String, String> zzZPM;
    private zzZL4 zzZPN;
    private zzZEP zzZPO;
    private StringBuilder zzxe;

    public zzZL4(zzZEP zzzep, StringBuilder sb) {
        this.zzZPM = new zzZQH<>();
        this.zzZPN = null;
        this.zzZPO = zzzep;
        this.zzxe = sb;
        this.zzZPK = new CharArrayWriter();
        this.zzZPJ = new zzZHM(this.zzZPK, false);
        this.zzZPI = new zzZHM(this.zzZPK, true);
    }

    private String zzUU(String str) throws IOException {
        this.zzZPI.write(str);
        this.zzZPJ.flush();
        String string = this.zzZPK.toString();
        this.zzZPK.reset();
        return string;
    }

    private boolean zzWd(String str) {
        zzZL4 zzzl4 = this;
        while (!zzzl4.zzZPM.containsKey(str)) {
            zzzl4 = zzzl4.zzZPN;
            if (zzzl4 == null) {
                return false;
            }
        }
        return true;
    }

    private void zzZK(String str, String str2) {
        if (zzWd(str) || !zzZHP.zzXk(str2)) {
            return;
        }
        this.zzZPM.zzB(str, str2);
    }

    private void zzfq() throws IOException, zzZQS {
        this.zzxe.append("<");
        this.zzxe.append(this.zzZPO.zzXMY());
        zzZQH<Map.Entry> zzzqh = new zzZQH();
        for (int i = 0; i < this.zzZPO.zzlh(); i++) {
            zzZK(this.zzZPO.getNamespacePrefix(i), this.zzZPO.getNamespaceURI(i));
        }
        zzZK(this.zzZPO.getPrefix(), this.zzZPO.getNamespaceURI());
        for (int i2 = 0; i2 < this.zzZPO.getAttributeCount(); i2++) {
            String attributePrefix = this.zzZPO.getAttributePrefix(i2);
            String strZzRu = this.zzZPO.zzRu(i2);
            if (!"xmlns".equals(attributePrefix)) {
                if (zzZHP.zzXk(attributePrefix)) {
                    zzZK(attributePrefix, this.zzZPO.getNamespaceURI(attributePrefix));
                    zzzqh.zzB(o0Oo0oo.OooO0Oo(attributePrefix, C18241k5.f55433h, strZzRu), this.zzZPO.getAttributeValue(i2));
                } else {
                    zzzqh.zzB(strZzRu, this.zzZPO.getAttributeValue(i2));
                }
            }
        }
        if (zzzqh.getCount() > 0) {
            for (Map.Entry entry : zzzqh) {
                this.zzxe.append(" ");
                this.zzxe.append((String) entry.getKey());
                this.zzxe.append("=\"");
                this.zzxe.append(zzUU((String) entry.getValue()));
                this.zzxe.append("\"");
            }
        }
        if (this.zzZPM.getCount() > 0) {
            for (Map.Entry<String, String> entry2 : this.zzZPM) {
                if (zzZHP.zzXk(entry2.getKey())) {
                    this.zzxe.append(" xmlns:");
                    this.zzxe.append(entry2.getKey());
                    this.zzxe.append("=\"");
                    this.zzxe.append(zzUU(entry2.getValue()));
                    this.zzxe.append("\"");
                } else {
                    this.zzxe.append(" xmlns=\"");
                    this.zzxe.append(zzUU(entry2.getValue()));
                    this.zzxe.append("\"");
                }
            }
        }
        if (this.zzZPO.zzc()) {
            this.zzxe.append(" />");
        } else {
            this.zzxe.append(">");
        }
    }

    public final int zzfr() throws IOException, zzZQS {
        int eventType = this.zzZPO.getEventType();
        this.zzZPL = eventType;
        if (!zzVr && eventType != 1) {
            throw new AssertionError();
        }
        zzfq();
        if (this.zzZPO.zzc()) {
            int next = this.zzZPO.next();
            this.zzZPL = next;
            return next;
        }
        while (true) {
            int next2 = this.zzZPO.next();
            this.zzZPL = next2;
            if (next2 == 1) {
                this.zzZPL = new zzZL4(this).zzfr();
            } else {
                if (next2 == 2) {
                    StringBuilder sb = this.zzxe;
                    sb.append("</");
                    sb.append(this.zzZPO.zzXMY());
                    sb.append(">");
                    return this.zzZPL;
                }
                if (next2 == 3) {
                    continue;
                } else if (next2 == 4) {
                    this.zzZPJ.write(this.zzZPO.getText());
                    this.zzZPJ.flush();
                    String string = this.zzZPK.toString();
                    this.zzZPK.reset();
                    this.zzxe.append(string);
                } else if (next2 != 5) {
                    throw new IllegalStateException("Unexpected XML event type: " + zzZL3.toString(this.zzZPL));
                }
            }
        }
    }

    private zzZL4(zzZL4 zzzl4) {
        this.zzZPM = new zzZQH<>();
        this.zzZPN = zzzl4;
        this.zzZPO = zzzl4.zzZPO;
        this.zzxe = zzzl4.zzxe;
        this.zzZPK = zzzl4.zzZPK;
        this.zzZPJ = zzzl4.zzZPJ;
        this.zzZPI = zzzl4.zzZPI;
    }
}
