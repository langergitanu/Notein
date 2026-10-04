package com.hihonor.honorid.usecase;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.hihonor.honorid.UseCase;
import com.hihonor.honorid.core.data.HonorAccount;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class WriteHnAccountUseCase extends UseCase<RequestValues> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f68955OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ArrayList<HonorAccount> f68956OooO0O0;

    public static final class RequestValues extends UseCase.RequestValues {
        public static final Parcelable.Creator<RequestValues> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public String f68957OooOo0o;

        public class OooO00o implements Parcelable.Creator<RequestValues> {
            @Override // android.os.Parcelable.Creator
            public final RequestValues createFromParcel(Parcel parcel) {
                RequestValues requestValues = new RequestValues();
                requestValues.f68957OooOo0o = parcel.readString();
                return requestValues;
            }

            @Override // android.os.Parcelable.Creator
            public final RequestValues[] newArray(int i) {
                return new RequestValues[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f68957OooOo0o);
        }
    }
}
