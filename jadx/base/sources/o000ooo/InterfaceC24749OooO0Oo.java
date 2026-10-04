package o000ooo;

/* JADX INFO: renamed from: o000ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC24749OooO0Oo extends AutoCloseable {
    void OooO0o(int i, long j);

    void OooO0oO(int i);

    void OooOOOO(double d, int i);

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    boolean isNull(int i);

    void o000000O(int i, String str);

    void o0000O0(byte[] bArr);

    default boolean o0000oO0() {
        return getLong(0) != 0;
    }

    String o000OoO(int i);

    boolean o00oO0o();

    void reset();
}
