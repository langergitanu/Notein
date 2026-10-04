package com.huawei.hms.p588ui;

import android.content.Context;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractPromptDialog extends AbstractDialog {
    @Override // com.huawei.hms.p588ui.AbstractDialog
    public String onGetNegativeButtonString(Context context) {
        return null;
    }

    @Override // com.huawei.hms.p588ui.AbstractDialog
    public String onGetTitleString(Context context) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(context);
        }
        return ResourceLoaderUtil.getString("hms_bindfaildlg_title");
    }
}
