package com.aspose.words.internal;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZN3 extends zzZLZ {
    private String version;
    private zzZLY zzZUJ;
    private zzZLR zzZUK;
    private boolean zzZUL;
    private Map<String, String> zzZUM;
    private zzZLX zzZUN;
    private zzZLX zzZUO;
    private zzZLX zzZUR;
    private zzZLX zzZUS;
    private zzZLX zzZUT;
    private zzZLX zzZUU;
    private zzZLX zzZUV;
    private boolean zzZUW;
    private String zzZV0;
    private zzZLY zzZV2;
    private String zzZVL;
    private Map<String, zzZLZ> zzZUQ = new HashMap();
    private zzZLX zzZUP = new zzZLX();
    private int zzZV1 = 0;
    private int zzZUX = 256;
    private int zzZUY = 0;
    private int zzZUZ = 256;
    private boolean zzZV3 = false;

    public zzZN3() {
        this.zzZV2 = new zzZLY();
        this.zzZUV = new zzZLX();
        this.zzZUU = new zzZLX();
        this.zzZUT = new zzZLX();
        this.zzZUS = new zzZLX();
        this.zzZUR = new zzZLX();
        this.zzZUO = new zzZLX();
        this.zzZUN = new zzZLX();
        this.zzZUM = new HashMap();
        this.zzZUJ = new zzZLY();
        this.zzZV2 = new zzZLY();
        this.zzZUS = new zzZLX();
        this.zzZUU = new zzZLX();
        this.zzZUV = new zzZLX();
        this.zzZUR = new zzZLX();
        this.zzZUO = new zzZLX();
        this.zzZUT = new zzZLX();
        this.zzZUN = new zzZLX();
        this.zzZUM = new HashMap();
        this.zzZUJ = new zzZLY();
    }

    public static zzZN3 zzY(zzZQR zzzqr) throws zzZMJ, zzZQS {
        boolean zZzU3 = false;
        int i = 0;
        do {
            int eventType = zzzqr.getEventType();
            if (eventType == 1) {
                if (zZzU3) {
                    i++;
                }
                if ("schema".equals(zzzqr.getLocalName())) {
                    zzZN3 zzzn3 = new zzZN3();
                    zzY(zzzn3, zzzqr);
                    zzZ(zzzn3, zzzqr);
                    return zzzn3;
                }
            } else if (eventType == 2) {
                i--;
            } else if (eventType == 4) {
                zZzU3 = zzZKN.zzU3(zzzqr.getText().trim());
            }
            if (zzzqr.hasNext()) {
                zzzqr.next();
            }
        } while (i > 0);
        throw new zzZMJ("The top level schema must have namespace http://www.w3.org/2001/XMLSchema");
    }

    private static void zzZ(zzZN3 zzzn3, zzZQR zzzqr) throws zzZQS {
        if (!"schema".equals(zzzqr.getLocalName()) && !"http://www.w3.org/2001/XMLSchema".equals(zzzqr.getNamespaceURI()) && zzzqr.getEventType() != 1) {
            StringBuilder sb = new StringBuilder("UNREACHABLE CODE REACHED: Method: Schema.ReadContent, ");
            sb.append(zzzqr.getLocalName());
            sb.append(", ");
            sb.append(zzzqr.getNamespaceURI());
        }
        char c = 1;
        while (zzzqr.hasNext()) {
            int next = zzzqr.next();
            if (next == 1) {
                if (c <= 1) {
                    if ("include".equals(zzzqr.getLocalName())) {
                        zzzn3.zzZV2.zzW(zzZMA.zzD(zzzqr));
                    } else if ("import".equals(zzzqr.getLocalName())) {
                        zzzn3.zzZV2.zzW(zzZMB.zzE(zzzqr));
                    } else if ("redefine".equals(zzzqr.getLocalName())) {
                        zzzn3.zzZV2.zzW(zzZLU.zzr(zzzqr));
                    } else if ("annotation".equals(zzzqr.getLocalName())) {
                        zzzn3.zzgc().zzW(zzZN1.zzW(zzzqr));
                    }
                }
                if (c > 2) {
                    return;
                }
                if ("simpleType".equals(zzzqr.getLocalName())) {
                    zzzn3.zzgc().zzW(zzZLN.zzm(zzzqr));
                } else if ("complexType".equals(zzzqr.getLocalName())) {
                    zzzn3.zzgc().zzW(zzZMQ.zzL(zzzqr));
                } else if ("group".equals(zzzqr.getLocalName())) {
                    zzzn3.zzgc().zzW(zzZMF.zzG(zzzqr));
                } else if ("attributeGroup".equals(zzzqr.getLocalName())) {
                    zzzn3.zzgc().zzW(zzZMW.zzR(zzzqr));
                } else if ("element".equals(zzzqr.getLocalName())) {
                    zzzn3.zzgc().zzW(zzZML.zzJ(zzzqr));
                } else if ("attribute".equals(zzzqr.getLocalName())) {
                    zzzn3.zzgc().zzW(zzZMX.zzS(zzzqr));
                } else if ("notation".equals(zzzqr.getLocalName())) {
                    zzzn3.zzgc().zzW(zzZM0.zzt(zzzqr));
                } else {
                    if (!"annotation".equals(zzzqr.getLocalName())) {
                        return;
                    }
                    zzzn3.zzgc().zzW(zzZN1.zzW(zzzqr));
                }
                c = 2;
            } else if (next == 2) {
                return;
            }
        }
    }

    private void zzh7() {
        for (int i = 0; i < zzgc().getCount(); i++) {
            zzgc().zzQt(i).zzZ((zzZLZ) this);
        }
        for (int i2 = 0; i2 < this.zzZV2.getCount(); i2++) {
            this.zzZV2.zzQt(i2).zzZ((zzZLZ) this);
        }
    }

    public final void zzUx(String str) {
        this.zzZVL = str;
    }

    public final boolean zzUy(String str) {
        return !this.zzZUK.contains(str);
    }

    public final zzZMW zzW(zzZN4 zzzn4) {
        zzZMW zzzmw;
        Iterator<zzZN3> it = this.zzZUK.zzfR().iterator();
        do {
            zzzmw = null;
            if (!it.hasNext()) {
                break;
            }
            zzZLZ zzzlzZzS = it.next().zzZUS.zzS(zzzn4);
            if (zzzlzZzS instanceof zzZMW) {
                zzzmw = (zzZMW) zzzlzZzS;
            }
        } while (zzzmw == null);
        return zzzmw;
    }

    public final zzZMX zzX(zzZN4 zzzn4) {
        Iterator<zzZN3> it = this.zzZUK.zzfR().iterator();
        while (it.hasNext()) {
            zzZMX zzzmx = (zzZMX) it.next().zzZUU.zzS(zzzn4);
            if (zzzmx != null) {
                return zzzmx;
            }
        }
        return null;
    }

    public final boolean zzgU() {
        return this.zzZUL;
    }

    public final int zzgV() {
        return this.zzZV1;
    }

    public final int zzgW() {
        return this.zzZUZ;
    }

    public final int zzgX() {
        return this.zzZUX;
    }

    public final String zzgY() {
        return this.zzZV0;
    }

    public final zzZLX zzgZ() {
        return this.zzZUP;
    }

    public final Map<String, zzZLZ> zzh0() {
        return this.zzZUQ;
    }

    public final zzZLX zzh1() {
        return this.zzZUR;
    }

    public final zzZLX zzh2() {
        return this.zzZUS;
    }

    public final zzZLX zzh3() {
        return this.zzZUT;
    }

    public final zzZLX zzh4() {
        return this.zzZUU;
    }

    public final zzZLX zzh5() {
        return this.zzZUV;
    }

    public final boolean zzh6() {
        return this.zzZUW;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zztF() throws Exception {
        this.zzZSD = zzg5();
        for (zzZLZ zzzlz : this.zzZUU.values()) {
            this.zzZSG = ((zzZMX) zzzlz).zzY(this) + this.zzZSG;
        }
        for (zzZLZ zzzlz2 : this.zzZUS.values()) {
            this.zzZSG = ((zzZMW) zzzlz2).zzY(this) + this.zzZSG;
        }
        for (zzZLZ zzzlz3 : this.zzZUT.values()) {
            this.zzZSG = ((zzZLH) zzzlz3).zzY(this) + this.zzZSG;
        }
        for (zzZLZ zzzlz4 : this.zzZUV.values()) {
            this.zzZSG = ((zzZML) zzzlz4).zzY(this) + this.zzZSG;
        }
        for (zzZLZ zzzlz5 : this.zzZUR.values()) {
            this.zzZSG = ((zzZMF) zzzlz5).zzY(this) + this.zzZSG;
        }
        for (zzZLZ zzzlz6 : this.zzZUO.values()) {
            this.zzZSG = ((zzZM0) zzzlz6).zzY(this) + this.zzZSG;
        }
        if (this.zzZSG == 0) {
            this.zzZV3 = true;
        }
        this.zzZSG = 0;
    }

    private static void zzY(zzZN3 zzzn3, zzZQR zzzqr) {
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            String localPart = zzzqr.zzRv(i).getLocalPart();
            String attributeValue = zzzqr.getAttributeValue(i);
            if ("attributeFormDefault".equals(localPart)) {
                zzzn3.zzZV1 = zzZLF.zzUn(attributeValue);
            } else if ("blockDefault".equals(localPart)) {
                zzzn3.zzZUX = zzZLF.zzUo(attributeValue);
            } else if ("elementFormDefault".equals(localPart)) {
                zzzn3.zzZUY = zzZLF.zzUn(attributeValue);
            } else if ("finalDefault".equals(localPart)) {
                zzzn3.zzZUZ = zzZLF.zzUo(attributeValue);
            } else if ("id".equals(localPart)) {
                zzzn3.setId(attributeValue);
            } else if ("targetNamespace".equals(localPart)) {
                zzzn3.zzZV0 = attributeValue;
            } else if ("version".equals(localPart)) {
                zzzn3.version = attributeValue;
            } else {
                zzZLF.zzZ(zzzqr, zzzn3);
            }
        }
    }

    public final zzZLH zzY(zzZN4 zzzn4) {
        Iterator<zzZN3> it = this.zzZUK.zzfR().iterator();
        while (it.hasNext()) {
            zzZLH zzzlh = (zzZLH) it.next().zzZUT.zzS(zzzn4);
            if (zzzlh != null) {
                return zzzlh;
            }
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        zzZLR zzzlr = new zzZLR();
        zzzlr.zzN(this);
        try {
            zzzlr.zzfX();
            return 0;
        } catch (zzZMJ e) {
            zzZHV.zzY(e);
            return 0;
        }
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLR zzzlr, zzZQT zzzqt, List<zzZND> list) {
        try {
            zzZ(list, zzzlr, zzzqt);
        } catch (zzZMJ e) {
            zzZHV.zzY(e);
        } catch (zzZQS e2) {
            zzZHV.zzY(e2);
        }
    }

    private void zzZ(List<zzZND> list, zzZLR zzzlr, zzZQT zzzqt) throws zzZMJ, zzZQS {
        zzh7();
        zzT(zzzlr.zzg5());
        this.zzZUK = zzzlr;
        if (!zzzlr.zzM(this)) {
            this.zzZUK.zzN(this);
        }
        this.zzZUS.clear();
        this.zzZUU.clear();
        this.zzZUV.clear();
        this.zzZUR.clear();
        this.zzZUO.clear();
        this.zzZUT.clear();
        this.zzZUN.clear();
        this.zzZUM.clear();
        this.zzZUJ.clear();
        for (int i = 0; i < zzgc().getCount(); i++) {
            this.zzZUJ.zzW(zzgc().zzQt(i));
        }
        for (int i2 = 0; i2 < this.zzZV2.getCount(); i2++) {
            zzZ(list, zzzqt, (zzZMI) this.zzZV2.zzQt(i2), zzzlr);
        }
        for (int i3 = 0; i3 < this.zzZUJ.getCount(); i3++) {
            zzZLZ zzzlzZzQt = this.zzZUJ.zzQt(i3);
            if (zzzlzZzQt instanceof zzZN1) {
                this.zzZSG += ((zzZN1) zzzlzZzQt).zzZ(this);
            } else if (zzzlzZzQt instanceof zzZMX) {
                zzZMX zzzmx = (zzZMX) zzzlzZzQt;
                int iZzZ = zzzmx.zzZ(this);
                this.zzZSG += iZzZ;
                if (iZzZ == 0) {
                    zzZLF.zzZ(this.zzZUU, zzzmx, zzzmx.zzgQ());
                }
            } else if (zzzlzZzQt instanceof zzZMW) {
                zzZMW zzzmw = (zzZMW) zzzlzZzQt;
                int iZzZ2 = zzzmw.zzZ(this);
                this.zzZSG += iZzZ2;
                if (iZzZ2 == 0) {
                    zzZLF.zzZ(this.zzZUS, zzzmw, zzzmw.zzgQ());
                }
            } else if (zzzlzZzQt instanceof zzZMQ) {
                zzZMQ zzzmq = (zzZMQ) zzzlzZzQt;
                int iZzZ3 = zzzmq.zzZ(this);
                this.zzZSG += iZzZ3;
                if (iZzZ3 == 0) {
                    zzZLF.zzZ(this.zzZUT, zzzmq, zzzmq.zzgQ());
                }
            } else if (zzzlzZzQt instanceof zzZLN) {
                zzZLN zzzln = (zzZLN) zzzlzZzQt;
                zzzln.zzfO();
                int iZzZ4 = zzzln.zzZ(this);
                this.zzZSG += iZzZ4;
                if (iZzZ4 == 0) {
                    zzZLF.zzZ(this.zzZUT, zzzln, zzzln.zzgQ());
                }
            } else if (zzzlzZzQt instanceof zzZML) {
                zzZML zzzml = (zzZML) zzzlzZzQt;
                zzzml.zzgr();
                int iZzZ5 = zzzml.zzZ(this);
                this.zzZSG += iZzZ5;
                if (iZzZ5 == 0) {
                    zzZLF.zzZ(this.zzZUV, zzzml, zzzml.zzgQ());
                }
            } else if (zzzlzZzQt instanceof zzZMF) {
                zzZMF zzzmf = (zzZMF) zzzlzZzQt;
                int iZzZ6 = zzzmf.zzZ(this);
                this.zzZSG += iZzZ6;
                if (iZzZ6 == 0) {
                    zzZLF.zzZ(this.zzZUR, zzzmf, zzzmf.zzgQ());
                }
            } else if (zzzlzZzQt instanceof zzZM0) {
                zzZM0 zzzm0 = (zzZM0) zzzlzZzQt;
                int iZzZ7 = zzzm0.zzZ(this);
                this.zzZSG += iZzZ7;
                if (iZzZ7 == 0) {
                    zzZLF.zzZ(this.zzZUO, zzzm0, zzzm0.zzgQ());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(List<zzZND> list, zzZQT zzzqt, zzZMI zzzmi, zzZLR zzzlr) throws zzZMJ, zzZQS {
        InputStream inputStream;
        zzZLU zzzlu;
        if (zzzmi == null) {
            return;
        }
        zzZN3 zzzn3 = null;
        zzZQR zzzqrZzZ = null;
        zzZMB zzzmb = zzzmi instanceof zzZMB ? (zzZMB) zzzmi : null;
        if (zzzmi.zzgl() == null && zzzmb == null) {
            return;
        }
        if (zzzmi.zzgl() != null) {
            if (zzzqt != null) {
                String strZzgl = zzzmi.zzgl();
                Iterator<zzZND> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().zzhp().equals(strZzgl)) {
                        return;
                    }
                }
                list.add(new zzZND(strZzgl));
                try {
                    inputStream = (InputStream) zzzqt.zzP(null, strZzgl, this.zzZVL);
                } catch (Exception unused) {
                    new StringBuilder("Could not resolve schema location URI: ").append(strZzgl);
                    inputStream = null;
                }
                zzzlu = !(zzzmi instanceof zzZLU) ? (zzZLU) zzzmi : null;
                if (zzzlu != null) {
                    for (int i = 0; i < zzzlu.zzgc().getCount(); i++) {
                        zzZLZ zzzlzZzQt = zzzlu.zzgc().zzQt(i);
                        zzzlzZzQt.zzZSF = true;
                        zzzlzZzQt.zzg3();
                        if ((zzzlzZzQt instanceof zzZLH) || (zzzlzZzQt instanceof zzZMF) || (zzzlzZzQt instanceof zzZMW)) {
                            this.zzZUJ.zzW(zzzlzZzQt);
                        }
                    }
                }
                if (inputStream != null) {
                    this.zzZUL = true;
                    return;
                }
                try {
                    zzzqrZzZ = zzZQW.zzlk().zzZ(inputStream);
                    if (zzzqrZzZ.hasNext()) {
                        zzzqrZzZ.next();
                    }
                    zzZN3 zzzn3ZzY = zzY(zzzqrZzZ);
                    zzzqrZzZ.close();
                    zzzn3ZzY.zzZUK = this.zzZUK;
                    zzzn3ZzY.zzh7();
                    zzzmi.zzP(zzzn3ZzY);
                    zzzn3 = zzzn3ZzY;
                } finally {
                }
            } else {
                inputStream = null;
                if (!(zzzmi instanceof zzZLU)) {
                }
                if (zzzlu != null) {
                }
                if (inputStream != null) {
                }
            }
        }
        if (zzzmb != null) {
            if (zzzmi.zzgm() == null && zzzmi.zzgl() == null) {
                Iterator<zzZN3> it2 = zzzlr.zzfR().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    zzZN3 next = it2.next();
                    if (next.zzZV0.equals(zzzmb.getNamespace())) {
                        next.zzZUK = this.zzZUK;
                        next.zzh7();
                        zzzmi.zzP(next);
                        zzzn3 = next;
                        break;
                    }
                }
                if (zzzn3 == null) {
                    return;
                }
            } else if (zzzn3 != null && (this.zzZV0.equals(zzzn3.zzZV0) || !zzzn3.zzZV0.equals(zzzmb.getNamespace()))) {
                return;
            }
        } else if (zzzn3 != null) {
            String str = this.zzZV0;
            if (str == null && zzzn3.zzZV0 != null) {
                zzZKN.format("On {0} element, targetNamespace is required to include a schema which has its own target namespace", zzzmi.getClass());
                return;
            } else if (str != null && zzzn3.zzZV0 == null) {
                zzzn3.zzZV0 = str;
            }
        }
        zzZN3 zzzn32 = zzzn3;
        if (zzzn32 != null) {
            zzZ(zzzn32, this.zzZUJ, list, zzzqt, zzzlr);
        }
    }

    public final zzZML zzZ(zzZN4 zzzn4) {
        Iterator<zzZN3> it = this.zzZUK.zzfR().iterator();
        while (it.hasNext()) {
            zzZML zzzml = (zzZML) it.next().zzZUV.zzS(zzzn4);
            if (zzzml != null) {
                return zzzml;
            }
        }
        return null;
    }

    private void zzZ(zzZN3 zzzn3, zzZLY zzzly, List<zzZND> list, zzZQT zzzqt, zzZLR zzzlr) throws zzZMJ, zzZQS {
        Iterator<zzZLZ> it = zzzn3.zzZV2.iterator();
        while (it.hasNext()) {
            zzzn3.zzZ(list, zzzqt, (zzZMI) it.next(), zzzlr);
        }
        Iterator<zzZLZ> it2 = zzzn3.zzZUJ.iterator();
        while (it2.hasNext()) {
            zzzly.zzW(it2.next());
        }
        for (zzZLZ zzzlz : zzzn3.zzgc()) {
            if (!zzzly.zzV(zzzlz)) {
                zzzly.zzW(zzzlz);
                zzgc().zzW(zzzlz);
            }
        }
    }
}
