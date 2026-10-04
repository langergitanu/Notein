package com.oplus.ocs.base.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.oplus.ocs.base.common.constant.CommonStatusCodes;
import com.oplus.ocs.base.internal.safeparcel.AbstractSafeParcelable;
import com.oplus.ocs.base.internal.safeparcel.C18839b;
import com.oplus.ocs.base.utils.C18865e;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class Status extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C18837b();

    /* JADX INFO: renamed from: a */
    private int f57448a;

    /* JADX INFO: renamed from: b */
    private int f57449b;

    /* JADX INFO: renamed from: c */
    private String f57450c;

    /* JADX INFO: renamed from: d */
    private PendingIntent f57451d;

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f57448a = i;
        this.f57449b = i2;
        this.f57450c = str;
        this.f57451d = pendingIntent;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f57448a == status.f57448a && this.f57449b == status.f57449b && C18865e.m80559a(this.f57450c, status.f57450c) && C18865e.m80559a(this.f57451d, status.f57451d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f57448a), Integer.valueOf(this.f57449b), this.f57450c, this.f57451d});
    }

    public String toString() {
        C18865e.a aVarM80558a = C18865e.m80558a(this);
        String statusCodeString = this.f57450c;
        if (statusCodeString == null) {
            statusCodeString = CommonStatusCodes.getStatusCodeString(this.f57449b);
        }
        return aVarM80558a.m80560a(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, statusCodeString).m80560a("resolution", this.f57451d).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM80524b = C18839b.m80524b(parcel, 20293);
        C18839b.m80523a(parcel, 1, this.f57449b);
        C18839b.m80523a(parcel, 1000, this.f57448a);
        String str = this.f57450c;
        if (str != null) {
            int iM80524b2 = C18839b.m80524b(parcel, 2);
            parcel.writeString(str);
            C18839b.m80522a(parcel, iM80524b2);
        }
        PendingIntent pendingIntent = this.f57451d;
        if (pendingIntent != null) {
            int iM80524b3 = C18839b.m80524b(parcel, 3);
            pendingIntent.writeToParcel(parcel, i);
            C18839b.m80522a(parcel, iM80524b3);
        }
        C18839b.m80522a(parcel, iM80524b);
    }
}
