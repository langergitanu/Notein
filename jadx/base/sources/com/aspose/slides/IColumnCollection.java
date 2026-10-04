package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IColumnCollection extends IGenericCollection<IColumn> {
    IColumn[] addClone(IColumn iColumn, boolean z);

    IColumn get_Item(int i);

    IColumn[] insertClone(int i, IColumn iColumn, boolean z);

    void removeAt(int i, boolean z);
}
