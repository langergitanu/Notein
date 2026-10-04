package com.aspose.words.internal;

import androidx.core.view.InputDeviceCompat;
import com.aspose.words.EditingLanguage;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* JADX INFO: loaded from: classes5.dex */
final class zzSD extends zzZWY {
    private static zzD4 zzOm;

    static {
        zzD4 zzd4 = new zzD4();
        zzOm = zzd4;
        zzd4.add(8192, 32);
        zzOm.add(EditingLanguage.ARABIC_OMAN, 32);
        zzOm.add(InputDeviceCompat.SOURCE_MOUSE, 32);
        zzOm.add(8195, 32);
        zzOm.add(8196, 32);
        zzOm.add(8197, 32);
        zzOm.add(8198, 32);
        zzOm.add(8199, 32);
        zzOm.add(JosStatusCodes.RNT_CODE_SERVER_ERROR, 32);
        zzOm.add(EditingLanguage.ENGLISH_JAMAICA, 32);
        zzOm.add(EditingLanguage.SPANISH_VENEZUELA, 32);
    }

    public zzSD() {
        super(zzOm);
    }
}
