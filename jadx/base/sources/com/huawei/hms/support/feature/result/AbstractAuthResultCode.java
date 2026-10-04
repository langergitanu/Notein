package com.huawei.hms.support.feature.result;

import android.text.TextUtils;
import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.hms.common.api.CommonStatusCodes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractAuthResultCode extends CommonStatusCodes {
    public static final int RESULT_CODE_CANCELLED = 2012;
    public static final int RESULT_CODE_EXECUTING = 2013;
    public static final int RESULT_CODE_FAILED = 2014;
    public static final int SIGN_IN_JSONEXCEPTION = 2015;

    /* JADX INFO: renamed from: a */
    private static final Map<Integer, String> f56928a;

    static {
        HashMap map = new HashMap();
        f56928a = map;
        map.put(2012, "Auth canceled by subscriber");
        map.put(2013, "Auth executing");
        map.put(2014, "An unrecoverable auth failure occurred");
    }

    public static String getResultDescription(int i) {
        String str = f56928a.get(Integer.valueOf(i));
        return TextUtils.isEmpty(str) ? C21532OooOOo.OooO0OO(i, "unknown status code: ") : str;
    }
}
