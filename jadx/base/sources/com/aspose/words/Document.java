package com.aspose.words;

import android.graphics.Canvas;
import android.graphics.PointF;
import com.aspose.slides.PatternStyle;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class Document extends DocumentBase<Node> implements zzZ8S, zzZ9E {
    private static char[] zzYTl = {IOUtils.DIR_SEPARATOR_UNIX, IOUtils.DIR_SEPARATOR_WINDOWS};
    private zzYYZ zzYSA;
    private zzYNB zzYSB;
    private Watermark zzYSC;
    private TaskPaneCollection zzYSD;
    private int zzYSE;
    private zzZYZ zzYSF;
    private FontSettings zzYSG;
    private com.aspose.words.internal.zzZQ9 zzYSH;
    private zzZV7 zzYSI;
    private int zzYSJ;
    private int zzYSK;
    private boolean zzYSL;
    long zzYSM;
    private zzYII zzYSN;
    private FieldOptions zzYSO;
    private int zzYSP;
    private HashMap<FieldStart, zzZPW> zzYSQ;
    private RevisionCollection zzYSR;
    private EndnoteOptions zzYSS;
    private FootnoteOptions zzYST;
    private com.aspose.words.internal.zzZYG<Object> zzYSU;
    private Map<ShapeBase, zzX0> zzYSV;
    private zzYNA zzYSW;
    private MailMerge zzYSX;
    private LayoutOptions zzYSY;
    private zzZ6R zzYSZ;
    private Bibliography zzYSy;
    private zzZ2B zzYSz;
    private zzY3G zzYT0;
    private int zzYT1;
    private String zzYT2;
    private VbaProject zzYT3;
    private int zzYT4;
    private ArrayList<zzZ7B> zzYT5;
    private ArrayList<zzP> zzYT6;
    private byte[] zzYT7;
    private byte[] zzYT8;
    private com.aspose.words.internal.zzZOR zzYT9;
    private byte[] zzYTa;
    private Frameset zzYTb;
    private DigitalSignatureCollection zzYTc;
    private CustomPartCollection zzYTd;
    private CustomXmlPartCollection zzYTe;
    private Theme zzYTf;
    private GlossaryDocument zzYTg;
    private CustomDocumentProperties zzYTh;
    private BuiltInDocumentProperties zzYTi;
    private zzZ5L zzYTj;
    private zzZOS zzYTk;
    private zzYO3 zzZ88;
    private SectionCollection zzZB0;
    private String zzZp0;
    private String zzZwV;

    public Document(int i) throws Exception {
        this.zzYTi = new BuiltInDocumentProperties();
        this.zzYTe = new CustomXmlPartCollection();
        this.zzYTd = new CustomPartCollection();
        this.zzYTc = new DigitalSignatureCollection();
        this.zzYSZ = new zzZ6R();
        this.zzYSY = new LayoutOptions();
        this.zzYSP = 256000000;
        this.zzYSM = 0L;
        this.zzYSH = com.aspose.words.internal.zzZQ9.zz35;
        this.zzYSE = 0;
        this.zzYSD = new TaskPaneCollection();
        this.zzYTj = new zzZ5L();
        if (i != 1) {
            return;
        }
        zzX(null);
        zzZqm();
    }

    private void zzFX(int i) throws Exception {
        if (i < 0 || i > getPageCount() - 1) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: " + com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{97, 112, 101, 103, 110, 73, 101, 100, 120}));
        }
        if (i + 1 <= getPageCount()) {
            return;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: " + com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{97, 112, 101, 103, 111, 67, 110, 117, 116}));
    }

    private com.aspose.words.internal.zzZH zzFY(int i) throws Exception {
        return zzZ(i, new zzZ72());
    }

    private void zzFZ(int i) {
        if (i == 2 && getSections().getCount() == 1) {
            getFirstSection().zzYvR().remove(2390);
        }
    }

    private void zzW(String str, com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzYSL = true;
        this.zzYSI = new zzZV7(str, zzzq9);
    }

    private void zzX(LoadOptions loadOptions) throws Exception {
        hasChildNodes();
        com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{115, 65, 111, 112, 101, 115, 87, PatternStyle.Divot, 114, 111, 115, 100, 82, PatternStyle.Divot, 115, 101, 117, 111, 99, 114, 115, 101, 66, PatternStyle.Divot, 97, 108, 107, 110, 100, PatternStyle.Divot, 99, 111}), Document.class);
        try {
            LoadOptions loadOptions2 = new LoadOptions();
            loadOptions2.setLoadFormat(10);
            loadOptions2.zzUF(true);
            loadOptions2.setProgressCallback(loadOptions != null ? loadOptions.getProgressCallback() : null);
            zzZ(zzzopZzW, loadOptions2);
            if (zzzopZzW != null) {
                zzzopZzW.close();
            }
            getBuiltInDocumentProperties().setAuthor("");
            getBuiltInDocumentProperties().setCompany("");
            BuiltInDocumentProperties builtInDocumentProperties = getBuiltInDocumentProperties();
            com.aspose.words.internal.zzZQ9 zzzq9 = com.aspose.words.internal.zzZQ9.zz35;
            builtInDocumentProperties.zzB(zzzq9);
            getBuiltInDocumentProperties().setLastSavedBy("");
            getBuiltInDocumentProperties().zzz(zzzq9);
            getBuiltInDocumentProperties().setNameOfApplication("Aspose.Words");
            getBuiltInDocumentProperties().setRevisionNumber(1);
            getStyles().zzY2U();
            zzZpV().zzYVg.setUICompat97To2003(false);
            getFontInfos().setEmbedSystemFonts(false);
            zzZpV().zzYWx = false;
        } catch (Throwable th) {
            if (zzzopZzW != null) {
                zzzopZzW.close();
            }
            throw th;
        }
    }

    private void zzZqJ() {
        if (this.zzYTf == null) {
            zzY(Theme.zzXVL().zzXVK());
        }
    }

    private void zzZqd() {
        zzZ2B zzz2b = new zzZ2B(this);
        this.zzYSz = zzz2b;
        zzZ(zzz2b);
    }

    private void zzZqm() {
        Iterator<T> it = getSections().iterator();
        while (it.hasNext()) {
            ((Section) it.next()).zzYvR().zzZqm();
        }
    }

    private void zzZqq() throws Exception {
        com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{112, 85, 97, 100, 101, 116, 105, 70, 108, 101, 115, 100, 101, 66, 111, 102, 101, 114, 97, 83, 101, 118, 115, 32, 97, 116, 116, 114, 100, 101, PatternStyle.Divot});
        zzY81 zzy81 = new zzY81(this);
        try {
            zzZOQ.zzZr(this);
            zzy81.dispose();
            com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{112, 85, 97, 100, 101, 116, 105, 70, 108, 101, 115, 100, 101, 66, 111, 102, 101, 114, 97, 83, 101, 118, 102, 32, 110, 105, 115, 105, 101, 104, PatternStyle.Divot, 100});
        } catch (Throwable th) {
            zzy81.dispose();
            throw th;
        }
    }

    private void zzZqt() {
        if (getTrackRevisions()) {
            return;
        }
        setTrackRevisions(getProtectionType() == 0);
    }

    private void zzZqu() {
        Iterator<T> it = getChildNodes(28, true).iterator();
        while (it.hasNext()) {
            ((StructuredDocumentTag) it.next()).getXmlMapping().zzXQJ();
        }
    }

    private void zzZu(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        this.zzYSA.zzXy(zzzop.getPosition());
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    public void acceptAllRevisions() throws Exception {
        getRevisions().acceptAll();
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitDocumentEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitDocumentStart(this);
    }

    @Override // com.aspose.words.zzZ8S
    @ReservedForInternalUse
    @Deprecated
    public void add(Shape shape) throws Exception {
        getFirstSection().zzY(shape, true);
        for (int i = 1; i < getSections().getCount(); i++) {
            getSections().get(i).zzY(shape, false);
        }
        this.zzYTj.add(27);
    }

    public void appendDocument(Document document, int i) {
        appendDocument(document, i, null);
    }

    public void cleanup() throws Exception {
        cleanup(new CleanupOptions());
    }

    @Override // com.aspose.words.zzZ9E
    @ReservedForInternalUse
    @Deprecated
    public void clearSectionAttrs() {
        zzZpV().zzYVh.clearSectionAttrs();
        Iterator<T> it = getSections().iterator();
        while (it.hasNext()) {
            ((Section) it.next()).clearSectionAttrs();
        }
    }

    public void compare(Document document, String str, Date date) throws Exception {
        zzZ(document, str, com.aspose.words.internal.zzZQ9.zzZ(date));
    }

    public void copyStylesFromTemplate(String str) throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzX0 = com.aspose.words.internal.zzZXR.zzX0(str);
        try {
            copyStylesFromTemplate(new Document(zzzopZzX0, null, false));
        } finally {
            if (zzzopZzX0 != null) {
                zzzopZzX0.close();
            }
        }
    }

    public Document deepClone() {
        return (Document) deepClone(true);
    }

    public void ensureMinimum() {
        getStyles().ensureMinimum();
        Section firstSection = getFirstSection();
        if (firstSection == null) {
            firstSection = (Section) appendChild(new Section(this));
        }
        firstSection.ensureMinimum();
    }

    public void expandTableStylesToDirectFormatting() throws Exception {
        zzY6W zzy6w = new zzY6W();
        Iterator<T> it = getChildNodes(5, true).iterator();
        while (it.hasNext()) {
            zzy6w.zz6((Table) it.next());
        }
    }

    public Document extractPages(int i, int i2) throws Exception {
        int i3 = i + 1;
        int i4 = (i2 + i3) - 1;
        if (this.zzYSB == null) {
            this.zzYSB = new zzYNB(this);
        }
        return this.zzYSB.extractPages(i3, i4);
    }

    @Override // com.aspose.words.zzZ9E
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedSectionAttr(int i) {
        return zzYCZ.zzOt(i);
    }

    @Override // com.aspose.words.zzZ9E
    @ReservedForInternalUse
    @Deprecated
    public Object fetchSectionAttr(int i) {
        Object directSectionAttr = getDirectSectionAttr(i);
        return directSectionAttr != null ? directSectionAttr : fetchInheritedSectionAttr(i);
    }

    @Override // com.aspose.words.zzZ8S
    @ReservedForInternalUse
    @Deprecated
    public Shape get() {
        HeaderFooter byHeaderFooterType = getFirstSection().getHeadersFooters().getByHeaderFooterType(1);
        if (byHeaderFooterType == null) {
            return null;
        }
        for (Shape shape : byHeaderFooterType.zzY4A()) {
            if (shape.zzY98()) {
                return shape;
            }
        }
        return null;
    }

    public String getAttachedTemplate() {
        return zzZpV().zzYWn;
    }

    public boolean getAutomaticallyUpdateStyles() {
        return zzZpV().zzYWm;
    }

    public final String getBaseUri() {
        return this.zzZp0;
    }

    public Bibliography getBibliography() throws Exception {
        Bibliography bibliography = this.zzYSy;
        if (bibliography != null) {
            return bibliography;
        }
        Bibliography bibliography2 = new Bibliography(this);
        this.zzYSy = bibliography2;
        return bibliography2;
    }

    public BuiltInDocumentProperties getBuiltInDocumentProperties() {
        return this.zzYTi;
    }

    public CompatibilityOptions getCompatibilityOptions() {
        return zzZpV().zzYVg;
    }

    public int getCompliance() {
        zzYO3 zzyo3 = this.zzZ88;
        if (zzyo3 == null) {
            return 0;
        }
        int compliance = zzyo3.getCompliance();
        int i = 1;
        if (compliance != 1) {
            i = 2;
            if (compliance != 2) {
                return 0;
            }
        }
        return i;
    }

    public CustomDocumentProperties getCustomDocumentProperties() {
        if (this.zzYTh == null) {
            this.zzYTh = new CustomDocumentProperties(this);
        }
        return this.zzYTh;
    }

    public CustomXmlPartCollection getCustomXmlParts() {
        return this.zzYTe;
    }

    public double getDefaultTabStop() {
        return ((double) zzZpV().zzYW4) / 20.0d;
    }

    public DigitalSignatureCollection getDigitalSignatures() {
        return this.zzYTc;
    }

    @Override // com.aspose.words.zzZ9E
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectSectionAttr(int i) {
        return zzZpV().zzYVh.getDirectSectionAttr(i);
    }

    public EndnoteOptions getEndnoteOptions() {
        if (this.zzYSS == null) {
            this.zzYSS = new EndnoteOptions(this);
        }
        return this.zzYSS;
    }

    public FieldOptions getFieldOptions() {
        if (this.zzYSO == null) {
            this.zzYSO = new FieldOptions(this);
        }
        return this.zzYSO;
    }

    public Section getFirstSection() {
        return (Section) getChild(2, 0, false);
    }

    public FontSettings getFontSettings() {
        return this.zzYSG;
    }

    public FootnoteOptions getFootnoteOptions() {
        if (this.zzYST == null) {
            this.zzYST = new FootnoteOptions(this);
        }
        return this.zzYST;
    }

    public Frameset getFrameset() {
        return this.zzYTb;
    }

    public GlossaryDocument getGlossaryDocument() {
        return this.zzYTg;
    }

    public boolean getGrammarChecked() {
        return zzZpV().zzYWo != 0;
    }

    public HyphenationOptions getHyphenationOptions() {
        return zzZpV().zzYW3;
    }

    public boolean getIncludeTextboxesFootnotesEndnotesInStat() {
        return !zzZpV().zzYVa;
    }

    public int getJustificationMode() {
        return zzZpV().zzYVM;
    }

    public Section getLastSection() {
        return (Section) getChild(2, -1, false);
    }

    public LayoutOptions getLayoutOptions() {
        return this.zzYSY;
    }

    public MailMerge getMailMerge() {
        if (this.zzYSX == null) {
            this.zzYSX = new MailMerge(this);
        }
        return this.zzYSX;
    }

    public MailMergeSettings getMailMergeSettings() {
        return zzZpV().zzYWd;
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 1;
    }

    public String getOriginalFileName() {
        return this.zzZwV;
    }

    public int getOriginalLoadFormat() {
        return this.zzYT1;
    }

    public CustomPartCollection getPackageCustomParts() {
        return this.zzYTd;
    }

    public int getPageCount() throws Exception {
        return zzWA(true).getCount();
    }

    public PageInfo getPageInfo(int i) throws Exception {
        zzFX(i);
        return new PageInfo(zzWA(true).zzqO(i));
    }

    public int getProtectionType() {
        return zzZpV().zzYW6.zzZoc();
    }

    public boolean getRemovePersonalInformation() {
        return zzZpV().zzYWC;
    }

    public RevisionCollection getRevisions() {
        if (this.zzYSR == null) {
            this.zzYSR = new RevisionCollection(this);
        }
        return this.zzYSR;
    }

    public int getRevisionsView() {
        return this.zzYSE;
    }

    public SectionCollection getSections() {
        if (this.zzZB0 == null) {
            this.zzZB0 = new SectionCollection(this);
        }
        return this.zzZB0;
    }

    public boolean getShadeFormData() {
        return !zzZpV().zzYVO;
    }

    public boolean getShowGrammaticalErrors() {
        return !zzZpV().zzYV8;
    }

    public boolean getShowSpellingErrors() {
        return !zzZpV().zzYV9;
    }

    public boolean getSpellingChecked() {
        return zzZpV().zzYWp != 0;
    }

    public Theme getTheme() {
        zzZqJ();
        return this.zzYTf;
    }

    public boolean getTrackRevisions() {
        return zzZpV().zzYWc;
    }

    @Override // com.aspose.words.DocumentBase
    public VariableCollection getVariables() {
        return super.getVariables();
    }

    public VbaProject getVbaProject() {
        return this.zzYT3;
    }

    public int getVersionsCount() {
        return zzZpV().zzYUO;
    }

    public ViewOptions getViewOptions() {
        return zzZpV().zzYVf;
    }

    public Watermark getWatermark() {
        if (this.zzYSC == null) {
            this.zzYSC = new Watermark(this, this);
        }
        return this.zzYSC;
    }

    public TaskPaneCollection getWebExtensionTaskPanes() {
        return this.zzYSD;
    }

    public WriteProtection getWriteProtection() {
        return zzZpV().zzYW5;
    }

    public boolean hasMacros() {
        return this.zzYT3 != null;
    }

    public boolean hasRevisions() {
        return getRevisions().getCount() != 0;
    }

    public int joinRunsWithSameFormatting() {
        NodeCollection childNodes = getChildNodes(8, true);
        StringBuilder sb = new StringBuilder(1024);
        Iterator<T> it = childNodes.iterator();
        int iZzw = 0;
        while (it.hasNext()) {
            iZzw += ((Paragraph) it.next()).zzw(sb);
        }
        return iZzw;
    }

    public void normalizeFieldTypes() {
        getRange().normalizeFieldTypes();
    }

    public void protect(int i) {
        zzZpV().zzYW6.zzFH(i);
        zzFZ(i);
        zzZqt();
    }

    @Override // com.aspose.words.Node, com.aspose.words.zzZ8S
    @ReservedForInternalUse
    @Deprecated
    public void remove() {
        Iterator<T> it = getSections().iterator();
        while (it.hasNext()) {
            if (((Section) it.next()).zzYca()) {
                this.zzYTj.add(27);
            }
        }
    }

    public void removeExternalSchemaReferences() {
        zzZpV().zzYVc.clear();
        zzZpV().zzYVb.clear();
    }

    public void removeMacros() {
        this.zzYT7 = null;
        this.zzYT6 = null;
        this.zzYT5 = null;
        this.zzYT3 = null;
        this.zzYT4 = 0;
    }

    public PointF renderToScale(int i, Canvas canvas, float f, float f2, float f3) throws Exception {
        return com.aspose.words.internal.zzZPW.zzYB(zzZ(i, canvas, f, f2, f3));
    }

    public float renderToSize(int i, Canvas canvas, float f, float f2, float f3, float f4) throws Exception {
        zzFX(i);
        com.aspose.words.internal.zzZH zzzhZzFY = zzFY(i);
        return new com.aspose.words.internal.zzJ8(zzZqx()).zzZ(zzzhZzFY, zzzhZzFY.getSize(), canvas, f, f2, f3, f4);
    }

    public SaveOutputParameters save(String str) throws Exception {
        return save(str, (SaveOptions) null);
    }

    public void setAttachedTemplate(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzZpV().zzYWn = str;
    }

    public void setAutomaticallyUpdateStyles(boolean z) {
        zzZpV().zzYWm = z;
    }

    public final void setBaseUri(String str) {
        this.zzZp0 = str;
    }

    public void setCustomXmlParts(CustomXmlPartCollection customXmlPartCollection) {
        com.aspose.words.internal.zzZ4.zzY((Object) customXmlPartCollection, "customXmlParts");
        this.zzYTe = customXmlPartCollection;
    }

    public void setDefaultTabStop(double d) {
        if (d < 0.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        zzZpV().zzYW4 = com.aspose.words.internal.zzSA.zzr(d);
    }

    public void setFontSettings(FontSettings fontSettings) {
        this.zzYSG = fontSettings;
    }

    public void setGlossaryDocument(GlossaryDocument glossaryDocument) {
        this.zzYTg = glossaryDocument;
        glossaryDocument.zzr(this);
    }

    public void setGrammarChecked(boolean z) {
        zzZpV().zzYWo = z ? 1 : 0;
    }

    public void setIncludeTextboxesFootnotesEndnotesInStat(boolean z) {
        zzZpV().zzYVa = !z;
    }

    public void setJustificationMode(int i) {
        zzZpV().zzYVM = i;
    }

    public void setMailMergeSettings(MailMergeSettings mailMergeSettings) {
        com.aspose.words.internal.zzZ4.zzY((Object) mailMergeSettings, "value");
        zzZpV().zzYWd = mailMergeSettings;
    }

    public void setPackageCustomParts(CustomPartCollection customPartCollection) {
        com.aspose.words.internal.zzZ4.zzY((Object) customPartCollection, "packageCustomParts");
        this.zzYTd = customPartCollection;
    }

    public void setRemovePersonalInformation(boolean z) {
        zzZpV().zzYWC = z;
    }

    public void setRevisionsView(int i) {
        this.zzYSE = i;
    }

    @Override // com.aspose.words.zzZ9E
    @ReservedForInternalUse
    @Deprecated
    public void setSectionAttr(int i, Object obj) {
        zzZpV().zzYVh.setSectionAttr(i, obj);
        Iterator<T> it = getSections().iterator();
        while (it.hasNext()) {
            ((Section) it.next()).setSectionAttr(i, obj);
        }
    }

    public void setShadeFormData(boolean z) {
        zzZpV().zzYVO = !z;
    }

    public void setShowGrammaticalErrors(boolean z) {
        zzZpV().zzYV8 = !z;
    }

    public void setShowSpellingErrors(boolean z) {
        zzZpV().zzYV9 = !z;
    }

    public void setSpellingChecked(boolean z) {
        zzZpV().zzYWp = z ? 1 : 0;
    }

    public void setTrackRevisions(boolean z) {
        zzZpV().zzYWc = z;
    }

    public void setVbaProject(VbaProject vbaProject) {
        this.zzYT3 = vbaProject;
    }

    public void startTrackRevisions(String str, Date date) {
        zzW(str, com.aspose.words.internal.zzZQ9.zzZ(date));
    }

    public void stopTrackRevisions() {
        this.zzYSL = false;
    }

    public void unlinkFields() throws Exception {
        zzY81 zzy81 = new zzY81(this);
        try {
            getRange().unlinkFields();
        } finally {
            zzy81.dispose();
        }
    }

    public void unprotect() {
        zzZpV().zzYW6.zzFF(-1);
        zzZqt();
    }

    public void updateActualReferenceMarks() throws Exception {
        zzZMY.zzs(this);
    }

    public void updateFields() throws Exception {
        zzY81 zzy81 = new zzY81(this);
        try {
            zzY82 zzy82 = new zzY82(this);
            try {
                getRange().updateFields();
            } finally {
                zzy82.dispose();
            }
        } finally {
            zzy81.dispose();
        }
    }

    public void updateListLabels() throws Exception {
        zzZ4E.zzk(this);
    }

    public void updatePageLayout() throws Exception {
        zzYNA zzyna = this.zzYSW;
        if (zzyna != null && zzyna.getState() == 1) {
            throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{97, 80, 101, 103, 108, 32, 121, 97, 117, 111, 32, 116, 117, 98, 108, 105, 32, 100, 115, 105, 114, 32, 110, 117, 105, 110, 103, 110}));
        }
        this.zzYSV = null;
        this.zzYSZ.zzl(this);
        zzYNA zzyna2 = new zzYNA(this, this.zzYSZ);
        this.zzYSW = zzyna2;
        zzyna2.zzYqu();
        this.zzYSW = zzyna2;
    }

    @Deprecated
    public void updateTableLayout() {
        for (Table table : new NodeCollection((CompositeNode) this, 5, true)) {
            if (!table.zzhk()) {
                table.zzY0e();
            }
        }
        this.zzYSZ.zzYT8();
    }

    public void updateThumbnail(ThumbnailGeneratingOptions thumbnailGeneratingOptions) throws Exception {
        zzY5D.zzZ(this, thumbnailGeneratingOptions);
    }

    public void updateWordCount() throws Exception {
        updateWordCount(false);
    }

    @Override // com.aspose.words.DocumentBase
    public final void zzG0(int i) {
        if (i == 0) {
            this.zzYSK--;
        } else {
            if (i != 1) {
                throw new IllegalStateException();
            }
            this.zzYSJ--;
        }
    }

    @Override // com.aspose.words.DocumentBase
    public final void zzG1(int i) {
        if (i == 0) {
            this.zzYSK++;
        } else {
            if (i != 1) {
                throw new IllegalStateException();
            }
            this.zzYSJ++;
        }
    }

    public final void zzG2(int i) {
        this.zzYT4 = i;
    }

    public final String zzOb(String str) throws Exception {
        String str2 = this.zzZp0;
        if (str2 == null) {
            str2 = "";
        }
        return com.aspose.words.internal.zzZOQ.zzVf(com.aspose.words.internal.zzZOQ.zzZW(str2, str));
    }

    public final void zzS(com.aspose.words.internal.zzZOR zzzor) {
        this.zzYT9 = zzzor;
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return node.getNodeType() == 2;
    }

    public final zzYNA zzWA(boolean z) throws Exception {
        if (!zzZqj() && z) {
            updatePageLayout();
        }
        return this.zzYSW;
    }

    public final void zzY(Theme theme) {
        this.zzYTf = theme;
        if (theme != null) {
            theme.zzZS(this);
        }
    }

    public final void zzYp(byte[] bArr) {
        this.zzYT7 = bArr;
    }

    public final void zzYq(byte[] bArr) {
        this.zzYT8 = bArr;
    }

    public final void zzYr(byte[] bArr) {
        this.zzYTa = bArr;
    }

    public final void zzZ(Frameset frameset) {
        this.zzYTb = frameset;
    }

    public final void zzZW(ArrayList<zzZ7B> arrayList) {
        this.zzYT5 = arrayList;
    }

    public final void zzZX(ArrayList<zzP> arrayList) {
        this.zzYT6 = arrayList;
    }

    public final zzZ5L zzZq9() {
        return this.zzYTj;
    }

    public final String zzZqA() {
        return this.zzYT2;
    }

    public final int zzZqB() {
        return this.zzYT4;
    }

    public final ArrayList<zzZ7B> zzZqC() {
        return this.zzYT5;
    }

    public final ArrayList<zzP> zzZqD() {
        return this.zzYT6;
    }

    public final byte[] zzZqE() {
        return this.zzYT7;
    }

    public final byte[] zzZqF() {
        return this.zzYT8;
    }

    public final com.aspose.words.internal.zzZOR zzZqG() {
        return this.zzYT9;
    }

    public final byte[] zzZqH() {
        return this.zzYTa;
    }

    @Override // com.aspose.words.DocumentBase
    public final Theme zzZqI() {
        return this.zzYTf;
    }

    public final boolean zzZqK() {
        ArrayList<zzZ7B> arrayList = this.zzYT5;
        return arrayList != null && arrayList.size() > 0;
    }

    public final boolean zzZqL() {
        ArrayList<zzP> arrayList = this.zzYT6;
        return arrayList != null && arrayList.size() > 0;
    }

    public final boolean zzZqM() {
        byte[] bArr = this.zzYT7;
        return bArr != null && bArr.length > 0;
    }

    public final boolean zzZqN() {
        return zzZqM() || zzZqL() || zzZqK();
    }

    public final zzZOS zzZqa() {
        return this.zzYTk;
    }

    public final com.aspose.words.internal.zzZQ9 zzZqb() {
        if (com.aspose.words.internal.zzZQ9.zzZ(this.zzYSH, com.aspose.words.internal.zzZQ9.zz35)) {
            this.zzYSH = com.aspose.words.internal.zzR1.zzQO();
        }
        return this.zzYSH;
    }

    public final void zzZqc() {
        this.zzYSQ = null;
    }

    public final com.aspose.words.internal.zzZYG<Object> zzZqe() {
        if (this.zzYSU == null) {
            this.zzYSU = new com.aspose.words.internal.zzZYG<>();
        }
        return this.zzYSU;
    }

    public final Map<ShapeBase, zzX0> zzZqf() {
        if (this.zzYSV == null) {
            this.zzYSV = new HashMap();
        }
        return this.zzYSV;
    }

    public final zzZ6R zzZqg() {
        return this.zzYSZ;
    }

    public final zzYNA zzZqh() throws Exception {
        return zzWA(true);
    }

    public final boolean zzZqi() {
        return zzZqj() && this.zzYSW.zzYqv();
    }

    public final boolean zzZqj() {
        return this.zzYSW != null;
    }

    public final void zzZqk() {
        this.zzYSW = null;
    }

    public final boolean zzZql() {
        for (StructuredDocumentTag structuredDocumentTag : getChildNodes(28, true)) {
            if (structuredDocumentTag.zzY3D() && structuredDocumentTag.zzY3H() != null && "Cover Pages".equals(structuredDocumentTag.getBuildingBlockGallery())) {
                return true;
            }
        }
        return false;
    }

    public final zzYO3 zzZqn() {
        return this.zzZ88;
    }

    @Override // com.aspose.words.DocumentBase
    public final boolean zzZqo() {
        return zzZqp() && this.zzYSJ == 0;
    }

    @Override // com.aspose.words.DocumentBase
    public final boolean zzZqp() {
        return this.zzYSK == 0 && this.zzYSL;
    }

    public final zzY3G zzZqr() {
        return this.zzYT0;
    }

    public final zzZV7 zzZqs() {
        return this.zzYSI;
    }

    public final int zzZqv() {
        int i = this.zzYSP;
        this.zzYSP = i + 1;
        return i;
    }

    public final zzYII zzZqw() {
        return this.zzYSN;
    }

    @Override // com.aspose.words.DocumentBase
    public final zzZYQ zzZqx() {
        return new zzZYQ(zzZqy(), getLayoutOptions().getTextShaperFactory() != null ? new zzYBN(getLayoutOptions().getTextShaperFactory()) : new com.aspose.words.internal.zzZWM(), getWarningCallback());
    }

    @Override // com.aspose.words.DocumentBase
    public final zzZYZ zzZqy() {
        if (this.zzYSF == null) {
            this.zzYSF = new zzZYZ(this);
        }
        return this.zzYSF;
    }

    public final FontSettings zzZqz() {
        FontSettings fontSettings = this.zzYSG;
        return fontSettings != null ? fontSettings : FontSettings.getDefaultInstance();
    }

    public void appendDocument(Document document, int i, ImportFormatOptions importFormatOptions) {
        new zzZYX(this).appendDocument(document, i, importFormatOptions);
    }

    public void compare(Document document, String str, Date date, CompareOptions compareOptions) throws Exception {
        zzZ(document, str, com.aspose.words.internal.zzZQ9.zzZ(date), compareOptions);
    }

    public SaveOutputParameters save(String str, int i) throws Exception {
        return save(str, SaveOptions.createSaveOptions(i));
    }

    public void startTrackRevisions(String str) {
        zzW(str, com.aspose.words.internal.zzZQ9.zzQO());
    }

    public void updateThumbnail() throws Exception {
        updateThumbnail(new ThumbnailGeneratingOptions());
    }

    public void updateWordCount(boolean z) throws Exception {
        accept(new zzY0D());
        if (z) {
            this.zzYSZ.zzUX(true);
            this.zzYSW = null;
            zzZ(new com.aspose.words.internal.zzZOR(), new PdfSaveOptions());
            getBuiltInDocumentProperties().setLines(zzWA(true).zzYqt());
            this.zzYSZ.zzUX(false);
            this.zzYSW = null;
        }
    }

    public final SaveOutputParameters zzS(com.aspose.words.internal.zzZOP zzzop, int i) throws Exception {
        return zzZ(zzzop, SaveOptions.createSaveOptions(i));
    }

    public final void zzZ(zzYII zzyii) {
        this.zzYSN = zzyii;
    }

    private void zzY(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions) throws Exception {
        FileFormatInfo fileFormatInfoZzY;
        String lowerCase;
        try {
            if (zzzop.getPosition() == zzzop.getLength()) {
                zzzop.zzH(0L);
            }
            zzZ(loadOptions);
            this.zzYT0 = loadOptions.zzZqr();
            setResourceLoadingCallback(loadOptions.getResourceLoadingCallback());
            setFontSettings(loadOptions.getFontSettings());
            if (com.aspose.words.internal.zzZYD.zzXk(loadOptions.getBaseUri())) {
                this.zzZp0 = loadOptions.getBaseUri();
            }
            int loadFormat = loadOptions.getLoadFormat();
            this.zzYT1 = loadFormat;
            if (loadFormat == 0) {
                zzZOD zzzod = new zzZOD();
                fileFormatInfoZzY = zzzod.zzY(zzzop, loadOptions.zzZ9Y());
                if (fileFormatInfoZzY.zzYzI) {
                    zzzop = (com.aspose.words.internal.zzZOP) new com.aspose.words.internal.zzKD(zzzop).zzIf().get("WordDocument");
                }
                if (fileFormatInfoZzY.getLoadFormat() == 255 && !com.aspose.words.internal.zzZRV.zzZN(zzzop)) {
                    com.aspose.words.internal.zzZOS zzzos = (com.aspose.words.internal.zzZOS) com.aspose.words.internal.zzZKW.zzZ(zzzop, com.aspose.words.internal.zzZOS.class);
                    if (zzzos != null) {
                        lowerCase = com.aspose.words.internal.zzZOQ.zzVe(zzzos.getName()).toLowerCase();
                    } else {
                        lowerCase = "";
                    }
                    if (!".docx".equals(lowerCase) && !".odt".equals(lowerCase) && !".sxw".equals(lowerCase)) {
                        fileFormatInfoZzY.setLoadFormat(62);
                        fileFormatInfoZzY.zzZ(zzzod.zzQZ());
                    }
                }
                this.zzYT1 = fileFormatInfoZzY.getLoadFormat();
            } else {
                fileFormatInfoZzY = null;
            }
            zzYKN.zzZ(this.zzYT1, loadOptions.getWarningCallback(), loadOptions.getProgressCallback());
            this.zzYSA = new zzYYZ(zzzop.getPosition());
            zzZBS zzzbsZzZ = zzYK4.zzZ(zzzop, loadOptions, this.zzYT1, fileFormatInfoZzY, this);
            zzY82 zzy82 = new zzY82(this);
            try {
                if (zzzbsZzZ.isEncrypted()) {
                    zzY(zzzbsZzZ.zz1x(), loadOptions);
                } else {
                    if (!loadOptions.zzYNC()) {
                        this.zzYTj.add(zzZ5N.zzxR(this.zzYT1));
                    }
                    zzzbsZzZ.zzIh();
                    zzZu(zzzop);
                    zzY(loadOptions);
                    if (loadOptions.getUpdateDirtyFields()) {
                        zzZOQ.zzZq(this);
                    }
                }
            } finally {
                zzy82.dispose();
            }
        } catch (Exception e) {
            zzX3 zzx3 = (zzX3) com.aspose.words.internal.zzZKW.zzZ(e, zzX3.class);
            if (zzx3 != null && zzx3.getCause() != null) {
                throw ((Exception) zzx3.getCause());
            }
            throw FileFormatUtil.zzY(e);
        }
    }

    public void cleanup(CleanupOptions cleanupOptions) throws Exception {
        zzZZ1.zzZ(this, cleanupOptions);
        if (getGlossaryDocument() != null) {
            zzZZ1.zzZ(getGlossaryDocument(), cleanupOptions);
        }
    }

    public SaveOutputParameters save(String str, SaveOptions saveOptions) throws Exception {
        if (saveOptions != null && !saveOptions.zzYZf()) {
            com.aspose.words.internal.zzZ4.zzU(str, "fileName");
        }
        return zzZ((com.aspose.words.internal.zzZOP) null, str, saveOptions);
    }

    @Override // com.aspose.words.DocumentBase, com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        Document document = (Document) super.zzZ(z, zzza5);
        document.zzYTi = (BuiltInDocumentProperties) this.zzYTi.zzZoh();
        CustomDocumentProperties customDocumentProperties = (CustomDocumentProperties) getCustomDocumentProperties().zzZoh();
        document.zzYTh = customDocumentProperties;
        customDocumentProperties.setDocument(document);
        GlossaryDocument glossaryDocument = this.zzYTg;
        if (glossaryDocument != null) {
            document.setGlossaryDocument((GlossaryDocument) glossaryDocument.zzZ(true, zzza5));
        }
        Theme theme = this.zzYTf;
        if (theme != null) {
            document.zzYTf = theme.zzXVK();
        }
        zzYO3 zzyo3 = this.zzZ88;
        if (zzyo3 != null) {
            document.zzZ88 = zzyo3.zzYrd();
        }
        document.zzYTe = this.zzYTe.deepClone();
        document.zzYTd = this.zzYTd.deepClone();
        VbaProject vbaProject = this.zzYT3;
        if (vbaProject != null) {
            document.zzYT3 = vbaProject.deepClone();
        }
        document.zzYSY = this.zzYSY.zzYTh();
        document.zzYSZ = this.zzYSZ.zzYTg();
        document.zzZB0 = null;
        document.zzYSX = null;
        document.zzYSW = null;
        document.zzYSV = null;
        document.zzYST = null;
        document.zzYSS = null;
        document.zzYSR = null;
        document.zzYSB = null;
        document.zzYSF = null;
        document.zzYSQ = null;
        zzZV7 zzzv7 = this.zzYSI;
        if (zzzv7 != null) {
            document.zzYSI = new zzZV7(zzzv7.getAuthor(), this.zzYSI.zzZx());
        }
        document.zzZqu();
        document.zzZpV().zzYVj = zzZpV().zzYVj.zzYjc();
        if (document.zzYSz != null) {
            document.zzZqd();
        }
        return document;
    }

    public void protect(int i, String str) {
        zzZpV().zzYW6.protect(i, str);
        zzFZ(i);
        zzZqt();
    }

    public boolean unprotect(String str) {
        boolean zValidatePassword = zzZpV().zzYW6.validatePassword(str);
        if (zValidatePassword) {
            unprotect();
        }
        return zValidatePassword;
    }

    public void copyStylesFromTemplate(Document document) {
        getStyles().zzR(document.getStyles());
    }

    public SaveOutputParameters save(OutputStream outputStream, int i) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        SaveOutputParameters saveOutputParametersZzS = zzS(zzzor, i);
        zzzor.zzH(0L);
        com.aspose.words.internal.zzZKB.zzZ(zzzor, outputStream);
        return saveOutputParametersZzS;
    }

    public SaveOutputParameters save(OutputStream outputStream, SaveOptions saveOptions) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        SaveOutputParameters saveOutputParametersZzZ = zzZ(zzzor, saveOptions);
        zzzor.zzH(0L);
        com.aspose.words.internal.zzZKB.zzZ(zzzor, outputStream);
        return saveOutputParametersZzZ;
    }

    public Document(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions, boolean z) throws Exception {
        this(0);
        if (zzzop != null) {
            zzZ(zzzop, loadOptions);
            if (z) {
                zzYZ6.zzYDx().zzXH(this.zzYSA.zzYDt());
                return;
            }
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
    }

    public Document() throws Exception {
        this(1);
        zzYZ6.zzYDx().zzXH(this.zzYSA.zzYDt());
    }

    public Document(String str) throws Exception {
        this(str, (LoadOptions) null);
    }

    public Document(String str, LoadOptions loadOptions) throws Exception {
        this(0);
        com.aspose.words.internal.zzZ4.zzU(str, "fileName");
        this.zzZwV = str;
        this.zzZp0 = com.aspose.words.internal.zzZOQ.zzVd(str);
        com.aspose.words.internal.zzZOP zzzopZzZ = zzZ(str, loadOptions != null ? loadOptions.getResourceLoadingCallback() : null, true);
        if (zzzopZzZ == null) {
            return;
        }
        try {
            zzZ(zzzopZzZ, loadOptions);
            zzzopZzZ.close();
            zzYZ6.zzYDx().zzXH(this.zzYSA.zzYDt());
            zzZqd();
        } catch (Throwable th) {
            zzzopZzZ.close();
            throw th;
        }
    }

    public Document(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        this(zzzop, (LoadOptions) null);
    }

    public Document(InputStream inputStream) throws Exception {
        this(com.aspose.words.internal.zzZOP.zzY(inputStream));
    }

    public Document(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions) throws Exception {
        this(0);
        if (zzzop != null) {
            zzZ(zzzop, loadOptions);
            zzZqd();
            zzYZ6.zzYDx().zzXH(this.zzYSA.zzYDt());
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
    }

    private SaveOutputParameters zzZ(com.aspose.words.internal.zzZOP zzzop, String str, SaveOptions saveOptions) throws Exception {
        zzZYM zzzym;
        SaveOutputParameters saveOutputParametersZzY;
        if (saveOptions == null) {
            if (str == null) {
                saveOptions = new DocSaveOptions();
            } else {
                saveOptions = SaveOptions.createSaveOptions(str);
            }
        }
        zzYDZ zzydz = new zzYDZ(this, zzzop, str, saveOptions);
        this.zzYTj.add(zzZ5N.zzxS(zzydz.zzXpa.getSaveFormat()));
        zzY0C.zzZN(this);
        if (saveOptions.zzZ9f()) {
            zzzym = new zzZYM();
            zzzym.zzX(zzydz);
            zzydz.zzU(zzzym.zzZn6());
        } else {
            zzzym = null;
        }
        if (!saveOptions.zzYZf()) {
            if (zzzop == null && !com.aspose.words.internal.zzZYD.zzXk(str)) {
                throw new IllegalArgumentException("The arguments Stream and fileName cannot be null or empty string.");
            }
            if (zzzop == null) {
                String strZzVd = com.aspose.words.internal.zzZOQ.zzVd(str);
                if (com.aspose.words.internal.zzZYD.zzXk(strZzVd) && !com.aspose.words.internal.zzZOV.zzYb(strZzVd)) {
                    com.aspose.words.internal.zzZOV.zzVp(strZzVd);
                }
                if (zzYN5.zzU(saveOptions) != null) {
                    saveOutputParametersZzY = zzY(zzydz);
                } else {
                    com.aspose.words.internal.zzZOS zzzosZzVl = com.aspose.words.internal.zzZOU.zzVl(str);
                    try {
                        zzydz.zzXpb = zzzosZzVl;
                        SaveOutputParameters saveOutputParametersZzY2 = zzY(zzydz);
                        zzzosZzVl.close();
                        saveOutputParametersZzY = saveOutputParametersZzY2;
                    } catch (Throwable th) {
                        zzzosZzVl.close();
                        throw th;
                    }
                }
            } else {
                saveOutputParametersZzY = zzY(zzydz);
            }
        } else {
            saveOutputParametersZzY = zzY(zzydz);
        }
        if (zzzym != null) {
            zzzym.zzZnb();
        }
        return saveOutputParametersZzY;
    }

    public Document(InputStream inputStream, LoadOptions loadOptions) throws Exception {
        this(com.aspose.words.internal.zzZOP.zzY(inputStream), loadOptions);
    }

    private void zzY(LoadOptions loadOptions) throws Exception {
        new zzZYS().zzZ(this, loadOptions, this.zzYT1);
    }

    private SaveOutputParameters zzY(zzYDZ zzydz) throws Exception {
        FixedPageSaveOptions fixedPageSaveOptions;
        SaveOptions saveOptions = zzydz.zzXpa;
        IPageSavingCallback iPageSavingCallbackZzU = zzYN5.zzU(saveOptions);
        if (zzydz.zzXpb == null) {
            saveOptions.zzYZf();
        }
        zzYKN.zzZ(zzydz.zzXpa.getSaveFormat(), getWarningCallback(), saveOptions.getProgressCallback());
        this.zzYT2 = zzydz.getFileName();
        if (saveOptions.getUpdateLastSavedTimeProperty()) {
            getBuiltInDocumentProperties().zzz(com.aspose.words.internal.zzR1.zzY(com.aspose.words.internal.zzR1.zzQO()));
        }
        if (saveOptions.getUpdateLastPrintedProperty()) {
            getBuiltInDocumentProperties().zzA(com.aspose.words.internal.zzR1.zzY(com.aspose.words.internal.zzR1.zzQO()));
        }
        if (saveOptions.getUpdateCreatedTimeProperty()) {
            getBuiltInDocumentProperties().zzB(com.aspose.words.internal.zzR1.zzY(com.aspose.words.internal.zzR1.zzQO()));
        }
        if (saveOptions.zzYd4()) {
            zzZqJ();
        }
        this.zzYSZ.zzZ(this, saveOptions);
        if (!saveOptions.zzZ9f() && saveOptions.getUpdateFields()) {
            zzZqq();
        }
        zzYZ5 zzyz5 = new zzYZ5(zzY07.zzhv(saveOptions.getSaveFormat()));
        if (iPageSavingCallbackZzU != null) {
            return zzYN5.zzZ(iPageSavingCallbackZzU, zzydz, zzyz5);
        }
        SaveOutputParameters saveOutputParametersZzZ = zzyz5.zzZ(zzydz);
        if (this.zzYSW != null && (fixedPageSaveOptions = (FixedPageSaveOptions) com.aspose.words.internal.zzZKW.zzZ(saveOptions, FixedPageSaveOptions.class)) != null) {
            new zzZ6W(this.zzYSW.zzZoz()).zzYY(fixedPageSaveOptions.zzZ9e());
        }
        return saveOutputParametersZzZ;
    }

    private void zzZ(LoadOptions loadOptions) {
        if (loadOptions == null) {
            return;
        }
        if (loadOptions.getWarningCallback() != null) {
            setWarningCallback(loadOptions.getWarningCallback());
        } else if (getWarningCallback() != null) {
            loadOptions.setWarningCallback(getWarningCallback());
        }
    }

    public final SaveOutputParameters zzZ(com.aspose.words.internal.zzZOP zzzop, SaveOptions saveOptions) throws Exception {
        if (!saveOptions.zzYZf() && zzzop == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
        }
        return zzZ(zzzop, (String) null, saveOptions);
    }

    private void zzZ(Document document, String str, com.aspose.words.internal.zzZQ9 zzzq9) throws Exception {
        zzZ(document, str, zzzq9, new CompareOptions());
    }

    private void zzZ(Document document, String str, com.aspose.words.internal.zzZQ9 zzzq9, CompareOptions compareOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "author");
        this.zzYSI = new zzZV7(str, zzzq9);
        zzZZ0.zzZ(this, document, compareOptions);
        this.zzYSW = null;
    }

    public final void zzZ(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions) throws Exception {
        if (zzzop.getLength() <= 0) {
            zzX(loadOptions);
            zzZqm();
            return;
        }
        if (loadOptions == null) {
            loadOptions = new LoadOptions();
        }
        if (loadOptions.getWarningCallback() != null) {
            setWarningCallback(loadOptions.getWarningCallback());
        }
        if (loadOptions.getLoadFormat() != 0) {
            long position = zzzop.getPosition();
            try {
                zzY(zzzop, loadOptions);
                return;
            } catch (Exception unused) {
                loadOptions = loadOptions.zz1s();
                loadOptions.setLoadFormat(0);
                zzzop.zzH(position);
                resetState();
            }
        }
        zzY(zzzop, loadOptions);
    }

    public final void zzY(zzZ6R zzz6r) {
        this.zzYSZ = zzz6r;
    }

    public static com.aspose.words.internal.zzZOP zzZ(String str, IResourceLoadingCallback iResourceLoadingCallback) throws Exception {
        return zzZ(str, iResourceLoadingCallback, true);
    }

    public static com.aspose.words.internal.zzZOP zzZ(String str, IResourceLoadingCallback iResourceLoadingCallback, boolean z) throws Exception {
        if (z && !com.aspose.words.internal.zzZVR.zzWF(str)) {
            return com.aspose.words.internal.zzZOU.zzVj(str);
        }
        if (iResourceLoadingCallback != null) {
            ResourceLoadingArgs resourceLoadingArgs = new ResourceLoadingArgs("", str, 2);
            int iResourceLoading = iResourceLoadingCallback.resourceLoading(resourceLoadingArgs);
            if (iResourceLoading == 0) {
                return com.aspose.words.internal.zzZXR.zzX0(str);
            }
            if (iResourceLoading != 1) {
                if (iResourceLoading != 2) {
                    com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{101, 78, 101, 118, 32, 114, 110, 105, 111, 118, 101, 107, 33, 100});
                    return null;
                }
                if (!resourceLoadingArgs.zzYlN()) {
                    return new com.aspose.words.internal.zzZOR(resourceLoadingArgs.getData());
                }
            }
            return null;
        }
        return com.aspose.words.internal.zzZXR.zzX0(str);
    }

    public final void zzZ(SaveOptions saveOptions) throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzZ;
        String defaultTemplate = com.aspose.words.internal.zzZYD.zzXk(saveOptions.getDefaultTemplate()) ? saveOptions.getDefaultTemplate() : zzZpV().zzYWn;
        if (!com.aspose.words.internal.zzZYD.zzXk(defaultTemplate)) {
            zzY1Z.zzZ(getWarningCallback(), 1, 17, "Attached template path is empty, styles were not updated.");
            return;
        }
        Document document = null;
        try {
            zzzopZzZ = zzZ(defaultTemplate, getResourceLoadingCallback(), true);
            try {
            } catch (Throwable th) {
                if (zzzopZzZ != null) {
                    zzzopZzZ.close();
                }
                throw th;
            }
        } catch (Exception unused) {
        }
        if (new zzZOD().zzY(zzzopZzZ, null).zzZ9W()) {
            Document document2 = new Document(zzzopZzZ, null, false);
            if (zzzopZzZ != null) {
                try {
                    zzzopZzZ.close();
                } catch (Exception unused2) {
                    document = document2;
                    zzY1Z.zzZ(getWarningCallback(), 1, 17, "Attached template could not be loaded at {0}.", defaultTemplate);
                    document2 = document;
                }
            }
            if (document2 != null) {
                getStyles().zzZX(document2);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void zzZ(zzYO3 zzyo3) {
        this.zzZ88 = zzyo3;
    }

    private long zzZ(int i, Canvas canvas, float f, float f2, float f3) throws Exception {
        zzFX(i);
        com.aspose.words.internal.zzZH zzzhZzFY = zzFY(i);
        return new com.aspose.words.internal.zzJ8(zzZqx()).zzZ(zzzhZzFY, zzzhZzFY.getSize(), canvas, f, f2, f3);
    }

    public final com.aspose.words.internal.zzZH zzZ(zzYE zzye, long j, int i, zzZ72 zzz72) throws Exception {
        return zzz72.zzZ(zzye.zz9t() < getPageCount() ? zzWA(true).zzqO(zzye.zz9t()) : null, zzye.zz9s() < getPageCount() ? zzWA(true).zzqO(zzye.zz9s()) : null, j, i, this.zzYSZ);
    }

    public final void zzZ(com.aspose.words.internal.zzAA zzaa, byte[] bArr) throws Exception {
        if (zzaa != null) {
            VbaProject vbaProject = new VbaProject(zzaa);
            this.zzYT3 = vbaProject;
            vbaProject.zzXI(bArr);
        }
    }

    public final zzZPW zzZ(FieldStart fieldStart) {
        HashMap<FieldStart, zzZPW> map = this.zzYSQ;
        if (map == null) {
            return null;
        }
        return (zzZPW) com.aspose.words.internal.zzQW.zzZ(map, fieldStart);
    }

    public final void zzZ(FieldStart fieldStart, zzZPW zzzpw) {
        if (this.zzYSQ == null) {
            this.zzYSQ = new HashMap<>();
        }
        this.zzYSQ.put(fieldStart, zzzpw);
    }

    public final void zzZ(zzZOS zzzos) {
        this.zzYTk = zzzos;
    }

    public final com.aspose.words.internal.zzZH zzZ(int i, zzZ72 zzz72) throws Exception {
        return zzz72.zzZ(zzWA(true).zzqO(i), this.zzYSZ);
    }
}
