package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IRowCollection extends IGenericCollection<IRow> {
    IRow[] addClone(IRow iRow, boolean z);

    IRow get_Item(int i);

    IRow[] insertClone(int i, IRow iRow, boolean z);

    void removeAt(int i, boolean z);
}
