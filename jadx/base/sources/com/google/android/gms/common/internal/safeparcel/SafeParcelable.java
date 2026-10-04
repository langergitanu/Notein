package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public interface SafeParcelable extends Parcelable {
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    public @interface Class {
        String creator();

        boolean creatorIsFinal() default true;

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    public @interface Constructor {
    }

    public @interface Field {
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* JADX INFO: renamed from: id */
        int m74914id();

        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface Indicator {
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface Param {
        /* JADX INFO: renamed from: id */
        int m74915id();
    }

    public @interface RemovedParam {
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        /* JADX INFO: renamed from: id */
        int m74916id();
    }

    public @interface Reserved {
        int[] value();
    }

    public @interface VersionField {
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* JADX INFO: renamed from: id */
        int m74917id();

        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
