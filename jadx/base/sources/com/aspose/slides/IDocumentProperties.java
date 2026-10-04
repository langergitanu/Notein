package com.aspose.slides;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public interface IDocumentProperties {
    void clearBuiltInProperties();

    void clearCustomProperties();

    boolean containsCustomProperty(String str);

    String getAppVersion();

    String getApplicationTemplate();

    String getAuthor();

    String getCategory();

    String getComments();

    String getCompany();

    String getContentStatus();

    String getContentType();

    int getCountOfCustomProperties();

    Date getCreatedTime();

    String getCustomPropertyName(int i);

    void getCustomPropertyValue(String str, double[] dArr);

    void getCustomPropertyValue(String str, float[] fArr);

    void getCustomPropertyValue(String str, int[] iArr);

    void getCustomPropertyValue(String str, String[] strArr);

    void getCustomPropertyValue(String str, Date[] dateArr);

    void getCustomPropertyValue(String str, boolean[] zArr);

    String getHyperlinkBase();

    String getKeywords();

    Date getLastPrinted();

    String getLastSavedBy();

    Date getLastSavedTime();

    String getManager();

    String getNameOfApplication();

    String getPresentationFormat();

    int getRevisionNumber();

    boolean getSharedDoc();

    String getSubject();

    String getTitle();

    double getTotalEditingTime();

    Object get_Item(String str);

    boolean removeCustomProperty(String str);

    void setApplicationTemplate(String str);

    void setAuthor(String str);

    void setCategory(String str);

    void setComments(String str);

    void setCompany(String str);

    void setContentStatus(String str);

    void setContentType(String str);

    void setCreatedTime(Date date);

    void setCustomPropertyValue(String str, double d);

    void setCustomPropertyValue(String str, float f);

    void setCustomPropertyValue(String str, int i);

    void setCustomPropertyValue(String str, String str2);

    void setCustomPropertyValue(String str, Date date);

    void setCustomPropertyValue(String str, boolean z);

    void setHyperlinkBase(String str);

    void setKeywords(String str);

    void setLastPrinted(Date date);

    void setLastSavedBy(String str);

    void setLastSavedTime(Date date);

    void setManager(String str);

    void setNameOfApplication(String str);

    void setPresentationFormat(String str);

    void setRevisionNumber(int i);

    void setSharedDoc(boolean z);

    void setSubject(String str);

    void setTitle(String str);

    void setTotalEditingTime(double d);

    void set_Item(String str, Object obj);
}
