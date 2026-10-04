package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public interface IStructuredDocumentTag {
    int getAppearance();

    NodeCollection getChildNodes(int i, boolean z);

    int getColor();

    int getId();

    int getLevel();

    boolean getLockContentControl();

    boolean getLockContents();

    Node getNode();

    BuildingBlock getPlaceholder();

    String getPlaceholderName() throws Exception;

    int getSdtType();

    String getTag();

    String getTitle();

    String getWordOpenXML() throws Exception;

    XmlMapping getXmlMapping();

    boolean isMultiSection();

    @Deprecated
    boolean isRanged();

    void isShowingPlaceholderText(boolean z);

    boolean isShowingPlaceholderText();

    void removeSelfOnly() throws Exception;

    void setAppearance(int i);

    void setColor(int i);

    void setLockContentControl(boolean z);

    void setLockContents(boolean z);

    void setPlaceholderName(String str) throws Exception;

    void setTag(String str);

    void setTitle(String str);

    @Deprecated
    Node structuredDocumentTagNode();
}
