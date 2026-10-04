package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class StructuredDocumentTag extends CompositeNode<Node> implements IStructuredDocumentTag, zzZ8X, zzZ9G, zzZAD {
    private String zzXCk;
    private zzYDG zzXaA;
    private String zzXaB;
    private int zzXak;
    private int zzXal;
    private com.aspose.words.internal.zzPV zzXam;
    private Font zzXan;
    private Font zzXao;
    private boolean zzXap;
    private boolean zzXaq;
    private BuildingBlock zzXar;
    private zzYEF zzXas;
    private zzYEF zzXat;
    private boolean zzXau;
    private int zzXav;
    private boolean zzXaw;
    private boolean zzXax;
    private int zzXay;
    private XmlMapping zzXaz;
    private int zzYG;
    private int zzYw;
    private String zzZCi;
    private String zzZCj;
    private String zzZCk;
    private String zzZj;

    public StructuredDocumentTag(DocumentBase documentBase, int i, int i2) {
        this(documentBase, i2);
        this.zzXaA = zzVw(i, i2);
        zzY3U();
        zzYDI.zzZ(this, false);
        this.zzYG = documentBase.zzZpQ().zzji(zzY41.zzXUb());
    }

    public static boolean zz5(Node node, Node node2) {
        return node.getParentNode().getNodeType() == 3 && node2.getParentNode().getNodeType() == 3;
    }

    private void zzQj(boolean z) throws Exception {
        String value;
        zzYDI.zzE(this);
        if (getXmlMapping() == null || getXmlMapping().isEmpty() || (value = getXmlMapping().getValue()) == null) {
            return;
        }
        boolean zEquals = "1".equals(value);
        String str = TelemetryEventStrings.Value.TRUE;
        if ((zEquals || TelemetryEventStrings.Value.TRUE.equals(value)) != z) {
            XmlMapping xmlMapping = getXmlMapping();
            if (!z) {
                str = TelemetryEventStrings.Value.FALSE;
            }
            xmlMapping.setValue(str);
        }
    }

    private zzYDG zzVw(int i, int i2) {
        if (!zzld(i)) {
            throw new IllegalArgumentException("Creation of such SdtType is not allowed.");
        }
        if (!zzVx(i, i2)) {
            throw new IllegalArgumentException("Can not create such SdtType at this level.");
        }
        switch (i) {
            case 2:
                return new zzYDL();
            case 3:
            case 8:
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: type");
            case 4:
            case 5:
                zzYDB zzydc = i == 4 ? new zzYDC() : new zzYDK();
                zzydc.getListItems().zzs(this);
                return zzydc;
            case 6:
                return new zzYDF();
            case 7:
                return new zzYDO();
            case 9:
                return new zzYD7();
            case 10:
                return new zzYD4();
            case 11:
                return new zzYD0(true);
            case 12:
                return new zzYD0(false);
            case 13:
                return new zzYDN();
            case 14:
                return new zzYD2();
            case 15:
                return new zzYD1();
        }
    }

    private static boolean zzVx(int i, int i2) {
        if (i2 == 1) {
            return (i == 14 || i == 15) ? false : true;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: level");
                }
            } else if (i != 11 && i != 14 && i != 15 && i != 9) {
                return false;
            }
        }
        return true;
    }

    private StructuredDocumentTagRangeStart zzWq(Node node) {
        StructuredDocumentTagRangeStart structuredDocumentTagRangeStart = new StructuredDocumentTagRangeStart(getDocument(), this);
        getParentNode().insertAfter(structuredDocumentTagRangeStart, this);
        Node nodeZzYD = structuredDocumentTagRangeStart;
        while (getChildNodes(0, false).getCount() > 0) {
            nodeZzYD = nodeZzYD.zzYD(getFirstChild());
        }
        remove();
        node.getParentNode().zzZ(new StructuredDocumentTagRangeEnd(structuredDocumentTagRangeStart.getDocument(), structuredDocumentTagRangeStart.getId()), node, true);
        return structuredDocumentTagRangeStart;
    }

    public static void zzWr(Node node) {
        ArrayList<StructuredDocumentTag> arrayList = new ArrayList();
        while (node != null) {
            if (node.getNodeType() == 28) {
                arrayList.add(0, (StructuredDocumentTag) node);
            }
            node = node.getParentNode();
        }
        for (StructuredDocumentTag structuredDocumentTag : arrayList) {
            structuredDocumentTag.zzWq(structuredDocumentTag.getLastChild());
        }
    }

    private void zzX(int i, String str, boolean z) throws Exception {
        zzX(getSdtType() == 13, z ? "SetCheckedSymbol is only accessible for Checkbox SDT type." : "SetUncheckedSymbol is only accessible for Checkbox SDT type.");
        zzYDN zzydn = (zzYDN) this.zzXaA;
        if (z) {
            zzydn.zzZ(new zzYDM(str, i));
        } else {
            zzydn.zzY(new zzYDM(str, i));
        }
        zzQj(z);
    }

    private boolean zzY3E() {
        Node nodeNextPreOrder = nextPreOrder(this);
        while (nodeNextPreOrder != null && (zzYVU.zzXM(nodeNextPreOrder) || zzYVU.zztq(nodeNextPreOrder.getNodeType()))) {
            nodeNextPreOrder = nodeNextPreOrder.nextPreOrder(this);
        }
        return nodeNextPreOrder != null;
    }

    private void zzY3T() {
        if (this.zzXaA == null) {
            throw new IllegalStateException("Please report exception.");
        }
    }

    private void zzY3U() {
        BuildingBlock buildingBlockZzmB = getDocument().zzZpR().zzmB(getSdtType());
        if (buildingBlockZzmB != null) {
            this.zzXar = buildingBlockZzmB;
            this.zzXaB = buildingBlockZzmB.getName();
            if (this.zzYw != 3) {
                this.zzXaw = true;
            }
        }
    }

    private void zzZS(int i, Object obj) {
        Run run = (Run) getChild(21, 0, true);
        if (run == null) {
            zzYDI.zzZ(this, false);
            run = (Run) getChild(21, 0, true);
        }
        run.zzZYh().zzQ(i, obj);
        zzYDN zzydn = (zzYDN) this.zzXaA;
        run.zzZYh().setName(zzydn.getChecked() ? zzydn.zzYcX().getFontName() : zzydn.zzYcW().getFontName());
    }

    private static boolean zzld(int i) {
        switch (i) {
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 3:
            case 8:
            default:
                return false;
        }
    }

    private static Style zzx(Style style) {
        if (style.getType() == 2) {
            return style;
        }
        Style styleZzZ8 = style.getStyles().zzZ8(style.zzY3t(), false);
        if (styleZzZ8 == null || styleZzZ8.getType() != 2) {
            return null;
        }
        return styleZzZ8;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitStructuredDocumentTagEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitStructuredDocumentTagStart(this);
    }

    public void clear() throws Exception {
        zzY82 zzy82 = new zzY82(getDocument());
        try {
            zzYDI.zzD(this);
        } finally {
            zzy82.dispose();
        }
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void clearRunAttrs() {
        this.zzXat.clear();
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedRunAttr(int i) {
        return this.zzXat.zzPi(i);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public int getAppearance() {
        return this.zzXal;
    }

    public String getBuildingBlockCategory() {
        zzX(zzY3D(), "BuildingBlockCategory is only accessible for BuildingBlockGallery SDT type.");
        return ((zzYDE) this.zzXaA).getBuildingBlockCategory();
    }

    public String getBuildingBlockGallery() {
        zzX(zzY3D(), "BuildingBlockType is only accessible for BuildingBlockGallery SDT type.");
        return ((zzYDE) this.zzXaA).zzYcO();
    }

    public int getCalendarType() {
        zzX(getSdtType() == 6, "CalendarType is only accessible for Date SDT type.");
        return ((zzYDF) this.zzXaA).getCalendarType();
    }

    public boolean getChecked() {
        zzX(getSdtType() == 13, "Checked is only accessible for Checkbox SDT type.");
        return ((zzYDN) this.zzXaA).getChecked();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public int getColor() {
        com.aspose.words.internal.zzPV zzpv = this.zzXam;
        return zzpv != null ? zzpv.zzPG() : com.aspose.words.internal.zzPV.zzHZ.zzPG();
    }

    public Font getContentsFont() {
        if (this.zzXao == null) {
            this.zzXao = new Font(this, getDocument());
        }
        return this.zzXao;
    }

    public String getDateDisplayFormat() {
        zzX(getSdtType() == 6, "DateDisplayFormat is only accessible for Date SDT type.");
        return ((zzYDF) this.zzXaA).zzYcS();
    }

    public int getDateDisplayLocale() {
        zzX(getSdtType() == 6, "DateDisplayLocale is only accessible for Date SDT type.");
        return ((zzYDF) this.zzXaA).zzYcT();
    }

    public int getDateStorageFormat() {
        zzX(getSdtType() == 6, "DateStorageFormat is only accessible for Date SDT type.");
        return ((zzYDF) this.zzXaA).zzYcQ();
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getDeleteRevision() {
        return this.zzXat.getDeleteRevision();
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i) {
        return this.zzXat.get(i);
    }

    public Font getEndCharacterFont() {
        if (this.zzXan == null) {
            this.zzXan = new Font(this.zzXas, getDocument());
        }
        return this.zzXan;
    }

    public Date getFullDate() {
        return com.aspose.words.internal.zzZQ9.zzJ(zzY3R());
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public int getId() {
        return this.zzYG;
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getInsertRevision() {
        return this.zzXat.getInsertRevision();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public int getLevel() {
        return this.zzYw;
    }

    @Override // com.aspose.words.zzZAD
    @ReservedForInternalUse
    @Deprecated
    public int getLevel_IMarkupNode() {
        return getLevel();
    }

    public SdtListItemCollection getListItems() {
        zzX(getSdtType() == 5 || getSdtType() == 4, "ListItems is only accessible for ComboBox or DropDownList SDT types.");
        return ((zzYDB) this.zzXaA).getListItems();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public boolean getLockContentControl() {
        return this.zzXaq;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public boolean getLockContents() {
        return this.zzXap;
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveFromRevision() {
        return this.zzXat.getMoveFromRevision();
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveToRevision() {
        return this.zzXat.getMoveToRevision();
    }

    public boolean getMultiline() {
        zzX(getSdtType() == 11 || getSdtType() == 12, "Multiline is only accessible for Richtext and Plaintext SDT types.");
        return ((zzYD0) this.zzXaA).zzZ9z();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    @ReservedForInternalUse
    @Deprecated
    public Node getNode() {
        return this;
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 28;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public BuildingBlock getPlaceholder() {
        return this.zzXar;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public String getPlaceholderName() {
        return this.zzXaB;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public int getSdtType() {
        return this.zzXaA.getType();
    }

    public Style getStyle() {
        Style styleZzVp = getDocument().getStyles().zzVp(this.zzXat.zzZ7j(), 10);
        if (styleZzVp.zzZ7j() != 10) {
            Style styleZzZ8 = styleZzVp.getStyles().zzZ8(styleZzVp.zzY3t(), false);
            if (styleZzZ8 != null && styleZzZ8.getType() == 1) {
                return styleZzZ8;
            }
            if (styleZzZ8 != null || styleZzVp.getType() != 2) {
                return null;
            }
        }
        return styleZzVp;
    }

    public String getStyleName() {
        return getStyle().getName();
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public String getTag() {
        return this.zzXCk;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public String getTitle() {
        return this.zzZj;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public String getWordOpenXML() throws Exception {
        return new zzYO1().zzZ8(this);
    }

    public String getWordOpenXMLMinimal() throws Exception {
        return new zzYO1(true).zzZ8(this);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public XmlMapping getXmlMapping() {
        return this.zzXaz;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    @ReservedForInternalUse
    @Deprecated
    public boolean isMultiSection() {
        return false;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    @ReservedForInternalUse
    @Deprecated
    public boolean isRanged() {
        return false;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public boolean isShowingPlaceholderText() {
        return this.zzXaw;
    }

    public boolean isTemporary() {
        return this.zzXau;
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void removeMoveRevisions() {
        this.zzXat.remove(13);
        this.zzXat.remove(15);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void removeRunAttr(int i) {
        this.zzXat.remove(i);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void removeSelfOnly() throws Exception {
        zzQl(true);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setAppearance(int i) {
        this.zzXal = i;
        zzYDH.zzv(this);
    }

    public void setBuildingBlockCategory(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzX(getSdtType() == 7, "BuildingBlockCategory is only accessible for BuildingBlockGallery SDT type.");
        ((zzYDE) this.zzXaA).setBuildingBlockCategory(str);
    }

    public void setBuildingBlockGallery(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzX(getSdtType() == 7, "BuildingBlockType is only accessible for BuildingBlockGallery SDT type.");
        ((zzYDE) this.zzXaA).zzBk(str);
    }

    public void setCalendarType(int i) {
        zzX(getSdtType() == 6, "CalendarType is only accessible for Date SDT type.");
        ((zzYDF) this.zzXaA).setCalendarType(i);
        zzYDH.zzv(this);
    }

    public void setChecked(boolean z) throws Exception {
        zzX(getSdtType() == 13, "Checked is only accessible for Checkbox SDT type.");
        ((zzYDN) this.zzXaA).setChecked(z);
        zzQj(z);
    }

    public void setCheckedSymbol(int i, String str) throws Exception {
        zzX(i, str, true);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setColor(int i) {
        this.zzXam = com.aspose.words.internal.zzPV.zzYR(i);
    }

    public void setDateDisplayFormat(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzX(getSdtType() == 6, "DateDisplayFormat is only accessible for Date SDT type.");
        ((zzYDF) this.zzXaA).zzBl(str);
        zzYDH.zzv(this);
    }

    public void setDateDisplayLocale(int i) {
        zzX(getSdtType() == 6, "DateDisplayLocale is only accessible for Date SDT type.");
        ((zzYDF) this.zzXaA).zzmD(i);
        zzYDH.zzv(this);
    }

    public void setDateStorageFormat(int i) {
        zzX(getSdtType() == 6, "DateStorageFormat is only accessible for Date SDT type.");
        ((zzYDF) this.zzXaA).zzmC(i);
        zzYDH.zzv(this);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setDeleteRevision(zzZV8 zzzv8) {
        this.zzXat.zzQ(12, zzzv8);
    }

    public void setFullDate(Date date) {
        zz1(com.aspose.words.internal.zzZQ9.zzZ(date));
    }

    public final void setId(int i) {
        this.zzYG = getDocument().zzZpQ().zzji(i);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setInsertRevision(zzZV8 zzzv8) {
        this.zzXat.zzQ(14, zzzv8);
    }

    public final void setLevel(int i) {
        StructuredDocumentTag structuredDocumentTag = new StructuredDocumentTag(getDocument(), i);
        if (getParentNode() != null && !getParentNode().zzT(structuredDocumentTag)) {
            throw new IllegalStateException("Cannot change markup level.");
        }
        Iterator<T> it = getChildNodes(28, true).iterator();
        while (it.hasNext()) {
            zzZ(i, structuredDocumentTag, (StructuredDocumentTag) it.next());
        }
        zzZ(i, structuredDocumentTag, this);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setLockContentControl(boolean z) {
        this.zzXaq = z;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setLockContents(boolean z) {
        this.zzXap = z;
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveFromRevision(zzYX5 zzyx5) {
        this.zzXat.zzQ(13, zzyx5);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveToRevision(zzYX5 zzyx5) {
        this.zzXat.zzQ(15, zzyx5);
    }

    public void setMultiline(boolean z) {
        zzX(getSdtType() == 11 || getSdtType() == 12, "Multiline is only accessible for Richtext and Plaintext SDT types.");
        ((zzYD0) this.zzXaA).zzR1(z);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setPlaceholderName(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzB2(str);
        BuildingBlock buildingBlockZzY = getDocument().zzZpR().zzY(this, false);
        if (buildingBlockZzY == null) {
            throw new IllegalStateException("BuildingBlock with such Name does not exist in the document glossary.");
        }
        this.zzXar = buildingBlockZzY;
        if (isShowingPlaceholderText() || getXmlMapping().isEmpty() || !com.aspose.words.internal.zzZYD.zzXk(getXmlMapping().getXPath())) {
            removeAllChildren();
            zzYDI.zzZ(this, false);
        }
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void setRunAttr(int i, Object obj) {
        this.zzXat.zzQ(i, obj);
        if (getSdtType() == 13) {
            zzZS(i, obj);
        }
    }

    public void setStyle(Style style) {
        if (style == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        if (style.getDocument() != getDocument()) {
            throw new IllegalArgumentException("This style belongs to a different document.");
        }
        Style styleZzx = zzx(style);
        if (styleZzx == null) {
            throw new IllegalStateException("Cannot apply this style to the SDT: Style should be a character or a linked one.");
        }
        int iZzZ7j = styleZzx.zzZ7j();
        if (styleZzx.zzZ7j() == 10) {
            iZzZ7j = StyleIdentifier.NIL;
        }
        this.zzXat.zzBl(iZzZ7j);
    }

    public void setStyleName(String str) {
        setStyle(getDocument().getStyles().zzAY(str));
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setTag(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzXCk = str;
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void setTitle(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzZj = str;
    }

    public void setUncheckedSymbol(int i, String str) throws Exception {
        zzX(i, str, false);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    @ReservedForInternalUse
    @Deprecated
    public Node structuredDocumentTagNode() {
        return this;
    }

    public final void zz1(com.aspose.words.internal.zzZQ9 zzzq9) {
        zzX(getSdtType() == 6, "FullDate is only accessible for Date SDT type.");
        ((zzYDF) this.zzXaA).zz2(zzzq9);
        zzYDH.zzv(this);
    }

    public final String zz8M() {
        return this.zzZCi;
    }

    public final String zz8N() {
        return this.zzZCj;
    }

    public final void zzB2(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzXaB = str;
        }
    }

    public final void zzBb(String str) {
        this.zzZCk = str;
    }

    public final void zzQk(boolean z) {
        if ((z || this.zzXar == null) && com.aspose.words.internal.zzZYD.zzXk(getPlaceholderName())) {
            this.zzXar = getDocument().zzZpR().zzY(this, true);
        }
        getDocument().zzZpR().zzr(this);
    }

    public final void zzQl(boolean z) throws Exception {
        if (z) {
            getXmlMapping().zzXQI();
        }
        zzYVU.zzx(this, true);
        coreRemoveSelfOnly();
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return zzYVU.zzY(this, node);
    }

    public final void zzTd(String str) {
        this.zzZCi = str;
    }

    public final void zzTe(String str) {
        this.zzZCj = str;
    }

    public final boolean zzY3D() {
        return getSdtType() == 7 || getSdtType() == 8;
    }

    public final void zzY3F() {
        Node nodeZzZYq = zzZYq();
        if (nodeZzZYq == null || nodeZzZYq.getNodeType() != 5) {
            return;
        }
        Table table = (Table) nodeZzZYq;
        if (table.getRows().getCount() > 0 && table.getLastRow().getCells().getCount() == 1 && table.getLastRow().getFirstCell().zz6G().zz5B()) {
            appendChild(new Paragraph(getDocument()));
        }
    }

    public final boolean zzY3G() {
        return getSdtType() == 13 || getSdtType() == 16 || zzY3P() || zzY3O() || getAppearance() != 0 || this.zzXak != 0 || this.zzXam != null || this.zzZCk != null || getXmlMapping().zzXQG();
    }

    public final zzYDG zzY3H() {
        return this.zzXaA;
    }

    public final zzYEF zzY3I() {
        return this.zzXas;
    }

    public final zzYEF zzY3J() {
        return this.zzXat;
    }

    public final int zzY3K() {
        return this.zzXav;
    }

    public final boolean zzY3L() {
        return this.zzXax;
    }

    public final int zzY3M() {
        return this.zzXay;
    }

    public final int zzY3N() {
        return this.zzXak;
    }

    public final boolean zzY3O() {
        return getSdtType() == 15;
    }

    public final boolean zzY3P() {
        return getSdtType() == 14;
    }

    public final com.aspose.words.internal.zzPV zzY3Q() {
        return this.zzXam;
    }

    public final com.aspose.words.internal.zzZQ9 zzY3R() {
        zzX(getSdtType() == 6, "FullDate is only accessible for Date SDT type.");
        return ((zzYDF) this.zzXaA).zzYcR();
    }

    public final boolean zzY3S() {
        zzX(getSdtType() == 13, "ContentChecked is only accessible for Checkbox SDT type.");
        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(getChild(21, 0, true), Run.class);
        if (run != null) {
            String text = run.getText();
            if (text.length() == 1) {
                char cCharAt = text.charAt(0);
                zzYDN zzydn = (zzYDN) this.zzXaA;
                if (cCharAt == zzydn.zzYcX().zzYcU()) {
                    return true;
                }
                zzydn.zzYcW().zzYcU();
            }
        }
        return false;
    }

    public final void zzY3V() {
        if (getXmlMapping().isEmpty()) {
            if (getLevel() != 1) {
                getLevel();
            }
            CompositeNode compositeNodeZzZYt = zzZYt();
            if (compositeNodeZzZYt != null) {
                if (compositeNodeZzZYt != zzZYs() || compositeNodeZzZYt.zzZYr() != null || compositeNodeZzZYt.getNodeType() != 8) {
                    return;
                }
            } else if (zzY3E()) {
                return;
            }
            isShowingPlaceholderText(true);
            if (getPlaceholder() == null && getSdtType() != 10 && getSdtType() != 13) {
                zzYDI.zzZ(compositeNodeZzZYt != null ? compositeNodeZzZYt : this, this.zzXat, getLevel() == 2 && compositeNodeZzZYt == null, this.zzXas);
                return;
            }
            if (compositeNodeZzZYt != null) {
                zzZ(compositeNodeZzZYt.getFirstChild(), (Node) null, compositeNodeZzZYt);
                compositeNodeZzZYt.remove();
            }
            zzYDI.zzZ(this, true);
        }
    }

    public final boolean zzY3W() {
        return (getAncestor(1) == null || getDocument().getNodeType() == 31) ? false : true;
    }

    public final boolean zzY3X() {
        int sdtType = getSdtType();
        if (sdtType == 4 || sdtType == 5 || sdtType == 6) {
            return true;
        }
        switch (sdtType) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                return false;
        }
    }

    public final void zzY3Y() {
        if (this.zzYG == -1) {
            this.zzYG = getDocument().zzZpQ().zzji(zzY41.zzXUb());
        }
    }

    public final String zzYbI() {
        return this.zzZCk;
    }

    public final boolean zzYcP() {
        return getSdtType() == 6 && ((zzYDF) this.zzXaA).zzYcP();
    }

    public final String zzYln() {
        StringBuilder sb = new StringBuilder();
        for (Run run : getChildNodes(21, true)) {
            if (zzZ7R.zzZ(run, 130, 0) != zzZU.zzZF6 && !run.isDeleteRevision()) {
                com.aspose.words.internal.zzZNH.zzU(sb, run.getText());
            }
        }
        return sb.toString();
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) super.zzZ(z, zzza5);
        zzYDG zzydgZzYcY = this.zzXaA.zzYcY();
        structuredDocumentTag.zzXaA = zzydgZzYcY;
        if ((zzydgZzYcY instanceof zzYDC) || (zzydgZzYcY instanceof zzYDK)) {
            ((zzYDB) zzydgZzYcY).getListItems().zzs(structuredDocumentTag);
        }
        structuredDocumentTag.zzXat = (zzYEF) this.zzXat.zzbn();
        structuredDocumentTag.zzXas = (zzYEF) this.zzXas.zzbn();
        BuildingBlock buildingBlock = this.zzXar;
        if (buildingBlock != null) {
            structuredDocumentTag.zzXar = buildingBlock;
        }
        if (this.zzYG != -1) {
            structuredDocumentTag.zzYG = structuredDocumentTag.getDocument().zzZpQ().zzji(this.zzYG);
        }
        structuredDocumentTag.zzXaz = this.zzXaz.zzl(structuredDocumentTag);
        structuredDocumentTag.zzXao = null;
        return structuredDocumentTag;
    }

    public final void zzZG(com.aspose.words.internal.zzPV zzpv) {
        this.zzXam = zzpv;
    }

    public final void zzl9(int i) {
        this.zzXav = i;
    }

    public final void zzla(int i) {
        this.zzXay = i;
        this.zzXax = true;
    }

    public final void zzlb(int i) {
        this.zzXak = i;
    }

    public final void zzlc(int i) {
        this.zzXal = i;
    }

    public final void zzle(int i) {
        this.zzYG = i;
    }

    public final void zzr(zzYEF zzyef) {
        this.zzXat = zzyef;
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i, int i2) {
        return this.zzXat.zzVQ(i, i2);
    }

    @Override // com.aspose.words.IStructuredDocumentTag
    public void isShowingPlaceholderText(boolean z) {
        this.zzXaw = z;
    }

    public void isTemporary(boolean z) {
        this.zzXau = z;
    }

    public StructuredDocumentTag(DocumentBase documentBase, int i) {
        super(documentBase);
        this.zzYG = -1;
        this.zzZj = "";
        this.zzXCk = "";
        this.zzYw = i;
        this.zzXaA = new zzYDA();
        this.zzXat = new zzYEF();
        this.zzXas = new zzYEF();
        this.zzXaz = new XmlMapping(this);
    }

    private void zzX(boolean z, String str) {
        zzY3T();
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    private static void zzZ(int i, StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2) {
        for (Node node : structuredDocumentTag2.getChildNodes(0, false)) {
            if (node.getNodeType() != 28 && !zzYVU.zzY(structuredDocumentTag, node)) {
                throw new IllegalStateException("Cannot change markup level.");
            }
        }
        structuredDocumentTag2.zzYw = i;
    }

    public final void zzZ(zzYDG zzydg) {
        this.zzXaA = zzydg;
    }
}
