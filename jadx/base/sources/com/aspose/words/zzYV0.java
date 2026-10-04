package com.aspose.words;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYV0 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("activeRecord", "addressFieldName", "checkErrors", "connectString", "dataSource", "dataType", FirebaseAnalytics.Param.DESTINATION, "doNotSuppressBlankLines", "headerSource", "linkToQuery", "mailAsAttachment", "mailSubject", "mainDocumentType", "odso", "query", "viewMergedData", "defaultSQL", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "column", "uniqueTag", "hash", "colDelim", "fHdr", "fieldMapData", "recipientData", "src", "table", C18437z2.f56754h, "jdsoType", "udl", "filter", NoteMeta.PROPERTY_SORT_KEY, "dynamicAddress", "lid", "mappedName", "name");

    private static void zzX(zzYVB zzyvb, Odso odso) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        OdsoFieldMapData odsoFieldMapData = new OdsoFieldMapData();
        while (zzyu4ZzZsD.zzQ("fieldMapData")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 18) {
                odsoFieldMapData.zzsR(zzyu4ZzZsD.zzYyE());
            } else if (iZzTP != 27) {
                switch (iZzTP) {
                    case 32:
                        odsoFieldMapData.zzSs(zzyu4ZzZsD.zzYyD());
                        break;
                    case 33:
                        String strZzV = zzyu4ZzZsD.zzV("val", null);
                        odsoFieldMapData.zzRe(zzyvb.zzZmh() ? com.aspose.words.internal.zzBM.zzYx(strZzV) : com.aspose.words.internal.zzBM.zzYw(strZzV));
                        break;
                    case 34:
                        odsoFieldMapData.setMappedName(zzyu4ZzZsD.zzV("val", null));
                        break;
                    case 35:
                        odsoFieldMapData.setName(zzyu4ZzZsD.zzV("val", null));
                        break;
                    default:
                        zzyu4ZzZsD.zzk();
                        break;
                }
            } else {
                odsoFieldMapData.setType(zzZ2L.zzII(zzyu4ZzZsD.zzV("val", null)));
            }
        }
        odso.getFieldMapDatas().add(odsoFieldMapData);
    }

    private void zzY(zzYVB zzyvb, Odso odso) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ("odso")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 21:
                    odso.setColumnDelimiter((char) zzyu4ZzZsD.zzYyE());
                    break;
                case 22:
                    odso.setFirstRowContainsColumnNames(zzyu4ZzZsD.zzYyD());
                    break;
                case 23:
                    zzX(zzyvb, odso);
                    break;
                case 24:
                    zzZ(zzyvb, odso);
                    break;
                case 25:
                    odso.setDataSource(zzyvb.zzZmh() ? com.aspose.words.internal.zzZVR.zzWt(zzyvb.zzY9(zzyu4ZzZsD.zzV("id", null))) : zzyu4ZzZsD.zzV("val", null));
                    break;
                case 26:
                    odso.setTableName(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 27:
                case 28:
                    odso.setDataSourceType(zzZ2L.zzIJ(zzyu4ZzZsD.zzV("val", null)));
                    break;
                case 29:
                    odso.setUdlConnectString(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 30:
                case 31:
                    zzyu4ZzZsD.zzk();
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    public final void zzZ(zzYVB zzyvb, MailMergeSettings mailMergeSettings) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        mailMergeSettings.setMainDocumentType(1);
        while (zzyu4ZzZsD.zzQ("mailMerge")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 0:
                    mailMergeSettings.setActiveRecord(zzyu4ZzZsD.zzYyE());
                    break;
                case 1:
                    mailMergeSettings.setAddressFieldName(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 2:
                    mailMergeSettings.setCheckErrors(zzyu4ZzZsD.zzYyE());
                    break;
                case 3:
                    String strZzV = zzyu4ZzZsD.zzV("val", null);
                    if (!com.aspose.words.internal.zzZKN.zzU3(strZzV)) {
                        mailMergeSettings.setConnectString(strZzV);
                    }
                    break;
                case 4:
                    mailMergeSettings.setDataSource(zzyvb.zzZmh() ? zzyvb.zzY9(zzyu4ZzZsD.zzV("id", null)) : zzyu4ZzZsD.zzV("val", null));
                    break;
                case 5:
                    mailMergeSettings.setDataType(zzZ2L.zzIK(zzyu4ZzZsD.zzV("val", null)));
                    break;
                case 6:
                    mailMergeSettings.setDestination(zzZ2L.zzIL(zzyu4ZzZsD.zzV("val", null)));
                    break;
                case 7:
                    mailMergeSettings.setDoNotSupressBlankLines(zzyu4ZzZsD.zzYyD());
                    break;
                case 8:
                    mailMergeSettings.setHeaderSource(zzyvb.zzZmh() ? zzyvb.zzY9(zzyu4ZzZsD.zzV("id", null)) : zzyu4ZzZsD.zzV("val", null));
                    break;
                case 9:
                    mailMergeSettings.setLinkToQuery(zzyu4ZzZsD.zzYyD());
                    break;
                case 10:
                    mailMergeSettings.setMailAsAttachment(zzyu4ZzZsD.zzYyD());
                    break;
                case 11:
                    mailMergeSettings.setMailSubject(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 12:
                    mailMergeSettings.setMainDocumentType(zzZ2L.zzIM(zzyu4ZzZsD.zzV("val", null)));
                    break;
                case 13:
                    zzY(zzyvb, mailMergeSettings.getOdso());
                    break;
                case 14:
                    mailMergeSettings.setQuery(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 15:
                    mailMergeSettings.setViewMergedData(zzyu4ZzZsD.zzYyD());
                    break;
                case 16:
                    zzyu4ZzZsD.zzk();
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    public void zzZ(zzYVB zzyvb, Odso odso) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        OdsoRecipientData odsoRecipientData = new OdsoRecipientData();
        while (zzyu4ZzZsD.zzQ("recipientData")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 17:
                    odsoRecipientData.setActive(zzyu4ZzZsD.zzYyD());
                    break;
                case 18:
                    odsoRecipientData.setColumn(zzyu4ZzZsD.zzYyE());
                    break;
                case 19:
                    if (zzyvb.zzZmh()) {
                        odsoRecipientData.setUniqueTag(com.aspose.words.internal.zzZQB.zzVT(zzyu4ZzZsD.zzV("val", null)));
                    } else {
                        odsoRecipientData.setUniqueTag(com.aspose.words.internal.zzZO0.zzhU().getBytes(zzyu4ZzZsD.zzV("val", null)));
                    }
                    break;
                case 20:
                    odsoRecipientData.setHash(zzyu4ZzZsD.zzYyE());
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
        odso.getRecipientDatas().add(odsoRecipientData);
    }
}
