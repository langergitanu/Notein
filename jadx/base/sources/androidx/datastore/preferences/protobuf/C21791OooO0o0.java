package androidx.datastore.preferences.protobuf;

import com.aspose.slides.Collections.Generic.SortedList;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21791OooO0o0 {
    public static int OooO00o(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static Integer OooO0O0(int i, SortedList sortedList, String str, int i2) {
        sortedList.addItem(Integer.valueOf(i), str);
        return Integer.valueOf(i2);
    }

    public static void OooO0OO(int i, String str, String str2) {
        HMSLog.m80174i(str2, str + i);
    }
}
