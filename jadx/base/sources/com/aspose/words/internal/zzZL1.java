package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18241k5;
import java.io.StringReader;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZL1 extends zzZL2 {
    private zzZO0 zzMW;
    private zzZOP zzN5;
    private boolean zzZPC;
    private boolean zzZPD;
    private int zzZPE;
    private int zzZPF;
    private int zzZPG;
    private String zzZPH;
    private int zzZPL;
    private zzZEP zzZPO;

    private zzZL1(zzZOP zzzop) {
        this((Object) zzzop, false);
    }

    private static boolean zzQp(int i) {
        return ((1 << i) & 6768) != 0;
    }

    private static String zzUc(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf >= 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static String zzUd(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf >= 0 ? str.substring(0, iIndexOf) : "";
    }

    private static void zzZ(zzZQS zzzqs) {
        throw new IllegalStateException("XMLStreamException: " + zzzqs.getMessage(), zzzqs);
    }

    private String zzf() {
        StringBuilder sb = new StringBuilder();
        try {
            if (this.zzZPL != 1) {
                this.zzZPL = this.zzZPO.next();
                return "";
            }
            this.zzZPL = new zzZL4(this.zzZPO, sb).zzfr();
            this.zzZPL = this.zzZPO.next();
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void zzff() {
        while (this.zzZPO.getEventType() != 8) {
            try {
                read();
            } catch (Exception e) {
                if (e.getMessage().contains("Unexpected EOF")) {
                    return;
                }
            }
        }
    }

    private void zzfg() {
        this.zzZPE = 0;
        this.zzZPG = -1;
        this.zzZPF = 0;
    }

    @Override // com.aspose.words.internal.zzZL2
    public final int getDepth() {
        return this.zzZPO.getDepth();
    }

    public final String getLocalName() {
        int i = this.zzZPL;
        if (i == 3) {
            return this.zzZPO.zzlg();
        }
        if (i == 9) {
            return this.zzZPO.getLocalName();
        }
        if (this.zzZPD) {
            int i2 = this.zzZPG;
            return i2 >= 0 ? zzUc(this.zzZPO.zzRu(i2)) : this.zzZPO.zzsa() ? zzUc(this.zzZPO.getLocalName()) : "";
        }
        int i3 = this.zzZPG;
        if (i3 >= 0 && i3 < this.zzZPE) {
            return this.zzZPO.getNamespacePrefix(i3);
        }
        int i4 = this.zzZPE;
        return (i3 < i4 || i3 >= this.zzZPF + i4) ? this.zzZPO.zzsa() ? this.zzZPO.getLocalName() : "" : this.zzZPO.zzRu(i3 - i4);
    }

    public final String getName() {
        if (this.zzZPD) {
            int i = this.zzZPG;
            return i >= 0 ? this.zzZPO.zzRu(i) : this.zzZPO.zzsa() ? this.zzZPO.getLocalName() : "";
        }
        int i2 = this.zzZPG;
        if (i2 >= 0 && i2 < this.zzZPE) {
            String namespacePrefix = this.zzZPO.getNamespacePrefix(i2);
            return (namespacePrefix == null || namespacePrefix.isEmpty()) ? "xmlns" : "xmlns:".concat(namespacePrefix);
        }
        int i3 = this.zzZPE;
        if (i2 >= i3 && i2 < this.zzZPF + i3) {
            int i4 = i2 - i3;
            if (!zzZHP.zzXk(this.zzZPO.getAttributePrefix(i4))) {
                return this.zzZPO.zzRu(i4);
            }
            return this.zzZPO.getAttributePrefix(i4) + C18241k5.f55433h + this.zzZPO.zzRu(i4);
        }
        if (!this.zzZPO.zzsa()) {
            return "";
        }
        if (!zzZHP.zzXk(this.zzZPO.getPrefix())) {
            return this.zzZPO.getLocalName();
        }
        return this.zzZPO.getPrefix() + C18241k5.f55433h + this.zzZPO.getLocalName();
    }

    public final String getNamespaceURI() {
        if (this.zzZPD) {
            int i = this.zzZPG;
            return i >= 0 ? this.zzZPO.getAttributeNamespace(i) : this.zzZPO.zzsa() ? this.zzZPO.getNamespaceURI() : "";
        }
        int i2 = this.zzZPG;
        if (i2 >= 0 && i2 < this.zzZPE) {
            return this.zzZPO.getNamespaceURI("xmlns");
        }
        int i3 = this.zzZPE;
        return (i2 < i3 || i2 >= this.zzZPF + i3) ? this.zzZPO.zzsa() ? this.zzZPO.getNamespaceURI() : "" : this.zzZPO.getAttributeNamespace(i2 - i3);
    }

    @Override // com.aspose.words.internal.zzZL2
    public final int getNodeType() {
        if (this.zzZPG >= 0) {
            return 10;
        }
        return this.zzZPL;
    }

    public final String getPrefix() {
        if (this.zzZPD) {
            int i = this.zzZPG;
            return i >= 0 ? zzUd(this.zzZPO.zzRu(i)) : this.zzZPO.zzsa() ? zzUd(this.zzZPO.getLocalName()) : "";
        }
        int i2 = this.zzZPG;
        if (i2 >= 0 && i2 < this.zzZPE) {
            return "xmlns";
        }
        int i3 = this.zzZPE;
        return (i2 < i3 || i2 >= this.zzZPF + i3) ? this.zzZPO.zzsa() ? this.zzZPO.getPrefix() : "" : this.zzZPO.getAttributePrefix(i2 - i3);
    }

    public final String getValue() {
        if (this.zzZPD) {
            int i = this.zzZPG;
            if (i >= 0) {
                return this.zzZPO.getAttributeValue(i);
            }
        } else {
            int i2 = this.zzZPG;
            if (i2 >= 0 && i2 < this.zzZPE) {
                return this.zzZPO.getNamespaceURI(i2);
            }
            int i3 = this.zzZPE;
            if (i2 >= i3 && i2 < this.zzZPF + i3) {
                return this.zzZPO.getAttributeValue(i2 - i3);
            }
        }
        int i4 = this.zzZPL;
        if (i4 == 1 || i4 == 2 || i4 == 8) {
            return "";
        }
        if (i4 == 3) {
            return this.zzZPO.zzlf();
        }
        if (i4 != 9) {
            return this.zzZPO.getText();
        }
        zzYFD zzyfdZzXMV = this.zzZPO.zzXMV();
        return (zzyfdZzXMV == null || !(zzyfdZzXMV instanceof zzZGN)) ? "" : ((zzZGN) zzyfdZzXMV).zzXOF().get(this.zzZPO.getLocalName()).zzlc();
    }

    public final boolean hasAttributes() {
        if (this.zzZPL != 1) {
            return false;
        }
        if (this.zzZPD) {
            return this.zzZPO.getAttributeCount() > 0;
        }
        return this.zzZPO.getAttributeCount() + this.zzZPO.zzlh() > 0;
    }

    @Override // com.aspose.words.internal.zzZL2
    public final boolean read() {
        zzfg();
        try {
            if (!this.zzZPO.hasNext()) {
                return false;
            }
            int next = this.zzZPO.next();
            this.zzZPL = next;
            if (next != 4) {
                return true;
            }
            String value = getValue();
            if (zzZHP.zzTL(value)) {
                this.zzZPL = 6;
                return true;
            }
            if (!zzZHP.zzTM(value)) {
                return true;
            }
            this.zzZPL = 24;
            return true;
        } catch (zzZQS e) {
            String message = e.getMessage();
            if (!message.startsWith("Unexpected EOF") && message.startsWith("Undeclared namespace prefix") && zzM(getPrefix()) == null) {
                zzff();
            }
            zzZ(e);
            return false;
        }
    }

    public final String readString() {
        StringBuilder sb = new StringBuilder("");
        try {
            int i = this.zzZPL;
            if (i == 1) {
                if (this.zzZPO.zzc() || !read()) {
                    return "";
                }
                while (zzQp(this.zzZPO.getEventType())) {
                    sb.append(this.zzZPO.getText());
                    if (!read()) {
                        break;
                    }
                }
            } else if (i != 2 && zzQp(i)) {
                sb.append(this.zzZPO.getText());
            }
            this.zzZPL = this.zzZPO.getEventType();
        } catch (zzZQS e) {
            zzZHV.zzZ(e);
        }
        return sb.toString();
    }

    public final String toString() {
        return "XmlTextReader{mCurrentEvent=" + zzZL3.toString(this.zzZPL) + ", localName=" + getLocalName() + '}';
    }

    public final String zzM(String str) {
        return "xlink".equals(str) ? "http://www.w3.org/1999/xlink" : "xml".equals(str) ? "http://www.w3.org/XML/1998/namespace" : this.zzZPO.getNamespaceURI(str);
    }

    public final zzZO0 zzQZ() {
        if (this.zzMW == null) {
            String encoding = this.zzZPO.getEncoding();
            if (encoding == null) {
                this.zzMW = zzZO0.zzhV();
            } else {
                this.zzMW = zzZO0.zzV3(encoding);
            }
        }
        return this.zzMW;
    }

    @Override // com.aspose.words.internal.zzZL2
    public final boolean zzc() {
        try {
            return this.zzZPO.zzc();
        } catch (zzZQS e) {
            zzZ(e);
            return false;
        }
    }

    public final boolean zzfh() {
        return "preserve".equals(this.zzZPO.zzXMR().getValue("", "space"));
    }

    public final zzZQH<String, String> zzfi() {
        zzZQH<String, String> zzzqh = new zzZQH<>();
        for (int i = 0; i < this.zzZPO.zzlh(); i++) {
            String namespacePrefix = this.zzZPO.getNamespacePrefix(i);
            if (namespacePrefix != null) {
                zzzqh.zzB(namespacePrefix, this.zzZPO.getNamespaceURI(i));
            }
        }
        return zzzqh;
    }

    public final zzZL2 zzfj() throws Exception {
        long position = this.zzN5.getPosition();
        this.zzN5.zzH(0L);
        zzZL1 zzzl1 = new zzZL1(this.zzN5);
        zzzl1.read();
        while (zzzl1.zzZPO.zzXMT() < this.zzZPO.zzXMT()) {
            zzzl1.read();
        }
        String strZzf = zzzl1.zzf();
        this.zzN5.zzH(position);
        zzfm();
        return new zzZL1((Object) strZzf, false);
    }

    public final boolean zzfk() {
        if (this.zzZPL != 1) {
            return false;
        }
        if (this.zzZPD) {
            int attributeCount = this.zzZPO.getAttributeCount();
            this.zzZPF = attributeCount;
            if (attributeCount <= 0) {
                return false;
            }
            this.zzZPG = 0;
            return true;
        }
        this.zzZPE = this.zzZPO.zzlh();
        int attributeCount2 = this.zzZPO.getAttributeCount();
        this.zzZPF = attributeCount2;
        if (this.zzZPE + attributeCount2 <= 0) {
            return false;
        }
        this.zzZPG = 0;
        return true;
    }

    public final boolean zzfl() {
        zzfg();
        try {
            if (!this.zzZPO.hasNext()) {
                return false;
            }
            int next = this.zzZPO.next();
            this.zzZPL = next;
            if (next != 4 || !zzZHP.zzTM(getValue())) {
                return true;
            }
            this.zzZPL = 6;
            return true;
        } catch (zzZQS e) {
            zzZ(e);
            return false;
        }
    }

    @Override // com.aspose.words.internal.zzZL2
    public final String zzfm() {
        if (this.zzZPL != 1) {
            return "";
        }
        try {
            long jZzXMT = this.zzZPO.zzXMT();
            this.zzZPO.zzXMZ();
            this.zzZPL = this.zzZPO.getEventType();
            long jZzXMU = this.zzZPO.zzXMU();
            if (jZzXMT <= jZzXMU) {
                zzZOP zzzop = this.zzN5;
                if (zzzop != null) {
                    long position = zzzop.getPosition();
                    this.zzN5.zzH(jZzXMT);
                    int i = (int) (jZzXMU - jZzXMT);
                    byte[] bArr = new byte[i];
                    this.zzN5.read(bArr, 0, i);
                    String strZzZn = zzQZ().zzZn(bArr);
                    this.zzN5.zzH(position);
                    return strZzZn;
                }
                String str = this.zzZPH;
                if (str != null) {
                    return str.substring((int) jZzXMT, (int) jZzXMU);
                }
            }
            return "";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean zzi() {
        int i = this.zzZPG;
        if (i < 0) {
            return zzfk();
        }
        if (this.zzZPD) {
            if (i + 1 >= this.zzZPF) {
                return false;
            }
        } else if (i + 1 >= this.zzZPE + this.zzZPF) {
            return false;
        }
        this.zzZPG = i + 1;
        return true;
    }

    @Override // com.aspose.words.internal.zzZL2
    public final boolean zzj() {
        if (this.zzZPG < 0) {
            return false;
        }
        zzfg();
        return true;
    }

    public zzZL1(zzZOP zzzop, zzZQT zzzqt) {
        this(zzzop, zzzqt, null, false, false);
    }

    public zzZL1(Object obj, boolean z) {
        this(obj, null, null, z, false);
    }

    public zzZL1(Object obj, Map<String, String> map) {
        this(obj, null, map, true, map == null);
    }

    private zzZL1(Object obj, zzZQT zzzqt, Map<String, String> map, boolean z, boolean z2) {
        zzZEW zzzewZzXMS;
        if (obj != null) {
            if (obj instanceof zzZOP) {
                this.zzN5 = (zzZOP) obj;
            } else if (obj instanceof String) {
                this.zzZPH = (String) obj;
            } else {
                throw new IllegalStateException("Can only create an XML reader for a stream or a string.");
            }
            this.zzZPD = z2;
            this.zzZPC = z && zzzqt == null;
            try {
                zzZEO zzzeoZzZ = zzZHG.zzZ(z2, z, zzzqt);
                if (this.zzN5 != null) {
                    this.zzZPO = (zzZEP) zzzeoZzZ.zzZ(new zzZK7(this.zzN5));
                } else {
                    this.zzZPO = (zzZEP) zzzeoZzZ.zzZ(new StringReader(this.zzZPH));
                }
                if (map != null && (zzzewZzXMS = this.zzZPO.zzXMS()) != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        zzzewZzXMS.zzXK(entry.getKey().intern().length() == 0 ? " " : entry.getKey().intern(), entry.getValue());
                    }
                }
                zzfg();
                return;
            } catch (zzZQS e) {
                zzZ(e);
                return;
            }
        }
        throw new NullPointerException("input");
    }
}
