package com.aspose.words;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class BuiltInDocumentProperties extends DocumentPropertyCollection {
    private static com.aspose.words.internal.zzZYI zzZAX;
    private static com.aspose.words.internal.zzZYF zzZAY;
    zzZKK zzZAZ;

    static {
        com.aspose.words.internal.zzZYF zzzyf = new com.aspose.words.internal.zzZYF((char) 0);
        zzZAY = zzzyf;
        zzzyf.add("Last Author", "LastSavedBy");
        zzZAY.add("Revision Number", "RevisionNumber");
        zzZAY.add("Total Editing Time", "TotalEditingTime");
        zzZAY.add("Last Print Date", "LastPrinted");
        zzZAY.add("Creation Date", "CreateTime");
        zzZAY.add("Last Save Time", "LastSavedTime");
        zzZAY.add("Number of Pages", "Pages");
        zzZAY.add("Number of Words", "Words");
        zzZAY.add("Number of Characters", "Characters");
        zzZAY.add("Application Name", "NameOfApplication");
        zzZAY.add("Number of Bytes", "Bytes");
        zzZAY.add("Number of Lines", "Lines");
        zzZAY.add("Number of Paragraphs", "Paragraphs");
        com.aspose.words.internal.zzZYI zzzyi = new com.aspose.words.internal.zzZYI(false);
        zzZAX = zzzyi;
        zzzyi.add("Title", 4);
        zzZAX.add("Subject", 4);
        zzZAX.add("Author", 4);
        zzZAX.add("Keywords", 4);
        zzZAX.add("Comments", 4);
        zzZAX.add("Template", 4);
        zzZAX.add("LastSavedBy", 4);
        zzZAX.add("RevisionNumber", 3);
        zzZAX.add("TotalEditingTime", 3);
        zzZAX.add("LastPrinted", 1);
        zzZAX.add("CreateTime", 1);
        zzZAX.add("LastSavedTime", 1);
        zzZAX.add("Pages", 3);
        zzZAX.add("Words", 3);
        zzZAX.add("Characters", 3);
        zzZAX.add("Security", 3);
        zzZAX.add("NameOfApplication", 4);
        zzZAX.add("Category", 4);
        zzZAX.add("Bytes", 3);
        zzZAX.add("Lines", 3);
        zzZAX.add("Paragraphs", 3);
        zzZAX.add("HeadingPairs", 6);
        zzZAX.add("TitlesOfParts", 5);
        zzZAX.add("Manager", 4);
        zzZAX.add("Company", 4);
        zzZAX.add("LinksUpToDate", 0);
        zzZAX.add("CharactersWithSpaces", 3);
        zzZAX.add("HyperlinkBase", 4);
        zzZAX.add("Version", 3);
        zzZAX.add("ContentStatus", 4);
        zzZAX.add("ContentType", 4);
        zzZAX.add("DocumentVersion", 4);
        zzZAX.add("Language", 4);
        zzZAX.add("Thumbnail", 7);
    }

    private static String zzT9(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                return str;
            }
        }
        return "";
    }

    @Override // com.aspose.words.DocumentPropertyCollection
    public DocumentProperty get(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "name");
        String str2 = zzZAY.get(str);
        if (str2 != null) {
            str = str2;
        }
        DocumentProperty documentProperty = super.get(str);
        if (documentProperty == null) {
            int i = zzZAX.get(str);
            if (!com.aspose.words.internal.zzZYI.zzWm(i)) {
                return zzS(str, DocumentProperty.zzFI(i));
            }
        }
        return documentProperty;
    }

    public String getAuthor() {
        return get("Author").toString();
    }

    public int getBytes() {
        return get("Bytes").toInt();
    }

    public String getCategory() {
        return get("Category").toString();
    }

    public int getCharacters() {
        return get("Characters").toInt();
    }

    public int getCharactersWithSpaces() {
        return get("CharactersWithSpaces").toInt();
    }

    public String getComments() {
        return get("Comments").toString();
    }

    public String getCompany() {
        return get("Company").toString();
    }

    public String getContentStatus() {
        return get("ContentStatus").toString();
    }

    public String getContentType() {
        return get("ContentType").toString();
    }

    public Date getCreatedTime() {
        return com.aspose.words.internal.zzZQ9.zzJ(zz7h());
    }

    public Object[] getHeadingPairs() {
        return (Object[]) get("HeadingPairs").zzZol();
    }

    public String getHyperlinkBase() {
        return get("HyperlinkBase").toString();
    }

    public String getKeywords() {
        return get("Keywords").toString();
    }

    public Date getLastPrinted() {
        return com.aspose.words.internal.zzZQ9.zzJ(zz7g());
    }

    public String getLastSavedBy() {
        return get("LastSavedBy").toString();
    }

    public Date getLastSavedTime() {
        return com.aspose.words.internal.zzZQ9.zzJ(zz7f());
    }

    public int getLines() {
        return get("Lines").toInt();
    }

    public boolean getLinksUpToDate() {
        return get("LinksUpToDate").toBool();
    }

    public String getManager() {
        return get("Manager").toString();
    }

    public String getNameOfApplication() {
        return get("NameOfApplication").toString();
    }

    public int getPages() {
        return get("Pages").toInt();
    }

    public int getParagraphs() {
        return get("Paragraphs").toInt();
    }

    public int getRevisionNumber() {
        return get("RevisionNumber").toInt();
    }

    public int getSecurity() {
        return get("Security").toInt();
    }

    public String getSubject() {
        return get("Subject").toString();
    }

    public String getTemplate() {
        return get("Template").toString();
    }

    public byte[] getThumbnail() {
        return get("Thumbnail").toByteArray();
    }

    public String getTitle() {
        return get("Title").toString();
    }

    public String[] getTitlesOfParts() {
        return (String[]) get("TitlesOfParts").zzZol();
    }

    public int getTotalEditingTime() {
        return get("TotalEditingTime").toInt();
    }

    public int getVersion() {
        return get("Version").toInt();
    }

    public int getWords() {
        return get("Words").toInt();
    }

    public void setAuthor(String str) {
        get("Author").zzZA(str);
    }

    public void setBytes(int i) {
        get("Bytes").zzFJ(i);
    }

    public void setCategory(String str) {
        get("Category").zzZA(str);
    }

    public void setCharacters(int i) {
        get("Characters").zzFJ(i);
    }

    public void setCharactersWithSpaces(int i) {
        get("CharactersWithSpaces").zzFJ(i);
    }

    public void setComments(String str) {
        get("Comments").zzZA(str);
    }

    public void setCompany(String str) {
        get("Company").zzZA(str);
    }

    public void setContentStatus(String str) {
        get("ContentStatus").zzZA(str);
    }

    public void setContentType(String str) {
        get("ContentType").zzZA(str);
    }

    public void setCreatedTime(Date date) {
        zzB(com.aspose.words.internal.zzZQ9.zzZ(date));
    }

    public void setHeadingPairs(Object[] objArr) {
        get("HeadingPairs").zzZA(objArr);
    }

    public void setHyperlinkBase(String str) {
        get("HyperlinkBase").zzZA(str);
    }

    public void setKeywords(String str) {
        get("Keywords").zzZA(str);
    }

    public void setLastPrinted(Date date) {
        zzA(com.aspose.words.internal.zzZQ9.zzZ(date));
    }

    public void setLastSavedBy(String str) {
        get("LastSavedBy").zzZA(str);
    }

    public void setLastSavedTime(Date date) {
        zzz(com.aspose.words.internal.zzZQ9.zzZ(date));
    }

    public void setLines(int i) {
        get("Lines").zzFJ(i);
    }

    public void setLinksUpToDate(boolean z) {
        get("LinksUpToDate").zzWw(z);
    }

    public void setManager(String str) {
        get("Manager").zzZA(str);
    }

    public void setNameOfApplication(String str) {
        get("NameOfApplication").zzZA(str);
    }

    public void setPages(int i) {
        get("Pages").zzFJ(i);
    }

    public void setParagraphs(int i) {
        get("Paragraphs").zzFJ(i);
    }

    public void setRevisionNumber(int i) {
        get("RevisionNumber").zzFJ(i);
    }

    public void setSecurity(int i) {
        get("Security").zzFJ(i);
    }

    public void setSubject(String str) {
        get("Subject").zzZA(str);
    }

    public void setTemplate(String str) {
        get("Template").zzZA(str);
    }

    public void setThumbnail(byte[] bArr) {
        get("Thumbnail").zzZA(bArr);
    }

    public void setTitle(String str) {
        get("Title").zzZA(str);
    }

    public void setTitlesOfParts(String[] strArr) {
        get("TitlesOfParts").zzZA(strArr);
    }

    public void setTotalEditingTime(int i) {
        get("TotalEditingTime").zzFJ(i);
    }

    public void setVersion(int i) {
        get("Version").zzFJ(i);
    }

    public void setWords(int i) {
        get("Words").zzFJ(i);
    }

    @Override // com.aspose.words.DocumentPropertyCollection
    public final DocumentPropertyCollection zz7d() {
        return new BuiltInDocumentProperties();
    }

    public final boolean zz7e() {
        return ("Microsoft Office Word".equals(getNameOfApplication()) || "Aspose.Words".equals(getNameOfApplication())) && (getVersion() >> 16) <= 12;
    }

    public final com.aspose.words.internal.zzZQ9 zz7f() {
        return (com.aspose.words.internal.zzZQ9) get("LastSavedTime").zzZol();
    }

    public final com.aspose.words.internal.zzZQ9 zz7g() {
        return (com.aspose.words.internal.zzZQ9) get("LastPrinted").zzZol();
    }

    public final com.aspose.words.internal.zzZQ9 zz7h() {
        return (com.aspose.words.internal.zzZQ9) get("CreateTime").zzZol();
    }

    public final void zzA(com.aspose.words.internal.zzZQ9 zzzq9) {
        get("LastPrinted").zzZA(zzzq9);
    }

    public final void zzB(com.aspose.words.internal.zzZQ9 zzzq9) {
        get("CreateTime").zzZA(zzzq9);
    }

    public final void zzOJ(int i) {
        if (i <= 0 || i >= Integer.MAX_VALUE) {
            i = 0;
        }
        setTotalEditingTime(i);
    }

    public final void zzYo() {
        for (DocumentProperty documentProperty : this) {
            int type = documentProperty.getType();
            if (type != 4) {
                int i = 0;
                if (type == 5) {
                    String[] strArr = (String[]) documentProperty.zzZol();
                    while (i < strArr.length) {
                        strArr[i] = zzT9(strArr[i]);
                        i++;
                    }
                } else if (type == 6) {
                    Object[] objArr = (Object[]) documentProperty.zzZol();
                    while (i < objArr.length) {
                        Object obj = objArr[i];
                        if (obj instanceof String) {
                            objArr[i] = zzT9((String) obj);
                        }
                        i++;
                    }
                }
            } else {
                documentProperty.zzZA(com.aspose.words.internal.zzZKN.zzTX(documentProperty.toString()));
            }
        }
    }

    public final void zzz(com.aspose.words.internal.zzZQ9 zzzq9) {
        get("LastSavedTime").zzZA(zzzq9);
    }
}
