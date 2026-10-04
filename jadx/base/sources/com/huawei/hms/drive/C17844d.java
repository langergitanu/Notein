package com.huawei.hms.drive;

import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.huawei.hms.drive.d */
/* JADX INFO: loaded from: classes6.dex */
public class C17844d implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    private static final String[] f53303a = new String[128];

    /* JADX INFO: renamed from: b */
    private static final String[] f53304b;

    /* JADX INFO: renamed from: c */
    private final Writer f53305c;

    /* JADX INFO: renamed from: d */
    private int[] f53306d = new int[32];

    /* JADX INFO: renamed from: e */
    private int f53307e = 0;

    /* JADX INFO: renamed from: f */
    private String f53308f;

    /* JADX INFO: renamed from: g */
    private String f53309g;

    /* JADX INFO: renamed from: h */
    private boolean f53310h;

    /* JADX INFO: renamed from: i */
    private boolean f53311i;

    /* JADX INFO: renamed from: j */
    private String f53312j;

    /* JADX INFO: renamed from: k */
    private boolean f53313k;

    static {
        for (int i = 0; i <= 31; i++) {
            f53303a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f53303a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f53304b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C17844d(Writer writer) {
        m76631a(6);
        this.f53309g = C18241k5.f55433h;
        this.f53313k = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f53305c = writer;
    }

    /* JADX INFO: renamed from: f */
    private int m76634f() {
        int i = this.f53307e;
        if (i != 0) {
            return this.f53306d[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: g */
    private void m76635g() throws IOException {
        if (this.f53312j != null) {
            m76637i();
            m76633d(this.f53312j);
            this.f53312j = null;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m76636h() throws IOException {
        if (this.f53308f == null) {
            return;
        }
        this.f53305c.write(10);
        int i = this.f53307e;
        for (int i2 = 1; i2 < i; i2++) {
            this.f53305c.write(this.f53308f);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m76637i() throws IOException {
        int iM76634f = m76634f();
        if (iM76634f == 5) {
            this.f53305c.write(44);
        } else if (iM76634f != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m76636h();
        m76632b(4);
    }

    /* JADX INFO: renamed from: j */
    private void m76638j() throws IOException {
        int iM76634f = m76634f();
        if (iM76634f == 1) {
            m76632b(2);
            m76636h();
            return;
        }
        if (iM76634f == 2) {
            this.f53305c.append(',');
            m76636h();
        } else {
            if (iM76634f == 4) {
                this.f53305c.append((CharSequence) this.f53309g);
                m76632b(5);
                return;
            }
            if (iM76634f != 6) {
                if (iM76634f != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f53310h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m76632b(7);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76643a(String str) {
        if (str.length() == 0) {
            this.f53308f = null;
            this.f53309g = C18241k5.f55433h;
        } else {
            this.f53308f = str;
            this.f53309g = ": ";
        }
    }

    /* JADX INFO: renamed from: b */
    public C17844d m76645b() throws IOException {
        return m76630a(1, 2, ']');
    }

    /* JADX INFO: renamed from: c */
    public C17844d m76648c() throws IOException {
        m76635g();
        return m76629a(3, '{');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f53305c.close();
        int i = this.f53307e;
        if (i > 1 || (i == 1 && this.f53306d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f53307e = 0;
    }

    /* JADX INFO: renamed from: d */
    public C17844d m76650d() throws IOException {
        return m76630a(3, 5, '}');
    }

    /* JADX INFO: renamed from: e */
    public C17844d m76651e() throws IOException {
        if (this.f53312j != null) {
            if (!this.f53313k) {
                this.f53312j = null;
                return this;
            }
            m76635g();
        }
        m76638j();
        this.f53305c.write(CloudMetaExtra.DEFINE_NON_PARENT_ID);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f53307e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f53305c.flush();
    }

    /* JADX INFO: renamed from: b */
    private void m76632b(int i) {
        this.f53306d[this.f53307e - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m76633d(String str) throws IOException {
        String str2;
        String[] strArr = this.f53311i ? f53304b : f53303a;
        this.f53305c.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        this.f53305c.write(str, i, i2 - i);
                    }
                    this.f53305c.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                this.f53305c.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            this.f53305c.write(str, i, length - i);
        }
        this.f53305c.write(34);
    }

    /* JADX INFO: renamed from: b */
    public C17844d m76646b(String str) throws IOException {
        if (str != null) {
            if (this.f53312j == null) {
                if (this.f53307e != 0) {
                    this.f53312j = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    /* JADX INFO: renamed from: c */
    public C17844d m76649c(String str) throws IOException {
        if (str == null) {
            return m76651e();
        }
        m76635g();
        m76638j();
        m76633d(str);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final void m76644a(boolean z) {
        this.f53310h = z;
    }

    /* JADX INFO: renamed from: a */
    public C17844d m76639a() throws IOException {
        m76635g();
        return m76629a(1, '[');
    }

    /* JADX INFO: renamed from: a */
    private C17844d m76629a(int i, char c) throws IOException {
        m76638j();
        m76631a(i);
        this.f53305c.write(c);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C17844d m76647b(boolean z) throws IOException {
        m76635g();
        m76638j();
        this.f53305c.write(z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        return this;
    }

    /* JADX INFO: renamed from: a */
    private C17844d m76630a(int i, int i2, char c) throws IOException {
        int iM76634f = m76634f();
        if (iM76634f != i2 && iM76634f != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f53312j == null) {
            this.f53307e--;
            if (iM76634f == i2) {
                m76636h();
            }
            this.f53305c.write(c);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f53312j);
    }

    /* JADX INFO: renamed from: a */
    private void m76631a(int i) {
        int i2 = this.f53307e;
        int[] iArr = this.f53306d;
        if (i2 == iArr.length) {
            this.f53306d = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f53306d;
        int i3 = this.f53307e;
        this.f53307e = i3 + 1;
        iArr2[i3] = i;
    }

    /* JADX INFO: renamed from: a */
    public C17844d m76640a(double d) throws IOException {
        m76635g();
        if (!this.f53310h && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        m76638j();
        this.f53305c.append((CharSequence) Double.toString(d));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C17844d m76641a(long j) throws IOException {
        m76635g();
        m76638j();
        this.f53305c.write(Long.toString(j));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C17844d m76642a(Number number) throws IOException {
        if (number == null) {
            return m76651e();
        }
        m76635g();
        String string = number.toString();
        if (!this.f53310h && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        m76638j();
        this.f53305c.append((CharSequence) string);
        return this;
    }
}
