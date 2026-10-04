package com.aspose.words.internal;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: classes5.dex */
public class zzZKA {
    private static zzZ zzZP7 = new zzZ() { // from class: com.aspose.words.internal.zzZKA.1
        static final /* synthetic */ boolean zzVr = true;

        @Override // com.aspose.words.internal.zzZKA.zzZ
        public final Object create(Object obj) {
            if (obj instanceof String) {
                return Charset.forName((String) obj).newDecoder();
            }
            if (obj instanceof Charset) {
                return ((Charset) obj).newDecoder();
            }
            if (zzVr) {
                return null;
            }
            throw new AssertionError();
        }

        @Override // com.aspose.words.internal.zzZKA.zzZ
        public final boolean zzz(Object obj, Object obj2) {
            if (obj2 instanceof String) {
                return ((CharsetDecoder) obj).charset().name().equals(obj2);
            }
            if (obj2 instanceof Charset) {
                return ((CharsetDecoder) obj).charset().equals(obj2);
            }
            return false;
        }
    };
    private static zzZ zzZP6 = new zzZ() { // from class: com.aspose.words.internal.zzZKA.2
        static final /* synthetic */ boolean zzVr = true;

        @Override // com.aspose.words.internal.zzZKA.zzZ
        public final Object create(Object obj) {
            if (obj instanceof String) {
                return Charset.forName((String) obj).newEncoder();
            }
            if (obj instanceof Charset) {
                return ((Charset) obj).newEncoder();
            }
            if (zzVr) {
                return null;
            }
            throw new AssertionError();
        }

        @Override // com.aspose.words.internal.zzZKA.zzZ
        public final boolean zzz(Object obj, Object obj2) {
            if (obj2 instanceof String) {
                return ((CharsetEncoder) obj).charset().name().equals(obj2);
            }
            if (obj2 instanceof Charset) {
                return ((CharsetEncoder) obj).charset().equals(obj2);
            }
            return false;
        }
    };

    public static abstract class zzZ {
        private ThreadLocal zzZP5 = new ThreadLocal();
        private final int size = 12;

        public zzZ(int i) {
        }

        private static void zzX(Object[] objArr, int i) {
            Object obj = objArr[i];
            while (i > 0) {
                objArr[i] = objArr[i - 1];
                i--;
            }
            objArr[0] = obj;
        }

        public abstract Object create(Object obj);

        public final Object zzZT(Object obj) {
            Object[] objArr = (Object[]) this.zzZP5.get();
            if (objArr == null) {
                objArr = new Object[this.size];
                this.zzZP5.set(objArr);
            } else {
                for (int i = 0; i < objArr.length; i++) {
                    Object obj2 = objArr[i];
                    if (obj2 != null && zzz(obj2, obj)) {
                        if (i > 0) {
                            zzX(objArr, i);
                        }
                        return obj2;
                    }
                }
            }
            Object objCreate = create(obj);
            objArr[objArr.length - 1] = objCreate;
            zzX(objArr, objArr.length - 1);
            return objCreate;
        }

        public abstract boolean zzz(Object obj, Object obj2);
    }

    public static CharsetEncoder zzZU(Object obj) {
        CharsetEncoder charsetEncoder = (CharsetEncoder) zzZP6.zzZT(obj);
        charsetEncoder.reset();
        return charsetEncoder;
    }

    public static CharsetDecoder zzZV(Object obj) {
        CharsetDecoder charsetDecoder = (CharsetDecoder) zzZP7.zzZT(obj);
        charsetDecoder.reset();
        return charsetDecoder;
    }
}
