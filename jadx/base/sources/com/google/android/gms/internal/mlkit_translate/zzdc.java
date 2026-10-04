package com.google.android.gms.internal.mlkit_translate;

import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class zzdc implements Closeable, Flushable {
    private static final Pattern zza = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] zzb = new String[128];
    private static final String[] zzc;
    private final Writer zzd;
    private int[] zze = new int[32];
    private int zzf = 0;
    private final zzbz zzg;
    private final String zzh;
    private String zzi;
    private final boolean zzj;
    private zzcj zzk;
    private String zzl;

    static {
        for (int i = 0; i <= 31; i++) {
            zzb[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = zzb;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzc = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zzdc(Writer writer) {
        boolean z = false;
        zzp(6);
        this.zzk = zzcj.LEGACY_STRICT;
        Objects.requireNonNull(writer, "out == null");
        this.zzd = writer;
        zzbz zzbzVar = zzbz.zza;
        Objects.requireNonNull(zzbzVar);
        this.zzg = zzbzVar;
        this.zzi = ",";
        if (zzbzVar.zzc()) {
            this.zzh = ": ";
            if (zzbzVar.zzb().isEmpty()) {
                this.zzi = ", ";
            }
        } else {
            this.zzh = C18241k5.f55433h;
        }
        if (zzbzVar.zzb().isEmpty() && zzbzVar.zza().isEmpty()) {
            z = true;
        }
        this.zzj = z;
    }

    private final int zzk() {
        int i = this.zzf;
        if (i != 0) {
            return this.zze[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final zzdc zzl(int i, int i2, char c) throws IOException {
        int iZzk = zzk();
        if (iZzk != i2 && iZzk != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.zzl;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.zzf--;
        if (iZzk == i2) {
            zzo();
        }
        this.zzd.write(c);
        return this;
    }

    private final zzdc zzm(int i, char c) throws IOException {
        zzn();
        zzp(i);
        this.zzd.write(c);
        return this;
    }

    private final void zzn() throws IOException {
        int iZzk = zzk();
        if (iZzk == 1) {
            zzq(2);
            zzo();
            return;
        }
        if (iZzk == 2) {
            this.zzd.append((CharSequence) this.zzi);
            zzo();
        } else {
            if (iZzk == 4) {
                this.zzd.append((CharSequence) this.zzh);
                zzq(5);
                return;
            }
            if (iZzk != 6) {
                if (iZzk != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.zzk != zzcj.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            zzq(7);
        }
    }

    private final void zzo() throws IOException {
        if (this.zzj) {
            return;
        }
        this.zzd.write(this.zzg.zzb());
        int i = this.zzf;
        for (int i2 = 1; i2 < i; i2++) {
            this.zzd.write(this.zzg.zza());
        }
    }

    private final void zzp(int i) {
        int i2 = this.zzf;
        int[] iArr = this.zze;
        if (i2 == iArr.length) {
            this.zze = Arrays.copyOf(iArr, i2 + i2);
        }
        int[] iArr2 = this.zze;
        int i3 = this.zzf;
        this.zzf = i3 + 1;
        iArr2[i3] = i;
    }

    private final void zzq(int i) {
        this.zze[this.zzf - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzr(String str) throws IOException {
        String str2;
        Writer writer = this.zzd;
        String[] strArr = zzb;
        writer.write(34);
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i2 < i) {
                        this.zzd.write(str, i2, i - i2);
                    }
                    this.zzd.write(str2);
                    i2 = i3;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                this.zzd.write(str2);
                i2 = i3;
            }
            i = i3;
        }
        if (i2 < length) {
            this.zzd.write(str, i2, length - i2);
        }
        this.zzd.write(34);
    }

    private final void zzs() throws IOException {
        if (this.zzl != null) {
            int iZzk = zzk();
            if (iZzk == 5) {
                this.zzd.write(this.zzi);
            } else if (iZzk != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            zzo();
            zzq(4);
            zzr(this.zzl);
            this.zzl = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzd.close();
        int i = this.zzf;
        if (i > 1 || (i == 1 && this.zze[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzf = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzd.flush();
    }

    public final zzdc zza() throws IOException {
        zzs();
        zzm(1, '[');
        return this;
    }

    public final zzdc zzb() throws IOException {
        zzs();
        zzm(3, '{');
        return this;
    }

    public final zzdc zzc() throws IOException {
        zzl(1, 2, ']');
        return this;
    }

    public final zzdc zzd() throws IOException {
        zzl(3, 5, '}');
        return this;
    }

    public final zzdc zze(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.zzl != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iZzk = zzk();
        if (iZzk != 3 && iZzk != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.zzl = str;
        return this;
    }

    public final zzdc zzf() throws IOException {
        if (this.zzl != null) {
            zzs();
        }
        zzn();
        this.zzd.write(CloudMetaExtra.DEFINE_NON_PARENT_ID);
        return this;
    }

    public final zzdc zzg(Number number) throws IOException {
        if (number == null) {
            zzf();
            return this;
        }
        zzs();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.zzk != zzcj.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !zza.matcher(string).matches()) {
                throw new IllegalArgumentException(C22237OooO0o0.OooO00o("String created by ", String.valueOf(cls), " is not a valid JSON number: ", string));
            }
        }
        zzn();
        this.zzd.append((CharSequence) string);
        return this;
    }

    public final zzdc zzh(String str) throws IOException {
        if (str == null) {
            zzf();
            return this;
        }
        zzs();
        zzn();
        zzr(str);
        return this;
    }

    public final zzdc zzi(boolean z) throws IOException {
        zzs();
        zzn();
        this.zzd.write(true != z ? TelemetryEventStrings.Value.FALSE : TelemetryEventStrings.Value.TRUE);
        return this;
    }

    public final void zzj(zzcj zzcjVar) {
        Objects.requireNonNull(zzcjVar);
        this.zzk = zzcjVar;
    }
}
