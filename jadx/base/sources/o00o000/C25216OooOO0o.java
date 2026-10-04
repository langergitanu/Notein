package o00o000;

import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import androidx.fragment.app.C21929Ooooo0o;
import com.aspose.slides.internal.p332p7.C22236OooO0Oo;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import o00OooOO.C25159OooO0oO;

/* JADX INFO: renamed from: o00o000.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25216OooOO0o implements ImageHeaderParser {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f85872OooO00o = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f85873OooO0O0 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: o00o000.OooOO0o$OooO00o */
    public static final class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f85874OooO00o;

        public OooO00o(ByteBuffer byteBuffer) {
            this.f85874OooO00o = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // o00o000.C25216OooOO0o.OooO0O0
        public final int OooO00o() throws OooO0O0.OooO00o {
            return (OooO0OO() << 8) | OooO0OO();
        }

        @Override // o00o000.C25216OooOO0o.OooO0O0
        public final int OooO0O0(int i, byte[] bArr) {
            ByteBuffer byteBuffer = this.f85874OooO00o;
            int iMin = Math.min(i, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // o00o000.C25216OooOO0o.OooO0O0
        public final short OooO0OO() throws OooO0O0.OooO00o {
            ByteBuffer byteBuffer = this.f85874OooO00o;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new OooO0O0.OooO00o();
        }

        @Override // o00o000.C25216OooOO0o.OooO0O0
        public final long skip(long j) {
            ByteBuffer byteBuffer = this.f85874OooO00o;
            int iMin = (int) Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* JADX INFO: renamed from: o00o000.OooOO0o$OooO0O0 */
    public interface OooO0O0 {

        /* JADX INFO: renamed from: o00o000.OooOO0o$OooO0O0$OooO00o */
        public static final class OooO00o extends IOException {
            private static final long serialVersionUID = 1;

            public OooO00o() {
                super("Unexpectedly reached end of a file");
            }
        }

        int OooO00o() throws IOException;

        int OooO0O0(int i, byte[] bArr) throws IOException;

        short OooO0OO() throws IOException;

        long skip(long j) throws IOException;
    }

    /* JADX INFO: renamed from: o00o000.OooOO0o$OooO0OO */
    public static final class OooO0OO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InputStream f85875OooO00o;

        public OooO0OO(InputStream inputStream) {
            this.f85875OooO00o = inputStream;
        }

        @Override // o00o000.C25216OooOO0o.OooO0O0
        public final int OooO00o() throws IOException {
            return (OooO0OO() << 8) | OooO0OO();
        }

        @Override // o00o000.C25216OooOO0o.OooO0O0
        public final int OooO0O0(int i, byte[] bArr) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f85875OooO00o.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new OooO0O0.OooO00o();
            }
            return i2;
        }

        @Override // o00o000.C25216OooOO0o.OooO0O0
        public final short OooO0OO() throws IOException {
            int i = this.f85875OooO00o.read();
            if (i != -1) {
                return (short) i;
            }
            throw new OooO0O0.OooO00o();
        }

        @Override // o00o000.C25216OooOO0o.OooO0O0
        public final long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                InputStream inputStream = this.f85875OooO00o;
                long jSkip = inputStream.skip(j2);
                if (jSkip > 0) {
                    j2 -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j2--;
                }
            }
            return j - j2;
        }
    }

    public static ImageHeaderParser.ImageType OooO0o(OooO0O0 oooO0O0) throws IOException {
        try {
            int iOooO00o = oooO0O0.OooO00o();
            if (iOooO00o == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iOooO0OO = (iOooO00o << 8) | oooO0O0.OooO0OO();
            if (iOooO0OO == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iOooO0OO2 = (iOooO0OO << 8) | oooO0O0.OooO0OO();
            if (iOooO0OO2 == -1991225785) {
                oooO0O0.skip(21L);
                try {
                    return oooO0O0.OooO0OO() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (OooO0O0.OooO00o unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iOooO0OO2 == 1380533830) {
                oooO0O0.skip(4L);
                if (((oooO0O0.OooO00o() << 16) | oooO0O0.OooO00o()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iOooO00o2 = (oooO0O0.OooO00o() << 16) | oooO0O0.OooO00o();
                if ((iOooO00o2 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = iOooO00o2 & 255;
                if (i == 88) {
                    oooO0O0.skip(4L);
                    short sOooO0OO = oooO0O0.OooO0OO();
                    return (sOooO0OO & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sOooO0OO & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                oooO0O0.skip(4L);
                return (oooO0O0.OooO0OO() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((oooO0O0.OooO00o() << 16) | oooO0O0.OooO00o()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iOooO00o3 = (oooO0O0.OooO00o() << 16) | oooO0O0.OooO00o();
            if (iOooO00o3 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iOooO00o3 == 1635150182;
            oooO0O0.skip(4L);
            int i3 = iOooO0OO2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iOooO00o4 = (oooO0O0.OooO00o() << 16) | oooO0O0.OooO00o();
                    if (iOooO00o4 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (iOooO00o4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (OooO0O0.OooO00o unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int OooO0o0(OooO0O0 oooO0O0, C25159OooO0oO c25159OooO0oO) throws IOException {
        try {
            int iOooO00o = oooO0O0.OooO00o();
            if ((iOooO00o & 65496) == 65496 || iOooO00o == 19789 || iOooO00o == 18761) {
                int iOooO0oO = OooO0oO(oooO0O0);
                if (iOooO0oO != -1) {
                    byte[] bArr = (byte[]) c25159OooO0oO.OooO0Oo(byte[].class, iOooO0oO);
                    try {
                        return OooO0oo(oooO0O0, bArr, iOooO0oO);
                    } finally {
                        c25159OooO0oO.OooO0oo(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iOooO00o);
                return -1;
            }
        } catch (OooO0O0.OooO00o unused) {
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        return -1;
     */
    /* JADX WARN: Type inference failed for: r9v7, types: [byte[], java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int OooO0oO(OooO0O0 oooO0O0) throws IOException {
        while (true) {
            short sOooO0OO = oooO0O0.OooO0OO();
            if (sOooO0OO == 255) {
                short sOooO0OO2 = oooO0O0.OooO0OO();
                if (sOooO0OO2 == 218) {
                    break;
                }
                if (sOooO0OO2 != 217) {
                    int iOooO00o = oooO0O0.OooO00o() - 2;
                    if (sOooO0OO2 == 225) {
                        return iOooO00o;
                    }
                    long j = iOooO00o;
                    long jSkip = oooO0O0.skip(j);
                    if (jSkip != j) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            ?? byteArray = ByteArrayOutputStream.toByteArray();
                            byteArray.append(jSkip);
                            Log.d("DfltImageHeaderParser", byteArray.toString());
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                C22236OooO0Oo.OooO00o(sOooO0OO, "Unknown segmentId=", "DfltImageHeaderParser");
                return -1;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [byte[], java.lang.StringBuilder] */
    public static int OooO0oo(OooO0O0 oooO0O0, byte[] bArr, int i) throws IOException {
        ByteOrder byteOrder;
        String str;
        int iOooO0O0 = oooO0O0.OooO0O0(i, bArr);
        if (iOooO0O0 == i) {
            short s = 1;
            int i2 = 0;
            byte[] bArr2 = f85872OooO00o;
            boolean z = bArr != null && i > bArr2.length;
            if (z) {
                int i3 = 0;
                while (true) {
                    if (i3 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i3] != bArr2[i3]) {
                        z = false;
                        break;
                    }
                    i3++;
                }
            }
            if (z) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
                short s2 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
                if (s2 != 18761) {
                    if (s2 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                        C22236OooO0Oo.OooO00o(s2, "Unknown endianness = ", "DfltImageHeaderParser");
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                byteBuffer.order(byteOrder);
                int i4 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
                int i5 = i4 + 6;
                short s3 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
                while (i2 < s3) {
                    int i6 = (i2 * 12) + i4 + 8;
                    short s4 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : (short) -1;
                    if (s4 == 274) {
                        int i7 = i6 + 2;
                        short s5 = byteBuffer.remaining() - i7 >= 2 ? byteBuffer.getShort(i7) : (short) -1;
                        if (s5 >= s && s5 <= 12) {
                            int i8 = i6 + 4;
                            int i9 = byteBuffer.remaining() - i8 >= 4 ? byteBuffer.getInt(i8) : -1;
                            if (i9 >= 0) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    ?? byteArray = ByteArrayOutputStream.toByteArray();
                                    byteArray.append(s5);
                                    byteArray.append(" componentCount=");
                                    byteArray.append(i9);
                                    Log.d("DfltImageHeaderParser", byteArray.toString());
                                }
                                int i10 = i9 + f85873OooO0O0[s5];
                                if (i10 <= 4) {
                                    int i11 = i6 + 8;
                                    if (i11 < 0 || i11 > byteBuffer.remaining()) {
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i11 + " tagType=" + ((int) s4));
                                        }
                                    } else {
                                        if (i10 >= 0 && i10 + i11 <= byteBuffer.remaining()) {
                                            if (byteBuffer.remaining() - i11 >= 2) {
                                                return byteBuffer.getShort(i11);
                                            }
                                            return -1;
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            C22236OooO0Oo.OooO00o(s4, "Illegal number of bytes for TI tag data tagType=", "DfltImageHeaderParser");
                                        }
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    str = "Got byte count > 4, not orientation, continuing, formatCode=";
                                    C22236OooO0Oo.OooO00o(s5, str, "DfltImageHeaderParser");
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            str = "Got invalid format code = ";
                            C22236OooO0Oo.OooO00o(s5, str, "DfltImageHeaderParser");
                        }
                    }
                    i2++;
                    s = 1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iOooO0O0);
            return -1;
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int OooO00o(InputStream inputStream, C25159OooO0oO c25159OooO0oO) throws IOException {
        C21929Ooooo0o.OooO0OO(inputStream, "Argument must not be null");
        OooO0OO oooO0OO = new OooO0OO(inputStream);
        C21929Ooooo0o.OooO0OO(c25159OooO0oO, "Argument must not be null");
        return OooO0o0(oooO0OO, c25159OooO0oO);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType OooO0O0(InputStream inputStream) throws IOException {
        C21929Ooooo0o.OooO0OO(inputStream, "Argument must not be null");
        return OooO0o(new OooO0OO(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType OooO0OO(ByteBuffer byteBuffer) throws IOException {
        C21929Ooooo0o.OooO0OO(byteBuffer, "Argument must not be null");
        return OooO0o(new OooO00o(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int OooO0Oo(ByteBuffer byteBuffer, C25159OooO0oO c25159OooO0oO) throws IOException {
        C21929Ooooo0o.OooO0OO(byteBuffer, "Argument must not be null");
        OooO00o oooO00o = new OooO00o(byteBuffer);
        C21929Ooooo0o.OooO0OO(c25159OooO0oO, "Argument must not be null");
        return OooO0o0(oooO00o, c25159OooO0oO);
    }
}
