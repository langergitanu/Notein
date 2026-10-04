package com.facebook.common.callercontext;

import android.os.Parcel;
import android.os.Parcelable;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class ContextChain implements Parcelable {
    public static final Parcelable.Creator<ContextChain> CREATOR = new OooO00o();
    public static final String TAG_INFRA = "i";
    public static final String TAG_PRODUCT = "p";
    public static final String TAG_PRODUCT_AND_INFRA = "pi";

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f67232OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f67233OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f67234OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ContextChain f67235OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final String f67236OooOoOO;

    public class OooO00o implements Parcelable.Creator<ContextChain> {
        @Override // android.os.Parcelable.Creator
        public final ContextChain createFromParcel(Parcel parcel) {
            return new ContextChain(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ContextChain[] newArray(int i) {
            return new ContextChain[i];
        }
    }

    public ContextChain(Parcel parcel) {
        this.f67233OooOo0o = parcel.readString();
        this.f67232OooOo = parcel.readString();
        this.f67236OooOoOO = parcel.readString();
        this.f67235OooOoO0 = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContextChain contextChain = (ContextChain) obj;
            if (Objects.equals(this.f67236OooOoOO, contextChain.f67236OooOoOO) && Objects.equals(this.f67235OooOoO0, contextChain.f67235OooOoO0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f67235OooOoO0, this.f67236OooOoOO);
    }

    public final String toString() {
        if (this.f67234OooOoO == null) {
            this.f67234OooOoO = this.f67236OooOoOO;
            ContextChain contextChain = this.f67235OooOoO0;
            if (contextChain != null) {
                this.f67234OooOoO = contextChain.toString() + IOUtils.DIR_SEPARATOR_UNIX + this.f67234OooOoO;
            }
        }
        return this.f67234OooOoO;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f67233OooOo0o);
        parcel.writeString(this.f67232OooOo);
        parcel.writeString(this.f67236OooOoOO);
        parcel.writeParcelable(this.f67235OooOoO0, i);
    }
}
