package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IMasterSlideCollection extends IGenericCollection<IMasterSlide> {
    IMasterSlide addClone(IMasterSlide iMasterSlide);

    IMasterSlide get_Item(int i);

    IMasterSlide insertClone(int i, IMasterSlide iMasterSlide);

    void remove(IMasterSlide iMasterSlide);

    void removeAt(int i);

    void removeUnused(boolean z);
}
