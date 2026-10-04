package oO0000o0;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import oO0000oo.C31934OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final BitSet f113876OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final BitSet f113877OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final BitSet f113878OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final BitSet f113879OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final BitSet f113880OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final BitSet f113881OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BitSet f113882OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final BitSet f113883OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final BitSet f113884OooO0oo;

    static {
        BitSet bitSet = new BitSet(256);
        f113877OooO00o = bitSet;
        bitSet.set(47);
        f113878OooO0O0 = new BitSet(256);
        f113879OooO0OO = new BitSet(256);
        f113880OooO0Oo = new BitSet(256);
        f113882OooO0o0 = new BitSet(256);
        f113881OooO0o = new BitSet(256);
        f113883OooO0oO = new BitSet(256);
        f113884OooO0oo = new BitSet(256);
        f113876OooO = new BitSet(256);
        for (int i = 97; i <= 122; i++) {
            f113878OooO0O0.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f113878OooO0O0.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            f113878OooO0O0.set(i3);
        }
        BitSet bitSet2 = f113878OooO0O0;
        bitSet2.set(95);
        bitSet2.set(45);
        bitSet2.set(46);
        bitSet2.set(42);
        f113884OooO0oo.or(bitSet2);
        bitSet2.set(33);
        bitSet2.set(126);
        bitSet2.set(39);
        bitSet2.set(40);
        bitSet2.set(41);
        BitSet bitSet3 = f113879OooO0OO;
        bitSet3.set(44);
        bitSet3.set(59);
        bitSet3.set(58);
        bitSet3.set(36);
        bitSet3.set(38);
        bitSet3.set(43);
        bitSet3.set(61);
        BitSet bitSet4 = f113880OooO0Oo;
        bitSet4.or(bitSet2);
        bitSet4.or(bitSet3);
        BitSet bitSet5 = f113882OooO0o0;
        bitSet5.or(bitSet2);
        bitSet5.set(59);
        bitSet5.set(58);
        bitSet5.set(64);
        bitSet5.set(38);
        bitSet5.set(61);
        bitSet5.set(43);
        bitSet5.set(36);
        bitSet5.set(44);
        BitSet bitSet6 = f113876OooO;
        bitSet6.or(bitSet5);
        bitSet6.set(47);
        BitSet bitSet7 = f113883OooO0oO;
        bitSet7.set(59);
        bitSet7.set(47);
        bitSet7.set(63);
        bitSet7.set(58);
        bitSet7.set(64);
        bitSet7.set(38);
        bitSet7.set(61);
        bitSet7.set(43);
        bitSet7.set(36);
        bitSet7.set(44);
        bitSet7.set(91);
        bitSet7.set(93);
        BitSet bitSet8 = f113881OooO0o;
        bitSet8.or(bitSet7);
        bitSet8.or(bitSet2);
    }

    public static List OooO00o(String str) {
        BitSet bitSet = f113877OooO00o;
        C31934OooO0O0 c31934OooO0O0 = new C31934OooO0O0(str.length());
        if (c31934OooO0O0.OooO00o()) {
            return Collections.EMPTY_LIST;
        }
        if (bitSet.get(str.charAt(c31934OooO0O0.f113892OooO0O0))) {
            c31934OooO0O0.OooO0O0(c31934OooO0O0.f113892OooO0O0 + 1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        while (!c31934OooO0O0.OooO00o()) {
            char cCharAt = str.charAt(c31934OooO0O0.f113892OooO0O0);
            if (bitSet.get(cCharAt)) {
                arrayList.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(cCharAt);
            }
            c31934OooO0O0.OooO0O0(c31934OooO0O0.f113892OooO0O0 + 1);
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    public static String OooO0O0(String str, Charset charset, boolean z) {
        if (str == null) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length());
        CharBuffer charBufferWrap = CharBuffer.wrap(str);
        while (charBufferWrap.hasRemaining()) {
            char c = charBufferWrap.get();
            if (c == '%' && charBufferWrap.remaining() >= 2) {
                char c2 = charBufferWrap.get();
                char c3 = charBufferWrap.get();
                int iDigit = Character.digit(c2, 16);
                int iDigit2 = Character.digit(c3, 16);
                if (iDigit == -1 || iDigit2 == -1) {
                    byteBufferAllocate.put((byte) 37);
                    byteBufferAllocate.put((byte) c2);
                    byteBufferAllocate.put((byte) c3);
                } else {
                    byteBufferAllocate.put((byte) ((iDigit << 4) + iDigit2));
                }
            } else if (z && c == '+') {
                byteBufferAllocate.put((byte) 32);
            } else {
                byteBufferAllocate.put((byte) c);
            }
        }
        byteBufferAllocate.flip();
        return charset.decode(byteBufferAllocate).toString();
    }

    public static String OooO0OO(String str, Charset charset, BitSet bitSet, boolean z) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ByteBuffer byteBufferEncode = charset.encode(str);
        while (byteBufferEncode.hasRemaining()) {
            byte b = byteBufferEncode.get();
            int i = b & 255;
            if (bitSet.get(i)) {
                sb.append((char) i);
            } else if (z && i == 32) {
                sb.append('+');
            } else {
                sb.append("%");
                char upperCase = Character.toUpperCase(Character.forDigit((i >> 4) & 15, 16));
                char upperCase2 = Character.toUpperCase(Character.forDigit(b & 15, 16));
                sb.append(upperCase);
                sb.append(upperCase2);
            }
        }
        return sb.toString();
    }
}
