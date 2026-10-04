package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGH {
    public static void zzZ(MailMergeSettings mailMergeSettings, zzYHZ zzyhz) throws Exception {
        if (mailMergeSettings.getMainDocumentType() == 0) {
            return;
        }
        zzyhz.zzCC("\\*\\mailmerge");
        zzZ("\\*\\mmconnectstr", mailMergeSettings.getConnectString(), zzyhz);
        zzZ("\\mmdatasource", mailMergeSettings.getDataSource(), zzyhz);
        zzZ("\\mmquery", mailMergeSettings.getQuery(), zzyhz);
        zzZ("\\mmheadersource", mailMergeSettings.getHeaderSource(), zzyhz);
        zzZ("\\mmaddfieldname", mailMergeSettings.getAddressFieldName(), zzyhz);
        zzZ("\\mmmailsubject", mailMergeSettings.getMailSubject(), zzyhz);
        zzyhz.zzCD(zzYEO.zznt(mailMergeSettings.getMainDocumentType()));
        if (mailMergeSettings.getDataType() != -1) {
            zzyhz.zzCD(zzYEO.zzns(mailMergeSettings.getDataType()));
        }
        zzyhz.zzCD(zzYEO.zznr(mailMergeSettings.getDestination()));
        zzyhz.zzZ5("\\mmreccur", mailMergeSettings.getActiveRecord());
        zzyhz.zzZ5("\\mmerrors", mailMergeSettings.getCheckErrors());
        zzyhz.zz7("\\mmblanklinks", mailMergeSettings.getDoNotSupressBlankLines());
        zzyhz.zz7("\\mmlinktoquery", mailMergeSettings.getLinkToQuery());
        zzyhz.zz7("\\mmattach", mailMergeSettings.getMailAsAttachment());
        zzyhz.zz7("\\mmshowdata", mailMergeSettings.getViewMergedData());
        if (mailMergeSettings.getOdso() != null) {
            zzZ(mailMergeSettings.getOdso(), zzyhz);
        }
        zzyhz.zzYj3();
    }

    private static void zzZ(Odso odso, zzYHZ zzyhz) throws Exception {
        zzyhz.zzCC("\\*\\mmodso");
        zzZ("\\*\\mmodsoudl", odso.getUdlConnectString(), zzyhz);
        zzZ("\\mmodsotable", odso.getTableName(), zzyhz);
        zzZ("\\mmodsosrc", odso.getDataSource(), zzyhz);
        zzZ(odso.getFieldMapDatas(), zzyhz);
        zzyhz.zzZ5("\\mmodsocoldelim", odso.getColumnDelimiter());
        zzyhz.zz5("\\mmodsofhdr", odso.getFirstRowContainsColumnNames());
        zzyhz.zzZ5("\\mmjdsotype", odso.getDataSourceType());
        zzZ(odso.getRecipientDatas(), zzyhz);
        zzyhz.zzYj3();
    }

    private static void zzZ(OdsoRecipientDataCollection odsoRecipientDataCollection, zzYHZ zzyhz) throws Exception {
        for (OdsoRecipientData odsoRecipientData : odsoRecipientDataCollection) {
            zzyhz.zzCC("\\*\\mmodsorecipdata");
            zzyhz.zz5("\\mmodsoactive", odsoRecipientData.getActive());
            zzyhz.zzt("\\mmodsohash", odsoRecipientData.getHash(), 0);
            zzyhz.zzt("\\mmodsocolumn", odsoRecipientData.getColumn(), 0);
            byte[] uniqueTag = odsoRecipientData.getUniqueTag();
            if (uniqueTag != null) {
                zzyhz.zzY6("\\mmodsouniquetag", com.aspose.words.internal.zzZO0.zzhU().zzZn(uniqueTag));
            }
            zzyhz.zzYj3();
        }
    }

    private static void zzZ(OdsoFieldMapDataCollection odsoFieldMapDataCollection, zzYHZ zzyhz) throws Exception {
        for (OdsoFieldMapData odsoFieldMapData : odsoFieldMapDataCollection) {
            zzyhz.zzCC("\\*\\mmodsofldmpdata");
            zzyhz.zzY6("\\mmodsoname", odsoFieldMapData.getName());
            zzyhz.zzY6("\\mmodsomappedname", odsoFieldMapData.getMappedName());
            zzyhz.zz5("\\mmodsodynaddr", odsoFieldMapData.zzYyh());
            zzyhz.zzCD(zzYEO.zznq(odsoFieldMapData.getType()));
            zzyhz.zzZ5("\\mmodsofmcolumn", odsoFieldMapData.getColumn());
            zzyhz.zzZ5("\\mmodsolid", odsoFieldMapData.zzTu());
            zzyhz.zzYj3();
        }
    }

    private static void zzZ(String str, String str2, zzYHZ zzyhz) throws Exception {
        if (com.aspose.words.internal.zzZKN.equals(str2, "")) {
            return;
        }
        zzyhz.zzY6(str, str2);
    }
}
