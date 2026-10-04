package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum o00oO0O {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(OooO.f64403OooOo),
    ENUM(null),
    MESSAGE(null);


    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Serializable f64575OooOo0o;

    o00oO0O(Serializable serializable) {
        this.f64575OooOo0o = serializable;
    }
}
