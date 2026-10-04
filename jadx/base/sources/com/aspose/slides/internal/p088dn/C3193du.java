package com.aspose.slides.internal.p088dn;

import com.aspose.slides.exceptions.ArgumentException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import o000o0o.C24611OooO00o;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.du */
/* JADX INFO: loaded from: classes3.dex */
public class C3193du {

    /* JADX INFO: renamed from: du */
    private int f9504du;

    /* JADX INFO: renamed from: h4 */
    private int f9505h4;

    /* JADX INFO: renamed from: k4 */
    private Object f9506k4;

    /* JADX INFO: renamed from: kk */
    private ByteBuffer f9507kk;

    /* JADX INFO: renamed from: to */
    private int f9508to;

    /* JADX INFO: renamed from: x1 */
    private k4 f9509x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.du$k4 */
    public enum k4 {
        Object(Object.class),
        BooleanPrimitive(Boolean.TYPE),
        BooleanObject(Boolean.class),
        BytePrimitive(Byte.TYPE),
        ByteObject(Byte.class),
        ShortPrimitive(Short.TYPE),
        ShortObject(Short.class),
        CharPrimitive(Character.TYPE),
        CharObject(Character.class),
        IntPrimitive(Integer.TYPE),
        IntObject(Integer.class),
        FloatPrimitive(Float.TYPE),
        FloatObject(Float.class),
        LongPrimitive(Long.TYPE),
        LongObject(Long.class),
        DoublePrimitive(Double.TYPE),
        DoubleObject(Double.class);


        /* JADX INFO: renamed from: ne */
        private Class<?> f9528ne;

        k4(Class cls) {
            this.f9528ne = cls;
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m13763k4(Class<?> cls) {
            return cls.equals(Boolean.TYPE) ? BooleanPrimitive : cls.equals(Boolean.class) ? BooleanObject : cls.equals(Byte.TYPE) ? BytePrimitive : cls.equals(Byte.class) ? ByteObject : cls.equals(Short.TYPE) ? ShortPrimitive : cls.equals(Short.class) ? ShortObject : cls.equals(Character.TYPE) ? CharPrimitive : cls.equals(Character.class) ? CharObject : cls.equals(Integer.TYPE) ? IntPrimitive : cls.equals(Integer.class) ? IntObject : cls.equals(Float.TYPE) ? FloatPrimitive : cls.equals(Float.class) ? FloatObject : cls.equals(Long.TYPE) ? LongPrimitive : cls.equals(Long.class) ? LongObject : cls.equals(Double.TYPE) ? DoublePrimitive : cls.equals(Double.class) ? DoubleObject : Object;
        }
    }

    private C3193du(Object obj, int i, int i2, k4 k4Var, int i3) {
        this.f9506k4 = obj;
        this.f9509x1 = k4Var;
        this.f9508to = i3;
        m13757k4(obj, i, i2, i3);
        this.f9504du = i / i3;
        this.f9505h4 = C24611OooO00o.OooO00o(i, i2, 1, i3);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m13761to());
        this.f9507kk = byteBufferAllocate;
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        m13758k4(obj, k4Var);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13753k4(k4 k4Var) {
        switch (C3196h4.f9529k4[k4Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return 1;
            case 5:
            case 6:
            case 7:
            case 8:
                return 2;
            case 9:
            case 10:
            case 11:
            case 12:
                return 4;
            case 13:
            case 14:
            case 15:
            case 16:
                return 8;
            default:
                throw new ArgumentException("Object must be an array of primitive.");
        }
    }

    /* JADX INFO: renamed from: kk */
    public int m13760kk() {
        return this.f9504du * this.f9508to;
    }

    /* JADX INFO: renamed from: to */
    public int m13761to() {
        return ((this.f9505h4 - this.f9504du) + 1) * this.f9508to;
    }

    /* JADX INFO: renamed from: x1 */
    public ByteBuffer m13762x1() {
        return this.f9507kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static k4 m13754k4(Class<?> cls) {
        return k4.m13763k4(cls);
    }

    /* JADX INFO: renamed from: k4 */
    public static C3193du m13755k4(Object obj, int i, int i2, k4 k4Var, int i3) {
        return new C3193du(obj, i, i2, k4Var, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public static Class<?> m13756k4(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            return cls.getComponentType();
        }
        throw new ArgumentException("Object must be an array.");
    }

    /* JADX INFO: renamed from: k4 */
    public void m13759k4() {
        this.f9507kk.position(0);
        switch (C3196h4.f9529k4[this.f9509x1.ordinal()]) {
            case 1:
                boolean[] zArr = (boolean[]) this.f9506k4;
                for (int i = this.f9504du; i <= this.f9505h4; i++) {
                    zArr[i] = this.f9507kk.get() != 0;
                }
                return;
            case 2:
                Boolean[] boolArr = (Boolean[]) this.f9506k4;
                for (int i2 = this.f9504du; i2 <= this.f9505h4; i2++) {
                    boolArr[i2] = Boolean.valueOf(this.f9507kk.get() != 0);
                }
                return;
            case 3:
                byte[] bArr = (byte[]) this.f9506k4;
                for (int i3 = this.f9504du; i3 <= this.f9505h4; i3++) {
                    bArr[i3] = this.f9507kk.get();
                }
                return;
            case 4:
                Byte[] bArr2 = (Byte[]) this.f9506k4;
                for (int i4 = this.f9504du; i4 <= this.f9505h4; i4++) {
                    bArr2[i4] = Byte.valueOf(this.f9507kk.get());
                }
                return;
            case 5:
                ShortBuffer shortBufferAsShortBuffer = this.f9507kk.asShortBuffer();
                short[] sArr = (short[]) this.f9506k4;
                for (int i5 = this.f9504du; i5 <= this.f9505h4; i5++) {
                    sArr[i5] = shortBufferAsShortBuffer.get();
                }
                return;
            case 6:
                ShortBuffer shortBufferAsShortBuffer2 = this.f9507kk.asShortBuffer();
                Short[] shArr = (Short[]) this.f9506k4;
                for (int i6 = this.f9504du; i6 <= this.f9505h4; i6++) {
                    shArr[i6] = Short.valueOf(shortBufferAsShortBuffer2.get());
                }
                return;
            case 7:
                CharBuffer charBufferAsCharBuffer = this.f9507kk.asCharBuffer();
                char[] cArr = (char[]) this.f9506k4;
                for (int i7 = this.f9504du; i7 <= this.f9505h4; i7++) {
                    cArr[i7] = charBufferAsCharBuffer.get();
                }
                return;
            case 8:
                CharBuffer charBufferAsCharBuffer2 = this.f9507kk.asCharBuffer();
                Character[] chArr = (Character[]) this.f9506k4;
                for (int i8 = this.f9504du; i8 <= this.f9505h4; i8++) {
                    chArr[i8] = Character.valueOf(charBufferAsCharBuffer2.get());
                }
                return;
            case 9:
                IntBuffer intBufferAsIntBuffer = this.f9507kk.asIntBuffer();
                int[] iArr = (int[]) this.f9506k4;
                for (int i9 = this.f9504du; i9 <= this.f9505h4; i9++) {
                    iArr[i9] = intBufferAsIntBuffer.get();
                }
                return;
            case 10:
                IntBuffer intBufferAsIntBuffer2 = this.f9507kk.asIntBuffer();
                Integer[] numArr = (Integer[]) this.f9506k4;
                for (int i10 = this.f9504du; i10 <= this.f9505h4; i10++) {
                    numArr[i10] = Integer.valueOf(intBufferAsIntBuffer2.get());
                }
                return;
            case 11:
                FloatBuffer floatBufferAsFloatBuffer = this.f9507kk.asFloatBuffer();
                float[] fArr = (float[]) this.f9506k4;
                for (int i11 = this.f9504du; i11 <= this.f9505h4; i11++) {
                    fArr[i11] = floatBufferAsFloatBuffer.get();
                }
                return;
            case 12:
                FloatBuffer floatBufferAsFloatBuffer2 = this.f9507kk.asFloatBuffer();
                Float[] fArr2 = (Float[]) this.f9506k4;
                for (int i12 = this.f9504du; i12 <= this.f9505h4; i12++) {
                    fArr2[i12] = Float.valueOf(floatBufferAsFloatBuffer2.get());
                }
                return;
            case 13:
                LongBuffer longBufferAsLongBuffer = this.f9507kk.asLongBuffer();
                long[] jArr = (long[]) this.f9506k4;
                for (int i13 = this.f9504du; i13 <= this.f9505h4; i13++) {
                    jArr[i13] = longBufferAsLongBuffer.get();
                }
                return;
            case 14:
                LongBuffer longBufferAsLongBuffer2 = this.f9507kk.asLongBuffer();
                Long[] lArr = (Long[]) this.f9506k4;
                for (int i14 = this.f9504du; i14 <= this.f9505h4; i14++) {
                    lArr[i14] = Long.valueOf(longBufferAsLongBuffer2.get());
                }
                return;
            case 15:
                DoubleBuffer doubleBufferAsDoubleBuffer = this.f9507kk.asDoubleBuffer();
                double[] dArr = (double[]) this.f9506k4;
                for (int i15 = this.f9504du; i15 <= this.f9505h4; i15++) {
                    dArr[i15] = doubleBufferAsDoubleBuffer.get();
                }
                return;
            case 16:
                DoubleBuffer doubleBufferAsDoubleBuffer2 = this.f9507kk.asDoubleBuffer();
                Double[] dArr2 = (Double[]) this.f9506k4;
                for (int i16 = this.f9504du; i16 <= this.f9505h4; i16++) {
                    dArr2[i16] = Double.valueOf(doubleBufferAsDoubleBuffer2.get());
                }
                return;
            default:
                throw new ArgumentException("Object must be an array of primitive.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13757k4(Object obj, int i, int i2, int i3) {
        if (i > (Array.getLength(obj) * i3) - i2) {
            throw new ArgumentException("Offset or count were out of bounds");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m13758k4(Object obj, k4 k4Var) {
        switch (C3196h4.f9529k4[k4Var.ordinal()]) {
            case 1:
                boolean[] zArr = (boolean[]) obj;
                for (int i = this.f9504du; i <= this.f9505h4; i++) {
                    this.f9507kk.put(zArr[i] ? (byte) 1 : (byte) 0);
                }
                return;
            case 2:
                Boolean[] boolArr = (Boolean[]) obj;
                for (int i2 = this.f9504du; i2 <= this.f9505h4; i2++) {
                    this.f9507kk.put(boolArr[i2].booleanValue() ? (byte) 1 : (byte) 0);
                }
                return;
            case 3:
                byte[] bArr = (byte[]) obj;
                for (int i3 = this.f9504du; i3 <= this.f9505h4; i3++) {
                    this.f9507kk.put(bArr[i3]);
                }
                return;
            case 4:
                Byte[] bArr2 = (Byte[]) obj;
                for (int i4 = this.f9504du; i4 <= this.f9505h4; i4++) {
                    this.f9507kk.put(bArr2[i4].byteValue());
                }
                return;
            case 5:
                ShortBuffer shortBufferAsShortBuffer = this.f9507kk.asShortBuffer();
                short[] sArr = (short[]) obj;
                for (int i5 = this.f9504du; i5 <= this.f9505h4; i5++) {
                    shortBufferAsShortBuffer.put(sArr[i5]);
                }
                return;
            case 6:
                ShortBuffer shortBufferAsShortBuffer2 = this.f9507kk.asShortBuffer();
                Short[] shArr = (Short[]) obj;
                for (int i6 = this.f9504du; i6 <= this.f9505h4; i6++) {
                    shortBufferAsShortBuffer2.put(shArr[i6].shortValue());
                }
                return;
            case 7:
                CharBuffer charBufferAsCharBuffer = this.f9507kk.asCharBuffer();
                char[] cArr = (char[]) obj;
                for (int i7 = this.f9504du; i7 <= this.f9505h4; i7++) {
                    charBufferAsCharBuffer.put(cArr[i7]);
                }
                return;
            case 8:
                CharBuffer charBufferAsCharBuffer2 = this.f9507kk.asCharBuffer();
                Character[] chArr = (Character[]) obj;
                for (int i8 = this.f9504du; i8 <= this.f9505h4; i8++) {
                    charBufferAsCharBuffer2.put(chArr[i8].charValue());
                }
                return;
            case 9:
                IntBuffer intBufferAsIntBuffer = this.f9507kk.asIntBuffer();
                int[] iArr = (int[]) obj;
                for (int i9 = this.f9504du; i9 <= this.f9505h4; i9++) {
                    intBufferAsIntBuffer.put(iArr[i9]);
                }
                return;
            case 10:
                IntBuffer intBufferAsIntBuffer2 = this.f9507kk.asIntBuffer();
                Integer[] numArr = (Integer[]) obj;
                for (int i10 = this.f9504du; i10 <= this.f9505h4; i10++) {
                    intBufferAsIntBuffer2.put(numArr[i10].intValue());
                }
                return;
            case 11:
                FloatBuffer floatBufferAsFloatBuffer = this.f9507kk.asFloatBuffer();
                float[] fArr = (float[]) obj;
                for (int i11 = this.f9504du; i11 <= this.f9505h4; i11++) {
                    floatBufferAsFloatBuffer.put(fArr[i11]);
                }
                return;
            case 12:
                FloatBuffer floatBufferAsFloatBuffer2 = this.f9507kk.asFloatBuffer();
                Float[] fArr2 = (Float[]) obj;
                for (int i12 = this.f9504du; i12 <= this.f9505h4; i12++) {
                    floatBufferAsFloatBuffer2.put(fArr2[i12].floatValue());
                }
                return;
            case 13:
                LongBuffer longBufferAsLongBuffer = this.f9507kk.asLongBuffer();
                long[] jArr = (long[]) obj;
                for (int i13 = this.f9504du; i13 <= this.f9505h4; i13++) {
                    longBufferAsLongBuffer.put(jArr[i13]);
                }
                return;
            case 14:
                LongBuffer longBufferAsLongBuffer2 = this.f9507kk.asLongBuffer();
                Long[] lArr = (Long[]) obj;
                for (int i14 = this.f9504du; i14 <= this.f9505h4; i14++) {
                    longBufferAsLongBuffer2.put(lArr[i14].longValue());
                }
                return;
            case 15:
                DoubleBuffer doubleBufferAsDoubleBuffer = this.f9507kk.asDoubleBuffer();
                double[] dArr = (double[]) obj;
                for (int i15 = this.f9504du; i15 <= this.f9505h4; i15++) {
                    doubleBufferAsDoubleBuffer.put(dArr[i15]);
                }
                return;
            case 16:
                DoubleBuffer doubleBufferAsDoubleBuffer2 = this.f9507kk.asDoubleBuffer();
                Double[] dArr2 = (Double[]) obj;
                for (int i16 = this.f9504du; i16 <= this.f9505h4; i16++) {
                    doubleBufferAsDoubleBuffer2.put(dArr2[i16].doubleValue());
                }
                return;
            default:
                throw new ArgumentException("Object must be an array of primitive.");
        }
    }
}
