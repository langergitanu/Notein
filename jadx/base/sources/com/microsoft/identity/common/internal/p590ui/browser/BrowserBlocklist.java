package com.microsoft.identity.common.internal.p590ui.browser;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.logging.Logger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class BrowserBlocklist {
    private static final String TAG = "BrowserBlocklist";
    private List<Browser> mBrowsers;

    public BrowserBlocklist(Browser... browserArr) {
        this.mBrowsers = Arrays.asList(browserArr);
    }

    public boolean matches(Browser browser) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":matches");
        Iterator<Browser> it = this.mBrowsers.iterator();
        while (it.hasNext()) {
            if (it.next().equals(browser)) {
                Logger.verbose(strOooO0OO, "The target browser is in the block list.");
                return true;
            }
        }
        return false;
    }
}
