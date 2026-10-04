package androidx.core.text;

import android.text.TextUtils;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0086\b¨\u0006\u0002"}, m80612d2 = {"htmlEncode", "", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class StringKt {
    public static final String htmlEncode(String str) {
        return TextUtils.htmlEncode(str);
    }
}
