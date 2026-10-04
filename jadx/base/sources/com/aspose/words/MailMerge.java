package com.aspose.words;

import com.aspose.words.net.System.Data.DataRow;
import com.aspose.words.net.System.Data.DataSet;
import com.aspose.words.net.System.Data.DataTable;
import com.aspose.words.net.System.Data.DataView;
import com.aspose.words.net.System.Data.IDataReader;
import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class MailMerge {
    private static zzZAF[] zzY65 = new zzZAF[0];
    private zzYJN zzY68;
    private HashMap<Node, String> zzY6b;
    private boolean zzY6c;
    private MappedDataFieldCollection zzY6d;
    private boolean zzY6e;
    private boolean zzY6f;
    private boolean zzY6g;
    private IMailMergeCallback zzY6h;
    private IFieldMergingCallback zzY6i;
    private boolean zzY6j;
    private boolean zzY6k;
    private boolean zzY6l;
    private boolean zzY6m;
    private boolean zzY6n;
    private boolean zzY6o;
    private int zzY6p;
    private boolean zzY6q;
    private boolean zzYHU;
    private zzYD zzZCJ;
    private Document zzZEY;
    private zzTT zzY6a = new zzTT();
    private zzZ2K zzY69 = new zzZ2K();
    private String zzY67 = "TableStart";
    private String zzY66 = "TableEnd";

    public MailMerge(Document document) {
        setTrimWhitespaces(true);
        setCleanupOptions(0);
        setCleanupParagraphsWithPunctuationMarks(true);
        setUseWholeParagraphAsRegion(true);
        setRetainFirstSectionStart(true);
        setRestartListsAtEachSection(true);
        this.zzZEY = document;
        this.zzY6a.zzZ(this.zzY69);
        this.zzY68 = new zzYJN(this.zzZEY);
    }

    private void zzTu(boolean z) throws Exception {
        this.zzY6c = z;
        this.zzY6q = true;
        if (getUseNonMergeFields()) {
            ArrayList<zzY6A> arrayListZzZV = zzY69.zzZV(this.zzZEY);
            if (getPreserveUnusedTags()) {
                this.zzY68.zzZx(arrayListZzZV);
                this.zzY6a.zzZ(this.zzY68);
            }
            zzYK8();
        }
        this.zzY69.zzj(this.zzZEY);
        this.zzZCJ = new zzYD(this.zzZEY);
    }

    private void zzY(zzZAF zzzaf) throws Exception {
        if (zzzaf == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: dataSource");
        }
        zzY81 zzy81 = new zzY81(this.zzZEY);
        try {
            zzTu(true);
            zzZ2G zzz2gZzYR = zzZ2F.zzYR(this.zzZEY);
            if (getMergeDuplicateRegions()) {
                zzzaf = zzZ2P.zzZ(zzzaf, this, zzz2gZzYR);
            }
            if (getMergeWholeDocument()) {
                new zzY1X(this.zzZEY).zzZ((zzZAF) new zzZRQ(zzzaf, getMergeDuplicateRegions()), zzY65, true);
            } else {
                boolean z = false;
                for (zzZ2H zzz2h : zzz2gZzYR) {
                    if (zzz2h.isDefined()) {
                        if (!com.aspose.words.internal.zzZYD.zzi(zzz2h.getName(), zzzaf.getTableName())) {
                            zzY(zzz2h);
                        } else if (!z) {
                            zzz2h.zzZ(zzzaf, zzY65, true);
                            z = true;
                        } else if (getMergeDuplicateRegions()) {
                            zzzaf.reset();
                            zzz2h.zzZ(zzzaf, zzY65, true);
                        } else {
                            zzY(zzz2h);
                        }
                    }
                }
            }
            zzYKh();
            zzy81.dispose();
        } catch (Throwable th) {
            zzy81.dispose();
            throw th;
        }
    }

    private void zzYK8() {
        if (getMailMergeCallback() != null) {
            getMailMergeCallback().tagsReplaced();
        }
    }

    private void zzYKh() throws Exception {
        this.zzZEY.getMailMergeSettings().clear();
        this.zzY6b = null;
        this.zzY69.zzYJT();
        if (getUseNonMergeFields() && getPreserveUnusedTags()) {
            this.zzY68.zzYlT();
            this.zzY6a.zzY(this.zzY68);
        }
        this.zzY6q = false;
        this.zzZCJ.clear();
        this.zzZCJ = null;
        this.zzZEY.zzZpV().zzYWp = 0;
        if (getRestartListsAtEachSection()) {
            Iterator<zzZ4J> it = this.zzZEY.getLists().zzYOX().iterator();
            while (it.hasNext()) {
                it.next().isRestartAtEachSection(true);
            }
        }
    }

    private void zzYKi() {
        Section firstSection;
        if (getRetainFirstSectionStart() || (firstSection = this.zzZEY.getFirstSection()) == null) {
            return;
        }
        int sectionStart = firstSection.getPageSetup().getSectionStart();
        if (sectionStart == 0 || sectionStart == 1) {
            firstSection.getPageSetup().setSectionStart(2);
        }
    }

    private static void zzYP(String str, String str2) {
        com.aspose.words.internal.zzZ4.zzU(str, "tag");
        if (com.aspose.words.internal.zzZYD.zzXh(str)) {
            throw new IllegalArgumentException("A mail merge region tag can not contain only whitespaces.\r\nParameter name: tag");
        }
        if (FieldMergeField.zzLT(str)) {
            throw new IllegalArgumentException("A mail merge region tag can not contain reserved separating characters.\r\nParameter name: tag");
        }
        if (com.aspose.words.internal.zzZYD.zzh(str, str2)) {
            throw new IllegalArgumentException("A mail merge region tag can not be equal to its pair.\r\nParameter name: tag");
        }
    }

    private Node zzYS(Node node) {
        return this.zzY69.zzYS(node);
    }

    private void zzZ(zzZAF zzzaf) throws Exception {
        if (zzzaf == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: dataSource");
        }
        zzY81 zzy81 = new zzY81(this.zzZEY);
        try {
            zzTu(false);
            zzYKi();
            if (new zzZ2H(this.zzZEY).zzZ(zzzaf, zzY65, false) == 0) {
                this.zzZEY.ensureMinimum();
            }
            zzYKh();
            this.zzZEY.zzZq9().add(25);
            zzy81.dispose();
        } catch (Throwable th) {
            zzy81.dispose();
            throw th;
        }
    }

    public void deleteFields() throws Exception {
        zzY81 zzy81 = new zzY81(this.zzZEY);
        try {
            zzZOQ.zzZ(this.zzZEY, 59, 41);
        } finally {
            zzy81.dispose();
        }
    }

    public void execute(IMailMergeDataSource iMailMergeDataSource) throws Exception {
        zzZ(zzZ2N.zzZ(iMailMergeDataSource));
    }

    public void executeWithRegions(IMailMergeDataSource iMailMergeDataSource) throws Exception {
        zzY(zzZ2N.zzZ(iMailMergeDataSource));
    }

    public int getCleanupOptions() {
        return this.zzY6p;
    }

    public boolean getCleanupParagraphsWithPunctuationMarks() {
        return this.zzY6o;
    }

    public final Document getDocument() {
        return this.zzZEY;
    }

    public IFieldMergingCallback getFieldMergingCallback() {
        return this.zzY6i;
    }

    public String[] getFieldNames() throws Exception {
        ArrayList<Field> arrayListZzZS = zzZQF.zzZS(this.zzZEY);
        ArrayList arrayList = new ArrayList(arrayListZzZS.size());
        for (Field field : arrayListZzZS) {
            FieldMergeField fieldMergeField = (FieldMergeField) com.aspose.words.internal.zzZKW.zzZ(field, FieldMergeField.class);
            if (fieldMergeField != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, FieldMergeField.zzZa(fieldMergeField.getPrefix(), fieldMergeField.getFieldNameNoPrefix()));
            } else {
                zzZAA zzzaaZzL = FieldMergeField.zzL(field);
                if (zzzaaZzL != null) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzzaaZzL.getMergeFieldName());
                } else {
                    zzZAT zzzat = (zzZAT) com.aspose.words.internal.zzZKW.zzZ(field, zzZAT.class);
                    if (zzzat != null) {
                        com.aspose.words.internal.zzZQG.zzY(arrayList, zzzat.getFieldNames());
                    }
                }
            }
        }
        if (getUseNonMergeFields()) {
            Iterator<zzZPZ> it = zzY69.zzZU(this.zzZEY).iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, it.next().zzZd3());
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String[] getFieldNamesForRegion(String str) throws Exception {
        return getFieldNamesForRegion(str, 0);
    }

    public IMailMergeCallback getMailMergeCallback() {
        return this.zzY6h;
    }

    public MappedDataFieldCollection getMappedDataFields() {
        MappedDataFieldCollection mappedDataFieldCollection = this.zzY6d;
        if (mappedDataFieldCollection != null) {
            return mappedDataFieldCollection;
        }
        MappedDataFieldCollection mappedDataFieldCollection2 = new MappedDataFieldCollection();
        this.zzY6d = mappedDataFieldCollection2;
        return mappedDataFieldCollection2;
    }

    public boolean getMergeDuplicateRegions() {
        return this.zzYHU;
    }

    public boolean getMergeWholeDocument() {
        return this.zzY6l;
    }

    public boolean getPreserveUnusedTags() {
        return this.zzY6m;
    }

    public String getRegionEndTag() {
        return this.zzY66;
    }

    public String getRegionStartTag() {
        return this.zzY67;
    }

    public ArrayList<MailMergeRegionInfo> getRegionsByName(String str) throws Exception {
        return zzZ(getRegionsHierarchy().getRegions(), new ArrayList(), str);
    }

    public MailMergeRegionInfo getRegionsHierarchy() throws Exception {
        ArrayList<Object> arrayListZzZ = zzZQE.zzZ(this.zzZEY, getUseNonMergeFields());
        MailMergeRegionInfo mailMergeRegionInfo = new MailMergeRegionInfo();
        MailMergeRegionInfo mailMergeRegionInfoZzZ = mailMergeRegionInfo;
        for (Object obj : arrayListZzZ) {
            Field field = (Field) com.aspose.words.internal.zzZKW.zzZ(obj, Field.class);
            if (field != null) {
                mailMergeRegionInfoZzZ = zzZ(field, mailMergeRegionInfoZzZ);
            } else {
                MustacheTag mustacheTag = (MustacheTag) com.aspose.words.internal.zzZKW.zzZ(obj, MustacheTag.class);
                if (mustacheTag == null) {
                    throw new IllegalStateException();
                }
                mailMergeRegionInfoZzZ = zzZ(mustacheTag, mailMergeRegionInfoZzZ);
            }
        }
        mailMergeRegionInfoZzZ.zztF();
        return mailMergeRegionInfo;
    }

    public boolean getRestartListsAtEachSection() {
        return this.zzY6j;
    }

    public boolean getRetainFirstSectionStart() {
        return this.zzY6e;
    }

    public boolean getTrimWhitespaces() {
        return this.zzY6g;
    }

    public boolean getUnconditionalMergeFieldsAndRegions() {
        return this.zzY6f;
    }

    public boolean getUseNonMergeFields() {
        return this.zzY6n;
    }

    public boolean getUseWholeParagraphAsRegion() {
        return this.zzY6k;
    }

    public void setCleanupOptions(int i) {
        this.zzY6p = i;
    }

    public void setCleanupParagraphsWithPunctuationMarks(boolean z) {
        this.zzY6o = z;
    }

    public void setFieldMergingCallback(IFieldMergingCallback iFieldMergingCallback) {
        this.zzY6i = iFieldMergingCallback;
    }

    public void setMailMergeCallback(IMailMergeCallback iMailMergeCallback) {
        this.zzY6h = iMailMergeCallback;
    }

    public void setMergeDuplicateRegions(boolean z) {
        this.zzYHU = z;
    }

    public void setMergeWholeDocument(boolean z) {
        this.zzY6l = z;
    }

    public void setPreserveUnusedTags(boolean z) {
        this.zzY6m = z;
    }

    public void setRegionEndTag(String str) {
        zzYP(str, this.zzY67);
        this.zzY66 = str;
    }

    public void setRegionStartTag(String str) {
        zzYP(str, this.zzY66);
        this.zzY67 = str;
    }

    public void setRestartListsAtEachSection(boolean z) {
        this.zzY6j = z;
    }

    public void setRetainFirstSectionStart(boolean z) {
        this.zzY6e = z;
    }

    public void setTrimWhitespaces(boolean z) {
        this.zzY6g = z;
    }

    public void setUnconditionalMergeFieldsAndRegions(boolean z) {
        this.zzY6f = z;
    }

    public void setUseNonMergeFields(boolean z) {
        this.zzY6n = z;
    }

    public void setUseWholeParagraphAsRegion(boolean z) {
        this.zzY6k = z;
    }

    public final String zzIX(String str) {
        String str2;
        MappedDataFieldCollection mappedDataFieldCollection = this.zzY6d;
        return (mappedDataFieldCollection == null || (str2 = mappedDataFieldCollection.get(str)) == null) ? str : str2;
    }

    public final void zzT(Node node, String str) {
        if (this.zzY6b == null) {
            this.zzY6b = new HashMap<>();
        }
        this.zzY6b.put(zzYS(node), str);
    }

    public final boolean zzYK9() {
        return (getCleanupOptions() & 8) == 8;
    }

    public final boolean zzYKa() {
        return (getCleanupOptions() & 32) == 32;
    }

    public final boolean zzYKb() {
        return (getCleanupOptions() & 4) == 4;
    }

    public final boolean zzYKc() {
        return (getCleanupOptions() & 1) == 1;
    }

    public final boolean zzYKd() {
        return this.zzY6c && (getCleanupOptions() & 2) == 2;
    }

    public final zzZA5 zzYKe() {
        return this.zzY6a;
    }

    public final boolean zzYKf() {
        return this.zzY6q;
    }

    public final boolean zzYKg() {
        return (this.zzY6q && zzYKb()) ? false : true;
    }

    public final zzYD zzZau() {
        return this.zzZCJ;
    }

    public void execute(String[] strArr, Object[] objArr) throws Exception {
        zzZ(new zzZ2Q(strArr, objArr));
    }

    public void executeWithRegions(IMailMergeDataSourceRoot iMailMergeDataSourceRoot) throws Exception {
        zzZ(zzZ2O.zzZ(iMailMergeDataSourceRoot));
    }

    public String[] getFieldNamesForRegion(String str, int i) throws Exception {
        ArrayList<MailMergeRegionInfo> regionsByName = getRegionsByName(str);
        MailMergeRegionInfo mailMergeRegionInfo = i < regionsByName.size() ? regionsByName.get(i) : null;
        if (mailMergeRegionInfo == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList(mailMergeRegionInfo.getMustacheTags().size() + mailMergeRegionInfo.getFields().size());
        for (Field field : mailMergeRegionInfo.getFields()) {
            FieldMergeField fieldMergeField = (FieldMergeField) com.aspose.words.internal.zzZKW.zzZ(field, FieldMergeField.class);
            if (fieldMergeField != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, FieldMergeField.zzZa(fieldMergeField.getPrefix(), fieldMergeField.getFieldNameNoPrefix()));
            } else {
                zzZAA zzzaaZzL = FieldMergeField.zzL(field);
                if (zzzaaZzL != null) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzzaaZzL.getMergeFieldName());
                }
            }
        }
        Iterator<MustacheTag> it = mailMergeRegionInfo.getMustacheTags().iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, it.next().zzYBs().zzZd3());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public void execute(DataTable dataTable) throws Exception {
        if (dataTable != null) {
            zzZ(new zzZ2S(dataTable));
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: table");
    }

    public void executeWithRegions(DataSet dataSet) throws Exception {
        if (dataSet != null) {
            zzZ(new zzZ2T(dataSet));
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dataSet");
    }

    public void execute(IDataReader iDataReader) throws Exception {
        if (iDataReader != null) {
            zzZ(new zzZ2W(iDataReader, ""));
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dataReader");
    }

    public void executeWithRegions(DataTable dataTable) throws Exception {
        if (dataTable != null) {
            zzY(new zzZ2S(dataTable));
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dataTable");
    }

    public void execute(DataView dataView) throws Exception {
        if (dataView != null) {
            zzZ(new zzZ2R(dataView));
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dataView");
    }

    public void executeWithRegions(DataView dataView) throws Exception {
        if (dataView != null) {
            zzY(new zzZ2R(dataView));
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dataView");
    }

    public void execute(DataRow dataRow) throws Exception {
        if (dataRow != null) {
            zzZ(new zzZ2U(dataRow));
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: row");
    }

    public void executeWithRegions(IDataReader iDataReader, String str) throws Exception {
        if (iDataReader != null) {
            zzY(new zzZ2W(iDataReader, str));
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dataReader");
    }

    private void zzZ(zzZAE zzzae) throws Exception {
        if (zzzae != null) {
            zzY81 zzy81 = new zzY81(this.zzZEY);
            try {
                zzTu(true);
                if (getMergeWholeDocument()) {
                    new zzY1X(this.zzZEY).zzZ((zzZAF) new zzZRP(zzzae), zzY65, true);
                } else {
                    for (zzZ2H zzz2h : zzZ2F.zzYR(this.zzZEY)) {
                        zzZAF zzzafZzJD = zzzae.zzJD(zzz2h.getName());
                        if (zzzafZzJD != null) {
                            zzz2h.zzZ(zzzafZzJD, zzY65, true);
                        } else {
                            zzY(zzz2h);
                        }
                    }
                }
                zzYKh();
                zzy81.dispose();
                return;
            } catch (Throwable th) {
                zzy81.dispose();
                throw th;
            }
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dataSourceRoot");
    }

    private void zzY(zzZ2H zzz2h) throws Exception {
        if (zzYKd()) {
            zzz2h.remove();
        }
    }

    private static ArrayList<MailMergeRegionInfo> zzZ(Iterable<MailMergeRegionInfo> iterable, ArrayList<MailMergeRegionInfo> arrayList, String str) {
        for (MailMergeRegionInfo mailMergeRegionInfo : iterable) {
            if (com.aspose.words.internal.zzZYD.zzi(mailMergeRegionInfo.getName(), str)) {
                arrayList.add(mailMergeRegionInfo);
            }
            zzZ(mailMergeRegionInfo.getRegions(), arrayList, str);
        }
        return arrayList;
    }

    private static MailMergeRegionInfo zzZ(Field field, MailMergeRegionInfo mailMergeRegionInfo) {
        int iZz6 = zzZ2E.zz6(field);
        if (iZz6 == 0) {
            mailMergeRegionInfo.getFields().add(field);
            return mailMergeRegionInfo;
        }
        if (iZz6 == 1) {
            return new MailMergeRegionInfo((FieldMergeField) field, mailMergeRegionInfo);
        }
        if (iZz6 == 2) {
            mailMergeRegionInfo.zzY((FieldMergeField) field);
            return mailMergeRegionInfo.getParentRegion();
        }
        throw new IllegalArgumentException();
    }

    private static MailMergeRegionInfo zzZ(MustacheTag mustacheTag, MailMergeRegionInfo mailMergeRegionInfo) {
        int iZzvc = zzZ2E.zzvc(mustacheTag.zzYBs().zzZd4());
        if (iZzvc == 0) {
            mailMergeRegionInfo.getMustacheTags().add(mustacheTag);
            return mailMergeRegionInfo;
        }
        if (iZzvc == 1) {
            return new MailMergeRegionInfo(mustacheTag, mailMergeRegionInfo);
        }
        if (iZzvc == 2) {
            mailMergeRegionInfo.zzZ(mustacheTag);
            return mailMergeRegionInfo.getParentRegion();
        }
        throw new IllegalArgumentException();
    }

    public final void zzZ(FieldMergingArgs fieldMergingArgs) throws Exception {
        if (getFieldMergingCallback() != null) {
            getFieldMergingCallback().fieldMerging(fieldMergingArgs);
            fieldMergingArgs.getField().zzZgn().zzZbq();
        }
    }

    public final void zzZ(ImageFieldMergingArgs imageFieldMergingArgs) throws Exception {
        if (getFieldMergingCallback() != null) {
            getFieldMergingCallback().imageFieldMerging(imageFieldMergingArgs);
            imageFieldMergingArgs.getField().zzZgn().zzZbq();
        }
    }

    public final boolean zzZ(Node node, Ref<String> ref) {
        ref.set(null);
        if (this.zzY6b == null) {
            return false;
        }
        Node nodeZzYS = zzYS(node);
        if (!this.zzY6b.containsKey(nodeZzYS)) {
            return false;
        }
        ref.set(this.zzY6b.get(nodeZzYS));
        return true;
    }
}
