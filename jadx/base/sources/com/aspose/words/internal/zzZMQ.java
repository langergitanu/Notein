package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMQ extends zzZLH {
    static final zzZN4 zzZU2 = new zzZN4("anyType", "http://www.w3.org/2001/XMLSchema");
    private static zzZMQ zzZU3;
    private zzZOZ zzZU1;
    boolean zzZU4;
    private int zzZU5;
    private zzZLW zzZU6;
    private zzZLW zzZU7;
    private zzZLW zzZU8;
    private zzZMO zzZU9;
    private int zzZUa;
    private zzZMZ zzZUb;
    private boolean zzZUe;
    private zzZLX zzZUi;
    private zzZLY zzZUk = new zzZLY();
    private zzZMZ zzZUl;

    public zzZMQ() {
        zzQu(256);
        this.zzZUi = new zzZLX();
        zzZLW zzzlwZzg2 = zzZLW.zzg2();
        this.zzZU8 = zzzlwZzg2;
        this.zzZU7 = zzzlwZzg2;
    }

    private void zz0(Object obj) {
        zzZLN zzzln = obj instanceof zzZLN ? (zzZLN) obj : null;
        if (zzzln != null) {
            zzzln.zzfI();
        }
        if ((obj instanceof zzZMN ? (zzZMN) obj : null) == null) {
            zzZMN zzzmn = zzzln.zzZQM;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzZMQ zzL(zzZQR zzzqr) {
        zzZMQ zzzmq = new zzZMQ();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("abstract".equals(strZzRu)) {
                    zzzmq.zzZ1(Boolean.parseBoolean(attributeValue));
                } else if ("block".equals(strZzRu)) {
                    zzzmq.zzQu(zzZLF.zzUo(strZzRu));
                } else if ("final".equals(strZzRu)) {
                    zzzmq.zzQv(zzZLF.zzUo(strZzRu));
                } else if ("id".equals(strZzRu)) {
                    zzzmq.setId(attributeValue);
                } else if ("mixed".equals(strZzRu)) {
                    zzzmq.zzZUe = Boolean.parseBoolean(attributeValue);
                } else if ("name".equals(strZzRu)) {
                    zzzmq.setName(attributeValue);
                } else {
                    zzzmq.zzZL(strZzRu, attributeValue);
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
                zzzmq.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            } else if (c <= 2) {
                if ("simpleContent".equals(zzzqr.getLocalName())) {
                    zzzmq.zzZU9 = zzZLQ.zzp(zzzqr);
                } else if ("complexContent".equals(zzzqr.getLocalName())) {
                    zzzmq.zzZU9 = zzZMT.zzO(zzzqr);
                }
                c = 6;
            } else if (c > 3) {
                if (c <= 4) {
                    if ("attribute".equals(zzzqr.getLocalName())) {
                        zzzmq.zzZUk.zzW(zzZMX.zzS(zzzqr));
                    } else if ("attributeGroup".equals(zzzqr.getLocalName())) {
                        zzzmq.zzZUk.zzW(zzZMV.zzQ(zzzqr));
                    }
                    c = 4;
                }
                if (c > 5 || !"anyAttribute".equals(zzzqr.getLocalName())) {
                    break;
                }
                zzzmq.zzZUl = zzZMZ.zzU(zzzqr);
                c = 6;
            } else {
                if ("group".equals(zzzqr.getLocalName())) {
                    zzzmq.zzZU6 = zzZMD.zzF(zzzqr);
                } else if ("all".equals(zzzqr.getLocalName())) {
                    zzzmq.zzZU6 = zzZN2.zzX(zzzqr);
                } else if ("choice".equals(zzzqr.getLocalName())) {
                    zzzmq.zzZU6 = zzZMU.zzP(zzzqr);
                } else if ("sequence".equals(zzzqr.getLocalName())) {
                    zzzmq.zzZU6 = zzZLS.zzq(zzzqr);
                }
                c = 4;
            }
        }
        return zzzmq;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzQ(zzZN3 zzzn3) throws Exception {
        zzZMS zzzms = (zzZMS) this.zzZU9.zzgF();
        zzZLH zzzlh = this.zzZQN;
        zzZMQ zzzmqZzgz = zzzlh instanceof zzZMQ ? (zzZMQ) zzzlh : null;
        if (zzzmqZzgz != null) {
            zzzmqZzgz.zzT(zzzn3);
        }
        if (this.zzZQO == zzZU2) {
            zzzmqZzgz = zzgz();
        }
        if (zzzmqZzgz == null) {
            this.zzZU8 = zzZLW.zzZSj;
            this.zzZU5 = 1;
            return;
        }
        if (zzzms.zzgB() != null) {
            zzZLW zzzlwZzgB = zzzms.zzgB();
            zzZLW zzzlw = zzZLW.zzZSj;
            if (zzzlwZzgB == zzzlw) {
                this.zzZU8 = zzzmqZzgz.zzZU8;
                int i = zzzmqZzgz.zzZU5;
                this.zzZU5 = i;
                if (i == 1) {
                    this.zzZU5 = zzZ(this.zzZU9);
                }
            } else if (zzzmqZzgz.zzZU8 == zzzlw || zzzmqZzgz == zzgz()) {
                this.zzZU8 = zzzms.zzgB();
                this.zzZU5 = zzZ(this.zzZU9);
            } else {
                zzZLS zzzls = new zzZLS();
                zzzls.zzgc().zzW(zzzmqZzgz.zzZU8);
                zzzls.zzgc().zzW(zzzms.zzgB());
                zzzls.zzZ(zzzn3);
                zzzls.zzY(zzzn3);
                this.zzZU8 = zzzls;
                this.zzZU5 = zzZ(this.zzZU9);
            }
        }
        if (this.zzZU8 == null) {
            this.zzZU8 = zzZLW.zzZSj;
        }
    }

    private void zzR(zzZN3 zzzn3) throws Exception {
        if (this.zzZU9.zzgF() == null) {
            this.zzZU8 = zzZLW.zzZSj;
            this.zzZU5 = 1;
            return;
        }
        if (this.zzZU9.zzgF() instanceof zzZMS) {
            zzQ(zzzn3);
        }
        if (this.zzZU9.zzgF() instanceof zzZMR) {
            zzgx();
        }
    }

    private void zzS(zzZN3 zzzn3) throws Exception {
        if (this.zzZU1 == zzzn3.zzg5()) {
            return;
        }
        this.zzZU1 = zzzn3.zzg5();
        zzZLH zzzlh = this.zzZQN;
        zzZMQ zzzmq = zzzlh instanceof zzZMQ ? (zzZMQ) zzzlh : null;
        if (zzzmq != null) {
            zzzmq.zzS(zzzn3);
        }
        if (this.zzZU9 != null) {
            zzR(zzzn3);
        } else {
            zzgy();
        }
        try {
            this.zzZU7 = this.zzZU8.zzZ3(true);
        } catch (Exception e) {
            zzZHV.zzY(e);
        }
        if (this.zzZU7 == zzZLW.zzZSj && this.zzZU5 == 2) {
            this.zzZU5 = 1;
        }
    }

    private void zzT(zzZN3 zzzn3) {
        zzZLH zzzlh;
        if (this.zzZU1 == zzzn3.zzg5()) {
            return;
        }
        zzZMO zzzmo = this.zzZU9;
        if (zzzmo != null) {
            zzZN4 zzzn4Zzgv = zzzmo.zzgF() != null ? this.zzZU9.zzgF().zzgv() : zzZN4.zzZV6;
            this.zzZQO = zzzn4Zzgv;
            this.zzZQN = zzzn3.zzY(zzzn4Zzgv);
        }
        if (zzg7() && this.zzZQN != null && zzgQ() == this.zzZQO && (zzzlh = (zzZLH) this.zzZSB) != null) {
            this.zzZQN = zzzlh;
        }
        zzZMO zzzmo2 = this.zzZU9;
        if (zzzmo2 == null || zzzmo2.zzgF() == null) {
            this.zzZQL = 0;
        } else {
            this.zzZQL = this.zzZU9.zzgF().zzgC() ? 2 : 4;
        }
    }

    private void zzU(zzZN3 zzzn3) throws Exception {
        zzZLH zzzlh;
        if (this.zzZU9 == null || (zzzlh = this.zzZQN) == null) {
            return;
        }
        try {
            this.zzZSG += zzzlh.zzY(zzzn3);
        } catch (Exception e) {
            zzZHV.zzY(e);
        }
    }

    private void zzV(zzZN3 zzzn3) throws Exception {
        zzZLW zzzlw;
        zzZMD zzzmd;
        if (this.zzZU9 != null || (zzzlw = this.zzZU6) == null) {
            return;
        }
        this.zzZSG = zzzlw.zzY(zzzn3) + this.zzZSG;
        zzZLW zzzlw2 = this.zzZU6;
        if (!(zzzlw2 instanceof zzZMD) || (zzzmd = (zzZMD) zzzlw2) == null) {
            return;
        }
        if (zzzmd.zzgh() != null) {
            this.zzZSG = zzzmd.zzgh().zzY(zzzn3) + this.zzZSG;
        } else {
            if (zzzn3.zzUy(zzzmd.zzgO().getNamespace())) {
                return;
            }
            StringBuilder sb = new StringBuilder("Referenced group ");
            sb.append(zzzmd.zzgO());
            sb.append(" was not found in the corresponding schema.");
        }
    }

    private void zzW(zzZN3 zzzn3) throws Exception {
        zzZMZ zzzmzZzgD;
        zzZMZ zzzmz;
        int i;
        zzZLW zzzlw;
        this.zzZSG = this.zzZU9.zzY(zzzn3) + this.zzZSG;
        zzZLH zzzlh = this.zzZQN;
        zzZMZ zzzmz2 = null;
        zzZMS zzzms = this.zzZU9.zzgF() instanceof zzZMS ? (zzZMS) this.zzZU9.zzgF() : null;
        zzZMR zzzmr = this.zzZU9.zzgF() instanceof zzZMR ? (zzZMR) this.zzZU9.zzgF() : null;
        zzZLP zzzlp = this.zzZU9.zzgF() instanceof zzZLP ? (zzZLP) this.zzZU9.zzgF() : null;
        zzZLO zzzlo = this.zzZU9.zzgF() instanceof zzZLO ? (zzZLO) this.zzZU9.zzgF() : null;
        zzfF();
        if (zzzlh != null) {
            this.zzZQM = zzzlh.zzZQM;
        } else {
            zzZN4 zzzn4 = this.zzZQO;
            if (zzzn4 == zzZU2) {
                this.zzZQM = zzZLN.zzfN();
            } else if (zzZLF.zzP(zzzn4)) {
                this.zzZQM = zzZMN.zzU(this.zzZQO);
            }
        }
        zzZMQ zzzmqZzgz = zzzlh instanceof zzZMQ ? (zzZMQ) zzzlh : null;
        zzZLN zzzln = zzzlh instanceof zzZLN ? (zzZLN) zzzlh : null;
        if (zzzlh != null) {
            zzzlh.zzfI();
        }
        if (zzzln == null || this.zzZQL != 4) {
            if (zzzms == null && zzzmr == null) {
                this.zzZU5 = 0;
                if (this.zzZQO == zzZU2) {
                    zzzmqZzgz = zzgz();
                }
                if (zzzmqZzgz != null && zzzmqZzgz.zzZU5 != 0) {
                    new StringBuilder("Base schema complex type of a simple content must be simple content type. Base type is ").append(this.zzZQO);
                } else if (zzzlp == null && zzzln != null && !this.zzZQO.getNamespace().equals("http://www.w3.org/2001/XMLSchema")) {
                    new StringBuilder("If a simple content is not an extension, base schema type must be complex type. Base type is ").append(this.zzZQO);
                } else if (!zzZLF.zzP(this.zzZQO) && zzzlh == null && !zzzn3.zzUy(this.zzZQO.getNamespace())) {
                    StringBuilder sb = new StringBuilder("Referenced base schema type ");
                    sb.append(this.zzZQO);
                    sb.append(" was not found in the corresponding schema.");
                }
                if (zzzmqZzgz != null && (i = zzzmqZzgz.zzZU5) != 0 && zzzlo != null && i == 3 && (zzzlw = zzzmqZzgz.zzZU6) != null && zzzlw.zzfZ()) {
                    zzzlo.zzfQ();
                }
            } else {
                zzZN4 zzzn42 = this.zzZQO;
                if (zzzn42 == zzZU2) {
                    zzzmqZzgz = zzgz();
                } else if (!zzZLF.zzP(zzzn42) && zzzmqZzgz == null) {
                    zzZN4 zzzn43 = this.zzZQO;
                    if (!zzzn3.zzUy(zzzn43 != null ? zzzn43.getNamespace() : null)) {
                        StringBuilder sb2 = new StringBuilder("Referenced base schema type ");
                        sb2.append(this.zzZQO);
                        sb2.append(" was not complex type or not found in the corresponding schema.");
                    }
                }
            }
            zzZMQ zzzmqZzgz2 = zzzmqZzgz;
            if (zzzms != null) {
                zzzmzZzgD = zzzms.zzgD();
                if (zzzmqZzgz2 != null) {
                    Iterator<zzZLZ> it = zzzmqZzgz2.zzZUi.values().iterator();
                    while (it.hasNext()) {
                        zzZMX zzzmx = (zzZMX) it.next();
                        zzZLF.zzZ(this.zzZUi, zzzmx, zzzmx.zzgQ());
                    }
                    zzzmz2 = zzzmqZzgz2.zzZUb;
                }
                zzZMZ zzzmz3 = zzzmz2;
                zzZMZ[] zzzmzArr = {this.zzZUb};
                zzZMS zzzms2 = zzzms;
                this.zzZSG += zzZLF.zzZ(this.zzZUi, zzzn3, zzzms2.zzgE(), zzzms2.zzgD(), zzzmzArr, null, true);
                this.zzZUb = zzzmzArr[0];
                if (zzzmqZzgz2 != null) {
                    zzY(zzzmqZzgz2, zzzn3);
                } else if (zzzln != null) {
                    zz0(zzzln);
                }
                zzzmz2 = zzzmz3;
            } else {
                zzzmzZzgD = null;
            }
            if (zzzmr != null) {
                if (zzzmqZzgz2 == null) {
                    zzzmqZzgz2 = zzgz();
                }
                zzzmzZzgD = zzzmr.zzgD();
                this.zzZUb = zzzmzZzgD;
                if (zzzmqZzgz2 != null) {
                    zzzmz2 = zzzmqZzgz2.zzZUb;
                }
                zzzmz = zzzmz2;
                if (zzzmz != null && zzzmzZzgD != null) {
                    zzzmzZzgD.zzZ(zzzmz, zzzn3);
                }
                zzZMZ[] zzzmzArr2 = {this.zzZUb};
                this.zzZSG += zzZLF.zzZ(this.zzZUi, zzzn3, zzzmr.zzgE(), zzzmr.zzgD(), zzzmzArr2, null, false);
                this.zzZUb = zzzmzArr2[0];
                Iterator<zzZLZ> it2 = zzzmqZzgz2.zzZUi.values().iterator();
                while (it2.hasNext()) {
                    zzZMX zzzmx2 = (zzZMX) it2.next();
                    if (this.zzZUi.zzS(zzzmx2.zzgQ()) == null) {
                        zzZLF.zzZ(this.zzZUi, zzzmx2, zzzmx2.zzgQ());
                    }
                }
                zzZ(zzzmqZzgz2, zzzn3);
            } else {
                zzzmz = zzzmz2;
            }
            if (zzzlp != null) {
                zzZMZ[] zzzmzArr3 = {this.zzZUb};
                this.zzZSG += zzZLF.zzZ(this.zzZUi, zzzn3, zzzlp.zzgE(), zzzlp.zzgD(), zzzmzArr3, null, true);
                this.zzZUb = zzzmzArr3[0];
                zzzmzZzgD = zzzlp.zzgD();
                if (zzzmqZzgz2 != null) {
                    zzzmz = zzzmqZzgz2.zzZUb;
                    Iterator<zzZLZ> it3 = zzzmqZzgz2.zzZUi.values().iterator();
                    while (it3.hasNext()) {
                        zzZMX zzzmx3 = (zzZMX) it3.next();
                        zzZLF.zzZ(this.zzZUi, zzzmx3, zzzmx3.zzgQ());
                    }
                }
                if (zzzmz != null && zzzmzZzgD != null) {
                    zzzmzZzgD.zzZ(zzzmz, zzzn3);
                }
            }
            if (zzzlo != null) {
                this.zzZU5 = 2;
                zzzmzZzgD = zzzlo.zzgD();
                this.zzZUb = zzzmzZzgD;
                if (zzzmqZzgz2 != null) {
                    zzzmz = zzzmqZzgz2.zzZUb;
                }
                if (zzzmz != null && zzzmzZzgD != null) {
                    zzzmzZzgD.zzZ(zzzmz, zzzn3);
                }
                zzZMZ[] zzzmzArr4 = {this.zzZUb};
                this.zzZSG += zzZLF.zzZ(this.zzZUi, zzzn3, zzzlo.zzgE(), zzzlo.zzgD(), zzzmzArr4, null, false);
                this.zzZUb = zzzmzArr4[0];
                if (zzzmqZzgz2 != null) {
                    Iterator<zzZLZ> it4 = zzzmqZzgz2.zzZUi.values().iterator();
                    while (it4.hasNext()) {
                        zzZMX zzzmx4 = (zzZMX) it4.next();
                        if (this.zzZUi.zzS(zzzmx4.zzgQ()) == null) {
                            zzZLF.zzZ(this.zzZUi, zzzmx4, zzzmx4.zzgQ());
                        }
                    }
                }
            }
            if (zzzmzZzgD != null) {
                this.zzZUb = zzzmzZzgD;
            } else {
                this.zzZUb = zzzmz;
            }
        }
    }

    private void zzX(zzZN3 zzzn3) throws Exception {
        zzZLX zzzlx = new zzZLX();
        this.zzZUi = zzzlx;
        zzZMZ[] zzzmzArr = {this.zzZUb};
        zzZLF.zzZ(zzzlx, zzzn3, this.zzZUk, this.zzZUl, zzzmzArr, null, false);
        this.zzZUb = zzzmzArr[0];
    }

    private void zzgx() {
        boolean z;
        zzZMR zzzmr = (zzZMR) this.zzZU9.zzgF();
        if (zzzmr.zzgB() != null) {
            zzZME zzzme = zzzmr.zzgB() instanceof zzZME ? (zzZME) zzzmr.zzgB() : null;
            if (zzzme == null || ((((z = zzzme instanceof zzZMU)) || zzzme.zzgc().getCount() != 0) && (!z || zzzme.zzgc().getCount() != 0 || zzzme.zzZSi.intValue() != 0))) {
                this.zzZU5 = zzZ(this.zzZU9);
                this.zzZU8 = zzzmr.zzgB();
                return;
            }
        }
        this.zzZU5 = 1;
        this.zzZU8 = zzZLW.zzZSj;
    }

    private void zzgy() throws zzZMJ {
        zzZLW zzzlw = this.zzZU6;
        if (zzzlw != null) {
            this.zzZU8 = zzzlw;
        }
        if (this == zzgz()) {
            this.zzZU5 = 3;
            return;
        }
        if (this.zzZU8 == zzZLW.zzZSj) {
            if (this.zzZUe) {
                this.zzZU5 = 0;
            } else {
                this.zzZU5 = 1;
            }
        } else if (this.zzZUe) {
            this.zzZU5 = 3;
        } else {
            this.zzZU5 = 2;
        }
        if (this != zzgz()) {
            this.zzZQN = zzgz();
        }
    }

    public static zzZMQ zzgz() throws zzZMJ {
        if (zzZU3 == null) {
            zzZMQ zzzmq = new zzZMQ();
            zzZU3 = zzzmq;
            zzzmq.setName("anyType");
            zzZU3.zzZQK = new zzZN4("anyType", "http://www.w3.org/2001/XMLSchema");
            zzZU3.zzZU8 = zzZN0.zzgS();
            zzZMQ zzzmq2 = zzZU3;
            zzzmq2.zzZU7 = zzzmq2.zzZU8;
            zzzmq2.zzZQM = zzZLN.zzfN();
            zzZMQ zzzmq3 = zzZU3;
            zzzmq3.zzZUe = true;
            zzzmq3.zzZU5 = 3;
        }
        return zzZU3;
    }

    public final int getContentType() {
        return this.zzZU5;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        zzZN2 zzzn2;
        if (zzS(zzzn3.zzZSD)) {
            return this.zzZSG;
        }
        this.zzZSD = zzzn3.zzZSD;
        zzT(zzzn3);
        zzU(zzzn3);
        zzV(zzzn3);
        zzS(zzzn3);
        if (this.zzZU9 != null) {
            zzW(zzzn3);
        } else {
            zzX(zzzn3);
        }
        zzZLW zzzlw = this.zzZU7;
        if (zzzlw != null) {
            zzZLW zzzlwZzZ3 = zzzlw.zzZ3(true);
            if ((zzzlwZzZ3 instanceof zzZN2) && (zzzn2 = (zzZN2) zzzlwZzZ3) != null && zzzn2.zzZSh.intValue() == 1) {
                this.zzZU7.zzZSh.intValue();
            }
        }
        this.zzZU7.zzZ(new zzZLX(), zzzn3);
        Iterator<zzZLZ> it = this.zzZUi.values().iterator();
        zzZMX zzzmx = null;
        while (it.hasNext()) {
            zzZMX zzzmx2 = (zzZMX) it.next();
            zzZMN zzzmn = zzzmx2.zzgL() instanceof zzZMN ? (zzZMN) zzzmx2.zzgL() : null;
            if (zzzmn == null || zzzmn.zzht() == 1) {
                if (zzzmn == null) {
                    zzzmn = ((zzZLN) zzzmx2.zzgL()).zzZQM;
                }
                if (zzzmn != null && zzzmn.zzht() == 1 && zzzmx == null) {
                    zzzmx = zzzmx2;
                }
            }
        }
        this.zzZSD = zzzn3.zzZSD;
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        zzZLO zzzlo;
        if (zzg5() == zzzn3.zzg5()) {
            return this.zzZSG;
        }
        this.zzZU4 = this.zzZSC;
        this.zzZUi.clear();
        if (this.zzZSF) {
            if (zzg8() != null) {
                zzg8().zzZSF = true;
            }
            zzZMZ zzzmz = this.zzZUl;
            if (zzzmz != null) {
                zzzmz.zzZSF = true;
            }
            Iterator<zzZLZ> it = this.zzZUk.iterator();
            while (it.hasNext()) {
                it.next().zzZSF = true;
            }
            zzZMO zzzmo = this.zzZU9;
            if (zzzmo != null) {
                zzzmo.zzZSF = true;
            }
            zzZLW zzzlw = this.zzZU6;
            if (zzzlw != null) {
                zzzlw.zzZSF = true;
            }
        }
        if ((zzg4() instanceof zzZN3) || zzg7()) {
            if (getName() != null && !"".equals(getName()) && zzZNA.zzUJ(getName())) {
                this.zzZQK = new zzZN4(getName(), "");
            }
            if (zzg9() == 256) {
                int iZzgX = zzzn3.zzgX();
                if (iZzgX == 255) {
                    this.zzZUa = 255;
                } else if (iZzgX != 256) {
                    this.zzZUa = zzzn3.zzgX() & 6;
                } else {
                    this.zzZUa = 0;
                }
            } else if (zzg9() == 255) {
                this.zzZUa = 255;
            } else {
                zzg9();
                zzg9();
                this.zzZUa = zzg9() & 6;
            }
            if (zzga() == 256) {
                int iZzgW = zzzn3.zzgW();
                if (iZzgW == 255) {
                    zzQs(255);
                } else if (iZzgW != 256) {
                    zzQs(zzzn3.zzgW() & 6);
                } else {
                    zzQs(0);
                }
            } else if (zzga() == 255) {
                zzQs(255);
            } else if ((zzga() & 6) == zzga()) {
                zzQs(zzga());
            }
        } else {
            getName();
            zzga();
            zzg9();
        }
        if (this.zzZU9 != null) {
            if (this.zzZUl == null && this.zzZUk.getCount() == 0) {
                zzZLW zzzlw2 = this.zzZU6;
            }
            this.zzZSG = this.zzZU9.zzZ(zzzn3) + this.zzZSG;
            zzZMO zzzmo2 = this.zzZU9;
            zzZLQ zzzlq = zzzmo2 instanceof zzZLQ ? (zzZLQ) zzzmo2 : null;
            if (zzzlq != null) {
                if ((zzzlq.zzgF() instanceof zzZLP ? (zzZLP) zzzlq.zzgF() : null) == null && (zzzlo = (zzZLO) zzzlq.zzgF()) != null && zzzlo.zzfQ() != null) {
                    zzzlo.zzfQ().zzZ(zzzn3);
                    this.zzZQN = zzzlo.zzfQ();
                }
            }
        } else {
            zzZLW zzzlw3 = this.zzZU6;
            if (zzzlw3 != null) {
                this.zzZSG = zzzlw3.zzZ(zzzn3) + this.zzZSG;
            }
            zzZMZ zzzmz2 = this.zzZUl;
            if (zzzmz2 != null) {
                zzzmz2.zzZ(zzzn3);
            }
            for (zzZLZ zzzlz : this.zzZUk) {
                if (zzzlz instanceof zzZMX) {
                    this.zzZSG = ((zzZMX) zzzlz).zzZ(zzzn3) + this.zzZSG;
                } else if (zzzlz instanceof zzZMV) {
                    this.zzZSG = ((zzZMV) zzzlz).zzZ(zzzn3) + this.zzZSG;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(zzzlz.getClass());
                    sb.append(" is not valid in this place::ComplexType");
                }
            }
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    public final zzZLW zzgA() {
        return this.zzZU7;
    }

    public final zzZLW zzgB() {
        return this.zzZU6;
    }

    public final zzZLX zzgG() {
        return this.zzZUi;
    }

    public final zzZMO zzgw() {
        return this.zzZU9;
    }

    private void zzY(zzZMQ zzzmq, zzZN3 zzzn3) {
        zzZMZ zzzmz;
        zzzmq.zzfI();
        Iterator<zzZLZ> it = zzzmq.zzZUi.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzZMX zzzmx = (zzZMX) it.next();
            if ((this.zzZUi.zzS(zzzmx.zzgQ()) instanceof zzZMX ? (zzZMX) this.zzZUi.zzS(zzzmx.zzgQ()) : null) == null) {
                StringBuilder sb = new StringBuilder("Invalid complex type derivation by extension was found. Missing attribute was found: ");
                sb.append(zzzmx.zzgQ());
                sb.append(" .");
            }
        }
        zzZMZ zzzmz2 = this.zzZUl;
        if (zzzmz2 != null && (zzzmz = zzzmq.zzZUl) != null) {
            zzzmz.zzZ(zzzmz2, zzzn3);
        }
        int i = zzzmq.zzZU5;
        if (i != 1) {
            if (this.zzZU5 != i) {
                StringBuilder sb2 = new StringBuilder("Base complex type has different content type ");
                sb2.append(zzzmq.zzZU5);
                sb2.append(".");
                return;
            }
            zzZLW zzzlw = this.zzZU7;
            if (zzzlw == null || !zzzlw.zzZ(zzzmq.zzZU7)) {
                zzZLW zzzlw2 = this.zzZU7;
                zzZLZ zzzlz = zzzlw2 instanceof zzZLS ? (zzZLS) zzzlw2 : null;
                if (zzzlw2 == zzZLW.zzZSj || zzzlz == null || zzzlw2.zzZSi.intValue() != 1) {
                    return;
                }
                this.zzZU7.zzZSh.intValue();
            }
        }
    }

    public final void zzZ(Object obj, zzZN3 zzzn3) throws zzZMJ {
        zzZMQ zzzmq = this;
        while (true) {
            if (zzzmq == zzgz() && zzzmq.zzZQN == zzzmq) {
                return;
            }
            zzZLH zzzlh = (zzZLH) obj;
            if (obj == zzzmq) {
                return;
            }
            if (zzzlh != null) {
                if ((zzzlh.zzfI() & zzzmq.zzZQL) != 0) {
                    StringBuilder sb = new StringBuilder("Derivation type ");
                    sb.append(zzzmq.zzZQL);
                    sb.append(" is prohibited by the base type.");
                }
            }
            zzZLH zzzlh2 = zzzmq.zzZQN;
            if (zzzlh2 == obj || zzzlh2 == null || zzzlh2 == zzgz()) {
                return;
            }
            zzZLH zzzlh3 = zzzmq.zzZQN;
            zzZMQ zzzmq2 = (zzZMQ) zzzlh3;
            if (zzzmq2 == null) {
                zzZLN zzzln = (zzZLN) zzzlh3;
                if (zzzln != null) {
                    zzzln.zzZ(obj, zzzn3, true);
                    return;
                }
                return;
            }
            zzzmq = zzzmq2;
        }
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        zzZMO zzzmo = this.zzZU9;
        if (zzzmo != null) {
            zzzmo.zzZ(this);
        }
        zzZLW zzzlw = this.zzZU6;
        if (zzzlw != null) {
            zzzlw.zzZ(this);
        }
        zzZMZ zzzmz = this.zzZUl;
        if (zzzmz != null) {
            zzzmz.zzZ(this);
        }
        Iterator<zzZLZ> it = this.zzZUk.iterator();
        while (it.hasNext()) {
            it.next().zzZ(this);
        }
    }

    private void zzZ(zzZMQ zzzmq, zzZN3 zzzn3) throws zzZMJ {
        zzZMZ zzzmz;
        Class<?> cls;
        Class<?> cls2;
        if (zzzmq != null && (zzzmq.zzfI() & 4) == 0) {
            Iterator<zzZLZ> it = this.zzZUi.values().iterator();
            while (it.hasNext()) {
                zzZMX zzzmx = (zzZMX) it.next();
                zzZMX zzzmx2 = zzzmq.zzZUi.zzS(zzzmx.zzgQ()) instanceof zzZMX ? (zzZMX) zzzmq.zzZUi.zzS(zzzmx.zzgQ()) : null;
                if (zzzmx2 != null) {
                    if (zzzmx2.zzgJ() != 1 && zzzmx.zzgJ() != 3) {
                        StringBuilder sb = new StringBuilder("Invalid attribute derivation by restriction was found for ");
                        sb.append(zzzmx.zzgQ());
                        sb.append(" .");
                    }
                    zzZLN zzzln = zzzmx.zzgL() instanceof zzZLN ? (zzZLN) zzzmx.zzgL() : null;
                    zzZLN zzzln2 = zzzmx2.zzgL() instanceof zzZLN ? (zzZLN) zzzmx2.zzgL() : null;
                    if (zzzln != null) {
                        zzzln.zzZ(zzzln2, null);
                    } else if ((zzzln == null && zzzln2 != null) || ((cls = zzzmx.zzgL().getClass()) != (cls2 = zzzmx2.zzgL().getClass()) && cls.isInstance(cls2))) {
                        StringBuilder sb2 = new StringBuilder("Invalid attribute derivation by restriction because of its type: ");
                        sb2.append(zzzmx.zzgQ());
                        sb2.append(" .");
                    }
                    String str = zzzmx2.zzZUo;
                    if (str != null && !zzzmx.zzZUo.equals(str)) {
                        StringBuilder sb3 = new StringBuilder("Invalid attribute derivation by restriction because of its fixed value constraint: ");
                        sb3.append(zzzmx.zzgQ());
                        sb3.append(" .");
                    }
                } else {
                    zzZMZ zzzmz2 = zzzmq.zzZUb;
                    if (zzzmz2 != null && !zzzmz2.zzUw(zzzmx.zzgQ().getName()) && !zzzn3.zzUy(zzzmx.zzgQ().getNamespace())) {
                        StringBuilder sb4 = new StringBuilder("Invalid attribute derivation by restriction was found for ");
                        sb4.append(zzzmx.zzgQ());
                        sb4.append(" .");
                    }
                }
            }
            if (this.zzZUb != null && zzzmq != zzgz() && (zzzmz = zzzmq.zzZUb) != null) {
                this.zzZUb.zzZ(zzzmz, zzzn3);
            }
            if (this == zzgz()) {
                return;
            }
            zzZLW zzzlw = this.zzZU7;
            zzZLW zzzlw2 = zzZLW.zzZSj;
            if (zzzlw == zzzlw2) {
                if (this.zzZU5 != 1) {
                    if (zzzmq.zzZU5 == 3) {
                        zzzmq.zzZU7.zzfZ();
                        return;
                    }
                    return;
                } else {
                    zzZLW zzzlw3 = zzzmq.zzZU7;
                    if (zzzlw3 != zzzlw2) {
                        zzzlw3.zzfZ();
                        return;
                    }
                    return;
                }
            }
            zzZLW zzzlw4 = zzzmq.zzZU7;
            if (zzzlw4 != null) {
                zzzlw.zzZ(zzzlw4);
            }
        }
    }

    private int zzZ(zzZMO zzzmo) {
        return (this.zzZUe || ((zzZMT) zzzmo).isMixed()) ? 3 : 2;
    }
}
