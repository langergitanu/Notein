package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGJ extends zzYHS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\mmmaintypecatalog", "\\mmmaintypeenvelopes", "\\mmmaintypelabels", "\\mmmaintypeletters", "\\mmmaintypeemail", "\\mmmaintypefax", "\\mmdatatypeaccess", "\\mmdatatypeexcel", "\\mmdatatypeqt", "\\mmdatatypeodbc", "\\mmdatatypeodso", "\\mmdatatypefile", "\\mmdestnewdoc", "\\mmdestprinter", "\\mmdestemail", "\\mmdestfax", "\\mmlinktoquery", "\\mmdefaultsql", "\\mmblanklinks", "\\mmreccur", "\\mmerrors", "\\mmattach", "\\mmshowdata");
    private MailMergeSettings zzXuF;

    public zzYGJ(zzYFT zzyft) {
        super(zzyft);
        this.zzXuF = getDocument().zzZpV().zzYWd;
    }

    private int zzYhQ() {
        return this.zzXw4.zzYgo().zzYiL().zzYiN().getType();
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.zzXuF.setMainDocumentType(zzYEO.zzBB(zzyet.getName()));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                this.zzXuF.setDataType(zzYEO.zzBA(zzyet.getName()));
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                this.zzXuF.setDestination(zzYEO.zzBz(zzyet.getName()));
                break;
            case 16:
                this.zzXuF.setLinkToQuery(true);
                break;
            case 17:
                break;
            case 18:
                this.zzXuF.setDoNotSupressBlankLines(true);
                break;
            case 19:
                this.zzXuF.setActiveRecord(zzyet.zzYeT());
                break;
            case 20:
                this.zzXuF.setCheckErrors(zzyet.zzYeT());
                break;
            case 21:
                this.zzXuF.setMailAsAttachment(true);
                break;
            case 22:
                this.zzXuF.setViewMergedData(true);
                break;
            default:
                super.zzT(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        switch (zzYhQ()) {
            case 237:
                this.zzXuF.setConnectString(com.aspose.words.internal.zzZO0.zzhU().zzZn(zzyet.zzYeZ()));
                break;
            case 238:
                if (com.aspose.words.internal.zzZKN.equals(this.zzXuF.getConnectString(), "")) {
                    this.zzXuF.setConnectString(zzyet.zzYR());
                }
                break;
            case 239:
                this.zzXuF.setQuery(zzyet.zzYR());
                break;
            case 240:
                this.zzXuF.setDataSource(zzyet.zzYR());
                break;
            case 241:
                this.zzXuF.setHeaderSource(zzyet.zzYR());
                break;
            case 242:
                this.zzXuF.setAddressFieldName(zzyet.zzYR());
                break;
            case 243:
                this.zzXuF.setMailSubject(zzyet.zzYR());
                break;
            default:
                super.zzY(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        switch (zzyhp.getType()) {
            case 237:
            case 238:
            case 239:
            case 240:
            case 241:
            case 242:
            case 243:
                return this;
            case 244:
                return new zzYGI(this.zzXw4);
            default:
                return super.zzZ(zzyhp);
        }
    }
}
