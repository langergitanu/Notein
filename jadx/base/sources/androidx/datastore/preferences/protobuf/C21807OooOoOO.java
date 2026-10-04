package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C21807OooOoOO extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f64486OooOo0o;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOoOO$OooO00o */
    public static class OooO00o extends C21807OooOoOO {
        private static final long serialVersionUID = 3283890091615336259L;
    }

    public static C21807OooOoOO OooO00o() {
        return new C21807OooOoOO("Protocol message had invalid UTF-8.");
    }

    public static OooO00o OooO0O0() {
        return new OooO00o("Protocol message tag had invalid wire type.");
    }

    public static C21807OooOoOO OooO0OO() {
        return new C21807OooOoOO("CodedInputStream encountered a malformed varint.");
    }

    public static C21807OooOoOO OooO0Oo() {
        return new C21807OooOoOO("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C21807OooOoOO OooO0o0() {
        return new C21807OooOoOO("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
