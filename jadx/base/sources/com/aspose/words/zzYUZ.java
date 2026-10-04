package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYUZ {
    private zzZ9W zzXTB;
    private MailMergeSettings zzY5y;

    private void zzYJL() throws Exception {
        zzYU6 zzyu6ZzZm2 = this.zzXTB.zzZm2();
        zzyu6ZzZm2.zzY("w:odso");
        Odso odso = this.zzY5y.getOdso();
        zzyu6ZzZm2.zzYz("w:udl", odso.getUdlConnectString());
        zzyu6ZzZm2.zzYz("w:table", odso.getTableName());
        zzMU(odso.getDataSource());
        zzyu6ZzZm2.zzv("w:colDelim", odso.getColumnDelimiter(), 0);
        zzY(odso);
        Iterator<OdsoFieldMapData> it = odso.getFieldMapDatas().iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzyu6ZzZm2);
        }
        zzZ(odso);
        zzyu6ZzZm2.zzp();
    }

    public abstract void zzMU(String str) throws Exception;

    public abstract void zzMV(String str) throws Exception;

    public abstract void zzMW(String str) throws Exception;

    public abstract void zzY(Odso odso) throws Exception;

    public final void zzZ(MailMergeSettings mailMergeSettings, zzZ9W zzz9w) throws Exception {
        if (mailMergeSettings.isEmpty()) {
            return;
        }
        this.zzY5y = mailMergeSettings;
        this.zzXTB = zzz9w;
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        zzyu6ZzZm2.zzY("w:mailMerge");
        zzyu6ZzZm2.zzYx("w:mainDocumentType", zzZ2L.zzZS(this.zzY5y.getMainDocumentType(), zzz9w.zzZmh()));
        zzyu6ZzZm2.zze("w:linkToQuery", this.zzY5y.getLinkToQuery());
        zzyu6ZzZm2.zzYx("w:dataType", zzZ2L.zzZQ(this.zzY5y.getDataType(), zzz9w.zzZmh()));
        zzyu6ZzZm2.zzYy("w:connectString", this.zzY5y.getConnectString());
        zzyu6ZzZm2.zzYz("w:query", this.zzY5y.getQuery());
        zzMW(this.zzY5y.getDataSource());
        zzMV(this.zzY5y.getHeaderSource());
        zzyu6ZzZm2.zze("w:doNotSuppressBlankLines", this.zzY5y.getDoNotSupressBlankLines());
        zzyu6ZzZm2.zzYz("w:destination", zzZ2L.zzZR(this.zzY5y.getDestination(), zzz9w.zzZmh()));
        zzyu6ZzZm2.zzYz("w:addressFieldName", this.zzY5y.getAddressFieldName());
        zzyu6ZzZm2.zzYz("w:mailSubject", this.zzY5y.getMailSubject());
        zzyu6ZzZm2.zze("w:mailAsAttachment", this.zzY5y.getMailAsAttachment());
        zzyu6ZzZm2.zze("w:viewMergedData", this.zzY5y.getViewMergedData());
        zzyu6ZzZm2.zzv("w:activeRecord", this.zzY5y.getActiveRecord(), 0);
        zzyu6ZzZm2.zzv("w:checkErrors", this.zzY5y.getCheckErrors(), 2);
        zzYJL();
        zzyu6ZzZm2.zzp();
    }

    public abstract void zzZ(Odso odso) throws Exception;

    private void zzZ(OdsoFieldMapData odsoFieldMapData, zzYU6 zzyu6) {
        String strZzVm;
        zzyu6.zzY("w:fieldMapData");
        zzyu6.zzYz("w:type", zzZ2L.zzZO(odsoFieldMapData.getType(), this.zzXTB.zzZmh()));
        zzyu6.zzYz("w:name", odsoFieldMapData.getName());
        zzyu6.zzYz("w:mappedName", odsoFieldMapData.getMappedName());
        if (!this.zzXTB.zzZmh() || com.aspose.words.internal.zzZYD.zzXk(odsoFieldMapData.getName())) {
            zzyu6.zzZl("w:column", odsoFieldMapData.getColumn());
        }
        if (this.zzXTB.zzZmh()) {
            strZzVm = com.aspose.words.internal.zzBM.zzVn(odsoFieldMapData.zzTu());
        } else {
            strZzVm = com.aspose.words.internal.zzBM.zzVm(odsoFieldMapData.zzTu());
        }
        zzyu6.zzYz("w:lid", strZzVm);
        zzyu6.zze("w:dynamicAddress", odsoFieldMapData.zzYyh());
        zzyu6.zzp();
    }
}
