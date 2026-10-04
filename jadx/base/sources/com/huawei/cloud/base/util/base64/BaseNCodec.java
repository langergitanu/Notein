package com.huawei.cloud.base.util.base64;

import Oooo0oO.C21023OooO0Oo;
import com.aspose.slides.C22205OooOOo;
import com.huawei.hms.drive.C17867dw;
import com.huawei.hms.drive.C17868dx;
import com.huawei.hms.drive.C17869dy;
import java.util.Arrays;
import o000OO00.C24472OooOoo;
import o000o0o.C24611OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseNCodec {
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    static final int EOF = -1;
    protected static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;

    @Deprecated
    protected final byte PAD;
    private final int chunkSeparatorLength;
    private final int encodedBlockSize;
    protected final int lineLength;
    protected final byte pad;
    private final int unencodedBlockSize;

    public static class Context {
        byte[] buffer;
        int currentLinePos;
        boolean eof;
        int ibitWorkArea;
        long lbitWorkArea;
        int modulus;
        int pos;
        int readPos;

        public String toString() {
            String simpleName = getClass().getSimpleName();
            String string = Arrays.toString(this.buffer);
            int i = this.currentLinePos;
            boolean z = this.eof;
            int i2 = this.ibitWorkArea;
            long j = this.lbitWorkArea;
            int i3 = this.modulus;
            int i4 = this.pos;
            int i5 = this.readPos;
            StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append("[buffer=");
            sb.append(string);
            sb.append(", currentLinePos=");
            sb.append(i);
            sb.append(", eof=");
            sb.append(z);
            sb.append(", ibitWorkArea=");
            sb.append(i2);
            C22205OooOOo.OooO0OO(j, ", lbitWorkArea=", ", modulus=", sb);
            C24472OooOoo.OooO0O0(sb, ", pos=", ", readPos=", i3, i4);
            return C21023OooO0Oo.OooO0OO("]", i5, sb);
        }
    }

    public BaseNCodec(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, PAD_DEFAULT);
    }

    public static boolean isWhiteSpace(byte b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }

    private byte[] resizeBuffer(Context context) {
        byte[] bArr = context.buffer;
        if (bArr == null) {
            context.buffer = new byte[getDefaultBufferSize()];
            context.pos = 0;
            context.readPos = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            context.buffer = bArr2;
        }
        return context.buffer;
    }

    public int available(Context context) {
        if (context.buffer != null) {
            return context.pos - context.readPos;
        }
        return 0;
    }

    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.pad == b || isInAlphabet(b)) {
                return true;
            }
        }
        return false;
    }

    public Object decode(Object obj) throws C17867dw {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new C17867dw("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public abstract void decode(byte[] bArr, int i, int i2, Context context);

    public Object encode(Object obj) throws C17868dx {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new C17868dx("Parameter supplied to Base-N encode is not a byte[]");
    }

    public abstract void encode(byte[] bArr, int i, int i2, Context context);

    public String encodeAsString(byte[] bArr) {
        return C17869dy.m76776b(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return C17869dy.m76776b(encode(bArr));
    }

    public byte[] ensureBufferSize(int i, Context context) {
        byte[] bArr = context.buffer;
        return (bArr == null || bArr.length < context.pos + i) ? resizeBuffer(context) : bArr;
    }

    public int getDefaultBufferSize() {
        return 8192;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i = this.unencodedBlockSize;
        long jOooO00o = ((long) C24611OooO00o.OooO00o(length, i, 1, i)) * ((long) this.encodedBlockSize);
        int i2 = this.lineLength;
        return i2 > 0 ? ((((((long) i2) + jOooO00o) - 1) / ((long) i2)) * ((long) this.chunkSeparatorLength)) + jOooO00o : jOooO00o;
    }

    public boolean hasData(Context context) {
        return context.buffer != null;
    }

    public abstract boolean isInAlphabet(byte b);

    public boolean isInAlphabet(byte[] bArr, boolean z) {
        for (byte b : bArr) {
            if (!isInAlphabet(b) && (!z || (b != this.pad && !isWhiteSpace(b)))) {
                return false;
            }
        }
        return true;
    }

    public int readResults(byte[] bArr, int i, int i2, Context context) {
        if (context.buffer == null) {
            return context.eof ? -1 : 0;
        }
        int iMin = Math.min(available(context), i2);
        System.arraycopy(context.buffer, context.readPos, bArr, i, iMin);
        int i3 = context.readPos + iMin;
        context.readPos = i3;
        if (i3 >= context.pos) {
            context.buffer = null;
        }
        return iMin;
    }

    public BaseNCodec(int i, int i2, int i3, int i4, byte b) {
        this.PAD = PAD_DEFAULT;
        this.unencodedBlockSize = i;
        this.encodedBlockSize = i2;
        this.lineLength = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.chunkSeparatorLength = i4;
        this.pad = b;
    }

    public boolean isInAlphabet(String str) {
        return isInAlphabet(C17869dy.m76774a(str), true);
    }

    public byte[] encode(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : encode(bArr, 0, bArr.length);
    }

    public byte[] decode(String str) {
        return decode(C17869dy.m76774a(str));
    }

    public byte[] encode(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        encode(bArr, i, i2, context);
        encode(bArr, i, -1, context);
        int i3 = context.pos - context.readPos;
        byte[] bArr2 = new byte[i3];
        readResults(bArr2, 0, i3, context);
        return bArr2;
    }

    public byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        decode(bArr, 0, bArr.length, context);
        decode(bArr, 0, -1, context);
        int i = context.pos;
        byte[] bArr2 = new byte[i];
        readResults(bArr2, 0, i, context);
        return bArr2;
    }
}
