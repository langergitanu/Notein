package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2I {
    private com.aspose.words.internal.zzZOW zzW5;
    private MailMergeSettings zzY5y;
    private zzY92 zzY5z;
    private zzZRA zzYUj;

    private void zzH(short s) throws Exception {
        this.zzW5.zzK((short) 17);
        this.zzW5.zzK((short) 2);
        this.zzW5.zzK(s);
    }

    private static String zzIG(String str) {
        return str.length() > 255 ? str.substring(0, 255) : str;
    }

    private void zzWK(int i, int i2) throws Exception {
        this.zzW5.zzK((short) i);
        this.zzW5.zzK((short) 4);
        this.zzW5.zzl(i2);
    }

    private void zzWL(int i, int i2) throws Exception {
        int position = (int) this.zzW5.zzq().getPosition();
        this.zzW5.zzq().zzH(i);
        this.zzW5.zzK((short) (position - i2));
        this.zzW5.zzq().zzH(position);
    }

    private void zzWM(int i, int i2) throws Exception {
        int position = (int) this.zzW5.zzq().getPosition();
        this.zzW5.zzq().zzH(i);
        this.zzW5.zzl(position - i2);
        this.zzW5.zzq().zzH(position);
    }

    private void zzY3(byte[] bArr) throws Exception {
        this.zzW5.zzK((short) 4);
        this.zzW5.zzK((short) bArr.length);
        this.zzW5.writeBytes(bArr);
    }

    private void zzYJF() throws Exception {
        this.zzW5.zzK((short) 0);
        this.zzW5.zzK((short) 0);
    }

    private void zzYJG() throws Exception {
        this.zzW5.zzK((short) 1);
        this.zzW5.zzK((short) 1);
        this.zzW5.writeByte((byte) 0);
    }

    private int zzYJH() throws Exception {
        this.zzW5.zzK((short) 22);
        int position = (int) this.zzW5.zzq().getPosition();
        this.zzW5.zzK((short) 0);
        return position;
    }

    private int zzYJI() throws Exception {
        this.zzW5.zzK((short) 21);
        this.zzW5.zzK((short) -1);
        int position = (int) this.zzW5.zzq().getPosition();
        this.zzW5.zzl(0);
        return position;
    }

    private void zzYJJ() throws Exception {
        OdsoFieldMapDataCollection fieldMapDatas = this.zzY5y.getOdso().getFieldMapDatas();
        if (fieldMapDatas.getCount() == 0) {
            return;
        }
        int iZzYJH = zzYJH();
        int position = (int) this.zzW5.zzq().getPosition();
        int iZzve = zzve(fieldMapDatas.getCount());
        int position2 = (int) this.zzW5.zzq().getPosition();
        fieldMapDatas.getCount();
        Iterator<OdsoFieldMapData> it = fieldMapDatas.iterator();
        while (it.hasNext()) {
            zzZ(it.next());
        }
        zzWL(iZzYJH, position);
        zzWL(iZzve, position2);
    }

    private void zzYJK() throws Exception {
        OdsoRecipientDataCollection recipientDatas = this.zzY5y.getOdso().getRecipientDatas();
        if (recipientDatas.getCount() == 0) {
            return;
        }
        int iZzYJI = zzYJI();
        int position = (int) this.zzW5.zzq().getPosition();
        int iZzvf = zzvf(recipientDatas.getCount());
        int position2 = (int) this.zzW5.zzq().getPosition();
        Iterator<OdsoRecipientData> it = recipientDatas.iterator();
        while (it.hasNext()) {
            zzZ(it.next());
        }
        zzWM(iZzYJI, position);
        zzWM(iZzvf, position2);
    }

    private void zzYJL() throws Exception {
        this.zzYUj.zzYGC.zzXyB.zzYHK = (int) this.zzW5.zzq().getPosition();
        Odso odso = this.zzY5y.getOdso();
        zzs(0, odso.getUdlConnectString());
        zzs(1, odso.getTableName());
        zzs(2, odso.getDataSource());
        zzWK(16, odso.getDataSourceType());
        zzH((short) odso.getColumnDelimiter());
        zzWK(18, odso.getFirstRowContainsColumnNames() ? 1 : 0);
        zzYJK();
        zzYJJ();
        this.zzYUj.zzYGC.zzXyB.zzYHJ = ((int) this.zzW5.zzq().getPosition()) - this.zzYUj.zzYGC.zzXyB.zzYHK;
    }

    private int zzYJM() throws Exception {
        int position = (int) this.zzW5.zzq().getPosition();
        boolean zZzXk = com.aspose.words.internal.zzZYD.zzXk(this.zzY5y.getDataSource());
        boolean zZzXk2 = com.aspose.words.internal.zzZYD.zzXk(this.zzY5y.getHeaderSource());
        this.zzW5.zzK((short) ((zZzXk ? 2 : 0) | 1 | (zZzXk2 ? 4 : 0) | ((this.zzY5y.getMainDocumentType() & 15) << 3) | (!this.zzY5y.getDoNotSupressBlankLines() ? 1024 : 0) | (this.zzY5y.getDestination() << 13)));
        this.zzW5.writeByte(zZzXk2 ? (byte) 1 : (byte) 0);
        this.zzW5.writeByte((byte) 0);
        this.zzW5.zzl(this.zzY5y.getActiveRecord());
        zzYLD zzyld = new zzYLD();
        zzyld.zzXEb = -1;
        zzyld.zzYxC = 65523;
        if (zZzXk) {
            zzyld.zzXEb = this.zzY5y.getDataType();
            zzyld.zzYxC = this.zzY5z.zzj(3, this.zzY5y.getDataSource());
            zzyld.zzXEa = this.zzY5y.getLinkToQuery();
            if (zzyld.zzXEb == 0) {
                zzyld.zzXE6 = this.zzY5y.zzYJf();
                zzyld.zzXE5 = this.zzY5y.zzYJe();
            }
        }
        zzyld.zzZ(this.zzW5);
        zzYLD zzyld2 = new zzYLD();
        zzyld2.zzXEb = 0;
        zzyld2.zzYxC = 65523;
        if (zZzXk2) {
            zzyld2.zzXEb = this.zzY5y.getDataType();
            zzyld2.zzYxC = this.zzY5z.zzj(3, this.zzY5y.getHeaderSource());
            zzyld2.zzXEa = this.zzY5y.getLinkToQuery();
            if (zzyld2.zzXEb == 0) {
                zzyld2.zzXE6 = this.zzY5y.zzYJd();
                zzyld2.zzXE5 = this.zzY5y.zzYJc();
            }
        }
        zzyld2.zzZ(this.zzW5);
        this.zzW5.zzK((short) ((this.zzY5y.getViewMergedData() ? 1 : 0) | ((this.zzY5y.getCheckErrors() - 1) << 1) | (!this.zzY5y.getMailAsAttachment() ? 128 : 0)));
        this.zzW5.zzK((short) 18080);
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzY5y.getQuery())) {
            String strZzIG = zzIG(this.zzY5y.getQuery());
            this.zzW5.zzK((short) zzZZ7.zzOe(strZzIG));
            zzZZQ.zzZ(strZzIG, this.zzW5);
        } else {
            this.zzW5.zzK((short) 0);
        }
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, this.zzY5y.getConnectString());
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, "");
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, this.zzY5y.getMailSubject());
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, this.zzY5y.getAddressFieldName());
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, "");
        zzY91.zzZ(this.zzW5, (ArrayList<String>) arrayList);
        this.zzW5.zzl(this.zzY5y.getMainDocumentType());
        return ((int) this.zzW5.zzq().getPosition()) - position;
    }

    private void zzs(int i, String str) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzW5.zzK((short) i);
            byte[] bytes = com.aspose.words.internal.zzZO0.zzhU().getBytes(zzIG(str));
            this.zzW5.zzK((short) bytes.length);
            this.zzW5.writeBytes(bytes);
        }
    }

    private int zzve(int i) throws Exception {
        this.zzW5.zzK((short) 0);
        this.zzW5.zzK((short) 4);
        this.zzW5.zzl(i);
        this.zzW5.zzK((short) 1);
        int position = (int) this.zzW5.zzq().getPosition();
        this.zzW5.zzK((short) 0);
        return position;
    }

    private int zzvf(int i) throws Exception {
        this.zzW5.zzK((short) 0);
        this.zzW5.zzK((short) 4);
        this.zzW5.zzl(i);
        this.zzW5.zzK((short) 1);
        this.zzW5.zzK((short) -1);
        int position = (int) this.zzW5.zzq().getPosition();
        this.zzW5.zzl(0);
        return position;
    }

    public final void zzZ(MailMergeSettings mailMergeSettings, zzZRA zzzra, zzY92 zzy92, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        if (mailMergeSettings.isEmpty()) {
            return;
        }
        this.zzY5y = mailMergeSettings;
        this.zzYUj = zzzra;
        this.zzY5z = zzy92;
        this.zzW5 = zzzow;
        zzzra.zzYGC.zzXyC.zzYHK = (int) zzzow.zzq().getPosition();
        this.zzYUj.zzYGC.zzXyC.zzYHJ = zzYJM();
        zzYJL();
    }

    private void zzZ(OdsoRecipientData odsoRecipientData) throws Exception {
        if (!odsoRecipientData.getActive()) {
            zzYJG();
        }
        zzWK(2, odsoRecipientData.getColumn());
        if (odsoRecipientData.getHash() != 0) {
            zzWK(3, odsoRecipientData.getHash());
        }
        if (odsoRecipientData.getUniqueTag() != null) {
            zzY3(odsoRecipientData.getUniqueTag());
        }
        zzYJF();
    }

    private void zzZ(OdsoFieldMapData odsoFieldMapData) throws Exception {
        if (odsoFieldMapData.getType() == 0) {
            zzWK(1, 1);
            zzs(2, odsoFieldMapData.getName());
            zzs(3, odsoFieldMapData.getMappedName());
            zzWK(4, odsoFieldMapData.getColumn());
        }
        zzYJF();
    }
}
