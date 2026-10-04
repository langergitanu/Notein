package androidx.customview.widget;

import android.graphics.Rect;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.OooO00o;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    public interface OooO00o<T> {
    }

    /* JADX INFO: renamed from: androidx.customview.widget.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC19009OooO0O0<T, V> {
    }

    public static class OooO0OO<T> implements Comparator<T> {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final OooO00o<T> f64376OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final boolean f64377OooOoO0;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Rect f64375OooOo0o = new Rect();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Rect f64374OooOo = new Rect();

        public OooO0OO(boolean z, OooO00o<T> oooO00o) {
            this.f64377OooOoO0 = z;
            this.f64376OooOoO = oooO00o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            OooO00o.C19008OooO00o c19008OooO00o = (OooO00o.C19008OooO00o) this.f64376OooOoO;
            c19008OooO00o.getClass();
            Rect rect = this.f64375OooOo0o;
            ((AccessibilityNodeInfoCompat) t).getBoundsInParent(rect);
            c19008OooO00o.getClass();
            Rect rect2 = this.f64374OooOo;
            ((AccessibilityNodeInfoCompat) t2).getBoundsInParent(rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            boolean z = this.f64377OooOoO0;
            if (i3 < i4) {
                return z ? 1 : -1;
            }
            if (i3 > i4) {
                return z ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return z ? 1 : -1;
            }
            if (i7 > i8) {
                return z ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean OooO00o(int i, Rect rect, Rect rect2, Rect rect3) {
        int i2;
        int i3;
        boolean zOooO0O0 = OooO0O0(i, rect, rect2);
        if (OooO0O0(i, rect, rect3) || !zOooO0O0) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i != 17 && i != 66) {
                            int iOooO0Oo = OooO0Oo(i, rect, rect2);
                            if (i == 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i == 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i == 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i != 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iOooO0Oo >= Math.max(1, i2 - i3)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                }
            } else if (rect.top >= rect3.bottom) {
            }
        } else if (rect.left >= rect3.right) {
        }
        return true;
    }

    public static boolean OooO0O0(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean OooO0OO(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static int OooO0Oo(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int OooO0o0(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
