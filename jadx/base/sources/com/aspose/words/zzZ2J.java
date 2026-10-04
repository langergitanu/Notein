package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2J {
    private com.aspose.words.internal.zzZOX zzW6;
    private MailMergeSettings zzY5y;
    private zzY92 zzY5z;
    private zzZRA zzYUj;

    private void zzYJN() throws Exception {
        this.zzW6.zzq().getPosition();
        this.zzW6.zzXa();
        this.zzW6.zzXa();
        int iZzXc = this.zzW6.zzXc();
        this.zzW6.zzXa();
        if (this.zzW6.zzXa() == -1) {
            this.zzW6.zzXc();
        }
        this.zzW6.zzq().getPosition();
        for (int i = 0; i < iZzXc; i++) {
            zzvi(i);
        }
        this.zzW6.zzq().getPosition();
    }

    private void zzYJO() throws Exception {
        OdsoRecipientData odsoRecipientData = new OdsoRecipientData();
        while (true) {
            short sZzXa = this.zzW6.zzXa();
            short sZzXa2 = this.zzW6.zzXa();
            if (sZzXa == 0) {
                break;
            }
            if (sZzXa == 1) {
                odsoRecipientData.setActive(zzvg(sZzXa2) != 0);
            } else if (sZzXa == 2) {
                odsoRecipientData.setColumn(zzvg(sZzXa2));
            } else if (sZzXa == 3) {
                odsoRecipientData.setHash(this.zzW6.zzXc());
            } else if (sZzXa != 4) {
                this.zzW6.zzn(sZzXa2);
            } else {
                odsoRecipientData.setUniqueTag(this.zzW6.zzn(sZzXa2));
            }
        }
        if (odsoRecipientData.getHash() == 0 && odsoRecipientData.getUniqueTag() == null) {
            return;
        }
        this.zzY5y.getOdso().getRecipientDatas().add(odsoRecipientData);
    }

    private void zzYJP() throws Exception {
        this.zzW6.zzq().getPosition();
        this.zzW6.zzXa();
        this.zzW6.zzXa();
        int iZzXc = this.zzW6.zzXc();
        this.zzW6.zzXa();
        if (this.zzW6.zzXa() == -1) {
            this.zzW6.zzXc();
        }
        this.zzW6.zzq().getPosition();
        for (int i = 0; i < iZzXc; i++) {
            zzYJO();
        }
        this.zzW6.zzq().getPosition();
    }

    private void zzYJQ() throws Exception {
        short sZzXa = this.zzW6.zzXa();
        int iZzXa = this.zzW6.zzXa();
        if (iZzXa == -1) {
            iZzXa = this.zzW6.zzXc();
        }
        this.zzW6.zzq().getPosition();
        Odso odso = this.zzY5y.getOdso();
        if (sZzXa != 0) {
            if (sZzXa == 1) {
                odso.setTableName(zzvh(iZzXa));
            } else if (sZzXa == 2) {
                odso.setDataSource(zzvh(iZzXa));
            } else if (sZzXa == 21) {
                zzYJP();
            } else if (sZzXa != 22) {
                switch (sZzXa) {
                    case 16:
                        odso.setDataSourceType(this.zzW6.zzXc());
                        break;
                    case 17:
                        odso.setColumnDelimiter((char) this.zzW6.zzXa());
                        break;
                    case 18:
                        odso.setFirstRowContainsColumnNames(this.zzW6.zzXc() != 0);
                        break;
                    default:
                        this.zzW6.zzn(iZzXa);
                        break;
                }
            } else {
                zzYJN();
            }
        } else {
            odso.setUdlConnectString(zzvh(iZzXa));
        }
        this.zzW6.zzq().getPosition();
    }

    private void zzYJR() throws Exception {
        if (this.zzYUj.zzYGC.zzXyB.zzYHJ == 0) {
            return;
        }
        this.zzW6.zzq().zzH(this.zzYUj.zzYGC.zzXyB.zzYHK);
        zzZRG zzzrg = this.zzYUj.zzYGC.zzXyB;
        int i = zzzrg.zzYHK + zzzrg.zzYHJ;
        while (this.zzW6.zzq().getPosition() < i) {
            zzYJQ();
        }
        this.zzW6.zzq().getPosition();
    }

    private int zzvg(int i) throws Exception {
        if (i == 1) {
            return this.zzW6.readByte() & 255;
        }
        if (i == 2) {
            return this.zzW6.zzXa();
        }
        if (i == 4) {
            return this.zzW6.zzXc();
        }
        throw new IllegalStateException("Unexpected integer size.");
    }

    private String zzvh(int i) throws Exception {
        return com.aspose.words.internal.zzZO0.zzhU().zzZn(this.zzW6.zzn(i));
    }

    private void zzvi(int i) throws Exception {
        OdsoFieldMapData odsoFieldMapData = new OdsoFieldMapData();
        while (true) {
            short sZzXa = this.zzW6.zzXa();
            short sZzXa2 = this.zzW6.zzXa();
            if (sZzXa == 0) {
                if (com.aspose.words.internal.zzZYD.zzXk(odsoFieldMapData.getName())) {
                    odsoFieldMapData.setType(0);
                }
                this.zzY5y.getOdso().getFieldMapDatas().add(odsoFieldMapData);
                return;
            } else if (sZzXa != 1) {
                if (sZzXa == 2) {
                    odsoFieldMapData.setName(zzvh(sZzXa2));
                } else if (sZzXa == 3) {
                    zzvh(sZzXa2);
                    odsoFieldMapData.setMappedName(zzZ2L.zzvj(i));
                } else if (sZzXa != 4) {
                    this.zzW6.zzn(sZzXa2);
                } else {
                    odsoFieldMapData.zzsR(zzvg(sZzXa2));
                }
            } else if (zzvg(sZzXa2) != 1) {
                throw new IllegalStateException("xxx");
            }
        }
    }

    public final void zzZ(com.aspose.words.internal.zzZOX zzzox, zzZRA zzzra, zzY92 zzy92, MailMergeSettings mailMergeSettings) throws Exception {
        this.zzW6 = zzzox;
        this.zzYUj = zzzra;
        this.zzY5z = zzy92;
        this.zzY5y = mailMergeSettings;
        zzZRG zzzrg = zzzra.zzYGC.zzXyC;
        if (zzzrg.zzYHJ > 0) {
            zzZ(zzzrg);
        } else {
            zzZRG zzzrg2 = zzzra.zzYGE.zzXzX;
            if (zzzrg2.zzYHJ > 0) {
                zzZ(zzzrg2);
            }
        }
        zzYJR();
    }

    private void zzZ(zzZRG zzzrg) throws Exception {
        int i = zzzrg.zzYHK;
        int i2 = zzzrg.zzYHJ;
        if (i2 == 0) {
            return;
        }
        this.zzW6.zzq().zzH(i);
        int i3 = i + i2;
        short sZzXa = this.zzW6.zzXa();
        boolean z = (sZzXa & 2) != 0;
        boolean z2 = (sZzXa & 4) != 0;
        this.zzY5y.setMainDocumentType((sZzXa & 120) >> 3);
        this.zzY5y.setDoNotSupressBlankLines((sZzXa & 1024) == 0);
        this.zzY5y.setDestination((sZzXa & 57344) >> 13);
        int i4 = this.zzW6.readByte() & 255;
        int i5 = this.zzW6.readByte() & 255;
        this.zzY5y.setActiveRecord(this.zzW6.zzXc());
        zzYLD[] zzyldArr = {new zzYLD(this.zzW6), new zzYLD(this.zzW6)};
        if (z) {
            zzYLD zzyld = zzyldArr[i5];
            this.zzY5y.setDataType(zzyld.zzXEb);
            this.zzY5y.setDataSource(this.zzY5z.zzBR(zzyld.zzYxC));
            this.zzY5y.setLinkToQuery(zzyld.zzXEa);
            if (this.zzY5y.getDataType() == 0) {
                this.zzY5y.zzvb(zzyld.zzXE6);
                this.zzY5y.zzva(zzyld.zzXE5);
            }
        }
        if (z2) {
            zzYLD zzyld2 = zzyldArr[i4];
            this.zzY5y.setHeaderSource(this.zzY5z.zzBR(zzyld2.zzYxC));
            if (this.zzY5y.getDataType() == 0) {
                this.zzY5y.zzv9(zzyld2.zzXE6);
                this.zzY5y.zzv8(zzyld2.zzXE5);
            }
        }
        short sZzXa2 = this.zzW6.zzXa();
        this.zzY5y.setViewMergedData((sZzXa2 & 1) != 0);
        this.zzY5y.setCheckErrors(((sZzXa2 & 6) >> 1) + 1);
        this.zzY5y.setMailAsAttachment((((sZzXa2 & 16) != 0) || ((sZzXa2 & 128) != 0)) ? false : true);
        short sZzXa3 = this.zzW6.zzXa();
        this.zzY5y.setQuery(zzZZR.zzR(this.zzW6, this.zzW6.zzXa()));
        if (sZzXa3 != 0) {
            ArrayList arrayList = new ArrayList();
            int position = i3 - ((int) this.zzW6.zzq().getPosition());
            com.aspose.words.internal.zzZOX zzzox = this.zzW6;
            zzY91.zzZ(zzzox, (int) zzzox.zzq().getPosition(), position, arrayList);
            this.zzY5y.setConnectString((String) arrayList.get(0));
            this.zzY5y.setMailSubject((String) arrayList.get(2));
            this.zzY5y.setAddressFieldName((String) arrayList.get(3));
        }
        if (this.zzW6.zzq().getPosition() < i3) {
            this.zzY5y.setMainDocumentType(this.zzW6.zzXc() & 63);
        }
        this.zzW6.zzq().getPosition();
    }
}
