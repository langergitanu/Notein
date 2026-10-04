package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZML extends zzZLW {
    private List<zzZLZ> zzZSW = new ArrayList();
    private Object zzZSX;
    private boolean zzZSY;
    private boolean zzZSZ;
    private boolean zzZT0;
    private zzZML zzZT1;
    private int zzZT2;
    private zzZML zzZT3;
    private boolean zzZT4;
    private zzZLH zzZT5;
    private zzZN4 zzZT6;
    private zzZLY zzZT7;
    zzZN3 zzZUG;
    private int zzZUa;
    private String zzZUo;
    private String zzZUp;
    private zzZN4 zzZUs;
    private zzZN4 zzZUt;
    private int zzZUu;
    private String zzZUv;
    private String zzZUw;

    public zzZML() {
        zzQu(256);
        zzQv(256);
        this.zzZT7 = new zzZLY();
        zzZN4 zzzn4 = zzZN4.zzZV6;
        this.zzZUt = zzzn4;
        this.zzZUs = zzzn4;
        this.zzZT6 = zzzn4;
        zzgu();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzZML zzJ(zzZQR zzzqr) {
        zzZML zzzml = new zzZML();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("abstract".equals(strZzRu)) {
                    zzzml.zzZ1(Boolean.parseBoolean(attributeValue));
                } else if ("block".equals(strZzRu)) {
                    zzzml.zzQu(zzZLF.zzUo(strZzRu));
                } else if ("default".equals(strZzRu)) {
                    zzzml.zzZUw = attributeValue;
                } else if ("final".equals(strZzRu)) {
                    zzzml.zzQv(zzZLF.zzUo(strZzRu));
                } else if ("fixed".equals(strZzRu)) {
                    zzzml.zzZUv = attributeValue;
                } else if ("form".equals(strZzRu)) {
                    zzzml.zzZUu = zzZLF.zzUn(attributeValue);
                } else if ("id".equals(strZzRu)) {
                    zzzml.setId(attributeValue);
                } else if ("maxOccurs".equals(strZzRu)) {
                    zzzml.zzUr(attributeValue);
                } else if ("minOccurs".equals(strZzRu)) {
                    zzzml.zzUs(attributeValue);
                } else if ("name".equals(strZzRu)) {
                    zzzml.setName(attributeValue);
                } else if ("nillable".equals(strZzRu)) {
                    zzzml.zzZSY = Boolean.parseBoolean(attributeValue);
                } else if ("ref".equals(strZzRu)) {
                    zzzml.zzZUt = zzZLF.zzZ(zzzqr, i);
                } else if ("substitutionGroup".equals(strZzRu)) {
                    zzzml.zzZT6 = zzZLF.zzZ(zzzqr, i);
                } else if (C18437z2.f56754h.equals(strZzRu)) {
                    zzzml.zzZUs = zzZLF.zzZ(zzzqr, i);
                } else {
                    zzzml.zzZL(strZzRu, attributeValue);
                }
            } catch (Exception e) {
                zzZHV.zzY(e);
            }
        }
        char c = 1;
        while (zzzqr.hasNext()) {
            zzzqr.next();
            int eventType = zzzqr.getEventType();
            if (eventType != 1) {
                if (eventType == 2) {
                    break;
                }
            } else if (c <= 1 && "annotation".equals(zzzqr.getLocalName())) {
                zzzml.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            } else if (c <= 2) {
                if ("simpleType".equals(zzzqr.getLocalName())) {
                    zzzml.zzY(zzZLN.zzm(zzzqr));
                } else if ("complexType".equals(zzzqr.getLocalName())) {
                    zzzml.zzY(zzZMQ.zzL(zzzqr));
                }
                c = 3;
            } else {
                if (c > 3) {
                    break;
                }
                if ("unique".equals(zzzqr.getLocalName())) {
                    zzzml.zzZT7.zzW(zzZLG.zzh(zzzqr));
                } else if (!"key".equals(zzzqr.getLocalName())) {
                    if (!"keyref".equals(zzzqr.getLocalName())) {
                        break;
                    }
                    zzzml.zzZT7.zzW(zzZM8.zzB(zzzqr));
                } else {
                    zzzml.zzZT7.zzW(zzZM9.zzC(zzzqr));
                }
                c = 3;
            }
        }
        return zzzml;
    }

    private Object zzgp() {
        zzZML zzzml = this;
        while (true) {
            zzZML zzzml2 = zzzml.zzZT1;
            if (zzzml2 == null) {
                return zzzml.zzZSX;
            }
            zzzml = zzzml2;
        }
    }

    private void zzgq() {
        Object obj = this.zzZSX;
        zzZMN zzzmnZzfN = obj instanceof zzZMN ? (zzZMN) obj : null;
        zzZLN zzzln = obj instanceof zzZLN ? (zzZLN) obj : null;
        if (zzzln != null) {
            zzzmnZzfN = zzzln.zzZQM;
        }
        if (zzzmnZzfN == null) {
            zzZMQ zzzmq = obj instanceof zzZMQ ? (zzZMQ) obj : null;
            if (zzzmq != null) {
                zzzmq.getContentType();
            }
            zzzmnZzfN = zzZLN.zzfN();
        }
        zzzmnZzfN.zzht();
        try {
            String str = this.zzZUw;
            if (str != null) {
                String strZzUv = zzzmnZzfN.zzUv(str);
                this.zzZUp = strZzUv;
                zzZMN.zzUu(strZzUv);
            }
        } catch (Exception e) {
            new StringBuilder("The Element's default value is invalid with respect to its type definition.").append(e);
        }
        try {
            String str2 = this.zzZUv;
            if (str2 != null) {
                String strZzUv2 = zzzmnZzfN.zzUv(str2);
                this.zzZUo = strZzUv2;
                zzZMN.zzUu(strZzUv2);
            }
        } catch (Exception unused) {
        }
    }

    private void zzgu() {
        this.zzZSE = zzZN4.zzZV6;
        this.zzZUG = null;
        this.zzZUa = 256;
        this.zzZT2 = 256;
        this.zzZT1 = null;
        this.zzZSW.clear();
        this.zzZT3 = null;
        this.zzZT0 = false;
        this.zzZSZ = false;
        this.zzZUp = null;
        this.zzZUo = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0169 A[LOOP:0: B:84:0x0163->B:86:0x0169, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    @Override // com.aspose.words.internal.zzZLZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzY(zzZN3 zzzn3) throws Exception {
        zzZMN zzzmnZzU;
        zzZLH zzzlh;
        zzZN4 zzzn4;
        Iterator<zzZLZ> it;
        Object obj;
        zzZML zzzml;
        zzZML zzzml2;
        if (zzS(zzzn3.zzg5())) {
            return this.zzZSG;
        }
        this.zzZSZ = this.zzZSY;
        this.zzZT0 = this.zzZSC;
        zzZN4 zzzn42 = this.zzZT6;
        zzZN4 zzzn43 = zzZN4.zzZV6;
        if (zzzn42 != zzzn43 && (zzzml2 = this.zzZT3) != null) {
            zzzml2.zzY(zzzn3);
        }
        if (zzgd() != null) {
            this.zzZSX = zzgd();
        } else {
            zzZN4 zzzn44 = this.zzZUs;
            if (zzzn44 != zzzn43) {
                zzZLH zzzlhZzY = zzzn3.zzY(zzzn44);
                if (zzzlhZzY != null) {
                    zzzlhZzY.zzY(zzzn3);
                    this.zzZSX = zzzlhZzY;
                } else {
                    zzZN4 zzzn45 = this.zzZUs;
                    if (zzzn45 == zzZMQ.zzZU2) {
                        this.zzZSX = zzZMQ.zzgz();
                    } else {
                        if (zzZLF.zzP(zzzn45)) {
                            zzzmnZzU = zzZMN.zzU(this.zzZUs);
                            if (zzzmnZzU != null) {
                                this.zzZSX = zzzmnZzU;
                            }
                            if (this.zzZT1 == null) {
                                if (this.zzZSX == null && (zzzml = this.zzZT3) != null) {
                                    this.zzZSX = zzzml.zzgp();
                                }
                                if (this.zzZSX == null) {
                                    this.zzZSX = zzZMQ.zzgz();
                                }
                            }
                            Object obj2 = this.zzZSX;
                            zzzlh = !(obj2 instanceof zzZLH) ? (zzZLH) obj2 : null;
                            if (zzzlh != null) {
                                this.zzZSG = zzzlh.zzY(zzzn3) + this.zzZSG;
                                zzzmnZzU = zzzlh.zzZQM;
                            }
                            zzzn4 = this.zzZT6;
                            if (zzzn4 != zzzn43) {
                                zzZML zzzmlZzZ = zzzn3.zzZ(zzzn4);
                                if (zzzmlZzZ != null) {
                                    if (((zzZLH) zzzmlZzZ.zzgp()) != null) {
                                        int i = zzzmlZzZ.zzZT2;
                                        if (zzzlh != null && (i & zzzlh.zzfH()) != 0) {
                                            StringBuilder sb = new StringBuilder("Invalid derivation was found. Substituted element prohibits this derivation method: ");
                                            sb.append(zzzlh.zzfH());
                                            sb.append(".");
                                        }
                                    }
                                    zzZMQ zzzmq = (zzZMQ) zzzlh;
                                    if (zzzmq != null) {
                                        zzzmq.zzZ(zzzmlZzZ.zzgp(), zzzn3);
                                    } else {
                                        zzZLN zzzln = (zzZLN) zzzlh;
                                        if (zzzln != null) {
                                            zzzln.zzZ(zzzmlZzZ.zzgp(), zzzn3, true);
                                        }
                                    }
                                } else if (!zzzn3.zzUy(this.zzZT6.getNamespace())) {
                                    StringBuilder sb2 = new StringBuilder("Referenced element type ");
                                    sb2.append(this.zzZT6);
                                    sb2.append(" was not found in the corresponding schema.");
                                }
                            }
                            if (this.zzZUw == null || this.zzZUv != null) {
                                zzgq();
                                if (zzzmnZzU != null) {
                                    zzzmnZzU.zzht();
                                }
                            }
                            it = this.zzZT7.iterator();
                            while (it.hasNext()) {
                                ((zzZMC) it.next()).zzY(zzzn3);
                            }
                            obj = this.zzZSX;
                            if (obj != null) {
                                this.zzZT5 = obj instanceof zzZLH ? (zzZLH) obj : null;
                                if (obj == zzZLN.zzfN()) {
                                    this.zzZT5 = zzZLN.zzZRZ;
                                }
                                if (this.zzZT5 == null) {
                                    this.zzZT5 = zzZLH.zzQ(this.zzZUs);
                                }
                            }
                            this.zzZSD = zzzn3.zzZSD;
                            return this.zzZSG;
                        }
                        if (!zzzn3.zzUy(this.zzZUs.getNamespace())) {
                            StringBuilder sb3 = new StringBuilder("Referenced element schema type ");
                            sb3.append(this.zzZUs.getName());
                            sb3.append(" was not found in the corresponding schema.");
                        }
                    }
                }
            } else {
                zzZN4 zzzn46 = this.zzZUt;
                if (zzzn46 != zzzn43) {
                    zzZML zzzmlZzZ2 = zzzn3.zzZ(zzzn46);
                    if (zzzmlZzZ2 != null) {
                        this.zzZT1 = zzzmlZzZ2;
                        this.zzZSG = zzzmlZzZ2.zzY(zzzn3) + this.zzZSG;
                    } else if (!zzzn3.zzUy(this.zzZUt.getNamespace())) {
                        StringBuilder sb4 = new StringBuilder("Referenced element ");
                        sb4.append(this.zzZUt);
                        sb4.append(" was not found in the corresponding schema.");
                    }
                }
            }
        }
        zzzmnZzU = null;
        if (this.zzZT1 == null) {
        }
        Object obj22 = this.zzZSX;
        if (!(obj22 instanceof zzZLH)) {
        }
        if (zzzlh != null) {
        }
        zzzn4 = this.zzZT6;
        if (zzzn4 != zzzn43) {
        }
        if (this.zzZUw == null) {
            zzgq();
            if (zzzmnZzU != null) {
            }
        }
        it = this.zzZT7.iterator();
        while (it.hasNext()) {
        }
        obj = this.zzZSX;
        if (obj != null) {
        }
        this.zzZSD = zzzn3.zzZSD;
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        zzZN4 zzzn4;
        zzZN4 zzzn42;
        if (this.zzZUG != null && zzg5() == this.zzZUG.zzg5()) {
            return 0;
        }
        zzgu();
        this.zzZUG = zzzn3;
        if (this.zzZT4 || zzg7()) {
            zzZN4 zzzn43 = this.zzZUt;
            if (zzzn43 != null) {
                zzzn43.isEmpty();
            }
            if (getName() != null && zzZNA.zzUJ(getName())) {
                this.zzZSE = new zzZN4(getName(), "");
            }
            if (zzga() == 255) {
                this.zzZT2 = 6;
            } else if (zzga() == 256) {
                this.zzZT2 = 0;
            } else {
                zzga();
                this.zzZT2 = zzga() & 6;
            }
            if (zzgd() != null && (zzzn4 = this.zzZUs) != null) {
                zzzn4.isEmpty();
            }
            if (zzgd() != null) {
                if (zzgd() instanceof zzZLN) {
                    this.zzZSG = ((zzZLN) zzgd()).zzZ(this.zzZUG) + this.zzZSG;
                } else if (zzgd() instanceof zzZMQ) {
                    this.zzZSG = ((zzZMQ) zzgd()).zzZ(this.zzZUG) + this.zzZSG;
                }
            }
            zzZN4 zzzn44 = this.zzZUs;
            if (zzzn44 != null) {
                zzzn44.isEmpty();
            }
            zzZN4 zzzn45 = this.zzZT6;
            if (zzzn45 != null) {
                zzzn45.isEmpty();
            }
            for (zzZLZ zzzlz : this.zzZT7) {
                if (zzzlz instanceof zzZLG) {
                    this.zzZSG = ((zzZLG) zzzlz).zzZ(this.zzZUG) + this.zzZSG;
                } else if (zzzlz instanceof zzZM9) {
                    this.zzZSG = ((zzZM9) zzzlz).zzZ(this.zzZUG) + this.zzZSG;
                } else if (zzzlz instanceof zzZM8) {
                    this.zzZSG = ((zzZM8) zzzlz).zzZ(this.zzZUG) + this.zzZSG;
                }
            }
        } else {
            zzZN4 zzzn46 = this.zzZT6;
            if (zzzn46 != null) {
                zzzn46.isEmpty();
            }
            zzga();
            zzg1();
            zzZN4 zzzn47 = this.zzZUt;
            if (zzzn47 == null || zzzn47.isEmpty()) {
                if (getName() != null && zzZNA.zzUJ(getName())) {
                    this.zzZSE = new zzZN4(getName(), "");
                }
                if (zzgd() != null && (zzzn42 = this.zzZUs) != null) {
                    zzzn42.isEmpty();
                }
                if (zzgd() != null) {
                    if (zzgd() instanceof zzZLN) {
                        this.zzZSG = ((zzZLN) zzgd()).zzZ(this.zzZUG) + this.zzZSG;
                    } else if (zzgd() instanceof zzZMQ) {
                        this.zzZSG = ((zzZMQ) zzgd()).zzZ(this.zzZUG) + this.zzZSG;
                    }
                }
                zzZN4 zzzn48 = this.zzZUs;
                if (zzzn48 != null) {
                    zzzn48.isEmpty();
                }
                zzZN4 zzzn49 = this.zzZT6;
                if (zzzn49 != null) {
                    zzzn49.isEmpty();
                }
                for (zzZLZ zzzlz2 : this.zzZT7) {
                    if (zzzlz2 instanceof zzZLG) {
                        this.zzZSG = ((zzZLG) zzzlz2).zzZ(this.zzZUG) + this.zzZSG;
                    } else if (zzzlz2 instanceof zzZM9) {
                        this.zzZSG = ((zzZM9) zzzlz2).zzZ(this.zzZUG) + this.zzZSG;
                    } else if (zzzlz2 instanceof zzZM8) {
                        this.zzZSG = ((zzZM8) zzzlz2).zzZ(this.zzZUG) + this.zzZSG;
                    }
                }
            } else {
                getName();
                this.zzZT7.getCount();
                zzg9();
                zzZN4 zzzn410 = this.zzZUs;
                if (zzzn410 != null) {
                    zzzn410.isEmpty();
                }
                zzgd();
                this.zzZSE = this.zzZUt;
            }
        }
        int iZzg9 = zzg9();
        if (iZzg9 == 255) {
            this.zzZUa = 255;
        } else if (iZzg9 != 256) {
            zzg9();
            this.zzZUa = zzg9();
        } else {
            this.zzZUa = 0;
        }
        zzZLY zzzly = this.zzZT7;
        if (zzzly != null && zzzly.getCount() > 0) {
            zzZLX zzzlx = new zzZLX();
            for (zzZLZ zzzlz3 : this.zzZT7) {
                zzZLF.zzZ(zzzlx, zzzlz3, zzzlz3.zzgQ());
            }
        }
        zzZLF.zzZ(getId(), this, this.zzZUG.zzh0());
        zzT(this.zzZUG.zzg5());
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLW
    public final zzZLW zzZ3(boolean z) throws Exception {
        zzZLW zzzlw = this.zzZSd;
        if (zzzlw != null) {
            return zzzlw;
        }
        zzZN4 zzzn4 = this.zzZUt;
        if (zzzn4 != null && !zzzn4.getName().equals(zzZN4.zzZV6.getName())) {
            this.zzZT1 = this.zzZUG.zzZ(this.zzZUt);
        }
        if (this.zzZSh.intValue() == 0) {
            this.zzZSd = zzZLW.zzZSj;
        } else {
            List<zzZLZ> list = this.zzZSW;
            if (list == null || list.size() <= 0) {
                this.zzZSd = zzfY();
            } else {
                zzZMU zzzmu = new zzZMU();
                zzzmu.zzQ(this.zzZSn);
                zzzmu.zzP(this.zzZSm);
                zzzmu.zzZ(this.zzZUG);
                zzZML zzzml = (zzZML) clone();
                zzzml.zzQ(1);
                zzzml.zzP(1);
                zzzml.zzZT3 = null;
                zzzml.zzZSW = null;
                for (int i = 0; i < this.zzZSW.size(); i++) {
                    zzZML zzzml2 = (zzZML) this.zzZSW.get(i);
                    zzZ(zzzmu.zzgc(), zzzml2);
                    zzZ(zzzmu.zzgi(), zzzml2);
                }
                if (!zzzmu.zzgc().zzV(zzzml)) {
                    zzzmu.zzgc().zzW(zzzml);
                    zzzmu.zzgi().zzW(zzzml);
                }
                this.zzZSd = zzzmu;
            }
        }
        return this.zzZSd;
    }

    public final String zzgM() {
        return this.zzZUw;
    }

    public final zzZN4 zzgO() {
        return this.zzZUt;
    }

    public final zzZLH zzgo() {
        zzZML zzzml = this;
        while (true) {
            zzZML zzzml2 = zzzml.zzZT1;
            if (zzzml2 == null) {
                return zzzml.zzZT5;
            }
            zzzml = zzzml2;
        }
    }

    public final void zzgr() {
        this.zzZT4 = true;
    }

    public final void zzgs() {
        if (this.zzZT3 == null && !this.zzZT6.getName().equals(zzZN4.zzZV6.getName())) {
            zzZML zzzmlZzZ = this.zzZUG.zzZ(this.zzZT6);
            this.zzZT3 = zzzmlZzZ;
            if (zzzmlZzZ != null) {
                zzzmlZzZ.zzZSW.add(this);
            }
        }
    }

    public final zzZLY zzgt() {
        return this.zzZT7;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        if (zzgd() != null) {
            zzgd().zzZ(this);
        }
        Iterator<zzZLZ> it = this.zzZT7.iterator();
        while (it.hasNext()) {
            it.next().zzZ(this);
        }
    }

    @Override // com.aspose.words.internal.zzZLW
    public final void zzZ(zzZLX zzzlx, zzZN3 zzzn3) {
        zzZLZ zzzlzZzS = zzzlx.zzS(zzgQ());
        zzZML zzzml = !(zzzlzZzS instanceof zzZML) ? (zzZML) zzzlzZzS : null;
        if (zzzml == null) {
            zzzlx.zzZ(zzgQ(), this);
        } else if (zzzml.zzgp() != zzgp()) {
            new StringBuilder("Different types are specified on the same named elements in the same sequence. Element name is ").append(zzgQ());
        }
    }

    @Override // com.aspose.words.internal.zzZLW
    public final boolean zzZ(zzZLW zzzlw) {
        zzZML zzzml = zzzlw instanceof zzZML ? (zzZML) zzzlw : null;
        if (zzzml != null && this.zzZSh.equals(zzzml.zzZSh) && this.zzZSi.equals(zzzml.zzZSi) && zzgQ().equals(zzzml.zzgQ()) && zzgp().equals(zzzml.zzgp()) && this.zzZT7.getCount() == zzzml.zzZT7.getCount()) {
            for (int i = 0; i < this.zzZT7.getCount(); i++) {
                zzZMC zzzmc = this.zzZT7.zzQt(i) instanceof zzZMC ? (zzZMC) this.zzZT7.zzQt(i) : null;
                zzZMC zzzmc2 = zzzml.zzZT7.zzQt(i) instanceof zzZMC ? (zzZMC) zzzml.zzZT7.zzQt(i) : null;
                if (!zzzmc.zzgQ().equals(zzzmc2.zzgQ()) || !zzzmc.zzgf().getXPath().equals(zzzmc2.zzgf().getXPath()) || zzzmc.zzgg().getCount() != zzzmc2.zzgg().getCount()) {
                    return false;
                }
                for (int i2 = 0; i2 < zzzmc.zzgg().getCount(); i2++) {
                    if (!(zzzmc.zzgg().zzQt(i2) instanceof zzZLD ? (zzZLD) zzzmc.zzgg().zzQt(i2) : null).getXPath().equals((zzzmc2.zzgg().zzQt(i2) instanceof zzZLD ? (zzZLD) zzzmc.zzgg().zzQt(i2) : null).getXPath())) {
                        return false;
                    }
                }
            }
            if (this.zzZUa == zzzml.zzZUa && this.zzZT2 == zzzml.zzZT2 && zzZKN.equals(this.zzZUp, zzzml.zzZUp) && zzZKN.equals(this.zzZUo, zzzml.zzZUo)) {
                return true;
            }
        }
        return false;
    }

    private void zzZ(zzZLY zzzly, zzZML zzzml) {
        if (zzzml.zzZSW != null) {
            for (int i = 0; i < zzzml.zzZSW.size(); i++) {
                zzZ(zzzly, (zzZML) zzzml.zzZSW.get(i));
            }
        }
        if (zzzly.zzV(zzzml)) {
            return;
        }
        zzzly.zzW(zzzml);
    }
}
