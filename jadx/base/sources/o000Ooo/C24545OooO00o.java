package o000Ooo;

import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.o0Oo0oo;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.internal.p332p7.C22236OooO0Oo;
import com.aspose.words.StyleIdentifier;
import com.google.logging.type.LogSeverity;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import o000Ooo.C24548OooO0O0;

/* JADX INFO: renamed from: o000Ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24545OooO00o {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final String[] f83075OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final byte[] f83076Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final C24546OooO0Oo[][] f83077Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final int[] f83078Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final byte[] f83079Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final C24546OooO0Oo f83080Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final C24546OooO0Oo[] f83081Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final HashMap<Integer, C24546OooO0Oo>[] f83082Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final HashSet<String> f83083Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final HashMap<String, C24546OooO0Oo>[] f83084Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f83085Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final Charset f83086Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final byte[] f83087OoooO00;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f83088OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f83089OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final FileDescriptor f83090OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AssetManager.AssetInputStream f83091OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f83092OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashSet f83093OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap<String, OooO0OO>[] f83094OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ByteOrder f83095OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f83096OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f83097OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f83098OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f83099OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final boolean f83058OooOOO0 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final List<Integer> f83057OooOOO = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final List<Integer> f83059OooOOOO = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final int[] f83060OooOOOo = {8, 8, 8};

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final int[] f83062OooOOo0 = {8};

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final byte[] f83061OooOOo = {-1, -40, -1};

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final byte[] f83063OooOOoo = {102, 116, 121, 112};

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final byte[] f83066OooOo00 = {109, 105, 102, PatternStyle.Horizontal};

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final byte[] f83065OooOo0 = {104, 101, 105, 99};

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final byte[] f83067OooOo0O = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final byte[] f83068OooOo0o = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final byte[] f83064OooOo = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final byte[] f83070OooOoO0 = {101, 88, 73, 102};

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final byte[] f83069OooOoO = {73, 72, 68, 82};

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final byte[] f83071OooOoOO = {73, 69, 78, 68};

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final byte[] f83073OooOoo0 = {82, 73, 70, 70};

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final byte[] f83072OooOoo = {87, 69, 66, 80};

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final byte[] f83074OooOooO = {69, 88, 73, 70};

    /* JADX INFO: renamed from: o000Ooo.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19628OooO00o extends MediaDataSource {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO0o f83100OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public long f83101OooOo0o;

        public C19628OooO00o(OooO0o oooO0o) {
            this.f83100OooOo = oooO0o;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public final long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f83101OooOo0o;
                OooO0o oooO0o = this.f83100OooOo;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) oooO0o.f83105OooOo0o.available())) {
                        return -1;
                    }
                    oooO0o.seek(j);
                    this.f83101OooOo0o = j;
                }
                if (i2 > oooO0o.f83105OooOo0o.available()) {
                    i2 = oooO0o.f83105OooOo0o.available();
                }
                int i3 = oooO0o.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f83101OooOo0o += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f83101OooOo0o = -1L;
            return -1;
        }
    }

    /* JADX INFO: renamed from: o000Ooo.OooO00o$OooO0O0 */
    public static class OooO0O0 extends InputStream implements DataInput {

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final ByteOrder f83102OooOoOO = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final ByteOrder f83103OooOoo0 = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public ByteOrder f83104OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final DataInputStream f83105OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public byte[] f83106OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f83107OooOoO0;

        public OooO0O0(byte[] bArr) throws IOException {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this(byteArrayInputStream, 0);
        }

        public final void OooO00o(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                DataInputStream dataInputStream = this.f83105OooOo0o;
                int i3 = i - i2;
                int iSkip = (int) dataInputStream.skip(i3);
                if (iSkip <= 0) {
                    if (this.f83106OooOoO == null) {
                        this.f83106OooOoO = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.f83106OooOoO, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        throw new EOFException(o0Oo0oo.OooO0O0(i, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i2 += iSkip;
            }
            this.f83107OooOoO0 += i2;
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f83105OooOo0o.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            this.f83107OooOoO0++;
            return this.f83105OooOo0o.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            this.f83107OooOoO0++;
            return this.f83105OooOo0o.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.f83107OooOoO0++;
            int i = this.f83105OooOo0o.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            this.f83107OooOoO0 += 2;
            return this.f83105OooOo0o.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f83107OooOoO0 += i2;
            this.f83105OooOo0o.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.f83107OooOoO0 += 4;
            DataInputStream dataInputStream = this.f83105OooOo0o;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            if ((i | i2 | i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f83104OooOo;
            if (byteOrder == f83102OooOoOO) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == f83103OooOoo0) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            throw new IOException("Invalid byte order: " + this.f83104OooOo);
        }

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            long j;
            long j2;
            this.f83107OooOoO0 += 8;
            DataInputStream dataInputStream = this.f83105OooOo0o;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            int i5 = dataInputStream.read();
            int i6 = dataInputStream.read();
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f83104OooOo;
            if (byteOrder == f83102OooOoOO) {
                j = (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8);
                j2 = i;
            } else {
                if (byteOrder != f83103OooOoo0) {
                    throw new IOException("Invalid byte order: " + this.f83104OooOo);
                }
                j = (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8);
                j2 = i8;
            }
            return j + j2;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.f83107OooOoO0 += 2;
            DataInputStream dataInputStream = this.f83105OooOo0o;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f83104OooOo;
            if (byteOrder == f83102OooOoOO) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == f83103OooOoo0) {
                return (short) ((i << 8) + i2);
            }
            throw new IOException("Invalid byte order: " + this.f83104OooOo);
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            this.f83107OooOoO0 += 2;
            return this.f83105OooOo0o.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            this.f83107OooOoO0++;
            return this.f83105OooOo0o.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.f83107OooOoO0 += 2;
            DataInputStream dataInputStream = this.f83105OooOo0o;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f83104OooOo;
            if (byteOrder == f83102OooOoOO) {
                return (i2 << 8) + i;
            }
            if (byteOrder == f83103OooOoo0) {
                return (i << 8) + i2;
            }
            throw new IOException("Invalid byte order: " + this.f83104OooOo);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OooO0O0(InputStream inputStream) throws IOException {
            this(inputStream, 0);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        }

        public OooO0O0(InputStream inputStream, int i) throws IOException {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.f83104OooOo = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f83105OooOo0o = dataInputStream;
            dataInputStream.mark(0);
            this.f83107OooOoO0 = 0;
            this.f83104OooOo = byteOrder;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f83105OooOo0o.read(bArr, i, i2);
            this.f83107OooOoO0 += i3;
            return i3;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.f83107OooOoO0 += bArr.length;
            this.f83105OooOo0o.readFully(bArr);
        }
    }

    /* JADX INFO: renamed from: o000Ooo.OooO00o$OooO0OO */
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f83108OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f83109OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f83110OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final byte[] f83111OooO0Oo;

        public OooO0OO(int i, int i2, byte[] bArr) {
            this(-1L, bArr, i, i2);
        }

        public static OooO0OO OooO00o(long j, ByteOrder byteOrder) {
            long[] jArr = {j};
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C24545OooO00o.f83078Oooo000[4]]);
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.putInt((int) jArr[0]);
            return new OooO0OO(4, 1, byteBufferWrap.array());
        }

        public static OooO0OO OooO0O0(C24547OooO0o0 c24547OooO0o0, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C24545OooO00o.f83078Oooo000[5]]);
            byteBufferWrap.order(byteOrder);
            C24547OooO0o0 c24547OooO0o02 = new C24547OooO0o0[]{c24547OooO0o0}[0];
            byteBufferWrap.putInt((int) c24547OooO0o02.f83116OooO00o);
            byteBufferWrap.putInt((int) c24547OooO0o02.f83117OooO0O0);
            return new OooO0OO(5, 1, byteBufferWrap.array());
        }

        public static OooO0OO OooO0OO(int i, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C24545OooO00o.f83078Oooo000[3]]);
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.putShort((short) new int[]{i}[0]);
            return new OooO0OO(3, 1, byteBufferWrap.array());
        }

        public final double OooO0Oo(ByteOrder byteOrder) throws Throwable {
            Object objOooO0oO = OooO0oO(byteOrder);
            if (objOooO0oO == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objOooO0oO instanceof String) {
                return Double.parseDouble((String) objOooO0oO);
            }
            if (objOooO0oO instanceof long[]) {
                if (((long[]) objOooO0oO).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objOooO0oO instanceof int[]) {
                if (((int[]) objOooO0oO).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objOooO0oO instanceof double[]) {
                double[] dArr = (double[]) objOooO0oO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objOooO0oO instanceof C24547OooO0o0[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            C24547OooO0o0[] c24547OooO0o0Arr = (C24547OooO0o0[]) objOooO0oO;
            if (c24547OooO0o0Arr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            C24547OooO0o0 c24547OooO0o0 = c24547OooO0o0Arr[0];
            return c24547OooO0o0.f83116OooO00o / c24547OooO0o0.f83117OooO0O0;
        }

        public final String OooO0o(ByteOrder byteOrder) throws Throwable {
            Object objOooO0oO = OooO0oO(byteOrder);
            if (objOooO0oO == null) {
                return null;
            }
            if (objOooO0oO instanceof String) {
                return (String) objOooO0oO;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objOooO0oO instanceof long[]) {
                long[] jArr = (long[]) objOooO0oO;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objOooO0oO instanceof int[]) {
                int[] iArr = (int[]) objOooO0oO;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objOooO0oO instanceof double[]) {
                double[] dArr = (double[]) objOooO0oO;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objOooO0oO instanceof C24547OooO0o0[])) {
                return null;
            }
            C24547OooO0o0[] c24547OooO0o0Arr = (C24547OooO0o0[]) objOooO0oO;
            while (i < c24547OooO0o0Arr.length) {
                sb.append(c24547OooO0o0Arr[i].f83116OooO00o);
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb.append(c24547OooO0o0Arr[i].f83117OooO0O0);
                i++;
                if (i != c24547OooO0o0Arr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        public final int OooO0o0(ByteOrder byteOrder) throws Throwable {
            Object objOooO0oO = OooO0oO(byteOrder);
            if (objOooO0oO == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objOooO0oO instanceof String) {
                return Integer.parseInt((String) objOooO0oO);
            }
            if (objOooO0oO instanceof long[]) {
                long[] jArr = (long[]) objOooO0oO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objOooO0oO instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objOooO0oO;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:16:0x0033 */
        /* JADX WARN: Removed duplicated region for block: B:153:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
        /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, o000Ooo.OooO00o$OooO0o0[]] */
        /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [java.io.Serializable, o000Ooo.OooO00o$OooO0o0[]] */
        /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Serializable OooO0oO(ByteOrder byteOrder) throws Throwable {
            OooO0O0 oooO0O0;
            InputStream inputStream;
            byte b;
            String string;
            int length = 0;
            byte[] bArr = this.f83111OooO0Oo;
            InputStream inputStream2 = null;
            try {
                try {
                    try {
                        oooO0O0 = new OooO0O0(bArr);
                        try {
                            oooO0O0.f83104OooOo = byteOrder;
                            int i = this.f83108OooO00o;
                            int i2 = this.f83109OooO0O0;
                            switch (i) {
                                case 1:
                                case 6:
                                    if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                        String str = new String(bArr, C24545OooO00o.f83086Oooo0oo);
                                        try {
                                            oooO0O0.close();
                                            return str;
                                        } catch (IOException e) {
                                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                            return str;
                                        }
                                    }
                                    String str2 = new String(new char[]{(char) (b + PatternStyle.Wave)});
                                    try {
                                        oooO0O0.close();
                                        return str2;
                                    } catch (IOException e2) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                        return str2;
                                    }
                                case 2:
                                case 7:
                                    if (i2 >= C24545OooO00o.f83079Oooo00O.length) {
                                        int i3 = 0;
                                        while (true) {
                                            byte[] bArr2 = C24545OooO00o.f83079Oooo00O;
                                            if (i3 >= bArr2.length) {
                                                length = bArr2.length;
                                            } else if (bArr[i3] == bArr2[i3]) {
                                                i3++;
                                            }
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    try {
                                        while (length < i2) {
                                            byte b2 = bArr[length];
                                            if (b2 == 0) {
                                                string = sb.toString();
                                                oooO0O0.close();
                                                return string;
                                            }
                                            if (b2 >= 32) {
                                                sb.append((char) b2);
                                            } else {
                                                sb.append('?');
                                            }
                                            length++;
                                        }
                                        oooO0O0.close();
                                        return string;
                                    } catch (IOException e3) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                        return string;
                                    }
                                    string = sb.toString();
                                case 3:
                                    ?? r15 = new int[i2];
                                    while (length < i2) {
                                        r15[length] = oooO0O0.readUnsignedShort();
                                        length++;
                                    }
                                    try {
                                        oooO0O0.close();
                                        return r15;
                                    } catch (IOException e4) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                        return r15;
                                    }
                                case 4:
                                    ?? r152 = new long[i2];
                                    while (length < i2) {
                                        r152[length] = ((long) oooO0O0.readInt()) & 4294967295L;
                                        length++;
                                    }
                                    try {
                                        oooO0O0.close();
                                        return r152;
                                    } catch (IOException e5) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                        return r152;
                                    }
                                case 5:
                                    ?? r153 = new C24547OooO0o0[i2];
                                    while (length < i2) {
                                        r153[length] = new C24547OooO0o0(((long) oooO0O0.readInt()) & 4294967295L, ((long) oooO0O0.readInt()) & 4294967295L);
                                        length++;
                                    }
                                    try {
                                        oooO0O0.close();
                                        return r153;
                                    } catch (IOException e6) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                        return r153;
                                    }
                                case 8:
                                    ?? r154 = new int[i2];
                                    while (length < i2) {
                                        r154[length] = oooO0O0.readShort();
                                        length++;
                                    }
                                    try {
                                        oooO0O0.close();
                                        return r154;
                                    } catch (IOException e7) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                        return r154;
                                    }
                                case 9:
                                    ?? r155 = new int[i2];
                                    while (length < i2) {
                                        r155[length] = oooO0O0.readInt();
                                        length++;
                                    }
                                    try {
                                        oooO0O0.close();
                                        return r155;
                                    } catch (IOException e8) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                        return r155;
                                    }
                                case 10:
                                    ?? r156 = new C24547OooO0o0[i2];
                                    while (length < i2) {
                                        r156[length] = new C24547OooO0o0(oooO0O0.readInt(), oooO0O0.readInt());
                                        length++;
                                    }
                                    try {
                                        oooO0O0.close();
                                        return r156;
                                    } catch (IOException e9) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                        return r156;
                                    }
                                case 11:
                                    ?? r157 = new double[i2];
                                    while (length < i2) {
                                        r157[length] = oooO0O0.readFloat();
                                        length++;
                                    }
                                    try {
                                        oooO0O0.close();
                                        return r157;
                                    } catch (IOException e10) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                        return r157;
                                    }
                                case 12:
                                    ?? r158 = new double[i2];
                                    while (length < i2) {
                                        r158[length] = oooO0O0.readDouble();
                                        length++;
                                    }
                                    try {
                                        oooO0O0.close();
                                        return r158;
                                    } catch (IOException e11) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                        return r158;
                                    }
                                default:
                                    oooO0O0.close();
                                    return null;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            Log.w("ExifInterface", "IOException occurred during reading a value", e);
                            if (oooO0O0 != null) {
                                oooO0O0.close();
                            }
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e13) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e14) {
                    e = e14;
                    oooO0O0 = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream2 != null) {
                    }
                    throw th;
                }
            } catch (IOException e15) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(C24545OooO00o.f83075OooOooo[this.f83108OooO00o]);
            sb.append(", data length:");
            return C21023OooO0Oo.OooO0OO(")", this.f83111OooO0Oo.length, sb);
        }

        public OooO0OO(long j, byte[] bArr, int i, int i2) {
            this.f83108OooO00o = i;
            this.f83109OooO0O0 = i2;
            this.f83110OooO0OO = j;
            this.f83111OooO0Oo = bArr;
        }
    }

    /* JADX INFO: renamed from: o000Ooo.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public static class C24547OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f83116OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f83117OooO0O0;

        public C24547OooO0o0(long j, long j2) {
            if (j2 == 0) {
                this.f83116OooO00o = 0L;
                this.f83117OooO0O0 = 1L;
            } else {
                this.f83116OooO00o = j;
                this.f83117OooO0O0 = j2;
            }
        }

        public final String toString() {
            return this.f83116OooO00o + "/" + this.f83117OooO0O0;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f83075OooOooo = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f83078Oooo000 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f83079Oooo00O = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C24546OooO0Oo[] c24546OooO0OoArr = {new C24546OooO0Oo("NewSubfileType", StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, 4), new C24546OooO0Oo("SubfileType", 255, 4), new C24546OooO0Oo("ImageWidth", 256, 3, 4), new C24546OooO0Oo("ImageLength", 257, 3, 4), new C24546OooO0Oo("BitsPerSample", StyleIdentifier.COLORFUL_LIST_ACCENT_6, 3), new C24546OooO0Oo("Compression", StyleIdentifier.COLORFUL_GRID_ACCENT_6, 3), new C24546OooO0Oo("PhotometricInterpretation", StyleIdentifier.SUBTLE_REFERENCE, 3), new C24546OooO0Oo("ImageDescription", 270, 2), new C24546OooO0Oo("Make", StyleIdentifier.PLAIN_TABLE_5, 2), new C24546OooO0Oo("Model", StyleIdentifier.TABLE_GRID_LIGHT, 2), new C24546OooO0Oo("StripOffsets", StyleIdentifier.GRID_TABLE_1_LIGHT, 3, 4), new C24546OooO0Oo("Orientation", StyleIdentifier.GRID_TABLE_2, 3), new C24546OooO0Oo("SamplesPerPixel", StyleIdentifier.GRID_TABLE_5_DARK, 3), new C24546OooO0Oo("RowsPerStrip", StyleIdentifier.GRID_TABLE_6_COLORFUL, 3, 4), new C24546OooO0Oo("StripByteCounts", StyleIdentifier.GRID_TABLE_7_COLORFUL, 3, 4), new C24546OooO0Oo("XResolution", StyleIdentifier.GRID_TABLE_3_ACCENT_1, 5), new C24546OooO0Oo("YResolution", StyleIdentifier.GRID_TABLE_4_ACCENT_1, 5), new C24546OooO0Oo("PlanarConfiguration", StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1, 3), new C24546OooO0Oo("ResolutionUnit", StyleIdentifier.GRID_TABLE_3_ACCENT_3, 3), new C24546OooO0Oo("TransferFunction", 301, 3), new C24546OooO0Oo("Software", StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4, 2), new C24546OooO0Oo("DateTime", StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4, 2), new C24546OooO0Oo("Artist", 315, 2), new C24546OooO0Oo("WhitePoint", StyleIdentifier.GRID_TABLE_4_ACCENT_6, 5), new C24546OooO0Oo("PrimaryChromaticities", StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, 5), new C24546OooO0Oo("SubIFDPointer", StyleIdentifier.LIST_TABLE_2_ACCENT_1, 4), new C24546OooO0Oo("JPEGInterchangeFormat", InputDeviceCompat.SOURCE_DPAD, 4), new C24546OooO0Oo("JPEGInterchangeFormatLength", 514, 4), new C24546OooO0Oo("YCbCrCoefficients", 529, 5), new C24546OooO0Oo("YCbCrSubSampling", 530, 3), new C24546OooO0Oo("YCbCrPositioning", 531, 3), new C24546OooO0Oo("ReferenceBlackWhite", 532, 5), new C24546OooO0Oo("Copyright", 33432, 2), new C24546OooO0Oo("ExifIFDPointer", 34665, 4), new C24546OooO0Oo("GPSInfoIFDPointer", 34853, 4), new C24546OooO0Oo("SensorTopBorder", 4, 4), new C24546OooO0Oo("SensorLeftBorder", 5, 4), new C24546OooO0Oo("SensorBottomBorder", 6, 4), new C24546OooO0Oo("SensorRightBorder", 7, 4), new C24546OooO0Oo("ISO", 23, 3), new C24546OooO0Oo("JpgFromRaw", 46, 7), new C24546OooO0Oo("Xmp", LogSeverity.ALERT_VALUE, 1)};
        C24546OooO0Oo[] c24546OooO0OoArr2 = {new C24546OooO0Oo("ExposureTime", 33434, 5), new C24546OooO0Oo("FNumber", 33437, 5), new C24546OooO0Oo("ExposureProgram", 34850, 3), new C24546OooO0Oo("SpectralSensitivity", 34852, 2), new C24546OooO0Oo("PhotographicSensitivity", 34855, 3), new C24546OooO0Oo("OECF", 34856, 7), new C24546OooO0Oo("SensitivityType", 34864, 3), new C24546OooO0Oo("StandardOutputSensitivity", 34865, 4), new C24546OooO0Oo("RecommendedExposureIndex", 34866, 4), new C24546OooO0Oo("ISOSpeed", 34867, 4), new C24546OooO0Oo("ISOSpeedLatitudeyyy", 34868, 4), new C24546OooO0Oo("ISOSpeedLatitudezzz", 34869, 4), new C24546OooO0Oo("ExifVersion", 36864, 2), new C24546OooO0Oo("DateTimeOriginal", 36867, 2), new C24546OooO0Oo("DateTimeDigitized", 36868, 2), new C24546OooO0Oo("OffsetTime", 36880, 2), new C24546OooO0Oo("OffsetTimeOriginal", 36881, 2), new C24546OooO0Oo("OffsetTimeDigitized", 36882, 2), new C24546OooO0Oo("ComponentsConfiguration", 37121, 7), new C24546OooO0Oo("CompressedBitsPerPixel", 37122, 5), new C24546OooO0Oo("ShutterSpeedValue", 37377, 10), new C24546OooO0Oo("ApertureValue", 37378, 5), new C24546OooO0Oo("BrightnessValue", 37379, 10), new C24546OooO0Oo("ExposureBiasValue", 37380, 10), new C24546OooO0Oo("MaxApertureValue", 37381, 5), new C24546OooO0Oo("SubjectDistance", 37382, 5), new C24546OooO0Oo("MeteringMode", 37383, 3), new C24546OooO0Oo("LightSource", 37384, 3), new C24546OooO0Oo("Flash", 37385, 3), new C24546OooO0Oo("FocalLength", 37386, 5), new C24546OooO0Oo("SubjectArea", 37396, 3), new C24546OooO0Oo("MakerNote", 37500, 7), new C24546OooO0Oo("UserComment", 37510, 7), new C24546OooO0Oo("SubSecTime", 37520, 2), new C24546OooO0Oo("SubSecTimeOriginal", 37521, 2), new C24546OooO0Oo("SubSecTimeDigitized", 37522, 2), new C24546OooO0Oo("FlashpixVersion", 40960, 7), new C24546OooO0Oo("ColorSpace", 40961, 3), new C24546OooO0Oo("PixelXDimension", 40962, 3, 4), new C24546OooO0Oo("PixelYDimension", 40963, 3, 4), new C24546OooO0Oo("RelatedSoundFile", 40964, 2), new C24546OooO0Oo("InteroperabilityIFDPointer", 40965, 4), new C24546OooO0Oo("FlashEnergy", 41483, 5), new C24546OooO0Oo("SpatialFrequencyResponse", 41484, 7), new C24546OooO0Oo("FocalPlaneXResolution", 41486, 5), new C24546OooO0Oo("FocalPlaneYResolution", 41487, 5), new C24546OooO0Oo("FocalPlaneResolutionUnit", 41488, 3), new C24546OooO0Oo("SubjectLocation", 41492, 3), new C24546OooO0Oo("ExposureIndex", 41493, 5), new C24546OooO0Oo("SensingMethod", 41495, 3), new C24546OooO0Oo("FileSource", 41728, 7), new C24546OooO0Oo("SceneType", 41729, 7), new C24546OooO0Oo("CFAPattern", 41730, 7), new C24546OooO0Oo("CustomRendered", 41985, 3), new C24546OooO0Oo("ExposureMode", 41986, 3), new C24546OooO0Oo("WhiteBalance", 41987, 3), new C24546OooO0Oo("DigitalZoomRatio", 41988, 5), new C24546OooO0Oo("FocalLengthIn35mmFilm", 41989, 3), new C24546OooO0Oo("SceneCaptureType", 41990, 3), new C24546OooO0Oo("GainControl", 41991, 3), new C24546OooO0Oo("Contrast", 41992, 3), new C24546OooO0Oo("Saturation", 41993, 3), new C24546OooO0Oo("Sharpness", 41994, 3), new C24546OooO0Oo("DeviceSettingDescription", 41995, 7), new C24546OooO0Oo("SubjectDistanceRange", 41996, 3), new C24546OooO0Oo("ImageUniqueID", 42016, 2), new C24546OooO0Oo("CameraOwnerName", 42032, 2), new C24546OooO0Oo("BodySerialNumber", 42033, 2), new C24546OooO0Oo("LensSpecification", 42034, 5), new C24546OooO0Oo("LensMake", 42035, 2), new C24546OooO0Oo("LensModel", 42036, 2), new C24546OooO0Oo("Gamma", 42240, 5), new C24546OooO0Oo("DNGVersion", 50706, 1), new C24546OooO0Oo("DefaultCropSize", 50720, 3, 4)};
        C24546OooO0Oo[] c24546OooO0OoArr3 = {new C24546OooO0Oo("GPSVersionID", 0, 1), new C24546OooO0Oo("GPSLatitudeRef", 1, 2), new C24546OooO0Oo("GPSLatitude", 2, 5, 10), new C24546OooO0Oo("GPSLongitudeRef", 3, 2), new C24546OooO0Oo("GPSLongitude", 4, 5, 10), new C24546OooO0Oo("GPSAltitudeRef", 5, 1), new C24546OooO0Oo("GPSAltitude", 6, 5), new C24546OooO0Oo("GPSTimeStamp", 7, 5), new C24546OooO0Oo("GPSSatellites", 8, 2), new C24546OooO0Oo("GPSStatus", 9, 2), new C24546OooO0Oo("GPSMeasureMode", 10, 2), new C24546OooO0Oo("GPSDOP", 11, 5), new C24546OooO0Oo("GPSSpeedRef", 12, 2), new C24546OooO0Oo("GPSSpeed", 13, 5), new C24546OooO0Oo("GPSTrackRef", 14, 2), new C24546OooO0Oo("GPSTrack", 15, 5), new C24546OooO0Oo("GPSImgDirectionRef", 16, 2), new C24546OooO0Oo("GPSImgDirection", 17, 5), new C24546OooO0Oo("GPSMapDatum", 18, 2), new C24546OooO0Oo("GPSDestLatitudeRef", 19, 2), new C24546OooO0Oo("GPSDestLatitude", 20, 5), new C24546OooO0Oo("GPSDestLongitudeRef", 21, 2), new C24546OooO0Oo("GPSDestLongitude", 22, 5), new C24546OooO0Oo("GPSDestBearingRef", 23, 2), new C24546OooO0Oo("GPSDestBearing", 24, 5), new C24546OooO0Oo("GPSDestDistanceRef", 25, 2), new C24546OooO0Oo("GPSDestDistance", 26, 5), new C24546OooO0Oo("GPSProcessingMethod", 27, 7), new C24546OooO0Oo("GPSAreaInformation", 28, 7), new C24546OooO0Oo("GPSDateStamp", 29, 2), new C24546OooO0Oo("GPSDifferential", 30, 3), new C24546OooO0Oo("GPSHPositioningError", 31, 5)};
        C24546OooO0Oo[] c24546OooO0OoArr4 = {new C24546OooO0Oo("InteroperabilityIndex", 1, 2)};
        C24546OooO0Oo[] c24546OooO0OoArr5 = {new C24546OooO0Oo("NewSubfileType", StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, 4), new C24546OooO0Oo("SubfileType", 255, 4), new C24546OooO0Oo("ThumbnailImageWidth", 256, 3, 4), new C24546OooO0Oo("ThumbnailImageLength", 257, 3, 4), new C24546OooO0Oo("BitsPerSample", StyleIdentifier.COLORFUL_LIST_ACCENT_6, 3), new C24546OooO0Oo("Compression", StyleIdentifier.COLORFUL_GRID_ACCENT_6, 3), new C24546OooO0Oo("PhotometricInterpretation", StyleIdentifier.SUBTLE_REFERENCE, 3), new C24546OooO0Oo("ImageDescription", 270, 2), new C24546OooO0Oo("Make", StyleIdentifier.PLAIN_TABLE_5, 2), new C24546OooO0Oo("Model", StyleIdentifier.TABLE_GRID_LIGHT, 2), new C24546OooO0Oo("StripOffsets", StyleIdentifier.GRID_TABLE_1_LIGHT, 3, 4), new C24546OooO0Oo("ThumbnailOrientation", StyleIdentifier.GRID_TABLE_2, 3), new C24546OooO0Oo("SamplesPerPixel", StyleIdentifier.GRID_TABLE_5_DARK, 3), new C24546OooO0Oo("RowsPerStrip", StyleIdentifier.GRID_TABLE_6_COLORFUL, 3, 4), new C24546OooO0Oo("StripByteCounts", StyleIdentifier.GRID_TABLE_7_COLORFUL, 3, 4), new C24546OooO0Oo("XResolution", StyleIdentifier.GRID_TABLE_3_ACCENT_1, 5), new C24546OooO0Oo("YResolution", StyleIdentifier.GRID_TABLE_4_ACCENT_1, 5), new C24546OooO0Oo("PlanarConfiguration", StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1, 3), new C24546OooO0Oo("ResolutionUnit", StyleIdentifier.GRID_TABLE_3_ACCENT_3, 3), new C24546OooO0Oo("TransferFunction", 301, 3), new C24546OooO0Oo("Software", StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4, 2), new C24546OooO0Oo("DateTime", StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4, 2), new C24546OooO0Oo("Artist", 315, 2), new C24546OooO0Oo("WhitePoint", StyleIdentifier.GRID_TABLE_4_ACCENT_6, 5), new C24546OooO0Oo("PrimaryChromaticities", StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, 5), new C24546OooO0Oo("SubIFDPointer", StyleIdentifier.LIST_TABLE_2_ACCENT_1, 4), new C24546OooO0Oo("JPEGInterchangeFormat", InputDeviceCompat.SOURCE_DPAD, 4), new C24546OooO0Oo("JPEGInterchangeFormatLength", 514, 4), new C24546OooO0Oo("YCbCrCoefficients", 529, 5), new C24546OooO0Oo("YCbCrSubSampling", 530, 3), new C24546OooO0Oo("YCbCrPositioning", 531, 3), new C24546OooO0Oo("ReferenceBlackWhite", 532, 5), new C24546OooO0Oo("Copyright", 33432, 2), new C24546OooO0Oo("ExifIFDPointer", 34665, 4), new C24546OooO0Oo("GPSInfoIFDPointer", 34853, 4), new C24546OooO0Oo("DNGVersion", 50706, 1), new C24546OooO0Oo("DefaultCropSize", 50720, 3, 4)};
        f83080Oooo00o = new C24546OooO0Oo("StripOffsets", StyleIdentifier.GRID_TABLE_1_LIGHT, 3);
        f83077Oooo0 = new C24546OooO0Oo[][]{c24546OooO0OoArr, c24546OooO0OoArr2, c24546OooO0OoArr3, c24546OooO0OoArr4, c24546OooO0OoArr5, c24546OooO0OoArr, new C24546OooO0Oo[]{new C24546OooO0Oo("ThumbnailImage", 256, 7), new C24546OooO0Oo("CameraSettingsIFDPointer", 8224, 4), new C24546OooO0Oo("ImageProcessingIFDPointer", 8256, 4)}, new C24546OooO0Oo[]{new C24546OooO0Oo("PreviewImageStart", 257, 4), new C24546OooO0Oo("PreviewImageLength", StyleIdentifier.COLORFUL_LIST_ACCENT_6, 4)}, new C24546OooO0Oo[]{new C24546OooO0Oo("AspectFrame", 4371, 3)}, new C24546OooO0Oo[]{new C24546OooO0Oo("ColorSpace", 55, 3)}};
        f83081Oooo0O0 = new C24546OooO0Oo[]{new C24546OooO0Oo("SubIFDPointer", StyleIdentifier.LIST_TABLE_2_ACCENT_1, 4), new C24546OooO0Oo("ExifIFDPointer", 34665, 4), new C24546OooO0Oo("GPSInfoIFDPointer", 34853, 4), new C24546OooO0Oo("InteroperabilityIFDPointer", 40965, 4), new C24546OooO0Oo("CameraSettingsIFDPointer", 8224, 1), new C24546OooO0Oo("ImageProcessingIFDPointer", 8256, 1)};
        f83082Oooo0OO = new HashMap[10];
        f83084Oooo0o0 = new HashMap[10];
        f83083Oooo0o = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f83085Oooo0oO = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f83086Oooo0oo = charsetForName;
        f83076Oooo = "Exif\u0000\u0000".getBytes(charsetForName);
        f83087OoooO00 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C24546OooO0Oo[][] c24546OooO0OoArr6 = f83077Oooo0;
            if (i >= c24546OooO0OoArr6.length) {
                HashMap<Integer, Integer> map = f83085Oooo0oO;
                C24546OooO0Oo[] c24546OooO0OoArr7 = f83081Oooo0O0;
                map.put(Integer.valueOf(c24546OooO0OoArr7[0].f83112OooO00o), 5);
                map.put(Integer.valueOf(c24546OooO0OoArr7[1].f83112OooO00o), 1);
                map.put(Integer.valueOf(c24546OooO0OoArr7[2].f83112OooO00o), 2);
                map.put(Integer.valueOf(c24546OooO0OoArr7[3].f83112OooO00o), 3);
                map.put(Integer.valueOf(c24546OooO0OoArr7[4].f83112OooO00o), 7);
                map.put(Integer.valueOf(c24546OooO0OoArr7[5].f83112OooO00o), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f83082Oooo0OO[i] = new HashMap<>();
            f83084Oooo0o0[i] = new HashMap<>();
            for (C24546OooO0Oo c24546OooO0Oo : c24546OooO0OoArr6[i]) {
                f83082Oooo0OO[i].put(Integer.valueOf(c24546OooO0Oo.f83112OooO00o), c24546OooO0Oo);
                f83084Oooo0o0[i].put(c24546OooO0Oo.f83113OooO0O0, c24546OooO0Oo);
            }
            i++;
        }
    }

    public C24545OooO00o(String str) throws Throwable {
        FileInputStream fileInputStream;
        boolean z;
        C24546OooO0Oo[][] c24546OooO0OoArr = f83077Oooo0;
        this.f83094OooO0o0 = new HashMap[c24546OooO0OoArr.length];
        this.f83093OooO0o = new HashSet(c24546OooO0OoArr.length);
        this.f83095OooO0oO = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f83091OooO0OO = null;
        this.f83089OooO00o = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                C24548OooO0O0.OooO00o.OooO0OO(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z = true;
            } catch (Exception unused) {
                if (f83058OooOOO0) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z = false;
            }
            if (z) {
                this.f83090OooO0O0 = fileInputStream.getFD();
            } else {
                this.f83090OooO0O0 = null;
            }
            OooOOOo(fileInputStream);
            try {
                fileInputStream.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    public static ByteOrder OooOOoo(OooO0O0 oooO0O0) throws IOException {
        short s = oooO0O0.readShort();
        boolean z = f83058OooOOO0;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            throw new IOException(androidx.core.graphics.OooO0O0.OooO00o(s, new StringBuilder("Invalid byte order: ")));
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void OooO(OooO0O0 oooO0O0) throws Throwable {
        if (f83058OooOOO0) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + oooO0O0);
        }
        oooO0O0.f83104OooOo = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f83064OooOo;
        oooO0O0.OooO00o(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = oooO0O0.readInt();
                byte[] bArr2 = new byte[4];
                if (oooO0O0.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f83069OooOoO)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f83071OooOoOO)) {
                    return;
                }
                if (Arrays.equals(bArr2, f83070OooOoO0)) {
                    byte[] bArr3 = new byte[i];
                    if (oooO0O0.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C24548OooO0O0.OooO00o(bArr2));
                    }
                    int i3 = oooO0O0.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f83088OooO = i2;
                        OooOo00(0, bArr3);
                        OooOoO();
                        OooOo0o(new OooO0O0(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                oooO0O0.OooO00o(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void OooO00o() {
        String strOooO0O0 = OooO0O0("DateTimeOriginal");
        HashMap<String, OooO0OO>[] mapArr = this.f83094OooO0o0;
        if (strOooO0O0 != null && OooO0O0("DateTime") == null) {
            HashMap<String, OooO0OO> map = mapArr[0];
            byte[] bytes = strOooO0O0.concat("\u0000").getBytes(f83086Oooo0oo);
            map.put("DateTime", new OooO0OO(2, bytes.length, bytes));
        }
        if (OooO0O0("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", OooO0OO.OooO00o(0L, this.f83095OooO0oO));
        }
        if (OooO0O0("ImageLength") == null) {
            mapArr[0].put("ImageLength", OooO0OO.OooO00o(0L, this.f83095OooO0oO));
        }
        if (OooO0O0("Orientation") == null) {
            mapArr[0].put("Orientation", OooO0OO.OooO00o(0L, this.f83095OooO0oO));
        }
        if (OooO0O0("LightSource") == null) {
            mapArr[1].put("LightSource", OooO0OO.OooO00o(0L, this.f83095OooO0oO));
        }
    }

    public final String OooO0O0(String str) {
        OooO0OO OooO0Oo2 = OooO0Oo(str);
        if (OooO0Oo2 != null) {
            if (!f83083Oooo0o.contains(str)) {
                return OooO0Oo2.OooO0o(this.f83095OooO0oO);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = OooO0Oo2.f83108OooO00o;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C24547OooO0o0[] c24547OooO0o0Arr = (C24547OooO0o0[]) OooO0Oo2.OooO0oO(this.f83095OooO0oO);
                if (c24547OooO0o0Arr == null || c24547OooO0o0Arr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c24547OooO0o0Arr));
                    return null;
                }
                C24547OooO0o0 c24547OooO0o0 = c24547OooO0o0Arr[0];
                Integer numValueOf = Integer.valueOf((int) (c24547OooO0o0.f83116OooO00o / c24547OooO0o0.f83117OooO0O0));
                C24547OooO0o0 c24547OooO0o02 = c24547OooO0o0Arr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c24547OooO0o02.f83116OooO00o / c24547OooO0o02.f83117OooO0O0));
                C24547OooO0o0 c24547OooO0o03 = c24547OooO0o0Arr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c24547OooO0o03.f83116OooO00o / c24547OooO0o03.f83117OooO0O0)));
            }
            try {
                return Double.toString(OooO0Oo2.OooO0Oo(this.f83095OooO0oO));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int OooO0OO(int i) {
        OooO0OO OooO0Oo2 = OooO0Oo("Orientation");
        if (OooO0Oo2 == null) {
            return i;
        }
        try {
            return OooO0Oo2.OooO0o0(this.f83095OooO0oO);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final OooO0OO OooO0Oo(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f83058OooOOO0) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f83077Oooo0.length; i++) {
            OooO0OO oooO0OO = this.f83094OooO0o0[i].get(str);
            if (oooO0OO != null) {
                return oooO0OO;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0o(o000Ooo.C24545OooO00o.OooO0O0 r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o000Ooo.C24545OooO00o.OooO0o(o000Ooo.OooO00o$OooO0O0, int, int):void");
    }

    public final void OooO0o0(OooO0o oooO0o) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                C24548OooO0O0.C19629OooO0O0.OooO00o(mediaMetadataRetriever, new C19628OooO00o(oooO0o));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap<String, OooO0OO>[] mapArr = this.f83094OooO0o0;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", OooO0OO.OooO0OO(Integer.parseInt(strExtractMetadata), this.f83095OooO0oO));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", OooO0OO.OooO0OO(Integer.parseInt(strExtractMetadata2), this.f83095OooO0oO));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", OooO0OO.OooO0OO(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f83095OooO0oO));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    oooO0o.seek(i2);
                    byte[] bArr = new byte[6];
                    if (oooO0o.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, f83076Oooo)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (oooO0o.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.f83088OooO = i4;
                    OooOo00(0, bArr2);
                }
                if (f83058OooOOO0) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:167|12|(4:162|13|150|14)|(16:17|(2:19|20)(1:28)|23|29|(1:31)|32|(3:152|35|(4:41|(3:44|(1:46)(2:47|(1:49))|(1:179)(3:176|52|53))(2:43|177)|54|36))|34|156|66|160|67|68|(1:74)(1:73)|75|(1:88)(8:158|90|154|91|92|(1:94)(1:95)|96|(1:108)(3:110|(2:111|(2:113|(2:169|115)(1:116))(2:168|117))|(1:119)(4:121|(2:122|(2:124|(1:171)(1:127))(3:170|128|(2:129|(2:131|(1:173)(1:134))(2:172|135))))|126|(1:137)(1:139)))))|16|156|66|160|67|68|(3:70|74|75)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f4, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f8, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fa, code lost:
    
        if (r6 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fc, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ff, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0100, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0102, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO0oO(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        OooO0O0 oooO0O0;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        byte[] bArr;
        long j2;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i6 = 0;
        while (true) {
            byte[] bArr3 = f83061OooOOo;
            if (i6 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i6] != bArr3[i6]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i7 = 0; i7 < bytes.length; i7++) {
                    if (bArr2[i7] != bytes[i7]) {
                        OooO0O0 oooO0O02 = null;
                        try {
                            oooO0O0 = new OooO0O0(bArr2);
                            try {
                                try {
                                    j = oooO0O0.readInt();
                                    bArr = new byte[4];
                                    oooO0O0.read(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                oooO0O02 = oooO0O0;
                                if (oooO0O02 != null) {
                                    oooO0O02.close();
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            oooO0O0 = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (Arrays.equals(bArr, f83063OooOOoo)) {
                            if (j == 1) {
                                j = oooO0O0.readLong();
                                j2 = 16;
                            } else {
                                j2 = 8;
                            }
                            i = 0;
                            long j3 = 5000;
                            if (j > j3) {
                                j = j3;
                            }
                            long j4 = j - j2;
                            if (j4 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z = false;
                                    boolean z2 = false;
                                    for (long j5 = 0; j5 < j4 / 4 && oooO0O0.read(bArr4) == 4; j5++) {
                                        if (j5 != 1) {
                                            if (Arrays.equals(bArr4, f83066OooOo00)) {
                                                z = true;
                                            } else if (Arrays.equals(bArr4, f83065OooOo0)) {
                                                z2 = true;
                                            }
                                            if (z && z2) {
                                                oooO0O0.close();
                                                return 12;
                                            }
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    if (f83058OooOOO0) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                    if (oooO0O0 != null) {
                                    }
                                    OooO0O0 oooO0O03 = new OooO0O0(bArr2);
                                    ByteOrder byteOrderOooOOoo = OooOOoo(oooO0O03);
                                    this.f83095OooO0oO = byteOrderOooOOoo;
                                    oooO0O03.f83104OooOo = byteOrderOooOOoo;
                                    short s = oooO0O03.readShort();
                                    if (s == 20306) {
                                    }
                                    if (i2 != 0) {
                                    }
                                }
                            }
                            oooO0O0.close();
                            OooO0O0 oooO0O032 = new OooO0O0(bArr2);
                            ByteOrder byteOrderOooOOoo2 = OooOOoo(oooO0O032);
                            this.f83095OooO0oO = byteOrderOooOOoo2;
                            oooO0O032.f83104OooOo = byteOrderOooOOoo2;
                            short s2 = oooO0O032.readShort();
                            i2 = (s2 == 20306 || s2 == 21330) ? 1 : i;
                            oooO0O032.close();
                            if (i2 != 0) {
                                return 7;
                            }
                            try {
                                OooO0O0 oooO0O04 = new OooO0O0(bArr2);
                                try {
                                    ByteOrder byteOrderOooOOoo3 = OooOOoo(oooO0O04);
                                    this.f83095OooO0oO = byteOrderOooOOoo3;
                                    oooO0O04.f83104OooOo = byteOrderOooOOoo3;
                                    i3 = oooO0O04.readShort() == 85 ? 1 : i;
                                    oooO0O04.close();
                                } catch (Exception unused) {
                                    oooO0O02 = oooO0O04;
                                    if (oooO0O02 != null) {
                                        oooO0O02.close();
                                    }
                                    i3 = i;
                                } catch (Throwable th3) {
                                    th = th3;
                                    oooO0O02 = oooO0O04;
                                    if (oooO0O02 != null) {
                                        oooO0O02.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused2) {
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            if (i3 != 0) {
                                return 10;
                            }
                            int i8 = i;
                            while (true) {
                                byte[] bArr5 = f83064OooOo;
                                if (i8 >= bArr5.length) {
                                    i4 = 1;
                                    break;
                                }
                                if (bArr2[i8] != bArr5[i8]) {
                                    i4 = i;
                                    break;
                                }
                                i8++;
                            }
                            if (i4 != 0) {
                                return 13;
                            }
                            int i9 = i;
                            while (true) {
                                byte[] bArr6 = f83073OooOoo0;
                                if (i9 >= bArr6.length) {
                                    int i10 = i;
                                    while (true) {
                                        byte[] bArr7 = f83072OooOoo;
                                        if (i10 >= bArr7.length) {
                                            i5 = 1;
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i10 + 4] != bArr7[i10]) {
                                            break;
                                        }
                                        i10++;
                                    }
                                } else {
                                    if (bArr2[i9] != bArr6[i9]) {
                                        break;
                                    }
                                    i9++;
                                }
                            }
                            i5 = i;
                            if (i5 != 0) {
                                return 14;
                            }
                            return i;
                        }
                        oooO0O0.close();
                        i = 0;
                        OooO0O0 oooO0O0322 = new OooO0O0(bArr2);
                        ByteOrder byteOrderOooOOoo22 = OooOOoo(oooO0O0322);
                        this.f83095OooO0oO = byteOrderOooOOoo22;
                        oooO0O0322.f83104OooOo = byteOrderOooOOoo22;
                        short s22 = oooO0O0322.readShort();
                        if (s22 == 20306) {
                            oooO0O0322.close();
                        }
                        if (i2 != 0) {
                        }
                    }
                }
                return 9;
            }
            i6++;
        }
    }

    public final void OooO0oo(OooO0o oooO0o) throws Throwable {
        int i;
        int i2;
        OooOO0O(oooO0o);
        HashMap<String, OooO0OO>[] mapArr = this.f83094OooO0o0;
        OooO0OO oooO0OO = mapArr[1].get("MakerNote");
        if (oooO0OO != null) {
            OooO0o oooO0o2 = new OooO0o(oooO0OO.f83111OooO0Oo);
            oooO0o2.f83104OooOo = this.f83095OooO0oO;
            byte[] bArr = f83067OooOo0O;
            byte[] bArr2 = new byte[bArr.length];
            oooO0o2.readFully(bArr2);
            oooO0o2.seek(0L);
            byte[] bArr3 = f83068OooOo0o;
            byte[] bArr4 = new byte[bArr3.length];
            oooO0o2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                oooO0o2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                oooO0o2.seek(12L);
            }
            OooOo0(oooO0o2, 6);
            OooO0OO oooO0OO2 = mapArr[7].get("PreviewImageStart");
            OooO0OO oooO0OO3 = mapArr[7].get("PreviewImageLength");
            if (oooO0OO2 != null && oooO0OO3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", oooO0OO2);
                mapArr[5].put("JPEGInterchangeFormatLength", oooO0OO3);
            }
            OooO0OO oooO0OO4 = mapArr[8].get("AspectFrame");
            if (oooO0OO4 != null) {
                int[] iArr = (int[]) oooO0OO4.OooO0oO(this.f83095OooO0oO);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                OooO0OO OooO0OO2 = OooO0OO.OooO0OO(i5, this.f83095OooO0oO);
                OooO0OO OooO0OO3 = OooO0OO.OooO0OO(i6, this.f83095OooO0oO);
                mapArr[0].put("ImageWidth", OooO0OO2);
                mapArr[0].put("ImageLength", OooO0OO3);
            }
        }
    }

    public final void OooOO0(OooO0O0 oooO0O0) throws Throwable {
        boolean z = f83058OooOOO0;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + oooO0O0);
        }
        oooO0O0.OooO00o(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        oooO0O0.read(bArr);
        oooO0O0.read(bArr2);
        oooO0O0.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        oooO0O0.OooO00o(i - oooO0O0.f83107OooOoO0);
        oooO0O0.read(bArr4);
        OooO0o(new OooO0O0(bArr4), i, 5);
        oooO0O0.OooO00o(i3 - oooO0O0.f83107OooOoO0);
        oooO0O0.f83104OooOo = ByteOrder.BIG_ENDIAN;
        int i4 = oooO0O0.readInt();
        if (z) {
            C22236OooO0Oo.OooO00o(i4, "numberOfDirectoryEntry: ", "ExifInterface");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = oooO0O0.readUnsignedShort();
            int unsignedShort2 = oooO0O0.readUnsignedShort();
            if (unsignedShort == f83080Oooo00o.f83112OooO00o) {
                short s = oooO0O0.readShort();
                short s2 = oooO0O0.readShort();
                OooO0OO OooO0OO2 = OooO0OO.OooO0OO(s, this.f83095OooO0oO);
                OooO0OO OooO0OO3 = OooO0OO.OooO0OO(s2, this.f83095OooO0oO);
                HashMap<String, OooO0OO>[] mapArr = this.f83094OooO0o0;
                mapArr[0].put("ImageLength", OooO0OO2);
                mapArr[0].put("ImageWidth", OooO0OO3);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            oooO0O0.OooO00o(unsignedShort2);
        }
    }

    public final void OooOO0O(OooO0o oooO0o) throws Throwable {
        OooOOo0(oooO0o);
        OooOo0(oooO0o, 0);
        OooOoO0(oooO0o, 0);
        OooOoO0(oooO0o, 5);
        OooOoO0(oooO0o, 4);
        OooOoO();
        if (this.f83092OooO0Oo == 8) {
            HashMap<String, OooO0OO>[] mapArr = this.f83094OooO0o0;
            OooO0OO oooO0OO = mapArr[1].get("MakerNote");
            if (oooO0OO != null) {
                OooO0o oooO0o2 = new OooO0o(oooO0OO.f83111OooO0Oo);
                oooO0o2.f83104OooOo = this.f83095OooO0oO;
                oooO0o2.OooO00o(6);
                OooOo0(oooO0o2, 9);
                OooO0OO oooO0OO2 = mapArr[9].get("ColorSpace");
                if (oooO0OO2 != null) {
                    mapArr[1].put("ColorSpace", oooO0OO2);
                }
            }
        }
    }

    public final void OooOO0o(OooO0o oooO0o) throws Throwable {
        if (f83058OooOOO0) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + oooO0o);
        }
        OooOO0O(oooO0o);
        HashMap<String, OooO0OO>[] mapArr = this.f83094OooO0o0;
        OooO0OO oooO0OO = mapArr[0].get("JpgFromRaw");
        if (oooO0OO != null) {
            OooO0o(new OooO0O0(oooO0OO.f83111OooO0Oo), (int) oooO0OO.f83110OooO0OO, 5);
        }
        OooO0OO oooO0OO2 = mapArr[0].get("ISO");
        OooO0OO oooO0OO3 = mapArr[1].get("PhotographicSensitivity");
        if (oooO0OO2 == null || oooO0OO3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", oooO0OO2);
    }

    public final void OooOOO(OooO0O0 oooO0O0, HashMap map) throws Throwable {
        OooO0OO oooO0OO = (OooO0OO) map.get("JPEGInterchangeFormat");
        OooO0OO oooO0OO2 = (OooO0OO) map.get("JPEGInterchangeFormatLength");
        if (oooO0OO == null || oooO0OO2 == null) {
            return;
        }
        int iOooO0o0 = oooO0OO.OooO0o0(this.f83095OooO0oO);
        int iOooO0o02 = oooO0OO2.OooO0o0(this.f83095OooO0oO);
        if (this.f83092OooO0Oo == 7) {
            iOooO0o0 += this.f83097OooOO0;
        }
        if (iOooO0o0 > 0 && iOooO0o02 > 0 && this.f83089OooO00o == null && this.f83091OooO0OO == null && this.f83090OooO0O0 == null) {
            oooO0O0.skip(iOooO0o0);
            oooO0O0.read(new byte[iOooO0o02]);
        }
        if (f83058OooOOO0) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iOooO0o0 + ", length: " + iOooO0o02);
        }
    }

    public final void OooOOO0(OooO0O0 oooO0O0) throws Throwable {
        if (f83058OooOOO0) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + oooO0O0);
        }
        oooO0O0.f83104OooOo = ByteOrder.LITTLE_ENDIAN;
        oooO0O0.OooO00o(f83073OooOoo0.length);
        int i = oooO0O0.readInt() + 8;
        byte[] bArr = f83072OooOoo;
        oooO0O0.OooO00o(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (oooO0O0.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = oooO0O0.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f83074OooOooO, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (oooO0O0.read(bArr3) == i2) {
                        this.f83088OooO = i3;
                        OooOo00(0, bArr3);
                        OooOo0o(new OooO0O0(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C24548OooO0O0.OooO00o(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                oooO0O0.OooO00o(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final boolean OooOOOO(HashMap map) throws IOException {
        OooO0OO oooO0OO = (OooO0OO) map.get("ImageLength");
        OooO0OO oooO0OO2 = (OooO0OO) map.get("ImageWidth");
        if (oooO0OO == null || oooO0OO2 == null) {
            return false;
        }
        return oooO0OO.OooO0o0(this.f83095OooO0oO) <= 512 && oooO0OO2.OooO0o0(this.f83095OooO0oO) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0091 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:5:0x0006, B:7:0x000b, B:14:0x0020, B:20:0x003d, B:22:0x0048, B:30:0x005e, B:25:0x004f, B:28:0x0057, B:29:0x005b, B:31:0x0068, B:33:0x0071, B:35:0x0077, B:37:0x007d, B:39:0x0083, B:45:0x0091), top: B:57:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOOo(InputStream inputStream) {
        boolean z = f83058OooOOO0;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i = 0; i < f83077Oooo0.length; i++) {
            try {
                try {
                    this.f83094OooO0o0[i] = new HashMap<>();
                } catch (Throwable th) {
                    OooO00o();
                    if (z) {
                        OooOOo();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                OooO00o();
                if (z) {
                    return;
                }
                OooOOo();
                return;
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z) {
                }
                OooO00o();
                if (z) {
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iOooO0oO = OooO0oO(bufferedInputStream);
        this.f83092OooO0Oo = iOooO0oO;
        if (iOooO0oO == 4 || iOooO0oO == 9 || iOooO0oO == 13 || iOooO0oO == 14) {
            OooO0O0 oooO0O0 = new OooO0O0(bufferedInputStream);
            int i2 = this.f83092OooO0Oo;
            if (i2 == 4) {
                OooO0o(oooO0O0, 0, 0);
            } else if (i2 == 13) {
                OooO(oooO0O0);
            } else if (i2 == 9) {
                OooOO0(oooO0O0);
            } else if (i2 == 14) {
                OooOOO0(oooO0O0);
            }
        } else {
            OooO0o oooO0o = new OooO0o(bufferedInputStream);
            int i3 = this.f83092OooO0Oo;
            if (i3 == 12) {
                OooO0o0(oooO0o);
            } else if (i3 == 7) {
                OooO0oo(oooO0o);
            } else if (i3 == 10) {
                OooOO0o(oooO0o);
            } else {
                OooOO0O(oooO0o);
            }
            oooO0o.seek(this.f83088OooO);
            OooOo0o(oooO0o);
        }
        OooO00o();
        if (z) {
            OooOOo();
        }
    }

    public final void OooOOo() {
        int i = 0;
        while (true) {
            HashMap<String, OooO0OO>[] mapArr = this.f83094OooO0o0;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "The size of tag group[", "]: ");
            sbOooO0OO.append(mapArr[i].size());
            Log.d("ExifInterface", sbOooO0OO.toString());
            for (Map.Entry<String, OooO0OO> entry : mapArr[i].entrySet()) {
                OooO0OO value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.OooO0o(this.f83095OooO0oO) + "'");
            }
            i++;
        }
    }

    public final void OooOOo0(OooO0o oooO0o) throws IOException {
        ByteOrder byteOrderOooOOoo = OooOOoo(oooO0o);
        this.f83095OooO0oO = byteOrderOooOOoo;
        oooO0o.f83104OooOo = byteOrderOooOOoo;
        int unsignedShort = oooO0o.readUnsignedShort();
        int i = this.f83092OooO0Oo;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException(androidx.core.graphics.OooO0O0.OooO00o(unsignedShort, new StringBuilder("Invalid start code: ")));
        }
        int i2 = oooO0o.readInt();
        if (i2 < 8) {
            throw new IOException(C21532OooOOo.OooO0OO(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            oooO0o.OooO00o(i3);
        }
    }

    public final void OooOo(int i, int i2) throws Throwable {
        HashMap<String, OooO0OO>[] mapArr = this.f83094OooO0o0;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f83058OooOOO0;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        OooO0OO oooO0OO = mapArr[i].get("ImageLength");
        OooO0OO oooO0OO2 = mapArr[i].get("ImageWidth");
        OooO0OO oooO0OO3 = mapArr[i2].get("ImageLength");
        OooO0OO oooO0OO4 = mapArr[i2].get("ImageWidth");
        if (oooO0OO == null || oooO0OO2 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (oooO0OO3 == null || oooO0OO4 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iOooO0o0 = oooO0OO.OooO0o0(this.f83095OooO0oO);
        int iOooO0o02 = oooO0OO2.OooO0o0(this.f83095OooO0oO);
        int iOooO0o03 = oooO0OO3.OooO0o0(this.f83095OooO0oO);
        int iOooO0o04 = oooO0OO4.OooO0o0(this.f83095OooO0oO);
        if (iOooO0o0 >= iOooO0o03 || iOooO0o02 >= iOooO0o04) {
            return;
        }
        HashMap<String, OooO0OO> map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOo0(OooO0o oooO0o, int i) throws IOException {
        HashMap<String, OooO0OO>[] mapArr;
        short s;
        boolean z;
        short s2;
        HashMap<String, OooO0OO>[] mapArr2;
        HashSet hashSet;
        long j;
        boolean z2;
        int i2;
        HashSet hashSet2;
        int i3;
        int i4;
        int unsignedShort;
        long j2;
        int i5 = i;
        Integer numValueOf = Integer.valueOf(oooO0o.f83107OooOoO0);
        HashSet hashSet3 = this.f83093OooO0o;
        hashSet3.add(numValueOf);
        short s3 = oooO0o.readShort();
        boolean z3 = f83058OooOOO0;
        if (z3) {
            C22236OooO0Oo.OooO00o(s3, "numberOfDirectoryEntry: ", "ExifInterface");
        }
        if (s3 <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            mapArr = this.f83094OooO0o0;
            if (s4 >= s3) {
                break;
            }
            int unsignedShort2 = oooO0o.readUnsignedShort();
            int unsignedShort3 = oooO0o.readUnsignedShort();
            int i6 = oooO0o.readInt();
            long j3 = ((long) oooO0o.f83107OooOoO0) + 4;
            C24546OooO0Oo c24546OooO0Oo = f83082Oooo0OO[i5].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                s = s3;
                z = z3;
                s2 = s4;
                mapArr2 = mapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i5), Integer.valueOf(unsignedShort2), c24546OooO0Oo != null ? c24546OooO0Oo.f83113OooO0O0 : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i6)));
            } else {
                s = s3;
                z = z3;
                s2 = s4;
                mapArr2 = mapArr;
            }
            if (c24546OooO0Oo != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f83078Oooo000;
                    if (unsignedShort3 < iArr.length) {
                        int i7 = c24546OooO0Oo.f83114OooO0OO;
                        if (i7 == 7 || unsignedShort3 == 7 || i7 == unsignedShort3 || (i2 = c24546OooO0Oo.f83115OooO0Oo) == unsignedShort3 || (((i7 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i7;
                            }
                            int i8 = iArr[unsignedShort3];
                            hashSet = hashSet3;
                            j = ((long) i6) * ((long) i8);
                            if (j < 0 || j > 2147483647L) {
                                if (z) {
                                    C22236OooO0Oo.OooO00o(i6, "Skip the tag entry since the number of components is invalid: ", "ExifInterface");
                                }
                                z2 = false;
                                if (z2) {
                                    oooO0o.seek(j3);
                                } else {
                                    if (j > 4) {
                                        int i9 = oooO0o.readInt();
                                        if (z) {
                                            C22236OooO0Oo.OooO00o(i9, "seek to data offset: ", "ExifInterface");
                                        }
                                        hashSet2 = hashSet;
                                        if (this.f83092OooO0Oo != 7) {
                                            i3 = unsignedShort2;
                                            i4 = i6;
                                            oooO0o.seek(i9);
                                        } else {
                                            if ("MakerNote".equals(c24546OooO0Oo.f83113OooO0O0)) {
                                                this.f83097OooOO0 = i9;
                                            } else {
                                                if (i5 == 6 && "ThumbnailImage".equals(c24546OooO0Oo.f83113OooO0O0)) {
                                                    this.f83098OooOO0O = i9;
                                                    this.f83099OooOO0o = i6;
                                                    OooO0OO OooO0OO2 = OooO0OO.OooO0OO(6, this.f83095OooO0oO);
                                                    i3 = unsignedShort2;
                                                    OooO0OO oooO0OOOooO00o = OooO0OO.OooO00o(this.f83098OooOO0O, this.f83095OooO0oO);
                                                    i4 = i6;
                                                    OooO0OO oooO0OOOooO00o2 = OooO0OO.OooO00o(this.f83099OooOO0o, this.f83095OooO0oO);
                                                    mapArr2[4].put("Compression", OooO0OO2);
                                                    mapArr2[4].put("JPEGInterchangeFormat", oooO0OOOooO00o);
                                                    mapArr2[4].put("JPEGInterchangeFormatLength", oooO0OOOooO00o2);
                                                }
                                                oooO0o.seek(i9);
                                            }
                                            i3 = unsignedShort2;
                                            i4 = i6;
                                            oooO0o.seek(i9);
                                        }
                                    } else {
                                        hashSet2 = hashSet;
                                        i3 = unsignedShort2;
                                        i4 = i6;
                                    }
                                    Integer num = f83085Oooo0oO.get(Integer.valueOf(i3));
                                    if (z) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                                    }
                                    if (num != null) {
                                        if (unsignedShort3 != 3) {
                                            if (unsignedShort3 == 4) {
                                                j2 = ((long) oooO0o.readInt()) & 4294967295L;
                                            } else if (unsignedShort3 == 8) {
                                                unsignedShort = oooO0o.readShort();
                                            } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                                                unsignedShort = oooO0o.readInt();
                                            } else {
                                                j2 = -1;
                                            }
                                            if (z) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j2), c24546OooO0Oo.f83113OooO0O0));
                                            }
                                            if (j2 <= 0) {
                                                hashSet = hashSet2;
                                                if (!hashSet.contains(Integer.valueOf((int) j2))) {
                                                    oooO0o.seek(j2);
                                                    OooOo0(oooO0o, num.intValue());
                                                } else if (z) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                                                }
                                            } else {
                                                hashSet = hashSet2;
                                                if (z) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j2);
                                                }
                                            }
                                            oooO0o.seek(j3);
                                        } else {
                                            unsignedShort = oooO0o.readUnsignedShort();
                                        }
                                        j2 = unsignedShort;
                                        if (z) {
                                        }
                                        if (j2 <= 0) {
                                        }
                                        oooO0o.seek(j3);
                                    } else {
                                        hashSet = hashSet2;
                                        int i10 = oooO0o.f83107OooOoO0 + this.f83088OooO;
                                        byte[] bArr = new byte[(int) j];
                                        oooO0o.readFully(bArr);
                                        OooO0OO oooO0OO = new OooO0OO(i10, bArr, unsignedShort3, i4);
                                        mapArr2[i].put(c24546OooO0Oo.f83113OooO0O0, oooO0OO);
                                        String str = c24546OooO0Oo.f83113OooO0O0;
                                        if ("DNGVersion".equals(str)) {
                                            this.f83092OooO0Oo = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && oooO0OO.OooO0o(this.f83095OooO0oO).contains("PENTAX")) || ("Compression".equals(str) && oooO0OO.OooO0o0(this.f83095OooO0oO) == 65535)) {
                                            this.f83092OooO0Oo = 8;
                                        }
                                        if (oooO0o.f83107OooOoO0 != j3) {
                                            oooO0o.seek(j3);
                                        }
                                    }
                                }
                                s4 = (short) (s2 + 1);
                                i5 = i;
                                hashSet3 = hashSet;
                                s3 = s;
                                z3 = z;
                            } else {
                                z2 = true;
                                if (z2) {
                                }
                                s4 = (short) (s2 + 1);
                                i5 = i;
                                hashSet3 = hashSet;
                                s3 = s;
                                z3 = z;
                            }
                        } else if (z) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f83075OooOooo[unsignedShort3] + ") is unexpected for tag: " + c24546OooO0Oo.f83113OooO0O0);
                        }
                    }
                }
                hashSet = hashSet3;
                if (z) {
                    C22236OooO0Oo.OooO00o(unsignedShort3, "Skip the tag entry since data format is invalid: ", "ExifInterface");
                }
                j = 0;
                z2 = false;
                if (z2) {
                }
                s4 = (short) (s2 + 1);
                i5 = i;
                hashSet3 = hashSet;
                s3 = s;
                z3 = z;
            } else if (z) {
                C22236OooO0Oo.OooO00o(unsignedShort2, "Skip the tag entry since tag number is not defined: ", "ExifInterface");
            }
            hashSet = hashSet3;
            j = 0;
            z2 = false;
            if (z2) {
            }
            s4 = (short) (s2 + 1);
            i5 = i;
            hashSet3 = hashSet;
            s3 = s;
            z3 = z;
        }
        HashSet hashSet4 = hashSet3;
        boolean z4 = z3;
        int i11 = oooO0o.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        }
        long j4 = i11;
        if (j4 <= 0) {
            if (z4) {
                C22236OooO0Oo.OooO00o(i11, "Stop reading file since a wrong offset may cause an infinite loop: ", "ExifInterface");
            }
        } else {
            if (hashSet4.contains(Integer.valueOf(i11))) {
                if (z4) {
                    C22236OooO0Oo.OooO00o(i11, "Stop reading file since re-reading an IFD may cause an infinite loop: ", "ExifInterface");
                    return;
                }
                return;
            }
            oooO0o.seek(j4);
            if (mapArr[4].isEmpty()) {
                OooOo0(oooO0o, 4);
            } else if (mapArr[5].isEmpty()) {
                OooOo0(oooO0o, 5);
            }
        }
    }

    public final void OooOo00(int i, byte[] bArr) throws IOException {
        OooO0o oooO0o = new OooO0o(bArr);
        OooOOo0(oooO0o);
        OooOo0(oooO0o, i);
    }

    public final void OooOo0O(int i, String str, String str2) {
        HashMap<String, OooO0OO>[] mapArr = this.f83094OooO0o0;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap<String, OooO0OO> map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public final void OooOo0o(OooO0O0 oooO0O0) throws Throwable {
        OooO0OO oooO0OO;
        int iOooO0o0;
        HashMap<String, OooO0OO> map = this.f83094OooO0o0[4];
        OooO0OO oooO0OO2 = map.get("Compression");
        if (oooO0OO2 == null) {
            OooOOO(oooO0O0, map);
            return;
        }
        int iOooO0o02 = oooO0OO2.OooO0o0(this.f83095OooO0oO);
        if (iOooO0o02 != 1) {
            if (iOooO0o02 == 6) {
                OooOOO(oooO0O0, map);
                return;
            } else if (iOooO0o02 != 7) {
                return;
            }
        }
        OooO0OO oooO0OO3 = map.get("BitsPerSample");
        if (oooO0OO3 != null) {
            int[] iArr = (int[]) oooO0OO3.OooO0oO(this.f83095OooO0oO);
            int[] iArr2 = f83060OooOOOo;
            if (Arrays.equals(iArr2, iArr) || (this.f83092OooO0Oo == 3 && (oooO0OO = map.get("PhotometricInterpretation")) != null && (((iOooO0o0 = oooO0OO.OooO0o0(this.f83095OooO0oO)) == 1 && Arrays.equals(iArr, f83062OooOOo0)) || (iOooO0o0 == 6 && Arrays.equals(iArr, iArr2))))) {
                OooO0OO oooO0OO4 = map.get("StripOffsets");
                OooO0OO oooO0OO5 = map.get("StripByteCounts");
                if (oooO0OO4 == null || oooO0OO5 == null) {
                    return;
                }
                long[] jArrOooO0O0 = C24548OooO0O0.OooO0O0(oooO0OO4.OooO0oO(this.f83095OooO0oO));
                long[] jArrOooO0O02 = C24548OooO0O0.OooO0O0(oooO0OO5.OooO0oO(this.f83095OooO0oO));
                if (jArrOooO0O0 == null || jArrOooO0O0.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrOooO0O02 == null || jArrOooO0O02.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrOooO0O0.length != jArrOooO0O02.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrOooO0O02) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f83096OooO0oo = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrOooO0O0.length; i3++) {
                    int i4 = (int) jArrOooO0O0[i3];
                    int i5 = (int) jArrOooO0O02[i3];
                    if (i3 < jArrOooO0O0.length - 1 && i4 + i5 != jArrOooO0O0[i3 + 1]) {
                        this.f83096OooO0oo = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (oooO0O0.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (oooO0O0.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.f83096OooO0oo) {
                    long j4 = jArrOooO0O0[0];
                    return;
                }
                return;
            }
        }
        if (f83058OooOOO0) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void OooOoO() throws Throwable {
        OooOo(0, 5);
        OooOo(0, 4);
        OooOo(5, 4);
        HashMap<String, OooO0OO>[] mapArr = this.f83094OooO0o0;
        OooO0OO oooO0OO = mapArr[1].get("PixelXDimension");
        OooO0OO oooO0OO2 = mapArr[1].get("PixelYDimension");
        if (oooO0OO != null && oooO0OO2 != null) {
            mapArr[0].put("ImageWidth", oooO0OO);
            mapArr[0].put("ImageLength", oooO0OO2);
        }
        if (mapArr[4].isEmpty() && OooOOOO(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!OooOOOO(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        OooOo0O(0, "ThumbnailOrientation", "Orientation");
        OooOo0O(0, "ThumbnailImageLength", "ImageLength");
        OooOo0O(0, "ThumbnailImageWidth", "ImageWidth");
        OooOo0O(5, "ThumbnailOrientation", "Orientation");
        OooOo0O(5, "ThumbnailImageLength", "ImageLength");
        OooOo0O(5, "ThumbnailImageWidth", "ImageWidth");
        OooOo0O(4, "Orientation", "ThumbnailOrientation");
        OooOo0O(4, "ImageLength", "ThumbnailImageLength");
        OooOo0O(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void OooOoO0(OooO0o oooO0o, int i) throws Throwable {
        OooO0OO OooO0OO2;
        OooO0OO OooO0OO3;
        HashMap<String, OooO0OO>[] mapArr = this.f83094OooO0o0;
        OooO0OO oooO0OO = mapArr[i].get("DefaultCropSize");
        OooO0OO oooO0OO2 = mapArr[i].get("SensorTopBorder");
        OooO0OO oooO0OO3 = mapArr[i].get("SensorLeftBorder");
        OooO0OO oooO0OO4 = mapArr[i].get("SensorBottomBorder");
        OooO0OO oooO0OO5 = mapArr[i].get("SensorRightBorder");
        if (oooO0OO != null) {
            if (oooO0OO.f83108OooO00o == 5) {
                C24547OooO0o0[] c24547OooO0o0Arr = (C24547OooO0o0[]) oooO0OO.OooO0oO(this.f83095OooO0oO);
                if (c24547OooO0o0Arr == null || c24547OooO0o0Arr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c24547OooO0o0Arr));
                    return;
                }
                OooO0OO2 = OooO0OO.OooO0O0(c24547OooO0o0Arr[0], this.f83095OooO0oO);
                OooO0OO3 = OooO0OO.OooO0O0(c24547OooO0o0Arr[1], this.f83095OooO0oO);
            } else {
                int[] iArr = (int[]) oooO0OO.OooO0oO(this.f83095OooO0oO);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                OooO0OO2 = OooO0OO.OooO0OO(iArr[0], this.f83095OooO0oO);
                OooO0OO3 = OooO0OO.OooO0OO(iArr[1], this.f83095OooO0oO);
            }
            mapArr[i].put("ImageWidth", OooO0OO2);
            mapArr[i].put("ImageLength", OooO0OO3);
            return;
        }
        if (oooO0OO2 != null && oooO0OO3 != null && oooO0OO4 != null && oooO0OO5 != null) {
            int iOooO0o0 = oooO0OO2.OooO0o0(this.f83095OooO0oO);
            int iOooO0o02 = oooO0OO4.OooO0o0(this.f83095OooO0oO);
            int iOooO0o03 = oooO0OO5.OooO0o0(this.f83095OooO0oO);
            int iOooO0o04 = oooO0OO3.OooO0o0(this.f83095OooO0oO);
            if (iOooO0o02 <= iOooO0o0 || iOooO0o03 <= iOooO0o04) {
                return;
            }
            OooO0OO OooO0OO4 = OooO0OO.OooO0OO(iOooO0o02 - iOooO0o0, this.f83095OooO0oO);
            OooO0OO OooO0OO5 = OooO0OO.OooO0OO(iOooO0o03 - iOooO0o04, this.f83095OooO0oO);
            mapArr[i].put("ImageLength", OooO0OO4);
            mapArr[i].put("ImageWidth", OooO0OO5);
            return;
        }
        OooO0OO oooO0OO6 = mapArr[i].get("ImageLength");
        OooO0OO oooO0OO7 = mapArr[i].get("ImageWidth");
        if (oooO0OO6 == null || oooO0OO7 == null) {
            OooO0OO oooO0OO8 = mapArr[i].get("JPEGInterchangeFormat");
            OooO0OO oooO0OO9 = mapArr[i].get("JPEGInterchangeFormatLength");
            if (oooO0OO8 == null || oooO0OO9 == null) {
                return;
            }
            int iOooO0o05 = oooO0OO8.OooO0o0(this.f83095OooO0oO);
            int iOooO0o06 = oooO0OO8.OooO0o0(this.f83095OooO0oO);
            oooO0o.seek(iOooO0o05);
            byte[] bArr = new byte[iOooO0o06];
            oooO0o.read(bArr);
            OooO0o(new OooO0O0(bArr), iOooO0o05, i);
        }
    }

    /* JADX INFO: renamed from: o000Ooo.OooO00o$OooO0o */
    public static class OooO0o extends OooO0O0 {
        public OooO0o(byte[] bArr) throws IOException {
            super(bArr);
            this.f83105OooOo0o.mark(Integer.MAX_VALUE);
        }

        public final void seek(long j) throws IOException {
            int i = this.f83107OooOoO0;
            if (i > j) {
                this.f83107OooOoO0 = 0;
                this.f83105OooOo0o.reset();
            } else {
                j -= (long) i;
            }
            OooO00o((int) j);
        }

        public OooO0o(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f83105OooOo0o.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX INFO: renamed from: o000Ooo.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static class C24546OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f83112OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f83113OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f83114OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f83115OooO0Oo;

        public C24546OooO0Oo(String str, int i, int i2) {
            this.f83113OooO0O0 = str;
            this.f83112OooO00o = i;
            this.f83114OooO0OO = i2;
            this.f83115OooO0Oo = -1;
        }

        public C24546OooO0Oo(String str, int i, int i2, int i3) {
            this.f83113OooO0O0 = str;
            this.f83112OooO00o = i;
            this.f83114OooO0OO = i2;
            this.f83115OooO0Oo = i3;
        }
    }

    public C24545OooO00o(InputStream inputStream) throws IOException {
        C24546OooO0Oo[][] c24546OooO0OoArr = f83077Oooo0;
        this.f83094OooO0o0 = new HashMap[c24546OooO0OoArr.length];
        this.f83093OooO0o = new HashSet(c24546OooO0OoArr.length);
        this.f83095OooO0oO = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f83089OooO00o = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f83091OooO0OO = (AssetManager.AssetInputStream) inputStream;
                this.f83090OooO0O0 = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    C24548OooO0O0.OooO00o.OooO0OO(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f83091OooO0OO = null;
                    this.f83090OooO0O0 = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (f83058OooOOO0) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    this.f83091OooO0OO = null;
                    this.f83090OooO0O0 = null;
                }
            } else {
                this.f83091OooO0OO = null;
                this.f83090OooO0O0 = null;
            }
            OooOOOo(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
