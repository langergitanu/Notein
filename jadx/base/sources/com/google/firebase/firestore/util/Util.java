package com.google.firebase.firestore.util;

import OooO0Oo.RunnableC20400OooO0o0;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.cloud.datastore.core.number.NumberComparisonHelper;
import com.google.firebase.firestore.FieldPath;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.protobuf.ByteString;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;
import oO0OOo0o.C33119o00o0O;
import oO0OOo0o.o00Oo0;
import oO0OOo0o.o00Ooo;

/* JADX INFO: loaded from: classes8.dex */
public class Util {
    private static final String AUTO_ID_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int AUTO_ID_LENGTH = 20;
    private static final Random rand = new SecureRandom();
    private static final Continuation<Void, Void> VOID_ERROR_TRANSFORMER = new OooOOO();

    private static <T> T advanceIterator(Iterator<T> it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static String autoId() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            sb.append(AUTO_ID_ALPHABET.charAt(rand.nextInt(62)));
        }
        return sb.toString();
    }

    public static List<Object> collectUpdateArguments(int i, Object obj, Object obj2, Object... objArr) {
        if (objArr.length % 2 == 1) {
            throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        arrayList.add(obj2);
        Collections.addAll(arrayList, objArr);
        for (int i2 = 0; i2 < arrayList.size(); i2 += 2) {
            Object obj3 = arrayList.get(i2);
            if (!(obj3 instanceof String) && !(obj3 instanceof FieldPath)) {
                StringBuilder sb = new StringBuilder("Excepted field name at argument position ");
                sb.append(i2 + i + 1);
                sb.append(" but got ");
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO0o.OooO0O0(sb, obj3, " in call to update.  The arguments to update should alternate between field names and values"));
            }
        }
        return arrayList;
    }

    public static <T extends Comparable<T>> Comparator<T> comparator() {
        return new C22717OooOOo0();
    }

    public static int compareBooleans(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public static int compareByteArrays(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = bArr[i] & 255;
            int i3 = bArr2[i] & 255;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
        }
        return Integer.compare(bArr.length, bArr2.length);
    }

    public static int compareByteStrings(ByteString byteString, ByteString byteString2) {
        int iMin = Math.min(byteString.size(), byteString2.size());
        for (int i = 0; i < iMin; i++) {
            int iByteAt = byteString.byteAt(i) & 255;
            int iByteAt2 = byteString2.byteAt(i) & 255;
            if (iByteAt < iByteAt2) {
                return -1;
            }
            if (iByteAt > iByteAt2) {
                return 1;
            }
        }
        return Integer.compare(byteString.size(), byteString2.size());
    }

    public static int compareDoubles(double d, double d2) {
        return NumberComparisonHelper.firestoreCompareDoubles(d, d2);
    }

    public static int compareMixed(double d, long j) {
        return NumberComparisonHelper.firestoreCompareDoubleWithLong(d, j);
    }

    public static int compareUtf8Strings(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        int iMin = Math.min(str.length(), str2.length());
        for (int i = 0; i < iMin; i++) {
            char cCharAt = str.charAt(i);
            char cCharAt2 = str2.charAt(i);
            if (cCharAt != cCharAt2) {
                return Character.isSurrogate(cCharAt) == Character.isSurrogate(cCharAt2) ? Character.compare(cCharAt, cCharAt2) : Character.isSurrogate(cCharAt) ? 1 : -1;
            }
        }
        return Integer.compare(str.length(), str2.length());
    }

    private static Exception convertStatusException(Exception exc) {
        return exc instanceof o00Ooo ? exceptionFromStatus(((o00Ooo) exc).f119753OooOo0o) : exc instanceof C33119o00o0O ? exceptionFromStatus(((C33119o00o0O) exc).f119755OooOo0o) : exc;
    }

    public static Exception convertThrowableToException(Throwable th) {
        return th instanceof Exception ? convertStatusException((Exception) th) : new Exception(th);
    }

    public static void crashMainThread(RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new RunnableC20400OooO0o0());
    }

    public static <T> void diffCollections(Collection<T> collection, Collection<T> collection2, Comparator<T> comparator, Consumer<T> consumer, Consumer<T> consumer2) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, comparator);
        ArrayList arrayList2 = new ArrayList(collection2);
        Collections.sort(arrayList2, comparator);
        diffCollections(arrayList.iterator(), arrayList2.iterator(), comparator, consumer, consumer2);
    }

    public static FirebaseFirestoreException exceptionFromStatus(o00Oo0 o00oo02) {
        o00oo02.getClass();
        o00Ooo o00ooo2 = new o00Ooo(o00oo02);
        return new FirebaseFirestoreException(o00ooo2.getMessage(), FirebaseFirestoreException.Code.fromValue(o00oo02.f119728OooO00o.f119750OooOo0o), o00ooo2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> firstNEntries(Map<K, V> map, int i, final Comparator<V> comparator) {
        if (map.size() <= i) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.firestore.util.OooOOOo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Util.lambda$firstNEntries$4(comparator, (Map.Entry) obj, (Map.Entry) obj2);
            }
        });
        HashMap map2 = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            map2.put(((Map.Entry) arrayList.get(i2)).getKey(), ((Map.Entry) arrayList.get(i2)).getValue());
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$crashMainThread$1(RuntimeException runtimeException) {
        throw runtimeException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$firstNEntries$4(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        return comparator.compare(entry.getValue(), entry2.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$static$0(Task task) throws Exception {
        if (task.isSuccessful()) {
            return (Void) task.getResult();
        }
        Exception excConvertStatusException = convertStatusException(task.getException());
        if (excConvertStatusException instanceof FirebaseFirestoreException) {
            throw excConvertStatusException;
        }
        throw new FirebaseFirestoreException(excConvertStatusException.getMessage(), FirebaseFirestoreException.Code.UNKNOWN, excConvertStatusException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$values$3(Iterable iterable) {
        final Iterator it = iterable.iterator();
        return new Iterator<V>() { // from class: com.google.firebase.firestore.util.Util.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return (V) ((Map.Entry) it.next()).getValue();
            }
        };
    }

    public static StringBuilder repeatSequence(CharSequence charSequence, int i, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder();
        if (i != 0) {
            sb.append(charSequence);
            for (int i2 = 1; i2 < i; i2++) {
                sb.append(charSequence2);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static String toDebugString(ByteString byteString) {
        int size = byteString.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i = 0; i < size; i++) {
            byte bByteAt = byteString.byteAt(i);
            sb.append(Character.forDigit((bByteAt & 255) >>> 4, 16));
            sb.append(Character.forDigit(bByteAt & 15, 16));
        }
        return sb.toString();
    }

    public static String typeName(Object obj) {
        return obj == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : obj.getClass().getName();
    }

    public static <K, V> Iterable<V> values(final Iterable<Map.Entry<K, V>> iterable) {
        return new Iterable() { // from class: com.google.firebase.firestore.util.OooOOo
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return Util.lambda$values$3(iterable);
            }
        };
    }

    public static Continuation<Void, Void> voidErrorTransformer() {
        return VOID_ERROR_TRANSFORMER;
    }

    public static <T extends Comparable<T>> void diffCollections(SortedSet<T> sortedSet, SortedSet<T> sortedSet2, Consumer<T> consumer, Consumer<T> consumer2) {
        diffCollections(sortedSet.iterator(), sortedSet2.iterator(), sortedSet.comparator() != null ? sortedSet.comparator() : new OooOOOO(), consumer, consumer2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static <T> void diffCollections(Iterator<T> it, Iterator<T> it2, Comparator<? super T> comparator, Consumer<T> consumer, Consumer<T> consumer2) {
        T t = (Object) advanceIterator(it);
        T t2 = (Object) advanceIterator(it2);
        while (true) {
            if (t == null && t2 == null) {
                return;
            }
            boolean z = false;
            boolean z2 = true;
            if (t != null && t2 != null) {
                int iCompare = comparator.compare(t, t2);
                if (iCompare >= 0) {
                    if (iCompare <= 0) {
                        z2 = false;
                    }
                }
            } else if (t == null) {
                z2 = false;
                z = true;
            }
            if (z) {
                consumer.accept(t2);
                t2 = (Object) advanceIterator(it2);
            } else if (z2) {
                consumer2.accept(t);
                t = (Object) advanceIterator(it);
            } else {
                t = (Object) advanceIterator(it);
                t2 = (Object) advanceIterator(it2);
            }
        }
    }
}
