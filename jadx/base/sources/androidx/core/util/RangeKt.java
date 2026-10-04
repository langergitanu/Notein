package androidx.core.util;

import android.util.Range;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0O00oo.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\f¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\u0007\u0010\b\u001a>\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\n¢\u0006\u0004\b\u0007\u0010\n\u001a>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\f¢\u0006\u0004\b\u000b\u0010\n\u001a/\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m80612d2 = {"", "T", "that", "Landroid/util/Range;", "rangeTo", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "value", "plus", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "other", "(Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;", "and", "LoO0O00oo/OooO0o;", "toClosedRange", "(Landroid/util/Range;)LoO0O00oo/OooO0o;", "toRange", "(LoO0O00oo/OooO0o;)Landroid/util/Range;", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class RangeKt {
    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        return range.intersect(range2);
    }

    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t) {
        return range.extend(t);
    }

    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t, T t2) {
        return new Range<>(t, t2);
    }

    public static final <T extends Comparable<? super T>> OooO0o<T> toClosedRange(final Range<T> range) {
        return (OooO0o<T>) new OooO0o<T>() { // from class: androidx.core.util.RangeKt.toClosedRange.1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(Comparable value) {
                OooOOO0.OooO0oO(value, "value");
                return value.compareTo(getStart()) >= 0 && value.compareTo(getEndInclusive()) <= 0;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // oO0O00oo.OooO0o
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // oO0O00oo.OooO0o
            public Comparable getStart() {
                return range.getLower();
            }

            @Override // oO0O00oo.OooO0o
            public boolean isEmpty() {
                return getStart().compareTo(getEndInclusive()) > 0;
            }
        };
    }

    public static final <T extends Comparable<? super T>> Range<T> toRange(OooO0o<T> oooO0o) {
        return new Range<>(oooO0o.getStart(), oooO0o.getEndInclusive());
    }

    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        return range.extend(range2);
    }
}
