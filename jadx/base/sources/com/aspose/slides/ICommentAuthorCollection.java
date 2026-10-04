package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ICommentAuthorCollection extends IGenericCollection<ICommentAuthor> {
    ICommentAuthor addAuthor(String str, String str2);

    void clear();

    ICommentAuthor[] findByName(String str);

    ICommentAuthor[] findByNameAndInitials(String str, String str2);

    ICommentAuthor get_Item(int i);

    void remove(ICommentAuthor iCommentAuthor);

    void removeAt(int i);

    ICommentAuthor[] toArray();
}
