package com.vivo.penalgoengine.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class ShapeData implements Parcelable {
    public static final Parcelable.Creator<ShapeData> CREATOR = new OooO00o();
    public static final int CURVE_TYPE_ARC = 18;
    public static final int CURVE_TYPE_ARC_ARROW = 19;
    public static final int CURVE_TYPE_BROKEN_LINE = 22;
    public static final int CURVE_TYPE_CIRCLE = 15;
    public static final int CURVE_TYPE_DIAMOND = 9;
    public static final int CURVE_TYPE_ELLIPSE = 14;
    public static final int CURVE_TYPE_HEART = 10;
    public static final int CURVE_TYPE_HEXAGON = 13;
    public static final int CURVE_TYPE_LINE = 16;
    public static final int CURVE_TYPE_LINE_ARROW = 17;
    public static final int CURVE_TYPE_PARALLELOGRAM = 7;
    public static final int CURVE_TYPE_PENTAGON = 12;
    public static final int CURVE_TYPE_PENTAGRAM = 6;
    public static final int CURVE_TYPE_QUADRANGLE = 21;
    public static final int CURVE_TYPE_RECTANGLE = 8;
    public static final int CURVE_TYPE_REVERSE_ARC_ARROW = 24;
    public static final int CURVE_TYPE_REVERSE_LINE_ARROW = 23;
    public static final int CURVE_TYPE_TRIANGLE = 11;
    public static final int CURVE_TYPE_VORTEX = 20;
    public static final int GESTURE_TYPE_EXCHANGE = 100;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ArrayList f80206OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80207OooOo0o;

    public class OooO00o implements Parcelable.Creator<ShapeData> {
        @Override // android.os.Parcelable.Creator
        public final ShapeData createFromParcel(Parcel parcel) {
            ShapeData shapeData = new ShapeData();
            shapeData.f80207OooOo0o = parcel.readInt();
            shapeData.f80206OooOo = parcel.createTypedArrayList(TouchPoint.CREATOR);
            return shapeData;
        }

        @Override // android.os.Parcelable.Creator
        public final ShapeData[] newArray(int i) {
            return new ShapeData[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ShapeData{type=" + this.f80207OooOo0o + ", touchPoints=" + this.f80206OooOo + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f80207OooOo0o);
        parcel.writeTypedList(this.f80206OooOo);
    }
}
