package o000oo;

import android.database.Cursor;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.OooOOO0;
import o000ooo.C24746OooO00o;
import o000ooo.InterfaceC24749OooO0Oo;
import o000oooO.InterfaceC24756OooO0O0;
import o000oooO.InterfaceC24758OooO0Oo;
import o000oooO.InterfaceC24759OooO0o;
import o000oooO.InterfaceC24760OooO0o0;

/* JADX INFO: renamed from: o000oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24653OooO0o0 implements InterfaceC24749OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f83499OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC24756OooO0O0 f83500OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f83501OooOoO0;

    /* JADX INFO: renamed from: o000oo.OooO0o0$OooO00o */
    public static final class OooO00o extends AbstractC24653OooO0o0 {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int[] f83502OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public long[] f83503OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public String[] f83504OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public double[] f83505OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public byte[][] f83506OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public Cursor f83507OooOooo;

        /* JADX INFO: renamed from: o000oo.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19642OooO00o implements InterfaceC24760OooO0o0 {
            public C19642OooO00o() {
            }

            @Override // o000oooO.InterfaceC24760OooO0o0
            public final String OooO00o() {
                return OooO00o.this.f83499OooOo;
            }

            @Override // o000oooO.InterfaceC24760OooO0o0
            public final void OooO0OO(InterfaceC24758OooO0Oo interfaceC24758OooO0Oo) {
                OooO00o oooO00o = OooO00o.this;
                int length = oooO00o.f83502OooOoO.length;
                for (int i = 1; i < length; i++) {
                    int i2 = oooO00o.f83502OooOoO[i];
                    if (i2 == 1) {
                        interfaceC24758OooO0Oo.OooO0o(i, oooO00o.f83503OooOoOO[i]);
                    } else if (i2 == 2) {
                        interfaceC24758OooO0Oo.OooOOOO(oooO00o.f83505OooOoo0[i], i);
                    } else if (i2 == 3) {
                        String str = oooO00o.f83504OooOoo[i];
                        OooOOO0.OooO0Oo(str);
                        interfaceC24758OooO0Oo.OoooOO0(i, str);
                    } else if (i2 == 4) {
                        byte[] bArr = oooO00o.f83506OooOooO[i];
                        OooOOO0.OooO0Oo(bArr);
                        interfaceC24758OooO0Oo.OooooO0(i, bArr);
                    } else if (i2 == 5) {
                        interfaceC24758OooO0Oo.OooO0oO(i);
                    }
                }
            }
        }

        public static void OooOOo0(Cursor cursor, int i) {
            if (i < 0 || i >= cursor.getColumnCount()) {
                C24746OooO00o.OooO0oO(25, "column index out of range");
                throw null;
            }
        }

        public final void OooO0OO(int i, int i2) {
            int i3 = i2 + 1;
            int[] iArr = this.f83502OooOoO;
            if (iArr.length < i3) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
                OooOOO0.OooO0o(iArrCopyOf, "copyOf(...)");
                this.f83502OooOoO = iArrCopyOf;
            }
            if (i == 1) {
                long[] jArr = this.f83503OooOoOO;
                if (jArr.length < i3) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i3);
                    OooOOO0.OooO0o(jArrCopyOf, "copyOf(...)");
                    this.f83503OooOoOO = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i == 2) {
                double[] dArr = this.f83505OooOoo0;
                if (dArr.length < i3) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i3);
                    OooOOO0.OooO0o(dArrCopyOf, "copyOf(...)");
                    this.f83505OooOoo0 = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i == 3) {
                String[] strArr = this.f83504OooOoo;
                if (strArr.length < i3) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i3);
                    OooOOO0.OooO0o(objArrCopyOf, "copyOf(...)");
                    this.f83504OooOoo = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
            byte[][] bArr = this.f83506OooOooO;
            if (bArr.length < i3) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i3);
                OooOOO0.OooO0o(objArrCopyOf2, "copyOf(...)");
                this.f83506OooOooO = (byte[][]) objArrCopyOf2;
            }
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void OooO0o(int i, long j) {
            OooO00o();
            OooO0OO(1, i);
            this.f83502OooOoO[i] = 1;
            this.f83503OooOoOO[i] = j;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void OooO0oO(int i) {
            OooO00o();
            OooO0OO(5, i);
            this.f83502OooOoO[i] = 5;
        }

        public final void OooOOO0() {
            if (this.f83507OooOooo == null) {
                this.f83507OooOooo = this.f83500OooOo0o.o0ooOoO(new C19642OooO00o());
            }
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void OooOOOO(double d, int i) {
            OooO00o();
            OooO0OO(2, i);
            this.f83502OooOoO[i] = 2;
            this.f83505OooOoo0[i] = d;
        }

        public final Cursor OooOOoo() {
            Cursor cursor = this.f83507OooOooo;
            if (cursor != null) {
                return cursor;
            }
            C24746OooO00o.OooO0oO(21, "no row");
            throw null;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (!this.f83501OooOoO0) {
                OooO00o();
                this.f83502OooOoO = new int[0];
                this.f83503OooOoOO = new long[0];
                this.f83505OooOoo0 = new double[0];
                this.f83504OooOoo = new String[0];
                this.f83506OooOooO = new byte[0][];
                reset();
            }
            this.f83501OooOoO0 = true;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final byte[] getBlob(int i) {
            OooO00o();
            Cursor cursorOooOOoo = OooOOoo();
            OooOOo0(cursorOooOOoo, i);
            byte[] blob = cursorOooOOoo.getBlob(i);
            OooOOO0.OooO0o(blob, "getBlob(...)");
            return blob;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final int getColumnCount() {
            OooO00o();
            OooOOO0();
            Cursor cursor = this.f83507OooOooo;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final String getColumnName(int i) {
            OooO00o();
            OooOOO0();
            Cursor cursor = this.f83507OooOooo;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            OooOOo0(cursor, i);
            String columnName = cursor.getColumnName(i);
            OooOOO0.OooO0o(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final double getDouble(int i) {
            OooO00o();
            Cursor cursorOooOOoo = OooOOoo();
            OooOOo0(cursorOooOOoo, i);
            return cursorOooOOoo.getDouble(i);
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final long getLong(int i) {
            OooO00o();
            Cursor cursorOooOOoo = OooOOoo();
            OooOOo0(cursorOooOOoo, i);
            return cursorOooOOoo.getLong(i);
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final boolean isNull(int i) {
            OooO00o();
            Cursor cursorOooOOoo = OooOOoo();
            OooOOo0(cursorOooOOoo, i);
            return cursorOooOOoo.isNull(i);
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void o000000O(int i, String value) {
            OooOOO0.OooO0oO(value, "value");
            OooO00o();
            OooO0OO(3, i);
            this.f83502OooOoO[i] = 3;
            this.f83504OooOoo[i] = value;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void o0000O0(byte[] value) {
            OooOOO0.OooO0oO(value, "value");
            OooO00o();
            OooO0OO(4, 7);
            this.f83502OooOoO[7] = 4;
            this.f83506OooOooO[7] = value;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final String o000OoO(int i) {
            OooO00o();
            Cursor cursorOooOOoo = OooOOoo();
            OooOOo0(cursorOooOOoo, i);
            String string = cursorOooOOoo.getString(i);
            OooOOO0.OooO0o(string, "getString(...)");
            return string;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final boolean o00oO0o() {
            OooO00o();
            OooOOO0();
            Cursor cursor = this.f83507OooOooo;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void reset() {
            OooO00o();
            Cursor cursor = this.f83507OooOooo;
            if (cursor != null) {
                cursor.close();
            }
            this.f83507OooOooo = null;
        }
    }

    /* JADX INFO: renamed from: o000oo.OooO0o0$OooO0O0 */
    public static final class OooO0O0 extends AbstractC24653OooO0o0 {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final InterfaceC24759OooO0o f83509OooOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(InterfaceC24756OooO0O0 db, String sql) {
            super(db, sql);
            OooOOO0.OooO0oO(db, "db");
            OooOOO0.OooO0oO(sql, "sql");
            this.f83509OooOoO = db.o0000Oo(sql);
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void OooO0o(int i, long j) {
            OooO00o();
            this.f83509OooOoO.OooO0o(i, j);
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void OooO0oO(int i) {
            OooO00o();
            this.f83509OooOoO.OooO0oO(i);
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void OooOOOO(double d, int i) {
            OooO00o();
            this.f83509OooOoO.OooOOOO(d, i);
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f83509OooOoO.close();
            this.f83501OooOoO0 = true;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final byte[] getBlob(int i) {
            OooO00o();
            C24746OooO00o.OooO0oO(21, "no row");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final int getColumnCount() {
            OooO00o();
            return 0;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final String getColumnName(int i) {
            OooO00o();
            C24746OooO00o.OooO0oO(21, "no row");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final double getDouble(int i) {
            OooO00o();
            C24746OooO00o.OooO0oO(21, "no row");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final long getLong(int i) {
            OooO00o();
            C24746OooO00o.OooO0oO(21, "no row");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final boolean isNull(int i) {
            OooO00o();
            C24746OooO00o.OooO0oO(21, "no row");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void o000000O(int i, String value) {
            OooOOO0.OooO0oO(value, "value");
            OooO00o();
            this.f83509OooOoO.OoooOO0(i, value);
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void o0000O0(byte[] value) {
            OooOOO0.OooO0oO(value, "value");
            OooO00o();
            this.f83509OooOoO.OooooO0(7, value);
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final String o000OoO(int i) {
            OooO00o();
            C24746OooO00o.OooO0oO(21, "no row");
            throw null;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final boolean o00oO0o() {
            OooO00o();
            this.f83509OooOoO.execute();
            return false;
        }

        @Override // o000ooo.InterfaceC24749OooO0Oo
        public final void reset() {
        }
    }

    public AbstractC24653OooO0o0(InterfaceC24756OooO0O0 interfaceC24756OooO0O0, String str) {
        this.f83500OooOo0o = interfaceC24756OooO0O0;
        this.f83499OooOo = str;
    }

    public final void OooO00o() {
        if (this.f83501OooOoO0) {
            C24746OooO00o.OooO0oO(21, "statement is closed");
            throw null;
        }
    }
}
